package androidx.collection;

import com.ironsource.C3034d9;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;
import o00O0o0O.o00Ooo;
import o00Oo0oo.o00oO0o;

/* loaded from: classes.dex */
public abstract class ObjectList<E> {
    public int _size;
    public Object[] content;

    /* renamed from: androidx.collection.ObjectList$toString$1 */
    public static final class C01571 extends Oooo000 implements o00O0Oo.Oooo000 {
        final /* synthetic */ ObjectList<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01571(ObjectList<E> objectList) {
            super(1);
            this.this$0 = objectList;
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((C01571) obj);
        }

        @Override // o00O0Oo.Oooo000
        public final CharSequence invoke(E e) {
            return e == this.this$0 ? "(this)" : String.valueOf(e);
        }
    }

    public /* synthetic */ ObjectList(int i, OooOO0O oooOO0O) {
        this(i);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, o00O0Oo.Oooo000 oooo000, int i2, Object obj) {
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
        if ((i2 & 32) != 0) {
            oooo000 = null;
        }
        CharSequence charSequence5 = charSequence4;
        o00O0Oo.Oooo000 oooo0002 = oooo000;
        return objectList.joinToString(charSequence, charSequence2, charSequence3, i, charSequence5, oooo0002);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public abstract List<E> asList();

    public final boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    public final boolean containsAll(E[] elements) {
        OooOo.OooO0o0(elements, "elements");
        for (E e : elements) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final E elementAt(int i) {
        if (i >= 0 && i < this._size) {
            return (E) this.content[i];
        }
        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i, "Index ", " must be in 0..");
        sbOooOOo0.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbOooOOo0.toString());
    }

    public final E elementAtOrElse(int i, o00O0Oo.Oooo000 defaultValue) {
        OooOo.OooO0o0(defaultValue, "defaultValue");
        return (i < 0 || i >= this._size) ? (E) defaultValue.invoke(Integer.valueOf(i)) : (E) this.content[i];
    }

    public boolean equals(Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i = objectList._size;
            int i2 = this._size;
            if (i == i2) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                o00Ooo o00oooOooOOOO = o00oO0o.OooOOOO(0, i2);
                int i3 = o00oooOooOOOO.f31437OooOo0O;
                int i4 = o00oooOooOOOO.f31438OooOo0o;
                if (i3 > i4) {
                    return true;
                }
                while (OooOo.OooO00o(objArr[i3], objArr2[i3])) {
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

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R r, o00O0O operation) {
        OooOo.OooO0o0(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = (R) operation.invoke(r, objArr[i2]);
        }
        return r;
    }

    public final <R> R foldIndexed(R r, o00Oo0 operation) {
        OooOo.OooO0o0(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = (R) operation.invoke(Integer.valueOf(i2), r, objArr[i2]);
        }
        return r;
    }

    public final <R> R foldRight(R r, o00O0O operation) {
        OooOo.OooO0o0(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = (R) operation.invoke(objArr[i], r);
        }
    }

    public final <R> R foldRightIndexed(R r, o00Oo0 operation) {
        OooOo.OooO0o0(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = (R) operation.invoke(Integer.valueOf(i), objArr[i], r);
        }
    }

    public final void forEach(o00O0Oo.Oooo000 block) {
        OooOo.OooO0o0(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(objArr[i2]);
        }
    }

    public final void forEachIndexed(o00O0O block) {
        OooOo.OooO0o0(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(Integer.valueOf(i2), objArr[i2]);
        }
    }

    public final void forEachReversed(o00O0Oo.Oooo000 block) {
        OooOo.OooO0o0(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(objArr[i]);
            }
        }
    }

