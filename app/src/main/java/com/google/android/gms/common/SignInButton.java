package com.google.android.gms.common;

import OooO0oO.OooOo;
import OooOooO.o000O000;
import Oooo00O.o000000O;
import Oooo00O.o0OOO0o;
import Oooo0OO.o00oO0o;
import Oooo0o.OooO0o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import com.github.superadb.R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;

/* loaded from: classes2.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public View f16677OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f16678OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f16679OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public View.OnClickListener f16680OooOoO0;

    public SignInButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void OooO00o(int i, int i2) throws Resources.NotFoundException {
        this.f16678OooOo0O = i;
        this.f16679OooOo0o = i2;
        Context context = getContext();
        View view = this.f16677OooOo;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f16677OooOo = o0OOO0o.OooOO0o(context, this.f16678OooOo0O, this.f16679OooOo0o);
        } catch (OooO0o unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.f16678OooOo0O;
            int i4 = this.f16679OooOo0o;
            zaaa zaaaVar = new zaaa(context, null);
            Resources resources = context.getResources();
            zaaaVar.setTypeface(Typeface.DEFAULT_BOLD);
            zaaaVar.setTextSize(14.0f);
            int i5 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            zaaaVar.setMinHeight(i5);
            zaaaVar.setMinWidth(i5);
            int iOooO00o = zaaa.OooO00o(i4, R.drawable.common_google_signin_btn_icon_dark, R.drawable.common_google_signin_btn_icon_light, R.drawable.common_google_signin_btn_icon_light);
            int iOooO00o2 = zaaa.OooO00o(i4, R.drawable.common_google_signin_btn_text_dark, R.drawable.common_google_signin_btn_text_light, R.drawable.common_google_signin_btn_text_light);
            if (i3 == 0 || i3 == 1) {
                iOooO00o = iOooO00o2;
            } else if (i3 != 2) {
                throw new IllegalStateException(OooOo.OooO0o(i3, "Unknown button size: "));
            }
            Drawable drawableWrap = DrawableCompat.wrap(resources.getDrawable(iOooO00o));
            DrawableCompat.setTintList(drawableWrap, resources.getColorStateList(R.color.common_google_signin_btn_tint));
            DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_ATOP);
            zaaaVar.setBackgroundDrawable(drawableWrap);
            ColorStateList colorStateList = resources.getColorStateList(zaaa.OooO00o(i4, R.color.common_google_signin_btn_text_dark, R.color.common_google_signin_btn_text_light, R.color.common_google_signin_btn_text_light));
            o000000O.OooO0oo(colorStateList);
            zaaaVar.setTextColor(colorStateList);
            if (i3 == 0) {
                zaaaVar.setText(resources.getString(R.string.common_signin_button_text));
            } else if (i3 == 1) {
                zaaaVar.setText(resources.getString(R.string.common_signin_button_text_long));
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException(OooOo.OooO0o(i3, "Unknown button size: "));
                }
                zaaaVar.setText((CharSequence) null);
            }
            zaaaVar.setTransformationMethod(null);
            if (o00oO0o.OooOO0o(zaaaVar.getContext())) {
                zaaaVar.setGravity(19);
            }
            this.f16677OooOo = zaaaVar;
        }
        addView(this.f16677OooOo);
        this.f16677OooOo.setEnabled(isEnabled());
        this.f16677OooOo.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f16680OooOoO0;
        if (onClickListener == null || view != this.f16677OooOo) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i) throws Resources.NotFoundException {
        OooO00o(this.f16678OooOo0O, i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f16677OooOo.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f16680OooOoO0 = onClickListener;
        View view = this.f16677OooOo;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@NonNull Scope[] scopeArr) throws Resources.NotFoundException {
        OooO00o(this.f16678OooOo0O, this.f16679OooOo0o);
    }

    public void setSize(int i) throws Resources.NotFoundException {
        OooO00o(i, this.f16679OooOo0o);
    }

    public SignInButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.f16680OooOoO0 = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o000O000.f13657OooO00o, 0, 0);
        try {
            this.f16678OooOo0O = typedArrayObtainStyledAttributes.getInt(0, 0);
            this.f16679OooOo0o = typedArrayObtainStyledAttributes.getInt(1, 2);
            typedArrayObtainStyledAttributes.recycle();
            OooO00o(this.f16678OooOo0O, this.f16679OooOo0o);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
