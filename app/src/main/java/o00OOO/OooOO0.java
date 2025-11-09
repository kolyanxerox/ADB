package o00Ooo;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public final class OooOO0 implements View.OnTouchListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f32701OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Dialog f32702OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f32703OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f32704OooOoO0;

    public OooOO0(Dialog dialog, Rect rect) {
        this.f32702OooOo0O = dialog;
        this.f32703OooOo0o = rect.left;
        this.f32701OooOo = rect.top;
        this.f32704OooOoO0 = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f32703OooOo0o;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f32701OooOo, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f32704OooOoO0;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f32702OooOo0O.onTouchEvent(motionEventObtain);
    }
}
