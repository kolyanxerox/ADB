package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.OooOO0O;
import o00O0.Oooo000;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class SharedPreferencesMigrationKt {
    private static final Set<String> MIGRATE_ALL_KEYS = new LinkedHashSet();

    @OooO(m13471c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", m13472f = "SharedPreferencesMigration.android.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1 */
    public static final class C03431 extends OooOOOO implements o00Oo0 {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C03431(OooO0OO oooO0OO) {
            super(3, oooO0OO);
        }

        @Override // o00O0Oo.o00Oo0
        public final Object invoke(SharedPreferencesView sharedPreferencesView, Preferences preferences, OooO0OO oooO0OO) {
            C03431 c03431 = new C03431(oooO0OO);
            c03431.L$0 = sharedPreferencesView;
            c03431.L$1 = preferences;
            return c03431.invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            SharedPreferencesView sharedPreferencesView = (SharedPreferencesView) this.L$0;
            Preferences preferences = (Preferences) this.L$1;
            Set<Preferences.Key<?>> setKeySet = preferences.asMap().keySet();
            ArrayList arrayList = new ArrayList(Oooo000.OooOo0(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((Preferences.Key) it.next()).getName());
            }
            Map<String, Object> all = sharedPreferencesView.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : all.entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            MutablePreferences mutablePreferences = preferences.toMutablePreferences();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    mutablePreferences.set(PreferencesKeys.booleanKey(str), value);
                } else if (value instanceof Float) {
                    mutablePreferences.set(PreferencesKeys.floatKey(str), value);
                } else if (value instanceof Integer) {
                    mutablePreferences.set(PreferencesKeys.intKey(str), value);
                } else if (value instanceof Long) {
                    mutablePreferences.set(PreferencesKeys.longKey(str), value);
                } else if (value instanceof String) {
                    mutablePreferences.set(PreferencesKeys.stringKey(str), value);
                } else if (value instanceof Set) {
                    Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(str);
                    kotlin.jvm.internal.OooOo.OooO0OO(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    mutablePreferences.set(keyStringSetKey, (Set) value);
                }
            }
            return mutablePreferences.toPreferences();
        }
    }

    @OooO(m13471c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", m13472f = "SharedPreferencesMigration.android.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1 */
    public static final class C03441 extends OooOOOO implements o00O0O {
        final /* synthetic */ Set<String> $keysToMigrate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03441(Set<String> set, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$keysToMigrate = set;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C03441 c03441 = new C03441(this.$keysToMigrate, oooO0OO);
            c03441.L$0 = obj;
            return c03441;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(Preferences preferences, OooO0OO oooO0OO) {
            return ((C03441) create(preferences, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            Set<Preferences.Key<?>> setKeySet = ((Preferences) this.L$0).asMap().keySet();
            ArrayList arrayList = new ArrayList(Oooo000.OooOo0(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((Preferences.Key) it.next()).getName());
            }
            boolean z = true;
            if (this.$keysToMigrate != SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS()) {
                Set<String> set = this.$keysToMigrate;
                if (set == null || !set.isEmpty()) {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                            break;
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(Context context, String sharedPreferencesName) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(sharedPreferencesName, "sharedPreferencesName");
        return SharedPreferencesMigration$default(context, sharedPreferencesName, null, 4, null);
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(OooO0O0 oooO0O0, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(oooO0O0, (Set<String>) set);
    }

    public static final Set<String> getMIGRATE_ALL_KEYS() {
        return MIGRATE_ALL_KEYS;
    }

    private static final o00Oo0 getMigrationFunction() {
        return new C03431(null);
    }

    private static final o00O0O getShouldRunMigration(Set<String> set) {
        return new C03441(set, null);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(OooO0O0 produceSharedPreferences) {
        kotlin.jvm.internal.OooOo.OooO0o0(produceSharedPreferences, "produceSharedPreferences");
        return SharedPreferencesMigration$default(produceSharedPreferences, null, 2, null);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(OooO0O0 produceSharedPreferences, Set<String> keysToMigrate) {
        kotlin.jvm.internal.OooOo.OooO0o0(produceSharedPreferences, "produceSharedPreferences");
        kotlin.jvm.internal.OooOo.OooO0o0(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new SharedPreferencesMigration<>(produceSharedPreferences, (Set) null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 2, (OooOO0O) null);
        }
        return new SharedPreferencesMigration<>(produceSharedPreferences, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(Context context, String str, Set set, int i, Object obj) {
        if ((i & 4) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(context, str, set);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(Context context, String sharedPreferencesName, Set<String> keysToMigrate) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.OooOo.OooO0o0(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new SharedPreferencesMigration<>(context, sharedPreferencesName, null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 4, null);
        }
        return new SharedPreferencesMigration<>(context, sharedPreferencesName, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }
}
