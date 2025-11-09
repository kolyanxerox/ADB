package com.ironsource.sdk.controller;

import OooO0oO.OooOo;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.applovin.impl.o0000O0;
import com.applovin.impl.o0OoOo0;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.AbstractC3828x8;
import com.ironsource.C2635a9;
import com.ironsource.C2636aa;
import com.ironsource.C2959b4;
import com.ironsource.C3034d9;
import com.ironsource.C3037dc;
import com.ironsource.C3042dh;
import com.ironsource.C3109f9;
import com.ironsource.C3126fq;
import com.ironsource.C3144g9;
import com.ironsource.C3146gb;
import com.ironsource.C3161gq;
import com.ironsource.C3198hs;
import com.ironsource.C3206i1;
import com.ironsource.C3233is;
import com.ironsource.C3256jh;
import com.ironsource.C3283k9;
import com.ironsource.C3309l0;
import com.ironsource.C3419mh;
import com.ironsource.C3431mt;
import com.ironsource.C3446n9;
import com.ironsource.C3451ne;
import com.ironsource.C3454nh;
import com.ironsource.C3489oh;
import com.ironsource.C3495on;
import com.ironsource.C3523pg;
import com.ironsource.C3527pk;
import com.ironsource.C3539pw;
import com.ironsource.C3545q3;
import com.ironsource.C3551q9;
import com.ironsource.C3565qn;
import com.ironsource.C3594rh;
import com.ironsource.C3597rk;
import com.ironsource.C3699th;
import com.ironsource.C3750ux;
import com.ironsource.C3762va;
import com.ironsource.C3769vh;
import com.ironsource.C3777vp;
import com.ironsource.C3796wa;
import com.ironsource.C3811wp;
import com.ironsource.C3822x2;
import com.ironsource.C3824x4;
import com.ironsource.C3856y2;
import com.ironsource.C3896z8;
import com.ironsource.C3898za;
import com.ironsource.InterfaceC2970bf;
import com.ironsource.InterfaceC3011cl;
import com.ironsource.InterfaceC3043di;
import com.ironsource.InterfaceC3248j9;
import com.ironsource.InterfaceC3602rp;
import com.ironsource.InterfaceC3615s3;
import com.ironsource.InterfaceC3621s9;
import com.ironsource.InterfaceC3715tx;
import com.ironsource.InterfaceC3726u9;
import com.ironsource.InterfaceC3742up;
import com.ironsource.InterfaceC3761v9;
import com.ironsource.InterfaceC3767vf;
import com.ironsource.InterfaceC3795w9;
import com.ironsource.InterfaceC3818ww;
import com.ironsource.InterfaceC3829x9;
import com.ironsource.InterfaceC3868ye;
import com.ironsource.InterfaceC3874yk;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.InterfaceC3641f;
import com.ironsource.sdk.controller.InterfaceC3646k;
import com.ironsource.sdk.controller.InterfaceC3647l;
import com.ironsource.sdk.controller.InterfaceC3648m;
import com.ironsource.sdk.controller.InterfaceC3651p;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.services.core.p012di.ServiceProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.v */
/* loaded from: classes2.dex */
public class C3657v implements InterfaceC3647l, InterfaceC3602rp, DownloadListener {

    /* renamed from: b0 */
    private static final String f11670b0 = "about:blank";

    /* renamed from: c0 */
    public static int f11671c0 = 0;

    /* renamed from: d0 */
    public static String f11672d0 = "is_store";

    /* renamed from: e0 */
    public static String f11673e0 = "external_url";

    /* renamed from: f0 */
    public static String f11674f0 = "secondary_web_view";

    /* renamed from: g0 */
    private static String f11675g0 = "success";

    /* renamed from: h0 */
    private static String f11676h0 = "fail";

    /* renamed from: A */
    private String f11677A;

    /* renamed from: B */
    private C3639d f11678B;

    /* renamed from: C */
    private InterfaceC3818ww f11679C;

    /* renamed from: D */
    private C3856y2 f11680D;

    /* renamed from: G */
    private C3796wa f11683G;

    /* renamed from: H */
    private C3650o f11684H;

    /* renamed from: I */
    private C3652q f11685I;

    /* renamed from: J */
    private C3656u f11686J;

    /* renamed from: K */
    private C3644i f11687K;

    /* renamed from: L */
    private C3636a f11688L;

    /* renamed from: M */
    private C3645j f11689M;

    /* renamed from: N */
    private C3545q3 f11690N;

    /* renamed from: O */
    private C2636aa f11691O;

    /* renamed from: P */
    private InterfaceC3715tx f11692P;

    /* renamed from: Q */
    private InterfaceC3638c f11693Q;

    /* renamed from: R */
    private AbstractC3828x8 f11694R;

    /* renamed from: S */
    private JSONObject f11695S;

    /* renamed from: T */
    private InterfaceC3647l.a f11696T;

    /* renamed from: U */
    private InterfaceC3647l.b f11697U;

    /* renamed from: V */
    private C3446n9 f11698V;

    /* renamed from: W */
    private boolean f11699W;

    /* renamed from: Y */
    C3144g9 f11701Y;

    /* renamed from: Z */
    final C3597rk f11702Z;

    /* renamed from: a */
    private final C3523pg f11703a;

    /* renamed from: a0 */
    private InterfaceC3742up f11704a0;

    /* renamed from: b */
    private InterfaceC3248j9 f11705b;

    /* renamed from: f */
    private String f11709f;

    /* renamed from: g */
    private String f11710g;

    /* renamed from: h */
    private final C3146gb f11711h;

    /* renamed from: i */
    private boolean f11712i;

    /* renamed from: j */
    private p f11713j;

    /* renamed from: k */
    private boolean f11714k;

    /* renamed from: l */
    private CountDownTimer f11715l;

    /* renamed from: m */
    public CountDownTimer f11716m;

    /* renamed from: q */
    private final o f11720q;

    /* renamed from: r */
    private View f11721r;

    /* renamed from: s */
    private FrameLayout f11722s;

    /* renamed from: t */
    private WebChromeClient.CustomViewCallback f11723t;

    /* renamed from: u */
    private FrameLayout f11724u;

    /* renamed from: v */
    private u f11725v;

    /* renamed from: w */
    private String f11726w;

    /* renamed from: x */
    private InterfaceC3829x9 f11727x;

    /* renamed from: y */
    private InterfaceC3795w9 f11728y;

    /* renamed from: z */
    private InterfaceC3761v9 f11729z;

    /* renamed from: c */
    private String f11706c = "v";

    /* renamed from: d */
    private String f11707d = "IronSource";

    /* renamed from: e */
    private final String f11708e = "We're sorry, some error occurred. we will investigate it";

    /* renamed from: n */
    private int f11717n = 50;

    /* renamed from: o */
    private int f11718o = 50;

    /* renamed from: p */
    private String f11719p = C3034d9.e.f7987b;

    /* renamed from: E */
    private Object f11681E = new Object();

    /* renamed from: F */
    private boolean f11682F = false;

    /* renamed from: X */
    private final InterfaceC3767vf f11700X = C3495on.m11199U().mo8686f();

    /* renamed from: com.ironsource.sdk.controller.v$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3657v.this.m12193a(1);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3454nh f11731a;

        public b(C3454nh c3454nh) {
            this.f11731a = c3454nh;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3657v.this.f11693Q.mo11933b("controller html - failed to download - " + this.f11731a.m10992b());
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$c */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11733a;

