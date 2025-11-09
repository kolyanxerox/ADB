package com.ironsource;

import android.app.Activity;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.ironsource.C2992c2;
import com.ironsource.C3183hd;
import com.ironsource.C3349m1;
import com.ironsource.InterfaceC3171h1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.C4201a;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;

/* renamed from: com.ironsource.hm */
/* loaded from: classes2.dex */
public final class C3192hm implements InterfaceC3148gd {

    /* renamed from: n */
    public static final a f8886n = new a(null);

    /* renamed from: o */
    public static final String f8887o = "Fullscreen Ad Internal";

    /* renamed from: a */
    private final LevelPlay.AdFormat f8888a;

    /* renamed from: b */
    private final String f8889b;

    /* renamed from: c */
    private final b f8890c;

    /* renamed from: d */
    private final C3349m1 f8891d;

    /* renamed from: e */
    private final C3113fd f8892e;

    /* renamed from: f */
    private final InterfaceC3753v1 f8893f;

    /* renamed from: g */
    private final InterfaceC3116fg f8894g;

    /* renamed from: h */
    private final InterfaceC3621s9 f8895h;

    /* renamed from: i */
    private final oo00o.OooO0OO f8896i;

    /* renamed from: j */
    private InterfaceC3227im f8897j;

    /* renamed from: k */
    private final UUID f8898k;

    /* renamed from: l */
    private InterfaceC3520pd f8899l;

    /* renamed from: m */
    private C3216ib f8900m;

    /* renamed from: com.ironsource.hm$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final boolean m9207a(String placementName, LevelPlay.AdFormat adFormat) {
            kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
            kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
            C3349m1 c3349m1M9973a = C3349m1.a.m9973a(C4201a.m13452a(adFormat), C2992c2.b.MEDIATION);
            if (!c3349m1M9973a.m9972g()) {
                c3349m1M9973a.m9970e().m7902a().m9942a(placementName, "SDK is not initialized", false);
                return false;
            }
            C3445n8 c3445n8Mo9120a = C3495on.f10667s.m11213d().mo8697y().mo9120a(placementName, adFormat);
            boolean zM10966d = c3445n8Mo9120a.m10966d();
            c3349m1M9973a.m9970e().m7902a().m9942a(placementName, c3445n8Mo9120a.m10967e(), zM10966d);
            return zM10966d;
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: com.ironsource.hm$b */
    public interface b {
        Double getBidFloor();
    }

    /* renamed from: com.ironsource.hm$c */
    public static final class c {

        /* renamed from: a */
        private final C3349m1 f8901a;

        /* renamed from: b */
        private final C3113fd f8902b;

        /* renamed from: c */
        private final InterfaceC3116fg f8903c;

        /* renamed from: d */
        private final InterfaceC3621s9 f8904d;

        /* renamed from: e */
        private final C3697tf f8905e;

        /* renamed from: f */
        private final b f8906f;

        public c(C3349m1 adTools, C3113fd adControllerFactory, InterfaceC3116fg provider, InterfaceC3621s9 currentTimeProvider, C3697tf idFactory, b config) {
            kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
            kotlin.jvm.internal.OooOo.OooO0o0(adControllerFactory, "adControllerFactory");
            kotlin.jvm.internal.OooOo.OooO0o0(provider, "provider");
            kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
            kotlin.jvm.internal.OooOo.OooO0o0(idFactory, "idFactory");
            kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
            this.f8901a = adTools;
            this.f8902b = adControllerFactory;
            this.f8903c = provider;
            this.f8904d = currentTimeProvider;
            this.f8905e = idFactory;
            this.f8906f = config;
        }

        /* renamed from: a */
        public final C3113fd m9208a() {
            return this.f8902b;
        }

        /* renamed from: b */
        public final C3349m1 m9209b() {
            return this.f8901a;
        }

        /* renamed from: c */
        public final b m9210c() {
            return this.f8906f;
        }

        /* renamed from: d */
        public final InterfaceC3621s9 m9211d() {
            return this.f8904d;
        }

        /* renamed from: e */
        public final C3697tf m9212e() {
            return this.f8905e;
        }

        /* renamed from: f */
        public final InterfaceC3116fg m9213f() {
            return this.f8903c;
        }
    }

    /* renamed from: com.ironsource.hm$d */
    public static final class d extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {
        public d() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a */
        public final C3073ed invoke() {
            return C3192hm.this.m9178c();
        }
    }

