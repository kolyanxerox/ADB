package com.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.mediationsdk.metadata.C3401a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.m0 */
/* loaded from: classes2.dex */
public class C3348m0 {

    /* renamed from: a */
    private final C2992c2 f9444a;

    public C3348m0(C2992c2 c2992c2) {
        this.f9444a = c2992c2;
    }

    /* renamed from: a */
    public void m9936a() {
        this.f9444a.m8075a(EnumC3889z1.SESSION_CAPPED, null);
    }

    /* renamed from: b */
    public void m9944b(String str) {
        m9940a(str, (String) null);
    }

    /* renamed from: c */
    public void m9946c(String str) {
        this.f9444a.m8075a(EnumC3889z1.AD_DISMISS_SCREEN, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("placement", str));
    }

    /* renamed from: d */
    public void m9947d(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f9444a.m8075a(EnumC3889z1.AD_ENDED, map);
    }

    /* renamed from: e */
    public void m9948e(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f9444a.m8075a(EnumC3889z1.AD_INFO_CHANGED, map);
    }

    /* renamed from: f */
    public void m9949f(String str) {
        this.f9444a.m8075a(EnumC3889z1.AD_LEFT_APPLICATION, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("placement", str));
    }

    /* renamed from: g */
    public void m9950g(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f9444a.m8075a(EnumC3889z1.AD_OPENED, map);
    }

    /* renamed from: h */
    public void m9951h(String str) {
        this.f9444a.m8075a(EnumC3889z1.AD_PRESENT_SCREEN, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("placement", str));
    }

    /* renamed from: i */
    public void m9952i(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f9444a.m8075a(EnumC3889z1.AD_STARTED, map);
    }

    /* renamed from: j */
    public void m9953j(String str) {
        this.f9444a.m8075a(EnumC3889z1.AD_VIEW_BOUND, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("placement", str));
    }

    /* renamed from: k */
    public void m9954k(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f9444a.m8075a(EnumC3889z1.AD_VISIBLE, map);
    }

    /* renamed from: l */
    public void m9955l(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f9444a.m8075a(EnumC3889z1.SHOW_AD_SUCCESS, map);
    }

    /* renamed from: a */
    public void m9937a(Activity activity, String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        if (activity != null) {
            map.put(IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        this.f9444a.m8075a(EnumC3889z1.SHOW_AD, map);
    }

    /* renamed from: b */
    public void m9945b(String str, String str2) {
        HashMap mapOooOOo = androidx.datastore.preferences.protobuf.OooO00o.OooOOo("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            mapOooOOo.put("reason", str2);
        }
        this.f9444a.m8075a(EnumC3889z1.PLACEMENT_CAPPED, mapOooOOo);
    }

    /* renamed from: a */
    public void m9938a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f9444a.m8075a(EnumC3889z1.AD_CLICKED, map);
    }

    /* renamed from: a */
    public void m9939a(String str, int i, String str2, String str3) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", str2);
        if (!TextUtils.isEmpty(str3)) {
            map.put(IronSourceConstants.EVENTS_EXT1, str3);
        }
        this.f9444a.m8075a(EnumC3889z1.SHOW_AD_FAILED, map);
    }

    /* renamed from: a */
    public void m9940a(String str, String str2) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        this.f9444a.m8075a(EnumC3889z1.AD_CLOSED, map);
    }

    /* renamed from: a */
    public void m9941a(String str, String str2, int i, long j, String str3, long j2, Map<String, Object> map, String str4) {
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map2.put("placement", str);
        }
        map2.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        map2.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i));
        map2.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2));
        }
        if (map != null) {
            map2.putAll(map);
        }
        if (!TextUtils.isEmpty(str4)) {
            map2.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.f9444a.m8076a(EnumC3889z1.AD_REWARDED, map2, j);
    }

    /* renamed from: a */
    public void m9942a(String str, String str2, boolean z) {
        HashMap map = new HashMap();
        map.put("isMultipleAdUnits", 1);
        map.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            map.put("reason", str2);
        }
        map.put(IronSourceConstants.EVENTS_EXT1, z ? C3401a.f9920g : "false");
        map.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        this.f9444a.m8075a(EnumC3889z1.CHECK_PLACEMENT_CAPPED, map);
    }

    /* renamed from: a */
    public void m9943a(boolean z) {
        HashMap map = new HashMap();
        map.put("status", z ? C3401a.f9920g : "false");
        this.f9444a.m8075a(EnumC3889z1.SHOW_AD_CHANCE, map);
    }
}
