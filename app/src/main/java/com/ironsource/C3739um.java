package com.ironsource;

import android.app.Activity;
import com.ironsource.C3192hm;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* renamed from: com.ironsource.um */
/* loaded from: classes2.dex */
public final class C3739um {

    /* renamed from: a */
    private final C3192hm f12260a;

    /* renamed from: com.ironsource.um$a */
    public static final class a implements InterfaceC3753v1 {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3116fg f12261a;

        public a(InterfaceC3116fg interfaceC3116fg) {
            this.f12261a = interfaceC3116fg;
        }

        @Override // com.ironsource.InterfaceC3753v1
        /* renamed from: a */
        public AbstractC3718u1 mo9691a(boolean z, C3061e1 adProperties) {
            kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
            return C3779vr.f12410z.m12810a(adProperties, this.f12261a.mo8694t().mo8493a(), z);
        }
    }

    public C3739um(String adUnitId, C3192hm.b config, C3349m1 adTools, C3113fd adControllerFactory, InterfaceC3116fg provider, InterfaceC3621s9 currentTimeProvider, C3697tf idFactory) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adControllerFactory, "adControllerFactory");
        kotlin.jvm.internal.OooOo.OooO0o0(provider, "provider");
        kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(idFactory, "idFactory");
        this.f12260a = new C3192hm(LevelPlay.AdFormat.REWARDED, adUnitId, config, adTools, adControllerFactory, m12703a(provider), provider, currentTimeProvider, idFactory);
    }

    /* renamed from: a */
    private final a m12703a(InterfaceC3116fg interfaceC3116fg) {
        return new a(interfaceC3116fg);
    }

    /* renamed from: b */
    public final boolean m12707b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.f12260a.m9204n();
    }

    /* renamed from: c */
    public final void m12708c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.f12260a.m9205o();
    }

    /* renamed from: a */
    public final String m12704a() {
        String string = this.f12260a.m9196f().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    /* renamed from: a */
    public final void m12705a(Activity activity, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.f12260a.m9186a(activity, str);
    }

    /* renamed from: a */
    public final void m12706a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.f12260a.m9188a(levelPlayRewardedAdListener != null ? C3774vm.m12790b(levelPlayRewardedAdListener) : null);
    }
}
