package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class OooOOO implements Iterator {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ Iterator f26426OooOo0O;

    public OooOOO(Iterator it) {
        this.f26426OooOo0O = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26426OooOo0O.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new o00O0O((String) this.f26426OooOo0O.next());
    }
}
