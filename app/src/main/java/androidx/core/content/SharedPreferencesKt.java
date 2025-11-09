package androidx.core.content;

import android.content.SharedPreferences;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final class SharedPreferencesKt {
    public static final void edit(SharedPreferences sharedPreferences, boolean z, Oooo000 oooo000) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        oooo000.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, Oooo000 oooo000, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        oooo000.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
