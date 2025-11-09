package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ml0 implements Iterator {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Iterator f21280OooOo0O;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ dn0 f21282OooOoO0;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Collection f21281OooOo0o = null;

    /* renamed from: OooOo, reason: collision with root package name */
    public Iterator f21279OooOo = wm0.f25331OooOo0O;

    public ml0(dn0 dn0Var) {
        this.f21282OooOoO0 = dn0Var;
        this.f21280OooOo0O = dn0Var.f18275OooOoO0.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21280OooOo0O.hasNext() || this.f21279OooOo.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f21279OooOo.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f21280OooOo0O.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f21281OooOo0o = collection;
            this.f21279OooOo = collection.iterator();
        }
        return this.f21279OooOo.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f21279OooOo.remove();
        Collection collection = this.f21281OooOo0o;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f21280OooOo0O.remove();
        }
        dn0 dn0Var = this.f21282OooOoO0;
        dn0Var.f18274OooOoO--;
    }
}
