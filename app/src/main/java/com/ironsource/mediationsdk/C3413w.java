package com.ironsource.mediationsdk;

import OooO0oO.OooOo;
import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C2963b8;
import com.ironsource.C2998c8;
import com.ironsource.C3097ew;
import com.ironsource.C3177h7;
import com.ironsource.C3216ib;
import com.ironsource.C3353m5;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.C3687t5;
import com.ironsource.C3805wj;
import com.ironsource.C3876ym;
import com.ironsource.C3899zb;
import com.ironsource.CallableC3861y7;
import com.ironsource.EnumC2638ac;
import com.ironsource.InterfaceC3033d8;
import com.ironsource.InterfaceC3076eg;
import com.ironsource.InterfaceC3116fg;
import com.ironsource.InterfaceC3223ii;
import com.ironsource.InterfaceC3255jg;
import com.ironsource.InterfaceC3581r4;
import com.ironsource.InterfaceC3846xq;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.lifecycle.C3331b;
import com.ironsource.mediationsdk.C3390h;
import com.ironsource.mediationsdk.C3395l;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
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
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.w */
/* loaded from: classes2.dex */
public class C3413w extends AbstractC3400m implements InterfaceC3846xq, InterfaceC3581r4 {

    /* renamed from: A */
    private ConcurrentHashMap<String, C3390h.a> f10179A;

    /* renamed from: B */
    private long f10180B;

    /* renamed from: C */
    private final Object f10181C;

    /* renamed from: D */
    private C3216ib f10182D;

    /* renamed from: E */
    private boolean f10183E;

    /* renamed from: F */
    private final long f10184F;

    /* renamed from: G */
    private final Runnable f10185G;

    /* renamed from: e */
    private final InterfaceC3223ii f10186e;

    /* renamed from: f */
    private final InterfaceC3223ii.a f10187f;

    /* renamed from: g */
    private final InterfaceC3255jg f10188g;

    /* renamed from: h */
    private final InterfaceC3255jg.a f10189h;

    /* renamed from: i */
    private C3394k f10190i;

    /* renamed from: j */
    private i f10191j;

    /* renamed from: k */
    private C3876ym f10192k;

    /* renamed from: l */
    private IronSourceBannerLayout f10193l;

    /* renamed from: m */
    private C3177h7 f10194m;

    /* renamed from: n */
    private int f10195n;

    /* renamed from: o */
    private C3414x f10196o;

    /* renamed from: p */
    private int f10197p;

    /* renamed from: q */
    private final ConcurrentHashMap<String, C3414x> f10198q;

    /* renamed from: r */
    private CopyOnWriteArrayList<C3414x> f10199r;

    /* renamed from: s */
    private String f10200s;

    /* renamed from: t */
    private JSONObject f10201t;

    /* renamed from: u */
    private String f10202u;

    /* renamed from: v */
    private int f10203v;

    /* renamed from: w */
    private C3387e f10204w;

    /* renamed from: x */
    private C3353m5 f10205x;

    /* renamed from: y */
    private C3390h f10206y;

    /* renamed from: z */
    private ConcurrentHashMap<String, C3353m5> f10207z;

    /* renamed from: com.ironsource.mediationsdk.w$a */
    public class a implements C3395l.b {

        /* renamed from: a */
        final /* synthetic */ C3177h7 f10208a;

        /* renamed from: b */
        final /* synthetic */ IronSourceBannerLayout f10209b;

