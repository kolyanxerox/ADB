package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;

/* renamed from: com.applovin.impl.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC1150p0 {

    /* renamed from: a */
    private static final a f1694a = new a("Age Restricted User", C1286x4.f3062q);

    /* renamed from: b */
    private static final a f1695b = new a("Has User Consent", C1286x4.f3061p);

    /* renamed from: c */
    private static final a f1696c = new a("\"Do Not Sell\"", C1286x4.f3063r);

    /* renamed from: com.applovin.impl.p0$a */
    public static class a {

        /* renamed from: a */
        private final String f1697a;

        /* renamed from: b */
        private final C1286x4 f1698b;

        public a(String str, C1286x4 c1286x4) {
            this.f1697a = str;
            this.f1698b = c1286x4;
        }

        /* renamed from: b */
        public Boolean m2052b(Context context) {
            if (context != null) {
                return (Boolean) C1295y4.m3787a(this.f1698b, (Object) null, context);
            }
            C1240o.m3207h("AppLovinSdk", "Failed to get value for key: " + this.f1698b);
            return null;
        }

        /* renamed from: a */
        public String m2050a() {
            return this.f1697a;
        }

        /* renamed from: a */
        public String m2051a(Context context) {
            Boolean boolM2052b = m2052b(context);
            return boolM2052b != null ? boolM2052b.toString() : "No value set";
        }
    }

    /* renamed from: a */
    public static a m2041a() {
        return f1696c;
    }

    /* renamed from: b */
    public static a m2046b() {
        return f1695b;
    }

    /* renamed from: c */
    public static a m2048c() {
        return f1694a;
    }

    /* renamed from: a */
    public static boolean m2045a(boolean z, Context context) {
        return m2044a(C1286x4.f3063r, Boolean.valueOf(z), context);
    }

    /* renamed from: b */
    public static boolean m2047b(boolean z, Context context) {
        return m2044a(C1286x4.f3061p, Boolean.valueOf(z), context);
    }

    /* renamed from: a */
    public static String m2042a(Context context) {
        return m2043a(f1695b, context) + m2043a(f1696c, context);
    }

    /* renamed from: a */
    private static boolean m2044a(C1286x4 c1286x4, Boolean bool, Context context) {
        if (context == null) {
            C1240o.m3207h("AppLovinSdk", "Failed to update compliance value for key: " + c1286x4);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) C1295y4.m3787a(c1286x4, (Object) null, context);
            C1295y4.m3793b(c1286x4, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            C1240o.m3204c("ComplianceManager", "Unable to update compliance", th);
            C1220k c1220k = C1220k.f2089D0;
            if (c1220k != null) {
                c1220k.m2832E().m2148a("ComplianceManager", "updateCompliance", th);
            }
            return false;
        }
    }

    /* renamed from: a */
    private static String m2043a(a aVar, Context context) {
        return "\n" + aVar.f1697a + " - " + aVar.m2051a(context);
    }
}
