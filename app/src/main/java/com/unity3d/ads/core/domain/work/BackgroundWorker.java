package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class BackgroundWorker {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "UnityAdsBackgroundWorker";
    private final WorkManager workManager;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    public BackgroundWorker(Context applicationContext) {
        OooOo.OooO0o0(applicationContext, "applicationContext");
        WorkManager workManager = WorkManager.getInstance(applicationContext);
        OooOo.OooO0Oo(workManager, "getInstance(applicationContext)");
        this.workManager = workManager;
    }

    public final WorkManager getWorkManager() {
        return this.workManager;
    }

    public final <T extends UniversalRequestJob> void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        OooOo.OooO0o0(universalRequestWorkerData, "universalRequestWorkerData");
        OooOo.OooO0Oo(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build(), "Builder()\n            .s…TED)\n            .build()");
        OooOo.OooOO0O();
        throw null;
    }
}
