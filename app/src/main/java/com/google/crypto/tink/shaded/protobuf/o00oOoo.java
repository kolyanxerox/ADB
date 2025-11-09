package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class o00oOoo extends AbstractList implements o00000, RandomAccess {

    /* renamed from: OooOo0O */
    public final o000000O f28120OooOo0O;

    public o00oOoo(o000000O o000000o2) {
        this.f28120OooOo0O = o000000o2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00000
    public final void OooO0oo(OooOOO0 oooOOO0) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f28120OooOo0O.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00000
    public final Object getRaw(int i) {
        return this.f28120OooOo0O.f28072OooOo0o.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00000
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f28120OooOo0O.f28072OooOo0o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00000
    public final o00000 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        o0O0ooO o0o0ooo = new o0O0ooO();
        o0o0ooo.f28121OooOo0O = this.f28120OooOo0O.iterator();
        return o0o0ooo;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        o00O0000 o00o0000 = new o00O0000();
        o00o0000.f28109OooOo0O = this.f28120OooOo0O.listIterator(i);
        return o00o0000;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28120OooOo0O.size();
    }
}
