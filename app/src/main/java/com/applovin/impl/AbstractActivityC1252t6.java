package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.C1288x6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.C1333R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.t6 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1252t6 extends AbstractActivityC1074k3 {

    /* renamed from: a */
    private C1220k f2394a;

    /* renamed from: b */
    private AbstractViewOnClickListenerC1152p2 f2395b;

    /* renamed from: com.applovin.impl.t6$a */
    public class a extends AbstractViewOnClickListenerC1152p2 {

        /* renamed from: e */
        final /* synthetic */ ArrayList f2396e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2397f;

        /* renamed from: g */
        final /* synthetic */ boolean f2398g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z) {
            super(context);
            this.f2396e = arrayList;
            this.f2397f = arrayList2;
            this.f2398g = z;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: b */
        public int mo131b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: c */
        public List mo132c(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.f2396e : this.f2397f;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: d */
        public int mo133d(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.f2396e.size() : this.f2397f.size();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: e */
        public C1143o2 mo134e(int i) {
            if (i == b.TC_NETWORKS.ordinal()) {
                return new C1250t4("TCF VENDORS (TC STRING)");
            }
            return new C1250t4(this.f2398g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    /* renamed from: com.applovin.impl.t6$b */
    public enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    /* renamed from: a */
    private C1143o2 m3349a(String str, String str2) {
        return C1143o2.m1978a().m2003d(str).m2001c(str2).m1995a();
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        return this.f2394a;
    }

    public void initialize(List<C1288x6> list, C1220k c1220k) {
        this.f2394a = c1220k;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM2051a = AbstractC1150p0.m2046b().m2051a(this);
        boolean zM3622b = c1220k.m2920s0().m3622b();
        if (!zM3622b) {
            arrayList2.add(m3349a("Has User Consent", strM2051a));
        }
        for (C1288x6 c1288x6 : list) {
            Boolean boolM3651a = c1288x6.m3651a();
            if (boolM3651a != null) {
                if (c1288x6.m3657f() == C1288x6.a.TCF_VENDOR) {
                    arrayList.add(m3349a(c1288x6.m3653b(), String.valueOf(boolM3651a)));
                } else if (c1288x6.m3657f() == C1288x6.a.ATP_NETWORK) {
                    arrayList2.add(m3349a(c1288x6.m3653b(), String.valueOf(boolM3651a)));
                }
            } else if (zM3622b && c1288x6.m3657f() == C1288x6.a.ATP_NETWORK) {
                arrayList2.add(m3349a(c1288x6.m3653b(), strM2051a));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, zM3622b);
        this.f2395b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1333R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(C1333R.id.listView)).setAdapter((ListAdapter) this.f2395b);
    }
}
