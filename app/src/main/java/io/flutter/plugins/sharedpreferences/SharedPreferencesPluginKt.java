package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.OooO0o;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o00O0O;
import kotlin.jvm.internal.o0OO00O;
import o00O0o00.OooOOO;
import o00O0o0o.o00000O;
import o00O0oO.o0000O00;

/* loaded from: classes3.dex */
public final class SharedPreferencesPluginKt {
    static final /* synthetic */ o00000O[] $$delegatedProperties;
    public static final String DOUBLE_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu";
    public static final String JSON_LIST_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!";
    public static final String LIST_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
    public static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
    public static final String TAG = "SharedPreferencesPlugin";
    private static final OooOOO sharedPreferencesDataStore$delegate;

    static {
        o00O0O o00o0o = new o00O0O(OooO0o.NO_RECEIVER, SharedPreferencesPluginKt.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        o0OO00O.f28878OooO00o.getClass();
        $$delegatedProperties = new o00000O[]{o00o0o};
        sharedPreferencesDataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default(SHARED_PREFERENCES_NAME, null, null, null, 14, null);
    }

    public static final DataStore<Preferences> getSharedPreferencesDataStore(Context context) {
        OooOo.OooO0o0(context, "<this>");
        return (DataStore) sharedPreferencesDataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }

    public static final boolean preferencesFilter(String key, Object obj, Set<String> set) {
        OooOo.OooO0o0(key, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(key);
    }

    public static final Object transformPref(Object obj, SharedPreferencesListEncoder listEncoder) {
        OooOo.OooO0o0(listEncoder, "listEncoder");
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!o0000O00.Oooo0OO(str, LIST_PREFIX, false)) {
            if (!o0000O00.Oooo0OO(str, DOUBLE_PREFIX, false)) {
                return obj;
            }
            String strSubstring = str.substring(40);
            OooOo.OooO0Oo(strSubstring, "substring(...)");
            return Double.valueOf(Double.parseDouble(strSubstring));
        }
        if (o0000O00.Oooo0OO(str, JSON_LIST_PREFIX, false)) {
            return obj;
        }
        String strSubstring2 = str.substring(40);
        OooOo.OooO0Oo(strSubstring2, "substring(...)");
        List<String> listDecode = listEncoder.decode(strSubstring2);
        OooOo.OooO0O0(listDecode);
        return listDecode;
    }
}
