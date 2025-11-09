package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Arrays;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class PreferencesFactory {
    public static final Preferences create(Preferences.Pair<?>... pairs) {
        OooOo.OooO0o0(pairs, "pairs");
        return createMutable((Preferences.Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    public static final Preferences createEmpty() {
        return new MutablePreferences(null, true, true ? 1 : 0, 0 == true ? 1 : 0);
    }

    public static final MutablePreferences createMutable(Preferences.Pair<?>... pairs) {
        OooOo.OooO0o0(pairs, "pairs");
        MutablePreferences mutablePreferences = new MutablePreferences(null, false, 1, 0 == true ? 1 : 0);
        mutablePreferences.putAll((Preferences.Pair[]) Arrays.copyOf(pairs, pairs.length));
        return mutablePreferences;
    }
}
