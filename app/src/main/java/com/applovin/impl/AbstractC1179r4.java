package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.r4 */
/* loaded from: classes.dex */
public abstract class AbstractC1179r4 extends WebViewClient {
    /* renamed from: a */
    public abstract Map mo235a();

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
        mapHashMap.putAll(mo235a());
        if (AbstractC1141o0.m1952h()) {
            mapHashMap.put("source", renderProcessGoneDetail.didCrash() ? "crash" : "non_crash");
            mapHashMap.put("details", "renderer_priority_at_exit=" + renderProcessGoneDetail.rendererPriorityAtExit());
        }
        C1220k c1220k = C1220k.f2089D0;
        if (c1220k != null) {
            C1220k.f2089D0.m2832E().m575a(C0993c2.f492N0, mapHashMap, ((Long) c1220k.m2866a(C1268v4.f2855o3)).longValue());
        }
        C1240o.m3206g("RenderProcessGoneHandlingWebViewClient", "onRenderProcessGone() handled");
        return true;
    }
}
