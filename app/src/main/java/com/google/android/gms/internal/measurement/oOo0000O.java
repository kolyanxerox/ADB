package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.ads.ez0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class oOo0000O extends oO00000 implements RandomAccess {

    /* renamed from: OooOoO */
    public static final oOo0000O f26873OooOoO;

    /* renamed from: OooOoO0 */
    public static final Object[] f26874OooOoO0;

    /* renamed from: OooOo */
    public int f26875OooOo;

    /* renamed from: OooOo0o */
    public Object[] f26876OooOo0o;

    static {
        Object[] objArr = new Object[0];
        f26874OooOoO0 = objArr;
        f26873OooOoO = new oOo0000O(objArr, 0, false);
    }

    public oOo0000O(Object[] objArr, int i, boolean z) {
        super(z);
        this.f26876OooOo0o = objArr;
        this.f26875OooOo = i;
    }

    @Override // com.google.android.gms.internal.measurement.oO00O0o0
    public final /* bridge */ /* synthetic */ oO00O0o0 OooO00o(int i) {
        if (i >= this.f26875OooOo) {
            return new oOo0000O(i == 0 ? f26874OooOoO0 : Arrays.copyOf(this.f26876OooOo0o, i), this.f26875OooOo, true);
        }
        throw new IllegalArgumentException();
    }

    public final void OooO0o0(int i) {
        if (i < 0 || i >= this.f26875OooOo) {
            throw new IndexOutOfBoundsException(ez0.OooO00o(this.f26875OooOo, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        OooO0Oo();
        if (i < 0 || i > (i2 = this.f26875OooOo)) {
            throw new IndexOutOfBoundsException(ez0.OooO00o(this.f26875OooOo, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.f26876OooOo0o;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC2183w4.OooOO0(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26876OooOo0o, 0, objArr2, 0, i);
            System.arraycopy(this.f26876OooOo0o, i, objArr2, i3, this.f26875OooOo - i);
            this.f26876OooOo0o = objArr2;
        }
        this.f26876OooOo0o[i] = obj;
        this.f26875OooOo++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0o0(i);
        return this.f26876OooOo0o[i];
    }

    @Override // com.google.android.gms.internal.measurement.oO00000, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO0Oo();
        OooO0o0(i);
        Object[] objArr = this.f26876OooOo0o;
        Object obj = objArr[i];
        if (i < this.f26875OooOo - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f26875OooOo--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooO0Oo();
        OooO0o0(i);
        Object[] objArr = this.f26876OooOo0o;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26875OooOo;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        OooO0Oo();
        int i = this.f26875OooOo;
        int length = this.f26876OooOo0o.length;
        if (i == length) {
            this.f26876OooOo0o = Arrays.copyOf(this.f26876OooOo0o, AbstractC2183w4.OooOO0(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f26876OooOo0o;
        int i2 = this.f26875OooOo;
        this.f26875OooOo = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
