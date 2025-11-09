package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class xm0 extends vn0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f25648OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f25649OooOo0o;

    public xm0(Object obj) {
        super(0);
        this.f25649OooOo0o = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f25648OooOo;
    }

    @Override // com.google.android.gms.internal.ads.vn0, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (this.f25648OooOo) {
            throw new NoSuchElementException();
        }
        this.f25648OooOo = true;
        return this.f25649OooOo0o;
    }
}
