package com.ironsource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.q4 */
/* loaded from: classes2.dex */
public class C3546q4 {

    /* renamed from: a */
    private final C2992c2 f10882a;

    public C3546q4(C2992c2 c2992c2) {
        this.f10882a = c2992c2;
    }

    /* renamed from: a */
    public String m11490a(int i, int i2, int i3, int i4) {
        StringBuilder sbOooOo0o = OooO0oO.OooOo.OooOo0o("interstitial=", i, ";rewarded=", i2, ";banner=");
        sbOooOo0o.append(i3);
        sbOooOo0o.append(";native=");
        sbOooOo0o.append(i4);
        return sbOooOo0o.toString();
    }

    /* renamed from: b */
    public void m11496b(String str) {
        this.f10882a.m8075a(EnumC3889z1.AUCTION_REQUEST_WATERFALL, androidx.datastore.preferences.protobuf.OooO00o.OooOOo(IronSourceConstants.EVENTS_EXT1, str));
    }

    /* renamed from: c */
    public void m11497c(String str) {
        this.f10882a.m8075a(EnumC3889z1.AUCTION_RESULT_WATERFALL, androidx.datastore.preferences.protobuf.OooO00o.OooOOo(IronSourceConstants.EVENTS_EXT1, str));
    }

    /* renamed from: a */
    public void m11491a(int i, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f10882a.m8075a(EnumC3889z1.AUCTION_FAILED_NO_CANDIDATES, map);
    }

    /* renamed from: a */
    public void m11492a(long j, int i, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f10882a.m8075a(EnumC3889z1.AUCTION_FAILED, map);
    }

    /* renamed from: a */
    public void m11493a(long j, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f10882a.m8075a(EnumC3889z1.AUCTION_SUCCESS, map);
    }

    /* renamed from: a */
    public void m11494a(@Nullable Double d) {
        HashMap map;
        if (d != null) {
            map = new HashMap();
            map.put(IronSourceConstants.EVENTS_EXT1, "flooring=" + d);
        } else {
            map = null;
        }
        this.f10882a.m8075a(EnumC3889z1.AUCTION_REQUEST, map);
    }

    /* renamed from: a */
    public void m11495a(String str) {
        this.f10882a.m8075a(EnumC3889z1.AD_FORMAT_CAPPED, androidx.datastore.preferences.protobuf.OooO00o.OooOOo("auctionId", str));
    }
}
