package com.applovin.applovin_max;

import android.content.Context;
import com.applovin.sdk.AppLovinSdk;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.Map;

/* loaded from: classes.dex */
public class AppLovinMAXNativeAdViewFactory extends PlatformViewFactory {
    private final BinaryMessenger messenger;

    public AppLovinMAXNativeAdViewFactory(BinaryMessenger binaryMessenger) {
        super(StandardMessageCodec.INSTANCE);
        this.messenger = binaryMessenger;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i, Object obj) {
        AppLovinSdk sdk = AppLovinMAX.getInstance().getSdk();
        Map map = (Map) obj;
        String str = (String) map.get("ad_unit_id");
        AppLovinMAX.m58d("Creating MaxNativeAdView widget with Ad Unit ID: " + str);
        return new AppLovinMAXNativeAdView(i, str, map.containsKey("placement") ? (String) map.get("placement") : null, map.containsKey("custom_data") ? (String) map.get("custom_data") : null, map.containsKey("extra_parameters") ? (Map) map.get("extra_parameters") : null, map.containsKey("local_extra_parameters") ? (Map) map.get("local_extra_parameters") : null, this.messenger, sdk, context);
    }
}
