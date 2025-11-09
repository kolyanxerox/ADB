package com.google.android.material.switchmaterial;

import OooO00o.OooO00o;
import Ooooo00.OooOo;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.ViewCompat;
import o00ooo.OooOO0O;
import o0ooOO0.o00000O0;

/* loaded from: classes2.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final int[][] f27816OooOoO = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: OooOo, reason: collision with root package name */
    public ColorStateList f27817OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OooOO0O f27818OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public ColorStateList f27819OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public boolean f27820OooOoO0;

    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.github.superadb.R.attr.switchStyle);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() throws Resources.NotFoundException {
        if (this.f27819OooOo0o == null) {
            int iOooOO0o = OooO00o.OooOO0o(this, com.github.superadb.R.attr.colorSurface);
            int iOooOO0o2 = OooO00o.OooOO0o(this, com.github.superadb.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(com.github.superadb.R.dimen.mtrl_switch_thumb_elevation);
            OooOO0O oooOO0O = this.f27818OooOo0O;
            if (oooOO0O.f32817OooO00o) {
                float elevation = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    elevation += ViewCompat.getElevation((View) parent);
                }
                dimension += elevation;
            }
            int iOooO00o = oooOO0O.OooO00o(dimension, iOooOO0o);
            this.f27819OooOo0o = new ColorStateList(f27816OooOoO, new int[]{OooO00o.OooOOo(1.0f, iOooOO0o, iOooOO0o2), iOooO00o, OooO00o.OooOOo(0.38f, iOooOO0o, iOooOO0o2), iOooO00o});
        }
        return this.f27819OooOo0o;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f27817OooOo == null) {
            int iOooOO0o = OooO00o.OooOO0o(this, com.github.superadb.R.attr.colorSurface);
            int iOooOO0o2 = OooO00o.OooOO0o(this, com.github.superadb.R.attr.colorControlActivated);
            int iOooOO0o3 = OooO00o.OooOO0o(this, com.github.superadb.R.attr.colorOnSurface);
            this.f27817OooOo = new ColorStateList(f27816OooOoO, new int[]{OooO00o.OooOOo(0.54f, iOooOO0o, iOooOO0o2), OooO00o.OooOOo(0.32f, iOooOO0o, iOooOO0o3), OooO00o.OooOOo(0.12f, iOooOO0o, iOooOO0o2), OooO00o.OooOOo(0.12f, iOooOO0o, iOooOO0o3)});
        }
        return this.f27817OooOo;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f27820OooOoO0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f27820OooOoO0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f27820OooOoO0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, com.github.superadb.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, i);
        Context context2 = getContext();
        this.f27818OooOo0O = new OooOO0O(context2);
        int[] iArr = OooOo.f14996OoooOOo;
        o00000O0.OooO00o(context2, attributeSet, i, com.github.superadb.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        o00000O0.OooO0O0(context2, attributeSet, iArr, i, com.github.superadb.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, com.github.superadb.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.f27820OooOoO0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
