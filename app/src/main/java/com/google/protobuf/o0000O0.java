package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class o0000O0 extends OooO0O0 implements Internal.DoubleList, RandomAccess, o0O00O0o {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final o0000O0 f28201OooOo = new o0000O0(new double[0], 0, false);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public double[] f28202OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f28203OooOo0o;

    public o0000O0(double[] dArr, int i, boolean z) {
        super(z);
        this.f28202OooOo0O = dArr;
        this.f28203OooOo0o = i;
    }

    public final void OooO0Oo(int i) {
        if (i < 0 || i >= this.f28203OooOo0o) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
            sbOooOOo0.append(this.f28203OooOo0o);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.f28203OooOo0o)) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
            sbOooOOo0.append(this.f28203OooOo0o);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
        double[] dArr = this.f28202OooOo0O;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[OooO0oO.OooOo.OooO0O0(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f28202OooOo0O, i, dArr2, i + 1, this.f28203OooOo0o - i);
            this.f28202OooOo0O = dArr2;
        }
        this.f28202OooOo0O[i] = dDoubleValue;
        this.f28203OooOo0o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof o0000O0)) {
            return super.addAll(collection);
        }
        o0000O0 o0000o02 = (o0000O0) collection;
        int i = o0000o02.f28203OooOo0o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f28203OooOo0o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f28202OooOo0O;
        if (i3 > dArr.length) {
            this.f28202OooOo0O = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(o0000o02.f28202OooOo0O, 0, this.f28202OooOo0O, this.f28203OooOo0o, o0000o02.f28203OooOo0o);
        this.f28203OooOo0o = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final void addDouble(double d) {
        ensureIsMutable();
        int i = this.f28203OooOo0o;
        double[] dArr = this.f28202OooOo0O;
        if (i == dArr.length) {
            double[] dArr2 = new double[OooO0oO.OooOo.OooO0O0(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f28202OooOo0O = dArr2;
        }
        double[] dArr3 = this.f28202OooOo0O;
        int i2 = this.f28203OooOo0o;
        this.f28203OooOo0o = i2 + 1;
        dArr3[i2] = d;
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
        if (!(obj instanceof o0000O0)) {
            return super.equals(obj);
        }
        o0000O0 o0000o02 = (o0000O0) obj;
        if (this.f28203OooOo0o != o0000o02.f28203OooOo0o) {
            return false;
        }
        double[] dArr = o0000o02.f28202OooOo0O;
        for (int i = 0; i < this.f28203OooOo0o; i++) {
            if (Double.doubleToLongBits(this.f28202OooOo0O[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Double.valueOf(getDouble(i));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final double getDouble(int i) {
        OooO0Oo(i);
        return this.f28202OooOo0O[i];
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.f28203OooOo0o; i++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(Double.doubleToLongBits(this.f28202OooOo0O[i]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f28203OooOo0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f28202OooOo0O[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        OooO0Oo(i);
        double[] dArr = this.f28202OooOo0O;
        double d = dArr[i];
        if (i < this.f28203OooOo0o - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f28203OooOo0o--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f28202OooOo0O;
        System.arraycopy(dArr, i2, dArr, i, this.f28203OooOo0o - i2);
        this.f28203OooOo0o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Double.valueOf(setDouble(i, ((Double) obj).doubleValue()));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final double setDouble(int i, double d) {
        ensureIsMutable();
        OooO0Oo(i);
        double[] dArr = this.f28202OooOo0O;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28203OooOo0o;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i) {
        if (i >= this.f28203OooOo0o) {
            return new o0000O0(Arrays.copyOf(this.f28202OooOo0O, i), this.f28203OooOo0o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
