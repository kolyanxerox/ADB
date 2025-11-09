package com.ironsource.mediationsdk;

import OooO0oO.OooOo;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C2963b8;
import com.ironsource.C2983bs;
import com.ironsource.C2998c8;
import com.ironsource.C3053ds;
import com.ironsource.C3127fr;
import com.ironsource.C3128fs;
import com.ironsource.C3191hl;
import com.ironsource.C3353m5;
import com.ironsource.C3477o5;
import com.ironsource.C3484oc;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.C3781vt;
import com.ironsource.C3806wk;
import com.ironsource.C3899zb;
import com.ironsource.CallableC3861y7;
import com.ironsource.EnumC2638ac;
import com.ironsource.InterfaceC3125fp;
import com.ironsource.InterfaceC3156gl;
import com.ironsource.InterfaceC3163gs;
import com.ironsource.InterfaceC3255jg;
import com.ironsource.InterfaceC3325lg;
import com.ironsource.InterfaceC3471o;
import com.ironsource.InterfaceC3581r4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C3390h;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import o000Oo.o0OO00O;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.q */
/* loaded from: classes2.dex */
class C3405q extends AbstractC3400m implements InterfaceC3156gl, InterfaceC3163gs, InterfaceC3581r4, InterfaceC3325lg, InterfaceC3125fp, InterfaceC3471o {

    /* renamed from: A */
    private e f10040A;

    /* renamed from: B */
    private long f10041B;

    /* renamed from: C */
    private Boolean f10042C;

    /* renamed from: D */
    private final Object f10043D;

    /* renamed from: E */
    private C3484oc f10044E;

    /* renamed from: F */
    private final long f10045F;

    /* renamed from: G */
    private final InterfaceC3255jg.a f10046G;

    /* renamed from: H */
    private final InterfaceC3255jg f10047H;

    /* renamed from: e */
    private C3191hl f10048e;

    /* renamed from: f */
    private ConcurrentHashMap<String, C3353m5> f10049f;

    /* renamed from: g */
    private ConcurrentHashMap<String, C3390h.a> f10050g;

    /* renamed from: h */
    private C3353m5 f10051h;

    /* renamed from: i */
    private C3390h f10052i;

    /* renamed from: j */
    private C3387e f10053j;

    /* renamed from: k */
    private JSONObject f10054k;

    /* renamed from: l */
    private C3128fs f10055l;

    /* renamed from: m */
    private boolean f10056m;

    /* renamed from: n */
    private boolean f10057n;

    /* renamed from: o */
    private long f10058o;

    /* renamed from: p */
    private String f10059p;

    /* renamed from: q */
    private int f10060q;

    /* renamed from: r */
    private NetworkStateReceiver f10061r;

    /* renamed from: s */
    private boolean f10062s;

    /* renamed from: t */
    private final ConcurrentHashMap<String, C3406r> f10063t;

    /* renamed from: u */
    private C3781vt f10064u;

    /* renamed from: v */
    private int f10065v;

    /* renamed from: w */
    private String f10066w;

    /* renamed from: x */
    private int f10067x;

    /* renamed from: y */
    private boolean f10068y;

    /* renamed from: z */
    private boolean f10069z;

    /* renamed from: com.ironsource.mediationsdk.q$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NetworkSettings f10070a;

        /* renamed from: b */
        final /* synthetic */ C2983bs f10071b;

        /* renamed from: c */
        final /* synthetic */ String f10072c;

        /* renamed from: d */
        final /* synthetic */ String f10073d;

