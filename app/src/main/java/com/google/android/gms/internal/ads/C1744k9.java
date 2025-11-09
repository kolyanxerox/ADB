package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.k9 */
/* loaded from: classes2.dex */
public final class C1744k9 extends NativeAd.Image {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC1707j9 f20459OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Drawable f20460OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Uri f20461OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final double f20462OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f20463OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f20464OooO0o0;

    public C1744k9(InterfaceC1707j9 interfaceC1707j9) {
        double dZzb;
        int iZzd;
        Oooo0o.OooO0O0 oooO0O0Zzf;
        this.f20459OooO00o = interfaceC1707j9;
        Uri uriZze = null;
        try {
            oooO0O0Zzf = interfaceC1707j9.zzf();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        Drawable drawable = oooO0O0Zzf != null ? (Drawable) Oooo0o.OooO0OO.o000O0oO(oooO0O0Zzf) : null;
        this.f20460OooO0O0 = drawable;
        try {
            uriZze = this.f20459OooO00o.zze();
        } catch (RemoteException e2) {
            zzo.zzh("", e2);
        }
        this.f20461OooO0OO = uriZze;
        try {
            dZzb = this.f20459OooO00o.zzb();
        } catch (RemoteException e3) {
            zzo.zzh("", e3);
            dZzb = 1.0d;
        }
        this.f20462OooO0Oo = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f20459OooO00o.zzd();
        } catch (RemoteException e4) {
            zzo.zzh("", e4);
            iZzd = -1;
        }
        this.f20464OooO0o0 = iZzd;
        try {
            iZzc = this.f20459OooO00o.zzc();
        } catch (RemoteException e5) {
            zzo.zzh("", e5);
        }
        this.f20463OooO0o = iZzc;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f20460OooO0O0;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.f20462OooO0Oo;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.f20461OooO0OO;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.f20463OooO0o;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.f20464OooO0o0;
    }
}
