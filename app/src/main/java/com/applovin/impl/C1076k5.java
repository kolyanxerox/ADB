package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.AbstractC1066j5;
import com.applovin.impl.C1011e0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p005ad.C1206a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.k5 */
/* loaded from: classes.dex */
public class C1076k5 extends AbstractC1066j5 {

    /* renamed from: q */
    private final C1206a f992q;

    /* renamed from: r */
    private boolean f993r;

    /* renamed from: s */
    private boolean f994s;

    /* renamed from: com.applovin.impl.k5$a */
    public class a implements C1011e0.a {
        public a() {
        }

        @Override // com.applovin.impl.C1011e0.a
        /* renamed from: a */
        public void mo523a(Uri uri) {
            if (uri != null) {
                C1076k5.this.f992q.m2493y1();
                C1076k5.this.f992q.m2485d(uri);
            }
        }
    }

    /* renamed from: com.applovin.impl.k5$b */
    public class b implements AbstractC1066j5.e {
        public b() {
        }

        @Override // com.applovin.impl.AbstractC1066j5.e
        /* renamed from: a */
        public void mo1088a(String str) {
            C1076k5.this.f992q.m2486d(C1076k5.this.m1140d(str));
            C1076k5.this.f992q.m2582b(true);
            C1240o c1240o = C1076k5.this.f778c;
            if (C1240o.m3200a()) {
                C1076k5 c1076k5 = C1076k5.this;
                c1076k5.f778c.m3211a(c1076k5.f777b, "Finish caching non-video resources for ad #" + C1076k5.this.f992q.getAdIdNumber());
            }
            C1076k5 c1076k52 = C1076k5.this;
            c1076k52.f778c.m3217f(c1076k52.f777b, "Ad updated with cachedHTML = " + C1076k5.this.f992q.m2488s1());
        }
    }

