package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class k31 implements Iterator {

    /* renamed from: OooOo0O */
    public int f20432OooOo0O = 0;

    /* renamed from: OooOo0o */
    public final /* synthetic */ l31 f20433OooOo0o;

    public k31(l31 l31Var) {
        this.f20433OooOo0o = l31Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f20432OooOo0O;
        l31 l31Var = this.f20433OooOo0o;
        return i < l31Var.f20789OooOo0O.size() || l31Var.f20790OooOo0o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f20432OooOo0O;
        l31 l31Var = this.f20433OooOo0o;
        ArrayList arrayList = l31Var.f20789OooOo0O;
        if (i >= arrayList.size()) {
            arrayList.add(l31Var.f20790OooOo0o.next());
            return next();
        }
        int i2 = this.f20432OooOo0O;
        this.f20432OooOo0O = i2 + 1;
        return arrayList.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
