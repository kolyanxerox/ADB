package com.unity3d.ads.gatewayclient;

import androidx.datastore.preferences.protobuf.OooO00o;

/* loaded from: classes3.dex */
public final class RequestPolicy {
    private final int connectTimeout;
    private final int maxDuration;
    private final int overallTimeout;
    private final int readTimeout;
    private final float retryJitterPct;
    private final int retryMaxInterval;
    private final float retryScalingFactor;
    private final int retryWaitBase;
    private final boolean shouldStoreLocally;
    private final int writeTimeout;

    public RequestPolicy(int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, boolean z) {
        this.maxDuration = i;
        this.retryMaxInterval = i2;
        this.retryWaitBase = i3;
        this.retryJitterPct = f;
        this.retryScalingFactor = f2;
        this.connectTimeout = i4;
        this.readTimeout = i5;
        this.writeTimeout = i6;
        this.overallTimeout = i7;
        this.shouldStoreLocally = z;
    }

    public static /* synthetic */ RequestPolicy copy$default(RequestPolicy requestPolicy, int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, boolean z, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = requestPolicy.maxDuration;
        }
        if ((i8 & 2) != 0) {
            i2 = requestPolicy.retryMaxInterval;
        }
        if ((i8 & 4) != 0) {
            i3 = requestPolicy.retryWaitBase;
        }
        if ((i8 & 8) != 0) {
            f = requestPolicy.retryJitterPct;
        }
        if ((i8 & 16) != 0) {
            f2 = requestPolicy.retryScalingFactor;
        }
        if ((i8 & 32) != 0) {
            i4 = requestPolicy.connectTimeout;
        }
        if ((i8 & 64) != 0) {
            i5 = requestPolicy.readTimeout;
        }
        if ((i8 & 128) != 0) {
            i6 = requestPolicy.writeTimeout;
        }
        if ((i8 & 256) != 0) {
            i7 = requestPolicy.overallTimeout;
        }
        if ((i8 & 512) != 0) {
            z = requestPolicy.shouldStoreLocally;
        }
        int i9 = i7;
        boolean z2 = z;
        int i10 = i5;
        int i11 = i6;
        float f3 = f2;
        int i12 = i4;
        return requestPolicy.copy(i, i2, i3, f, f3, i12, i10, i11, i9, z2);
    }

    public final int component1() {
        return this.maxDuration;
    }

    public final boolean component10() {
        return this.shouldStoreLocally;
    }

    public final int component2() {
        return this.retryMaxInterval;
    }

    public final int component3() {
        return this.retryWaitBase;
    }

    public final float component4() {
        return this.retryJitterPct;
    }

    public final float component5() {
        return this.retryScalingFactor;
    }

    public final int component6() {
        return this.connectTimeout;
    }

    public final int component7() {
        return this.readTimeout;
    }

    public final int component8() {
        return this.writeTimeout;
    }

    public final int component9() {
        return this.overallTimeout;
    }

    public final RequestPolicy copy(int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, boolean z) {
        return new RequestPolicy(i, i2, i3, f, f2, i4, i5, i6, i7, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestPolicy)) {
            return false;
        }
        RequestPolicy requestPolicy = (RequestPolicy) obj;
        return this.maxDuration == requestPolicy.maxDuration && this.retryMaxInterval == requestPolicy.retryMaxInterval && this.retryWaitBase == requestPolicy.retryWaitBase && Float.compare(this.retryJitterPct, requestPolicy.retryJitterPct) == 0 && Float.compare(this.retryScalingFactor, requestPolicy.retryScalingFactor) == 0 && this.connectTimeout == requestPolicy.connectTimeout && this.readTimeout == requestPolicy.readTimeout && this.writeTimeout == requestPolicy.writeTimeout && this.overallTimeout == requestPolicy.overallTimeout && this.shouldStoreLocally == requestPolicy.shouldStoreLocally;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getOverallTimeout() {
        return this.overallTimeout;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    public final float getRetryScalingFactor() {
        return this.retryScalingFactor;
    }

    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iOooO00o = OooO00o.OooO00o(this.overallTimeout, OooO00o.OooO00o(this.writeTimeout, OooO00o.OooO00o(this.readTimeout, OooO00o.OooO00o(this.connectTimeout, (Float.hashCode(this.retryScalingFactor) + ((Float.hashCode(this.retryJitterPct) + OooO00o.OooO00o(this.retryWaitBase, OooO00o.OooO00o(this.retryMaxInterval, Integer.hashCode(this.maxDuration) * 31, 31), 31)) * 31)) * 31, 31), 31), 31), 31);
        boolean z = this.shouldStoreLocally;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iOooO00o + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RequestPolicy(maxDuration=");
        sb.append(this.maxDuration);
        sb.append(", retryMaxInterval=");
        sb.append(this.retryMaxInterval);
        sb.append(", retryWaitBase=");
        sb.append(this.retryWaitBase);
        sb.append(", retryJitterPct=");
        sb.append(this.retryJitterPct);
        sb.append(", retryScalingFactor=");
        sb.append(this.retryScalingFactor);
        sb.append(", connectTimeout=");
        sb.append(this.connectTimeout);
        sb.append(", readTimeout=");
        sb.append(this.readTimeout);
        sb.append(", writeTimeout=");
        sb.append(this.writeTimeout);
        sb.append(", overallTimeout=");
        sb.append(this.overallTimeout);
        sb.append(", shouldStoreLocally=");
        return OooO00o.OooOOOO(sb, this.shouldStoreLocally, ')');
    }
}
