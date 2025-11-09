package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.ads.nonagon.signalgeneration.zzo;
import com.google.android.gms.ads.query.QueryInfo;
import com.ironsource.C3912zo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.r7 */
/* loaded from: classes2.dex */
public final class C2001r7 {

    /* renamed from: OooO, reason: collision with root package name */
    public long f23784OooO = 0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ScheduledExecutorService f23785OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final zzo f23786OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final zzf f23787OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final k20 f23788OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public C1964q7 f23789OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public RunnableC1442c1 f23790OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public CustomTabsSession f23791OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public String f23792OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public long f23793OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public JSONArray f23794OooOO0O;
    public Context OooOO0o;

    public C2001r7(ScheduledExecutorService scheduledExecutorService, zzo zzoVar, zzf zzfVar, k20 k20Var) {
        this.f23785OooO00o = scheduledExecutorService;
        this.f23786OooO0O0 = zzoVar;
        this.f23787OooO0OO = zzfVar;
        this.f23788OooO0Oo = k20Var;
    }

    public final JSONObject OooO00o(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put(C3912zo.a.f13038g, str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC1817m8.f21131OooO0OO.OooOOO()).booleanValue() ? ((Long) AbstractC1817m8.f21133OooO0o.OooOOO()).longValue() : 0L);
        OooO0o0(jSONObject);
        if (((Boolean) AbstractC1817m8.f21129OooO00o.OooOOO()).booleanValue()) {
            jSONObject.put("as", this.f23787OooO0OO.zza());
        }
        return jSONObject;
    }

    public final JSONObject OooO0O0(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC1817m8.f21131OooO0OO.OooOOO()).booleanValue() ? ((Long) AbstractC1817m8.f21133OooO0o.OooOOO()).longValue() : 0L);
        OooO0o0(jSONObject);
        if (((Boolean) AbstractC1817m8.f21129OooO00o.OooOOO()).booleanValue()) {
            jSONObject.put("as", this.f23787OooO0OO.zza());
        }
        return jSONObject;
    }

    public final void OooO0OO(String str) {
        try {
            CustomTabsSession customTabsSession = this.f23791OooO0oO;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f23793OooOO0).toString());
            OooO0o0(jSONObject);
            if (((Boolean) AbstractC1817m8.f21129OooO00o.OooOOO()).booleanValue()) {
                jSONObject.put("as", this.f23787OooO0OO.zza());
            }
            customTabsSession.postMessage(jSONObject.toString(), null);
            o00.OooO00o oooO00o = new o00.OooO00o(this, str);
            if (((Boolean) AbstractC1817m8.f21131OooO0OO.OooOOO()).booleanValue()) {
                this.f23786OooO0O0.zzg(this.f23791OooO0oO, oooO00o);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.OooOO0o, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), oooO00o);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating JSON: ", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(com.google.android.gms.internal.ads.AbstractC1448c7.o0OOoOO)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0Oo() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.q7 r0 = r5.f23789OooO0o
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r0)
            return
        La:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f23519OooO00o
            boolean r0 = r0.get()
            if (r0 == 0) goto L13
            return
        L13:
            java.lang.String r0 = r5.f23792OooO0oo
            if (r0 == 0) goto L71
            androidx.browser.customtabs.CustomTabsSession r0 = r5.f23791OooO0oO
            if (r0 == 0) goto L71
            java.util.concurrent.ScheduledExecutorService r0 = r5.f23785OooO00o
            if (r0 == 0) goto L71
            long r1 = r5.f23784OooO
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L28
            goto L3c
        L28:
            Oooo0OO.o00Ooo r1 = com.google.android.gms.ads.internal.zzv.zzC()
            Oooo0OO.oo000o r1 = (Oooo0OO.oo000o) r1
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r5.f23784OooO
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3c
            goto L4e
        L3c:
            com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.o0OOoOO
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.OooO00o(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L71
        L4e:
            androidx.browser.customtabs.CustomTabsSession r1 = r5.f23791OooO0oO
            java.lang.String r2 = r5.f23792OooO0oo
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.requestPostMessageChannel(r2)
            com.google.android.gms.internal.ads.c1 r1 = r5.f23790OooO0o0
            com.google.android.gms.internal.ads.v6 r2 = com.google.android.gms.internal.ads.AbstractC1448c7.o0OOoOOO
            com.google.android.gms.internal.ads.a7 r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.OooO00o(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L71:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2001r7.OooO0Oo():void");
    }

    public final void OooO0o0(JSONObject jSONObject) throws JSONException {
        try {
            if (this.f23794OooOO0O == null) {
                this.f23794OooOO0O = new JSONArray((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOoOo));
            }
            jSONObject.put("eids", this.f23794OooOO0O);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error fetching the PACT active eids JSON: ", e);
        }
    }
}
