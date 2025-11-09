package androidx.datastore.core.okio;

import kotlin.jvm.internal.OooOo;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class Synchronizer {
    public final <T> T withLock(OooO0O0 block) {
        T t;
        OooOo.OooO0o0(block, "block");
        synchronized (this) {
            t = (T) block.invoke();
        }
        return t;
    }
}
