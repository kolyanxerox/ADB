package com.unity3d.ads.core.domain.work;

import androidx.work.Data;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class UniversalRequestWorkerData {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";
    private final String universalRequestId;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    public UniversalRequestWorkerData(String universalRequestId) {
        OooOo.OooO0o0(universalRequestId, "universalRequestId");
        this.universalRequestId = universalRequestId;
    }

    public final Data invoke() throws Throwable {
        Data dataBuild = new Data.Builder().putString(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId).build();
        OooOo.OooO0Oo(dataBuild, "Builder()\n            .p…tId)\n            .build()");
        return dataBuild;
    }
}
