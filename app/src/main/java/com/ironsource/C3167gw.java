package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.gw */
/* loaded from: classes2.dex */
public class C3167gw {

    /* renamed from: a */
    private final C2992c2 f8787a;

    public C3167gw(C2992c2 c2992c2) {
        this.f8787a = c2992c2;
    }

    /* renamed from: a */
    public void m9017a() {
        this.f8787a.m8075a(EnumC3889z1.COLLECT_TOKEN, new HashMap());
    }

    /* renamed from: b */
    public void m9023b(Map<String, Object> map, long j) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f8787a.m8075a(EnumC3889z1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, map2);
    }

    /* renamed from: a */
    public void m9018a(long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.f8787a.m8075a(EnumC3889z1.COLLECT_TOKENS_COMPLETED, map);
    }

    /* renamed from: a */
    public void m9019a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f8787a.m8075a(EnumC3889z1.COLLECT_TOKENS_FAILED, map);
    }

    /* renamed from: a */
    public void m9020a(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f8787a.m8075a(EnumC3889z1.INSTANCE_COLLECT_TOKEN, map2);
    }

    /* renamed from: a */
    public void m9021a(Map<String, Object> map, long j) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f8787a.m8075a(EnumC3889z1.INSTANCE_COLLECT_TOKEN_SUCCESS, map2);
    }

    /* renamed from: a */
    public void m9022a(Map<String, Object> map, long j, String str) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            map2.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f8787a.m8075a(EnumC3889z1.INSTANCE_COLLECT_TOKEN_FAILED, map2);
    }
}
