package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.InterfaceC3641f;
import java.util.Date;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.ironsource.n0 */
/* loaded from: classes2.dex */
public final class C3437n0 {

    /* renamed from: f */
    public static final a f10341f = new a(null);

    /* renamed from: g */
    public static final String f10342g = "0";

    /* renamed from: h */
    public static final String f10343h = "0";

    /* renamed from: i */
    public static final String f10344i = "0";

    /* renamed from: j */
    public static final String f10345j = "0";

    /* renamed from: a */
    private final C3907zj f10346a;

    /* renamed from: b */
    private EnumC3558qg f10347b;

    /* renamed from: c */
    private String f10348c;

    /* renamed from: d */
    private EnumC3310l1 f10349d;

    /* renamed from: e */
    private double f10350e;

    /* renamed from: com.ironsource.n0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    public C3437n0(C3907zj adInstance) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        this.f10346a = adInstance;
        this.f10347b = EnumC3558qg.UnknownProvider;
        this.f10348c = "0";
        this.f10349d = EnumC3310l1.LOAD_REQUEST;
        this.f10350e = new Date().getTime() / 1000.0d;
    }

    /* renamed from: a */
    public static /* synthetic */ C3437n0 m10897a(C3437n0 c3437n0, C3907zj c3907zj, int i, Object obj) {
        if ((i & 1) != 0) {
            c3907zj = c3437n0.f10346a;
        }
        return c3437n0.m10898a(c3907zj);
    }

    /* renamed from: b */
    public final IronSource.AD_UNIT m10904b() {
        return this.f10346a.m13399i() ? IronSource.AD_UNIT.BANNER : this.f10346a.m13404n() ? IronSource.AD_UNIT.REWARDED_VIDEO : IronSource.AD_UNIT.INTERSTITIAL;
    }

    /* renamed from: c */
    public final String m10905c() {
        String strM13395e = this.f10346a.m13395e();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM13395e, "adInstance.id");
        return strM13395e;
    }

    /* renamed from: d */
    public final C3907zj m10906d() {
        return this.f10346a;
    }

    /* renamed from: e */
    public final EnumC3558qg m10907e() {
        return this.f10347b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3437n0)) {
            return false;
        }
        C3437n0 c3437n0 = (C3437n0) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(m10905c(), c3437n0.m10905c()) && kotlin.jvm.internal.OooOo.OooO00o(m10909g(), c3437n0.m10909g()) && m10904b() == c3437n0.m10904b() && kotlin.jvm.internal.OooOo.OooO00o(m10911i(), c3437n0.m10911i()) && this.f10347b == c3437n0.f10347b && kotlin.jvm.internal.OooOo.OooO00o(this.f10348c, c3437n0.f10348c) && this.f10349d == c3437n0.f10349d;
    }

    /* renamed from: f */
    public final EnumC3310l1 m10908f() {
        return this.f10349d;
    }

    /* renamed from: g */
    public final String m10909g() {
        String strM13393c = this.f10346a.m13393c();
        return strM13393c == null ? "0" : strM13393c;
    }

    /* renamed from: h */
    public final String m10910h() {
        return this.f10348c;
    }

    public int hashCode() {
        return Objects.hash(m10905c(), m10909g(), m10904b(), m10911i(), this.f10347b, this.f10348c, this.f10349d, Double.valueOf(this.f10350e));
    }

    /* renamed from: i */
    public final String m10911i() {
        String strM13397g = this.f10346a.m13397g();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM13397g, "adInstance.name");
        return strM13397g;
    }

    /* renamed from: j */
    public final double m10912j() {
        return this.f10350e;
    }

    public String toString() {
        String string = new JSONObject().put(InterfaceC3641f.b.f11532c, m10905c()).put("advertiserBundleId", this.f10348c).put("adProvider", this.f10347b.ordinal()).put("adStatus", this.f10349d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.f10350e).put("adUnitId", m10909g()).put("adFormat", m10904b().toString()).put("instanceId", m10911i()).toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return string;
    }

    /* renamed from: a */
    public final C3437n0 m10898a(C3907zj adInstance) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        return new C3437n0(adInstance);
    }

    /* renamed from: a */
    public final C3907zj m10899a() {
        return this.f10346a;
    }

    /* renamed from: a */
    public final void m10900a(double d) {
        this.f10350e = d;
    }

    /* renamed from: a */
    public final void m10901a(EnumC3310l1 enumC3310l1) {
        kotlin.jvm.internal.OooOo.OooO0o0(enumC3310l1, "<set-?>");
        this.f10349d = enumC3310l1;
    }

    /* renamed from: a */
    public final void m10902a(EnumC3558qg enumC3558qg) {
        kotlin.jvm.internal.OooOo.OooO0o0(enumC3558qg, "<set-?>");
        this.f10347b = enumC3558qg;
    }

    /* renamed from: a */
    public final void m10903a(String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<set-?>");
        this.f10348c = str;
    }
}
