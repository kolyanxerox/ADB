package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class ym0 extends un0 implements ListIterator {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractList f25944OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f25945OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ym0(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f25945OooOo0o = i;
        this.f25944OooOo = abstractList;
    }

    @Override // com.google.android.gms.internal.ads.un0
    public final Object OooO00o(Object obj) {
        switch (this.f25945OooOo0o) {
            case 0:
                return ((an0) this.f25944OooOo).f17068OooOo0o.apply(obj);
            default:
                return ((bn0) this.f25944OooOo).f17526OooOo0o.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f24669OooOo0O).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f24669OooOo0O).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return OooO00o(((ListIterator) this.f24669OooOo0O).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f24669OooOo0O).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
