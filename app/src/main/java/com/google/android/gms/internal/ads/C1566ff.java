package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ff */
/* loaded from: classes2.dex */
public final class C1566ff extends AbstractC2144v2 implements InterfaceC1640hf {
    public C1566ff(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final void Oooo0(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 22);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final void o000000O(Oooo0o.OooO0O0 oooO0O0, Oooo0o.OooO0O0 oooO0O02, Oooo0o.OooO0O0 oooO0O03) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O02);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O03);
        o000OO0O(parcelOooO, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final void o000O0O(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 20);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final boolean zzA() {
        Parcel parcelOooOOO = OooOOO(OooO(), 18);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final boolean zzB() {
        Parcel parcelOooOOO = OooOOO(OooO(), 17);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final double zze() {
        Parcel parcelOooOOO = OooOOO(OooO(), 8);
        double d = parcelOooOOO.readDouble();
        parcelOooOOO.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final float zzf() {
        Parcel parcelOooOOO = OooOOO(OooO(), 23);
        float f = parcelOooOOO.readFloat();
        parcelOooOOO.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final float zzg() {
        Parcel parcelOooOOO = OooOOO(OooO(), 25);
        float f = parcelOooOOO.readFloat();
        parcelOooOOO.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final float zzh() {
        Parcel parcelOooOOO = OooOOO(OooO(), 24);
        float f = parcelOooOOO.readFloat();
        parcelOooOOO.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final Bundle zzi() {
        Parcel parcelOooOOO = OooOOO(OooO(), 16);
        Bundle bundle = (Bundle) AbstractC2218x2.OooO00o(parcelOooOOO, Bundle.CREATOR);
        parcelOooOOO.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final zzeb zzj() {
        Parcel parcelOooOOO = OooOOO(OooO(), 11);
        zzeb zzebVarZzb = zzea.zzb(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final InterfaceC1523e9 zzk() {
        Parcel parcelOooOOO = OooOOO(OooO(), 12);
        InterfaceC1523e9 interfaceC1523e9O000O0O0 = AbstractBinderC1487d9.o000O0O0(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return interfaceC1523e9O000O0O0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final InterfaceC1707j9 zzl() {
        Parcel parcelOooOOO = OooOOO(OooO(), 5);
        InterfaceC1707j9 interfaceC1707j9O000O0O0 = BinderC2298z8.o000O0O0(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return interfaceC1707j9O000O0O0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final Oooo0o.OooO0O0 zzm() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0OO(OooOOO(OooO(), 13));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final Oooo0o.OooO0O0 zzn() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0OO(OooOOO(OooO(), 14));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final Oooo0o.OooO0O0 zzo() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0OO(OooOOO(OooO(), 15));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final String zzp() {
        Parcel parcelOooOOO = OooOOO(OooO(), 7);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final String zzq() {
        Parcel parcelOooOOO = OooOOO(OooO(), 4);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final String zzr() {
        Parcel parcelOooOOO = OooOOO(OooO(), 6);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final String zzs() {
        Parcel parcelOooOOO = OooOOO(OooO(), 2);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final String zzt() {
        Parcel parcelOooOOO = OooOOO(OooO(), 10);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final String zzu() {
        Parcel parcelOooOOO = OooOOO(OooO(), 9);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final List zzv() {
        Parcel parcelOooOOO = OooOOO(OooO(), 3);
        ArrayList arrayList = parcelOooOOO.readArrayList(AbstractC2218x2.f25497OooO00o);
        parcelOooOOO.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final void zzx() {
        o000OO0O(OooO(), 19);
    }
}
