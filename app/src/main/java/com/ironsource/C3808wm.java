package com.ironsource;

import android.content.Context;
import com.ironsource.C2992c2;
import com.ironsource.C3495on;
import com.ironsource.C3666sj;
import com.ironsource.C3779vr;
import com.ironsource.InterfaceC3078ei;
import com.ironsource.InterfaceC3186hg;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.ironsource.wm */
/* loaded from: classes2.dex */
public final class C3808wm {

    /* renamed from: a */
    public static final C3808wm f12493a = new C3808wm();

    /* renamed from: b */
    private static final C3842xm f12494b = new C3842xm();

    /* renamed from: c */
    private static final boolean f12495c = false;

    /* renamed from: com.ironsource.wm$a */
    public static final class a implements InterfaceC3710ts {

        /* renamed from: a */
        final /* synthetic */ LevelPlayInitRequest f12496a;

        /* renamed from: b */
        final /* synthetic */ Context f12497b;

        /* renamed from: c */
        final /* synthetic */ C3216ib f12498c;

        /* renamed from: d */
        final /* synthetic */ LevelPlayInitListener f12499d;

        public a(LevelPlayInitRequest levelPlayInitRequest, Context context, C3216ib c3216ib, LevelPlayInitListener levelPlayInitListener) {
            this.f12496a = levelPlayInitRequest;
            this.f12497b = context;
            this.f12498c = c3216ib;
            this.f12499d = levelPlayInitListener;
        }

        @Override // com.ironsource.InterfaceC3710ts
        /* renamed from: a */
        public void mo8029a(C3465ns sdkConfig) {
            kotlin.jvm.internal.OooOo.OooO0o0(sdkConfig, "sdkConfig");
            C3808wm.f12494b.m13090a(new o0000(this.f12496a, sdkConfig, this.f12497b, this.f12498c, this.f12499d, 0));
        }

        @Override // com.ironsource.InterfaceC3710ts
        /* renamed from: a */
        public void mo8030a(C3535ps error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            C3808wm.f12494b.m13090a(new o0000Ooo(this.f12499d, this.f12498c, error, 0));
        }

        /* renamed from: a */
        public static final void m12921a(LevelPlayInitListener levelPlayInitListener, C3216ib initDuration, C3535ps error) throws JSONException {
            kotlin.jvm.internal.OooOo.OooO0o0(initDuration, "$initDuration");
            kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
            C3808wm.f12493a.m12910a(levelPlayInitListener, initDuration, error);
        }

        /* renamed from: a */
        public static final void m12922a(LevelPlayInitRequest initRequest, C3465ns sdkConfig, Context context, C3216ib initDuration, LevelPlayInitListener levelPlayInitListener) {
            kotlin.jvm.internal.OooOo.OooO0o0(initRequest, "$initRequest");
            kotlin.jvm.internal.OooOo.OooO0o0(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.OooOo.OooO0o0(context, "$context");
            kotlin.jvm.internal.OooOo.OooO0o0(initDuration, "$initDuration");
            C3808wm.f12493a.m12912a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }
    }

    /* renamed from: com.ironsource.wm$b */
    public static final class b implements InterfaceC3710ts {

        /* renamed from: a */
        final /* synthetic */ LevelPlayInitRequest f12500a;

        /* renamed from: b */
        final /* synthetic */ Context f12501b;

        /* renamed from: c */
        final /* synthetic */ C3216ib f12502c;

        /* renamed from: d */
        final /* synthetic */ LevelPlayInitListener f12503d;

        public b(LevelPlayInitRequest levelPlayInitRequest, Context context, C3216ib c3216ib, LevelPlayInitListener levelPlayInitListener) {
            this.f12500a = levelPlayInitRequest;
            this.f12501b = context;
            this.f12502c = c3216ib;
            this.f12503d = levelPlayInitListener;
        }

        @Override // com.ironsource.InterfaceC3710ts
        /* renamed from: a */
        public void mo8029a(C3465ns sdkConfig) {
            kotlin.jvm.internal.OooOo.OooO0o0(sdkConfig, "sdkConfig");
            C3808wm.f12494b.m13090a(new o0000(this.f12500a, sdkConfig, this.f12501b, this.f12502c, this.f12503d, 1));
        }

        @Override // com.ironsource.InterfaceC3710ts
        /* renamed from: a */
        public void mo8030a(C3535ps error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            C3808wm.f12494b.m13090a(new o0000Ooo(this.f12503d, this.f12502c, error, 1));
        }

        /* renamed from: a */
        public static final void m12923a(LevelPlayInitListener levelPlayInitListener, C3216ib initDuration, C3535ps error) throws JSONException {
            kotlin.jvm.internal.OooOo.OooO0o0(initDuration, "$initDuration");
            kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
            C3808wm.f12493a.m12910a(levelPlayInitListener, initDuration, error);
        }

