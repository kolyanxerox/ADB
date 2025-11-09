package com.google.android.gms.ads.nonagon.signalgeneration;

import Oooo0OO.oo000o;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzq {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final QueryInfo f16618OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f16619OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f16620OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f16621OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f16622OooO0o0 = new AtomicBoolean(false);

    public zzq(@Nullable QueryInfo queryInfo, String str, long j, int i) {
        this.f16618OooO00o = queryInfo;
        this.f16619OooO0O0 = str;
        this.f16620OooO0OO = j;
        this.f16621OooO0Oo = i;
    }

    public final int zza() {
        return this.f16621OooO0Oo;
    }

    @Nullable
    public final QueryInfo zzb() {
        return this.f16618OooO00o;
    }

    public final String zzc() {
        return this.f16619OooO0O0;
    }

    public final void zzd() {
        this.f16622OooO0o0.set(true);
    }

    public final boolean zze() {
        ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
        return this.f16620OooO0OO <= System.currentTimeMillis();
    }

    public final boolean zzf() {
        return this.f16622OooO0o0.get();
    }
}
