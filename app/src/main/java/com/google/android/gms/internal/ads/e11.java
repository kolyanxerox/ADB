package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class e11 implements Iterator {

    /* renamed from: OooOo0O */
    public final ArrayDeque f18454OooOo0O;

    /* renamed from: OooOo0o */
    public hz0 f18455OooOo0o;

    public e11(jz0 jz0Var) {
        if (!(jz0Var instanceof f11)) {
            this.f18454OooOo0O = null;
            this.f18455OooOo0o = (hz0) jz0Var;
            return;
        }
        f11 f11Var = (f11) jz0Var;
        ArrayDeque arrayDeque = new ArrayDeque(f11Var.f18761OooOoo0);
        this.f18454OooOo0O = arrayDeque;
        arrayDeque.push(f11Var);
        jz0 jz0Var2 = f11Var.f18759OooOoO0;
        while (jz0Var2 instanceof f11) {
            f11 f11Var2 = (f11) jz0Var2;
            this.f18454OooOo0O.push(f11Var2);
            jz0Var2 = f11Var2.f18759OooOoO0;
        }
        this.f18455OooOo0o = (hz0) jz0Var2;
    }

    @Override // java.util.Iterator
    /* renamed from: OooO00o */
    public final hz0 next() {
        hz0 hz0Var;
        hz0 hz0Var2 = this.f18455OooOo0o;
        if (hz0Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f18454OooOo0O;
            hz0Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            jz0 jz0Var = ((f11) arrayDeque.pop()).f18758OooOoO;
            while (jz0Var instanceof f11) {
                f11 f11Var = (f11) jz0Var;
                arrayDeque.push(f11Var);
                jz0Var = f11Var.f18759OooOoO0;
            }
            hz0Var = (hz0) jz0Var;
        } while (hz0Var.OooOO0() == 0);
        this.f18455OooOo0o = hz0Var;
        return hz0Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18455OooOo0o != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
