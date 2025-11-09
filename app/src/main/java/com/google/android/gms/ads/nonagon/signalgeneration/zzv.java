package com.google.android.gms.ads.nonagon.signalgeneration;

import Oooo0OO.oo000o;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.f20;
import com.google.android.gms.internal.ads.k20;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzv {

    /* renamed from: OooO, reason: collision with root package name */
    public ConcurrentHashMap f16626OooO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final k20 f16634OooO0oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final ArrayDeque f16631OooO0o = new ArrayDeque();

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayDeque f16633OooO0oO = new ArrayDeque();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f16627OooO00o = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O00Ooo)).intValue();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f16628OooO0O0 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O00o00)).longValue();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f16629OooO0OO = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O00oO0)).booleanValue();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f16630OooO0Oo = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O00o)).booleanValue();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Map f16632OooO0o0 = Collections.synchronizedMap(new zzt(this));

    public zzv(k20 k20Var) {
        this.f16634OooO0oo = k20Var;
    }

    public final synchronized void OooO00o(final f20 f20Var) {
        if (this.f16629OooO0OO) {
            ArrayDeque arrayDeque = this.f16633OooO0oO;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f16631OooO0o;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            AbstractC2200wl.f25321OooO00o.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    zzv zzvVar = this.zza;
                    f20 f20Var2 = f20Var;
                    ArrayDeque arrayDeque3 = arrayDequeClone;
                    ArrayDeque arrayDeque4 = arrayDequeClone2;
                    zzvVar.OooO0O0(f20Var2, arrayDeque3, "to");
                    zzvVar.OooO0O0(f20Var2, arrayDeque4, "of");
                }
            });
        }
    }

    public final void OooO0O0(f20 f20Var, ArrayDeque arrayDeque, String str) throws JSONException {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(f20Var.f18766OooO00o);
            this.f16626OooO = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f16626OooO.put("e_r", str);
            this.f16626OooO.put("e_id", (String) pair2.first);
            if (this.f16630OooO0Oo) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzaa.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.f16626OooO;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.f16626OooO;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f16634OooO0oo.OooO0O0(this.f16626OooO, false);
        }
    }

    public final synchronized void OooO0OO() {
        ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f16632OooO0o0.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((zzu) entry.getValue()).zza.longValue() <= this.f16628OooO0O0) {
                    break;
                }
                this.f16633OooO0oO.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("QueryJsonMap.removeExpiredEntries", e);
        }
    }

    @Nullable
    public final synchronized String zzb(String str, f20 f20Var) {
        zzu zzuVar = (zzu) this.f16632OooO0o0.get(str);
        f20Var.f18766OooO00o.put("request_id", str);
        if (zzuVar == null) {
            f20Var.f18766OooO00o.put("mhit", "false");
            return null;
        }
        f20Var.f18766OooO00o.put("mhit", C3401a.f9920g);
        return zzuVar.zzb;
    }

    public final synchronized void zzd(String str, String str2, f20 f20Var) {
        ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
        this.f16632OooO0o0.put(str, new zzu(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
        OooO0OO();
        OooO00o(f20Var);
    }

    public final synchronized void zzf(String str) {
        this.f16632OooO0o0.remove(str);
    }

    public final synchronized boolean zzg(String str, String str2, int i) {
        zzu zzuVar = (zzu) this.f16632OooO0o0.get(str);
        if (zzuVar == null) {
            return false;
        }
        zzuVar.zzc.add(str2);
        return zzuVar.zzc.size() < i;
    }

    public final synchronized boolean zzh(String str, String str2) {
        zzu zzuVar = (zzu) this.f16632OooO0o0.get(str);
        if (zzuVar != null) {
            if (zzuVar.zzc.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
