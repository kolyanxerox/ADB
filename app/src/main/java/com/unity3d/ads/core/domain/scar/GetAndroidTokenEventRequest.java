package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.p014v1.GetTokenEventRequestKt;
import gatewayprotocol.p014v1.GetTokenEventRequestOuterClass;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public final class GetAndroidTokenEventRequest implements GetHbTokenEventRequest {
    @Override // com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest
    public Object invoke(ByteString byteString, BiddingSignals biddingSignals, OooO0OO oooO0OO) {
        GetTokenEventRequestKt.Dsl.Companion companion = GetTokenEventRequestKt.Dsl.Companion;
        GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builderNewBuilder = GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        GetTokenEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setTokenId(byteString);
        String rvSignal = biddingSignals.getRvSignal();
        if (rvSignal != null) {
            dsl_create.setRewarded(ByteStringsKt.toByteStringUtf8(rvSignal));
        }
        String interstitialSignal = biddingSignals.getInterstitialSignal();
        if (interstitialSignal != null) {
            dsl_create.setInterstitial(ByteStringsKt.toByteStringUtf8(interstitialSignal));
        }
        String bannerSignal = biddingSignals.getBannerSignal();
        if (bannerSignal != null) {
            dsl_create.setBanner(ByteStringsKt.toByteStringUtf8(bannerSignal));
        }
        return dsl_create._build();
    }
}
