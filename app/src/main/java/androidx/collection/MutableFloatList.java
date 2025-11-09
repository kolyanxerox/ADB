package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.OooO;
import o00O0.OooO0O0;
import o00O0.OooOOO;

/* loaded from: classes.dex */
public final class MutableFloatList extends FloatList {
    public MutableFloatList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableFloatList._size;
        }
        mutableFloatList.trim(i);
    }

    public final boolean add(float f) {
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i = this._size;
        fArr[i] = f;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(int i, float[] elements) {
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
        float[] fArr = this.content;
        int i3 = this._size;
        if (i != i3) {
            OooOOO.Oooo0OO(fArr, elements.length + i, fArr, i, i3);
        }
        OooOOO.Oooo0OO(elements, i, fArr, 0, elements.length);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i) {
        float[] fArr = this.content;
        if (fArr.length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
            OooOo.OooO0Oo(fArrCopyOf, "copyOf(this, newSize)");
            this.content = fArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(float f) {
        remove(f);
    }

    public final void plusAssign(FloatList elements) {
        OooOo.OooO0o0(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(float f) {
        int iIndexOf = indexOf(f);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(float[] elements) {
        OooOo.OooO0o0(elements, "elements");
        int i = this._size;
        for (float f : elements) {
            remove(f);
        }
        return i != this._size;
    }

    public final float removeAt(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this._size)) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index ", " must be in 0..");
            sbOooOOo0.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
        float[] fArr = this.content;
        float f = fArr[i];
        if (i != i2 - 1) {
            OooOOO.Oooo0OO(fArr, i, fArr, i + 1, i2);
        }
        this._size--;
        return f;
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
                float[] fArr = this.content;
                OooOOO.Oooo0OO(fArr, i, fArr, i2, i3);
            }
            this._size -= i2 - i;
        }
    }

    public final boolean retainAll(float[] elements) {
        OooOo.OooO0o0(elements, "elements");
        int i = this._size;
        float[] fArr = this.content;
        int i2 = i - 1;
        while (true) {
            int i3 = 0;
            int i4 = -1;
            if (-1 >= i2) {
                break;
            }
            float f = fArr[i2];
            int length = elements.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (elements[i3] == f) {
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

    public final float set(int i, float f) {
        if (i < 0 || i >= this._size) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "set index ", " must be between 0 .. ");
            sbOooOOo0.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbOooOOo0.toString());
        }
        float[] fArr = this.content;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public final void sort() {
        float[] fArr = this.content;
        int i = this._size;
        OooOo.OooO0o0(fArr, "<this>");
        Arrays.sort(fArr, 0, i);
    }

    public final void sortDescending() {
        float[] fArr = this.content;
        int i = this._size;
        OooOo.OooO0o0(fArr, "<this>");
        Arrays.sort(fArr, 0, i);
        OooO0O0 oooO0O0 = OooO.Companion;
        int length = fArr.length;
        oooO0O0.getClass();
        OooO0O0.OooO0OO(0, i, length);
        int i2 = i / 2;
        if (i2 == 0) {
            return;
        }
        int i3 = i - 1;
        for (int i4 = 0; i4 < i2; i4++) {
            float f = fArr[i4];
            fArr[i4] = fArr[i3];
            fArr[i3] = f;
            i3--;
        }
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this._size);
        float[] fArr = this.content;
        if (fArr.length > iMax) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, iMax);
            OooOo.OooO0Oo(fArrCopyOf, "copyOf(this, newSize)");
            this.content = fArrCopyOf;
        }
    }

    public /* synthetic */ MutableFloatList(int i, int i2, OooOO0O oooOO0O) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(float[] elements) {
        OooOo.OooO0o0(elements, "elements");
        for (float f : elements) {
            remove(f);
        }
    }

    public final void plusAssign(float[] elements) {
        OooOo.OooO0o0(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableFloatList(int i) {
        super(i, null);
    }

    public final void plusAssign(float f) {
        add(f);
    }

    public final void add(int i, float f) {
        int i2;
        if (i >= 0 && i <= (i2 = this._size)) {
            ensureCapacity(i2 + 1);
            float[] fArr = this.content;
            int i3 = this._size;
            if (i != i3) {
                OooOOO.Oooo0OO(fArr, i + 1, fArr, i, i3);
            }
            fArr[i] = f;
            this._size++;
            return;
        }
        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index ", " must be in 0..");
        sbOooOOo0.append(this._size);
        throw new IndexOutOfBoundsException(sbOooOOo0.toString());
    }

    public final void minusAssign(FloatList elements) {
        OooOo.OooO0o0(elements, "elements");
        float[] fArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(fArr[i2]);
        }
    }

    public final boolean removeAll(FloatList elements) {
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

    public final boolean retainAll(FloatList elements) {
        OooOo.OooO0o0(elements, "elements");
        int i = this._size;
        float[] fArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!elements.contains(fArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(int i, FloatList elements) {
        OooOo.OooO0o0(elements, "elements");
        if (i >= 0 && i <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            float[] fArr = this.content;
            int i2 = this._size;
            if (i != i2) {
                OooOOO.Oooo0OO(fArr, elements._size + i, fArr, i, i2);
            }
            OooOOO.Oooo0OO(elements.content, i, fArr, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index ", " must be in 0..");
        sbOooOOo0.append(this._size);
        throw new IndexOutOfBoundsException(sbOooOOo0.toString());
    }

    public final boolean addAll(FloatList elements) {
        OooOo.OooO0o0(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(float[] elements) {
        OooOo.OooO0o0(elements, "elements");
        return addAll(this._size, elements);
    }
}
