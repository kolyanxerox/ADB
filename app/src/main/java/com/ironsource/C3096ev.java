package com.ironsource;

import com.ironsource.mediationsdk.metadata.C3401a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ev */
/* loaded from: classes2.dex */
public final class C3096ev {

    /* renamed from: a */
    public static final C3096ev f8463a = new C3096ev();

    private C3096ev() {
    }

    /* renamed from: a */
    private final JSONArray m8560a() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapM11685d = C3573qv.f11160a.m11685d();
        if (concurrentHashMapM11685d.containsKey(C3401a.f9919f)) {
            return new JSONArray((Collection) concurrentHashMapM11685d.get(C3401a.f9919f));
        }
        return null;
    }

    /* renamed from: b */
    public final void m8565b() throws JSONException {
        m8562a(this, EnumC2638ac.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    /* renamed from: c */
    public final void m8566c() throws JSONException {
        m8562a(this, EnumC2638ac.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    /* renamed from: d */
    public final void m8567d() throws JSONException {
        m8562a(this, EnumC2638ac.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    /* renamed from: a */
    public final void m8563a(int i) throws JSONException {
        m8561a(EnumC2638ac.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(i), null);
    }

    /* renamed from: a */
    private final void m8561a(EnumC2638ac enumC2638ac, Integer num, String str) throws JSONException {
        C3573qv c3573qv = C3573qv.f11160a;
        JSONObject jSONObjectM11668a = c3573qv.m11668a(false);
        if (num != null) {
            jSONObjectM11668a.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            JSONArray jSONArrayM8560a = m8560a();
            if (jSONArrayM8560a != null) {
                jSONObjectM11668a.put(C3401a.f9919f, jSONArrayM8560a);
            }
        }
        if (str != null) {
            jSONObjectM11668a.put("reason", str);
        }
        c3573qv.m11670a(enumC2638ac, jSONObjectM11668a);
    }

    /* renamed from: a */
    public static /* synthetic */ void m8562a(C3096ev c3096ev, EnumC2638ac enumC2638ac, Integer num, String str, int i, Object obj) throws JSONException {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        c3096ev.m8561a(enumC2638ac, num, str);
    }

    /* renamed from: a */
    public final void m8564a(String errorReason) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(errorReason, "errorReason");
        m8561a(EnumC2638ac.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }
}
