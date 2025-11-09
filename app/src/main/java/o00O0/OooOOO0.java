package o00O0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class OooOOO0 extends OooOO0 {

    /* renamed from: OooOoO0 */
    public static final Object[] f31240OooOoO0 = new Object[0];

    /* renamed from: OooOo */
    public int f31241OooOo;

    /* renamed from: OooOo0O */
    public int f31242OooOo0O;

    /* renamed from: OooOo0o */
    public Object[] f31243OooOo0o = f31240OooOoO0;

    public final void OooO(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f31243OooOo0o.length;
        while (i < length && it.hasNext()) {
            this.f31243OooOo0o[i] = it.next();
            i++;
        }
        int i2 = this.f31242OooOo0O;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f31243OooOo0o[i3] = it.next();
        }
        this.f31241OooOo = collection.size() + this.f31241OooOo;
    }

    @Override // o00O0.OooOO0
    public final int OooO0o() {
        return this.f31241OooOo;
    }

    @Override // o00O0.OooOO0
    public final Object OooO0oO(int i) {
        OooO0O0 oooO0O0 = OooO.Companion;
        int i2 = this.f31241OooOo;
        oooO0O0.getClass();
        OooO0O0.OooO00o(i, i2);
        if (i == OooOo.OooOOo0(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        OooOOOO();
        int iOooOOO = OooOOO(this.f31242OooOo0O + i);
        Object[] objArr = this.f31243OooOo0o;
        Object obj = objArr[iOooOOO];
        if (i < (this.f31241OooOo >> 1)) {
            int i3 = this.f31242OooOo0O;
            if (iOooOOO >= i3) {
                OooOOO.Oooo00o(i3 + 1, i3, iOooOOO, objArr, objArr);
            } else {
                OooOOO.Oooo00o(1, 0, iOooOOO, objArr, objArr);
                Object[] objArr2 = this.f31243OooOo0o;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f31242OooOo0O;
                OooOOO.Oooo00o(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f31243OooOo0o;
            int i5 = this.f31242OooOo0O;
            objArr3[i5] = null;
            this.f31242OooOo0O = OooOO0O(i5);
        } else {
            int iOooOOO2 = OooOOO(OooOo.OooOOo0(this) + this.f31242OooOo0O);
            if (iOooOOO <= iOooOOO2) {
                Object[] objArr4 = this.f31243OooOo0o;
                OooOOO.Oooo00o(iOooOOO, iOooOOO + 1, iOooOOO2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f31243OooOo0o;
                OooOOO.Oooo00o(iOooOOO, iOooOOO + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f31243OooOo0o;
                objArr6[objArr6.length - 1] = objArr6[0];
                OooOOO.Oooo00o(0, 1, iOooOOO2 + 1, objArr6, objArr6);
            }
            this.f31243OooOo0o[iOooOOO2] = null;
        }
        this.f31241OooOo--;
        return obj;
    }

    public final void OooOO0(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f31243OooOo0o;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f31240OooOoO0) {
            if (i < 10) {
                i = 10;
            }
            this.f31243OooOo0o = new Object[i];
            return;
        }
        OooO0O0 oooO0O0 = OooO.Companion;
        int length = objArr.length;
        oooO0O0.getClass();
        Object[] objArr2 = new Object[OooO0O0.OooO0Oo(length, i)];
        Object[] objArr3 = this.f31243OooOo0o;
        OooOOO.Oooo00o(0, this.f31242OooOo0O, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.f31243OooOo0o;
        int length2 = objArr4.length;
        int i2 = this.f31242OooOo0O;
        OooOOO.Oooo00o(length2 - i2, 0, i2, objArr4, objArr2);
        this.f31242OooOo0O = 0;
        this.f31243OooOo0o = objArr2;
    }

    public final int OooOO0O(int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(this.f31243OooOo0o, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int OooOO0o(int i) {
        return i < 0 ? i + this.f31243OooOo0o.length : i;
    }

    public final int OooOOO(int i) {
        Object[] objArr = this.f31243OooOo0o;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void OooOOO0(int i, int i2) {
        if (i < i2) {
            OooOOO.OoooO00(this.f31243OooOo0o, null, i, i2);
            return;
        }
        Object[] objArr = this.f31243OooOo0o;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        OooOOO.OoooO00(this.f31243OooOo0o, null, 0, i2);
    }

    public final void OooOOOO() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.OooOo.OooO0o0(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        OooOOOO();
        OooOO0(elements.size() + OooO0o());
        OooO(OooOOO(OooO0o() + this.f31242OooOo0O), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        OooOOOO();
        OooOO0(this.f31241OooOo + 1);
        int length = this.f31242OooOo0O;
        if (length == 0) {
            Object[] objArr = this.f31243OooOo0o;
            kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f31242OooOo0O = i;
        this.f31243OooOo0o[i] = obj;
        this.f31241OooOo++;
    }

    public final void addLast(Object obj) {
        OooOOOO();
        OooOO0(OooO0o() + 1);
        this.f31243OooOo0o[OooOOO(OooO0o() + this.f31242OooOo0O)] = obj;
        this.f31241OooOo = OooO0o() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            OooOOOO();
            OooOOO0(this.f31242OooOo0O, OooOOO(OooO0o() + this.f31242OooOo0O));
        }
        this.f31242OooOo0O = 0;
        this.f31241OooOo = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0O0 oooO0O0 = OooO.Companion;
        int i2 = this.f31241OooOo;
        oooO0O0.getClass();
        OooO0O0.OooO00o(i, i2);
        return this.f31243OooOo0o[OooOOO(this.f31242OooOo0O + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iOooOOO = OooOOO(OooO0o() + this.f31242OooOo0O);
        int length = this.f31242OooOo0O;
        if (length < iOooOOO) {
            while (length < iOooOOO) {
                if (kotlin.jvm.internal.OooOo.OooO00o(obj, this.f31243OooOo0o[length])) {
                    i = this.f31242OooOo0O;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iOooOOO) {
            return -1;
        }
        int length2 = this.f31243OooOo0o.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iOooOOO; i2++) {
                    if (kotlin.jvm.internal.OooOo.OooO00o(obj, this.f31243OooOo0o[i2])) {
                        length = i2 + this.f31243OooOo0o.length;
                        i = this.f31242OooOo0O;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.OooOo.OooO00o(obj, this.f31243OooOo0o[length])) {
                i = this.f31242OooOo0O;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return OooO0o() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iOooOOO = OooOOO(this.f31241OooOo + this.f31242OooOo0O);
        int i2 = this.f31242OooOo0O;
        if (i2 < iOooOOO) {
            length = iOooOOO - 1;
            if (i2 <= length) {
                while (!kotlin.jvm.internal.OooOo.OooO00o(obj, this.f31243OooOo0o[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f31242OooOo0O;
                return length - i;
            }
            return -1;
        }
        if (i2 > iOooOOO) {
            int i3 = iOooOOO - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.f31243OooOo0o;
                    kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.f31242OooOo0O;
                    if (i4 <= length) {
                        while (!kotlin.jvm.internal.OooOo.OooO00o(obj, this.f31243OooOo0o[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f31242OooOo0O;
                    }
                } else {
                    if (kotlin.jvm.internal.OooOo.OooO00o(obj, this.f31243OooOo0o[i3])) {
                        length = i3 + this.f31243OooOo0o.length;
                        i = this.f31242OooOo0O;
                        break;
                    }
                    i3--;
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        OooO0oO(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iOooOOO;
        kotlin.jvm.internal.OooOo.OooO0o0(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f31243OooOo0o.length != 0) {
            int iOooOOO2 = OooOOO(this.f31241OooOo + this.f31242OooOo0O);
            int i = this.f31242OooOo0O;
            if (i < iOooOOO2) {
                iOooOOO = i;
                while (i < iOooOOO2) {
                    Object obj = this.f31243OooOo0o[i];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.f31243OooOo0o[iOooOOO] = obj;
                        iOooOOO++;
                    }
                    i++;
                }
                OooOOO.OoooO00(this.f31243OooOo0o, null, iOooOOO, iOooOOO2);
            } else {
                int length = this.f31243OooOo0o.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f31243OooOo0o;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f31243OooOo0o[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iOooOOO = OooOOO(i2);
                for (int i3 = 0; i3 < iOooOOO2; i3++) {
                    Object[] objArr2 = this.f31243OooOo0o;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f31243OooOo0o[iOooOOO] = obj3;
                        iOooOOO = OooOO0O(iOooOOO);
                    }
                }
                z = z2;
            }
            if (z) {
                OooOOOO();
                this.f31241OooOo = OooOO0o(iOooOOO - this.f31242OooOo0O);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        OooOOOO();
        Object[] objArr = this.f31243OooOo0o;
        int i = this.f31242OooOo0O;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f31242OooOo0O = OooOO0O(i);
        this.f31241OooOo = OooO0o() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        OooOOOO();
        int iOooOOO = OooOOO(OooOo.OooOOo0(this) + this.f31242OooOo0O);
        Object[] objArr = this.f31243OooOo0o;
        Object obj = objArr[iOooOOO];
        objArr[iOooOOO] = null;
        this.f31241OooOo = OooO0o() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO0O0 oooO0O0 = OooO.Companion;
        int i3 = this.f31241OooOo;
        oooO0O0.getClass();
        OooO0O0.OooO0OO(i, i2, i3);
        int i4 = i2 - i;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.f31241OooOo) {
            clear();
            return;
        }
        if (i4 == 1) {
            OooO0oO(i);
            return;
        }
        OooOOOO();
        if (i < this.f31241OooOo - i2) {
            int iOooOOO = OooOOO(this.f31242OooOo0O + (i - 1));
            int iOooOOO2 = OooOOO(this.f31242OooOo0O + (i2 - 1));
            while (i > 0) {
                int i5 = iOooOOO + 1;
                int iMin = Math.min(i, Math.min(i5, iOooOOO2 + 1));
                Object[] objArr = this.f31243OooOo0o;
                int i6 = iOooOOO2 - iMin;
                int i7 = iOooOOO - iMin;
                OooOOO.Oooo00o(i6 + 1, i7 + 1, i5, objArr, objArr);
                iOooOOO = OooOO0o(i7);
                iOooOOO2 = OooOO0o(i6);
                i -= iMin;
            }
            int iOooOOO3 = OooOOO(this.f31242OooOo0O + i4);
            OooOOO0(this.f31242OooOo0O, iOooOOO3);
            this.f31242OooOo0O = iOooOOO3;
        } else {
            int iOooOOO4 = OooOOO(this.f31242OooOo0O + i2);
            int iOooOOO5 = OooOOO(this.f31242OooOo0O + i);
            int i8 = this.f31241OooOo;
            while (true) {
                i8 -= i2;
                if (i8 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f31243OooOo0o;
                i2 = Math.min(i8, Math.min(objArr2.length - iOooOOO4, objArr2.length - iOooOOO5));
                Object[] objArr3 = this.f31243OooOo0o;
                int i9 = iOooOOO4 + i2;
                OooOOO.Oooo00o(iOooOOO5, iOooOOO4, i9, objArr3, objArr3);
                iOooOOO4 = OooOOO(i9);
                iOooOOO5 = OooOOO(iOooOOO5 + i2);
            }
            int iOooOOO6 = OooOOO(this.f31241OooOo + this.f31242OooOo0O);
            OooOOO0(OooOO0o(iOooOOO6 - i4), iOooOOO6);
        }
        this.f31241OooOo -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iOooOOO;
        kotlin.jvm.internal.OooOo.OooO0o0(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f31243OooOo0o.length != 0) {
            int iOooOOO2 = OooOOO(this.f31241OooOo + this.f31242OooOo0O);
            int i = this.f31242OooOo0O;
            if (i < iOooOOO2) {
                iOooOOO = i;
                while (i < iOooOOO2) {
                    Object obj = this.f31243OooOo0o[i];
                    if (elements.contains(obj)) {
                        this.f31243OooOo0o[iOooOOO] = obj;
                        iOooOOO++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                OooOOO.OoooO00(this.f31243OooOo0o, null, iOooOOO, iOooOOO2);
            } else {
                int length = this.f31243OooOo0o.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f31243OooOo0o;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.f31243OooOo0o[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iOooOOO = OooOOO(i2);
                for (int i3 = 0; i3 < iOooOOO2; i3++) {
                    Object[] objArr2 = this.f31243OooOo0o;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        this.f31243OooOo0o[iOooOOO] = obj3;
                        iOooOOO = OooOO0O(iOooOOO);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                OooOOOO();
                this.f31241OooOo = OooOO0o(iOooOOO - this.f31242OooOo0O);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooO0O0 oooO0O0 = OooO.Companion;
        int i2 = this.f31241OooOo;
        oooO0O0.getClass();
        OooO0O0.OooO00o(i, i2);
        int iOooOOO = OooOOO(this.f31242OooOo0O + i);
        Object[] objArr = this.f31243OooOo0o;
        Object obj2 = objArr[iOooOOO];
        objArr[iOooOOO] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[OooO0o()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        OooO0O0 oooO0O0 = OooO.Companion;
        int i2 = this.f31241OooOo;
        oooO0O0.getClass();
        OooO0O0.OooO0O0(i, i2);
        if (i == this.f31241OooOo) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        OooOOOO();
        OooOO0(this.f31241OooOo + 1);
        int iOooOOO = OooOOO(this.f31242OooOo0O + i);
        int i3 = this.f31241OooOo;
        if (i < ((i3 + 1) >> 1)) {
            if (iOooOOO == 0) {
                Object[] objArr = this.f31243OooOo0o;
                kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
                iOooOOO = objArr.length;
            }
            int i4 = iOooOOO - 1;
            int i5 = this.f31242OooOo0O;
            if (i5 == 0) {
                Object[] objArr2 = this.f31243OooOo0o;
                kotlin.jvm.internal.OooOo.OooO0o0(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.f31242OooOo0O;
            if (i4 >= i6) {
                Object[] objArr3 = this.f31243OooOo0o;
                objArr3[length] = objArr3[i6];
                OooOOO.Oooo00o(i6, i6 + 1, i4 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f31243OooOo0o;
                OooOOO.Oooo00o(i6 - 1, i6, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f31243OooOo0o;
                objArr5[objArr5.length - 1] = objArr5[0];
                OooOOO.Oooo00o(0, 1, i4 + 1, objArr5, objArr5);
            }
            this.f31243OooOo0o[i4] = obj;
            this.f31242OooOo0O = length;
        } else {
            int iOooOOO2 = OooOOO(i3 + this.f31242OooOo0O);
            if (iOooOOO < iOooOOO2) {
                Object[] objArr6 = this.f31243OooOo0o;
                OooOOO.Oooo00o(iOooOOO + 1, iOooOOO, iOooOOO2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f31243OooOo0o;
                OooOOO.Oooo00o(1, 0, iOooOOO2, objArr7, objArr7);
                Object[] objArr8 = this.f31243OooOo0o;
                objArr8[0] = objArr8[objArr8.length - 1];
                OooOOO.Oooo00o(iOooOOO + 1, iOooOOO, objArr8.length - 1, objArr8, objArr8);
            }
            this.f31243OooOo0o[iOooOOO] = obj;
        }
        this.f31241OooOo++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) throws NegativeArraySizeException {
        kotlin.jvm.internal.OooOo.OooO0o0(array, "array");
        int length = array.length;
        int i = this.f31241OooOo;
        if (length < i) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i);
            kotlin.jvm.internal.OooOo.OooO0OO(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        Object[] objArr = array;
        int iOooOOO = OooOOO(this.f31241OooOo + this.f31242OooOo0O);
        int i2 = this.f31242OooOo0O;
        if (i2 < iOooOOO) {
            OooOOO.Oooo0oO(this.f31243OooOo0o, objArr, 0, i2, iOooOOO, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f31243OooOo0o;
            OooOOO.Oooo00o(0, this.f31242OooOo0O, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f31243OooOo0o;
            OooOOO.Oooo00o(objArr3.length - this.f31242OooOo0O, 0, iOooOOO, objArr3, objArr);
        }
        int i3 = this.f31241OooOo;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.OooOo.OooO0o0(elements, "elements");
        OooO0O0 oooO0O0 = OooO.Companion;
        int i2 = this.f31241OooOo;
        oooO0O0.getClass();
        OooO0O0.OooO0O0(i, i2);
        if (elements.isEmpty()) {
            return false;
        }
        if (i == this.f31241OooOo) {
            return addAll(elements);
        }
        OooOOOO();
        OooOO0(elements.size() + this.f31241OooOo);
        int iOooOOO = OooOOO(this.f31241OooOo + this.f31242OooOo0O);
        int iOooOOO2 = OooOOO(this.f31242OooOo0O + i);
        int size = elements.size();
        if (i < ((this.f31241OooOo + 1) >> 1)) {
            int i3 = this.f31242OooOo0O;
            int length = i3 - size;
            if (iOooOOO2 < i3) {
                Object[] objArr = this.f31243OooOo0o;
                OooOOO.Oooo00o(length, i3, objArr.length, objArr, objArr);
                if (size >= iOooOOO2) {
                    Object[] objArr2 = this.f31243OooOo0o;
                    OooOOO.Oooo00o(objArr2.length - size, 0, iOooOOO2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f31243OooOo0o;
                    OooOOO.Oooo00o(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f31243OooOo0o;
                    OooOOO.Oooo00o(0, size, iOooOOO2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f31243OooOo0o;
                OooOOO.Oooo00o(length, i3, iOooOOO2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f31243OooOo0o;
                length += objArr6.length;
                int i4 = iOooOOO2 - i3;
                int length2 = objArr6.length - length;
                if (length2 >= i4) {
                    OooOOO.Oooo00o(length, i3, iOooOOO2, objArr6, objArr6);
                } else {
                    OooOOO.Oooo00o(length, i3, i3 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.f31243OooOo0o;
                    OooOOO.Oooo00o(0, this.f31242OooOo0O + length2, iOooOOO2, objArr7, objArr7);
                }
            }
            this.f31242OooOo0O = length;
            OooO(OooOO0o(iOooOOO2 - size), elements);
            return true;
        }
        int i5 = iOooOOO2 + size;
        if (iOooOOO2 < iOooOOO) {
            int i6 = size + iOooOOO;
            Object[] objArr8 = this.f31243OooOo0o;
            if (i6 <= objArr8.length) {
                OooOOO.Oooo00o(i5, iOooOOO2, iOooOOO, objArr8, objArr8);
            } else if (i5 >= objArr8.length) {
                OooOOO.Oooo00o(i5 - objArr8.length, iOooOOO2, iOooOOO, objArr8, objArr8);
            } else {
                int length3 = iOooOOO - (i6 - objArr8.length);
                OooOOO.Oooo00o(0, length3, iOooOOO, objArr8, objArr8);
                Object[] objArr9 = this.f31243OooOo0o;
                OooOOO.Oooo00o(i5, iOooOOO2, length3, objArr9, objArr9);
            }
        } else {
            Object[] objArr10 = this.f31243OooOo0o;
            OooOOO.Oooo00o(size, 0, iOooOOO, objArr10, objArr10);
            Object[] objArr11 = this.f31243OooOo0o;
            if (i5 >= objArr11.length) {
                OooOOO.Oooo00o(i5 - objArr11.length, iOooOOO2, objArr11.length, objArr11, objArr11);
            } else {
                OooOOO.Oooo00o(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                Object[] objArr12 = this.f31243OooOo0o;
                OooOOO.Oooo00o(i5, iOooOOO2, objArr12.length - size, objArr12, objArr12);
            }
        }
        OooO(iOooOOO2, elements);
        return true;
    }
}
