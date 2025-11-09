package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class o000O0Oo extends OooO0O0 implements RandomAccess {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final o000O0Oo f28093OooOoO0;

    /* renamed from: OooOo, reason: collision with root package name */
    public int f28094OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Object[] f28095OooOo0o;

    static {
        o000O0Oo o000o0oo2 = new o000O0Oo(0, new Object[0]);
        f28093OooOoO0 = o000o0oo2;
        o000o0oo2.f28011OooOo0O = false;
    }

    public o000O0Oo(int i, Object[] objArr) {
        this.f28095OooOo0o = objArr;
        this.f28094OooOo = i;
    }

    public final void OooO0o0(int i) {
        if (i < 0 || i >= this.f28094OooOo) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
            sbOooOOo0.append(this.f28094OooOo);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO0O0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        OooO0Oo();
        int i = this.f28094OooOo;
        Object[] objArr = this.f28095OooOo0o;
        if (i == objArr.length) {
            this.f28095OooOo0o = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f28095OooOo0o;
        int i2 = this.f28094OooOo;
        this.f28094OooOo = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0o0(i);
        return this.f28095OooOo0o[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0OO00O
    public final o0OO00O mutableCopyWithCapacity(int i) {
        if (i < this.f28094OooOo) {
            throw new IllegalArgumentException();
        }
        return new o000O0Oo(this.f28094OooOo, Arrays.copyOf(this.f28095OooOo0o, i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO0O0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO0Oo();
        OooO0o0(i);
        Object[] objArr = this.f28095OooOo0o;
        Object obj = objArr[i];
        if (i < this.f28094OooOo - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f28094OooOo--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooO0Oo();
        OooO0o0(i);
        Object[] objArr = this.f28095OooOo0o;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28094OooOo;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        OooO0Oo();
        if (i >= 0 && i <= (i2 = this.f28094OooOo)) {
            Object[] objArr = this.f28095OooOo0o;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[OooO0oO.OooOo.OooO0O0(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f28095OooOo0o, i, objArr2, i + 1, this.f28094OooOo - i);
                this.f28095OooOo0o = objArr2;
            }
            this.f28095OooOo0o[i] = obj;
            this.f28094OooOo++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index:", ", Size:");
        sbOooOOo0.append(this.f28094OooOo);
        throw new IndexOutOfBoundsException(sbOooOOo0.toString());
    }
}
