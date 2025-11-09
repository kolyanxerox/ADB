package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.za */
/* loaded from: classes2.dex */
public final class C2300za extends AbstractC2144v2 implements InterfaceC1379ab {
    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void OooO0O0() {
        o000OO0O(OooO(), 22);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void OooO0OO() {
        o000OO0O(OooO(), 27);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final boolean OooO0Oo() {
        Parcel parcelOooOOO = OooOOO(OooO(), 24);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void OooOo0o(zzdh zzdhVar) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, zzdhVar);
        o000OO0O(parcelOooO, 25);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final List Oooo0o0() {
        Parcel parcelOooOOO = OooOOO(OooO(), 3);
        ArrayList arrayList = parcelOooOOO.readArrayList(AbstractC2218x2.f25497OooO00o);
        parcelOooOOO.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void OoooO0(InterfaceC2263ya interfaceC2263ya) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2263ya);
        o000OO0O(parcelOooO, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final boolean OoooOoo(Bundle bundle) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, bundle);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 16);
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void OooooO0(zzdd zzddVar) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, zzddVar);
        o000OO0O(parcelOooO, 26);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void o000000(Bundle bundle) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, bundle);
        o000OO0O(parcelOooO, 15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void o0000O0(Bundle bundle) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, bundle);
        o000OO0O(parcelOooO, 17);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void o0000OO0(Bundle bundle) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, bundle);
        o000OO0O(parcelOooO, 33);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void o0ooOoO(zzdr zzdrVar) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, zzdrVar);
        o000OO0O(parcelOooO, 32);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void zzA() {
        o000OO0O(OooO(), 28);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final boolean zzH() {
        Parcel parcelOooOOO = OooOOO(OooO(), 30);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final double zze() {
        Parcel parcelOooOOO = OooOOO(OooO(), 8);
        double d = parcelOooOOO.readDouble();
        parcelOooOOO.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final Bundle zzf() {
        Parcel parcelOooOOO = OooOOO(OooO(), 20);
        Bundle bundle = (Bundle) AbstractC2218x2.OooO00o(parcelOooOOO, Bundle.CREATOR);
        parcelOooOOO.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final zzdy zzg() {
        Parcel parcelOooOOO = OooOOO(OooO(), 31);
        zzdy zzdyVarZzb = zzdx.zzb(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return zzdyVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final zzeb zzh() {
        Parcel parcelOooOOO = OooOOO(OooO(), 11);
        zzeb zzebVarZzb = zzea.zzb(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final InterfaceC1523e9 zzi() {
        InterfaceC1523e9 c1450c9;
        Parcel parcelOooOOO = OooOOO(OooO(), 14);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            c1450c9 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c1450c9 = iInterfaceQueryLocalInterface instanceof InterfaceC1523e9 ? (InterfaceC1523e9) iInterfaceQueryLocalInterface : new C1450c9(strongBinder);
        }
        parcelOooOOO.recycle();
        return c1450c9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final InterfaceC1634h9 zzj() {
        InterfaceC1634h9 c1597g9;
        Parcel parcelOooOOO = OooOOO(OooO(), 29);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            c1597g9 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            c1597g9 = iInterfaceQueryLocalInterface instanceof InterfaceC1634h9 ? (InterfaceC1634h9) iInterfaceQueryLocalInterface : new C1597g9(strongBinder);
        }
        parcelOooOOO.recycle();
        return c1597g9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final InterfaceC1707j9 zzk() {
        InterfaceC1707j9 c1671i9;
        Parcel parcelOooOOO = OooOOO(OooO(), 5);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            c1671i9 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c1671i9 = iInterfaceQueryLocalInterface instanceof InterfaceC1707j9 ? (InterfaceC1707j9) iInterfaceQueryLocalInterface : new C1671i9(strongBinder);
        }
        parcelOooOOO.recycle();
        return c1671i9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final Oooo0o.OooO0O0 zzl() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0OO(OooOOO(OooO(), 19));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final Oooo0o.OooO0O0 zzm() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0OO(OooOOO(OooO(), 18));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final String zzn() {
        Parcel parcelOooOOO = OooOOO(OooO(), 7);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final String zzo() {
        Parcel parcelOooOOO = OooOOO(OooO(), 4);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final String zzp() {
        Parcel parcelOooOOO = OooOOO(OooO(), 6);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final String zzq() {
        Parcel parcelOooOOO = OooOOO(OooO(), 2);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final String zzs() {
        Parcel parcelOooOOO = OooOOO(OooO(), 10);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final String zzt() {
        Parcel parcelOooOOO = OooOOO(OooO(), 9);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final List zzv() {
        Parcel parcelOooOOO = OooOOO(OooO(), 23);
        ArrayList arrayList = parcelOooOOO.readArrayList(AbstractC2218x2.f25497OooO00o);
        parcelOooOOO.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void zzx() {
        o000OO0O(OooO(), 13);
    }
}
