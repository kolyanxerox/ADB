package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.yw */
/* loaded from: classes2.dex */
public class C3886yw {

    /* renamed from: b */
    private int f12790b = 4;

    /* renamed from: c */
    private int f12791c = 4;

    /* renamed from: a */
    private HashMap<String, Boolean> f12789a = new a();

    /* renamed from: com.ironsource.yw$a */
    public class a extends HashMap<String, Boolean> {
        public a() {
            put(C3007ch.f7750k, Boolean.valueOf(C3886yw.this.f12790b == 0));
            put(C3007ch.f7751l, Boolean.valueOf(C3886yw.this.f12791c == 0));
            Boolean bool = Boolean.FALSE;
            put(C3007ch.f7752m, bool);
            put(C3007ch.f7753n, bool);
        }
    }

    /* renamed from: a */
    public JSONObject m13236a() {
        return new JSONObject(this.f12789a);
    }

    /* renamed from: a */
    public void m13237a(String str, int i, boolean z) {
        boolean z2 = false;
        if (this.f12789a.containsKey(str)) {
            this.f12789a.put(str, Boolean.valueOf(i == 0));
        }
        this.f12789a.put(C3007ch.f7752m, Boolean.valueOf(z));
        if ((this.f12789a.get(C3007ch.f7751l).booleanValue() || this.f12789a.get(C3007ch.f7750k).booleanValue()) && this.f12789a.get(C3007ch.f7752m).booleanValue()) {
            z2 = true;
        }
        this.f12789a.put(C3007ch.f7753n, Boolean.valueOf(z2));
    }
}
