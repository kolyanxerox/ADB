package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.C3029d4;
import com.ironsource.C3092er;
import com.ironsource.C3094et;
import com.ironsource.C3162gr;
import com.ironsource.C3190hk;
import com.ironsource.C3243j4;
import com.ironsource.C3288ke;
import com.ironsource.C3300kq;
import com.ironsource.C3495on;
import com.ironsource.C3530pn;
import com.ironsource.C3551q9;
import com.ironsource.C3571qt;
import com.ironsource.C3606rt;
import com.ironsource.C3711tt;
import com.ironsource.C3830xa;
import com.ironsource.C3891z3;
import com.ironsource.C3899zb;
import com.ironsource.EnumC2638ac;
import com.ironsource.EnumC3054dt;
import com.ironsource.InterfaceC3125fp;
import com.ironsource.InterfaceC3254jf;
import com.ironsource.InterfaceC3497op;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.integration.IntegrationHelper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.s */
/* loaded from: classes2.dex */
class C3407s implements InterfaceC3125fp {

    /* renamed from: A */
    private static C3407s f10112A;

    /* renamed from: a */
    private C3711tt f10113a;

    /* renamed from: p */
    private NetworkStateReceiver f10128p;

    /* renamed from: q */
    private CountDownTimer f10129q;

    /* renamed from: t */
    private String f10132t;

    /* renamed from: u */
    private C3571qt f10133u;

    /* renamed from: v */
    private SegmentListener f10134v;

    /* renamed from: x */
    private long f10136x;

    /* renamed from: b */
    private int f10114b = e.f10153f;

    /* renamed from: c */
    private InterfaceC3254jf f10115c = C3495on.m11199U().mo8696v();

    /* renamed from: d */
    private final String f10116d = "appKey";

    /* renamed from: e */
    private final String f10117e = getClass().getSimpleName();

    /* renamed from: l */
    private boolean f10124l = false;

    /* renamed from: n */
    private boolean f10126n = false;

    /* renamed from: r */
    private List<InterfaceC3497op> f10130r = new ArrayList();

    /* renamed from: s */
    private String f10131s = "";

    /* renamed from: z */
    private f f10138z = new a();

    /* renamed from: m */
    private Handler f10125m = IronSourceThreadManager.INSTANCE.getInitHandler();

    /* renamed from: f */
    private int f10118f = 1;

    /* renamed from: g */
    private int f10119g = 0;

    /* renamed from: h */
    private int f10120h = 62;

    /* renamed from: i */
    private int f10121i = 12;

    /* renamed from: j */
    private int f10122j = 5;

    /* renamed from: o */
    private AtomicBoolean f10127o = new AtomicBoolean(true);

    /* renamed from: k */
    private boolean f10123k = false;

    /* renamed from: w */
    private boolean f10135w = false;

    /* renamed from: y */
    private C3190hk f10137y = new C3190hk();

    /* renamed from: com.ironsource.mediationsdk.s$a */
    public class a extends f {
        public a() {
            super();
        }

