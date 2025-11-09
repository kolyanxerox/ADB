package com.ironsource;

import com.ironsource.mediationsdk.model.Placement;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.bs */
/* loaded from: classes2.dex */
public class C2983bs {

    /* renamed from: o */
    private static final int f7626o = 0;

    /* renamed from: a */
    private ArrayList<Placement> f7627a;

    /* renamed from: b */
    private C3139g4 f7628b;

    /* renamed from: c */
    private int f7629c;

    /* renamed from: d */
    private boolean f7630d;

    /* renamed from: e */
    private int f7631e;

    /* renamed from: f */
    private int f7632f;

    /* renamed from: g */
    private int f7633g;

    /* renamed from: h */
    private long f7634h;

    /* renamed from: i */
    private boolean f7635i;

    /* renamed from: j */
    private boolean f7636j;

    /* renamed from: k */
    private boolean f7637k;

    /* renamed from: l */
    private Placement f7638l;

    /* renamed from: m */
    private C3477o5 f7639m;

    /* renamed from: n */
    private boolean f7640n;

    public C2983bs() {
        this.f7627a = new ArrayList<>();
        this.f7628b = new C3139g4();
    }

    /* renamed from: a */
    public Placement m7982a() {
        ArrayList<Placement> arrayList = this.f7627a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Placement placement = arrayList.get(i);
            i++;
            Placement placement2 = placement;
            if (placement2.isDefault()) {
                return placement2;
            }
        }
        return this.f7638l;
    }

    /* renamed from: b */
    public int m7985b() {
        return this.f7633g;
    }

    /* renamed from: c */
    public int m7986c() {
        return this.f7632f;
    }

    /* renamed from: d */
    public boolean m7987d() {
        return this.f7640n;
    }

    /* renamed from: e */
    public ArrayList<Placement> m7988e() {
        return this.f7627a;
    }

    /* renamed from: f */
    public boolean m7989f() {
        return this.f7635i;
    }

    /* renamed from: g */
    public int m7990g() {
        return this.f7629c;
    }

    /* renamed from: h */
    public int m7991h() {
        return this.f7631e;
    }

    /* renamed from: i */
    public long m7992i() {
        return TimeUnit.SECONDS.toMillis(this.f7631e);
    }

    /* renamed from: j */
    public boolean m7993j() {
        return this.f7630d;
    }

    /* renamed from: k */
    public C3477o5 m7994k() {
        return this.f7639m;
    }

    /* renamed from: l */
    public long m7995l() {
        return this.f7634h;
    }

    /* renamed from: m */
    public C3139g4 m7996m() {
        return this.f7628b;
    }

    /* renamed from: n */
    public boolean m7997n() {
        return this.f7637k;
    }

    /* renamed from: o */
    public boolean m7998o() {
        return this.f7636j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RewardedVideoConfigurations{parallelLoad=");
        sb.append(this.f7629c);
        sb.append(", bidderExclusive=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f7630d, '}');
    }

    public C2983bs(int i, boolean z, int i2, int i3, C3139g4 c3139g4, C3477o5 c3477o5, int i4, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.f7627a = new ArrayList<>();
        this.f7629c = i;
        this.f7630d = z;
        this.f7631e = i2;
        this.f7628b = c3139g4;
        this.f7632f = i3;
        this.f7639m = c3477o5;
        this.f7633g = i4;
        this.f7640n = z2;
        this.f7634h = j;
        this.f7635i = z3;
        this.f7636j = z4;
        this.f7637k = z5;
    }

    /* renamed from: a */
    public Placement m7983a(String str) {
        ArrayList<Placement> arrayList = this.f7627a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Placement placement = arrayList.get(i);
            i++;
            Placement placement2 = placement;
            if (placement2.getPlacementName().equals(str)) {
                return placement2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m7984a(Placement placement) {
        if (placement != null) {
            this.f7627a.add(placement);
            if (this.f7638l == null || placement.isPlacementId(0)) {
                this.f7638l = placement;
            }
        }
    }
}
