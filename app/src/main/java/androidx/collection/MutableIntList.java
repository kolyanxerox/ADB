package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.OooO;
import o00O0.OooO0O0;
import o00O0.OooOOO;

/* loaded from: classes.dex */
public final class MutableIntList extends IntList {
    public MutableIntList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableIntList._size;
        }
        mutableIntList.trim(i);
    }

    public final boolean add(int i) {
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i2 = this._size;
        iArr[i2] = i;
        this._size = i2 + 1;
        return true;
    }

    public final boolean addAll(int i, int[] elements) {
        int i2;
        OooOo.OooO0o0(elements, "elements");
        if (i < 0 || i > (i2 = this._size)) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index ", " must be in 0..");
            sbOooOOo0.append(this._size);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(i2 + elements.length);
        int[] iArr = this.content;
        int i3 = this._size;
        if (i != i3) {
            OooOOO.Oooo0(elements.length + i, i, iArr, iArr, i3);
        }
        OooOOO.Oooo0o(i, 0, elements, iArr, 12);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i) {
        int[] iArr = this.content;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            OooOo.OooO0Oo(iArrCopyOf, "copyOf(this, newSize)");
            this.content = iArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(int i) {
        remove(i);
    }

    public final void plusAssign(IntList elements) {
        OooOo.OooO0o0(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(int i) {
        int iIndexOf = indexOf(i);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(int[] elements) {
        OooOo.OooO0o0(elements, "elements");
        int i = this._size;
        for (int i2 : elements) {
            remove(i2);
        }
        return i != this._size;
    }

    public final int removeAt(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this._size)) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index ", " must be in 0..");
            sbOooOOo0.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
        int[] iArr = this.content;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            OooOOO.Oooo0(i, i + 1, iArr, iArr, i2);
        }
        this._size--;
        return i3;
    }

    public final void removeRange(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this._size) || i2 < 0 || i2 > i3) {
            StringBuilder sbOooOo0o = OooO0oO.OooOo.OooOo0o("Start (", i, ") and end (", i2, ") must be in 0..");
            sbOooOo0o.append(this._size);
            throw new IndexOutOfBoundsException(sbOooOo0o.toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                int[] iArr = this.content;
                OooOOO.Oooo0(i, i2, iArr, iArr, i3);
            }
            this._size -= i2 - i;
        }
    }

    public final boolean retainAll(int[] elements) {
        OooOo.OooO0o0(elements, "elements");
        int i = this._size;
        int[] iArr = this.content;
        int i2 = i - 1;
        while (true) {
            int i3 = 0;
            int i4 = -1;
            if (-1 >= i2) {
                break;
            }
            int i5 = iArr[i2];
            int length = elements.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (elements[i3] == i5) {
                    i4 = i3;
                    break;
                }
                i3++;
            }
            if (i4 < 0) {
                removeAt(i2);
            }
            i2--;
        }
        return i != this._size;
    }

    public final int set(int i, int i2) {
        if (i < 0 || i >= this._size) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "set index ", " must be between 0 .. ");
            sbOooOOo0.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
        int[] iArr = this.content;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public final void sort() {
        int[] iArr = this.content;
        int i = this._size;
        OooOo.OooO0o0(iArr, "<this>");
        Arrays.sort(iArr, 0, i);
    }

    public final void sortDescending() {
        int[] iArr = this.content;
        int i = this._size;
        OooOo.OooO0o0(iArr, "<this>");
        Arrays.sort(iArr, 0, i);
        OooO0O0 oooO0O0 = OooO.Companion;
        int length = iArr.length;
        oooO0O0.getClass();
        OooO0O0.OooO0OO(0, i, length);
        int i2 = i / 2;
        if (i2 == 0) {
            return;
        }
        int i3 = i - 1;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = iArr[i4];
            iArr[i4] = iArr[i3];
            iArr[i3] = i5;
            i3--;
        }
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this._size);
        int[] iArr = this.content;
        if (iArr.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            OooOo.OooO0Oo(iArrCopyOf, "copyOf(this, newSize)");
            this.content = iArrCopyOf;
        }
    }

    public /* synthetic */ MutableIntList(int i, int i2, OooOO0O oooOO0O) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(int[] elements) {
        OooOo.OooO0o0(elements, "elements");
        for (int i : elements) {
            remove(i);
        }
    }

    public final void plusAssign(int[] elements) {
        OooOo.OooO0o0(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableIntList(int i) {
        super(i, null);
    }

    public final void plusAssign(int i) {
        add(i);
    }

    public final void add(int i, int i2) {
        int i3;
        if (i >= 0 && i <= (i3 = this._size)) {
            ensureCapacity(i3 + 1);
            int[] iArr = this.content;
            int i4 = this._size;
            if (i != i4) {
                OooOOO.Oooo0(i + 1, i, iArr, iArr, i4);
            }
            iArr[i] = i2;
            this._size++;
            return;
        }
        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index ", " must be in 0..");
        sbOooOOo0.append(this._size);
        throw new IndexOutOfBoundsException(sbOooOOo0.toString());
    }

    public final void minusAssign(IntList elements) {
        OooOo.OooO0o0(elements, "elements");
        int[] iArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(iArr[i2]);
        }
    }

    public final boolean removeAll(IntList elements) {
        OooOo.OooO0o0(elements, "elements");
        int i = this._size;
        int i2 = elements._size - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(elements.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(IntList elements) {
        OooOo.OooO0o0(elements, "elements");
        int i = this._size;
        int[] iArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!elements.contains(iArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(int i, IntList elements) {
        OooOo.OooO0o0(elements, "elements");
        if (i >= 0 && i <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            int[] iArr = this.content;
            int i2 = this._size;
            if (i != i2) {
                OooOOO.Oooo0(elements._size + i, i, iArr, iArr, i2);
            }
            OooOOO.Oooo0(i, 0, elements.content, iArr, elements._size);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index ", " must be in 0..");
        sbOooOOo0.append(this._size);
        throw new IndexOutOfBoundsException(sbOooOOo0.toString());
    }

    public final boolean addAll(IntList elements) {
        OooOo.OooO0o0(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(int[] elements) {
        OooOo.OooO0o0(elements, "elements");
        return addAll(this._size, elements);
    }
}
