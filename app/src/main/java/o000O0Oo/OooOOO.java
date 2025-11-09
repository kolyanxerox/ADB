package o000O0oO;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.io.Serializable;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public abstract class OooOOO {
    public static final Object OooO00o(MutablePreferences mutablePreferences, Preferences.Key key, Serializable serializable) {
        OooOo.OooO0o0(mutablePreferences, "<this>");
        OooOo.OooO0o0(key, "key");
        Object obj = mutablePreferences.get(key);
        return obj == null ? serializable : obj;
    }
}
