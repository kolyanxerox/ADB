package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o00O0OO extends AbstractSet {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Set f28264OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Internal.MapAdapter f28265OooOo0o;

    public o00O0OO(Internal.MapAdapter mapAdapter, Set set) {
        this.f28265OooOo0o = mapAdapter;
        this.f28264OooOo0O = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new oo0o0O0(this.f28265OooOo0o, this.f28264OooOo0O.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f28264OooOo0O.size();
    }
}
