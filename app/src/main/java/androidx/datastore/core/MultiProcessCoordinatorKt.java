package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooOOO0;

/* loaded from: classes.dex */
public final class MultiProcessCoordinatorKt {
    public static final InterProcessCoordinator createMultiProcessCoordinator(OooOOO0 context, File file) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(file, "file");
        return new MultiProcessCoordinator(context, file);
    }
}
