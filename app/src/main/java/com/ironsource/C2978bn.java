package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.bn */
/* loaded from: classes2.dex */
public class C2978bn {

    /* renamed from: a */
    private final C2992c2 f7605a;

    public C2978bn(C2992c2 c2992c2) {
        this.f7605a = c2992c2;
    }

    /* renamed from: a */
    public void m7940a() {
        this.f7605a.m8075a(EnumC3889z1.RELOAD_AD, new HashMap());
    }

    /* renamed from: b */
    public void m7951b(int i) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        this.f7605a.m8075a(EnumC3889z1.SKIP_RELOAD_AD, map);
    }

    /* renamed from: a */
    public void m7941a(int i) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.valueOf(i));
        this.f7605a.m8075a(EnumC3889z1.DESTROY_AD, map);
    }

    /* renamed from: b */
    public void m7952b(long j, int i) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        this.f7605a.m8075a(EnumC3889z1.RELOAD_AD_NO_FILL, map);
    }

    /* renamed from: a */
    public void m7942a(long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.f7605a.m8075a(EnumC3889z1.RELOAD_AD_SUCCESS, map);
    }

    /* renamed from: a */
    public void m7943a(long j, int i) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        this.f7605a.m8075a(EnumC3889z1.LOAD_AD_NO_FILL, map);
    }

    /* renamed from: a */
    public void m7944a(long j, int i, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f7605a.m8075a(EnumC3889z1.RELOAD_AD_FAILED_WITH_REASON, map);
    }

    /* renamed from: a */
    public void m7945a(long j, int i, String str, boolean z) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        if (z) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f7605a.m8075a(EnumC3889z1.LOAD_AD_FAILED_WITH_REASON, map);
    }

    /* renamed from: a */
    public void m7946a(long j, int i, boolean z) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (z) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f7605a.m8075a(EnumC3889z1.LOAD_AD_FAILED, map);
    }

    /* renamed from: a */
    public void m7947a(long j, boolean z) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (z) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f7605a.m8075a(EnumC3889z1.LOAD_AD_SUCCESS, map);
    }

    /* renamed from: a */
    public void m7948a(Boolean bool, String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f7605a.m8075a(bool.booleanValue() ? EnumC3889z1.AD_READY_TRUE : EnumC3889z1.AD_READY_FALSE, map);
    }

    /* renamed from: a */
    public void m7949a(boolean z) {
        HashMap map = new HashMap();
        if (z) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f7605a.m8075a(EnumC3889z1.LOAD_AD, map);
    }

    /* renamed from: a */
    public void m7950a(boolean z, long j, boolean z2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (z2) {
            map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            map.put("reason", "loaded ads are expired");
        }
        this.f7605a.m8075a(z ? EnumC3889z1.AD_AVAILABILITY_CHANGED_TRUE : EnumC3889z1.AD_AVAILABILITY_CHANGED_FALSE, map);
    }
}
