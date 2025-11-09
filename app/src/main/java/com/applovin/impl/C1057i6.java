package com.applovin.impl;

import com.applovin.impl.C0987b6;
import com.applovin.impl.C1088l7;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;

/* renamed from: com.applovin.impl.i6 */
/* loaded from: classes.dex */
class C1057i6 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final AbstractC1157p7 f907g;

    /* renamed from: h */
    private final AppLovinAdLoadListener f908h;

    public C1057i6(AbstractC1157p7 abstractC1157p7, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
        super("TaskRenderVastAd", c1220k);
        this.f908h = appLovinAdLoadListener;
        this.f907g = abstractC1157p7;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Rendering VAST ad...");
        }
        int size = this.f907g.m2079a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String strM3664a = "";
        C1262u7 c1262u7M3407a = null;
        C1298y7 c1298y7M3806a = null;
        C1148o7 c1148o7M2021a = null;
        C1138n7 c1138n7M1906a = null;
        String strM3664a2 = "";
        for (C1099m8 c1099m8 : this.f907g.m2079a()) {
            C1099m8 c1099m8M1513b = c1099m8.m1513b(AbstractC1289x7.m3678b(c1099m8) ? "Wrapper" : "InLine");
            if (c1099m8M1513b != null) {
                C1099m8 c1099m8M1513b2 = c1099m8M1513b.m1513b("AdSystem");
                if (c1099m8M1513b2 != null) {
                    c1262u7M3407a = C1262u7.m3407a(c1099m8M1513b2, c1262u7M3407a, this.f776a);
                }
                strM3664a = AbstractC1289x7.m3664a(c1099m8M1513b, "AdTitle", strM3664a);
                strM3664a2 = AbstractC1289x7.m3664a(c1099m8M1513b, "Description", strM3664a2);
                AbstractC1289x7.m3670a(c1099m8M1513b.m1511a("Impression"), hashSet, this.f907g, this.f776a);
                C1099m8 c1099m8M1515c = c1099m8M1513b.m1515c("ViewableImpression");
                if (c1099m8M1515c != null) {
                    AbstractC1289x7.m3670a(c1099m8M1515c.m1511a("Viewable"), hashSet, this.f907g, this.f776a);
                }
                C1099m8 c1099m8M1513b3 = c1099m8M1513b.m1513b("AdVerifications");
                if (c1099m8M1513b3 != null) {
                    c1138n7M1906a = C1138n7.m1906a(c1099m8M1513b3, c1138n7M1906a, this.f907g, this.f776a);
                }
                AbstractC1289x7.m3670a(c1099m8M1513b.m1511a("Error"), hashSet2, this.f907g, this.f776a);
                C1099m8 c1099m8M1515c2 = c1099m8M1513b.m1515c("Creatives");
                if (c1099m8M1515c2 != null) {
                    for (C1099m8 c1099m82 : c1099m8M1515c2.m1514b()) {
                        C1099m8 c1099m8M1515c3 = c1099m82.m1515c("Linear");
                        if (c1099m8M1515c3 != null) {
                            c1298y7M3806a = C1298y7.m3806a(c1099m8M1515c3, c1298y7M3806a, this.f907g, this.f776a);
                        } else {
                            C1099m8 c1099m8M1513b4 = c1099m82.m1513b("CompanionAds");
                            if (c1099m8M1513b4 != null) {
                                C1099m8 c1099m8M1513b5 = c1099m8M1513b4.m1513b("Companion");
                                if (c1099m8M1513b5 != null) {
                                    c1148o7M2021a = C1148o7.m2021a(c1099m8M1513b5, c1148o7M2021a, this.f907g, this.f776a);
                                }
                            } else if (C1240o.m3200a()) {
                                this.f778c.m3214b(this.f777b, "Received and will skip rendering for an unidentified creative: " + c1099m82);
                            }
                        }
                    }
                }
            } else if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Did not find wrapper or inline response for node: " + c1099m8);
            }
        }
        C1088l7 c1088l7M1408a = new C1088l7.b().m1402a(this.f776a).m1407a(this.f907g.m2080b()).m1411b(this.f907g.m2083e()).m1399a(this.f907g.m2081c()).m1409b(strM3664a).m1405a(strM3664a2).m1403a(c1262u7M3407a).m1404a(c1298y7M3806a).m1401a(c1148o7M2021a).m1400a(c1138n7M1906a).m1410b(hashSet).m1400a(c1138n7M1906a).m1406a(hashSet2).m1408a();
        EnumC1173q7 enumC1173q7M3679c = AbstractC1289x7.m3679c(c1088l7M1408a);
        if (enumC1173q7M3679c != null) {
            AbstractC1289x7.m3669a(this.f907g, this.f908h, enumC1173q7M3679c, -6, this.f776a);
            return;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Finished rendering VAST ad: " + c1088l7M1408a);
        }
        c1088l7M1408a.getAdEventTracker().m473e();
        this.f776a.m2918r0().m403a((AbstractRunnableC1036g5) new C1086l5(c1088l7M1408a, this.f776a, this.f908h), C0987b6.b.CACHING);
    }
}
