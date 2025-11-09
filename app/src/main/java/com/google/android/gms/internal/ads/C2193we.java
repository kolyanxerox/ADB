package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.we */
/* loaded from: classes2.dex */
public final class C2193we extends AbstractC2144v2 implements InterfaceC2230xe {
    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void OooO0Oo() {
        o000OO0O(OooO(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void OooO0oO() {
        o000OO0O(OooO(), 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final C1529ef OooOOOo() {
        C1529ef c1529ef;
        Parcel parcelOooOOO = OooOOO(OooO(), 16);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            c1529ef = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c1529ef = iInterfaceQueryLocalInterface instanceof C1529ef ? (C1529ef) iInterfaceQueryLocalInterface : new C1529ef(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
        }
        parcelOooOOO.recycle();
        return c1529ef;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void OooOOoo(Oooo0o.OooO0O0 oooO0O0, zzm zzmVar, InterfaceC1828mj interfaceC1828mj, String str) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzmVar);
        parcelOooO.writeString(null);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1828mj);
        parcelOooO.writeString(str);
        o000OO0O(parcelOooO, 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void OooOoOO(Oooo0o.OooO0O0 oooO0O0, zzm zzmVar, String str, String str2, InterfaceC1383af interfaceC1383af) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzmVar);
        parcelOooO.writeString(str);
        parcelOooO.writeString(str2);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1383af);
        o000OO0O(parcelOooO, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void Oooo(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 39);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void Oooo0oo(Oooo0o.OooO0O0 oooO0O0, InterfaceC2154vc interfaceC2154vc, ArrayList arrayList) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2154vc);
        parcelOooO.writeTypedList(arrayList);
        o000OO0O(parcelOooO, 31);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void Ooooo0o(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 37);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void OoooooO(zzm zzmVar, String str) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzmVar);
        parcelOooO.writeString(str);
        o000OO0O(parcelOooO, 11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o00000oo(Oooo0o.OooO0O0 oooO0O0, zzm zzmVar, String str, InterfaceC1383af interfaceC1383af) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzmVar);
        parcelOooO.writeString(str);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1383af);
        o000OO0O(parcelOooO, 38);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o0000OoO(Oooo0o.OooO0O0 oooO0O0, zzs zzsVar, zzm zzmVar, String str, String str2, InterfaceC1383af interfaceC1383af) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzsVar);
        AbstractC2218x2.OooO0OO(parcelOooO, zzmVar);
        parcelOooO.writeString(str);
        parcelOooO.writeString(str2);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1383af);
        o000OO0O(parcelOooO, 35);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o0000oO(Oooo0o.OooO0O0 oooO0O0, zzm zzmVar, String str, InterfaceC1383af interfaceC1383af) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzmVar);
        parcelOooO.writeString(str);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1383af);
        o000OO0O(parcelOooO, 28);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o000O0(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o000O00O(Oooo0o.OooO0O0 oooO0O0, zzs zzsVar, zzm zzmVar, String str, String str2, InterfaceC1383af interfaceC1383af) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzsVar);
        AbstractC2218x2.OooO0OO(parcelOooO, zzmVar);
        parcelOooO.writeString(str);
        parcelOooO.writeString(str2);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1383af);
        o000OO0O(parcelOooO, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o000OOo(Oooo0o.OooO0O0 oooO0O0, zzm zzmVar, String str, InterfaceC1383af interfaceC1383af) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzmVar);
        parcelOooO.writeString(str);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1383af);
        o000OO0O(parcelOooO, 32);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o000Oo0(Oooo0o.OooO0O0 oooO0O0, zzm zzmVar, String str, String str2, InterfaceC1383af interfaceC1383af, C1414b9 c1414b9, ArrayList arrayList) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzmVar);
        parcelOooO.writeString(str);
        parcelOooO.writeString(str2);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1383af);
        AbstractC2218x2.OooO0OO(parcelOooO, c1414b9);
        parcelOooO.writeStringList(arrayList);
        o000OO0O(parcelOooO, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o00Oo0(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 30);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o0ooOOo(Oooo0o.OooO0O0 oooO0O0, InterfaceC1828mj interfaceC1828mj, List list) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1828mj);
        parcelOooO.writeStringList(list);
        o000OO0O(parcelOooO, 23);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void ooOO(boolean z) {
        Parcel parcelOooO = OooO();
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        parcelOooO.writeInt(z ? 1 : 0);
        o000OO0O(parcelOooO, 25);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void zzE() {
        o000OO0O(OooO(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void zzL() {
        o000OO0O(OooO(), 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final boolean zzM() {
        Parcel parcelOooOOO = OooOOO(OooO(), 22);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final boolean zzN() {
        Parcel parcelOooOOO = OooOOO(OooO(), 13);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final C1493df zzO() {
        C1493df c1493df;
        Parcel parcelOooOOO = OooOOO(OooO(), 15);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            c1493df = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c1493df = iInterfaceQueryLocalInterface instanceof C1493df ? (C1493df) iInterfaceQueryLocalInterface : new C1493df(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        }
        parcelOooOOO.recycle();
        return c1493df;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final zzeb zzh() {
        Parcel parcelOooOOO = OooOOO(OooO(), 26);
        zzeb zzebVarZzb = zzea.zzb(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final InterfaceC1456cf zzj() {
        InterfaceC1456cf c1420bf;
        Parcel parcelOooOOO = OooOOO(OooO(), 36);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            c1420bf = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c1420bf = iInterfaceQueryLocalInterface instanceof InterfaceC1456cf ? (InterfaceC1456cf) iInterfaceQueryLocalInterface : new C1420bf(strongBinder);
        }
        parcelOooOOO.recycle();
        return c1420bf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final InterfaceC1640hf zzk() {
        InterfaceC1640hf c1566ff;
        Parcel parcelOooOOO = OooOOO(OooO(), 27);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            c1566ff = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            c1566ff = iInterfaceQueryLocalInterface instanceof InterfaceC1640hf ? (InterfaceC1640hf) iInterfaceQueryLocalInterface : new C1566ff(strongBinder);
        }
        parcelOooOOO.recycle();
        return c1566ff;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final C1788lg zzl() {
        Parcel parcelOooOOO = OooOOO(OooO(), 33);
        C1788lg c1788lg = (C1788lg) AbstractC2218x2.OooO00o(parcelOooOOO, C1788lg.CREATOR);
        parcelOooOOO.recycle();
        return c1788lg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final C1788lg zzm() {
        Parcel parcelOooOOO = OooOOO(OooO(), 34);
        C1788lg c1788lg = (C1788lg) AbstractC2218x2.OooO00o(parcelOooOOO, C1788lg.CREATOR);
        parcelOooOOO.recycle();
        return c1788lg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final Oooo0o.OooO0O0 zzn() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0OO(OooOOO(OooO(), 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void zzo() {
        o000OO0O(OooO(), 5);
    }
}
