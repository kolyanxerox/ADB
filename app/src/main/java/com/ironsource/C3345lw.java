package com.ironsource;

import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.ironsource.lw */
/* loaded from: classes2.dex */
public class C3345lw {

    /* renamed from: a */
    private final C2992c2 f9442a;

    public C3345lw(C2992c2 c2992c2) {
        this.f9442a = c2992c2;
    }

    /* renamed from: a */
    private String m9894a(long j, long j2, long j3) {
        StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(j, "interval: ", ", remainingTime: ");
        sbOooOOo.append(j2);
        sbOooOOo.append(", timePassed: ");
        sbOooOOo.append(j3);
        return sbOooOOo.toString();
    }

    /* renamed from: b */
    public void m9907b() {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_LOAD, null);
    }

    /* renamed from: c */
    public void m9911c() {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    /* renamed from: d */
    public void m9913d() {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_SHOW, null);
    }

    /* renamed from: e */
    public void m9915e() {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    /* renamed from: f */
    public void m9917f(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_ILLEGAL_STATE, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: g */
    public void m9918g(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_INTERNAL_ERROR, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: h */
    public void m9919h(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_LOAD_SKIPPED, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: i */
    public void m9920i(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: j */
    public void m9921j(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: k */
    public void m9922k(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: l */
    public void m9923l(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_UNEXPECTED_CLOSED, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: m */
    public void m9924m(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: n */
    public void m9925n(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: o */
    public void m9926o(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: p */
    public void m9927p(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: q */
    public void m9928q(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_UNEXPECTED_OPENED, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: r */
    public void m9929r(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: s */
    public void m9930s(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: t */
    public void m9931t(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: u */
    public void m9932u(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_UNEXPECTED_TIMEOUT, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: v */
    public void m9933v(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_WATERFALL_OVERHEAD, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: b */
    public void m9908b(int i, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", str);
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_LOAD_FAILED, map);
    }

    /* renamed from: c */
    public void m9912c(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_BN_RELOAD_EXCEPTION, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: d */
    public void m9914d(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: e */
    public void m9916e(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: b */
    public void m9909b(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_IMPRESSION_TIMEOUT, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: a */
    public void m9895a() {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_DISPOSE, null);
    }

    /* renamed from: a */
    public void m9896a(int i, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", str);
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, map);
    }

    /* renamed from: b */
    public void m9910b(String str, long j, long j2, long j3) {
        HashMap mapOooOOo = androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str);
        mapOooOOo.put(IronSourceConstants.EVENTS_EXT1, m9894a(j, j2, j3));
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_BANNER_REFRESH_RESUMED, mapOooOOo);
    }

    /* renamed from: a */
    public void m9897a(int i, String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", str);
        map.put(IronSourceConstants.EVENTS_EXT1, str2);
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_NOTIFICATION_ERROR, map);
    }

    /* renamed from: a */
    public void m9898a(long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, map);
    }

    /* renamed from: a */
    public void m9899a(long j, long j2, String str) {
        HashMap map = new HashMap();
        Locale locale = Locale.ENGLISH;
        StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(j, "refreshDuration=", ";notVisibleDuration=");
        sbOooOOo.append(j2);
        sbOooOOo.append(";reason=");
        sbOooOOo.append(str);
        map.put(IronSourceConstants.EVENTS_EXT1, sbOooOOo.toString());
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_RELOAD, map);
    }

    /* renamed from: a */
    public void m9900a(LevelPlayAdError levelPlayAdError) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(levelPlayAdError.getErrorCode()));
        map.put("reason", levelPlayAdError.getErrorMessage());
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_SHOW_FAILED, map);
    }

    /* renamed from: a */
    public void m9901a(@NonNull LevelPlayAdInfo levelPlayAdInfo, @NonNull LevelPlayAdInfo levelPlayAdInfo2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "oldAdNetwork=%s;oldInstanceId=%s;oldRevenue=%.3f;oldPrecision=%s;newAdNetwork=%s;newInstanceId=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getAdNetwork(), levelPlayAdInfo.getInstanceId(), Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getAdNetwork(), levelPlayAdInfo2.getInstanceId(), Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_AD_INFO_CHANGED, map);
    }

    /* renamed from: a */
    public void m9902a(Long l) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, l);
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_LOAD_WHILE_LOADED, map);
    }

    /* renamed from: a */
    public void m9903a(String str) {
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_AD_EXPIRED, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str));
    }

    /* renamed from: a */
    public void m9904a(String str, long j) {
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(str.isEmpty() ? "" : OooO0oO.OooOo.OooOO0O("provider=", str, ";"));
        sb.append("expirationDuration=");
        sb.append(j);
        map.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_AD_EXPIRED, map);
    }

    /* renamed from: a */
    public void m9905a(String str, long j, long j2, long j3) {
        HashMap mapOooOOo = androidx.datastore.preferences.protobuf.OooO00o.OooOOo("reason", str);
        mapOooOOo.put(IronSourceConstants.EVENTS_EXT1, m9894a(j, j2, j3));
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_BANNER_REFRESH_PAUSED, mapOooOOo);
    }

    /* renamed from: a */
    public void m9906a(boolean z, long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z ? 1 : 0));
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.f9442a.m8075a(EnumC3889z1.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, map);
    }
}
