package com.ironsource;

import com.ironsource.mediationsdk.model.InterstitialPlacement;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.uj */
/* loaded from: classes2.dex */
public class C3736uj {

    /* renamed from: n */
    private static final int f12240n = 0;

    /* renamed from: a */
    private ArrayList<InterstitialPlacement> f12241a;

    /* renamed from: b */
    private C3139g4 f12242b;

    /* renamed from: c */
    private int f12243c;

    /* renamed from: d */
    private boolean f12244d;

    /* renamed from: e */
    private int f12245e;

    /* renamed from: f */
    private int f12246f;

    /* renamed from: g */
    private C3477o5 f12247g;

    /* renamed from: h */
    private boolean f12248h;

    /* renamed from: i */
    private long f12249i;

    /* renamed from: j */
    private boolean f12250j;

    /* renamed from: k */
    private boolean f12251k;

    /* renamed from: l */
    private boolean f12252l;

    /* renamed from: m */
    private InterstitialPlacement f12253m;

    public C3736uj() {
        this.f12241a = new ArrayList<>();
        this.f12242b = new C3139g4();
        this.f12247g = new C3477o5();
    }

    /* renamed from: a */
    public InterstitialPlacement m12682a() {
        ArrayList<InterstitialPlacement> arrayList = this.f12241a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            InterstitialPlacement interstitialPlacement = arrayList.get(i);
            i++;
            InterstitialPlacement interstitialPlacement2 = interstitialPlacement;
            if (interstitialPlacement2.isDefault()) {
                return interstitialPlacement2;
            }
        }
        return this.f12253m;
    }

    /* renamed from: b */
    public int m12685b() {
        return this.f12246f;
    }

    /* renamed from: c */
    public int m12686c() {
        return this.f12243c;
    }

    /* renamed from: d */
    public int m12687d() {
        return this.f12245e;
    }

    /* renamed from: e */
    public long m12688e() {
        return TimeUnit.SECONDS.toMillis(this.f12245e);
    }

    /* renamed from: f */
    public boolean m12689f() {
        return this.f12244d;
    }

    /* renamed from: g */
    public C3477o5 m12690g() {
        return this.f12247g;
    }

    /* renamed from: h */
    public long m12691h() {
        return this.f12249i;
    }

    /* renamed from: i */
    public C3139g4 m12692i() {
        return this.f12242b;
    }

    /* renamed from: j */
    public boolean m12693j() {
        return this.f12248h;
    }

    /* renamed from: k */
    public boolean m12694k() {
        return this.f12250j;
    }

    /* renamed from: l */
    public boolean m12695l() {
        return this.f12252l;
    }

    /* renamed from: m */
    public boolean m12696m() {
        return this.f12251k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InterstitialConfigurations{parallelLoad=");
        sb.append(this.f12243c);
        sb.append(", bidderExclusive=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f12244d, '}');
    }

    public C3736uj(int i, boolean z, int i2, C3139g4 c3139g4, C3477o5 c3477o5, int i3, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.f12241a = new ArrayList<>();
        this.f12243c = i;
        this.f12244d = z;
        this.f12245e = i2;
        this.f12242b = c3139g4;
        this.f12247g = c3477o5;
        this.f12250j = z3;
        this.f12251k = z4;
        this.f12246f = i3;
        this.f12248h = z2;
        this.f12249i = j;
        this.f12252l = z5;
    }

    /* renamed from: a */
    public InterstitialPlacement m12683a(String str) {
        ArrayList<InterstitialPlacement> arrayList = this.f12241a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            InterstitialPlacement interstitialPlacement = arrayList.get(i);
            i++;
            InterstitialPlacement interstitialPlacement2 = interstitialPlacement;
            if (interstitialPlacement2.getPlacementName().equals(str)) {
                return interstitialPlacement2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m12684a(InterstitialPlacement interstitialPlacement) {
        if (interstitialPlacement != null) {
            this.f12241a.add(interstitialPlacement);
            if (this.f12253m == null || interstitialPlacement.isPlacementId(0)) {
                this.f12253m = interstitialPlacement;
            }
        }
    }
}
