package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class p01 extends cz0 implements RandomAccess, g01, z01 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final p01 f23170OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final long[] f23171OooOoO0;

    /* renamed from: OooOo, reason: collision with root package name */
    public int f23172OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public long[] f23173OooOo0o;

    static {
        long[] jArr = new long[0];
        f23171OooOoO0 = jArr;
        f23170OooOoO = new p01(jArr, 0, false);
    }

    public p01(long[] jArr, int i, boolean z) {
        super(z);
        this.f23173OooOo0o = jArr;
        this.f23172OooOo = i;
    }

    public final void OooO(int i) {
        if (i < 0 || i >= this.f23172OooOo) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, this.f23172OooOo, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.ads.h01
    /* renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final p01 OooO0O0(int i) {
        if (i >= this.f23172OooOo) {
            return new p01(i == 0 ? f23171OooOoO0 : Arrays.copyOf(this.f23173OooOo0o, i), this.f23172OooOo, true);
        }
        throw new IllegalArgumentException();
    }

    public final long OooO0o0(int i) {
        OooO(i);
        return this.f23173OooOo0o[i];
    }

    public final void OooO0oO(long j) {
        OooO0Oo();
        int i = this.f23172OooOo;
        int length = this.f23173OooOo0o.length;
        if (i == length) {
            long[] jArr = new long[AbstractC2183w4.OooOO0(length, 3, 2, 1, 10)];
            System.arraycopy(this.f23173OooOo0o, 0, jArr, 0, this.f23172OooOo);
            this.f23173OooOo0o = jArr;
        }
        long[] jArr2 = this.f23173OooOo0o;
        int i2 = this.f23172OooOo;
        this.f23172OooOo = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        OooO0Oo();
        if (i < 0 || i > (i2 = this.f23172OooOo)) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, this.f23172OooOo, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        long[] jArr = this.f23173OooOo0o;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[AbstractC2183w4.OooOO0(length, 3, 2, 1, 10)];
            System.arraycopy(this.f23173OooOo0o, 0, jArr2, 0, i);
            System.arraycopy(this.f23173OooOo0o, i, jArr2, i3, this.f23172OooOo - i);
            this.f23173OooOo0o = jArr2;
        }
        this.f23173OooOo0o[i] = jLongValue;
        this.f23172OooOo++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.cz0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO0Oo();
        Charset charset = i01.f19888OooO00o;
        collection.getClass();
        if (!(collection instanceof p01)) {
            return super.addAll(collection);
        }
        p01 p01Var = (p01) collection;
        int i = p01Var.f23172OooOo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23172OooOo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f23173OooOo0o;
        if (i3 > jArr.length) {
            this.f23173OooOo0o = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(p01Var.f23173OooOo0o, 0, this.f23173OooOo0o, this.f23172OooOo, p01Var.f23172OooOo);
        this.f23172OooOo = i3;
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
        if (!(obj instanceof p01)) {
            return super.equals(obj);
        }
        p01 p01Var = (p01) obj;
        if (this.f23172OooOo != p01Var.f23172OooOo) {
            return false;
        }
        long[] jArr = p01Var.f23173OooOo0o;
        for (int i = 0; i < this.f23172OooOo; i++) {
            if (this.f23173OooOo0o[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO(i);
        return Long.valueOf(this.f23173OooOo0o[i]);
    }

    @Override // com.google.android.gms.internal.ads.cz0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f23172OooOo; i2++) {
            long j = this.f23173OooOo0o[i2];
            Charset charset = i01.f19888OooO00o;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f23172OooOo;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f23173OooOo0o[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.cz0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO0Oo();
        OooO(i);
        long[] jArr = this.f23173OooOo0o;
        long j = jArr[i];
        if (i < this.f23172OooOo - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f23172OooOo--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO0Oo();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f23173OooOo0o;
        System.arraycopy(jArr, i2, jArr, i, this.f23172OooOo - i2);
        this.f23172OooOo -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        OooO0Oo();
        OooO(i);
        long[] jArr = this.f23173OooOo0o;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23172OooOo;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0oO(((Long) obj).longValue());
        return true;
    }
}
