package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public abstract class oo000o implements o0000O, Cloneable {

    /* renamed from: OooOo0O */
    public final o0ooOOo f28131OooOo0O;

    /* renamed from: OooOo0o */
    public o0ooOOo f28132OooOo0o;

    public oo000o(o0ooOOo o0ooooo) {
        this.f28131OooOo0O = o0ooooo;
        if (o0ooooo.OooOOO0()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f28132OooOo0o = o0ooooo.OooOOOo();
    }

    public static void OooO0o0(Object obj, Object obj2) {
        o000O0 o000o0 = o000O0.f28087OooO0OO;
        o000o0.getClass();
        o000o0.OooO00o(obj.getClass()).mergeFrom(obj, obj2);
    }

    public final o0ooOOo OooO00o() {
        o0ooOOo o0oooooOooO0O0 = OooO0O0();
        o0oooooOooO0O0.getClass();
        if (o0ooOOo.OooOO0o(o0oooooOooO0O0, true)) {
            return o0oooooOooO0O0;
        }
        throw new o000OO00();
    }

    public final o0ooOOo OooO0O0() {
        if (!this.f28132OooOo0o.OooOOO0()) {
            return this.f28132OooOo0o;
        }
        o0ooOOo o0ooooo = this.f28132OooOo0o;
        o0ooooo.getClass();
        o000O0 o000o0 = o000O0.f28087OooO0OO;
        o000o0.getClass();
        o000o0.OooO00o(o0ooooo.getClass()).makeImmutable(o0ooooo);
        o0ooooo.OooOOO();
        return this.f28132OooOo0o;
    }

    public final oo000o OooO0OO() {
        oo000o oo000oVarOooO0OO = this.f28131OooOo0O.OooO0OO();
        oo000oVarOooO0OO.f28132OooOo0o = OooO0O0();
        return oo000oVarOooO0OO;
    }

    public final void OooO0Oo() {
        if (this.f28132OooOo0o.OooOOO0()) {
            return;
        }
        o0ooOOo o0oooooOooOOOo = this.f28131OooOo0O.OooOOOo();
        OooO0o0(o0oooooOooOOOo, this.f28132OooOo0o);
        this.f28132OooOo0o = o0oooooOooOOOo;
    }
}
