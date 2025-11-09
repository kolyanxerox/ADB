package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.InterfaceC3018cs;
import com.ironsource.mediationsdk.metadata.C3401a;

/* renamed from: com.applovin.impl.w6 */
/* loaded from: classes.dex */
public class SharedPreferencesOnSharedPreferenceChangeListenerC1279w6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final C1220k f3003a;

    /* renamed from: b */
    private final SharedPreferences f3004b;

    /* renamed from: c */
    private Integer f3005c;

    /* renamed from: d */
    private Integer f3006d;

    /* renamed from: e */
    private Integer f3007e;

    /* renamed from: f */
    private String f3008f;

    /* renamed from: g */
    private String f3009g;

    /* renamed from: h */
    private String f3010h;

    /* renamed from: i */
    private String f3011i;

    /* renamed from: j */
    private String f3012j;

    public SharedPreferencesOnSharedPreferenceChangeListenerC1279w6(C1220k c1220k) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C1220k.m2824o());
        this.f3004b = defaultSharedPreferences;
        this.f3003a = c1220k;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f3005c = m3615a(C1286x4.f3065t.m3649a());
        this.f3006d = m3615a(C1286x4.f3066u.m3649a());
        this.f3007e = m3619h();
        this.f3008f = (String) C1295y4.m3788a(C1286x4.f3068w, (Object) null, defaultSharedPreferences, false);
        this.f3009g = (String) C1295y4.m3788a(C1286x4.f3069x, (Object) null, defaultSharedPreferences, false);
        this.f3010h = (String) C1295y4.m3788a(C1286x4.f3070y, (Object) null, defaultSharedPreferences, false);
        this.f3011i = (String) C1295y4.m3788a(C1286x4.f3029A, (Object) null, defaultSharedPreferences, false);
        this.f3012j = (String) C1295y4.m3788a(C1286x4.f3031C, (Object) null, defaultSharedPreferences, false);
        m3618b(this.f3009g);
    }

    /* renamed from: h */
    private Integer m3619h() {
        String strM3649a = C1286x4.f3067v.m3649a();
        if (this.f3004b.contains(strM3649a)) {
            Integer num = (Integer) C1295y4.m3790a(strM3649a, null, Integer.class, this.f3004b, false);
            if (num == null) {
                Long l = (Long) C1295y4.m3790a(strM3649a, null, Long.class, this.f3004b, false);
                if (l == null) {
                    Boolean bool = (Boolean) C1295y4.m3790a(strM3649a, null, Boolean.class, this.f3004b, false);
                    if (bool != null) {
                        return Integer.valueOf(bool.booleanValue() ? 1 : 0);
                    }
                    String str = (String) C1295y4.m3790a(strM3649a, null, String.class, this.f3004b, false);
                    if (str != null) {
                        if ("1".equals(str) || C3401a.f9920g.equals(str)) {
                            return 1;
                        }
                        if ("0".equals(str) || "false".equals(str)) {
                            return 0;
                        }
                        this.f3003a.m2847O();
                        if (C1240o.m3200a()) {
                            this.f3003a.m2847O().m3214b("TcfManager", OooO0oO.OooOo.OooOO0o("String value (", str, ") for ", strM3649a, " is invalid - setting GDPR Applies to null"));
                            return null;
                        }
                    }
                } else {
                    if (l.longValue() == 1 || l.longValue() == 0) {
                        return Integer.valueOf(l.intValue());
                    }
                    this.f3003a.m2847O();
                    if (C1240o.m3200a()) {
                        this.f3003a.m2847O().m3214b("TcfManager", "Long value (" + l + ") for " + strM3649a + " is invalid - setting GDPR Applies to null");
                        return null;
                    }
                }
            } else {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f3003a.m2847O();
                if (C1240o.m3200a()) {
                    this.f3003a.m2847O().m3214b("TcfManager", "Integer value (" + num + ") for " + strM3649a + " is invalid - setting GDPR Applies to null");
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public Boolean m3620a(int i) {
        return AbstractC1306z6.m3886a(i, this.f3009g);
    }

    /* renamed from: b */
    public boolean m3622b() {
        return AbstractC1306z6.m3887a(this.f3009g);
    }

    /* renamed from: c */
    public String m3624c() {
        return this.f3009g;
    }

    /* renamed from: d */
    public String m3626d() {
        return AbstractC1261u6.m3406a(this.f3005c);
    }

    /* renamed from: e */
    public Integer m3627e() {
        return this.f3005c;
    }

    /* renamed from: f */
    public Integer m3628f() {
        return this.f3006d;
    }

    /* renamed from: g */
    public Integer m3629g() {
        return this.f3007e;
    }

    /* renamed from: i */
    public String m3630i() {
        return m3616a("CMP Name", m3626d()) + m3616a("CMP SDK ID", this.f3005c) + m3616a("CMP SDK Version", this.f3006d) + m3616a(C1286x4.f3067v.m3649a(), this.f3007e) + m3616a(C1286x4.f3068w.m3649a(), this.f3008f) + m3616a(C1286x4.f3069x.m3649a(), this.f3009g);
    }

    /* renamed from: j */
    public String m3631j() {
        return this.f3008f;
    }

    /* renamed from: k */
    public String m3632k() {
        return this.f3010h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f3003a.m2847O();
            if (C1240o.m3200a()) {
                this.f3003a.m2847O().m3211a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            m3617a();
            return;
        }
        if (str.equals(C1286x4.f3065t.m3649a())) {
            this.f3005c = m3615a(str);
            this.f3003a.m2847O();
            if (C1240o.m3200a()) {
                C1240o c1240oM2847O = this.f3003a.m2847O();
                StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("SharedPreferences entry updated - key: ", str, ", value: ");
                sbOooOoO0.append(this.f3005c);
                c1240oM2847O.m3211a("TcfManager", sbOooOoO0.toString());
            }
            this.f3003a.m2853S0();
            return;
        }
        if (str.equals(C1286x4.f3066u.m3649a())) {
            this.f3006d = m3615a(str);
            this.f3003a.m2847O();
            if (C1240o.m3200a()) {
                C1240o c1240oM2847O2 = this.f3003a.m2847O();
                StringBuilder sbOooOoO02 = OooO0oO.OooOo.OooOoO0("SharedPreferences entry updated - key: ", str, ", value: ");
                sbOooOoO02.append(this.f3006d);
                c1240oM2847O2.m3211a("TcfManager", sbOooOoO02.toString());
                return;
            }
            return;
        }
        if (str.equals(C1286x4.f3067v.m3649a())) {
            this.f3007e = m3619h();
            this.f3003a.m2847O();
            if (C1240o.m3200a()) {
                C1240o c1240oM2847O3 = this.f3003a.m2847O();
                StringBuilder sbOooOoO03 = OooO0oO.OooOo.OooOoO0("SharedPreferences entry updated - key: ", str, ", value: ");
                sbOooOoO03.append(this.f3007e);
                c1240oM2847O3.m3211a("TcfManager", sbOooOoO03.toString());
                return;
            }
            return;
        }
        if (str.equals(C1286x4.f3068w.m3649a())) {
            this.f3008f = (String) C1295y4.m3789a(str, (Object) null, String.class, sharedPreferences);
            this.f3003a.m2847O();
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo(OooO0oO.OooOo.OooOoO0("SharedPreferences entry updated - key: ", str, ", value: "), this.f3008f, this.f3003a.m2847O(), "TcfManager");
            }
            this.f3003a.m2853S0();
            return;
        }
        if (str.equals(C1286x4.f3069x.m3649a())) {
            this.f3009g = (String) C1295y4.m3789a(str, (Object) null, String.class, sharedPreferences);
            this.f3003a.m2847O();
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo(OooO0oO.OooOo.OooOoO0("SharedPreferences entry updated - key: ", str, ", value: "), this.f3009g, this.f3003a.m2847O(), "TcfManager");
            }
            m3618b(this.f3009g);
            return;
        }
        if (str.equals(C1286x4.f3070y.m3649a())) {
            this.f3010h = (String) C1295y4.m3789a(str, (Object) null, String.class, sharedPreferences);
            this.f3003a.m2847O();
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo(OooO0oO.OooOo.OooOoO0("SharedPreferences entry updated - key: ", str, ", value: "), this.f3010h, this.f3003a.m2847O(), "TcfManager");
                return;
            }
            return;
        }
        if (str.equals(C1286x4.f3071z.m3649a())) {
            String str2 = (String) C1295y4.m3789a(str, (Object) null, String.class, sharedPreferences);
            this.f3003a.m2847O();
            if (C1240o.m3200a()) {
                this.f3003a.m2847O().m3211a("TcfManager", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("SharedPreferences entry updated - key: ", str, ", value: ", str2));
                return;
            }
            return;
        }
        if (str.equals(C1286x4.f3029A.m3649a())) {
            this.f3011i = (String) C1295y4.m3789a(str, (Object) null, String.class, sharedPreferences);
            this.f3003a.m2847O();
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo(OooO0oO.OooOo.OooOoO0("SharedPreferences entry updated - key: ", str, ", value: "), this.f3011i, this.f3003a.m2847O(), "TcfManager");
                return;
            }
            return;
        }
        if (str.equals(C1286x4.f3030B.m3649a())) {
            String str3 = (String) C1295y4.m3789a(str, (Object) null, String.class, sharedPreferences);
            this.f3003a.m2847O();
            if (C1240o.m3200a()) {
                this.f3003a.m2847O().m3211a("TcfManager", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("SharedPreferences entry updated - key: ", str, ", value: ", str3));
                return;
            }
            return;
        }
        if (str.equals(C1286x4.f3031C.m3649a())) {
            this.f3012j = (String) C1295y4.m3789a(str, (Object) null, String.class, sharedPreferences);
            this.f3003a.m2847O();
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo(OooO0oO.OooOo.OooOoO0("SharedPreferences entry updated - key: ", str, ", value: "), this.f3012j, this.f3003a.m2847O(), "TcfManager");
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) C1295y4.m3789a(str, (Object) null, String.class, sharedPreferences);
            this.f3003a.m2847O();
            if (C1240o.m3200a()) {
                this.f3003a.m2847O().m3211a("TcfManager", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("SharedPreferences entry updated - key: ", str, ", value: ", str4));
            }
        }
    }

    /* renamed from: a */
    private Integer m3615a(String str) {
        if (this.f3004b.contains(str)) {
            Integer num = (Integer) C1295y4.m3790a(str, null, Integer.class, this.f3004b, false);
            if (num != null) {
                return num;
            }
            Long l = (Long) C1295y4.m3790a(str, null, Long.class, this.f3004b, false);
            if (l != null && l.longValue() >= -2147483648L && l.longValue() <= 2147483647L) {
                return Integer.valueOf(l.intValue());
            }
            String str2 = (String) C1295y4.m3790a(str, null, String.class, this.f3004b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f3003a.m2847O();
                if (C1240o.m3200a()) {
                    this.f3003a.m2847O().m3214b("TcfManager", OooO0oO.OooOo.OooOO0o("String value (", str2, ") for ", str, " is not numeric - storing value as null"));
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Boolean m3621b(int i) {
        String str = this.f3011i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(AbstractC1306z6.m3888a(str, i - 1));
    }

    /* renamed from: c */
    public Boolean m3623c(int i) {
        String str = this.f3012j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(AbstractC1306z6.m3888a(str, i - 1));
    }

    /* renamed from: d */
    public Boolean m3625d(int i) {
        String str = this.f3010h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(AbstractC1306z6.m3888a(str, i - 1));
    }

    /* renamed from: b */
    private void m3618b(String str) {
        this.f3003a.m2847O();
        if (C1240o.m3200a()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Attempting to update consent from Additional Consent string: ", str, this.f3003a.m2847O(), "TcfManager");
        }
        Boolean boolM3886a = AbstractC1306z6.m3886a(InterfaceC3018cs.c.f7825e, str);
        if (boolM3886a != null) {
            if (boolM3886a.booleanValue()) {
                this.f3003a.m2847O();
                if (C1240o.m3200a()) {
                    this.f3003a.m2847O().m3211a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                AbstractC1150p0.m2047b(true, C1220k.m2824o());
            } else {
                this.f3003a.m2847O();
                if (C1240o.m3200a()) {
                    this.f3003a.m2847O().m3211a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                AbstractC1150p0.m2047b(false, C1220k.m2824o());
            }
            this.f3003a.m2853S0();
            return;
        }
        this.f3003a.m2847O();
        if (C1240o.m3200a()) {
            this.f3003a.m2847O().m3211a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    /* renamed from: a */
    private void m3617a() {
        this.f3005c = null;
        this.f3007e = null;
        this.f3008f = null;
        this.f3009g = null;
        this.f3010h = null;
    }

    /* renamed from: a */
    private String m3616a(String str, Object obj) {
        StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("\n", str, " - ");
        sbOooOoO0.append(obj != null ? obj.toString() : "No value set");
        return sbOooOoO0.toString();
    }
}
