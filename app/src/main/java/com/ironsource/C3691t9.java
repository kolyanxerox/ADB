package com.ironsource;

/* renamed from: com.ironsource.t9 */
/* loaded from: classes2.dex */
public final class C3691t9 {

    /* renamed from: a */
    private final String f12040a;

    /* renamed from: b */
    private final String f12041b;

    /* renamed from: c */
    private final String f12042c;

    /* renamed from: d */
    private final String f12043d;

    public C3691t9() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C3691t9 m12405a(C3691t9 c3691t9, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3691t9.f12040a;
        }
        if ((i & 2) != 0) {
            str2 = c3691t9.f12041b;
        }
        if ((i & 4) != 0) {
            str3 = c3691t9.f12042c;
        }
        if ((i & 8) != 0) {
            str4 = c3691t9.f12043d;
        }
        return c3691t9.m12406a(str, str2, str3, str4);
    }

    /* renamed from: b */
    public final String m12408b() {
        return this.f12041b;
    }

    /* renamed from: c */
    public final String m12409c() {
        return this.f12042c;
    }

    /* renamed from: d */
    public final String m12410d() {
        return this.f12043d;
    }

    /* renamed from: e */
    public final String m12411e() {
        return this.f12043d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3691t9)) {
            return false;
        }
        C3691t9 c3691t9 = (C3691t9) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f12040a, c3691t9.f12040a) && kotlin.jvm.internal.OooOo.OooO00o(this.f12041b, c3691t9.f12041b) && kotlin.jvm.internal.OooOo.OooO00o(this.f12042c, c3691t9.f12042c) && kotlin.jvm.internal.OooOo.OooO00o(this.f12043d, c3691t9.f12043d);
    }

    /* renamed from: f */
    public final String m12412f() {
        return this.f12042c;
    }

    /* renamed from: g */
    public final String m12413g() {
        return this.f12040a;
    }

    /* renamed from: h */
    public final String m12414h() {
        return this.f12041b;
    }

    public int hashCode() {
        return this.f12043d.hashCode() + androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(this.f12040a.hashCode() * 31, 31, this.f12041b), 31, this.f12042c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomAdapterSettings(customNetworkAdapterName=");
        sb.append(this.f12040a);
        sb.append(", customRewardedVideoAdapterName=");
        sb.append(this.f12041b);
        sb.append(", customInterstitialAdapterName=");
        sb.append(this.f12042c);
        sb.append(", customBannerAdapterName=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f12043d, sb);
    }

    public C3691t9(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        kotlin.jvm.internal.OooOo.OooO0o0(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.OooOo.OooO0o0(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.OooOo.OooO0o0(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.OooOo.OooO0o0(customBannerAdapterName, "customBannerAdapterName");
        this.f12040a = customNetworkAdapterName;
        this.f12041b = customRewardedVideoAdapterName;
        this.f12042c = customInterstitialAdapterName;
        this.f12043d = customBannerAdapterName;
    }

    /* renamed from: a */
    public final C3691t9 m12406a(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        kotlin.jvm.internal.OooOo.OooO0o0(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.OooOo.OooO0o0(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.OooOo.OooO0o0(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.OooOo.OooO0o0(customBannerAdapterName, "customBannerAdapterName");
        return new C3691t9(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public /* synthetic */ C3691t9(String str, String str2, String str3, String str4, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    /* renamed from: a */
    public final String m12407a() {
        return this.f12040a;
    }
}
