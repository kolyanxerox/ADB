package o00000Oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import o000Oo0O.OooOo00;
import o00oO0o.oo0o0Oo;

/* loaded from: classes2.dex */
public final class OooO0o extends AnimatorListenerAdapter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f29264OooO00o = 1;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f29265OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f29266OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f29267OooO0Oo;

    public OooO0o(boolean z, View view, View view2) {
        this.f29265OooO0O0 = z;
        this.f29266OooO0OO = view;
        this.f29267OooO0Oo = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29264OooO00o) {
            case 0:
                if (!this.f29265OooO0O0) {
                    ((View) this.f29266OooO0OO).setVisibility(4);
                    View view = (View) this.f29267OooO0Oo;
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                    break;
                }
                break;
            default:
                oo0o0Oo oo0o0oo = (oo0o0Oo) this.f29267OooO0Oo;
                oo0o0oo.f32786OooOOo = 0;
                oo0o0oo.OooOO0o = null;
                OooOo00 oooOo00 = (OooOo00) this.f29266OooO0OO;
                if (oooOo00 != null) {
                    ((Oooo0o0.OooO) oooOo00.f30372OooOo0o).OooOOoo();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f29264OooO00o) {
            case 0:
                if (this.f29265OooO0O0) {
                    ((View) this.f29266OooO0OO).setVisibility(0);
                    View view = (View) this.f29267OooO0Oo;
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                    break;
                }
                break;
            default:
                oo0o0Oo oo0o0oo = (oo0o0Oo) this.f29267OooO0Oo;
                oo0o0oo.f32791OooOo0O.OooO00o(0, this.f29265OooO0O0);
                oo0o0oo.f32786OooOOo = 2;
                oo0o0oo.OooOO0o = animator;
                break;
        }
    }

    public OooO0o(oo0o0Oo oo0o0oo, boolean z, OooOo00 oooOo00) {
        this.f29267OooO0Oo = oo0o0oo;
        this.f29265OooO0O0 = z;
        this.f29266OooO0OO = oooOo00;
    }
}
