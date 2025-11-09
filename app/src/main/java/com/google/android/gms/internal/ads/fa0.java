package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* loaded from: classes2.dex */
public final class fa0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f18902OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Bundle f18903OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f18904OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f18905OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final String f18906OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final zzj f18907OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final C2134ut f18908OooO0oO;

    public fa0(Context context, Bundle bundle, String str, String str2, zzj zzjVar, String str3, C2134ut c2134ut) {
        this.f18902OooO00o = context;
        this.f18903OooO0O0 = bundle;
        this.f18904OooO0OO = str;
        this.f18905OooO0Oo = str2;
        this.f18907OooO0o0 = zzjVar;
        this.f18906OooO0o = str3;
        this.f18908OooO0oO = c2134ut;
    }

    public final void OooO00o(Bundle bundle) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOoO)).booleanValue()) {
            try {
                zzv.zzq();
                bundle.putString("_app_id", zzs.zzq(this.f18902OooO00o));
            } catch (RemoteException | RuntimeException e) {
                zzv.zzp().OooO0oo("AppStatsSignal_AppId", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        C1581fu c1581fu = (C1581fu) obj;
        c1581fu.f19126OooO0O0.putBundle("quality_signals", this.f18903OooO0O0);
        OooO00o(c1581fu.f19126OooO0O0);
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void zzb(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19125OooO00o;
        bundle.putBundle("quality_signals", this.f18903OooO0O0);
        bundle.putString("seq_num", this.f18904OooO0OO);
        if (!this.f18907OooO0o0.zzN()) {
            bundle.putString("session_id", this.f18905OooO0Oo);
        }
        bundle.putBoolean("client_purpose_one", !r0.zzN());
        OooO00o(bundle);
        String str = this.f18906OooO0o;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            C2134ut c2134ut = this.f18908OooO0oO;
            Long l = (Long) c2134ut.f24786OooO0Oo.get(str);
            bundle2.putLong("dload", l == null ? -1L : l.longValue());
            Integer num = (Integer) c2134ut.f24784OooO0O0.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo0oo)).booleanValue() || zzv.zzp().f23637OooOO0O.get() <= 0) {
            return;
        }
        bundle.putInt("nrwv", zzv.zzp().f23637OooOO0O.get());
    }
}
