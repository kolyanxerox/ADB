package com.google.android.gms.ads;

import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzc {
    public static int zza(AdSize adSize) {
        return adSize.f15892OooO0o;
    }

    public static int zzb(AdSize adSize) {
        return adSize.f15895OooO0oo;
    }

    public static AdSize zzc(int i, int i2, String str) {
        return new AdSize(i, i2, str);
    }

    public static AdSize zzd(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.f15893OooO0o0 = true;
        adSize.f15892OooO0o = i2;
        return adSize;
    }

    public static AdSize zze(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.f15894OooO0oO = true;
        adSize.f15895OooO0oo = i2;
        return adSize;
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.f15891OooO0Oo;
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.f15893OooO0o0;
    }

    public static boolean zzh(AdSize adSize) {
        return adSize.f15894OooO0oO;
    }
}
