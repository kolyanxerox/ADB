package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

/* loaded from: classes2.dex */
public final class o0OoOo0 implements OnApplyWindowInsetsListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f27595OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f27596OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ View f27597OooOo0o;

    public o0OoOo0(View view, int i, int i2) {
        this.f27596OooOo0O = i;
        this.f27597OooOo0o = view;
        this.f27595OooOo = i2;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
        View view2 = this.f27597OooOo0o;
        int i2 = this.f27596OooOo0O;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f27595OooOo + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return windowInsetsCompat;
    }
}
