package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.mg */
/* loaded from: classes2.dex */
public final class C1825mg implements zzr {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ zzbrw f21249OooOo0O;

    public C1825mg(zzbrw zzbrwVar) {
        this.f21249OooOo0O = zzbrwVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        zzo.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        zzo.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzo.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzo.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbrw zzbrwVar = this.f21249OooOo0O;
        zzbrwVar.f26400OooO0O0.onAdOpened(zzbrwVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        zzo.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbrw zzbrwVar = this.f21249OooOo0O;
        zzbrwVar.f26400OooO0O0.onAdClosed(zzbrwVar);
    }
}
