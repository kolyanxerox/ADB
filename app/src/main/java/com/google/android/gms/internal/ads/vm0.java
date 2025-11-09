package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class vm0 extends vn0 {

    /* renamed from: OooOo */
    public int f25002OooOo;

    /* renamed from: OooOo0o */
    public Object f25003OooOo0o;

    /* renamed from: OooOoO */
    public final Iterator f25004OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ int f25005OooOoO0;

    /* renamed from: OooOoOO */
    public final /* synthetic */ Object f25006OooOoOO;

    public vm0() {
        super(0);
        this.f25002OooOo = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i = this.f25002OooOo;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.f25002OooOo = 4;
            switch (this.f25005OooOoO0) {
                case 0:
                    do {
                        Iterator it = this.f25004OooOoO;
                        if (!it.hasNext()) {
                            this.f25002OooOo = 3;
                            next = null;
                            break;
                        } else {
                            next = it.next();
                        }
                    } while (!((zk0) this.f25006OooOoOO).zza(next));
                default:
                    do {
                        Iterator it2 = this.f25004OooOoO;
                        if (!it2.hasNext()) {
                            this.f25002OooOo = 3;
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                        }
                    } while (!((um0) this.f25006OooOoOO).contains(next));
            }
            this.f25003OooOo0o = next;
            if (this.f25002OooOo != 3) {
                this.f25002OooOo = 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vn0, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f25002OooOo = 2;
        Object obj = this.f25003OooOo0o;
        this.f25003OooOo0o = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vm0(um0 um0Var, um0 um0Var2) {
        this();
        this.f25005OooOoO0 = 1;
        this.f25006OooOoOO = um0Var2;
        this.f25004OooOoO = um0Var.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vm0(Iterator it, zk0 zk0Var) {
        this();
        this.f25005OooOoO0 = 0;
        this.f25004OooOoO = it;
        this.f25006OooOoOO = zk0Var;
    }
}