        /* renamed from: a */
        public static final void m12924a(LevelPlayInitRequest initRequest, C3465ns sdkConfig, Context context, C3216ib initDuration, LevelPlayInitListener levelPlayInitListener) {
            kotlin.jvm.internal.OooOo.OooO0o0(initRequest, "$initRequest");
            kotlin.jvm.internal.OooOo.OooO0o0(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.OooOo.OooO0o0(context, "$context");
            kotlin.jvm.internal.OooOo.OooO0o0(initDuration, "$initDuration");
            C3808wm.f12493a.m12912a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }
    }

    /* renamed from: com.ironsource.wm$c */
    public static final class c extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        final /* synthetic */ C3122fm f12504a;

        /* renamed from: b */
        final /* synthetic */ C3216ib f12505b;

        /* renamed from: c */
        final /* synthetic */ long f12506c;

        /* renamed from: d */
        final /* synthetic */ LevelPlayInitListener f12507d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3122fm c3122fm, C3216ib c3216ib, long j, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.f12504a = c3122fm;
            this.f12505b = c3216ib;
            this.f12506c = j;
            this.f12507d = levelPlayInitListener;
        }

        /* renamed from: a */
        public final void m12925a() throws JSONException {
            C3808wm.f12493a.m12903a(this.f12504a, this.f12505b, this.f12506c, this.f12507d);
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() throws JSONException {
            m12925a();
            return oo00o.OooOo.f33195OooO00o;
        }
    }

    private C3808wm() {
    }

    /* renamed from: b */
    public static final void m12914b(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "$context");
        kotlin.jvm.internal.OooOo.OooO0o0(initRequest, "$initRequest");
        f12493a.m12915c(context, initRequest, levelPlayInitListener);
    }

