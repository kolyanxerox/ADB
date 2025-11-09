package androidx.datastore.core;

import kotlin.jvm.internal.OooOO0O;

/* loaded from: classes.dex */
public abstract class State<T> {
    private final int version;

    public /* synthetic */ State(int i, OooOO0O oooOO0O) {
        this(i);
    }

    public final int getVersion() {
        return this.version;
    }

    private State(int i) {
        this.version = i;
    }
}
