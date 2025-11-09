package com.ironsource;

/* renamed from: com.ironsource.x4 */
/* loaded from: classes2.dex */
public final class C3824x4 {

    /* renamed from: a */
    public static final C3824x4 f12566a = new C3824x4();

    /* renamed from: b */
    public static final String f12567b = "trials_fail";

    /* renamed from: c */
    public static final String f12568c = "parsing";

    /* renamed from: d */
    public static final String f12569d = "other";

    /* renamed from: e */
    public static final String f12570e = "disabled";

    /* renamed from: f */
    public static final String f12571f = "-1";

    private C3824x4() {
    }

    /* renamed from: a */
    public static /* synthetic */ String m13010a(C3824x4 c3824x4, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return c3824x4.m13012a(z, num);
    }

    /* renamed from: a */
    public final String m13011a(boolean z) {
        if (!z) {
            return f12571f;
        }
        return "fallback_" + System.currentTimeMillis();
    }

    /* renamed from: a */
    public final String m13012a(boolean z, Integer num) {
        return !z ? f12570e : (num != null && num.intValue() == 1003) ? f12568c : (num != null && num.intValue() == 1008) ? f12568c : (num != null && num.intValue() == 1002) ? f12568c : (num != null && num.intValue() == 1006) ? f12567b : (num != null && num.intValue() == 1001) ? f12567b : f12569d;
    }
}
