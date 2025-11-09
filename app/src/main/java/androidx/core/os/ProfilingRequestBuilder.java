package androidx.core.os;

import android.os.Bundle;
import androidx.core.os.ProfilingRequestBuilder;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public abstract class ProfilingRequestBuilder<T extends ProfilingRequestBuilder<T>> {
    private android.os.CancellationSignal mCancellationSignal;
    private String mTag;

    public final ProfilingRequest build() {
        return new ProfilingRequest(getProfilingType(), getParams(), this.mTag, this.mCancellationSignal);
    }

    public abstract Bundle getParams();

    public abstract int getProfilingType();

    public abstract T getThis();

    public final T setCancellationSignal(android.os.CancellationSignal cancellationSignal) {
        OooOo.OooO0o0(cancellationSignal, "cancellationSignal");
        this.mCancellationSignal = cancellationSignal;
        return (T) getThis();
    }

    public final T setTag(String tag) {
        OooOo.OooO0o0(tag, "tag");
        this.mTag = tag;
        return (T) getThis();
    }
}
