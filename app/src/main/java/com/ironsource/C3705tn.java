package com.ironsource;

import java.util.ArrayList;

/* renamed from: com.ironsource.tn */
/* loaded from: classes2.dex */
public final class C3705tn {

    /* renamed from: m */
    public static final a f12084m = new a(null);

    /* renamed from: n */
    private static final int f12085n = 0;

    /* renamed from: a */
    private final boolean f12086a;

    /* renamed from: b */
    private C3139g4 f12087b;

    /* renamed from: c */
    private int f12088c;

    /* renamed from: d */
    private long f12089d;

    /* renamed from: e */
    private boolean f12090e;

    /* renamed from: f */
    private final ArrayList<C3089eo> f12091f;

    /* renamed from: g */
    private C3089eo f12092g;

    /* renamed from: h */
    private int f12093h;

    /* renamed from: i */
    private C3477o5 f12094i;

    /* renamed from: j */
    private long f12095j;

    /* renamed from: k */
    private boolean f12096k;

    /* renamed from: l */
    private boolean f12097l;

    /* renamed from: com.ironsource.tn$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    public C3705tn(int i, long j, boolean z, C3139g4 events, C3477o5 auctionSettings, int i2, long j2, boolean z2, boolean z3, boolean z4) {
        kotlin.jvm.internal.OooOo.OooO0o0(events, "events");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionSettings, "auctionSettings");
        this.f12086a = z4;
        this.f12091f = new ArrayList<>();
        this.f12088c = i;
        this.f12089d = j;
        this.f12090e = z;
        this.f12087b = events;
        this.f12093h = i2;
        this.f12094i = auctionSettings;
        this.f12095j = j2;
        this.f12096k = z2;
        this.f12097l = z3;
    }

    /* renamed from: a */
    public final C3089eo m12460a(String placementName) {
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
        ArrayList<C3089eo> arrayList = this.f12091f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C3089eo c3089eo = arrayList.get(i);
            i++;
            C3089eo c3089eo2 = c3089eo;
            if (kotlin.jvm.internal.OooOo.OooO00o(c3089eo2.getPlacementName(), placementName)) {
                return c3089eo2;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int m12468b() {
        return this.f12088c;
    }

    /* renamed from: c */
    public final long m12472c() {
        return this.f12089d;
    }

    /* renamed from: d */
    public final C3477o5 m12474d() {
        return this.f12094i;
    }

    /* renamed from: e */
    public final C3089eo m12475e() {
        ArrayList<C3089eo> arrayList = this.f12091f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C3089eo c3089eo = arrayList.get(i);
            i++;
            C3089eo c3089eo2 = c3089eo;
            if (c3089eo2.isDefault()) {
                return c3089eo2;
            }
        }
        return this.f12092g;
    }

    /* renamed from: f */
    public final int m12476f() {
        return this.f12093h;
    }

    /* renamed from: g */
    public final C3139g4 m12477g() {
        return this.f12087b;
    }

    /* renamed from: h */
    public final long m12478h() {
        return this.f12095j;
    }

    /* renamed from: i */
    public final boolean m12479i() {
        return this.f12096k;
    }

    /* renamed from: j */
    public final boolean m12480j() {
        return this.f12086a;
    }

    /* renamed from: k */
    public final boolean m12481k() {
        return this.f12097l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeAdConfigurations{parallelLoad=");
        sb.append(this.f12088c);
        sb.append(", bidderExclusive=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f12090e, '}');
    }

    /* renamed from: a */
    public final void m12461a(int i) {
        this.f12088c = i;
    }

    /* renamed from: b */
    public final void m12469b(int i) {
        this.f12093h = i;
    }

    /* renamed from: c */
    public final void m12473c(boolean z) {
        this.f12097l = z;
    }

    /* renamed from: a */
    public final void m12462a(long j) {
        this.f12089d = j;
    }

    /* renamed from: b */
    public final void m12470b(long j) {
        this.f12095j = j;
    }

    /* renamed from: a */
    public final void m12463a(C3089eo c3089eo) {
        if (c3089eo != null) {
            this.f12091f.add(c3089eo);
            if (this.f12092g == null || c3089eo.getPlacementId() == 0) {
                this.f12092g = c3089eo;
            }
        }
    }

    /* renamed from: b */
    public final void m12471b(boolean z) {
        this.f12096k = z;
    }

    /* renamed from: a */
    public final void m12464a(C3139g4 c3139g4) {
        kotlin.jvm.internal.OooOo.OooO0o0(c3139g4, "<set-?>");
        this.f12087b = c3139g4;
    }

    /* renamed from: a */
    public final void m12465a(C3477o5 c3477o5) {
        kotlin.jvm.internal.OooOo.OooO0o0(c3477o5, "<set-?>");
        this.f12094i = c3477o5;
    }

    /* renamed from: a */
    public final void m12466a(boolean z) {
        this.f12090e = z;
    }

    /* renamed from: a */
    public final boolean m12467a() {
        return this.f12090e;
    }
}
