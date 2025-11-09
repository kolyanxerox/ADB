package androidx.collection;

import com.ironsource.C3034d9;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;
import o00O0o0O.o00Ooo;
import o00Oo0oo.o00oO0o;

/* loaded from: classes.dex */
public abstract class LongList {
    public int _size;
    public long[] content;

    public /* synthetic */ LongList(int i, OooOO0O oooOO0O) {
        this(i);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return longList.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean contains(long j) {
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (jArr[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(LongList elements) {
        OooOo.OooO0o0(elements, "elements");
        o00Ooo o00oooOooOOOO = o00oO0o.OooOOOO(0, elements._size);
        int i = o00oooOooOOOO.f31437OooOo0O;
        int i2 = o00oooOooOOOO.f31438OooOo0o;
        if (i > i2) {
            return true;
        }
        while (contains(elements.get(i))) {
            if (i == i2) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final int count() {
        return this._size;
    }

    public final long elementAt(int i) {
        if (i >= 0 && i < this._size) {
            return this.content[i];
        }
        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index ", " must be in 0..");
        sbOooOOo0.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbOooOOo0.toString());
    }

    public final long elementAtOrElse(int i, Oooo000 defaultValue) {
        OooOo.OooO0o0(defaultValue, "defaultValue");
        return (i < 0 || i >= this._size) ? ((Number) defaultValue.invoke(Integer.valueOf(i))).longValue() : this.content[i];
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongList) {
            LongList longList = (LongList) obj;
            int i = longList._size;
            int i2 = this._size;
            if (i == i2) {
                long[] jArr = this.content;
                long[] jArr2 = longList.content;
                o00Ooo o00oooOooOOOO = o00oO0o.OooOOOO(0, i2);
                int i3 = o00oooOooOOOO.f31437OooOo0O;
                int i4 = o00oooOooOOOO.f31438OooOo0o;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final long first() {
        if (isEmpty()) {
            throw new NoSuchElementException("LongList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R r, o00O0O operation) {
        OooOo.OooO0o0(operation, "operation");
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = (R) operation.invoke(r, Long.valueOf(jArr[i2]));
        }
        return r;
    }

    public final <R> R foldIndexed(R r, o00Oo0 operation) {
        OooOo.OooO0o0(operation, "operation");
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            R r2 = r;
            r = (R) operation.invoke(Integer.valueOf(i2), r2, Long.valueOf(jArr[i2]));
        }
        return r;
    }

    public final <R> R foldRight(R r, o00O0O operation) {
        OooOo.OooO0o0(operation, "operation");
        long[] jArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = (R) operation.invoke(Long.valueOf(jArr[i]), r);
        }
    }

    public final <R> R foldRightIndexed(R r, o00Oo0 operation) {
        OooOo.OooO0o0(operation, "operation");
        long[] jArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = (R) operation.invoke(Integer.valueOf(i), Long.valueOf(jArr[i]), r);
        }
    }

    public final void forEach(Oooo000 block) {
        OooOo.OooO0o0(block, "block");
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(Long.valueOf(jArr[i2]));
        }
    }

    public final void forEachIndexed(o00O0O block) {
        OooOo.OooO0o0(block, "block");
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i2]));
        }
    }

