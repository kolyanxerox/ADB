package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.C0981b0;
import com.applovin.impl.C0984b3;
import com.applovin.impl.C1143o2;
import com.applovin.impl.C1288x6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1333R;
import com.ironsource.C3824x4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* renamed from: com.applovin.impl.l3 */
/* loaded from: classes.dex */
public class C1084l3 extends AbstractViewOnClickListenerC1152p2 implements AppLovinCommunicatorSubscriber, C0981b0.a {

    /* renamed from: A */
    private List f1054A;

    /* renamed from: B */
    private List f1055B;

    /* renamed from: C */
    private List f1056C;

    /* renamed from: D */
    private List f1057D;

    /* renamed from: E */
    private List f1058E;

    /* renamed from: e */
    private C1220k f1059e;

    /* renamed from: f */
    private List f1060f;

    /* renamed from: g */
    private List f1061g;

    /* renamed from: h */
    private List f1062h;

    /* renamed from: i */
    private List f1063i;

    /* renamed from: j */
    private String f1064j;

    /* renamed from: k */
    private String f1065k;

    /* renamed from: l */
    private String f1066l;

    /* renamed from: m */
    private boolean f1067m;

    /* renamed from: n */
    private final StringBuilder f1068n;

    /* renamed from: o */
    private final AtomicBoolean f1069o;

    /* renamed from: p */
    private boolean f1070p;

    /* renamed from: q */
    private List f1071q;

    /* renamed from: r */
    private List f1072r;

    /* renamed from: s */
    private List f1073s;

    /* renamed from: t */
    private List f1074t;

    /* renamed from: u */
    private List f1075u;

    /* renamed from: v */
    private List f1076v;

    /* renamed from: w */
    private List f1077w;

    /* renamed from: x */
    private List f1078x;

    /* renamed from: y */
    private List f1079y;

    /* renamed from: z */
    private List f1080z;

    /* renamed from: com.applovin.impl.l3$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1081a;

        static {
            int[] iArr = new int[C0981b0.b.values().length];
            f1081a = iArr;
            try {
                iArr[C0981b0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1081a[C0981b0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1081a[C0981b0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1081a[C0981b0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1081a[C0981b0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.applovin.impl.l3$b */
    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    /* renamed from: com.applovin.impl.l3$c */
    public enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    /* renamed from: com.applovin.impl.l3$d */
    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    /* renamed from: com.applovin.impl.l3$e */
    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        MICRO_SDK_PARTNER_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public C1084l3(Context context) {
        super(context);
        this.f1068n = new StringBuilder("");
        this.f1069o = new AtomicBoolean();
        this.f1071q = new ArrayList();
        this.f1072r = new ArrayList();
        this.f1073s = new ArrayList();
        this.f1074t = new ArrayList();
        this.f1075u = new ArrayList();
        this.f1076v = new ArrayList();
        this.f1077w = new ArrayList();
        this.f1078x = new ArrayList();
        this.f1079y = new ArrayList();
        this.f1080z = new ArrayList();
        this.f1054A = new ArrayList();
        this.f1055B = new ArrayList();
        this.f1056C = new ArrayList();
        this.f1057D = new ArrayList();
        this.f1058E = new ArrayList();
    }

    /* renamed from: g */
    private List m1298g() {
        boolean zM493c = this.f1059e.m2922t0().m493c();
        List listM492b = this.f1059e.m2922t0().m492b();
        return zM493c ? m1289a((String) null, m1288a(listM492b, false)) : m1289a(m1288a(listM492b, true), (String) null);
    }

