package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzck;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.pj0;
import com.ironsource.C3007ch;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vo */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2166vo extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC1722jo {

    /* renamed from: o00oO0O */
    public static final /* synthetic */ int f25025o00oO0O = 0;

    /* renamed from: OooOo */
    public final xd0 f25026OooOo;

    /* renamed from: OooOo0O */
    public final C1539ep f25027OooOo0O;

    /* renamed from: OooOo0o */
    public final C1663i1 f25028OooOo0o;

    /* renamed from: OooOoO */
    public final VersionInfoParcel f25029OooOoO;

    /* renamed from: OooOoO0 */
    public final C2075t7 f25030OooOoO0;

    /* renamed from: OooOoOO */
    public wj0 f25031OooOoOO;

    /* renamed from: OooOoo */
    public final DisplayMetrics f25032OooOoo;

    /* renamed from: OooOoo0 */
    public final zza f25033OooOoo0;

    /* renamed from: OooOooO */
    public final float f25034OooOooO;

    /* renamed from: OooOooo */
    public kd0 f25035OooOooo;

    /* renamed from: Oooo */
    public boolean f25036Oooo;

    /* renamed from: Oooo0 */
    public AbstractC1870no f25037Oooo0;

    /* renamed from: Oooo000 */
    public md0 f25038Oooo000;

    /* renamed from: Oooo00O */
    public boolean f25039Oooo00O;

    /* renamed from: Oooo00o */
    public boolean f25040Oooo00o;

    /* renamed from: Oooo0O0 */
    public zzm f25041Oooo0O0;

    /* renamed from: Oooo0OO */
    public f60 f25042Oooo0OO;

    /* renamed from: Oooo0o */
    public Oooo0oO.o0O0O00 f25043Oooo0o;

    /* renamed from: Oooo0o0 */
    public e60 f25044Oooo0o0;

    /* renamed from: Oooo0oO */
    public final String f25045Oooo0oO;

    /* renamed from: Oooo0oo */
    public boolean f25046Oooo0oo;

    /* renamed from: OoooO */
    public boolean f25047OoooO;

    /* renamed from: OoooO0 */
    public boolean f25048OoooO0;

    /* renamed from: OoooO00 */
    public boolean f25049OoooO00;

    /* renamed from: OoooO0O */
    public Boolean f25050OoooO0O;

    /* renamed from: OoooOO0 */
    public final String f25051OoooOO0;

    /* renamed from: OoooOOO */
    public boolean f25052OoooOOO;

    /* renamed from: OoooOOo */
    public boolean f25053OoooOOo;

    /* renamed from: OoooOo0 */
    public InterfaceC1377a9 f25054OoooOo0;

    /* renamed from: OoooOoO */
    public l00 f25055OoooOoO;

    /* renamed from: OoooOoo */
    public InterfaceC2034s3 f25056OoooOoo;

    /* renamed from: Ooooo00 */
    public int f25057Ooooo00;

    /* renamed from: Ooooo0o */
    public int f25058Ooooo0o;

    /* renamed from: OooooO0 */
    public C1558f7 f25059OooooO0;

    /* renamed from: OooooOO */
    public final C1558f7 f25060OooooOO;

    /* renamed from: OooooOo */
    public C1558f7 f25061OooooOo;

    /* renamed from: Oooooo */
    public int f25062Oooooo;

    /* renamed from: Oooooo0 */
    public final C2249xx f25063Oooooo0;

    /* renamed from: OoooooO */
    public zzm f25064OoooooO;

    /* renamed from: Ooooooo */
    public boolean f25065Ooooooo;
    public BinderC2240xo o000oOoO;

    /* renamed from: o00O0O */
    public int f25066o00O0O;

    /* renamed from: o00Oo0 */
    public int f25067o00Oo0;

    /* renamed from: o00Ooo */
    public int f25068o00Ooo;

    /* renamed from: o00o0O */
    public HashMap f25069o00o0O;

    /* renamed from: o00oO0o */
    public boolean f25070o00oO0o;

    /* renamed from: o00ooo */
    public final WindowManager f25071o00ooo;

    /* renamed from: o0OoOo0 */
    public final zzck f25072o0OoOo0;

    /* renamed from: oo000o */
    public final C1998r4 f25073oo000o;

    /* renamed from: ooOO */
    public int f25074ooOO;

    public ViewTreeObserverOnGlobalLayoutListenerC2166vo(C1539ep c1539ep, Oooo0oO.o0O0O00 o0o0o00, String str, boolean z, C1663i1 c1663i1, C2075t7 c2075t7, VersionInfoParcel versionInfoParcel, wj0 wj0Var, zza zzaVar, C1998r4 c1998r4, kd0 kd0Var, md0 md0Var, xd0 xd0Var) {
        md0 md0Var2;
        String str2;
        OooOOOo.o0ooOOo o0oooooOooO0OO;
        super(c1539ep);
        this.f25039Oooo00O = false;
        this.f25040Oooo00o = false;
        this.f25047OoooO = true;
        this.f25051OoooOO0 = "";
        this.f25074ooOO = -1;
        this.f25066o00O0O = -1;
        this.f25067o00Oo0 = -1;
        this.f25068o00Ooo = -1;
        this.f25027OooOo0O = c1539ep;
        this.f25043Oooo0o = o0o0o00;
        this.f25045Oooo0oO = str;
        this.f25049OoooO00 = z;
        this.f25028OooOo0o = c1663i1;
        this.f25026OooOo = xd0Var;
        this.f25030OooOoO0 = c2075t7;
        this.f25029OooOoO = versionInfoParcel;
        this.f25031OooOoOO = wj0Var;
        this.f25033OooOoo0 = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f25071o00ooo = windowManager;
        zzv.zzq();
        DisplayMetrics displayMetricsZzu = zzs.zzu(windowManager);
        this.f25032OooOoo = displayMetricsZzu;
        this.f25034OooOooO = displayMetricsZzu.density;
        this.f25073oo000o = c1998r4;
        this.f25035OooOooo = kd0Var;
        this.f25038Oooo000 = md0Var;
        this.f25072o0OoOo0 = new zzck(c1539ep.f18639OooO00o, this, this, null);
        this.f25070o00oO0o = false;
        setBackgroundColor(0);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Ooo0o)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzo.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Ooo0o0)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(zzv.zzq().zzc(c1539ep, versionInfoParcel.afmaVersion));
        zzv.zzq();
        final Context context = getContext();
        zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                pj0 pj0Var = zzs.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.f17816o000OO)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        Oooooo0();
        addJavascriptInterface(new C2314zo(this, new C1847n1(this, 12)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        C2249xx c2249xx = this.f25063Oooooo0;
        if (c2249xx != null && (o0oooooOooO0OO = zzv.zzp().OooO0OO()) != null) {
            ((ArrayBlockingQueue) o0oooooOooO0OO.f13431OooO0O0).offer((C1669i7) c2249xx.f25813OooOo);
        }
        C1669i7 c1669i7 = new C1669i7(this.f25045Oooo0oO);
        C2249xx c2249xx2 = new C2249xx(c1669i7);
        this.f25063Oooooo0 = c2249xx2;
        synchronized (c1669i7.f19971OooO0OO) {
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue() && (md0Var2 = this.f25038Oooo000) != null && (str2 = md0Var2.f21205OooO0O0) != null) {
            c1669i7.OooO0O0("gqi", str2);
        }
        C1558f7 c1558f7OooO0Oo = C1669i7.OooO0Oo();
        this.f25060OooooOO = c1558f7OooO0Oo;
        ((HashMap) c2249xx2.f25815OooOo0o).put("native:view_create", c1558f7OooO0Oo);
        this.f25061OooooOo = null;
        this.f25059OooooO0 = null;
        zzcg.zza().zzb(c1539ep);
        zzv.zzp().f23636OooOO0.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooO(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1859nd
    public final void OooO00o(String str, String str2) {
        OoooO00(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void OooO0O0() {
        l00 l00Var = this.f25055OoooOoO;
        if (l00Var != null) {
            zzs.zza.post(new RunnableC1442c1(l00Var, 29));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final kd0 OooO0OO() {
        return this.f25035OooOooo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final C1663i1 OooO0Oo() {
        return this.f25028OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1675id
    public final void OooO0o(String str, Map map) {
        try {
            OooO0o0(str, zzbc.zzb().zzj(map));
        } catch (JSONException unused) {
            zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1675id
    public final void OooO0o0(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzo.zze("Dispatching AFMA event: ".concat(sbOooOOo0.toString()));
        OoooO00(sbOooOOo0.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final View OooO0oO() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.google.android.gms.internal.ads.gh] */
    /* JADX WARN: Type inference failed for: r10v2 */
    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOO0O(int i, boolean z, boolean z2) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        InterfaceC1401ax interfaceC1401ax;
        ?? r10;
        int i2;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z3;
        AbstractC1870no abstractC1870no = this.f25037Oooo0;
        InterfaceC1722jo interfaceC1722jo = abstractC1870no.f21527OooOo0O;
        boolean zOoooOOo = AbstractC1870no.OoooOOo(interfaceC1722jo.OooOOoo(), interfaceC1722jo);
        boolean z4 = true;
        if (!zOoooOOo && z2) {
            z4 = false;
        }
        if (zOoooOOo) {
            zzaVar = null;
            interfaceC1401ax = null;
        } else {
            zzaVar = abstractC1870no.f21529OooOoO;
            interfaceC1401ax = null;
        }
        zzr zzrVar = abstractC1870no.f21531OooOoOO;
        InterfaceC1401ax interfaceC1401ax2 = interfaceC1401ax;
        zzac zzacVar = abstractC1870no.f21536Oooo;
        VersionInfoParcel versionInfoParcelZzn = interfaceC1722jo.zzn();
        InterfaceC1401ax interfaceC1401ax3 = z4 ? interfaceC1401ax2 : abstractC1870no.f21538Oooo000;
        if (AbstractC1870no.OoooOOO(interfaceC1722jo)) {
            r10 = abstractC1870no.f21556OoooOoo;
            i2 = i;
            z3 = z;
            zzaVar2 = zzaVar;
        } else {
            r10 = interfaceC1401ax2;
            i2 = i;
            zzaVar2 = zzaVar;
            z3 = z;
        }
        abstractC1870no.o0OO00O(new AdOverlayInfoParcel(zzaVar2, zzrVar, zzacVar, interfaceC1722jo, z3, i2, versionInfoParcelZzn, interfaceC1401ax3, r10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void OooOO0o(int i) {
        zzm zzmVar = this.f25041Oooo0O0;
        if (zzmVar != null) {
            zzmVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1859nd
    public final void OooOOO(String str, JSONObject jSONObject) {
        OooO00o(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized boolean OooOOO0() {
        return this.f25036Oooo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOOOO(boolean z) {
        this.f25037Oooo0.f21554OoooOo0 = z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized e60 OooOOOo() {
        return this.f25044Oooo0o0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final WebView OooOOo() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOOo0(kd0 kd0Var, md0 md0Var) {
        this.f25035OooOooo = kd0Var;
        this.f25038Oooo000 = md0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized boolean OooOOoo() {
        return this.f25049OoooO00;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final ArrayList OooOo() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized boolean OooOo0() {
        return this.f25057Ooooo00 > 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOo00() {
        zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOo0O() {
        this.f25070o00oO0o = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized String OooOo0o() {
        return this.f25045Oooo0oO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void OooOoO(BinderC2240xo binderC2240xo) {
        if (this.o000oOoO != null) {
            zzo.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.o000oOoO = binderC2240xo;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void OooOoO0(zzm zzmVar) {
        this.f25064OoooooO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOoOO() {
        if (this.f25061OooooOo == null) {
            C2249xx c2249xx = this.f25063Oooooo0;
            c2249xx.getClass();
            C1558f7 c1558f7OooO0Oo = C1669i7.OooO0Oo();
            this.f25061OooooOo = c1558f7OooO0Oo;
            ((HashMap) c2249xx.f25815OooOo0o).put("native:view_load", c1558f7OooO0Oo);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooOoo(String str, InterfaceC2042sb interfaceC2042sb) {
        AbstractC1870no abstractC1870no = this.f25037Oooo0;
        if (abstractC1870no != null) {
            synchronized (abstractC1870no.f21530OooOoO0) {
                try {
                    List list = (List) abstractC1870no.f21526OooOo.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(interfaceC2042sb);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void OooOoo0(String str, String str2) throws Throwable {
        Throwable th;
        String str3;
        try {
            try {
                if (OooOOO0()) {
                    zzo.zzj("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17759Ooooo00);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str4);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (JSONException e) {
                        zzo.zzk("Unable to build MRAID_ENV", e);
                        str3 = null;
                    }
                    super.loadDataWithBaseURL(str, AbstractC1430bp.OooO0O0(str2, str3), "text/html", "UTF-8", null);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void OooOooO(boolean z) {
        if (z) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        zzm zzmVar = this.f25041Oooo0O0;
        if (zzmVar != null) {
            zzmVar.zzB(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized InterfaceC2034s3 OooOooo() {
        return this.f25056OoooOoo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized boolean Oooo() {
        return this.f25047OoooO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void Oooo0(e60 e60Var) {
        this.f25044Oooo0o0 = e60Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final void Oooo000() {
        AbstractC1870no abstractC1870no = this.f25037Oooo0;
        if (abstractC1870no != null) {
            abstractC1870no.Oooo000();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void Oooo00O(InterfaceC1377a9 interfaceC1377a9) {
        this.f25054OoooOo0 = interfaceC1377a9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void Oooo00o() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void Oooo0O0(long j, boolean z) {
        HashMap map = new HashMap(2);
        map.put("success", true != z ? "0" : "1");
        map.put(IronSourceConstants.EVENTS_DURATION, Long.toString(j));
        OooO0o("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void Oooo0OO(String str, InterfaceC2042sb interfaceC2042sb) {
        AbstractC1870no abstractC1870no = this.f25037Oooo0;
        if (abstractC1870no != null) {
            abstractC1870no.OooO00o(str, interfaceC2042sb);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void Oooo0o(boolean z) {
        zzm zzmVar;
        int i = this.f25057Ooooo00 + (true != z ? -1 : 1);
        this.f25057Ooooo00 = i;
        if (i > 0 || (zzmVar = this.f25041Oooo0O0) == null) {
            return;
        }
        zzmVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final boolean Oooo0o0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void Oooo0oo(f60 f60Var) {
        this.f25042Oooo0OO = f60Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void OoooO(boolean z) {
        this.f25047OoooO = z;
    }

    public final /* synthetic */ void OoooO0(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OoooO00(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Boolean r0 = r3.f25050OoooO0O     // Catch: java.lang.Throwable -> L71
            monitor-exit(r3)
            r1 = 0
            if (r0 != 0) goto L30
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ql r0 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r0.f23628OooO00o     // Catch: java.lang.Throwable -> L22
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.Boolean r0 = r0.f23627OooO     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r3.f25050OoooO0O = r0     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L20
            java.lang.String r0 = "(function(){})()"
            r3.evaluateJavascript(r0, r1)     // Catch: java.lang.Throwable -> L22 java.lang.IllegalStateException -> L24
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L22 java.lang.IllegalStateException -> L24
            r3.OoooOOo(r0)     // Catch: java.lang.Throwable -> L22 java.lang.IllegalStateException -> L24
        L20:
            monitor-exit(r3)
            goto L30
        L22:
            r4 = move-exception
            goto L2e
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L22
            r3.OoooOOo(r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)
            goto L30
        L2b:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r4     // Catch: java.lang.Throwable -> L22
        L2e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r4
        L30:
            monitor-enter(r3)
            java.lang.Boolean r0 = r3.f25050OoooO0O     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L51
            monitor-enter(r3)
            boolean r0 = r3.OooOOO0()     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L48
            r3.evaluateJavascript(r4, r1)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            goto L6b
        L46:
            r4 = move-exception
            goto L4f
        L48:
            java.lang.String r4 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r4)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            goto L6b
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L46
            throw r4
        L51:
            java.lang.String r0 = "javascript:"
            java.lang.String r4 = r0.concat(r4)
            monitor-enter(r3)
            boolean r0 = r3.OooOOO0()     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L65
            r3.loadUrl(r4)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r3)
            goto L6b
        L63:
            r4 = move-exception
            goto L6c
        L65:
            java.lang.String r4 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r4)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r3)
        L6b:
            return
        L6c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L63
            throw r4
        L6e:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6e
            throw r4
        L71:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2166vo.OoooO00(java.lang.String):void");
    }

    public final /* synthetic */ void OoooO0O(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OoooOO0(boolean z, int i, String str, boolean z2, boolean z3) {
        AbstractC1870no abstractC1870no = this.f25037Oooo0;
        InterfaceC1722jo interfaceC1722jo = abstractC1870no.f21527OooOo0O;
        boolean zOooOOoo = interfaceC1722jo.OooOOoo();
        boolean zOoooOOo = AbstractC1870no.OoooOOo(zOooOOoo, interfaceC1722jo);
        boolean z4 = true;
        if (!zOoooOOo && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zOoooOOo ? null : abstractC1870no.f21529OooOoO;
        C1833mo c1833mo = zOooOOoo ? null : new C1833mo(interfaceC1722jo, abstractC1870no.f21531OooOoOO);
        InterfaceC1746kb interfaceC1746kb = abstractC1870no.f21534OooOooO;
        x50 x50Var = null;
        InterfaceC1783lb interfaceC1783lb = abstractC1870no.f21535OooOooo;
        boolean z5 = z4;
        C1833mo c1833mo2 = c1833mo;
        zzac zzacVar = abstractC1870no.f21536Oooo;
        VersionInfoParcel versionInfoParcelZzn = interfaceC1722jo.zzn();
        InterfaceC1401ax interfaceC1401ax = z5 ? null : abstractC1870no.f21538Oooo000;
        if (AbstractC1870no.OoooOOO(interfaceC1722jo)) {
            x50Var = abstractC1870no.f21556OoooOoo;
        }
        abstractC1870no.o0OO00O(new AdOverlayInfoParcel(zzaVar, c1833mo2, interfaceC1746kb, interfaceC1783lb, zzacVar, interfaceC1722jo, z, i, str, versionInfoParcelZzn, interfaceC1401ax, x50Var, z3));
    }

    public final /* synthetic */ void OoooOOO() {
        super.loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    public final void OoooOOo(Boolean bool) {
        synchronized (this) {
            this.f25050OoooO0O = bool;
        }
        C1978ql c1978qlZzp = zzv.zzp();
        synchronized (c1978qlZzp.f23628OooO00o) {
            c1978qlZzp.f23627OooO = bool;
        }
    }

    public final boolean OoooOo0() {
        boolean z;
        int iZzv;
        int iZzv2;
        AbstractC1870no abstractC1870no = this.f25037Oooo0;
        synchronized (abstractC1870no.f21530OooOoO0) {
            z = abstractC1870no.f21544Oooo0o0;
        }
        if (z || this.f25037Oooo0.OooOO0()) {
            zzbc.zzb();
            DisplayMetrics displayMetrics = this.f25032OooOoo;
            int iZzv3 = zzf.zzv(displayMetrics, displayMetrics.widthPixels);
            zzbc.zzb();
            int iZzv4 = zzf.zzv(displayMetrics, displayMetrics.heightPixels);
            Activity activity = this.f25027OooOo0O.f18639OooO00o;
            if (activity == null || activity.getWindow() == null) {
                iZzv = iZzv3;
                iZzv2 = iZzv4;
            } else {
                zzv.zzq();
                int[] iArrZzQ = zzs.zzQ(activity);
                zzbc.zzb();
                iZzv = zzf.zzv(displayMetrics, iArrZzQ[0]);
                zzbc.zzb();
                iZzv2 = zzf.zzv(displayMetrics, iArrZzQ[1]);
            }
            int i = this.f25066o00O0O;
            if (i != iZzv3 || this.f25074ooOO != iZzv4 || this.f25067o00Oo0 != iZzv || this.f25068o00Ooo != iZzv2) {
                boolean z2 = (i == iZzv3 && this.f25074ooOO == iZzv4) ? false : true;
                this.f25066o00O0O = iZzv3;
                this.f25074ooOO = iZzv4;
                this.f25067o00Oo0 = iZzv;
                this.f25068o00Ooo = iZzv2;
                new C2249xx(16, this, "").OooOOOO(iZzv3, iZzv4, iZzv, iZzv2, displayMetrics.density, this.f25071o00ooo.getDefaultDisplay().getRotation());
                return z2;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OoooOoO(boolean z, int i, String str, String str2, boolean z2) {
        AbstractC1870no abstractC1870no = this.f25037Oooo0;
        InterfaceC1722jo interfaceC1722jo = abstractC1870no.f21527OooOo0O;
        boolean zOooOOoo = interfaceC1722jo.OooOOoo();
        boolean zOoooOOo = AbstractC1870no.OoooOOo(zOooOOoo, interfaceC1722jo);
        boolean z3 = true;
        if (!zOoooOOo && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zOoooOOo ? null : abstractC1870no.f21529OooOoO;
        C1833mo c1833mo = zOooOOoo ? null : new C1833mo(interfaceC1722jo, abstractC1870no.f21531OooOoOO);
        InterfaceC1746kb interfaceC1746kb = abstractC1870no.f21534OooOooO;
        x50 x50Var = null;
        InterfaceC1783lb interfaceC1783lb = abstractC1870no.f21535OooOooo;
        boolean z4 = z3;
        C1833mo c1833mo2 = c1833mo;
        zzac zzacVar = abstractC1870no.f21536Oooo;
        VersionInfoParcel versionInfoParcelZzn = interfaceC1722jo.zzn();
        InterfaceC1401ax interfaceC1401ax = z4 ? null : abstractC1870no.f21538Oooo000;
        if (AbstractC1870no.OoooOOO(interfaceC1722jo)) {
            x50Var = abstractC1870no.f21556OoooOoo;
        }
        abstractC1870no.o0OO00O(new AdOverlayInfoParcel(zzaVar, c1833mo2, interfaceC1746kb, interfaceC1783lb, zzacVar, interfaceC1722jo, z, i, str, str2, versionInfoParcelZzn, interfaceC1401ax, x50Var));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OoooOoo(int i) {
        C1558f7 c1558f7 = this.f25060OooooOO;
        C2249xx c2249xx = this.f25063Oooooo0;
        if (i == 0) {
            ze0.OooOOO0((C1669i7) c2249xx.f25813OooOo, c1558f7, "aebb2");
        }
        ze0.OooOOO0((C1669i7) c2249xx.f25813OooOo, c1558f7, "aeh2");
        c2249xx.getClass();
        ((C1669i7) c2249xx.f25813OooOo).OooO0O0("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.f25029OooOoO.afmaVersion);
        OooO0o("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1481d3
    public final void Ooooo00(C1444c3 c1444c3) {
        boolean z;
        synchronized (this) {
            z = c1444c3.f17668OooOO0;
            this.f25052OoooOOO = z;
        }
        oo000o(z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void Ooooo0o(String str, C1847n1 c1847n1) {
        AbstractC1870no abstractC1870no = this.f25037Oooo0;
        if (abstractC1870no != null) {
            synchronized (abstractC1870no.f21530OooOoO0) {
                try {
                    List<InterfaceC2042sb> list = (List) abstractC1870no.f21526OooOo.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC2042sb interfaceC2042sb : list) {
                        if ((interfaceC2042sb instanceof C1785ld) && ((C1785ld) interfaceC2042sb).f20849OooOo0O.equals((InterfaceC2042sb) c1847n1.f21381OooOo0o)) {
                            arrayList.add(interfaceC2042sb);
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void OooooO0(InterfaceC2034s3 interfaceC2034s3) {
        this.f25056OoooOoo = interfaceC2034s3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooooOO(String str, String str2) {
        AbstractC1870no abstractC1870no = this.f25037Oooo0;
        abstractC1870no.getClass();
        InterfaceC1722jo interfaceC1722jo = abstractC1870no.f21527OooOo0O;
        abstractC1870no.o0OO00O(new AdOverlayInfoParcel(interfaceC1722jo, interfaceC1722jo.zzn(), str, str2, 14, abstractC1870no.f21556OoooOoo));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void OooooOo() {
        zzm zzmVarZzL = zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void Oooooo(l00 l00Var) {
        this.f25055OoooOoO = l00Var;
    }

    public final synchronized void Oooooo0() {
        try {
            kd0 kd0Var = this.f25035OooOooo;
            if (kd0Var != null && kd0Var.f20545o00O0O) {
                zzo.zze("Disabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (!this.f25048OoooO0) {
                            setLayerType(1, null);
                        }
                        this.f25048OoooO0 = true;
                    } finally {
                    }
                }
                return;
            }
            if (this.f25049OoooO00 || this.f25043Oooo0o.OooO0O0()) {
                zzo.zze("Enabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (this.f25048OoooO0) {
                            setLayerType(0, null);
                        }
                        this.f25048OoooO0 = false;
                    } finally {
                    }
                }
                return;
            }
            zzo.zze("Enabling hardware acceleration on an AdView.");
            synchronized (this) {
                try {
                    if (this.f25048OoooO0) {
                        setLayerType(0, null);
                    }
                    this.f25048OoooO0 = false;
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final xd0 OoooooO() {
        return this.f25026OooOo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized boolean Ooooooo() {
        return this.f25046Oooo0oo;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void destroy() {
        OooOOOo.o0ooOOo o0oooooOooO0OO;
        try {
            C2249xx c2249xx = this.f25063Oooooo0;
            if (c2249xx != null && (o0oooooOooO0OO = zzv.zzp().OooO0OO()) != null) {
                ((ArrayBlockingQueue) o0oooooOooO0OO.f13431OooO0O0).offer((C1669i7) c2249xx.f25813OooOo);
            }
            this.f25072o0OoOo0.zza();
            zzm zzmVar = this.f25041Oooo0O0;
            if (zzmVar != null) {
                zzmVar.zzb();
                this.f25041Oooo0O0.zzm();
                this.f25041Oooo0O0 = null;
            }
            this.f25042Oooo0OO = null;
            this.f25044Oooo0o0 = null;
            this.f25037Oooo0.Oooooo0();
            this.f25056OoooOoo = null;
            this.f25031OooOoOO = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f25036Oooo) {
                return;
            }
            zzv.zzz().OooO0Oo(this);
            o0OOO0o();
            this.f25036Oooo = true;
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO0)).booleanValue()) {
                zze.zza("Destroying the WebView immediately...");
                zzX();
                return;
            }
            Activity activity = this.f25027OooOo0O.f18639OooO00o;
            if (activity != null && activity.isDestroyed()) {
                zze.zza("Destroying the WebView immediately...");
                zzX();
                return;
            }
            zze.zza("Initiating WebView self destruct sequence in 3...");
            zze.zza("Loading blank page in WebView, 2...");
            synchronized (this) {
                try {
                    zzs.zza.post(new RunnableC2092to(this, 1));
                } catch (Throwable th) {
                    zzv.zzp().OooO0oo("AdWebViewImpl.loadUrlUnsafe", th);
                    zzo.zzk("Could not call loadUrl in destroy(). ", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (OooOOO0()) {
            zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oO0O00)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            AbstractC2200wl.f25325OooO0o.OooO00o(new o000oOoO(this, str, valueCallback, 5));
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.f25036Oooo) {
                        this.f25037Oooo0.Oooooo0();
                        zzv.zzz().OooO0Oo(this);
                        o0OOO0o();
                        o00o0O();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void loadData(String str, String str2, String str3) {
        if (OooOOO0()) {
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (OooOOO0()) {
                    zzo.zzj("#004 The webview is destroyed. Ignoring action.");
                } else {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void loadUrl(String str) {
        if (OooOOO0()) {
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            zzs.zza.post(new wp0(15, this, str));
        } catch (Throwable th) {
            zzv.zzp().OooO0oo("AdWebViewImpl.loadUrl", th);
            zzo.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void o000oOoO(Context context) {
        C1539ep c1539ep = this.f25027OooOo0O;
        c1539ep.setBaseContext(context);
        this.f25072o0OoOo0.zze(c1539ep.f18639OooO00o);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void o00O0O(boolean z) {
        try {
            boolean z2 = this.f25049OoooO00;
            this.f25049OoooO00 = z;
            Oooooo0();
            if (z != z2) {
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17760Ooooo0o)).booleanValue()) {
                    if (!this.f25043Oooo0o.OooO0O0()) {
                    }
                }
                try {
                    OooO0o0("onStateChanged", new JSONObject().put("state", true != z ? "default" : "expanded"));
                } catch (JSONException e) {
                    zzo.zzh("Error occurred while dispatching state change.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final o00000oO.OooOOO o00Oo0() {
        C2075t7 c2075t7 = this.f25030OooOoO0;
        return c2075t7 == null ? yp0.f25991OooOo0o : (tp0) ii0.o00Oo0(tp0.OooOOo(yp0.f25991OooOo0o), ((Long) AbstractC1596g8.f19262OooO0OO.OooOOO()).longValue(), TimeUnit.MILLISECONDS, c2075t7.f24260OooO0OO);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void o00Ooo(String str, AbstractC1869nn abstractC1869nn) {
        try {
            if (this.f25069o00o0O == null) {
                this.f25069o00o0O = new HashMap();
            }
            this.f25069o00o0O.put(str, abstractC1869nn);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o00o0O() {
        if (this.f25065Ooooooo) {
            return;
        }
        this.f25065Ooooooo = true;
        zzv.zzp().f23636OooOO0.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized f60 o00oO0O() {
        return this.f25042Oooo0OO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void o00oO0o(zzm zzmVar) {
        this.f25041Oooo0O0 = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void o00ooo(zzc zzcVar, boolean z, boolean z2, String str) {
        this.f25037Oooo0.o0Oo0oo(zzcVar, z, z2, str);
    }

    public final synchronized void o0OOO0o() {
        try {
            HashMap map = this.f25069o00o0O;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC1869nn) it.next()).OooO0oO();
                }
            }
            this.f25069o00o0O = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String o0Oo0oo() {
        return this.f25051OoooOO0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void o0OoOo0(Oooo0oO.o0O0O00 o0o0o00) {
        this.f25043Oooo0o = o0o0o00;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void o0ooOO0() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(zzv.zzs().zze()));
        map.put("app_volume", String.valueOf(zzv.zzs().zza()));
        map.put("device_volume", String.valueOf(zzab.zzb(getContext())));
        OooO0o("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void o0ooOOo(boolean z) {
        boolean z2;
        zzm zzmVar = this.f25041Oooo0O0;
        if (zzmVar == null) {
            this.f25046Oooo0oo = z;
            return;
        }
        AbstractC1870no abstractC1870no = this.f25037Oooo0;
        synchronized (abstractC1870no.f21530OooOoO0) {
            z2 = abstractC1870no.f21544Oooo0o0;
        }
        zzmVar.zzy(z2, z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final md0 o0ooOoO() {
        return this.f25038Oooo000;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        AbstractC1870no abstractC1870no = this.f25037Oooo0;
        if (abstractC1870no != null) {
            abstractC1870no.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!OooOOO0()) {
                this.f25072o0OoOo0.zzc();
            }
            if (this.f25070o00oO0o) {
                onResume();
                this.f25070o00oO0o = false;
            }
            boolean z = this.f25052OoooOOO;
            AbstractC1870no abstractC1870no = this.f25037Oooo0;
            if (abstractC1870no != null && abstractC1870no.OooOO0()) {
                if (!this.f25053OoooOOo) {
                    synchronized (this.f25037Oooo0.f21530OooOoO0) {
                    }
                    synchronized (this.f25037Oooo0.f21530OooOoO0) {
                    }
                    this.f25053OoooOOo = true;
                }
                OoooOo0();
                z = true;
            }
            oo000o(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC1870no abstractC1870no;
        synchronized (this) {
            try {
                if (!OooOOO0()) {
                    this.f25072o0OoOo0.zzd();
                }
                super.onDetachedFromWindow();
                if (this.f25053OoooOOo && (abstractC1870no = this.f25037Oooo0) != null && abstractC1870no.OooOO0() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    synchronized (this.f25037Oooo0.f21530OooOoO0) {
                    }
                    synchronized (this.f25037Oooo0.f21530OooOoO0) {
                    }
                    this.f25053OoooOOo = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        oo000o(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOOOO)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            zzv.zzq();
            zzs.zzT(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            zzo.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            zzv.zzp().OooO0oo("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (OooOOO0()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zOoooOo0 = OoooOo0();
        zzm zzmVarZzL = zzL();
        if (zzmVarZzL == null || !zOoooOo0) {
            return;
        }
        zzmVarZzL.zzn();
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0083  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2166vo.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void onPause() {
        if (OooOOO0()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0O00O)).booleanValue() && WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO)) {
                zzo.zze("Muting webview");
                WebViewCompat.setAudioMuted(this, true);
            }
        } catch (Exception e) {
            zzo.zzh("Could not pause webview.", e);
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0O0O0)).booleanValue()) {
                zzv.zzp().OooO0oo("AdWebViewImpl.onPause", e);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void onResume() {
        if (OooOOO0()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0O00O)).booleanValue() && WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO)) {
                zzo.zze("Unmuting webview");
                WebViewCompat.setAudioMuted(this, false);
            }
        } catch (Exception e) {
            zzo.zzh("Could not resume webview.", e);
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0O0O0)).booleanValue()) {
                zzv.zzp().OooO0oo("AdWebViewImpl.onResume", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x004c  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.v6 r0 = com.google.android.gms.internal.ads.AbstractC1448c7.f17902o00OOOO0
            com.google.android.gms.internal.ads.a7 r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.OooO00o(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L20
            com.google.android.gms.internal.ads.no r0 = r7.f25037Oooo0
            java.lang.Object r3 = r0.f21530OooOoO0
            monitor-enter(r3)
            boolean r0 = r0.f21545Oooo0oO     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L20
            r0 = r1
            goto L25
        L20:
            r0 = r2
            goto L25
        L22:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r8
        L25:
            com.google.android.gms.internal.ads.no r3 = r7.f25037Oooo0
            boolean r3 = r3.OooOO0()
            if (r3 == 0) goto L3b
            com.google.android.gms.internal.ads.no r3 = r7.f25037Oooo0
            java.lang.Object r4 = r3.f21530OooOoO0
            monitor-enter(r4)
            boolean r3 = r3.f21546Oooo0oo     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L3d
            goto L3b
        L38:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r8
        L3b:
            if (r0 == 0) goto L4c
        L3d:
            monitor-enter(r7)
            com.google.android.gms.internal.ads.a9 r0 = r7.f25054OoooOo0     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L48
            r0.OooO00o(r8)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r8 = move-exception
            goto L4a
        L48:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L46
            goto L8f
        L4a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L46
            throw r8
        L4c:
            com.google.android.gms.internal.ads.i1 r0 = r7.f25028OooOo0o
            if (r0 == 0) goto L55
            com.google.android.gms.internal.ads.f1 r0 = r0.f19893OooO0O0
            r0.zzk(r8)
        L55:
            com.google.android.gms.internal.ads.t7 r0 = r7.f25030OooOoO0
            if (r0 == 0) goto L8f
            int r3 = r8.getAction()
            if (r3 != r1) goto L75
            long r3 = r8.getEventTime()
            android.view.MotionEvent r1 = r0.f24258OooO00o
            long r5 = r1.getEventTime()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L6e
            goto L75
        L6e:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r8)
            r0.f24258OooO00o = r1
            goto L8f
        L75:
            int r1 = r8.getAction()
            if (r1 != 0) goto L8f
            long r3 = r8.getEventTime()
            android.view.MotionEvent r1 = r0.f24259OooO0O0
            long r5 = r1.getEventTime()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L8f
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r8)
            r0.f24259OooO0O0 = r1
        L8f:
            boolean r0 = r7.OooOOO0()
            if (r0 == 0) goto L96
            return r2
        L96:
            boolean r8 = super.onTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2166vo.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void oo000o(boolean z) {
        HashMap map = new HashMap();
        map.put(C3007ch.f7750k, true != z ? "0" : "1");
        OooO0o("onAdVisibilityChanged", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void ooOO() {
        this.f25072o0OoOo0.zzb();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof AbstractC1870no) {
            this.f25037Oooo0 = (AbstractC1870no) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (OooOOO0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzo.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void zzA(int i) {
        this.f25062Oooooo = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final Context zzE() {
        return this.f25027OooOo0O.f18641OooO0OO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized InterfaceC1377a9 zzK() {
        return this.f25054OoooOo0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized zzm zzL() {
        return this.f25041Oooo0O0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized zzm zzM() {
        return this.f25064OoooooO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final /* synthetic */ AbstractC1870no zzN() {
        return this.f25037Oooo0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized Oooo0oO.o0O0O00 zzO() {
        return this.f25043Oooo0o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized void zzX() {
        zze.zza("Destroying WebView!");
        o00o0O();
        zzs.zza.post(new RunnableC2092to(this, 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void zzY() {
        ze0.OooOOO0((C1669i7) this.f25063Oooooo0.f25813OooOo, this.f25060OooooOO, "aeh2");
        HashMap map = new HashMap(1);
        map.put("version", this.f25029OooOoO.afmaVersion);
        OooO0o("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1859nd
    public final void zza(String str) {
        OoooO00(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final void zzaa() {
        if (this.f25059OooooO0 == null) {
            C2249xx c2249xx = this.f25063Oooooo0;
            ze0.OooOOO0((C1669i7) c2249xx.f25813OooOo, this.f25060OooooOO, "aes2");
            C1558f7 c1558f7OooO0Oo = C1669i7.OooO0Oo();
            this.f25059OooooO0 = c1558f7OooO0Oo;
            ((HashMap) c2249xx.f25815OooOo0o).put("native:view_show", c1558f7OooO0Oo);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f25029OooOoO.afmaVersion);
        OooO0o("onshow", map);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzde() {
        wj0 wj0Var = this.f25031OooOoOO;
        if (wj0Var != null) {
            wj0Var.zzde();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdf() {
        wj0 wj0Var = this.f25031OooOoOO;
        if (wj0Var != null) {
            wj0Var.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized int zzf() {
        return this.f25062Oooooo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final Activity zzi() {
        return this.f25027OooOo0O.f18639OooO00o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final zza zzj() {
        return this.f25033OooOoo0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final C1558f7 zzk() {
        return this.f25060OooooOO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final C2249xx zzm() {
        return this.f25063Oooooo0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final VersionInfoParcel zzn() {
        return this.f25029OooOoO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final C2051sk zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized BinderC2240xo zzq() {
        return this.o000oOoO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1722jo
    public final synchronized String zzr() {
        md0 md0Var = this.f25038Oooo000;
        if (md0Var == null) {
            return null;
        }
        return md0Var.f21205OooO0O0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final void zzu() {
        AbstractC1870no abstractC1870no = this.f25037Oooo0;
        if (abstractC1870no != null) {
            abstractC1870no.zzu();
        }
    }
}
