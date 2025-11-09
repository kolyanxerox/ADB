package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class o00O00O extends OooO0O0 implements Internal.FloatList, RandomAccess, o0O00O0o {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final o00O00O f28252OooOo = new o00O00O(new float[0], 0, false);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public float[] f28253OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f28254OooOo0o;

    public o00O00O(float[] fArr, int i, boolean z) {
        super(z);
        this.f28253OooOo0O = fArr;
        this.f28254OooOo0o = i;
    }

    public final void OooO0Oo(int i) {
        if (i < 0 || i >= this.f28254OooOo0o) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
            sbOooOOo0.append(this.f28254OooOo0o);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.f28254OooOo0o)) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
            sbOooOOo0.append(this.f28254OooOo0o);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
        float[] fArr = this.f28253OooOo0O;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[OooO0oO.OooOo.OooO0O0(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f28253OooOo0O, i, fArr2, i + 1, this.f28254OooOo0o - i);
            this.f28253OooOo0O = fArr2;
        }
        this.f28253OooOo0O[i] = fFloatValue;
        this.f28254OooOo0o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof o00O00O)) {
            return super.addAll(collection);
        }
        o00O00O o00o00o = (o00O00O) collection;
        int i = o00o00o.f28254OooOo0o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f28254OooOo0o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f28253OooOo0O;
        if (i3 > fArr.length) {
            this.f28253OooOo0O = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(o00o00o.f28253OooOo0O, 0, this.f28253OooOo0O, this.f28254OooOo0o, o00o00o.f28254OooOo0o);
        this.f28254OooOo0o = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final void addFloat(float f) {
        ensureIsMutable();
        int i = this.f28254OooOo0o;
        float[] fArr = this.f28253OooOo0O;
        if (i == fArr.length) {
            float[] fArr2 = new float[OooO0oO.OooOo.OooO0O0(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f28253OooOo0O = fArr2;
        }
        float[] fArr3 = this.f28253OooOo0O;
        int i2 = this.f28254OooOo0o;
        this.f28254OooOo0o = i2 + 1;
        fArr3[i2] = f;
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
        if (!(obj instanceof o00O00O)) {
            return super.equals(obj);
        }
        o00O00O o00o00o = (o00O00O) obj;
        if (this.f28254OooOo0o != o00o00o.f28254OooOo0o) {
            return false;
        }
        float[] fArr = o00o00o.f28253OooOo0O;
        for (int i = 0; i < this.f28254OooOo0o; i++) {
            if (Float.floatToIntBits(this.f28253OooOo0O[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final float getFloat(int i) {
        OooO0Oo(i);
        return this.f28253OooOo0O[i];
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f28254OooOo0o; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f28253OooOo0O[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f28254OooOo0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f28253OooOo0O[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        OooO0Oo(i);
        float[] fArr = this.f28253OooOo0O;
        float f = fArr[i];
        if (i < this.f28254OooOo0o - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f28254OooOo0o--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f28253OooOo0O;
        System.arraycopy(fArr, i2, fArr, i, this.f28254OooOo0o - i2);
        this.f28254OooOo0o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Float.valueOf(setFloat(i, ((Float) obj).floatValue()));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final float setFloat(int i, float f) {
        ensureIsMutable();
        OooO0Oo(i);
        float[] fArr = this.f28253OooOo0O;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28254OooOo0o;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i) {
        if (i >= this.f28254OooOo0o) {
            return new o00O00O(Arrays.copyOf(this.f28253OooOo0O, i), this.f28254OooOo0o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
