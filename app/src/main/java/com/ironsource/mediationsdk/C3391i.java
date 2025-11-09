package com.ironsource.mediationsdk;

import com.ironsource.C3105f5;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOo;

/* renamed from: com.ironsource.mediationsdk.i */
/* loaded from: classes2.dex */
public final class C3391i {

    /* renamed from: a */
    private final IronSource.AD_UNIT f9821a;

    /* renamed from: b */
    private final ArrayList<C3105f5> f9822b;

    /* renamed from: c */
    private boolean f9823c;

    /* renamed from: d */
    private String f9824d;

    /* renamed from: e */
    private boolean f9825e;

    /* renamed from: f */
    private Map<String, Object> f9826f;

    /* renamed from: g */
    private List<String> f9827g;

    /* renamed from: h */
    private int f9828h;

    /* renamed from: i */
    private C3390h f9829i;

    /* renamed from: j */
    private IronSourceSegment f9830j;

    /* renamed from: k */
    private String f9831k;

    /* renamed from: l */
    private ISBannerSize f9832l;

    /* renamed from: m */
    private boolean f9833m;

    /* renamed from: n */
    private boolean f9834n;

    /* renamed from: o */
    private boolean f9835o;

    /* renamed from: p */
    private String f9836p;

    /* renamed from: q */
    private String f9837q;

    /* renamed from: r */
    private Boolean f9838r;

    /* renamed from: s */
    private Double f9839s;

    public C3391i(IronSource.AD_UNIT adUnit) {
        OooOo.OooO0o0(adUnit, "adUnit");
        this.f9821a = adUnit;
        this.f9822b = new ArrayList<>();
        this.f9824d = "";
        this.f9826f = new HashMap();
        this.f9827g = new ArrayList();
        this.f9828h = -1;
        this.f9831k = "";
    }

    /* renamed from: i */
    public static /* synthetic */ void m10290i() {
    }

    /* renamed from: m */
    public static /* synthetic */ void m10291m() {
    }

    /* renamed from: a */
    public final IronSource.AD_UNIT m10292a() {
        return this.f9821a;
    }

    /* renamed from: b */
    public final String m10305b() {
        return this.f9837q;
    }

    /* renamed from: c */
    public final IronSource.AD_UNIT m10308c() {
        return this.f9821a;
    }

    /* renamed from: d */
    public final String m10311d() {
        return this.f9836p;
    }

    /* renamed from: e */
    public final C3390h m10314e() {
        return this.f9829i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3391i) && this.f9821a == ((C3391i) obj).f9821a;
    }

    /* renamed from: f */
    public final ISBannerSize m10316f() {
        return this.f9832l;
    }

    /* renamed from: g */
    public final Double m10317g() {
        return this.f9839s;
    }

    /* renamed from: h */
    public final Map<String, Object> m10318h() {
        return this.f9826f;
    }

    public int hashCode() {
        return this.f9821a.hashCode();
    }

    /* renamed from: j */
    public final String m10319j() {
        return this.f9824d;
    }

    /* renamed from: k */
    public final ArrayList<C3105f5> m10320k() {
        return this.f9822b;
    }

    /* renamed from: l */
    public final List<String> m10321l() {
        return this.f9827g;
    }

    /* renamed from: n */
    public final IronSourceSegment m10322n() {
        return this.f9830j;
    }

    /* renamed from: o */
    public final int m10323o() {
        return this.f9828h;
    }

    /* renamed from: p */
    public final boolean m10324p() {
        return this.f9834n;
    }

    /* renamed from: q */
    public final boolean m10325q() {
        return this.f9835o;
    }

    /* renamed from: r */
    public final String m10326r() {
        return this.f9831k;
    }

    /* renamed from: s */
    public final boolean m10327s() {
        return this.f9833m;
    }

    /* renamed from: t */
    public final boolean m10328t() {
        return this.f9825e;
    }

    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.f9821a + ')';
    }

    /* renamed from: u */
    public final Boolean m10329u() {
        return this.f9838r;
    }

    /* renamed from: v */
    public final boolean m10330v() {
        return this.f9823c;
    }

    /* renamed from: a */
    public final C3391i m10293a(IronSource.AD_UNIT adUnit) {
        OooOo.OooO0o0(adUnit, "adUnit");
        return new C3391i(adUnit);
    }

    /* renamed from: b */
    public final void m10306b(String str) {
        this.f9836p = str;
    }

    /* renamed from: c */
    public final void m10309c(String str) {
        OooOo.OooO0o0(str, "<set-?>");
        this.f9824d = str;
    }

    /* renamed from: d */
    public final void m10312d(String str) {
        OooOo.OooO0o0(str, "<set-?>");
        this.f9831k = str;
    }

    /* renamed from: e */
    public final void m10315e(boolean z) {
        this.f9835o = z;
    }

    /* renamed from: a */
    public static /* synthetic */ C3391i m10289a(C3391i c3391i, IronSource.AD_UNIT ad_unit, int i, Object obj) {
        if ((i & 1) != 0) {
            ad_unit = c3391i.f9821a;
        }
        return c3391i.m10293a(ad_unit);
    }

    /* renamed from: b */
    public final void m10307b(boolean z) {
        this.f9825e = z;
    }

    /* renamed from: c */
    public final void m10310c(boolean z) {
        this.f9823c = z;
    }

    /* renamed from: d */
    public final void m10313d(boolean z) {
        this.f9834n = z;
    }

    /* renamed from: a */
    public final void m10294a(int i) {
        this.f9828h = i;
    }

    /* renamed from: a */
    public final void m10295a(C3105f5 instanceInfo) {
        OooOo.OooO0o0(instanceInfo, "instanceInfo");
        this.f9822b.add(instanceInfo);
    }

    /* renamed from: a */
    public final void m10296a(ISBannerSize iSBannerSize) {
        this.f9832l = iSBannerSize;
    }

    /* renamed from: a */
    public final void m10297a(IronSourceSegment ironSourceSegment) {
        this.f9830j = ironSourceSegment;
    }

    /* renamed from: a */
    public final void m10298a(C3390h c3390h) {
        this.f9829i = c3390h;
    }

    /* renamed from: a */
    public final void m10299a(Boolean bool) {
        this.f9838r = bool;
    }

    /* renamed from: a */
    public final void m10300a(Double d) {
        this.f9839s = d;
    }

    /* renamed from: a */
    public final void m10301a(String str) {
        this.f9837q = str;
    }

    /* renamed from: a */
    public final void m10302a(List<String> list) {
        OooOo.OooO0o0(list, "<set-?>");
        this.f9827g = list;
    }

    /* renamed from: a */
    public final void m10303a(Map<String, Object> map) {
        OooOo.OooO0o0(map, "<set-?>");
        this.f9826f = map;
    }

    /* renamed from: a */
    public final void m10304a(boolean z) {
        this.f9833m = z;
    }
}
