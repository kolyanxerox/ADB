package com.ironsource.mediationsdk;

import OooO0oO.OooOo;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.AbstractC3724u7;
import com.ironsource.C2937ah;
import com.ironsource.C2939aj;
import com.ironsource.C2943an;
import com.ironsource.C2964b9;
import com.ironsource.C2983bs;
import com.ironsource.C3014co;
import com.ironsource.C3053ds;
import com.ironsource.C3089eo;
import com.ironsource.C3094et;
import com.ironsource.C3096ev;
import com.ironsource.C3108f8;
import com.ironsource.C3127fr;
import com.ironsource.C3131fv;
import com.ironsource.C3136g1;
import com.ironsource.C3139g4;
import com.ironsource.C3141g6;
import com.ironsource.C3177h7;
import com.ironsource.C3190hk;
import com.ironsource.C3206i1;
import com.ironsource.C3236iw;
import com.ironsource.C3243j4;
import com.ironsource.C3270jv;
import com.ironsource.C3271jw;
import com.ironsource.C3300kq;
import com.ironsource.C3320lb;
import com.ironsource.C3359mb;
import com.ironsource.C3422mk;
import com.ironsource.C3453ng;
import com.ironsource.C3495on;
import com.ironsource.C3519pc;
import com.ironsource.C3526pj;
import com.ironsource.C3530pn;
import com.ironsource.C3551q9;
import com.ironsource.C3568qq;
import com.ironsource.C3571qt;
import com.ironsource.C3661se;
import com.ironsource.C3690t8;
import com.ironsource.C3705tn;
import com.ironsource.C3723u6;
import com.ironsource.C3725u8;
import com.ironsource.C3736uj;
import com.ironsource.C3805wj;
import com.ironsource.C3816wu;
import com.ironsource.C3830xa;
import com.ironsource.C3840xk;
import com.ironsource.C3872yi;
import com.ironsource.C3881yr;
import com.ironsource.C3899zb;
import com.ironsource.EnumC2638ac;
import com.ironsource.EnumC3054dt;
import com.ironsource.EnumC3745us;
import com.ironsource.InterfaceC3118fi;
import com.ironsource.InterfaceC3160gp;
import com.ironsource.InterfaceC3254jf;
import com.ironsource.InterfaceC3255jg;
import com.ironsource.InterfaceC3325lg;
import com.ironsource.InterfaceC3497op;
import com.ironsource.InterfaceC3622sa;
import com.ironsource.InterfaceC3692ta;
import com.ironsource.InterfaceC3733ug;
import com.ironsource.InterfaceC3767vf;
import com.ironsource.RunnableC3323le;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C3407s;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.adquality.C3365a;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.demandOnly.C3372c;
import com.ironsource.mediationsdk.demandOnly.C3375f;
import com.ironsource.mediationsdk.demandOnly.C3380k;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3377h;
import com.ironsource.mediationsdk.events.ISErrorListener;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.C3397b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.metadata.C3401a;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.IronSourceInterface;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.FeaturesManager;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.p */
/* loaded from: classes2.dex */
public class C3404p implements IronSourceInterface, InterfaceC3497op, InterfaceC3622sa, InterfaceC3622sa.b, InterfaceC3622sa.c, InterfaceC3622sa.a {

    /* renamed from: s0 */
    private static boolean f9964s0 = false;

    /* renamed from: A */
    private Set<IronSource.AD_UNIT> f9965A;

    /* renamed from: B */
    private boolean f9966B;

    /* renamed from: C */
    private IronSourceSegment f9967C;

    /* renamed from: D */
    private final String f9968D;

    /* renamed from: E */
    private int f9969E;

    /* renamed from: F */
    private boolean f9970F;

    /* renamed from: G */
    private boolean f9971G;

    /* renamed from: H */
    private boolean f9972H;

    /* renamed from: I */
    private boolean f9973I;

    /* renamed from: J */
    private boolean f9974J;

    /* renamed from: K */
    private boolean f9975K;

    /* renamed from: L */
    private boolean f9976L;

    /* renamed from: M */
    private Boolean f9977M;

    /* renamed from: N */
    private IronSourceBannerLayout f9978N;

    /* renamed from: O */
    private String f9979O;

    /* renamed from: P */
    private Boolean f9980P;

    /* renamed from: Q */
    private InterfaceC3325lg f9981Q;

    /* renamed from: R */
    private C3413w f9982R;

    /* renamed from: S */
    private C3526pj f9983S;

    /* renamed from: T */
    private C3881yr f9984T;

    /* renamed from: U */
    private C3141g6 f9985U;

    /* renamed from: V */
    private InitializationListener f9986V;

    /* renamed from: W */
    private InterfaceC3160gp f9987W;

    /* renamed from: X */
    private AtomicBoolean f9988X;

    /* renamed from: Y */
    private boolean f9989Y;

    /* renamed from: Z */
    private boolean f9990Z;

    /* renamed from: a */
    private final String f9991a;

    /* renamed from: a0 */
    private boolean f9992a0;

    /* renamed from: b */
    private final String f9993b;

    /* renamed from: b0 */
    private boolean f9994b0;

    /* renamed from: c */
    private final InterfaceC3767vf f9995c;

    /* renamed from: c0 */
    private boolean f9996c0;

    /* renamed from: d */
    private final InterfaceC3767vf.a f9997d;

    /* renamed from: d0 */
    private int f9998d0;

    /* renamed from: e */
    private final InterfaceC3255jg f9999e;

    /* renamed from: e0 */
    private final ConcurrentHashMap<String, InterfaceC3377h.d> f10000e0;

    /* renamed from: f */
    private final InterfaceC3254jf f10001f;

    /* renamed from: f0 */
    private final ConcurrentHashMap<String, InterfaceC3377h.b> f10002f0;

    /* renamed from: g */
    private final InterfaceC3118fi.a f10003g;

    /* renamed from: g0 */
    private final ConcurrentHashMap<String, InterfaceC3377h.d> f10004g0;

    /* renamed from: h */
    private IronSourceLoggerManager f10005h;

    /* renamed from: h0 */
    private C3375f f10006h0;

    /* renamed from: i */
    private C2943an f10007i;

    /* renamed from: i0 */
    private C3380k f10008i0;

    /* renamed from: j */
    private C3397b f10009j;

    /* renamed from: j0 */
    private C3372c f10010j0;

    /* renamed from: k */
    private AtomicBoolean f10011k;

    /* renamed from: k0 */
    private C3519pc f10012k0;

    /* renamed from: l */
    private final Object f10013l;

    /* renamed from: l0 */
    private C3190hk f10014l0;

    /* renamed from: m */
    private C3571qt f10015m;

    /* renamed from: m0 */
    private C3661se f10016m0;

    /* renamed from: n */
    private String f10017n;

    /* renamed from: n0 */
    private boolean f10018n0;

    /* renamed from: o */
    private String f10019o;

    /* renamed from: o0 */
    private AdQualityBridge f10020o0;

    /* renamed from: p */
    private String f10021p;

    /* renamed from: p0 */
    ISErrorListener f10022p0;

    /* renamed from: q */
    private String f10023q;

    /* renamed from: q0 */
    InterfaceC3733ug<ISDemandOnlyInterstitialListener> f10024q0;

    /* renamed from: r */
    private Map<String, String> f10025r;

    /* renamed from: r0 */
    InterfaceC3733ug<ISDemandOnlyRewardedVideoListener> f10026r0;

    /* renamed from: s */
    private String f10027s;

    /* renamed from: t */
    private AtomicBoolean f10028t;

    /* renamed from: u */
    private boolean f10029u;

    /* renamed from: v */
    private List<IronSource.AD_UNIT> f10030v;

    /* renamed from: w */
    private String f10031w;

    /* renamed from: x */
    private Context f10032x;

    /* renamed from: y */
    private Boolean f10033y;

    /* renamed from: z */
    private Set<IronSource.AD_UNIT> f10034z;

    /* renamed from: com.ironsource.mediationsdk.p$a */
    public class a implements ISErrorListener {
        public a() {
        }

        @Override // com.ironsource.mediationsdk.events.ISErrorListener
        public void onError(Throwable th) {
            IronLog.INTERNAL.error(th.getMessage());
        }
    }

    /* renamed from: com.ironsource.mediationsdk.p$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f10036a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10037b;

        /* renamed from: c */
        static final /* synthetic */ int[] f10038c;

