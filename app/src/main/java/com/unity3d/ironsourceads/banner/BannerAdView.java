package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.C3513p6;
import com.ironsource.InterfaceC3548q6;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class BannerAdView extends FrameLayout implements InterfaceC3548q6 {

    /* renamed from: a */
    private C3513p6 f13088a;

    /* renamed from: b */
    private BannerAdViewListener f13089b;

    private BannerAdView(Context context) {
        super(context);
    }

    public final BannerAdInfo getAdInfo() {
        C3513p6 c3513p6 = this.f13088a;
        if (c3513p6 != null) {
            return c3513p6.m11299c();
        }
        OooOo.OooOO0o("bannerAdViewInternal");
        throw null;
    }

    public final BannerAdViewListener getListener() {
        return this.f13089b;
    }

    @Override // com.ironsource.InterfaceC3548q6
    public void onBannerAdClicked() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f13089b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC3548q6
    public void onBannerAdShown() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f13089b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(BannerAdViewListener bannerAdViewListener) {
        this.f13089b = bannerAdViewListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerAdView(C3513p6 bannerAdViewInternal) {
        OooOo.OooO0o0(bannerAdViewInternal, "bannerAdViewInternal");
        Context context = bannerAdViewInternal.m11300d().getContext();
        OooOo.OooO0Oo(context, "bannerAdViewInternal.container.context");
        this(context);
        this.f13088a = bannerAdViewInternal;
        bannerAdViewInternal.m11296a(new WeakReference<>(this));
        bannerAdViewInternal.m11298b(new WeakReference<>(this));
    }
}
