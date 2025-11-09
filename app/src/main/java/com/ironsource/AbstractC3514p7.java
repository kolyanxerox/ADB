package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.AbstractC3619s7;
import com.ironsource.C2963b8;
import com.ironsource.C2992c2;
import com.ironsource.C3350m2;
import com.ironsource.InterfaceC3223ii;
import com.ironsource.InterfaceC3255jg;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C3367c;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.C3387e;
import com.ironsource.mediationsdk.C3388f;
import com.ironsource.mediationsdk.C3390h;
import com.ironsource.mediationsdk.C3391i;
import com.ironsource.mediationsdk.C3402n;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.p7 */
/* loaded from: classes2.dex */
public abstract class AbstractC3514p7<Smash extends AbstractC3619s7<?>, Listener extends AdapterAdListener> implements InterfaceC3509p2, InterfaceC3581r4, InterfaceC2957b2, InterfaceC3193hn, InterfaceC3125fp, InterfaceC3471o, InterfaceC3346lx, InterfaceC3895z7, InterfaceC3778vq {

    /* renamed from: A */
    private AdInfo f10758A;

    /* renamed from: B */
    private C3840xk f10759B;

    /* renamed from: C */
    final InterfaceC3223ii f10760C;

    /* renamed from: D */
    final InterfaceC3223ii.a f10761D;

    /* renamed from: E */
    protected final InterfaceC3255jg f10762E;

    /* renamed from: F */
    private final InterfaceC3255jg.a f10763F;

    /* renamed from: G */
    private boolean f10764G;

    /* renamed from: H */
    private C3270jv f10765H;

    /* renamed from: I */
    private AtomicBoolean f10766I;

    /* renamed from: J */
    private HandlerThreadC3155gk f10767J;

    /* renamed from: a */
    protected C3307kx<Smash> f10768a;

    /* renamed from: b */
    protected ConcurrentHashMap<String, C3390h.a> f10769b;

    /* renamed from: c */
    protected C3387e f10770c;

    /* renamed from: d */
    protected C3390h f10771d;

    /* renamed from: e */
    protected int f10772e;

    /* renamed from: f */
    protected String f10773f;

    /* renamed from: g */
    protected JSONObject f10774g;

    /* renamed from: h */
    protected C3353m5 f10775h;

    /* renamed from: i */
    protected Placement f10776i;

    /* renamed from: j */
    protected boolean f10777j;

    /* renamed from: k */
    private NetworkStateReceiver f10778k;

    /* renamed from: l */
    protected C3781vt f10779l;

    /* renamed from: m */
    protected C3216ib f10780m;

    /* renamed from: n */
    protected C3216ib f10781n;

    /* renamed from: o */
    protected C3682t0 f10782o;

    /* renamed from: p */
    protected f f10783p;

    /* renamed from: q */
    protected C3474o2 f10784q;

    /* renamed from: r */
    protected C3484oc f10785r;

    /* renamed from: s */
    protected C2992c2 f10786s;

    /* renamed from: t */
    protected AbstractC3241j2 f10787t;

    /* renamed from: u */
    protected C3576r f10788u;

    /* renamed from: v */
    protected IronSourceSegment f10789v;

    /* renamed from: w */
    protected UUID f10790w;

    /* renamed from: x */
    protected final Object f10791x;

    /* renamed from: y */
    private long f10792y;

    /* renamed from: z */
    private Boolean f10793z;

    /* renamed from: com.ironsource.p7$a */
    public class a extends AbstractRunnableC3302ks {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() throws JSONException {
            AbstractC3514p7.this.m11303B();
        }
    }

