package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.ironsource.o5 */
/* loaded from: classes2.dex */
public class C3477o5 {

    /* renamed from: a */
    private boolean f10604a;

    /* renamed from: b */
    private String f10605b;

    /* renamed from: c */
    private String f10606c;

    /* renamed from: d */
    private String f10607d;

    /* renamed from: e */
    private int f10608e;

    /* renamed from: f */
    private int f10609f;

    /* renamed from: g */
    private int f10610g;

    /* renamed from: h */
    private long f10611h;

    /* renamed from: i */
    private long f10612i;

    /* renamed from: j */
    private long f10613j;

    /* renamed from: k */
    private long f10614k;

    /* renamed from: l */
    private long f10615l;

    /* renamed from: m */
    private boolean f10616m;

    /* renamed from: n */
    private ArrayList<String> f10617n;

    /* renamed from: o */
    private boolean f10618o;

    /* renamed from: p */
    private boolean f10619p;

    /* renamed from: q */
    private int f10620q;

    /* renamed from: r */
    private boolean f10621r;

    /* renamed from: s */
    private boolean f10622s;

    /* renamed from: t */
    private boolean f10623t;

    public C3477o5() {
        this.f10605b = "";
        this.f10606c = "";
        this.f10607d = "";
        this.f10612i = 0L;
        this.f10613j = 0L;
        this.f10614k = 0L;
        this.f10615l = 0L;
        this.f10616m = true;
        this.f10617n = new ArrayList<>();
        this.f10610g = 0;
        this.f10618o = false;
        this.f10619p = false;
        this.f10620q = 1;
    }

    /* renamed from: a */
    public String m11086a() {
        return this.f10605b;
    }

    /* renamed from: b */
    public long m11089b() {
        return this.f10613j;
    }

    /* renamed from: c */
    public int m11090c() {
        return this.f10609f;
    }

    /* renamed from: d */
    public int m11091d() {
        return this.f10620q;
    }

    /* renamed from: e */
    public boolean m11092e() {
        return this.f10616m;
    }

    /* renamed from: f */
    public ArrayList<String> m11093f() {
        return this.f10617n;
    }

    /* renamed from: g */
    public int m11094g() {
        return this.f10608e;
    }

    /* renamed from: h */
    public boolean m11095h() {
        return this.f10604a;
    }

    /* renamed from: i */
    public int m11096i() {
        return this.f10610g;
    }

    /* renamed from: j */
    public long m11097j() {
        return this.f10614k;
    }

    /* renamed from: k */
    public long m11098k() {
        return this.f10612i;
    }

    /* renamed from: l */
    public long m11099l() {
        return this.f10615l;
    }

    /* renamed from: m */
    public long m11100m() {
        return this.f10611h;
    }

    /* renamed from: n */
    public boolean m11101n() {
        return this.f10623t;
    }

    /* renamed from: o */
    public boolean m11102o() {
        return this.f10618o;
    }

    /* renamed from: p */
    public boolean m11103p() {
        return this.f10619p;
    }

    /* renamed from: q */
    public boolean m11104q() {
        return this.f10622s;
    }

    /* renamed from: r */
    public boolean m11105r() {
        return this.f10621r;
    }

    public C3477o5(String str, String str2, String str3, int i, int i2, long j, long j2, long j3, long j4, long j5, boolean z, int i3, boolean z2, boolean z3, boolean z4, int i4, boolean z5, boolean z6, boolean z7) {
        this.f10605b = str;
        this.f10606c = str2;
        this.f10607d = str3;
        this.f10608e = i;
        this.f10609f = i2;
        this.f10611h = j;
        this.f10604a = z4;
        this.f10612i = j2;
        this.f10613j = j3;
        this.f10614k = j4;
        this.f10615l = j5;
        this.f10616m = z;
        this.f10610g = i3;
        this.f10617n = new ArrayList<>();
        this.f10618o = z2;
        this.f10619p = z3;
        this.f10620q = i4;
        this.f10621r = z5;
        this.f10622s = z6;
        this.f10623t = z7;
    }

    /* renamed from: a */
    public String m11087a(boolean z) {
        return z ? this.f10607d : this.f10606c;
    }

    /* renamed from: a */
    public void m11088a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f10617n.add(str);
    }
}
