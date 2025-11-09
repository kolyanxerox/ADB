package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;

/* renamed from: com.ironsource.fr */
/* loaded from: classes2.dex */
public class C3127fr extends C3759v7 {

    /* renamed from: d */
    private static final C3127fr f8609d = new C3127fr();

    /* renamed from: b */
    private LevelPlayRewardedVideoBaseListener f8610b = null;

    /* renamed from: c */
    private LevelPlayRewardedVideoBaseListener f8611c = null;

    /* renamed from: com.ironsource.fr$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f8612a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f8613b;

        public a(boolean z, AdInfo adInfo) {
            this.f8612a = z;
            this.f8613b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog ironLog;
            String str;
            if (C3127fr.this.f8610b != null) {
                if (this.f8612a) {
                    ((LevelPlayRewardedVideoListener) C3127fr.this.f8610b).onAdAvailable(C3127fr.this.m12747a(this.f8613b));
                    ironLog = IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + C3127fr.this.m12747a(this.f8613b);
                } else {
                    ((LevelPlayRewardedVideoListener) C3127fr.this.f8610b).onAdUnavailable();
                    ironLog = IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    /* renamed from: com.ironsource.fr$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Placement f8615a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f8616b;

        public b(Placement placement, AdInfo adInfo) {
            this.f8615a = placement;
            this.f8616b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8611c != null) {
                C3127fr.this.f8611c.onAdRewarded(this.f8615a, C3127fr.this.m12747a(this.f8616b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f8615a + ", adInfo = " + C3127fr.this.m12747a(this.f8616b));
            }
        }
    }

    /* renamed from: com.ironsource.fr$c */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Placement f8618a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f8619b;

