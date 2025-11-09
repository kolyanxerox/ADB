package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o0O0O0o0 implements Iterator {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0O0O0Oo f28325OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f28326OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f28327OooOo0o;

    public o0O0O0o0(o0O0O0Oo o0o0o0oo) {
        this.f28325OooOo = o0o0o0oo;
        this.f28326OooOo0O = o0o0o0oo.f28320OooOo0o.size();
    }

    public final Iterator OooO00o() {
        if (this.f28327OooOo0o == null) {
            this.f28327OooOo0o = this.f28325OooOo.f28323OooOoOO.entrySet().iterator();
        }
        return this.f28327OooOo0o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f28326OooOo0O;
        return (i > 0 && i <= this.f28325OooOo.f28320OooOo0o.size()) || OooO00o().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (OooO00o().hasNext()) {
            return (Map.Entry) OooO00o().next();
        }
        List list = this.f28325OooOo.f28320OooOo0o;
        int i = this.f28326OooOo0O - 1;
        this.f28326OooOo0O = i;
        return (Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
