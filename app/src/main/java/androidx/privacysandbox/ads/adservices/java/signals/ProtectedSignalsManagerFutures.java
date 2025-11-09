package androidx.privacysandbox.ads.adservices.java.signals;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager;
import androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00000oO.OooOOO;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;

/* loaded from: classes.dex */
public abstract class ProtectedSignalsManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final ProtectedSignalsManagerFutures from(Context context) {
            OooOo.OooO0o0(context, "context");
            ProtectedSignalsManager protectedSignalsManagerObtain = ProtectedSignalsManager.Companion.obtain(context);
            if (protectedSignalsManagerObtain != null) {
                return new JavaImpl(protectedSignalsManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final class JavaImpl extends ProtectedSignalsManagerFutures {
        private final ProtectedSignalsManager mProtectedSignalsManager;

        public JavaImpl(ProtectedSignalsManager protectedSignalsManager) {
            this.mProtectedSignalsManager = protectedSignalsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures
        public OooOOO updateSignalsAsync(UpdateSignalsRequest request) {
            OooOo.OooO0o0(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1(this, request, null)), null, 1, null);
        }
    }

    public static final ProtectedSignalsManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract OooOOO updateSignalsAsync(UpdateSignalsRequest updateSignalsRequest);
}
