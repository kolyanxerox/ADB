package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class io0 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f20076OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int[] f20077OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f20078OooOo0o;

    public io0(int[] iArr, int i, int i2) {
        this.f20077OooOo0O = iArr;
        this.f20078OooOo0o = i;
        this.f20076OooOo = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f20078OooOo0o;
        while (true) {
            if (i >= this.f20076OooOo) {
                i = -1;
                break;
            }
            if (this.f20077OooOo0O[i] == iIntValue) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof io0)) {
            return super.equals(obj);
        }
        io0 io0Var = (io0) obj;
        int i = io0Var.f20076OooOo;
        int i2 = io0Var.f20078OooOo0o;
        int i3 = i - i2;
        int i4 = this.f20076OooOo;
        int i5 = this.f20078OooOo0o;
        int i6 = i4 - i5;
        if (i3 != i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.f20077OooOo0O[i5 + i7] != io0Var.f20077OooOo0O[i2 + i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2 = this.f20076OooOo;
        int i3 = this.f20078OooOo0o;
        ii0.OooOO0O(i, i2 - i3);
        return Integer.valueOf(this.f20077OooOo0O[i3 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f20078OooOo0o; i2 < this.f20076OooOo; i2++) {
            i = (i * 31) + this.f20077OooOo0O[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i = this.f20078OooOo0o;
            int i2 = i;
            while (true) {
                if (i2 >= this.f20076OooOo) {
                    i2 = -1;
                    break;
                }
                if (this.f20077OooOo0O[i2] == iIntValue) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.f20076OooOo - 1;
            while (true) {
                i = this.f20078OooOo0o;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (this.f20077OooOo0O[i2] == iIntValue) {
                    break;
                }
                i2--;
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i2 = this.f20076OooOo;
        int i3 = this.f20078OooOo0o;
        Integer num = (Integer) obj;
        ii0.OooOO0O(i, i2 - i3);
        int i4 = i3 + i;
        int[] iArr = this.f20077OooOo0O;
        int i5 = iArr[i4];
        num.getClass();
        iArr[i4] = num.intValue();
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20076OooOo - this.f20078OooOo0o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.f20076OooOo;
        int i4 = this.f20078OooOo0o;
        ii0.OoooooO(i, i2, i3 - i4);
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i5 = i2 + i4;
        return new io0(this.f20077OooOo0O, i4 + i, i5);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.f20076OooOo;
        int i2 = this.f20078OooOo0o;
        StringBuilder sb = new StringBuilder((i - i2) * 5);
        sb.append('[');
        int[] iArr = this.f20077OooOo0O;
        sb.append(iArr[i2]);
        while (true) {
            i2++;
            if (i2 >= i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i2]);
        }
    }
}
