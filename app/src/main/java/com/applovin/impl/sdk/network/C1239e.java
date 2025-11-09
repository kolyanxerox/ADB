package com.applovin.impl.sdk.network;

import com.applovin.impl.AbstractC1188s4;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.network.C1235a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.e */
/* loaded from: classes.dex */
public class C1239e extends C1235a {

    /* renamed from: s */
    private String f2335s;

    /* renamed from: t */
    private boolean f2336t;

    /* renamed from: com.applovin.impl.sdk.network.e$a */
    public static class a extends C1235a.a {

        /* renamed from: r */
        private String f2337r;

        /* renamed from: s */
        private boolean f2338s;

        public a(C1220k c1220k) {
            super(c1220k);
            this.f2284h = ((Integer) c1220k.m2866a(C1268v4.f2573F2)).intValue();
            this.f2285i = ((Integer) c1220k.m2866a(C1268v4.f2565E2)).intValue();
            this.f2286j = ((Integer) c1220k.m2866a(C1268v4.f2661Q2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo3097a(String str) {
            this.f2279c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a mo3102b(int i) {
            this.f2286j = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a mo3103b(String str) {
            this.f2278b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a mo3107c(String str) {
            this.f2277a = str;
            return this;
        }

        /* renamed from: h */
        public a m3196h(boolean z) {
            this.f2338s = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a mo3105b(boolean z) {
            this.f2292p = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo3104b(Map map) {
            this.f2280d = map;
            return this;
        }

        /* renamed from: e */
        public a m3191e(String str) {
            this.f2337r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a mo3106c(int i) {
            this.f2285i = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a mo3100a(boolean z) {
            this.f2290n = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a mo3098a(Map map) {
            this.f2281e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo3094a(int i) {
            this.f2284h = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a mo3099a(JSONObject jSONObject) {
            this.f2282f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a mo3096a(Object obj) {
            this.f2283g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a mo3095a(AbstractC1188s4.a aVar) {
            this.f2293q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1235a.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1239e mo3101a() {
            return new C1239e(this);
        }
    }

    public C1239e(a aVar) {
        super(aVar);
        this.f2335s = aVar.f2337r;
        this.f2336t = aVar.f2338s;
    }

    /* renamed from: b */
    public static a m3176b(C1220k c1220k) {
        return new a(c1220k);
    }

    /* renamed from: s */
    public String m3177s() {
        return this.f2335s;
    }

    /* renamed from: t */
    public boolean m3178t() {
        return this.f2335s != null;
    }

    /* renamed from: u */
    public boolean m3179u() {
        return this.f2336t;
    }
}
