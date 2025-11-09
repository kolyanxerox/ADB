package androidx.privacysandbox.ads.adservices.java.appsetid;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00000oO.OooOOO;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;

/* loaded from: classes.dex */
public abstract class AppSetIdManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Api33Ext4JavaImpl extends AppSetIdManagerFutures {
        private final AppSetIdManager mAppSetIdManager;

        public Api33Ext4JavaImpl(AppSetIdManager mAppSetIdManager) {
            OooOo.OooO0o0(mAppSetIdManager, "mAppSetIdManager");
            this.mAppSetIdManager = mAppSetIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures
        public OooOOO getAppSetIdAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(o0000OO0.OooO0oO(o0000OO0.OooO0O0(o000O0O0.f31514OooO00o), new AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1(this, null)), null, 1, null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final AppSetIdManagerFutures from(Context context) {
            OooOo.OooO0o0(context, "context");
            AppSetIdManager appSetIdManagerObtain = AppSetIdManager.Companion.obtain(context);
            if (appSetIdManagerObtain != null) {
                return new Api33Ext4JavaImpl(appSetIdManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final AppSetIdManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract OooOOO getAppSetIdAsync();
}
