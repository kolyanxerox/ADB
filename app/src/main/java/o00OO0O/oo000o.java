package o00oO0o;

import Ooooo0o.oo0o0O0;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes2.dex */
public final class oo000o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f32751OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ float f32752OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ float f32753OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ float f32754OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f32755OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f32756OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f32757OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ float f32758OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Matrix f32759OooO0oo;

    public oo000o(oo0o0Oo oo0o0oo, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
        this.f32751OooO = oo0o0oo;
        this.f32752OooO00o = f;
        this.f32753OooO0O0 = f2;
        this.f32754OooO0OO = f3;
        this.f32755OooO0Oo = f4;
        this.f32757OooO0o0 = f5;
        this.f32756OooO0o = f6;
        this.f32758OooO0oO = f7;
        this.f32759OooO0oo = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        oo0o0Oo oo0o0oo = this.f32751OooO;
        oo0o0oo.f32791OooOo0O.setAlpha(oo0o0O0.OooO0O0(this.f32752OooO00o, this.f32753OooO0O0, 0.0f, 0.2f, fFloatValue));
        FloatingActionButton floatingActionButton = oo0o0oo.f32791OooOo0O;
        float f = this.f32754OooO0OO;
        float f2 = this.f32755OooO0Oo;
        floatingActionButton.setScaleX(oo0o0O0.OooO00o(f, f2, fFloatValue));
        oo0o0oo.f32791OooOo0O.setScaleY(oo0o0O0.OooO00o(this.f32757OooO0o0, f2, fFloatValue));
        float f3 = this.f32756OooO0o;
        float f4 = this.f32758OooO0oO;
        oo0o0oo.f32785OooOOOo = oo0o0O0.OooO00o(f3, f4, fFloatValue);
        float fOooO00o = oo0o0O0.OooO00o(f3, f4, fFloatValue);
        Matrix matrix = this.f32759OooO0oo;
        oo0o0oo.OooO00o(fOooO00o, matrix);
        oo0o0oo.f32791OooOo0O.setImageMatrix(matrix);
    }
}