    /* renamed from: j */
    private List m1299j() {
        String str;
        ArrayList arrayList = new ArrayList(7);
        try {
            str = this.f1703a.getPackageManager().getPackageInfo(this.f1703a.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(C1143o2.m1978a().m2003d("Package Name").m2001c(this.f1703a.getPackageName()).m1995a());
        C1143o2.b bVarM2003d = C1143o2.m1978a().m2003d("App Version");
        boolean zIsValidString = StringUtils.isValidString(str);
        String strM2857V = OfficeOpenXMLExtended.SECURITY_NONE;
        if (!zIsValidString) {
            str = OfficeOpenXMLExtended.SECURITY_NONE;
        }
        arrayList.add(bVarM2003d.m2001c(str).m1995a());
        arrayList.add(C1143o2.m1978a().m2003d("OS").m2001c(AbstractC1078k7.m1232d()).m1995a());
        arrayList.add(C1143o2.m1978a().m2003d("Account").m2001c(StringUtils.isValidString(this.f1066l) ? this.f1066l : OfficeOpenXMLExtended.SECURITY_NONE).m1995a());
        C1143o2.b bVarM2003d2 = C1143o2.m1978a().m2003d("Mediation Provider");
        if (StringUtils.isValidString(this.f1059e.m2857V())) {
            strM2857V = this.f1059e.m2857V();
        }
        arrayList.add(bVarM2003d2.m2001c(strM2857V).m1995a());
        arrayList.add(C1143o2.m1978a().m2003d("OM SDK Version").m2001c(this.f1059e.m2894e0().m786c()).m1995a());
        arrayList.add(m1286a(C1220k.m2783G0()));
        return arrayList;
    }

    /* renamed from: l */
    private C1143o2 m1300l() {
        String strM3626d = this.f1059e.m2920s0().m3626d();
        boolean zIsValidString = StringUtils.isValidString(strM3626d);
        boolean zIsValidString2 = StringUtils.isValidString(this.f1059e.m2920s0().m3631j());
        C1143o2.b bVarM2003d = C1143o2.m1979a(C1143o2.c.DETAIL).m2003d("CMP (Consent Management Platform)");
        if (!zIsValidString) {
            strM3626d = zIsValidString2 ? "Unknown" : OfficeOpenXMLExtended.SECURITY_NONE;
        }
        C1143o2.b bVarM2001c = bVarM2003d.m2001c(strM3626d);
        if (this.f1067m) {
            bVarM2001c.m1994a(true);
            if (zIsValidString2) {
                bVarM2001c.m1991a(this.f1703a);
            } else {
                bVarM2001c.m1998b("TC Data Not Found");
                bVarM2001c.m1993a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z = this.f1059e.m2927w().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                bVarM2001c.m1990a(z ? C1333R.drawable.applovin_ic_x_mark : C1333R.drawable.applovin_ic_warning);
                bVarM2001c.m1996b(AbstractC1091m0.m1442a(z ? C1333R.color.applovin_sdk_xmarkColor : C1333R.color.applovin_sdk_warningColor, this.f1703a));
            }
        }
        return bVarM2001c.m1995a();
    }

    /* renamed from: m */
    private C1143o2 m1301m() {
        return C1143o2.m1978a().m2003d("MAX Terms and Privacy Policy Flow").m1991a(this.f1703a).m1994a(true).m1995a();
    }

    /* renamed from: n */
    private C1143o2 m1302n() {
        boolean zHasSupportedCmp = this.f1059e.m2921t().hasSupportedCmp();
        return C1143o2.m1978a().m2003d("Google UMP SDK").m1990a(zHasSupportedCmp ? C1333R.drawable.applovin_ic_check_mark_bordered : C1333R.drawable.applovin_ic_x_mark).m1996b(AbstractC1091m0.m1442a(zHasSupportedCmp ? C1333R.color.applovin_sdk_checkmarkColor : C1333R.color.applovin_sdk_xmarkColor, this.f1703a)).m1998b("Google UMP SDK").m1993a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").m1994a(!zHasSupportedCmp).m1995a();
    }

    /* renamed from: q */
    private List m1303q() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(C1143o2.m1978a().m2003d("SDK Version").m2001c(AppLovinSdk.VERSION).m1995a());
        String str = (String) this.f1059e.m2866a(C1268v4.f2598I3);
        C1143o2.b bVarM2003d = C1143o2.m1978a().m2003d("Plugin Version");
        boolean zIsValidString = StringUtils.isValidString(str);
        String str2 = OfficeOpenXMLExtended.SECURITY_NONE;
        if (!zIsValidString) {
            str = OfficeOpenXMLExtended.SECURITY_NONE;
        }
        arrayList.add(bVarM2003d.m2001c(str).m1995a());
        arrayList.add(m1297e());
        if (this.f1059e.m2840I0()) {
            String strM1171a = AbstractC1078k7.m1171a(this.f1059e.m2912o0());
            if (StringUtils.isValidString(strM1171a)) {
                str2 = strM1171a;
            }
            arrayList.add(m1293b("Unity Version", str2));
        }
        if (this.f1059e.m2931y().m3284j()) {
            arrayList.add(m1301m());
            arrayList.add(m1302n());
            return arrayList;
        }
        if (this.f1059e.m2931y().m3286l()) {
            arrayList.add(m1306u());
        }
        return arrayList;
    }

    /* renamed from: r */
    private C1143o2 m1304r() {
        return C1143o2.m1978a().m2003d("Network Consent Statuses").m1991a(this.f1703a).m1994a(true).m1995a();
    }

    /* renamed from: s */
    private List m1305s() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(m1300l());
        if (StringUtils.isValidString(this.f1059e.m2920s0().m3631j())) {
            arrayList.add(m1304r());
        } else {
            arrayList.add(new C1154p4(AbstractC1150p0.m2046b(), false, this.f1703a));
        }
        arrayList.add(new C1154p4(AbstractC1150p0.m2041a(), true, this.f1703a));
        return arrayList;
    }

