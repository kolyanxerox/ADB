package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.ads.ez0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class oO0OOo0o extends oO00000 implements RandomAccess, oO000o00, oO0OO00o {

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final oO0OOo0o f26752OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final int[] f26753OooOoO0;

    /* renamed from: OooOo, reason: collision with root package name */
    public int f26754OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int[] f26755OooOo0o;

    static {
        int[] iArr = new int[0];
        f26753OooOoO0 = iArr;
        f26752OooOoO = new oO0OOo0o(iArr, 0, false);
    }

    public oO0OOo0o(int[] iArr, int i, boolean z) {
        super(z);
        this.f26755OooOo0o = iArr;
        this.f26754OooOo = i;
    }

    public final void OooO(int i) {
        if (i < 0 || i >= this.f26754OooOo) {
            throw new IndexOutOfBoundsException(ez0.OooO00o(this.f26754OooOo, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    public final int OooO0o(int i) {
        OooO(i);
        return this.f26755OooOo0o[i];
    }

    @Override // com.google.android.gms.internal.measurement.oO00O0o0
    /* renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final oO0OOo0o OooO00o(int i) {
        if (i >= this.f26754OooOo) {
            return new oO0OOo0o(i == 0 ? f26753OooOoO0 : Arrays.copyOf(this.f26755OooOo0o, i), this.f26754OooOo, true);
        }
        throw new IllegalArgumentException();
    }

    public final void OooO0oO(int i) {
        OooO0Oo();
        int i2 = this.f26754OooOo;
        int length = this.f26755OooOo0o.length;
        if (i2 == length) {
            int[] iArr = new int[AbstractC2183w4.OooOO0(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26755OooOo0o, 0, iArr, 0, this.f26754OooOo);
            this.f26755OooOo0o = iArr;
        }
        int[] iArr2 = this.f26755OooOo0o;
        int i3 = this.f26754OooOo;
        this.f26754OooOo = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        OooO0Oo();
        if (i < 0 || i > (i2 = this.f26754OooOo)) {
            throw new IndexOutOfBoundsException(ez0.OooO00o(this.f26754OooOo, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.f26755OooOo0o;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC2183w4.OooOO0(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26755OooOo0o, 0, iArr2, 0, i);
            System.arraycopy(this.f26755OooOo0o, i, iArr2, i3, this.f26754OooOo - i);
            this.f26755OooOo0o = iArr2;
        }
        this.f26755OooOo0o[i] = iIntValue;
        this.f26754OooOo++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.oO00000, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO0Oo();
        Charset charset = oO00O0o.f26684OooO00o;
        collection.getClass();
        if (!(collection instanceof oO0OOo0o)) {
            return super.addAll(collection);
        }
        oO0OOo0o oo0ooo0o = (oO0OOo0o) collection;
        int i = oo0ooo0o.f26754OooOo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f26754OooOo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f26755OooOo0o;
        if (i3 > iArr.length) {
            this.f26755OooOo0o = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(oo0ooo0o.f26755OooOo0o, 0, this.f26755OooOo0o, this.f26754OooOo, oo0ooo0o.f26754OooOo);
        this.f26754OooOo = i3;
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
        if (!(obj instanceof oO0OOo0o)) {
            return super.equals(obj);
        }
        oO0OOo0o oo0ooo0o = (oO0OOo0o) obj;
        if (this.f26754OooOo != oo0ooo0o.f26754OooOo) {
            return false;
        }
        int[] iArr = oo0ooo0o.f26755OooOo0o;
        for (int i = 0; i < this.f26754OooOo; i++) {
            if (this.f26755OooOo0o[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO(i);
        return Integer.valueOf(this.f26755OooOo0o[i]);
    }

    @Override // com.google.android.gms.internal.measurement.oO00000, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f26754OooOo; i2++) {
            i = (i * 31) + this.f26755OooOo0o[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f26754OooOo;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f26755OooOo0o[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.oO00000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO0Oo();
        OooO(i);
        int[] iArr = this.f26755OooOo0o;
        int i2 = iArr[i];
        if (i < this.f26754OooOo - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f26754OooOo--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO0Oo();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f26755OooOo0o;
        System.arraycopy(iArr, i2, iArr, i, this.f26754OooOo - i2);
        this.f26754OooOo -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        OooO0Oo();
        OooO(i);
        int[] iArr = this.f26755OooOo0o;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26754OooOo;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0oO(((Integer) obj).intValue());
        return true;
    }
}
