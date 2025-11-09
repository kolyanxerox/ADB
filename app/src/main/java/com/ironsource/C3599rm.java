package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.rm */
/* loaded from: classes2.dex */
public final class C3599rm extends FrameLayout implements NativeAdViewBinderInterface {

    /* renamed from: a */
    private final NativeAdViewHolder f11200a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3599rm(Context context) {
        super(context);
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        this.f11200a = new NativeAdViewHolder();
    }

    /* renamed from: a */
    private final List<View> m11733a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = viewGroup.getChildAt(i);
            kotlin.jvm.internal.OooOo.OooO0Oo(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(View view) {
        this.f11200a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(View view) {
        this.f11200a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(View view) {
        this.f11200a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(View view) {
        this.f11200a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f11200a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(View view) {
        this.f11200a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3599rm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        this.f11200a = new NativeAdViewHolder();
    }

    /* renamed from: a */
    private final void m11734a(ViewGroup viewGroup, List<? extends View> list) {
        Iterator<? extends View> it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next());
        }
    }

    /* renamed from: a */
    public final void m11735a(C3494om nativeAd) {
        kotlin.jvm.internal.OooOo.OooO0o0(nativeAd, "nativeAd");
        List<View> listM11733a = m11733a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        m11734a(frameLayout, listM11733a);
        AdapterNativeAdViewBinder adapterNativeAdViewBinderM11179f = nativeAd.m11179f();
        if (adapterNativeAdViewBinderM11179f != null) {
            adapterNativeAdViewBinderM11179f.setBodyView(this.f11200a.getBodyView());
            adapterNativeAdViewBinderM11179f.setMediaView(this.f11200a.getMediaView());
            adapterNativeAdViewBinderM11179f.setCallToActionView(this.f11200a.getCallToActionView());
            adapterNativeAdViewBinderM11179f.setTitleView(this.f11200a.getTitleView());
            adapterNativeAdViewBinderM11179f.setIconView(this.f11200a.getIconView());
            adapterNativeAdViewBinderM11179f.setAdvertiserView(this.f11200a.getAdvertiserView());
            adapterNativeAdViewBinderM11179f.setNativeAdView(frameLayout);
            addView(adapterNativeAdViewBinderM11179f.getNetworkNativeAdView());
        }
    }
}
