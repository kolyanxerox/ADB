package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.AbstractC1066j5;
import com.applovin.impl.C1011e0;
import com.applovin.impl.C1088l7;
import com.applovin.impl.C1253t7;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.applovin.impl.l5 */
/* loaded from: classes.dex */
class C1086l5 extends AbstractC1066j5 {

    /* renamed from: q */
    private final C1088l7 f1109q;

    /* renamed from: com.applovin.impl.l5$a */
    public class a implements C1011e0.a {

        /* renamed from: a */
        final /* synthetic */ C1253t7 f1110a;

        public a(C1253t7 c1253t7) {
            this.f1110a = c1253t7;
        }

        @Override // com.applovin.impl.C1011e0.a
        /* renamed from: a */
        public void mo523a(Uri uri) {
            if (uri != null) {
                this.f1110a.m3354a(uri);
                C1086l5.this.f1109q.m2582b(true);
                return;
            }
            C1240o c1240o = C1086l5.this.f778c;
            if (C1240o.m3200a()) {
                C1086l5 c1086l5 = C1086l5.this;
                c1086l5.f778c.m3214b(c1086l5.f777b, "Failed to cache static companion ad");
            }
        }
    }

    /* renamed from: com.applovin.impl.l5$b */
    public class b implements AbstractC1066j5.e {

        /* renamed from: a */
        final /* synthetic */ C1253t7 f1112a;

        public b(C1253t7 c1253t7) {
            this.f1112a = c1253t7;
        }

        @Override // com.applovin.impl.AbstractC1066j5.e
        /* renamed from: a */
        public void mo1088a(String str) {
            this.f1112a.m3355a(str);
            C1086l5.this.f1109q.m2582b(true);
        }
    }

    /* renamed from: com.applovin.impl.l5$c */
    public class c implements AbstractC1066j5.e {

        /* renamed from: a */
        final /* synthetic */ C1253t7 f1114a;

        public c(C1253t7 c1253t7) {
            this.f1114a = c1253t7;
        }

        @Override // com.applovin.impl.AbstractC1066j5.e
        /* renamed from: a */
        public void mo1088a(String str) {
            this.f1114a.m3355a(str);
            C1086l5.this.f1109q.m2582b(true);
        }
    }

    /* renamed from: com.applovin.impl.l5$d */
    public class d implements C1011e0.a {

        /* renamed from: a */
        final /* synthetic */ C1307z7 f1116a;

        public d(C1307z7 c1307z7) {
            this.f1116a = c1307z7;
        }

        @Override // com.applovin.impl.C1011e0.a
        /* renamed from: a */
        public void mo523a(Uri uri) {
            if (uri != null) {
                C1240o c1240o = C1086l5.this.f778c;
                if (C1240o.m3200a()) {
                    C1086l5 c1086l5 = C1086l5.this;
                    c1086l5.f778c.m3211a(c1086l5.f777b, "Video file successfully cached into: " + uri);
                }
                this.f1116a.m3895a(uri);
                return;
            }
            C1240o c1240o2 = C1086l5.this.f778c;
            if (C1240o.m3200a()) {
                C1086l5 c1086l52 = C1086l5.this;
                c1086l52.f778c.m3214b(c1086l52.f777b, "Failed to cache video file: " + this.f1116a);
            }
        }
    }

    /* renamed from: com.applovin.impl.l5$e */
    public class e implements AbstractC1066j5.e {
        public e() {
        }

        @Override // com.applovin.impl.AbstractC1066j5.e
        /* renamed from: a */
        public void mo1088a(String str) {
            if (C1086l5.this.f1109q.isOpenMeasurementEnabled()) {
                str = C1086l5.this.f776a.m2894e0().m784a(str, AbstractC1013e2.m675a((AppLovinAdImpl) C1086l5.this.f946g));
            }
            C1086l5.this.f1109q.m1364d(str);
            C1240o c1240o = C1086l5.this.f778c;
            if (C1240o.m3200a()) {
                C1086l5 c1086l5 = C1086l5.this;
                c1086l5.f778c.m3211a(c1086l5.f777b, "Finish caching HTML template " + C1086l5.this.f1109q.m1369u1() + " for ad #" + C1086l5.this.f1109q.getAdIdNumber());
            }
        }
    }

    public C1086l5(C1088l7 c1088l7, C1220k c1220k, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", c1088l7, c1220k, appLovinAdLoadListener);
        this.f1109q = c1088l7;
    }

