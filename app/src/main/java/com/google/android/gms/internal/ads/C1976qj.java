package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzm;

/* renamed from: com.google.android.gms.internal.ads.qj */
/* loaded from: classes2.dex */
public final class C1976qj extends AbstractC2144v2 implements InterfaceC2050sj {
    public C1976qj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final Bundle zzb() {
        Parcel parcelOooOOO = OooOOO(OooO(), 9);
        Bundle bundle = (Bundle) AbstractC2218x2.OooO00o(parcelOooOOO, Bundle.CREATOR);
        parcelOooOOO.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final zzdy zzc() {
        Parcel parcelOooOOO = OooOOO(OooO(), 12);
        zzdy zzdyVarZzb = zzdx.zzb(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return zzdyVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final InterfaceC1939pj zzd() {
        InterfaceC1939pj c1903oj;
        Parcel parcelOooOOO = OooOOO(OooO(), 11);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            c1903oj = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            c1903oj = iInterfaceQueryLocalInterface instanceof InterfaceC1939pj ? (InterfaceC1939pj) iInterfaceQueryLocalInterface : new C1903oj(strongBinder);
        }
        parcelOooOOO.recycle();
        return c1903oj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final void zzf(zzm zzmVar, InterfaceC2309zj interfaceC2309zj) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzmVar);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2309zj);
        o000OO0O(parcelOooO, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final void zzg(zzm zzmVar, InterfaceC2309zj interfaceC2309zj) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzmVar);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2309zj);
        o000OO0O(parcelOooO, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final void zzh(boolean z) {
        Parcel parcelOooO = OooO();
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        parcelOooO.writeInt(z ? 1 : 0);
        o000OO0O(parcelOooO, 15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final void zzi(zzdo zzdoVar) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, zzdoVar);
        o000OO0O(parcelOooO, 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final void zzj(zzdr zzdrVar) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, zzdrVar);
        o000OO0O(parcelOooO, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final void zzk(InterfaceC2161vj interfaceC2161vj) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2161vj);
        o000OO0O(parcelOooO, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final void zzl(C1571fk c1571fk) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, c1571fk);
        o000OO0O(parcelOooO, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final void zzm(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 5);
    }
}
