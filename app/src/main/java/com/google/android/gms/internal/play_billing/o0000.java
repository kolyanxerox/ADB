package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o0000 implements Iterator {

    /* renamed from: OooOo, reason: collision with root package name */
    public Object f26968OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Iterator f26969OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f26970OooOo0o;

    public o0000(Iterator it) {
        it.getClass();
        this.f26969OooOo0O = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26970OooOo0o || this.f26969OooOo0O.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f26970OooOo0o) {
            return this.f26969OooOo0O.next();
        }
        Object obj = this.f26968OooOo;
        this.f26970OooOo0o = false;
        this.f26968OooOo = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f26970OooOo0o) {
            throw new IllegalStateException("Can't remove after you've peeked at next");
        }
        this.f26969OooOo0O.remove();
    }
}
