package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.C0987b6;
import com.applovin.impl.adview.C0972g;
import com.applovin.impl.adview.C0976k;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.C1206a;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.w1 */
/* loaded from: classes.dex */
public class C1274w1 extends AbstractC1265v1 {

    /* renamed from: M */
    private final C1283x1 f2991M;

    /* renamed from: N */
    private C1031g0 f2992N;

    /* renamed from: O */
    private long f2993O;

    /* renamed from: P */
    private final AtomicBoolean f2994P;

    public C1274w1(AbstractC1207b abstractC1207b, Activity activity, Map map, C1220k c1220k, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(abstractC1207b, activity, map, c1220k, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f2991M = new C1283x1(this.f2483a, this.f2486d, this.f2484b);
        this.f2994P = new AtomicBoolean();
    }

    /* renamed from: B */
    private long m3587B() {
        AbstractC1207b abstractC1207b = this.f2483a;
        if (!(abstractC1207b instanceof C1206a)) {
            return 0L;
        }
        float fM2489t1 = ((C1206a) abstractC1207b).m2489t1();
        if (fM2489t1 <= 0.0f) {
            fM2489t1 = this.f2483a.m2632s();
        }
        return (long) ((this.f2483a.m2542I() / 100.0d) * AbstractC1078k7.m1223c(fM2489t1));
    }

    /* renamed from: C */
    private int m3588C() {
        C1031g0 c1031g0;
        int iMin = 100;
        if (m3477g()) {
            if (!m3592D() && (c1031g0 = this.f2992N) != null) {
                iMin = (int) Math.min(100.0d, ((this.f2993O - c1031g0.m772b()) / this.f2993O) * 100.0d);
            }
            if (C1240o.m3200a()) {
                this.f2485c.m3211a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m3589E() {
        if (C1240o.m3200a()) {
            this.f2485c.m3211a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.f2994P.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m3590F() {
        this.f2499q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m3591G() {
        ArrayList arrayList = new ArrayList();
        C0972g c0972g = this.f2493k;
        if (c0972g != null) {
            arrayList.add(new C1015e4(c0972g, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        C0976k c0976k = this.f2492j;
        if (c0976k != null && c0976k.m295a()) {
            C0976k c0976k2 = this.f2492j;
            arrayList.add(new C1015e4(c0976k2, FriendlyObstructionPurpose.NOT_VISIBLE, c0976k2.getIdentifier()));
        }
        this.f2483a.getAdEventTracker().m469b(this.f2491i, arrayList);
    }

    /* renamed from: D */
    public boolean m3592D() {
        if (!(this.f2480J && this.f2483a.m2621n1()) && m3477g()) {
            return this.f2994P.get();
        }
        return true;
    }

    /* renamed from: H */
    public void m3593H() {
        long jM2569Z;
        long millis = 0;
        if (this.f2483a.m2567Y() >= 0 || this.f2483a.m2569Z() >= 0) {
            if (this.f2483a.m2567Y() >= 0) {
                jM2569Z = this.f2483a.m2567Y();
            } else {
                if (this.f2483a.m2611j1()) {
                    int iM2489t1 = (int) ((C1206a) this.f2483a).m2489t1();
                    if (iM2489t1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iM2489t1);
                    } else {
                        int iM2632s = (int) this.f2483a.m2632s();
                        if (iM2632s > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iM2632s);
                        }
                    }
                }
                jM2569Z = (long) ((this.f2483a.m2569Z() / 100.0d) * millis);
            }
            m3469c(jM2569Z);
        }
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: a */
    public void mo3458a(ViewGroup viewGroup) {
        this.f2991M.m3639a(this.f2493k, this.f2492j, this.f2491i, viewGroup);
        if (((Boolean) this.f2484b.m2866a(C1268v4.f2624L5)).booleanValue() || !m3465a(false)) {
            C0976k c0976k = this.f2492j;
            if (c0976k != null) {
                c0976k.m296b();
            }
            this.f2491i.renderAd(this.f2483a);
            mo3463a("javascript:al_onPoststitialShow();", this.f2483a.m2540H());
            if (m3477g()) {
                long jM3587B = m3587B();
                this.f2993O = jM3587B;
                if (jM3587B > 0) {
                    if (C1240o.m3200a()) {
                        this.f2485c.m3211a("AppLovinFullscreenActivity", OooO0oO.OooOo.OooOOOO(new StringBuilder("Scheduling timer for ad fully watched in "), this.f2993O, "ms..."));
                    }
                    final int i = 0;
                    this.f2992N = C1031g0.m768a(this.f2993O, this.f2484b, new Runnable(this) { // from class: com.applovin.impl.o000O0

                        /* renamed from: OooOo0o, reason: collision with root package name */
                        public final /* synthetic */ C1274w1 f15744OooOo0o;

                        {
                            this.f15744OooOo0o = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    this.f15744OooOo0o.m3589E();
                                    break;
                                case 1:
                                    this.f15744OooOo0o.m3590F();
                                    break;
                                default:
                                    this.f15744OooOo0o.m3591G();
                                    break;
                            }
                        }
                    });
                }
            }
            if (this.f2493k != null) {
                if (this.f2483a.m2632s() >= 0) {
                    final int i2 = 1;
                    m3459a(this.f2493k, this.f2483a.m2632s(), new Runnable(this) { // from class: com.applovin.impl.o000O0

                        /* renamed from: OooOo0o, reason: collision with root package name */
                        public final /* synthetic */ C1274w1 f15744OooOo0o;

                        {
                            this.f15744OooOo0o = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    this.f15744OooOo0o.m3589E();
                                    break;
                                case 1:
                                    this.f15744OooOo0o.m3590F();
                                    break;
                                default:
                                    this.f15744OooOo0o.m3591G();
                                    break;
                            }
                        }
                    });
                } else {
                    this.f2493k.setVisibility(0);
                }
            }
            m3593H();
            final int i3 = 2;
            this.f2484b.m2918r0().m404a(new C1156p6(this.f2484b, "updateMainViewOM", new Runnable(this) { // from class: com.applovin.impl.o000O0

                /* renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ C1274w1 f15744OooOo0o;

                {
                    this.f15744OooOo0o = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            this.f15744OooOo0o.m3589E();
                            break;
                        case 1:
                            this.f15744OooOo0o.m3590F();
                            break;
                        default:
                            this.f15744OooOo0o.m3591G();
                            break;
                    }
                }
            }), C0987b6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
            m3483o();
            super.m3470c(AbstractC1078k7.m1239e(this.f2484b));
        }
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: b */
    public void mo3467b(long j) {
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: d */
    public void mo3471d() {
        super.mo3471d();
        mo3493z();
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: e */
    public void mo3474e() {
        super.mo3474e();
        mo3493z();
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: l */
    public void mo3480l() {
        super.m3456a(m3588C(), false, m3592D(), -2L);
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: u */
    public void mo3489u() {
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: v */
    public void mo3490v() {
        mo3458a((ViewGroup) null);
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: w */
    public void mo3491w() {
        super.mo3491w();
        this.f2994P.set(true);
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: z */
    public void mo3493z() {
        this.f2991M.mo95a(this.f2494l);
        this.f2499q = SystemClock.elapsedRealtime();
        this.f2994P.set(true);
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: a */
    public void mo3462a(String str) {
        if (!((Boolean) this.f2484b.m2866a(C1268v4.f2561D6)).booleanValue()) {
            AbstractC1207b abstractC1207b = this.f2483a;
            if (abstractC1207b != null) {
                abstractC1207b.m2576a(str);
            }
            mo3480l();
        }
        C1031g0 c1031g0 = this.f2992N;
        if (c1031g0 != null) {
            c1031g0.m771a();
            this.f2992N = null;
        }
        super.mo3462a(str);
    }
}
