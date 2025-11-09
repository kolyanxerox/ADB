package o0OO00O;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;

/* loaded from: classes2.dex */
public final class OooOo00 extends Oooo000 {

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public static final OooOOOO f32869Oooo0o0 = new OooOOOO("indicatorLevel");

    /* renamed from: Oooo0, reason: collision with root package name */
    public final SpringAnimation f32870Oooo0;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final Oooo0 f32871Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public final SpringForce f32872Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public float f32873Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f32874Oooo0OO;

    public OooOo00(Context context, OooOO0 oooOO0, Oooo0 oooo0) {
        super(context, oooOO0);
        this.f32874Oooo0OO = false;
        this.f32871Oooo00O = oooo0;
        oooo0.f32876OooO0O0 = this;
        SpringForce springForce = new SpringForce();
        this.f32872Oooo00o = springForce;
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, f32869Oooo0o0);
        this.f32870Oooo0 = springAnimation;
        springAnimation.setSpring(springForce);
        if (this.f32884OooOoo != 1.0f) {
            this.f32884OooOoo = 1.0f;
            invalidateSelf();
        }
    }

    @Override // o0OO00O.Oooo000
    public final boolean OooO0o(boolean z, boolean z2, boolean z3) {
        boolean zOooO0o = super.OooO0o(z, z2, z3);
        OooO00o oooO00o = this.f32878OooOo;
        ContentResolver contentResolver = this.f32879OooOo0O.getContentResolver();
        oooO00o.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.f32874Oooo0OO = true;
            return zOooO0o;
        }
        this.f32874Oooo0OO = false;
        this.f32872Oooo00o.setStiffness(50.0f / f);
        return zOooO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            Oooo0 oooo0 = this.f32871Oooo00O;
            Rect bounds = getBounds();
            float fOooO0O0 = OooO0O0();
            oooo0.f32875OooO00o.OooO00o();
            oooo0.OooO00o(canvas, bounds, fOooO0O0);
            Oooo0 oooo02 = this.f32871Oooo00O;
            Paint paint = this.f32886OooOooO;
            oooo02.OooO0OO(canvas, paint);
            this.f32871Oooo00O.OooO0O0(canvas, paint, 0.0f, this.f32873Oooo0O0, OooO00o.OooO00o.OooO0O0(this.f32880OooOo0o.f32846OooO0OO[0], this.f32887OooOooo));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f32871Oooo00O.OooO0Oo();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f32871Oooo00O.OooO0o0();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f32870Oooo0.skipToEnd();
        this.f32873Oooo0O0 = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.f32874Oooo0OO;
        SpringAnimation springAnimation = this.f32870Oooo0;
        if (!z) {
            springAnimation.setStartValue(this.f32873Oooo0O0 * 10000.0f);
            springAnimation.animateToFinalPosition(i);
            return true;
        }
        springAnimation.skipToEnd();
        this.f32873Oooo0O0 = i / 10000.0f;
        invalidateSelf();
        return true;
    }
}
