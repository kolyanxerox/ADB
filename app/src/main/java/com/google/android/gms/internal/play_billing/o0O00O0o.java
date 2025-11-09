package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class o0O00O0o extends oo00oO implements RandomAccess, o0O00OO, o0oOo0O0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final o0O00O0o f27091OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final int[] f27092OooOoO0;

    /* renamed from: OooOo, reason: collision with root package name */
    public int f27093OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int[] f27094OooOo0o;

    static {
        int[] iArr = new int[0];
        f27092OooOoO0 = iArr;
        f27091OooOoO = new o0O00O0o(iArr, 0, false);
    }

    public o0O00O0o(int[] iArr, int i, boolean z) {
        super(z);
        this.f27094OooOo0o = iArr;
        this.f27093OooOo = i;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O00OOO
    public final /* bridge */ /* synthetic */ o0O00OOO OooO0OO(int i) {
        if (i >= this.f27093OooOo) {
            return new o0O00O0o(i == 0 ? f27092OooOoO0 : Arrays.copyOf(this.f27094OooOo0o, i), this.f27093OooOo, true);
        }
        throw new IllegalArgumentException();
    }

    public final void OooO0o(int i) {
        OooO0Oo();
        int i2 = this.f27093OooOo;
        int length = this.f27094OooOo0o.length;
        if (i2 == length) {
            int[] iArr = new int[AbstractC2183w4.OooOO0(length, 3, 2, 1, 10)];
            System.arraycopy(this.f27094OooOo0o, 0, iArr, 0, this.f27093OooOo);
            this.f27094OooOo0o = iArr;
        }
        int[] iArr2 = this.f27094OooOo0o;
        int i3 = this.f27093OooOo;
        this.f27093OooOo = i3 + 1;
        iArr2[i3] = i;
    }

    public final int OooO0o0(int i) {
        OooO0oO(i);
        return this.f27094OooOo0o[i];
    }

    public final void OooO0oO(int i) {
        if (i < 0 || i >= this.f27093OooOo) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, this.f27093OooOo, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        OooO0Oo();
        if (i < 0 || i > (i2 = this.f27093OooOo)) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, this.f27093OooOo, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.f27094OooOo0o;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC2183w4.OooOO0(length, 3, 2, 1, 10)];
            System.arraycopy(this.f27094OooOo0o, 0, iArr2, 0, i);
            System.arraycopy(this.f27094OooOo0o, i, iArr2, i3, this.f27093OooOo - i);
            this.f27094OooOo0o = iArr2;
        }
        this.f27094OooOo0o[i] = iIntValue;
        this.f27093OooOo++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.oo00oO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO0Oo();
        Charset charset = o0oO0Ooo.f27160OooO00o;
        collection.getClass();
        if (!(collection instanceof o0O00O0o)) {
            return super.addAll(collection);
        }
        o0O00O0o o0o00o0o = (o0O00O0o) collection;
        int i = o0o00o0o.f27093OooOo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f27093OooOo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f27094OooOo0o;
        if (i3 > iArr.length) {
            this.f27094OooOo0o = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(o0o00o0o.f27094OooOo0o, 0, this.f27094OooOo0o, this.f27093OooOo, o0o00o0o.f27093OooOo);
        this.f27093OooOo = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.oo00oO, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0O00O0o)) {
            return super.equals(obj);
        }
        o0O00O0o o0o00o0o = (o0O00O0o) obj;
        if (this.f27093OooOo != o0o00o0o.f27093OooOo) {
            return false;
        }
        int[] iArr = o0o00o0o.f27094OooOo0o;
        for (int i = 0; i < this.f27093OooOo; i++) {
            if (this.f27094OooOo0o[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0oO(i);
        return Integer.valueOf(this.f27094OooOo0o[i]);
    }

    @Override // com.google.android.gms.internal.play_billing.oo00oO, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f27093OooOo; i2++) {
            i = (i * 31) + this.f27094OooOo0o[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f27093OooOo;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f27094OooOo0o[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.oo00oO, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO0Oo();
        OooO0oO(i);
        int[] iArr = this.f27094OooOo0o;
        int i2 = iArr[i];
        if (i < this.f27093OooOo - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f27093OooOo--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO0Oo();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f27094OooOo0o;
        System.arraycopy(iArr, i2, iArr, i, this.f27093OooOo - i2);
        this.f27093OooOo -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        OooO0Oo();
        OooO0oO(i);
        int[] iArr = this.f27094OooOo0o;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27093OooOo;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0o(((Integer) obj).intValue());
        return true;
    }
}
