package com.google.android.material.timepicker;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class ClockHandView extends View {

    /* renamed from: OooOo */
    public final float f27962OooOo;

    /* renamed from: OooOo0O */
    public final ArrayList f27963OooOo0O;

    /* renamed from: OooOo0o */
    public final int f27964OooOo0o;

    /* renamed from: OooOoO */
    public final RectF f27965OooOoO;

    /* renamed from: OooOoO0 */
    public final Paint f27966OooOoO0;

    /* renamed from: OooOoOO */
    public final int f27967OooOoOO;

    /* renamed from: OooOoo */
    public boolean f27968OooOoo;

    /* renamed from: OooOoo0 */
    public float f27969OooOoo0;

    /* renamed from: OooOooO */
    public double f27970OooOooO;

    /* renamed from: OooOooo */
    public int f27971OooOooo;

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public final void OooO00o(float f) {
        float f2 = f % 360.0f;
        this.f27969OooOoo0 = f2;
        this.f27970OooOooO = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        float fCos = (this.f27971OooOooo * ((float) Math.cos(this.f27970OooOooO))) + (getWidth() / 2);
        float fSin = (this.f27971OooOooo * ((float) Math.sin(this.f27970OooOooO))) + height;
        float f3 = this.f27964OooOo0o;
        this.f27965OooOoO.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        ArrayList arrayList = this.f27963OooOo0O;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((OooO0o) obj);
            if (Math.abs(clockFaceView.f27960Oooo0OO - f2) > 0.001f) {
                clockFaceView.f27960Oooo0OO = f2;
                clockFaceView.OooO0O0();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float fCos = (this.f27971OooOooo * ((float) Math.cos(this.f27970OooOooO))) + width;
        float f = height;
        float fSin = (this.f27971OooOooo * ((float) Math.sin(this.f27970OooOooO))) + f;
        Paint paint = this.f27966OooOoO0;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f27964OooOo0o, paint);
        double dSin = Math.sin(this.f27970OooOooO);
        double dCos = Math.cos(this.f27970OooOooO);
        paint.setStrokeWidth(this.f27967OooOoOO);
        canvas.drawLine(width, f, r1 + ((int) (dCos * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(width, f, this.f27962OooOo, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooO00o(this.f27969OooOoo0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.f27968OooOoo = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f27968OooOoo;
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f27968OooOoo;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.f27969OooOoo0 != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            OooO00o(f);
            z3 = true;
        }
        this.f27968OooOoo = z4 | z3;
        return true;
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27963OooOo0O = new ArrayList();
        Paint paint = new Paint();
        this.f27966OooOoO0 = paint;
        this.f27965OooOoO = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOo.f14962OooOOO0, i, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f27971OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f27964OooOo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f27967OooOoOO = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f27962OooOo = r3.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        OooO00o(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
