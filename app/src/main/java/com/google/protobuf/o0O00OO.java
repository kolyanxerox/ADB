package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class o0O00OO extends OooO0O0 implements RandomAccess {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final o0O00OO f28293OooOo = new o0O00OO(new Object[0], 0, false);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Object[] f28294OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f28295OooOo0o;

    public o0O00OO(Object[] objArr, int i, boolean z) {
        super(z);
        this.f28294OooOo0O = objArr;
        this.f28295OooOo0o = i;
    }

    public final void OooO0Oo(int i) {
        if (i < 0 || i >= this.f28295OooOo0o) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
            sbOooOOo0.append(this.f28295OooOo0o);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ensureIsMutable();
        int i = this.f28295OooOo0o;
        Object[] objArr = this.f28294OooOo0O;
        if (i == objArr.length) {
            this.f28294OooOo0O = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f28294OooOo0O;
        int i2 = this.f28295OooOo0o;
        this.f28295OooOo0o = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0Oo(i);
        return this.f28294OooOo0O[i];
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList mutableCopyWithCapacity2(int i) {
        if (i >= this.f28295OooOo0o) {
            return new o0O00OO(Arrays.copyOf(this.f28294OooOo0O, i), this.f28295OooOo0o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.OooO0O0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        OooO0Oo(i);
        Object[] objArr = this.f28294OooOo0O;
        Object obj = objArr[i];
        if (i < this.f28295OooOo0o - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f28295OooOo0o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ensureIsMutable();
        OooO0Oo(i);
        Object[] objArr = this.f28294OooOo0O;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28295OooOo0o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.f28295OooOo0o)) {
            Object[] objArr = this.f28294OooOo0O;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[OooO0oO.OooOo.OooO0O0(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f28294OooOo0O, i, objArr2, i + 1, this.f28295OooOo0o - i);
                this.f28294OooOo0O = objArr2;
            }
            this.f28294OooOo0O[i] = obj;
            this.f28295OooOo0o++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
        sbOooOOo0.append(this.f28295OooOo0o);
        throw new IndexOutOfBoundsException(sbOooOOo0.toString());
    }
}
