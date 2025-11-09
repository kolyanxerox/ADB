package com.applovin.impl;

import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.b3 */
/* loaded from: classes.dex */
public class C0984b3 implements Comparable, AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    private final List f347A;

    /* renamed from: B */
    private final List f348B;

    /* renamed from: C */
    private final List f349C;

    /* renamed from: D */
    private final List f350D;

    /* renamed from: E */
    private final Map f351E;

    /* renamed from: F */
    private final boolean f352F;

    /* renamed from: G */
    private final boolean f353G;

    /* renamed from: H */
    private final C1288x6 f354H;

    /* renamed from: I */
    private final boolean f355I;

    /* renamed from: J */
    private final String f356J;

    /* renamed from: K */
    private final Map f357K;

    /* renamed from: a */
    private final C1220k f358a;

    /* renamed from: b */
    private final a f359b;

    /* renamed from: c */
    private int f360c;

    /* renamed from: d */
    private final boolean f361d;

    /* renamed from: e */
    private final boolean f362e;

    /* renamed from: f */
    private final boolean f363f;

    /* renamed from: g */
    private final boolean f364g;

    /* renamed from: h */
    private boolean f365h;

    /* renamed from: i */
    private final boolean f366i;

    /* renamed from: j */
    private final boolean f367j;

    /* renamed from: k */
    private final boolean f368k;

    /* renamed from: l */
    private final boolean f369l;

    /* renamed from: m */
    private final boolean f370m;

    /* renamed from: n */
    private final boolean f371n;

    /* renamed from: o */
    private final boolean f372o;

    /* renamed from: p */
    private final String f373p;

    /* renamed from: q */
    private final String f374q;

    /* renamed from: r */
    private String f375r;

    /* renamed from: s */
    private String f376s;

    /* renamed from: t */
    private final String f377t;

    /* renamed from: u */
    private final String f378u;

    /* renamed from: v */
    private final String f379v;

    /* renamed from: w */
    private final String f380w;

    /* renamed from: x */
    private final int f381x;

    /* renamed from: y */
    private final List f382y;

    /* renamed from: z */
    private final List f383z;

    /* renamed from: com.applovin.impl.b3$a */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* renamed from: a */
        private final String f389a;

        a(String str) {
            this.f389a = str;
        }

        /* renamed from: b */
        public String m377b() {
            return this.f389a;
        }
    }

    /* renamed from: com.applovin.impl.b3$b */
    public enum b {
        NOT_SUPPORTED("Not Supported", SupportMenu.CATEGORY_MASK, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", SupportMenu.CATEGORY_MASK, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", SupportMenu.CATEGORY_MASK, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* renamed from: a */
        private final String f396a;

        /* renamed from: b */
        private final int f397b;

        /* renamed from: c */
        private final String f398c;

        b(String str, int i, String str2) {
            this.f396a = str;
            this.f397b = i;
            this.f398c = str2;
        }

        /* renamed from: b */
        public String m379b() {
            return this.f398c;
        }

        /* renamed from: c */
        public String m380c() {
            return this.f396a;
        }

        /* renamed from: d */
        public int m381d() {
            return this.f397b;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:158|243|159|(5:237|160|245|161|(2:163|(4:165|(1:171)(1:168)|241|172)(0))(1:176))|(3:235|177|178)|239|186|187|188|189|(3:233|190|191)) */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0205, code lost:
    
        r18 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0208, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0209, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x025e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c8  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0984b3(org.json.JSONObject r20, com.applovin.impl.sdk.C1220k r21) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C0984b3.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
    }

    /* renamed from: a */
    private a m333a() {
        a aVar = this.f361d ? this.f362e ? a.COMPLETE : this.f364g ? a.MISSING : a.INCOMPLETE_INTEGRATION : this.f362e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f383z.iterator();
        while (it.hasNext()) {
            if (!((C1095m4) it.next()).m1499c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.f347A.iterator();
        while (it2.hasNext()) {
            if (!((C1062j1) it2.next()).m1035c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f372o || C1220k.m2783G0()) ? m343F() ? a.INCOMPLETE_INTEGRATION : aVar : a.INVALID_INTEGRATION;
    }

    /* renamed from: A */
    public boolean m338A() {
        return this.f362e;
    }

    /* renamed from: B */
    public boolean m339B() {
        return this.f363f;
    }

    /* renamed from: C */
    public boolean m340C() {
        return this.f365h;
    }

    /* renamed from: D */
    public boolean m341D() {
        return this.f355I;
    }

    /* renamed from: E */
    public boolean m342E() {
        return this.f372o;
    }

    /* renamed from: F */
    public boolean m343F() {
        if (!this.f371n || !StringUtils.isValidString(this.f376s)) {
            return false;
        }
        return !AbstractC1078k7.m1233d(this.f376s).equals(AbstractC1078k7.m1173a(this.f377t, this.f376s.split("\\.").length));
    }

    /* renamed from: G */
    public boolean m344G() {
        return this.f361d;
    }

    /* renamed from: H */
    public boolean m345H() {
        return this.f359b == a.MISSING && this.f368k;
    }

    /* renamed from: I */
    public boolean m346I() {
        return this.f353G;
    }

    /* renamed from: J */
    public boolean m347J() {
        return this.f369l;
    }

    /* renamed from: K */
    public boolean m348K() {
        return this.f370m;
    }

    /* renamed from: b */
    public String m350b() {
        return this.f375r;
    }

    /* renamed from: c */
    public String m351c() {
        return this.f377t;
    }

    /* renamed from: d */
    public Map m352d() {
        return this.f357K;
    }

    /* renamed from: e */
    public String m353e() {
        return this.f356J;
    }

    /* renamed from: f */
    public List m354f() {
        return this.f347A;
    }

    /* renamed from: g */
    public String m355g() {
        return this.f374q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    /* renamed from: h */
    public int m356h() {
        return this.f381x;
    }

    /* renamed from: i */
    public int m357i() {
        return this.f360c;
    }

    /* renamed from: j */
    public final String m358j() {
        StringBuilder sb = new StringBuilder("\n---------- ");
        sb.append(this.f373p);
        sb.append(" ----------\nStatus  - ");
        sb.append(this.f359b.m377b());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.f361d || TextUtils.isEmpty(this.f376s)) ? "UNAVAILABLE" : this.f376s);
        sb.append("\nAdapter - ");
        if (this.f362e && !TextUtils.isEmpty(this.f377t)) {
            str = this.f377t;
        }
        sb.append(str);
        for (C1095m4 c1095m4 : m362n()) {
            if (!c1095m4.m1499c()) {
                sb.append("\n* MISSING ");
                sb.append(c1095m4.m1498b());
                sb.append(": ");
                sb.append(c1095m4.m1497a());
            }
        }
        for (C1062j1 c1062j1 : m354f()) {
            if (!c1062j1.m1035c()) {
                sb.append("\n* MISSING ");
                sb.append(c1062j1.m1034b());
                sb.append(": ");
                sb.append(c1062j1.m1033a());
            }
        }
        return sb.toString();
    }

    /* renamed from: k */
    public String m359k() {
        return this.f378u;
    }

    /* renamed from: l */
    public List m360l() {
        return this.f349C;
    }

    /* renamed from: m */
    public String m361m() {
        return this.f373p;
    }

    /* renamed from: n */
    public List m362n() {
        return this.f383z;
    }

    /* renamed from: o */
    public final C1220k m363o() {
        return this.f358a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f375r.equals(string)) {
            this.f360c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterM3315a = AbstractC1249t3.m3315a(string, this.f358a);
            if (maxAdapterM3315a != null) {
                String strM3318a = AbstractC1249t3.m3318a(maxAdapterM3315a);
                if (this.f376s.equals(strM3318a)) {
                    return;
                }
                this.f376s = strM3318a;
                this.f358a.m2923u().m2772a(this.f376s, string);
            }
        }
    }

    /* renamed from: p */
    public String m364p() {
        return this.f376s;
    }

    /* renamed from: q */
    public a m365q() {
        return this.f359b;
    }

    /* renamed from: r */
    public List m366r() {
        return this.f382y;
    }

    /* renamed from: s */
    public List m367s() {
        return this.f348B;
    }

    /* renamed from: t */
    public C1288x6 m368t() {
        return this.f354H;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediatedNetwork{name=");
        sb.append(this.f373p);
        sb.append(", displayName=");
        sb.append(this.f374q);
        sb.append(", sdkAvailable=");
        sb.append(this.f361d);
        sb.append(", sdkVersion=");
        sb.append(this.f376s);
        sb.append(", adapterAvailable=");
        sb.append(this.f362e);
        sb.append(", adapterVersion=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f377t, "}");
    }

    /* renamed from: u */
    public List m369u() {
        return this.f350D;
    }

    /* renamed from: v */
    public String m370v() {
        return this.f379v;
    }

    /* renamed from: w */
    public String m371w() {
        return this.f380w;
    }

    /* renamed from: x */
    public Map m372x() {
        return this.f351E;
    }

    /* renamed from: y */
    public b m373y() {
        if (!this.f366i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f359b;
        return (aVar == a.COMPLETE || (aVar == a.INCOMPLETE_INTEGRATION && m344G() && m338A())) ? !this.f358a.m2922t0().m493c() ? b.DISABLED : (this.f367j && (this.f360c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f360c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY : b.INVALID_INTEGRATION;
    }

    /* renamed from: z */
    public boolean m374z() {
        return this.f352F;
    }

    /* renamed from: a */
    private List m334a(MaxAdapter maxAdapter, boolean z) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    /* renamed from: a */
    private List m336a(JSONObject jSONObject, C1220k c1220k) {
        ArrayList arrayList = new ArrayList();
        if (this.f375r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            C1095m4 c1095m4 = new C1095m4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", C1220k.m2824o());
            if (c1095m4.m1499c()) {
                arrayList.add(c1095m4);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new C1095m4(next, jSONObject2.getString(next), C1220k.m2824o()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private List m335a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    /* renamed from: a */
    private List m337a(JSONObject jSONObject, String str, C1220k c1220k) {
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("dependencies", jSONObject);
        JSONArray jSONArrayOooOOoo2 = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("dependencies_v2", jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayOooOOoo2.length() + jSONArrayOooOOoo.length());
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayOooOOoo, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C1062j1(jSONObject2, c1220k));
            }
        }
        for (int i2 = 0; i2 < jSONArrayOooOOoo2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayOooOOoo2, i2, (JSONObject) null);
            if (jSONObject3 != null && C1062j1.m1032a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new C1062j1(jSONObject3, c1220k));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C0984b3 c0984b3) {
        return this.f374q.compareToIgnoreCase(c0984b3.f374q);
    }
}
