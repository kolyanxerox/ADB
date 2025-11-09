package com.applovin.impl;

import com.applovin.impl.sdk.p005ad.AbstractC1207b;

/* renamed from: com.applovin.impl.p1 */
/* loaded from: classes.dex */
public class C1151p1 {

    /* renamed from: a */
    private final long f1699a;

    /* renamed from: b */
    private final Object f1700b;

    /* renamed from: c */
    private String f1701c;

    /* renamed from: d */
    private String f1702d;

    public C1151p1(Object obj, long j) {
        this.f1700b = obj;
        this.f1699a = j;
        if (obj instanceof AbstractC1207b) {
            AbstractC1207b abstractC1207b = (AbstractC1207b) obj;
            this.f1701c = abstractC1207b.getAdZone().m3374d() != null ? abstractC1207b.getAdZone().m3374d().getLabel() : null;
            this.f1702d = "AppLovin";
        } else if (obj instanceof AbstractC1266v2) {
            AbstractC1266v2 abstractC1266v2 = (AbstractC1266v2) obj;
            this.f1701c = abstractC1266v2.getFormat().getLabel();
            this.f1702d = abstractC1266v2.getNetworkName();
        }
    }

    /* renamed from: a */
    public Object m2053a() {
        return this.f1700b;
    }

    /* renamed from: b */
    public long m2054b() {
        return this.f1699a;
    }

    /* renamed from: c */
    public String m2055c() {
        String str = this.f1701c;
        return str != null ? str : "Unknown";
    }

    /* renamed from: d */
    public String m2056d() {
        String str = this.f1702d;
        return str != null ? str : "Unknown";
    }
}
