package com.ironsource;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.ke */
/* loaded from: classes2.dex */
public class C3288ke {

    /* renamed from: b */
    public static final String f9261b = "userId";

    /* renamed from: c */
    public static final String f9262c = "appKey";

    /* renamed from: d */
    private static C3288ke f9263d;

    /* renamed from: a */
    private JSONObject f9264a = new JSONObject();

    private C3288ke() {
    }

    /* renamed from: a */
    public static synchronized C3288ke m9661a() {
        try {
            if (f9263d == null) {
                f9263d = new C3288ke();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9263d;
    }

    /* renamed from: b */
    public synchronized JSONObject m9665b() {
        return this.f9264a;
    }

    /* renamed from: a */
    public synchronized String m9662a(String str) {
        return this.f9264a.optString(str);
    }

    /* renamed from: a */
    public synchronized void m9663a(String str, Object obj) {
        try {
            this.f9264a.put(str, obj);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
        }
    }

    /* renamed from: a */
    public synchronized void m9664a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                m9663a(str, map.get(str));
            }
        }
    }
}
