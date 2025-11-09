package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class a01 extends cz0 implements RandomAccess, d01, z01 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final a01 f16868OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final int[] f16869OooOoO0;

    /* renamed from: OooOo, reason: collision with root package name */
    public int f16870OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int[] f16871OooOo0o;

    static {
        int[] iArr = new int[0];
        f16869OooOoO0 = iArr;
        f16868OooOoO = new a01(iArr, 0, false);
    }

    public a01(int[] iArr, int i, boolean z) {
        super(z);
        this.f16871OooOo0o = iArr;
        this.f16870OooOo = i;
    }

    public final void OooO(int i) {
        if (i < 0 || i >= this.f16870OooOo) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, this.f16870OooOo, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.ads.h01
    /* renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final a01 OooO0O0(int i) {
        if (i >= this.f16870OooOo) {
            return new a01(i == 0 ? f16869OooOoO0 : Arrays.copyOf(this.f16871OooOo0o, i), this.f16870OooOo, true);
        }
        throw new IllegalArgumentException();
    }

    public final int OooO0o0(int i) {
        OooO(i);
        return this.f16871OooOo0o[i];
    }

    public final void OooO0oO(int i) {
        OooO0Oo();
        int i2 = this.f16870OooOo;
        int length = this.f16871OooOo0o.length;
        if (i2 == length) {
            int[] iArr = new int[AbstractC2183w4.OooOO0(length, 3, 2, 1, 10)];
            System.arraycopy(this.f16871OooOo0o, 0, iArr, 0, this.f16870OooOo);
            this.f16871OooOo0o = iArr;
        }
        int[] iArr2 = this.f16871OooOo0o;
        int i3 = this.f16870OooOo;
        this.f16870OooOo = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        OooO0Oo();
        if (i < 0 || i > (i2 = this.f16870OooOo)) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, this.f16870OooOo, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.f16871OooOo0o;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC2183w4.OooOO0(length, 3, 2, 1, 10)];
            System.arraycopy(this.f16871OooOo0o, 0, iArr2, 0, i);
            System.arraycopy(this.f16871OooOo0o, i, iArr2, i3, this.f16870OooOo - i);
            this.f16871OooOo0o = iArr2;
        }
        this.f16871OooOo0o[i] = iIntValue;
        this.f16870OooOo++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.cz0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO0Oo();
        Charset charset = i01.f19888OooO00o;
        collection.getClass();
        if (!(collection instanceof a01)) {
            return super.addAll(collection);
        }
        a01 a01Var = (a01) collection;
        int i = a01Var.f16870OooOo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16870OooOo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f16871OooOo0o;
        if (i3 > iArr.length) {
            this.f16871OooOo0o = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(a01Var.f16871OooOo0o, 0, this.f16871OooOo0o, this.f16870OooOo, a01Var.f16870OooOo);
        this.f16870OooOo = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.cz0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a01)) {
            return super.equals(obj);
        }
        a01 a01Var = (a01) obj;
        if (this.f16870OooOo != a01Var.f16870OooOo) {
            return false;
        }
        int[] iArr = a01Var.f16871OooOo0o;
        for (int i = 0; i < this.f16870OooOo; i++) {
            if (this.f16871OooOo0o[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO(i);
        return Integer.valueOf(this.f16871OooOo0o[i]);
    }

    @Override // com.google.android.gms.internal.ads.cz0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16870OooOo; i2++) {
            i = (i * 31) + this.f16871OooOo0o[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f16870OooOo;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f16871OooOo0o[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.cz0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO0Oo();
        OooO(i);
        int[] iArr = this.f16871OooOo0o;
        int i2 = iArr[i];
        if (i < this.f16870OooOo - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f16870OooOo--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO0Oo();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f16871OooOo0o;
        System.arraycopy(iArr, i2, iArr, i, this.f16870OooOo - i2);
        this.f16870OooOo -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        OooO0Oo();
        OooO(i);
        int[] iArr = this.f16871OooOo0o;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16870OooOo;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0oO(((Integer) obj).intValue());
        return true;
    }
}
