package o0OoOo0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes2.dex */
public final class OooO00o extends Animatable2Compat.AnimationCallback {

    /* renamed from: OooO00o */
    public final /* synthetic */ MaterialCheckBox f32996OooO00o;

    public OooO00o(MaterialCheckBox materialCheckBox) {
        this.f32996OooO00o = materialCheckBox;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        super.onAnimationEnd(drawable);
        ColorStateList colorStateList = this.f32996OooO00o.f27483Oooo000;
        if (colorStateList != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        super.onAnimationStart(drawable);
        MaterialCheckBox materialCheckBox = this.f32996OooO00o;
        ColorStateList colorStateList = materialCheckBox.f27483Oooo000;
        if (colorStateList != null) {
            DrawableCompat.setTint(drawable, colorStateList.getColorForState(materialCheckBox.f27486Oooo0O0, colorStateList.getDefaultColor()));
        }
    }
}
