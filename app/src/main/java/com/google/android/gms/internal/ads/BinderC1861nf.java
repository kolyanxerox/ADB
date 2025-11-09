package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* renamed from: com.google.android.gms.internal.ads.nf */
/* loaded from: classes2.dex */
public final class BinderC1861nf extends AbstractBinderC2181w2 implements InterfaceC1456cf {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final MediationInterscrollerAd f21473OooOo0O;

    public BinderC1861nf(MediationInterscrollerAd mediationInterscrollerAd) {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        this.f21473OooOo0O = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Oooo0o.OooO0O0 oooO0O0Zze = zze();
            parcel2.writeNoException();
            AbstractC2218x2.OooO0o0(parcel2, oooO0O0Zze);
            return true;
        }
        if (i != 2) {
            return false;
        }
        boolean zShouldDelegateInterscrollerEffect = this.f21473OooOo0O.shouldDelegateInterscrollerEffect();
        parcel2.writeNoException();
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        parcel2.writeInt(zShouldDelegateInterscrollerEffect ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1456cf
    public final Oooo0o.OooO0O0 zze() {
        return new Oooo0o.OooO0OO(this.f21473OooOo0O.getView());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1456cf
    public final boolean zzf() {
        return this.f21473OooOo0O.shouldDelegateInterscrollerEffect();
    }
}
