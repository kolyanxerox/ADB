package com.ironsource;

import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.c4 */
/* loaded from: classes2.dex */
public final class C2994c4 {

    /* renamed from: a */
    private final boolean f7699a;

    /* renamed from: b */
    private final HashSet<String> f7700b;

    /* renamed from: c */
    private final String f7701c;

    /* renamed from: d */
    private final String f7702d;

    /* renamed from: e */
    private final boolean f7703e;

    /* renamed from: f */
    private final int f7704f;

    /* renamed from: g */
    private final boolean f7705g;

    public C2994c4(JSONObject applicationCrashReporterSettings) throws JSONException {
        HashSet<String> hashSet;
        kotlin.jvm.internal.OooOo.OooO0o0(applicationCrashReporterSettings, "applicationCrashReporterSettings");
        this.f7699a = applicationCrashReporterSettings.optBoolean("enabled", false);
        List<String> listM12451b = C3702tk.m12451b(applicationCrashReporterSettings.optJSONArray(C3064e4.f8364b));
        if (listM12451b != null) {
            hashSet = new HashSet<>(o00O0.o0O0O00.OooOOOO(o00O0.Oooo000.OooOo0(listM12451b, 12)));
            o00O0.OooOo00.Oooo0OO(listM12451b, hashSet);
        } else {
            hashSet = null;
        }
        this.f7700b = hashSet;
        String strOptString = applicationCrashReporterSettings.optString(C3064e4.f8365c);
        kotlin.jvm.internal.OooOo.OooO0Oo(strOptString, "applicationCrashReporter…(CRASHREPORTER_URL_FIELD)");
        this.f7701c = strOptString;
        String strOptString2 = applicationCrashReporterSettings.optString(C3064e4.f8366d);
        kotlin.jvm.internal.OooOo.OooO0Oo(strOptString2, "applicationCrashReporter…SHREPORTER_KEYWORD_FIELD)");
        this.f7702d = strOptString2;
        this.f7703e = applicationCrashReporterSettings.optBoolean(C3064e4.f8367e, false);
        this.f7704f = applicationCrashReporterSettings.optInt("timeout", 5000);
        this.f7705g = applicationCrashReporterSettings.optBoolean(C3064e4.f8369g, false);
    }

    /* renamed from: a */
    public final int m8083a() {
        return this.f7704f;
    }

    /* renamed from: b */
    public final HashSet<String> m8084b() {
        return this.f7700b;
    }

    /* renamed from: c */
    public final String m8085c() {
        return this.f7702d;
    }

    /* renamed from: d */
    public final String m8086d() {
        return this.f7701c;
    }

    /* renamed from: e */
    public final boolean m8087e() {
        return this.f7703e;
    }

    /* renamed from: f */
    public final boolean m8088f() {
        return this.f7699a;
    }

    /* renamed from: g */
    public final boolean m8089g() {
        return this.f7705g;
    }
}
