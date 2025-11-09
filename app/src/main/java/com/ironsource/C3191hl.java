package com.ironsource;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.mediationsdk.C3406r;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.hl */
/* loaded from: classes2.dex */
public class C3191hl {

    /* renamed from: i */
    private static final String f8875i = "WaterfallLifeCycleHolder";

    /* renamed from: d */
    private C3406r f8879d;

    /* renamed from: e */
    private final List<String> f8880e;

    /* renamed from: f */
    private final int f8881f;

    /* renamed from: a */
    ConcurrentHashMap<String, CopyOnWriteArrayList<C3406r>> f8876a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private String f8877b = "";

    /* renamed from: c */
    private String f8878c = "";

    /* renamed from: g */
    private final Timer f8882g = new Timer();

    /* renamed from: h */
    ConcurrentHashMap<String, AdInfo> f8883h = new ConcurrentHashMap<>();

    /* renamed from: com.ironsource.hl$a */
    public class a extends TimerTask {

        /* renamed from: a */
        final /* synthetic */ String f8884a;

        public a(String str) {
            this.f8884a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f8884a + " from memory");
                C3191hl.this.f8876a.remove(this.f8884a);
                ironLog.verbose("waterfall size is currently " + C3191hl.this.f8876a.size());
                ironLog.verbose("removing adInfo with id " + this.f8884a + " from memory");
                C3191hl.this.f8883h.remove(this.f8884a);
                ironLog.verbose("adInfo size is currently " + C3191hl.this.f8883h.size());
            } finally {
                cancel();
            }
        }
    }

    public C3191hl(List<String> list, int i) {
        this.f8880e = list;
        this.f8881f = i;
    }

    /* renamed from: b */
    private void m9153b() {
        Iterator<C3406r> it = m9160c().iterator();
        while (it.hasNext()) {
            C3406r next = it.next();
            if (!next.equals(this.f8879d)) {
                next.mo10787q();
            }
        }
    }

    /* renamed from: a */
    public AdInfo m9154a(String str) {
        if (this.f8883h.containsKey(str)) {
            return this.f8883h.get(str);
        }
        return null;
    }

    /* renamed from: c */
    public CopyOnWriteArrayList<C3406r> m9160c() {
        CopyOnWriteArrayList<C3406r> copyOnWriteArrayList = this.f8876a.get(this.f8877b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    /* renamed from: d */
    public String m9161d() {
        return this.f8877b;
    }

    /* renamed from: e */
    public int m9162e() {
        return this.f8876a.size();
    }

    /* renamed from: f */
    public C3406r m9163f() {
        return this.f8879d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m9164g() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.mediationsdk.r r0 = r2.f8879d     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.m10632u()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r2.f8878c     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L13:
            r0 = move-exception
            goto L18
        L15:
            r0 = 0
        L16:
            monitor-exit(r2)
            return r0
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3191hl.m9164g():boolean");
    }

    /* renamed from: a */
    public synchronized void m9155a(C3406r c3406r) {
        try {
            IronLog.INTERNAL.verbose();
            C3406r c3406r2 = this.f8879d;
            if (c3406r2 != null && !c3406r2.equals(c3406r)) {
                this.f8879d.mo10787q();
            }
            this.f8879d = c3406r;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m9159b(com.ironsource.mediationsdk.C3406r r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> L2f
            r0.verbose()     // Catch: java.lang.Throwable -> L2f
            r1 = 1
            if (r6 == 0) goto L55
            boolean r2 = r6.m10807o()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L10
            goto L55
        L10:
            com.ironsource.mediationsdk.r r2 = r5.f8879d     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r2 != 0) goto L16
            goto L56
        L16:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r2 = r6.m10633w()     // Catch: java.lang.Throwable -> L2f
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch: java.lang.Throwable -> L2f
            if (r2 != r4) goto L31
            com.ironsource.mediationsdk.r r2 = r5.f8879d     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.mo9129c()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r6.mo9129c()     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L31
            goto L55
        L2f:
            r6 = move-exception
            goto L76
        L31:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r2 = r6.m10633w()     // Catch: java.lang.Throwable -> L2f
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch: java.lang.Throwable -> L2f
            if (r2 == r4) goto L45
            java.util.List<java.lang.String> r2 = r5.f8880e     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r6.m10804j()     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L56
        L45:
            com.ironsource.mediationsdk.r r2 = r5.f8879d     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.m10804j()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r6.m10804j()     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L56
        L55:
            r3 = r1
        L56:
            if (r3 == 0) goto L72
            if (r6 == 0) goto L72
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r2.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = r6.mo9129c()     // Catch: java.lang.Throwable -> L2f
            r2.append(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = " will not be added to the auction request"
            r2.append(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L2f
            r0.verbose(r6)     // Catch: java.lang.Throwable -> L2f
        L72:
            r6 = r3 ^ 1
            monitor-exit(r5)
            return r6
        L76:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3191hl.m9159b(com.ironsource.mediationsdk.r):boolean");
    }

    /* renamed from: a */
    public void m9156a(String str, ImpressionData impressionData, C3013cn c3013cn) {
        if (TextUtils.isEmpty(str) || impressionData == null) {
            return;
        }
        this.f8883h.put(str, new AdInfo(impressionData, c3013cn));
    }

    /* renamed from: a */
    public void m9157a(CopyOnWriteArrayList<C3406r> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        m9153b();
        this.f8876a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f8878c)) {
            if (m9164g()) {
                StringBuilder sb = new StringBuilder("ad from previous waterfall ");
                sb.append(this.f8878c);
                sb.append(" is still showing - the current waterfall ");
                AbstractC2183w4.OooOOo(sb, this.f8877b, " will be deleted instead", ironLog);
                String str2 = this.f8877b;
                this.f8877b = this.f8878c;
                this.f8878c = str2;
            }
            this.f8882g.schedule(new a(this.f8878c), this.f8881f);
        }
        this.f8878c = this.f8877b;
        this.f8877b = str;
    }

    /* renamed from: a */
    public boolean m9158a() {
        return this.f8876a.size() > 5;
    }
}
