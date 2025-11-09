package com.unity3d.ads.beta;

import android.content.Context;
import com.unity3d.services.core.log.DeviceLog;
import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.o00oO0o;

/* loaded from: classes2.dex */
public final class InitializationConfiguration {
    private final Context context;
    private final Map<String, String> extras;
    private final String gameID;
    private final boolean isTestModeEnabled;
    private final DeviceLog.UnityAdsLogLevel logLevel;
    private final MediationInfo mediationInfo;

    public static final class Builder {
        private final Context context;
        private Map<String, String> extras;
        private final String gameID;
        private final boolean isTestModeEnabled;
        private DeviceLog.UnityAdsLogLevel logLevel;
        private MediationInfo mediationInfo;

        public Builder(Context context, String gameID, boolean z) {
            OooOo.OooO0o0(context, "context");
            OooOo.OooO0o0(gameID, "gameID");
            this.context = context;
            this.gameID = gameID;
            this.isTestModeEnabled = z;
            this.logLevel = DeviceLog.UnityAdsLogLevel.INFO;
            this.extras = o00oO0o.f31247OooOo0O;
        }

        public final InitializationConfiguration build() {
            return new InitializationConfiguration(this.context, this.gameID, this.isTestModeEnabled, this.logLevel, this.extras, this.mediationInfo);
        }

        public final Builder withExtras(Map<String, String> extras) {
            OooOo.OooO0o0(extras, "extras");
            this.extras = extras;
            return this;
        }

        public final Builder withLogLevel(DeviceLog.UnityAdsLogLevel logLevel) {
            OooOo.OooO0o0(logLevel, "logLevel");
            this.logLevel = logLevel;
            return this;
        }

        public final Builder withMediationInfo(MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }
    }

    public InitializationConfiguration(Context context, String gameID, boolean z, DeviceLog.UnityAdsLogLevel logLevel, Map<String, String> extras, MediationInfo mediationInfo) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(gameID, "gameID");
        OooOo.OooO0o0(logLevel, "logLevel");
        OooOo.OooO0o0(extras, "extras");
        this.context = context;
        this.gameID = gameID;
        this.isTestModeEnabled = z;
        this.logLevel = logLevel;
        this.extras = extras;
        this.mediationInfo = mediationInfo;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getGameID() {
        return this.gameID;
    }

    public final DeviceLog.UnityAdsLogLevel getLogLevel() {
        return this.logLevel;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public final boolean isTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    public /* synthetic */ InitializationConfiguration(Context context, String str, boolean z, DeviceLog.UnityAdsLogLevel unityAdsLogLevel, Map map, MediationInfo mediationInfo, int i, OooOO0O oooOO0O) {
        this(context, str, z, (i & 8) != 0 ? DeviceLog.UnityAdsLogLevel.INFO : unityAdsLogLevel, (i & 16) != 0 ? o00oO0o.f31247OooOo0O : map, (i & 32) != 0 ? null : mediationInfo);
    }
}
