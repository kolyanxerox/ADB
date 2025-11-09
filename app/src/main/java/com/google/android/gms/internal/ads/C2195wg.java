package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;

/* renamed from: com.google.android.gms.internal.ads.wg */
/* loaded from: classes2.dex */
public final class C2195wg extends NativeAd.Image {

    /* renamed from: OooO00o */
    public final InterfaceC1707j9 f25304OooO00o;

    /* renamed from: OooO0O0 */
    public final Drawable f25305OooO0O0;

    /* renamed from: OooO0OO */
    public final Uri f25306OooO0OO;

    /* renamed from: OooO0Oo */
    public final double f25307OooO0Oo;

    /* renamed from: OooO0o */
    public final int f25308OooO0o;

    /* renamed from: OooO0o0 */
    public final int f25309OooO0o0;

    public C2195wg(InterfaceC1707j9 interfaceC1707j9) {
        double dZzb;
        int iZzd;
        Oooo0o.OooO0O0 oooO0O0Zzf;
        this.f25304OooO00o = interfaceC1707j9;
        Uri uriZze = null;
        try {
            oooO0O0Zzf = interfaceC1707j9.zzf();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        Drawable drawable = oooO0O0Zzf != null ? (Drawable) Oooo0o.OooO0OO.o000O0oO(oooO0O0Zzf) : null;
        this.f25305OooO0O0 = drawable;
        try {
            uriZze = this.f25304OooO00o.zze();
        } catch (RemoteException e2) {
            zzo.zzh("", e2);
        }
        this.f25306OooO0OO = uriZze;
        try {
            dZzb = this.f25304OooO00o.zzb();
        } catch (RemoteException e3) {
            zzo.zzh("", e3);
            dZzb = 1.0d;
        }
        this.f25307OooO0Oo = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f25304OooO00o.zzd();
        } catch (RemoteException e4) {
            zzo.zzh("", e4);
            iZzd = -1;
        }
        this.f25309OooO0o0 = iZzd;
        try {
            iZzc = this.f25304OooO00o.zzc();
        } catch (RemoteException e5) {
            zzo.zzh("", e5);
        }
        this.f25308OooO0o = iZzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f25305OooO0O0;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.f25307OooO0Oo;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.f25306OooO0OO;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.f25308OooO0o;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.f25309OooO0o0;
    }
}
