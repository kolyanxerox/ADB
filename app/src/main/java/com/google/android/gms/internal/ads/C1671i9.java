package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.i9 */
/* loaded from: classes2.dex */
public final class C1671i9 extends AbstractC2144v2 implements InterfaceC1707j9 {
    public C1671i9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1707j9
    public final double zzb() {
        Parcel parcelOooOOO = OooOOO(OooO(), 3);
        double d = parcelOooOOO.readDouble();
        parcelOooOOO.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1707j9
    public final int zzc() {
        Parcel parcelOooOOO = OooOOO(OooO(), 5);
        int i = parcelOooOOO.readInt();
        parcelOooOOO.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1707j9
    public final int zzd() {
        Parcel parcelOooOOO = OooOOO(OooO(), 4);
        int i = parcelOooOOO.readInt();
        parcelOooOOO.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1707j9
    public final Uri zze() {
        Parcel parcelOooOOO = OooOOO(OooO(), 2);
        Uri uri = (Uri) AbstractC2218x2.OooO00o(parcelOooOOO, Uri.CREATOR);
        parcelOooOOO.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1707j9
    public final Oooo0o.OooO0O0 zzf() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0OO(OooOOO(OooO(), 1));
    }
}
