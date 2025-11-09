package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.C0984b3;
import com.applovin.impl.C1143o2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.C1333R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.d3 */
/* loaded from: classes.dex */
public class C1004d3 extends AbstractViewOnClickListenerC1152p2 {

    /* renamed from: e */
    private final C0984b3 f644e;

    /* renamed from: f */
    private List f645f;

    /* renamed from: g */
    private final List f646g;

    /* renamed from: h */
    private final List f647h;

    /* renamed from: i */
    private final List f648i;

    /* renamed from: j */
    private final List f649j;

    /* renamed from: k */
    private SpannedString f650k;

    /* renamed from: com.applovin.impl.d3$a */
    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    public C1004d3(C0984b3 c0984b3, Context context) {
        super(context);
        this.f644e = c0984b3;
        if (c0984b3.m365q() == C0984b3.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f650k = new SpannedString(spannableString);
        } else {
            this.f650k = new SpannedString("");
        }
        this.f645f = m590g();
        this.f646g = m582b(c0984b3.m362n());
        this.f647h = m587e();
        this.f648i = m580a(c0984b3.m354f());
        this.f649j = m592j();
        notifyDataSetChanged();
    }

    /* renamed from: f */
    private C1143o2 m588f() {
        if (this.f644e.m346I()) {
            return null;
        }
        return C1143o2.m1978a().m2003d("Initialization Status").m2001c(m589f(this.f644e.m357i())).m1994a(false).m1995a();
    }

