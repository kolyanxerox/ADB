package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.AbstractC1000d;
import com.applovin.impl.AbstractViewOnClickListenerC1152p2;
import com.applovin.impl.C1143o2;
import com.applovin.impl.C1288x6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.C1333R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.v6 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1270v6 extends AbstractActivityC1074k3 {

    /* renamed from: a */
    private C1220k f2950a;

    /* renamed from: b */
    private AbstractViewOnClickListenerC1152p2 f2951b;

    /* renamed from: c */
    private final List f2952c = new ArrayList();

    /* renamed from: d */
    private final List f2953d = new ArrayList();

    /* renamed from: e */
    private final List f2954e = new ArrayList();

    /* renamed from: f */
    private final List f2955f = new ArrayList();

    /* renamed from: g */
    private final List f2956g = new ArrayList();

    /* renamed from: com.applovin.impl.v6$a */
    public class a extends AbstractViewOnClickListenerC1152p2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: b */
        public int mo131b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: c */
        public List mo132c(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? AbstractActivityC1270v6.this.m3562c() : AbstractActivityC1270v6.this.m3556a();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: d */
        public int mo133d(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? d.values().length : c.values().length;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
        /* renamed from: e */
        public C1143o2 mo134e(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? new C1250t4("IAB TCF Parameters") : new C1250t4("CMP CONFIGURATION");
        }
    }

    /* renamed from: com.applovin.impl.v6$b */
    public class b implements AbstractViewOnClickListenerC1152p2.a {

        /* renamed from: a */
        final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC1279w6 f2958a;

        /* renamed from: b */
        final /* synthetic */ C1220k f2959b;

        /* renamed from: com.applovin.impl.v6$b$a */
        public class a implements AbstractC1000d.b {

            /* renamed from: a */
            final /* synthetic */ String f2961a;

            /* renamed from: b */
            final /* synthetic */ String f2962b;

            public a(String str, String str2) {
                this.f2961a = str;
                this.f2962b = str2;
            }

            @Override // com.applovin.impl.AbstractC1000d.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo327a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f2961a, this.f2962b, b.this.f2959b);
            }
        }

        /* renamed from: com.applovin.impl.v6$b$b, reason: collision with other inner class name */
        public class C4555b implements AbstractC1000d.b {
            public C4555b() {
            }

            @Override // com.applovin.impl.AbstractC1000d.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo327a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(AbstractActivityC1270v6.this.f2954e, AbstractActivityC1270v6.this.f2955f, AbstractActivityC1270v6.this.f2952c, AbstractActivityC1270v6.this.f2953d, AbstractActivityC1270v6.this.f2956g, b.this.f2959b);
            }
        }

        public b(SharedPreferencesOnSharedPreferenceChangeListenerC1279w6 sharedPreferencesOnSharedPreferenceChangeListenerC1279w6, C1220k c1220k) {
            this.f2958a = sharedPreferencesOnSharedPreferenceChangeListenerC1279w6;
            this.f2959b = c1220k;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2.a
        /* renamed from: a */
        public void mo2a(C1053i2 c1053i2, C1143o2 c1143o2) {
            String strM3649a;
            String strM3624c;
            if (c1053i2.m969b() != e.IAB_TCF_PARAMETERS.ordinal()) {
                if (c1053i2.m968a() == c.CONFIGURED_NETWORKS.ordinal()) {
                    AbstractC1000d.m506a(AbstractActivityC1270v6.this, MaxDebuggerCmpNetworksListActivity.class, this.f2959b.m2893e(), new C4555b());
                    return;
                } else {
                    AbstractC1078k7.m1195a(c1143o2.m1982c(), c1143o2.m1981b(), AbstractActivityC1270v6.this);
                    return;
                }
            }
            if (c1053i2.m968a() == d.TC_STRING.ordinal()) {
                strM3649a = C1286x4.f3068w.m3649a();
                strM3624c = this.f2958a.m3631j();
            } else {
                strM3649a = C1286x4.f3069x.m3649a();
                strM3624c = this.f2958a.m3624c();
            }
            AbstractC1000d.m506a(AbstractActivityC1270v6.this, MaxDebuggerTcfStringActivity.class, this.f2959b.m2893e(), new a(strM3649a, strM3624c));
        }
    }

    /* renamed from: com.applovin.impl.v6$c */
    public enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    /* renamed from: com.applovin.impl.v6$d */
    public enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    /* renamed from: com.applovin.impl.v6$e */
    public enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3
    public C1220k getSdk() {
        return this.f2950a;
    }

    public void initialize(List<C1288x6> list, C1220k c1220k) {
        this.f2950a = c1220k;
        SharedPreferencesOnSharedPreferenceChangeListenerC1279w6 sharedPreferencesOnSharedPreferenceChangeListenerC1279w6M2920s0 = c1220k.m2920s0();
        m3559a(list);
        a aVar = new a(this);
        this.f2951b = aVar;
        aVar.m2059a(new b(sharedPreferencesOnSharedPreferenceChangeListenerC1279w6M2920s0, c1220k));
        this.f2951b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1333R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(C1333R.id.listView)).setAdapter((ListAdapter) this.f2951b);
    }

    @Override // com.applovin.impl.AbstractActivityC1074k3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AbstractViewOnClickListenerC1152p2 abstractViewOnClickListenerC1152p2 = this.f2951b;
        if (abstractViewOnClickListenerC1152p2 != null) {
            abstractViewOnClickListenerC1152p2.m2059a((AbstractViewOnClickListenerC1152p2.a) null);
        }
    }

    /* renamed from: a */
    private void m3559a(List list) {
        boolean zM3622b = this.f2950a.m2920s0().m3622b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1288x6 c1288x6 = (C1288x6) it.next();
            if (c1288x6.m3657f() == C1288x6.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(c1288x6.m3651a())) {
                    m3558a(c1288x6, this.f2952c);
                } else {
                    m3558a(c1288x6, this.f2954e);
                }
            } else if (c1288x6.m3657f() != C1288x6.a.ATP_NETWORK) {
                this.f2956g.add(c1288x6);
            } else if (!zM3622b) {
                this.f2956g.add(c1288x6);
            } else if (Boolean.TRUE.equals(c1288x6.m3651a())) {
                m3558a(c1288x6, this.f2953d);
            } else {
                m3558a(c1288x6, this.f2955f);
            }
        }
    }

    /* renamed from: b */
    private C1143o2 m3560b() {
        C1143o2.b bVarM1994a;
        String strM3649a = C1286x4.f3065t.m3649a();
        Integer numM3627e = this.f2950a.m2920s0().m3627e();
        if (StringUtils.isValidString(this.f2950a.m2920s0().m3626d())) {
            bVarM1994a = C1143o2.m1979a(C1143o2.c.RIGHT_DETAIL);
        } else {
            C1143o2.b bVarM1998b = C1143o2.m1979a(C1143o2.c.DETAIL).m1998b("Unknown CMP SDK ID");
            bVarM1994a = bVarM1998b.m1993a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + strM3649a + " is " + numM3627e + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").m1990a(C1333R.drawable.applovin_ic_warning).m1996b(AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_warningColor, this)).m1994a(true);
        }
        bVarM1994a.m2003d(strM3649a);
        bVarM1994a.m2001c(numM3627e != null ? numM3627e.toString() : "No value set");
        bVarM1994a.m2000c(numM3627e != null ? ViewCompat.MEASURED_STATE_MASK : SupportMenu.CATEGORY_MASK);
        return bVarM1994a.m1995a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public List m3562c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer numM3629g = this.f2950a.m2920s0().m3629g();
        String strM3631j = this.f2950a.m2920s0().m3631j();
        String strM3624c = this.f2950a.m2920s0().m3624c();
        arrayList.add(m3554a(C1286x4.f3067v.m3649a(), numM3629g));
        arrayList.add(m3555a(C1286x4.f3068w.m3649a(), strM3631j, !AbstractC1306z6.m3889b(strM3631j)));
        arrayList.add(m3555a(C1286x4.f3069x.m3649a(), strM3624c, false));
        return arrayList;
    }

    /* renamed from: a */
    private void m3558a(C1288x6 c1288x6, List list) {
        if (c1288x6.m3655d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (c1288x6.m3655d().equals(((C1288x6) it.next()).m3655d())) {
                    return;
                }
            }
        }
        list.add(c1288x6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public List m3556a() {
        String strOooO0oO;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f2955f.size() + this.f2954e.size();
        arrayList.add(m3560b());
        arrayList.add(m3554a(C1286x4.f3066u.m3649a(), this.f2950a.m2920s0().m3628f()));
        arrayList.add(C1143o2.m1979a(C1143o2.c.DETAIL).m2003d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").m1995a());
        C1143o2.b bVarM2003d = C1143o2.m1979a(C1143o2.c.RIGHT_DETAIL).m2003d("Configured CMP Networks");
        if (size > 0) {
            strOooO0oO = OooO0oO.OooOo.OooO0oO(size, "Missing ", " network(s)");
        } else {
            strOooO0oO = "";
        }
        arrayList.add(bVarM2003d.m2001c(strOooO0oO).m2000c(size > 0 ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).m1991a(this).m1994a(true).m1995a());
        return arrayList;
    }

    /* renamed from: a */
    private C1143o2 m3554a(String str, Integer num) {
        return C1143o2.m1979a(C1143o2.c.RIGHT_DETAIL).m2003d(str).m2001c(num != null ? num.toString() : "No value set").m2000c(num != null ? ViewCompat.MEASURED_STATE_MASK : SupportMenu.CATEGORY_MASK).m1995a();
    }

    /* renamed from: a */
    private C1143o2 m3555a(String str, String str2, boolean z) {
        boolean zIsValidString = StringUtils.isValidString(str2);
        if (zIsValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        C1143o2.b bVarM2003d = C1143o2.m1979a(C1143o2.c.DETAIL).m2003d(str);
        if (!zIsValidString) {
            str2 = "No value set";
        }
        C1143o2.b bVarM1994a = bVarM2003d.m2001c(str2).m2000c(z ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).m1994a(zIsValidString);
        if (zIsValidString) {
            bVarM1994a.m1991a(this);
        }
        return bVarM1994a.m1995a();
    }
}
