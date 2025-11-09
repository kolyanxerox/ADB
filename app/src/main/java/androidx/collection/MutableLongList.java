package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.OooO;
import o00O0.OooO0O0;
import o00O0.OooOOO;

/* loaded from: classes.dex */
public final class MutableLongList extends LongList {
    public MutableLongList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableLongList._size;
        }
        mutableLongList.trim(i);
    }

    public final boolean add(long j) {
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i = this._size;
        jArr[i] = j;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(int i, long[] elements) {
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
        long[] jArr = this.content;
        int i3 = this._size;
        if (i != i3) {
            OooOOO.Oooo0o0(jArr, jArr, elements.length + i, i, i3);
        }
        OooOOO.Oooo0o0(elements, jArr, i, 0, elements.length);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i) {
        long[] jArr = this.content;
        if (jArr.length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            OooOo.OooO0Oo(jArrCopyOf, "copyOf(this, newSize)");
            this.content = jArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(long j) {
        remove(j);
    }

    public final void plusAssign(LongList elements) {
        OooOo.OooO0o0(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(long j) {
        int iIndexOf = indexOf(j);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(long[] elements) {
        OooOo.OooO0o0(elements, "elements");
        int i = this._size;
        for (long j : elements) {
            remove(j);
        }
        return i != this._size;
    }

    public final long removeAt(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this._size)) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index ", " must be in 0..");
            sbOooOOo0.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
        long[] jArr = this.content;
        long j = jArr[i];
        if (i != i2 - 1) {
            OooOOO.Oooo0o0(jArr, jArr, i, i + 1, i2);
        }
        this._size--;
        return j;
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
                long[] jArr = this.content;
                OooOOO.Oooo0o0(jArr, jArr, i, i2, i3);
            }
            this._size -= i2 - i;
        }
    }

    public final boolean retainAll(long[] elements) {
        OooOo.OooO0o0(elements, "elements");
        int i = this._size;
        long[] jArr = this.content;
        int i2 = i - 1;
        while (true) {
            int i3 = 0;
            int i4 = -1;
            if (-1 >= i2) {
                break;
            }
            long j = jArr[i2];
            int length = elements.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (elements[i3] == j) {
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

    public final long set(int i, long j) {
        if (i < 0 || i >= this._size) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "set index ", " must be between 0 .. ");
            sbOooOOo0.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
        long[] jArr = this.content;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public final void sort() {
        long[] jArr = this.content;
        int i = this._size;
        OooOo.OooO0o0(jArr, "<this>");
        Arrays.sort(jArr, 0, i);
    }

    public final void sortDescending() {
        long[] jArr = this.content;
        int i = this._size;
        OooOo.OooO0o0(jArr, "<this>");
        Arrays.sort(jArr, 0, i);
        OooO0O0 oooO0O0 = OooO.Companion;
        int length = jArr.length;
        oooO0O0.getClass();
        OooO0O0.OooO0OO(0, i, length);
        int i2 = i / 2;
        if (i2 == 0) {
            return;
        }
        int i3 = i - 1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j = jArr[i4];
            jArr[i4] = jArr[i3];
            jArr[i3] = j;
            i3--;
        }
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this._size);
        long[] jArr = this.content;
        if (jArr.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            OooOo.OooO0Oo(jArrCopyOf, "copyOf(this, newSize)");
            this.content = jArrCopyOf;
        }
    }

    public /* synthetic */ MutableLongList(int i, int i2, OooOO0O oooOO0O) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(long[] elements) {
        OooOo.OooO0o0(elements, "elements");
        for (long j : elements) {
            remove(j);
        }
    }

    public final void plusAssign(long[] elements) {
        OooOo.OooO0o0(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableLongList(int i) {
        super(i, null);
    }

    public final void plusAssign(long j) {
        add(j);
    }

    public final void add(int i, long j) {
        int i2;
        if (i >= 0 && i <= (i2 = this._size)) {
            ensureCapacity(i2 + 1);
            long[] jArr = this.content;
            int i3 = this._size;
            if (i != i3) {
                OooOOO.Oooo0o0(jArr, jArr, i + 1, i, i3);
            }
            jArr[i] = j;
            this._size++;
            return;
        }
        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index ", " must be in 0..");
        sbOooOOo0.append(this._size);
        throw new IndexOutOfBoundsException(sbOooOOo0.toString());
    }

    public final void minusAssign(LongList elements) {
        OooOo.OooO0o0(elements, "elements");
        long[] jArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(jArr[i2]);
        }
    }

    public final boolean removeAll(LongList elements) {
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

    public final boolean retainAll(LongList elements) {
        OooOo.OooO0o0(elements, "elements");
        int i = this._size;
        long[] jArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!elements.contains(jArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(int i, LongList elements) {
        OooOo.OooO0o0(elements, "elements");
        if (i >= 0 && i <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            long[] jArr = this.content;
            int i2 = this._size;
            if (i != i2) {
                OooOOO.Oooo0o0(jArr, jArr, elements._size + i, i, i2);
            }
            OooOOO.Oooo0o0(elements.content, jArr, i, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index ", " must be in 0..");
        sbOooOOo0.append(this._size);
        throw new IndexOutOfBoundsException(sbOooOOo0.toString());
    }

    public final boolean addAll(LongList elements) {
        OooOo.OooO0o0(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(long[] elements) {
        OooOo.OooO0o0(elements, "elements");
        return addAll(this._size, elements);
    }
}