        public c(Context context) {
            this.f11733a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3657v.this.m12146e(this.f11733a);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$d */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11735a;

        public d(Context context) {
            this.f11735a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3657v.this.m12152f(this.f11735a);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$e */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3419mh.e f11737a;

        /* renamed from: b */
        final /* synthetic */ String f11738b;

        public e(C3419mh.e eVar, String str) {
            this.f11737a = eVar;
            this.f11738b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3726u9 interfaceC3726u9M12097a;
            C3419mh.e eVar = this.f11737a;
            if ((eVar == C3419mh.e.RewardedVideo || eVar == C3419mh.e.Interstitial) && (interfaceC3726u9M12097a = C3657v.this.m12097a(eVar)) != null) {
                interfaceC3726u9M12097a.mo8347a(this.f11737a, this.f11738b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$f */
    public class f extends AbstractC3828x8 {
        public f(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.AbstractC3828x8, com.ironsource.InterfaceC3557qf
        /* renamed from: a */
        public void mo11554a() {
            if (C3657v.this.f11712i) {
                C3657v.this.m12221m("none");
            }
        }

        @Override // com.ironsource.AbstractC3828x8, com.ironsource.InterfaceC3557qf
        /* renamed from: b */
        public void mo11556b(String str, JSONObject jSONObject) throws JSONException {
            if (jSONObject == null || !C3657v.this.f11712i) {
                return;
            }
            try {
                jSONObject.put(C3034d9.i.f8208t, str);
                C3657v.this.m12217e(jSONObject);
            } catch (JSONException e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.AbstractC3828x8, com.ironsource.InterfaceC3557qf
        /* renamed from: a */
        public void mo11555a(String str, JSONObject jSONObject) {
            if (C3657v.this.f11712i) {
                C3657v.this.m12221m(str);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$g */
    public class g implements InterfaceC3715tx {
        public g() {
        }

        @Override // com.ironsource.InterfaceC3715tx
        /* renamed from: a */
        public void mo12234a(String str, JSONObject jSONObject) {
            C3657v.this.m12160i(C3657v.this.m12145e(str, jSONObject.toString()));
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$h */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f11742a;

        /* renamed from: b */
        final /* synthetic */ WebView f11743b;

        /* renamed from: c */
        final /* synthetic */ String f11744c;

        public h(JSONObject jSONObject, WebView webView, String str) {
            this.f11742a = jSONObject;
            this.f11743b = webView;
            this.f11744c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3657v.this.m12119a(this.f11742a, this.f11743b);
            C3657v.this.m12165l("about:blank");
            C3657v.this.m12165l(this.f11744c);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$i */
    public class i extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ int f11746a;

        /* renamed from: com.ironsource.sdk.controller.v$i$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3657v.this.f11693Q.mo11933b(C3034d9.c.f7956j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j, long j2, int i) {
            super(j, j2);
            this.f11746a = i;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.m12266i(C3657v.this.f11706c, "Loading Controller Timer Finish");
            int i = this.f11746a;
            if (i == 3) {
                C3657v.this.m12211b(new a());
            } else {
                C3657v.this.m12193a(i + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Logger.m12266i(C3657v.this.f11706c, "Loading Controller Timer Tick " + j);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$j */
    public class j implements s {
        public j() {
        }

        @Override // com.ironsource.sdk.controller.C3657v.s
        /* renamed from: a */
        public void mo12235a(String str, C3419mh.e eVar, C3762va c3762va) {
            C3657v.this.m12116a(str, eVar, c3762va);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$k */
    public class k implements s {
        public k() {
        }

        @Override // com.ironsource.sdk.controller.C3657v.s
        /* renamed from: a */
        public void mo12235a(String str, C3419mh.e eVar, C3762va c3762va) {
            C3657v.this.m12116a(str, eVar, c3762va);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$l */
    public class l implements s {
        public l() {
        }

        @Override // com.ironsource.sdk.controller.C3657v.s
        /* renamed from: a */
        public void mo12235a(String str, C3419mh.e eVar, C3762va c3762va) {
            C3657v.this.m12116a(str, eVar, c3762va);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$m */
    public class m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3419mh.e f11752a;

        /* renamed from: b */
        final /* synthetic */ C3762va f11753b;

        /* renamed from: c */
        final /* synthetic */ String f11754c;

        public m(C3419mh.e eVar, C3762va c3762va, String str) {
            this.f11752a = eVar;
            this.f11753b = c3762va;
            this.f11754c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3762va c3762va;
            C3419mh.e eVar = C3419mh.e.RewardedVideo;
            C3419mh.e eVar2 = this.f11752a;
            if ((eVar != eVar2 && C3419mh.e.Interstitial != eVar2 && C3419mh.e.Banner != eVar2) || (c3762va = this.f11753b) == null || TextUtils.isEmpty(c3762va.m12764h())) {
                return;
            }
            InterfaceC3726u9 interfaceC3726u9M12097a = C3657v.this.m12097a(this.f11752a);
            Log.d(C3657v.this.f11706c, "onAdProductInitFailed (message:" + this.f11754c + ")(" + this.f11752a + ")");
            if (interfaceC3726u9M12097a != null) {
                interfaceC3726u9M12097a.mo8349a(this.f11752a, this.f11753b.m12764h(), this.f11754c);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$n */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3657v.this.m12193a(1);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$o */
    public class o extends WebChromeClient {
        private o() {
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(C3657v.this.f11702Z.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.m12266i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new q(C3657v.this, null));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.m12266i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Logger.m12266i("Test", "onHideCustomView");
            if (C3657v.this.f11721r == null) {
                return;
            }
            C3657v.this.f11721r.setVisibility(8);
            C3657v.this.f11722s.removeView(C3657v.this.f11721r);
            C3657v.this.f11721r = null;
            C3657v.this.f11722s.setVisibility(8);
            C3657v.this.f11723t.onCustomViewHidden();
            C3657v.this.f11702Z.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.m12266i("Test", "onShowCustomView");
            C3657v.this.f11702Z.setVisibility(8);
            if (C3657v.this.f11721r != null) {
                Logger.m12266i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.m12266i("Test", "mCustomView == null");
            C3657v.this.f11722s.addView(view);
            C3657v.this.f11721r = view;
            C3657v.this.f11723t = customViewCallback;
            C3657v.this.f11722s.setVisibility(0);
        }

        public /* synthetic */ o(C3657v c3657v, f fVar) {
            this();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$p */
    public static class p {

        /* renamed from: a */
        C3419mh.e f11758a;

        /* renamed from: b */
        String f11759b;

        public p(C3419mh.e eVar, String str) {
            this.f11758a = eVar;
            this.f11759b = str;
        }

        /* renamed from: a */
        public String m12236a() {
            return this.f11759b;
        }

        /* renamed from: b */
        public C3419mh.e m12237b() {
            return this.f11758a;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$q */
    public class q extends WebViewClient {
        private q() {
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.m12264e(C3657v.this.f11706c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context contextM12224q = C3657v.this.m12224q();
            contextM12224q.startActivity(new OpenUrlActivity.C3635e(new InterfaceC3646k.b()).m11922a(str).m11924b(false).m11920a(contextM12224q));
            return true;
        }

        public /* synthetic */ q(C3657v c3657v, f fVar) {
            this();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$r */
    public class r {

        /* renamed from: com.ironsource.sdk.controller.v$r$a */
        public class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11762a;

            /* renamed from: b */
            final /* synthetic */ String f11763b;

            public a(String str, String str2) {
                this.f11762a = str;
                this.f11763b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f11762a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(C3657v.this.f11706c, "onRVShowFail(message:" + this.f11762a + ")");
                C3657v.this.f11727x.mo8375d(this.f11763b, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$b */
        public class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11765a;

            public b(String str) {
                this.f11765a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(C3657v.this.f11706c, "onInterstitialInitSuccess()");
                C3657v.this.f11728y.mo8348a(C3419mh.e.Interstitial, this.f11765a, (C3822x2) null);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$c */
        public class c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11767a;

            /* renamed from: b */
            final /* synthetic */ String f11768b;

            public c(String str, String str2) {
                this.f11767a = str;
                this.f11768b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f11767a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(C3657v.this.f11706c, "onInterstitialInitFail(message:" + str + ")");
                C3657v.this.f11728y.mo8349a(C3419mh.e.Interstitial, this.f11768b, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$d */
        public class d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC3726u9 f11770a;

            /* renamed from: b */
            final /* synthetic */ C3419mh.e f11771b;

            /* renamed from: c */
            final /* synthetic */ String f11772c;

            public d(InterfaceC3726u9 interfaceC3726u9, C3419mh.e eVar, String str) {
                this.f11770a = interfaceC3726u9;
                this.f11771b = eVar;
                this.f11772c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f11770a.mo8370c(this.f11771b, this.f11772c);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$e */
        public class e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11774a;

            /* renamed from: b */
            final /* synthetic */ JSONObject f11775b;

            public e(String str, JSONObject jSONObject) {
                this.f11774a = str;
                this.f11775b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                C3657v.this.f11728y.mo8358a(this.f11774a, this.f11775b);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$f */
        public class f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11777a;

            /* renamed from: b */
            final /* synthetic */ String f11778b;

            public f(String str, String str2) {
                this.f11777a = str;
                this.f11778b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f11777a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                C3657v.this.f11728y.mo8372c(this.f11778b, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$g */
        public class g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11780a;

            public g(String str) {
                this.f11780a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(C3657v.this.f11706c, "onBannerInitSuccess()");
                C3657v.this.f11729z.mo8348a(C3419mh.e.Banner, this.f11780a, (C3822x2) null);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$h */
        public class h implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11782a;

            /* renamed from: b */
            final /* synthetic */ String f11783b;

            public h(String str, String str2) {
                this.f11782a = str;
                this.f11783b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f11782a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(C3657v.this.f11706c, "onBannerInitFail(message:" + str + ")");
                C3657v.this.f11729z.mo8349a(C3419mh.e.Banner, this.f11783b, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$i */
        public class i implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11785a;

            /* renamed from: b */
            final /* synthetic */ C3042dh f11786b;

            public i(String str, C3042dh c3042dh) {
                this.f11785a = str;
                this.f11786b = c3042dh;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(C3657v.this.f11706c, "onBannerLoadSuccess()");
                C3657v.this.f11729z.mo8353a(this.f11785a, this.f11786b);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$j */
        public class j implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11788a;

            /* renamed from: b */
            final /* synthetic */ String f11789b;

            public j(String str, String str2) {
                this.f11788a = str;
                this.f11789b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(C3657v.this.f11706c, "onLoadBannerFail()");
                String str = this.f11788a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                C3657v.this.f11729z.mo8354a(this.f11789b, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$k */
        public class k implements Runnable {
            public k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3657v.this.m12191F();
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$l */
        public class l implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11792a;

            public l(String str) {
                this.f11792a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (new JSONObject(this.f11792a).has(InterfaceC3641f.b.f11531b)) {
                        C3657v.this.f11696T.mo11066a(InterfaceC3641f.a.m12008a(this.f11792a));
                    } else {
                        C3657v.this.f11697U.mo11067a(C3565qn.m11589a(this.f11792a));
                    }
                } catch (JSONException e) {
                    C3551q9.m11517d().m11519a(e);
                    Logger.m12264e(C3657v.this.f11706c, "failed to parse received message");
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$m */
        public class m implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C3419mh.e f11794a;

            /* renamed from: b */
            final /* synthetic */ String f11795b;

            /* renamed from: c */
            final /* synthetic */ String f11796c;

            /* renamed from: d */
            final /* synthetic */ JSONObject f11797d;

            public m(C3419mh.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f11794a = eVar;
                this.f11795b = str;
                this.f11796c = str2;
                this.f11797d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC3726u9 interfaceC3726u9M12097a;
                C3419mh.e eVar = this.f11794a;
                if ((eVar == C3419mh.e.Interstitial || eVar == C3419mh.e.RewardedVideo || eVar == C3419mh.e.Banner) && (interfaceC3726u9M12097a = C3657v.this.m12097a(eVar)) != null) {
                    interfaceC3726u9M12097a.mo8350a(this.f11794a, this.f11795b, this.f11796c, this.f11797d);
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$n */
        public class n implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11799a;

            public n(String str) {
                this.f11799a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.m12266i(C3657v.this.f11706c, "omidAPI(" + this.f11799a + ")");
                    C3657v.this.f11684H.m12052a(new C3233is(this.f11799a).toString(), r.this.new w());
                } catch (Exception e) {
                    C3551q9.m11517d().m11519a(e);
                    IronLog.INTERNAL.error(e.toString());
                    Logger.m12266i(C3657v.this.f11706c, "omidAPI failed with exception " + e.getMessage());
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$o */
        public class o implements Runnable {
            public o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3657v.this.m12187B();
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$p */
        public class p implements Runnable {
            public p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3657v.this.f11702Z.removeJavascriptInterface(C3034d9.f7894e);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$q */
        public class q implements Runnable {
            public q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3657v.this.f11702Z.getSettings().setMixedContentMode(0);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$r */
        public class RunnableC4586r implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f11804a;

            /* renamed from: b */
            final /* synthetic */ String f11805b;

            /* renamed from: c */
            final /* synthetic */ C3822x2 f11806c;

            public RunnableC4586r(int i, String str, C3822x2 c3822x2) {
                this.f11804a = i;
                this.f11805b = str;
                this.f11806c = c3822x2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f11804a <= 0) {
                    C3657v.this.f11727x.mo8371c(this.f11805b);
                } else {
                    Log.d(C3657v.this.f11706c, "onRVInitSuccess()");
                    C3657v.this.f11727x.mo8348a(C3419mh.e.RewardedVideo, this.f11805b, this.f11806c);
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$s */
        public class s implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11808a;

            public s(String str) {
                this.f11808a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C3657v.this.f11689M.m12047a(new JSONObject(this.f11808a), r.this.new w());
                } catch (Exception e) {
                    C3551q9.m11517d().m11519a(e);
                    IronLog.INTERNAL.error(e.toString());
                    Logger.m12266i(C3657v.this.f11706c, "fileSystemAPI failed with exception " + e.getMessage());
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$t */
        public class t implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11810a;

            /* renamed from: b */
            final /* synthetic */ String f11811b;

            /* renamed from: c */
            final /* synthetic */ int f11812c;

            public t(String str, String str2, int i) {
                this.f11810a = str;
                this.f11811b = str2;
                this.f11812c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f11810a.equalsIgnoreCase(C3419mh.e.RewardedVideo.toString())) {
                    C3657v.this.f11727x.mo8352a(this.f11811b, this.f11812c);
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$u */
        public class u implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11814a;

            /* renamed from: b */
            final /* synthetic */ int f11815b;

            public u(String str, int i) {
                this.f11814a = str;
                this.f11815b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                C3657v.this.f11728y.onInterstitialAdRewarded(this.f11814a, this.f11815b);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$v */
        public class v implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f11817a;

            /* renamed from: b */
            final /* synthetic */ String f11818b;

            public v(String str, String str2) {
                this.f11817a = str;
                this.f11818b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f11817a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(C3657v.this.f11706c, "onRVInitFail(message:" + str + ")");
                C3657v.this.f11727x.mo8349a(C3419mh.e.RewardedVideo, this.f11818b, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$w */
        public class w implements InterfaceC3874yk {
            public w() {
            }

            @Override // com.ironsource.InterfaceC3874yk
            /* renamed from: a */
            public void mo12251a(boolean z, String str, C3233is c3233is) throws JSONException {
                c3233is.m9391b(z ? C3657v.f11675g0 : C3657v.f11676h0, str);
                C3657v.this.m12118a(c3233is.toString(), z, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC3874yk
            /* renamed from: a */
            public void mo12252a(boolean z, String str, String str2) throws JSONException {
                C3233is c3233is = new C3233is();
                c3233is.m9391b(z ? C3657v.f11675g0 : C3657v.f11676h0, str);
                c3233is.m9391b("data", str2);
                C3657v.this.m12118a(c3233is.toString(), z, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC3874yk
            /* renamed from: a */
            public void mo12253a(boolean z, String str, JSONObject jSONObject) throws JSONException {
                String str2;
                try {
                    if (z) {
                        str2 = C3657v.f11675g0;
                    } else {
                        str2 = C3657v.f11676h0;
                    }
                    jSONObject.put(str2, str);
                    C3657v.this.m12118a(jSONObject.toString(), z, (String) null, (String) null);
                } catch (JSONException e) {
                    C3551q9.m11517d().m11519a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        public r() {
        }

        /* renamed from: a */
        private void m12238a(String str, int i2) {
            C3762va c3762vaM12850a;
            C3657v c3657v = C3657v.this;
            C3419mh.e eVar = C3419mh.e.Interstitial;
            if (c3657v.m12176q(eVar.toString()) && (c3762vaM12850a = C3657v.this.f11683G.m12850a(eVar, str)) != null && c3762vaM12850a.m12767k()) {
                C3657v.this.m12211b(new u(str, i2));
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m12245b(String str) {
            try {
                C3545q3.a aVarM11476a = C3657v.this.f11690N.m11476a(C3657v.this.f11702Z.getContext(), InterfaceC3615s3.m11798a(str));
                C3657v.this.m12160i(C3657v.this.m12145e(aVarM11476a.m11484f(), aVarM11476a.m11487i().toString()));
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.m12266i(C3657v.this.f11706c, "adClicked(" + str + ")");
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d(C3034d9.h.f8117m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            C3419mh.e eVarM12154g = C3657v.this.m12154g(strM9393d);
            InterfaceC3726u9 interfaceC3726u9M12097a = C3657v.this.m12097a(eVarM12154g);
            if (eVarM12154g == null || interfaceC3726u9M12097a == null) {
                return;
            }
            C3657v.this.m12211b(new d(interfaceC3726u9M12097a, eVarM12154g, strFetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            Log.d(C3657v.this.f11707d, "adCredited(" + str + ")");
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d(C3034d9.h.f8113k);
            int i2 = strM9393d != null ? Integer.parseInt(strM9393d) : 0;
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            String strM9393d2 = c3233is.m9393d(C3034d9.h.f8117m);
            if (TextUtils.isEmpty(strM9393d2)) {
                Log.d(C3657v.this.f11707d, "adCredited | product type is missing");
            }
            if (C3419mh.e.Interstitial.toString().equalsIgnoreCase(strM9393d2)) {
                m12238a(strFetchDemandSourceId, i2);
            } else if (C3657v.this.m12176q(strM9393d2)) {
                C3657v.this.m12211b(new t(strM9393d2, strFetchDemandSourceId, i2));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) throws NumberFormatException {
            Logger.m12266i(C3657v.this.f11706c, "adUnitsReady(" + str + ")");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C3233is(str));
            C3822x2 c3822x2 = new C3822x2(str);
            if (!c3822x2.m13001g()) {
                C3657v.this.m12118a(str, false, C3034d9.c.f7964r, (String) null);
                return;
            }
            C3657v.this.m12118a(str, true, (String) null, (String) null);
            String strM12997d = c3822x2.m12997d();
            if (C3419mh.e.RewardedVideo.toString().equalsIgnoreCase(strM12997d) && C3657v.this.m12176q(strM12997d)) {
                C3657v.this.m12211b(new RunnableC4586r(Integer.parseInt(c3822x2.m12996c()), strFetchDemandSourceId, c3822x2));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                Logger.m12266i(C3657v.this.f11706c, "adViewAPI(" + str + ")");
                C3657v.this.f11688L.m11928a(new C3233is(str).toString(), new w());
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.m12266i(C3657v.this.f11706c, "adViewAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void androidSandboxApi(String str) {
            C3523pg.f10822a.m11399b(new OooO0Oo.OooO0O0(20, this, str));
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.m12266i(C3657v.this.f11706c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        /* renamed from: c */
        public void m12249c(String str) {
            C3657v.this.m12160i(C3657v.this.m12105a(C3034d9.g.f8028d, str, (String) null, (String) null));
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C3419mh.e eVarM12154g;
            try {
                Logger.m12266i(C3657v.this.f11706c, "cleanAdInstance(" + str + ")");
                C3233is c3233is = new C3233is(str);
                String strM9393d = c3233is.m9393d(C3034d9.h.f8117m);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
                if (TextUtils.isEmpty(strFetchDemandSourceId) || (eVarM12154g = C3657v.this.m12154g(strM9393d)) == null) {
                    return;
                }
                C3657v.this.f11683G.m12853b(eVarM12154g, strFetchDemandSourceId);
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                C3657v.this.m12118a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> arrayListM11419a = C3527pk.m11417e().m11419a();
                C3233is c3233is = new C3233is(str);
                if (!arrayListM11419a.isEmpty()) {
                    c3233is.m9391b(C3034d9.h.f8140x0, arrayListM11419a.toString());
                }
                C3657v.this.m12118a(c3233is.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                C3657v.this.m12118a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* renamed from: d */
        public void m12250d(String str) {
            C3657v.this.m12160i(C3657v.this.m12105a(C3034d9.g.f8030e, str, (String) null, (String) null));
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            C3657v c3657v;
            String str2;
            try {
                Logger.m12266i(C3657v.this.f11706c, "deleteFile(" + str + ")");
                C3233is c3233is = new C3233is(str);
                String strM9393d = c3233is.m9393d("file");
                String strM9393d2 = c3233is.m9393d("path");
                if (strM9393d2 == null || TextUtils.isEmpty(strM9393d)) {
                    c3657v = C3657v.this;
                    str2 = C3034d9.c.f7953g;
                } else {
                    C3769vh c3769vh = new C3769vh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C3657v.this.f11677A, strM9393d2), strM9393d);
                    IronSourceStorageUtils.ensurePathSafety(c3769vh, C3657v.this.f11677A);
                    if (c3769vh.exists()) {
                        C3657v.this.m12118a(str, IronSourceStorageUtils.deleteFile(c3769vh), (String) null, (String) null);
                        return;
                    } else {
                        c3657v = C3657v.this;
                        str2 = C3034d9.c.f7952f;
                    }
                }
                c3657v.m12118a(str, false, str2, "1");
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                C3657v.this.m12118a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            C3657v c3657v;
            String str2;
            try {
                Logger.m12266i(C3657v.this.f11706c, "deleteFolder(" + str + ")");
                String strM9393d = new C3233is(str).m9393d("path");
                if (strM9393d == null) {
                    c3657v = C3657v.this;
                    str2 = C3034d9.c.f7953g;
                } else {
                    C3769vh c3769vh = new C3769vh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C3657v.this.f11677A, strM9393d));
                    IronSourceStorageUtils.ensurePathSafety(c3769vh, C3657v.this.f11677A);
                    if (c3769vh.exists()) {
                        C3657v.this.m12118a(str, IronSourceStorageUtils.deleteFolder(c3769vh.getPath()), (String) null, (String) null);
                        return;
                    } else {
                        c3657v = C3657v.this;
                        str2 = C3034d9.c.f7951e;
                    }
                }
                c3657v.m12118a(str, false, str2, "1");
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                C3657v.this.m12118a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                Logger.m12266i(C3657v.this.f11706c, "deviceDataAPI(" + str + ")");
                C3657v.this.f11687K.m12038a(new C3233is(str).toString(), new w());
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.m12266i(C3657v.this.f11706c, "deviceDataAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            AbstractC2183w4.OooOOo0("displayWebView(", str, ")", C3657v.this.f11706c);
            C3657v.this.m12118a(str, true, (String) null, (String) null);
            C3233is c3233is = new C3233is(str);
            boolean zBooleanValue = ((Boolean) c3233is.m9390b(C3034d9.h.f8099d)).booleanValue();
            String strM9393d = c3233is.m9393d(C3034d9.h.f8117m);
            boolean zM9392c = c3233is.m9392c(C3034d9.h.f8133u);
            String strM9393d2 = c3233is.m9393d("adViewId");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            boolean zM9392c2 = c3233is.m9392c(C3034d9.h.f8144z0);
            if (!zBooleanValue) {
                C3657v.this.m12203a(u.Gone);
                C3657v.this.m12171o();
                return;
            }
            C3657v.this.f11682F = c3233is.m9392c(C3034d9.h.f8135v);
            boolean zM9392c3 = c3233is.m9392c(C3034d9.h.f8141y);
            u uVarM12229v = C3657v.this.m12229v();
            u uVar = u.Display;
            if (uVarM12229v == uVar) {
                Logger.m12266i(C3657v.this.f11706c, "State: " + C3657v.this.f11725v);
                return;
            }
            C3657v.this.m12203a(uVar);
            Logger.m12266i(C3657v.this.f11706c, "State: " + C3657v.this.f11725v);
            Context contextM12224q = C3657v.this.m12224q();
            String strM12227t = C3657v.this.m12227t();
            int iMo4831L = C3657v.this.f11700X.mo4831L(contextM12224q);
            if (zM9392c) {
                C3643h c3643h = new C3643h(contextM12224q);
                c3643h.addView(C3657v.this.f11724u);
                c3643h.m12035a(C3657v.this);
                return;
            }
            Intent intent = zM9392c3 ? new Intent(contextM12224q, (Class<?>) InterstitialActivity.class) : new Intent(contextM12224q, (Class<?>) ControllerActivity.class);
            C3419mh.e eVar = C3419mh.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(strM9393d)) {
                if ("application".equals(strM12227t)) {
                    strM12227t = SDKUtils.translateRequestedOrientation(C3657v.this.f11700X.mo4833N(contextM12224q));
                }
                intent.putExtra(C3034d9.h.f8117m, eVar.toString());
                C3657v.this.f11680D.m13125a(eVar.ordinal());
                C3657v.this.f11680D.m13141f(strFetchDemandSourceId);
                if (C3657v.this.m12176q(eVar.toString())) {
                    C3657v.this.f11727x.mo8364b(eVar, strFetchDemandSourceId);
                }
            } else {
                C3419mh.e eVar2 = C3419mh.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(strM9393d)) {
                    if ("application".equals(strM12227t)) {
                        strM12227t = SDKUtils.translateRequestedOrientation(C3657v.this.f11700X.mo4833N(contextM12224q));
                    }
                    intent.putExtra(C3034d9.h.f8117m, eVar2.toString());
                }
            }
            if (strM9393d2 != null) {
                intent.putExtra("adViewId", strM9393d2);
            }
            intent.putExtra(C3034d9.h.f8144z0, zM9392c2);
            intent.setFlags(536870912);
            intent.putExtra(C3034d9.h.f8135v, C3657v.this.f11682F);
            intent.putExtra(C3034d9.h.f8056A, strM12227t);
            intent.putExtra(C3034d9.h.f8058B, iMo4831L);
            C3657v c3657v = C3657v.this;
            c3657v.f11713j = new p(c3657v.m12154g(strM9393d), strFetchDemandSourceId);
            contextM12224q.startActivity(intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(String str) {
            try {
                Logger.m12266i(C3657v.this.f11706c, "dsSharedSignalsAPI(" + str + ")");
                C3657v.this.f11691O.m4807a(new C3233is(str).toString(), new w());
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.m12266i(C3657v.this.f11706c, "dsSharedSignalsAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            AbstractC2183w4.OooOOo0("fileSystemAPI(", str, ")", C3657v.this.f11706c);
            C3657v.this.m12207a(new s(str));
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void getApplicationInfo(java.lang.String r5) throws org.json.JSONException {
            /*
                r4 = this;
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.C3657v.this
                java.lang.String r0 = com.ironsource.sdk.controller.C3657v.m12079A(r0)
                java.lang.String r1 = "getApplicationInfo("
                java.lang.String r2 = ")"
                com.google.android.gms.internal.ads.AbstractC2183w4.OooOOo0(r1, r5, r2, r0)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.C3657v.this
                java.lang.String r0 = com.ironsource.sdk.controller.C3657v.m12100a(r0, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.C3657v.this
                java.lang.String r1 = com.ironsource.sdk.controller.C3657v.m12125b(r1, r5)
                com.ironsource.is r2 = new com.ironsource.is
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.m9393d(r5)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(r2)
                com.ironsource.sdk.controller.v r3 = com.ironsource.sdk.controller.C3657v.this
                java.lang.Object[] r5 = com.ironsource.sdk.controller.C3657v.m12122a(r3, r5, r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L46
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L4d
                r0 = r1
                goto L4e
            L46:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L4d
                goto L4e
            L4d:
                r0 = 0
            L4e:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L63
                com.ironsource.sdk.controller.v r5 = com.ironsource.sdk.controller.C3657v.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.ironsource.sdk.controller.C3657v.m12101a(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.C3657v.this
                com.ironsource.sdk.controller.C3657v.m12147e(r0, r5)
            L63:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C3657v.r.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) throws JSONException {
            AbstractC2183w4.OooOOo0("getCachedFilesMap(", str, ")", C3657v.this.f11706c);
            String strM12144e = C3657v.this.m12144e(str);
            if (TextUtils.isEmpty(strM12144e)) {
                return;
            }
            C3233is c3233is = new C3233is(str);
            if (!c3233is.m9389a("path")) {
                C3657v.this.m12118a(str, false, C3034d9.c.f7965s, (String) null);
                return;
            }
            String str2 = (String) c3233is.m9390b("path");
            if (!IronSourceStorageUtils.isPathExist(C3657v.this.f11677A, str2)) {
                C3657v.this.m12118a(str, false, C3034d9.c.f7966t, (String) null);
                return;
            }
            C3657v.this.m12160i(C3657v.this.m12105a(strM12144e, IronSourceStorageUtils.getCachedFilesMap(C3657v.this.f11677A, str2), C3034d9.g.f8045s, C3034d9.g.f8044r));
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) throws JSONException {
            String strM12145e;
            Logger.m12266i(C3657v.this.f11706c, "getConnectivityInfo(" + str + ")");
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d(C3657v.f11675g0);
            String strM9393d2 = c3233is.m9393d(C3657v.f11676h0);
            JSONObject jSONObject = new JSONObject();
            if (C3657v.this.f11694R != null) {
                jSONObject = C3657v.this.f11694R.m13029a(C3657v.this.f11702Z.getContext());
            }
            if (jSONObject.length() > 0) {
                strM12145e = C3657v.this.m12145e(strM9393d, jSONObject.toString());
            } else {
                strM12145e = C3657v.this.m12145e(strM9393d2, C3657v.this.m12106a("errMsg", C3034d9.c.f7941A, null, null, null, null, null, null, null, false));
            }
            C3657v.this.m12160i(strM12145e);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) throws JSONException {
            Logger.m12266i(C3657v.this.f11706c, "getControllerConfig(" + str + ")");
            String strM9393d = new C3233is(str).m9393d(C3657v.f11675g0);
            if (TextUtils.isEmpty(strM9393d)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            m12247c(controllerConfigAsJSONObject);
            C3657v.this.m12160i(C3657v.this.m12145e(strM9393d, controllerConfigAsJSONObject.toString()));
        }

        @JavascriptInterface
        public void getDemandSourceState(String str) throws JSONException {
            String strM12140d;
            Logger.m12266i(C3657v.this.f11706c, "getMediationState(" + str + ")");
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d("demandSourceName");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            String strM9393d2 = c3233is.m9393d(C3034d9.h.f8117m);
            if (strM9393d2 == null || strM9393d == null) {
                return;
            }
            try {
                C3419mh.e productType = SDKUtils.getProductType(strM9393d2);
                if (productType != null) {
                    C3762va c3762vaM12850a = C3657v.this.f11683G.m12850a(productType, strFetchDemandSourceId);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C3034d9.h.f8117m, strM9393d2);
                    jSONObject.put("demandSourceName", strM9393d);
                    jSONObject.put("demandSourceId", strFetchDemandSourceId);
                    if (c3762vaM12850a == null || c3762vaM12850a.m12755a(-1)) {
                        strM12140d = C3657v.this.m12140d(str);
                    } else {
                        strM12140d = C3657v.this.m12144e(str);
                        jSONObject.put("state", c3762vaM12850a.m12766j());
                    }
                    m12239a(strM12140d, jSONObject.toString());
                }
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                C3657v.this.m12118a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void getDeviceStatus(java.lang.String r5) throws org.json.JSONException {
            /*
                r4 = this;
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.C3657v.this
                java.lang.String r0 = com.ironsource.sdk.controller.C3657v.m12079A(r0)
                java.lang.String r1 = "getDeviceStatus("
                java.lang.String r2 = ")"
                com.google.android.gms.internal.ads.AbstractC2183w4.OooOOo0(r1, r5, r2, r0)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.C3657v.this
                java.lang.String r0 = com.ironsource.sdk.controller.C3657v.m12100a(r0, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.C3657v.this
                java.lang.String r5 = com.ironsource.sdk.controller.C3657v.m12125b(r1, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.C3657v.this
                com.ironsource.rk r2 = r1.f11702Z
                android.content.Context r2 = r2.getContext()
                java.lang.Object[] r1 = com.ironsource.sdk.controller.C3657v.m12121a(r1, r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L3d
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L44
                r0 = r5
                goto L45
            L3d:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L44
                goto L45
            L44:
                r0 = 0
            L45:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L5a
                com.ironsource.sdk.controller.v r5 = com.ironsource.sdk.controller.C3657v.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.ironsource.sdk.controller.C3657v.m12101a(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.C3657v.this
                com.ironsource.sdk.controller.C3657v.m12147e(r0, r5)
            L5a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C3657v.r.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            AbstractC2183w4.OooOOo0("getDeviceVolume(", str, ")", C3657v.this.f11706c);
            try {
                Context context = C3657v.this.f11702Z.getContext();
                float fM13311a = C3898za.m13309b(context).m13311a(context);
                C3233is c3233is = new C3233is(str);
                c3233is.m9391b(C3034d9.i.f8161P, String.valueOf(fM13311a));
                C3657v.this.m12118a(c3233is.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) throws JSONException {
            Logger.m12266i(C3657v.this.f11706c, "getInitSummery(" + str + ")");
            C3233is c3233is = new C3233is(str);
            c3233is.m9388a(C3034d9.i.f8206r0, C3657v.this.f11695S);
            C3657v.this.m12118a(c3233is.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            C3699th.m12428a(C3198hs.f8941z, new C3489oh().m11155a(C3037dc.f8270y, str).m11156a());
            String strM12144e = C3657v.this.m12144e(str);
            String string = SDKUtils.getOrientation(C3657v.this.f11702Z.getContext()).toString();
            if (TextUtils.isEmpty(strM12144e)) {
                return;
            }
            C3657v.this.m12160i(C3657v.this.m12105a(strM12144e, string, C3034d9.g.f8022X, C3034d9.g.f8023Y));
        }

        @JavascriptInterface
        public void getUserData(String str) throws JSONException {
            Logger.m12266i(C3657v.this.f11706c, "getUserData(" + str + ")");
            C3233is c3233is = new C3233is(str);
            if (!c3233is.m9389a("key")) {
                C3657v.this.m12118a(str, false, C3034d9.c.f7946F, (String) null);
                return;
            }
            String strM12144e = C3657v.this.m12144e(str);
            String strM9393d = c3233is.m9393d("key");
            C3657v.this.m12160i(C3657v.this.m12145e(strM12144e, C3657v.this.m12106a(strM9393d, C3527pk.m11417e().m11418a(strM9393d), null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                Logger.m12266i(C3657v.this.f11706c, "iabTokenAPI(" + str + ")");
                C3657v.this.f11686J.m12077a(new C3233is(str).toString(), new w());
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.m12266i(C3657v.this.f11706c, "iabTokenAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.m12266i(C3657v.this.f11706c, "initController(" + str + ")");
            C3233is c3233is = new C3233is(str);
            CountDownTimer countDownTimer = C3657v.this.f11716m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                C3657v.this.f11716m = null;
            }
            if (c3233is.m9389a(C3034d9.h.f8125q)) {
                String strM9393d = c3233is.m9393d(C3034d9.h.f8125q);
                if (C3034d9.h.f8129s.equalsIgnoreCase(strM9393d)) {
                    C3657v.this.f11712i = true;
                    C3657v.this.f11693Q.mo11934c();
                } else if (C3034d9.h.f8127r.equalsIgnoreCase(strM9393d)) {
                    C3657v.this.f11693Q.mo11932b();
                } else if (!C3034d9.h.f8131t.equalsIgnoreCase(strM9393d)) {
                    Logger.m12266i(C3657v.this.f11706c, "No STAGE mentioned! should not get here!");
                } else {
                    C3657v.this.f11693Q.mo11933b(OooOo.OooOO0("controller js failed to initialize : ", c3233is.m9393d("errMsg")));
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            C3657v.this.m12213c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            AbstractC2183w4.OooOOo0("onAdWindowsClosed(", str, ")", C3657v.this.f11706c);
            C3657v.this.f11680D.m13124a();
            C3657v.this.f11680D.m13141f(null);
            C3657v.this.f11713j = null;
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d(C3034d9.h.f8117m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            C3419mh.e eVarM12154g = C3657v.this.m12154g(strM9393d);
            Log.d(C3657v.this.f11707d, "onAdClosed() with type " + eVarM12154g);
            if (C3657v.this.m12176q(strM9393d)) {
                C3657v.this.m12195a(eVarM12154g, strFetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            Logger.m12266i(C3657v.this.f11706c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            AbstractC2183w4.OooOOo0("onGetApplicationInfoFail(", str, ")", C3657v.this.f11706c);
            C3657v.this.m12118a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            AbstractC2183w4.OooOOo0("onGetApplicationInfoSuccess(", str, ")", C3657v.this.f11706c);
            C3657v.this.m12118a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            AbstractC2183w4.OooOOo0("onGetCachedFilesMapFail(", str, ")", C3657v.this.f11706c);
            C3657v.this.m12118a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            AbstractC2183w4.OooOOo0("onGetCachedFilesMapSuccess(", str, ")", C3657v.this.f11706c);
            C3657v.this.m12118a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            AbstractC2183w4.OooOOo0("onGetDeviceStatusFail(", str, ")", C3657v.this.f11706c);
            C3657v.this.m12118a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            AbstractC2183w4.OooOOo0("onGetDeviceStatusSuccess(", str, ")", C3657v.this.f11706c);
            C3657v.this.m12118a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.m12266i(C3657v.this.f11706c, "onInitBannerFail(" + str + ")");
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.m12266i(C3657v.this.f11706c, "onInitBannerFail failed with no demand source");
                return;
            }
            C3796wa c3796wa = C3657v.this.f11683G;
            C3419mh.e eVar = C3419mh.e.Banner;
            C3762va c3762vaM12850a = c3796wa.m12850a(eVar, strFetchDemandSourceId);
            if (c3762vaM12850a != null) {
                c3762vaM12850a.m12757b(3);
            }
            if (C3657v.this.m12176q(eVar.toString())) {
                C3657v.this.m12211b(new h(strM9393d, strFetchDemandSourceId));
            }
            C3657v.this.m12118a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.m12266i(C3657v.this.f11706c, "onInitBannerSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C3233is(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.m12266i(C3657v.this.f11706c, "onInitBannerSuccess failed with no demand source");
            } else if (C3657v.this.m12176q(C3419mh.e.Banner.toString())) {
                C3657v.this.m12211b(new g(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.m12266i(C3657v.this.f11706c, "onInitInterstitialFail(" + str + ")");
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.m12266i(C3657v.this.f11706c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            C3796wa c3796wa = C3657v.this.f11683G;
            C3419mh.e eVar = C3419mh.e.Interstitial;
            C3762va c3762vaM12850a = c3796wa.m12850a(eVar, strFetchDemandSourceId);
            if (c3762vaM12850a != null) {
                c3762vaM12850a.m12757b(3);
            }
            if (C3657v.this.m12176q(eVar.toString())) {
                C3657v.this.m12211b(new c(strM9393d, strFetchDemandSourceId));
            }
            C3657v.this.m12118a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.m12266i(C3657v.this.f11706c, "onInitInterstitialSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C3233is(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.m12266i(C3657v.this.f11706c, "onInitInterstitialSuccess failed with no demand source");
            } else if (C3657v.this.m12176q(C3419mh.e.Interstitial.toString())) {
                C3657v.this.m12211b(new b(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.m12266i(C3657v.this.f11706c, "onInitRewardedVideoFail(" + str + ")");
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            C3796wa c3796wa = C3657v.this.f11683G;
            C3419mh.e eVar = C3419mh.e.RewardedVideo;
            C3762va c3762vaM12850a = c3796wa.m12850a(eVar, strFetchDemandSourceId);
            if (c3762vaM12850a != null) {
                c3762vaM12850a.m12757b(3);
            }
            if (C3657v.this.m12176q(eVar.toString())) {
                C3657v.this.m12211b(new v(strM9393d, strFetchDemandSourceId));
            }
            C3657v.this.m12118a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.m12266i(C3657v.this.f11706c, "onLoadBannerFail()");
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            C3657v.this.m12118a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(strFetchDemandSourceId) && C3657v.this.m12176q(C3419mh.e.Banner.toString())) {
                C3657v.this.m12211b(new j(strM9393d, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.m12266i(C3657v.this.f11706c, "onLoadBannerSuccess()");
            C3233is c3233is = new C3233is(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            String strM9393d = c3233is.m9393d("adViewId");
            C3657v.this.m12118a(str, true, (String) null, (String) null);
            InterfaceC3043di interfaceC3043diMo9491a = C3256jh.m9487a().mo9491a(strM9393d);
            if (interfaceC3043diMo9491a == null) {
                C3657v.this.f11729z.mo8354a(strFetchDemandSourceId, "not found view for the current adViewId= " + strM9393d);
                return;
            }
            if (interfaceC3043diMo9491a instanceof C3042dh) {
                C3042dh c3042dh = (C3042dh) interfaceC3043diMo9491a;
                if (C3657v.this.m12176q(C3419mh.e.Banner.toString())) {
                    C3657v.this.m12211b(new i(strFetchDemandSourceId, c3042dh));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.m12266i(C3657v.this.f11706c, "onLoadInterstitialFail(" + str + ")");
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            C3657v.this.m12118a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            m12240a(strFetchDemandSourceId, false);
            if (C3657v.this.m12176q(C3419mh.e.Interstitial.toString())) {
                C3657v.this.m12211b(new f(strM9393d, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.m12266i(C3657v.this.f11706c, "onLoadInterstitialSuccess(" + str + ")");
            C3233is c3233is = new C3233is(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            JSONObject jSONObjectM9387a = c3233is.m9387a();
            m12240a(strFetchDemandSourceId, true);
            C3657v.this.m12118a(str, true, (String) null, (String) null);
            if (C3657v.this.m12176q(C3419mh.e.Interstitial.toString())) {
                C3657v.this.m12211b(new e(strFetchDemandSourceId, jSONObjectM9387a));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            AbstractC2183w4.OooOOo0("onReceivedMessage(", str, ")", C3657v.this.f11706c);
            C3523pg.f10822a.m11399b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.m12266i(C3657v.this.f11706c, "onShowInterstitialFail(" + str + ")");
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            C3657v.this.m12118a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            C3657v.this.m12211b(new o0000O0(this, C3657v.this.m12176q(C3419mh.e.Interstitial.toString()), strM9393d, strFetchDemandSourceId));
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            AbstractC2183w4.OooOOo0("onShowInterstitialSuccess(", str, ")", C3657v.this.f11706c);
            C3657v.this.m12118a(str, true, (String) null, (String) null);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C3233is(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.m12266i(C3657v.this.f11706c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C3856y2 c3856y2 = C3657v.this.f11680D;
            C3419mh.e eVar = C3419mh.e.Interstitial;
            c3856y2.m13125a(eVar.ordinal());
            C3657v.this.f11680D.m13141f(strFetchDemandSourceId);
            C3657v.this.m12211b(new o0OoOo0(this, C3657v.this.m12176q(eVar.toString()), strFetchDemandSourceId, 4));
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.m12266i(C3657v.this.f11706c, "onShowRewardedVideoFail(" + str + ")");
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
            if (C3657v.this.m12176q(C3419mh.e.RewardedVideo.toString())) {
                C3657v.this.m12211b(new a(strM9393d, strFetchDemandSourceId));
            }
            C3657v.this.m12118a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            AbstractC2183w4.OooOOo0("onShowRewardedVideoSuccess(", str, ")", C3657v.this.f11706c);
            C3657v.this.m12118a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            Log.d(C3657v.this.f11706c, "onVideoStatusChanged(" + str + ")");
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d(C3034d9.h.f8117m);
            if (C3657v.this.f11679C == null || TextUtils.isEmpty(strM9393d)) {
                return;
            }
            String strM9393d2 = c3233is.m9393d("status");
            if (C3034d9.h.f8100d0.equalsIgnoreCase(strM9393d2)) {
                C3657v.this.f11679C.onVideoStarted();
                return;
            }
            if (C3034d9.h.f8102e0.equalsIgnoreCase(strM9393d2)) {
                C3657v.this.f11679C.onVideoPaused();
                return;
            }
            if (C3034d9.h.f8104f0.equalsIgnoreCase(strM9393d2)) {
                C3657v.this.f11679C.onVideoResumed();
                return;
            }
            if (C3034d9.h.f8106g0.equalsIgnoreCase(strM9393d2)) {
                C3657v.this.f11679C.onVideoEnded();
                return;
            }
            if (C3034d9.h.f8108h0.equalsIgnoreCase(strM9393d2)) {
                C3657v.this.f11679C.onVideoStopped();
                return;
            }
            Logger.m12266i(C3657v.this.f11706c, "onVideoStatusChanged: unknown status: " + strM9393d2);
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                Logger.m12266i(C3657v.this.f11706c, "openUrl(" + str + ")");
                C3233is c3233is = new C3233is(str);
                InterfaceC3651p.c cVarMo12053a = new InterfaceC3651p.a(c3233is.m9393d("method"), new C3811wp(C3657v.this.f11682F, 805306368)).mo12053a(c3233is.m9392c(C3034d9.h.f8079L0) ? C3657v.this.f11702Z.getContext() : C3657v.this.m12224q(), new C3777vp(c3233is.m9393d("url"), c3233is.m9393d(C3034d9.h.f8089V)));
                if (cVarMo12053a instanceof InterfaceC3651p.c.a) {
                    C3657v.this.m12118a(str, false, ((InterfaceC3651p.c.a) cVarMo12053a).m12058b(), (String) null);
                } else {
                    C3657v.this.m12118a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                C3657v.this.m12118a(str, false, e2.getLocalizedMessage(), (String) null);
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            C3657v.this.m12213c(new o());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            try {
                Logger.m12266i(C3657v.this.f11706c, "permissionsAPI(" + str + ")");
                C3657v.this.f11685I.m12060a(new C3233is(str).toString(), new w());
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.m12266i(C3657v.this.f11706c, "permissionsAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            Exception exc;
            String str2;
            try {
                Logger.m12266i(C3657v.this.f11706c, "postAdEventNotification(" + str + ")");
                C3233is c3233is = new C3233is(str);
                String strM9393d = c3233is.m9393d("eventName");
                try {
                    if (TextUtils.isEmpty(strM9393d)) {
                        C3657v.this.m12118a(str, false, C3034d9.c.f7969w, (String) null);
                        return;
                    }
                    String strM9393d2 = c3233is.m9393d(C3034d9.h.f8114k0);
                    String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3233is);
                    String str3 = !TextUtils.isEmpty(strFetchDemandSourceId) ? strFetchDemandSourceId : strM9393d2;
                    JSONObject jSONObject = (JSONObject) c3233is.m9390b(C3034d9.h.f8116l0);
                    String strM9393d3 = c3233is.m9393d(C3034d9.h.f8117m);
                    C3419mh.e eVarM12154g = C3657v.this.m12154g(strM9393d3);
                    try {
                        if (!C3657v.this.m12176q(strM9393d3)) {
                            C3657v.this.m12118a(str, false, C3034d9.c.f7968v, (String) null);
                            return;
                        }
                        String strM12144e = C3657v.this.m12144e(str);
                        if (TextUtils.isEmpty(strM12144e)) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            C3657v.this.m12160i(C3657v.this.m12105a(strM12144e, C3657v.this.m12106a(C3034d9.h.f8117m, strM9393d3, "eventName", strM9393d, "demandSourceName", strM9393d2, "demandSourceId", str2, null, false), C3034d9.g.f8027c0, C3034d9.g.f8029d0));
                        }
                        try {
                            C3657v.this.m12211b(new m(eVarM12154g, str2, strM9393d, jSONObject));
                        } catch (Exception e2) {
                            e = e2;
                            exc = e;
                            C3551q9.m11517d().m11519a(exc);
                            IronLog.INTERNAL.error(exc.toString());
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    C3551q9.m11517d().m11519a(exc);
                    IronLog.INTERNAL.error(exc.toString());
                }
            } catch (Exception e5) {
                e = e5;
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            AbstractC2183w4.OooOOo0("removeCloseEventHandler(", str, ")", C3657v.this.f11706c);
            if (C3657v.this.f11715l != null) {
                C3657v.this.f11715l.cancel();
            }
            C3657v.this.f11714k = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            C3657v.this.m12213c(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            Logger.m12266i(C3657v.this.f11706c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            C3657v.this.m12213c(new k());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            C3657v c3657v;
            String str2;
            try {
                Logger.m12266i(C3657v.this.f11706c, "saveFile(" + str + ")");
                C3233is c3233is = new C3233is(str);
                String strM9393d = c3233is.m9393d("path");
                String strM9393d2 = c3233is.m9393d("file");
                if (TextUtils.isEmpty(strM9393d2)) {
                    C3657v.this.m12118a(str, false, C3034d9.c.f7953g, "1");
                    return;
                }
                C3769vh c3769vh = new C3769vh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C3657v.this.f11677A, strM9393d), SDKUtils.getFileName(strM9393d2));
                IronSourceStorageUtils.ensurePathSafety(c3769vh, C3657v.this.f11677A);
                if (C3657v.this.f11700X.mo4835a(C3657v.this.f11677A) <= 0) {
                    c3657v = C3657v.this;
                    str2 = C3109f9.f8514A;
                } else if (c3769vh.exists()) {
                    c3657v = C3657v.this;
                    str2 = C3109f9.f8547z;
                } else {
                    if (C3896z8.m13306h(C3657v.this.f11702Z.getContext())) {
                        C3657v.this.m12118a(str, true, (String) null, (String) null);
                        C3657v.this.f11711h.mo8938a(c3769vh, strM9393d2, c3233is.m9384a("connectionTimeout", 0), c3233is.m9384a("readTimeout", 0));
                        return;
                    }
                    c3657v = C3657v.this;
                    str2 = C3109f9.f8516C;
                }
                c3657v.m12118a(str, false, str2, (String) null);
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                C3657v.this.m12118a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.m12266i(C3657v.this.f11706c, "setBackButtonState(" + str + ")");
            C3527pk.m11417e().m11424c(new C3233is(str).m9393d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.m12266i(C3657v.this.f11706c, "setForceClose(" + str + ")");
            C3233is c3233is = new C3233is(str);
            String strM9393d = c3233is.m9393d("width");
            String strM9393d2 = c3233is.m9393d("height");
            C3657v.this.f11717n = Integer.parseInt(strM9393d);
            C3657v.this.f11718o = Integer.parseInt(strM9393d2);
            C3657v.this.f11719p = c3233is.m9393d(C3034d9.h.f8078L);
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            AbstractC2183w4.OooOOo0("setMixedContentAlwaysAllow(", str, ")", C3657v.this.f11706c);
            C3657v.this.m12213c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.m12266i(C3657v.this.f11706c, "setOrientation(" + str + ")");
                String strM9393d = new C3233is(str).m9393d("orientation");
                C3657v.this.m12222n(strM9393d);
                if (C3657v.this.f11704a0 != null) {
                    C3657v.this.f11704a0.onOrientationChanged(strM9393d, C3657v.this.f11700X.mo4831L(C3657v.this.f11702Z.getContext()));
                }
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.m12266i(C3657v.this.f11706c, "setStoreSearchKeys(" + str + ")");
            C3527pk.m11417e().m11427e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) throws JSONException {
            Logger.m12266i(C3657v.this.f11706c, "setUserData(" + str + ")");
            C3233is c3233is = new C3233is(str);
            if (!c3233is.m9389a("key")) {
                C3657v.this.m12118a(str, false, C3034d9.c.f7946F, (String) null);
                return;
            }
            if (!c3233is.m9389a("value")) {
                C3657v.this.m12118a(str, false, C3034d9.c.f7947G, (String) null);
                return;
            }
            String strM9393d = c3233is.m9393d("key");
            String strM9393d2 = c3233is.m9393d("value");
            C3527pk.m11417e().m11420a(strM9393d, strM9393d2);
            C3657v.this.m12160i(C3657v.this.m12145e(C3657v.this.m12144e(str), C3657v.this.m12106a(strM9393d, strM9393d2, null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            AbstractC2183w4.OooOOo0("setWebviewBackgroundColor(", str, ")", C3657v.this.f11706c);
            C3657v.this.m12174p(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            AbstractC2183w4.OooOOo0("stillAlive(", str, ")", C3657v.this.f11706c);
            C3657v.this.f11705b.mo9467a();
        }

        /* renamed from: a */
        private void m12239a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C3657v.this.m12160i(C3657v.this.m12145e(str, str2));
        }

        /* renamed from: b */
        private void m12246b(JSONObject jSONObject) throws JSONException {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.m11907a().isEmpty()) {
                    return;
                }
                jSONObject.put(C3034d9.a.f7921h, new JSONArray((Collection) featuresManager.m11907a()));
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                C3699th.m12428a(C3198hs.f8931p, new C3489oh().m11155a(C3037dc.f8225A, e2.getMessage()).m11156a());
                Logger.m12262d(C3657v.this.f11706c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        /* renamed from: c */
        private void m12247c(JSONObject jSONObject) throws JSONException {
            m12246b(jSONObject);
            m12242a(jSONObject, SDKUtils.getTesterParameters());
            if (C3657v.this.f11699W) {
                return;
            }
            m12241a(jSONObject);
        }

        /* renamed from: a */
        private void m12240a(String str, boolean z) {
            C3762va c3762vaM12850a = C3657v.this.f11683G.m12850a(C3419mh.e.Interstitial, str);
            if (c3762vaM12850a != null) {
                c3762vaM12850a.m12754a(z);
            }
        }

        /* renamed from: a */
        private void m12241a(JSONObject jSONObject) throws JSONException {
            try {
                jSONObject.put("controllerSourceData", C3657v.this.f11678B.m11953f());
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                Logger.m12262d(C3657v.this.f11706c, "Unable to add controller source data into controllerConfig");
            }
        }

        /* renamed from: a */
        private void m12242a(JSONObject jSONObject, String str) throws JSONException {
            if (m12248a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException e2) {
                    C3551q9.m11517d().m11519a(e2);
                    Logger.m12262d(C3657v.this.f11706c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m12243a(boolean z, String str) {
            if (z) {
                C3657v.this.f11728y.mo8364b(C3419mh.e.Interstitial, str);
                C3657v.this.f11728y.mo8366b(str);
            }
            m12240a(str, false);
        }

        /* renamed from: a */
        public /* synthetic */ void m12244a(boolean z, String str, String str2) {
            if (z) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                C3657v.this.f11728y.mo8367b(str2, str);
            }
            m12240a(str2, false);
        }

        /* renamed from: a */
        public boolean m12248a(String str) {
            if (TextUtils.isEmpty(str) || str.contains(C3824x4.f12571f)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e2) {
                C3551q9.m11517d().m11519a(e2);
                IronLog.INTERNAL.error(e2.toString());
                return false;
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$s */
    public interface s {
        /* renamed from: a */
        void mo12235a(String str, C3419mh.e eVar, C3762va c3762va);
    }

    /* renamed from: com.ironsource.sdk.controller.v$t */
    public static class t {

        /* renamed from: a */
        String f11821a;

        /* renamed from: b */
        String f11822b;
    }

    /* renamed from: com.ironsource.sdk.controller.v$u */
    public enum u {
        Display,
        Gone
    }

    /* renamed from: com.ironsource.sdk.controller.v$v */
    public class v extends WebViewClient {
        private v() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.m12266i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                C3657v.this.m12186A();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.m12266i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.m12266i("onReceivedError", str2 + StringUtils.SPACE + str);
            if (str2.contains(C3034d9.f7895f) && C3657v.this.f11693Q != null) {
                C3657v.this.f11693Q.mo11933b("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.e(C3657v.this.f11706c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (C3657v.this.f11693Q != null) {
                C3657v.this.f11693Q.mo11935c(str);
            }
            C3657v.this.m12230w();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean zContains;
            Logger.m12266i("shouldInterceptRequest", str);
            try {
                zContains = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException e) {
                C3551q9.m11517d().m11519a(e);
                zContains = false;
            }
            if (zContains) {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(C3657v.this.f11677A);
                String strOooOOOo = OooOo.OooOOOo(sb, File.separator, "mraid.js");
                try {
                    new FileInputStream(new File(strOooOOOo));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(strOooOOOo));
                } catch (FileNotFoundException e2) {
                    C3551q9.m11517d().m11519a(e2);
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.m12266i("shouldOverrideUrlLoading", str);
            try {
                if (C3657v.this.m12219h(str)) {
                    C3657v.this.m12233z();
                    return true;
                }
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        public /* synthetic */ v(C3657v c3657v, f fVar) {
            this();
        }
    }

    public C3657v(Context context, C3796wa c3796wa, C3144g9 c3144g9, InterfaceC3638c interfaceC3638c, C3523pg c3523pg, int i2, C3146gb c3146gb, String str, InterfaceC3647l.a aVar, InterfaceC3647l.b bVar, String str2, String str3) throws Throwable {
        C3597rk c3597rk = new C3597rk(context, new InterfaceC3011cl.a());
        this.f11702Z = c3597rk;
        Logger.m12266i(this.f11706c, "C'tor");
        this.f11701Y = c3144g9;
        this.f11693Q = interfaceC3638c;
        this.f11703a = c3523pg;
        this.f11683G = c3796wa;
        m12107a(context, c3597rk);
        this.f11677A = str;
        this.f11680D = new C3856y2();
        this.f11695S = new JSONObject();
        this.f11711h = c3146gb;
        this.f11696T = aVar;
        this.f11697U = bVar;
        boolean zOptBoolean = SDKUtils.getNetworkConfiguration().optBoolean(C3034d9.a.f7922i, false);
        this.f11699W = zOptBoolean;
        if (zOptBoolean) {
            this.f11698V = new C3446n9(new C3283k9(SDKUtils.getControllerUrl(), this.f11677A, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new C3161gq(SDKUtils.getControllerUrl())), new OooO0o(this, 0), c3146gb, new InterfaceC3621s9.a());
        } else {
            c3146gb.mo8936a(this);
            this.f11678B = new C3639d(SDKUtils.getNetworkConfiguration(), this.f11677A, SDKUtils.getControllerUrl(), c3146gb);
        }
        o oVar = new o(this, null);
        this.f11720q = oVar;
        c3597rk.setWebViewClient(new v(this, null));
        c3597rk.setWebChromeClient(oVar);
        C3750ux.m12727a(c3597rk);
        m12109a(c3597rk);
        c3597rk.setDownloadListener(this);
        this.f11694R = m12131c(context);
        mo11998b(context);
        m12210b(i2);
        this.f11709f = str2;
        this.f11710g = str3;
        this.f11705b = InterfaceC3248j9.m9466a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    /* renamed from: c */
    private AbstractC3828x8 m12131c(Context context) {
        return new f(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* renamed from: e */
    public String m12144e(String str) {
        return new C3233is(str).m9393d(f11675g0);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    public void destroy() {
        this.f11702Z.destroy();
        C3146gb c3146gb = this.f11711h;
        if (c3146gb != null) {
            c3146gb.m8941d();
        }
        AbstractC3828x8 abstractC3828x8 = this.f11694R;
        if (abstractC3828x8 != null) {
            abstractC3828x8.m13030b();
        }
        CountDownTimer countDownTimer = this.f11716m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: g */
    public C3419mh.c mo12005g() {
        return C3419mh.c.Web;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        Logger.m12266i(this.f11706c, str + StringUtils.SPACE + str4);
    }

    /* renamed from: p */
    public InterfaceC3715tx m12223p() {
        if (this.f11692P == null) {
            this.f11692P = new g();
        }
        return this.f11692P;
    }

    /* renamed from: q */
    public Context m12224q() {
        return this.f11701Y.m8925a();
    }

    /* renamed from: r */
    public int m12225r() {
        return f11671c0;
    }

    /* renamed from: s */
    public FrameLayout m12226s() {
        return this.f11724u;
    }

    /* renamed from: u */
    public C3856y2 m12228u() {
        return this.f11680D;
    }

    /* renamed from: v */
    public u m12229v() {
        return this.f11725v;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: G */
    private void m12086G() {
    }

    /* renamed from: d */
    public String m12140d(String str) {
        return new C3233is(str).m9393d(f11676h0);
    }

    /* renamed from: e */
    public String m12145e(String str, String str2) {
        return new InterfaceC3648m.a(str, str2).mo12048a();
    }

    /* renamed from: g */
    public C3419mh.e m12154g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C3419mh.e eVar = C3419mh.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C3419mh.e eVar2 = C3419mh.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        C3419mh.e eVar3 = C3419mh.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    /* renamed from: i */
    public void m12160i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m12213c(new OooO0Oo.OooO0O0(19, this, str));
    }

    /* renamed from: j */
    public /* synthetic */ void m12162j(String str) {
        this.f11702Z.mo8376a(new InterfaceC3648m.b(str, m12225r()).mo12048a());
    }

    /* renamed from: l */
    public void m12165l(String str) {
        try {
            Logger.m12266i(this.f11706c, "load(): " + str);
            this.f11702Z.loadUrl(str);
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            Logger.m12264e(this.f11706c, "WebViewController::load: " + th);
        }
    }

    /* renamed from: o */
    public void m12171o() {
        InterfaceC3742up interfaceC3742up = this.f11704a0;
        if (interfaceC3742up != null) {
            interfaceC3742up.onCloseRequested();
        }
    }

    /* renamed from: A */
    public void m12186A() {
        m12160i(m12151f(C3034d9.g.f7999A));
    }

    /* renamed from: B */
    public void m12187B() {
        try {
            this.f11702Z.onPause();
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            Logger.m12266i(this.f11706c, "WebViewController: onPause() - " + th);
        }
    }

    /* renamed from: C */
    public void m12188C() {
        this.f11679C = null;
    }

    /* renamed from: D */
    public void m12189D() {
        this.f11702Z.m11729a();
        this.f11704a0 = null;
    }

    /* renamed from: E */
    public void m12190E() {
        this.f11702Z.requestFocus();
    }

    /* renamed from: F */
    public void m12191F() {
        try {
            this.f11702Z.onResume();
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            Logger.m12266i(this.f11706c, "WebViewController: onResume() - " + th);
        }
    }

    /* renamed from: k */
    public void m12220k(String str) {
        m12160i(m12145e(C3034d9.g.f8049w, m12106a("action", str, null, null, null, null, null, null, null, false)));
    }

    /* renamed from: m */
    public void m12221m(String str) {
        try {
            String strM4801d = C2635a9.m4801d(this.f11702Z.getContext());
            Logger.m12266i(this.f11706c, "device status changed, connection type " + str);
            C3594rh.m11721a(str);
            C3594rh.m11722b(strM4801d);
            try {
                m12160i(m12145e(C3034d9.g.f8050x, m12106a(C3034d9.i.f8208t, str, C3034d9.i.f8209u, strM4801d, null, null, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                C3551q9.m11517d().m11519a(exc);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(exc));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* renamed from: t */
    public String m12227t() {
        return this.f11726w;
    }

    /* renamed from: w */
    public void m12230w() {
        if (this.f11713j == null) {
            return;
        }
        m12171o();
        C3419mh.e eVarM12237b = this.f11713j.m12237b();
        String strM12236a = this.f11713j.m12236a();
        if (m12176q(eVarM12237b.toString())) {
            m12195a(eVarM12237b, strM12236a);
        }
    }

    /* renamed from: x */
    public void m12231x() {
        this.f11720q.onHideCustomView();
    }

    /* renamed from: y */
    public boolean m12232y() {
        return this.f11721r != null;
    }

    /* renamed from: z */
    public void m12233z() {
        m12160i(m12151f(C3034d9.g.f8024Z));
    }

    /* renamed from: c */
    public Object m12133c(C3769vh c3769vh) {
        this.f11711h.mo8936a(this);
        if (c3769vh == null || !c3769vh.exists()) {
            mo8060a(new C3769vh(C3034d9.f7895f), new C3454nh(1, "Unable to download Html file"));
            return null;
        }
        mo8059a(c3769vh);
        return null;
    }

    /* renamed from: d */
    private String m12141d(JSONObject jSONObject) {
        C3898za c3898zaM13309b = C3898za.m13309b(this.f11702Z.getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb.append("SDKVersion=");
            sb.append(sDKVersion);
            sb.append(C3034d9.i.f8175c);
        }
        String strM13316e = c3898zaM13309b.m13316e();
        if (!TextUtils.isEmpty(strM13316e)) {
            sb.append("deviceOs=");
            sb.append(strM13316e);
        }
        Uri uri = Uri.parse(SDKUtils.getControllerUrl());
        if (uri != null) {
            String str = uri.getScheme() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
            String host = uri.getHost();
            int port = uri.getPort();
            if (port != -1) {
                host = host + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + port;
            }
            androidx.datastore.preferences.protobuf.OooO00o.OooOooO(sb, "&protocol=", str, "&domain=", host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String string = new JSONObject(jSONObject, new String[]{C3034d9.i.f8171Z, C3034d9.i.f8183g}).toString();
                    if (!TextUtils.isEmpty(string)) {
                        sb.append(C3034d9.i.f8175c);
                        sb.append("controllerConfig");
                        sb.append(C3034d9.i.f8173b);
                        sb.append(string);
                    }
                } catch (JSONException e2) {
                    C3551q9.m11517d().m11519a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
            sb.append("&debug=");
            sb.append(m12225r());
        }
        return sb.toString();
    }

    /* renamed from: f */
    private String m12151f(String str) {
        return new InterfaceC3648m.a(str).mo12048a();
    }

    /* renamed from: o */
    private void m12172o(String str) {
        WebSettings settings;
        int i2;
        if (str.equalsIgnoreCase("0")) {
            settings = this.f11702Z.getSettings();
            i2 = 2;
        } else {
            settings = this.f11702Z.getSettings();
            i2 = -1;
        }
        settings.setCacheMode(i2);
    }

    /* renamed from: p */
    public void m12174p(String str) {
        C3233is c3233is = new C3233is(str);
        String strM9393d = c3233is.m9393d(C3034d9.h.f8086S);
        String strM9393d2 = c3233is.m9393d("adViewId");
        int color = !C3034d9.h.f8087T.equalsIgnoreCase(strM9393d) ? Color.parseColor(strM9393d) : 0;
        if (strM9393d2 == null) {
            this.f11702Z.setBackgroundColor(color);
            return;
        }
        WebView presentingView = C3256jh.m9487a().mo9491a(strM9393d2).getPresentingView();
        if (presentingView != null) {
            presentingView.setBackgroundColor(color);
        }
    }

    /* renamed from: q */
    public boolean m12176q(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            Logger.m12262d(this.f11706c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C3419mh.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(C3419mh.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C3419mh.e.Banner.toString()) || this.f11729z == null : this.f11727x == null) : this.f11728y != null) {
            z = true;
        }
        if (!z) {
            Logger.m12262d(this.f11706c, "Trying to trigger a listener - no listener was found for product ".concat(str));
        }
        return z;
    }

    /* renamed from: b */
    public C3653r m12209b(C3654s c3654s) {
        return new C3653r(c3654s);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: e */
    public void mo12003e() {
        m12206a(this.f11680D);
    }

    /* renamed from: h */
    public boolean m12219h(String str) {
        try {
            if (!new C3431mt(str, C3527pk.m11417e().m11425d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().mo11507c()).m10887a()) {
                return false;
            }
            C3539pw.m11460a(m12224q(), str);
            return true;
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    /* renamed from: n */
    public void m12222n(String str) {
        this.f11726w = str;
    }

    /* renamed from: c */
    private String m12134c(String str, String str2, String str3) {
        return new InterfaceC3648m.a(str, null, str2, str3).mo12048a();
    }

    /* renamed from: e */
    public void m12146e(Context context) {
        try {
            AbstractC3828x8 abstractC3828x8 = this.f11694R;
            if (abstractC3828x8 == null) {
                return;
            }
            abstractC3828x8.m13031b(context);
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: f */
    public void mo12004f() {
        m12160i(m12151f(C3034d9.g.f8047u));
    }

    /* renamed from: f */
    public void m12152f(Context context) {
        try {
            AbstractC3828x8 abstractC3828x8 = this.f11694R;
            if (abstractC3828x8 == null) {
                return;
            }
            abstractC3828x8.m13032c(context);
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* renamed from: a */
    public C3642g m12192a(C3654s c3654s) {
        return new C3642g(new C3637b(new r()), c3654s);
    }

    /* renamed from: g */
    public void m12218g(String str, String str2) {
        m12160i(m12145e(C3034d9.g.f8021W, m12106a(C3034d9.h.f8123p, str2, C3034d9.h.f8117m, str, null, null, null, null, null, false)));
    }

    /* renamed from: b */
    private String m12127b(String str) {
        String str2 = this.f11677A + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    /* renamed from: f */
    public Object[] m12153f(String str, String str2) throws JSONException {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        boolean z2 = true;
        Map<String, String> mapM12763g = null;
        if (TextUtils.isEmpty(str)) {
            z = true;
        } else {
            C3762va c3762vaM12850a = this.f11683G.m12850a(m12154g(str), str2);
            if (c3762vaM12850a != null) {
                mapM12763g = c3762vaM12850a.m12763g();
                mapM12763g.put("demandSourceName", c3762vaM12850a.m12762f());
                mapM12763g.put("demandSourceId", c3762vaM12850a.m12764h());
            }
            try {
                jSONObject.put(C3034d9.h.f8117m, str);
            } catch (JSONException e2) {
                C3551q9.m11517d().m11519a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
            z = false;
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e3) {
                C3551q9.m11517d().m11519a(e3);
                IronLog.INTERNAL.error(e3.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f11710g)) {
            try {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8181f), SDKUtils.encodeString(this.f11710g));
            } catch (JSONException e4) {
                C3551q9.m11517d().m11519a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f11709f)) {
            try {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8183g), SDKUtils.encodeString(this.f11709f));
            } catch (JSONException e5) {
                C3551q9.m11517d().m11519a(e5);
                IronLog.INTERNAL.error(e5.toString());
            }
            z2 = z;
        }
        if (mapM12763g != null && !mapM12763g.isEmpty()) {
            for (Map.Entry<String, String> entry : mapM12763g.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    m12172o(entry.getValue());
                }
                try {
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e6) {
                    C3551q9.m11517d().m11519a(e6);
                    IronLog.INTERNAL.error(e6.toString());
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
    }

    /* renamed from: c */
    public void m12213c(Runnable runnable) {
        C3523pg c3523pg = this.f11703a;
        if (c3523pg != null) {
            c3523pg.m11404d(runnable);
        }
    }

    /* renamed from: e */
    public void m12217e(JSONObject jSONObject) {
        Logger.m12266i(this.f11706c, "device connection info changed: " + jSONObject.toString());
        m12160i(m12145e(C3034d9.g.f8051y, m12106a(C3034d9.i.f8186h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    /* renamed from: a */
    private t m12096a(C3419mh.e eVar, C3762va c3762va) throws JSONException {
        t tVar = new t();
        if (eVar != C3419mh.e.RewardedVideo && eVar != C3419mh.e.Interstitial && eVar != C3419mh.e.Banner) {
            return tVar;
        }
        HashMap map = new HashMap();
        map.put(C3034d9.i.f8183g, this.f11709f);
        if (!TextUtils.isEmpty(this.f11710g)) {
            map.put(C3034d9.i.f8181f, this.f11710g);
        }
        if (c3762va != null) {
            if (c3762va.m12763g() != null) {
                map.putAll(c3762va.m12763g());
                map.put(C3034d9.h.f8142y0, String.valueOf(C3309l0.f9291a.m9730c(c3762va.m12764h())));
            }
            map.put("demandSourceName", c3762va.m12762f());
            map.put("demandSourceId", c3762va.m12764h());
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        C3034d9.g gVarM8287a = C3034d9.g.m8287a(eVar);
        String strM12105a = m12105a(gVarM8287a.f8053a, strFlatMapToJsonAsString, gVarM8287a.f8054b, gVarM8287a.f8055c);
        tVar.f11821a = gVarM8287a.f8053a;
        tVar.f11822b = strM12105a;
        return tVar;
    }

    /* renamed from: b */
    private String m12128b(String str, String str2) {
        return m12104a(str, str2, "errMsg");
    }

    /* renamed from: c */
    public void m12214c(String str) {
        if (str.equals(C3034d9.h.f8109i)) {
            m12171o();
        }
        m12160i(m12145e(C3034d9.g.f8052z, m12106a("action", str, null, null, null, null, null, null, null, false)));
    }

    /* renamed from: a */
    public InterfaceC3726u9 m12097a(C3419mh.e eVar) {
        if (eVar == C3419mh.e.Interstitial) {
            return this.f11728y;
        }
        if (eVar == C3419mh.e.RewardedVideo) {
            return this.f11727x;
        }
        if (eVar == C3419mh.e.Banner) {
            return this.f11729z;
        }
        return null;
    }

    /* renamed from: b */
    public void m12210b(int i2) {
        f11671c0 = i2;
    }

    /* renamed from: c */
    public void m12215c(String str, String str2) {
        String str3;
        try {
            str3 = str;
        } catch (Exception e2) {
            e = e2;
            str3 = str;
        }
        try {
            m12160i(m12145e(C3034d9.g.f8042p, m12106a("file", str3, "path", m12127b(str2), null, null, null, null, null, false)));
        } catch (Exception e3) {
            e = e3;
            Exception exc = e;
            C3551q9.m11517d().m11519a(exc);
            m12212b(str3, str2, exc.getMessage());
        }
    }

    /* renamed from: c */
    private void m12136c(JSONObject jSONObject) throws JSONException {
        jSONObject.put(SDKUtils.encodeString("gpi"), C3126fq.m8739d(this.f11702Z.getContext()));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: b */
    public void mo11998b(Context context) {
        m12207a(new c(context));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: d */
    public void mo12002d() {
        m12160i(m12151f(C3034d9.g.f8046t));
    }

    /* renamed from: a */
    private String m12099a(C3419mh.e eVar, JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String strOptString = jSONObject.optString("demandSourceName");
        String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        C3762va c3762vaM12850a = this.f11683G.m12850a(eVar, strFetchDemandSourceId);
        if (c3762vaM12850a != null) {
            if (c3762vaM12850a.m12763g() != null) {
                map.putAll(c3762vaM12850a.m12763g());
            }
            if (!TextUtils.isEmpty(strOptString)) {
                map.put("demandSourceName", strOptString);
            }
            if (!TextUtils.isEmpty(strFetchDemandSourceId)) {
                map.put("demandSourceId", strFetchDemandSourceId);
            }
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        C3034d9.g gVarM8288b = C3034d9.g.m8288b(eVar);
        return m12105a(gVarM8288b.f8053a, strFlatMapToJsonAsString, gVarM8288b.f8054b, gVarM8288b.f8055c);
    }

    /* renamed from: d */
    public void m12216d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = C3034d9.c.f7972z;
        }
        m12160i(m12145e(C3034d9.g.f8025a0, m12106a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: b */
    public void mo11999b(C3762va c3762va) {
        Map<String, String> mapM12756b = c3762va.m12756b();
        if (mapM12756b != null) {
            m12160i(m12145e(C3034d9.g.f8018T, SDKUtils.flatMapToJsonAsString(mapM12756b)));
        }
        this.f11683G.m12853b(C3419mh.e.Interstitial, c3762va.m12764h());
    }

    /* renamed from: d */
    public Object[] m12143d(Context context) throws JSONException {
        C3898za c3898zaM13309b = C3898za.m13309b(context);
        JSONObject jSONObject = new JSONObject();
        boolean z = false;
        try {
            jSONObject.put(C3034d9.i.f8214z, "none");
            jSONObject.put(C3034d9.i.f8146A, SDKUtils.translateDeviceOrientation(this.f11700X.mo4827H(context)));
            String strM13315d = c3898zaM13309b.m13315d();
            if (strM13315d != null) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8191k), SDKUtils.encodeString(strM13315d));
            }
            String strM13314c = c3898zaM13309b.m13314c();
            if (strM13314c != null) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8193l), SDKUtils.encodeString(strM13314c));
            } else {
                z = true;
            }
            SDKUtils.loadGoogleAdvertiserInfo(context);
            String advertiserId = SDKUtils.getAdvertiserId();
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.m12266i(this.f11706c, "add AID");
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            String limitAdTracking = SDKUtils.getLimitAdTracking();
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.m12266i(this.f11706c, "add LAT");
                jSONObject.put(C3034d9.i.f8158M, Boolean.parseBoolean(limitAdTracking));
            }
            String strM13316e = c3898zaM13309b.m13316e();
            if (strM13316e != null) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8195m), SDKUtils.encodeString(strM13316e));
            } else {
                z = true;
            }
            String strM13317f = c3898zaM13309b.m13317f();
            if (strM13317f != null) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8197n), strM13317f.replaceAll("[^0-9/.]", ""));
            } else {
                z = true;
            }
            String strM13317f2 = c3898zaM13309b.m13317f();
            if (strM13317f2 != null) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8199o), SDKUtils.encodeString(strM13317f2));
            }
            String strValueOf = String.valueOf(c3898zaM13309b.m13312a());
            if (strValueOf != null) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8201p), strValueOf);
            } else {
                z = true;
            }
            jSONObject.put(C3451ne.f10479h0, String.valueOf(C3206i1.m9248a()));
            String sDKVersion = SDKUtils.getSDKVersion();
            if (sDKVersion != null) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8203q), SDKUtils.encodeString(sDKVersion));
            }
            if (c3898zaM13309b.m13313b() != null && c3898zaM13309b.m13313b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8205r), SDKUtils.encodeString(c3898zaM13309b.m13313b()));
            }
            String strM4798b = C2635a9.m4798b(context);
            if (strM4798b.equals("none")) {
                z = true;
            } else {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8208t), SDKUtils.encodeString(strM4798b));
            }
            String strM4801d = C2635a9.m4801d(context);
            if (strM4801d != null) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8209u), SDKUtils.encodeString(strM4801d));
            } else {
                z = true;
            }
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8210v), C2635a9.m4802e(context));
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8212x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            jSONObject.put(C3034d9.i.f8213y, SDKUtils.encodeString(String.valueOf(this.f11700X.mo4835a(this.f11677A))));
            String strValueOf2 = String.valueOf(this.f11700X.mo4876s());
            if (TextUtils.isEmpty(strValueOf2)) {
                z = true;
            } else {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8152G) + C3034d9.i.f8177d + SDKUtils.encodeString("width") + C3034d9.i.f8179e, SDKUtils.encodeString(strValueOf2));
            }
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8152G) + C3034d9.i.f8177d + SDKUtils.encodeString("height") + C3034d9.i.f8179e, SDKUtils.encodeString(String.valueOf(this.f11700X.mo4834a())));
            String strM7874g = C2959b4.m7874g(this.f11702Z.getContext());
            if (!TextUtils.isEmpty(strM7874g)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strM7874g));
            }
            String strValueOf3 = String.valueOf(this.f11700X.mo4854h());
            if (!TextUtils.isEmpty(strValueOf3)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8156K), SDKUtils.encodeString(strValueOf3));
            }
            String strValueOf4 = String.valueOf(this.f11700X.mo4851f());
            if (!TextUtils.isEmpty(strValueOf4)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8160O), SDKUtils.encodeString(strValueOf4));
            }
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8161P), C3898za.m13309b(context).m13311a(context));
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8170Y), this.f11700X.mo4884y(context));
            jSONObject.put(SDKUtils.encodeString("mcc"), C3896z8.m13300b(context));
            jSONObject.put(SDKUtils.encodeString("mnc"), C3896z8.m13301c(context));
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8164S), C3896z8.m13304f(context));
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8163R), SDKUtils.encodeString(C3896z8.m13305g(context)));
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8167V), C2959b4.m7873f(context));
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8169X), C2959b4.m7870d(context));
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8168W), SDKUtils.encodeString(C2959b4.m7866b(context)));
            String strM7872e = C2959b4.m7872e(context);
            if (!TextUtils.isEmpty(strM7872e)) {
                jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8176c0), SDKUtils.encodeString(strM7872e));
            }
            m12136c(jSONObject);
            jSONObject.put(SDKUtils.encodeString(C3034d9.i.f8202p0), this.f11700X.mo4822C(context));
        } catch (JSONException e2) {
            C3551q9.m11517d().m11519a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: b */
    public void mo12000b(C3762va c3762va, Map<String, String> map, InterfaceC3795w9 interfaceC3795w9) {
        m12114a(c3762va, map);
    }

    /* renamed from: b */
    public void m12211b(Runnable runnable) {
        C3523pg c3523pg = this.f11703a;
        if (c3523pg != null) {
            c3523pg.m11402c(runnable);
        }
    }

    /* renamed from: a */
    private String m12103a(String str, String str2) {
        return m12104a(str, str2, C3034d9.h.f8105g);
    }

    /* renamed from: b */
    public void m12212b(String str, String str2, String str3) {
        try {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            m12160i(m12145e(C3034d9.g.f8043q, m12106a("file", str, "path", m12127b(str2), "errMsg", str3, null, null, null, false)));
        } catch (Exception e3) {
            e = e3;
            C3551q9.m11517d().m11519a(e);
        }
    }

    /* renamed from: a */
    private String m12104a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                return new JSONObject(str).put(str3, str2).toString();
            } catch (JSONException e2) {
                C3551q9.m11517d().m11519a(e2);
            }
        }
        return str;
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: b */
    public void mo12001b(JSONObject jSONObject) {
        m12160i(m12145e(C3034d9.g.f8031e0, jSONObject != null ? jSONObject.toString() : null));
    }

    /* renamed from: a */
    public String m12105a(String str, String str2, String str3, String str4) {
        return new InterfaceC3648m.a(str, str2, str3, str4).mo12048a();
    }

    /* renamed from: a */
    public String m12106a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z);
            }
        } catch (JSONException e2) {
            C3551q9.m11517d().m11519a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject.toString();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11980a() {
        if (this.f11699W) {
            this.f11698V.mo10973a();
            return;
        }
        this.f11678B.m11950a(new C3489oh());
        if (this.f11678B.m11955k()) {
            m12193a(1);
        }
    }

    /* renamed from: a */
    public void m12193a(int i2) {
        if (!this.f11699W && !this.f11678B.m11956m()) {
            Logger.m12266i(this.f11706c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String strM12141d = m12141d(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            strM12141d = String.format("%s&sessionid=%s", strM12141d, initSDKParams.get("sessionid"));
        }
        this.f11703a.m11404d(new h(controllerConfigAsJSONObject, this.f11702Z, OooOo.OooOoo((this.f11699W ? this.f11698V.mo10975b() : this.f11678B.m11954g()).toURI().toString(), "?", strM12141d)));
        this.f11716m = new i(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, 1000L, i2).start();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11981a(Activity activity) {
        this.f11701Y.m8926a(activity);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11982a(Context context) {
        m12207a(new d(context));
    }

    /* renamed from: a */
    private void m12107a(Context context, WebView webView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f11724u = new FrameLayout(context);
        this.f11722s = new FrameLayout(context);
        this.f11722s.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f11722s.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.f11724u.addView(this.f11722s, layoutParams);
        this.f11724u.addView(frameLayout);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private void m12108a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: a */
    private void m12109a(WebView webView) {
        C3654s c3654s = new C3654s(C3654s.m12063a());
        webView.addJavascriptInterface(m12192a(c3654s), C3034d9.f7893d);
        webView.addJavascriptInterface(m12209b(c3654s), C3034d9.f7894e);
    }

    /* renamed from: a */
    public void m12194a(C2636aa c2636aa) {
        this.f11691O = c2636aa;
    }

    /* renamed from: a */
    public /* synthetic */ void m12110a(InterfaceC2970bf interfaceC2970bf) {
        interfaceC2970bf.mo7914a(new OooO(this));
    }

    /* renamed from: a */
    public void m12195a(C3419mh.e eVar, String str) {
        m12211b(new e(eVar, str));
    }

    /* renamed from: a */
    public void m12196a(C3545q3 c3545q3) {
        this.f11690N = c3545q3;
    }

    /* renamed from: a */
    public void m12197a(C3636a c3636a) {
        this.f11688L = c3636a;
        c3636a.m11927a(m12223p());
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11983a(InterfaceC3641f.c cVar, InterfaceC3647l.a aVar) {
        m12160i(m12105a(cVar.m12022e(), cVar.m12025h(), C3034d9.g.f8019U, C3034d9.g.f8019U));
    }

    /* renamed from: a */
    public void m12198a(C3644i c3644i) {
        this.f11687K = c3644i;
    }

    /* renamed from: a */
    public void m12199a(C3645j c3645j) {
        this.f11689M = c3645j;
    }

    /* renamed from: a */
    public void m12200a(C3650o c3650o) {
        this.f11684H = c3650o;
    }

    /* renamed from: a */
    public void m12201a(C3652q c3652q) {
        this.f11685I = c3652q;
    }

    /* renamed from: a */
    public void m12202a(C3656u c3656u) {
        this.f11686J = c3656u;
    }

    /* renamed from: a */
    public void m12203a(u uVar) {
        this.f11725v = uVar;
    }

    /* renamed from: a */
    public void m12204a(InterfaceC3742up interfaceC3742up) {
        this.f11704a0 = interfaceC3742up;
        this.f11702Z.m11730a(interfaceC3742up);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11984a(C3762va c3762va) {
        Map<String, String> mapM12756b = c3762va.m12756b();
        if (mapM12756b != null) {
            m12160i(m12105a(C3034d9.g.f8017S, SDKUtils.flatMapToJsonAsString(mapM12756b), C3034d9.g.f8014P, C3034d9.g.f8015Q));
        }
        this.f11683G.m12853b(C3419mh.e.Banner, c3762va.m12764h());
    }

    /* renamed from: a */
    private void m12114a(C3762va c3762va, Map<String, String> map) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, c3762va.m12756b()});
        if (map.containsKey("adm")) {
            this.f11705b.mo9468a(new OooO(this));
        }
        this.f11680D.m13136d(c3762va.m12764h(), true);
        m12160i(m12105a(C3034d9.g.f8003E, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C3034d9.g.f8004F, C3034d9.g.f8005G));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11985a(C3762va c3762va, Map<String, String> map, InterfaceC3761v9 interfaceC3761v9) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, c3762va.m12756b()});
        if (map != null) {
            m12160i(m12105a(C3034d9.g.f8012N, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C3034d9.g.f8013O, C3034d9.g.f8016R));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11986a(C3762va c3762va, Map<String, String> map, InterfaceC3795w9 interfaceC3795w9) {
        m12160i(m12099a(C3419mh.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, c3762va.m12756b()}))));
    }

    @Override // com.ironsource.InterfaceC3602rp
    /* renamed from: a */
    public void mo8059a(C3769vh c3769vh) {
        if (this.f11699W && this.f11698V.mo10974a(c3769vh)) {
            m12193a(1);
        } else if (c3769vh.getName().contains(C3034d9.f7895f)) {
            this.f11678B.m11951a(new n());
        } else {
            m12215c(c3769vh.getName(), c3769vh.getParent());
        }
    }

    @Override // com.ironsource.InterfaceC3602rp
    /* renamed from: a */
    public void mo8060a(C3769vh c3769vh, C3454nh c3454nh) {
        if (this.f11699W && this.f11698V.mo10974a(c3769vh)) {
            this.f11693Q.mo11933b("controller html - failed to download - " + c3454nh.m10992b());
            return;
        }
        if (c3769vh.getName().contains(C3034d9.f7895f)) {
            this.f11678B.m11952a(new a(), new b(c3454nh));
        } else {
            m12212b(c3769vh.getName(), c3769vh.getParent(), c3454nh.m10992b());
        }
    }

    /* renamed from: a */
    public void m12205a(InterfaceC3818ww interfaceC3818ww) {
        this.f11679C = interfaceC3818ww;
    }

    /* renamed from: a */
    public void m12206a(C3856y2 c3856y2) {
        String strM13129b;
        InterfaceC3726u9 interfaceC3726u9M12097a;
        synchronized (this.f11681E) {
            try {
                if (c3856y2.m13148j() && this.f11712i) {
                    Log.d(this.f11706c, "restoreState(state:" + c3856y2 + ")");
                    int iM13132c = c3856y2.m13132c();
                    if (iM13132c != -1) {
                        C3419mh.e eVar = C3419mh.e.RewardedVideo;
                        if (iM13132c == eVar.ordinal()) {
                            Log.d(this.f11706c, "onRVAdClosed()");
                            strM13129b = c3856y2.m13129b();
                            interfaceC3726u9M12097a = m12097a(eVar);
                            if (interfaceC3726u9M12097a != null && !TextUtils.isEmpty(strM13129b)) {
                                interfaceC3726u9M12097a.mo8347a(eVar, strM13129b);
                            }
                            c3856y2.m13125a(-1);
                            c3856y2.m13141f(null);
                        } else {
                            eVar = C3419mh.e.Interstitial;
                            if (iM13132c == eVar.ordinal()) {
                                Log.d(this.f11706c, "onInterstitialAdClosed()");
                                strM13129b = c3856y2.m13129b();
                                interfaceC3726u9M12097a = m12097a(eVar);
                                if (interfaceC3726u9M12097a != null && !TextUtils.isEmpty(strM13129b)) {
                                    interfaceC3726u9M12097a.mo8347a(eVar, strM13129b);
                                }
                            }
                            c3856y2.m13125a(-1);
                            c3856y2.m13141f(null);
                        }
                    } else {
                        Log.d(this.f11706c, "No ad was opened");
                    }
                    String strM13135d = c3856y2.m13135d();
                    String strM13140f = c3856y2.m13140f();
                    for (C3762va c3762va : this.f11683G.m12852a(C3419mh.e.Interstitial)) {
                        if (c3762va.m12761e() == 2) {
                            Log.d(this.f11706c, "initInterstitial(appKey:" + strM13135d + ", userId:" + strM13140f + ", demandSource:" + c3762va.m12762f() + ")");
                            mo11991a(strM13135d, strM13140f, c3762va, this.f11728y);
                        }
                    }
                    String strM13142g = c3856y2.m13142g();
                    String strM13144h = c3856y2.m13144h();
                    for (C3762va c3762va2 : this.f11683G.m12852a(C3419mh.e.RewardedVideo)) {
                        if (c3762va2.m12761e() == 2) {
                            String strM12762f = c3762va2.m12762f();
                            Log.d(this.f11706c, "onRVNoMoreOffers()");
                            this.f11727x.mo8371c(strM12762f);
                            Log.d(this.f11706c, "initRewardedVideo(appKey:" + strM13142g + ", userId:" + strM13144h + ", demandSource:" + strM12762f + ")");
                            mo11992a(strM13142g, strM13144h, c3762va2, this.f11727x);
                        }
                    }
                    c3856y2.m13128a(false);
                }
                this.f11680D = c3856y2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m12115a(InterfaceC3868ye interfaceC3868ye) {
        try {
            this.f11693Q.mo8125a(interfaceC3868ye);
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            Logger.m12264e(this.f11706c, "handleLoadAd: " + e2);
        }
    }

    /* renamed from: a */
    public void m12207a(Runnable runnable) {
        C3523pg c3523pg = this.f11703a;
        if (c3523pg != null) {
            c3523pg.m11399b(runnable);
        }
    }

    /* renamed from: a */
    public void m12116a(String str, C3419mh.e eVar, C3762va c3762va) {
        if (m12176q(eVar.toString())) {
            m12211b(new m(eVar, c3762va, str));
        }
    }

    /* renamed from: a */
    private void m12117a(String str, C3419mh.e eVar, C3762va c3762va, s sVar) {
        if (TextUtils.isEmpty(str)) {
            sVar.mo12235a("Application key are missing", eVar, c3762va);
        } else {
            m12160i(m12096a(eVar, c3762va).f11822b);
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11989a(String str, InterfaceC3795w9 interfaceC3795w9) throws JSONException {
        HashMap map = new HashMap();
        map.put("demandSourceName", str);
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        this.f11680D.m13136d(str, true);
        m12160i(m12105a(C3034d9.g.f8003E, strFlatMapToJsonAsString, C3034d9.g.f8004F, C3034d9.g.f8005G));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11990a(String str, String str2, C3762va c3762va, InterfaceC3761v9 interfaceC3761v9) {
        this.f11709f = str;
        this.f11710g = str2;
        this.f11729z = interfaceC3761v9;
        m12117a(str, C3419mh.e.Banner, c3762va, new l());
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11991a(String str, String str2, C3762va c3762va, InterfaceC3795w9 interfaceC3795w9) {
        this.f11709f = str;
        this.f11710g = str2;
        this.f11728y = interfaceC3795w9;
        this.f11680D.m13143g(str);
        this.f11680D.m13145h(this.f11710g);
        m12117a(this.f11709f, C3419mh.e.Interstitial, c3762va, new k());
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11992a(String str, String str2, C3762va c3762va, InterfaceC3829x9 interfaceC3829x9) {
        this.f11709f = str;
        this.f11710g = str2;
        this.f11727x = interfaceC3829x9;
        this.f11680D.m13146i(str);
        this.f11680D.m13147j(str2);
        m12117a(str, C3419mh.e.RewardedVideo, c3762va, new j());
    }

    /* renamed from: a */
    public void m12118a(String str, boolean z, String str2, String str3) {
        String strM9393d = new C3233is(str).m9393d(z ? f11675g0 : f11676h0);
        if (TextUtils.isEmpty(strM9393d)) {
            return;
        }
        m12160i(m12145e(strM9393d, m12103a(m12128b(str, str2), str3)));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11993a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f11695S = jSONObject;
        }
    }

    /* renamed from: a */
    public void m12119a(JSONObject jSONObject, WebView webView) {
        boolean zOptBoolean = jSONObject.optBoolean("inspectWebview");
        if (zOptBoolean) {
            WebView.setWebContentsDebuggingEnabled(zOptBoolean);
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11994a(JSONObject jSONObject, InterfaceC3761v9 interfaceC3761v9) {
        m12160i(m12105a(C3034d9.g.f8012N, jSONObject.toString(), C3034d9.g.f8013O, C3034d9.g.f8016R));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11995a(JSONObject jSONObject, InterfaceC3795w9 interfaceC3795w9) {
        m12160i(m12099a(C3419mh.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public void mo11996a(JSONObject jSONObject, InterfaceC3829x9 interfaceC3829x9) {
        m12160i(m12099a(C3419mh.e.RewardedVideo, jSONObject));
    }

    /* renamed from: a */
    public void m12208a(boolean z, String str) {
        m12160i(m12145e(C3034d9.g.f8020V, m12106a(C3034d9.h.f8076K, str, null, null, null, null, null, null, C3034d9.h.f8121o, z)));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC3647l
    /* renamed from: a */
    public boolean mo11997a(String str) {
        C3762va c3762vaM12850a = this.f11683G.m12850a(C3419mh.e.Interstitial, str);
        return c3762vaM12850a != null && c3762vaM12850a.m12760d();
    }
}
