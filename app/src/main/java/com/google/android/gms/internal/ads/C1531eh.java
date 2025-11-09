package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* renamed from: com.google.android.gms.internal.ads.eh */
/* loaded from: classes2.dex */
public final class C1531eh extends AbstractC2144v2 implements InterfaceC1605gh {
    public C1531eh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1605gh
    public final void OooOOo(Intent intent) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, intent);
        o000OO0O(parcelOooO, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1605gh
    public final void OooOOo0(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1605gh
    public final void Oooo0O0(Oooo0o.OooO0O0 oooO0O0, zza zzaVar) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzaVar);
        o000OO0O(parcelOooO, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1605gh
    public final void Oooooo(String[] strArr, int[] iArr, Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeStringArray(strArr);
        parcelOooO.writeIntArray(iArr);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1605gh
    public final void zzh() {
        o000OO0O(OooO(), 3);
    }
}
