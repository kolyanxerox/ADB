package com.ironsource;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C2992c2;
import com.ironsource.C3747uu;
import com.ironsource.InterfaceC3188hi;
import com.ironsource.InterfaceC3509p2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.s7 */
/* loaded from: classes2.dex */
public abstract class AbstractC3619s7<Listener extends InterfaceC3509p2> implements NetworkInitializationListener, C3747uu.a, InterfaceC2957b2, AdapterAdListener, InterfaceC3188hi.b {

    /* renamed from: a */
    protected C3275k1 f11307a;

    /* renamed from: b */
    protected Listener f11308b;

    /* renamed from: c */
    protected BaseAdAdapter<?, AdapterAdListener> f11309c;

    /* renamed from: d */
    protected C2992c2 f11310d;

    /* renamed from: e */
    protected h f11311e;

    /* renamed from: g */
    protected Placement f11313g;

    /* renamed from: h */
    protected C2629a3 f11314h;

    /* renamed from: i */
    protected JSONObject f11315i;

    /* renamed from: j */
    protected String f11316j;

    /* renamed from: k */
    protected AdData f11317k;

    /* renamed from: l */
    protected Long f11318l;

    /* renamed from: m */
    protected C3216ib f11319m;

    /* renamed from: o */
    private final C3353m5 f11321o;

    /* renamed from: p */
    private final InterfaceC3778vq f11322p;

    /* renamed from: f */
    private AtomicBoolean f11312f = new AtomicBoolean(false);

    /* renamed from: n */
    private C3747uu f11320n = new C3747uu(TimeUnit.SECONDS.toMillis(m11855s()));

    /* renamed from: q */
    protected final Object f11323q = new Object();

