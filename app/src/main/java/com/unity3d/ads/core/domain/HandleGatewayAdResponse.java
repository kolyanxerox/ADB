package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import gatewayprotocol.p014v1.AdResponseOuterClass;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public interface HandleGatewayAdResponse {
    Object invoke(UnityAdsLoadOptions unityAdsLoadOptions, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Context context, String str, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, OooO0OO oooO0OO);
}
