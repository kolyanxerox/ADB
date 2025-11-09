package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.network.C1235a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* renamed from: com.applovin.impl.n6 */
/* loaded from: classes.dex */
class C1137n6 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final AbstractC1157p7 f1536g;

    /* renamed from: h */
    private final AppLovinAdLoadListener f1537h;

    public C1137n6(AbstractC1157p7 abstractC1157p7, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
        super("TaskResolveVastWrapper", c1220k);
        this.f1537h = appLovinAdLoadListener;
        this.f1536g = abstractC1157p7;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strM3665a = AbstractC1289x7.m3665a(this.f1536g);
        if (!StringUtils.isValidString(strM3665a)) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Resolving VAST failed. Could not find resolution URL");
            }
            m1901a(-1);
            return;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Resolving VAST ad with depth " + this.f1536g.m2082d() + " at " + strM3665a);
        }
        try {
            this.f776a.m2918r0().m402a(new a(C1235a.m3072a(this.f776a).mo3103b(strM3665a).mo3107c("GET").mo3096a(C1099m8.f1205f).mo3094a(((Integer) this.f776a.m2866a(C1268v4.f2615K4)).intValue()).mo3106c(((Integer) this.f776a.m2866a(C1268v4.f2623L4)).intValue()).mo3100a(false).mo3101a(), this.f776a));
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f778c.m3212a(this.f777b, "Unable to resolve VAST wrapper", th);
            }
            m1901a(-1);
        }
    }

    /* renamed from: com.applovin.impl.n6$a */
    public class a extends AbstractC1067j6 {
        public a(C1235a c1235a, C1220k c1220k) {
            super(c1235a, c1220k);
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a */
        public void mo933a(String str, C1099m8 c1099m8, int i) {
            this.f776a.m2918r0().m402a(AbstractC1027f6.m742a(c1099m8, C1137n6.this.f1536g, C1137n6.this.f1537h, C1137n6.this.f776a));
        }

        @Override // com.applovin.impl.AbstractC1067j6, com.applovin.impl.C1166q0.e
        /* renamed from: a */
        public void mo931a(String str, int i, String str2, C1099m8 c1099m8) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Unable to resolve VAST wrapper. Server returned " + i);
            }
            C1137n6.this.m1901a(i);
        }
    }

    /* renamed from: a */
    public void m1901a(int i) {
        if (C1240o.m3200a()) {
            this.f778c.m3214b(this.f777b, "Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f1537h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        AbstractC1289x7.m3669a(this.f1536g, this.f1537h, i == -1001 ? EnumC1173q7.TIMED_OUT : EnumC1173q7.GENERAL_WRAPPER_ERROR, i, this.f776a);
    }
}
