package androidx.core.util;

import o00O0O0O.OooO0OO;

/* loaded from: classes.dex */
public final class AndroidXConsumerKt {
    public static final <T> Consumer<T> asAndroidXConsumer(OooO0OO oooO0OO) {
        return new AndroidXContinuationConsumer(oooO0OO);
    }
}
