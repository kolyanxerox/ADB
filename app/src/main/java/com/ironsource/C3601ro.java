package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3034d9;
import com.ironsource.C3419mh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ro */
/* loaded from: classes2.dex */
public class C3601ro {

    /* renamed from: b */
    private final InterfaceC3767vf f11203b = C3495on.m11199U().mo8686f();

    /* renamed from: a */
    C3591re f11202a = new C3591re();

    /* renamed from: a */
    public void m11744a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f11202a.m11717a("debug", jSONObject);
        }
    }

    /* renamed from: b */
    public void m11751b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f11202a.m11714a(C3451ne.f10481i, new JSONObject(controllerConfig).opt(C3034d9.a.f7930q));
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: c */
    public void m11753c() {
        this.f11202a.m11714a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    /* renamed from: d */
    public void m11754d() {
        this.f11202a.m11714a(C3451ne.f10445U, "8.10.0");
    }

    /* renamed from: e */
    public void m11755e() {
        HashMap map = new HashMap();
        map.put(C3451ne.f10408D, C3264jp.f9138f);
        map.put(C3451ne.f10405C, C3264jp.f9137e);
        this.f11202a.m11718a(map);
    }

    /* renamed from: a */
    public void m11745a(Context context) {
        if (context instanceof Activity) {
            this.f11202a.m11714a(C3451ne.f10496n, Boolean.valueOf(this.f11203b.mo4839a((Activity) context)));
        }
    }

    /* renamed from: b */
    public void m11752b(Context context) {
        this.f11202a.m11714a("gpi", Boolean.valueOf(C3126fq.m8739d(context)));
    }

    /* renamed from: a */
    public void m11746a(C3419mh.c cVar) {
        this.f11202a.m11714a(C3451ne.f10525w1, Integer.valueOf(cVar.ordinal()));
    }

    /* renamed from: a */
    public void m11747a(List<String> list) {
        this.f11202a.m11714a(C3451ne.f10534z1, list);
    }

    /* renamed from: a */
    public void m11748a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.f11202a.m11714a(entry.getKey(), (Object) entry.getValue());
        }
    }

    /* renamed from: a */
    public void m11749a(JSONObject jSONObject) throws JSONException {
        this.f11202a.m11717a(C3451ne.f10490l, jSONObject);
    }

    /* renamed from: a */
    public void m11750a(boolean z) {
        this.f11202a.m11714a(C3451ne.f10438Q0, Boolean.valueOf(z));
    }
}