    /* renamed from: com.ironsource.hm$e */
    public static final class e implements InterfaceC3590rd {

        /* renamed from: b */
        final /* synthetic */ C3061e1 f8909b;

        public e(C3061e1 c3061e1) {
            this.f8909b = c3061e1;
        }

        @Override // com.ironsource.InterfaceC3590rd
        /* renamed from: a */
        public C3555qd mo9215a(boolean z, InterfaceC3695td listener) {
            kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
            AbstractC3718u1 abstractC3718u1Mo9691a = C3192hm.this.m9198h().mo9691a(z, this.f8909b);
            return new C3555qd(C3495on.f10667s.m11212c(), new C3719u2(C3192hm.this.m9197g(), abstractC3718u1Mo9691a, C2992c2.b.MEDIATION), abstractC3718u1Mo9691a, listener, null, null, null, null, 240, null);
        }
    }

    public C3192hm(LevelPlay.AdFormat adFormat, String adUnitId, b config, C3349m1 adTools, C3113fd fullscreenAdControllerFactory, InterfaceC3753v1 adUnitDataFactory, InterfaceC3116fg mediationServicesProvider, InterfaceC3621s9 currentTimeProvider, C3697tf idFactory) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitDataFactory, "adUnitDataFactory");
        kotlin.jvm.internal.OooOo.OooO0o0(mediationServicesProvider, "mediationServicesProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(idFactory, "idFactory");
        this.f8888a = adFormat;
        this.f8889b = adUnitId;
        this.f8890c = config;
        this.f8891d = adTools;
        this.f8892e = fullscreenAdControllerFactory;
        this.f8893f = adUnitDataFactory;
        this.f8894g = mediationServicesProvider;
        this.f8895h = currentTimeProvider;
        this.f8896i = o0OOO0.OooO0oo(new d());
        UUID uuidM12424a = idFactory.m12424a();
        this.f8898k = uuidM12424a;
        this.f8899l = new C3183hd(this, null, 2, null);
        adTools.m9970e().m7903a(new C3436n(C4201a.m13452a(adFormat), uuidM12424a, adUnitId));
        m9185q();
    }

    /* renamed from: c */
    public final C3073ed m9178c() {
        C3061e1 c3061e1 = new C3061e1(C4201a.m13452a(this.f8888a), this.f8898k, this.f8889b, null, this.f8894g.mo8691o().mo9703a(), this.f8890c.getBidFloor(), 8, null);
        e eVar = new e(c3061e1);
        C2967bc c2967bcM9970e = this.f8891d.m9970e();
        C3349m1 c3349m1 = this.f8891d;
        c2967bcM9970e.m7903a(new C2628a2(c3349m1, c3061e1, c3349m1.m9965b(this.f8888a, this.f8889b).m12772b().m12775b()));
        return this.f8892e.m8679a(this, this.f8891d, c3061e1, eVar);
    }

    /* renamed from: q */
    private final void m9185q() {
        Double bidFloor = this.f8890c.getBidFloor();
        if (bidFloor != null) {
            this.f8891d.m9970e().m7909f().m13106a(bidFloor.doubleValue());
        }
    }

    @Override // com.ironsource.InterfaceC3148gd
    /* renamed from: b */
    public void mo8946b() {
        this.f8891d.m13101d(new Oooo000(this, 1));
    }

    /* renamed from: d */
    public final C3073ed m9194d() {
        return (C3073ed) this.f8896i.getValue();
    }

    /* renamed from: e */
    public final LevelPlay.AdFormat m9195e() {
        return this.f8888a;
    }

    /* renamed from: f */
    public final UUID m9196f() {
        return this.f8898k;
    }

    /* renamed from: g */
    public final C3349m1 m9197g() {
        return this.f8891d;
    }

    /* renamed from: h */
    public final InterfaceC3753v1 m9198h() {
        return this.f8893f;
    }

    /* renamed from: i */
    public final String m9199i() {
        return this.f8889b;
    }

    /* renamed from: j */
    public final b m9200j() {
        return this.f8890c;
    }

    /* renamed from: k */
    public final InterfaceC3621s9 m9201k() {
        return this.f8895h;
    }

    /* renamed from: l */
    public final InterfaceC3227im m9202l() {
        return this.f8897j;
    }

    /* renamed from: m */
    public final InterfaceC3116fg m9203m() {
        return this.f8894g;
    }

    /* renamed from: n */
    public final boolean m9204n() {
        InterfaceC3171h1 interfaceC3171h1Mo9118d = this.f8899l.mo9118d();
        this.f8891d.m9970e().m7908e().m7948a(Boolean.valueOf(interfaceC3171h1Mo9118d.mo9031a()), interfaceC3171h1Mo9118d instanceof InterfaceC3171h1.a ? ((InterfaceC3171h1.a) interfaceC3171h1Mo9118d).m9035c() : null);
        return interfaceC3171h1Mo9118d.mo9031a();
    }

    /* renamed from: o */
    public final void m9205o() {
        this.f8900m = new C3216ib();
        this.f8891d.m13101d(new Oooo000(this, 2));
    }

    @Override // com.ironsource.InterfaceC3148gd
    public void onAdClicked() {
        this.f8891d.m13101d(new Oooo000(this, 0));
    }

    @Override // com.ironsource.InterfaceC3148gd
    public void onAdClosed() {
        this.f8891d.m13101d(new Oooo000(this, 4));
    }

    @Override // com.ironsource.InterfaceC3148gd
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8891d.m13101d(new Oooo0(this, adInfo, 0));
    }

    @Override // com.ironsource.InterfaceC3148gd
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f8891d.m13101d(new OooOo(this, error, 3));
    }

    @Override // com.ironsource.InterfaceC3148gd
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8891d.m13101d(new Oooo0(this, adInfo, 1));
    }

    /* renamed from: p */
    public final void m9206p() {
        m9189a(new C3361md(this, this.f8895h));
        m9194d().m8474o();
    }

    public /* synthetic */ C3192hm(LevelPlay.AdFormat adFormat, String str, b bVar, C3349m1 c3349m1, C3113fd c3113fd, InterfaceC3753v1 interfaceC3753v1, InterfaceC3116fg interfaceC3116fg, InterfaceC3621s9 interfaceC3621s9, C3697tf c3697tf, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(adFormat, str, bVar, c3349m1, c3113fd, interfaceC3753v1, (i & 64) != 0 ? C3495on.f10667s.m11213d() : interfaceC3116fg, interfaceC3621s9, c3697tf);
    }

    /* renamed from: b */
    public static final void m9175b(C3192hm this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f8891d.m9970e().m7909f().m13105a();
        this$0.f8899l.loadAd();
    }

    /* renamed from: c */
    public static final void m9179c(C3192hm this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f8899l.onAdClicked();
    }

    /* renamed from: d */
    public static final void m9182d(C3192hm this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f8899l.onAdClosed();
    }

    /* renamed from: e */
    public static final void m9183e(C3192hm this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f8899l.mo9116b();
    }

    /* renamed from: f */
    public static final void m9184f(C3192hm this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f8899l.mo9113a();
    }

    @Override // com.ironsource.InterfaceC3148gd
    /* renamed from: a */
    public void mo8943a() {
        this.f8891d.m13101d(new Oooo000(this, 3));
    }

    /* renamed from: a */
    public static final void m9166a(Activity activity, C3192hm this$0, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "$activity");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        ContextProvider.getInstance().updateActivity(activity);
        this$0.f8891d.m9970e().m7911h().m9913d();
        this$0.f8899l.mo9114a(activity, str);
    }

    /* renamed from: b */
    public static final void m9176b(C3192hm this$0, LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        this$0.f8899l.mo9115a(error);
    }

    /* renamed from: c */
    public static final void m9180c(C3192hm this$0, LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        this$0.f8899l.onAdLoadFailed(error);
    }

    /* renamed from: b */
    public static final void m9177b(C3192hm this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        this$0.f8899l.onAdInfoChanged(adInfo);
    }

    /* renamed from: c */
    public static final void m9181c(C3192hm this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        this$0.f8899l.onAdLoaded(adInfo);
    }

    /* renamed from: a */
    public final void m9186a(Activity activity, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f8891d.m13101d(new androidx.webkit.OooO00o(activity, this, str, 25));
    }

    /* renamed from: a */
    public final void m9187a(C3183hd.a status) {
        kotlin.jvm.internal.OooOo.OooO0o0(status, "status");
        this.f8899l = new C3183hd(this, status);
    }

    /* renamed from: a */
    public static final void m9167a(C3192hm this$0, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f8891d.m9970e().m7909f().m13107a(j);
    }

    /* renamed from: a */
    public static final void m9168a(C3192hm this$0, long j, LevelPlayAdError levelPlayAdError) {
        String errorMessage;
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        C3845xp c3845xpM7909f = this$0.f8891d.m9970e().m7909f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (errorMessage = levelPlayAdError.getErrorMessage()) == null) {
            errorMessage = "";
        }
        c3845xpM7909f.m13108a(j, errorCode, errorMessage);
    }

    /* renamed from: a */
    public static final void m9169a(C3192hm this$0, LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        this$0.f8891d.m9970e().m7911h().m9900a(error);
    }

    /* renamed from: a */
    public static /* synthetic */ void m9170a(C3192hm c3192hm, LevelPlayAdError levelPlayAdError, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c3192hm.m9190a(levelPlayAdError, j);
    }

    /* renamed from: a */
    public static final void m9171a(C3192hm this$0, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        InterfaceC3227im interfaceC3227im = this$0.f8897j;
        if (interfaceC3227im != null) {
            interfaceC3227im.onAdDisplayFailed(error, adInfo);
        }
    }

    /* renamed from: a */
    public static final void m9172a(C3192hm this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        InterfaceC3227im interfaceC3227im = this$0.f8897j;
        if (interfaceC3227im != null) {
            interfaceC3227im.onAdLoaded(adInfo);
        }
    }

    /* renamed from: a */
    public static final void m9173a(C3192hm this$0, LevelPlayReward reward) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(reward, "$reward");
        InterfaceC3227im interfaceC3227im = this$0.f8897j;
        if (interfaceC3227im != null) {
            interfaceC3227im.onAdRewarded(reward, this$0.f8899l.mo9117c());
        }
    }

    /* renamed from: a */
    public final void m9188a(InterfaceC3227im interfaceC3227im) {
        this.f8897j = interfaceC3227im;
    }

    /* renamed from: a */
    public final void m9189a(InterfaceC3520pd state) {
        kotlin.jvm.internal.OooOo.OooO0o0(state, "state");
        this.f8899l = state;
    }

    @Override // com.ironsource.InterfaceC3148gd
    /* renamed from: a */
    public void mo8944a(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f8891d.m13101d(new OooOo(this, error, 2));
    }

    /* renamed from: a */
    public final void m9190a(LevelPlayAdError levelPlayAdError, long j) {
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f8891d, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.f8891d.m13101d(new com.applovin.impl.o00Oo0(this, j, levelPlayAdError, 1));
        this.f8891d.m13102e(new OooOo(this, levelPlayAdError));
    }

    /* renamed from: a */
    public static final void m9174a(LevelPlayAdError levelPlayAdError, C3192hm this$0) {
        InterfaceC3227im interfaceC3227im;
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        if (levelPlayAdError == null || (interfaceC3227im = this$0.f8897j) == null) {
            return;
        }
        interfaceC3227im.onAdLoadFailed(levelPlayAdError);
    }

    /* renamed from: a */
    public final void m9191a(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f8891d, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.f8891d.m13101d(new OooOo(this, error, 0));
        this.f8891d.m13102e(new androidx.webkit.OooO00o(this, error, adInfo, 24));
    }

    /* renamed from: a */
    public final void m9192a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f8891d, "onAdLoaded adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.f8891d.m13101d(new com.applovin.impl.OooO0O0(this, 2, C3216ib.m9304a(this.f8900m)));
        this.f8891d.m13102e(new Oooo0(this, adInfo, 2));
    }

    @Override // com.ironsource.InterfaceC3148gd
    /* renamed from: a */
    public void mo8945a(LevelPlayReward reward) {
        kotlin.jvm.internal.OooOo.OooO0o0(reward, "reward");
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f8891d, "onAdRewarded adInfo: " + this.f8899l.mo9117c() + " reward: " + reward, (String) null, 2, (Object) null));
        this.f8891d.m13102e(new o00000O0(11, this, reward));
    }

    /* renamed from: a */
    public final void m9193a(String message) {
        kotlin.jvm.internal.OooOo.OooO0o0(message, "message");
        this.f8891d.m9970e().m7911h().m9917f("Fullscreen Ad Internal - ".concat(message));
    }
}
