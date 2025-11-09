package com.google.android.gms.ads.nonagon.signalgeneration;

import Oooo0OO.oo000o;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.AbstractC1817m8;
import com.google.android.gms.internal.ads.k20;
import com.ironsource.mediationsdk.metadata.C3401a;

/* loaded from: classes2.dex */
public final class zzp extends QueryInfoGenerationCallback {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final zzo f16612OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final k20 f16613OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f16614OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f16615OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final Boolean f16616OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f16617OooO0o0;

    public zzp(zzo zzoVar, boolean z, int i, @Nullable Boolean bool, k20 k20Var) {
        this.f16612OooO00o = zzoVar;
        this.f16614OooO0OO = z;
        this.f16615OooO0Oo = i;
        this.f16616OooO0o = bool;
        this.f16613OooO0O0 = k20Var;
        ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
        this.f16617OooO0o0 = System.currentTimeMillis();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", C3401a.f9920g);
        ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f16617OooO0o0));
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(this.f16615OooO0Oo));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f16616OooO0o));
        boolean z = this.f16614OooO0OO;
        zzaa.zzd(this.f16613OooO0O0, null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z ? "0" : "1"));
        ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
        this.f16612OooO00o.OooO00o(z, new zzq(null, str, ((Long) AbstractC1817m8.f21133OooO0o.OooOOO()).longValue() + System.currentTimeMillis(), this.f16615OooO0Oo));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", C3401a.f9920g);
        ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f16617OooO0o0));
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(this.f16615OooO0Oo));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f16616OooO0o));
        boolean z = this.f16614OooO0OO;
        zzaa.zzd(this.f16613OooO0O0, null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z ? "0" : "1"));
        ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
        this.f16612OooO00o.OooO00o(z, new zzq(queryInfo, "", ((Long) AbstractC1817m8.f21133OooO0o.OooOOO()).longValue() + System.currentTimeMillis(), this.f16615OooO0Oo));
    }
}
