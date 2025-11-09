package com.unity3d.services;

import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooO0OO;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", m13472f = "UnityAdsSDK.kt", m13473l = {171}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UnityAdsSDK$fetchToken$token$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ OooO0OO $getHeaderBiddingToken$delegate;
    final /* synthetic */ OooO0OO $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$fetchToken$token$1(OooO0OO oooO0OO, OooO0OO oooO0OO2, o00O0O0O.OooO0OO oooO0OO3) {
        super(2, oooO0OO3);
        this.$getHeaderBiddingToken$delegate = oooO0OO;
        this.$tokenNumberProvider$delegate = oooO0OO2;
    }

    @Override // o00O0OO0.OooO00o
    public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
        return new UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return obj;
        }
        o000OOo.OooOO0O(obj);
        GetHeaderBiddingToken getHeaderBiddingTokenFetchToken$lambda$10 = UnityAdsSDK.fetchToken$lambda$10(this.$getHeaderBiddingToken$delegate);
        int iInvoke = UnityAdsSDK.fetchToken$lambda$9(this.$tokenNumberProvider$delegate).invoke();
        this.label = 1;
        Object objInvoke$default = GetHeaderBiddingToken.DefaultImpls.invoke$default(getHeaderBiddingTokenFetchToken$lambda$10, iInvoke, null, this, 2, null);
        return objInvoke$default == oooOo00 ? oooOo00 : objInvoke$default;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
        return ((UnityAdsSDK$fetchToken$token$1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
