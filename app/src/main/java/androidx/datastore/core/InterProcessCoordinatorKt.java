package androidx.datastore.core;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class InterProcessCoordinatorKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(String filePath) {
        OooOo.OooO0o0(filePath, "filePath");
        return new SingleProcessCoordinator(filePath);
    }
}
