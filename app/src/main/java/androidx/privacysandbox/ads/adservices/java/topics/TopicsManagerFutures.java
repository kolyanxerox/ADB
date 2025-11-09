package androidx.privacysandbox.ads.adservices.java.topics;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00000oO.OooOOO;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00OO000.Oooo0;
import o00OO00o.OooO;

/* loaded from: classes.dex */
public abstract class TopicsManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class CommonApiJavaImpl extends TopicsManagerFutures {
        private final TopicsManager mTopicsManager;

        public CommonApiJavaImpl(TopicsManager mTopicsManager) {
            OooOo.OooO0o0(mTopicsManager, "mTopicsManager");
            this.mTopicsManager = mTopicsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        public OooOOO getTopicsAsync(GetTopicsRequest request) {
            OooOo.OooO0o0(request, "request");
            OooO oooO = o000O0O0.f31514OooO00o;
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(Oooo0.f31951OooO00o), new TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1(this, request, null)), null, 1, null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final TopicsManagerFutures from(Context context) {
            OooOo.OooO0o0(context, "context");
            TopicsManager topicsManagerObtain = TopicsManager.Companion.obtain(context);
            if (topicsManagerObtain != null) {
                return new CommonApiJavaImpl(topicsManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final TopicsManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract OooOOO getTopicsAsync(GetTopicsRequest getTopicsRequest);
}
