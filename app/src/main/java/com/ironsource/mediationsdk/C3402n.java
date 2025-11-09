package com.ironsource.mediationsdk;

import com.ironsource.C2937ah;
import com.ironsource.C3127fr;
import com.ironsource.C3687t5;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.n */
/* loaded from: classes2.dex */
public class C3402n {

    /* renamed from: f */
    private static final C3402n f9954f = new C3402n();

    /* renamed from: a */
    private final Map<String, Long> f9955a = new HashMap();

    /* renamed from: b */
    private final Map<String, Boolean> f9956b = new HashMap();

    /* renamed from: c */
    private int f9957c;

    /* renamed from: d */
    private int f9958d;

    /* renamed from: e */
    private int f9959e;

    /* renamed from: com.ironsource.mediationsdk.n$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSource.AD_UNIT f9960a;

        /* renamed from: b */
        final /* synthetic */ IronSourceError f9961b;

        /* renamed from: c */
        final /* synthetic */ String f9962c;

        public a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError, String str) {
            this.f9960a = ad_unit;
            this.f9961b = ironSourceError;
            this.f9962c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            C3402n.this.m10399a(this.f9960a, this.f9961b);
            C3402n.this.f9956b.put(this.f9962c, Boolean.FALSE);
        }
    }

    private C3402n() {
    }

    /* renamed from: a */
    private int m10396a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f9958d;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f9957c;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.f9959e;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return 0;
    }

    /* renamed from: b */
    public synchronized void m10402b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        if (m10403b(ad_unit)) {
            return;
        }
        String string = ad_unit.toString();
        if (!this.f9955a.containsKey(string)) {
            m10399a(ad_unit, ironSourceError);
            return;
        }
        long jM10396a = m10396a(ad_unit) * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f9955a.get(string).longValue();
        if (jCurrentTimeMillis > jM10396a) {
            m10399a(ad_unit, ironSourceError);
            return;
        }
        this.f9956b.put(string, Boolean.TRUE);
        long j = jM10396a - jCurrentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j);
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(ad_unit, ironSourceError, string), j);
    }

    /* renamed from: a */
    public static synchronized C3402n m10397a() {
        return f9954f;
    }

    /* renamed from: b */
    public synchronized boolean m10403b(IronSource.AD_UNIT ad_unit) {
        if (!this.f9956b.containsKey(ad_unit.toString())) {
            return false;
        }
        return this.f9956b.get(ad_unit.toString()).booleanValue();
    }

    /* renamed from: a */
    public void m10401a(IronSource.AD_UNIT ad_unit, int i) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f9958d = i;
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f9957c = i;
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f9959e = i;
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10399a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.f9955a.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C3127fr.m8748a().m8778a(ironSourceError);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            C2937ah.m7765a().m7793a(ironSourceError);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            C3687t5.m12363a().m12384a(ironSourceError);
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
    }
}
