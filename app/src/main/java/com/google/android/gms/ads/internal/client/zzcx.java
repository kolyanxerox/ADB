package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0O0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.C2080tc;
import com.google.android.gms.internal.ads.InterfaceC2156ve;
import com.google.android.gms.internal.ads.InterfaceC2265yc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcx extends AbstractC2144v2 implements zzcz {
    public zzcx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 7);
        float f = parcelOooOOO.readFloat();
        parcelOooOOO.recycle();
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 9);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 13);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOO.createTypedArrayList(C2080tc.CREATOR);
        parcelOooOOO.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(String str) throws RemoteException {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        o000OO0O(parcelOooO, 10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() throws RemoteException {
        o000OO0O(OooO(), 15);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z) throws RemoteException {
        Parcel parcelOooO = OooO();
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        parcelOooO.writeInt(z ? 1 : 0);
        o000OO0O(parcelOooO, 17);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() throws RemoteException {
        o000OO0O(OooO(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(String str, OooO0O0 oooO0O0) throws RemoteException {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(null);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdlVar) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, zzdlVar);
        o000OO0O(parcelOooO, 16);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(OooO0O0 oooO0O0, String str) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        parcelOooO.writeString(str);
        o000OO0O(parcelOooO, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(InterfaceC2156ve interfaceC2156ve) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        o000OO0O(parcelOooO, 11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z) throws RemoteException {
        Parcel parcelOooO = OooO();
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        parcelOooO.writeInt(z ? 1 : 0);
        o000OO0O(parcelOooO, 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f) throws RemoteException {
        Parcel parcelOooO = OooO();
        parcelOooO.writeFloat(f);
        o000OO0O(parcelOooO, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(InterfaceC2265yc interfaceC2265yc) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2265yc);
        o000OO0O(parcelOooO, 12);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) throws RemoteException {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        o000OO0O(parcelOooO, 18);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfv zzfvVar) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzfvVar);
        o000OO0O(parcelOooO, 14);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 8);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }
}
