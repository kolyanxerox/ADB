package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.tika.metadata.Office;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: com.google.android.gms.internal.ads.qf */
/* loaded from: classes2.dex */
public final class C1972qf implements NativeMediationAdRequest {

    /* renamed from: OooO, reason: collision with root package name */
    public final boolean f23582OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Date f23583OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f23584OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final HashSet f23585OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f23586OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f23587OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Location f23588OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final C1414b9 f23589OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f23590OooO0oo = new ArrayList();

    /* renamed from: OooOO0, reason: collision with root package name */
    public final HashMap f23591OooOO0 = new HashMap();

    public C1972qf(Date date, int i, HashSet hashSet, Location location, boolean z, int i2, C1414b9 c1414b9, ArrayList arrayList, boolean z2) {
        this.f23583OooO00o = date;
        this.f23584OooO0O0 = i;
        this.f23585OooO0OO = hashSet;
        this.f23588OooO0o0 = location;
        this.f23586OooO0Oo = z;
        this.f23587OooO0o = i2;
        this.f23589OooO0oO = c1414b9;
        this.f23582OooO = z2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                String str = (String) obj;
                if (str.startsWith(Office.USER_DEFINED_METADATA_NAME_PREFIX)) {
                    String[] strArrSplit = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, 3);
                    if (strArrSplit.length == 3) {
                        if (C3401a.f9920g.equals(strArrSplit[2])) {
                            this.f23591OooOO0.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.f23591OooOO0.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f23590OooO0oo.add(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return zzex.zzf().zza();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Date getBirthday() {
        return this.f23583OooO00o;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int getGender() {
        return this.f23584OooO0O0;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set getKeywords() {
        return this.f23585OooO0OO;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f23588OooO0o0;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        C1414b9 c1414b9 = this.f23589OooO0oO;
        if (c1414b9 == null) {
            return builder.build();
        }
        int i = c1414b9.zza;
        if (i == 2) {
            builder.setAdChoicesPlacement(c1414b9.zze);
        } else {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(c1414b9.zzg);
                    builder.setMediaAspectRatio(c1414b9.zzh);
                }
            }
            zzga zzgaVar = c1414b9.zzf;
            if (zzgaVar != null) {
                builder.setVideoOptions(new VideoOptions(zzgaVar));
            }
            builder.setAdChoicesPlacement(c1414b9.zze);
        }
        builder.setReturnUrlsForImageAssets(c1414b9.zzb);
        builder.setImageOrientation(c1414b9.zzc);
        builder.setRequestMultipleImages(c1414b9.zzd);
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return C1414b9.OooO0o0(this.f23589OooO0oO);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzex.zzf().zzy();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isDesignedForFamilies() {
        return this.f23582OooO;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f23586OooO0Oo;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.f23590OooO0oo.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f23587OooO0o;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zza() {
        return this.f23591OooOO0;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
        return this.f23590OooO0oo.contains("3");
    }
}
