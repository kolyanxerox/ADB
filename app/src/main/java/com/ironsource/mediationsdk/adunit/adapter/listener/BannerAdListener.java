package com.ironsource.mediationsdk.adunit.adapter.listener;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;

/* loaded from: classes2.dex */
public interface BannerAdListener extends AdapterAdViewListener {
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams);
}
