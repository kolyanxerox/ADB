package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class oo0o0Oo extends o000O0O0 implements ListIterator {

    /* renamed from: OooOo */
    public final o000000 f27213OooOo;

    /* renamed from: OooOo0O */
    public final int f27214OooOo0O;

    /* renamed from: OooOo0o */
    public int f27215OooOo0o;

    public oo0o0Oo(o000000 o000000Var, int i) {
        int size = o000000Var.size();
        o0O000Oo.OooOOo0(i, size);
        this.f27214OooOo0O = size;
        this.f27215OooOo0o = i;
        this.f27213OooOo = o000000Var;
    }

    public final Object OooO00o(int i) {
        return this.f27213OooOo.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f27215OooOo0o < this.f27214OooOo0O;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27215OooOo0o > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f27215OooOo0o;
        this.f27215OooOo0o = i + 1;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27215OooOo0o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f27215OooOo0o - 1;
        this.f27215OooOo0o = i;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27215OooOo0o - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
