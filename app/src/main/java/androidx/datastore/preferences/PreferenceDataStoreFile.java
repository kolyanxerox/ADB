package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import java.io.File;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class PreferenceDataStoreFile {
    public static final File preferencesDataStoreFile(Context context, String name) {
        OooOo.OooO0o0(context, "<this>");
        OooOo.OooO0o0(name, "name");
        return DataStoreFile.dataStoreFile(context, name.concat(".preferences_pb"));
    }
}
