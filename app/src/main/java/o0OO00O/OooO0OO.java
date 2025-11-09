package o0OO00O;

import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

/* loaded from: classes2.dex */
public final class OooO0OO extends Animatable2Compat.AnimationCallback {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO f32842OooO00o;

    public OooO0OO(OooO oooO) {
        this.f32842OooO00o = oooO;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        OooO oooO = this.f32842OooO00o;
        oooO.setIndeterminate(false);
        oooO.OooO0O0(oooO.f32831OooOo0o);
    }
}