    /* renamed from: com.ironsource.s7$a */
    public class a extends AbstractRunnableC3302ks {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3619s7.this.m11842L();
        }
    }

    /* renamed from: com.ironsource.s7$b */
    public class b extends AbstractRunnableC3302ks {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3619s7.this.m11841K();
        }
    }

    /* renamed from: com.ironsource.s7$c */
    public class c extends AbstractRunnableC3302ks {

        /* renamed from: a */
        final /* synthetic */ int f11326a;

        /* renamed from: b */
        final /* synthetic */ String f11327b;

        public c(int i, String str) {
            this.f11326a = i;
            this.f11327b = str;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3619s7.this.m11843a(this.f11326a, this.f11327b);
        }
    }

    /* renamed from: com.ironsource.s7$d */
    public class d extends AbstractRunnableC3302ks {
        public d() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3619s7.this.m11839I();
        }
    }

    /* renamed from: com.ironsource.s7$e */
    public class e extends AbstractRunnableC3302ks {

        /* renamed from: a */
        final /* synthetic */ AdapterErrorType f11330a;

        /* renamed from: b */
        final /* synthetic */ int f11331b;

        /* renamed from: c */
        final /* synthetic */ String f11332c;

        public e(AdapterErrorType adapterErrorType, int i, String str) {
            this.f11330a = adapterErrorType;
            this.f11331b = i;
            this.f11332c = str;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3619s7.this.m11844a(this.f11330a, this.f11331b, this.f11332c);
        }
    }

    /* renamed from: com.ironsource.s7$f */
    public class f extends AbstractRunnableC3302ks {
        public f() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3619s7.this.m11840J();
        }
    }

    /* renamed from: com.ironsource.s7$g */
    public class g extends AbstractRunnableC3302ks {
        public g() {
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            AbstractC3619s7.this.m11838H();
        }
    }

    /* renamed from: com.ironsource.s7$h */
    public enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3619s7(InterfaceC3778vq interfaceC3778vq, C3275k1 c3275k1, BaseAdAdapter<?, ?> baseAdAdapter, C2629a3 c2629a3, C3353m5 c3353m5, Listener listener) {
        this.f11307a = c3275k1;
        this.f11308b = listener;
        this.f11310d = new C2992c2(c3275k1.m9562a(), C2992c2.b.PROVIDER, this);
        this.f11314h = c2629a3;
        this.f11315i = c2629a3.m4768c();
        this.f11309c = baseAdAdapter;
        this.f11321o = c3353m5;
        this.f11322p = interfaceC3778vq;
        m11862a(h.NONE);
    }

    /* renamed from: D */
    private boolean m11836D() {
        return this.f11311e == h.INIT_IN_PROGRESS;
    }

    /* renamed from: F */
    private void m11837F() {
        IronLog.INTERNAL.verbose(m11865d());
        m11862a(h.LOADING);
        m11863a(false);
        try {
            this.f11320n.m12717a((C3747uu.a) this);
            mo8997G();
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("unexpected error while calling adapter.loadAd() - ", th);
            sbOooOOO.append(th.getMessage());
            sbOooOOO.append(" - state = ");
            sbOooOOO.append(this.f11311e);
            String string = sbOooOOO.toString();
            IronLog.INTERNAL.error(m11861a(string));
            C2992c2 c2992c2 = this.f11310d;
            if (c2992c2 != null) {
                c2992c2.f7688j.m9918g(string);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, string);
        }
    }

    /* renamed from: H */
    public void m11838H() {
        IronLog.INTERNAL.verbose(m11865d());
        C2992c2 c2992c2 = this.f11310d;
        if (c2992c2 != null) {
            c2992c2.f7687i.m9938a(m11871j());
        }
        this.f11308b.mo11248f(this);
    }

    /* renamed from: I */
    public void m11839I() {
        boolean zMo9648O;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11865d());
        C3747uu c3747uu = this.f11320n;
        if (c3747uu != null) {
            c3747uu.m12718e();
        }
        synchronized (this.f11323q) {
            try {
                h hVar = this.f11311e;
                zMo9648O = false;
                if (hVar == h.LOADING) {
                    long jM9304a = C3216ib.m9304a(this.f11319m);
                    ironLog.verbose(m11861a("Load duration = " + jM9304a));
                    if (this.f11310d != null) {
                        if (mo9654v()) {
                            this.f11310d.f7684f.m7942a(jM9304a);
                        } else {
                            this.f11310d.f7684f.m7947a(jM9304a, false);
                        }
                    }
                    m11862a(h.LOADED);
                    zMo9648O = mo9648O();
                } else if (hVar != h.FAILED) {
                    ironLog.error(m11861a("unexpected load success for " + m11872k() + ", state - " + this.f11311e));
                    h hVar2 = this.f11311e;
                    StringBuilder sb = new StringBuilder("unexpected load success, state - ");
                    sb.append(hVar2);
                    String string = sb.toString();
                    if (this.f11310d != null) {
                        if (mo9654v()) {
                            this.f11310d.f7688j.m9930s(string);
                        } else {
                            this.f11310d.f7688j.m9927p(string);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zMo9648O) {
            this.f11308b.mo11247e(this);
        }
    }

    /* renamed from: J */
    public void m11840J() {
        IronLog.INTERNAL.verbose(m11865d());
        m11862a(h.SHOWING);
        C2992c2 c2992c2 = this.f11310d;
        if (c2992c2 != null) {
            c2992c2.f7687i.m9950g(m11871j());
        }
        this.f11308b.mo8904b(this);
    }

    /* renamed from: K */
    public void m11841K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11865d());
        if (m11836D()) {
            C3747uu c3747uu = this.f11320n;
            if (c3747uu != null) {
                c3747uu.m12718e();
            }
            m11862a(h.READY_TO_LOAD);
            m11837F();
            return;
        }
        if (this.f11311e == h.FAILED) {
            return;
        }
        ironLog.error(m11861a("unexpected init success for " + m11872k() + ", state - " + this.f11311e));
        if (this.f11310d != null) {
            this.f11310d.f7688j.m9925n("unexpected init success, state - " + this.f11311e);
        }
    }

    /* renamed from: L */
    public void m11842L() {
        long jM9304a = C3216ib.m9304a(this.f11319m);
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(jM9304a, "Load duration = ", ", state = ");
        sbOooOOo.append(this.f11311e);
        sbOooOOo.append(", isBidder = ");
        sbOooOOo.append(m11881w());
        ironLog.verbose(m11861a(sbOooOOo.toString()));
        synchronized (this.f11323q) {
            try {
                if (m11884z()) {
                    m11862a(h.FAILED);
                    C2992c2 c2992c2 = this.f11310d;
                    if (c2992c2 != null) {
                        c2992c2.f7684f.m7946a(jM9304a, 1025, false);
                        this.f11310d.f7684f.m7945a(jM9304a, 1025, "time out", false);
                    }
                    this.f11308b.mo11246a(ErrorBuilder.buildLoadFailedError("time out"), this);
                    return;
                }
                ironLog.error(m11861a("unexpected timeout for " + m11872k() + ", state - " + this.f11311e + ", error - 1025"));
                if (this.f11310d != null) {
                    this.f11310d.f7688j.m9932u("unexpected timeout, state - " + this.f11311e + ", error - 1025");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    private int m11854o() {
        return 1;
    }

    /* renamed from: s */
    private int m11855s() {
        C3353m5 c3353m5 = this.f11321o;
        if (c3353m5 == null) {
            return this.f11307a.m9567f();
        }
        Integer numM9989f = c3353m5.m9989f();
        int iM9567f = (numM9989f == null || numM9989f.intValue() <= 0) ? this.f11307a.m9567f() : numM9989f.intValue();
        IronLog.INTERNAL.verbose(m11861a("Load timeout for " + this.f11321o.m9986c() + " - " + iM9567f + " seconds"));
        return iM9567f;
    }

    /* renamed from: A */
    public AtomicBoolean m11856A() {
        return this.f11312f;
    }

    /* renamed from: B */
    public boolean mo11119B() {
        return m11883y();
    }

    /* renamed from: C */
    public boolean m11857C() {
        return this.f11311e == h.SHOWING;
    }

    /* renamed from: E */
    public void m11858E() {
        String str;
        int iM13116c;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11865d());
        C3353m5 c3353m5M11870i = m11870i();
        String strM9994k = c3353m5M11870i.m9994k();
        Map<String, Object> mapM12446a = C3702tk.m12446a(c3353m5M11870i.m9984a());
        mapM12446a.put("adUnit", this.f11307a.m9562a());
        m11864b(strM9994k);
        try {
            boolean z = false;
            if (mo9654v()) {
                this.f11310d.f7684f.m7940a();
            } else {
                this.f11310d.f7684f.m7949a(false);
            }
            this.f11318l = null;
            this.f11319m = new C3216ib();
            this.f11317k = mo9652a(strM9994k, mapM12446a);
            synchronized (this.f11323q) {
                if (this.f11311e != h.NONE) {
                    z = true;
                } else {
                    m11862a(h.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                str = "loadAd - incorrect state while loading, state = " + this.f11311e;
                ironLog.error(m11861a(str));
                this.f11310d.f7688j.m9918g(str);
                iM13116c = C3855y1.m13116c(this.f11307a.m9562a());
            } else {
                this.f11320n.m12717a((C3747uu.a) this);
                AdapterBaseInterface networkAdapter = this.f11309c.getNetworkAdapter();
                if (networkAdapter != null) {
                    networkAdapter.init(this.f11317k, ContextProvider.getInstance().getApplicationContext(), this);
                    return;
                }
                str = "loadAd - network adapter not available " + m11872k();
                ironLog.error(m11861a(str));
                iM13116c = C3855y1.m13116c(this.f11307a.m9562a());
            }
            onInitFailed(iM13116c, str);
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("loadAd - exception = ", th);
            sbOooOOO.append(th.getLocalizedMessage());
            String string = sbOooOOO.toString();
            IronLog.INTERNAL.error(m11861a(string));
            C2992c2 c2992c2 = this.f11310d;
            if (c2992c2 != null) {
                c2992c2.f7688j.m9918g(string);
            }
            onInitFailed(C3855y1.m13116c(this.f11307a.m9562a()), string);
        }
    }

    /* renamed from: G */
    public void mo8997G() {
        Object obj = this.f11309c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.f11317k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(m11861a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0056 A[Catch: all -> 0x000e, TryCatch #1 {, blocks: (B:33:0x0003, B:36:0x0008, B:44:0x0052, B:46:0x0056, B:47:0x005b, B:49:0x005f, B:50:0x0064, B:41:0x0011, B:43:0x004d), top: B:56:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005f A[Catch: all -> 0x000e, TryCatch #1 {, blocks: (B:33:0x0003, B:36:0x0008, B:44:0x0052, B:46:0x0056, B:47:0x005b, B:49:0x005f, B:50:0x0064, B:41:0x0011, B:43:0x004d), top: B:56:0x0003, inners: #0 }] */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m11859M() {
        /*
            r4 = this;
            java.lang.String r0 = "Exception while calling adapter.releaseMemory() from "
            monitor-enter(r4)
            com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> r1 = r4.f11309c     // Catch: java.lang.Throwable -> Le
            r2 = 0
            if (r1 == 0) goto L52
            r1.releaseMemory()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10
            r4.f11309c = r2     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10
            goto L52
        Le:
            r0 = move-exception
            goto L66
        L10:
            r1 = move-exception
            com.ironsource.q9 r3 = com.ironsource.C3551q9.m11517d()     // Catch: java.lang.Throwable -> Le
            r3.m11519a(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Le
            com.ironsource.a3 r0 = r4.f11314h     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.m4771f()     // Catch: java.lang.Throwable -> Le
            r3.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = " - "
            r3.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> Le
            r3.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = " - state = "
            r3.append(r0)     // Catch: java.lang.Throwable -> Le
            com.ironsource.s7$h r0 = r4.f11311e     // Catch: java.lang.Throwable -> Le
            r3.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Le
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r4.m11861a(r0)     // Catch: java.lang.Throwable -> Le
            r1.error(r3)     // Catch: java.lang.Throwable -> Le
            com.ironsource.c2 r1 = r4.f11310d     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L52
            com.ironsource.lw r1 = r1.f7688j     // Catch: java.lang.Throwable -> Le
            r1.m9918g(r0)     // Catch: java.lang.Throwable -> Le
        L52:
            com.ironsource.c2 r0 = r4.f11310d     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L5b
            r0.m8080f()     // Catch: java.lang.Throwable -> Le
            r4.f11310d = r2     // Catch: java.lang.Throwable -> Le
        L5b:
            com.ironsource.uu r0 = r4.f11320n     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L64
            r0.m8578d()     // Catch: java.lang.Throwable -> Le
            r4.f11320n = r2     // Catch: java.lang.Throwable -> Le
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            return
        L66:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.AbstractC3619s7.m11859M():void");
    }

    /* renamed from: N */
    public void m11860N() {
        IronLog.INTERNAL.verbose(m11865d());
        C2992c2 c2992c2 = this.f11310d;
        if (c2992c2 != null) {
            c2992c2.f7687i.m9936a();
        }
    }

    /* renamed from: O */
    public boolean mo9648O() {
        return true;
    }

    /* renamed from: a */
    public AdData mo9652a(String str, Map<String, Object> map) {
        return new AdData(str, m11877q(), mo9653a(map));
    }

    @Override // com.ironsource.InterfaceC3188hi.b
    /* renamed from: b */
    public int mo9128b() {
        return this.f11314h.m4770e();
    }

    @Override // com.ironsource.InterfaceC3188hi.b
    /* renamed from: c */
    public String mo9129c() {
        return this.f11314h.m4771f();
    }

    /* renamed from: d */
    public String m11865d() {
        return m11861a((String) null);
    }

    /* renamed from: e */
    public Long m11866e() {
        return this.f11318l;
    }

    /* renamed from: f */
    public AdInfo m11867f() {
        return new AdInfo(this.f11321o.m9983a(m11871j()), this.f11321o.m9987d());
    }

    /* renamed from: g */
    public IronSource.AD_UNIT m11868g() {
        return this.f11307a.m9562a();
    }

    /* renamed from: h */
    public String m11869h() {
        return this.f11307a.m9564c();
    }

    /* renamed from: i */
    public C3353m5 m11870i() {
        return this.f11321o;
    }

    /* renamed from: j */
    public String m11871j() {
        Placement placement = this.f11313g;
        return placement == null ? "" : placement.getPlacementName();
    }

    /* renamed from: k */
    public String m11872k() {
        return mo9129c() + StringUtils.SPACE + hashCode();
    }

    /* renamed from: l */
    public int m11873l() {
        return this.f11314h.m4769d();
    }

    /* renamed from: m */
    public String m11874m() {
        return this.f11314h.m4773h().isMultipleInstances() ? this.f11314h.m4773h().getProviderTypeForReflection() : this.f11314h.m4771f();
    }

    /* renamed from: n */
    public String m11875n() {
        return this.f11314h.m4772g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.f11322p.mo11352c()) {
            this.f11322p.mo11346a(new g());
        } else {
            m11838H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str) {
        if (this.f11322p.mo11352c()) {
            this.f11322p.mo11346a(new e(adapterErrorType, i, str));
        } else {
            m11844a(adapterErrorType, i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.f11322p.mo11352c()) {
            this.f11322p.mo11346a(new d());
        } else {
            m11839I();
        }
    }

    public void onAdOpened() {
        if (this.f11322p.mo11352c()) {
            this.f11322p.mo11346a(new f());
        } else {
            m11840J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, String str) {
        if (this.f11322p.mo11352c()) {
            this.f11322p.mo11346a(new c(i, str));
        } else {
            m11843a(i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.f11322p.mo11352c()) {
            this.f11322p.mo11346a(new b());
        } else {
            m11841K();
        }
    }

    /* renamed from: p */
    public NetworkSettings m11876p() {
        return this.f11307a.m9568g();
    }

    /* renamed from: q */
    public Map<String, Object> m11877q() {
        HashMap map = new HashMap();
        map.putAll(C3702tk.m12446a(this.f11315i));
        return map;
    }

    /* renamed from: r */
    public Integer m11878r() {
        C3275k1 c3275k1 = this.f11307a;
        if (c3275k1 != null) {
            return Integer.valueOf(c3275k1.m9569h());
        }
        return null;
    }

    /* renamed from: t */
    public h m11879t() {
        return this.f11311e;
    }

    /* renamed from: u */
    public InterfaceC3778vq m11880u() {
        return this.f11322p;
    }

    /* renamed from: v */
    public boolean mo9654v() {
        return false;
    }

    /* renamed from: w */
    public boolean m11881w() {
        return this.f11314h.m4775j();
    }

    /* renamed from: x */
    public boolean m11882x() {
        return this.f11311e == h.FAILED;
    }

    /* renamed from: y */
    public boolean m11883y() {
        return this.f11311e == h.LOADED;
    }

    /* renamed from: z */
    public boolean m11884z() {
        h hVar = this.f11311e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    /* renamed from: a */
    public String m11861a(String str) {
        String str2 = this.f11307a.m9562a().name() + " - " + m11872k() + " - state = " + this.f11311e;
        return TextUtils.isEmpty(str) ? str2 : OooO0oO.OooOo.OooOoo(str2, " - ", str);
    }

    /* renamed from: b */
    public void m11864b(String str) {
        this.f11316j = C3368d.m10127b().m10136c(str);
    }

    /* renamed from: b */
    private boolean m11850b(EnumC3889z1 enumC3889z1) {
        return new ArrayList(Arrays.asList(EnumC3889z1.LOAD_AD, EnumC3889z1.LOAD_AD_SUCCESS, EnumC3889z1.LOAD_AD_FAILED, EnumC3889z1.LOAD_AD_FAILED_WITH_REASON, EnumC3889z1.LOAD_AD_NO_FILL, EnumC3889z1.RELOAD_AD, EnumC3889z1.RELOAD_AD_SUCCESS, EnumC3889z1.RELOAD_AD_FAILED_WITH_REASON, EnumC3889z1.RELOAD_AD_NO_FILL, EnumC3889z1.DESTROY_AD, EnumC3889z1.AD_PRESENT_SCREEN, EnumC3889z1.AD_DISMISS_SCREEN, EnumC3889z1.AD_LEFT_APPLICATION, EnumC3889z1.AD_OPENED, EnumC3889z1.AD_CLOSED, EnumC3889z1.SHOW_AD, EnumC3889z1.SHOW_AD_FAILED, EnumC3889z1.AD_CLICKED, EnumC3889z1.AD_REWARDED)).contains(enumC3889z1);
    }

    /* renamed from: a */
    public Map<String, Object> mo4765a(EnumC3889z1 enumC3889z1) {
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f11309c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.f11309c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e2) {
            StringBuilder sbOooOOO0 = AbstractC2183w4.OooOOO0(e2, "could not get adapter version for event data");
            sbOooOOO0.append(m11872k());
            IronLog.INTERNAL.error(m11861a(sbOooOOO0.toString()));
        }
        map.put("spId", this.f11314h.m4774i());
        map.put(IronSourceConstants.EVENTS_PROVIDER, this.f11314h.m4766a());
        map.put("instanceType", Integer.valueOf(m11873l()));
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(m11854o()));
        if (!TextUtils.isEmpty(this.f11316j)) {
            map.put("dynamicDemandSource", this.f11316j);
        }
        map.put("sessionDepth", m11878r());
        if (this.f11307a.m9566e() != null && this.f11307a.m9566e().length() > 0) {
            map.put("genericParams", this.f11307a.m9566e());
        }
        if (!TextUtils.isEmpty(this.f11307a.m9564c())) {
            map.put("auctionId", this.f11307a.m9564c());
        }
        if (m11850b(enumC3889z1)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f11307a.m9565d()));
            if (!TextUtils.isEmpty(this.f11307a.m9563b())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f11307a.m9563b());
            }
        }
        if (!TextUtils.isEmpty(this.f11307a.m9568g().getCustomNetwork())) {
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f11307a.m9568g().getCustomNetwork());
        }
        return map;
    }

    /* renamed from: a */
    public Map<String, Object> mo9653a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.f11307a.m9570i());
        return map;
    }

    @Override // com.ironsource.C3747uu.a
    /* renamed from: a */
    public void mo10783a() {
        if (this.f11322p.mo11352c()) {
            this.f11322p.mo11346a(new a());
        } else {
            m11842L();
        }
    }

    /* renamed from: a */
    public void m11843a(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11861a("error = " + i + ", " + str));
        if (m11836D()) {
            C3747uu c3747uu = this.f11320n;
            if (c3747uu != null) {
                c3747uu.m12718e();
            }
            m11862a(h.FAILED);
            m11845a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C3216ib.m9304a(this.f11319m));
            this.f11308b.mo11246a(new IronSourceError(i, str), this);
            return;
        }
        if (this.f11311e == h.FAILED) {
            return;
        }
        ironLog.error(m11861a("unexpected init failed for " + m11872k() + ", state - " + this.f11311e + ", error - " + i + ", " + str));
        if (this.f11310d != null) {
            this.f11310d.f7688j.m9924m("unexpected init failed, state - " + this.f11311e + ", error - " + i + ", " + str);
        }
    }

    /* renamed from: a */
    public void m11844a(AdapterErrorType adapterErrorType, int i, String str) {
        long jM9304a = C3216ib.m9304a(this.f11319m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11861a("Load duration = " + jM9304a + ", error = " + i + ", " + str));
        C3747uu c3747uu = this.f11320n;
        if (c3747uu != null) {
            c3747uu.m12718e();
        }
        synchronized (this.f11323q) {
            h hVar = this.f11311e;
            if (hVar == h.LOADING) {
                m11845a(adapterErrorType, i, str, jM9304a);
                m11862a(h.FAILED);
                this.f11308b.mo11246a(new IronSourceError(i, str), this);
                return;
            }
            if (hVar == h.FAILED) {
                m11845a(adapterErrorType, i, str, jM9304a);
            } else if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.f11318l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(m11861a("ad expired for " + this.f11314h.m4771f() + ", state = " + this.f11311e));
                C2992c2 c2992c2 = this.f11310d;
                if (c2992c2 != null) {
                    c2992c2.f7688j.m9903a("ad expired, state = " + this.f11311e);
                }
            } else {
                ironLog.error(m11861a("unexpected load failed for " + m11872k() + ", state - " + this.f11311e + ", error - " + i + ", " + str));
                h hVar2 = this.f11311e;
                StringBuilder sb = new StringBuilder("unexpected load failed, state - ");
                sb.append(hVar2);
                sb.append(", error - ");
                sb.append(i);
                sb.append(", ");
                sb.append(str);
                String string = sb.toString();
                if (this.f11310d != null) {
                    if (mo9654v()) {
                        this.f11310d.f7688j.m9929r(string);
                    } else if (this.f11307a.m9562a() != IronSource.AD_UNIT.REWARDED_VIDEO || this.f11311e != h.SHOWING) {
                        this.f11310d.f7688j.m9926o(string);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m11845a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (this.f11310d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (mo9654v()) {
                    this.f11310d.f7684f.m7952b(j, i);
                    return;
                } else {
                    this.f11310d.f7684f.m7943a(j, i);
                    return;
                }
            }
            if (TextUtils.isEmpty(str)) {
                this.f11310d.f7684f.m7946a(j, i, false);
            } else if (mo9654v()) {
                this.f11310d.f7684f.m7944a(j, i, str);
            } else {
                this.f11310d.f7684f.m7945a(j, i, str, false);
            }
        }
    }

    /* renamed from: a */
    public void m11862a(h hVar) {
        IronLog.INTERNAL.verbose(m11865d());
        this.f11311e = hVar;
    }

    /* renamed from: a */
    public void m11863a(boolean z) {
        this.f11312f.set(z);
    }
}
