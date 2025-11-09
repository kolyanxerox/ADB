package com.google.android.material.appbar;

import android.content.res.Resources;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes2.dex */
public final class OooO0o implements AccessibilityViewCommand {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ View f27312OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f27313OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f27314OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f27315OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f27316OooOoO0;

    public OooO0o(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f27315OooOoO = baseBehavior;
        this.f27313OooOo0O = coordinatorLayout;
        this.f27314OooOo0o = appBarLayout;
        this.f27312OooOo = view;
        this.f27316OooOoO0 = i;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) throws Resources.NotFoundException {
        View view2 = this.f27312OooOo;
        int i = this.f27316OooOoO0;
        this.f27315OooOoO.OooOOO0(this.f27313OooOo0O, this.f27314OooOo0o, view2, i, new int[]{0, 0});
        return true;
    }
}
