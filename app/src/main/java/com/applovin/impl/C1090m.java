package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.m */
/* loaded from: classes.dex */
class C1090m extends AbstractViewOnClickListenerC1152p2 {

    /* renamed from: e */
    private final C1130n f1155e;

    /* renamed from: f */
    private final C1140o f1156f;

    /* renamed from: g */
    private final C1029f8 f1157g;

    /* renamed from: h */
    private final String f1158h;

    /* renamed from: i */
    private final List f1159i;

    /* renamed from: j */
    private final List f1160j;

    /* renamed from: k */
    private final List f1161k;

    /* renamed from: com.applovin.impl.m$a */
    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* renamed from: com.applovin.impl.m$b */
    public class b extends C1276w3 {

        /* renamed from: p */
        private final C1029f8 f1167p;

        public b(C1029f8 c1029f8, String str, boolean z) {
            super(c1029f8.m762b().m2313d(), C1090m.this.f1703a);
            this.f1167p = c1029f8;
            this.f1572c = StringUtils.createSpannedString(c1029f8.m762b().m2310a(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            this.f1573d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f1571b = z;
        }

        @Override // com.applovin.impl.C1143o2
        /* renamed from: g */
        public int mo1439g() {
            return -12303292;
        }

        @Override // com.applovin.impl.C1276w3, com.applovin.impl.C1143o2
        /* renamed from: o */
        public boolean mo1440o() {
            return this.f1571b;
        }

        /* renamed from: v */
        public C1029f8 m1441v() {
            return this.f1167p;
        }
    }

    public C1090m(C1130n c1130n, C1140o c1140o, C1029f8 c1029f8, Context context) {
        super(context);
        this.f1155e = c1130n;
        this.f1157g = c1029f8;
        this.f1156f = c1140o != null ? c1140o : c1130n.m1876f();
        this.f1158h = c1140o != null ? c1140o.m1926c() : c1130n.m1874d();
        this.f1159i = m1433h();
        this.f1160j = m1430e();
        this.f1161k = m1435l();
        notifyDataSetChanged();
    }

    /* renamed from: f */
    private C1143o2 m1431f() {
        return C1143o2.m1978a().m2003d("AB Test Experiment Name").m2001c(m1436j().m1925b()).m1995a();
    }

    /* renamed from: g */
    private C1143o2 m1432g() {
        return C1143o2.m1978a().m2003d("ID").m2001c(this.f1155e.m1873c()).m1995a();
    }

    /* renamed from: h */
    private List m1433h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(m1432g());
        arrayList.add(m1429d());
        if (this.f1156f.m1925b() != null) {
            arrayList.add(m1431f());
        }
        if (this.f1157g != null) {
            arrayList.add(m1434i());
        }
        return arrayList;
    }

    /* renamed from: i */
    private C1143o2 m1434i() {
        return C1143o2.m1978a().m2003d("Selected Network").m2001c(this.f1157g.m762b().m2310a()).m1995a();
    }

    /* renamed from: l */
    private List m1435l() {
        C1029f8 c1029f8 = this.f1157g;
        if (c1029f8 != null && c1029f8.m764d()) {
            return new ArrayList();
        }
        List<C1029f8> listM1928e = this.f1156f.m1928e();
        ArrayList arrayList = new ArrayList(listM1928e.size());
        for (C1029f8 c1029f82 : listM1928e) {
            C1029f8 c1029f83 = this.f1157g;
            if (c1029f83 == null || c1029f83.m762b().m2312c().equals(c1029f82.m762b().m2312c())) {
                arrayList.add(new b(c1029f82, null, this.f1157g == null));
                for (C1285x3 c1285x3 : c1029f82.m763c()) {
                    arrayList.add(C1143o2.m1978a().m2003d(c1285x3.m3647a()).m2001c(c1285x3.m3648b()).m1999b(true).m1995a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: b */
    public int mo131b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: c */
    public List mo132c(int i) {
        return i == a.INFO.ordinal() ? this.f1159i : i == a.BIDDERS.ordinal() ? this.f1160j : this.f1161k;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: d */
    public int mo133d(int i) {
        return i == a.INFO.ordinal() ? this.f1159i.size() : i == a.BIDDERS.ordinal() ? this.f1160j.size() : this.f1161k.size();
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: e */
    public C1143o2 mo134e(int i) {
        return i == a.INFO.ordinal() ? new C1250t4("INFO") : i == a.BIDDERS.ordinal() ? new C1250t4("BIDDERS") : new C1250t4("WATERFALL");
    }

    /* renamed from: j */
    public C1140o m1436j() {
        return this.f1156f;
    }

    /* renamed from: k */
    public String m1437k() {
        return this.f1158h;
    }

    /* renamed from: d */
    private C1143o2 m1429d() {
        return C1143o2.m1978a().m2003d("Ad Format").m2001c(this.f1155e.m1872b()).m1995a();
    }

    /* renamed from: e */
    private List m1430e() {
        C1029f8 c1029f8 = this.f1157g;
        if (c1029f8 != null && !c1029f8.m764d()) {
            return new ArrayList();
        }
        List<C1029f8> listM1924a = this.f1156f.m1924a();
        ArrayList arrayList = new ArrayList(listM1924a.size());
        for (C1029f8 c1029f82 : listM1924a) {
            C1029f8 c1029f83 = this.f1157g;
            if (c1029f83 == null || c1029f83.m762b().m2312c().equals(c1029f82.m762b().m2312c())) {
                arrayList.add(new b(c1029f82, c1029f82.m761a() != null ? c1029f82.m761a().m3647a() : "", this.f1157g == null));
            }
        }
        return arrayList;
    }
}
