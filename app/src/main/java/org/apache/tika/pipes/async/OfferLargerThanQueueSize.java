package org.apache.tika.pipes.async;

import OooO0oO.OooOo;

/* loaded from: classes3.dex */
public class OfferLargerThanQueueSize extends IllegalArgumentException {
    private final int queueSize;
    private final int sizeOffered;

    public OfferLargerThanQueueSize(int i, int i2) {
        this.sizeOffered = i;
        this.queueSize = i2;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return OooOo.OooO("sizeOffered (", this.sizeOffered, ") is greater than queue size (", this.queueSize, ")");
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public int getSizeOffered() {
        return this.sizeOffered;
    }
}
