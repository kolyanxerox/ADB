package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* renamed from: com.ironsource.t5 */
/* loaded from: classes2.dex */
public class C3687t5 extends C3759v7 {

    /* renamed from: d */
    private static final C3687t5 f11998d = new C3687t5();

    /* renamed from: b */
    private LevelPlayBannerListener f11999b = null;

    /* renamed from: c */
    private LevelPlayBannerListener f12000c = null;

    /* renamed from: com.ironsource.t5$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f12001a;

        public a(AdInfo adInfo) {
            this.f12001a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3687t5.this.f11999b != null) {
                C3687t5.this.f11999b.onAdLeftApplication(C3687t5.this.m12747a(this.f12001a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C3687t5.this.m12747a(this.f12001a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f12003a;

        public b(AdInfo adInfo) {
            this.f12003a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3687t5.this.f12000c != null) {
                C3687t5.this.f12000c.onAdClicked(C3687t5.this.m12747a(this.f12003a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3687t5.this.m12747a(this.f12003a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$c */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f12005a;

        public c(AdInfo adInfo) {
            this.f12005a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3687t5.this.f11999b != null) {
                C3687t5.this.f11999b.onAdClicked(C3687t5.this.m12747a(this.f12005a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3687t5.this.m12747a(this.f12005a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$d */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f12007a;

        public d(AdInfo adInfo) {
            this.f12007a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3687t5.this.f12000c != null) {
                C3687t5.this.f12000c.onAdLoaded(C3687t5.this.m12747a(this.f12007a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C3687t5.this.m12747a(this.f12007a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$e */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f12009a;

        public e(AdInfo adInfo) {
            this.f12009a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3687t5.this.f11999b != null) {
                C3687t5.this.f11999b.onAdLoaded(C3687t5.this.m12747a(this.f12009a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C3687t5.this.m12747a(this.f12009a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$f */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f12011a;

        public f(IronSourceError ironSourceError) {
            this.f12011a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3687t5.this.f12000c != null) {
                C3687t5.this.f12000c.onAdLoadFailed(this.f12011a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f12011a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.t5$g */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f12013a;

        public g(IronSourceError ironSourceError) {
            this.f12013a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3687t5.this.f11999b != null) {
                C3687t5.this.f11999b.onAdLoadFailed(this.f12013a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f12013a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.t5$h */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f12015a;

        public h(AdInfo adInfo) {
            this.f12015a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3687t5.this.f12000c != null) {
                C3687t5.this.f12000c.onAdScreenPresented(C3687t5.this.m12747a(this.f12015a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C3687t5.this.m12747a(this.f12015a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$i */
    public class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f12017a;

        public i(AdInfo adInfo) {
            this.f12017a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3687t5.this.f11999b != null) {
                C3687t5.this.f11999b.onAdScreenPresented(C3687t5.this.m12747a(this.f12017a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C3687t5.this.m12747a(this.f12017a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$j */
    public class j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f12019a;

        public j(AdInfo adInfo) {
            this.f12019a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3687t5.this.f12000c != null) {
                C3687t5.this.f12000c.onAdScreenDismissed(C3687t5.this.m12747a(this.f12019a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C3687t5.this.m12747a(this.f12019a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$k */
    public class k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f12021a;

        public k(AdInfo adInfo) {
            this.f12021a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3687t5.this.f11999b != null) {
                C3687t5.this.f11999b.onAdScreenDismissed(C3687t5.this.m12747a(this.f12021a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C3687t5.this.m12747a(this.f12021a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$l */
    public class l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f12023a;

        public l(AdInfo adInfo) {
            this.f12023a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3687t5.this.f12000c != null) {
                C3687t5.this.f12000c.onAdLeftApplication(C3687t5.this.m12747a(this.f12023a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C3687t5.this.m12747a(this.f12023a));
            }
        }
    }

    private C3687t5() {
    }

    /* renamed from: b */
    public LevelPlayBannerListener m12386b() {
        return this.f11999b;
    }

    /* renamed from: c */
    public void m12389c(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable aVar;
        if (this.f12000c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new l(adInfo);
        } else {
            if (this.f11999b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new a(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(aVar);
    }

    /* renamed from: d */
    public void m12390d(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable eVar;
        if (this.f12000c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new d(adInfo);
        } else {
            if (this.f11999b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new e(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(eVar);
    }

    /* renamed from: e */
    public void m12391e(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable kVar;
        if (this.f12000c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new j(adInfo);
        } else {
            if (this.f11999b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new k(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(kVar);
    }

    /* renamed from: f */
    public void m12392f(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable iVar;
        if (this.f12000c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new h(adInfo);
        } else {
            if (this.f11999b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new i(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(iVar);
    }

    /* renamed from: a */
    public static C3687t5 m12363a() {
        return f11998d;
    }

    /* renamed from: a */
    public void m12384a(IronSourceError ironSourceError) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable gVar;
        if (this.f12000c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new f(ironSourceError);
        } else {
            if (this.f11999b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new g(ironSourceError);
        }
        ironSourceThreadManager.postOnUiThreadTask(gVar);
    }

    /* renamed from: b */
    public void m12387b(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable cVar;
        if (this.f12000c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new b(adInfo);
        } else {
            if (this.f11999b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new c(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(cVar);
    }

    /* renamed from: a */
    public void m12385a(LevelPlayBannerListener levelPlayBannerListener) {
        this.f11999b = levelPlayBannerListener;
    }

    /* renamed from: b */
    public void m12388b(LevelPlayBannerListener levelPlayBannerListener) {
        this.f12000c = levelPlayBannerListener;
    }
}
