package androidx.core.util;

import android.util.LruCache;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Ooo;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class LruCacheKt {

    /* renamed from: androidx.core.util.LruCacheKt$lruCache$1 */
    public static final class C02381 extends Oooo000 implements o00O0O {
        public static final C02381 INSTANCE = new C02381();

        public C02381() {
            super(2);
        }

        @Override // o00O0Oo.o00O0O
        public final Integer invoke(Object obj, Object obj2) {
            return 1;
        }
    }

    /* renamed from: androidx.core.util.LruCacheKt$lruCache$2 */
    public static final class C02392 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C02392 INSTANCE = new C02392();

        public C02392() {
            super(1);
        }

        @Override // o00O0Oo.Oooo000
        public final Object invoke(Object obj) {
            return null;
        }
    }

    /* renamed from: androidx.core.util.LruCacheKt$lruCache$3 */
    public static final class C02403 extends Oooo000 implements o00Ooo {
        public static final C02403 INSTANCE = new C02403();

        public C02403() {
            super(4);
        }

        public final void invoke(boolean z, Object obj, Object obj2, Object obj3) {
        }

        @Override // o00O0Oo.o00Ooo
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke(((Boolean) obj).booleanValue(), obj2, obj3, obj4);
            return OooOo.f33195OooO00o;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: androidx.core.util.LruCacheKt$lruCache$4 */
    public static final class C02414<K, V> extends LruCache<K, V> {
        final /* synthetic */ o00O0Oo.Oooo000 $create;
        final /* synthetic */ o00Ooo $onEntryRemoved;
        final /* synthetic */ o00O0O $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02414(int i, o00O0O o00o0o, o00O0Oo.Oooo000 oooo000, o00Ooo o00ooo2) {
            super(i);
            this.$sizeOf = o00o0o;
            this.$create = oooo000;
            this.$onEntryRemoved = o00ooo2;
        }

        @Override // android.util.LruCache
        public V create(K k) {
            return (V) this.$create.invoke(k);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z, K k, V v, V v2) {
            this.$onEntryRemoved.invoke(Boolean.valueOf(z), k, v, v2);
        }

        @Override // android.util.LruCache
        public int sizeOf(K k, V v) {
            return ((Number) this.$sizeOf.invoke(k, v)).intValue();
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i, o00O0O o00o0o, o00O0Oo.Oooo000 oooo000, o00Ooo o00ooo2) {
        return new C02414(i, o00o0o, oooo000, o00ooo2);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, o00O0O o00o0o, o00O0Oo.Oooo000 oooo000, o00Ooo o00ooo2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            o00o0o = C02381.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            oooo000 = C02392.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            o00ooo2 = C02403.INSTANCE;
        }
        return new C02414(i, o00o0o, oooo000, o00ooo2);
    }
}
