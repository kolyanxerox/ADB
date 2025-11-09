package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;

/* loaded from: classes2.dex */
public final class OooO implements AccessibilityViewCommand {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f27304OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f27305OooOo0o;

    public OooO(AppBarLayout appBarLayout, boolean z) {
        this.f27304OooOo0O = appBarLayout;
        this.f27305OooOo0o = z;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        this.f27304OooOo0O.setExpanded(this.f27305OooOo0o);
        return true;
    }
}
