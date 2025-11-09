package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.AbstractC1000d;
import com.applovin.impl.AbstractViewOnClickListenerC1152p2;
import com.applovin.impl.C1084l3;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.applovin.sdk.C1333R;

/* renamed from: com.applovin.impl.j3 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1064j3 extends AbstractActivityC1074k3 {

    /* renamed from: a */
    private C1084l3 f927a;

    /* renamed from: b */
    private DataSetObserver f928b;

    /* renamed from: c */
    private FrameLayout f929c;

    /* renamed from: d */
    private ListView f930d;

    /* renamed from: e */
    private C0952a f931e;

    /* renamed from: com.applovin.impl.j3$a */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractActivityC1064j3.this.m1039a();
            AbstractActivityC1064j3 abstractActivityC1064j3 = AbstractActivityC1064j3.this;
            abstractActivityC1064j3.m1045b((Context) abstractActivityC1064j3);
        }
    }

    /* renamed from: com.applovin.impl.j3$b */
    public class b implements AbstractViewOnClickListenerC1152p2.a {

        /* renamed from: a */
        final /* synthetic */ C0990c f933a;

        /* renamed from: com.applovin.impl.j3$b$a */
        public class a implements AbstractC1000d.b {
            public a() {
            }

            @Override // com.applovin.impl.AbstractC1000d.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo327a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(AbstractActivityC1064j3.this.f927a.m1318t());
            }
        }

        /* renamed from: com.applovin.impl.j3$b$b, reason: collision with other inner class name */
        public class C4553b implements AbstractC1000d.b {
            public C4553b() {
            }

            @Override // com.applovin.impl.AbstractC1000d.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo327a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(AbstractActivityC1064j3.this.f927a.m1311d(), AbstractActivityC1064j3.this.f927a.m1318t());
            }
        }

        /* renamed from: com.applovin.impl.j3$b$c */
        public class c implements AbstractC1000d.b {
            public c() {
            }

            @Override // com.applovin.impl.AbstractC1000d.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo327a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(AbstractActivityC1064j3.this.f927a.m1311d(), AbstractActivityC1064j3.this.f927a.m1318t());
            }
        }

        /* renamed from: com.applovin.impl.j3$b$d */
        public class d implements AbstractC1000d.b {
            public d() {
            }

            @Override // com.applovin.impl.AbstractC1000d.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo327a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(AbstractActivityC1064j3.this.f927a.m1312f(), false, AbstractActivityC1064j3.this.f927a.m1318t());
            }
        }

        /* renamed from: com.applovin.impl.j3$b$e */
        public class e implements AbstractC1000d.b {
            public e() {
            }

            @Override // com.applovin.impl.AbstractC1000d.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo327a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(AbstractActivityC1064j3.this.f927a.m1315k(), AbstractActivityC1064j3.this.f927a.m1320w(), AbstractActivityC1064j3.this.f927a.m1318t());
            }
        }

        /* renamed from: com.applovin.impl.j3$b$f */
        public class f implements AbstractC1000d.b {
            public f() {
            }

            @Override // com.applovin.impl.AbstractC1000d.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo327a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(AbstractActivityC1064j3.this.f927a.m1319v(), AbstractActivityC1064j3.this.f927a.m1318t());
            }
        }

        /* renamed from: com.applovin.impl.j3$b$g */
        public class g implements AbstractC1000d.b {
            public g() {
            }

            @Override // com.applovin.impl.AbstractC1000d.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo327a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(AbstractActivityC1064j3.this.f927a.m1316o(), true, AbstractActivityC1064j3.this.f927a.m1318t());
            }
        }

        /* renamed from: com.applovin.impl.j3$b$h */
        public class h implements AbstractC1000d.b {

            /* renamed from: a */
            final /* synthetic */ C1143o2 f942a;

            public h(C1143o2 c1143o2) {
                this.f942a = c1143o2;
            }

            @Override // com.applovin.impl.AbstractC1000d.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo327a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((C1276w3) this.f942a).m3603r());
            }
        }

        public b(C0990c c0990c) {
            this.f933a = c0990c;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2.a
        /* renamed from: a */
        public void mo2a(C1053i2 c1053i2, C1143o2 c1143o2) {
            int iM969b = c1053i2.m969b();
            if (iM969b == C1084l3.e.APP_INFO.ordinal()) {
                AbstractC1078k7.m1195a(c1143o2.m1982c(), c1143o2.m1981b(), AbstractActivityC1064j3.this);
                return;
            }
            if (iM969b == C1084l3.e.MAX.ordinal()) {
                if (AbstractActivityC1064j3.this.f927a.m1309a(c1143o2)) {
                    AbstractC1000d.m506a(AbstractActivityC1064j3.this, MaxDebuggerUnifiedFlowActivity.class, this.f933a, new a());
                    return;
                } else {
                    AbstractC1078k7.m1195a(c1143o2.m1982c(), c1143o2.m1981b(), AbstractActivityC1064j3.this);
                    return;
                }
            }
            if (iM969b == C1084l3.e.PRIVACY.ordinal()) {
                if (c1053i2.m968a() != C1084l3.d.CMP.ordinal()) {
                    if (c1053i2.m968a() == C1084l3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        AbstractC1000d.m506a(AbstractActivityC1064j3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f933a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(AbstractActivityC1064j3.this.f927a.m1318t().m2920s0().m3631j())) {
                    AbstractC1000d.m506a(AbstractActivityC1064j3.this, MaxDebuggerTcfInfoListActivity.class, this.f933a, new C4553b());
                    return;
                } else {
                    AbstractC1078k7.m1195a(c1143o2.m1982c(), c1143o2.m1981b(), AbstractActivityC1064j3.this);
                    return;
                }
            }
            if (iM969b != C1084l3.e.ADS.ordinal()) {
                if ((iM969b == C1084l3.e.MICRO_SDK_PARTNER_NETWORKS.ordinal() || iM969b == C1084l3.e.INCOMPLETE_NETWORKS.ordinal() || iM969b == C1084l3.e.COMPLETED_NETWORKS.ordinal()) && (c1143o2 instanceof C1276w3)) {
                    AbstractC1000d.m506a(AbstractActivityC1064j3.this, MaxDebuggerDetailActivity.class, this.f933a, new h(c1143o2));
                    return;
                }
                return;
            }
            if (c1053i2.m968a() == C1084l3.b.AD_UNITS.ordinal()) {
                if (AbstractActivityC1064j3.this.f927a.m1312f().size() > 0) {
                    AbstractC1000d.m506a(AbstractActivityC1064j3.this, MaxDebuggerAdUnitsListActivity.class, this.f933a, new d());
                    return;
                } else {
                    AbstractC1078k7.m1195a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", AbstractActivityC1064j3.this);
                    return;
                }
            }
            if (c1053i2.m968a() == C1084l3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (AbstractActivityC1064j3.this.f927a.m1315k().size() <= 0 && AbstractActivityC1064j3.this.f927a.m1320w().size() <= 0) {
                    AbstractC1078k7.m1195a("Complete Integrations", "Please complete integrations in order to access this.", AbstractActivityC1064j3.this);
                    return;
                } else if (AbstractActivityC1064j3.this.f927a.m1318t().m2922t0().m493c()) {
                    AbstractC1078k7.m1195a("Restart Required", c1143o2.m1981b(), AbstractActivityC1064j3.this);
                    return;
                } else {
                    AbstractC1000d.m506a(AbstractActivityC1064j3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f933a, new e());
                    return;
                }
            }
            if (c1053i2.m968a() != C1084l3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (c1053i2.m968a() == C1084l3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    AbstractC1000d.m506a(AbstractActivityC1064j3.this, MaxDebuggerAdUnitsListActivity.class, this.f933a, new g());
                }
            } else if (!AbstractActivityC1064j3.this.f927a.m1318t().m2922t0().m493c()) {
                AbstractActivityC1064j3.this.getSdk().m2922t0().m488a();
                AbstractC1078k7.m1195a("Restart Required", c1143o2.m1981b(), AbstractActivityC1064j3.this);
            } else if (AbstractActivityC1064j3.this.f927a.m1319v().size() > 0) {
                AbstractC1000d.m506a(AbstractActivityC1064j3.this, MaxDebuggerTestModeNetworkActivity.class, this.f933a, new f());
            } else {
                AbstractC1078k7.m1195a("Complete Integrations", "Please complete integrations in order to access this.", AbstractActivityC1064j3.this);
            }
        }
    }

    /* renamed from: c */
    private void m1046c() {
        m1039a();
        C0952a c0952a = new C0952a(this, 50, R.attr.progressBarStyleLarge);
        this.f931e = c0952a;
        c0952a.setColor(-3355444);
        this.f929c.addView(this.f931e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f929c.bringChildToFront(this.f931e);
        this.f931e.m64a();
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        C1084l3 c1084l3 = this.f927a;
        if (c1084l3 != null) {
            return c1084l3.m1318t();
        }
        return null;
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(C1333R.layout.mediation_debugger_list_view);
        this.f929c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(C1333R.id.listView);
        this.f930d = listView;
        listView.setAdapter((ListAdapter) this.f927a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1333R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C1084l3 c1084l3 = this.f927a;
        if (c1084l3 != null) {
            c1084l3.unregisterDataSetObserver(this.f928b);
            this.f927a.m2059a((AbstractViewOnClickListenerC1152p2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C1333R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        m1044b();
        return true;
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        C1084l3 c1084l3 = this.f927a;
        if (c1084l3 == null || c1084l3.m1322y()) {
            return;
        }
        m1046c();
    }

    public void setListAdapter(C1084l3 c1084l3, C0990c c0990c) {
        DataSetObserver dataSetObserver;
        C1084l3 c1084l32 = this.f927a;
        if (c1084l32 != null && (dataSetObserver = this.f928b) != null) {
            c1084l32.unregisterDataSetObserver(dataSetObserver);
        }
        this.f927a = c1084l3;
        this.f928b = new a();
        m1045b((Context) this);
        this.f927a.registerDataSetObserver(this.f928b);
        this.f927a.m2059a(new b(c0990c));
    }

    /* renamed from: b */
    private void m1044b() {
        C1084l3 c1084l3 = this.f927a;
        if (c1084l3 == null) {
            return;
        }
        String strM1317p = c1084l3.m1317p();
        if (TextUtils.isEmpty(strM1317p)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", strM1317p);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m1039a() {
        C0952a c0952a = this.f931e;
        if (c0952a != null) {
            c0952a.m65b();
            this.f929c.removeView(this.f931e);
            this.f931e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m1040a(Context context) {
        AbstractC1078k7.m1195a(this.f927a.m1314i(), this.f927a.m1313h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m1045b(Context context) {
        if (!StringUtils.isValidString(this.f927a.m1313h()) || this.f927a.m1321x()) {
            return;
        }
        this.f927a.m1310b(true);
        runOnUiThread(new OooO(11, this, context));
    }
}
