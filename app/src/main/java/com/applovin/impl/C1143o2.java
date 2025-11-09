package com.applovin.impl;

import android.R;
import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.C1333R;

/* renamed from: com.applovin.impl.o2 */
/* loaded from: classes.dex */
public class C1143o2 {

    /* renamed from: a */
    protected c f1570a;

    /* renamed from: b */
    protected boolean f1571b;

    /* renamed from: c */
    protected SpannedString f1572c;

    /* renamed from: d */
    protected SpannedString f1573d;

    /* renamed from: e */
    protected String f1574e;

    /* renamed from: f */
    protected String f1575f;

    /* renamed from: g */
    protected int f1576g;

    /* renamed from: h */
    protected int f1577h;

    /* renamed from: i */
    protected int f1578i;

    /* renamed from: j */
    protected int f1579j;

    /* renamed from: k */
    protected int f1580k;

    /* renamed from: l */
    protected int f1581l;

    /* renamed from: m */
    protected boolean f1582m;

    /* renamed from: com.applovin.impl.o2$b */
    public static class b {

        /* renamed from: a */
        final c f1583a;

        /* renamed from: b */
        boolean f1584b;

        /* renamed from: c */
        SpannedString f1585c;

        /* renamed from: d */
        SpannedString f1586d;

        /* renamed from: e */
        String f1587e;

        /* renamed from: f */
        String f1588f;

        /* renamed from: g */
        int f1589g = 0;

        /* renamed from: h */
        int f1590h = 0;

        /* renamed from: i */
        int f1591i = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: j */
        int f1592j = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: k */
        int f1593k = 0;

        /* renamed from: l */
        int f1594l = 0;

        /* renamed from: m */
        boolean f1595m;

        public b(c cVar) {
            this.f1583a = cVar;
        }

        /* renamed from: a */
        public b m1994a(boolean z) {
            this.f1584b = z;
            return this;
        }

        /* renamed from: b */
        public b m1997b(SpannedString spannedString) {
            this.f1585c = spannedString;
            return this;
        }

        /* renamed from: c */
        public b m2001c(String str) {
            return m1992a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        /* renamed from: d */
        public b m2003d(String str) {
            return m1997b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        /* renamed from: a */
        public b m1992a(SpannedString spannedString) {
            this.f1586d = spannedString;
            return this;
        }

        /* renamed from: b */
        public b m1998b(String str) {
            this.f1587e = str;
            return this;
        }

        /* renamed from: a */
        public b m1993a(String str) {
            this.f1588f = str;
            return this;
        }

        /* renamed from: b */
        public b m1996b(int i) {
            this.f1594l = i;
            return this;
        }

        /* renamed from: c */
        public b m2000c(int i) {
            this.f1592j = i;
            return this;
        }

        /* renamed from: d */
        public b m2002d(int i) {
            this.f1591i = i;
            return this;
        }

        /* renamed from: a */
        public b m1990a(int i) {
            this.f1590h = i;
            return this;
        }

        /* renamed from: b */
        public b m1999b(boolean z) {
            this.f1595m = z;
            return this;
        }

        /* renamed from: a */
        public b m1991a(Context context) {
            this.f1590h = C1333R.drawable.applovin_ic_disclosure_arrow;
            this.f1594l = AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        /* renamed from: a */
        public C1143o2 m1995a() {
            return new C1143o2(this);
        }
    }

    /* renamed from: com.applovin.impl.o2$c */
    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* renamed from: a */
        private final int f1603a;

        c(int i) {
            this.f1603a = i;
        }

        /* renamed from: b */
        public int m2005b() {
            return this == SECTION ? C1333R.layout.mediation_debugger_list_section : this == SECTION_CENTERED ? C1333R.layout.mediation_debugger_list_section_centered : this == SIMPLE ? R.layout.simple_list_item_1 : this == DETAIL ? C1333R.layout.applovin_debugger_list_item_detail : C1333R.layout.mediation_debugger_list_item_right_detail;
        }

        /* renamed from: c */
        public int m2006c() {
            return this.f1603a;
        }
    }

    /* renamed from: a */
    public static b m1978a() {
        return m1979a(c.RIGHT_DETAIL);
    }

    /* renamed from: n */
    public static int m1980n() {
        return c.COUNT.m2006c();
    }

    /* renamed from: b */
    public String m1981b() {
        return this.f1575f;
    }

    /* renamed from: c */
    public String m1982c() {
        return this.f1574e;
    }

    /* renamed from: d */
    public int mo135d() {
        return this.f1577h;
    }

    /* renamed from: e */
    public int mo136e() {
        return this.f1581l;
    }

    /* renamed from: f */
    public SpannedString mo1983f() {
        return this.f1573d;
    }

    /* renamed from: g */
    public int mo1439g() {
        return this.f1579j;
    }

    /* renamed from: h */
    public int mo1984h() {
        return this.f1576g;
    }

    /* renamed from: i */
    public int m1985i() {
        return this.f1580k;
    }

    /* renamed from: j */
    public int m1986j() {
        return this.f1570a.m2005b();
    }

    /* renamed from: k */
    public SpannedString mo137k() {
        return this.f1572c;
    }

    /* renamed from: l */
    public int m1987l() {
        return this.f1578i;
    }

    /* renamed from: m */
    public int m1988m() {
        return this.f1570a.m2006c();
    }

    /* renamed from: o */
    public boolean mo1440o() {
        return this.f1571b;
    }

    /* renamed from: p */
    public boolean mo1989p() {
        return this.f1582m;
    }

    public C1143o2(c cVar) {
        this.f1576g = 0;
        this.f1577h = 0;
        this.f1578i = ViewCompat.MEASURED_STATE_MASK;
        this.f1579j = ViewCompat.MEASURED_STATE_MASK;
        this.f1580k = 0;
        this.f1581l = 0;
        this.f1570a = cVar;
    }

    /* renamed from: a */
    public static b m1979a(c cVar) {
        return new b(cVar);
    }

    private C1143o2(b bVar) {
        this.f1576g = 0;
        this.f1577h = 0;
        this.f1578i = ViewCompat.MEASURED_STATE_MASK;
        this.f1579j = ViewCompat.MEASURED_STATE_MASK;
        this.f1580k = 0;
        this.f1581l = 0;
        this.f1570a = bVar.f1583a;
        this.f1571b = bVar.f1584b;
        this.f1572c = bVar.f1585c;
        this.f1573d = bVar.f1586d;
        this.f1574e = bVar.f1587e;
        this.f1575f = bVar.f1588f;
        this.f1576g = bVar.f1589g;
        this.f1577h = bVar.f1590h;
        this.f1578i = bVar.f1591i;
        this.f1579j = bVar.f1592j;
        this.f1580k = bVar.f1593k;
        this.f1581l = bVar.f1594l;
        this.f1582m = bVar.f1595m;
    }
}
