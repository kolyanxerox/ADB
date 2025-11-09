package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0.o0O0O00;

/* loaded from: classes.dex */
public abstract class Preferences {

    public static final class Key<T> {
        private final String name;

        public Key(String name) {
            OooOo.OooO0o0(name, "name");
            this.name = name;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                return OooOo.OooO00o(this.name, ((Key) obj).name);
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        /* renamed from: to */
        public final Pair<T> m23to(T t) {
            return new Pair<>(this, t);
        }

        public String toString() {
            return this.name;
        }
    }

    public static final class Pair<T> {
        private final Key<T> key;
        private final T value;

        public Pair(Key<T> key, T t) {
            OooOo.OooO0o0(key, "key");
            this.key = key;
            this.value = t;
        }

        public final Key<T> getKey$datastore_preferences_core() {
            return this.key;
        }

        public final T getValue$datastore_preferences_core() {
            return this.value;
        }
    }

    public abstract Map<Key<?>, Object> asMap();

    public abstract <T> boolean contains(Key<T> key);

    public abstract <T> T get(Key<T> key);

    public final MutablePreferences toMutablePreferences() {
        return new MutablePreferences(o0O0O00.OooOoO0(asMap()), false);
    }

    public final Preferences toPreferences() {
        return new MutablePreferences(o0O0O00.OooOoO0(asMap()), true);
    }
}
