package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.p014v1.StaticDeviceInfoOuterClass;
import java.util.List;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public interface StaticDeviceInfoDataSource {
    Object fetch(List<String> list, OooO0OO oooO0OO);

    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuid(OooO0OO oooO0OO);

    Object getIdfi(OooO0OO oooO0OO);

    String getManufacturer();

    String getModel();

    String getOsVersion();

    long getSystemBootTime();
}
