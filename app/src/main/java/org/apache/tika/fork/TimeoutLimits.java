package org.apache.tika.fork;

/* loaded from: classes3.dex */
class TimeoutLimits {
    private final long parseTimeoutMS;
    private final long pulseMS;
    private final long waitTimeoutMS;

    public TimeoutLimits(long j, long j2, long j3) {
        this.pulseMS = j;
        this.parseTimeoutMS = j2;
        this.waitTimeoutMS = j3;
    }

    public long getParseTimeoutMS() {
        return this.parseTimeoutMS;
    }

    public long getPulseMS() {
        return this.pulseMS;
    }

    public long getWaitTimeoutMS() {
        return this.waitTimeoutMS;
    }
}
