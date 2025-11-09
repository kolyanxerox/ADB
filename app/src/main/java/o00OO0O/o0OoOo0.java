package o00oO0o;

import android.animation.Animator;
import com.github.superadb.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import o000oooo.o000O;

/* loaded from: classes2.dex */
public final class o0OoOo0 extends o000O {

    /* renamed from: OooO0oo */
    public final /* synthetic */ ExtendedFloatingActionButton f32749OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(ExtendedFloatingActionButton extendedFloatingActionButton, o000Ooo.o00oO0o o00oo0o) {
        super(extendedFloatingActionButton, o00oo0o);
        this.f32749OooO0oo = extendedFloatingActionButton;
    }

    @Override // o000oooo.o000O
    public final void OooO(Animator animator) {
        o000Ooo.o00oO0o o00oo0o = (o000Ooo.o00oO0o) this.f31136OooO0o0;
        Animator animator2 = (Animator) o00oo0o.f30487OooOo0o;
        if (animator2 != null) {
            animator2.cancel();
        }
        o00oo0o.f30487OooOo0o = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f32749OooO0oo;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.f27623Oooo0OO = 2;
    }

    @Override // o000oooo.o000O
    public final int OooO0Oo() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // o000oooo.o000O
    public final void OooO0oo() {
        ((o000Ooo.o00oO0o) this.f31136OooO0o0).f30487OooOo0o = null;
        this.f32749OooO0oo.f27623Oooo0OO = 0;
    }

    @Override // o000oooo.o000O
    public final void OooOO0() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f32749OooO0oo;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // o000oooo.o000O
    public final boolean OooOO0O() {
        Oooo000 oooo000 = ExtendedFloatingActionButton.f27618OoooOOo;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f32749OooO0oo;
        if (extendedFloatingActionButton.getVisibility() != 0) {
            if (extendedFloatingActionButton.f27623Oooo0OO != 2) {
                return false;
            }
        } else if (extendedFloatingActionButton.f27623Oooo0OO == 1) {
            return false;
        }
        return true;
    }
}
