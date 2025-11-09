package o00oO0o;

import android.animation.Animator;
import com.github.superadb.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import o000oooo.o000O;

/* loaded from: classes2.dex */
public final class o000oOoO extends o000O {

    /* renamed from: OooO */
    public final /* synthetic */ ExtendedFloatingActionButton f32730OooO;

    /* renamed from: OooO0oo */
    public boolean f32731OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(ExtendedFloatingActionButton extendedFloatingActionButton, o000Ooo.o00oO0o o00oo0o) {
        super(extendedFloatingActionButton, o00oo0o);
        this.f32730OooO = extendedFloatingActionButton;
    }

    @Override // o000oooo.o000O
    public final void OooO(Animator animator) {
        o000Ooo.o00oO0o o00oo0o = (o000Ooo.o00oO0o) this.f31136OooO0o0;
        Animator animator2 = (Animator) o00oo0o.f30487OooOo0o;
        if (animator2 != null) {
            animator2.cancel();
        }
        o00oo0o.f30487OooOo0o = animator;
        this.f32731OooO0oo = false;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f32730OooO;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.f27623Oooo0OO = 1;
    }

    @Override // o000oooo.o000O
    public final int OooO0Oo() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // o000oooo.o000O
    public final void OooO0oO() {
        super.OooO0oO();
        this.f32731OooO0oo = true;
    }

    @Override // o000oooo.o000O
    public final void OooO0oo() {
        ((o000Ooo.o00oO0o) this.f31136OooO0o0).f30487OooOo0o = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f32730OooO;
        extendedFloatingActionButton.f27623Oooo0OO = 0;
        if (this.f32731OooO0oo) {
            return;
        }
        extendedFloatingActionButton.setVisibility(8);
    }

    @Override // o000oooo.o000O
    public final void OooOO0() {
        this.f32730OooO.setVisibility(8);
    }

    @Override // o000oooo.o000O
    public final boolean OooOO0O() {
        Oooo000 oooo000 = ExtendedFloatingActionButton.f27618OoooOOo;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f32730OooO;
        if (extendedFloatingActionButton.getVisibility() == 0) {
            if (extendedFloatingActionButton.f27623Oooo0OO != 1) {
                return false;
            }
        } else if (extendedFloatingActionButton.f27623Oooo0OO == 2) {
            return false;
        }
        return true;
    }
}
