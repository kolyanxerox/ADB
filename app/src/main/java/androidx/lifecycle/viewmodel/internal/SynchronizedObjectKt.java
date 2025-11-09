package androidx.lifecycle.viewmodel.internal;

import kotlin.jvm.internal.OooOo;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class SynchronizedObjectKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m13534synchronized(SynchronizedObject lock, OooO0O0 action) {
        T t;
        OooOo.OooO0o0(lock, "lock");
        OooOo.OooO0o0(action, "action");
        synchronized (lock) {
            t = (T) action.invoke();
        }
        return t;
    }
}
