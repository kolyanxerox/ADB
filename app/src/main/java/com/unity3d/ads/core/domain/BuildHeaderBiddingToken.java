package com.unity3d.ads.core.domain;

import com.unity3d.ads.TokenConfiguration;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public interface BuildHeaderBiddingToken {

    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(BuildHeaderBiddingToken buildHeaderBiddingToken, int i, TokenConfiguration tokenConfiguration, boolean z, OooO0OO oooO0OO, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i2 & 2) != 0) {
                tokenConfiguration = null;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            return buildHeaderBiddingToken.invoke(i, tokenConfiguration, z, oooO0OO);
        }
    }

    Object invoke(int i, TokenConfiguration tokenConfiguration, boolean z, OooO0OO oooO0OO);
}
