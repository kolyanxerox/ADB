package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class un0 implements Iterator {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Iterator f24669OooOo0O;

    public un0(Iterator it) {
        it.getClass();
        this.f24669OooOo0O = it;
    }

    public abstract Object OooO00o(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24669OooOo0O.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return OooO00o(this.f24669OooOo0O.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f24669OooOo0O.remove();
    }
}
