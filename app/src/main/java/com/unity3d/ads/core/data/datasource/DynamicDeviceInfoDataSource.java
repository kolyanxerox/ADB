package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.p014v1.DynamicDeviceInfoOuterClass;
import java.util.List;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes3.dex */
public interface DynamicDeviceInfoDataSource {
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch();

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    List<String> getLocaleList();

    String getOrientation();

    int getRingerMode();

    o0OoOoOo getVolumeSettingsChange();

    boolean hasInternet();
}
