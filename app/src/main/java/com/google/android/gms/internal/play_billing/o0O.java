package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class o0O extends oo00oO implements RandomAccess {

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final o0O f27071OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final Object[] f27072OooOoO0;

    /* renamed from: OooOo, reason: collision with root package name */
    public int f27073OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Object[] f27074OooOo0o;

    static {
        Object[] objArr = new Object[0];
        f27072OooOoO0 = objArr;
        f27071OooOoO = new o0O(objArr, 0, false);
    }

    public o0O(Object[] objArr, int i, boolean z) {
        super(z);
        this.f27074OooOo0o = objArr;
        this.f27073OooOo = i;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O00OOO
    public final /* bridge */ /* synthetic */ o0O00OOO OooO0OO(int i) {
        if (i >= this.f27073OooOo) {
            return new o0O(i == 0 ? f27072OooOoO0 : Arrays.copyOf(this.f27074OooOo0o, i), this.f27073OooOo, true);
        }
        throw new IllegalArgumentException();
    }

    public final void OooO0o0(int i) {
        if (i < 0 || i >= this.f27073OooOo) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, this.f27073OooOo, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        OooO0Oo();
        if (i < 0 || i > (i2 = this.f27073OooOo)) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, this.f27073OooOo, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.f27074OooOo0o;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC2183w4.OooOO0(length, 3, 2, 1, 10)];
            System.arraycopy(this.f27074OooOo0o, 0, objArr2, 0, i);
            System.arraycopy(this.f27074OooOo0o, i, objArr2, i3, this.f27073OooOo - i);
            this.f27074OooOo0o = objArr2;
        }
        this.f27074OooOo0o[i] = obj;
        this.f27073OooOo++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0o0(i);
        return this.f27074OooOo0o[i];
    }

    @Override // com.google.android.gms.internal.play_billing.oo00oO, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO0Oo();
        OooO0o0(i);
        Object[] objArr = this.f27074OooOo0o;
        Object obj = objArr[i];
        if (i < this.f27073OooOo - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f27073OooOo--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooO0Oo();
        OooO0o0(i);
        Object[] objArr = this.f27074OooOo0o;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27073OooOo;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        OooO0Oo();
        int i = this.f27073OooOo;
        int length = this.f27074OooOo0o.length;
        if (i == length) {
            this.f27074OooOo0o = Arrays.copyOf(this.f27074OooOo0o, AbstractC2183w4.OooOO0(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f27074OooOo0o;
        int i2 = this.f27073OooOo;
        this.f27073OooOo = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
