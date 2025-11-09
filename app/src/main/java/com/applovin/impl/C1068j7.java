package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.applovin.impl.j7 */
/* loaded from: classes.dex */
public final class C1068j7 {

    /* renamed from: a */
    private final C1220k f970a;

    /* renamed from: b */
    private String f971b;

    /* renamed from: c */
    private final String f972c = m1099a(C1286x4.f3056k);

    /* renamed from: d */
    private final String f973d = m1099a(C1286x4.f3057l);

    /* renamed from: e */
    private String f974e = (String) C1295y4.m3787a(C1286x4.f3058m, (Object) null, C1220k.m2824o());

    /* renamed from: f */
    private String f975f = (String) C1295y4.m3787a(C1286x4.f3059n, (Object) null, C1220k.m2824o());

    public C1068j7(C1220k c1220k) {
        this.f970a = c1220k;
        m1102a(m1100f());
    }

    /* renamed from: f */
    private String m1100f() {
        if (!((Boolean) this.f970a.m2866a(C1268v4.f2590H3)).booleanValue()) {
            this.f970a.m2890c(C1286x4.f3055j);
        }
        String str = (String) this.f970a.m2867a(C1286x4.f3055j);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f970a.m2847O();
        if (C1240o.m3200a()) {
            this.f970a.m2847O().m3211a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    /* renamed from: a */
    public String m1101a() {
        return this.f973d;
    }

    /* renamed from: b */
    public String m1103b() {
        return this.f974e;
    }

    /* renamed from: c */
    public String m1105c() {
        return this.f972c;
    }

    /* renamed from: d */
    public String m1107d() {
        return this.f975f;
    }

    /* renamed from: e */
    public String m1108e() {
        return this.f971b;
    }

    /* renamed from: a */
    private String m1099a(C1286x4 c1286x4) {
        String str = (String) C1295y4.m3787a(c1286x4, (Object) null, C1220k.m2824o());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        C1295y4.m3793b(c1286x4, lowerCase, C1220k.m2824o());
        return lowerCase;
    }

    /* renamed from: b */
    public void m1104b(String str) {
        this.f974e = str;
        C1295y4.m3793b(C1286x4.f3058m, str, C1220k.m2824o());
    }

    /* renamed from: c */
    public void m1106c(String str) {
        this.f975f = str;
        C1295y4.m3793b(C1286x4.f3059n, str, C1220k.m2824o());
    }

    /* renamed from: a */
    public void m1102a(String str) {
        if (((Boolean) this.f970a.m2866a(C1268v4.f2590H3)).booleanValue()) {
            this.f970a.m2885b(C1286x4.f3055j, str);
        }
        this.f971b = str;
        this.f970a.m2923u().m2780b(str, m1101a());
    }

    /* renamed from: a */
    public static String m1098a(C1220k c1220k) {
        C1286x4 c1286x4 = C1286x4.f3060o;
        String str = (String) c1220k.m2867a(c1286x4);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        c1220k.m2885b(c1286x4, strValueOf);
        return strValueOf;
    }
}
