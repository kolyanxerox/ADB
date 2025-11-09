package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.ads.ez0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class oO00Oo00 extends oO00000 implements RandomAccess, oO0O0OoO, oO0OO00o {

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final oO00Oo00 f26701OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final long[] f26702OooOoO0;

    /* renamed from: OooOo, reason: collision with root package name */
    public int f26703OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public long[] f26704OooOo0o;

    static {
        long[] jArr = new long[0];
        f26702OooOoO0 = jArr;
        f26701OooOoO = new oO00Oo00(jArr, 0, false);
    }

    public oO00Oo00(long[] jArr, int i, boolean z) {
        super(z);
        this.f26704OooOo0o = jArr;
        this.f26703OooOo = i;
    }

    public final void OooO(int i) {
        if (i < 0 || i >= this.f26703OooOo) {
            throw new IndexOutOfBoundsException(ez0.OooO00o(this.f26703OooOo, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.oO00O0o0
    /* renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final oO00Oo00 OooO00o(int i) {
        if (i >= this.f26703OooOo) {
            return new oO00Oo00(i == 0 ? f26702OooOoO0 : Arrays.copyOf(this.f26704OooOo0o, i), this.f26703OooOo, true);
        }
        throw new IllegalArgumentException();
    }

    public final long OooO0o0(int i) {
        OooO(i);
        return this.f26704OooOo0o[i];
    }

    public final void OooO0oO(long j) {
        OooO0Oo();
        int i = this.f26703OooOo;
        int length = this.f26704OooOo0o.length;
        if (i == length) {
            long[] jArr = new long[AbstractC2183w4.OooOO0(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26704OooOo0o, 0, jArr, 0, this.f26703OooOo);
            this.f26704OooOo0o = jArr;
        }
        long[] jArr2 = this.f26704OooOo0o;
        int i2 = this.f26703OooOo;
        this.f26703OooOo = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        OooO0Oo();
        if (i < 0 || i > (i2 = this.f26703OooOo)) {
            throw new IndexOutOfBoundsException(ez0.OooO00o(this.f26703OooOo, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        long[] jArr = this.f26704OooOo0o;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[AbstractC2183w4.OooOO0(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26704OooOo0o, 0, jArr2, 0, i);
            System.arraycopy(this.f26704OooOo0o, i, jArr2, i3, this.f26703OooOo - i);
            this.f26704OooOo0o = jArr2;
        }
        this.f26704OooOo0o[i] = jLongValue;
        this.f26703OooOo++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.oO00000, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO0Oo();
        Charset charset = oO00O0o.f26684OooO00o;
        collection.getClass();
        if (!(collection instanceof oO00Oo00)) {
            return super.addAll(collection);
        }
        oO00Oo00 oo00oo00 = (oO00Oo00) collection;
        int i = oo00oo00.f26703OooOo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f26703OooOo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f26704OooOo0o;
        if (i3 > jArr.length) {
            this.f26704OooOo0o = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(oo00oo00.f26704OooOo0o, 0, this.f26704OooOo0o, this.f26703OooOo, oo00oo00.f26703OooOo);
        this.f26703OooOo = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.oO00000, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oO00Oo00)) {
            return super.equals(obj);
        }
        oO00Oo00 oo00oo00 = (oO00Oo00) obj;
        if (this.f26703OooOo != oo00oo00.f26703OooOo) {
            return false;
        }
        long[] jArr = oo00oo00.f26704OooOo0o;
        for (int i = 0; i < this.f26703OooOo; i++) {
            if (this.f26704OooOo0o[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO(i);
        return Long.valueOf(this.f26704OooOo0o[i]);
    }

    @Override // com.google.android.gms.internal.measurement.oO00000, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f26703OooOo; i2++) {
            long j = this.f26704OooOo0o[i2];
            Charset charset = oO00O0o.f26684OooO00o;
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
        int i = this.f26703OooOo;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f26704OooOo0o[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.oO00000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO0Oo();
        OooO(i);
        long[] jArr = this.f26704OooOo0o;
        long j = jArr[i];
        if (i < this.f26703OooOo - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f26703OooOo--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO0Oo();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f26704OooOo0o;
        System.arraycopy(jArr, i2, jArr, i, this.f26703OooOo - i2);
        this.f26703OooOo -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        OooO0Oo();
        OooO(i);
        long[] jArr = this.f26704OooOo0o;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26703OooOo;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0oO(((Long) obj).longValue());
        return true;
    }
}
