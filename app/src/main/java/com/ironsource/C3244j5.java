package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.j5 */
/* loaded from: classes2.dex */
public final class C3244j5 {

    /* renamed from: a */
    private final String f9069a;

    /* renamed from: b */
    private final JSONObject f9070b;

    /* renamed from: c */
    private final C3353m5 f9071c;

    /* renamed from: d */
    private final int f9072d;

    /* renamed from: e */
    private final String f9073e;

    public C3244j5(String auctionId, JSONObject jSONObject, C3353m5 c3353m5, int i, String auctionFallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(auctionId, "auctionId");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionFallback, "auctionFallback");
        this.f9069a = auctionId;
        this.f9070b = jSONObject;
        this.f9071c = c3353m5;
        this.f9072d = i;
        this.f9073e = auctionFallback;
    }

    /* renamed from: a */
    public static /* synthetic */ C3244j5 m9430a(C3244j5 c3244j5, String str, JSONObject jSONObject, C3353m5 c3353m5, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c3244j5.f9069a;
        }
        if ((i2 & 2) != 0) {
            jSONObject = c3244j5.f9070b;
        }
        if ((i2 & 4) != 0) {
            c3353m5 = c3244j5.f9071c;
        }
        if ((i2 & 8) != 0) {
            i = c3244j5.f9072d;
        }
        if ((i2 & 16) != 0) {
            str2 = c3244j5.f9073e;
        }
        String str3 = str2;
        C3353m5 c3353m52 = c3353m5;
        return c3244j5.m9431a(str, jSONObject, c3353m52, i, str3);
    }

    /* renamed from: b */
    public final JSONObject m9433b() {
        return this.f9070b;
    }

    /* renamed from: c */
    public final C3353m5 m9434c() {
        return this.f9071c;
    }

    /* renamed from: d */
    public final int m9435d() {
        return this.f9072d;
    }

    /* renamed from: e */
    public final String m9436e() {
        return this.f9073e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3244j5)) {
            return false;
        }
        C3244j5 c3244j5 = (C3244j5) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f9069a, c3244j5.f9069a) && kotlin.jvm.internal.OooOo.OooO00o(this.f9070b, c3244j5.f9070b) && kotlin.jvm.internal.OooOo.OooO00o(this.f9071c, c3244j5.f9071c) && this.f9072d == c3244j5.f9072d && kotlin.jvm.internal.OooOo.OooO00o(this.f9073e, c3244j5.f9073e);
    }

    /* renamed from: f */
    public final String m9437f() {
        return this.f9073e;
    }

    /* renamed from: g */
    public final String m9438g() {
        return this.f9069a;
    }

    /* renamed from: h */
    public final JSONObject m9439h() {
        return this.f9070b;
    }

    public int hashCode() {
        int iHashCode = this.f9069a.hashCode() * 31;
        JSONObject jSONObject = this.f9070b;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C3353m5 c3353m5 = this.f9071c;
        return this.f9073e.hashCode() + androidx.datastore.preferences.protobuf.OooO00o.OooO00o(this.f9072d, (iHashCode2 + (c3353m5 != null ? c3353m5.hashCode() : 0)) * 31, 31);
    }

    /* renamed from: i */
    public final int m9440i() {
        return this.f9072d;
    }

    /* renamed from: j */
    public final C3353m5 m9441j() {
        return this.f9071c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AuctionResponseData(auctionId=");
        sb.append(this.f9069a);
        sb.append(", auctionResponseGenericParam=");
        sb.append(this.f9070b);
        sb.append(", genericNotifications=");
        sb.append(this.f9071c);
        sb.append(", auctionTrial=");
        sb.append(this.f9072d);
        sb.append(", auctionFallback=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f9073e, sb);
    }

    /* renamed from: a */
    public final C3244j5 m9431a(String auctionId, JSONObject jSONObject, C3353m5 c3353m5, int i, String auctionFallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(auctionId, "auctionId");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionFallback, "auctionFallback");
        return new C3244j5(auctionId, jSONObject, c3353m5, i, auctionFallback);
    }

    /* renamed from: a */
    public final String m9432a() {
        return this.f9069a;
    }
}
