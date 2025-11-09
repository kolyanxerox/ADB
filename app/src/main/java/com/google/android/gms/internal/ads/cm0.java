package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class cm0 implements Iterator {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f18013OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f18014OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f18015OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f18016OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ fm0 f18017OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ fm0 f18018OooOoOO;

    public cm0(fm0 fm0Var, int i) {
        this.f18016OooOoO = i;
        this.f18018OooOoOO = fm0Var;
        this.f18017OooOoO0 = fm0Var;
        this.f18014OooOo0O = fm0Var.f18975OooOoO;
        this.f18015OooOo0o = fm0Var.isEmpty() ? -1 : 0;
        this.f18013OooOo = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18015OooOo0o >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object em0Var;
        fm0 fm0Var = this.f18018OooOoOO;
        fm0 fm0Var2 = this.f18017OooOoO0;
        if (fm0Var2.f18975OooOoO != this.f18014OooOo0O) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f18015OooOo0o;
        this.f18013OooOo = i;
        switch (this.f18016OooOoO) {
            case 0:
                Object obj = fm0.f18971OooOooo;
                em0Var = fm0Var.OooO0O0()[i];
                break;
            case 1:
                em0Var = new em0(fm0Var, i);
                break;
            default:
                Object obj2 = fm0.f18971OooOooo;
                em0Var = fm0Var.OooO0OO()[i];
                break;
        }
        int i2 = this.f18015OooOo0o + 1;
        if (i2 >= fm0Var2.f18977OooOoOO) {
            i2 = -1;
        }
        this.f18015OooOo0o = i2;
        return em0Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        fm0 fm0Var = this.f18017OooOoO0;
        if (fm0Var.f18975OooOoO != this.f18014OooOo0O) {
            throw new ConcurrentModificationException();
        }
        ii0.o0OoOo0("no calls to next() since the last call to remove()", this.f18013OooOo >= 0);
        this.f18014OooOo0O += 32;
        fm0Var.remove(fm0Var.OooO0O0()[this.f18013OooOo]);
        this.f18015OooOo0o--;
        this.f18013OooOo = -1;
    }
}
