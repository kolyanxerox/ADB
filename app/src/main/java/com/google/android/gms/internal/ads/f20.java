package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.ironsource.mediationsdk.metadata.C3401a;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class f20 {

    /* renamed from: OooO00o */
    public final ConcurrentHashMap f18766OooO00o;

    /* renamed from: OooO0O0 */
    public final C2052sl f18767OooO0O0;

    /* renamed from: OooO0OO */
    public final Bundle f18768OooO0OO = new Bundle();

    public f20(Context context, k20 k20Var, C2052sl c2052sl, vd0 vd0Var, String str, String str2, zzk zzkVar) {
        ActivityManager.MemoryInfo memoryInfoZzc;
        k20Var.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(k20Var.f20416OooO00o);
        this.f18766OooO00o = concurrentHashMap;
        this.f18767OooO0O0 = c2052sl;
        concurrentHashMap.put("ad_format", str2.toUpperCase(Locale.ROOT));
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo00)).booleanValue()) {
            int iZzp = zzkVar.zzp();
            int i = iZzp - 1;
            if (iZzp == 0) {
                throw null;
            }
            concurrentHashMap.put("asv", i != 0 ? i != 1 ? "na" : CommonGetHeaderBiddingToken.HB_TOKEN_VERSION : "1");
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            OooO00o("rt_f", String.valueOf(runtime.freeMemory()));
            OooO00o("rt_m", String.valueOf(runtime.maxMemory()));
            OooO00o("rt_t", String.valueOf(runtime.totalMemory()));
            OooO00o("wv_c", String.valueOf(zzv.zzp().f23636OooOO0.get()));
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17850o000ooOO)).booleanValue() && (memoryInfoZzc = zzf.zzc(context)) != null) {
                OooO00o("mem_avl", String.valueOf(memoryInfoZzc.availMem));
                OooO00o("mem_tt", String.valueOf(memoryInfoZzc.totalMem));
                OooO00o("low_m", true != memoryInfoZzc.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00o0O)).booleanValue()) {
            int iZzf = zzaa.zzf(vd0Var) - 1;
            if (iZzf == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (iZzf == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (iZzf == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (iZzf != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", C3401a.f9920g);
            zzm zzmVar = vd0Var.f24954OooO0Oo;
            OooO00o("ragent", zzmVar.zzp);
            OooO00o("rtype", zzaa.zzb(zzaa.zzc(zzmVar)));
        }
    }

    public final void OooO00o(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f18766OooO00o.put(str, str2);
    }

    public final void OooO0O0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            OooO00o("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            OooO00o("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
