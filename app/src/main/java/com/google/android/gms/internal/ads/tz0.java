package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class tz0 {

    /* renamed from: OooO00o */
    public static volatile tz0 f24541OooO00o;

    /* renamed from: OooO0O0 */
    public static final tz0 f24542OooO0O0;

    static {
        tz0 tz0Var = new tz0();
        Map map = Collections.EMPTY_MAP;
        f24542OooO0O0 = tz0Var;
    }

    public static tz0 OooO00o() {
        a11 a11Var = a11.f16875OooO0OO;
        return f24542OooO0O0;
    }

    public static tz0 OooO0O0() {
        tz0 tz0Var = f24541OooO00o;
        if (tz0Var != null) {
            return tz0Var;
        }
        synchronized (tz0.class) {
            try {
                tz0 tz0Var2 = f24541OooO00o;
                if (tz0Var2 != null) {
                    return tz0Var2;
                }
                a11 a11Var = a11.f16875OooO0OO;
                tz0 tz0VarOooO0O0 = wz0.OooO0O0();
                f24541OooO00o = tz0VarOooO0O0;
                return tz0VarOooO0O0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
