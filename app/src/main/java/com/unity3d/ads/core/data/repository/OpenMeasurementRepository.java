package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OmidOptions;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public interface OpenMeasurementRepository {
    Object activateOM(Context context, OooO0OO oooO0OO);

    Object finishSession(ByteString byteString, OooO0OO oooO0OO);

    OMData getOmData();

    boolean hasSessionFinished(ByteString byteString);

    Object impressionOccurred(ByteString byteString, boolean z, OooO0OO oooO0OO);

    boolean isOMActive();

    void setOMActive(boolean z);

    Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, OooO0OO oooO0OO);
}
