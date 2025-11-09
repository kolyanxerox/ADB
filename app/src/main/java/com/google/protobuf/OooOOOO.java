package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class OooOOOO extends OooO0O0 implements Internal.BooleanList, RandomAccess, o0O00O0o {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final OooOOOO f28169OooOo = new OooOOOO(new boolean[0], 0, false);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean[] f28170OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f28171OooOo0o;

    public OooOOOO(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f28170OooOo0O = zArr;
        this.f28171OooOo0o = i;
    }

    public final void OooO0Oo(int i) {
        if (i < 0 || i >= this.f28171OooOo0o) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
            sbOooOOo0.append(this.f28171OooOo0o);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.f28171OooOo0o)) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
            sbOooOOo0.append(this.f28171OooOo0o);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
        boolean[] zArr = this.f28170OooOo0O;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[OooO0oO.OooOo.OooO0O0(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f28170OooOo0O, i, zArr2, i + 1, this.f28171OooOo0o - i);
            this.f28170OooOo0O = zArr2;
        }
        this.f28170OooOo0O[i] = zBooleanValue;
        this.f28171OooOo0o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof OooOOOO)) {
            return super.addAll(collection);
        }
        OooOOOO oooOOOO = (OooOOOO) collection;
        int i = oooOOOO.f28171OooOo0o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f28171OooOo0o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f28170OooOo0O;
        if (i3 > zArr.length) {
            this.f28170OooOo0O = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(oooOOOO.f28170OooOo0O, 0, this.f28170OooOo0O, this.f28171OooOo0o, oooOOOO.f28171OooOo0o);
        this.f28171OooOo0o = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final void addBoolean(boolean z) {
        ensureIsMutable();
        int i = this.f28171OooOo0o;
        boolean[] zArr = this.f28170OooOo0O;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[OooO0oO.OooOo.OooO0O0(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f28170OooOo0O = zArr2;
        }
        boolean[] zArr3 = this.f28170OooOo0O;
        int i2 = this.f28171OooOo0o;
        this.f28171OooOo0o = i2 + 1;
        zArr3[i2] = z;
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
        if (!(obj instanceof OooOOOO)) {
            return super.equals(obj);
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        if (this.f28171OooOo0o != oooOOOO.f28171OooOo0o) {
            return false;
        }
        boolean[] zArr = oooOOOO.f28170OooOo0O;
        for (int i = 0; i < this.f28171OooOo0o; i++) {
            if (this.f28170OooOo0O[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Boolean.valueOf(getBoolean(i));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final boolean getBoolean(int i) {
        OooO0Oo(i);
        return this.f28170OooOo0O[i];
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashBoolean = 1;
        for (int i = 0; i < this.f28171OooOo0o; i++) {
            iHashBoolean = (iHashBoolean * 31) + Internal.hashBoolean(this.f28170OooOo0O[i]);
        }
        return iHashBoolean;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f28171OooOo0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f28170OooOo0O[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        OooO0Oo(i);
        boolean[] zArr = this.f28170OooOo0O;
        boolean z = zArr[i];
        if (i < this.f28171OooOo0o - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f28171OooOo0o--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f28170OooOo0O;
        System.arraycopy(zArr, i2, zArr, i, this.f28171OooOo0o - i2);
        this.f28171OooOo0o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Boolean.valueOf(setBoolean(i, ((Boolean) obj).booleanValue()));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final boolean setBoolean(int i, boolean z) {
        ensureIsMutable();
        OooO0Oo(i);
        boolean[] zArr = this.f28170OooOo0O;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28171OooOo0o;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i) {
        if (i >= this.f28171OooOo0o) {
            return new OooOOOO(Arrays.copyOf(this.f28170OooOo0O, i), this.f28171OooOo0o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
