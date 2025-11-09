package androidx.core.util;

import o00O0O0O.OooO0OO;

/* loaded from: classes.dex */
public final class ConsumerKt {
    public static final <T> java.util.function.Consumer<T> asConsumer(OooO0OO oooO0OO) {
        return new ContinuationConsumer(oooO0OO);
    }
}
