package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class xl0 extends ol0 implements ListIterator {

    /* renamed from: OooOoO */
    public final /* synthetic */ yl0 f25643OooOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl0(yl0 yl0Var) {
        super(yl0Var);
        this.f25643OooOoO = yl0Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        yl0 yl0Var = this.f25643OooOoO;
        boolean zIsEmpty = yl0Var.isEmpty();
        OooO00o();
        ((ListIterator) this.f23006OooOo0o).add(obj);
        yl0Var.f25940OooOoOO.f18274OooOoO++;
        if (zIsEmpty) {
            yl0Var.OooO0Oo();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        OooO00o();
        return ((ListIterator) this.f23006OooOo0o).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        OooO00o();
        return ((ListIterator) this.f23006OooOo0o).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        OooO00o();
        return ((ListIterator) this.f23006OooOo0o).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        OooO00o();
        return ((ListIterator) this.f23006OooOo0o).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        OooO00o();
        ((ListIterator) this.f23006OooOo0o).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl0(yl0 yl0Var, int i) {
        super(yl0Var, ((List) yl0Var.f25937OooOo0o).listIterator(i));
        this.f25643OooOoO = yl0Var;
    }
}