        public a(C3177h7 c3177h7, IronSourceBannerLayout ironSourceBannerLayout) {
            this.f10208a = c3177h7;
            this.f10209b = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.C3395l.b
        /* renamed from: a */
        public void mo10372a() throws JSONException {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("placement = " + this.f10208a.getPlacementName());
            C3395l.m10369b(this.f10209b);
            C3413w.this.f10193l = this.f10209b;
            C3413w.this.f10194m = this.f10208a;
            InterfaceC3255jg interfaceC3255jg = C3413w.this.f10188g;
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            C3177h7 c3177h7 = this.f10208a;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            if (!interfaceC3255jg.mo9483b(applicationContext, c3177h7, ad_unit)) {
                C3413w.this.m10729b(false);
                return;
            }
            ironLog.verbose("placement is capped");
            C3402n.m10397a().m10402b(ad_unit, new IronSourceError(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, "placement " + this.f10208a.getPlacementName() + " is capped"));
            C3413w.this.m10705a(EnumC2638ac.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED)}});
            C3413w.this.m10709a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.C3395l.b
        /* renamed from: a */
        public void mo10373a(String str) {
            IronLog.API.error("can't load banner - errorMessage = " + str);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.w$b */
    public class b implements C3395l.b {

        /* renamed from: a */
        final /* synthetic */ IronSourceBannerLayout f10211a;

        public b(IronSourceBannerLayout ironSourceBannerLayout) {
            this.f10211a = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.C3395l.b
        /* renamed from: a */
        public void mo10372a() throws JSONException {
            IronLog.INTERNAL.verbose("destroying banner");
            C3413w.this.f10192k.m13216b();
            C3413w.this.m10706a(EnumC2638ac.BN_DESTROY, (Object[][]) null, C3413w.this.f10196o != null ? C3413w.this.f10196o.m10806n() : C3413w.this.f10197p);
            C3413w.this.m10739h();
            this.f10211a.m10026a();
            C3413w.this.f10193l = null;
            C3413w.this.f10194m = null;
            C3413w.this.m10709a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.C3395l.b
        /* renamed from: a */
        public void mo10373a(String str) {
            IronLog.API.error("destroy banner failed - errorMessage = " + str);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.w$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            try {
                if (C3413w.this.f10193l == null) {
                    IronLog.INTERNAL.verbose("mIronSourceBanner is null");
                    C3413w.this.m10705a(EnumC2638ac.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL)}});
                } else {
                    if (C3413w.this.m10770o()) {
                        C3413w.this.m10756v();
                        return;
                    }
                    IronLog.INTERNAL.verbose("banner is not visible, reload skipped");
                    C3413w.this.m10705a(EnumC2638ac.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE)}});
                    C3413w.this.f10192k.m13215a(TimeUnit.SECONDS.toMillis(C3413w.this.f10190i.m10343f()));
                }
            } catch (Throwable th) {
                C3551q9.m11517d().m11519a(th);
                C3413w.this.m10705a(EnumC2638ac.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, new Object[][]{new Object[]{"reason", th.getMessage()}});
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.w$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            C3413w.this.m10757w();
            if (C3413w.this.m10759y()) {
                return;
            }
            C3413w.this.m10704a(EnumC2638ac.BN_AUCTION_REQUEST);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            C3413w.this.m10728b(map, arrayList, sb, arrayList2);
            C3413w.this.m10721a(map, arrayList, sb, arrayList2);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.w$e */
    public class e implements C2963b8.b {

        /* renamed from: a */
        final /* synthetic */ Map f10215a;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f10216b;

        /* renamed from: c */
        final /* synthetic */ List f10217c;

        public e(Map map, StringBuilder sb, List list) {
            this.f10215a = map;
            this.f10216b = sb;
            this.f10217c = list;
        }

        @Override // com.ironsource.C2963b8.b
        /* renamed from: a */
        public void mo7886a(List<C2998c8> list, long j, List<String> list2) throws JSONException {
            C3413w.this.m10705a(EnumC2638ac.BN_COLLECT_TOKENS_COMPLETED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
            for (C2998c8 c2998c8 : list) {
                if (c2998c8.m8101a() != null) {
                    this.f10215a.put(c2998c8.m8103c(), c2998c8.m8101a());
                    StringBuilder sb = this.f10216b;
                    sb.append(c2998c8.m8104d());
                    sb.append(c2998c8.m8103c());
                    sb.append(",");
                    ((C3414x) C3413w.this.f10198q.get(c2998c8.m8103c())).m10785a(EnumC2638ac.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(c2998c8.m8105e())}});
                } else {
                    ((C3414x) C3413w.this.f10198q.get(c2998c8.m8103c())).m10785a(EnumC2638ac.BN_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(c2998c8.m8105e())}, new Object[]{"reason", c2998c8.m8102b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                ((C3414x) C3413w.this.f10198q.get(it.next())).m10785a(EnumC2638ac.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
            }
            C3413w.this.m10720a((Map<String, Object>) this.f10215a, (List<String>) this.f10217c, this.f10216b);
        }

        @Override // com.ironsource.C2963b8.b
        public void onFailure(String str) throws JSONException {
            C3413w.this.m10705a(EnumC2638ac.BN_COLLECT_TOKENS_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, str}});
            C3413w.this.m10720a((Map<String, Object>) this.f10215a, (List<String>) this.f10217c, this.f10216b);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.w$f */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NetworkSettings f10219a;

        public f(NetworkSettings networkSettings) {
            this.f10219a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3413w.this.m10708a(this.f10219a);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.w$g */
    public class g implements InterfaceC3033d8 {

        /* renamed from: a */
        final /* synthetic */ C3414x f10221a;

        public g(C3414x c3414x) {
            this.f10221a = c3414x;
        }

        @Override // com.ironsource.InterfaceC3033d8
        /* renamed from: a */
        public void mo8286a() {
            this.f10221a.m10781D();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.w$h */
    public class h extends TimerTask {
        public h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3413w.this.m10755u();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.w$i */
    public enum i {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public C3413w(InterfaceC3116fg interfaceC3116fg, InterfaceC3076eg interfaceC3076eg, List<NetworkSettings> list, C3394k c3394k, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) throws JSONException, InterruptedException {
        super(hashSet, ironSourceSegment);
        this.f10191j = i.NONE;
        this.f10202u = "";
        this.f10181C = new Object();
        this.f10183E = false;
        c cVar = new c();
        this.f10185G = cVar;
        InterfaceC3223ii interfaceC3223iiMo8689k = interfaceC3116fg.mo8689k();
        this.f10186e = interfaceC3223iiMo8689k;
        this.f10187f = interfaceC3076eg.mo8482e();
        this.f10188g = interfaceC3116fg.mo8682C();
        this.f10189h = interfaceC3076eg.mo8485m();
        long time = new Date().getTime();
        m10705a(EnumC2638ac.BN_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_BN_MANAGER_NAME}});
        IronLog.INTERNAL.verbose("isAuctionEnabled = " + c3394k.m10347j());
        this.f10190i = c3394k;
        this.f10198q = new ConcurrentHashMap<>();
        this.f10199r = new CopyOnWriteArrayList<>();
        this.f10207z = new ConcurrentHashMap<>();
        this.f10179A = new ConcurrentHashMap<>();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        this.f10197p = interfaceC3223iiMo8689k.mo9344a(ad_unit);
        C3402n.m10397a().m10401a(ad_unit, this.f10190i.m10341d());
        if (this.f10190i.m10347j()) {
            this.f10204w = new C3387e(ad_unit, this.f10190i.m10339b(), this);
        }
        this.f10206y = new C3390h(list, this.f10190i.m10339b().m11090c());
        m10719a(list, c3394k);
        this.f10180B = new Date().getTime();
        m10709a(i.READY_TO_LOAD);
        this.f10184F = c3394k.m10344g();
        this.f10192k = new C3876ym(cVar, C3331b.m9799d(), new C3097ew());
        m10705a(EnumC2638ac.BN_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}});
    }

    /* renamed from: b */
    private String m10724b(C3353m5 c3353m5) {
        C3414x c3414x = this.f10198q.get(c3353m5.m9986c());
        StringBuilder sbOooOo0O = OooOo.OooOo0O((c3414x == null ? !TextUtils.isEmpty(c3353m5.m9994k()) : c3414x.m10808p()) ? CommonGetHeaderBiddingToken.HB_TOKEN_VERSION : "1");
        sbOooOo0O.append(c3353m5.m9986c());
        return sbOooOo0O.toString();
    }

    /* renamed from: f */
    private void m10734f(C3414x c3414x) {
        String strM9994k;
        IronSourceBannerLayout ironSourceBannerLayout = this.f10193l;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayoutM10027b = null;
        if (c3414x.m10808p()) {
            strM9994k = this.f10207z.get(c3414x.mo9129c()).m9994k();
            c3414x.m10798c(strM9994k);
        } else {
            strM9994k = null;
        }
        JSONObject jSONObjectM9984a = this.f10207z.get(c3414x.mo9129c()).m9984a();
        try {
            ironSourceBannerLayoutM10027b = this.f10193l.m10027b();
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            IronLog.INTERNAL.verbose("Failed to make copy of banner layout: " + e2.getMessage());
        }
        c3414x.m10786a(ironSourceBannerLayoutM10027b, this.f10194m, strM9994k, jSONObjectM9984a);
    }

    /* renamed from: i */
    private List<C3353m5> m10740i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C3414x c3414x : this.f10198q.values()) {
            if (!c3414x.m10808p() && !this.f10188g.mo9483b(ContextProvider.getInstance().getApplicationContext(), this.f10194m, IronSource.AD_UNIT.BANNER)) {
                copyOnWriteArrayList.add(new C3353m5(c3414x.mo9129c()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: j */
    private ISBannerSize m10742j() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f10193l;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return this.f10193l.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? ISBannerSize.f9521e : ISBannerSize.BANNER : this.f10193l.getSize();
    }

    /* renamed from: k */
    private ISBannerSize m10744k() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f10193l;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    /* renamed from: m */
    private void m10748m() throws JSONException {
        String str = this.f10199r.isEmpty() ? "Empty waterfall" : "Mediation No fill";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("errorReason = ".concat(str));
        m10769g((C3414x) null);
        i iVar = i.LOADING;
        i iVar2 = i.READY_TO_LOAD;
        if (m10723a(iVar, iVar2)) {
            m10705a(EnumC2638ac.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 606}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f10182D))}});
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.BANNER, new IronSourceError(606, str));
        } else if (m10723a(i.RELOADING, i.LOADED)) {
            m10705a(EnumC2638ac.BN_CALLBACK_RELOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f10182D))}});
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.BANNER, new IronSourceError(606, str));
            this.f10192k.m13215a(TimeUnit.SECONDS.toMillis(this.f10190i.m10343f()));
        } else {
            m10709a(iVar2);
            ironLog.error("wrong state = " + this.f10191j);
        }
    }

    /* renamed from: n */
    private void m10749n() throws JSONException {
        String strM10747l = m10747l();
        InterfaceC3255jg.a aVar = this.f10189h;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        aVar.mo9484a(applicationContext, strM10747l, ad_unit);
        if (this.f10188g.mo9483b(ContextProvider.getInstance().getApplicationContext(), this.f10194m, ad_unit)) {
            m10704a(EnumC2638ac.BN_PLACEMENT_CAPPED);
        }
    }

    /* renamed from: p */
    private boolean m10750p() {
        i iVar = this.f10191j;
        return iVar == i.RELOADING || iVar == i.AUCTION;
    }

    /* renamed from: q */
    private boolean m10751q() {
        boolean z;
        synchronized (this.f10181C) {
            z = this.f10191j == i.LOADED;
        }
        return z;
    }

    /* renamed from: r */
    private boolean m10752r() {
        boolean z;
        synchronized (this.f10181C) {
            try {
                i iVar = this.f10191j;
                z = iVar == i.FIRST_AUCTION || iVar == i.AUCTION;
            } finally {
            }
        }
        return z;
    }

    /* renamed from: s */
    private boolean m10753s() {
        boolean z;
        synchronized (this.f10181C) {
            try {
                i iVar = this.f10191j;
                z = iVar == i.LOADING || iVar == i.RELOADING;
            } finally {
            }
        }
        return z;
    }

    /* renamed from: t */
    private void m10754t() throws JSONException {
        try {
            for (int i2 = this.f10195n; i2 < this.f10199r.size(); i2++) {
                C3414x c3414x = this.f10199r.get(i2);
                if (c3414x.m10802h()) {
                    IronLog.INTERNAL.verbose("loading smash - " + c3414x.m10800f());
                    this.f10195n = i2 + 1;
                    m10734f(c3414x);
                    return;
                }
            }
            m10748m();
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            m10705a(EnumC2638ac.TROUBLESHOOTING_BN_INTERNAL_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "loadNextSmash"}, new Object[]{"reason", Log.getStackTraceString(e2)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m10755u() {
        IronLog.INTERNAL.verbose();
        AsyncTask.execute(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m10756v() throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (m10723a(i.LOADED, i.STARTED_LOADING)) {
            m10729b(true);
            return;
        }
        ironLog.error("wrong state = " + this.f10191j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m10757w() {
        if (this.f10179A.isEmpty()) {
            return;
        }
        this.f10206y.m10288a(this.f10179A);
        this.f10179A.clear();
    }

    /* renamed from: x */
    private void m10758x() {
        List<C3353m5> listM10740i = m10740i();
        this.f10200s = m10394e();
        m10703a(listM10740i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public boolean m10759y() {
        long jM10351a = C3395l.m10351a(this.f10180B, this.f10190i.m10345h());
        if (jM10351a <= 0) {
            return false;
        }
        IronLog.INTERNAL.verbose("waiting before auction - timeToWaitBeforeAuction = " + jM10351a);
        new Timer().schedule(new h(), jM10351a);
        return true;
    }

    /* renamed from: o */
    public boolean m10770o() {
        IronLog ironLog;
        String str;
        if (!this.f10193l.isShown()) {
            ironLog = IronLog.INTERNAL;
            str = "banner or one of its parents are INVISIBLE or GONE";
        } else {
            if (this.f10193l.hasWindowFocus()) {
                boolean globalVisibleRect = this.f10193l.getGlobalVisibleRect(new Rect());
                IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
                return globalVisibleRect;
            }
            ironLog = IronLog.INTERNAL;
            str = "banner has no window focus";
        }
        ironLog.verbose(str);
        return false;
    }

    public C3413w(List<NetworkSettings> list, C3394k c3394k, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this(C3495on.m11199U(), C3495on.m11193O(), list, c3394k, hashSet, ironSourceSegment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m10739h() {
        if (this.f10196o != null) {
            IronLog.INTERNAL.verbose("mActiveSmash = " + this.f10196o.m10800f());
            this.f10196o.m10788t();
            this.f10196o = null;
        }
    }

    /* renamed from: l */
    private String m10747l() {
        C3177h7 c3177h7 = this.f10194m;
        return c3177h7 != null ? c3177h7.getPlacementName() : "";
    }

    @Override // com.ironsource.InterfaceC3846xq
    /* renamed from: c */
    public void mo10766c(C3414x c3414x) throws JSONException {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(c3414x.m10800f());
        if (m10737g()) {
            C3687t5.m12363a().m12389c(this.f9909d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        m10706a(EnumC2638ac.BN_CALLBACK_LEAVE_APP, objArr, c3414x.m10806n());
    }

    @Override // com.ironsource.InterfaceC3846xq
    /* renamed from: d */
    public void mo10767d(C3414x c3414x) throws JSONException {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(c3414x.m10800f());
        if (m10737g()) {
            C3687t5.m12363a().m12392f(this.f9909d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        m10706a(EnumC2638ac.BN_CALLBACK_PRESENT_SCREEN, objArr, c3414x.m10806n());
    }

    @Override // com.ironsource.InterfaceC3846xq
    /* renamed from: e */
    public void mo10768e(C3414x c3414x) throws JSONException {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(c3414x.m10800f());
        if (m10737g()) {
            C3687t5.m12363a().m12391e(this.f9909d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        m10706a(EnumC2638ac.BN_CALLBACK_DISMISS_SCREEN, objArr, c3414x.m10806n());
    }

    /* renamed from: g */
    public void m10769g(C3414x c3414x) {
        Iterator<C3414x> it = this.f10199r.iterator();
        while (it.hasNext()) {
            C3414x next = it.next();
            if (!next.equals(c3414x)) {
                next.mo10787q();
            }
        }
    }

    /* renamed from: g */
    private boolean m10737g() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f10193l;
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    /* renamed from: a */
    private String m10703a(List<C3353m5> list) {
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.f10199r.clear();
        this.f10207z.clear();
        this.f10179A.clear();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C3353m5 c3353m5 = list.get(i2);
            m10707a(c3353m5);
            sb.append(m10724b(c3353m5));
            if (i2 != list.size() - 1) {
                sb.append(",");
            }
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    @Override // com.ironsource.InterfaceC3581r4
    /* renamed from: a */
    public void mo10175a(int i2, String str, int i3, String str2, long j) throws JSONException {
        String str3 = "Auction failed (error " + i2 + " - " + str + ")";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (!m10752r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f10191j);
            return;
        }
        this.f10202u = str2;
        this.f10203v = i3;
        this.f10201t = null;
        if (this.f10190i.m10339b().m11101n()) {
            ironLog.verbose("Moving to fallback waterfall");
            m10758x();
        }
        m10705a(EnumC2638ac.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str}});
        m10709a(this.f10191j == i.FIRST_AUCTION ? i.LOADING : i.RELOADING);
        m10754t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10704a(EnumC2638ac enumC2638ac) throws JSONException {
        m10705a(enumC2638ac, (Object[][]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10705a(EnumC2638ac enumC2638ac, Object[][] objArr) throws JSONException {
        m10706a(enumC2638ac, objArr, this.f10197p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10706a(EnumC2638ac enumC2638ac, Object[][] objArr, int i2) throws JSONException {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            ISBannerSize iSBannerSizeM10744k = m10744k();
            if (iSBannerSizeM10744k != null) {
                m10722a(mediationAdditionalData, iSBannerSizeM10744k);
            }
            if (this.f10194m != null) {
                mediationAdditionalData.put("placement", m10747l());
            }
            mediationAdditionalData.put("sessionDepth", i2);
            if (!TextUtils.isEmpty(this.f10200s)) {
                mediationAdditionalData.put("auctionId", this.f10200s);
            }
            JSONObject jSONObject = this.f10201t;
            if (jSONObject != null && jSONObject.length() > 0) {
                mediationAdditionalData.put("genericParams", this.f10201t);
            }
            if (m10730b(enumC2638ac)) {
                mediationAdditionalData.put(IronSourceConstants.AUCTION_TRIALS, this.f10203v);
                if (!TextUtils.isEmpty(this.f10202u)) {
                    mediationAdditionalData.put(IronSourceConstants.AUCTION_FALLBACK, this.f10202u);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            IronLog.INTERNAL.error(Log.getStackTraceString(e2));
        }
        C3805wj.m12898i().mo12605a(new C3899zb(enumC2638ac, mediationAdditionalData));
    }

    @Override // com.ironsource.InterfaceC3846xq
    /* renamed from: b */
    public void mo10765b(C3414x c3414x) throws JSONException {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(c3414x.m10800f());
        if (m10737g()) {
            C3687t5.m12363a().m12387b(this.f9909d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        m10706a(EnumC2638ac.BN_CALLBACK_CLICK, objArr, c3414x.m10806n());
    }

    /* renamed from: a */
    private void m10707a(C3353m5 c3353m5) {
        C3414x c3414x = this.f10198q.get(c3353m5.m9986c());
        if (c3414x == null) {
            IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + c3353m5.m9986c());
            return;
        }
        AbstractAdapter abstractAdapterM10111a = C3367c.m10097b().m10111a(c3414x.f10257b.m4773h());
        if (abstractAdapterM10111a != null) {
            C3414x c3414x2 = new C3414x(this.f10190i, this, c3414x.f10257b.m4773h(), abstractAdapterM10111a, this.f10197p, this.f10200s, this.f10201t, this.f10203v, this.f10202u, m10750p());
            c3414x2.m10796a(true);
            this.f10199r.add(c3414x2);
            this.f10207z.put(c3414x2.mo9129c(), c3353m5);
            this.f10179A.put(c3353m5.m9986c(), C3390h.a.ISAuctionPerformanceDidntAttemptToLoad);
        }
    }

    /* renamed from: b */
    private void m10727b(C3414x c3414x, View view, FrameLayout.LayoutParams layoutParams) {
        if (this.f10193l != null) {
            c3414x.m10782E();
            C3395l.m10360a(this.f10193l, view, layoutParams, new g(c3414x));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m10728b(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC3861y7> list2) {
        if (this.f10188g.mo9483b(ContextProvider.getInstance().getApplicationContext(), this.f10194m, IronSource.AD_UNIT.BANNER)) {
            return;
        }
        for (C3414x c3414x : this.f10198q.values()) {
            AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(c3414x.f10259d, IronSource.AD_UNIT.BANNER, null, this.f10193l);
            if (c3414x.m10808p()) {
                list2.add(new CallableC3861y7(c3414x.m10801g(), c3414x.mo9129c(), adDataCreateAdDataForNetworkAdapter, c3414x, null, null));
            } else if (!c3414x.m10808p()) {
                list.add(c3414x.mo9129c());
                sb.append(c3414x.m10801g() + c3414x.mo9129c() + ",");
            }
        }
    }

    /* renamed from: a */
    public void m10760a(IronSourceBannerLayout ironSourceBannerLayout) {
        IronLog.INTERNAL.verbose();
        C3395l.m10363a(ironSourceBannerLayout, new b(ironSourceBannerLayout));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m10729b(boolean z) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.f10191j);
        if (!m10723a(i.STARTED_LOADING, this.f10190i.m10347j() ? z ? i.AUCTION : i.FIRST_AUCTION : z ? i.RELOADING : i.LOADING)) {
            ironLog.error("wrong state - " + this.f10191j);
            return;
        }
        this.f10182D = new C3216ib();
        this.f10200s = "";
        this.f10201t = null;
        this.f10195n = 0;
        this.f10197p = this.f10186e.mo9344a(IronSource.AD_UNIT.BANNER);
        m10704a(z ? EnumC2638ac.BN_RELOAD : EnumC2638ac.BN_LOAD);
        if (this.f10190i.m10347j()) {
            m10755u();
        } else {
            m10758x();
            m10754t();
        }
    }

    /* renamed from: a */
    public void m10761a(IronSourceBannerLayout ironSourceBannerLayout, C3177h7 c3177h7) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        m10387a(ad_unit);
        m10395f();
        if (!m10723a(i.READY_TO_LOAD, i.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (C3402n.m10397a().m10403b(ad_unit)) {
            ironLog.verbose("can't load banner - already has pending invocation");
        } else {
            C3395l.m10362a(ironSourceBannerLayout, c3177h7, new a(c3177h7, ironSourceBannerLayout));
        }
    }

    /* renamed from: b */
    private boolean m10730b(EnumC2638ac enumC2638ac) {
        return enumC2638ac == EnumC2638ac.BN_CALLBACK_RELOAD_ERROR || enumC2638ac == EnumC2638ac.BN_CALLBACK_LOAD_SUCCESS || enumC2638ac == EnumC2638ac.BN_CALLBACK_LOAD_ERROR || enumC2638ac == EnumC2638ac.BN_CALLBACK_RELOAD_SUCCESS || enumC2638ac == EnumC2638ac.BN_CALLBACK_SHOW || enumC2638ac == EnumC2638ac.BN_CALLBACK_CLICK || enumC2638ac == EnumC2638ac.BN_CALLBACK_LEAVE_APP || enumC2638ac == EnumC2638ac.BN_AUCTION_FAILED || enumC2638ac == EnumC2638ac.BN_AUCTION_SUCCESS || enumC2638ac == EnumC2638ac.BN_AD_UNIT_CAPPED;
    }

    @Override // com.ironsource.InterfaceC3846xq
    /* renamed from: a */
    public void mo10762a(IronSourceError ironSourceError, C3414x c3414x, boolean z) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (c3414x.m10791x() == this.f10200s) {
            if (m10753s()) {
                this.f10179A.put(c3414x.mo9129c(), C3390h.a.ISAuctionPerformanceFailedToLoad);
                m10754t();
                return;
            } else {
                ironLog.warning("wrong state - mCurrentState = " + this.f10191j);
                return;
            }
        }
        ironLog.error("invoked with auctionId: " + c3414x.m10791x() + " and the current id is " + this.f10200s);
        c3414x.m10785a(EnumC2638ac.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 3}, new Object[]{"reason", "Wrong auction " + c3414x.m10791x() + " State - " + this.f10191j}, new Object[]{IronSourceConstants.EVENTS_EXT1, c3414x.mo9129c()}});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10708a(NetworkSettings networkSettings) {
        NetworkSettings networkSettings2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("Start initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName());
        AbstractAdapter abstractAdapterM10112a = C3367c.m10097b().m10112a(networkSettings, networkSettings.getBannerSettings(), false);
        if (abstractAdapterM10112a != null) {
            networkSettings2 = networkSettings;
            C3414x c3414x = new C3414x(this.f10190i, this, networkSettings2, abstractAdapterM10112a, this.f10197p, m10750p());
            this.f10198q.put(c3414x.mo9129c(), c3414x);
        } else {
            networkSettings2 = networkSettings;
            ironLog.verbose(networkSettings2.getProviderInstanceName() + " can't load adapter");
        }
        ironLog.verbose("Done initializing provider " + networkSettings2.getProviderInstanceName() + " on thread " + Thread.currentThread().getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10709a(i iVar) {
        IronLog.INTERNAL.verbose("from '" + this.f10191j + "' to '" + iVar + "'");
        synchronized (this.f10181C) {
            this.f10191j = iVar;
        }
    }

    @Override // com.ironsource.InterfaceC3846xq
    /* renamed from: a */
    public void mo10763a(C3414x c3414x) throws JSONException, NumberFormatException {
        C3353m5 c3353m5;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c3414x.m10800f());
        if (m10751q()) {
            if (this.f10190i.m10347j() && this.f10190i.m10339b().m11105r() && (c3353m5 = this.f10207z.get(c3414x.mo9129c())) != null) {
                m10718a(c3414x, c3353m5);
            }
            m10704a(EnumC2638ac.BN_CALLBACK_SHOW);
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f10191j);
        String strMo9129c = c3414x.mo9129c();
        m10705a(EnumC2638ac.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.f10191j}, new Object[]{IronSourceConstants.EVENTS_EXT1, strMo9129c}});
    }

    @Override // com.ironsource.InterfaceC3846xq
    /* renamed from: a */
    public void mo10764a(C3414x c3414x, View view, FrameLayout.LayoutParams layoutParams) throws JSONException, NumberFormatException {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + c3414x.m10800f());
        if (c3414x.m10791x() != this.f10200s) {
            ironLog.error("invoked with auctionId: " + c3414x.m10791x() + " and the current id is " + this.f10200s);
            c3414x.m10785a(EnumC2638ac.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 2}, new Object[]{"reason", "Wrong auction id " + c3414x.m10791x() + " State - " + this.f10191j}, new Object[]{IronSourceConstants.EVENTS_EXT1, c3414x.mo9129c()}});
            return;
        }
        if (!m10753s()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f10191j);
            return;
        }
        C3414x c3414x2 = this.f10196o;
        if (c3414x2 != null) {
            c3414x2.mo10787q();
        }
        m10769g(c3414x);
        this.f10196o = c3414x;
        m10727b(c3414x, view, layoutParams);
        this.f10179A.put(c3414x.mo9129c(), C3390h.a.ISAuctionPerformanceShowedSuccessfully);
        if (this.f10190i.m10347j()) {
            C3353m5 c3353m5 = this.f10207z.get(c3414x.mo9129c());
            if (c3353m5 != null) {
                m10389a(c3353m5.m9983a(m10747l()), c3353m5.m9987d());
                this.f10204w.m10267a(c3353m5, c3414x.m10801g(), this.f10205x);
                this.f10204w.m10270a(this.f10199r, this.f10207z, c3414x.m10801g(), this.f10205x, c3353m5);
                if (!this.f10190i.m10339b().m11105r()) {
                    m10718a(c3414x, c3353m5);
                }
            } else {
                String strMo9129c = c3414x.mo9129c();
                StringBuilder sbOooOoO0 = OooOo.OooOoO0("onLoadSuccess winner instance ", strMo9129c, " missing from waterfall. auctionId = ");
                sbOooOoO0.append(this.f10200s);
                ironLog.error(sbOooOoO0.toString());
                m10705a(EnumC2638ac.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{"reason", "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, strMo9129c}});
            }
        }
        if (this.f10191j == i.LOADING) {
            if (m10737g()) {
                C3687t5.m12363a().m12390d(this.f9909d);
                objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f10182D))}};
            } else {
                objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f10182D))}};
            }
            m10705a(EnumC2638ac.BN_CALLBACK_LOAD_SUCCESS, objArr);
        } else {
            if (m10737g()) {
                C3687t5.m12363a().m12390d(this.f9909d);
            }
            IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
            m10705a(EnumC2638ac.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3216ib.m9304a(this.f10182D))}});
        }
        m10749n();
        this.f10187f.mo9346b(IronSource.AD_UNIT.BANNER);
        m10709a(i.LOADED);
        this.f10192k.m13215a(TimeUnit.SECONDS.toMillis(this.f10190i.m10343f()));
    }

    /* renamed from: a */
    private void m10718a(C3414x c3414x, C3353m5 c3353m5) throws NumberFormatException {
        this.f10204w.m10268a(c3353m5, c3414x.m10801g(), this.f10205x, m10747l());
        m10386a(this.f10207z.get(c3414x.mo9129c()), m10747l());
    }

    /* renamed from: a */
    private void m10719a(List<NetworkSettings> list, C3394k c3394k) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f(it.next()));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(c3394k.m10340c().m12555l(), c3394k.m10340c().m12557n(), arrayList);
    }

    @Override // com.ironsource.InterfaceC3581r4
    /* renamed from: a */
    public void mo10178a(List<C3353m5> list, String str, C3353m5 c3353m5, JSONObject jSONObject, JSONObject jSONObject2, int i2, long j, int i3, String str2) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (!m10752r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f10191j);
            return;
        }
        this.f10202u = "";
        this.f10200s = str;
        this.f10203v = i2;
        this.f10205x = c3353m5;
        this.f10201t = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            m10705a(EnumC2638ac.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i3)}, new Object[]{"reason", str2}});
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        m10391a(jSONObject2, ad_unit);
        if (!this.f9907b.mo8947a(ad_unit)) {
            m10705a(EnumC2638ac.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
            m10709a(this.f10191j == i.FIRST_AUCTION ? i.LOADING : i.RELOADING);
            m10705a(EnumC2638ac.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, m10703a(list)}});
            m10754t();
            return;
        }
        m10705a(EnumC2638ac.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}});
        i iVar = this.f10191j;
        m10709a(i.READY_TO_LOAD);
        if (iVar == i.FIRST_AUCTION) {
            C3402n.m10397a().m10402b(ad_unit, new IronSourceError(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10720a(Map<String, Object> map, List<String> list, StringBuilder sb) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + ((Object) sb));
        if (map.size() == 0 && list.size() == 0) {
            m10705a(EnumC2638ac.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}});
            if (m10723a(i.AUCTION, i.LOADED)) {
                this.f10192k.m13215a(TimeUnit.SECONDS.toMillis(this.f10190i.m10343f()));
                return;
            }
            C3402n.m10397a().m10402b(IronSource.AD_UNIT.BANNER, new IronSourceError(1005, "No candidates available for auctioning"));
            m10705a(EnumC2638ac.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
            m10709a(i.READY_TO_LOAD);
            return;
        }
        m10705a(EnumC2638ac.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
        C3387e c3387e = this.f10204w;
        if (c3387e != null) {
            c3387e.m10266a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f10206y, this.f10197p, this.f9908c, m10742j());
        } else {
            ironLog.error("mAuctionHandler is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10721a(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC3861y7> list2) throws JSONException {
        if (list2.isEmpty()) {
            m10720a(map, list, sb);
            return;
        }
        C2963b8 c2963b8 = new C2963b8();
        e eVar = new e(map, sb, list);
        m10704a(EnumC2638ac.BN_COLLECT_TOKENS);
        c2963b8.m7885a(list2, eVar, this.f10184F, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m10722a(org.json.JSONObject r8, com.ironsource.mediationsdk.ISBannerSize r9) throws org.json.JSONException {
        /*
            java.lang.String r0 = "ext1"
            java.lang.String r1 = " , Adaptive=true"
            java.lang.String r2 = r9.getDescription()     // Catch: java.lang.Exception -> Laf
            int r3 = r2.hashCode()     // Catch: java.lang.Exception -> Laf
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 3
            switch(r3) {
                case -387072689: goto L3c;
                case 72205083: goto L32;
                case 79011241: goto L28;
                case 1951953708: goto L1e;
                case 1999208305: goto L14;
                default: goto L13;
            }     // Catch: java.lang.Exception -> Laf
        L13:
            goto L46
        L14:
            java.lang.String r3 = "CUSTOM"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L46
            r2 = r4
            goto L47
        L1e:
            java.lang.String r3 = "BANNER"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L46
            r2 = 0
            goto L47
        L28:
            java.lang.String r3 = "SMART"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L46
            r2 = r7
            goto L47
        L32:
            java.lang.String r3 = "LARGE"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L46
            r2 = r6
            goto L47
        L3c:
            java.lang.String r3 = "RECTANGLE"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L46
            r2 = r5
            goto L47
        L46:
            r2 = -1
        L47:
            java.lang.String r3 = "bannerAdSize"
            if (r2 == 0) goto L87
            if (r2 == r6) goto L83
            if (r2 == r5) goto L7f
            if (r2 == r7) goto L7a
            if (r2 == r4) goto L54
            goto L8a
        L54:
            r2 = 6
            r8.put(r3, r2)     // Catch: java.lang.Exception -> Laf
            java.lang.String r2 = "custom_banner_size"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Laf
            r3.<init>()     // Catch: java.lang.Exception -> Laf
            int r4 = r9.getWidth()     // Catch: java.lang.Exception -> Laf
            r3.append(r4)     // Catch: java.lang.Exception -> Laf
            java.lang.String r4 = "x"
            r3.append(r4)     // Catch: java.lang.Exception -> Laf
            int r4 = r9.getHeight()     // Catch: java.lang.Exception -> Laf
            r3.append(r4)     // Catch: java.lang.Exception -> Laf
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Laf
            r8.put(r2, r3)     // Catch: java.lang.Exception -> Laf
            goto L8a
        L7a:
            r2 = 5
            r8.put(r3, r2)     // Catch: java.lang.Exception -> Laf
            goto L8a
        L7f:
            r8.put(r3, r7)     // Catch: java.lang.Exception -> Laf
            goto L8a
        L83:
            r8.put(r3, r5)     // Catch: java.lang.Exception -> Laf
            goto L8a
        L87:
            r8.put(r3, r6)     // Catch: java.lang.Exception -> Laf
        L8a:
            boolean r9 = r9.isAdaptive()     // Catch: java.lang.Exception -> Laf
            if (r9 == 0) goto Lc0
            java.lang.String r9 = "Adaptive=true"
            boolean r2 = r8.has(r0)     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto Lab
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Laf
            r9.<init>()     // Catch: java.lang.Exception -> Laf
            java.lang.String r2 = r8.optString(r0)     // Catch: java.lang.Exception -> Laf
            r9.append(r2)     // Catch: java.lang.Exception -> Laf
            r9.append(r1)     // Catch: java.lang.Exception -> Laf
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> Laf
        Lab:
            r8.put(r0, r9)     // Catch: java.lang.Exception -> Laf
            return
        Laf:
            r8 = move-exception
            com.ironsource.q9 r9 = com.ironsource.C3551q9.m11517d()
            r9.m11519a(r8)
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            r9.error(r8)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3413w.m10722a(org.json.JSONObject, com.ironsource.mediationsdk.ISBannerSize):void");
    }

    /* renamed from: a */
    private boolean m10723a(i iVar, i iVar2) {
        boolean z;
        synchronized (this.f10181C) {
            try {
                if (this.f10191j == iVar) {
                    IronLog.INTERNAL.verbose("set state from '" + this.f10191j + "' to '" + iVar2 + "'");
                    this.f10191j = iVar2;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
