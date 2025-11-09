package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class TreeIterator<T> implements Iterator<T>, o00O0OoO.OooO0OO {
    private final o00O0Oo.Oooo000 getChildIterator;
    private Iterator<? extends T> iterator;
    private final List<Iterator<T>> stack = new ArrayList();

    public TreeIterator(Iterator<? extends T> it, o00O0Oo.Oooo000 oooo000) {
        this.getChildIterator = oooo000;
        this.iterator = it;
    }

    private final void prepareNextIterator(T t) {
        Iterator<? extends T> it = (Iterator) this.getChildIterator.invoke(t);
        if (it != null && it.hasNext()) {
            this.stack.add(this.iterator);
            this.iterator = it;
            return;
        }
        while (!this.iterator.hasNext() && !this.stack.isEmpty()) {
            this.iterator = (Iterator) o00O0.OooOo00.Oooo000(this.stack);
            List<Iterator<T>> list = this.stack;
            kotlin.jvm.internal.OooOo.OooO0o0(list, "<this>");
            if (list.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            list.remove(o00O0.OooOo.OooOOo0(list));
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.iterator.next();
        prepareNextIterator(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
