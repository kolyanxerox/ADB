package com.unity3d.services.core.webview;

import OooO0oO.OooOo;
import com.ironsource.C3034d9;
import com.ironsource.C3037dc;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;

/* loaded from: classes3.dex */
public class WebViewUrlBuilder {
    private final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        StringBuilder sbOooOo0O = OooOo.OooOo0O("?platform=android" + buildQueryParam(C3037dc.f8261p, configuration.getWebViewUrl()));
        sbOooOo0O.append(buildQueryParam("version", configuration.getWebViewVersion()));
        StringBuilder sbOooOo0O2 = OooOo.OooOo0O(sbOooOo0O.toString());
        sbOooOo0O2.append(buildQueryParam("isNativeCollectingMetrics", String.valueOf(configuration.areMetricsEnabledForCurrentSession())));
        this._urlWithQueryString = OooOo.OooOoo0(str, sbOooOo0O2.toString());
    }

    private String buildQueryParam(String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (str2 == null) {
            return "";
        }
        try {
            return C3034d9.i.f8175c + str + C3034d9.i.f8173b + URLEncoder.encode(str2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            DeviceLog.exception("Unsupported charset when encoding " + str, e);
            return "";
        }
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}
