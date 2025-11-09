package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Oooo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static volatile Oooo0 f28041OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Oooo0 f28042OooO0O0;

    static {
        Oooo0 oooo0 = new Oooo0();
        Map map = Collections.EMPTY_MAP;
        f28042OooO0O0 = oooo0;
    }

    public static Oooo0 OooO00o() {
        Oooo0 oooo0;
        Oooo0 oooo02 = f28041OooO00o;
        if (oooo02 != null) {
            return oooo02;
        }
        synchronized (Oooo0.class) {
            try {
                oooo0 = f28041OooO00o;
                if (oooo0 == null) {
                    Class cls = Oooo000.f28043OooO00o;
                    Oooo0 oooo03 = null;
                    if (cls != null) {
                        try {
                            oooo03 = (Oooo0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    oooo0 = oooo03 != null ? oooo03 : f28042OooO0O0;
                    f28041OooO00o = oooo0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oooo0;
    }
}
