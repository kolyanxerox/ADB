package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzn {

    /* renamed from: OooO00o, reason: collision with root package name */
    public Bundle f16102OooO00o = new Bundle();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public List f16103OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f16104OooO0OO = false;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f16105OooO0Oo = -1;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Bundle f16107OooO0o0 = new Bundle();

    /* renamed from: OooO0o, reason: collision with root package name */
    public final Bundle f16106OooO0o = new Bundle();

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f16108OooO0oO = new ArrayList();

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f16109OooO0oo = -1;

    /* renamed from: OooO, reason: collision with root package name */
    public String f16101OooO = null;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList f16110OooOO0 = new ArrayList();

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int f16111OooOO0O = 60000;
    public final int OooOO0o = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();

    /* renamed from: OooOOO0, reason: collision with root package name */
    public long f16112OooOOO0 = 0;

    public final zzm zza() {
        Bundle bundle = this.f16102OooO00o;
        List list = this.f16103OooO0O0;
        boolean z = this.f16104OooO0OO;
        int i = this.f16105OooO0Oo;
        int i2 = this.f16109OooO0oo;
        String str = this.f16101OooO;
        ArrayList arrayList = this.f16110OooOO0;
        ArrayList arrayList2 = this.f16108OooO0oO;
        int i3 = this.f16111OooOO0O;
        long j = this.f16112OooOOO0;
        return new zzm(8, -1L, bundle, -1, list, z, i, false, null, null, null, null, this.f16107OooO0o0, this.f16106OooO0o, arrayList2, null, null, false, null, i2, str, arrayList, i3, null, this.OooOO0o, j);
    }

    public final zzn zzb(Bundle bundle) {
        this.f16102OooO00o = bundle;
        return this;
    }

    public final zzn zzc(int i) {
        this.f16111OooOO0O = i;
        return this;
    }

    public final zzn zzd(boolean z) {
        this.f16104OooO0OO = z;
        return this;
    }

    public final zzn zze(List list) {
        this.f16103OooO0O0 = list;
        return this;
    }

    public final zzn zzf(String str) {
        this.f16101OooO = str;
        return this;
    }

    public final zzn zzg(long j) {
        this.f16112OooOOO0 = j;
        return this;
    }

    public final zzn zzh(int i) {
        this.f16105OooO0Oo = i;
        return this;
    }

    public final zzn zzi(int i) {
        this.f16109OooO0oo = i;
        return this;
    }
}
