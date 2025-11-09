package o00oO0o;

import Ooooo0o.o00OO00O;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import o000oooo.o000O;

/* loaded from: classes2.dex */
public final class Oooo0 extends o000O {

    /* renamed from: OooO */
    public final boolean f32725OooO;

    /* renamed from: OooO0oo */
    public final OooOo f32726OooO0oo;

    /* renamed from: OooOO0 */
    public final /* synthetic */ ExtendedFloatingActionButton f32727OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(ExtendedFloatingActionButton extendedFloatingActionButton, o000Ooo.o00oO0o o00oo0o, OooOo oooOo, boolean z) {
        super(extendedFloatingActionButton, o00oo0o);
        this.f32727OooOO0 = extendedFloatingActionButton;
        this.f32726OooO0oo = oooOo;
        this.f32725OooO = z;
    }

    @Override // o000oooo.o000O
    public final void OooO(Animator animator) {
        o000Ooo.o00oO0o o00oo0o = (o000Ooo.o00oO0o) this.f31136OooO0o0;
        Animator animator2 = (Animator) o00oo0o.f30487OooOo0o;
        if (animator2 != null) {
            animator2.cancel();
        }
        o00oo0o.f30487OooOo0o = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f32727OooOO0;
        extendedFloatingActionButton.f27628OoooO = this.f32725OooO;
        extendedFloatingActionButton.f27632OoooOO0 = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // o000oooo.o000O
    public final AnimatorSet OooO0O0() {
        int measuredHeight;
        int measuredWidth;
        o00OO00O o00oo00o = (o00OO00O) this.f31137OooO0oO;
        if (o00oo00o == null) {
            if (((o00OO00O) this.f31135OooO0o) == null) {
                this.f31135OooO0o = o00OO00O.OooO0O0(this.f31132OooO0O0, OooO0Oo());
            }
            o00oo00o = (o00OO00O) Preconditions.checkNotNull((o00OO00O) this.f31135OooO0o);
        }
        boolean zOooO0oO = o00oo00o.OooO0oO("width");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f32727OooOO0;
        OooOo oooOo = this.f32726OooO0oo;
        if (zOooO0oO) {
            PropertyValuesHolder[] propertyValuesHolderArrOooO0o0 = o00oo00o.OooO0o0("width");
            PropertyValuesHolder propertyValuesHolder = propertyValuesHolderArrOooO0o0[0];
            float width = extendedFloatingActionButton.getWidth();
            switch (oooOo.f32708OooO00o) {
                case 0:
                    ExtendedFloatingActionButton extendedFloatingActionButton2 = oooOo.f32709OooO0O0;
                    measuredWidth = extendedFloatingActionButton2.f27629OoooO0 + (extendedFloatingActionButton2.getMeasuredWidth() - (extendedFloatingActionButton2.getCollapsedPadding() * 2)) + extendedFloatingActionButton2.f27630OoooO00;
                    break;
                default:
                    measuredWidth = oooOo.f32709OooO0O0.getCollapsedSize();
                    break;
            }
            propertyValuesHolder.setFloatValues(width, measuredWidth);
            o00oo00o.OooO0oo("width", propertyValuesHolderArrOooO0o0);
        }
        if (o00oo00o.OooO0oO("height")) {
            PropertyValuesHolder[] propertyValuesHolderArrOooO0o02 = o00oo00o.OooO0o0("height");
            PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolderArrOooO0o02[0];
            float height = extendedFloatingActionButton.getHeight();
            switch (oooOo.f32708OooO00o) {
                case 0:
                    measuredHeight = oooOo.f32709OooO0O0.getMeasuredHeight();
                    break;
                default:
                    measuredHeight = oooOo.f32709OooO0O0.getCollapsedSize();
                    break;
            }
            propertyValuesHolder2.setFloatValues(height, measuredHeight);
            o00oo00o.OooO0oo("height", propertyValuesHolderArrOooO0o02);
        }
        if (o00oo00o.OooO0oO("paddingStart")) {
            PropertyValuesHolder[] propertyValuesHolderArrOooO0o03 = o00oo00o.OooO0o0("paddingStart");
            propertyValuesHolderArrOooO0o03[0].setFloatValues(ViewCompat.getPaddingStart(extendedFloatingActionButton), oooOo.OooO0OO());
            o00oo00o.OooO0oo("paddingStart", propertyValuesHolderArrOooO0o03);
        }
        if (o00oo00o.OooO0oO("paddingEnd")) {
            PropertyValuesHolder[] propertyValuesHolderArrOooO0o04 = o00oo00o.OooO0o0("paddingEnd");
            propertyValuesHolderArrOooO0o04[0].setFloatValues(ViewCompat.getPaddingEnd(extendedFloatingActionButton), oooOo.OooO0O0());
            o00oo00o.OooO0oo("paddingEnd", propertyValuesHolderArrOooO0o04);
        }
        if (o00oo00o.OooO0oO("labelOpacity")) {
            PropertyValuesHolder[] propertyValuesHolderArrOooO0o05 = o00oo00o.OooO0o0("labelOpacity");
            boolean z = this.f32725OooO;
            propertyValuesHolderArrOooO0o05[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            o00oo00o.OooO0oo("labelOpacity", propertyValuesHolderArrOooO0o05);
        }
        return OooO0OO(o00oo00o);
    }

    @Override // o000oooo.o000O
    public final int OooO0Oo() {
        return this.f32725OooO ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // o000oooo.o000O
    public final void OooO0oo() {
        ((o000Ooo.o00oO0o) this.f31136OooO0o0).f30487OooOo0o = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f32727OooOO0;
        extendedFloatingActionButton.f27632OoooOO0 = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        OooOo oooOo = this.f32726OooO0oo;
        layoutParams.width = oooOo.OooO00o().width;
        layoutParams.height = oooOo.OooO00o().height;
    }

    @Override // o000oooo.o000O
    public final void OooOO0() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f32727OooOO0;
        extendedFloatingActionButton.f27628OoooO = this.f32725OooO;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        OooOo oooOo = this.f32726OooO0oo;
        layoutParams.width = oooOo.OooO00o().width;
        layoutParams.height = oooOo.OooO00o().height;
        ViewCompat.setPaddingRelative(extendedFloatingActionButton, oooOo.OooO0OO(), extendedFloatingActionButton.getPaddingTop(), oooOo.OooO0O0(), extendedFloatingActionButton.getPaddingBottom());
        extendedFloatingActionButton.requestLayout();
    }

    @Override // o000oooo.o000O
    public final boolean OooOO0O() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f32727OooOO0;
        return this.f32725OooO == extendedFloatingActionButton.f27628OoooO || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }
}
