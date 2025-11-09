package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.impl.a4 */
/* loaded from: classes.dex */
public class C0957a4 implements InterfaceC1023f2 {

    /* renamed from: a */
    private final C1220k f179a;

    /* renamed from: b */
    private final C1240o f180b;

    /* renamed from: c */
    private final AtomicReference f181c = new AtomicReference();

    public C0957a4(C1220k c1220k) {
        this.f179a = c1220k;
        this.f180b = c1220k.m2847O();
    }

    /* renamed from: a */
    private OkHttpClient m107a() {
        Object objBuild = this.f181c.get();
        if (objBuild == null) {
            synchronized (this.f181c) {
                try {
                    objBuild = this.f181c.get();
                    if (objBuild == null) {
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        long jIntValue = ((Integer) this.f179a.m2866a(C1268v4.f2669R2)).intValue();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        objBuild = builder.connectTimeout(jIntValue, timeUnit).readTimeout(((Integer) this.f179a.m2866a(C1268v4.f2677S2)).intValue(), timeUnit).followRedirects(true).followSslRedirects(true).build();
                        if (objBuild == null) {
                            objBuild = this.f181c;
                        }
                        this.f181c.set(objBuild);
                    }
                } finally {
                }
            }
        }
        if (objBuild == this.f181c) {
            objBuild = null;
        }
        return (OkHttpClient) objBuild;
    }

    @Override // com.applovin.impl.InterfaceC1023f2
    /* renamed from: a */
    public InputStream mo108a(String str, Map map) throws IOException {
        Response responseExecute = m107a().newCall(new Request.Builder().url(str).get().build()).execute();
        int iCode = responseExecute.code();
        this.f179a.m2832E().m2149a("loadResource", str, iCode, responseExecute.message());
        if (AbstractC1175r0.m2291a(iCode)) {
            return null;
        }
        if (C1240o.m3200a()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Opened stream to resource ", str, this.f180b, "OkHttpLoader");
        }
        ResponseBody responseBodyBody = responseExecute.body();
        if (responseBodyBody == null) {
            return null;
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "OkHttpLoader", mapHashMap);
        CollectionUtils.putStringIfValid("details", responseExecute.protocol().name(), mapHashMap);
        this.f179a.m2897g().m576d(C0993c2.f469C, mapHashMap);
        return responseBodyBody.byteStream();
    }
}
