package androidx.core.os;

import android.os.Trace;

/* loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(String str, o00O0Oo.OooO0O0 oooO0O0) {
        Trace.beginSection(str);
        try {
            return (T) oooO0O0.invoke();
        } finally {
            Trace.endSection();
        }
    }
}
