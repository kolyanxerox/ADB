package androidx.lifecycle.viewmodel.internal;

import kotlin.jvm.internal.OooOo;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class SynchronizedObject_jvmKt {
    public static final <T> T synchronizedImpl(SynchronizedObject lock, OooO0O0 action) {
        T t;
        OooOo.OooO0o0(lock, "lock");
        OooOo.OooO0o0(action, "action");
        synchronized (lock) {
            t = (T) action.invoke();
        }
        return t;
    }
}
