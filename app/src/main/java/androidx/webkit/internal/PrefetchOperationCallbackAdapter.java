package androidx.webkit.internal;

import androidx.webkit.OutcomeReceiverCompat;
import androidx.webkit.PrefetchException;
import androidx.webkit.PrefetchNetworkException;
import java.lang.reflect.InvocationHandler;
import o00Oo0oo.oo000o;
import org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface;

/* loaded from: classes.dex */
public class PrefetchOperationCallbackAdapter {
    public static InvocationHandler buildInvocationHandler(final OutcomeReceiverCompat<Void, PrefetchException> outcomeReceiverCompat) {
        return new oo000o(new PrefetchOperationCallbackBoundaryInterface() { // from class: androidx.webkit.internal.PrefetchOperationCallbackAdapter.1
            @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
            public void onFailure(int i, String str, int i2) {
                if (i == 1) {
                    outcomeReceiverCompat.onError(new PrefetchNetworkException(str, i2));
                } else {
                    outcomeReceiverCompat.onError(new PrefetchException(str));
                }
            }

            @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
            public void onSuccess() {
                outcomeReceiverCompat.onResult(null);
            }
        });
    }
}
