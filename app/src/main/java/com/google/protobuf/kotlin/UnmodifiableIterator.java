package com.google.protobuf.kotlin;

import java.util.Iterator;
import kotlin.jvm.internal.OooOo;
import o00O0OoO.OooO0OO;

/* loaded from: classes2.dex */
public final class UnmodifiableIterator<E> implements Iterator<E>, OooO0OO {
    private final /* synthetic */ Iterator<E> $$delegate_0;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableIterator(Iterator<? extends E> delegate) {
        OooOo.OooO0o0(delegate, "delegate");
        this.$$delegate_0 = delegate;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.$$delegate_0.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
