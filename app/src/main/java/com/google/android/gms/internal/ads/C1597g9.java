package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;

/* renamed from: com.google.android.gms.internal.ads.g9 */
/* loaded from: classes2.dex */
public final class C1597g9 extends AbstractC2144v2 implements InterfaceC1634h9 {
    public C1597g9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final float zze() {
        Parcel parcelOooOOO = OooOOO(OooO(), 2);
        float f = parcelOooOOO.readFloat();
        parcelOooOOO.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final float zzf() {
        Parcel parcelOooOOO = OooOOO(OooO(), 6);
        float f = parcelOooOOO.readFloat();
        parcelOooOOO.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final float zzg() {
        Parcel parcelOooOOO = OooOOO(OooO(), 5);
        float f = parcelOooOOO.readFloat();
        parcelOooOOO.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final zzeb zzh() {
        Parcel parcelOooOOO = OooOOO(OooO(), 7);
        zzeb zzebVarZzb = zzea.zzb(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final Oooo0o.OooO0O0 zzi() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0OO(OooOOO(OooO(), 4));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final void zzj(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final boolean zzk() {
        Parcel parcelOooOOO = OooOOO(OooO(), 10);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1634h9
    public final boolean zzl() {
        Parcel parcelOooOOO = OooOOO(OooO(), 8);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }
}
