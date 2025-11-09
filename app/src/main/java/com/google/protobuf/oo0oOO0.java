package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oo0oOO0 implements Iterator {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28454OooOo0O = 1;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f28455OooOo0o;

    public /* synthetic */ oo0oOO0() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f28454OooOo0O) {
        }
        return this.f28455OooOo0o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f28454OooOo0O) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f28455OooOo0o.next();
                if (!(entry.getValue() instanceof LazyField)) {
                    return entry;
                }
                o00O0OOO o00o0ooo = new o00O0OOO();
                o00o0ooo.f28268OooOo0O = entry;
                return o00o0ooo;
            default:
                return (String) this.f28455OooOo0o.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f28454OooOo0O) {
            case 0:
                this.f28455OooOo0o.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public oo0oOO0(Iterator it) {
        this.f28455OooOo0o = it;
    }
}
