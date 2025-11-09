package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class gb0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f19297OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f19298OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f19299OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f19300OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Long f19301OooO0o0;

    public gb0(String str, String str2, String str3, String str4, Long l) {
        this.f19297OooO00o = str;
        this.f19298OooO0O0 = str2;
        this.f19299OooO0OO = str3;
        this.f19300OooO0Oo = str4;
        this.f19301OooO0o0 = l;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        af0.OooOooo("fbs_aeid", ((C1581fu) obj).f19126OooO0O0, this.f19299OooO0OO);
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19125OooO00o;
        af0.OooOooo("gmp_app_id", bundle, this.f19297OooO00o);
        af0.OooOooo("fbs_aiid", bundle, this.f19298OooO0O0);
        af0.OooOooo("fbs_aeid", bundle, this.f19299OooO0OO);
        af0.OooOooo("apm_id_origin", bundle, this.f19300OooO0Oo);
        Long l = this.f19301OooO0o0;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
