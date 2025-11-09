package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1166q0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.network.C1235a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.j6 */
/* loaded from: classes.dex */
public abstract class AbstractC1067j6 extends AbstractRunnableC1036g5 implements C1166q0.e {

    /* renamed from: g */
    private final C1235a f962g;

    /* renamed from: h */
    private final C1166q0.e f963h;

    /* renamed from: i */
    private C0987b6.b f964i;

    /* renamed from: j */
    private C1268v4 f965j;

    /* renamed from: k */
    private C1268v4 f966k;

    /* renamed from: l */
    protected C1166q0.b f967l;

    public AbstractC1067j6(C1235a c1235a, C1220k c1220k) {
        this(c1235a, c1220k, false);
    }

    /* renamed from: a */
    public abstract void mo931a(String str, int i, String str2, Object obj);

    /* renamed from: a */
    public abstract void mo933a(String str, Object obj, int i);

    @Override // java.lang.Runnable
    public void run() {
        C1166q0 c1166q0M2929x = m795b().m2929x();
        if (!m795b().m2835F0() && !m795b().m2829C0()) {
            C1240o.m3207h("AppLovinSdk", "AppLovin SDK is disabled");
            mo931a(this.f962g.m3081f(), -22, null, null);
        } else if (!StringUtils.isValidString(this.f962g.m3081f()) || this.f962g.m3081f().length() < 4) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Task has an invalid or null request endpoint.");
            }
            mo931a(this.f962g.m3081f(), AppLovinErrorCodes.INVALID_URL, null, null);
        } else {
            if (TextUtils.isEmpty(this.f962g.m3083h())) {
                this.f962g.m3077b(this.f962g.m3076b() != null ? "POST" : "GET");
            }
            c1166q0M2929x.m2134a(this.f962g, this.f967l, this.f963h);
        }
    }

    /* renamed from: com.applovin.impl.j6$a */
    public class a implements C1166q0.e {

        /* renamed from: a */
        final /* synthetic */ C1220k f968a;

        public a(C1220k c1220k) {
            this.f968a = c1220k;
        }

        @Override // com.applovin.impl.C1166q0.e
        /* renamed from: a */
        public void mo933a(String str, Object obj, int i) {
            AbstractC1067j6.this.f962g.m3074a(0);
            AbstractC1067j6.this.mo933a(str, obj, i);
        }

        @Override // com.applovin.impl.C1166q0.e
        /* renamed from: a */
        public void mo931a(String str, int i, String str2, Object obj) {
            long millis;
            boolean z = false;
            boolean z2 = i < 200 || i >= 500;
            boolean z3 = i == 429;
            boolean z4 = i != -1009 || AbstractC1067j6.this.f962g.m3092q();
            boolean z5 = (i == -900 || i == -1000) ? false : true;
            if (z4 && z5 && (z2 || z3 || AbstractC1067j6.this.f962g.m3091p())) {
                String strM3073a = AbstractC1067j6.this.f962g.m3073a();
                if (AbstractC1067j6.this.f962g.m3085j() <= 0) {
                    if (strM3073a != null && strM3073a.equals(AbstractC1067j6.this.f962g.m3081f())) {
                        AbstractC1067j6 abstractC1067j6 = AbstractC1067j6.this;
                        abstractC1067j6.m1091a(abstractC1067j6.f966k);
                    } else {
                        AbstractC1067j6 abstractC1067j62 = AbstractC1067j6.this;
                        abstractC1067j62.m1091a(abstractC1067j62.f965j);
                    }
                    AbstractC1067j6 abstractC1067j63 = AbstractC1067j6.this;
                    abstractC1067j63.mo931a(abstractC1067j63.f962g.m3081f(), i, str2, obj);
                    return;
                }
                C1240o c1240o = AbstractC1067j6.this.f778c;
                if (C1240o.m3200a()) {
                    AbstractC1067j6 abstractC1067j64 = AbstractC1067j6.this;
                    C1240o c1240o2 = abstractC1067j64.f778c;
                    String str3 = abstractC1067j64.f777b;
                    StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Unable to send request due to server failure (code ", "). ");
                    sbOooOOo0.append(AbstractC1067j6.this.f962g.m3085j());
                    sbOooOOo0.append(" attempts left, retrying in ");
                    sbOooOOo0.append(TimeUnit.MILLISECONDS.toSeconds(AbstractC1067j6.this.f962g.m3086k()));
                    sbOooOOo0.append(" seconds...");
                    c1240o2.m3218k(str3, sbOooOOo0.toString());
                }
                int iM3085j = AbstractC1067j6.this.f962g.m3085j() - 1;
                AbstractC1067j6.this.f962g.m3074a(iM3085j);
                if (iM3085j == 0) {
                    AbstractC1067j6 abstractC1067j65 = AbstractC1067j6.this;
                    abstractC1067j65.m1091a(abstractC1067j65.f965j);
                    if (StringUtils.isValidString(strM3073a) && strM3073a.length() >= 4) {
                        C1240o c1240o3 = AbstractC1067j6.this.f778c;
                        if (C1240o.m3200a()) {
                            AbstractC1067j6 abstractC1067j66 = AbstractC1067j6.this;
                            abstractC1067j66.f778c.m3215d(abstractC1067j66.f777b, "Switching to backup endpoint ".concat(strM3073a));
                        }
                        AbstractC1067j6.this.f962g.m3075a(strM3073a);
                        z = true;
                    }
                }
                if (((Boolean) this.f968a.m2866a(C1268v4.f2775e3)).booleanValue() && z) {
                    millis = 0;
                } else {
                    millis = AbstractC1067j6.this.f962g.m3089n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, AbstractC1067j6.this.f962g.m3078c())) : AbstractC1067j6.this.f962g.m3086k();
                }
                C0987b6 c0987b6M2918r0 = this.f968a.m2918r0();
                AbstractC1067j6 abstractC1067j67 = AbstractC1067j6.this;
                c0987b6M2918r0.m404a(abstractC1067j67, abstractC1067j67.f964i, millis);
                return;
            }
            AbstractC1067j6 abstractC1067j68 = AbstractC1067j6.this;
            abstractC1067j68.mo931a(abstractC1067j68.f962g.m3081f(), i, str2, obj);
        }
    }

    public AbstractC1067j6(C1235a c1235a, C1220k c1220k, boolean z) {
        super("TaskRepeatRequest", c1220k, z);
        this.f964i = C0987b6.b.OTHER;
        if (c1235a == null) {
            throw new IllegalArgumentException("No request specified");
        }
        m792a(c1235a.m3081f());
        this.f962g = c1235a;
        this.f967l = new C1166q0.b();
        this.f963h = new a(c1220k);
    }

    /* renamed from: b */
    public void m1096b(C1268v4 c1268v4) {
        this.f966k = c1268v4;
    }

    /* renamed from: c */
    public void m1097c(C1268v4 c1268v4) {
        this.f965j = c1268v4;
    }

    /* renamed from: a */
    public void m1095a(C0987b6.b bVar) {
        this.f964i = bVar;
    }

    /* renamed from: a */
    public void m1091a(C1268v4 c1268v4) {
        if (c1268v4 != null) {
            m795b().m2914p0().m3609a(c1268v4, c1268v4.m3551a());
        }
    }
}
