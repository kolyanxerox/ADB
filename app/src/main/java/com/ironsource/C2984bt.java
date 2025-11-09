package com.ironsource;

import android.content.Context;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.ironsource.C3300kq;
import com.ironsource.C3495on;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.bt */
/* loaded from: classes2.dex */
public final class C2984bt {

    /* renamed from: b */
    private static C3711tt f7642b;

    /* renamed from: h */
    private static C3465ns f7648h;

    /* renamed from: i */
    private static C3535ps f7649i;

    /* renamed from: j */
    private static boolean f7650j;

    /* renamed from: k */
    private static long f7651k;

    /* renamed from: a */
    public static final C2984bt f7641a = new C2984bt();

    /* renamed from: c */
    private static final oo00o.OooO0OO f7643c = o0OOO0.OooO0oo(a.f7652a);

    /* renamed from: d */
    private static final String f7644d = "bt";

    /* renamed from: e */
    private static final C3129ft f7645e = new C3129ft();

    /* renamed from: f */
    private static final C3501ot f7646f = new C3501ot();

    /* renamed from: g */
    private static final List<InterfaceC3710ts> f7647g = new ArrayList();

    /* renamed from: com.ironsource.bt$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final a f7652a = new a();

        public a() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a */
        public final InterfaceC3254jf invoke() {
            return C3495on.f10667s.m11213d().mo8696v();
        }
    }

    /* renamed from: com.ironsource.bt$b */
    public static final class b implements InterfaceC3710ts {

        /* renamed from: a */
        final /* synthetic */ Context f7653a;

        public b(Context context) {
            this.f7653a = context;
        }

        /* renamed from: a */
        public static final void m8027a(Context applicationContext, C3465ns sdkConfig) {
            kotlin.jvm.internal.OooOo.OooO0o0(sdkConfig, "$sdkConfig");
            C2984bt c2984bt = C2984bt.f7641a;
            kotlin.jvm.internal.OooOo.OooO0Oo(applicationContext, "applicationContext");
            c2984bt.m8001a(applicationContext, sdkConfig);
        }

        /* renamed from: b */
        public static final void m8028b(C3535ps error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
            C2984bt.f7641a.m8006a(error);
        }

        @Override // com.ironsource.InterfaceC3710ts
        /* renamed from: a */
        public void mo8029a(C3465ns sdkConfig) {
            kotlin.jvm.internal.OooOo.OooO0o0(sdkConfig, "sdkConfig");
            C2984bt.f7645e.m8805a(new o00000O0(3, this.f7653a, sdkConfig));
        }

        @Override // com.ironsource.InterfaceC3710ts
        /* renamed from: a */
        public void mo8030a(C3535ps error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            C2984bt.f7645e.m8805a(new OooO(error, 1));
        }
    }

    private C2984bt() {
    }

    /* renamed from: b */
    private final EnumC3054dt m8012b() {
        return f7648h != null ? EnumC3054dt.INITIATED : f7649i != null ? EnumC3054dt.INIT_FAILED : f7650j ? EnumC3054dt.INIT_IN_PROGRESS : EnumC3054dt.NOT_INIT;
    }

    /* renamed from: c */
    private final InterfaceC3254jf m8018c() {
        return (InterfaceC3254jf) f7643c.getValue();
    }

    /* renamed from: d */
    private final void m8020d() {
        if (C3495on.f10667s.m11213d().mo8685d().mo11379g()) {
            C3053ds.m8391i().mo12605a(new C3899zb(EnumC2638ac.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* renamed from: f */
    public static final void m8021f() {
        f7641a.m8011a(true);
    }

    /* renamed from: e */
    public final void m8025e() {
        f7645e.m8813c(new OooOo0o.OooO(2));
    }

    /* renamed from: a */
    private final void m8000a(Context context, C3190hk c3190hk, C3571qt c3571qt) {
        c3190hk.m9152i(c3571qt.m11637f().m12443h());
        c3190hk.m9146c(c3571qt.m11637f().m12439d());
        C3891z3 c3891z3M12633b = c3571qt.m11635c().m12633b();
        kotlin.jvm.internal.OooOo.OooO0O0(c3891z3M12633b);
        c3190hk.m9137a(c3891z3M12633b.m13287a());
        c3190hk.m9147d(c3891z3M12633b.m13289c().m13009b());
        c3190hk.m9143b(c3891z3M12633b.m13297k().m9551b());
        c3190hk.m9136a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
        C3891z3 c3891z3M12633b2 = c3571qt.m11635c().m12633b();
        kotlin.jvm.internal.OooOo.OooO0O0(c3891z3M12633b2);
        c3190hk.m9140b(c3891z3M12633b2.m13292f().m9419b());
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m8013b(android.content.Context r14, com.ironsource.C3465ns r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C2984bt.m8013b(android.content.Context, com.ironsource.ns):void");
    }

    /* renamed from: c */
    public static final void m8019c(C3535ps error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        f7641a.m8006a(error);
    }

    /* renamed from: a */
    public final void m8001a(Context context, C3465ns c3465ns) {
        m8014b(c3465ns);
        C3243j4 c3243j4M11048a = c3465ns.m11048a();
        C3830xa c3830xa = C3830xa.f12596a;
        c3830xa.m13038c(c3243j4M11048a.m9424g());
        C3495on.b bVar = C3495on.f10667s;
        bVar.m11211a().mo8490x().mo11372a(c3243j4M11048a.m9420c());
        c3830xa.m13034a(c3243j4M11048a.m9423f());
        c3830xa.m13033a(c3243j4M11048a.m9427j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(c3243j4M11048a.m9425h());
        m8018c().mo9481a(c3243j4M11048a);
        C3129ft c3129ft = f7645e;
        m8000a(context, c3129ft.m8812c(), c3465ns.m11051d());
        c3129ft.m8800a(new Date().getTime() - f7651k, c3465ns.m11053f());
        C3711tt c3711tt = new C3711tt();
        f7642b = c3711tt;
        c3711tt.m12485a(m8018c());
        IronSourceUtils.saveLastResponse(context, c3465ns.m11051d().toString());
        bVar.m11213d().mo8698z().m12622c(true);
        C3805wj.m12898i().m12622c(true);
        C3053ds.m8391i().m12622c(true);
        C3300kq.f9270P.m12622c(true);
        m8013b(context, c3465ns);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(c3465ns.m11052e().m9358b());
        C2994c4 c2994c4M11049b = c3465ns.m11049b();
        if (c2994c4M11049b.m8088f()) {
            c3129ft.m8801a(c2994c4M11049b);
        }
        m8005a(c3465ns);
        new C3300kq.a().m9696a();
        m8020d();
    }

    /* renamed from: b */
    private final void m8014b(C3465ns c3465ns) {
        f7648h = c3465ns;
        m8011a(false);
    }

    /* renamed from: a */
    public final void m8022a(Context context, C3780vs initRequest, InterfaceC3710ts listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(initRequest, "initRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        f7645e.m8813c(new OooOo0O.OooO0O0(listener, context, initRequest, context.getApplicationContext(), 13));
    }

    /* renamed from: b */
    public final void m8024b(C3535ps error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        f7645e.m8813c(new OooO(error, 0));
    }

    /* renamed from: b */
    public static final void m8015b(InterfaceC3710ts listener, C3465ns sdkConfig) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "$listener");
        kotlin.jvm.internal.OooOo.OooO0o0(sdkConfig, "$sdkConfig");
        listener.mo8029a(sdkConfig);
    }

    /* renamed from: b */
    public static final void m8016b(InterfaceC3710ts listener, C3535ps error) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "$listener");
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        listener.mo8030a(error);
    }

    /* renamed from: a */
    public static /* synthetic */ void m8004a(C2984bt c2984bt, AbstractC3724u7 abstractC3724u7, C3139g4 c3139g4, Context context, C3571qt c3571qt, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        c2984bt.m8010a(abstractC3724u7, c3139g4, context, c3571qt, z);
    }

    /* renamed from: b */
    public static final void m8017b(C3814ws serverResponse) {
        kotlin.jvm.internal.OooOo.OooO0o0(serverResponse, "$serverResponse");
        C3465ns c3465ns = new C3465ns(serverResponse);
        C2984bt c2984bt = f7641a;
        c2984bt.m8014b(c3465ns);
        c2984bt.m8005a(c3465ns);
    }

    /* renamed from: a */
    private final void m8005a(C3465ns c3465ns) {
        Iterator<InterfaceC3710ts> it = f7647g.iterator();
        while (it.hasNext()) {
            m8008a(it.next(), c3465ns);
        }
        f7647g.clear();
    }

    /* renamed from: a */
    public final void m8006a(C3535ps c3535ps) {
        f7649i = c3535ps;
        m8011a(false);
        Iterator<InterfaceC3710ts> it = f7647g.iterator();
        while (it.hasNext()) {
            m8009a(it.next(), c3535ps);
        }
        f7647g.clear();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c3535ps, 1);
    }

    /* renamed from: a */
    public static final void m8007a(InterfaceC3710ts listener, Context context, C3780vs initRequest, Context context2) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "$listener");
        kotlin.jvm.internal.OooOo.OooO0o0(context, "$context");
        kotlin.jvm.internal.OooOo.OooO0o0(initRequest, "$initRequest");
        C3465ns c3465ns = f7648h;
        if (c3465ns != null) {
            f7641a.m8008a(listener, c3465ns);
            return;
        }
        f7647g.add(listener);
        if (f7650j) {
            return;
        }
        f7649i = null;
        f7641a.m8011a(true);
        f7651k = new Date().getTime();
        f7646f.m11239a(context, initRequest, f7645e, new b(context2));
    }

    /* renamed from: a */
    private final void m8008a(InterfaceC3710ts interfaceC3710ts, C3465ns c3465ns) {
        f7645e.m8817e(new OooO0O0(interfaceC3710ts, c3465ns, 0));
    }

    /* renamed from: a */
    private final void m8009a(InterfaceC3710ts interfaceC3710ts, C3535ps c3535ps) {
        f7645e.m8817e(new OooO0OO(interfaceC3710ts, c3535ps, 0));
    }

    /* renamed from: a */
    private final void m8010a(AbstractC3724u7 abstractC3724u7, C3139g4 c3139g4, Context context, C3571qt c3571qt, boolean z) {
        abstractC3724u7.mo12618b(z);
        abstractC3724u7.mo12609a(c3139g4.m8866c(), context);
        abstractC3724u7.mo12616b(c3139g4.m8867d(), context);
        abstractC3724u7.mo12615b(c3139g4.m8869f());
        abstractC3724u7.mo12600a(c3139g4.m8868e());
        abstractC3724u7.mo12621c(c3139g4.m8864a());
        abstractC3724u7.mo12623c(c3139g4.m8872i(), context);
        abstractC3724u7.mo12613a(c3139g4.m8871h(), context);
        abstractC3724u7.mo12619b(c3139g4.m8873j(), context);
        abstractC3724u7.mo12625d(c3139g4.m8870g(), context);
        C3891z3 c3891z3M12633b = c3571qt.m11635c().m12633b();
        kotlin.jvm.internal.OooOo.OooO0O0(c3891z3M12633b);
        abstractC3724u7.m12604a(c3891z3M12633b.m13296j());
        abstractC3724u7.mo12612a(c3139g4.m8874k());
        abstractC3724u7.mo12624d(c3139g4.m8865b());
    }

    /* renamed from: a */
    public final void m8023a(C3814ws serverResponse) {
        kotlin.jvm.internal.OooOo.OooO0o0(serverResponse, "serverResponse");
        f7645e.m8813c(new OooO0o(serverResponse, 0));
    }

    /* renamed from: a */
    private final void m8011a(boolean z) {
        f7650j = z;
        f7645e.m8802a(m8012b());
    }
}
