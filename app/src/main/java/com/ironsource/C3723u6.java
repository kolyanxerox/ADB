package com.ironsource;

import java.util.ArrayList;

/* renamed from: com.ironsource.u6 */
/* loaded from: classes2.dex */
public class C3723u6 {

    /* renamed from: p */
    private static final int f12147p = 0;

    /* renamed from: a */
    private C3139g4 f12148a;

    /* renamed from: b */
    private int f12149b;

    /* renamed from: c */
    private long f12150c;

    /* renamed from: d */
    private boolean f12151d;

    /* renamed from: e */
    private ArrayList<C3177h7> f12152e;

    /* renamed from: f */
    private C3177h7 f12153f;

    /* renamed from: g */
    private int f12154g;

    /* renamed from: h */
    private int f12155h;

    /* renamed from: i */
    private C3477o5 f12156i;

    /* renamed from: j */
    private boolean f12157j;

    /* renamed from: k */
    private long f12158k;

    /* renamed from: l */
    private boolean f12159l;

    /* renamed from: m */
    private boolean f12160m;

    /* renamed from: n */
    private boolean f12161n;

    /* renamed from: o */
    private long f12162o;

    public C3723u6() {
        this.f12148a = new C3139g4();
        this.f12152e = new ArrayList<>();
    }

    /* renamed from: a */
    public int m12542a() {
        return this.f12149b;
    }

    /* renamed from: b */
    public long m12545b() {
        return this.f12150c;
    }

    /* renamed from: c */
    public boolean m12546c() {
        return this.f12151d;
    }

    /* renamed from: d */
    public C3477o5 m12547d() {
        return this.f12156i;
    }

    /* renamed from: e */
    public long m12548e() {
        return this.f12158k;
    }

    /* renamed from: f */
    public int m12549f() {
        return this.f12155h;
    }

    /* renamed from: g */
    public C3139g4 m12550g() {
        return this.f12148a;
    }

    /* renamed from: h */
    public int m12551h() {
        return this.f12154g;
    }

    /* renamed from: i */
    public C3177h7 m12552i() {
        ArrayList<C3177h7> arrayList = this.f12152e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C3177h7 c3177h7 = arrayList.get(i);
            i++;
            C3177h7 c3177h72 = c3177h7;
            if (c3177h72.isDefault()) {
                return c3177h72;
            }
        }
        C3177h7 c3177h73 = this.f12153f;
        return c3177h73 != null ? c3177h73 : new C3320lb();
    }

    /* renamed from: j */
    public long m12553j() {
        return this.f12162o;
    }

    /* renamed from: k */
    public boolean m12554k() {
        return this.f12157j;
    }

    /* renamed from: l */
    public boolean m12555l() {
        return this.f12159l;
    }

    /* renamed from: m */
    public boolean m12556m() {
        return this.f12161n;
    }

    /* renamed from: n */
    public boolean m12557n() {
        return this.f12160m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BannerConfigurations{parallelLoad=");
        sb.append(this.f12149b);
        sb.append(", bidderExclusive=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f12151d, '}');
    }

    public C3723u6(int i, long j, boolean z, C3139g4 c3139g4, int i2, C3477o5 c3477o5, int i3, boolean z2, long j2, boolean z3, boolean z4, boolean z5, long j3) {
        this.f12152e = new ArrayList<>();
        this.f12149b = i;
        this.f12150c = j;
        this.f12151d = z;
        this.f12148a = c3139g4;
        this.f12154g = i2;
        this.f12155h = i3;
        this.f12156i = c3477o5;
        this.f12157j = z2;
        this.f12158k = j2;
        this.f12159l = z3;
        this.f12160m = z4;
        this.f12161n = z5;
        this.f12162o = j3;
    }

    /* renamed from: a */
    public C3177h7 m12543a(String str) {
        ArrayList<C3177h7> arrayList = this.f12152e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C3177h7 c3177h7 = arrayList.get(i);
            i++;
            C3177h7 c3177h72 = c3177h7;
            if (c3177h72.getPlacementName().equals(str)) {
                return c3177h72;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m12544a(C3177h7 c3177h7) {
        if (c3177h7 != null) {
            this.f12152e.add(c3177h7);
            if (this.f12153f == null || c3177h7.isPlacementId(0)) {
                this.f12153f = c3177h7;
            }
        }
    }
}