    /* renamed from: c */
    private final void m12915c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog.API.info("LevelPlay.init() appkey: " + levelPlayInitRequest.getAppKey() + ", userId: " + levelPlayInitRequest.getUserId() + ", legacyAdFormats: " + levelPlayInitRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        C3216ib c3216ib = new C3216ib();
        C3842xm c3842xm = f12494b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        C3780vs c3780vs = new C3780vs(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), o00O0.OooOOO.OoooOo0(c3842xm.m13096a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length))));
        c3780vs.m12818e().isEmpty();
        C3019ct.f7838a.m8225a(context, c3780vs, new a(levelPlayInitRequest, context, c3216ib, levelPlayInitListener));
    }

    /* renamed from: a */
    private final void m12902a(long j, o00O0Oo.OooO0O0 oooO0O0) {
        if (C3495on.f10667s.m11213d().mo8694t().mo8495c() || j <= 0) {
            oooO0O0.invoke();
        } else {
            f12494b.m13094a(oooO0O0, j);
        }
    }

    /* renamed from: b */
    public final void m12919b(LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        C3404p.m10470j().mo10517a(new C3261jm(listener));
    }

    /* renamed from: a */
    public final void m12916a(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(initRequest, "initRequest");
        f12494b.m13101d(new androidx.webkit.OooO00o(context, initRequest, levelPlayInitListener));
    }

    /* renamed from: b */
    public final void m12920b(LevelPlaySegment segment) {
        kotlin.jvm.internal.OooOo.OooO0o0(segment, "segment");
        C3404p.m10470j().m10513a(m12900a(segment));
    }

    /* renamed from: a */
    public final void m12903a(C3122fm c3122fm, C3216ib c3216ib, long j, LevelPlayInitListener levelPlayInitListener) throws JSONException {
        C3495on.f10667s.m11211a().mo8478E().mo8497d();
        long jM9304a = C3216ib.m9304a(c3216ib);
        C3842xm c3842xm = f12494b;
        c3842xm.m13085a(jM9304a, c3122fm.m11053f(), j);
        c3842xm.m13102e(new o00000O(2, levelPlayInitListener, c3122fm));
    }

    /* renamed from: a */
    public static final void m12904a(C3535ps error, LevelPlayInitListener levelPlayInitListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + error);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(error));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m12905a(C3808wm c3808wm, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i, Object obj) {
        if ((i & 4) != 0) {
            levelPlayInitListener = null;
        }
        c3808wm.m12916a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    /* renamed from: a */
    public static final void m12909a(LevelPlayInitListener levelPlayInitListener, C3122fm levelPlayConfig) {
        kotlin.jvm.internal.OooOo.OooO0o0(levelPlayConfig, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(levelPlayConfig.m8729j()));
        }
    }

    /* renamed from: a */
    public final void m12910a(LevelPlayInitListener levelPlayInitListener, C3216ib c3216ib, C3535ps c3535ps) throws JSONException {
        long jM9304a = C3216ib.m9304a(c3216ib);
        C3842xm c3842xm = f12494b;
        c3842xm.m13089a(c3535ps, jM9304a);
        c3842xm.m13102e(new o00000O(1, c3535ps, levelPlayInitListener));
    }

    /* renamed from: a */
    private final void m12911a(LevelPlayInitRequest levelPlayInitRequest, C3122fm c3122fm) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (m12913a(levelPlayInitRequest, adFormat) && c3122fm.m11051d().m11635c().m12637f() != null) {
            C3779vr.a aVar = C3779vr.f12410z;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            C3779vr c3779vrM12810a = aVar.m12810a(new C3061e1(ad_unit, C3697tf.f12051a.m12424a(), "", null, null, null, 56, null), c3122fm, true);
            List<C2980bp> listM8725c = c3122fm.m8725c(adFormat);
            C2992c2.b bVar = C2992c2.b.MEDIATION;
            new C3914zq(new C3719u2(new C3349m1(ad_unit, bVar), c3779vrM12810a, bVar), adFormat, listM8725c, c3779vrM12810a).m13425a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (m12913a(levelPlayInitRequest, adFormat2) && c3122fm.m11051d().m11635c().m12635d() != null) {
            C3666sj.a aVar2 = C3666sj.f11913z;
            IronSource.AD_UNIT ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
            C3666sj c3666sjM12286a = aVar2.m12286a(new C3061e1(ad_unit2, C3697tf.f12051a.m12424a(), "", null, null, null, 56, null), c3122fm, true);
            List<C2980bp> listM8725c2 = c3122fm.m8725c(adFormat2);
            C2992c2.b bVar2 = C2992c2.b.MEDIATION;
            new C3914zq(new C3719u2(new C3349m1(ad_unit2, bVar2), c3666sjM12286a, bVar2), adFormat2, listM8725c2, c3666sjM12286a).m13425a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!m12913a(levelPlayInitRequest, adFormat3) || c3122fm.m11051d().m11635c().m12634c() == null) {
            return;
        }
        C3354m6 c3354m6M10008a = C3354m6.f9491z.m10008a(new C3245j6(), c3122fm, true);
        List<C2980bp> listM8725c3 = c3122fm.m8725c(adFormat3);
        IronSource.AD_UNIT ad_unit3 = IronSource.AD_UNIT.BANNER;
        C2992c2.b bVar3 = C2992c2.b.MEDIATION;
        new C3914zq(new C3719u2(new C3349m1(ad_unit3, bVar3), c3354m6M10008a, bVar3), adFormat3, listM8725c3, c3354m6M10008a).m13425a();
    }

    /* renamed from: a */
    public final void m12912a(LevelPlayInitRequest levelPlayInitRequest, C3465ns c3465ns, Context context, C3216ib c3216ib, LevelPlayInitListener levelPlayInitListener) {
        C3495on.b bVar = C3495on.f10667s;
        InterfaceC3078ei.a aVarMo8478E = bVar.m11211a().mo8478E();
        C3122fm c3122fm = new C3122fm(c3465ns);
        if (c3122fm.m8730k()) {
            f12494b.m13086a(context);
        }
        InterfaceC3186hg.a aVarMo8480a = bVar.m11211a().mo8480a();
        C3842xm c3842xm = f12494b;
        c3122fm.m8721b(c3842xm).m11439a(aVarMo8480a);
        c3122fm.m8717a(c3842xm).mo10012a(bVar.m11211a().mo8489w());
        c3122fm.m8723c(c3842xm).m9888a(bVar.m11211a().mo8476B());
        C3808wm c3808wm = f12493a;
        c3808wm.m12911a(levelPlayInitRequest, c3122fm);
        long jMo11374b = bVar.m11213d().mo8685d().mo11374b();
        c3808wm.m12902a(jMo11374b, new c(c3122fm, c3216ib, jMo11374b, levelPlayInitListener));
        aVarMo8478E.mo8496a(c3122fm);
        if (c3465ns.m11048a().m9422e()) {
            new C3162gr(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).m9011c(context);
        }
    }

    /* renamed from: a */
    public final void m12917a(LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        C3404p.m10470j().mo10537b(new C3261jm(listener));
    }

    /* renamed from: a */
    public final void m12918a(String key, String value) {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        C3404p.m10470j().m10523a(key, arrayList);
    }

    /* renamed from: a */
    private final boolean m12913a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* renamed from: a */
    private final IronSourceSegment m12900a(LevelPlaySegment levelPlaySegment) {
        IronSourceSegment ironSourceSegment = new IronSourceSegment();
        ironSourceSegment.setLevel(levelPlaySegment.getLevel());
        ironSourceSegment.setIAPTotal(levelPlaySegment.getIapTotal());
        ironSourceSegment.setIsPaying(levelPlaySegment.isPaying());
        ironSourceSegment.setUserCreationDate(levelPlaySegment.getUserCreationDate());
        ironSourceSegment.setSegmentName(levelPlaySegment.getSegmentName());
        ArrayList<oo00o.OooOO0> customs$mediationsdk_release = levelPlaySegment.getCustoms$mediationsdk_release();
        int size = customs$mediationsdk_release.size();
        int i = 0;
        while (i < size) {
            oo00o.OooOO0 oooOO0 = customs$mediationsdk_release.get(i);
            i++;
            oo00o.OooOO0 oooOO02 = oooOO0;
            ironSourceSegment.setCustom((String) oooOO02.f33185OooOo0O, (String) oooOO02.f33186OooOo0o);
        }
        return ironSourceSegment;
    }
}
