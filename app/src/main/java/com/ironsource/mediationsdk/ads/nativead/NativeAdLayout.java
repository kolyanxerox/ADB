package com.ironsource.mediationsdk.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class NativeAdLayout extends FrameLayout implements NativeAdViewBinderInterface {

    /* renamed from: a */
    private final NativeAdViewHolder f9574a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(Context context) {
        super(context);
        OooOo.OooO0o0(context, "context");
        this.f9574a = new NativeAdViewHolder();
    }

    /* renamed from: a */
    private final List<View> m10060a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = viewGroup.getChildAt(i);
            OooOo.OooO0Oo(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }

    public final void registerNativeAdViews(LevelPlayNativeAd nativeAd) {
        OooOo.OooO0o0(nativeAd, "nativeAd");
        List<View> listM10060a = m10060a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        m10061a(frameLayout, listM10060a);
        AdapterNativeAdViewBinder nativeAdViewBinder = nativeAd.getNativeAdViewBinder();
        if (nativeAdViewBinder != null) {
            nativeAdViewBinder.setBodyView(this.f9574a.getBodyView());
            nativeAdViewBinder.setMediaView(this.f9574a.getMediaView());
            nativeAdViewBinder.setCallToActionView(this.f9574a.getCallToActionView());
            nativeAdViewBinder.setTitleView(this.f9574a.getTitleView());
            nativeAdViewBinder.setIconView(this.f9574a.getIconView());
            nativeAdViewBinder.setAdvertiserView(this.f9574a.getAdvertiserView());
            nativeAdViewBinder.setNativeAdView(frameLayout);
            addView(nativeAdViewBinder.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(View view) {
        this.f9574a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(View view) {
        this.f9574a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(View view) {
        this.f9574a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(View view) {
        this.f9574a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f9574a.setMediaView(levelPlayMediaView);
    }

    public final void setNativeAd(LevelPlayNativeAd nativeAd) {
        OooOo.OooO0o0(nativeAd, "nativeAd");
        registerNativeAdViews(nativeAd);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(View view) {
        this.f9574a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooOo.OooO0o0(context, "context");
        this.f9574a = new NativeAdViewHolder();
    }

    /* renamed from: a */
    private final void m10061a(ViewGroup viewGroup, List<? extends View> list) {
        Iterator<? extends View> it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next());
        }
    }
}
