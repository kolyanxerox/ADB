package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzcl;

/* renamed from: com.google.android.gms.internal.ads.h3 */
/* loaded from: classes2.dex */
public final class BinderC1628h3 extends zzcl {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final AppEventListener f19528OooOo0O;

    public BinderC1628h3(AppEventListener appEventListener) {
        this.f19528OooOo0O = appEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzc(String str, String str2) {
        this.f19528OooOo0O.onAppEvent(str, str2);
    }
}
