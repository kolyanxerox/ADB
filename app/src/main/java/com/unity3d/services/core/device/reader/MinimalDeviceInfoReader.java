package com.unity3d.services.core.device.reader;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.ironsource.C3451ne;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MinimalDeviceInfoReader implements IDeviceInfoReader {
    final IGameSessionIdReader _gameSessionIdReader;

    public MinimalDeviceInfoReader(IGameSessionIdReader iGameSessionIdReader) {
        this._gameSessionIdReader = iGameSessionIdReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        HashMap mapOooOOo = OooO00o.OooOOo(C3451ne.f10417G, "android");
        mapOooOOo.put("sdkVersion", Integer.valueOf(SdkProperties.getVersionCode()));
        mapOooOOo.put("sdkVersionName", SdkProperties.getVersionName());
        mapOooOOo.put("idfi", Device.getIdfi());
        mapOooOOo.put(JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this._gameSessionIdReader.getGameSessionIdAndStore());
        mapOooOOo.put("ts", Long.valueOf(System.currentTimeMillis()));
        mapOooOOo.put(AndroidGetAdPlayerContext.KEY_GAME_ID, ClientProperties.getGameId());
        return mapOooOOo;
    }
}
