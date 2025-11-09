package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.f4 */
/* loaded from: classes2.dex */
public final class C3104f4 {

    /* renamed from: a */
    private final boolean f8487a;

    /* renamed from: b */
    private final boolean f8488b;

    /* renamed from: c */
    private final boolean f8489c;

    /* renamed from: d */
    private final int f8490d;

    /* renamed from: e */
    private final String f8491e;

    /* renamed from: f */
    private final String f8492f;

    /* renamed from: g */
    private final int f8493g;

    /* renamed from: h */
    private final int f8494h;

    /* renamed from: i */
    private final int f8495i;

    /* renamed from: j */
    private final List<Integer> f8496j;

    /* renamed from: k */
    private final List<Integer> f8497k;

    /* renamed from: l */
    private final List<Integer> f8498l;

    /* renamed from: m */
    private final List<Integer> f8499m;

    public C3104f4(JSONObject applicationEvents) {
        kotlin.jvm.internal.OooOo.OooO0o0(applicationEvents, "applicationEvents");
        this.f8487a = applicationEvents.optBoolean(C3174h4.f8828a, false);
        this.f8488b = applicationEvents.optBoolean(C3174h4.f8829b, false);
        this.f8489c = applicationEvents.optBoolean(C3174h4.f8830c, false);
        this.f8490d = applicationEvents.optInt(C3174h4.f8831d, -1);
        String strOptString = applicationEvents.optString(C3174h4.f8832e);
        kotlin.jvm.internal.OooOo.OooO0Oo(strOptString, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.f8491e = strOptString;
        String strOptString2 = applicationEvents.optString(C3174h4.f8833f);
        kotlin.jvm.internal.OooOo.OooO0Oo(strOptString2, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.f8492f = strOptString2;
        this.f8493g = applicationEvents.optInt(C3174h4.f8834g, -1);
        this.f8494h = applicationEvents.optInt(C3174h4.f8835h, -1);
        this.f8495i = applicationEvents.optInt(C3174h4.f8836i, 5000);
        this.f8496j = m8610a(applicationEvents, C3174h4.f8837j);
        this.f8497k = m8610a(applicationEvents, C3174h4.f8838k);
        this.f8498l = m8610a(applicationEvents, C3174h4.f8839l);
        this.f8499m = m8610a(applicationEvents, C3174h4.f8840m);
    }

    /* renamed from: a */
    public final int m8611a() {
        return this.f8493g;
    }

    /* renamed from: b */
    public final boolean m8612b() {
        return this.f8489c;
    }

    /* renamed from: c */
    public final int m8613c() {
        return this.f8490d;
    }

    /* renamed from: d */
    public final String m8614d() {
        return this.f8492f;
    }

    /* renamed from: e */
    public final int m8615e() {
        return this.f8495i;
    }

    /* renamed from: f */
    public final int m8616f() {
        return this.f8494h;
    }

    /* renamed from: g */
    public final List<Integer> m8617g() {
        return this.f8499m;
    }

    /* renamed from: h */
    public final List<Integer> m8618h() {
        return this.f8497k;
    }

    /* renamed from: i */
    public final List<Integer> m8619i() {
        return this.f8496j;
    }

    /* renamed from: j */
    public final boolean m8620j() {
        return this.f8488b;
    }

    /* renamed from: k */
    public final boolean m8621k() {
        return this.f8487a;
    }

    /* renamed from: l */
    public final String m8622l() {
        return this.f8491e;
    }

    /* renamed from: m */
    public final List<Integer> m8623m() {
        return this.f8498l;
    }

    /* renamed from: a */
    private final List<Integer> m8610a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return o00O0.oo000o.f31251OooOo0O;
        }
        o00O0o0O.o00Ooo o00oooOooOOOO = o00Oo0oo.o00oO0o.OooOOOO(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(o00O0.Oooo000.OooOo0(o00oooOooOOOO, 10));
        Iterator it = o00oooOooOOOO.iterator();
        while (((o00O0o0O.o00Oo0) it).f31439OooOo) {
            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(((o00O0.o0Oo0oo) it).nextInt())));
        }
        return arrayList;
    }
}
