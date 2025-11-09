package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.f6 */
/* loaded from: classes.dex */
public abstract class AbstractC1027f6 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final AppLovinAdLoadListener f743g;

    /* renamed from: h */
    private final a f744h;

    /* renamed from: com.applovin.impl.f6$a */
    public static final class a extends AbstractC1157p7 {
        public a(JSONObject jSONObject, JSONObject jSONObject2, C1220k c1220k) {
            super(jSONObject, jSONObject2, c1220k);
        }

        /* renamed from: a */
        public void m749a(C1099m8 c1099m8) {
            if (c1099m8 == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f1727b.add(c1099m8);
        }
    }

    /* renamed from: com.applovin.impl.f6$b */
    public static final class b extends AbstractC1027f6 {

        /* renamed from: i */
        private final String f745i;

        public b(String str, AbstractC1157p7 abstractC1157p7, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
            super(abstractC1157p7, appLovinAdLoadListener, c1220k);
            this.f745i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1099m8 c1099m8M747b = m747b(this.f745i);
            if (c1099m8M747b != null) {
                m745a(c1099m8M747b);
                return;
            }
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Unable to process XML: " + this.f745i);
            }
            m748c(this.f745i);
            m746a(EnumC1173q7.XML_PARSING);
        }
    }

    /* renamed from: com.applovin.impl.f6$c */
    public static final class c extends AbstractC1027f6 {

        /* renamed from: i */
        private final JSONObject f746i;

        public c(AbstractC1157p7 abstractC1157p7, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
            super(abstractC1157p7, appLovinAdLoadListener, c1220k);
            this.f746i = abstractC1157p7.m2080b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f746i, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (C1240o.m3200a()) {
                    this.f778c.m3214b(this.f777b, "No VAST response received.");
                }
                m746a(EnumC1173q7.NO_WRAPPER_RESPONSE);
            } else {
                if (string.length() >= ((Integer) this.f776a.m2866a(C1268v4.f2575F4)).intValue()) {
                    if (C1240o.m3200a()) {
                        this.f778c.m3214b(this.f777b, "VAST response is over max length");
                    }
                    m746a(EnumC1173q7.XML_PARSING);
                    return;
                }
                C1099m8 c1099m8M747b = m747b(string);
                if (c1099m8M747b != null) {
                    m745a(c1099m8M747b);
                    return;
                }
                if (C1240o.m3200a()) {
                    this.f778c.m3214b(this.f777b, "Unable to process XML: ".concat(string));
                }
                m748c(string);
                m746a(EnumC1173q7.XML_PARSING);
            }
        }
    }

    /* renamed from: com.applovin.impl.f6$d */
    public static final class d extends AbstractC1027f6 {

        /* renamed from: i */
        private final C1099m8 f747i;

        public d(C1099m8 c1099m8, AbstractC1157p7 abstractC1157p7, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
            super(abstractC1157p7, appLovinAdLoadListener, c1220k);
            if (c1099m8 == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (abstractC1157p7 == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f747i = c1099m8;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Processing VAST Wrapper response...");
            }
            m745a(this.f747i);
        }
    }

    public AbstractC1027f6(AbstractC1157p7 abstractC1157p7, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
        super("TaskProcessVastResponse", c1220k);
        if (abstractC1157p7 == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f743g = appLovinAdLoadListener;
        this.f744h = (a) abstractC1157p7;
    }

    /* renamed from: a */
    public static AbstractC1027f6 m744a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
        return new c(new a(jSONObject, jSONObject2, c1220k), appLovinAdLoadListener, c1220k);
    }

    /* renamed from: b */
    public C1099m8 m747b(String str) {
        try {
            return C1139n8.m1910a(str, this.f776a);
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f778c.m3212a(this.f777b, "Failed to process VAST response", th);
            }
            m746a(EnumC1173q7.XML_PARSING);
            this.f776a.m2832E().m2152a(this.f777b, th);
            return null;
        }
    }

    /* renamed from: c */
    public void m748c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f776a.m2866a(C1268v4.f2727Y4)), 1).iterator();
        while (it.hasNext()) {
            C1099m8 c1099m8M747b = m747b("<VAST>" + it.next() + "</VAST>");
            if (c1099m8M747b != null) {
                this.f744h.m749a(c1099m8M747b);
            }
        }
    }

    /* renamed from: a */
    public static AbstractC1027f6 m743a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
        return new b(str, new a(jSONObject, jSONObject2, c1220k), appLovinAdLoadListener, c1220k);
    }

    /* renamed from: a */
    public static AbstractC1027f6 m742a(C1099m8 c1099m8, AbstractC1157p7 abstractC1157p7, AppLovinAdLoadListener appLovinAdLoadListener, C1220k c1220k) {
        return new d(c1099m8, abstractC1157p7, appLovinAdLoadListener, c1220k);
    }

    /* renamed from: a */
    public void m745a(C1099m8 c1099m8) {
        int iM2082d = this.f744h.m2082d();
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Finished parsing XML at depth " + iM2082d);
        }
        this.f744h.m749a(c1099m8);
        if (AbstractC1289x7.m3678b(c1099m8)) {
            int iIntValue = ((Integer) this.f776a.m2866a(C1268v4.f2583G4)).intValue();
            if (iM2082d < iIntValue) {
                if (C1240o.m3200a()) {
                    this.f778c.m3211a(this.f777b, "VAST response is wrapper. Resolving...");
                }
                this.f776a.m2918r0().m402a(new C1137n6(this.f744h, this.f743g, this.f776a));
                return;
            }
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Reached beyond max wrapper depth of " + iIntValue);
            }
            m746a(EnumC1173q7.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (AbstractC1289x7.m3675a(c1099m8)) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "VAST response is inline. Rendering ad...");
            }
            this.f776a.m2918r0().m402a(new C1057i6(this.f744h, this.f743g, this.f776a));
            return;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3214b(this.f777b, "VAST response is an error");
        }
        m746a(EnumC1173q7.NO_WRAPPER_RESPONSE);
    }

    /* renamed from: a */
    public void m746a(EnumC1173q7 enumC1173q7) {
        if (C1240o.m3200a()) {
            this.f778c.m3214b(this.f777b, "Failed to process VAST response due to VAST error code " + enumC1173q7);
        }
        AbstractC1289x7.m3669a(this.f744h, this.f743g, enumC1173q7, -6, this.f776a);
    }
}