    /* renamed from: u */
    private C1143o2 m1306u() {
        return C1143o2.m1978a().m2003d("Terms Flow").m1990a(C1333R.drawable.applovin_ic_x_mark).m1996b(AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_xmarkColor, this.f1703a)).m1998b("Terms Flow has been replaced").m1993a(this.f1059e.m2931y().m3281g()).m1994a(true).m1995a();
    }

    /* renamed from: z */
    private void m1307z() {
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + AbstractC1078k7.m1228c(this.f1059e));
        sb.append("\nTest Mode - ".concat(this.f1059e.m2922t0().m493c() ? "enabled" : C3824x4.f12570e));
        sb.append("\nTarget SDK - " + this.f1059e.m2827B().m2984E().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f1059e.m2866a(C1268v4.f2598I3);
        String strM1024b = C1060j.m1024b();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb2 = new StringBuilder("\nPlugin Version - ");
        boolean zIsValidString = StringUtils.isValidString(str2);
        String str3 = OfficeOpenXMLExtended.SECURITY_NONE;
        if (!zIsValidString) {
            str2 = OfficeOpenXMLExtended.SECURITY_NONE;
        }
        sb2.append(str2);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(strM1024b)) {
            strM1024b = "Disabled";
        }
        sb3.append(strM1024b);
        sb.append(sb3.toString());
        if (this.f1059e.m2840I0()) {
            String strM1171a = AbstractC1078k7.m1171a(this.f1059e.m2912o0());
            StringBuilder sb4 = new StringBuilder("\nUnity Version - ");
            if (StringUtils.isValidString(strM1171a)) {
                str3 = strM1171a;
            }
            sb4.append(str3);
            sb.append(sb4.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(AbstractC1150p0.m2042a(this.f1703a));
        sb.append(this.f1059e.m2931y().m3279e());
        sb.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb.append(this.f1059e.m2920s0().m3630i());
        sb.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = m1311d().iterator();
        while (it.hasNext()) {
            sb.append(((C1288x6) it.next()).m3656e());
        }
        sb.append("\n========== NETWORKS ==========");
        Iterator it2 = this.f1072r.iterator();
        while (it2.hasNext()) {
            m1291a(sb, ((C0984b3) it2.next()).m358j());
        }
        Iterator it3 = this.f1073s.iterator();
        while (it3.hasNext()) {
            m1291a(sb, ((C0984b3) it3.next()).m358j());
        }
        Iterator it4 = this.f1071q.iterator();
        while (it4.hasNext()) {
            m1291a(sb, ((C0984b3) it4.next()).m358j());
        }
        sb.append("\n========== AD UNITS ==========");
        Iterator it5 = this.f1061g.iterator();
        while (it5.hasNext()) {
            m1291a(sb, ((C1130n) it5.next()).m1875e());
        }
        sb.append("\n========== END ==========");
        C1240o.m3206g("MediationDebuggerListAdapter", sb.toString());
        this.f1068n.append(sb.toString());
    }

    /* renamed from: a */
    public boolean m1309a(C1143o2 c1143o2) {
        if (c1143o2.mo137k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(c1143o2.mo137k().toString());
    }

    /* renamed from: b */
    public void m1310b(boolean z) {
        this.f1070p = z;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: c */
    public List mo132c(int i) {
        return i == e.APP_INFO.ordinal() ? this.f1078x : i == e.MAX.ordinal() ? this.f1079y : i == e.PRIVACY.ordinal() ? this.f1080z : i == e.ADS.ordinal() ? this.f1054A : i == e.INCOMPLETE_NETWORKS.ordinal() ? this.f1055B : i == e.MICRO_SDK_PARTNER_NETWORKS.ordinal() ? this.f1056C : i == e.COMPLETED_NETWORKS.ordinal() ? this.f1057D : this.f1058E;
    }

    /* renamed from: d */
    public List m1311d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f1060f.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0984b3) it.next()).m368t());
        }
        String strM3632k = this.f1059e.m2920s0().m3632k();
        int i = 0;
        if (strM3632k != null) {
            String strM3624c = this.f1059e.m2920s0().m3624c();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C1288x6 c1288x6 = (C1288x6) obj;
                if (c1288x6.m3657f() == C1288x6.a.TCF_VENDOR && c1288x6.m3655d() != null) {
                    c1288x6.m3652a(Boolean.valueOf(AbstractC1306z6.m3888a(strM3632k, c1288x6.m3655d().intValue() - 1)));
                } else if (c1288x6.m3657f() == C1288x6.a.ATP_NETWORK && c1288x6.m3655d() != null) {
                    c1288x6.m3652a(AbstractC1306z6.m3886a(c1288x6.m3655d().intValue(), strM3624c));
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                ((C1288x6) obj2).m3652a(null);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: e */
    public C1143o2 mo134e(int i) {
        return i == e.APP_INFO.ordinal() ? new C1250t4("APP INFO") : i == e.MAX.ordinal() ? new C1250t4("MAX") : i == e.PRIVACY.ordinal() ? new C1250t4("PRIVACY") : i == e.ADS.ordinal() ? new C1250t4("ADS") : i == e.INCOMPLETE_NETWORKS.ordinal() ? new C1250t4("INCOMPLETE SDK INTEGRATIONS") : i == e.MICRO_SDK_PARTNER_NETWORKS.ordinal() ? new C1250t4("APPLOVIN MICRO SDK PARTNERS") : i == e.COMPLETED_NETWORKS.ordinal() ? new C1250t4("COMPLETED SDK INTEGRATIONS") : new C1250t4("MISSING SDK INTEGRATIONS");
    }

    /* renamed from: f */
    public List m1312f() {
        return this.f1061g;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    /* renamed from: h */
    public String m1313h() {
        return this.f1065k;
    }

    /* renamed from: i */
    public String m1314i() {
        return this.f1064j;
    }

    /* renamed from: k */
    public List m1315k() {
        return this.f1075u;
    }

    /* renamed from: o */
    public List m1316o() {
        return this.f1062h;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f1080z = m1305s();
            m2061c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f1055B = m1290a(this.f1071q);
            this.f1056C = m1290a(this.f1072r);
            this.f1057D = m1290a(this.f1073s);
            m2061c();
            return;
        }
        if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f1054A = m1289a(m1288a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            m2061c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f1054A = m1289a((String) null, m1288a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            m2061c();
        }
    }

    /* renamed from: p */
    public String m1317p() {
        return this.f1068n.toString();
    }

    /* renamed from: t */
    public C1220k m1318t() {
        return this.f1059e;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f1069o.get() + "}";
    }

    /* renamed from: v */
    public List m1319v() {
        return this.f1077w;
    }

    /* renamed from: w */
    public List m1320w() {
        return this.f1076v;
    }

    /* renamed from: x */
    public boolean m1321x() {
        return this.f1070p;
    }

    /* renamed from: y */
    public boolean m1322y() {
        return this.f1069o.get();
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: b */
    public int mo131b() {
        return e.COUNT.ordinal();
    }

    /* renamed from: b */
    private void m1294b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1140o c1140oM1876f = ((C1130n) it.next()).m1876f();
            Iterator it2 = c1140oM1876f.m1924a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((C1029f8) it2.next()).m762b());
            }
            Iterator it3 = c1140oM1876f.m1928e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((C1029f8) it3.next()).m762b());
            }
        }
        this.f1075u = new ArrayList(hashSet);
        this.f1076v = new ArrayList(hashSet2);
        Collections.sort(this.f1075u);
        Collections.sort(this.f1076v);
    }

    /* renamed from: a */
    public void m1308a(List list, List list2, List list3, List list4, String str, String str2, String str3, boolean z, C1220k c1220k) {
        this.f1059e = c1220k;
        this.f1060f = list;
        this.f1061g = list2;
        this.f1062h = list3;
        this.f1063i = list4;
        this.f1064j = str;
        this.f1065k = str2;
        this.f1066l = str3;
        this.f1067m = z;
        if (list != null && this.f1069o.compareAndSet(false, true)) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3211a("MediationDebuggerListAdapter", "Populating networks...");
            }
            m1295c(list);
            m1294b(list2);
            m1296d(this.f1073s);
            this.f1078x.addAll(m1299j());
            this.f1079y.addAll(m1303q());
            this.f1080z.addAll(m1305s());
            this.f1054A.addAll(m1298g());
            this.f1055B = m1290a(this.f1071q);
            this.f1056C = m1290a(this.f1072r);
            this.f1057D = m1290a(this.f1073s);
            this.f1058E = m1290a(this.f1074t);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f1703a).subscribe(this, arrayList);
            m1307z();
        }
        AppLovinSdkUtils.runOnUiThread(new o0OO00O(this, 10));
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2
    /* renamed from: d */
    public int mo133d(int i) {
        if (i == e.APP_INFO.ordinal()) {
            return this.f1078x.size();
        }
        if (i == e.MAX.ordinal()) {
            return this.f1079y.size();
        }
        if (i == e.PRIVACY.ordinal()) {
            return this.f1080z.size();
        }
        if (i == e.ADS.ordinal()) {
            return this.f1054A.size();
        }
        if (i == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.f1055B.size();
        }
        if (i == e.MICRO_SDK_PARTNER_NETWORKS.ordinal()) {
            return this.f1056C.size();
        }
        if (i == e.COMPLETED_NETWORKS.ordinal()) {
            return this.f1057D.size();
        }
        return this.f1058E.size();
    }

    /* renamed from: b */
    private C1143o2 m1293b(String str, String str2) {
        C1143o2.b bVarM2003d = C1143o2.m1978a().m2003d(str);
        if (StringUtils.isValidString(str2)) {
            bVarM2003d.m2001c(str2);
        } else {
            bVarM2003d.m1990a(C1333R.drawable.applovin_ic_x_mark);
            bVarM2003d.m1996b(AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_xmarkColor, this.f1703a));
        }
        return bVarM2003d.m1995a();
    }

    /* renamed from: c */
    private void m1295c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0984b3 c0984b3 = (C0984b3) it.next();
            if (!c0984b3.m345H()) {
                if (c0984b3.m365q() != C0984b3.a.INCOMPLETE_INTEGRATION && c0984b3.m365q() != C0984b3.a.INVALID_INTEGRATION) {
                    if (c0984b3.m365q() == C0984b3.a.COMPLETE) {
                        if (c0984b3.m374z()) {
                            this.f1072r.add(c0984b3);
                        } else {
                            this.f1073s.add(c0984b3);
                        }
                    } else if (c0984b3.m365q() == C0984b3.a.MISSING) {
                        this.f1074t.add(c0984b3);
                    }
                } else if (c0984b3.m374z()) {
                    this.f1072r.add(c0984b3);
                } else {
                    this.f1071q.add(c0984b3);
                }
            }
        }
    }

    /* renamed from: e */
    private C1143o2 m1297e() {
        String strOooOOOo;
        C1143o2.b bVarM2003d = C1143o2.m1978a().m2003d("Ad Review Version");
        String strM1024b = C1060j.m1024b();
        if (StringUtils.isValidString(strM1024b)) {
            String strM1022a = C1060j.m1022a();
            if (!StringUtils.isValidString(strM1022a) || strM1022a.equals(this.f1059e.m2904j0())) {
                strOooOOOo = null;
            } else {
                strOooOOOo = OooO0oO.OooOo.OooOOOo(new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your "), this.f1059e.m2840I0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated", " from the correct account.");
            }
        } else {
            strOooOOOo = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        }
        if (strOooOOOo != null) {
            bVarM2003d.m1998b("MAX Ad Review").m1993a(strOooOOOo).m1990a(C1333R.drawable.applovin_ic_x_mark).m1996b(AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_xmarkColor, this.f1703a)).m1994a(true);
        } else {
            bVarM2003d.m2001c(strM1024b);
        }
        return bVarM2003d.m1995a();
    }

    /* renamed from: b */
    private C1143o2 m1292b(String str) {
        C1143o2.b bVarM1978a = C1143o2.m1978a();
        if (this.f1059e.m2922t0().m493c()) {
            bVarM1978a.m1991a(this.f1703a);
        }
        C1143o2.b bVarM2003d = bVarM1978a.m2003d((StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.f1059e.m2922t0().m493c()) {
            str = "Enable";
        }
        return bVarM2003d.m2001c(str).m2000c(-16776961).m1993a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").m1994a(true).m1995a();
    }

    /* renamed from: d */
    private void m1296d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0984b3 c0984b3 = (C0984b3) it.next();
            if (c0984b3.m373y() == C0984b3.b.READY) {
                this.f1077w.add(c0984b3);
            }
        }
    }

    @Override // com.applovin.impl.C0981b0.a
    /* renamed from: a */
    public void mo322a(C1299z c1299z, String str) {
        String strM1287a;
        c cVarM1283a;
        c cVar;
        String strOooOO0O;
        List<C0953a0> listM315a = C0981b0.m315a(c1299z, this.f1063i);
        if (listM315a.isEmpty()) {
            strOooOO0O = OooO0oO.OooOo.OooOO0O("All required entries found at ", str, ".");
            cVar = c.SUCCESS;
        } else {
            C0953a0 c0953a0 = null;
            for (C0953a0 c0953a02 : listM315a) {
                this.f1059e.m2847O();
                if (C1240o.m3200a()) {
                    C1240o c1240oM2847O = this.f1059e.m2847O();
                    StringBuilder sbOooOo = OooO0oO.OooOo.OooOo(str, " is missing a required entry: ");
                    sbOooOo.append(c0953a02.m72d());
                    c1240oM2847O.m3214b("MediationDebuggerListAdapter", sbOooOo.toString());
                }
                if (c0953a02.m75g()) {
                    c0953a0 = c0953a02;
                }
            }
            if (c0953a0 != null) {
                C0981b0.b bVar = C0981b0.b.MISSING_APPLOVIN_ENTRIES;
                strM1287a = m1287a(bVar, str, c0953a0.m72d());
                cVarM1283a = m1283a(bVar);
            } else {
                C0981b0.b bVar2 = C0981b0.b.MISSING_NON_APPLOVIN_ENTRIES;
                strM1287a = m1287a(bVar2, str, null);
                cVarM1283a = m1283a(bVar2);
            }
            String str2 = strM1287a;
            cVar = cVarM1283a;
            strOooOO0O = str2;
        }
        this.f1079y.add(m1285a(strOooOO0O, cVar));
        m2061c();
    }

    @Override // com.applovin.impl.C0981b0.a
    /* renamed from: a */
    public void mo321a(C0981b0.b bVar, String str) {
        if (bVar == C0981b0.b.APP_DETAILS_NOT_FOUND) {
            this.f1059e.m2847O();
            if (C1240o.m3200a()) {
                this.f1059e.m2847O().m3211a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.f1079y.add(m1285a(m1287a(bVar, str, null), m1283a(bVar)));
        m2061c();
    }

    /* renamed from: a */
    private void m1291a(StringBuilder sb, String str) {
        String string = sb.toString();
        if (str.length() + string.length() >= ((Integer) this.f1059e.m2866a(C1268v4.f2875r)).intValue()) {
            C1240o.m3206g("MediationDebuggerListAdapter", string);
            this.f1068n.append(string);
            sb.setLength(1);
        }
        sb.append(str);
    }

    /* renamed from: a */
    private List m1289a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(C1143o2.m1978a().m2003d("View Ad Units (" + this.f1061g.size() + ")").m1991a(this.f1703a).m1994a(true).m1995a());
        arrayList.add(m1284a(str));
        arrayList.add(m1292b(str2));
        if (!this.f1062h.isEmpty()) {
            arrayList.add(C1143o2.m1978a().m2003d("Selective Init Ad Units (" + this.f1062h.size() + ")").m1991a(this.f1703a).m1994a(true).m1995a());
        }
        arrayList.add(C1143o2.m1978a().m2003d("Test Mode Enabled").m2001c(String.valueOf(this.f1059e.m2922t0().m493c())).m1995a());
        return arrayList;
    }

    /* renamed from: a */
    private List m1290a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1276w3((C0984b3) it.next(), this.f1703a));
        }
        return arrayList;
    }

    /* renamed from: a */
    private C1143o2 m1284a(String str) {
        C1143o2.b bVarM1978a = C1143o2.m1978a();
        if (!this.f1059e.m2922t0().m493c()) {
            bVarM1978a.m1991a(this.f1703a);
        }
        C1143o2.b bVarM2003d = bVarM1978a.m2003d((StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.f1059e.m2922t0().m493c()) {
            str = "Enable";
        }
        return bVarM2003d.m2001c(str).m2000c(-16776961).m1993a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").m1994a(true).m1995a();
    }

    /* renamed from: a */
    private C1143o2 m1286a(boolean z) {
        return C1143o2.m1978a().m2003d("Java 8").m1990a(z ? C1333R.drawable.applovin_ic_check_mark_bordered : C1333R.drawable.applovin_ic_x_mark).m1996b(AbstractC1091m0.m1442a(z ? C1333R.color.applovin_sdk_checkmarkColor : C1333R.color.applovin_sdk_xmarkColor, this.f1703a)).m1998b("Upgrade to Java 8").m1993a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://developers.applovin.com/en/android/overview/integration").m1994a(!z).m1995a();
    }

    /* renamed from: a */
    private C1143o2 m1285a(String str, c cVar) {
        int i;
        int iM1442a;
        if (cVar == c.SUCCESS) {
            i = C1333R.drawable.applovin_ic_check_mark_bordered;
            iM1442a = AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_checkmarkColor, this.f1703a);
        } else if (cVar == c.WARNING) {
            i = C1333R.drawable.applovin_ic_warning;
            iM1442a = AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_warningColor, this.f1703a);
        } else {
            i = C1333R.drawable.applovin_ic_x_mark;
            iM1442a = AbstractC1091m0.m1442a(C1333R.color.applovin_sdk_xmarkColor, this.f1703a);
        }
        return C1143o2.m1978a().m2003d("app-ads.txt").m1990a(i).m1996b(iM1442a).m1998b("app-ads.txt").m1993a(str).m1994a(true).m1995a();
    }

    /* renamed from: a */
    private String m1287a(C0981b0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i = a.f1081a[bVar.ordinal()];
        if (i == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i == 3) {
            return OooO0oO.OooOo.OooOO0O("Unable to find app-ads.txt file or parse entries of the file at ", str, ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i == 4) {
            return OooO0oO.OooOo.OooOO0o("Text file at ", str, " is missing the required AppLovin line:\n\n", str2, "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i != 5) {
            return "";
        }
        return OooO0oO.OooOo.OooOO0O("Text file at ", str, " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
    }

    /* renamed from: a */
    private c m1283a(C0981b0.b bVar) {
        int i = a.f1081a[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return c.ERROR;
        }
        if (i != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }

    /* renamed from: a */
    private String m1288a(List list, boolean z) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z) {
            for (C1177r2 c1177r2 : this.f1075u) {
                if (list.equals(c1177r2.m2311b())) {
                    return c1177r2.m2310a();
                }
            }
            for (C1177r2 c1177r22 : this.f1076v) {
                if (list.equals(c1177r22.m2311b())) {
                    return c1177r22.m2310a();
                }
            }
        } else {
            for (C0984b3 c0984b3 : this.f1077w) {
                if (list.equals(c0984b3.m369u())) {
                    return c0984b3.m355g();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ",");
            }
        }
        return sb.toString();
    }
}
