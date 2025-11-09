package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class OooO0OO implements Iterator {

    /* renamed from: OooOo0O */
    public final /* synthetic */ Iterator f26419OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Iterator f26420OooOo0o;

    public OooO0OO(OooO0o oooO0o, Iterator it, Iterator it2) {
        this.f26419OooOo0O = it;
        this.f26420OooOo0o = it2;
        Objects.requireNonNull(oooO0o);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f26419OooOo0O.hasNext()) {
            return true;
        }
        return this.f26420OooOo0o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f26419OooOo0O;
        if (it.hasNext()) {
            return new o00O0O(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f26420OooOo0o;
        if (it2.hasNext()) {
            return new o00O0O((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
