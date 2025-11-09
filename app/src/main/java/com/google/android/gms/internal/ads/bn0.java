package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class bn0 extends AbstractSequentialList implements Serializable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final AbstractCollection f17525OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final wk0 f17526OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public bn0(List list, wk0 wk0Var) {
        list.getClass();
        this.f17525OooOo0O = (AbstractCollection) list;
        this.f17526OooOo0o = wk0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f17525OooOo0O.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new ym0(this, this.f17525OooOo0O.listIterator(i), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f17525OooOo0O.subList(i, i2).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17525OooOo0O.size();
    }
}