        @Override // java.lang.Runnable
        public void run() {
            C3606rt c3606rtM13296j;
            try {
                C3404p c3404pM10470j = C3404p.m10470j();
                if (!TextUtils.isEmpty(C3407s.this.f10131s)) {
                    C3288ke.m9661a().m9663a("userId", C3407s.this.f10131s);
                }
                if (!TextUtils.isEmpty(C3407s.this.f10132t)) {
                    C3288ke.m9661a().m9663a("appKey", C3407s.this.f10132t);
                }
                C3407s.this.f10137y.m9152i(C3407s.this.f10131s);
                C3407s.this.f10136x = new Date().getTime();
                C3092er.m8541c().m8543a();
                C3407s.this.f10133u = c3404pM10470j.m10530b(ContextProvider.getInstance().getApplicationContext(), C3407s.this.f10131s, this.f10156c);
                if (C3407s.this.f10133u != null) {
                    C3407s.this.f10125m.removeCallbacks(this);
                    if (C3407s.this.f10133u.m11644p()) {
                        C3407s.this.m10674b(d.INITIATED);
                        new C3530pn().m11434a(C3407s.this.f10133u.m11635c().m12633b().m13291e().m9255b(), c3404pM10470j.m10565z());
                        C3243j4 c3243j4M13292f = C3407s.this.f10133u.m11635c().m12633b().m13292f();
                        if (c3243j4M13292f != null) {
                            C3830xa c3830xa = C3830xa.f12596a;
                            c3830xa.m13038c(c3243j4M13292f.m9424g());
                            c3830xa.m13034a(c3243j4M13292f.m9423f());
                            c3830xa.m13033a(c3243j4M13292f.m9427j());
                            IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(c3243j4M13292f.m9425h());
                            C3407s.this.f10115c.mo9481a(c3243j4M13292f);
                        }
                        C3407s.this.m10669a(ContextProvider.getInstance().getApplicationContext(), C3407s.this.f10133u);
                        c3404pM10470j.m10501a(new Date().getTime() - C3407s.this.f10136x, C3407s.this.f10133u.m11639h());
                        if (c3243j4M13292f != null && c3243j4M13292f.m9422e()) {
                            new C3162gr(C3495on.m11199U().mo8698z(), new OooO0OO(0), C3495on.m11199U(), IronSourceThreadManager.INSTANCE.getThreadPoolExecutor()).m9011c(ContextProvider.getInstance().getApplicationContext());
                        }
                        C3407s.this.f10113a = new C3711tt();
                        C3407s.this.f10113a.m12485a(C3407s.this.f10115c);
                        if (C3407s.this.f10133u.m11635c().m12633b().m13293g() && ContextProvider.getInstance().getApplicationContext() != null) {
                            IntegrationHelper.validateIntegration(ContextProvider.getInstance().getApplicationContext());
                        }
                        List<IronSource.AD_UNIT> listM11638g = C3407s.this.f10133u.m11638g();
                        Iterator it = C3407s.this.f10130r.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC3497op) it.next()).mo10525a(listM11638g, C3407s.this.m10656h(), C3407s.this.f10133u.m11635c());
                        }
                        new C3300kq.a().m9696a();
                        if (C3407s.this.f10134v != null && (c3606rtM13296j = C3407s.this.f10133u.m11635c().m12633b().m13296j()) != null && !TextUtils.isEmpty(c3606rtM13296j.m11764c())) {
                            C3407s.this.f10134v.onSegmentReceived(c3606rtM13296j.m11764c());
                        }
                        C3029d4 c3029d4M13290d = C3407s.this.f10133u.m11635c().m12633b().m13290d();
                        if (c3029d4M13290d.m8276f()) {
                            C3551q9.m11517d().m11520a(c3029d4M13290d.m8268b(), c3029d4M13290d.m8274d(), c3029d4M13290d.m8271c(), c3029d4M13290d.m8275e(), IronSourceUtils.getSessionId(), c3029d4M13290d.m8264a(), c3029d4M13290d.m8277g());
                        }
                    } else if (!C3407s.this.f10124l) {
                        C3407s.this.m10674b(d.INIT_FAILED);
                        C3407s.this.f10124l = true;
                        Iterator it2 = C3407s.this.f10130r.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC3497op) it2.next()).mo10547d("serverResponseIsNotValid");
                        }
                    }
                } else {
                    if (C3407s.this.f10119g == 3) {
                        C3407s.this.f10135w = true;
                        Iterator it3 = C3407s.this.f10130r.iterator();
                        while (it3.hasNext()) {
                            ((InterfaceC3497op) it3.next()).mo10500a();
                        }
                    }
                    if (this.f10154a && C3407s.this.f10119g < C3407s.this.f10120h) {
                        C3407s.this.f10123k = true;
                        C3407s.this.f10125m.postDelayed(this, C3407s.this.f10118f * 1000);
                        if (C3407s.this.f10119g < C3407s.this.f10121i) {
                            C3407s.m10638a(C3407s.this, 2);
                        }
                    }
                    if ((!this.f10154a || C3407s.this.f10119g == C3407s.this.f10122j) && !C3407s.this.f10124l) {
                        C3407s.this.f10124l = true;
                        if (TextUtils.isEmpty(this.f10155b)) {
                            this.f10155b = "noServerResponse";
                        }
                        Iterator it4 = C3407s.this.f10130r.iterator();
                        while (it4.hasNext()) {
                            ((InterfaceC3497op) it4.next()).mo10547d(this.f10155b);
                        }
                        C3407s.this.m10674b(d.INIT_FAILED);
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                    }
                    C3407s.m10653f(C3407s.this);
                }
                C3407s.this.m10652e();
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.s$b */
    public class b implements Runnable {

        /* renamed from: com.ironsource.mediationsdk.s$b$a */
        public class a extends CountDownTimer {
            public a(long j, long j2) {
                super(j, j2);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (C3407s.this.f10124l) {
                    return;
                }
                C3407s.this.f10124l = true;
                Iterator it = C3407s.this.f10130r.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3497op) it.next()).mo10547d("noInternetConnection");
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                if (j <= 45000) {
                    C3407s.this.f10135w = true;
                    Iterator it = C3407s.this.f10130r.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC3497op) it.next()).mo10500a();
                    }
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3407s.this.f10129q = new a(60000L, 15000L).start();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.s$c */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f10142a;

        static {
            int[] iArr = new int[d.values().length];
            f10142a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10142a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10142a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.s$d */
    public enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* renamed from: com.ironsource.mediationsdk.s$e */
    public static class e {

        /* renamed from: a */
        public static int f10148a = 0;

        /* renamed from: b */
        public static int f10149b = 1;

        /* renamed from: c */
        public static int f10150c = 2;

        /* renamed from: d */
        public static int f10151d = 3;

        /* renamed from: e */
        public static int f10152e = 4;

        /* renamed from: f */
        public static int f10153f = 5;
    }

    /* renamed from: com.ironsource.mediationsdk.s$f */
    public abstract class f implements Runnable {

        /* renamed from: b */
        String f10155b;

        /* renamed from: a */
        boolean f10154a = true;

        /* renamed from: c */
        protected C3404p.c f10156c = new a();

        /* renamed from: com.ironsource.mediationsdk.s$f$a */
        public class a implements C3404p.c {
            public a() {
            }

            @Override // com.ironsource.mediationsdk.C3404p.c
            /* renamed from: a */
            public void mo10566a(String str) {
                f fVar = f.this;
                fVar.f10154a = false;
                fVar.f10155b = str;
            }
        }

        public f() {
        }
    }

    private C3407s() {
    }

    /* renamed from: a */
    private static int m10637a(d dVar) {
        int i = c.f10142a[dVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? e.f10148a : e.f10149b : e.f10152e : e.f10151d;
    }

    /* renamed from: c */
    public static synchronized C3407s m10647c() {
        try {
            if (f10112A == null) {
                f10112A = new C3407s();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10112A;
    }

    /* renamed from: f */
    public static /* synthetic */ int m10653f(C3407s c3407s) {
        int i = c3407s.f10119g;
        c3407s.f10119g = i + 1;
        return i;
    }

    /* renamed from: b */
    public int m10673b() {
        return this.f10114b;
    }

    /* renamed from: d */
    public synchronized boolean m10676d() {
        return this.f10135w;
    }

    /* renamed from: a */
    public static /* synthetic */ int m10638a(C3407s c3407s, int i) {
        int i2 = c3407s.f10118f * i;
        c3407s.f10118f = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m10652e() {
        if (C3495on.m11199U().mo8685d().mo11379g()) {
            C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public boolean m10656h() {
        return this.f10123k;
    }

    /* renamed from: f */
    public void m10677f() {
        m10674b(d.INIT_FAILED);
    }

    /* renamed from: g */
    public synchronized void m10678g() {
        int iM10637a = m10637a(m10668a());
        this.f10114b = iM10637a;
        this.f10137y.m9145c(iM10637a);
    }

    /* renamed from: b */
    public synchronized void m10674b(d dVar) {
        IronLog.INTERNAL.verbose("old status: " + m10668a() + ", new status: " + dVar + ")");
        C3094et.f8460a.m8557a(EnumC3054dt.values()[dVar.ordinal()]);
    }

    /* renamed from: b */
    public void m10675b(InterfaceC3497op interfaceC3497op) {
        if (interfaceC3497op == null || this.f10130r.size() == 0) {
            return;
        }
        this.f10130r.remove(interfaceC3497op);
    }

    /* renamed from: a */
    public synchronized d m10668a() {
        return d.values()[C3094et.f8460a.m8556a().ordinal()];
    }

    /* renamed from: a */
    public void m10669a(Context context, C3571qt c3571qt) {
        this.f10137y.m9152i(c3571qt.m11637f().m12443h());
        this.f10137y.m9146c(c3571qt.m11637f().m12439d());
        C3891z3 c3891z3M12633b = c3571qt.m11635c().m12633b();
        this.f10137y.m9137a(c3891z3M12633b.m13287a());
        this.f10137y.m9147d(c3891z3M12633b.m13289c().m13009b());
        this.f10137y.m9143b(c3891z3M12633b.m13297k().m9551b());
        this.f10137y.m9136a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
        C3243j4 c3243j4M13292f = c3571qt.m11635c().m12633b().m13292f();
        this.f10137y.m9140b(c3243j4M13292f.m9419b());
        C3495on.m11193O().mo8490x().mo11372a(c3243j4M13292f.m9420c());
    }

    /* renamed from: a */
    public synchronized void m10670a(Context context, String str, String str2, IronSource.AD_UNIT... ad_unitArr) {
        try {
            try {
                AtomicBoolean atomicBoolean = this.f10127o;
                if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.f10117e + ": Multiple calls to init are not allowed", 2);
                } else {
                    m10674b(d.INIT_IN_PROGRESS);
                    this.f10131s = str2;
                    this.f10132t = str;
                    if (IronSourceUtils.isNetworkConnected(context)) {
                        this.f10125m.post(this.f10138z);
                    } else {
                        this.f10126n = true;
                        if (this.f10128p == null) {
                            this.f10128p = new NetworkStateReceiver(context, this);
                        }
                        context.registerReceiver(this.f10128p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                    }
                }
            } catch (Exception e2) {
                C3551q9.m11517d().m11519a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public void m10671a(SegmentListener segmentListener) {
        this.f10134v = segmentListener;
    }

    /* renamed from: a */
    public void m10672a(InterfaceC3497op interfaceC3497op) {
        if (interfaceC3497op == null) {
            return;
        }
        this.f10130r.add(interfaceC3497op);
    }

    @Override // com.ironsource.InterfaceC3125fp
    /* renamed from: a */
    public void mo8733a(boolean z) {
        if (this.f10126n && z) {
            CountDownTimer countDownTimer = this.f10129q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f10126n = false;
            this.f10123k = true;
            C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.INIT_AFTER_REACHABILITY_CHANGE, IronSourceUtils.getMediationAdditionalData(false)));
            this.f10125m.post(this.f10138z);
        }
    }
}