    /* renamed from: d */
    private String m1332d(String str) {
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f776a.m2866a(C1268v4.f2719X4)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                Uri uriM1067a = m1067a(str2, Collections.EMPTY_LIST, false);
                if (uriM1067a != null) {
                    str = str.replace(str2, uriM1067a.toString());
                    this.f946g.m2574a(uriM1067a);
                } else if (C1240o.m3200a()) {
                    this.f778c.m3214b(this.f777b, "Failed to cache JavaScript resource: " + str2);
                }
            }
        }
        return str;
    }

    /* renamed from: m */
    private void m1333m() {
        if (m1087l()) {
            return;
        }
        if (!this.f1109q.m1350G1()) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Companion ad caching disabled. Skipping...");
                return;
            }
            return;
        }
        C1148o7 c1148o7M1368s1 = this.f1109q.m1368s1();
        if (c1148o7M1368s1 == null) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        C1253t7 c1253t7M2026e = c1148o7M1368s1.m2026e();
        if (c1253t7M2026e == null) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                return;
            }
            return;
        }
        Uri uriM3357c = c1253t7M2026e.m3357c();
        String string = uriM3357c != null ? uriM3357c.toString() : "";
        String strM3356b = c1253t7M2026e.m3356b();
        if (!URLUtil.isValidUrl(string) && !StringUtils.isValidString(strM3356b)) {
            if (C1240o.m3200a()) {
                this.f778c.m3218k(this.f777b, "Companion ad does not have any resources attached. Skipping...");
                return;
            }
            return;
        }
        if (c1253t7M2026e.m3358d() == C1253t7.a.STATIC) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Caching static companion ad at " + string + "...");
            }
            Uri uriM1067a = m1067a(string, Collections.EMPTY_LIST, false);
            if (uriM1067a != null) {
                c1253t7M2026e.m3354a(uriM1067a);
                this.f1109q.m2582b(true);
                return;
            } else {
                if (C1240o.m3200a()) {
                    this.f778c.m3214b(this.f777b, "Failed to cache static companion ad");
                    return;
                }
                return;
            }
        }
        if (c1253t7M2026e.m3358d() != C1253t7.a.HTML) {
            if (c1253t7M2026e.m3358d() == C1253t7.a.IFRAME && C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Skip caching of iFrame resource...");
                return;
            }
            return;
        }
        if (!StringUtils.isValidString(string)) {
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Caching provided HTML for companion ad. No fetch required. HTML: ", strM3356b, this.f778c, this.f777b);
            }
            if (((Boolean) this.f776a.m2866a(C1268v4.f2711W4)).booleanValue()) {
                strM3356b = m1332d(strM3356b);
            }
            c1253t7M2026e.m3355a(m1071a(strM3356b, Collections.EMPTY_LIST, this.f1109q));
            this.f1109q.m2582b(true);
            return;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Begin caching HTML companion ad. Fetching from " + string + "...");
        }
        String strM1081c = m1081c(string, null, false);
        if (StringUtils.isValidString(strM1081c)) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "HTML fetched. Caching HTML now...");
            }
            c1253t7M2026e.m3355a(m1071a(strM1081c, Collections.EMPTY_LIST, this.f1109q));
            this.f1109q.m2582b(true);
            return;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3214b(this.f777b, "Unable to load companion ad resources from " + string);
        }
    }

    /* renamed from: n */
    private void m1334n() {
        if (m1087l() || !AbstractC1289x7.m3674a(this.f1109q)) {
            return;
        }
        String strM1369u1 = this.f1109q.m1369u1();
        if (!StringUtils.isValidString(strM1369u1)) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Unable to load HTML template");
                return;
            }
            return;
        }
        String strM1071a = m1071a(strM1369u1, this.f1109q.m2588c0(), this.f946g);
        if (this.f1109q.isOpenMeasurementEnabled()) {
            strM1071a = this.f776a.m2894e0().m784a(strM1071a, AbstractC1013e2.m675a((AppLovinAdImpl) this.f946g));
        }
        this.f1109q.m1364d(strM1071a);
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Finish caching HTML template " + this.f1109q.m1369u1() + " for ad #" + this.f1109q.getAdIdNumber());
        }
    }

    /* renamed from: o */
    private void m1335o() {
        C1307z7 c1307z7M1346C1;
        Uri uriM3899e;
        if (m1087l()) {
            return;
        }
        if (!this.f1109q.m1351H1()) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Video caching disabled. Skipping...");
                return;
            }
            return;
        }
        if (this.f1109q.m1345B1() == null || (c1307z7M1346C1 = this.f1109q.m1346C1()) == null || (uriM3899e = c1307z7M1346C1.m3899e()) == null) {
            return;
        }
        Uri uriM1078b = m1078b(uriM3899e.toString(), Collections.EMPTY_LIST, false);
        if (uriM1078b != null) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Video file successfully cached into: " + uriM1078b);
            }
            c1307z7M1346C1.m3895a(uriM1078b);
            return;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3214b(this.f777b, "Failed to cache video file: " + c1307z7M1346C1);
        }
    }

    /* renamed from: p */
    private AbstractCallableC0991c0 m1336p() {
        if (!this.f1109q.m1350G1()) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        C1148o7 c1148o7M1368s1 = this.f1109q.m1368s1();
        if (c1148o7M1368s1 == null) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        C1253t7 c1253t7M2026e = c1148o7M1368s1.m2026e();
        if (c1253t7M2026e == null) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri uriM3357c = c1253t7M2026e.m3357c();
        String string = uriM3357c != null ? uriM3357c.toString() : "";
        String strM3356b = c1253t7M2026e.m3356b();
        if (URLUtil.isValidUrl(string) || StringUtils.isValidString(strM3356b)) {
            if (c1253t7M2026e.m3358d() == C1253t7.a.STATIC) {
                if (C1240o.m3200a()) {
                    this.f778c.m3211a(this.f777b, "Caching static companion ad at " + string + "...");
                }
                return new C1011e0(string, this.f1109q, Collections.EMPTY_LIST, false, this.f948i, this.f776a, new a(c1253t7M2026e));
            }
            if (c1253t7M2026e.m3358d() == C1253t7.a.HTML) {
                if (!StringUtils.isValidString(string)) {
                    if (C1240o.m3200a()) {
                        androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Caching provided HTML for companion ad. No fetch required. HTML: ", strM3356b, this.f778c, this.f777b);
                    }
                    return m1068a(strM3356b, Collections.EMPTY_LIST, new c(c1253t7M2026e));
                }
                if (C1240o.m3200a()) {
                    this.f778c.m3211a(this.f777b, "Begin caching HTML companion ad. Fetching from " + string + "...");
                }
                String strM1081c = m1081c(string, null, false);
                if (StringUtils.isValidString(strM1081c)) {
                    if (C1240o.m3200a()) {
                        this.f778c.m3211a(this.f777b, "HTML fetched. Caching HTML now...");
                    }
                    return m1068a(strM1081c, Collections.EMPTY_LIST, new b(c1253t7M2026e));
                }
                if (C1240o.m3200a()) {
                    this.f778c.m3214b(this.f777b, "Unable to load companion ad resources from " + string);
                }
            } else if (c1253t7M2026e.m3358d() == C1253t7.a.IFRAME && C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Skip caching of iFrame resource...");
            }
        } else if (C1240o.m3200a()) {
            this.f778c.m3218k(this.f777b, "Companion ad does not have any resources attached. Skipping...");
        }
        return null;
    }

    @Override // com.applovin.impl.AbstractC1066j5
    /* renamed from: f */
    public void mo1083f() {
        this.f1109q.getAdEventTracker().mo476h();
        super.mo1083f();
    }

    /* renamed from: q */
    public C1001d0 m1337q() {
        if (!TextUtils.isEmpty(this.f1109q.m1369u1())) {
            return m1068a(this.f1109q.m1369u1(), this.f1109q.m2588c0(), new e());
        }
        if (!C1240o.m3200a()) {
            return null;
        }
        this.f778c.m3211a(this.f777b, "Unable to load HTML template");
        return null;
    }

    /* renamed from: r */
    public C1011e0 m1338r() {
        C1307z7 c1307z7M1346C1;
        Uri uriM3899e;
        if (!this.f1109q.m1351H1()) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.f1109q.m1345B1() == null || (c1307z7M1346C1 = this.f1109q.m1346C1()) == null || (uriM3899e = c1307z7M1346C1.m3899e()) == null) {
            return null;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Caching video file " + c1307z7M1346C1 + " creative...");
        }
        return m1070a(uriM3899e.toString(), Collections.EMPTY_LIST, false, new d(c1307z7M1346C1));
    }

    @Override // com.applovin.impl.AbstractC1066j5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zMo1358O0 = this.f1109q.mo1358O0();
        if (C1240o.m3200a()) {
            C1240o c1240o = this.f778c;
            String str = this.f777b;
            StringBuilder sb = new StringBuilder("Begin caching for VAST ");
            sb.append(zMo1358O0 ? "streaming " : "");
            sb.append("ad #");
            sb.append(this.f946g.getAdIdNumber());
            sb.append("...");
            c1240o.m3211a(str, sb.toString());
        }
        if (zMo1358O0) {
            if (((Boolean) this.f776a.m2866a(C1268v4.f2595I0)).booleanValue()) {
                if (!AbstractC1141o0.m1949e()) {
                    m1072a(m1082e());
                }
                if (this.f1109q.m1348E1()) {
                    mo1083f();
                    ArrayList arrayList = new ArrayList();
                    AbstractCallableC0991c0 abstractCallableC0991c0M1336p = m1336p();
                    if (abstractCallableC0991c0M1336p != null) {
                        arrayList.add(abstractCallableC0991c0M1336p);
                    }
                    C1001d0 c1001d0M1337q = m1337q();
                    if (c1001d0M1337q != null) {
                        arrayList.add(c1001d0M1337q);
                    }
                    C1011e0 c1011e0M1338r = m1338r();
                    if (c1011e0M1338r != null) {
                        arrayList.add(c1011e0M1338r);
                    }
                    m1072a(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (this.f1109q.m1371v1() == C1088l7.c.COMPANION_AD) {
                        AbstractCallableC0991c0 abstractCallableC0991c0M1336p2 = m1336p();
                        if (abstractCallableC0991c0M1336p2 != null) {
                            arrayList2.add(abstractCallableC0991c0M1336p2);
                        }
                        C1001d0 c1001d0M1337q2 = m1337q();
                        if (c1001d0M1337q2 != null) {
                            arrayList2.add(c1001d0M1337q2);
                        }
                        m1072a(arrayList2);
                        mo1083f();
                        C1011e0 c1011e0M1338r2 = m1338r();
                        if (c1011e0M1338r2 != null) {
                            arrayList3.add(c1011e0M1338r2);
                        }
                        m1072a(arrayList3);
                    } else {
                        C1011e0 c1011e0M1338r3 = m1338r();
                        if (c1011e0M1338r3 != null) {
                            arrayList2.add(c1011e0M1338r3);
                        }
                        m1072a(arrayList2);
                        mo1083f();
                        AbstractCallableC0991c0 abstractCallableC0991c0M1336p3 = m1336p();
                        if (abstractCallableC0991c0M1336p3 != null) {
                            arrayList3.add(abstractCallableC0991c0M1336p3);
                        }
                        C1001d0 c1001d0M1337q3 = m1337q();
                        if (c1001d0M1337q3 != null) {
                            arrayList3.add(c1001d0M1337q3);
                        }
                        m1072a(arrayList3);
                    }
                }
            } else {
                m1085j();
                if (this.f1109q.m1348E1()) {
                    mo1083f();
                }
                C1088l7.c cVarM1371v1 = this.f1109q.m1371v1();
                C1088l7.c cVar = C1088l7.c.COMPANION_AD;
                if (cVarM1371v1 == cVar) {
                    m1333m();
                    m1334n();
                    m1074a(this.f1109q);
                } else {
                    m1335o();
                }
                if (!this.f1109q.m1348E1()) {
                    mo1083f();
                }
                if (this.f1109q.m1371v1() == cVar) {
                    m1335o();
                } else {
                    m1333m();
                    m1334n();
                    m1074a(this.f1109q);
                }
            }
        } else if (((Boolean) this.f776a.m2866a(C1268v4.f2595I0)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            if (!AbstractC1141o0.m1949e()) {
                arrayList4.addAll(m1082e());
            }
            AbstractCallableC0991c0 abstractCallableC0991c0M1336p4 = m1336p();
            if (abstractCallableC0991c0M1336p4 != null) {
                arrayList4.add(abstractCallableC0991c0M1336p4);
            }
            C1011e0 c1011e0M1338r4 = m1338r();
            if (c1011e0M1338r4 != null) {
                arrayList4.add(c1011e0M1338r4);
            }
            C1001d0 c1001d0M1337q4 = m1337q();
            if (c1001d0M1337q4 != null) {
                arrayList4.add(c1001d0M1337q4);
            }
            m1072a(arrayList4);
            mo1083f();
        } else {
            m1085j();
            m1333m();
            m1335o();
            m1334n();
            m1074a(this.f1109q);
            mo1083f();
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Finished caching VAST ad #" + this.f1109q.getAdIdNumber());
        }
        this.f1109q.m1349F1();
        m1086k();
    }

    @Override // com.applovin.impl.AbstractC1066j5
    /* renamed from: a */
    public void mo1073a(int i) {
        this.f1109q.getAdEventTracker().m474f();
        super.mo1073a(i);
    }
}