        static {
            int[] iArr = new int[C3568qq.b.values().length];
            f10038c = iArr;
            try {
                iArr[C3568qq.b.CAPPED_PER_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10038c[C3568qq.b.CAPPED_PER_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10038c[C3568qq.b.CAPPED_PER_PACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10038c[C3568qq.b.NOT_CAPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C3407s.d.values().length];
            f10037b = iArr2;
            try {
                iArr2[C3407s.d.INIT_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10037b[C3407s.d.INIT_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[IronSource.AD_UNIT.values().length];
            f10036a = iArr3;
            try {
                iArr3[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10036a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10036a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10036a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.p$c */
    public interface c {
        /* renamed from: a */
        void mo10566a(String str);
    }

    /* renamed from: com.ironsource.mediationsdk.p$d */
    public static class d {

        /* renamed from: a */
        static volatile C3404p f10039a = new C3404p(null);

        private d() {
        }
    }

    private C3404p() {
        this(C3495on.m11199U().mo8686f(), C3495on.m11193O().mo8481b(), C3495on.m11199U().mo8682C(), C3495on.m11199U().mo8696v(), C3495on.m11193O().mo8487q());
    }

    /* renamed from: A */
    private synchronized boolean m10405A() {
        return this.f10029u;
    }

    /* renamed from: B */
    private boolean m10406B() {
        C3571qt c3571qt = this.f10015m;
        return (c3571qt == null || c3571qt.m11635c() == null || this.f10015m.m11635c().m12635d() == null) ? false : true;
    }

    /* renamed from: C */
    private boolean m10407C() {
        return m10406B() && m10408E();
    }

    /* renamed from: E */
    private boolean m10408E() {
        C3571qt c3571qt = this.f10015m;
        return (c3571qt == null || c3571qt.m11641j() == null || this.f10015m.m11641j().m8206b() == null || this.f10015m.m11641j().m8206b().size() <= 0) ? false : true;
    }

    /* renamed from: F */
    private boolean m10409F() {
        C3571qt c3571qt = this.f10015m;
        return (c3571qt == null || c3571qt.m11635c() == null || this.f10015m.m11635c().m12636e() == null) ? false : true;
    }

    /* renamed from: G */
    private boolean m10410G() {
        return m10409F() && m10411H();
    }

    /* renamed from: H */
    private boolean m10411H() {
        C3571qt c3571qt = this.f10015m;
        return (c3571qt == null || c3571qt.m11641j() == null || this.f10015m.m11641j().m8208c() == null || this.f10015m.m11641j().m8208c().isEmpty()) ? false : true;
    }

    /* renamed from: J */
    private boolean m10412J() {
        C3571qt c3571qt = this.f10015m;
        return (c3571qt == null || c3571qt.m11635c() == null || this.f10015m.m11635c().m12637f() == null) ? false : true;
    }

    /* renamed from: K */
    private boolean m10413K() {
        return m10412J() && m10414L();
    }

    /* renamed from: L */
    private boolean m10414L() {
        C3571qt c3571qt = this.f10015m;
        return (c3571qt == null || c3571qt.m11641j() == null || this.f10015m.m11641j().m8210d() == null || this.f10015m.m11641j().m8210d().size() <= 0) ? false : true;
    }

    /* renamed from: R */
    private void m10415R() {
        if (this.f9986V == null || !this.f9988X.compareAndSet(false, true)) {
            return;
        }
        IronLog.CALLBACK.verbose("onInitializationCompleted()");
        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
        this.f9986V.onInitializationComplete();
    }

    /* renamed from: T */
    private void m10416T() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapM13074c = C3840xk.m13069b().m13074c();
        if (concurrentHashMapM13074c.containsKey(C3401a.f9916c)) {
            if (TextUtils.isEmpty(concurrentHashMapM13074c.get(C3401a.f9916c).get(0))) {
                return;
            }
            C3830xa.f12596a.m13036b(!MetaDataUtils.getMetaDataBooleanValue(r0));
        }
    }

    /* renamed from: U */
    private void m10417U() throws JSONException {
        if (this.f9972H) {
            m10419W();
            return;
        }
        boolean zM11095h = this.f10015m.m11635c().m12634c().m12547d().m11095h();
        this.f9996c0 = zM11095h;
        if (zM11095h) {
            m10418V();
        } else {
            m10457c0();
        }
    }

    /* renamed from: V */
    private void m10418V() throws JSONException {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listM10428a = m10428a(this.f10015m.m11641j().m8204a());
        if (listM10428a.size() > 0) {
            this.f9985U = new C3141g6(listM10428a, this.f10015m.m11635c().m12634c(), IronSourceUtils.getUserIdForNetworks(), C3840xk.m13069b(), this.f9967C);
            m10476s();
        } else {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            m10439a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            m10429a(EnumC2638ac.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            m10433a(IronSource.AD_UNIT.BANNER, false);
        }
    }

    /* renamed from: W */
    private void m10419W() throws JSONException {
        this.f10005h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f10015m.m11641j().m8204a().size(); i++) {
            String str = this.f10015m.m11641j().m8204a().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f10015m.m11642k().m8546b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            m10439a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            m10429a(EnumC2638ac.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            m10433a(IronSource.AD_UNIT.BANNER, false);
            return;
        }
        synchronized (this.f10002f0) {
            try {
                C3723u6 c3723u6M12634c = this.f10015m.m11635c().m12634c();
                InterfaceC3692ta.a aVar = new InterfaceC3692ta.a("Mediation");
                if (c3723u6M12634c.m12554k()) {
                    aVar.m12418a("isOneFlow", 1);
                }
                this.f10010j0 = new C3372c(arrayList, c3723u6M12634c, m10554k(), m10555l(), new InterfaceC3692ta.b(C3805wj.m12898i(), aVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC3377h.b bVar : this.f10002f0.values()) {
            this.f10010j0.mo10160a(bVar.m10207g(), bVar.mo10203c());
        }
        this.f10002f0.clear();
    }

    /* renamed from: X */
    private void m10420X() throws JSONException {
        this.f10005h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f10015m.m11641j().m8206b().size(); i++) {
            String str = this.f10015m.m11641j().m8206b().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f10015m.m11642k().m8546b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            m10439a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            m10429a(EnumC2638ac.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            m10433a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        synchronized (this.f10000e0) {
            this.f10006h0 = m10424a((List<NetworkSettings>) arrayList);
        }
        Iterator<InterfaceC3377h.d> it = this.f10000e0.values().iterator();
        while (it.hasNext()) {
            this.f10006h0.mo10184a(it.next());
        }
        this.f10000e0.clear();
    }

    /* renamed from: Y */
    private void m10421Y() {
        this.f10005h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f10015m.m11641j().m8210d().size(); i++) {
            String str = this.f10015m.m11641j().m8210d().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f10015m.m11642k().m8546b(str));
            }
        }
        if (arrayList.isEmpty()) {
            m10433a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.f10004g0) {
            this.f10008i0 = m10446b(arrayList);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            m10433a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        Iterator<InterfaceC3377h.d> it = this.f10004g0.values().iterator();
        while (it.hasNext()) {
            this.f10008i0.mo10217a(it.next());
        }
        this.f10004g0.clear();
    }

    /* renamed from: Z */
    private void m10422Z() throws JSONException {
        if (this.f9971G) {
            m10420X();
        } else {
            m10445a0();
        }
    }

    /* renamed from: a */
    private int m10423a(C2983bs c2983bs) {
        return (this.f9992a0 || this.f9989Y || !c2983bs.m7994k().m11092e()) ? 1 : 2;
    }

    /* renamed from: a0 */
    private void m10445a0() throws JSONException {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listM10428a = m10428a(this.f10015m.m11641j().m8206b());
        if (listM10428a.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            m10439a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            m10429a(EnumC2638ac.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            m10433a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        C3526pj c3526pj = new C3526pj(listM10428a, this.f10015m.m11635c().m12635d(), IronSourceUtils.getUserIdForNetworks(), C3840xk.m13069b(), this.f9967C);
        this.f9983S = c3526pj;
        Boolean bool = this.f10033y;
        if (bool != null) {
            c3526pj.m11341a(this.f10032x, bool.booleanValue());
        }
        if (this.f9994b0) {
            this.f9994b0 = false;
            this.f9983S.m11336A();
        }
    }

    /* renamed from: b0 */
    private void m10453b0() throws JSONException {
        this.f10005h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
        List<NetworkSettings> listM10428a = m10428a(this.f10015m.m11641j().m8210d());
        if (listM10428a.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.f9998d0);
            m10439a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            m10447b(EnumC2638ac.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            m10433a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        C3405q c3405q = new C3405q(listM10428a, this.f10015m.m11635c().m12637f(), m10554k(), IronSourceUtils.getUserIdForNetworks(), C3840xk.m13069b().m13070a(), this.f9967C);
        this.f9981Q = c3405q;
        Boolean bool = this.f10033y;
        if (bool != null) {
            c3405q.shouldTrackNetworkState(this.f10032x, bool.booleanValue());
        }
    }

    /* renamed from: c0 */
    private void m10457c0() throws JSONException {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listM10428a = m10428a(this.f10015m.m11641j().m8204a());
        if (listM10428a.size() > 0) {
            this.f10005h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
            this.f9982R = new C3413w(listM10428a, new C3394k(m10554k(), IronSourceUtils.getUserIdForNetworks(), this.f10015m.m11635c().m12634c()), C3840xk.m13069b().m13070a(), this.f9967C);
            m10476s();
        } else {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            m10439a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            m10429a(EnumC2638ac.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            m10433a(IronSource.AD_UNIT.BANNER, false);
        }
    }

    /* renamed from: d0 */
    private void m10460d0() throws JSONException {
        if (this.f9970F) {
            m10421Y();
            return;
        }
        C2983bs c2983bsM12637f = this.f10015m.m11635c().m12637f();
        this.f9992a0 = c2983bsM12637f.m7994k().m11095h();
        this.f9998d0 = m10423a(c2983bsM12637f);
        if (this.f9989Y || this.f9992a0) {
            m10463e0();
        } else {
            m10453b0();
        }
    }

    /* renamed from: e0 */
    private void m10463e0() throws JSONException {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listM10428a = m10428a(this.f10015m.m11641j().m8210d());
        if (listM10428a.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.f9998d0);
            m10439a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            m10447b(EnumC2638ac.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            m10433a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        C3881yr c3881yr = new C3881yr(listM10428a, this.f10015m.m11635c().m12637f(), IronSourceUtils.getUserIdForNetworks(), this.f9989Y, C3840xk.m13069b(), this.f9967C);
        this.f9984T = c3881yr;
        Boolean bool = this.f10033y;
        if (bool != null) {
            c3881yr.m11341a(this.f10032x, bool.booleanValue());
        }
        if (this.f9990Z && this.f9989Y) {
            this.f9990Z = false;
            this.f9984T.m11336A();
        }
    }

    /* renamed from: f */
    private InterstitialPlacement m10464f() {
        C3736uj c3736ujM12635d = this.f10015m.m11635c().m12635d();
        if (c3736ujM12635d != null) {
            return c3736ujM12635d.m12682a();
        }
        return null;
    }

    /* renamed from: g */
    private C3177h7 m10465g(String str) {
        C3177h7 c3177h7M12543a;
        C3723u6 c3723u6M12634c = this.f10015m.m11635c().m12634c();
        return c3723u6M12634c == null ? new C3320lb() : (TextUtils.isEmpty(str) || (c3177h7M12543a = c3723u6M12634c.m12543a(str)) == null) ? c3723u6M12634c.m12552i() : c3177h7M12543a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0047  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.C3568qq.b m10467h(java.lang.String r5) {
        /*
            r4 = this;
            com.ironsource.qt r0 = r4.f10015m
            if (r0 == 0) goto L4c
            com.ironsource.u8 r0 = r0.m11635c()
            if (r0 == 0) goto L4c
            com.ironsource.qt r0 = r4.f10015m
            com.ironsource.u8 r0 = r0.m11635c()
            com.ironsource.uj r0 = r0.m12635d()
            if (r0 != 0) goto L17
            goto L4c
        L17:
            com.ironsource.mediationsdk.model.InterstitialPlacement r5 = r4.m10469i(r5)     // Catch: java.lang.Exception -> L30
            if (r5 != 0) goto L42
            com.ironsource.mediationsdk.model.InterstitialPlacement r5 = r4.m10464f()     // Catch: java.lang.Exception -> L2e
            if (r5 != 0) goto L42
            java.lang.String r0 = "Default placement was not found"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r4.f10005h     // Catch: java.lang.Exception -> L2e
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Exception -> L2e
            r3 = 3
            r1.log(r2, r0, r3)     // Catch: java.lang.Exception -> L2e
            goto L42
        L2e:
            r0 = move-exception
            goto L32
        L30:
            r0 = move-exception
            r5 = 0
        L32:
            com.ironsource.q9 r1 = com.ironsource.C3551q9.m11517d()
            r1.m11519a(r0)
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r0 = r0.toString()
            r1.error(r0)
        L42:
            if (r5 != 0) goto L47
            com.ironsource.qq$b r5 = com.ironsource.C3568qq.b.NOT_CAPPED
            return r5
        L47:
            com.ironsource.qq$b r5 = r4.m10493a(r5)
            return r5
        L4c:
            com.ironsource.qq$b r5 = com.ironsource.C3568qq.b.NOT_CAPPED
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3404p.m10467h(java.lang.String):com.ironsource.qq$b");
    }

    /* renamed from: i */
    private InterstitialPlacement m10469i(String str) {
        C3736uj c3736ujM12635d = this.f10015m.m11635c().m12635d();
        if (c3736ujM12635d != null) {
            return c3736ujM12635d.m12683a(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0047  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.C3568qq.b m10471k(java.lang.String r5) {
        /*
            r4 = this;
            com.ironsource.qt r0 = r4.f10015m
            if (r0 == 0) goto L4c
            com.ironsource.u8 r0 = r0.m11635c()
            if (r0 == 0) goto L4c
            com.ironsource.qt r0 = r4.f10015m
            com.ironsource.u8 r0 = r0.m11635c()
            com.ironsource.bs r0 = r0.m12637f()
            if (r0 != 0) goto L17
            goto L4c
        L17:
            com.ironsource.mediationsdk.model.Placement r5 = r4.m10472l(r5)     // Catch: java.lang.Exception -> L30
            if (r5 != 0) goto L42
            com.ironsource.mediationsdk.model.Placement r5 = r4.m10466g()     // Catch: java.lang.Exception -> L2e
            if (r5 != 0) goto L42
            java.lang.String r0 = "Default placement was not found"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r4.f10005h     // Catch: java.lang.Exception -> L2e
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Exception -> L2e
            r3 = 3
            r1.log(r2, r0, r3)     // Catch: java.lang.Exception -> L2e
            goto L42
        L2e:
            r0 = move-exception
            goto L32
        L30:
            r0 = move-exception
            r5 = 0
        L32:
            com.ironsource.q9 r1 = com.ironsource.C3551q9.m11517d()
            r1.m11519a(r0)
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r0 = r0.toString()
            r1.error(r0)
        L42:
            if (r5 != 0) goto L47
            com.ironsource.qq$b r5 = com.ironsource.C3568qq.b.NOT_CAPPED
            return r5
        L47:
            com.ironsource.qq$b r5 = r4.m10494a(r5)
            return r5
        L4c:
            com.ironsource.qq$b r5 = com.ironsource.C3568qq.b.NOT_CAPPED
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3404p.m10471k(java.lang.String):com.ironsource.qq$b");
    }

    /* renamed from: l */
    private Placement m10472l(String str) {
        C2983bs c2983bsM12637f = this.f10015m.m11635c().m12637f();
        if (c2983bsM12637f != null) {
            return c2983bsM12637f.m7983a(str);
        }
        return null;
    }

    /* renamed from: o */
    private synchronized InterfaceC3160gp m10473o() {
        return this.f9987W;
    }

    /* renamed from: r */
    private C3690t8 m10475r(String str) {
        IronSourceError ironSourceError;
        String str2;
        C3690t8 c3690t8 = new C3690t8();
        if (str != null) {
            if (m10444a(str, 5, 10)) {
                str2 = m10474q(str) ? "length should be between 5-10 characters" : "should contain only english characters and numbers";
                return c3690t8;
            }
            ironSourceError = ErrorBuilder.buildInvalidCredentialsError("appKey", str, str2);
        } else {
            ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, "Init Fail - appKey is missing");
        }
        c3690t8.m12402a(ironSourceError);
        return c3690t8;
    }

    /* renamed from: s */
    private void m10476s() {
        if (this.f9977M.booleanValue()) {
            IronLog.INTERNAL.verbose("load banner after init");
            this.f9977M = Boolean.FALSE;
            m10512a(this.f9978N, this.f9979O);
            this.f9978N = null;
            this.f9979O = null;
        }
    }

    /* renamed from: t */
    private void m10477t() {
        this.f10005h = IronSourceLoggerManager.getLogger(0);
        C3397b c3397b = new C3397b(null, 1);
        this.f10009j = c3397b;
        this.f10005h.addLogger(c3397b);
        this.f10007i = new C2943an();
    }

    /* renamed from: u */
    private boolean m10478u() {
        try {
            IronLog.INTERNAL.verbose("AdQuality SDK exist: ".concat(IronSourceAdQuality.class.getName()));
            return true;
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    /* renamed from: v */
    private boolean m10479v() {
        C3571qt c3571qt = this.f10015m;
        return (c3571qt == null || c3571qt.m11635c() == null || this.f10015m.m11635c().m12633b() == null || this.f10015m.m11635c().m12633b().m13288b() == null) ? false : true;
    }

    /* renamed from: w */
    private boolean m10480w() {
        C3571qt c3571qt = this.f10015m;
        return (c3571qt == null || c3571qt.m11635c() == null || this.f10015m.m11635c().m12634c() == null) ? false : true;
    }

    /* renamed from: x */
    private boolean m10481x() {
        return m10480w() && m10482y();
    }

    /* renamed from: y */
    private boolean m10482y() {
        C3571qt c3571qt = this.f10015m;
        return (c3571qt == null || c3571qt.m11641j() == null || this.f10015m.m11641j().m8204a() == null || this.f10015m.m11641j().m8204a().size() <= 0) ? false : true;
    }

    /* renamed from: D */
    public boolean m10483D() {
        boolean z;
        try {
            if (this.f9971G) {
                this.f10005h.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead", 3);
                return false;
            }
            C3526pj c3526pj = this.f9983S;
            boolean z2 = c3526pj != null && c3526pj.mo10960u();
            try {
                C3805wj.m12898i().mo12605a(new C3899zb(z2 ? EnumC2638ac.IS_CHECK_READY_TRUE : EnumC2638ac.IS_CHECK_READY_FALSE, IronSourceUtils.getMediationAdditionalData(false, true, 1)));
                this.f10005h.log(IronSourceLogger.IronSourceTag.API, "isInterstitialReady():" + z2, 1);
                return z2;
            } catch (Throwable th) {
                z = z2;
                th = th;
                C3551q9.m11517d().m11519a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.f10005h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isInterstitialReady():" + z, 1);
                this.f10005h.logException(ironSourceTag, "isInterstitialReady()", th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    /* renamed from: I */
    public boolean m10484I() {
        boolean z;
        boolean z2;
        try {
            if (this.f9970F) {
                this.f10005h.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead", 3);
                return false;
            }
            if (this.f9989Y || this.f9992a0) {
                C3881yr c3881yr = this.f9984T;
                z2 = c3881yr != null && c3881yr.mo10960u();
            } else {
                InterfaceC3325lg interfaceC3325lg = this.f9981Q;
                if (interfaceC3325lg != null && interfaceC3325lg.mo9784d()) {
                }
            }
            try {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                m10439a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f9998d0)}});
                C3053ds.m8391i().mo12605a(new C3899zb(z2 ? EnumC2638ac.RV_API_HAS_AVAILABILITY_TRUE : EnumC2638ac.RV_API_HAS_AVAILABILITY_FALSE, mediationAdditionalData));
                this.f10005h.log(IronSourceLogger.IronSourceTag.API, "isRewardedVideoAvailable():" + z2, 1);
                return z2;
            } catch (Throwable th) {
                z = z2;
                th = th;
                C3551q9.m11517d().m11519a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.f10005h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isRewardedVideoAvailable():" + z, 1);
                this.f10005h.logException(ironSourceTag, "isRewardedVideoAvailable()", th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    /* renamed from: M */
    public boolean m10485M() {
        return m10405A();
    }

    /* renamed from: N */
    public void m10486N() {
        C3402n c3402nM10397a;
        IronSource.AD_UNIT ad_unit;
        IronSourceError ironSourceErrorBuildInitFailedError;
        C3402n c3402nM10397a2;
        IronSource.AD_UNIT ad_unit2;
        IronSourceError ironSourceErrorBuildInitFailedError2;
        IronSourceLoggerManager ironSourceLoggerManager = this.f10005h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (this.f9971G) {
                this.f10005h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                c3402nM10397a2 = C3402n.m10397a();
                ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
                ironSourceErrorBuildInitFailedError2 = ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial");
            } else {
                if (this.f9974J) {
                    C3407s.d dVarM10668a = C3407s.m10647c().m10668a();
                    if (dVarM10668a == C3407s.d.INIT_FAILED) {
                        this.f10005h.log(ironSourceTag, "init() had failed", 3);
                        c3402nM10397a = C3402n.m10397a();
                        ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                        ironSourceErrorBuildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial");
                    } else {
                        if (dVarM10668a == C3407s.d.INIT_IN_PROGRESS) {
                            if (C3407s.m10647c().m10676d()) {
                                this.f10005h.log(ironSourceTag, "init() had failed", 3);
                                c3402nM10397a = C3402n.m10397a();
                                ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                                ironSourceErrorBuildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial");
                            }
                            this.f9994b0 = true;
                            return;
                        }
                        if (m10407C()) {
                            C3526pj c3526pj = this.f9983S;
                            if (c3526pj == null) {
                                this.f9994b0 = true;
                                return;
                            } else {
                                c3526pj.m11336A();
                                return;
                            }
                        }
                        this.f10005h.log(ironSourceTag, "No interstitial configurations found", 3);
                        c3402nM10397a = C3402n.m10397a();
                        ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                        ironSourceErrorBuildInitFailedError = ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial");
                    }
                    c3402nM10397a.m10402b(ad_unit, ironSourceErrorBuildInitFailedError);
                    return;
                }
                this.f10005h.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                c3402nM10397a2 = C3402n.m10397a();
                ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
                ironSourceErrorBuildInitFailedError2 = ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial");
            }
            c3402nM10397a2.m10402b(ad_unit2, ironSourceErrorBuildInitFailedError2);
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            this.f10005h.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(510, th.getMessage()));
        }
    }

    /* renamed from: O */
    public void m10487O() {
        C3402n c3402nM10397a;
        IronSource.AD_UNIT ad_unit;
        IronSourceError ironSourceErrorBuildInitFailedError;
        C3402n c3402nM10397a2;
        IronSource.AD_UNIT ad_unit2;
        IronSourceError ironSourceErrorBuildInitFailedError2;
        IronSourceLoggerManager ironSourceLoggerManager = this.f10005h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (this.f9970F) {
                this.f10005h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                c3402nM10397a2 = C3402n.m10397a();
                ad_unit2 = IronSource.AD_UNIT.REWARDED_VIDEO;
                ironSourceErrorBuildInitFailedError2 = ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            } else {
                if (!this.f9989Y && !this.f10018n0) {
                    this.f10005h.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
                    return;
                }
                if (this.f9973I) {
                    C3407s.d dVarM10668a = C3407s.m10647c().m10668a();
                    if (dVarM10668a == C3407s.d.INIT_FAILED) {
                        this.f10005h.log(ironSourceTag, "init() had failed", 3);
                        c3402nM10397a = C3402n.m10397a();
                        ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                        ironSourceErrorBuildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                    } else {
                        if (dVarM10668a == C3407s.d.INIT_IN_PROGRESS) {
                            if (C3407s.m10647c().m10676d()) {
                                this.f10005h.log(ironSourceTag, "init() had failed", 3);
                                c3402nM10397a = C3402n.m10397a();
                                ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                                ironSourceErrorBuildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                            }
                            this.f9990Z = true;
                            return;
                        }
                        if (m10413K()) {
                            C3881yr c3881yr = this.f9984T;
                            if (c3881yr == null) {
                                this.f9990Z = true;
                                return;
                            } else {
                                c3881yr.m11336A();
                                return;
                            }
                        }
                        this.f10005h.log(ironSourceTag, "No rewarded video configurations found", 3);
                        c3402nM10397a = C3402n.m10397a();
                        ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                        ironSourceErrorBuildInitFailedError = ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                    }
                    c3402nM10397a.m10402b(ad_unit, ironSourceErrorBuildInitFailedError);
                    return;
                }
                this.f10005h.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                c3402nM10397a2 = C3402n.m10397a();
                ad_unit2 = IronSource.AD_UNIT.REWARDED_VIDEO;
                ironSourceErrorBuildInitFailedError2 = ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            }
            c3402nM10397a2.m10402b(ad_unit2, ironSourceErrorBuildInitFailedError2);
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            this.f10005h.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.REWARDED_VIDEO, new IronSourceError(510, th.getMessage()));
        }
    }

    /* renamed from: P */
    public void m10488P() {
        C3526pj c3526pj = this.f9983S;
        if (c3526pj != null) {
            c3526pj.m11343a((C3270jv) null);
        }
        C3881yr c3881yr = this.f9984T;
        if (c3881yr != null) {
            c3881yr.m11343a((C3270jv) null);
        }
        C3141g6 c3141g6 = this.f9985U;
        if (c3141g6 != null) {
            c3141g6.m11343a((C3270jv) null);
        }
        this.f10018n0 = false;
    }

    /* renamed from: Q */
    public void m10489Q() {
        IronLog.API.info("removing all impression data listeners");
        C3840xk.m13069b().m13075d();
        InterfaceC3325lg interfaceC3325lg = this.f9981Q;
        if (interfaceC3325lg != null) {
            interfaceC3325lg.m9670c();
        }
        C3413w c3413w = this.f9982R;
        if (c3413w != null) {
            c3413w.m10393c();
        }
    }

    /* renamed from: S */
    public void m10490S() throws JSONException {
        if (f9964s0) {
            return;
        }
        f9964s0 = true;
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", "false");
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.FIRST_INSTANCE_RESULT, mediationAdditionalData));
    }

    /* renamed from: b */
    public IronSourceBannerLayout m10529b(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f10005h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.f10005h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    /* renamed from: c */
    public C3014co m10541c() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listM10428a = m10428a(this.f10015m.m11641j().m8208c());
        if (listM10428a.size() > 0) {
            return new C3014co(listM10428a, this.f10015m.m11635c().m12636e(), IronSourceUtils.getUserIdForNetworks(), C3840xk.m13069b(), this.f9967C);
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        m10439a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m10429a(EnumC2638ac.TROUBLESHOOTING_NT_INIT_FAILED, mediationAdditionalData);
        return null;
    }

    @Override // com.ironsource.mediationsdk.sdk.IronSourceInterface
    public void clearRewardedVideoServerParameters() {
        this.f10025r = null;
    }

    /* renamed from: d */
    public Boolean m10545d() {
        return this.f9980P;
    }

    /* renamed from: e */
    public C3571qt m10548e() {
        return this.f10015m;
    }

    @Override // com.ironsource.mediationsdk.sdk.IronSourceInterface
    public String getAdvertiserId(Context context) {
        String strMo4871p = this.f9995c.mo4871p(context);
        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.GET_ADVERTISING_ID, IronSourceUtils.getMediationAdditionalData(false)));
        return !TextUtils.isEmpty(strMo4871p) ? strMo4871p : "";
    }

    @Override // com.ironsource.mediationsdk.sdk.IronSourceInterface
    public InterstitialPlacement getInterstitialPlacementInfo(String str) {
        InterstitialPlacement interstitialPlacementM10469i;
        try {
            interstitialPlacementM10469i = m10469i(str);
            if (interstitialPlacementM10469i == null) {
                try {
                    this.f10005h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    interstitialPlacementM10469i = m10464f();
                } catch (Exception e) {
                    e = e;
                    C3551q9.m11517d().m11519a(e);
                    return interstitialPlacementM10469i;
                }
            }
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + interstitialPlacementM10469i, 1);
            return interstitialPlacementM10469i;
        } catch (Exception e2) {
            e = e2;
            interstitialPlacementM10469i = null;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.IronSourceInterface
    public Placement getRewardedVideoPlacementInfo(String str) {
        Placement placementM10472l;
        try {
            placementM10472l = m10472l(str);
            if (placementM10472l == null) {
                try {
                    this.f10005h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    placementM10472l = m10466g();
                } catch (Exception e) {
                    e = e;
                    C3551q9.m11517d().m11519a(e);
                    return placementM10472l;
                }
            }
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + placementM10472l, 1);
            return placementM10472l;
        } catch (Exception e2) {
            e = e2;
            placementM10472l = null;
        }
    }

    /* renamed from: j */
    public C3089eo m10553j(String str) {
        C3089eo c3089eoM12460a;
        C3705tn c3705tnM12636e = this.f10015m.m11635c().m12636e();
        if (c3705tnM12636e == null) {
            return null;
        }
        return (TextUtils.isEmpty(str) || (c3089eoM12460a = c3705tnM12636e.m12460a(str)) == null) ? c3705tnM12636e.m12475e() : c3089eoM12460a;
    }

    /* renamed from: m */
    public List<IronSource.AD_UNIT> m10556m() {
        ArrayList arrayList = new ArrayList();
        Set<IronSource.AD_UNIT> set = this.f10034z;
        if (set != null) {
            arrayList.addAll(set);
        }
        return arrayList;
    }

    /* renamed from: n */
    public String m10558n() {
        return this.f10027s;
    }

    /* renamed from: p */
    public Map<String, String> m10561p() {
        return this.f10025r;
    }

    /* renamed from: q */
    public IronSourceSegment m10563q() {
        return this.f9967C;
    }

    @Override // com.ironsource.mediationsdk.sdk.IronSourceInterface
    public void removeInterstitialListener() {
        this.f10005h.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        C2937ah.m7765a().m7795a((LevelPlayInterstitialListener) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.IronSourceInterface
    public void removeRewardedVideoListener() {
        this.f10005h.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        C3127fr.m8748a().m8781a((LevelPlayRewardedVideoBaseListener) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.IronSourceInterface
    public void setAdaptersDebug(boolean z) {
        C3367c.m10097b().m10115a(z);
    }

    @Override // com.ironsource.mediationsdk.sdk.IronSourceInterface
    public boolean setDynamicUserId(String str) {
        try {
            C3690t8 c3690t8 = new C3690t8();
            m10438a(str, c3690t8);
            if (!c3690t8.m12403b()) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, c3690t8.m12401a().toString(), 2);
                return false;
            }
            this.f10023q = str;
            C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.SET_USER_ID, IronSourceUtils.getJsonForUserId(true)));
            return true;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            this.f10005h.logException(IronSourceLogger.IronSourceTag.API, androidx.datastore.preferences.protobuf.OooO00o.OooOOO(new StringBuilder(), this.f9991a, ":setDynamicUserId(dynamicUserId:", str, ")"), e);
            return false;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.IronSourceInterface
    public void setMediationType(String str) {
        try {
            String str2 = this.f9991a + ":setMediationType(mediationType:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.f10005h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (!m10444a(str, 1, 64) || !m10474q(str)) {
                this.f10005h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.f10027s = str;
                this.f10014l0.m9149f(str);
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            this.f10005h.logException(IronSourceLogger.IronSourceTag.API, androidx.datastore.preferences.protobuf.OooO00o.OooOOO(new StringBuilder(), this.f9991a, ":setMediationType(mediationType:", str, ")"), e);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.IronSourceInterface
    public void setRewardedVideoServerParameters(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return;
                }
                this.f10005h.log(IronSourceLogger.IronSourceTag.API, this.f9991a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                this.f10025r = new HashMap(map);
                C3899zb c3899zb = new C3899zb(EnumC2638ac.SET_RV_SERVER_PARAMS, IronSourceUtils.getMediationAdditionalData(false));
                c3899zb.m13321a(IronSourceConstants.EVENTS_EXT1, map.toString());
                C3053ds.m8391i().mo12605a(c3899zb);
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                this.f10005h.logException(IronSourceLogger.IronSourceTag.API, this.f9991a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.IronSourceInterface
    public void shouldTrackNetworkState(Context context, boolean z) {
        this.f10032x = context;
        this.f10033y = Boolean.valueOf(z);
        C3526pj c3526pj = this.f9983S;
        if (c3526pj != null) {
            c3526pj.m11341a(context, z);
        }
        if (this.f9992a0) {
            C3881yr c3881yr = this.f9984T;
            if (c3881yr != null) {
                c3881yr.m11341a(context, z);
            }
        } else {
            InterfaceC3325lg interfaceC3325lg = this.f9981Q;
            if (interfaceC3325lg != null) {
                interfaceC3325lg.shouldTrackNetworkState(context, z);
            }
        }
        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.SHOULD_TRACK_NETWORK_STATE, IronSourceUtils.getMediationAdditionalData(false)));
    }

    /* renamed from: z */
    public boolean m10565z() {
        return this.f9970F || this.f9971G || this.f9972H;
    }

    public /* synthetic */ C3404p(a aVar) {
        this();
    }

    /* renamed from: b */
    private C3380k m10446b(List<NetworkSettings> list) {
        C2983bs c2983bsM12637f = this.f10015m.m11635c().m12637f();
        InterfaceC3692ta.a aVar = new InterfaceC3692ta.a("Mediation");
        if (c2983bsM12637f.m7987d()) {
            aVar.m12418a("isOneFlow", 1);
        }
        return new C3380k(list, c2983bsM12637f, C3367c.m10097b(), this.f10026r0, m10554k(), m10555l(), new InterfaceC3692ta.b(C3053ds.m8391i(), aVar));
    }

    /* renamed from: e */
    private void m10461e(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }

    /* renamed from: g */
    private Placement m10466g() {
        C2983bs c2983bsM12637f = this.f10015m.m11635c().m12637f();
        if (c2983bsM12637f != null) {
            return c2983bsM12637f.m7982a();
        }
        return null;
    }

    /* renamed from: h */
    private InterfaceC3692ta m10468h() {
        return new InterfaceC3692ta.b(C3053ds.m8391i(), new InterfaceC3692ta.a("IronSource"));
    }

    /* renamed from: j */
    public static C3404p m10470j() {
        return d.f10039a;
    }

    /* renamed from: q */
    private boolean m10474q(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    @Override // com.ironsource.InterfaceC3622sa.a
    /* renamed from: a */
    public ISDemandOnlyBannerLayout mo10491a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f10005h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.f10005h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    /* renamed from: c */
    public void m10542c(Activity activity) {
        C2937ah c2937ahM7765a;
        IronSourceError ironSourceError;
        IronSourceLoggerManager ironSourceLoggerManager = this.f10005h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (this.f9971G) {
                this.f10005h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C2937ah.m7765a().m7794a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
                return;
            }
            if (m10406B()) {
                InterstitialPlacement interstitialPlacementM10464f = m10464f();
                if (interstitialPlacementM10464f != null) {
                    m10543c(activity, interstitialPlacementM10464f.getPlacementName());
                    return;
                } else {
                    c2937ahM7765a = C2937ah.m7765a();
                    ironSourceError = new IronSourceError(1020, "showInterstitial error: empty default placement in response");
                }
            } else {
                c2937ahM7765a = C2937ah.m7765a();
                ironSourceError = ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial");
            }
            c2937ahM7765a.m7794a(ironSourceError, (AdInfo) null);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            this.f10005h.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e);
            C2937ah.m7765a().m7794a(new IronSourceError(510, e.getMessage()), (AdInfo) null);
        }
    }

    /* renamed from: d */
    public void m10546d(Activity activity) {
        if (!m10412J()) {
            C3127fr.m8748a().m8779a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            this.f10005h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement placementM10466g = m10466g();
        if (placementM10466g != null) {
            m10550f(activity, placementM10466g.getPlacementName());
            return;
        }
        this.f10005h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
        C3127fr.m8748a().m8779a(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
    }

    /* renamed from: f */
    public void m10550f(Activity activity, String str) {
        String strOooOO0O = OooOo.OooOO0O("showRewardedVideo(", str, ")");
        IronSourceLoggerManager ironSourceLoggerManager = this.f10005h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, strOooOO0O, 1);
        try {
            if (this.f9970F) {
                this.f10005h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                C3127fr.m8748a().m8779a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (m10412J()) {
                m10462e(activity, str);
            } else {
                C3127fr.m8748a().m8779a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            this.f10005h.logException(IronSourceLogger.IronSourceTag.API, strOooOO0O, e);
            C3127fr.m8748a().m8779a(new IronSourceError(510, e.getMessage()), (AdInfo) null);
        }
    }

    /* renamed from: i */
    public String m10552i() {
        return this.f10023q;
    }

    /* renamed from: k */
    public String m10554k() {
        return this.f10017n;
    }

    /* renamed from: l */
    public String m10555l() {
        return this.f10019o;
    }

    /* renamed from: m */
    public boolean m10557m(String str) {
        if (!m10480w()) {
            return false;
        }
        C3177h7 c3177h7M12543a = null;
        try {
            c3177h7M12543a = this.f10015m.m11635c().m12634c().m12543a(str);
            if (c3177h7M12543a == null && (c3177h7M12543a = this.f10015m.m11635c().m12634c().m12552i()) == null) {
                this.f10005h.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        if (c3177h7M12543a == null) {
            return false;
        }
        return m10527a(c3177h7M12543a);
    }

    /* renamed from: n */
    public boolean m10559n(String str) throws JSONException {
        if (this.f9971G) {
            return false;
        }
        boolean z = m10467h(str) != C3568qq.b.NOT_CAPPED;
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.f9971G, true, 1);
            try {
                mediationAdditionalData.put("placement", str);
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
            }
            C3805wj.m12898i().mo12605a(new C3899zb(EnumC2638ac.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0017  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m10560o(java.lang.String r4) throws org.json.JSONException {
        /*
            r3 = this;
            com.ironsource.qq$b r0 = r3.m10471k(r4)
            if (r0 == 0) goto L17
            int[] r1 = com.ironsource.mediationsdk.C3404p.b.f10038c
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L18
            r2 = 2
            if (r0 == r2) goto L18
            r2 = 3
            if (r0 == r2) goto L18
        L17:
            r1 = 0
        L18:
            r3.m10440a(r1, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3404p.m10560o(java.lang.String):boolean");
    }

    /* renamed from: p */
    public void m10562p(String str) {
        IronLog.API.verbose("userId = " + str);
        this.f10019o = str;
        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.SET_USER_ID, IronSourceUtils.getJsonForUserId(false)));
        AdQualityBridge adQualityBridge = this.f10020o0;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    /* renamed from: r */
    public String m10564r() {
        return this.f10031w;
    }

    public C3404p(InterfaceC3767vf interfaceC3767vf, InterfaceC3767vf.a aVar, InterfaceC3255jg interfaceC3255jg, InterfaceC3254jf interfaceC3254jf, InterfaceC3118fi.a aVar2) {
        this.f9991a = getClass().getName();
        this.f9993b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b8.10.0";
        this.f10013l = new Object();
        this.f10015m = null;
        this.f10017n = null;
        this.f10019o = "";
        this.f10021p = null;
        this.f10023q = null;
        this.f10025r = null;
        this.f10027s = null;
        this.f10029u = false;
        this.f10033y = null;
        this.f9966B = true;
        this.f9968D = "sessionDepth";
        this.f9980P = null;
        this.f10018n0 = false;
        this.f9995c = interfaceC3767vf;
        this.f9997d = aVar;
        this.f9999e = interfaceC3255jg;
        this.f10001f = interfaceC3254jf;
        this.f10003g = aVar2;
        m10477t();
        this.f10011k = new AtomicBoolean();
        this.f10034z = new HashSet();
        this.f9965A = new HashSet();
        this.f9971G = false;
        this.f9970F = false;
        this.f9972H = false;
        this.f10028t = new AtomicBoolean(true);
        this.f9988X = new AtomicBoolean(false);
        this.f9969E = 0;
        this.f9973I = false;
        this.f9974J = false;
        this.f9975K = false;
        this.f9976L = false;
        this.f10031w = IronSourceUtils.getSessionId();
        this.f9977M = Boolean.FALSE;
        this.f9994b0 = false;
        this.f9979O = null;
        this.f9981Q = null;
        this.f9986V = null;
        this.f9987W = null;
        this.f9982R = null;
        this.f9989Y = false;
        this.f10000e0 = new ConcurrentHashMap<>();
        this.f10004g0 = new ConcurrentHashMap<>();
        this.f10002f0 = new ConcurrentHashMap<>();
        this.f10006h0 = null;
        this.f10008i0 = null;
        this.f10010j0 = null;
        this.f9998d0 = 1;
        this.f10012k0 = new C3519pc();
        C3190hk c3190hk = new C3190hk();
        this.f10014l0 = c3190hk;
        this.f10016m0 = new C3661se(c3190hk);
        this.f10022p0 = new a();
        this.f10020o0 = null;
        this.f10024q0 = new InterfaceC3733ug.a();
        this.f10026r0 = new InterfaceC3733ug.b();
    }

    /* renamed from: a */
    private C3375f m10424a(List<NetworkSettings> list) {
        C3736uj c3736ujM12635d = this.f10015m.m11635c().m12635d();
        InterfaceC3692ta.a aVar = new InterfaceC3692ta.a("Mediation");
        if (c3736ujM12635d.m12693j()) {
            aVar.m12418a("isOneFlow", 1);
        }
        return new C3375f(list, c3736ujM12635d, C3367c.m10097b(), this.f10024q0, m10554k(), m10555l(), new InterfaceC3692ta.b(C3805wj.m12898i(), aVar));
    }

    /* renamed from: d */
    private void m10458d(Activity activity, String str) {
        try {
            InterstitialPlacement interstitialPlacementM10469i = m10469i(str);
            if (interstitialPlacementM10469i == null) {
                interstitialPlacementM10469i = m10464f();
            }
            if (interstitialPlacementM10469i == null) {
                this.f10005h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticInterstitial error: empty default placement in response", 3);
                C2937ah.m7765a().m7794a(new IronSourceError(1020, "showProgrammaticInterstitial error: empty default placement in response"), (AdInfo) null);
                return;
            }
            if (activity != null) {
                m10461e(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                this.f10005h.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showInterstitial when initializing SDK with context", 3);
                C2937ah.m7765a().m7794a(new IronSourceError(510, "Activity must be provided in showInterstitial when initializing SDK with context"), (AdInfo) null);
                return;
            }
            this.f9983S.m10959a(activity, new Placement(interstitialPlacementM10469i));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            this.f10005h.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticInterstitial()", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007a  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m10462e(android.app.Activity r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 3
            r1 = 0
            com.ironsource.mediationsdk.model.Placement r8 = r6.m10472l(r8)     // Catch: java.lang.Exception -> L29
            if (r8 != 0) goto Lf
            com.ironsource.mediationsdk.model.Placement r8 = r6.m10466g()     // Catch: java.lang.Exception -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L2b
        Lf:
            if (r8 != 0) goto L3b
            java.lang.String r2 = "showProgrammaticRewardedVideo error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f10005h     // Catch: java.lang.Exception -> Ld
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch: java.lang.Exception -> Ld
            r3.log(r4, r2, r0)     // Catch: java.lang.Exception -> Ld
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch: java.lang.Exception -> Ld
            r4 = 1021(0x3fd, float:1.431E-42)
            r3.<init>(r4, r2)     // Catch: java.lang.Exception -> Ld
            com.ironsource.fr r2 = com.ironsource.C3127fr.m8748a()     // Catch: java.lang.Exception -> Ld
            r2.m8779a(r3, r1)     // Catch: java.lang.Exception -> Ld
            return
        L29:
            r2 = move-exception
            r8 = r1
        L2b:
            com.ironsource.q9 r3 = com.ironsource.C3551q9.m11517d()
            r3.m11519a(r2)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f10005h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r5 = "showProgrammaticRewardedVideo()"
            r3.logException(r4, r5, r2)
        L3b:
            if (r7 == 0) goto L41
            r6.m10461e(r7)
            goto L62
        L41:
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()
            android.app.Activity r2 = r2.getCurrentActiveActivity()
            if (r2 != 0) goto L62
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f10005h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "Activity must be provided in showRewardedVideo when initializing SDK with context"
            r7.log(r8, r2, r0)
            com.ironsource.fr r7 = com.ironsource.C3127fr.m8748a()
            java.lang.String r8 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r2, r8)
            r7.m8779a(r8, r1)
            return
        L62:
            com.ironsource.yr r2 = r6.f9984T
            if (r2 == 0) goto L72
            boolean r3 = r6.f9989Y
            if (r3 != 0) goto L6e
            boolean r3 = r6.f9992a0
            if (r3 == 0) goto L72
        L6e:
            r2.m10959a(r7, r8)
            goto L91
        L72:
            com.ironsource.lg r2 = r6.f9981Q
            if (r2 == 0) goto L7a
            r2.mo9783a(r7, r8)
            goto L91
        L7a:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f10005h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"
            r7.log(r8, r2, r0)
            com.ironsource.mediationsdk.logger.IronSourceError r7 = new com.ironsource.mediationsdk.logger.IronSourceError
            r8 = 1023(0x3ff, float:1.434E-42)
            r7.<init>(r8, r2)
            com.ironsource.fr r8 = com.ironsource.C3127fr.m8748a()
            r8.m8779a(r7, r1)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3404p.m10462e(android.app.Activity, java.lang.String):void");
    }

    /* renamed from: b */
    public C3571qt m10530b(Context context, String str, c cVar) {
        synchronized (this.f10013l) {
            try {
                C3571qt c3571qt = this.f10015m;
                if (c3571qt != null) {
                    return new C3571qt(c3571qt);
                }
                C3571qt c3571qtM10426a = m10426a(context, str, cVar);
                if (c3571qtM10426a == null || !c3571qtM10426a.m11644p()) {
                    IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                    IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                    logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                    c3571qtM10426a = m10495a(context, m10554k());
                    if (c3571qtM10426a != null) {
                        IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(m10554k(), str);
                        this.f10005h.log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError.toString() + ": " + c3571qtM10426a.toString(), 1);
                        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.getMediationAdditionalData(false)));
                    }
                }
                if (c3571qtM10426a != null) {
                    this.f10015m = c3571qtM10426a;
                    IronSourceUtils.saveLastResponse(context, c3571qtM10426a.toString());
                    m10538b(this.f10015m, context);
                    C3805wj.m12898i().m12622c(true);
                    C3053ds.m8391i().m12622c(true);
                    C3300kq.f9270P.m12622c(true);
                    C3495on.m11199U().mo8698z().m12622c(true);
                }
                return c3571qtM10426a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public void m10543c(Activity activity, String str) {
        String strOooOO0O = OooOo.OooOO0O("showInterstitial(", str, ")");
        IronSourceLoggerManager ironSourceLoggerManager = this.f10005h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, strOooOO0O, 1);
        try {
            if (this.f9971G) {
                this.f10005h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C2937ah.m7765a().m7794a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (m10406B()) {
                m10458d(activity, str);
            } else {
                C2937ah.m7765a().m7794a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            this.f10005h.logException(IronSourceLogger.IronSourceTag.API, strOooOO0O, e);
            C2937ah.m7765a().m7794a(new IronSourceError(510, e.getMessage()), (AdInfo) null);
        }
    }

    /* renamed from: a */
    public synchronized IronSourceError m10492a(Context context, String str, boolean z, InitializationListener initializationListener, InterfaceC3160gp interfaceC3160gp, IronSource.AD_UNIT... ad_unitArr) {
        Throwable th;
        try {
            try {
                IronLog.INTERNAL.verbose("GitHash: 7a75ab7");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (!C3422mk.m10821a((Object) context, "Init Failed - provided context is null")) {
                mo10547d("Provided context is null");
                return new IronSourceError(IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, "Provided context is null");
            }
            this.f10003g.mo8702a(context);
            boolean z2 = context instanceof Activity;
            if (z2) {
                m10461e((Activity) context);
            }
            if (initializationListener != null) {
                this.f9986V = initializationListener;
            }
            AtomicBoolean atomicBoolean = this.f10028t;
            if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                if (ad_unitArr != null) {
                    m10442a(z2, z, interfaceC3160gp != null, ad_unitArr);
                    if (m10405A() && !z) {
                        m10415R();
                    }
                } else {
                    this.f10005h.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
                }
                EnumC3054dt enumC3054dtM8559b = C3094et.f8460a.m8559b();
                if (m10405A()) {
                    m10435a(this.f10015m);
                    return new IronSourceError(IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
                }
                if (enumC3054dtM8559b == EnumC3054dt.INIT_FAILED) {
                    return new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
                }
                if (enumC3054dtM8559b == EnumC3054dt.NOT_INIT) {
                    return new IronSourceError(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, "Already called new init");
                }
                if (interfaceC3160gp != null) {
                    m10430a(interfaceC3160gp);
                }
                return new IronSourceError(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
            }
            C3094et.f8460a.m8558a(interfaceC3160gp == null);
            if ((ad_unitArr == null || ad_unitArr.length == 0) && interfaceC3160gp == null) {
                for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                    this.f10034z.add(ad_unit);
                }
                this.f9973I = true;
                this.f9974J = true;
                this.f9975K = true;
                this.f9976L = true;
            } else {
                for (IronSource.AD_UNIT ad_unit2 : ad_unitArr) {
                    this.f10034z.add(ad_unit2);
                    this.f9965A.add(ad_unit2);
                    if (ad_unit2.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                        this.f9974J = true;
                    }
                    if (ad_unit2.equals(IronSource.AD_UNIT.BANNER)) {
                        this.f9975K = true;
                    }
                    if (ad_unit2.equals(IronSource.AD_UNIT.NATIVE_AD)) {
                        this.f9976L = true;
                    }
                    if (ad_unit2.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                        this.f9973I = true;
                    }
                }
            }
            IronLog.API.info("init(appKey:" + str + ")");
            C3690t8 c3690t8M10475r = m10475r(str);
            if (c3690t8M10475r.m12403b()) {
                this.f10017n = str;
            }
            C3571qt c3571qtM10495a = m10495a(context, this.f10017n);
            if (c3571qtM10495a != null) {
                IronLog.INTERNAL.verbose("init cache exists");
                m10431a(c3571qtM10495a.m11635c().m12633b().m13292f());
            } else {
                IronLog.INTERNAL.verbose("init cache does not exist");
            }
            ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
            this.f9997d.mo4838a(context.getApplicationContext(), TimeUnit.HOURS.toMillis(C3830xa.f12596a.m13040d()));
            this.f10014l0.m9150g(LevelPlay.getSdkVersion());
            this.f10014l0.m9134a(C3453ng.m10989a());
            this.f10014l0.m9144b(IronSourceUtils.isGooglePlayInstalled(context));
            this.f10014l0.m9131a(C3206i1.m9248a());
            m10416T();
            m10454c(context);
            if (this.f10017n == null) {
                C3407s.m10647c().m10677f();
                if (this.f10034z.contains(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                    C3127fr.m8748a().m8782a(false, (AdInfo) null);
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, c3690t8M10475r.m12401a().toString(), 1);
                return new IronSourceError(IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, "App key is null");
            }
            this.f10014l0.m9132a(context);
            this.f10014l0.m9146c(this.f10017n);
            this.f10014l0.m9151h(this.f10031w);
            if (this.f9966B) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z);
                if (ad_unitArr != null) {
                    for (IronSource.AD_UNIT ad_unit3 : ad_unitArr) {
                        try {
                            mediationAdditionalData.put(ad_unit3.toString(), true);
                        } catch (Exception e) {
                            C3551q9.m11517d().m11519a(e);
                        }
                    }
                }
                int i = this.f9969E + 1;
                this.f9969E = i;
                try {
                    m10441a(z2, z, i, mediationAdditionalData, interfaceC3160gp != null);
                    this.f9966B = false;
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    throw th;
                }
            }
            return null;
        } catch (Throwable th5) {
            th = th5;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x002a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m10531b() {
        /*
            r3 = this;
            boolean r0 = r3.f9976L
            if (r0 != 0) goto L7
            java.lang.String r0 = "init() must be called first"
            goto L2c
        L7:
            com.ironsource.mediationsdk.s r0 = com.ironsource.mediationsdk.C3407s.m10647c()
            int[] r1 = com.ironsource.mediationsdk.C3404p.b.f10037b
            com.ironsource.mediationsdk.s$d r2 = r0.m10668a()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L2a
            r2 = 2
            if (r1 == r2) goto L20
            java.lang.String r0 = ""
            goto L2c
        L20:
            boolean r0 = r0.m10676d()
            if (r0 == 0) goto L27
            goto L2a
        L27:
            java.lang.String r0 = "init() not finished yet"
            goto L2c
        L2a:
            java.lang.String r0 = "init() had failed"
        L2c:
            boolean r1 = r3.m10410G()
            if (r1 != 0) goto L3a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3a
            java.lang.String r0 = "No Native Ad configurations found"
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3404p.m10531b():java.lang.String");
    }

    @Override // com.ironsource.InterfaceC3497op
    /* renamed from: d */
    public void mo10547d(String str) {
        try {
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.f10007i != null) {
                Iterator<IronSource.AD_UNIT> it = this.f10034z.iterator();
                while (it.hasNext()) {
                    m10433a(it.next(), true);
                }
            }
            InterfaceC3160gp interfaceC3160gpM10473o = m10473o();
            if (interfaceC3160gpM10473o != null) {
                interfaceC3160gpM10473o.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x000f  */
    @Override // com.ironsource.InterfaceC3622sa.b
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean mo10549e(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.demandOnly.f r0 = r1.f10006h0     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            boolean r2 = r0.mo10186b(r2)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Ld:
            r2 = move-exception
            goto L12
        Lf:
            r2 = 0
        L10:
            monitor-exit(r1)
            return r2
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3404p.mo10549e(java.lang.String):boolean");
    }

    /* renamed from: a */
    private IronSourceError m10425a(C3407s.d dVar) {
        if (!this.f9975K) {
            return new IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.f9972H) {
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == C3407s.d.INIT_FAILED) {
            return new IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == C3407s.d.INIT_IN_PROGRESS && C3407s.m10647c().m10676d()) {
            return new IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    /* renamed from: d */
    private boolean m10459d(C3571qt c3571qt) {
        C3365a c3365aM12632a = c3571qt.m11635c().m12632a();
        return this.f10020o0 == null && c3365aM12632a != null && c3365aM12632a.m10047b() && AdQualityBridge.adQualityAvailable();
    }

    /* renamed from: b */
    public void m10532b(Activity activity) {
        IronLog ironLog = IronLog.API;
        ironLog.info("onResume()");
        try {
            if (FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                ironLog.info("onResume() is disabled");
            } else {
                ContextProvider.getInstance().onResume(activity);
            }
        } catch (Throwable th) {
            this.f10005h.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
            C3551q9.m11517d().m11519a(th);
        }
    }

    /* renamed from: a */
    public C3568qq.b m10493a(InterstitialPlacement interstitialPlacement) {
        return this.f9999e.mo9482a(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement, IronSource.AD_UNIT.INTERSTITIAL);
    }

    @Override // com.ironsource.InterfaceC3622sa.c
    /* renamed from: b */
    public synchronized void mo10533b(Activity activity, String str) {
        m10516a(new InterfaceC3377h.c().m10215b(str).m10210a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).m10211a(IronSource.AD_UNIT.REWARDED_VIDEO).m10216b(), this.f10026r0.mo12671a(str));
    }

    /* renamed from: a */
    public C3568qq.b m10494a(Placement placement) {
        return this.f9999e.mo9482a(ContextProvider.getInstance().getApplicationContext(), placement, IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    @Override // com.ironsource.InterfaceC3622sa.b
    /* renamed from: b */
    public synchronized void mo10534b(Activity activity, String str, String str2) {
        m10434a(new InterfaceC3377h.c().m10215b(str).m10210a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).m10211a(IronSource.AD_UNIT.INTERSTITIAL).m10214a(true).m10213a(str2).m10216b(), this.f10024q0.mo12671a(str));
    }

    /* renamed from: a */
    public C3571qt m10495a(Context context, String str) {
        if (!C2939aj.m7804a(context)) {
            return null;
        }
        C3108f8 c3108f8M7806c = C2939aj.m7806c(context);
        String strM8651d = c3108f8M7806c.m8651d();
        String strM8653f = c3108f8M7806c.m8653f();
        String strM8652e = c3108f8M7806c.m8652e();
        if (!strM8651d.equals(str)) {
            return null;
        }
        C3571qt c3571qt = new C3571qt(context, strM8651d, strM8653f, strM8652e);
        c3571qt.m11634a(C3571qt.a.CACHE);
        return c3571qt;
    }

    /* renamed from: b */
    public void m10535b(Context context) {
        C3096ev c3096ev = C3096ev.f8463a;
        c3096ev.m8565b();
        if (!m10405A()) {
            c3096ev.m8563a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        if (!m10456c(this.f10015m)) {
            c3096ev.m8563a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error("TestSuite cannot be launched, Please contact your account manager to enable it");
            return;
        }
        if (!IronSourceUtils.isNetworkConnected(context)) {
            c3096ev.m8563a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
            return;
        }
        C3526pj c3526pj = this.f9983S;
        if (c3526pj != null) {
            c3526pj.m11338J();
        }
        C3881yr c3881yr = this.f9984T;
        if (c3881yr != null) {
            c3881yr.m11338J();
        }
        C3141g6 c3141g6 = this.f9985U;
        if (c3141g6 != null) {
            c3141g6.m11338J();
            this.f9985U.m8893T();
        }
        new C3131fv().m8825a(context, m10554k(), this.f10015m.m11640i(), LevelPlay.getSdkVersion(), this.f10015m.m11635c().m12638g().m12722b(), m10545d(), this.f9989Y);
        this.f10018n0 = true;
        c3096ev.m8566c();
    }

    /* renamed from: a */
    private C3571qt m10426a(Context context, String str, c cVar) {
        Exception exc;
        C3571qt c3571qt = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String advertiserId = getAdvertiserId(context);
            if (TextUtils.isEmpty(advertiserId)) {
                advertiserId = this.f9995c.mo4832M(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = advertiserId;
            IronSourceSegment ironSourceSegment = this.f9967C;
            String strSendPostRequest = HttpFunctions.sendPostRequest(ServerURL.buildInitURL(context, m10554k(), str, str2, m10558n(), this.f9989Y, ironSourceSegment != null ? ironSourceSegment.getSegmentData() : null, m10565z()), C3872yi.m13204a().toString(), cVar);
            if (strSendPostRequest == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.isEncryptedResponse()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(strSendPostRequest);
                String strOptString = jSONObject.optString(C3571qt.f11099n, null);
                if (TextUtils.isEmpty(strOptString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                strSendPostRequest = m10427a(strOptString, Boolean.valueOf(jSONObject.optBoolean("compression", false)));
                if (TextUtils.isEmpty(strSendPostRequest)) {
                    ironLog.warning("encoded response invalid - return null");
                    m10490S();
                    return null;
                }
            }
            C3571qt c3571qt2 = new C3571qt(context, m10554k(), str, strSendPostRequest);
            try {
                c3571qt2.m11634a(C3571qt.a.SERVER);
                if (c3571qt2.m11644p()) {
                    return c3571qt2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e) {
                exc = e;
                c3571qt = c3571qt2;
                C3551q9.m11517d().m11519a(exc);
                IronLog.INTERNAL.warning("exception = " + exc);
                return c3571qt;
            }
        } catch (Exception e2) {
            exc = e2;
        }
    }

    /* renamed from: b */
    private void m10447b(EnumC2638ac enumC2638ac, JSONObject jSONObject) {
        C3053ds.m8391i().mo12605a(new C3899zb(enumC2638ac, jSONObject));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x000f  */
    @Override // com.ironsource.InterfaceC3622sa.c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean mo10551f(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.demandOnly.k r0 = r1.f10008i0     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            boolean r2 = r0.mo10218a(r2)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Ld:
            r2 = move-exception
            goto L12
        Lf:
            r2 = 0
        L10:
            monitor-exit(r1)
            return r2
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3404p.mo10551f(java.lang.String):boolean");
    }

    /* renamed from: b */
    private void m10448b(IronSource.AD_UNIT ad_unit) throws JSONException {
        int i = b.f10036a[ad_unit.ordinal()];
        if (i == 1) {
            m10460d0();
        } else if (i == 2) {
            m10422Z();
        } else {
            if (i != 3) {
                return;
            }
            m10417U();
        }
    }

    /* renamed from: c */
    private void m10454c(Context context) {
        AtomicBoolean atomicBoolean = this.f10011k;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        C3816wu.m12970a().m12971a(new RunnableC3323le(context));
        C3495on.m11199U().mo8698z().m12601a(context, this.f9967C);
        C3805wj.m12898i().m12601a(context, this.f9967C);
        C3053ds.m8391i().m12601a(context, this.f9967C);
        C3300kq.f9270P.m12601a(context, this.f9967C);
    }

    @Override // com.ironsource.InterfaceC3622sa
    /* renamed from: a */
    public String mo10496a(Context context) {
        String str;
        EnumC3054dt enumC3054dtM8556a;
        String strCompressAndEncrypt;
        C3271jw c3271jwM13297k;
        InterfaceC3692ta interfaceC3692taM10468h = m10468h();
        EnumC3054dt enumC3054dt = null;
        try {
            enumC3054dtM8556a = C3094et.f8460a.m8556a();
            try {
                interfaceC3692taM10468h.mo12415a(EnumC2638ac.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, enumC3054dtM8556a);
            } catch (Exception unused) {
                str = null;
                enumC3054dt = enumC3054dtM8556a;
                interfaceC3692taM10468h.mo12415a(EnumC2638ac.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, enumC3054dt);
                enumC3054dtM8556a = enumC3054dt;
                strCompressAndEncrypt = str;
                interfaceC3692taM10468h.mo12415a(EnumC2638ac.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, enumC3054dtM8556a);
                return strCompressAndEncrypt;
            }
        } catch (Exception unused2) {
            str = null;
        }
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            interfaceC3692taM10468h.mo12415a(EnumC2638ac.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (EnumC3054dt) null);
            return null;
        }
        if (enumC3054dtM8556a == EnumC3054dt.NOT_INIT) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            interfaceC3692taM10468h.mo12415a(EnumC2638ac.TROUBLESHOOTING_DO_GET_BIDDING_DATA_NO_INIT_RETURNED_NULL, (EnumC3054dt) null);
            return null;
        }
        C3407s.m10647c().m10678g();
        C3571qt c3571qt = this.f10015m;
        boolean zM9554e = (c3571qt == null || (c3271jwM13297k = c3571qt.m11635c().m12633b().m13297k()) == null) ? true : c3271jwM13297k.m9554e();
        this.f10014l0.m9141b(context);
        JSONObject jSONObjectM9398a = new C3236iw().m9398a(context);
        C3368d.m10127b().m10134a(jSONObjectM9398a, true);
        strCompressAndEncrypt = zM9554e ? IronSourceAES.compressAndEncrypt(jSONObjectM9398a.toString()) : IronSourceAES.encrypt(jSONObjectM9398a.toString());
        if (TextUtils.isEmpty(strCompressAndEncrypt)) {
            interfaceC3692taM10468h.mo12415a(EnumC2638ac.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, enumC3054dtM8556a);
        }
        interfaceC3692taM10468h.mo12415a(EnumC2638ac.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, enumC3054dtM8556a);
        return strCompressAndEncrypt;
    }

    /* renamed from: a */
    public String m10497a(String str, C3568qq.b bVar) {
        if (bVar == null) {
            return null;
        }
        int i = b.f10038c[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return OooOo.OooOO0O("placement ", str, " is capped");
        }
        return null;
    }

    /* renamed from: b */
    public void m10536b(IronSourceBannerLayout ironSourceBannerLayout) {
        m10512a(ironSourceBannerLayout, "");
    }

    @Override // com.ironsource.InterfaceC3622sa.a
    /* renamed from: c */
    public void mo10544c(String str) {
        this.f10005h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            C3372c c3372c = this.f10010j0;
            if (c3372c != null) {
                c3372c.mo10162a(str);
            }
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            this.f10005h.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    /* renamed from: c */
    private void m10455c(boolean z) {
        C3190hk c3190hk;
        EnumC3745us enumC3745us;
        if (z) {
            c3190hk = this.f10014l0;
            enumC3745us = EnumC3745us.EXTERNAL_MEDIATION_INIT;
        } else {
            c3190hk = this.f10014l0;
            enumC3745us = EnumC3745us.LEVEL_PLAY_INIT;
        }
        c3190hk.m9135a(enumC3745us);
    }

    @Override // com.ironsource.InterfaceC3595ri
    /* renamed from: b */
    public void mo10537b(ImpressionDataListener impressionDataListener) {
        if (C3422mk.m10821a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            C3840xk.m13069b().m13071a(impressionDataListener);
            InterfaceC3325lg interfaceC3325lg = this.f9981Q;
            if (interfaceC3325lg != null) {
                interfaceC3325lg.m9669b(impressionDataListener);
            }
            C3413w c3413w = this.f9982R;
            if (c3413w != null) {
                c3413w.m10392b(impressionDataListener);
            }
            IronLog.API.info("add impression data listener to ".concat(impressionDataListener.getClass().getSimpleName()));
        }
    }

    /* renamed from: b */
    private void m10449b(C3571qt c3571qt) {
        this.f10009j.setDebugLevel(c3571qt.m11635c().m12633b().m13294h().m10942b());
        this.f10005h.setLoggerDebugLevel("console", c3571qt.m11635c().m12633b().m13294h().m10941a());
    }

    /* renamed from: c */
    private boolean m10456c(C3571qt c3571qt) {
        return c3571qt != null && c3571qt.m11643o();
    }

    /* renamed from: b */
    public void m10538b(C3571qt c3571qt, Context context) {
        m10449b(c3571qt);
        m10436a(c3571qt, context);
    }

    @Override // com.ironsource.InterfaceC3622sa.b
    /* renamed from: b */
    public void mo10539b(String str) {
        IronSourceError ironSourceError;
        this.f10005h.log(IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerMo12671a = this.f10024q0.mo12671a(str);
        try {
            if (this.f9971G) {
                C3375f c3375f = this.f10006h0;
                if (c3375f != null) {
                    c3375f.mo10185a(str);
                    return;
                } else {
                    IronLog.API.error("Interstitial was not initiated");
                    ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was not initiated");
                }
            } else {
                IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was initialized in mediation mode. Use showInterstitial instead");
            }
            iSDemandOnlyInterstitialListenerMo12671a.onInterstitialAdShowFailed(str, ironSourceError);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.API.error(e.getMessage());
            if (iSDemandOnlyInterstitialListenerMo12671a != null) {
                iSDemandOnlyInterstitialListenerMo12671a.onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    /* renamed from: b */
    public void m10540b(String str, JSONObject jSONObject) {
        C3367c.m10097b().m10117b(new C3412v(str, jSONObject));
    }

    /* renamed from: a */
    private String m10427a(String str, Boolean bool) {
        return bool.booleanValue() ? IronSourceAES.decryptAndDecompress(C3359mb.m10015b().m10017c(), str) : IronSourceAES.decode(C3359mb.m10015b().m10017c(), str);
    }

    /* renamed from: b */
    private synchronized void m10450b(boolean z) {
        this.f10029u = z;
    }

    /* renamed from: b */
    private boolean m10451b(InterfaceC3377h.b bVar) {
        synchronized (this.f10002f0) {
            try {
                if (this.f10010j0 != null) {
                    return false;
                }
                this.f10002f0.put(bVar.mo10203c(), bVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public HashSet<String> m10498a(String str, String str2) {
        C3571qt c3571qt = this.f10015m;
        return c3571qt == null ? new HashSet<>() : c3571qt.m11642k().m8542a(str, str2);
    }

    /* renamed from: b */
    private boolean m10452b(List<IronSource.AD_UNIT> list, boolean z, C3725u8 c3725u8) throws JSONException {
        IronLog.INTERNAL.verbose();
        try {
            this.f10009j.m10383a(c3725u8.m12633b().m13294h().m10944d());
            this.f10030v = list;
            m10450b(true);
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e) {
                    C3551q9.m11517d().m11519a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
                C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.FIRST_INSTANCE_RESULT, mediationAdditionalData));
            }
            int iM9419b = c3725u8.m12633b().m13292f().m9419b();
            if (iM9419b >= 0) {
                C2964b9 c2964b9 = new C2964b9();
                c2964b9.m7890a(iM9419b);
                c2964b9.m7891a(iM9419b, this.f10015m.m11642k().m8549d());
            }
            C3805wj.m12898i().m12628h();
            C3053ds.m8391i().m12628h();
            C3495on.m11199U().mo8698z().m12628h();
            C3367c.m10097b().m10118b(m10554k(), m10555l());
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.f10034z.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        m10448b(ad_unit);
                    } else {
                        m10433a(ad_unit, false);
                    }
                }
            }
            m10415R();
            InterfaceC3160gp interfaceC3160gpM10473o = m10473o();
            if (interfaceC3160gpM10473o != null) {
                interfaceC3160gpM10473o.mo8226a(this.f10015m);
            }
            return true;
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            IronLog.INTERNAL.error(e2.toString());
            InterfaceC3160gp interfaceC3160gpM10473o2 = m10473o();
            if (interfaceC3160gpM10473o2 != null) {
                interfaceC3160gpM10473o2.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0046 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:69:0x0001, B:71:0x0009, B:89:0x0046, B:91:0x004a, B:93:0x0054, B:95:0x0058, B:96:0x005c, B:98:0x0064, B:99:0x0067, B:101:0x006f, B:103:0x0073, B:104:0x0077, B:106:0x007f, B:107:0x0082, B:109:0x008a, B:111:0x008e, B:112:0x0092, B:114:0x009a, B:115:0x009d, B:117:0x00a2, B:119:0x00a6, B:120:0x00ac, B:77:0x0012, B:79:0x0016, B:81:0x0023, B:83:0x0027, B:85:0x0034, B:87:0x0038, B:88:0x003e, B:84:0x002d, B:80:0x001c), top: B:125:0x0001 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.ironsource.mediationsdk.IronSource.AD_UNIT> m10499a(android.content.Context r5, java.lang.String r6, boolean r7, com.ironsource.mediationsdk.IronSource.AD_UNIT... r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld
            r6.<init>()     // Catch: java.lang.Throwable -> Ld
            r0 = 1
            if (r8 == 0) goto L10
            int r1 = r8.length     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L46
            goto L10
        Ld:
            r5 = move-exception
            goto Lb9
        L10:
            if (r7 == 0) goto L46
            boolean r7 = r4.f9973I     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L1c
            com.ironsource.mediationsdk.IronSource$AD_UNIT r7 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch: java.lang.Throwable -> Ld
            r4.m10432a(r7)     // Catch: java.lang.Throwable -> Ld
            goto L23
        L1c:
            r4.f9970F = r0     // Catch: java.lang.Throwable -> Ld
            com.ironsource.mediationsdk.IronSource$AD_UNIT r7 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch: java.lang.Throwable -> Ld
            r6.add(r7)     // Catch: java.lang.Throwable -> Ld
        L23:
            boolean r7 = r4.f9974J     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L2d
            com.ironsource.mediationsdk.IronSource$AD_UNIT r7 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch: java.lang.Throwable -> Ld
            r4.m10432a(r7)     // Catch: java.lang.Throwable -> Ld
            goto L34
        L2d:
            r4.f9971G = r0     // Catch: java.lang.Throwable -> Ld
            com.ironsource.mediationsdk.IronSource$AD_UNIT r7 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch: java.lang.Throwable -> Ld
            r6.add(r7)     // Catch: java.lang.Throwable -> Ld
        L34:
            boolean r7 = r4.f9975K     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L3e
            com.ironsource.mediationsdk.IronSource$AD_UNIT r7 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch: java.lang.Throwable -> Ld
            r4.m10432a(r7)     // Catch: java.lang.Throwable -> Ld
            goto La0
        L3e:
            r4.f9972H = r0     // Catch: java.lang.Throwable -> Ld
            com.ironsource.mediationsdk.IronSource$AD_UNIT r7 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch: java.lang.Throwable -> Ld
            r6.add(r7)     // Catch: java.lang.Throwable -> Ld
            goto La0
        L46:
            int r7 = r8.length     // Catch: java.lang.Throwable -> Ld
            r1 = 0
        L48:
            if (r1 >= r7) goto La0
            r2 = r8[r1]     // Catch: java.lang.Throwable -> Ld
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L67
            boolean r3 = r4.f9974J     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L5c
            r4.m10432a(r2)     // Catch: java.lang.Throwable -> Ld
            goto L67
        L5c:
            r4.f9971G = r0     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r6.contains(r2)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L67
            r6.add(r2)     // Catch: java.lang.Throwable -> Ld
        L67:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L82
            boolean r3 = r4.f9973I     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L77
            r4.m10432a(r2)     // Catch: java.lang.Throwable -> Ld
            goto L82
        L77:
            r4.f9970F = r0     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r6.contains(r2)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L82
            r6.add(r2)     // Catch: java.lang.Throwable -> Ld
        L82:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L9d
            boolean r3 = r4.f9975K     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L92
            r4.m10432a(r2)     // Catch: java.lang.Throwable -> Ld
            goto L9d
        L92:
            r4.f9972H = r0     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r6.contains(r2)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L9d
            r6.add(r2)     // Catch: java.lang.Throwable -> Ld
        L9d:
            int r1 = r1 + 1
            goto L48
        La0:
            if (r5 == 0) goto Lb7
            boolean r7 = r5 instanceof android.app.Activity     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto Lac
            r7 = r5
            android.app.Activity r7 = (android.app.Activity) r7     // Catch: java.lang.Throwable -> Ld
            r4.m10461e(r7)     // Catch: java.lang.Throwable -> Ld
        Lac:
            com.ironsource.environment.ContextProvider r7 = com.ironsource.environment.ContextProvider.getInstance()     // Catch: java.lang.Throwable -> Ld
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> Ld
            r7.updateAppContext(r5)     // Catch: java.lang.Throwable -> Ld
        Lb7:
            monitor-exit(r4)
            return r6
        Lb9:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3404p.m10499a(android.content.Context, java.lang.String, boolean, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):java.util.List");
    }

    /* renamed from: a */
    private List<NetworkSettings> m10428a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.f10015m.m11642k().m8546b(str));
            }
        }
        return arrayList2;
    }

    @Override // com.ironsource.InterfaceC3497op
    /* renamed from: a */
    public void mo10500a() {
        if (this.f9977M.booleanValue()) {
            this.f9977M = Boolean.FALSE;
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION, "init() had failed"));
            this.f9978N = null;
            this.f9979O = null;
        }
        if (this.f9994b0) {
            this.f9994b0 = false;
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.f9990Z) {
            this.f9990Z = false;
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.f10000e0) {
            try {
                Iterator<InterfaceC3377h.d> it = this.f10000e0.values().iterator();
                while (it.hasNext()) {
                    String strMo10203c = it.next().mo10203c();
                    this.f10024q0.mo12671a(strMo10203c).onInterstitialAdLoadFailed(strMo10203c, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                }
                this.f10000e0.clear();
            } finally {
            }
        }
        synchronized (this.f10004g0) {
            try {
                Iterator<InterfaceC3377h.d> it2 = this.f10004g0.values().iterator();
                while (it2.hasNext()) {
                    String strMo10203c2 = it2.next().mo10203c();
                    this.f10026r0.mo12671a(strMo10203c2).onRewardedVideoAdLoadFailed(strMo10203c2, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.f10004g0.clear();
            } finally {
            }
        }
        synchronized (this.f10002f0) {
            try {
                for (InterfaceC3377h.b bVar : this.f10002f0.values()) {
                    ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutM10207g = bVar.m10207g();
                    if (iSDemandOnlyBannerLayoutM10207g != null) {
                        iSDemandOnlyBannerLayoutM10207g.getListener().m11832a(bVar.mo10203c(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                    }
                }
                this.f10002f0.clear();
            } finally {
            }
        }
    }

    /* renamed from: a */
    public void m10501a(long j, C3571qt.a aVar) throws JSONException {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(m10565z());
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, j);
            mediationAdditionalData.put("sessionDepth", this.f9969E);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, aVar.m11645a());
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.INIT_COMPLETE, mediationAdditionalData));
    }

    /* renamed from: a */
    public void m10502a(Activity activity) {
        try {
            if (FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                return;
            }
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            this.f10005h.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    @Override // com.ironsource.InterfaceC3622sa.a
    /* renamed from: a */
    public synchronized void mo10503a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        InterfaceC3377h.b bVarM10208a = new InterfaceC3377h.c().m10215b(str).m10209a(activity).m10212a(iSDemandOnlyBannerLayout).m10211a(IronSource.AD_UNIT.BANNER).m10208a();
        IronSourceError ironSourceErrorMo10205a = bVarM10208a.mo10205a();
        if (ironSourceErrorMo10205a != null) {
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorMo10205a.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().m11832a(str, ironSourceErrorMo10205a);
            }
            return;
        }
        IronSourceError ironSourceErrorM10425a = m10425a(C3407s.m10647c().m10668a());
        if (ironSourceErrorM10425a != null) {
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorM10425a.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().m11832a(str, ironSourceErrorM10425a);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (m10443a(bVarM10208a)) {
            return;
        }
        if (!m10481x()) {
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().m11832a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (m10451b(bVarM10208a)) {
                return;
            }
            this.f10010j0.mo10160a(iSDemandOnlyBannerLayout, str);
        }
    }

    @Override // com.ironsource.InterfaceC3622sa.a
    /* renamed from: a */
    public synchronized void mo10504a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        InterfaceC3377h.b bVarM10208a = new InterfaceC3377h.c().m10215b(str).m10209a(activity).m10214a(true).m10213a(str2).m10212a(iSDemandOnlyBannerLayout).m10211a(IronSource.AD_UNIT.BANNER).m10208a();
        IronSourceError ironSourceErrorMo10205a = bVarM10208a.mo10205a();
        if (ironSourceErrorMo10205a != null) {
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorMo10205a.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().m11832a(str, ironSourceErrorMo10205a);
            }
            return;
        }
        IronSourceError ironSourceErrorM10425a = m10425a(C3407s.m10647c().m10668a());
        if (ironSourceErrorM10425a != null) {
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorM10425a.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().m11832a(str, ironSourceErrorM10425a);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (m10443a(bVarM10208a)) {
            return;
        }
        if (!m10481x()) {
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().m11832a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (m10451b(bVarM10208a)) {
                return;
            }
            this.f10010j0.mo10161a(iSDemandOnlyBannerLayout, str, str2);
        }
    }

    @Override // com.ironsource.InterfaceC3622sa.b
    /* renamed from: a */
    public synchronized void mo10505a(Activity activity, String str) {
        m10434a(new InterfaceC3377h.c().m10215b(str).m10210a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).m10211a(IronSource.AD_UNIT.INTERSTITIAL).m10216b(), this.f10024q0.mo12671a(str));
    }

    @Override // com.ironsource.InterfaceC3622sa.c
    /* renamed from: a */
    public synchronized void mo10506a(Activity activity, String str, String str2) {
        m10516a(new InterfaceC3377h.c().m10215b(str).m10213a(str2).m10210a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).m10214a(true).m10211a(IronSource.AD_UNIT.REWARDED_VIDEO).m10216b(), this.f10026r0.mo12671a(str));
    }

    /* renamed from: a */
    public synchronized void m10507a(Context context, String str, boolean z, InitializationListener initializationListener, IronSource.AD_UNIT... ad_unitArr) {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            m10455c(z);
            if (m10492a(context, str, z, initializationListener, null, ad_unitArr) == null) {
                C3407s.m10647c().m10672a(this);
                C3407s.m10647c().m10672a(this.f10012k0);
                C3407s.m10647c().m10670a(context, str, this.f10019o, ad_unitArr);
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.ironsource.InterfaceC3622sa
    /* renamed from: a */
    public synchronized void mo10508a(Context context, String str, IronSource.AD_UNIT... ad_unitArr) {
        try {
            try {
                List<IronSource.AD_UNIT> listM10499a = m10499a(context, str, true, ad_unitArr);
                if (!listM10499a.isEmpty()) {
                    m10507a(context, str, true, (InitializationListener) null, (IronSource.AD_UNIT[]) listM10499a.toArray(new IronSource.AD_UNIT[listM10499a.size()]));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* renamed from: a */
    private void m10429a(EnumC2638ac enumC2638ac, JSONObject jSONObject) {
        C3805wj.m12898i().mo12605a(new C3899zb(enumC2638ac, jSONObject));
    }

    /* renamed from: a */
    private synchronized void m10430a(InterfaceC3160gp interfaceC3160gp) {
        this.f9987W = interfaceC3160gp;
    }

    /* renamed from: a */
    private void m10431a(C3243j4 c3243j4) {
        C3830xa c3830xa = C3830xa.f12596a;
        c3830xa.m13038c(c3243j4.m9424g());
        c3830xa.m13034a(c3243j4.m9423f());
        c3830xa.m13033a(c3243j4.m9427j());
        this.f10001f.mo9481a(c3243j4);
    }

    /* renamed from: a */
    private void m10432a(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f10005h.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    /* renamed from: a */
    public void m10509a(IronSource.AD_UNIT ad_unit, C3270jv c3270jv) {
        C3141g6 c3141g6;
        C3881yr c3881yr;
        C3526pj c3526pj;
        if (this.f10018n0) {
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL && (c3526pj = this.f9983S) != null) {
                c3526pj.m11343a(c3270jv);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO && (c3881yr = this.f9984T) != null) {
                c3881yr.m11343a(c3270jv);
            }
            if (ad_unit != IronSource.AD_UNIT.BANNER || (c3141g6 = this.f9985U) == null) {
                return;
            }
            c3141g6.m11343a(c3270jv);
        }
    }

    /* renamed from: a */
    public void m10510a(IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) {
        if (ad_unit == null) {
            IronLog.API.error("AdUnit should not be null.");
            return;
        }
        IronLog.API.info(OooOo.OooOO0o("(", ad_unit.name(), ", ", waterfallConfiguration == null ? "NULL" : waterfallConfiguration.toString(), ")"));
        C3899zb c3899zb = new C3899zb(EnumC2638ac.SET_WATERFALL_CONFIGURATION, IronSourceUtils.getMediationAdditionalData(false));
        c3899zb.m13321a(IronSourceConstants.EVENTS_EXT1, waterfallConfiguration == null ? "" : waterfallConfiguration.toJsonString());
        C3495on.m11199U().mo8698z().m12606a(c3899zb, ad_unit);
        this.f10014l0.m9133a(ad_unit, waterfallConfiguration);
    }

    /* renamed from: a */
    private void m10433a(IronSource.AD_UNIT ad_unit, boolean z) {
        int i = b.f10036a[ad_unit.ordinal()];
        if (i == 1) {
            if (this.f9970F) {
                Iterator<InterfaceC3377h.d> it = this.f10004g0.values().iterator();
                while (it.hasNext()) {
                    String strMo10203c = it.next().mo10203c();
                    this.f10026r0.mo12671a(strMo10203c).onRewardedVideoAdLoadFailed(strMo10203c, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.f10004g0.clear();
                return;
            }
            if (this.f9989Y) {
                if (this.f9990Z) {
                    this.f9990Z = false;
                    C3402n.m10397a().m10402b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                return;
            }
            if (z || m10412J() || this.f9965A.contains(ad_unit)) {
                C3127fr.m8748a().m8782a(false, (AdInfo) null);
                return;
            }
            return;
        }
        if (i == 2) {
            if (!this.f9971G) {
                if (this.f9994b0) {
                    this.f9994b0 = false;
                    C3402n.m10397a().m10402b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
                return;
            }
            Iterator<InterfaceC3377h.d> it2 = this.f10000e0.values().iterator();
            while (it2.hasNext()) {
                String strMo10203c2 = it2.next().mo10203c();
                this.f10024q0.mo12671a(strMo10203c2).onInterstitialAdLoadFailed(strMo10203c2, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
            }
            this.f10000e0.clear();
            return;
        }
        if (i != 3) {
            return;
        }
        if (!this.f9972H) {
            if (this.f9977M.booleanValue()) {
                this.f9977M = Boolean.FALSE;
                C3402n.m10397a().m10402b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD, "init() had failed"));
                this.f9978N = null;
                this.f9979O = null;
                return;
            }
            return;
        }
        for (InterfaceC3377h.b bVar : this.f10002f0.values()) {
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutM10207g = bVar.m10207g();
            if (iSDemandOnlyBannerLayoutM10207g != null) {
                iSDemandOnlyBannerLayoutM10207g.getListener().m11832a(bVar.mo10203c(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
            }
        }
        this.f10002f0.clear();
    }

    /* renamed from: a */
    public void m10511a(IronSourceBannerLayout ironSourceBannerLayout) {
        C3141g6 c3141g6;
        this.f10005h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (this.f9996c0 && (c3141g6 = this.f9985U) != null) {
                c3141g6.m8898a(ironSourceBannerLayout);
                return;
            }
            C3413w c3413w = this.f9982R;
            if (c3413w != null) {
                c3413w.m10760a(ironSourceBannerLayout);
            }
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            this.f10005h.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    /* renamed from: a */
    public void m10512a(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        IronLog.INTERNAL.verbose("placementName = " + str);
        if (this.f9972H) {
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", 3);
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildInitFailedError("Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", "Banner"));
            return;
        }
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            String strConcat = "loadBanner can't be called - ".concat(ironSourceBannerLayout == null ? "banner layout is null " : "banner layout is destroyed");
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, strConcat, 3);
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError(strConcat));
            return;
        }
        if (!this.f9975K) {
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"));
            return;
        }
        if (ironSourceBannerLayout.getSize().getDescription().equals(C3395l.f9871f) && (ironSourceBannerLayout.getSize().getWidth() <= 0 || ironSourceBannerLayout.getSize().getHeight() <= 0)) {
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.BANNER, ErrorBuilder.unsupportedBannerSize(""));
            return;
        }
        C3407s.d dVarM10668a = C3407s.m10647c().m10668a();
        if (dVarM10668a == C3407s.d.INIT_FAILED) {
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.BANNER, new IronSourceError(600, "Init() had failed"));
            return;
        }
        if (dVarM10668a == C3407s.d.INIT_IN_PROGRESS) {
            if (C3407s.m10647c().m10676d()) {
                this.f10005h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                C3402n.m10397a().m10402b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, "Init() had failed"));
                return;
            } else {
                this.f9978N = ironSourceBannerLayout;
                this.f9977M = Boolean.TRUE;
                this.f9979O = str;
                return;
            }
        }
        if (!m10481x()) {
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "the server response does not contain banner data"));
            return;
        }
        C3413w c3413w = this.f9982R;
        if (c3413w == null && this.f9985U == null) {
            this.f9978N = ironSourceBannerLayout;
            this.f9977M = Boolean.TRUE;
            this.f9979O = str;
        } else if (this.f9996c0) {
            this.f9985U.m8899a(ironSourceBannerLayout, new Placement(m10465g(str)));
        } else {
            c3413w.m10761a(ironSourceBannerLayout, m10465g(str));
        }
    }

    /* renamed from: a */
    public void m10513a(IronSourceSegment ironSourceSegment) {
        this.f9967C = ironSourceSegment;
        C3881yr c3881yr = this.f9984T;
        if (c3881yr != null) {
            c3881yr.m11344a(ironSourceSegment);
        }
        InterfaceC3325lg interfaceC3325lg = this.f9981Q;
        if (interfaceC3325lg != null) {
            interfaceC3325lg.m9667a(ironSourceSegment);
        }
        C3526pj c3526pj = this.f9983S;
        if (c3526pj != null) {
            c3526pj.m11344a(ironSourceSegment);
        }
        C3413w c3413w = this.f9982R;
        if (c3413w != null) {
            c3413w.m10388a(ironSourceSegment);
        }
        C3141g6 c3141g6 = this.f9985U;
        if (c3141g6 != null) {
            c3141g6.m11344a(ironSourceSegment);
        }
        AdQualityBridge adQualityBridge = this.f10020o0;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(ironSourceSegment);
        }
        C3805wj.m12898i().m12602a(this.f9967C);
        C3053ds.m8391i().m12602a(this.f9967C);
        C3300kq.f9270P.m12602a(this.f9967C);
        C3495on.m11199U().mo8698z().m12602a(this.f9967C);
    }

    @Override // com.ironsource.InterfaceC3622sa.b
    /* renamed from: a */
    public void mo10514a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.f10024q0.mo12672a((InterfaceC3733ug<ISDemandOnlyInterstitialListener>) iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.InterfaceC3622sa.c
    /* renamed from: a */
    public void mo10515a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.f10026r0.mo12672a((InterfaceC3733ug<ISDemandOnlyRewardedVideoListener>) iSDemandOnlyRewardedVideoListener);
    }

    /* renamed from: a */
    private synchronized void m10434a(InterfaceC3377h.d dVar, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        String strMo10203c = dVar.mo10203c();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strMo10203c);
        try {
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo10203c, new IronSourceError(510, th.getMessage()));
        }
        if (!this.f9974J) {
            ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo10203c, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
            return;
        }
        if (!this.f9971G) {
            ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo10203c, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
            return;
        }
        C3407s.d dVarM10668a = C3407s.m10647c().m10668a();
        if (dVarM10668a == C3407s.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo10203c, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            return;
        }
        IronSourceError ironSourceErrorMo10205a = dVar.mo10205a();
        if (ironSourceErrorMo10205a != null) {
            if (ironSourceErrorMo10205a.getErrorCode() == 1060) {
                m10447b(EnumC2638ac.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.mo10202b()), 1));
            }
            ironLog.error(ironSourceErrorMo10205a.toString());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo10203c, ironSourceErrorMo10205a);
            return;
        }
        m10461e(dVar.mo9399e());
        if (dVarM10668a == C3407s.d.INIT_IN_PROGRESS) {
            if (C3407s.m10647c().m10676d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo10203c, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            } else {
                synchronized (this.f10000e0) {
                    this.f10000e0.put(dVar.mo10203c(), dVar);
                }
                if (!TextUtils.isEmpty(dVar.mo10203c())) {
                    m10429a(EnumC2638ac.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.mo10202b()), 1));
                }
            }
            return;
        }
        if (!m10407C()) {
            ironLog.error("No interstitial configurations found");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo10203c, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
            return;
        }
        synchronized (this.f10000e0) {
            try {
                C3375f c3375f = this.f10006h0;
                if (c3375f != null) {
                    c3375f.mo10184a(dVar);
                    return;
                }
                this.f10000e0.put(dVar.mo10203c(), dVar);
                if (!TextUtils.isEmpty(dVar.mo10202b())) {
                    m10429a(EnumC2638ac.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.mo10202b()), 1));
                }
                return;
            } finally {
            }
        }
    }

    /* renamed from: a */
    public void m10516a(InterfaceC3377h.d dVar, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        String strMo10203c = dVar.mo10203c();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strMo10203c);
        try {
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo10203c, new IronSourceError(510, th.getMessage()));
        }
        if (!this.f9973I) {
            ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo10203c, new IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
            return;
        }
        if (!this.f9970F) {
            ironLog.error("Rewarded video was initialized in mediation mode");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo10203c, new IronSourceError(510, "Rewarded video was initialized in mediation mode"));
            return;
        }
        C3407s.d dVarM10668a = C3407s.m10647c().m10668a();
        if (dVarM10668a == C3407s.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo10203c, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronSourceError ironSourceErrorMo10205a = dVar.mo10205a();
        if (ironSourceErrorMo10205a != null) {
            if (ironSourceErrorMo10205a.getErrorCode() == 1060) {
                m10447b(EnumC2638ac.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.mo10202b()), 1));
            }
            ironLog.error(ironSourceErrorMo10205a.toString());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo10203c, ironSourceErrorMo10205a);
            return;
        }
        m10461e(dVar.mo9399e());
        if (dVarM10668a == C3407s.d.INIT_IN_PROGRESS) {
            if (C3407s.m10647c().m10676d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo10203c, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.f10004g0) {
                this.f10004g0.put(strMo10203c, dVar);
            }
            if (TextUtils.isEmpty(dVar.mo10202b())) {
                return;
            }
            m10447b(EnumC2638ac.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.mo10202b()), 1));
            return;
        }
        if (!m10413K()) {
            ironLog.error("No rewarded video configurations found");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo10203c, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        synchronized (this.f10004g0) {
            try {
                C3380k c3380k = this.f10008i0;
                if (c3380k != null) {
                    c3380k.mo10217a(dVar);
                    return;
                }
                this.f10004g0.put(strMo10203c, dVar);
                if (!TextUtils.isEmpty(dVar.mo10202b())) {
                    m10447b(EnumC2638ac.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.mo10202b()), 1));
                }
                return;
            } finally {
            }
        }
        C3551q9.m11517d().m11519a(th);
        IronLog.API.error(th.getMessage());
        iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo10203c, new IronSourceError(510, th.getMessage()));
    }

    @Override // com.ironsource.InterfaceC3595ri
    /* renamed from: a */
    public void mo10517a(ImpressionDataListener impressionDataListener) {
        if (C3422mk.m10821a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            C3840xk.m13069b().m13073b(impressionDataListener);
            InterfaceC3325lg interfaceC3325lg = this.f9981Q;
            if (interfaceC3325lg != null) {
                interfaceC3325lg.m9668a(impressionDataListener);
            }
            C3413w c3413w = this.f9982R;
            if (c3413w != null) {
                c3413w.m10390a(impressionDataListener);
            }
        }
    }

    @Override // com.ironsource.InterfaceC3297kn
    /* renamed from: a */
    public void mo9692a(LogListener logListener) {
        if (logListener == null) {
            this.f10005h.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        this.f10009j.m10382a(logListener);
        this.f10005h.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.SET_LOG_LISTENER, IronSourceUtils.getMediationAdditionalData(false)));
    }

    /* renamed from: a */
    public void m10518a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        IronLog.API.info();
        C2937ah.m7765a().m7795a(levelPlayInterstitialListener);
    }

    /* renamed from: a */
    public void m10519a(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        IronLog.API.info();
        C3127fr.m8748a().m8781a(levelPlayRewardedVideoListener);
    }

    /* renamed from: a */
    public synchronized void m10520a(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        String str;
        try {
            IronLog ironLog = IronLog.API;
            ironLog.info();
            if (!this.f9973I) {
                if (levelPlayRewardedVideoManualListener == null) {
                    this.f9989Y = false;
                    str = "Disabling rewarded video manual mode";
                } else {
                    this.f9989Y = true;
                    str = "Enabling rewarded video manual mode";
                }
                ironLog.info(str);
            }
            C3127fr.m8748a().m8781a(levelPlayRewardedVideoManualListener);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public void m10521a(SegmentListener segmentListener) {
        C2943an c2943an = this.f10007i;
        if (c2943an != null) {
            c2943an.m7824a(segmentListener);
            C3407s.m10647c().m10671a(this.f10007i);
        }
    }

    /* renamed from: a */
    private void m10435a(C3571qt c3571qt) {
        if (m10478u() && m10459d(c3571qt)) {
            AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), m10554k(), m10555l(), new C3136g1(), c3571qt.m11635c().m12633b().m13294h().m10941a());
            this.f10020o0 = adQualityBridge;
            IronSourceSegment ironSourceSegment = this.f9967C;
            if (ironSourceSegment != null) {
                adQualityBridge.setSegment(ironSourceSegment);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m10436a(com.ironsource.C3571qt r14, android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3404p.m10436a(com.ironsource.qt, android.content.Context):void");
    }

    /* renamed from: a */
    private void m10437a(AbstractC3724u7 abstractC3724u7, C3139g4 c3139g4, Context context, C3571qt c3571qt, boolean z) {
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
        abstractC3724u7.m12604a(c3571qt.m11635c().m12633b().m13296j());
        abstractC3724u7.mo12612a(c3139g4.m8874k());
        abstractC3724u7.mo12624d(c3139g4.m8865b());
    }

    @Override // com.ironsource.InterfaceC3622sa.c
    /* renamed from: a */
    public synchronized void mo10522a(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + str);
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerMo12671a = this.f10026r0.mo12671a(str);
        try {
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.API.error(e.getMessage());
            if (iSDemandOnlyRewardedVideoListenerMo12671a != null) {
                iSDemandOnlyRewardedVideoListenerMo12671a.onRewardedVideoAdShowFailed(str, new IronSourceError(510, e.getMessage()));
            }
        }
        if (!this.f9970F) {
            ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
            iSDemandOnlyRewardedVideoListenerMo12671a.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
            return;
        }
        C3380k c3380k = this.f10008i0;
        if (c3380k != null) {
            c3380k.mo10219b(str);
        } else {
            ironLog.error("Rewarded video was not initiated");
            iSDemandOnlyRewardedVideoListenerMo12671a.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
        }
    }

    /* renamed from: a */
    private void m10438a(String str, C3690t8 c3690t8) {
        if (m10444a(str, 1, 128)) {
            return;
        }
        c3690t8.m12402a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    /* renamed from: a */
    public void m10523a(String str, List<String> list) {
        String strCheckMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String strCheckMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (strCheckMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataKeyValidity);
            return;
        }
        if (strCheckMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataValueValidity);
            return;
        }
        MetaData metaData = MetaDataUtils.formatMetaData(str, list);
        String metaDataKey = metaData.getMetaDataKey();
        List<String> metaDataValue = metaData.getMetaDataValue();
        if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            C3367c.m10097b().m10121c(metaDataKey, metaDataValue);
        } else if (m10405A() && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
            IronLog.API.error("setMetaData with key = " + metaDataKey + " must to be called before init");
        } else {
            C3840xk.m13069b().m13072a(metaDataKey, metaDataValue);
        }
        try {
            ConcurrentHashMap<String, List<String>> concurrentHashMapM10122d = C3367c.m10097b().m10122d();
            concurrentHashMapM10122d.putAll(C3840xk.m13069b().m13074c());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : concurrentHashMapM10122d.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.f10016m0.m12273a(jSONObject);
            this.f10014l0.m9138a(jSONObject);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("got the following error " + e.getMessage());
        }
        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(m10405A() ? EnumC2638ac.SET_META_DATA_AFTER_INIT : EnumC2638ac.SET_META_DATA, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
    }

    /* renamed from: a */
    public void m10524a(String str, JSONObject jSONObject) {
        if (C3422mk.m10821a((Object) jSONObject, "setAdRevenueData - impressionData is null") && C3422mk.m10821a((Object) str, "setAdRevenueData - dataSource is null")) {
            this.f10012k0.m11381a(str, jSONObject);
        }
    }

    @Override // com.ironsource.InterfaceC3497op
    /* renamed from: a */
    public void mo10525a(List<IronSource.AD_UNIT> list, boolean z, C3725u8 c3725u8) throws JSONException {
        m10435a(this.f10015m);
        m10452b(list, z, c3725u8);
    }

    /* renamed from: a */
    private void m10439a(JSONObject jSONObject, Object[][] objArr) throws JSONException {
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e), 3);
            }
        }
    }

    /* renamed from: a */
    public void m10526a(boolean z) {
        this.f9980P = Boolean.valueOf(z);
        C3367c.m10097b().m10119b(z);
        this.f10014l0.m9139a(z);
        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(z ? EnumC2638ac.CONSENT_TRUE_CODE : EnumC2638ac.CONSENT_FALSE_CODE, IronSourceUtils.getMediationAdditionalData(false)));
    }

    /* renamed from: a */
    private void m10440a(boolean z, String str) throws JSONException {
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.f9970F, true, this.f9998d0);
            if (str != null) {
                m10439a(mediationAdditionalData, new Object[][]{new Object[]{"placement", str}});
            }
            m10447b(EnumC2638ac.RV_API_IS_CAPPED_TRUE, mediationAdditionalData);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0059  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m10441a(boolean r6, boolean r7, int r8, org.json.JSONObject r9, boolean r10) throws org.json.JSONException {
        /*
            r5 = this;
            java.lang.String r0 = ",cachedUserAgent="
            java.lang.String r1 = ",Activity="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26
            r2.<init>()     // Catch: java.lang.Exception -> L26
            r3 = 1
            if (r7 == 0) goto L28
            com.ironsource.environment.ContextProvider r6 = com.ironsource.environment.ContextProvider.getInstance()     // Catch: java.lang.Exception -> L26
            android.app.Activity r6 = r6.getCurrentActiveActivity()     // Catch: java.lang.Exception -> L26
            if (r6 == 0) goto L18
            r6 = r3
            goto L19
        L18:
            r6 = 0
        L19:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26
            r4.<init>(r1)     // Catch: java.lang.Exception -> L26
            r4.append(r6)     // Catch: java.lang.Exception -> L26
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Exception -> L26
            goto L31
        L26:
            r6 = move-exception
            goto L64
        L28:
            if (r6 != 0) goto L34
            java.lang.String r6 = ","
            r2.append(r6)     // Catch: java.lang.Exception -> L26
            java.lang.String r6 = "init_context_flow"
        L31:
            r2.append(r6)     // Catch: java.lang.Exception -> L26
        L34:
            com.ironsource.vf r6 = r5.f9995c     // Catch: java.lang.Exception -> L26
            boolean r6 = r6.mo4875r()     // Catch: java.lang.Exception -> L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26
            r1.<init>(r0)     // Catch: java.lang.Exception -> L26
            r1.append(r6)     // Catch: java.lang.Exception -> L26
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> L26
            r2.append(r6)     // Catch: java.lang.Exception -> L26
            java.lang.String r6 = "ext1"
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L26
            r9.put(r6, r0)     // Catch: java.lang.Exception -> L26
            java.lang.String r6 = "sessionDepth"
            r9.put(r6, r8)     // Catch: java.lang.Exception -> L26
            if (r10 == 0) goto L74
            if (r7 == 0) goto L5e
            java.lang.String r6 = "isMultipleAdObjects"
            goto L60
        L5e:
            java.lang.String r6 = "isMultipleAdUnits"
        L60:
            r9.put(r6, r3)     // Catch: java.lang.Exception -> L26
            goto L74
        L64:
            com.ironsource.q9 r7 = com.ironsource.C3551q9.m11517d()
            r7.m11519a(r6)
            com.ironsource.mediationsdk.logger.IronLog r7 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r6 = r6.toString()
            r7.error(r6)
        L74:
            com.ironsource.zb r6 = new com.ironsource.zb
            com.ironsource.ac r7 = com.ironsource.EnumC2638ac.FIRST_INSTANCE
            r6.<init>(r7, r9)
            com.ironsource.fg r7 = com.ironsource.C3495on.m11199U()
            com.ironsource.u3 r7 = r7.mo8698z()
            r7.mo12605a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3404p.m10441a(boolean, boolean, int, org.json.JSONObject, boolean):void");
    }

    /* renamed from: a */
    private synchronized void m10442a(boolean z, boolean z2, boolean z3, IronSource.AD_UNIT... ad_unitArr) throws Throwable {
        Throwable th;
        JSONObject mediationAdditionalData;
        try {
            try {
                int i = 0;
                for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
                    try {
                        if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                            this.f9974J = true;
                        } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                            this.f9975K = true;
                        } else if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                            this.f9973I = true;
                        } else if (ad_unit.equals(IronSource.AD_UNIT.NATIVE_AD)) {
                            this.f9976L = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (C3407s.m10647c().m10668a() == C3407s.d.INIT_FAILED) {
                    try {
                        if (this.f10007i != null) {
                            int length = ad_unitArr.length;
                            while (i < length) {
                                IronSource.AD_UNIT ad_unit2 = ad_unitArr[i];
                                if (!this.f10034z.contains(ad_unit2)) {
                                    m10433a(ad_unit2, true);
                                }
                                i++;
                            }
                        }
                    } catch (Exception e) {
                        C3551q9.m11517d().m11519a(e);
                        IronLog.INTERNAL.error(e.toString());
                    }
                } else {
                    if (!m10405A()) {
                        mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z2);
                        int length2 = ad_unitArr.length;
                        while (i < length2) {
                            IronSource.AD_UNIT ad_unit3 = ad_unitArr[i];
                            if (this.f10034z.contains(ad_unit3)) {
                                this.f10005h.log(IronSourceLogger.IronSourceTag.API, ad_unit3 + " ad unit has started initializing.", 3);
                            } else {
                                this.f10034z.add(ad_unit3);
                                this.f9965A.add(ad_unit3);
                                try {
                                    mediationAdditionalData.put(ad_unit3.toString(), true);
                                } catch (Exception e2) {
                                    C3551q9.m11517d().m11519a(e2);
                                    IronLog.INTERNAL.error(e2.toString());
                                }
                            }
                            i++;
                        }
                    } else {
                        if (this.f10030v == null) {
                            return;
                        }
                        try {
                            new C3530pn().m11434a(this.f10015m.m11635c().m12633b().m13291e().m9255b(), m10565z());
                        } catch (Exception e3) {
                            C3551q9.m11517d().m11519a(e3);
                            IronLog.INTERNAL.error(e3.toString());
                        }
                        mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z2);
                        for (IronSource.AD_UNIT ad_unit4 : ad_unitArr) {
                            if (this.f10034z.contains(ad_unit4)) {
                                m10432a(ad_unit4);
                            } else {
                                this.f10034z.add(ad_unit4);
                                this.f9965A.add(ad_unit4);
                                try {
                                    mediationAdditionalData.put(ad_unit4.toString(), true);
                                } catch (Exception e4) {
                                    C3551q9.m11517d().m11519a(e4);
                                    IronLog.INTERNAL.error(e4.toString());
                                }
                                List<IronSource.AD_UNIT> list = this.f10030v;
                                if (list == null || !list.contains(ad_unit4)) {
                                    m10433a(ad_unit4, false);
                                } else {
                                    m10448b(ad_unit4);
                                }
                            }
                        }
                    }
                    JSONObject jSONObject = mediationAdditionalData;
                    int i2 = this.f9969E + 1;
                    this.f9969E = i2;
                    m10441a(z, z2, i2, jSONObject, z3);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* renamed from: a */
    public boolean m10527a(C3177h7 c3177h7) {
        return this.f9999e.mo9483b(ContextProvider.getInstance().getApplicationContext(), c3177h7, IronSource.AD_UNIT.BANNER);
    }

    /* renamed from: a */
    private boolean m10443a(InterfaceC3377h.b bVar) {
        if (C3407s.m10647c().m10668a() != C3407s.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.f10002f0) {
            this.f10002f0.put(bVar.mo10203c(), bVar);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m10444a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    /* renamed from: a */
    public boolean m10528a(boolean z, C3571qt c3571qt) {
        m10435a(c3571qt);
        if (m10405A()) {
            return true;
        }
        synchronized (this.f10013l) {
            this.f10015m = c3571qt;
        }
        return m10452b(c3571qt.m11638g(), z, c3571qt.m11635c());
    }
}
