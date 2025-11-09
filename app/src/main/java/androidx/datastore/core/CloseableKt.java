package androidx.datastore.core;

import com.google.android.gms.internal.measurement.o0OO0O0;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final class CloseableKt {
    public static final <T extends Closeable, R> R use(T t, Oooo000 block) throws Throwable {
        OooOo.OooO0o0(t, "<this>");
        OooOo.OooO0o0(block, "block");
        try {
            R r = (R) block.invoke(t);
            try {
                t.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                return r;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                t.close();
            } catch (Throwable th3) {
                o0OO0O0.OooO00o(th2, th3);
            }
            throw th2;
        }
    }
}
