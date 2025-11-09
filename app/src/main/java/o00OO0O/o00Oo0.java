package o00oO0o;

import Oooo0o0.OooO;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes2.dex */
public final class o00Oo0 extends AnimatorListenerAdapter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f32734OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f32735OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o000Oo0O.OooOo00 f32736OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f32737OooO0Oo;

    public o00Oo0(oo0o0Oo oo0o0oo, boolean z, o000Oo0O.OooOo00 oooOo00) {
        this.f32737OooO0Oo = oo0o0oo;
        this.f32735OooO0O0 = z;
        this.f32736OooO0OO = oooOo00;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f32734OooO00o = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oo0o0Oo oo0o0oo = this.f32737OooO0Oo;
        oo0o0oo.f32786OooOOo = 0;
        oo0o0oo.OooOO0o = null;
        if (this.f32734OooO00o) {
            return;
        }
        boolean z = this.f32735OooO0O0;
        oo0o0oo.f32791OooOo0O.OooO00o(z ? 8 : 4, z);
        o000Oo0O.OooOo00 oooOo00 = this.f32736OooO0OO;
        if (oooOo00 != null) {
            ((OooO) oooOo00.f30372OooOo0o).OooOOo((FloatingActionButton) oooOo00.f30370OooOo);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        oo0o0Oo oo0o0oo = this.f32737OooO0Oo;
        oo0o0oo.f32791OooOo0O.OooO00o(0, this.f32735OooO0O0);
        oo0o0oo.f32786OooOOo = 1;
        oo0o0oo.OooOO0o = animator;
        this.f32734OooO00o = false;
    }
}
