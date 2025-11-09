package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.g2 */
/* loaded from: classes.dex */
public class C1033g2 implements InterfaceC1023f2 {

    /* renamed from: a */
    private final C1220k f769a;

    /* renamed from: b */
    private final C1240o f770b;

    public C1033g2(C1220k c1220k) {
        this.f769a = c1220k;
        this.f770b = c1220k.m2847O();
    }

    @Override // com.applovin.impl.InterfaceC1023f2
    /* renamed from: a */
    public InputStream mo108a(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(((Integer) this.f769a.m2866a(C1268v4.f2669R2)).intValue());
        httpURLConnection.setReadTimeout(((Integer) this.f769a.m2866a(C1268v4.f2677S2)).intValue());
        httpURLConnection.setDefaultUseCaches(true);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        int responseCode = httpURLConnection.getResponseCode();
        this.f769a.m2832E().m2149a("loadResource", str, responseCode, httpURLConnection.getResponseMessage());
        if (AbstractC1175r0.m2291a(responseCode)) {
            return null;
        }
        if (C1240o.m3200a()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Opened stream to resource ", str, this.f770b, "HttpUrlConnectionLoader");
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "HttpUrlConnectionLoader", mapHashMap);
        this.f769a.m2897g().m576d(C0993c2.f469C, mapHashMap);
        return inputStream;
    }
}
