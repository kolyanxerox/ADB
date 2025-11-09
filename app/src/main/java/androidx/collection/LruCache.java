package androidx.collection;

import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import com.ironsource.C3037dc;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final Lock lock;
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i) {
        this.maxSize = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.map = new LruHashMap<>(0, 0.75f);
        this.lock = new Lock();
    }

    private final int safeSizeOf(K k, V v) {
        int iSizeOf = sizeOf(k, v);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + k + C3037dc.f8244T + v).toString());
    }

    public V create(K key) {
        OooOo.OooO0o0(key, "key");
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public void entryRemoved(boolean z, K key, V oldValue, V v) {
        OooOo.OooO0o0(key, "key");
        OooOo.OooO0o0(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public final V get(K key) {
        V v;
        OooOo.OooO0o0(key, "key");
        synchronized (this.lock) {
            V v2 = this.map.get(key);
            if (v2 != null) {
                this.hitCount++;
                return v2;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v = (V) this.map.put(key, vCreate);
                    if (v != null) {
                        this.map.put(key, v);
                    } else {
                        this.size += safeSizeOf(key, vCreate);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v != null) {
                entryRemoved(false, key, vCreate, v);
                return v;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final V put(K key, V value) {
        V vPut;
        OooOo.OooO0o0(key, "key");
        OooOo.OooO0o0(value, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += safeSizeOf(key, value);
            vPut = this.map.put(key, value);
            if (vPut != null) {
                this.size -= safeSizeOf(key, vPut);
            }
        }
        if (vPut != null) {
            entryRemoved(false, key, vPut, value);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final V remove(K key) {
        V vRemove;
        OooOo.OooO0o0(key, "key");
        synchronized (this.lock) {
            vRemove = this.map.remove(key);
            if (vRemove != null) {
                this.size -= safeSizeOf(key, vRemove);
            }
        }
        if (vRemove != null) {
            entryRemoved(false, key, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i;
        }
        trimToSize(i);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public int sizeOf(K key, V value) {
        OooOo.OooO0o0(key, "key");
        OooOo.OooO0o0(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            Iterator<T> it = this.map.getEntries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i = this.hitCount;
                int i2 = this.missCount + i;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0083, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            androidx.collection.internal.Lock r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch: java.lang.Throwable -> L14
            if (r1 < 0) goto L7c
            androidx.collection.internal.LruHashMap<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L17
            int r1 = r6.size     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L7c
            goto L17
        L14:
            r7 = move-exception
            goto L84
        L17:
            int r1 = r6.size     // Catch: java.lang.Throwable -> L14
            if (r1 <= r7) goto L7a
            androidx.collection.internal.LruHashMap<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L24
            goto L7a
        L24:
            androidx.collection.internal.LruHashMap<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L14
            java.util.Set r1 = r1.getEntries()     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.OooOo.OooO0o0(r1, r2)     // Catch: java.lang.Throwable -> L14
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L14
            r3 = 0
            if (r2 == 0) goto L44
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L14
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L3e
        L3c:
            r1 = r3
            goto L53
        L3e:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L14
            goto L53
        L44:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L14
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L4f
            goto L3c
        L4f:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L14
        L53:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L59
            monitor-exit(r0)
            return
        L59:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L14
            androidx.collection.internal.LruHashMap<K, V> r4 = r6.map     // Catch: java.lang.Throwable -> L14
            r4.remove(r2)     // Catch: java.lang.Throwable -> L14
            int r4 = r6.size     // Catch: java.lang.Throwable -> L14
            int r5 = r6.safeSizeOf(r2, r1)     // Catch: java.lang.Throwable -> L14
            int r4 = r4 - r5
            r6.size = r4     // Catch: java.lang.Throwable -> L14
            int r4 = r6.evictionCount     // Catch: java.lang.Throwable -> L14
            r5 = 1
            int r4 = r4 + r5
            r6.evictionCount = r4     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            r6.entryRemoved(r5, r2, r1, r3)
            goto L0
        L7a:
            monitor-exit(r0)
            return
        L7c:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L84:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.trimToSize(int):void");
    }
}
