package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.aa */
/* loaded from: classes2.dex */
public final class C1378aa extends AbstractC2144v2 implements InterfaceC1415ba {
    public C1378aa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final void OooO0oo(String str) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        o000OO0O(parcelOooO, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final boolean OooOO0o(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 17);
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final boolean OooOOO0(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 10);
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final void o00000O0(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final InterfaceC1634h9 zzf() {
        InterfaceC1634h9 c1597g9;
        Parcel parcelOooOOO = OooOOO(OooO(), 16);
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final InterfaceC1707j9 zzg(String str) {
        InterfaceC1707j9 c1671i9;
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 2);
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final Oooo0o.OooO0O0 zzh() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0OO(OooOOO(OooO(), 9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final String zzi() {
        Parcel parcelOooOOO = OooOOO(OooO(), 4);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final String zzj(String str) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 1);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final List zzk() {
        Parcel parcelOooOOO = OooOOO(OooO(), 3);
        ArrayList<String> arrayListCreateStringArrayList = parcelOooOOO.createStringArrayList();
        parcelOooOOO.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final void zzl() {
        o000OO0O(OooO(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final void zzm() {
        o000OO0O(OooO(), 15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final void zzo() {
        o000OO0O(OooO(), 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final boolean zzq() {
        Parcel parcelOooOOO = OooOOO(OooO(), 12);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415ba
    public final boolean zzt() {
        Parcel parcelOooOOO = OooOOO(OooO(), 13);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }
}
