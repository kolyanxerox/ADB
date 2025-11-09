package com.google.android.material.radiobutton;

import OooO00o.OooO00o;
import Ooooo00.OooOo;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;
import o0ooOO0.o00000O0;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final int[][] f27743OooOo = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: OooOo0O, reason: collision with root package name */
    public ColorStateList f27744OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f27745OooOo0o;

    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.github.superadb.R.attr.radioButtonStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f27744OooOo0O == null) {
            int iOooOO0o = OooO00o.OooOO0o(this, com.github.superadb.R.attr.colorControlActivated);
            int iOooOO0o2 = OooO00o.OooOO0o(this, com.github.superadb.R.attr.colorOnSurface);
            int iOooOO0o3 = OooO00o.OooOO0o(this, com.github.superadb.R.attr.colorSurface);
            this.f27744OooOo0O = new ColorStateList(f27743OooOo, new int[]{OooO00o.OooOOo(1.0f, iOooOO0o3, iOooOO0o), OooO00o.OooOOo(0.54f, iOooOO0o3, iOooOO0o2), OooO00o.OooOOo(0.38f, iOooOO0o3, iOooOO0o2), OooO00o.OooOOo(0.38f, iOooOO0o3, iOooOO0o2)});
        }
        return this.f27744OooOo0O;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f27745OooOo0o && CompoundButtonCompat.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f27745OooOo0o = z;
        if (z) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, com.github.superadb.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context2, attributeSet, OooOo.f14981Oooo000, i, com.github.superadb.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayOooO0Oo.hasValue(0)) {
            CompoundButtonCompat.setButtonTintList(this, OooO0OO.OooO00o(context2, typedArrayOooO0Oo, 0));
        }
        this.f27745OooOo0o = typedArrayOooO0Oo.getBoolean(1, false);
        typedArrayOooO0Oo.recycle();
    }
}
