package androidx.collection.internal;

import kotlin.jvm.internal.OooOo;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class LockExtKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m13508synchronized(Lock lock, OooO0O0 block) {
        T t;
        OooOo.OooO0o0(lock, "<this>");
        OooOo.OooO0o0(block, "block");
        synchronized (lock) {
            t = (T) block.invoke();
        }
        return t;
    }
}
