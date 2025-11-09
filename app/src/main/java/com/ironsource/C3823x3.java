package com.ironsource;

/* renamed from: com.ironsource.x3 */
/* loaded from: classes2.dex */
public final class C3823x3 {

    /* renamed from: a */
    private final String f12565a;

    public C3823x3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: a */
    public static /* synthetic */ C3823x3 m13006a(C3823x3 c3823x3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3823x3.f12565a;
        }
        return c3823x3.m13007a(str);
    }

    /* renamed from: b */
    public final String m13009b() {
        return this.f12565a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3823x3) && kotlin.jvm.internal.OooOo.OooO00o(this.f12565a, ((C3823x3) obj).f12565a);
    }

    public int hashCode() {
        return this.f12565a.hashCode();
    }

    public String toString() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f12565a, new StringBuilder("ApplicationAuctionSettings(auctionData="));
    }

    public C3823x3(String auctionData) {
        kotlin.jvm.internal.OooOo.OooO0o0(auctionData, "auctionData");
        this.f12565a = auctionData;
    }

    /* renamed from: a */
    public final C3823x3 m13007a(String auctionData) {
        kotlin.jvm.internal.OooOo.OooO0o0(auctionData, "auctionData");
        return new C3823x3(auctionData);
    }

    public /* synthetic */ C3823x3(String str, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? "" : str);
    }

    /* renamed from: a */
    public final String m13008a() {
        return this.f12565a;
    }
}
