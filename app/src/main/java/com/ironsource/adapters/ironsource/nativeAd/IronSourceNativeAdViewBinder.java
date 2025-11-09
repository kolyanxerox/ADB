package com.ironsource.adapters.ironsource.nativeAd;

import OooOOO0.OooO00o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.C3008ci;
import com.ironsource.C3871yh;
import com.ironsource.C3905zh;
import com.ironsource.InterfaceC2973bi;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.C3658R;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class IronSourceNativeAdViewBinder extends AdapterNativeAdViewBinder {
    private final InterfaceC2973bi nativeAd;
    private final NativeAdProperties nativeAdProperties;
    private C3871yh networkNativeAdView;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdOptionsPosition.values().length];
            try {
                iArr[AdOptionsPosition.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdOptionsPosition.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IronSourceNativeAdViewBinder(InterfaceC2973bi nativeAd, NativeAdProperties nativeAdProperties) {
        OooOo.OooO0o0(nativeAd, "nativeAd");
        OooOo.OooO0o0(nativeAdProperties, "nativeAdProperties");
        this.nativeAd = nativeAd;
        this.nativeAdProperties = nativeAdProperties;
    }

    @SuppressLint({"RtlHardcoded"})
    private final FrameLayout.LayoutParams getPrivacyIconLayoutParams() {
        int i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.nativeAdProperties.getAdOptionsPosition().ordinal()];
        if (i2 == 1) {
            i = 51;
        } else if (i2 == 2) {
            i = 53;
        } else if (i2 == 3) {
            i = 83;
        } else {
            if (i2 != 4) {
                throw new OooO00o();
            }
            i = 85;
        }
        layoutParams.gravity = i;
        return layoutParams;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public void setNativeAdView(View view) {
        if (view == null) {
            IronLog.INTERNAL.error("nativeAdView is null");
            return;
        }
        if (this.nativeAd.mo7931b() == null) {
            IronLog.INTERNAL.error("nativeAd.adData is null");
            return;
        }
        LevelPlayMediaView mediaView = getNativeAdViewHolder().getMediaView();
        if (mediaView != null) {
            C3905zh c3905zhMo7931b = this.nativeAd.mo7931b();
            OooOo.OooO0O0(c3905zhMo7931b);
            WebView webViewM13362l = c3905zhMo7931b.m13362l();
            if (webViewM13362l != null) {
                mediaView.addView(webViewM13362l, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        C3905zh c3905zhMo7931b2 = this.nativeAd.mo7931b();
        OooOo.OooO0O0(c3905zhMo7931b2);
        View viewM13363m = c3905zhMo7931b2.m13363m();
        viewM13363m.setId(C3658R.id.privacy_icon_button);
        viewM13363m.setLayoutParams(getPrivacyIconLayoutParams());
        Context context = view.getContext();
        OooOo.OooO0Oo(context, "context");
        C3871yh c3871yh = new C3871yh(context);
        c3871yh.addView(view);
        c3871yh.addView(viewM13363m);
        this.networkNativeAdView = c3871yh;
        C3871yh networkNativeAdView = getNetworkNativeAdView();
        OooOo.OooO0O0(networkNativeAdView);
        this.nativeAd.mo7930a(new C3008ci(networkNativeAdView, getNativeAdViewHolder().getTitleView(), getNativeAdViewHolder().getAdvertiserView(), getNativeAdViewHolder().getIconView(), getNativeAdViewHolder().getBodyView(), getNativeAdViewHolder().getMediaView(), getNativeAdViewHolder().getCallToActionView(), viewM13363m));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public C3871yh getNetworkNativeAdView() {
        return this.networkNativeAdView;
    }
}
