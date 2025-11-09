package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.WaterfallConfiguration;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.hk */
/* loaded from: classes2.dex */
public class C3190hk {

    /* renamed from: a */
    C3591re f8872a = new C3591re();

    /* renamed from: com.ironsource.hk$a */
    public class a extends AbstractRunnableC3302ks {

        /* renamed from: a */
        final /* synthetic */ EnumC3745us f8873a;

        public a(EnumC3745us enumC3745us) {
            this.f8873a = enumC3745us;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            C3190hk.this.f8872a.m11716a(C3451ne.f10473f0, new JSONArray().put(this.f8873a.m12716b()));
        }
    }

    /* renamed from: a */
    public void m9131a(int i) {
        this.f8872a.m11714a(C3451ne.f10479h0, Integer.valueOf(i));
    }

    /* renamed from: b */
    public void m9140b(int i) {
        if (i >= 0) {
            this.f8872a.m11714a(C3451ne.f10440R0, Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    public void m9145c(int i) {
        this.f8872a.m11714a(C3451ne.f10470e0, Integer.valueOf(i));
    }

    /* renamed from: d */
    public void m9147d(String str) {
        this.f8872a.m11714a(C3451ne.f10426K0, str);
    }

    /* renamed from: e */
    public void m9148e(String str) {
        this.f8872a.m11714a(C3401a.f9922i, str);
    }

    /* renamed from: f */
    public void m9149f(String str) {
        this.f8872a.m11714a(C3451ne.f10454Y0, str);
    }

    /* renamed from: g */
    public void m9150g(String str) {
        this.f8872a.m11714a(C3451ne.f10399A, str);
    }

    /* renamed from: h */
    public void m9151h(String str) {
        this.f8872a.m11714a(C3451ne.f10462b1, str);
    }

    /* renamed from: i */
    public void m9152i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f8872a.m11714a(C3451ne.f10467d0, str);
    }

    /* renamed from: a */
    public void m9132a(Context context) {
        this.f8872a.m11712a(context);
    }

    /* renamed from: b */
    public void m9141b(Context context) {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        ActivityManager.MemoryInfo memoryInfoMo4885z = interfaceC3767vfMo8686f.mo4885z(context);
        this.f8872a.m11714a(C3451ne.f10523w, interfaceC3767vfMo8686f.mo4843c(memoryInfoMo4885z));
        this.f8872a.m11714a(C3451ne.f10526x, interfaceC3767vfMo8686f.mo4840b(memoryInfoMo4885z));
    }

    /* renamed from: c */
    public void m9146c(String str) {
        this.f8872a.m11714a(C3451ne.f10422I0, str);
    }

    /* renamed from: a */
    public void m9133a(IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (waterfallConfiguration != null) {
            try {
                jSONObject.put(C3451ne.f10513s1, waterfallConfiguration.getFloor());
                jSONObject.put(C3451ne.f10516t1, waterfallConfiguration.getCeiling());
            } catch (JSONException e) {
                C3551q9.m11517d().m11519a(e);
            }
        }
        if (jSONObject.length() == 0) {
            this.f8872a.m11713a(C3451ne.f10510r1, C3754v2.m12730a(ad_unit));
        } else {
            this.f8872a.m11715a(C3451ne.f10510r1, jSONObject, C3754v2.m12730a(ad_unit));
        }
    }

    /* renamed from: b */
    public void m9142b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f8872a.m11714a(C3451ne.f10404B1, str);
    }

    /* renamed from: a */
    public void m9134a(C3488og c3488og) {
        try {
            HashMap map = new HashMap();
            map.put(C3451ne.f10408D, c3488og.m11152a());
            map.put(C3451ne.f10405C, c3488og.m11153b());
            map.put(C3451ne.f10445U, c3488og.m11154c());
            this.f8872a.m11718a(map);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
        }
    }

    /* renamed from: b */
    public void m9143b(JSONObject jSONObject) {
        this.f8872a.m11714a(C3451ne.f10468d1, (Object) jSONObject);
    }

    /* renamed from: a */
    public void m9135a(EnumC3745us enumC3745us) {
        new Thread(new a(enumC3745us)).start();
    }

    /* renamed from: b */
    public void m9144b(boolean z) {
        this.f8872a.m11714a("gpi", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void m9136a(Boolean bool) {
        this.f8872a.m11714a(C3451ne.f10442S0, bool);
    }

    /* renamed from: a */
    public void m9137a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f8872a.m11714a(C3451ne.f10432N0, str);
    }

    /* renamed from: a */
    public void m9138a(JSONObject jSONObject) {
        this.f8872a.m11714a(C3451ne.f10517u, (Object) jSONObject);
    }

    /* renamed from: a */
    public void m9139a(boolean z) {
        this.f8872a.m11714a(C3451ne.f10436P0, Boolean.valueOf(z));
    }
}
