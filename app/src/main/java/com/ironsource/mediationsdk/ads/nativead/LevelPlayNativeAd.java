package com.ironsource.mediationsdk.ads.nativead;

import OooOo0O.OooO0O0;
import OooOo0o.o000oOoO;
import android.app.Activity;
import com.ironsource.C3014co;
import com.ironsource.C3089eo;
import com.ironsource.C3551q9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o000o0o0.OooOOOO;

/* loaded from: classes2.dex */
public final class LevelPlayNativeAd implements NativeAdInterface, NativeAdDataInterface, InternalNativeAdListener {

    /* renamed from: a */
    private String f9565a;

    /* renamed from: b */
    private Placement f9566b;

    /* renamed from: c */
    private LevelPlayNativeAdListener f9567c;

    /* renamed from: d */
    private C3014co f9568d;

    /* renamed from: e */
    private AdapterNativeAdData f9569e;

    /* renamed from: f */
    private AdapterNativeAdViewBinder f9570f;

    /* renamed from: g */
    private final AtomicBoolean f9571g;

    public static final class Builder {

        /* renamed from: a */
        private String f9572a;

        /* renamed from: b */
        private LevelPlayNativeAdListener f9573b;

        public final LevelPlayNativeAd build() {
            return new LevelPlayNativeAd(this, null);
        }

        public final LevelPlayNativeAdListener getMListener$mediationsdk_release() {
            return this.f9573b;
        }

        public final String getMPlacementName$mediationsdk_release() {
            return this.f9572a;
        }

        public final void setMListener$mediationsdk_release(LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.f9573b = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(String str) {
            this.f9572a = str;
        }

        public final Builder withActivity(Activity activity) {
            ContextProvider.getInstance().updateActivity(activity);
            IronLog ironLog = IronLog.INTERNAL;
            StringBuilder sb = new StringBuilder("activity is updated to: ");
            sb.append(activity != null ? activity.hashCode() : 0);
            ironLog.verbose(sb.toString());
            return this;
        }

        public final Builder withListener(LevelPlayNativeAdListener listener) {
            OooOo.OooO0o0(listener, "listener");
            this.f9573b = listener;
            return this;
        }

        public final Builder withPlacementName(String str) {
            this.f9572a = str;
            return this;
        }
    }

    private LevelPlayNativeAd(Builder builder) {
        this.f9571g = new AtomicBoolean(false);
        this.f9565a = builder.getMPlacementName$mediationsdk_release();
        this.f9567c = builder.getMListener$mediationsdk_release();
    }

    /* renamed from: a */
    private final void m10053a() {
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f9567c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("init() has failed", IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    /* renamed from: b */
    private final void m10058b() {
        if (this.f9571g.compareAndSet(false, true)) {
            C3014co c3014coM10541c = C3404p.m10470j().m10541c();
            this.f9568d = c3014coM10541c;
            if (c3014coM10541c != null) {
                c3014coM10541c.m8192a(this);
                C3089eo c3089eoM10553j = C3404p.m10470j().m10553j(this.f9565a);
                OooOo.OooO0Oo(c3089eoM10553j, "getInstance().getNativeAdPlacement(mPlacementName)");
                this.f9566b = new Placement(c3089eoM10553j);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void destroyAd() {
        IronLog.API.info(String.valueOf(this));
        try {
            C3014co c3014co = this.f9568d;
            if (c3014co != null) {
                c3014co.m8190M();
            }
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getAdvertiser() {
        AdapterNativeAdData adapterNativeAdData = this.f9569e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getBody() {
        AdapterNativeAdData adapterNativeAdData = this.f9569e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getCallToAction() {
        AdapterNativeAdData adapterNativeAdData = this.f9569e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public NativeAdDataInterface.Image getIcon() {
        AdapterNativeAdData adapterNativeAdData = this.f9569e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.f9570f;
    }

    public final UUID getObjectId() {
        C3014co c3014co = this.f9568d;
        if (c3014co != null) {
            return c3014co.m11355k();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getTitle() {
        AdapterNativeAdData adapterNativeAdData = this.f9569e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void loadAd() {
        IronLog.API.info(String.valueOf(this));
        String initError = C3404p.m10470j().m10531b();
        OooOo.OooO0Oo(initError, "initError");
        if (initError.length() <= 0) {
            IronSourceThreadManager.INSTANCE.getInitHandler().post(new o000oOoO(this, 26));
            return;
        }
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f9567c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("loadAd(): ".concat(initError), IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdClicked(AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new OooOOOO(this, adInfo, 0), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdImpression(AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new OooOOOO(this, adInfo, 1), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new io.flutter.plugins.webviewflutter.OooOOOO(10, this, ironSourceError), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoaded(AdInfo adInfo, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        OooOo.OooO0o0(adapterNativeAdData, "adapterNativeAdData");
        OooOo.OooO0o0(nativeAdViewBinder, "nativeAdViewBinder");
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new OooO0O0(this, adapterNativeAdData, nativeAdViewBinder, adInfo, 26), 0L, 2, null);
    }

    public final void setListener(LevelPlayNativeAdListener levelPlayNativeAdListener) {
        this.f9567c = levelPlayNativeAdListener;
    }

    public /* synthetic */ LevelPlayNativeAd(Builder builder, OooOO0O oooOO0O) {
        this(builder);
    }

    /* renamed from: a */
    public static final void m10054a(LevelPlayNativeAd this$0) {
        oo00o.OooOo oooOo;
        OooOo.OooO0o0(this$0, "this$0");
        this$0.m10058b();
        C3014co c3014co = this$0.f9568d;
        if (c3014co != null) {
            c3014co.m8194a(this$0.f9566b);
            oooOo = oo00o.OooOo.f33195OooO00o;
        } else {
            oooOo = null;
        }
        if (oooOo == null) {
            this$0.m10053a();
        }
    }

    /* renamed from: b */
    public static final void m10059b(LevelPlayNativeAd this$0, AdInfo adInfo) {
        OooOo.OooO0o0(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f9567c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdImpression(this$0, adInfo);
        }
    }

    /* renamed from: a */
    public static final void m10055a(LevelPlayNativeAd this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        OooOo.OooO0o0(this$0, "this$0");
        OooOo.OooO0o0(adapterNativeAdData, "$adapterNativeAdData");
        OooOo.OooO0o0(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.f9569e = adapterNativeAdData;
        this$0.f9570f = nativeAdViewBinder;
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f9567c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoaded(this$0, adInfo);
        }
    }

    /* renamed from: a */
    public static final void m10056a(LevelPlayNativeAd this$0, AdInfo adInfo) {
        OooOo.OooO0o0(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f9567c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdClicked(this$0, adInfo);
        }
    }

    /* renamed from: a */
    public static final void m10057a(LevelPlayNativeAd this$0, IronSourceError ironSourceError) {
        OooOo.OooO0o0(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f9567c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this$0, ironSourceError);
        }
    }
}
