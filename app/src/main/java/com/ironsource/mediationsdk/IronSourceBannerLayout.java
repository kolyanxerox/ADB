package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.C3687t5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

@Deprecated
/* loaded from: classes2.dex */
public class IronSourceBannerLayout extends FrameLayout {

    /* renamed from: a */
    private ISBannerSize f9530a;

    /* renamed from: b */
    private String f9531b;

    /* renamed from: c */
    private Activity f9532c;

    /* renamed from: d */
    private boolean f9533d;

    /* renamed from: e */
    private InterfaceC3363a f9534e;

    /* renamed from: com.ironsource.mediationsdk.IronSourceBannerLayout$a */
    public interface InterfaceC3363a {
        void onWindowFocusChanged(boolean z);
    }

    @Deprecated
    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f9533d = false;
        this.f9532c = activity;
        this.f9530a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* renamed from: a */
    public void m10026a() {
        this.f9533d = true;
        this.f9532c = null;
        this.f9530a = null;
        this.f9531b = null;
        this.f9534e = null;
        removeBannerListener();
    }

    /* renamed from: b */
    public IronSourceBannerLayout m10027b() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(getContext(), this.f9530a);
        ironSourceBannerLayout.setPlacementName(this.f9531b);
        return ironSourceBannerLayout;
    }

    @Deprecated
    public Activity getActivity() {
        return this.f9532c;
    }

    public LevelPlayBannerListener getLevelPlayBannerListener() {
        return C3687t5.m12363a().m12386b();
    }

    public String getPlacementName() {
        return this.f9531b;
    }

    public ISBannerSize getSize() {
        return this.f9530a;
    }

    public InterfaceC3363a getWindowFocusChangedListener() {
        return this.f9534e;
    }

    public boolean isDestroyed() {
        return this.f9533d;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        InterfaceC3363a interfaceC3363a = this.f9534e;
        if (interfaceC3363a != null) {
            interfaceC3363a.onWindowFocusChanged(z);
        }
    }

    public void removeBannerListener() {
        IronLog.API.info();
        C3687t5.m12363a().m12385a((LevelPlayBannerListener) null);
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.f9530a = iSBannerSize;
    }

    @Deprecated
    public void setLevelPlayBannerListener(LevelPlayBannerListener levelPlayBannerListener) {
        IronLog.API.info();
        C3687t5.m12363a().m12385a(levelPlayBannerListener);
    }

    public void setPlacementName(String str) {
        this.f9531b = str;
    }

    public void setWindowFocusChangedListener(InterfaceC3363a interfaceC3363a) {
        this.f9534e = interfaceC3363a;
    }

    public IronSourceBannerLayout(Context context) {
        super(context);
        this.f9533d = false;
    }

    public IronSourceBannerLayout(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.f9533d = false;
        this.f9530a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }
}
