package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzga;

/* renamed from: com.google.android.gms.internal.ads.b9 */
/* loaded from: classes2.dex */
public final class C1414b9 extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1414b9> CREATOR = new o00OO000(23);
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;

    @Nullable
    public final zzga zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    public C1414b9(int i, boolean z, int i2, boolean z2, int i3, zzga zzgaVar, boolean z3, int i4, int i5, boolean z4, int i6) {
        this.zza = i;
        this.zzb = z;
        this.zzc = i2;
        this.zzd = z2;
        this.zze = i3;
        this.zzf = zzgaVar;
        this.zzg = z3;
        this.zzh = i4;
        this.zzj = z4;
        this.zzi = i5;
        this.zzk = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.nativead.NativeAdOptions OooO0o0(com.google.android.gms.internal.ads.C1414b9 r5) {
        /*
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = new com.google.android.gms.ads.nativead.NativeAdOptions$Builder
            r0.<init>()
            if (r5 != 0) goto Lc
            com.google.android.gms.ads.nativead.NativeAdOptions r5 = r0.build()
            return r5
        Lc:
            int r1 = r5.zza
            r2 = 2
            if (r1 == r2) goto L45
            r3 = 3
            if (r1 == r3) goto L39
            r4 = 4
            if (r1 == r4) goto L18
            goto L4a
        L18:
            boolean r1 = r5.zzg
            r0.setRequestCustomMuteThisAd(r1)
            int r1 = r5.zzh
            r0.setMediaAspectRatio(r1)
            int r1 = r5.zzi
            boolean r4 = r5.zzj
            r0.enableCustomClickGestureDirection(r1, r4)
            int r1 = r5.zzk
            r4 = 1
            if (r1 != 0) goto L30
        L2e:
            r2 = r4
            goto L36
        L30:
            if (r1 != r2) goto L34
            r2 = r3
            goto L36
        L34:
            if (r1 != r4) goto L2e
        L36:
            r0.zzi(r2)
        L39:
            com.google.android.gms.ads.internal.client.zzga r1 = r5.zzf
            if (r1 == 0) goto L45
            com.google.android.gms.ads.VideoOptions r2 = new com.google.android.gms.ads.VideoOptions
            r2.<init>(r1)
            r0.setVideoOptions(r2)
        L45:
            int r1 = r5.zze
            r0.setAdChoicesPlacement(r1)
        L4a:
            boolean r1 = r5.zzb
            r0.setReturnUrlsForImageAssets(r1)
            boolean r5 = r5.zzd
            r0.setRequestMultipleImages(r5)
            com.google.android.gms.ads.nativead.NativeAdOptions r5 = r0.build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1414b9.OooO0o0(com.google.android.gms.internal.ads.b9):com.google.android.gms.ads.nativead.NativeAdOptions");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        boolean z = this.zzb;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        int i3 = this.zzc;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i3);
        boolean z2 = this.zzd;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 4, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i4 = this.zze;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 5, 4);
        parcel.writeInt(i4);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 6, this.zzf, i);
        boolean z3 = this.zzg;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 7, 4);
        parcel.writeInt(z3 ? 1 : 0);
        int i5 = this.zzh;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 8, 4);
        parcel.writeInt(i5);
        int i6 = this.zzi;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 9, 4);
        parcel.writeInt(i6);
        boolean z4 = this.zzj;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 10, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i7 = this.zzk;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 11, 4);
        parcel.writeInt(i7);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public C1414b9(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzga(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }
}