    public final void forEachReversed(Oooo000 block) {
        OooOo.OooO0o0(block, "block");
        long[] jArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Long.valueOf(jArr[i]));
            }
        }
    }

    public final void forEachReversedIndexed(o00O0O block) {
        OooOo.OooO0o0(block, "block");
        long[] jArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Integer.valueOf(i), Long.valueOf(jArr[i]));
            }
        }
    }

    public final long get(int i) {
        if (i >= 0 && i < this._size) {
            return this.content[i];
        }
        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index ", " must be in 0..");
        sbOooOOo0.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbOooOOo0.toString());
    }

    public final o00Ooo getIndices() {
        return o00oO0o.OooOOOO(0, this._size);
    }

    public final int getLastIndex() {
        return this._size - 1;
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        long[] jArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(long j) {
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (j == jArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfFirst(Oooo000 predicate) {
        OooOo.OooO0o0(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i2]))).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(Oooo000 predicate) {
        OooOo.OooO0o0(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(Long.valueOf(jArr[i]))).booleanValue());
        return i;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final long last() {
        if (isEmpty()) {
            throw new NoSuchElementException("LongList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(long j) {
        long[] jArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (jArr[i] != j);
        return i;
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(Oooo000 predicate) {
        OooOo.OooO0o0(predicate, "predicate");
        long[] jArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, C3034d9.i.f8177d, C3034d9.i.f8179e, 0, null, 25, null);
    }

    private LongList(int i) {
        this.content = i == 0 ? LongSetKt.getEmptyLongArray() : new long[i];
    }

    public final boolean any(Oooo000 predicate) {
        OooOo.OooO0o0(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i2]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(Oooo000 predicate) {
        OooOo.OooO0o0(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i3]))).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public final String joinToString(CharSequence separator) {
        OooOo.OooO0o0(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        OooOo.OooO0o0(separator, "separator");
        OooOo.OooO0o0(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final long first(Oooo000 predicate) {
        OooOo.OooO0o0(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (((Boolean) predicate.invoke(Long.valueOf(j))).booleanValue()) {
                return j;
            }
        }
        throw new NoSuchElementException("LongList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        OooOo.OooO0o0(separator, "separator");
        OooOo.OooO0o0(prefix, "prefix");
        OooOo.OooO0o0(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence charSequence, Oooo000 oooo000, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                separator = ", ";
            }
            if ((i2 & 2) != 0) {
                prefix = "";
            }
            if ((i2 & 4) != 0) {
                postfix = "";
            }
            if ((i2 & 8) != 0) {
                i = -1;
            }
            if ((i2 & 16) != 0) {
                charSequence = "...";
            }
            OooOo.OooO0o0(separator, "separator");
            OooOo.OooO0o0(prefix, "prefix");
            OooOo.OooO0o0(postfix, "postfix");
            StringBuilder sbOooOo00 = OooO0oO.OooOo.OooOo00(charSequence, "truncated", oooo000, "transform", prefix);
            long[] jArr = longList.content;
            int i3 = longList._size;
            int i4 = 0;
            while (true) {
                if (i4 < i3) {
                    long j = jArr[i4];
                    if (i4 == i) {
                        sbOooOo00.append(charSequence);
                        break;
                    }
                    if (i4 != 0) {
                        sbOooOo00.append(separator);
                    }
                    sbOooOo00.append((CharSequence) oooo000.invoke(Long.valueOf(j)));
                    i4++;
                } else {
                    sbOooOo00.append(postfix);
                    break;
                }
            }
            String string = sbOooOo00.toString();
            OooOo.OooO0Oo(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i) {
        OooOo.OooO0o0(separator, "separator");
        OooOo.OooO0o0(prefix, "prefix");
        OooOo.OooO0o0(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i, null, 16, null);
    }

    public final long last(Oooo000 predicate) {
        long j;
        OooOo.OooO0o0(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 < i) {
                j = jArr[i];
            } else {
                throw new NoSuchElementException("LongList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(Long.valueOf(j))).booleanValue());
        return j;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i, CharSequence charSequence2) {
        OooOo.OooO0o0(separator, "separator");
        OooOo.OooO0o0(prefix, "prefix");
        StringBuilder sbOooOOoo = OooO0oO.OooOo.OooOOoo(charSequence, "postfix", charSequence2, "truncated", prefix);
        long[] jArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                long j = jArr[i3];
                if (i3 == i) {
                    sbOooOOoo.append(charSequence2);
                    break;
                }
                if (i3 != 0) {
                    sbOooOOoo.append(separator);
                }
                sbOooOOoo.append(j);
                i3++;
            } else {
                sbOooOOoo.append(charSequence);
                break;
            }
        }
        String string = sbOooOOoo.toString();
        OooOo.OooO0Oo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence charSequence, Oooo000 oooo000) {
        OooOo.OooO0o0(separator, "separator");
        OooOo.OooO0o0(prefix, "prefix");
        OooOo.OooO0o0(postfix, "postfix");
        StringBuilder sbOooOo00 = OooO0oO.OooOo.OooOo00(charSequence, "truncated", oooo000, "transform", prefix);
        long[] jArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                long j = jArr[i3];
                if (i3 == i) {
                    sbOooOo00.append(charSequence);
                    break;
                }
                if (i3 != 0) {
                    sbOooOo00.append(separator);
                }
                sbOooOo00.append((CharSequence) oooo000.invoke(Long.valueOf(j)));
                i3++;
            } else {
                sbOooOo00.append(postfix);
                break;
            }
        }
        String string = sbOooOo00.toString();
        OooOo.OooO0Oo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i, Oooo000 oooo000) {
        OooOo.OooO0o0(separator, "separator");
        OooOo.OooO0o0(prefix, "prefix");
        StringBuilder sbOooOo00 = OooO0oO.OooOo.OooOo00(charSequence, "postfix", oooo000, "transform", prefix);
        long[] jArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                long j = jArr[i3];
                if (i3 == i) {
                    sbOooOo00.append((CharSequence) "...");
                    break;
                }
                if (i3 != 0) {
                    sbOooOo00.append(separator);
                }
                sbOooOo00.append((CharSequence) oooo000.invoke(Long.valueOf(j)));
                i3++;
            } else {
                sbOooOo00.append(charSequence);
                break;
            }
        }
        String string = sbOooOo00.toString();
        OooOo.OooO0Oo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, Oooo000 oooo000) {
        OooOo.OooO0o0(separator, "separator");
        OooOo.OooO0o0(prefix, "prefix");
        StringBuilder sbOooOo00 = OooO0oO.OooOo.OooOo00(charSequence, "postfix", oooo000, "transform", prefix);
        long[] jArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                long j = jArr[i2];
                if (i2 == -1) {
                    sbOooOo00.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sbOooOo00.append(separator);
                }
                sbOooOo00.append((CharSequence) oooo000.invoke(Long.valueOf(j)));
                i2++;
            } else {
                sbOooOo00.append(charSequence);
                break;
            }
        }
        String string = sbOooOo00.toString();
        OooOo.OooO0Oo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence charSequence, Oooo000 oooo000) {
        OooOo.OooO0o0(separator, "separator");
        StringBuilder sbOooOo00 = OooO0oO.OooOo.OooOo00(charSequence, "prefix", oooo000, "transform", charSequence);
        long[] jArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                long j = jArr[i2];
                if (i2 == -1) {
                    sbOooOo00.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sbOooOo00.append(separator);
                }
                sbOooOo00.append((CharSequence) oooo000.invoke(Long.valueOf(j)));
                i2++;
            } else {
                sbOooOo00.append((CharSequence) "");
                break;
            }
        }
        String string = sbOooOo00.toString();
        OooOo.OooO0Oo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, Oooo000 transform) {
        OooOo.OooO0o0(separator, "separator");
        OooOo.OooO0o0(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        long[] jArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                long j = jArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j)));
                i2++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        OooOo.OooO0Oo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(Oooo000 transform) {
        OooOo.OooO0o0(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        long[] jArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                long j = jArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j)));
                i2++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        OooOo.OooO0Oo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
