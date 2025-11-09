package io.flutter.plugins.firebase.firebaseremoteconfig;

import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class RemoteConfigPigeonSettings {
    public static final Companion Companion = new Companion(null);
    private final long fetchTimeoutSeconds;
    private final long minimumFetchIntervalSeconds;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final RemoteConfigPigeonSettings fromList(List<? extends Object> pigeonVar_list) {
            OooOo.OooO0o0(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj).longValue();
            Object obj2 = pigeonVar_list.get(1);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.Long");
            return new RemoteConfigPigeonSettings(jLongValue, ((Long) obj2).longValue());
        }

        private Companion() {
        }
    }

    public RemoteConfigPigeonSettings(long j, long j2) {
        this.fetchTimeoutSeconds = j;
        this.minimumFetchIntervalSeconds = j2;
    }

    public static /* synthetic */ RemoteConfigPigeonSettings copy$default(RemoteConfigPigeonSettings remoteConfigPigeonSettings, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = remoteConfigPigeonSettings.fetchTimeoutSeconds;
        }
        if ((i & 2) != 0) {
            j2 = remoteConfigPigeonSettings.minimumFetchIntervalSeconds;
        }
        return remoteConfigPigeonSettings.copy(j, j2);
    }

    public final long component1() {
        return this.fetchTimeoutSeconds;
    }

    public final long component2() {
        return this.minimumFetchIntervalSeconds;
    }

    public final RemoteConfigPigeonSettings copy(long j, long j2) {
        return new RemoteConfigPigeonSettings(j, j2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RemoteConfigPigeonSettings)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return GeneratedAndroidFirebaseRemoteConfigPigeonUtils.INSTANCE.deepEquals(toList(), ((RemoteConfigPigeonSettings) obj).toList());
    }

    public final long getFetchTimeoutSeconds() {
        return this.fetchTimeoutSeconds;
    }

    public final long getMinimumFetchIntervalSeconds() {
        return this.minimumFetchIntervalSeconds;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return o00O0.OooOo.OooOOo(Long.valueOf(this.fetchTimeoutSeconds), Long.valueOf(this.minimumFetchIntervalSeconds));
    }

    public String toString() {
        long j = this.fetchTimeoutSeconds;
        return OooO0oO.OooOo.OooOOOO(OooO0oO.OooOo.OooOOo(j, "RemoteConfigPigeonSettings(fetchTimeoutSeconds=", ", minimumFetchIntervalSeconds="), this.minimumFetchIntervalSeconds, ")");
    }
}
