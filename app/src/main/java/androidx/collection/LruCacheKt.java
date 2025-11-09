package androidx.collection;

import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Ooo;

/* loaded from: classes.dex */
public final class LruCacheKt {

    /* renamed from: androidx.collection.LruCacheKt$lruCache$1 */
    public static final class C01511 extends Oooo000 implements o00O0O {
        public static final C01511 INSTANCE = new C01511();

        public C01511() {
            super(2);
        }

        @Override // o00O0Oo.o00O0O
        public final Integer invoke(Object obj, Object obj2) {
            OooOo.OooO0o0(obj, "<anonymous parameter 0>");
            OooOo.OooO0o0(obj2, "<anonymous parameter 1>");
            return 1;
        }
    }

    /* renamed from: androidx.collection.LruCacheKt$lruCache$2 */
    public static final class C01522 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C01522 INSTANCE = new C01522();

        public C01522() {
            super(1);
        }

        @Override // o00O0Oo.Oooo000
        public final Object invoke(Object it) {
            OooOo.OooO0o0(it, "it");
            return null;
        }
    }

    /* renamed from: androidx.collection.LruCacheKt$lruCache$3 */
    public static final class C01533 extends Oooo000 implements o00Ooo {
        public static final C01533 INSTANCE = new C01533();

        public C01533() {
            super(4);
        }

        public final void invoke(boolean z, Object obj, Object obj2, Object obj3) {
            OooOo.OooO0o0(obj, "<anonymous parameter 1>");
            OooOo.OooO0o0(obj2, "<anonymous parameter 2>");
        }

        @Override // o00O0Oo.o00Ooo
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke(((Boolean) obj).booleanValue(), obj2, obj3, obj4);
            return oo00o.OooOo.f33195OooO00o;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: androidx.collection.LruCacheKt$lruCache$4 */
    public static final class C01544<K, V> extends LruCache<K, V> {
        final /* synthetic */ o00O0Oo.Oooo000 $create;
        final /* synthetic */ o00Ooo $onEntryRemoved;
        final /* synthetic */ o00O0O $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01544(int i, o00O0O o00o0o, o00O0Oo.Oooo000 oooo000, o00Ooo o00ooo2) {
            super(i);
            this.$sizeOf = o00o0o;
            this.$create = oooo000;
            this.$onEntryRemoved = o00ooo2;
        }

        @Override // androidx.collection.LruCache
        public V create(K key) {
            OooOo.OooO0o0(key, "key");
            return (V) this.$create.invoke(key);
        }

        @Override // androidx.collection.LruCache
        public void entryRemoved(boolean z, K key, V oldValue, V v) {
            OooOo.OooO0o0(key, "key");
            OooOo.OooO0o0(oldValue, "oldValue");
            this.$onEntryRemoved.invoke(Boolean.valueOf(z), key, oldValue, v);
        }

        @Override // androidx.collection.LruCache
        public int sizeOf(K key, V value) {
            OooOo.OooO0o0(key, "key");
            OooOo.OooO0o0(value, "value");
            return ((Number) this.$sizeOf.invoke(key, value)).intValue();
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i, o00O0O sizeOf, o00O0Oo.Oooo000 create, o00Ooo onEntryRemoved) {
        OooOo.OooO0o0(sizeOf, "sizeOf");
        OooOo.OooO0o0(create, "create");
        OooOo.OooO0o0(onEntryRemoved, "onEntryRemoved");
        return new C01544(i, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, o00O0O sizeOf, o00O0Oo.Oooo000 create, o00Ooo onEntryRemoved, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            sizeOf = C01511.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            create = C01522.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            onEntryRemoved = C01533.INSTANCE;
        }
        OooOo.OooO0o0(sizeOf, "sizeOf");
        OooOo.OooO0o0(create, "create");
        OooOo.OooO0o0(onEntryRemoved, "onEntryRemoved");
        return new C01544(i, sizeOf, create, onEntryRemoved);
    }
}
