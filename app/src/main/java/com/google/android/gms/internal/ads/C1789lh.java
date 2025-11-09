package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.lh */
/* loaded from: classes2.dex */
public final class C1789lh extends AbstractC2144v2 implements InterfaceC1863nh {
    public C1789lh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final boolean zzH() {
        Parcel parcelOooOOO = OooOOO(OooO(), 11);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzh(int i, int i2, Intent intent) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeInt(i);
        parcelOooO.writeInt(i2);
        AbstractC2218x2.OooO0OO(parcelOooO, intent);
        o000OO0O(parcelOooO, 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzi() {
        o000OO0O(OooO(), 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzk(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzl(Bundle bundle) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, bundle);
        o000OO0O(parcelOooO, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzm() {
        o000OO0O(OooO(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzo() {
        o000OO0O(OooO(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzp(int i, String[] strArr, int[] iArr) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeInt(i);
        parcelOooO.writeStringArray(strArr);
        parcelOooO.writeIntArray(iArr);
        o000OO0O(parcelOooO, 15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzq() {
        o000OO0O(OooO(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzr() {
        o000OO0O(OooO(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzs(Bundle bundle) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, bundle);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 6);
        if (parcelOooOOO.readInt() != 0) {
            bundle.readFromParcel(parcelOooOOO);
        }
        parcelOooOOO.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzt() {
        o000OO0O(OooO(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzu() {
        o000OO0O(OooO(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzv() {
        o000OO0O(OooO(), 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzx() {
        o000OO0O(OooO(), 9);
    }
}
