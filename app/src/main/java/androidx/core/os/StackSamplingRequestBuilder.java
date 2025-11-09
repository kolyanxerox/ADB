package androidx.core.os;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class StackSamplingRequestBuilder extends ProfilingRequestBuilder<StackSamplingRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    public Bundle getParams() {
        return this.mParams;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    public int getProfilingType() {
        return 3;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    public StackSamplingRequestBuilder getThis() {
        return this;
    }

    public final StackSamplingRequestBuilder setBufferSizeKb(int i) {
        this.mParams.putInt("KEY_SIZE_KB", i);
        return this;
    }

    public final StackSamplingRequestBuilder setDurationMs(int i) {
        this.mParams.putInt("KEY_DURATION_MS", i);
        return this;
    }

    public final StackSamplingRequestBuilder setSamplingFrequencyHz(int i) {
        this.mParams.putInt("KEY_FREQUENCY_HZ", i);
        return this;
    }
}