    public C1076k5(C1206a c1206a, C1220k c1220k, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", c1206a, c1220k, appLovinAdLoadListener);
        this.f992q = c1206a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public String m1140d(String str) {
        if (AbstractC1078k7.m1251j(C1220k.m2824o())) {
            str = AbstractC1078k7.m1226c(str);
        }
        if (!this.f992q.isOpenMeasurementEnabled()) {
            return str;
        }
        return this.f776a.m2894e0().m784a(str, AbstractC1013e2.m675a((AppLovinAdImpl) this.f946g));
    }

    /* renamed from: m */
    private void m1141m() {
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Caching non-optional HTML resources...");
        }
        this.f992q.m2486d(m1140d(m1071a(this.f992q.m2488s1(), this.f992q.m2588c0(), this.f992q)));
        this.f992q.m2582b(true);
        m1074a(this.f992q);
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Finish caching non-optional HTML resources for ad #" + this.f992q.getAdIdNumber());
        }
        this.f778c.m3217f(this.f777b, "Ad HTML updated to reference locally cached non-optional resources = " + this.f992q.m2488s1());
    }

    /* renamed from: n */
    private void m1142n() {
        Uri uriM1080c;
        if (m1087l() || (uriM1080c = m1080c(this.f992q.m2491w1())) == null) {
            return;
        }
        this.f992q.m2493y1();
        this.f992q.m2485d(uriM1080c);
    }

    /* renamed from: o */
    private C1001d0 m1143o() {
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Caching HTML resources...");
        }
        return m1068a(this.f992q.m2488s1(), this.f992q.m2588c0(), new b());
    }

    /* renamed from: p */
    private C1011e0 m1144p() {
        return m1079b(this.f992q.m2491w1(), new a());
    }

    /* renamed from: q */
    private void m1145q() {
        List<String> listM2554R = this.f992q.m2554R();
        if (CollectionUtils.isEmpty(listM2554R)) {
            return;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Caching optional HTML resources...");
        }
        String strM2488s1 = this.f992q.m2488s1();
        for (String str : listM2554R) {
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Caching optional resource: ", str, this.f778c, this.f777b);
            }
            int iM3022a = this.f776a.m2837H().m3022a(str, this.f946g);
            Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) this.f946g);
            String strM3026a = this.f776a.m2837H().m3026a(C1220k.m2824o(), str, this.f992q.getCachePrefix(), this.f992q.m2588c0(), true, true, iM3022a, this.f948i, mapM675a);
            if (StringUtils.isValidString(strM3026a)) {
                if (C1240o.m3200a()) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Updating HTML with cached optional resource: ", strM3026a, this.f778c, this.f777b);
                }
                this.f992q.m2574a(Uri.parse(strM3026a));
                strM2488s1 = strM2488s1.replace(str, strM3026a);
                this.f992q.m2486d(strM2488s1);
            } else {
                if (C1240o.m3200a()) {
                    this.f778c.m3214b(this.f777b, "Failed to cache optional resource: " + str);
                }
                m1076a(str, "cacheOptionalHtmlResource", mapM675a);
            }
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Finish caching optional HTML resources for ad #" + this.f992q.getAdIdNumber());
        }
    }

    /* renamed from: b */
    public void m1146b(boolean z) {
        this.f994s = z;
    }

    /* renamed from: c */
    public void m1147c(boolean z) {
        this.f993r = z;
    }

    @Override // com.applovin.impl.AbstractC1066j5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zMo1358O0 = this.f992q.mo1358O0();
        boolean z = this.f994s;
        if (zMo1358O0 || z) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Begin caching for streaming ad #" + this.f992q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f776a.m2866a(C1268v4.f2595I0)).booleanValue()) {
                if (!AbstractC1141o0.m1949e()) {
                    m1072a(m1082e());
                }
                ArrayList arrayList = new ArrayList();
                if (!zMo1358O0) {
                    mo1083f();
                    C1001d0 c1001d0M1143o = m1143o();
                    if (c1001d0M1143o != null) {
                        arrayList.add(c1001d0M1143o);
                    }
                } else if (this.f993r) {
                    mo1083f();
                    C1001d0 c1001d0M1143o2 = m1143o();
                    if (c1001d0M1143o2 != null) {
                        arrayList.add(c1001d0M1143o2);
                    }
                    C1011e0 c1011e0M1144p = m1144p();
                    if (c1011e0M1144p != null) {
                        arrayList.add(c1011e0M1144p);
                    }
                } else {
                    C1001d0 c1001d0M1143o3 = m1143o();
                    if (c1001d0M1143o3 != null) {
                        m1072a(Arrays.asList(c1001d0M1143o3));
                    }
                    mo1083f();
                    C1011e0 c1011e0M1144p2 = m1144p();
                    if (c1011e0M1144p2 != null) {
                        arrayList.add(c1011e0M1144p2);
                    }
                }
                m1072a(arrayList);
                mo1083f();
            } else {
                m1085j();
                if (zMo1358O0) {
                    if (this.f993r) {
                        mo1083f();
                    }
                    m1141m();
                    if (!this.f993r) {
                        mo1083f();
                    }
                    m1142n();
                } else {
                    mo1083f();
                    m1141m();
                }
            }
        } else {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Begin processing for non-streaming ad #" + this.f992q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f776a.m2866a(C1268v4.f2595I0)).booleanValue()) {
                ArrayList arrayList2 = new ArrayList();
                if (!AbstractC1141o0.m1949e()) {
                    arrayList2.addAll(m1082e());
                }
                C1001d0 c1001d0M1143o4 = m1143o();
                if (c1001d0M1143o4 != null) {
                    arrayList2.add(c1001d0M1143o4);
                }
                C1011e0 c1011e0M1144p3 = m1144p();
                if (c1011e0M1144p3 != null) {
                    arrayList2.add(c1011e0M1144p3);
                }
                m1072a(arrayList2);
                mo1083f();
                m1145q();
            } else {
                m1085j();
                m1141m();
                m1142n();
                mo1083f();
                m1145q();
            }
        }
        m1086k();
    }
}
