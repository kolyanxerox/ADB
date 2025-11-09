package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: classes2.dex */
public interface o0000 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(o0000oo o0000ooVar);

    void getAppInstanceId(o0000oo o0000ooVar);

    void getCachedAppInstanceId(o0000oo o0000ooVar);

    void getConditionalUserProperties(String str, String str2, o0000oo o0000ooVar);

    void getCurrentScreenClass(o0000oo o0000ooVar);

    void getCurrentScreenName(o0000oo o0000ooVar);

    void getGmpAppId(o0000oo o0000ooVar);

    void getMaxUserProperties(String str, o0000oo o0000ooVar);

    void getSessionId(o0000oo o0000ooVar);

    void getTestFlag(o0000oo o0000ooVar, int i);

    void getUserProperties(String str, String str2, boolean z, o0000oo o0000ooVar);

    void initForTests(Map map);

    void initialize(Oooo0o.OooO0O0 oooO0O0, o000O0o o000o0o2, long j);

    void isDataCollectionEnabled(o0000oo o0000ooVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, o0000oo o0000ooVar, long j);

    void logHealthData(int i, String str, Oooo0o.OooO0O0 oooO0O0, Oooo0o.OooO0O0 oooO0O02, Oooo0o.OooO0O0 oooO0O03);

    void onActivityCreated(Oooo0o.OooO0O0 oooO0O0, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(o000O00 o000o002, Bundle bundle, long j);

    void onActivityDestroyed(Oooo0o.OooO0O0 oooO0O0, long j);

    void onActivityDestroyedByScionActivityInfo(o000O00 o000o002, long j);

    void onActivityPaused(Oooo0o.OooO0O0 oooO0O0, long j);

    void onActivityPausedByScionActivityInfo(o000O00 o000o002, long j);

    void onActivityResumed(Oooo0o.OooO0O0 oooO0O0, long j);

    void onActivityResumedByScionActivityInfo(o000O00 o000o002, long j);

    void onActivitySaveInstanceState(Oooo0o.OooO0O0 oooO0O0, o0000oo o0000ooVar, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(o000O00 o000o002, o0000oo o0000ooVar, long j);

    void onActivityStarted(Oooo0o.OooO0O0 oooO0O0, long j);

    void onActivityStartedByScionActivityInfo(o000O00 o000o002, long j);

    void onActivityStopped(Oooo0o.OooO0O0 oooO0O0, long j);

    void onActivityStoppedByScionActivityInfo(o000O00 o000o002, long j);

    void performAction(Bundle bundle, o0000oo o0000ooVar, long j);

    void registerOnMeasurementEventListener(o0000OO0 o0000oo02);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(o0000O0O o0000o0o2);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(Oooo0o.OooO0O0 oooO0O0, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(o000O00 o000o002, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(o0000OO0 o0000oo02);

    void setInstanceIdProvider(o000O000 o000o0002);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, Oooo0o.OooO0O0 oooO0O0, boolean z, long j);

    void unregisterOnMeasurementEventListener(o0000OO0 o0000oo02);
}
