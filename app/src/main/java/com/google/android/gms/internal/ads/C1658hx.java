package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.ironsource.C3034d9;
import com.ironsource.C3571qt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hx */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1658hx implements InterfaceC1730jw, vp0, OnUserEarnedRewardListener, bf0, InterfaceC1455ce, InterfaceC1492de, d60, InterfaceC2318zs, InterfaceC2064sx, Continuation, il0 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f19874OooOo0O;

    public C1658hx(int i) {
        this.f19874OooOo0O = 25;
    }

    public static final Set OooO(p20 p20Var, Executor executor) {
        return ((Boolean) AbstractC1706j8.f20223OooO00o.OooOOO()).booleanValue() ? Collections.singleton(new C2248xw(p20Var, executor)) : Collections.EMPTY_SET;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.bh0 OooOOO(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 1
            r3 = 2
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r2) goto L41
            if (r4 == r3) goto L3e
            com.google.android.gms.internal.ads.bh0 r4 = com.google.android.gms.internal.ads.bh0.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.bh0 r4 = com.google.android.gms.internal.ads.bh0.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.bh0 r4 = com.google.android.gms.internal.ads.bh0.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.bh0 r4 = com.google.android.gms.internal.ads.bh0.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1658hx.OooOOO(java.lang.String):com.google.android.gms.internal.ads.bh0");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zg0 OooOOO0(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.zg0 r4 = com.google.android.gms.internal.ads.zg0.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.zg0 r4 = com.google.android.gms.internal.ads.zg0.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.zg0 r4 = com.google.android.gms.internal.ads.zg0.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1658hx.OooOOO0(java.lang.String):com.google.android.gms.internal.ads.zg0");
    }

    public static eh0 OooOOOO(String str) {
        return IronSourceConstants.EVENTS_NATIVE.equals(str) ? eh0.NATIVE : "javascript".equals(str) ? eh0.JAVASCRIPT : eh0.NONE;
    }

    public static final void OooOOOo(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            zzv.zzp().OooO0oO("omid exception", e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.a60] */
    public f60 OooO0OO(final int i, final int i2, final WebView webView, final String str, final String str2, final String str3) {
        Object objOooO00o = null;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0oo0)).booleanValue() || !ze0.f26157OooO0Oo.f29577OooOo0o) {
            return null;
        }
        try {
            objOooO00o = new Object() { // from class: com.google.android.gms.internal.ads.a60
                public final Object OooO00o() {
                    C1595g7 c1595g7OooO00o = C1595g7.OooO00o("Google", str);
                    eh0 eh0VarOooOOOO = C1658hx.OooOOOO("javascript");
                    int i3 = i2;
                    zg0 zg0VarOooOOO0 = C1658hx.OooOOO0(AbstractC2183w4.OooO0o0(i3));
                    eh0 eh0Var = eh0.NONE;
                    if (eh0VarOooOOOO == eh0Var) {
                        zzo.zzj("Omid html session error; Unable to parse impression owner: javascript");
                        return null;
                    }
                    if (zg0VarOooOOO0 == null) {
                        zzo.zzj("Omid html session error; Unable to parse creative type: ".concat(AbstractC2183w4.OooOoo(i3)));
                        return null;
                    }
                    String str4 = str2;
                    eh0 eh0VarOooOOOO2 = C1658hx.OooOOOO(str4);
                    if (zg0VarOooOOO0 == zg0.VIDEO && eh0VarOooOOOO2 == eh0Var) {
                        zzo.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                        return null;
                    }
                    oO000O0O oo000o0o = new oO000O0O(c1595g7OooO00o, webView, str3, "", xg0.HTML);
                    fj0 fj0VarOooO00o = fj0.OooO00o(zg0VarOooOOO0, C1658hx.OooOOO(AbstractC2183w4.OooO0o(i)), eh0VarOooOOOO, eh0VarOooOOOO2, true);
                    if (ze0.f26157OooO0Oo.f29577OooOo0o) {
                        return new f60(new yg0(fj0VarOooO00o, oo000o0o, UUID.randomUUID().toString()), oo000o0o);
                    }
                    throw new IllegalStateException("Method called before OM SDK activation");
                }
            }.OooO00o();
        } catch (RuntimeException e) {
            zzv.zzp().OooO0oO("omid exception", e);
        }
        return (f60) objOooO00o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1455ce
    public Object OooO0Oo(JSONObject jSONObject) {
        return new C2234xi(jSONObject);
    }

    public dh0 OooO0oO(VersionInfoParcel versionInfoParcel, WebView webView) {
        try {
            return new dh0(C1595g7.OooO00o("Google", versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion), webView);
        } catch (RuntimeException e) {
            zzv.zzp().OooO0oO("omid exception", e);
            return null;
        }
    }

    public String OooO0oo() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0oo0)).booleanValue()) {
            return "a.1.5.2-google_20241009";
        }
        return null;
    }

    public void OooOO0(yg0 yg0Var, View view) {
        OooOOOo(new z50(yg0Var, view, 1));
    }

    public void OooOO0O(yg0 yg0Var) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0oo0)).booleanValue() && ze0.f26157OooO0Oo.f29577OooOo0o) {
            OooOOOo(new b60(yg0Var, 0));
        }
    }

    public boolean OooOO0o(Context context) {
        Object objMo13704zza;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0oo0)).booleanValue()) {
            zzo.zzj("Omid flag is disabled");
            return false;
        }
        try {
            objMo13704zza = new nh0(context, 1).mo13704zza();
        } catch (RuntimeException e) {
            zzv.zzp().OooO0oO("omid exception", e);
            objMo13704zza = null;
        }
        Boolean bool = (Boolean) objMo13704zza;
        return bool != null && bool.booleanValue();
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        int i = this.f19874OooOo0O;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return Boolean.valueOf(task.isSuccessful());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2318zs, com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public zzeb mo13704zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1492de
    public JSONObject zzb(Object obj) throws JSONException {
        c50 c50Var = (c50) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOo0)).booleanValue()) {
            jSONObject2.put("ad_request_url", c50Var.f17696OooO0OO.f25632OooO0o);
            jSONObject2.put("ad_request_post_body", c50Var.f17696OooO0OO.f25630OooO0OO);
        }
        jSONObject2.put("base_url", c50Var.f17696OooO0OO.f25629OooO0O0);
        jSONObject2.put("signals", c50Var.f17695OooO0O0);
        f50 f50Var = c50Var.f17694OooO00o;
        jSONObject3.put(C3034d9.h.f8065E0, f50Var.f18786OooO0OO);
        jSONObject3.put("headers", zzbc.zzb().zzj(f50Var.f18785OooO0O0));
        jSONObject3.put("response_code", f50Var.f18784OooO00o);
        jSONObject3.put("latency", f50Var.f18787OooO0Oo);
        jSONObject.put("request", jSONObject2);
        jSONObject.put(C3571qt.f11099n, jSONObject3);
        jSONObject.put("flags", c50Var.f17696OooO0OO.f25635OooO0oo);
        return jSONObject;
    }

    public /* synthetic */ C1658hx(int i, byte b) {
        this.f19874OooOo0O = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1730jw, com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        switch (this.f19874OooOo0O) {
            case 0:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
                break;
            case 1:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
                break;
            case 13:
                ((zzbl) obj).zzd();
                break;
            case 14:
                ((zzbl) obj).zzj();
                break;
            case 15:
                ((InterfaceC1482d4) obj).zzf();
                break;
            case 16:
                ((zzr) obj).zzdo();
                break;
            case 17:
                ((InterfaceC1840mv) obj).zzg();
                break;
            case 18:
                ((zzr) obj).zzdr();
                break;
            case 19:
                ((zzr) obj).zzdp();
                break;
            case 21:
                ((InterfaceC2161vj) obj).zzj();
                break;
            case 22:
                ((InterfaceC2161vj) obj).zzf();
                break;
            case 23:
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                break;
            default:
                ((InterfaceC2161vj) obj).zze();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public Object mo13704zza() {
        switch (this.f19874OooOo0O) {
            case 27:
                return -1;
            case 28:
                return -1;
            default:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
        }
    }

    @Override // com.google.android.gms.internal.ads.bf0
    public Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        zze.zza("Ad request signals:");
        zze.zza(jSONObject.toString(2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        switch (this.f19874OooOo0O) {
            case 2:
                break;
            default:
                zze.zza("Notification of cache hit failed.");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public /* synthetic */ void mo13705zzb(Object obj) {
        switch (this.f19874OooOo0O) {
            case 2:
                ((InterfaceC1722jo) obj).destroy();
                break;
            default:
                zze.zza("Notification of cache hit successful.");
                break;
        }
    }

    private final void OooO00o(RewardItem rewardItem) {
    }

    private final void OooO0O0(RewardItem rewardItem) {
    }

    private final void OooO0o0(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2064sx
    public void OooO0o(boolean z, Context context, C2246xu c2246xu) {
    }
}
