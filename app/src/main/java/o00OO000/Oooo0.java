package o00OO000;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import o00O0oo0.o0OO00O;
import o00O0oo0.o0Oo0oo;

/* loaded from: classes3.dex */
public abstract class Oooo0 {

    /* renamed from: OooO00o */
    public static final o0Oo0oo f31951OooO00o;

    static {
        String property;
        int i = o00oO0o.f31965OooO00o;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = o00O0o.o0OoOo0.Oooo0oo(o00O0o.o0OoOo0.Oooo0(Arrays.asList(new o00O0oo0.o0ooOOo()).iterator())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((o00O0oo0.o0ooOOo) next).getClass();
                    do {
                        ((o00O0oo0.o0ooOOo) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((o00O0oo0.o0ooOOo) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            f31951OooO00o = new o0Oo0oo(o0OO00O.OooO00o(mainLooper), false);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
