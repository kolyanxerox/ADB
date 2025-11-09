package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class oo0O extends OooO0O0 implements Internal.LongList, RandomAccess, o0O00O0o {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final oo0O f28435OooOo = new oo0O(new long[0], 0, false);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public long[] f28436OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f28437OooOo0o;

    public oo0O() {
        this(new long[10], 0, true);
    }

    public final void OooO0Oo(int i) {
        if (i < 0 || i >= this.f28437OooOo0o) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
            sbOooOOo0.append(this.f28437OooOo0o);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.f28437OooOo0o)) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
            sbOooOOo0.append(this.f28437OooOo0o);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
        long[] jArr = this.f28436OooOo0O;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[OooO0oO.OooOo.OooO0O0(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f28436OooOo0O, i, jArr2, i + 1, this.f28437OooOo0o - i);
            this.f28436OooOo0O = jArr2;
        }
        this.f28436OooOo0O[i] = jLongValue;
        this.f28437OooOo0o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof oo0O)) {
            return super.addAll(collection);
        }
        oo0O oo0o = (oo0O) collection;
        int i = oo0o.f28437OooOo0o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f28437OooOo0o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f28436OooOo0O;
        if (i3 > jArr.length) {
            this.f28436OooOo0O = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(oo0o.f28436OooOo0O, 0, this.f28436OooOo0O, this.f28437OooOo0o, oo0o.f28437OooOo0o);
        this.f28437OooOo0o = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public final void addLong(long j) {
        ensureIsMutable();
        int i = this.f28437OooOo0o;
        long[] jArr = this.f28436OooOo0O;
        if (i == jArr.length) {
            long[] jArr2 = new long[OooO0oO.OooOo.OooO0O0(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f28436OooOo0O = jArr2;
        }
        long[] jArr3 = this.f28436OooOo0O;
        int i2 = this.f28437OooOo0o;
        this.f28437OooOo0o = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0O)) {
            return super.equals(obj);
        }
        oo0O oo0o = (oo0O) obj;
        if (this.f28437OooOo0o != oo0o.f28437OooOo0o) {
            return false;
        }
        long[] jArr = oo0o.f28436OooOo0O;
        for (int i = 0; i < this.f28437OooOo0o; i++) {
            if (this.f28436OooOo0O[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // com.google.protobuf.Internal.LongList
    public final long getLong(int i) {
        OooO0Oo(i);
        return this.f28436OooOo0O[i];
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.f28437OooOo0o; i++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(this.f28436OooOo0O[i]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f28437OooOo0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f28436OooOo0O[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        OooO0Oo(i);
        long[] jArr = this.f28436OooOo0O;
        long j = jArr[i];
        if (i < this.f28437OooOo0o - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f28437OooOo0o--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f28436OooOo0O;
        System.arraycopy(jArr, i2, jArr, i, this.f28437OooOo0o - i2);
        this.f28437OooOo0o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Long.valueOf(setLong(i, ((Long) obj).longValue()));
    }

    @Override // com.google.protobuf.Internal.LongList
    public final long setLong(int i, long j) {
        ensureIsMutable();
        OooO0Oo(i);
        long[] jArr = this.f28436OooOo0O;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28437OooOo0o;
    }

    public oo0O(long[] jArr, int i, boolean z) {
        super(z);
        this.f28436OooOo0O = jArr;
        this.f28437OooOo0o = i;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i) {
        if (i >= this.f28437OooOo0o) {
            return new oo0O(Arrays.copyOf(this.f28436OooOo0O, i), this.f28437OooOo0o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
