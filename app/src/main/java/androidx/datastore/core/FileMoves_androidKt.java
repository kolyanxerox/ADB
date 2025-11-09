package androidx.datastore.core;

import android.os.Build;
import java.io.File;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class FileMoves_androidKt {
    public static final boolean atomicMoveTo(File file, File toFile) {
        OooOo.OooO0o0(file, "<this>");
        OooOo.OooO0o0(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.INSTANCE.move(file, toFile) : file.renameTo(toFile);
    }
}
