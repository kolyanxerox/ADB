package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class vn0 implements Iterator {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f25024OooOo0O;

    public abstract byte OooO00o();

    @Override // java.util.Iterator, java.util.ListIterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(OooO00o());
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f25024OooOo0O) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
