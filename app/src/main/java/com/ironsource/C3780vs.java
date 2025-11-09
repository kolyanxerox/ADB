package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;

/* renamed from: com.ironsource.vs */
/* loaded from: classes2.dex */
public final class C3780vs {

    /* renamed from: a */
    private final String f12417a;

    /* renamed from: b */
    private final String f12418b;

    /* renamed from: c */
    private final List<IronSource.AD_UNIT> f12419c;

    public C3780vs(String appKey, String str, List<IronSource.AD_UNIT> legacyAdFormats) {
        kotlin.jvm.internal.OooOo.OooO0o0(appKey, "appKey");
        kotlin.jvm.internal.OooOo.OooO0o0(legacyAdFormats, "legacyAdFormats");
        this.f12417a = appKey;
        this.f12418b = str;
        this.f12419c = legacyAdFormats;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C3780vs m12811a(C3780vs c3780vs, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3780vs.f12417a;
        }
        if ((i & 2) != 0) {
            str2 = c3780vs.f12418b;
        }
        if ((i & 4) != 0) {
            list = c3780vs.f12419c;
        }
        return c3780vs.m12812a(str, str2, list);
    }

    /* renamed from: b */
    public final String m12815b() {
        return this.f12418b;
    }

    /* renamed from: c */
    public final List<IronSource.AD_UNIT> m12816c() {
        return this.f12419c;
    }

    /* renamed from: d */
    public final String m12817d() {
        return this.f12417a;
    }

    /* renamed from: e */
    public final List<IronSource.AD_UNIT> m12818e() {
        return this.f12419c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3780vs)) {
            return false;
        }
        C3780vs c3780vs = (C3780vs) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f12417a, c3780vs.f12417a) && kotlin.jvm.internal.OooOo.OooO00o(this.f12418b, c3780vs.f12418b) && kotlin.jvm.internal.OooOo.OooO00o(this.f12419c, c3780vs.f12419c);
    }

    /* renamed from: f */
    public final String m12819f() {
        return this.f12418b;
    }

    public int hashCode() {
        int iHashCode = this.f12417a.hashCode() * 31;
        String str = this.f12418b;
        return this.f12419c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "SdkInitRequest(appKey=" + this.f12417a + ", userId=" + this.f12418b + ", legacyAdFormats=" + this.f12419c + ')';
    }

    public /* synthetic */ C3780vs(String str, String str2, List list, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }

    /* renamed from: a */
    public final C3780vs m12812a(String appKey, String str, List<IronSource.AD_UNIT> legacyAdFormats) {
        kotlin.jvm.internal.OooOo.OooO0o0(appKey, "appKey");
        kotlin.jvm.internal.OooOo.OooO0o0(legacyAdFormats, "legacyAdFormats");
        return new C3780vs(appKey, str, legacyAdFormats);
    }

    /* renamed from: a */
    public final String m12813a() {
        return this.f12417a;
    }

    /* renamed from: a */
    public final void m12814a(List<? extends IronSource.AD_UNIT> adFormats) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormats, "adFormats");
        this.f12419c.clear();
        this.f12419c.addAll(adFormats);
    }
}
