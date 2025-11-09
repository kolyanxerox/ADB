package com.unity3d.ads.core.data.repository;

import gatewayprotocol.p014v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.p014v1.PiiOuterClass;
import gatewayprotocol.p014v1.StaticDeviceInfoOuterClass;
import java.util.List;
import o00O0O0O.OooO0OO;
import o00O0ooo.o0OO;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes3.dex */
public interface DeviceInfoRepository {
    StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    o0OO getAllowedPii();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuidByteString(OooO0OO oooO0OO);

    Object getAuidString(OooO0OO oooO0OO);

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    boolean getHasInternet();

    Object getIdfi(OooO0OO oooO0OO);

    List<String> getLocaleList();

    String getManufacturer();

    String getModel();

    String getOrientation();

    String getOsVersion();

    PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    long getSystemBootTime();

    o0OoOoOo getVolumeSettingsChange();

    Object staticDeviceInfo(OooO0OO oooO0OO);
}
