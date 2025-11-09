package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jf */
/* loaded from: classes2.dex */
public final class C1713jf implements MediationAdRequest {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Date f20296OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f20297OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final HashSet f20298OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f20299OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f20300OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Location f20301OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f20302OooO0oO;

    public C1713jf(Date date, int i, HashSet hashSet, Location location, boolean z, int i2, boolean z2) {
        this.f20296OooO00o = date;
        this.f20297OooO0O0 = i;
        this.f20298OooO0OO = hashSet;
        this.f20301OooO0o0 = location;
        this.f20299OooO0Oo = z;
        this.f20300OooO0o = i2;
        this.f20302OooO0oO = z2;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Date getBirthday() {
        return this.f20296OooO00o;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int getGender() {
        return this.f20297OooO0O0;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set getKeywords() {
        return this.f20298OooO0OO;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f20301OooO0o0;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isDesignedForFamilies() {
        return this.f20302OooO0oO;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f20299OooO0Oo;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f20300OooO0o;
    }
}
