package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oo0o0O0 implements Iterator {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Iterator f28441OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Internal.MapAdapter f28442OooOo0o;

    public oo0o0O0(Internal.MapAdapter mapAdapter, Iterator it) {
        this.f28442OooOo0o = mapAdapter;
        this.f28441OooOo0O = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28441OooOo0O.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return new o00O0OO0(this.f28442OooOo0o, (Map.Entry) this.f28441OooOo0O.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f28441OooOo0O.remove();
    }
}