        public c(Placement placement, AdInfo adInfo) {
            this.f8618a = placement;
            this.f8619b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8610b != null) {
                C3127fr.this.f8610b.onAdRewarded(this.f8618a, C3127fr.this.m12747a(this.f8619b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f8618a + ", adInfo = " + C3127fr.this.m12747a(this.f8619b));
            }
        }
    }

    /* renamed from: com.ironsource.fr$d */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f8621a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f8622b;

        public d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f8621a = ironSourceError;
            this.f8622b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8611c != null) {
                C3127fr.this.f8611c.onAdShowFailed(this.f8621a, C3127fr.this.m12747a(this.f8622b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C3127fr.this.m12747a(this.f8622b) + ", error = " + this.f8621a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.fr$e */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f8624a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f8625b;

        public e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f8624a = ironSourceError;
            this.f8625b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8610b != null) {
                C3127fr.this.f8610b.onAdShowFailed(this.f8624a, C3127fr.this.m12747a(this.f8625b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C3127fr.this.m12747a(this.f8625b) + ", error = " + this.f8624a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.fr$f */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Placement f8627a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f8628b;

        public f(Placement placement, AdInfo adInfo) {
            this.f8627a = placement;
            this.f8628b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8611c != null) {
                C3127fr.this.f8611c.onAdClicked(this.f8627a, C3127fr.this.m12747a(this.f8628b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f8627a + ", adInfo = " + C3127fr.this.m12747a(this.f8628b));
            }
        }
    }

    /* renamed from: com.ironsource.fr$g */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Placement f8630a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f8631b;

        public g(Placement placement, AdInfo adInfo) {
            this.f8630a = placement;
            this.f8631b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8610b != null) {
                C3127fr.this.f8610b.onAdClicked(this.f8630a, C3127fr.this.m12747a(this.f8631b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f8630a + ", adInfo = " + C3127fr.this.m12747a(this.f8631b));
            }
        }
    }

    /* renamed from: com.ironsource.fr$h */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f8633a;

        public h(AdInfo adInfo) {
            this.f8633a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8611c != null) {
                ((LevelPlayRewardedVideoManualListener) C3127fr.this.f8611c).onAdReady(C3127fr.this.m12747a(this.f8633a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C3127fr.this.m12747a(this.f8633a));
            }
        }
    }

    /* renamed from: com.ironsource.fr$i */
    public class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f8635a;

        public i(AdInfo adInfo) {
            this.f8635a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8610b != null) {
                ((LevelPlayRewardedVideoManualListener) C3127fr.this.f8610b).onAdReady(C3127fr.this.m12747a(this.f8635a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C3127fr.this.m12747a(this.f8635a));
            }
        }
    }

    /* renamed from: com.ironsource.fr$j */
    public class j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f8637a;

        public j(IronSourceError ironSourceError) {
            this.f8637a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8611c != null) {
                ((LevelPlayRewardedVideoManualListener) C3127fr.this.f8611c).onAdLoadFailed(this.f8637a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f8637a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.fr$k */
    public class k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f8639a;

        public k(IronSourceError ironSourceError) {
            this.f8639a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8610b != null) {
                ((LevelPlayRewardedVideoManualListener) C3127fr.this.f8610b).onAdLoadFailed(this.f8639a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f8639a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.fr$l */
    public class l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f8641a;

        public l(AdInfo adInfo) {
            this.f8641a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8611c != null) {
                C3127fr.this.f8611c.onAdOpened(C3127fr.this.m12747a(this.f8641a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C3127fr.this.m12747a(this.f8641a));
            }
        }
    }

    /* renamed from: com.ironsource.fr$m */
    public class m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f8643a;

        public m(AdInfo adInfo) {
            this.f8643a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8610b != null) {
                C3127fr.this.f8610b.onAdOpened(C3127fr.this.m12747a(this.f8643a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C3127fr.this.m12747a(this.f8643a));
            }
        }
    }

    /* renamed from: com.ironsource.fr$n */
    public class n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f8645a;

        public n(AdInfo adInfo) {
            this.f8645a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8611c != null) {
                C3127fr.this.f8611c.onAdClosed(C3127fr.this.m12747a(this.f8645a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C3127fr.this.m12747a(this.f8645a));
            }
        }
    }

    /* renamed from: com.ironsource.fr$o */
    public class o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f8647a;

        public o(AdInfo adInfo) {
            this.f8647a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3127fr.this.f8610b != null) {
                C3127fr.this.f8610b.onAdClosed(C3127fr.this.m12747a(this.f8647a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C3127fr.this.m12747a(this.f8647a));
            }
        }
    }

    /* renamed from: com.ironsource.fr$p */
    public class p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f8649a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f8650b;

        public p(boolean z, AdInfo adInfo) {
            this.f8649a = z;
            this.f8650b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog ironLog;
            String str;
            if (C3127fr.this.f8611c != null) {
                if (this.f8649a) {
                    ((LevelPlayRewardedVideoListener) C3127fr.this.f8611c).onAdAvailable(C3127fr.this.m12747a(this.f8650b));
                    ironLog = IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + C3127fr.this.m12747a(this.f8650b);
                } else {
                    ((LevelPlayRewardedVideoListener) C3127fr.this.f8611c).onAdUnavailable();
                    ironLog = IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    private C3127fr() {
    }

    /* renamed from: a */
    public static C3127fr m8748a() {
        return f8609d;
    }

    /* renamed from: c */
    public void m8787c() {
    }

    /* renamed from: d */
    public void m8789d(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable iVar;
        if (this.f8611c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new h(adInfo);
        } else {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f8610b;
            if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new i(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(iVar);
    }

    /* renamed from: b */
    public void m8783b() {
    }

    /* renamed from: c */
    public void m8788c(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable mVar;
        if (this.f8611c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            mVar = new l(adInfo);
        } else {
            if (this.f8610b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            mVar = new m(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(mVar);
    }

    /* renamed from: a */
    public void m8778a(IronSourceError ironSourceError) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable kVar;
        if (this.f8611c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new j(ironSourceError);
        } else {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f8610b;
            if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new k(ironSourceError);
        }
        ironSourceThreadManager.postOnUiThreadTask(kVar);
    }

    /* renamed from: b */
    public void m8784b(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable oVar;
        if (this.f8611c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            oVar = new n(adInfo);
        } else {
            if (this.f8610b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            oVar = new o(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(oVar);
    }

    /* renamed from: a */
    public void m8779a(IronSourceError ironSourceError, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable eVar;
        if (this.f8611c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new d(ironSourceError, adInfo);
        } else {
            if (this.f8610b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new e(ironSourceError, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(eVar);
    }

    /* renamed from: b */
    public void m8785b(Placement placement, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable cVar;
        if (this.f8611c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new b(placement, adInfo);
        } else {
            if (this.f8610b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new c(placement, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(cVar);
    }

    /* renamed from: a */
    public void m8780a(Placement placement, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable gVar;
        if (this.f8611c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new f(placement, adInfo);
        } else {
            if (this.f8610b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new g(placement, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(gVar);
    }

    /* renamed from: b */
    public void m8786b(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.f8611c = levelPlayRewardedVideoBaseListener;
    }

    /* renamed from: a */
    public void m8781a(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.f8610b = levelPlayRewardedVideoBaseListener;
    }

    /* renamed from: a */
    private void m8751a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    /* renamed from: a */
    public void m8782a(boolean z, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable aVar;
        if (this.f8611c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new p(z, adInfo);
        } else {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f8610b;
            if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoListener)) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new a(z, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(aVar);
    }
}