    /* renamed from: com.ironsource.p7$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NetworkSettings f10795a;

        public b(NetworkSettings networkSettings) {
            this.f10795a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            AbstractC3514p7.this.m11327c(this.f10795a);
        }
    }

    /* renamed from: com.ironsource.p7$c */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC3514p7.this.m11305D();
        }
    }

    /* renamed from: com.ironsource.p7$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            AbstractC3514p7.this.f10774g = new JSONObject();
            AbstractC3514p7.this.f10786s.f7686h.m11494a((Double) null);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            AbstractC3514p7.this.m11324b(map, arrayList, sb, arrayList2);
            AbstractC3514p7.this.m11319a(map, arrayList, sb, arrayList2);
        }
    }

    /* renamed from: com.ironsource.p7$e */
    public class e implements C2963b8.b {

        /* renamed from: a */
        final /* synthetic */ Map f10799a;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f10800b;

        /* renamed from: c */
        final /* synthetic */ List f10801c;

        public e(Map map, StringBuilder sb, List list) {
            this.f10799a = map;
            this.f10800b = sb;
            this.f10801c = list;
        }

        @Override // com.ironsource.C2963b8.b
        /* renamed from: a */
        public void mo7886a(List<C2998c8> list, long j, List<String> list2) throws JSONException {
            AbstractC3514p7.this.f10786s.f7685g.m9018a(j);
            for (C2998c8 c2998c8 : list) {
                NetworkSettings networkSettingsM12330a = AbstractC3514p7.this.f10782o.m12330a(c2998c8.m8103c());
                Map<String, Object> mapM11321b = AbstractC3514p7.this.m11321b(networkSettingsM12330a, C3367c.m10097b().m10116b(networkSettingsM12330a, AbstractC3514p7.this.f10782o.m12333b(), AbstractC3514p7.this.m11355k()));
                if (c2998c8.m8101a() != null) {
                    this.f10799a.put(c2998c8.m8103c(), c2998c8.m8101a());
                    StringBuilder sb = this.f10800b;
                    sb.append(c2998c8.m8104d());
                    sb.append(c2998c8.m8103c());
                    sb.append(",");
                    AbstractC3514p7.this.f10786s.f7685g.m9021a(mapM11321b, c2998c8.m8105e());
                } else {
                    AbstractC3514p7.this.f10786s.f7685g.m9022a(mapM11321b, c2998c8.m8105e(), c2998c8.m8102b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings networkSettingsM12330a2 = AbstractC3514p7.this.f10782o.m12330a(it.next());
                AbstractC3514p7.this.f10786s.f7685g.m9023b(AbstractC3514p7.this.m11321b(networkSettingsM12330a2, C3367c.m10097b().m10116b(networkSettingsM12330a2, AbstractC3514p7.this.f10782o.m12333b(), AbstractC3514p7.this.m11355k())), j);
            }
            AbstractC3514p7.this.m11318a((Map<String, Object>) this.f10799a, (List<String>) this.f10801c, this.f10800b.toString());
        }

        @Override // com.ironsource.C2963b8.b
        public void onFailure(String str) {
            AbstractC3514p7.this.f10786s.f7685g.m9019a(str);
            AbstractC3514p7.this.m11318a((Map<String, Object>) this.f10799a, (List<String>) this.f10801c, this.f10800b.toString());
        }
    }

    /* renamed from: com.ironsource.p7$f */
    public enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public AbstractC3514p7(InterfaceC3116fg interfaceC3116fg, InterfaceC3076eg interfaceC3076eg, C3682t0 c3682t0, C3840xk c3840xk, IronSourceSegment ironSourceSegment) throws InterruptedException {
        this.f10773f = "";
        this.f10777j = false;
        this.f10791x = new Object();
        this.f10792y = 0L;
        this.f10766I = new AtomicBoolean(false);
        this.f10790w = UUID.randomUUID();
        this.f10760C = interfaceC3116fg.mo8689k();
        this.f10761D = interfaceC3076eg.mo8482e();
        this.f10762E = interfaceC3116fg.mo8682C();
        this.f10763F = interfaceC3076eg.mo8485m();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + c3682t0.m12333b() + ", loading mode = " + c3682t0.m12340h().m9974a());
        StringBuilder sb = new StringBuilder();
        sb.append(c3682t0.m12333b());
        sb.append(" initiated object per waterfall mode");
        IronSourceUtils.sendAutomationLog(sb.toString());
        C3216ib c3216ib = new C3216ib();
        this.f10767J = m11310a(c3682t0);
        this.f10789v = ironSourceSegment;
        this.f10782o = c3682t0;
        this.f10786s = new C2992c2(c3682t0.m12333b(), C2992c2.b.MEDIATION, this);
        this.f10787t = mo8198g();
        this.f10784q = mo8909h();
        m11345a(f.NONE);
        this.f10759B = c3840xk;
        this.f10768a = new C3307kx<>(this.f10782o.m12336d().m11093f(), this.f10782o.m12336d().m11096i(), this);
        this.f10786s.f7683e.m12277a(mo8200o(), this.f10782o.m12340h().m9974a().toString());
        this.f10769b = new ConcurrentHashMap<>();
        this.f10776i = null;
        mo8188G();
        this.f10774g = new JSONObject();
        if (this.f10782o.m12347q()) {
            this.f10770c = new C3387e(new C3388f(this.f10782o.m12336d(), IronSourceUtils.getSessionId()));
        }
        this.f10771d = new C3390h(this.f10782o.mo8379j(), this.f10782o.m12336d().m11090c());
        m11335s();
        m11334r();
        this.f10780m = new C3216ib();
        m11345a(f.READY_TO_LOAD);
        this.f10785r = new C3484oc(c3682t0.m12329a(), this);
        this.f10788u = new C3576r();
        this.f10786s.f7683e.m12276a(C3216ib.m9304a(c3216ib));
        if (this.f10782o.m12340h().m9978e()) {
            ironLog.verbose("first automatic load");
            m11336A();
        }
    }

    /* renamed from: B */
    public void m11303B() throws JSONException {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11353i());
        synchronized (this.f10791x) {
            try {
                if (this.f10782o.m12340h().m9978e() && this.f10779l.mo9124a()) {
                    ironLog.verbose(m11349b("all smashes are capped"));
                    mo8896a(C3855y1.m13114a(this.f10782o.m12333b()), "all smashes are capped", false);
                } else if (!mo11359t() && this.f10783p == f.SHOWING) {
                    IronLog.API.error(m11349b("load cannot be invoked while showing an ad"));
                    mo8193a(new IronSourceError(C3855y1.m13117d(this.f10782o.m12333b()), "load cannot be invoked while showing an ad"));
                } else {
                    if (this.f10782o.m12340h().m9974a() == C3350m2.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f10782o.m12340h().m9974a() == C3350m2.a.MANUAL_WITH_LOAD_ON_SHOW || (((fVar = this.f10783p) == f.READY_TO_LOAD || fVar == f.READY_TO_SHOW) && !C3402n.m10397a().m10403b(this.f10782o.m12333b()))) {
                        this.f10774g = new JSONObject();
                        m11307F();
                        if (mo8201v()) {
                            this.f10786s.f7684f.m7940a();
                        } else {
                            this.f10786s.f7684f.m7949a(mo11358q());
                        }
                        this.f10781n = new C3216ib();
                        if (this.f10782o.m12347q()) {
                            if (!this.f10769b.isEmpty()) {
                                this.f10771d.m10288a(this.f10769b);
                                this.f10769b.clear();
                            }
                            m11308K();
                        } else {
                            m11345a(f.LOADING);
                        }
                        if (this.f10782o.m12347q()) {
                            return;
                        }
                        ironLog.verbose(m11349b("auction disabled"));
                        m11309L();
                        m11304C();
                        return;
                    }
                    IronLog.API.error(m11349b("load is already in progress"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: C */
    private void m11304C() {
        C3575qx<Smash> c3575qxM11306E = m11306E();
        if (c3575qxM11306E.m11694c()) {
            mo8896a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
        }
        Iterator<Smash> it = c3575qxM11306E.m11692a().iterator();
        while (it.hasNext()) {
            it.next().m11858E();
        }
    }

    /* renamed from: D */
    public void m11305D() {
        IronLog.INTERNAL.verbose(m11353i());
        AsyncTask.execute(new d());
    }

    /* renamed from: E */
    private C3575qx<Smash> m11306E() {
        IronLog.INTERNAL.verbose();
        return new C3540px(this.f10782o).m11466d(this.f10768a.m9722b());
    }

    /* renamed from: F */
    private void m11307F() {
        this.f10788u.mo8948a(this.f10782o.m12333b(), false);
    }

    /* renamed from: K */
    private void m11308K() {
        IronLog.INTERNAL.verbose(m11353i());
        synchronized (this.f10791x) {
            try {
                f fVar = this.f10783p;
                f fVar2 = f.AUCTION;
                if (fVar == fVar2) {
                    return;
                }
                m11345a(fVar2);
                this.f10766I.set(false);
                long jM11098k = this.f10782o.m12336d().m11098k() - C3216ib.m9304a(this.f10780m);
                if (jM11098k > 0) {
                    new Timer().schedule(new c(), jM11098k);
                } else {
                    m11305D();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: L */
    private void m11309L() throws JSONException {
        IronLog.INTERNAL.verbose(m11353i());
        m11312a(m11332j(), m11356m());
    }

    /* renamed from: a */
    private HandlerThreadC3155gk m11310a(C3682t0 c3682t0) {
        if (c3682t0.m12343l()) {
            return IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    /* renamed from: c */
    public void m11327c(NetworkSettings networkSettings) throws JSONException {
        IronLog.INTERNAL.verbose(m11349b("Start initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName()));
        AdData adDataMo8895a = mo8895a(networkSettings, this.f10782o.mo8380o());
        AdapterBaseInterface adapterBaseInterfaceM10116b = C3367c.m10097b().m10116b(networkSettings, this.f10782o.m12333b(), m11355k());
        if (adapterBaseInterfaceM10116b != null) {
            try {
                adapterBaseInterfaceM10116b.init(adDataMo8895a, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                this.f10786s.f7688j.m9918g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e2);
            }
        }
        IronLog.INTERNAL.verbose(m11349b("Done initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName()));
    }

    /* renamed from: d */
    private boolean m11331d(NetworkSettings networkSettings) throws JSONException {
        AdapterBaseInterface adapterBaseInterfaceM10116b = C3367c.m10097b().m10116b(networkSettings, this.f10782o.m12333b(), m11355k());
        if (adapterBaseInterfaceM10116b instanceof AdapterSettingsInterface) {
            return this.f10768a.m9720a(this.f10782o.m12340h().m9974a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), mo8894a(networkSettings, adapterBaseInterfaceM10116b), adapterBaseInterfaceM10116b, this.f10782o.m12333b());
        }
        return false;
    }

    /* renamed from: j */
    private List<C3353m5> m11332j() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.f10782o.mo8379j()) {
            if (!networkSettings.isBidder(this.f10782o.m12333b()) && m11331d(networkSettings)) {
                C3746ut c3746ut = new C3746ut(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f10782o.m12333b()));
                if (!this.f10779l.mo9125b(c3746ut)) {
                    copyOnWriteArrayList.add(new C3353m5(c3746ut.mo9129c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: p */
    private int m11333p() {
        return 1;
    }

    /* renamed from: r */
    private void m11334r() throws InterruptedException {
        IronLog.INTERNAL.verbose(m11353i());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f10782o.mo8379j()) {
            if (m11328c(networkSettings, C3367c.m10097b().m10116b(networkSettings, this.f10782o.m12333b(), m11355k()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.f10782o.m12342k(), this.f10782o.m12346p(), arrayList);
    }

    /* renamed from: s */
    private void m11335s() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f10782o.mo8379j()) {
            arrayList.add(new C3746ut(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f10782o.m12333b())));
        }
        C3781vt c3781vt = new C3781vt();
        this.f10779l = c3781vt;
        c3781vt.mo9127a(arrayList);
    }

    /* renamed from: A */
    public void m11336A() {
        if (mo11352c()) {
            mo11346a(new a());
        } else {
            m11303B();
        }
    }

    /* renamed from: G */
    public void mo8188G() {
        C3402n.m10397a().m10401a(this.f10782o.m12333b(), this.f10782o.m12338f());
    }

    /* renamed from: H */
    public boolean mo8189H() {
        return true;
    }

    /* renamed from: I */
    public boolean m11337I() {
        return true;
    }

    /* renamed from: J */
    public void m11338J() throws JSONException {
        Iterator<NetworkSettings> it = this.f10782o.mo8379j().iterator();
        while (it.hasNext()) {
            C3367c.m10097b().m10116b(it.next(), this.f10782o.m12333b(), m11355k());
        }
    }

    /* renamed from: a */
    public abstract Smash mo8191a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i, String str, C3353m5 c3353m5);

    /* renamed from: b */
    public String m11349b(String str) {
        String str2 = this.f10782o.m12333b().name() + " state:" + this.f10783p;
        return TextUtils.isEmpty(str) ? str2 : OooO0oO.OooOo.OooOoo(str2, " - ", str);
    }

    /* renamed from: b */
    public abstract JSONObject mo8197b(NetworkSettings networkSettings);

    /* JADX WARN: Removed duplicated region for block: B:56:0x009c A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:51:0x0090, B:53:0x0096, B:59:0x00a9, B:56:0x009c, B:58:0x00a2), top: B:77:0x0090 }] */
    @Override // com.ironsource.InterfaceC3509p2
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo11247e(com.ironsource.AbstractC3619s7<?> r5) throws java.lang.NumberFormatException {
        /*
            r4 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = r5.m11872k()
            java.lang.String r1 = r4.m11349b(r1)
            r0.verbose(r1)
            java.lang.String r1 = r5.m11869h()
            com.ironsource.kx<Smash extends com.ironsource.s7<?>> r2 = r4.f10768a
            java.lang.String r2 = r2.m9724c()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invoked from "
            r1.<init>(r2)
            java.lang.String r2 = r5.mo9129c()
            r1.append(r2)
            java.lang.String r2 = " with state = "
            r1.append(r2)
            com.ironsource.p7$f r2 = r4.f10783p
            r1.append(r2)
            java.lang.String r2 = " auctionId: "
            r1.append(r2)
            java.lang.String r5 = r5.m11869h()
            r1.append(r5)
            java.lang.String r5 = " and the current id is "
            r1.append(r5)
            com.ironsource.kx<Smash extends com.ironsource.s7<?>> r5 = r4.f10768a
            java.lang.String r5 = r5.m9724c()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r4.m11349b(r5)
            r0.error(r5)
            com.ironsource.c2 r5 = r4.f10786s
            com.ironsource.lw r5 = r5.f7688j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onAdLoadSuccess invoked with state = "
            r0.<init>(r1)
            com.ironsource.p7$f r1 = r4.f10783p
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.m9927p(r0)
            return
        L72:
            com.ironsource.t0 r0 = r4.f10782o
            boolean r0 = r0.m12344m()
            if (r0 == 0) goto Lad
            com.ironsource.kx<Smash extends com.ironsource.s7<?>> r0 = r4.f10768a
            java.util.List r0 = r0.m9722b()
            com.ironsource.px r1 = new com.ironsource.px
            com.ironsource.t0 r2 = r4.f10782o
            r1.<init>(r2)
            boolean r2 = r1.m11462a(r5, r0)
            java.lang.Object r3 = r4.f10791x
            monitor-enter(r3)
            if (r2 == 0) goto L9c
            boolean r2 = r4.m11360w()     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L9c
            r4.m11354i(r5)     // Catch: java.lang.Throwable -> L9a
            goto La9
        L9a:
            r5 = move-exception
            goto Lab
        L9c:
            boolean r2 = r1.m11463a(r0)     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto La9
            com.ironsource.s7 r0 = r1.m11465c(r0)     // Catch: java.lang.Throwable -> L9a
            r4.m11354i(r0)     // Catch: java.lang.Throwable -> L9a
        La9:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9a
            goto Lad
        Lab:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9a
            throw r5
        Lad:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r0 = r4.f10769b
            java.lang.String r1 = r5.mo9129c()
            com.ironsource.mediationsdk.h$a r2 = com.ironsource.mediationsdk.C3390h.a.ISAuctionPerformanceLoadedSuccessfully
            r0.put(r1, r2)
            com.ironsource.p7$f r0 = com.ironsource.AbstractC3514p7.f.LOADING
            com.ironsource.p7$f r1 = com.ironsource.AbstractC3514p7.f.READY_TO_SHOW
            boolean r0 = r4.m11348a(r0, r1)
            if (r0 == 0) goto L102
            com.ironsource.ib r0 = r4.f10781n
            long r0 = com.ironsource.C3216ib.m9304a(r0)
            boolean r2 = r4.mo8201v()
            if (r2 == 0) goto Ld6
            com.ironsource.c2 r2 = r4.f10786s
            com.ironsource.bn r2 = r2.f7684f
            r2.m7942a(r0)
            goto Le1
        Ld6:
            com.ironsource.c2 r2 = r4.f10786s
            com.ironsource.bn r2 = r2.f7684f
            boolean r3 = r4.mo11358q()
            r2.m7947a(r0, r3)
        Le1:
            com.ironsource.t0 r0 = r4.f10782o
            com.ironsource.m2 r0 = r0.m12340h()
            boolean r0 = r0.m9978e()
            if (r0 == 0) goto Lf4
            com.ironsource.oc r0 = r4.f10785r
            r1 = 0
            r0.m11130a(r1)
        Lf4:
            com.ironsource.t0 r0 = r4.f10782o
            boolean r0 = r0.m12344m()
            if (r0 != 0) goto Lff
            r4.m11354i(r5)
        Lff:
            r4.mo8910h(r5)
        L102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.AbstractC3514p7.mo11247e(com.ironsource.s7):void");
    }

    @Override // com.ironsource.InterfaceC3509p2
    /* renamed from: f */
    public void mo11248f(AbstractC3619s7<?> abstractC3619s7) {
        IronLog.INTERNAL.verbose(m11349b(abstractC3619s7.m11872k()));
        this.f10786s.f7687i.m9938a(m11357n());
        this.f10787t.mo7878a(this.f10776i, abstractC3619s7.m11867f());
    }

    /* renamed from: g */
    public abstract AbstractC3241j2 mo8198g();

    /* renamed from: g */
    public void mo8908g(AbstractC3619s7<?> abstractC3619s7) {
        this.f10787t.mo7955d(abstractC3619s7.m11867f());
    }

    /* renamed from: h */
    public C3474o2 mo8909h() {
        return new C3474o2(this.f10782o.m12340h(), this);
    }

    /* renamed from: i */
    public String m11353i() {
        return m11349b((String) null);
    }

    /* renamed from: k */
    public UUID m11355k() {
        return this.f10790w;
    }

    /* renamed from: l */
    public abstract String mo8199l();

    /* renamed from: m */
    public String m11356m() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* renamed from: n */
    public String m11357n() {
        Placement placement = this.f10776i;
        return placement == null ? "" : placement.getPlacementName();
    }

    /* renamed from: o */
    public abstract String mo8200o();

    /* renamed from: q */
    public boolean mo11358q() {
        return false;
    }

    /* renamed from: t */
    public boolean mo11359t() {
        return false;
    }

    /* renamed from: u */
    public boolean mo10960u() {
        return false;
    }

    /* renamed from: v */
    public abstract boolean mo8201v();

    /* renamed from: w */
    public boolean m11360w() {
        boolean z;
        synchronized (this.f10791x) {
            try {
                f fVar = this.f10783p;
                z = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
            } finally {
            }
        }
        return z;
    }

    /* renamed from: x */
    public boolean m11361x() {
        boolean z;
        synchronized (this.f10791x) {
            z = this.f10783p == f.READY_TO_SHOW;
        }
        return z;
    }

    /* renamed from: y */
    public boolean m11362y() {
        boolean z;
        synchronized (this.f10791x) {
            z = this.f10783p == f.AUCTION;
        }
        return z;
    }

    /* renamed from: z */
    public boolean m11363z() {
        boolean z;
        synchronized (this.f10791x) {
            z = this.f10783p == f.LOADING;
        }
        return z;
    }

    public AbstractC3514p7(C3682t0 c3682t0, C3840xk c3840xk, IronSourceSegment ironSourceSegment) {
        this(C3495on.m11199U(), C3495on.m11193O(), c3682t0, c3840xk, ironSourceSegment);
    }

    /* renamed from: a */
    public LoadWhileShowSupportState mo8894a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    @Override // com.ironsource.InterfaceC3778vq
    /* renamed from: c */
    public boolean mo11352c() {
        HandlerThreadC3155gk handlerThreadC3155gk = this.f10767J;
        if (handlerThreadC3155gk == null || handlerThreadC3155gk == Thread.currentThread()) {
            return false;
        }
        return this.f10782o.m12343l();
    }

    /* renamed from: h */
    public void mo8910h(AbstractC3619s7<?> abstractC3619s7) {
        if (this.f10782o.m12340h().m9979f()) {
            mo8195a(abstractC3619s7, abstractC3619s7.m11867f());
        } else {
            m11347a(true, false, abstractC3619s7);
        }
    }

    /* renamed from: i */
    public void m11354i(AbstractC3619s7<?> abstractC3619s7) throws NumberFormatException {
        if (this.f10782o.m12347q() && this.f10766I.compareAndSet(false, true)) {
            C3353m5 c3353m5M11870i = abstractC3619s7.m11870i();
            this.f10770c.m10267a(c3353m5M11870i, abstractC3619s7.m11873l(), this.f10775h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, C3353m5> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.f10768a.m9722b()) {
                arrayList.add(smash.mo9129c());
                concurrentHashMap.put(smash.mo9129c(), smash.m11870i());
            }
            this.f10770c.m10269a(arrayList, concurrentHashMap, abstractC3619s7.m11873l(), this.f10775h, c3353m5M11870i);
        }
    }

    /* renamed from: c */
    private boolean m11328c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.f10768a.m9721a(adapterBaseInterface, this.f10782o.m12333b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f10782o.m12333b());
    }

    /* renamed from: a */
    public BaseAdAdapter<?, Listener> m11339a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) C3367c.m10097b().m10113a(networkSettings, ad_unit, m11355k());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    /* renamed from: c */
    private boolean m11329c(EnumC3889z1 enumC3889z1) {
        return new ArrayList(Arrays.asList(EnumC3889z1.LOAD_AD_SUCCESS, EnumC3889z1.LOAD_AD_FAILED, EnumC3889z1.LOAD_AD_FAILED_WITH_REASON, EnumC3889z1.AUCTION_SUCCESS, EnumC3889z1.AUCTION_FAILED, EnumC3889z1.AUCTION_FAILED_NO_CANDIDATES, EnumC3889z1.AD_FORMAT_CAPPED, EnumC3889z1.AD_OPENED, EnumC3889z1.SHOW_AD, EnumC3889z1.SHOW_AD_FAILED, EnumC3889z1.AD_CLICKED, EnumC3889z1.RELOAD_AD_FAILED_WITH_REASON, EnumC3889z1.RELOAD_AD_SUCCESS, EnumC3889z1.AD_LEFT_APPLICATION)).contains(enumC3889z1);
    }

    /* renamed from: a */
    public AdData mo8895a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(mo8197b(networkSettings), this.f10782o.m12333b(), str);
    }

    /* renamed from: a */
    private Smash m11311a(C3353m5 c3353m5, String str) throws JSONException {
        NetworkSettings networkSettingsM12330a = this.f10782o.m12330a(c3353m5.m9986c());
        if (networkSettingsM12330a == null) {
            String str2 = "could not find matching provider settings for auction response item - item = " + c3353m5.m9986c() + " state = " + this.f10783p;
            IronLog.INTERNAL.error(m11349b(str2));
            this.f10786s.f7688j.m9920i(str2);
            return null;
        }
        C3367c.m10097b().m10116b(networkSettingsM12330a, this.f10782o.m12333b(), m11355k());
        BaseAdAdapter<?, Listener> baseAdAdapterM11339a = m11339a(networkSettingsM12330a, this.f10782o.m12333b());
        if (baseAdAdapterM11339a != null) {
            Smash smash = (Smash) mo8191a(networkSettingsM12330a, baseAdAdapterM11339a, this.f10760C.mo9344a(this.f10782o.m12333b()), str, c3353m5);
            this.f10769b.put(c3353m5.m9986c(), C3390h.a.ISAuctionPerformanceDidntAttemptToLoad);
            return smash;
        }
        IronLog.INTERNAL.error(m11349b("addSmashToWaterfall - could not load ad adapter for " + networkSettingsM12330a.getProviderInstanceName()));
        return null;
    }

    /* renamed from: c */
    private boolean m11330c(boolean z) {
        Boolean bool = this.f10793z;
        if (bool == null) {
            return false;
        }
        if (z && !bool.booleanValue() && mo10960u()) {
            return true;
        }
        return !z && this.f10793z.booleanValue();
    }

    /* renamed from: a */
    public String m11340a(C3353m5 c3353m5, int i) {
        return i + c3353m5.m9986c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private String m11312a(List<C3353m5> list, String str) throws JSONException {
        IronLog.INTERNAL.verbose(m11349b("waterfall.size() = " + list.size()));
        this.f10769b.clear();
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < list.size(); i++) {
            C3353m5 c3353m5 = list.get(i);
            AbstractC3619s7 abstractC3619s7M11311a = m11311a(c3353m5, str);
            if (abstractC3619s7M11311a != null) {
                copyOnWriteArrayList.add(abstractC3619s7M11311a);
                sb.append(m11340a(c3353m5, abstractC3619s7M11311a.m11873l()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f10768a.m9718a(this.f10782o.m12340h().m9974a(), copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(m11349b("updateWaterfall() - next waterfall is " + ((Object) sb)));
        return sb.toString();
    }

    /* renamed from: b */
    public Map<String, Object> m11321b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap map = new HashMap();
        try {
            map.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            map.put("spId", networkSettings.getSubProviderId());
            map.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.f10782o.m12333b())));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(m11333p()));
            return map;
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e2);
            return map;
        }
    }

    /* renamed from: a */
    public Map<String, Object> mo4765a(EnumC3889z1 enumC3889z1) {
        HashMap mapOooOOo = androidx.datastore.preferences.protobuf.OooO00o.OooOOo(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapOooOOo.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.f10774g;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapOooOOo.put("genericParams", this.f10774g);
        }
        mapOooOOo.put("sessionDepth", Integer.valueOf(this.f10760C.mo9344a(this.f10782o.m12333b())));
        if (m11329c(enumC3889z1)) {
            mapOooOOo.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f10772e));
            if (!TextUtils.isEmpty(this.f10773f)) {
                mapOooOOo.put(IronSourceConstants.AUCTION_FALLBACK, this.f10773f);
            }
        }
        if (m11326b(enumC3889z1) && !TextUtils.isEmpty(this.f10768a.m9724c())) {
            mapOooOOo.put("auctionId", this.f10768a.m9724c());
        }
        return mapOooOOo;
    }

    /* renamed from: b */
    public void mo8903b() {
        IronLog.INTERNAL.verbose(m11353i());
        m11336A();
    }

    /* renamed from: b */
    public void m11350b(C3353m5 c3353m5, String str) {
        if (c3353m5 == null) {
            IronLog.INTERNAL.error(m11349b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
            C2992c2 c2992c2 = this.f10786s;
            if (c2992c2 != null) {
                c2992c2.f7688j.m9918g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
                return;
            }
            return;
        }
        ImpressionData impressionDataM9983a = c3353m5.m9983a(str);
        if (impressionDataM9983a != null) {
            Iterator it = new HashSet(this.f10759B.m13070a()).iterator();
            while (it.hasNext()) {
                ImpressionDataListener impressionDataListener = (ImpressionDataListener) it.next();
                IronLog.CALLBACK.info(m11349b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + impressionDataM9983a));
                impressionDataListener.onImpressionSuccess(impressionDataM9983a);
            }
        }
    }

    @Override // com.ironsource.InterfaceC3509p2
    /* renamed from: b */
    public void mo8904b(AbstractC3619s7<?> abstractC3619s7) throws NumberFormatException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11349b(abstractC3619s7.m11872k()));
        this.f10786s.f7687i.m9950g(m11357n());
        this.f10768a.m9719a(abstractC3619s7);
        this.f10768a.m9723b(abstractC3619s7);
        this.f10779l.mo9126a(abstractC3619s7);
        if (this.f10779l.mo9125b(abstractC3619s7)) {
            ironLog.verbose(m11349b(abstractC3619s7.mo9129c() + " was session capped"));
            abstractC3619s7.m11860N();
            IronSourceUtils.sendAutomationLog(abstractC3619s7.mo9129c() + " was session capped");
        }
        this.f10763F.mo9484a(ContextProvider.getInstance().getApplicationContext(), m11357n(), this.f10782o.m12333b());
        if (this.f10762E.mo9483b(ContextProvider.getInstance().getApplicationContext(), this.f10776i, this.f10782o.m12333b())) {
            ironLog.verbose(m11349b("placement " + m11357n() + " is capped"));
            this.f10786s.f7687i.m9945b(m11357n(), null);
        }
        this.f10761D.mo9346b(this.f10782o.m12333b());
        if (this.f10782o.m12347q()) {
            C3353m5 c3353m5M11870i = abstractC3619s7.m11870i();
            this.f10770c.m10268a(c3353m5M11870i, abstractC3619s7.m11873l(), this.f10775h, m11357n());
            this.f10769b.put(abstractC3619s7.mo9129c(), C3390h.a.ISAuctionPerformanceShowedSuccessfully);
            if (mo8189H()) {
                m11350b(c3353m5M11870i, m11357n());
            }
        }
        mo8908g(abstractC3619s7);
        if (this.f10782o.m12340h().m9978e()) {
            m11351b(false);
        }
        this.f10784q.m11081h();
    }

    /* renamed from: b */
    public void m11324b(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC3861y7> list2) throws JSONException {
        StringBuilder sb2;
        String providerName;
        for (NetworkSettings networkSettings : this.f10782o.mo8379j()) {
            C3270jv c3270jv = this.f10765H;
            if (c3270jv == null || c3270jv.m9544a(networkSettings, this.f10782o.m12333b())) {
                if (!this.f10779l.mo9125b(new C3746ut(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f10782o.m12333b()))) && m11331d(networkSettings)) {
                    AdData adDataMo8895a = mo8895a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.f10782o.m12333b())) {
                        AdapterBaseInterface adapterBaseInterfaceM10116b = C3367c.m10097b().m10116b(networkSettings, this.f10782o.m12333b(), m11355k());
                        if (adapterBaseInterfaceM10116b instanceof InterfaceC2634a8) {
                            list2.add(new CallableC3861y7(networkSettings.getInstanceType(this.f10782o.m12333b()), networkSettings.getProviderInstanceName(), adDataMo8895a, (InterfaceC2634a8) adapterBaseInterfaceM10116b, this, networkSettings));
                        } else {
                            if (adapterBaseInterfaceM10116b == null) {
                                sb2 = new StringBuilder("prepareAuctionCandidates - could not load network adapter ");
                                providerName = networkSettings.getProviderName();
                            } else {
                                sb2 = new StringBuilder("network adapter ");
                                sb2.append(networkSettings.getProviderName());
                                providerName = " does not implementing BiddingDataInterface";
                            }
                            sb2.append(providerName);
                            this.f10786s.f7688j.m9918g(sb2.toString());
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(this.f10782o.m12333b()));
                        sb.append(networkSettings.getProviderInstanceName());
                        sb.append(",");
                    }
                }
            }
        }
    }

    @Override // com.ironsource.InterfaceC3471o
    /* renamed from: a */
    public void mo10607a() {
        if (this.f10782o.m12340h().m9978e()) {
            m11345a(f.READY_TO_LOAD);
            m11351b(true);
            m11336A();
        }
    }

    /* renamed from: b */
    private void m11325b(JSONObject jSONObject) {
        IronLog ironLog;
        String strM12348r;
        int i;
        try {
            if (jSONObject == null) {
                this.f10782o.m12334b(false);
                ironLog = IronLog.INTERNAL;
                strM12348r = "loading configuration from auction response is null, using the following: " + this.f10782o.m12348r();
            } else {
                try {
                    if (jSONObject.has(C3368d.f9626x) && (i = jSONObject.getInt(C3368d.f9626x)) > 0) {
                        this.f10782o.m12331a(i);
                    }
                    if (jSONObject.has(C3368d.f9627y)) {
                        this.f10782o.m12332a(jSONObject.getBoolean(C3368d.f9627y));
                    }
                    this.f10782o.m12334b(jSONObject.optBoolean(C3368d.f9628z, false));
                    ironLog = IronLog.INTERNAL;
                    strM12348r = this.f10782o.m12348r();
                } catch (JSONException e2) {
                    C3551q9.m11517d().m11519a(e2);
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error("failed to update loading configuration for" + this.f10782o.m12333b() + " Error: " + e2.getMessage());
                    ironLog2.verbose(m11349b(this.f10782o.m12348r()));
                    return;
                }
            }
            ironLog.verbose(m11349b(strM12348r));
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(m11349b(this.f10782o.m12348r()));
            throw th;
        }
    }

    @Override // com.ironsource.InterfaceC3346lx
    /* renamed from: a */
    public void mo9934a(int i) {
        this.f10786s.f7688j.m9933v("waterfalls hold too many with size = " + i);
    }

    @Override // com.ironsource.InterfaceC3581r4
    /* renamed from: a */
    public void mo10175a(int i, String str, int i2, String str2, long j) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11353i());
        if (!m11362y()) {
            String str3 = "unexpected auction fail - error = " + i + ", " + str + " state = " + this.f10783p;
            ironLog.error(m11349b(str3));
            this.f10786s.f7688j.m9921j(str3);
            return;
        }
        String str4 = "Auction failed (error " + i + " - " + str + ")";
        ironLog.verbose(m11349b(str4));
        IronSourceUtils.sendAutomationLog(mo8199l() + ": " + str4);
        this.f10772e = i2;
        this.f10773f = str2;
        this.f10774g = new JSONObject();
        if (this.f10782o.m12336d().m11101n()) {
            ironLog.verbose(m11349b("Moving to fallback waterfall"));
            m11309L();
        }
        this.f10786s.f7686h.m11492a(j, i, str);
        m11345a(f.LOADING);
        m11304C();
    }

    /* renamed from: b */
    public void m11351b(boolean z) {
        m11347a(false, z, (AbstractC3619s7<?>) null);
    }

    /* renamed from: b */
    private boolean m11326b(EnumC3889z1 enumC3889z1) {
        return !new ArrayList(Arrays.asList(EnumC3889z1.INIT_STARTED, EnumC3889z1.LOAD_AD, EnumC3889z1.AUCTION_REQUEST, EnumC3889z1.AUCTION_REQUEST_WATERFALL, EnumC3889z1.AUCTION_FAILED_NO_CANDIDATES, EnumC3889z1.COLLECT_TOKEN, EnumC3889z1.COLLECT_TOKENS_COMPLETED, EnumC3889z1.COLLECT_TOKENS_FAILED, EnumC3889z1.INSTANCE_COLLECT_TOKEN, EnumC3889z1.INSTANCE_COLLECT_TOKEN_SUCCESS, EnumC3889z1.INSTANCE_COLLECT_TOKEN_FAILED, EnumC3889z1.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(enumC3889z1);
    }

    /* renamed from: a */
    public void mo8896a(int i, String str, boolean z) {
        int i2;
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        m11345a(f.READY_TO_LOAD);
        ironLog.verbose(m11349b("errorCode = " + i + ", errorReason = " + str));
        if (this.f10782o.m12340h().m9979f()) {
            if (z) {
                i2 = i;
                str2 = str;
            } else {
                i2 = i;
                str2 = str;
                this.f10786s.f7684f.m7945a(C3216ib.m9304a(this.f10781n), i2, str2, mo11358q());
            }
            mo8193a(new IronSourceError(i2, str2));
        } else {
            if (!z) {
                this.f10786s.f7688j.m9908b(i, str);
            }
            m11351b(false);
        }
        this.f10784q.m11078e();
    }

    /* renamed from: a */
    public void mo8897a(Context context, C3391i c3391i, InterfaceC3581r4 interfaceC3581r4) {
        C3387e c3387e = this.f10770c;
        if (c3387e != null) {
            c3387e.m10264a(context, c3391i, interfaceC3581r4);
        } else {
            IronLog.INTERNAL.error(m11349b("mAuctionHandler is null"));
        }
    }

    /* renamed from: a */
    public void m11341a(Context context, boolean z) {
        IronLog.INTERNAL.verbose(m11349b("track = " + z));
        try {
            this.f10777j = z;
            if (z) {
                if (this.f10778k == null) {
                    this.f10778k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f10778k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f10778k != null) {
                context.getApplicationContext().unregisterReceiver(this.f10778k);
            }
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    /* renamed from: a */
    public void m11342a(AbstractC3241j2 abstractC3241j2) {
        this.f10787t = abstractC3241j2;
    }

    /* renamed from: a */
    public void m11343a(C3270jv c3270jv) {
        this.f10765H = c3270jv;
        this.f10764G = c3270jv != null;
        this.f10793z = null;
    }

    /* renamed from: a */
    public void m11344a(IronSourceSegment ironSourceSegment) {
        this.f10789v = ironSourceSegment;
    }

    /* renamed from: a */
    public void mo8193a(IronSourceError ironSourceError) {
        C3402n.m10397a().m10402b(this.f10782o.m12333b(), ironSourceError);
    }

    @Override // com.ironsource.InterfaceC3509p2
    /* renamed from: a */
    public void mo11246a(IronSourceError ironSourceError, AbstractC3619s7<?> abstractC3619s7) {
        C3575qx<Smash> c3575qxM11306E;
        AbstractC3619s7<?> abstractC3619s7M11465c;
        synchronized (this.f10791x) {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(m11349b(abstractC3619s7.m11872k() + " - error = " + ironSourceError));
                if (abstractC3619s7.m11869h().equals(this.f10768a.m9724c()) && this.f10783p != f.AUCTION) {
                    this.f10769b.put(abstractC3619s7.mo9129c(), C3390h.a.ISAuctionPerformanceFailedToLoad);
                    if (m11363z() || m11361x()) {
                        c3575qxM11306E = m11306E();
                        if (c3575qxM11306E.m11694c()) {
                            mo8896a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
                        }
                    } else {
                        c3575qxM11306E = null;
                    }
                    if (c3575qxM11306E == null) {
                        return;
                    }
                    if (this.f10782o.m12344m()) {
                        synchronized (this.f10791x) {
                            try {
                                if (c3575qxM11306E.m11693b() && m11360w() && (abstractC3619s7M11465c = new C3540px(this.f10782o).m11465c(this.f10768a.m9722b())) != null) {
                                    m11354i(abstractC3619s7M11465c);
                                }
                            } finally {
                            }
                        }
                    }
                    Iterator<Smash> it = c3575qxM11306E.m11692a().iterator();
                    while (it.hasNext()) {
                        it.next().m11858E();
                    }
                    return;
                }
                ironLog.error(m11349b("onAdLoadFailed was invoked from " + abstractC3619s7.mo9129c() + " with state =" + this.f10783p + " auctionId: " + abstractC3619s7.m11869h() + " and the current id is " + this.f10768a.m9724c()));
                C3345lw c3345lw = this.f10786s.f7688j;
                StringBuilder sb = new StringBuilder("onAdLoadFailed was invoked with state =");
                sb.append(this.f10783p);
                c3345lw.m9926o(sb.toString());
            } finally {
            }
        }
    }

    @Override // com.ironsource.InterfaceC3895z7
    /* renamed from: a */
    public void mo11270a(NetworkSettings networkSettings) throws JSONException {
        AdapterBaseInterface adapterBaseInterfaceM10116b = C3367c.m10097b().m10116b(networkSettings, this.f10782o.m12333b(), m11355k());
        if (adapterBaseInterfaceM10116b != null) {
            this.f10786s.f7685g.m9020a(m11321b(networkSettings, adapterBaseInterfaceM10116b));
        }
    }

    /* renamed from: a */
    public void m11345a(f fVar) {
        synchronized (this.f10791x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.f10783p = fVar;
        }
    }

    /* renamed from: a */
    public void mo8195a(AbstractC3619s7<?> abstractC3619s7, AdInfo adInfo) {
        this.f10787t.mo7880c(adInfo);
    }

    @Override // com.ironsource.InterfaceC3778vq
    /* renamed from: a */
    public void mo11346a(Runnable runnable) {
        HandlerThreadC3155gk handlerThreadC3155gk = this.f10767J;
        if (handlerThreadC3155gk != null) {
            handlerThreadC3155gk.m8981a(runnable);
        }
    }

    @Override // com.ironsource.InterfaceC3895z7
    /* renamed from: a */
    public void mo11271a(String str) {
        this.f10786s.f7688j.m9918g(str);
    }

    @Override // com.ironsource.InterfaceC3581r4
    /* renamed from: a */
    public void mo10178a(List<C3353m5> list, String str, C3353m5 c3353m5, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11353i());
        if (!m11362y()) {
            StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("unexpected auction success for auctionId - ", str, " state = ");
            sbOooOoO0.append(this.f10783p);
            ironLog.error(m11349b(sbOooOoO0.toString()));
            this.f10786s.f7688j.m9922k("unexpected auction success, state = " + this.f10783p);
            return;
        }
        this.f10773f = "";
        this.f10772e = i;
        this.f10775h = c3353m5;
        this.f10774g = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            this.f10786s.f7688j.m9896a(i2, str2);
        }
        m11320a(jSONObject2);
        if (this.f10788u.mo8947a(this.f10782o.m12333b())) {
            this.f10786s.f7686h.m11495a(str);
            mo8896a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
            return;
        }
        String strM11312a = m11312a(list, str);
        this.f10786s.f7686h.m11493a(j, this.f10782o.m12348r() + ";wtf=" + list.size());
        this.f10786s.f7686h.m11497c(strM11312a);
        m11345a(f.LOADING);
        m11304C();
    }

    /* renamed from: a */
    public void m11318a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11349b("auction waterfallString = " + str));
        boolean z = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(m11349b("auction failed - no candidates"));
            this.f10786s.f7686h.m11491a(1005, "No candidates available for auctioning");
            mo8896a(C3855y1.m13118e(this.f10782o.m12333b()), "no available ad to load", false);
            return;
        }
        this.f10786s.f7686h.m11496b(str);
        if (this.f10770c == null) {
            ironLog.error(m11349b("mAuctionHandler is null"));
            return;
        }
        int iMo9344a = this.f10760C.mo9344a(this.f10782o.m12333b());
        C3391i c3391i = new C3391i(this.f10782o.m12333b());
        c3391i.m10307b(IronSourceUtils.isEncryptedResponse());
        c3391i.m10303a(map);
        c3391i.m10302a(list);
        c3391i.m10298a(this.f10771d);
        c3391i.m10294a(iMo9344a);
        c3391i.m10297a(this.f10789v);
        c3391i.m10313d(this.f10764G);
        C3270jv c3270jv = this.f10765H;
        if (c3270jv != null && c3270jv.m9545b()) {
            z = true;
        }
        c3391i.m10315e(z);
        mo8897a(ContextProvider.getInstance().getApplicationContext(), c3391i, this);
    }

    /* renamed from: a */
    public void m11319a(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC3861y7> list2) {
        if (list2.isEmpty()) {
            m11318a(map, list, sb.toString());
            return;
        }
        C2963b8 c2963b8 = new C2963b8();
        e eVar = new e(map, sb, list);
        this.f10786s.f7685g.m9017a();
        c2963b8.m7885a(list2, eVar, this.f10782o.m12337e(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    private void m11320a(JSONObject jSONObject) {
        this.f10788u.mo8948a(this.f10782o.m12333b(), jSONObject != null ? jSONObject.optBoolean(C3368d.f9608f, false) : false);
        m11325b(jSONObject);
    }

    @Override // com.ironsource.InterfaceC3125fp
    /* renamed from: a */
    public void mo8733a(boolean z) {
        if (!this.f10777j || this.f10782o.m12340h().m9979f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z);
        if (m11330c(z)) {
            m11347a(z, false, (AbstractC3619s7<?>) null);
        }
    }

    /* renamed from: a */
    public void m11347a(boolean z, boolean z2, AbstractC3619s7<?> abstractC3619s7) {
        synchronized (this.f10791x) {
            try {
                Boolean bool = this.f10793z;
                if (bool == null || bool.booleanValue() != z) {
                    this.f10793z = Boolean.valueOf(z);
                    long time = 0;
                    if (this.f10792y != 0) {
                        time = new Date().getTime() - this.f10792y;
                    }
                    this.f10792y = new Date().getTime();
                    this.f10786s.f7684f.m7950a(z, time, z2);
                    AdInfo adInfoM11867f = abstractC3619s7 != null ? abstractC3619s7.m11867f() : this.f10758A;
                    this.f10758A = adInfoM11867f;
                    AbstractC3241j2 abstractC3241j2 = this.f10787t;
                    if (!z) {
                        adInfoM11867f = null;
                    }
                    abstractC3241j2.mo8553a(z, adInfoM11867f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public boolean m11348a(f fVar, f fVar2) {
        boolean z;
        synchronized (this.f10791x) {
            try {
                if (this.f10783p == fVar) {
                    IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                    this.f10783p = fVar2;
                    z = true;
                } else {
                    IronLog.INTERNAL.verbose("wrong state, current state = " + this.f10783p + ", expected state = " + fVar);
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