    public final void forEachReversedIndexed(o00O0O block) {
        OooOo.OooO0o0(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Integer.valueOf(i), objArr[i]);
            }
        }
    }

    public final E get(int i) {
        if (i >= 0 && i < this._size) {
            return (E) this.content[i];
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
        Object[] objArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(E e) {
        int i = 0;
        if (e == null) {
            Object[] objArr = this.content;
            int i2 = this._size;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i3 = this._size;
        while (i < i3) {
            if (e.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int indexOfFirst(o00O0Oo.Oooo000 predicate) {
        OooOo.OooO0o0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) predicate.invoke(objArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(o00O0Oo.Oooo000 predicate) {
        OooOo.OooO0o0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(objArr[i])).booleanValue());
        return i;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final int lastIndexOf(E e) {
        if (e == null) {
            Object[] objArr = this.content;
            for (int i = this._size - 1; -1 < i; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i2 = this._size - 1; -1 < i2; i2--) {
                if (e.equals(objArr2[i2])) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(o00O0Oo.Oooo000 predicate) {
        OooOo.OooO0o0(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (((Boolean) predicate.invoke(objArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, C3034d9.i.f8177d, C3034d9.i.f8179e, 0, null, new C01571(this), 25, null);
    }

    private ObjectList(int i) {
        this.content = i == 0 ? ObjectListKt.EmptyArray : new Object[i];
    }

    public final boolean any(o00O0Oo.Oooo000 predicate) {
        OooOo.OooO0o0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) predicate.invoke(objArr[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(o00O0Oo.Oooo000 predicate) {
        OooOo.OooO0o0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (((Boolean) predicate.invoke(objArr[i3])).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public final E firstOrNull(o00O0Oo.Oooo000 predicate) {
        OooOo.OooO0o0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            E e = (E) objArr[i2];
            if (((Boolean) predicate.invoke(e)).booleanValue()) {
                return e;
            }
        }
        return null;
    }

    public final String joinToString(CharSequence separator) {
        OooOo.OooO0o0(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(List<? extends E> elements) {
        OooOo.OooO0o0(elements, "elements");
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            if (!contains(elements.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        OooOo.OooO0o0(separator, "separator");
        OooOo.OooO0o0(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    public final E lastOrNull(o00O0Oo.Oooo000 predicate) {
        E e;
        OooOo.OooO0o0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return null;
            }
            e = (E) objArr[i];
        } while (!((Boolean) predicate.invoke(e)).booleanValue());
        return e;
    }

    public final E first(o00O0Oo.Oooo000 predicate) {
        OooOo.OooO0o0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            E e = (E) objArr[i2];
            if (((Boolean) predicate.invoke(e)).booleanValue()) {
                return e;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        OooOo.OooO0o0(separator, "separator");
        OooOo.OooO0o0(prefix, "prefix");
        OooOo.OooO0o0(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final boolean containsAll(Iterable<? extends E> elements) {
        OooOo.OooO0o0(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i) {
        OooOo.OooO0o0(separator, "separator");
        OooOo.OooO0o0(prefix, "prefix");
        OooOo.OooO0o0(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i, null, null, 48, null);
    }

    public final E last(o00O0Oo.Oooo000 predicate) {
        E e;
        OooOo.OooO0o0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 < i) {
                e = (E) objArr[i];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(e)).booleanValue());
        return e;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated) {
        OooOo.OooO0o0(separator, "separator");
        OooOo.OooO0o0(prefix, "prefix");
        OooOo.OooO0o0(postfix, "postfix");
        OooOo.OooO0o0(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i, truncated, null, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(ObjectList<E> elements) {
        OooOo.OooO0o0(elements, "elements");
        Object[] objArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (!contains(objArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i, CharSequence charSequence2, o00O0Oo.Oooo000 oooo000) {
        OooOo.OooO0o0(separator, "separator");
        OooOo.OooO0o0(prefix, "prefix");
        StringBuilder sbOooOOoo = OooO0oO.OooOo.OooOOoo(charSequence, "postfix", charSequence2, "truncated", prefix);
        Object[] objArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                Object obj = objArr[i3];
                if (i3 == i) {
                    sbOooOOoo.append(charSequence2);
                    break;
                }
                if (i3 != 0) {
                    sbOooOOoo.append(separator);
                }
                if (oooo000 == null) {
                    sbOooOOoo.append(obj);
                } else {
                    sbOooOOoo.append((CharSequence) oooo000.invoke(obj));
                }
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
}
