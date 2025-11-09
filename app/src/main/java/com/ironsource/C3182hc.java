package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* renamed from: com.ironsource.hc */
/* loaded from: classes2.dex */
class C3182hc {

    /* renamed from: a */
    static final String f8851a = "ironbeast";

    /* renamed from: b */
    static final String f8852b = "outcome";

    /* renamed from: c */
    static final int f8853c = 4;

    /* renamed from: d */
    static final int f8854d = 3;

    /* renamed from: e */
    static final int f8855e = 2;

    /* renamed from: f */
    static final int f8856f = 0;

    /* renamed from: a */
    public static AbstractC3059e m9111a(String str, int i) {
        if (f8851a.equals(str)) {
            return new C3667sk(i);
        }
        if (f8852b.equals(str)) {
            return new C3879yp(i);
        }
        if (i == 2) {
            return new C3667sk(i);
        }
        if (i == 3) {
            return new C3879yp(i);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }
}