    /* renamed from: g */
    private List m590g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(m591i(), arrayList);
        CollectionUtils.addObjectIfExists(m586d(), arrayList);
        CollectionUtils.addObjectIfExists(m588f(), arrayList);
        return arrayList;
    }

    /* renamed from: i */
    private C1143o2 m591i() {
        C1143o2.b bVarM2001c = C1143o2.m1978a().m2003d("SDK").m2001c(this.f644e.m364p());
        if (TextUtils.isEmpty(this.f644e.m364p())) {
            bVarM2001c.m1990a(m577a(this.f644e.m344G())).m1996b(m581b(this.f644e.m344G()));
        }
        return bVarM2001c.m1995a();
    }

    /* renamed from: j */
    private List m592j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f644e.m370v())) {
            arrayList.add(C1143o2.m1979a(C1143o2.c.DETAIL).m2003d(this.f644e.m370v()).m1995a());
        }
        if (this.f644e.m373y() == C0984b3.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f644e.m367s() != null) {
            arrayList.add(m584c(this.f644e.m367s()));
        }
        arrayList.add(m578a(this.f644e.m373y()));
        return arrayList;
    }

    /* renamed from: a */
    public boolean m593a(C1053i2 c1053i2) {
        return c1053i2.m969b() == a.TEST_ADS.ordinal() && c1053i2.m968a() == this.f649j.size() - 1;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: b */
    public int mo131b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: c */
    public List mo132c(int i) {
        return i == a.INTEGRATIONS.ordinal() ? this.f645f : i == a.PERMISSIONS.ordinal() ? this.f646g : i == a.CONFIGURATION.ordinal() ? this.f647h : i == a.DEPENDENCIES.ordinal() ? this.f648i : this.f649j;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: d */
    public int mo133d(int i) {
        return i == a.INTEGRATIONS.ordinal() ? this.f645f.size() : i == a.PERMISSIONS.ordinal() ? this.f646g.size() : i == a.CONFIGURATION.ordinal() ? this.f647h.size() : i == a.DEPENDENCIES.ordinal() ? this.f648i.size() : this.f649j.size();
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: e */
    public C1143o2 mo134e(int i) {
        return i == a.INTEGRATIONS.ordinal() ? new C1250t4("INTEGRATIONS") : i == a.PERMISSIONS.ordinal() ? new C1250t4("PERMISSIONS") : i == a.CONFIGURATION.ordinal() ? new C1250t4("CONFIGURATION") : i == a.DEPENDENCIES.ordinal() ? new C1250t4("DEPENDENCIES") : new C1250t4("TEST ADS");
    }

    /* renamed from: h */
    public C0984b3 m594h() {
        return this.f644e;
    }

    /* renamed from: k */
    public void m595k() {
        this.f645f = m590g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    /* renamed from: a */
    private List m580a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1062j1 c1062j1 = (C1062j1) it.next();
                arrayList.add(m579a(c1062j1.m1034b(), c1062j1.m1033a(), c1062j1.m1035c(), true));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private List m582b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1095m4 c1095m4 = (C1095m4) it.next();
                arrayList.add(m579a(c1095m4.m1498b(), c1095m4.m1497a(), c1095m4.m1499c(), true));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private String m589f(int i) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() != i && MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() != i && MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() != i) {
            if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i) {
                return "Failure";
            }
            if (MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i) {
                return "Initializing...";
            }
            return "Not Initialized";
        }
        return "Initialized";
    }

    /* renamed from: a */
    private C1143o2 m578a(C0984b3.b bVar) {
        C1143o2.b bVarM1978a = C1143o2.m1978a();
        if (bVar == C0984b3.b.READY) {
            bVarM1978a.m1991a(this.f1703a);
        }
        return bVarM1978a.m2003d("Test Mode").m2001c(bVar.m380c()).m2000c(bVar.m381d()).m1998b("Restart Required").m1993a(bVar.m379b()).m1994a(true).m1995a();
    }

    /* renamed from: b */
    private int m581b(boolean z) {
        return AbstractC1091m0.m1442a(z ? C1333R.color.applovin_sdk_checkmarkColor : C1333R.color.applovin_sdk_xmarkColor, this.f1703a);
    }

    /* renamed from: c */
    private C1143o2 m584c(List list) {
        return C1143o2.m1978a().m2003d("Region/VPN Required").m2001c(CollectionUtils.implode(list, ", ", list.size())).m1995a();
    }

    /* renamed from: d */
    private C1143o2 m586d() {
        C1143o2.b bVarM2001c = C1143o2.m1978a().m2003d("Adapter").m2001c(this.f644e.m351c());
        if (TextUtils.isEmpty(this.f644e.m351c())) {
            bVarM2001c.m1990a(m577a(this.f644e.m338A())).m1996b(m581b(this.f644e.m338A()));
        }
        return bVarM2001c.m1995a();
    }

    /* renamed from: e */
    private List m587e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f644e.m342E()) {
            arrayList.add(m579a("Java 8", "For optimal performance, please enable Java 8 support. See: https://developers.applovin.com/en/android/overview/integration", C1220k.m2783G0(), true));
        }
        return arrayList;
    }

    /* renamed from: c */
    private int m583c(boolean z) {
        return z ? C1333R.drawable.applovin_ic_x_mark : C1333R.drawable.applovin_ic_warning;
    }

    /* renamed from: d */
    private int m585d(boolean z) {
        return AbstractC1091m0.m1442a(z ? C1333R.color.applovin_sdk_xmarkColor : C1333R.color.applovin_sdk_warningColor, this.f1703a);
    }

    /* renamed from: a */
    private C1143o2 m579a(String str, String str2, boolean z, boolean z2) {
        return C1143o2.m1979a(z ? C1143o2.c.RIGHT_DETAIL : C1143o2.c.DETAIL).m2003d(str).m1992a(z ? null : this.f650k).m1998b("Instructions").m1993a(str2).m1990a(z ? C1333R.drawable.applovin_ic_check_mark_bordered : m583c(z2)).m1996b(z ? AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_checkmarkColor, this.f1703a) : m585d(z2)).m1994a(!z).m1995a();
    }

    /* renamed from: a */
    private int m577a(boolean z) {
        return z ? C1333R.drawable.applovin_ic_check_mark_bordered : C1333R.drawable.applovin_ic_x_mark;
    }
}
