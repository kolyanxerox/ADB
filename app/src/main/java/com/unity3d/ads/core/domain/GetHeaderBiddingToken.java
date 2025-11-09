package com.unity3d.ads.core.domain;

import com.unity3d.ads.TokenConfiguration;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public interface GetHeaderBiddingToken {

    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetHeaderBiddingToken getHeaderBiddingToken, int i, TokenConfiguration tokenConfiguration, OooO0OO oooO0OO, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i2 & 2) != 0) {
                tokenConfiguration = null;
            }
            return getHeaderBiddingToken.invoke(i, tokenConfiguration, oooO0OO);
        }
    }

    Object invoke(int i, TokenConfiguration tokenConfiguration, OooO0OO oooO0OO);
}
