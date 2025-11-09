package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOo00;
import o00O0.o0O0O00;

/* loaded from: classes.dex */
public final class SharedPreferencesView {
    private final Set<String> keySet;
    private final SharedPreferences prefs;

    public SharedPreferencesView(SharedPreferences prefs, Set<String> set) {
        OooOo.OooO0o0(prefs, "prefs");
        this.prefs = prefs;
        this.keySet = set;
    }

    private final String checkKey(String str) {
        Set<String> set = this.keySet;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(OooO0oO.OooOo.OooOO0("Can't access key outside migration: ", str).toString());
    }

    public static /* synthetic */ String getString$default(SharedPreferencesView sharedPreferencesView, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return sharedPreferencesView.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(SharedPreferencesView sharedPreferencesView, String str, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        return sharedPreferencesView.getStringSet(str, set);
    }

    public final boolean contains(String key) {
        OooOo.OooO0o0(key, "key");
        return this.prefs.contains(checkKey(key));
    }

    public final Map<String, Object> getAll() {
        Map<String, ?> all = this.prefs.getAll();
        OooOo.OooO0Oo(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.keySet;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(o0O0O00.OooOOOO(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = OooOo00.Oooo0oo((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean getBoolean(String key, boolean z) {
        OooOo.OooO0o0(key, "key");
        return this.prefs.getBoolean(checkKey(key), z);
    }

    public final float getFloat(String key, float f) {
        OooOo.OooO0o0(key, "key");
        return this.prefs.getFloat(checkKey(key), f);
    }

    public final int getInt(String key, int i) {
        OooOo.OooO0o0(key, "key");
        return this.prefs.getInt(checkKey(key), i);
    }

    public final long getLong(String key, long j) {
        OooOo.OooO0o0(key, "key");
        return this.prefs.getLong(checkKey(key), j);
    }

    public final String getString(String key, String str) {
        OooOo.OooO0o0(key, "key");
        return this.prefs.getString(checkKey(key), str);
    }

    public final Set<String> getStringSet(String key, Set<String> set) {
        OooOo.OooO0o0(key, "key");
        Set<String> stringSet = this.prefs.getStringSet(checkKey(key), set);
        if (stringSet != null) {
            return OooOo00.Oooo0oO(stringSet);
        }
        return null;
    }
}
