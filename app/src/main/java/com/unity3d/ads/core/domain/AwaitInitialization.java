package com.unity3d.ads.core.domain;

import androidx.core.location.LocationRequestCompat;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public interface AwaitInitialization {

    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(AwaitInitialization awaitInitialization, long j, OooO0OO oooO0OO, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 1) != 0) {
                j = LocationRequestCompat.PASSIVE_INTERVAL;
            }
            return awaitInitialization.invoke(j, oooO0OO);
        }
    }

    Object invoke(long j, OooO0OO oooO0OO);
}
