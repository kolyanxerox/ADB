package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* renamed from: com.google.android.gms.internal.ads.zc */
/* loaded from: classes2.dex */
public final class C2302zc implements AdapterStatus {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AdapterStatus.State f26144OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f26145OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f26146OooO0OO;

    public C2302zc(AdapterStatus.State state, String str, int i) {
        this.f26144OooO00o = state;
        this.f26145OooO0O0 = str;
        this.f26146OooO0OO = i;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.f26145OooO0O0;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.f26144OooO00o;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.f26146OooO0OO;
    }
}
