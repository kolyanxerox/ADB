package com.google.protobuf;

import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class o0OO0O0 implements ListIterator {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public ListIterator f28364OooOo0O;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f28364OooOo0O.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f28364OooOo0O.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f28364OooOo0O.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f28364OooOo0O.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f28364OooOo0O.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f28364OooOo0O.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
