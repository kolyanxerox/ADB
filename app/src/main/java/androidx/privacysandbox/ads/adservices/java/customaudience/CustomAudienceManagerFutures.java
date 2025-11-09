package androidx.privacysandbox.ads.adservices.java.customaudience;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager;
import androidx.privacysandbox.ads.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00000oO.OooOOO;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;

/* loaded from: classes.dex */
public abstract class CustomAudienceManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Api33Ext4JavaImpl extends CustomAudienceManagerFutures {
        private final CustomAudienceManager mCustomAudienceManager;

        public Api33Ext4JavaImpl(CustomAudienceManager customAudienceManager) {
            this.mCustomAudienceManager = customAudienceManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        public OooOOO fetchAndJoinCustomAudienceAsync(FetchAndJoinCustomAudienceRequest request) {
            OooOo.OooO0o0(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0634x423c6ecc(this, request, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        public OooOOO joinCustomAudienceAsync(JoinCustomAudienceRequest request) {
            OooOo.OooO0o0(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0635x15d14809(this, request, null)), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        public OooOOO leaveCustomAudienceAsync(LeaveCustomAudienceRequest request) {
            OooOo.OooO0o0(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new C0636x236ea9be(this, request, null)), null, 1, null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final CustomAudienceManagerFutures from(Context context) {
            OooOo.OooO0o0(context, "context");
            CustomAudienceManager customAudienceManagerObtain = CustomAudienceManager.Companion.obtain(context);
            if (customAudienceManagerObtain != null) {
                return new Api33Ext4JavaImpl(customAudienceManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final CustomAudienceManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @ExperimentalFeatures.Ext10OptIn
    public abstract OooOOO fetchAndJoinCustomAudienceAsync(FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest);

    public abstract OooOOO joinCustomAudienceAsync(JoinCustomAudienceRequest joinCustomAudienceRequest);

    public abstract OooOOO leaveCustomAudienceAsync(LeaveCustomAudienceRequest leaveCustomAudienceRequest);
}
