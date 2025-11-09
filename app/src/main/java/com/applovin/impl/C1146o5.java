package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.C0987b6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.network.C1235a;
import com.applovin.impl.sdk.network.C1239e;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.o5 */
/* loaded from: classes.dex */
public class C1146o5 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final C1239e f1672g;

    /* renamed from: h */
    private final AppLovinPostbackListener f1673h;

    /* renamed from: i */
    private final C0987b6.b f1674i;

    /* renamed from: com.applovin.impl.o5$a */
    public class a implements AppLovinPostbackListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i) {
            C1146o5.this.m2016e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (C1146o5.this.f1673h != null) {
                C1146o5.this.f1673h.onPostbackSuccess(C1146o5.this.f1672g.m3081f());
            }
        }
    }

    public C1146o5(C1239e c1239e, C0987b6.b bVar, C1220k c1220k, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", c1220k);
        if (c1239e == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f1672g = c1239e;
        this.f1673h = appLovinPostbackListener;
        this.f1674i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m2016e() {
        b bVar = new b(this.f1672g, m795b());
        bVar.m1095a(this.f1674i);
        m795b().m2918r0().m402a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f1672g.m3081f())) {
            if (this.f1672g.m3179u()) {
                m795b().m2932y0().m1018a(this.f1672g, new a());
                return;
            } else {
                m2016e();
                return;
            }
        }
        if (C1240o.m3200a()) {
            this.f778c.m3215d(this.f777b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f1673h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f1672g.m3081f(), AppLovinErrorCodes.INVALID_URL);
        }
    }

    /* renamed from: com.applovin.impl.o5$b */
    public class b extends AbstractC1067j6 {

        /* renamed from: m */
        final String f1676m;

        public b(C1235a c1235a, C1220k c1220k) {
            super(c1235a, c1220k);
            this.f1676m = C1146o5.this.f1672g.m3081f();
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a */
        public void mo933a(String str, Object obj, int i) {
            if (obj instanceof String) {
                for (String str2 : this.f776a.m2888c(C1268v4.f2828l0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                AbstractC1175r0.m2300c(jSONObject, this.f776a);
                                AbstractC1175r0.m2298b(jSONObject, this.f776a);
                                AbstractC1175r0.m2289a(jSONObject, this.f776a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (C1146o5.this.f1673h != null) {
                C1146o5.this.f1673h.onPostbackSuccess(this.f1676m);
            }
            if (C1146o5.this.f1672g.m3178t()) {
                this.f776a.m2923u().m2773a(C1146o5.this.f1672g.m3177s(), this.f1676m, i, obj, null, true);
            }
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a */
        public void mo931a(String str, int i, String str2, Object obj) {
            if (C1240o.m3200a()) {
                C1240o c1240o = this.f778c;
                String str3 = this.f777b;
                StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Failed to dispatch postback. Error code: ", " URL: ");
                sbOooOOo0.append(this.f1676m);
                c1240o.m3214b(str3, sbOooOOo0.toString());
            }
            if (C1146o5.this.f1673h != null) {
                C1146o5.this.f1673h.onPostbackFailure(this.f1676m, i);
            }
            if (C1146o5.this.f1672g.m3178t()) {
                this.f776a.m2923u().m2773a(C1146o5.this.f1672g.m3177s(), this.f1676m, i, obj, str2, false);
            }
        }
    }
}
