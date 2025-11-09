package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;
import com.ironsource.C3034d9;
import com.ironsource.C3824x4;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c20 implements InterfaceC2173vv, InterfaceC1656hv, InterfaceC2135uu, InterfaceC1584fx {

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f17656OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final f20 f17657OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final k20 f17658OooOo0o;

    public c20(f20 f20Var, k20 k20Var, int i) {
        this.f17657OooOo0O = f20Var;
        this.f17658OooOo0o = k20Var;
        this.f17656OooOo = i;
    }

    public final void OooO00o(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.f17657OooOo0O.OooO00o(str, String.valueOf(j));
            }
        }
    }

    public final void OooO0O0(Bundle bundle, gn0 gn0Var) {
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue() || bundle == null) {
            return;
        }
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        bundle.putLong("public-api-callback", System.currentTimeMillis());
        boolean zContainsKey = bundle.containsKey("ls");
        f20 f20Var = this.f17657OooOo0O;
        if (zContainsKey) {
            f20Var.OooO00o("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int i = gn0Var.f19390OooOoO0;
        for (int i2 = 0; i2 < i; i2++) {
            e20 e20Var = (e20) gn0Var.get(i2);
            long j = bundle.getLong(AbstractC2183w4.OooO0Oo(e20Var.f18461OooO0O0), -1L);
            long j2 = bundle.getLong(AbstractC2183w4.OooO0Oo(e20Var.f18462OooO0OO), -1L);
            if (j > 0 && j2 > 0) {
                f20Var.OooO00o(e20Var.f18460OooO00o, String.valueOf(j2 - j));
            }
        }
        OooO00o(bundle.getBundle("client_sig_latency_key"));
        OooO00o(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0OoO)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                f20Var.OooO00o("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                f20Var.OooO00o("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void OoooO0(C2197wi c2197wi) {
        this.f17657OooOo0O.OooO0O0(c2197wi.zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1656hv
    public final void OoooOOO() {
        f20 f20Var = this.f17657OooOo0O;
        f20Var.f18766OooO00o.put("action", C3034d9.h.f8127r);
        OooO0O0(f20Var.f18768OooO0OO, e20.f18459OooO0o0);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0O0)).booleanValue();
        ConcurrentHashMap concurrentHashMap = f20Var.f18766OooO00o;
        if (zBooleanValue) {
            concurrentHashMap.put("mafe", true != WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO) ? "0" : "1");
        }
        this.f17658OooOo0o.OooO0O0(concurrentHashMap, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2135uu
    public final void o0OOO0o(zze zzeVar) {
        f20 f20Var = this.f17657OooOo0O;
        f20Var.f18766OooO00o.put("action", "ftl");
        f20Var.OooO00o("ftl", String.valueOf(zzeVar.zza));
        f20Var.OooO00o("ed", zzeVar.zzc);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooO)).booleanValue()) {
            f20Var.OooO00o("emsg", zzeVar.zzb);
        }
        this.f17658OooOo0o.OooO0O0(f20Var.f18766OooO00o, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void oo000o(rd0 rd0Var) {
        f20 f20Var = this.f17657OooOo0O;
        f20Var.getClass();
        boolean zIsEmpty = ((List) rd0Var.f23849OooO0O0.f24098OooOo0o).isEmpty();
        C2051sk c2051sk = rd0Var.f23849OooO0O0;
        if (!zIsEmpty) {
            kd0 kd0Var = (kd0) ((List) c2051sk.f24098OooOo0o).get(0);
            f20Var.OooO00o("ad_format", kd0.OooO00o(kd0Var.f20488OooO0O0));
            if (kd0Var.f20488OooO0O0 == 6) {
                f20Var.f18766OooO00o.put("as", true != f20Var.f18767OooO0O0.f24108OooO0oO ? "0" : "1");
            }
        }
        f20Var.OooO00o("gqi", ((md0) c2051sk.f24096OooOo).f21205OooO0O0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1584fx
    public final void zze(zzbk zzbkVar) {
        String str;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00o0O)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0OoO)).booleanValue();
            f20 f20Var = this.f17657OooOo0O;
            if (zBooleanValue) {
                f20Var.f18766OooO00o.put("sgw", String.valueOf(this.f17656OooOo));
            }
            k20 k20Var = this.f17658OooOo0o;
            if (zzbkVar == null) {
                f20Var.f18766OooO00o.put("action", "sgs");
                ConcurrentHashMap concurrentHashMap = f20Var.f18766OooO00o;
                concurrentHashMap.put("request_id", C3824x4.f12571f);
                k20Var.OooO0O0(concurrentHashMap, false);
                return;
            }
            C2197wi c2197wi = zzbkVar.zzd;
            Bundle bundle = zzbkVar.zze;
            if (c2197wi != null) {
                OooO0O0(c2197wi.zzm, e20.f18458OooO0Oo);
            } else if (bundle != null && !bundle.isEmpty()) {
                OooO0O0(bundle, e20.f18458OooO0Oo);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(zzbkVar.zzc) ? zzbkVar.zzb : zzbkVar.zzc);
                f20Var.f18766OooO00o.put("action", "sgs");
                ConcurrentHashMap concurrentHashMap2 = f20Var.f18766OooO00o;
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOo0Oo)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e) {
                        zzo.zzh("Error retrieving JSONObject from the requestJson, ", e);
                    }
                } else {
                    str = "na";
                }
                concurrentHashMap2.put("tpc", str);
                C2197wi c2197wi2 = zzbkVar.zzd;
                if (c2197wi2 != null) {
                    f20Var.OooO0O0(c2197wi2.zza);
                }
                k20Var.OooO0O0(concurrentHashMap2, false);
            } catch (JSONException unused) {
                f20Var.f18766OooO00o.put("action", "sgf");
                ConcurrentHashMap concurrentHashMap3 = f20Var.f18766OooO00o;
                concurrentHashMap3.put("sgf_reason", "request_invalid");
                k20Var.OooO0O0(concurrentHashMap3, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1584fx
    public final void zzf(String str) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00o0O)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0OoO)).booleanValue();
            f20 f20Var = this.f17657OooOo0O;
            if (zBooleanValue) {
                f20Var.f18766OooO00o.put("sgw", String.valueOf(this.f17656OooOo));
            }
            f20Var.f18766OooO00o.put("action", "sgf");
            f20Var.OooO00o("sgf_reason", str);
            this.f17658OooOo0o.OooO0O0(f20Var.f18766OooO00o, false);
        }
    }
}
