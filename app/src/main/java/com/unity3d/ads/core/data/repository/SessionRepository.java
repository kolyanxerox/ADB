package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import gatewayprotocol.p014v1.InitializationResponseOuterClass;
import gatewayprotocol.p014v1.NativeConfigurationOuterClass;
import gatewayprotocol.p014v1.SessionCountersOuterClass;
import java.util.List;
import o00O0O0O.OooO0OO;
import o00O0ooo.o0OOO0OO;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes3.dex */
public interface SessionRepository {
    void addTimeToGlobalAdsFocusTime(int i);

    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    String getGameId();

    Object getGatewayCache(OooO0OO oooO0OO);

    ByteString getGatewayState();

    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    InitializationState getInitializationState();

    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    o0OoOoOo getObserveInitializationState();

    o0OOO0OO getOnChange();

    Object getPrivacy(OooO0OO oooO0OO);

    Object getPrivacyFsm(OooO0OO oooO0OO);

    List<InitializationResponseOuterClass.AdFormat> getScarEligibleFormats();

    SessionCountersOuterClass.SessionCounters getSessionCounters();

    ByteString getSessionId();

    ByteString getSessionToken();

    boolean getShouldInitialize();

    TokenCounters getTokenCounters();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementFocusChangeCount();

    void incrementGlobalAdsFocusChangeCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    Object persistNativeConfiguration(OooO0OO oooO0OO);

    void resetTokenCounters();

    void setGameId(String str);

    Object setGatewayCache(ByteString byteString, OooO0OO oooO0OO);

    void setGatewayState(ByteString byteString);

    void setGatewayUrl(String str);

    void setInitializationState(InitializationState initializationState);

    void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    Object setPrivacy(ByteString byteString, OooO0OO oooO0OO);

    Object setPrivacyFsm(ByteString byteString, OooO0OO oooO0OO);

    void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(ByteString byteString);

    void setShouldInitialize(boolean z);

    void setTokenCounters(TokenCounters tokenCounters);
}
