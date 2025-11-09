package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ap */
/* loaded from: classes2.dex */
public final class C1393ap extends AbstractC1870no {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        String string = webResourceRequest.getUrl().toString();
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (!(webView instanceof InterfaceC1722jo)) {
            zzo.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) webView;
        InterfaceC1792lk interfaceC1792lk = this.f21547OoooO;
        if (interfaceC1792lk != null) {
            ((C1718jk) interfaceC1792lk).OooO00o(string, 1, requestHeaders);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(string).getName())) {
            if (requestHeaders == null) {
                requestHeaders = Collections.EMPTY_MAP;
            }
            return OoooOo0(string, requestHeaders);
        }
        if (interfaceC1722jo.zzN() != null) {
            AbstractC1870no abstractC1870noZzN = interfaceC1722jo.zzN();
            synchronized (abstractC1870noZzN.f21530OooOoO0) {
                abstractC1870noZzN.f21539Oooo00O = false;
                abstractC1870noZzN.f21544Oooo0o0 = true;
                AbstractC2200wl.f25325OooO0o.execute(new RunnableC1442c1(abstractC1870noZzN, 16));
            }
        }
        if (interfaceC1722jo.zzO().OooO0O0()) {
            str = (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17758OoooOoo);
        } else if (interfaceC1722jo.OooOOoo()) {
            str = (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17757OoooOoO);
        } else {
            str = (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17756OoooOo0);
        }
        zzv.zzq();
        return zzs.zzy(interfaceC1722jo.getContext(), interfaceC1722jo.zzn().afmaVersion, str);
    }
}
