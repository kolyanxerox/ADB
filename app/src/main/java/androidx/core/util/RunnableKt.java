package androidx.core.util;

import o00O0O0O.OooO0OO;

/* loaded from: classes.dex */
public final class RunnableKt {
    public static final Runnable asRunnable(OooO0OO oooO0OO) {
        return new ContinuationRunnable(oooO0OO);
    }
}
