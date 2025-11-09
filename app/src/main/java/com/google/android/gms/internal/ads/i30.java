package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.C3912zo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class i30 implements InterfaceC2135uu, InterfaceC2173vv, InterfaceC1729jv {

    /* renamed from: OooOo, reason: collision with root package name */
    public final String f19917OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final p30 f19918OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final String f19919OooOo0o;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public BinderC1913ou f19922OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public zze f19924OooOoo0;

    /* renamed from: Oooo0, reason: collision with root package name */
    public boolean f19927Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public JSONObject f19928Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public JSONObject f19929Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public boolean f19930Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f19931Oooo0O0;

    /* renamed from: OooOoo, reason: collision with root package name */
    public String f19923OooOoo = "";

    /* renamed from: OooOooO, reason: collision with root package name */
    public String f19925OooOooO = "";

    /* renamed from: OooOooo, reason: collision with root package name */
    public String f19926OooOooo = "";

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f19921OooOoO0 = 0;

    /* renamed from: OooOoO, reason: collision with root package name */
    public h30 f19920OooOoO = h30.f19530OooOo0O;

    public i30(p30 p30Var, vd0 vd0Var, String str) {
        this.f19918OooOo0O = p30Var;
        this.f19917OooOo = str;
        this.f19919OooOo0o = vd0Var.f24955OooO0o;
    }

    public static JSONObject OooO0O0(zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : OooO0O0(zzeVar2));
        return jSONObject;
    }

    public final JSONObject OooO00o() throws JSONException {
        JSONObject jSONObjectOooO0OO;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f19920OooOoO);
        jSONObject.put("format", kd0.OooO00o(this.f19921OooOoO0));
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoO)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f19930Oooo00o);
            if (this.f19930Oooo00o) {
                jSONObject.put("shown", this.f19927Oooo0);
            }
        }
        BinderC1913ou binderC1913ou = this.f19922OooOoOO;
        if (binderC1913ou != null) {
            jSONObjectOooO0OO = OooO0OO(binderC1913ou);
        } else {
            zze zzeVar = this.f19924OooOoo0;
            JSONObject jSONObjectOooO0OO2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                BinderC1913ou binderC1913ou2 = (BinderC1913ou) iBinder;
                jSONObjectOooO0OO2 = OooO0OO(binderC1913ou2);
                if (binderC1913ou2.f23120OooOoO.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(OooO0O0(this.f19924OooOoo0));
                    jSONObjectOooO0OO2.put("errors", jSONArray);
                }
            }
            jSONObjectOooO0OO = jSONObjectOooO0OO2;
        }
        jSONObject.put("responseInfo", jSONObjectOooO0OO);
        return jSONObject;
    }

    public final JSONObject OooO0OO(BinderC1913ou binderC1913ou) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", binderC1913ou.f23118OooOo0O);
        jSONObject.put("responseSecsSinceEpoch", binderC1913ou.f23122OooOoOO);
        jSONObject.put("responseId", binderC1913ou.f23119OooOo0o);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOoo)).booleanValue()) {
            String str = binderC1913ou.f23124OooOoo0;
            if (!TextUtils.isEmpty(str)) {
                zzo.zze("Bidding data: ".concat(String.valueOf(str)));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.f19923OooOoo)) {
            jSONObject.put("adRequestUrl", this.f19923OooOoo);
        }
        if (!TextUtils.isEmpty(this.f19925OooOooO)) {
            jSONObject.put("postBody", this.f19925OooOooO);
        }
        if (!TextUtils.isEmpty(this.f19926OooOooo)) {
            jSONObject.put("adResponseBody", this.f19926OooOooo);
        }
        Object obj = this.f19928Oooo000;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f19929Oooo00O;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOo0O)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f19931Oooo0O0);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzw zzwVar : binderC1913ou.f23120OooOoO) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzwVar.zza);
            jSONObject2.put("latencyMillis", zzwVar.zzb);
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOo00)).booleanValue()) {
                jSONObject2.put("credentials", zzbc.zzb().zzi(zzwVar.zzd));
            }
            zze zzeVar = zzwVar.zzc;
            jSONObject2.put(C3912zo.a.f13038g, zzeVar == null ? null : OooO0O0(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1729jv
    public final void Oooo0oO(AbstractC1397at abstractC1397at) {
        p30 p30Var = this.f19918OooOo0O;
        if (p30Var.OooO0o()) {
            this.f19922OooOoOO = abstractC1397at.f17103OooO0o;
            this.f19920OooOoO = h30.f19531OooOo0o;
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoO)).booleanValue()) {
                p30Var.OooO0O0(this.f19919OooOo0o, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void OoooO0(C2197wi c2197wi) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoO)).booleanValue()) {
            return;
        }
        p30 p30Var = this.f19918OooOo0O;
        if (p30Var.OooO0o()) {
            p30Var.OooO0O0(this.f19919OooOo0o, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2135uu
    public final void o0OOO0o(zze zzeVar) {
        p30 p30Var = this.f19918OooOo0O;
        if (p30Var.OooO0o()) {
            this.f19920OooOoO = h30.f19529OooOo;
            this.f19924OooOoo0 = zzeVar;
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoO)).booleanValue()) {
                p30Var.OooO0O0(this.f19919OooOo0o, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void oo000o(rd0 rd0Var) {
        if (this.f19918OooOo0O.OooO0o()) {
            if (!((List) rd0Var.f23849OooO0O0.f24098OooOo0o).isEmpty()) {
                this.f19921OooOoO0 = ((kd0) ((List) rd0Var.f23849OooO0O0.f24098OooOo0o).get(0)).f20488OooO0O0;
            }
            if (!TextUtils.isEmpty(((md0) rd0Var.f23849OooO0O0.f24096OooOo).OooOO0o)) {
                this.f19923OooOoo = ((md0) rd0Var.f23849OooO0O0.f24096OooOo).OooOO0o;
            }
            if (!TextUtils.isEmpty(((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21215OooOOO0)) {
                this.f19925OooOooO = ((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21215OooOOO0;
            }
            if (((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21217OooOOOo.length() > 0) {
                this.f19929Oooo00O = ((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21217OooOOOo;
            }
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOo0O)).booleanValue()) {
                if (this.f19918OooOo0O.f23210OooOo0o >= ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOo0o)).longValue()) {
                    this.f19931Oooo0O0 = true;
                    return;
                }
                if (!TextUtils.isEmpty(((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21214OooOOO)) {
                    this.f19926OooOooo = ((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21214OooOOO;
                }
                if (((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21216OooOOOO.length() > 0) {
                    this.f19928Oooo000 = ((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21216OooOOOO;
                }
                p30 p30Var = this.f19918OooOo0O;
                JSONObject jSONObject = this.f19928Oooo000;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f19926OooOooo)) {
                    length += this.f19926OooOooo.length();
                }
                long j = length;
                synchronized (p30Var) {
                    p30Var.f23210OooOo0o += j;
                }
            }
        }
    }
}
