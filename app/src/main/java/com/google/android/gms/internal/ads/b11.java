package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class b11 extends cz0 implements RandomAccess {

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final b11 f17344OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final Object[] f17345OooOoO0;

    /* renamed from: OooOo, reason: collision with root package name */
    public int f17346OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Object[] f17347OooOo0o;

    static {
        Object[] objArr = new Object[0];
        f17345OooOoO0 = objArr;
        f17344OooOoO = new b11(objArr, 0, false);
    }

    public b11(Object[] objArr, int i, boolean z) {
        super(z);
        this.f17347OooOo0o = objArr;
        this.f17346OooOo = i;
    }

    @Override // com.google.android.gms.internal.ads.h01
    public final /* bridge */ /* synthetic */ h01 OooO0O0(int i) {
        if (i >= this.f17346OooOo) {
            return new b11(i == 0 ? f17345OooOoO0 : Arrays.copyOf(this.f17347OooOo0o, i), this.f17346OooOo, true);
        }
        throw new IllegalArgumentException();
    }

    public final void OooO0o0(int i) {
        if (i < 0 || i >= this.f17346OooOo) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, this.f17346OooOo, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        OooO0Oo();
        if (i < 0 || i > (i2 = this.f17346OooOo)) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, this.f17346OooOo, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.f17347OooOo0o;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC2183w4.OooOO0(length, 3, 2, 1, 10)];
            System.arraycopy(this.f17347OooOo0o, 0, objArr2, 0, i);
            System.arraycopy(this.f17347OooOo0o, i, objArr2, i3, this.f17346OooOo - i);
            this.f17347OooOo0o = objArr2;
        }
        this.f17347OooOo0o[i] = obj;
        this.f17346OooOo++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0o0(i);
        return this.f17347OooOo0o[i];
    }

    @Override // com.google.android.gms.internal.ads.cz0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO0Oo();
        OooO0o0(i);
        Object[] objArr = this.f17347OooOo0o;
        Object obj = objArr[i];
        if (i < this.f17346OooOo - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f17346OooOo--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooO0Oo();
        OooO0o0(i);
        Object[] objArr = this.f17347OooOo0o;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17346OooOo;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        OooO0Oo();
        int i = this.f17346OooOo;
        int length = this.f17347OooOo0o.length;
        if (i == length) {
            this.f17347OooOo0o = Arrays.copyOf(this.f17347OooOo0o, AbstractC2183w4.OooOO0(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f17347OooOo0o;
        int i2 = this.f17346OooOo;
        this.f17346OooOo = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
