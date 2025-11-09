package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.lo */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC1796lo implements View.OnAttachStateChangeListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1792lk f20916OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1870no f20917OooOo0o;

    public ViewOnAttachStateChangeListenerC1796lo(AbstractC1870no abstractC1870no, InterfaceC1792lk interfaceC1792lk) {
        this.f20916OooOo0O = interfaceC1792lk;
        this.f20917OooOo0o = abstractC1870no;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f20917OooOo0o.OoooO0O(view, this.f20916OooOo0O, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
