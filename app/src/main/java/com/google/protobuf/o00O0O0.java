package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class o00O0O0 extends OooO0O0 implements Internal.IntList, RandomAccess, o0O00O0o {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final o00O0O0 f28258OooOo = new o00O0O0(new int[0], 0, false);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int[] f28259OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f28260OooOo0o;

    public o00O0O0() {
        this(new int[10], 0, true);
    }

    public final void OooO0Oo(int i) {
        if (i < 0 || i >= this.f28260OooOo0o) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
            sbOooOOo0.append(this.f28260OooOo0o);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.f28260OooOo0o)) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
            sbOooOOo0.append(this.f28260OooOo0o);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
        int[] iArr = this.f28259OooOo0O;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[OooO0oO.OooOo.OooO0O0(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f28259OooOo0O, i, iArr2, i + 1, this.f28260OooOo0o - i);
            this.f28259OooOo0O = iArr2;
        }
        this.f28259OooOo0O[i] = iIntValue;
        this.f28260OooOo0o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof o00O0O0)) {
            return super.addAll(collection);
        }
        o00O0O0 o00o0o0 = (o00O0O0) collection;
        int i = o00o0o0.f28260OooOo0o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f28260OooOo0o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f28259OooOo0O;
        if (i3 > iArr.length) {
            this.f28259OooOo0O = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(o00o0o0.f28259OooOo0O, 0, this.f28259OooOo0O, this.f28260OooOo0o, o00o0o0.f28260OooOo0o);
        this.f28260OooOo0o = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public final void addInt(int i) {
        ensureIsMutable();
        int i2 = this.f28260OooOo0o;
        int[] iArr = this.f28259OooOo0O;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[OooO0oO.OooOo.OooO0O0(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f28259OooOo0O = iArr2;
        }
        int[] iArr3 = this.f28259OooOo0O;
        int i3 = this.f28260OooOo0o;
        this.f28260OooOo0o = i3 + 1;
        iArr3[i3] = i;
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
        if (!(obj instanceof o00O0O0)) {
            return super.equals(obj);
        }
        o00O0O0 o00o0o0 = (o00O0O0) obj;
        if (this.f28260OooOo0o != o00o0o0.f28260OooOo0o) {
            return false;
        }
        int[] iArr = o00o0o0.f28259OooOo0O;
        for (int i = 0; i < this.f28260OooOo0o; i++) {
            if (this.f28259OooOo0O[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // com.google.protobuf.Internal.IntList
    public final int getInt(int i) {
        OooO0Oo(i);
        return this.f28259OooOo0O[i];
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f28260OooOo0o; i2++) {
            i = (i * 31) + this.f28259OooOo0O[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f28260OooOo0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f28259OooOo0O[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        OooO0Oo(i);
        int[] iArr = this.f28259OooOo0O;
        int i2 = iArr[i];
        if (i < this.f28260OooOo0o - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f28260OooOo0o--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f28259OooOo0O;
        System.arraycopy(iArr, i2, iArr, i, this.f28260OooOo0o - i2);
        this.f28260OooOo0o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Integer.valueOf(setInt(i, ((Integer) obj).intValue()));
    }

    @Override // com.google.protobuf.Internal.IntList
    public final int setInt(int i, int i2) {
        ensureIsMutable();
        OooO0Oo(i);
        int[] iArr = this.f28259OooOo0O;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28260OooOo0o;
    }

    public o00O0O0(int[] iArr, int i, boolean z) {
        super(z);
        this.f28259OooOo0O = iArr;
        this.f28260OooOo0o = i;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i) {
        if (i >= this.f28260OooOo0o) {
            return new o00O0O0(Arrays.copyOf(this.f28259OooOo0O, i), this.f28260OooOo0o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
