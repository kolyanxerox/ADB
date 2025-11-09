package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.network.C1235a;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.n0 */
/* loaded from: classes.dex */
public class C1131n0 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final String f1509g;

    /* renamed from: h */
    private final C1235a f1510h;

    public C1131n0(String str, C1235a c1235a, C1220k c1220k) {
        super("CommunicatorRequestTask", c1220k, str);
        this.f1509g = str;
        this.f1510h = c1235a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f776a.m2918r0().m402a(new a(this.f1510h, this.f776a, m798d()));
    }

    /* renamed from: com.applovin.impl.n0$a */
    public class a extends AbstractC1067j6 {
        public a(C1235a c1235a, C1220k c1220k, boolean z) {
            super(c1235a, c1220k, z);
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo933a(String str, JSONObject jSONObject, int i) {
            this.f776a.m2923u().m2773a(C1131n0.this.f1509g, C1131n0.this.f1510h.m3081f(), i, jSONObject, null, true);
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo931a(String str, int i, String str2, JSONObject jSONObject) {
            this.f776a.m2923u().m2773a(C1131n0.this.f1509g, C1131n0.this.f1510h.m3081f(), i, jSONObject, str2, false);
        }
    }
}
