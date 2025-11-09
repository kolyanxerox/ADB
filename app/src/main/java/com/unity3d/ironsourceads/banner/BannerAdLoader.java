package com.unity3d.ironsourceads.banner;

import com.ironsource.C3107f7;
import com.ironsource.C3426mo;
import com.ironsource.C3523pg;
import com.ironsource.InterfaceC3048dn;
import com.ironsource.InterfaceC3158gn;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.OooOo;
import o000oo.o0O0O00;

/* loaded from: classes3.dex */
public final class BannerAdLoader {
    public static final BannerAdLoader INSTANCE = new BannerAdLoader();

    /* renamed from: a */
    private static final Executor f13075a = C3523pg.f10822a.m11401c();

    private BannerAdLoader() {
    }

    /* renamed from: a */
    public static final void m13441a(InterfaceC3048dn loadTask) {
        OooOo.OooO0o0(loadTask, "$loadTask");
        loadTask.start();
    }

    public static final void loadAd(BannerAdRequest adRequest, BannerAdLoaderListener listener) {
        OooOo.OooO0o0(adRequest, "adRequest");
        OooOo.OooO0o0(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f13075a, new C3107f7(adRequest, listener, C3426mo.f10310e.m10881a(IronSource.AD_UNIT.BANNER), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, InterfaceC3158gn loadTaskProvider) {
        OooOo.OooO0o0(executor, "executor");
        OooOo.OooO0o0(loadTaskProvider, "loadTaskProvider");
        executor.execute(new o0O0O00(loadTaskProvider.mo8642a(), 1));
    }
}
