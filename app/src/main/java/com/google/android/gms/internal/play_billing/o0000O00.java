package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class o0000O00 extends o000O0O0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f26983OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f26984OooOo0o;

    public o0000O00(Object obj) {
        this.f26983OooOo0O = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f26984OooOo0o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f26984OooOo0o) {
            throw new NoSuchElementException();
        }
        this.f26984OooOo0o = true;
        return this.f26983OooOo0O;
    }
}
