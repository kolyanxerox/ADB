package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class InterProcessCoordinator_jvmKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(File file) {
        OooOo.OooO0o0(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        OooOo.OooO0Oo(absolutePath, "file.canonicalFile.absolutePath");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(absolutePath);
    }
}
