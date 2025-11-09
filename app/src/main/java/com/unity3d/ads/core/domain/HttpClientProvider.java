package com.unity3d.ads.core.domain;

import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public interface HttpClientProvider {

    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(HttpClientProvider httpClientProvider, Boolean bool, OooO0OO oooO0OO, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 1) != 0) {
                bool = Boolean.FALSE;
            }
            return httpClientProvider.invoke(bool, oooO0OO);
        }
    }

    Object invoke(Boolean bool, OooO0OO oooO0OO);
}
