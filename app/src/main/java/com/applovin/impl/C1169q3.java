package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* renamed from: com.applovin.impl.q3 */
/* loaded from: classes.dex */
public class C1169q3 {

    /* renamed from: a */
    private a f1792a;

    /* renamed from: b */
    private String f1793b;

    /* renamed from: com.applovin.impl.q3$a */
    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    public C1169q3(a aVar, String str) {
        this.f1792a = aVar;
        this.f1793b = str;
    }

    /* renamed from: a */
    public a m2255a() {
        return this.f1792a;
    }

    /* renamed from: b */
    public String m2256b() {
        return this.f1793b;
    }

    /* renamed from: a */
    public static C1169q3 m2254a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new C1169q3(a.AD_UNIT_ID, str);
    }

    /* renamed from: a */
    public static C1169q3 m2253a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new C1169q3(a.AD_FORMAT, label);
    }

    /* renamed from: a */
    public static C1169q3 m2252a(AbstractC1266v2 abstractC1266v2) {
        String strM3518P = abstractC1266v2.m3518P();
        MaxAdFormat format = abstractC1266v2.getFormat();
        if (TextUtils.isEmpty(strM3518P) || format == null) {
            return null;
        }
        return new C1134n3(new C1034g3(strM3518P, format));
    }
}