        public a(NetworkSettings networkSettings, C2983bs c2983bs, String str, String str2) {
            this.f10070a = networkSettings;
            this.f10071b = c2983bs;
            this.f10072c = str;
            this.f10073d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3405q.this.m10573a(this.f10070a, this.f10071b, this.f10072c, this.f10073d);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.q$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3405q.this.m10605j();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.q$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3405q.this.m10600d("makeAuction()");
            C3405q.this.f10058o = new Date().getTime();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            C3405q.this.m10593b(map, arrayList, sb, arrayList2);
            C3405q.this.m10586a(map, arrayList, sb, arrayList2);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.q$d */
    public class d implements C2963b8.b {

        /* renamed from: a */
        final /* synthetic */ Map f10077a;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f10078b;

        /* renamed from: c */
        final /* synthetic */ List f10079c;

        public d(Map map, StringBuilder sb, List list) {
            this.f10077a = map;
            this.f10078b = sb;
            this.f10079c = list;
        }

        @Override // com.ironsource.C2963b8.b
        /* renamed from: a */
        public void mo7886a(List<C2998c8> list, long j, List<String> list2) {
            C3405q.this.m10595c(EnumC2638ac.RV_COLLECT_TOKENS_COMPLETED, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
            for (C2998c8 c2998c8 : list) {
                C3406r c3406r = (C3406r) C3405q.this.f10063t.get(c2998c8.m8103c());
                if (c2998c8.m8101a() != null) {
                    this.f10077a.put(c2998c8.m8103c(), c2998c8.m8101a());
                    StringBuilder sb = this.f10078b;
                    sb.append(c2998c8.m8104d());
                    sb.append(c2998c8.m8103c());
                    sb.append(",");
                    if (c3406r != null) {
                        c3406r.m10624a(EnumC2638ac.RV_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(c2998c8.m8105e())}});
                    }
                } else if (c3406r != null) {
                    c3406r.m10624a(EnumC2638ac.RV_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(c2998c8.m8105e())}, new Object[]{"reason", c2998c8.m8102b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                C3406r c3406r2 = (C3406r) C3405q.this.f10063t.get(it.next());
                if (c3406r2 != null) {
                    c3406r2.m10624a(EnumC2638ac.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
                }
            }
            C3405q.this.m10585a((Map<String, Object>) this.f10077a, (List<String>) this.f10079c, this.f10078b.toString());
        }

        @Override // com.ironsource.C2963b8.b
        public void onFailure(String str) {
            C3405q.this.m10595c(EnumC2638ac.RV_COLLECT_TOKENS_FAILED, C3806wk.m12899a(new Object[][]{new Object[]{"reason", str}}));
            C3405q.this.m10585a((Map<String, Object>) this.f10077a, (List<String>) this.f10079c, this.f10078b.toString());
        }
    }

    /* renamed from: com.ironsource.mediationsdk.q$e */
    public enum e {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public C3405q(List<NetworkSettings> list, C2983bs c2983bs, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) throws Throwable {
        super(hashSet, ironSourceSegment);
        this.f10059p = "";
        this.f10062s = false;
        this.f10065v = 1;
        this.f10043D = new Object();
        this.f10046G = C3495on.m11193O().mo8485m();
        this.f10047H = C3495on.m11199U().mo8682C();
        long time = new Date().getTime();
        m10595c(EnumC2638ac.RV_MANAGER_INIT_STARTED, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.LWS_RV_MANAGER_NAME}}));
        m10574a(e.RV_STATE_INITIATING);
        this.f10042C = null;
        this.f10067x = c2983bs.m7990g();
        this.f10068y = c2983bs.m7993j();
        this.f10066w = "";
        this.f10054k = null;
        C3477o5 c3477o5M7994k = c2983bs.m7994k();
        this.f10069z = false;
        this.f10048e = new C3191hl(c2983bs.m7994k().m11093f(), c2983bs.m7994k().m11096i());
        this.f10049f = new ConcurrentHashMap<>();
        this.f10050g = new ConcurrentHashMap<>();
        this.f10041B = new Date().getTime();
        this.f10056m = c3477o5M7994k.m11094g() > 0;
        this.f10057n = c3477o5M7994k.m11101n();
        if (this.f10056m) {
            this.f10053j = new C3387e(IronSource.AD_UNIT.REWARDED_VIDEO, c3477o5M7994k, this);
        }
        this.f10055l = new C3128fs(c3477o5M7994k, this);
        ConcurrentHashMap<String, C3406r> concurrentHashMap = new ConcurrentHashMap<>();
        this.f10063t = concurrentHashMap;
        m10583a(list, c2983bs, str, str2);
        this.f10052i = new C3390h(list, c3477o5M7994k.m11090c());
        C3781vt c3781vt = new C3781vt();
        this.f10064u = c3781vt;
        c3781vt.mo9127a(new ArrayList(concurrentHashMap.values()));
        this.f10044E = new C3484oc(c2983bs.m7986c(), this);
        this.f10045F = c2983bs.m7995l();
        m10595c(EnumC2638ac.RV_MANAGER_INIT_ENDED, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}}));
        m10569a(c3477o5M7994k.m11098k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m10595c(EnumC2638ac enumC2638ac, Map<String, Object> map) {
        m10572a(enumC2638ac, map, false, false);
    }

    /* renamed from: g */
    private List<C3353m5> m10601g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C3406r c3406r : this.f10063t.values()) {
            if (!c3406r.m10808p() && !this.f10064u.mo9125b(c3406r) && this.f10048e.m9159b(c3406r)) {
                copyOnWriteArrayList.add(new C3353m5(c3406r.mo9129c()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: h */
    private void m10603h() {
        m10574a(e.RV_STATE_NOT_LOADED);
        if (!this.f10069z) {
            m10594b(false);
        }
        this.f10055l.m8792a();
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* renamed from: i */
    private void m10604i() throws java.lang.Throwable {
        /*
            r4 = this;
            com.ironsource.hl r0 = r4.f10048e
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.m9160c()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L37
            java.lang.String r0 = "loadSmashes -  waterfall is empty"
            r4.m10600d(r0)
            com.ironsource.ac r0 = com.ironsource.EnumC2638ac.TROUBLESHOOTING_RV_LOAD_FAILED
            r1 = 80004(0x13884, float:1.1211E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "errorCode"
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.String r2 = "reason"
            java.lang.String r3 = "waterfall is empty"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.Object[][] r1 = new java.lang.Object[][]{r1, r2}
            java.util.Map r1 = com.ironsource.C3806wk.m12899a(r1)
            r4.m10571a(r0, r1)
            r4.m10603h()
            return
        L37:
            com.ironsource.mediationsdk.q$e r0 = com.ironsource.mediationsdk.C3405q.e.RV_STATE_LOADING_SMASHES
            r4.m10574a(r0)
            r0 = 0
            r1 = r0
        L3e:
            com.ironsource.hl r2 = r4.f10048e
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.m9160c()
            int r2 = r2.size()
            if (r0 >= r2) goto Lb1
            int r2 = r4.f10067x
            if (r1 >= r2) goto Lb1
            com.ironsource.hl r2 = r4.f10048e
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.m9160c()
            java.lang.Object r2 = r2.get(r0)
            com.ironsource.mediationsdk.r r2 = (com.ironsource.mediationsdk.C3406r) r2
            boolean r3 = r2.m10802h()
            if (r3 == 0) goto Lae
            boolean r3 = r4.f10068y
            if (r3 == 0) goto La9
            boolean r3 = r2.m10808p()
            if (r3 == 0) goto La9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r1 != 0) goto L8d
            java.lang.String r1 = "Advanced Loading: Starting to load bidder "
            r0.<init>(r1)
            java.lang.String r1 = r2.mo9129c()
            r0.append(r1)
            java.lang.String r1 = ". No other instances will be loaded at the same time."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.m10600d(r0)
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)
            r4.m10602g(r2)
            return
        L8d:
            java.lang.String r1 = "Advanced Loading: Won't start loading bidder "
            r0.<init>(r1)
            java.lang.String r1 = r2.mo9129c()
            r0.append(r1)
            java.lang.String r1 = " as a non bidder is being loaded"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.m10600d(r0)
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)
            return
        La9:
            r4.m10602g(r2)
            int r1 = r1 + 1
        Lae:
            int r0 = r0 + 1
            goto L3e
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3405q.m10604i():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m10605j() {
        synchronized (this.f10043D) {
            try {
                e eVar = this.f10040A;
                e eVar2 = e.RV_STATE_AUCTION_IN_PROGRESS;
                if (eVar != eVar2) {
                    m10574a(eVar2);
                    AsyncTask.execute(new c());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: k */
    private void m10606k() {
        m10584a(m10601g(), "fallback_" + System.currentTimeMillis(), this.f10054k);
    }

    @Override // com.ironsource.InterfaceC3156gl
    /* renamed from: d */
    public void mo8990d(C3406r c3406r) throws NumberFormatException {
        this.f10048e.m9155a(c3406r);
        this.f10065v++;
        m10581a(c3406r, "onRewardedVideoAdOpened");
        if (this.f10056m) {
            C3353m5 c3353m5 = this.f10049f.get(c3406r.mo9129c());
            if (c3353m5 != null) {
                C3191hl c3191hl = this.f10048e;
                c3191hl.m9156a(c3191hl.m9161d(), c3353m5.m9983a(this.f10066w), c3353m5.m9987d());
                this.f10053j.m10268a(c3353m5, c3406r.m10801g(), this.f10051h, this.f10066w);
                this.f10050g.put(c3406r.mo9129c(), C3390h.a.ISAuctionPerformanceShowedSuccessfully);
                m10386a(c3353m5, this.f10066w);
            } else {
                String strMo9129c = c3406r.mo9129c();
                m10597c(OooOo.OooOO0O("onRewardedVideoAdOpened showing instance ", strMo9129c, " missing from waterfall"));
                m10571a(EnumC2638ac.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{"reason", "Showing missing " + this.f10040A}, new Object[]{IronSourceConstants.EVENTS_EXT1, strMo9129c}}));
            }
        }
        C3127fr.m8748a().m8788c(this.f10048e.m9154a(c3406r.m10632u()));
        m10594b(false);
        this.f10055l.m8794c();
    }

    @Override // com.ironsource.InterfaceC3156gl
    /* renamed from: e */
    public void mo8991e(C3406r c3406r) {
        synchronized (this.f10043D) {
            try {
                m10581a(c3406r, "onLoadSuccess mState=" + this.f10040A);
                if (c3406r.m10632u() != this.f10048e.m9161d() || this.f10040A == e.RV_STATE_AUCTION_IN_PROGRESS) {
                    m10600d("onLoadSuccess was invoked with auctionId: " + c3406r.m10632u() + " and the current id is " + this.f10048e.m9161d());
                    c3406r.m10624a(EnumC2638ac.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 2}, new Object[]{"reason", "onLoadSuccess wrong auction ID " + this.f10040A}});
                } else {
                    this.f10050g.put(c3406r.mo9129c(), C3390h.a.ISAuctionPerformanceLoadedSuccessfully);
                    e eVar = this.f10040A;
                    e eVar2 = e.RV_STATE_LOADING_SMASHES;
                    if (eVar == eVar2) {
                        m10574a(e.RV_STATE_READY_TO_SHOW);
                        m10571a(EnumC2638ac.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - this.f10058o)}}));
                        this.f10044E.m11130a(0L);
                        if (this.f10056m) {
                            C3353m5 c3353m5 = this.f10049f.get(c3406r.mo9129c());
                            if (c3353m5 != null) {
                                C3191hl c3191hl = this.f10048e;
                                c3191hl.m9156a(c3191hl.m9161d(), c3353m5.m9983a(""), c3353m5.m9987d());
                                this.f10053j.m10267a(c3353m5, c3406r.m10801g(), this.f10051h);
                                this.f10053j.m10270a(this.f10048e.m9160c(), this.f10049f, c3406r.m10801g(), this.f10051h, c3353m5);
                            } else {
                                String strMo9129c = c3406r.mo9129c();
                                m10597c("onLoadSuccess winner instance " + strMo9129c + " missing from waterfall. auctionId: " + c3406r.m10632u() + " and the current id is " + this.f10048e.m9161d());
                                EnumC2638ac enumC2638ac = EnumC2638ac.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR;
                                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1010};
                                StringBuilder sb = new StringBuilder("Loaded missing ");
                                sb.append(eVar2);
                                m10571a(enumC2638ac, C3806wk.m12899a(new Object[][]{objArr, new Object[]{"reason", sb.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, strMo9129c}}));
                            }
                        }
                        m10594b(true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.InterfaceC3156gl
    /* renamed from: f */
    public void mo8992f(C3406r c3406r) {
        m10581a(c3406r, "onRewardedVideoAdEnded");
        C3127fr.m8748a().m8783b();
    }

    @Override // com.ironsource.InterfaceC3325lg
    public void shouldTrackNetworkState(Context context, boolean z) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager Should Track Network State: " + z, 0);
        try {
            this.f10062s = z;
            if (z) {
                if (this.f10061r == null) {
                    this.f10061r = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f10061r, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f10061r != null) {
                context.getApplicationContext().unregisterReceiver(this.f10061r);
            }
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    /* renamed from: a */
    private String m10568a(C3353m5 c3353m5) {
        C3406r c3406r = this.f10063t.get(c3353m5.m9986c());
        StringBuilder sbOooOo0O = OooOo.OooOo0O(c3406r != null ? Integer.toString(c3406r.m10801g()) : TextUtils.isEmpty(c3353m5.m9994k()) ? "1" : CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
        sbOooOo0O.append(c3353m5.m9986c());
        return sbOooOo0O.toString();
    }

    /* renamed from: g */
    private void m10602g(C3406r c3406r) throws Throwable {
        String strM9994k = this.f10049f.get(c3406r.mo9129c()).m9994k();
        JSONObject jSONObjectM9984a = this.f10049f.get(c3406r.mo9129c()).m9984a();
        c3406r.m10798c(strM9994k);
        c3406r.m10626a(strM9994k, jSONObjectM9984a);
    }

    @Override // com.ironsource.InterfaceC3163gs
    /* renamed from: b */
    public void mo9014b() throws Throwable {
        m10600d("onLoadTriggered: RV load was triggered in " + this.f10040A + " state");
        m10569a(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x005a A[SYNTHETIC] */
    @Override // com.ironsource.InterfaceC3156gl
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo8989c(com.ironsource.mediationsdk.C3406r r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3405q.mo8989c(com.ironsource.mediationsdk.r):void");
    }

    /* renamed from: b */
    private void m10589b(EnumC2638ac enumC2638ac) {
        m10572a(enumC2638ac, (Map<String, Object>) null, false, false);
    }

    /* renamed from: c */
    private void m10596c(C3406r c3406r, Placement placement) {
        m10600d("showVideo()");
        this.f10064u.mo9126a(c3406r);
        if (this.f10064u.mo9125b(c3406r)) {
            c3406r.m10622B();
            IronSourceUtils.sendAutomationLog(c3406r.mo9129c() + " rewarded video is now session capped");
        }
        InterfaceC3255jg.a aVar = this.f10046G;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        String placementName = placement.getPlacementName();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        aVar.mo9484a(applicationContext, placementName, ad_unit);
        if (this.f10047H.mo9483b(ContextProvider.getInstance().getApplicationContext(), placement, ad_unit)) {
            m10570a(EnumC2638ac.RV_CAP_PLACEMENT);
        }
        this.f10044E.m11129a();
        c3406r.m10625a(placement);
    }

    /* renamed from: b */
    private void m10590b(EnumC2638ac enumC2638ac, Map<String, Object> map) {
        m10572a(enumC2638ac, map, true, true);
    }

    /* renamed from: c */
    private void m10597c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 3);
    }

    /* renamed from: c */
    private boolean m10598c(EnumC2638ac enumC2638ac) {
        return enumC2638ac == EnumC2638ac.RV_BUSINESS_MEDIATION_LOAD_SUCCESS || enumC2638ac == EnumC2638ac.RV_AUCTION_SUCCESS || enumC2638ac == EnumC2638ac.RV_AUCTION_FAILED || enumC2638ac == EnumC2638ac.RV_AD_UNIT_CAPPED;
    }

    /* renamed from: c */
    private boolean m10599c(boolean z) {
        Boolean bool = this.f10042C;
        if (bool == null) {
            return false;
        }
        if (z && !bool.booleanValue() && mo9784d()) {
            return true;
        }
        return !z && this.f10042C.booleanValue();
    }

    @Override // com.ironsource.InterfaceC3156gl
    /* renamed from: b */
    public void mo8987b(C3406r c3406r) {
        String strOooO0OO;
        m10581a(c3406r, "onRewardedVideoAdClosed, mediation state: " + this.f10040A.name());
        C3127fr.m8748a().m8784b(this.f10048e.m9154a(c3406r.m10632u()));
        this.f10069z = false;
        boolean z = this.f10040A == e.RV_STATE_READY_TO_SHOW;
        StringBuilder sb = new StringBuilder();
        if (z) {
            Iterator<C3406r> it = this.f10048e.m9160c().iterator();
            while (it.hasNext()) {
                C3406r next = it.next();
                if (next.m10635y()) {
                    sb.append(next.mo9129c() + ";");
                }
            }
        }
        EnumC2638ac enumC2638ac = EnumC2638ac.RV_INSTANCE_CLOSED;
        StringBuilder sb2 = new StringBuilder("otherRVAvailable = ");
        if (sb.length() > 0) {
            strOooO0OO = o0OO00O.OooO0OO(sb, "true|");
        } else {
            strOooO0OO = "false";
        }
        sb2.append(strOooO0OO);
        c3406r.m10627b(enumC2638ac, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}});
        if (c3406r.equals(this.f10048e.m9163f())) {
            this.f10048e.m9155a((C3406r) null);
            if (this.f10040A != e.RV_STATE_READY_TO_SHOW) {
                m10594b(false);
            }
        }
    }

    @Override // com.ironsource.InterfaceC3471o
    /* renamed from: a */
    public void mo10607a() throws Throwable {
        m10574a(e.RV_STATE_NOT_LOADED);
        m10587a(false, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{"reason", "loaded ads are expired"}}));
        m10569a(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m10600d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 0);
    }

    @Override // com.ironsource.InterfaceC3581r4
    /* renamed from: a */
    public void mo10175a(int i, String str, int i2, String str2, long j) throws Throwable {
        String str3 = "Auction failed (error " + i + " - " + str + ")";
        m10600d(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f10060q = i2;
        this.f10059p = str2;
        this.f10054k = null;
        if (this.f10057n) {
            m10600d("Moving to fallback waterfall");
            m10606k();
        }
        if (TextUtils.isEmpty(str)) {
            m10571a(EnumC2638ac.RV_AUCTION_FAILED, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
        } else {
            m10571a(EnumC2638ac.RV_AUCTION_FAILED, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
        }
        m10604i();
    }

    /* renamed from: a */
    private void m10569a(long j) throws Throwable {
        if (this.f10064u.mo9124a()) {
            m10600d("all smashes are capped");
            m10571a(EnumC2638ac.TROUBLESHOOTING_RV_LOAD_FAILED, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80001}, new Object[]{"reason", "all smashes are capped"}}));
            m10603h();
            return;
        }
        m10387a(IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.f10056m) {
            if (!this.f10050g.isEmpty()) {
                this.f10052i.m10288a(this.f10050g);
                this.f10050g.clear();
            }
            new Timer().schedule(new b(), j);
            return;
        }
        m10600d("auction fallback flow starting");
        m10606k();
        if (!this.f10048e.m9160c().isEmpty()) {
            m10589b(EnumC2638ac.RV_BUSINESS_MEDIATION_LOAD);
            m10604i();
        } else {
            m10600d("loadSmashes -  waterfall is empty");
            m10571a(EnumC2638ac.TROUBLESHOOTING_RV_LOAD_FAILED, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            m10603h();
        }
    }

    @Override // com.ironsource.InterfaceC3325lg
    /* renamed from: d */
    public boolean mo9784d() {
        if ((!this.f10062s || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.f10040A == e.RV_STATE_READY_TO_SHOW && !this.f10069z) {
            Iterator<C3406r> it = this.f10048e.m9160c().iterator();
            while (it.hasNext()) {
                if (it.next().m10621A()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC3325lg
    /* renamed from: a */
    public void mo9783a(Activity activity, Placement placement) {
        synchronized (this.f10043D) {
            try {
                if (placement == null) {
                    m10582a("showRewardedVideo error: empty default placement");
                    IronSourceError ironSourceError = new IronSourceError(1021, "showRewardedVideo error: empty default placement");
                    C3127fr c3127frM8748a = C3127fr.m8748a();
                    C3191hl c3191hl = this.f10048e;
                    c3127frM8748a.m8779a(ironSourceError, c3191hl.m9154a(c3191hl.m9161d()));
                    m10572a(EnumC2638ac.RV_CALLBACK_SHOW_FAILED, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{"reason", "showRewardedVideo error: empty default placement"}}), false, true);
                } else {
                    this.f10066w = placement.getPlacementName();
                    m10592b("showRewardedVideo(" + placement + ")");
                    C3406r c3406r = null;
                    m10590b(EnumC2638ac.RV_API_SHOW_CALLED, activity != null ? C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW}}) : null);
                    if (this.f10069z) {
                        m10582a("showRewardedVideo error: can't show ad while an ad is already showing");
                        IronSourceError ironSourceError2 = new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, "showRewardedVideo error: can't show ad while an ad is already showing");
                        C3127fr c3127frM8748a2 = C3127fr.m8748a();
                        C3191hl c3191hl2 = this.f10048e;
                        c3127frM8748a2.m8779a(ironSourceError2, c3191hl2.m9154a(c3191hl2.m9161d()));
                        m10590b(EnumC2638ac.RV_CALLBACK_SHOW_FAILED, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW)}, new Object[]{"reason", "showRewardedVideo error: can't show ad while an ad is already showing"}}));
                    } else if (this.f10040A != e.RV_STATE_READY_TO_SHOW) {
                        m10582a("showRewardedVideo error: show called while no ads are available");
                        IronSourceError ironSourceError3 = new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, "showRewardedVideo error: show called while no ads are available");
                        C3127fr c3127frM8748a3 = C3127fr.m8748a();
                        C3191hl c3191hl3 = this.f10048e;
                        c3127frM8748a3.m8779a(ironSourceError3, c3191hl3.m9154a(c3191hl3.m9161d()));
                        m10590b(EnumC2638ac.RV_CALLBACK_SHOW_FAILED, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)}, new Object[]{"reason", "showRewardedVideo error: show called while no ads are available"}}));
                    } else if (this.f10047H.mo9483b(ContextProvider.getInstance().getApplicationContext(), placement, IronSource.AD_UNIT.REWARDED_VIDEO)) {
                        String str = "showRewardedVideo error: placement " + this.f10066w + " is capped";
                        m10582a(str);
                        IronSourceError ironSourceError4 = new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
                        C3127fr c3127frM8748a4 = C3127fr.m8748a();
                        C3191hl c3191hl4 = this.f10048e;
                        c3127frM8748a4.m8779a(ironSourceError4, c3191hl4.m9154a(c3191hl4.m9161d()));
                        m10590b(EnumC2638ac.RV_CALLBACK_SHOW_FAILED, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_PLACEMENT_CAPPED)}, new Object[]{"reason", str}}));
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        Iterator<C3406r> it = this.f10048e.m9160c().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C3406r next = it.next();
                            if (next.m10621A()) {
                                this.f10069z = true;
                                next.m10628b(true);
                                m10574a(e.RV_STATE_NOT_LOADED);
                                c3406r = next;
                                break;
                            }
                            if (next.m10799e() != null) {
                                stringBuffer.append(next.mo9129c() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + next.m10799e() + ",");
                            }
                            next.m10628b(false);
                        }
                        if (c3406r != null) {
                            m10596c(c3406r, placement);
                            return;
                        }
                        m10600d("showRewardedVideo(): No ads to show");
                        C3127fr c3127frM8748a5 = C3127fr.m8748a();
                        IronSourceError ironSourceErrorBuildNoAdsToShowError = ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                        C3191hl c3191hl5 = this.f10048e;
                        c3127frM8748a5.m8779a(ironSourceErrorBuildNoAdsToShowError, c3191hl5.m9154a(c3191hl5.m9161d()));
                        HashMap map = new HashMap();
                        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
                        map.put("reason", "showRewardedVideo(): No ads to show");
                        if (stringBuffer.length() != 0) {
                            map.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
                        }
                        m10590b(EnumC2638ac.RV_CALLBACK_SHOW_FAILED, map);
                        this.f10055l.m8793b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private void m10570a(EnumC2638ac enumC2638ac) {
        m10572a(enumC2638ac, (Map<String, Object>) null, true, true);
    }

    /* renamed from: a */
    private void m10571a(EnumC2638ac enumC2638ac, Map<String, Object> map) {
        m10572a(enumC2638ac, map, false, true);
    }

    @Override // com.ironsource.InterfaceC3156gl
    /* renamed from: b */
    public void mo8988b(C3406r c3406r, Placement placement) {
        m10581a(c3406r, "onRewardedVideoAdClicked");
        C3127fr.m8748a().m8780a(placement, this.f10048e.m9154a(c3406r.m10632u()));
    }

    /* renamed from: a */
    private void m10572a(EnumC2638ac enumC2638ac, Map<String, Object> map, boolean z, boolean z2) {
        HashMap mapOooOOo = androidx.datastore.preferences.protobuf.OooO00o.OooOOo(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapOooOOo.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z2 && !TextUtils.isEmpty(this.f10048e.m9161d())) {
            mapOooOOo.put("auctionId", this.f10048e.m9161d());
        }
        JSONObject jSONObject = this.f10054k;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapOooOOo.put("genericParams", this.f10054k);
        }
        if (z && !TextUtils.isEmpty(this.f10066w)) {
            mapOooOOo.put("placement", this.f10066w);
        }
        if (m10598c(enumC2638ac)) {
            C3053ds.m8391i().m12611a(mapOooOOo, this.f10060q, this.f10059p);
        }
        mapOooOOo.put("sessionDepth", Integer.valueOf(this.f10065v));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    mapOooOOo.putAll(map);
                }
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e2), 3);
            }
        }
        C3053ds.m8391i().mo12605a(new C3899zb(enumC2638ac, new JSONObject(mapOooOOo)));
    }

    /* renamed from: b */
    private void m10592b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m10593b(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC3861y7> list2) {
        for (C3406r c3406r : this.f10063t.values()) {
            if (!this.f10064u.mo9125b(c3406r) && this.f10048e.m9159b(c3406r)) {
                if (c3406r.m10808p()) {
                    list2.add(new CallableC3861y7(c3406r.m10801g(), c3406r.mo9129c(), null, c3406r, null, null));
                } else {
                    list.add(c3406r.mo9129c());
                    sb.append(c3406r.m10801g() + c3406r.mo9129c() + ",");
                }
            }
        }
    }

    /* renamed from: b */
    private void m10594b(boolean z) {
        m10587a(z, (Map<String, Object>) null);
    }

    @Override // com.ironsource.InterfaceC3156gl
    /* renamed from: a */
    public void mo8984a(IronSourceError ironSourceError, C3406r c3406r) {
        C3353m5 c3353m5;
        if (this.f10056m && (c3353m5 = this.f10049f.get(c3406r.mo9129c())) != null) {
            C3191hl c3191hl = this.f10048e;
            c3191hl.m9156a(c3191hl.m9161d(), c3353m5.m9983a(this.f10066w), c3353m5.m9987d());
        }
        m10581a(c3406r, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f10069z = false;
        m10590b(EnumC2638ac.RV_CALLBACK_SHOW_FAILED, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}}));
        C3127fr.m8748a().m8779a(ironSourceError, this.f10048e.m9154a(c3406r.m10632u()));
        this.f10050g.put(c3406r.mo9129c(), C3390h.a.ISAuctionPerformanceFailedToShow);
        if (this.f10040A != e.RV_STATE_READY_TO_SHOW) {
            m10594b(false);
        }
        this.f10055l.m8793b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10573a(NetworkSettings networkSettings, C2983bs c2983bs, String str, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("Start initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName());
        AbstractAdapter abstractAdapterM10112a = C3367c.m10097b().m10112a(networkSettings, networkSettings.getRewardedVideoSettings(), false);
        if (abstractAdapterM10112a != null) {
            C3406r c3406r = new C3406r(str, str2, networkSettings, this, c2983bs.m7991h(), abstractAdapterM10112a, this.f10065v);
            this.f10063t.put(c3406r.mo9129c(), c3406r);
        }
        ironLog.verbose("Done initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName());
    }

    /* renamed from: a */
    private void m10574a(e eVar) {
        m10600d("current state=" + this.f10040A + ", new state=" + eVar);
        this.f10040A = eVar;
    }

    @Override // com.ironsource.InterfaceC3156gl
    /* renamed from: a */
    public void mo8985a(C3406r c3406r) {
        m10581a(c3406r, "onRewardedVideoAdStarted");
        C3127fr.m8748a().m8787c();
    }

    @Override // com.ironsource.InterfaceC3156gl
    /* renamed from: a */
    public void mo8986a(C3406r c3406r, Placement placement) {
        m10581a(c3406r, "onRewardedVideoAdRewarded");
        C3127fr.m8748a().m8785b(placement, this.f10048e.m9154a(c3406r.m10632u()));
    }

    /* renamed from: a */
    private void m10581a(C3406r c3406r, String str) {
        String str2 = c3406r.mo9129c() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    /* renamed from: a */
    private void m10582a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: a */
    private void m10583a(List<NetworkSettings> list, C2983bs c2983bs, String str, String str2) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(it.next(), c2983bs, str, str2));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(c2983bs.m7989f(), c2983bs.m7998o(), arrayList);
    }

    @Override // com.ironsource.InterfaceC3581r4
    /* renamed from: a */
    public void mo10178a(List<C3353m5> list, String str, C3353m5 c3353m5, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) throws Throwable {
        m10600d("makeAuction(): success");
        this.f10051h = c3353m5;
        this.f10060q = i;
        this.f10054k = jSONObject;
        this.f10059p = "";
        if (!TextUtils.isEmpty(str2)) {
            m10571a(EnumC2638ac.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str2}}));
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        m10391a(jSONObject2, ad_unit);
        if (this.f9907b.mo8947a(ad_unit)) {
            m10571a(EnumC2638ac.RV_AD_UNIT_CAPPED, C3806wk.m12899a(new Object[][]{new Object[]{"auctionId", str}}));
            m10603h();
        } else {
            m10584a(list, str, this.f10054k);
            m10571a(EnumC2638ac.RV_AUCTION_SUCCESS, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
            m10604i();
        }
    }

    /* renamed from: a */
    private void m10584a(List<C3353m5> list, String str, JSONObject jSONObject) {
        this.f10049f.clear();
        this.f10050g.clear();
        CopyOnWriteArrayList<C3406r> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (C3353m5 c3353m5 : list) {
            sb.append(m10568a(c3353m5) + ",");
            C3406r c3406r = this.f10063t.get(c3353m5.m9986c());
            if (c3406r != null) {
                AbstractAdapter abstractAdapterM10111a = C3367c.m10097b().m10111a(c3406r.f10257b.m4773h());
                if (abstractAdapterM10111a != null) {
                    C3406r c3406r2 = new C3406r(c3406r, this, abstractAdapterM10111a, this.f10065v, str, jSONObject, this.f10060q, this.f10059p);
                    c3406r2.m10796a(true);
                    copyOnWriteArrayList.add(c3406r2);
                    this.f10049f.put(c3406r2.mo9129c(), c3353m5);
                    this.f10050g.put(c3353m5.m9986c(), C3390h.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                m10600d("updateWaterfall() - could not find matching smash for auction response item " + c3353m5.m9986c());
            }
        }
        this.f10048e.m9157a(copyOnWriteArrayList, str);
        if (this.f10048e.m9158a()) {
            m10571a(EnumC2638ac.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, C3806wk.m12899a(new Object[][]{new Object[]{"reason", "waterfalls hold too many with size=" + this.f10048e.m9162e()}}));
        }
        m10600d("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m10600d("Updated waterfall is empty");
        }
        m10571a(EnumC2638ac.RV_AUCTION_RESPONSE_WATERFALL, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10585a(Map<String, Object> map, List<String> list, String str) {
        if (map.keySet().size() == 0 && list.size() == 0) {
            m10595c(EnumC2638ac.RV_AUCTION_FAILED, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}));
            m10600d("makeAuction() failed - No candidates available for auctioning");
            m10603h();
        } else {
            m10600d(OooOo.OooOO0("makeAuction() - request waterfall is: ", str));
            m10589b(EnumC2638ac.RV_BUSINESS_MEDIATION_LOAD);
            m10589b(EnumC2638ac.RV_AUCTION_REQUEST);
            m10595c(EnumC2638ac.RV_AUCTION_REQUEST_WATERFALL, C3806wk.m12899a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str.toString()}}));
            this.f10053j.m10265a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f10052i, this.f10065v, this.f9908c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10586a(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC3861y7> list2) {
        if (list2.isEmpty()) {
            m10585a(map, list, sb.toString());
            return;
        }
        C2963b8 c2963b8 = new C2963b8();
        d dVar = new d(map, sb, list);
        m10589b(EnumC2638ac.RV_COLLECT_TOKENS);
        c2963b8.m7885a(list2, dVar, this.f10045F, TimeUnit.MILLISECONDS);
    }

    @Override // com.ironsource.InterfaceC3125fp
    /* renamed from: a */
    public void mo8733a(boolean z) {
        if (this.f10062s) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z, 0);
            if (m10599c(z)) {
                m10594b(z);
            }
        }
    }

    /* renamed from: a */
    private void m10587a(boolean z, Map<String, Object> map) {
        synchronized (this.f10043D) {
            try {
                Boolean bool = this.f10042C;
                if (bool == null || bool.booleanValue() != z) {
                    this.f10042C = Boolean.valueOf(z);
                    long time = new Date().getTime() - this.f10041B;
                    this.f10041B = new Date().getTime();
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(time));
                    m10571a(z ? EnumC2638ac.RV_CALLBACK_AVAILABILITY_TRUE : EnumC2638ac.RV_CALLBACK_AVAILABILITY_FALSE, map);
                    C3127fr c3127frM8748a = C3127fr.m8748a();
                    C3191hl c3191hl = this.f10048e;
                    c3127frM8748a.m8782a(z, c3191hl.m9154a(c3191hl.m9161d()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
