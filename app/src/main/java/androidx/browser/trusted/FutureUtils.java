package androidx.browser.trusted;

import androidx.concurrent.futures.ResolvableFuture;
import o00000oO.OooOOO;

/* loaded from: classes.dex */
class FutureUtils {
    private FutureUtils() {
    }

    public static <T> OooOOO immediateFailedFuture(Throwable th) {
        ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        resolvableFutureCreate.setException(th);
        return resolvableFutureCreate;
    }
}
