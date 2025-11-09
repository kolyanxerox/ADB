package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;

/* renamed from: com.ironsource.ah */
/* loaded from: classes2.dex */
public class C2937ah extends C3759v7 {

    /* renamed from: d */
    private static final C2937ah f7503d = new C2937ah();

    /* renamed from: b */
    private LevelPlayInterstitialListener f7504b = null;

    /* renamed from: c */
    private LevelPlayInterstitialListener f7505c = null;

    /* renamed from: com.ironsource.ah$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f7506a;

        public a(AdInfo adInfo) {
            this.f7506a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7504b != null) {
                C2937ah.this.f7504b.onAdShowSucceeded(C2937ah.this.m12747a(this.f7506a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C2937ah.this.m12747a(this.f7506a));
            }
        }
    }

    /* renamed from: com.ironsource.ah$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f7508a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f7509b;

        public b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f7508a = ironSourceError;
            this.f7509b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7505c != null) {
                C2937ah.this.f7505c.onAdShowFailed(this.f7508a, C2937ah.this.m12747a(this.f7509b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C2937ah.this.m12747a(this.f7509b) + ", error = " + this.f7508a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.ah$c */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f7511a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f7512b;

        public c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f7511a = ironSourceError;
            this.f7512b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7504b != null) {
                C2937ah.this.f7504b.onAdShowFailed(this.f7511a, C2937ah.this.m12747a(this.f7512b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C2937ah.this.m12747a(this.f7512b) + ", error = " + this.f7511a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.ah$d */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f7514a;

        public d(AdInfo adInfo) {
            this.f7514a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7505c != null) {
                C2937ah.this.f7505c.onAdClicked(C2937ah.this.m12747a(this.f7514a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C2937ah.this.m12747a(this.f7514a));
            }
        }
    }

    /* renamed from: com.ironsource.ah$e */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f7516a;

        public e(AdInfo adInfo) {
            this.f7516a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7504b != null) {
                C2937ah.this.f7504b.onAdClicked(C2937ah.this.m12747a(this.f7516a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C2937ah.this.m12747a(this.f7516a));
            }
        }
    }

    /* renamed from: com.ironsource.ah$f */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f7518a;

        public f(AdInfo adInfo) {
            this.f7518a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7505c != null) {
                C2937ah.this.f7505c.onAdReady(C2937ah.this.m12747a(this.f7518a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C2937ah.this.m12747a(this.f7518a));
            }
        }
    }

    /* renamed from: com.ironsource.ah$g */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f7520a;

        public g(AdInfo adInfo) {
            this.f7520a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7504b != null) {
                C2937ah.this.f7504b.onAdReady(C2937ah.this.m12747a(this.f7520a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C2937ah.this.m12747a(this.f7520a));
            }
        }
    }

    /* renamed from: com.ironsource.ah$h */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f7522a;

        public h(IronSourceError ironSourceError) {
            this.f7522a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7505c != null) {
                C2937ah.this.f7505c.onAdLoadFailed(this.f7522a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f7522a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.ah$i */
    public class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f7524a;

        public i(IronSourceError ironSourceError) {
            this.f7524a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7504b != null) {
                C2937ah.this.f7504b.onAdLoadFailed(this.f7524a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f7524a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.ah$j */
    public class j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f7526a;

        public j(AdInfo adInfo) {
            this.f7526a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7505c != null) {
                C2937ah.this.f7505c.onAdOpened(C2937ah.this.m12747a(this.f7526a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C2937ah.this.m12747a(this.f7526a));
            }
        }
    }

    /* renamed from: com.ironsource.ah$k */
    public class k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f7528a;

        public k(AdInfo adInfo) {
            this.f7528a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7504b != null) {
                C2937ah.this.f7504b.onAdOpened(C2937ah.this.m12747a(this.f7528a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C2937ah.this.m12747a(this.f7528a));
            }
        }
    }

    /* renamed from: com.ironsource.ah$l */
    public class l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f7530a;

        public l(AdInfo adInfo) {
            this.f7530a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7505c != null) {
                C2937ah.this.f7505c.onAdClosed(C2937ah.this.m12747a(this.f7530a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C2937ah.this.m12747a(this.f7530a));
            }
        }
    }

    /* renamed from: com.ironsource.ah$m */
    public class m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f7532a;

        public m(AdInfo adInfo) {
            this.f7532a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7504b != null) {
                C2937ah.this.f7504b.onAdClosed(C2937ah.this.m12747a(this.f7532a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C2937ah.this.m12747a(this.f7532a));
            }
        }
    }

    /* renamed from: com.ironsource.ah$n */
    public class n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f7534a;

        public n(AdInfo adInfo) {
            this.f7534a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2937ah.this.f7505c != null) {
                C2937ah.this.f7505c.onAdShowSucceeded(C2937ah.this.m12747a(this.f7534a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C2937ah.this.m12747a(this.f7534a));
            }
        }
    }

    private C2937ah() {
    }

    /* renamed from: a */
    public static synchronized C2937ah m7765a() {
        return f7503d;
    }

    /* renamed from: c */
    public void m7798c(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable mVar;
        if (this.f7505c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            mVar = new l(adInfo);
        } else {
            if (this.f7504b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            mVar = new m(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(mVar);
    }

    /* renamed from: d */
    public void m7799d(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable kVar;
        if (this.f7505c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new j(adInfo);
        } else {
            if (this.f7504b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new k(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(kVar);
    }

    /* renamed from: e */
    public void m7800e(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable gVar;
        if (this.f7505c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new f(adInfo);
        } else {
            if (this.f7504b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new g(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(gVar);
    }

    /* renamed from: f */
    public void m7801f(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable aVar;
        if (this.f7505c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new n(adInfo);
        } else {
            if (this.f7504b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new a(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(aVar);
    }

    /* renamed from: b */
    public void m7796b(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable eVar;
        if (this.f7505c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new d(adInfo);
        } else {
            if (this.f7504b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new e(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(eVar);
    }

    /* renamed from: a */
    public void m7793a(IronSourceError ironSourceError) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable iVar;
        if (this.f7505c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new h(ironSourceError);
        } else {
            if (this.f7504b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new i(ironSourceError);
        }
        ironSourceThreadManager.postOnUiThreadTask(iVar);
    }

    /* renamed from: b */
    public synchronized void m7797b(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f7505c = levelPlayInterstitialListener;
    }

    /* renamed from: a */
    public void m7794a(IronSourceError ironSourceError, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable cVar;
        if (this.f7505c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new b(ironSourceError, adInfo);
        } else {
            if (this.f7504b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new c(ironSourceError, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(cVar);
    }

    /* renamed from: a */
    public synchronized void m7795a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f7504b = levelPlayInterstitialListener;
    }

    /* renamed from: a */
    private void m7768a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
