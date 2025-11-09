package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class pm0 extends vn0 implements ListIterator {

    /* renamed from: OooOo */
    public int f23375OooOo;

    /* renamed from: OooOo0o */
    public final int f23376OooOo0o;

    /* renamed from: OooOoO0 */
    public final rm0 f23377OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm0(rm0 rm0Var, int i) {
        super(0);
        int size = rm0Var.size();
        ii0.OooOooO(i, size);
        this.f23376OooOo0o = size;
        this.f23375OooOo = i;
        this.f23377OooOoO0 = rm0Var;
    }

    public final Object OooO0O0(int i) {
        return this.f23377OooOoO0.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f23375OooOo < this.f23376OooOo0o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23375OooOo > 0;
    }

    @Override // com.google.android.gms.internal.ads.vn0, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f23375OooOo;
        this.f23375OooOo = i + 1;
        return OooO0O0(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23375OooOo;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f23375OooOo - 1;
        this.f23375OooOo = i;
        return OooO0O0(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23375OooOo - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
