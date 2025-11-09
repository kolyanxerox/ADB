package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.AbstractViewOnClickListenerC1152p2;
import com.applovin.impl.C1143o2;
import com.applovin.impl.C1288x6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.C1333R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.l0 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1081l0 extends AbstractActivityC1074k3 {

    /* renamed from: a */
    private C1220k f1034a;

    /* renamed from: b */
    private AbstractViewOnClickListenerC1152p2 f1035b;

    /* renamed from: com.applovin.impl.l0$a */
    public class a extends AbstractViewOnClickListenerC1152p2 {

        /* renamed from: e */
        final /* synthetic */ List f1036e;

        /* renamed from: f */
        final /* synthetic */ List f1037f;

        /* renamed from: g */
        final /* synthetic */ List f1038g;

        /* renamed from: h */
        final /* synthetic */ List f1039h;

        /* renamed from: i */
        final /* synthetic */ List f1040i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f1036e = list;
            this.f1037f = list2;
            this.f1038g = list3;
            this.f1039h = list4;
            this.f1040i = list5;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: b */
        public int mo131b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: c */
        public List mo132c(int i) {
            List list;
            boolean z = true;
            if (i == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f1036e;
            } else if (i == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f1037f;
            } else {
                z = false;
                list = i == c.LISTED_TC_NETWORKS.ordinal() ? this.f1038g : i == c.LISTED_AC_NETWORKS.ordinal() ? this.f1039h : this.f1040i;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractActivityC1081l0.this.m1279a((C1288x6) it.next(), z));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: d */
        public int mo133d(int i) {
            return i == c.MISSING_TC_NETWORKS.ordinal() ? this.f1036e.size() : i == c.MISSING_AC_NETWORKS.ordinal() ? this.f1037f.size() : i == c.LISTED_TC_NETWORKS.ordinal() ? this.f1038g.size() : i == c.LISTED_AC_NETWORKS.ordinal() ? this.f1039h.size() : this.f1040i.size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: e */
        public C1143o2 mo134e(int i) {
            return i == c.MISSING_TC_NETWORKS.ordinal() ? new C1250t4("MISSING TCF VENDORS (TC STRING)") : i == c.MISSING_AC_NETWORKS.ordinal() ? new C1250t4("MISSING ATP NETWORKS (AC STRING)") : i == c.LISTED_TC_NETWORKS.ordinal() ? new C1250t4("LISTED TCF VENDORS (TC STRING)") : i == c.LISTED_AC_NETWORKS.ordinal() ? new C1250t4("LISTED ATP NETWORKS (AC STRING)") : new C1250t4("NON-CONFIGURABLE NETWORKS");
        }
    }

    /* renamed from: com.applovin.impl.l0$b */
    public class b implements AbstractViewOnClickListenerC1152p2.a {
        public b() {
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2.a
        /* renamed from: a */
        public void mo2a(C1053i2 c1053i2, C1143o2 c1143o2) {
            AbstractC1078k7.m1195a(c1143o2.m1982c(), c1143o2.m1981b(), AbstractActivityC1081l0.this);
        }
    }

    /* renamed from: com.applovin.impl.l0$c */
    public enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        return this.f1034a;
    }

    public void initialize(List<C1288x6> list, List<C1288x6> list2, List<C1288x6> list3, List<C1288x6> list4, List<C1288x6> list5, C1220k c1220k) {
        this.f1034a = c1220k;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f1035b = aVar;
        aVar.m2059a(new b());
        this.f1035b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1333R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(C1333R.id.listView)).setAdapter((ListAdapter) this.f1035b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C1143o2 m1279a(C1288x6 c1288x6, boolean z) {
        C1143o2.b bVarM1978a = C1143o2.m1978a();
        boolean zM3622b = this.f1034a.m2920s0().m3622b();
        C1288x6.a aVarM3657f = c1288x6.m3657f();
        C1288x6.a aVar = C1288x6.a.TCF_VENDOR;
        if (aVarM3657f == aVar || (c1288x6.m3657f() == C1288x6.a.ATP_NETWORK && zM3622b)) {
            String strM3654c = c1288x6.m3654c();
            String str = c1288x6.m3657f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            C1143o2.b bVarM1998b = bVarM1978a.m2003d(strM3654c).m2002d(z ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).m1998b(strM3654c);
            StringBuilder sbOooOo0O = OooO0oO.OooOo.OooOo0O(str);
            sbOooOo0O.append(c1288x6.m3655d());
            bVarM1998b.m1993a(sbOooOo0O.toString()).m1994a(true);
        } else {
            bVarM1978a.m2003d(c1288x6.m3653b());
        }
        return bVarM1978a.m1995a();
    }
}
