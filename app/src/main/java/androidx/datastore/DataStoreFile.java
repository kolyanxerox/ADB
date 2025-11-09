package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class DataStoreFile {
    public static final File dataStoreFile(Context context, String fileName) {
        OooOo.OooO0o0(context, "<this>");
        OooOo.OooO0o0(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }
}
