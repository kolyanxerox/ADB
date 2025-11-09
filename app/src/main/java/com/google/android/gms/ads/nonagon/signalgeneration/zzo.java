package com.google.android.gms.ads.nonagon.signalgeneration;

import Oooo0OO.oo000o;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1817m8;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C2163vl;
import com.google.android.gms.internal.ads.cq0;
import com.google.android.gms.internal.ads.k20;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzo {

    /* renamed from: OooO00o */
    public final HashMap f16607OooO00o = new HashMap();

    /* renamed from: OooO0O0 */
    public final HashMap f16608OooO0O0 = new HashMap();

    /* renamed from: OooO0OO */
    public final Context f16609OooO0OO;

    /* renamed from: OooO0Oo */
    public final k20 f16610OooO0Oo;

    /* renamed from: OooO0o0 */
    public final cq0 f16611OooO0o0;

    public zzo(Context context, k20 k20Var, cq0 cq0Var) {
        this.f16609OooO0OO = context;
        this.f16610OooO0Oo = k20Var;
        this.f16611OooO0o0 = cq0Var;
    }

    public final synchronized void OooO00o(final boolean z, zzq zzqVar) {
        try {
            HashMap map = this.f16607OooO00o;
            Boolean boolValueOf = Boolean.valueOf(z);
            zzq zzqVar2 = (zzq) map.get(boolValueOf);
            if (zzqVar2 == null || zzqVar2.zze() || zzqVar2.zzb() == null || zzqVar.zzb() != null) {
                this.f16607OooO00o.put(boolValueOf, zzqVar);
            }
            long jLongValue = (zzqVar.zzb() != null ? (Long) AbstractC1817m8.f21132OooO0Oo.OooOOO() : (Long) AbstractC1817m8.f21134OooO0o0.OooOOO()).longValue();
            final boolean z2 = zzqVar.zzb() == null;
            AbstractC2200wl.f25324OooO0Oo.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.zza.OooO0Oo(z, z2);
                }
            }, jLongValue, TimeUnit.SECONDS);
            List list = (List) this.f16608OooO0O0.get(boolValueOf);
            this.f16608OooO0O0.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    OooO0OO(zzqVar, (Pair) it.next(), false);
                }
            }
        } finally {
        }
    }

    public final void OooO0O0(final boolean z) {
        HashMap map = this.f16608OooO0O0;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        ((C2163vl) this.f16611OooO0o0).submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.OooO0Oo(z, false);
            }
        });
    }

    public final void OooO0OO(zzq zzqVar, Pair pair, boolean z) {
        zzqVar.zzd();
        QueryInfo queryInfoZzb = zzqVar.zzb();
        if (queryInfoZzb != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(queryInfoZzb);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzqVar.zzc());
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", C3401a.f9920g);
        ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
        zzaa.zzd(this.f16610OooO0Oo, null, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z)), new Pair("sgpc_rs", Boolean.toString(zzqVar.zzb() != null)));
    }

    public final synchronized void OooO0Oo(boolean z, boolean z2) throws Throwable {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z);
                HashMap map = this.f16607OooO00o;
                Boolean boolValueOf = Boolean.valueOf(z);
                zzq zzqVar = (zzq) map.get(boolValueOf);
                int iZza = 0;
                if (z2 && zzqVar != null) {
                    try {
                        iZza = zzqVar.zza() + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                int i = iZza;
                zzq zzqVar2 = (zzq) this.f16607OooO00o.get(boolValueOf);
                final zzp zzpVar = new zzp(this, z, i, zzqVar2 == null ? null : Boolean.valueOf(zzqVar2.zzf()), this.f16610OooO0Oo);
                final AdRequest adRequestBuild = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOOOo)).booleanValue()) {
                    ((C2163vl) this.f16611OooO0o0).submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzo zzoVar = this.zza;
                            QueryInfo.generate(zzoVar.f16609OooO0OO, AdFormat.BANNER, adRequestBuild, zzpVar);
                            return Boolean.TRUE;
                        }
                    });
                } else {
                    QueryInfo.generate(this.f16609OooO0OO, AdFormat.BANNER, adRequestBuild, zzpVar);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void zzb() {
        OooO0O0(true);
        OooO0O0(false);
    }

    public final synchronized void zzg(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(System.currentTimeMillis()));
        AbstractC2200wl.f25325OooO0o.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // java.lang.Runnable
            public final void run() {
                zzo zzoVar = this.zza;
                Object obj2 = obj;
                Pair pair2 = pair;
                zzoVar.getClass();
                boolean zAcceptThirdPartyCookies = false;
                if (obj2 instanceof WebView) {
                    CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzv.zzr().zza(zzoVar.f16609OooO0OO);
                    if (cookieManagerZza != null) {
                        zAcceptThirdPartyCookies = cookieManagerZza.acceptThirdPartyCookies((WebView) obj2);
                    }
                }
                HashMap map = zzoVar.f16607OooO00o;
                Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
                zzq zzqVar = (zzq) map.get(boolValueOf);
                if (zzqVar != null && !zzqVar.zze()) {
                    zzoVar.OooO0OO(zzqVar, pair2, true);
                    return;
                }
                HashMap map2 = zzoVar.f16608OooO0O0;
                List arrayList = (List) map2.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map2.put(boolValueOf, arrayList);
                }
                arrayList.add(pair2);
            }
        });
    }
}
