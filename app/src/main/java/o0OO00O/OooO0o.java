package o0OO00O;

import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

/* loaded from: classes2.dex */
public final class OooO0o extends Animatable2Compat.AnimationCallback {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO f32843OooO00o;

    public OooO0o(OooO oooO) {
        this.f32843OooO00o = oooO;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        super.onAnimationEnd(drawable);
        OooO oooO = this.f32843OooO00o;
        if (oooO.f32834OooOoOO) {
            return;
        }
        oooO.setVisibility(oooO.f32836OooOoo0);
    }
}
