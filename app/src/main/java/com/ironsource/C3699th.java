package com.ironsource;

import android.util.Log;
import com.ironsource.C3198hs;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.th */
/* loaded from: classes2.dex */
public class C3699th {

    /* renamed from: b */
    private static C3699th f12072b;

    /* renamed from: a */
    private C3321lc f12073a;

    private C3699th() {
    }

    /* renamed from: a */
    private static C3699th m12425a() {
        if (f12072b == null) {
            f12072b = new C3699th();
        }
        return f12072b;
    }

    /* renamed from: a */
    public static void m12426a(C3112fc c3112fc, C3594rh c3594rh) {
        if (c3112fc != null) {
            try {
                m12425a().f12073a = new C3321lc(c3112fc, c3594rh);
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m12427a(C3198hs.a aVar) {
        m12428a(aVar, new HashMap());
    }

    /* renamed from: a */
    public static void m12428a(C3198hs.a aVar, Map<String, Object> map) {
        C3321lc c3321lc = m12425a().f12073a;
        if (c3321lc == null) {
            Log.d(C3037dc.f8246a, C3037dc.f8245U);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f8943b));
        }
        c3321lc.m9759a(aVar.f8942a, map);
    }
}
