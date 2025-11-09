package com.google.android.gms.internal.play_billing;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class o0O00 implements Cloneable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o0OoO00O f27075OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public o0OoO00O f27076OooOo0o;

    public o0O00(o0OoO00O o0ooo00o) {
        this.f27075OooOo0O = o0ooo00o;
        if (o0ooo00o.OooO0OO()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f27076OooOo0o = (o0OoO00O) o0ooo00o.OooO0Oo(4);
    }

    public static void OooO00o(int i, List list) {
        String strOooO0oO = OooO0oO.OooOo.OooO0oO(list.size() - i, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(strOooO0oO);
            }
            list.remove(size);
        }
    }

    public final o0OoO00O OooO0O0() {
        o0OoO00O o0ooo00oOooO0OO = OooO0OO();
        if (o0OoO00O.OooOOO0(o0ooo00oOooO0OO, true)) {
            return o0ooo00oOooO0OO;
        }
        throw new o0OO00OO();
    }

    public final o0OoO00O OooO0OO() {
        if (!this.f27076OooOo0o.OooO0OO()) {
            return this.f27076OooOo0o;
        }
        o0OoO00O o0ooo00o = this.f27076OooOo0o;
        o0ooo00o.getClass();
        o0O0oo00.f27130OooO0OO.OooO00o(o0ooo00o.getClass()).OooO00o(o0ooo00o);
        o0ooo00o.OooOO0();
        return this.f27076OooOo0o;
    }

    public final void OooO0Oo() {
        if (this.f27076OooOo0o.OooO0OO()) {
            return;
        }
        o0OoO00O o0ooo00o = (o0OoO00O) this.f27075OooOo0O.OooO0Oo(4);
        o0O0oo00.f27130OooO0OO.OooO00o(o0ooo00o.getClass()).OooO0O0(o0ooo00o, this.f27076OooOo0o);
        this.f27076OooOo0o = o0ooo00o;
    }

    public final Object clone() {
        o0O00 o0o00 = (o0O00) this.f27075OooOo0O.OooO0Oo(5);
        o0o00.f27076OooOo0o = OooO0OO();
        return o0o00;
    }
}
