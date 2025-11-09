package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class o000O0 {

    /* renamed from: OooO0OO */
    public static final o000O0 f28087OooO0OO = new o000O0();

    /* renamed from: OooO0O0 */
    public final ConcurrentHashMap f28089OooO0O0 = new ConcurrentHashMap();

    /* renamed from: OooO00o */
    public final o0000O00 f28088OooO00o = new o0000O00();

    public final o000O0O0 OooO00o(Class cls) {
        o000O0O0 o000o0o0OooOoO0;
        Class cls2;
        oo0o0Oo.OooO00o(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f28089OooO0O0;
        o000O0O0 o000o0o02 = (o000O0O0) concurrentHashMap.get(cls);
        if (o000o0o02 != null) {
            return o000o0o02;
        }
        o0000O00 o0000o00 = this.f28088OooO00o;
        o0000o00.getClass();
        Class cls3 = o000O.f28083OooO00o;
        if (!o0ooOOo.class.isAssignableFrom(cls) && (cls2 = o000O.f28083OooO00o) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        o000OO0O o000oo0oMessageInfoFor = ((o0000) o0000o00.f28077OooO00o).messageInfoFor(cls);
        if ((o000oo0oMessageInfoFor.f28099OooO0Oo & 2) == 2) {
            boolean zIsAssignableFrom = o0ooOOo.class.isAssignableFrom(cls);
            OooO00o oooO00o = o000oo0oMessageInfoFor.f28096OooO00o;
            if (zIsAssignableFrom) {
                o000o0o0OooOoO0 = new o000O000(o000O.f28086OooO0Oo, o0OoOo0.f28122OooO00o, oooO00o);
            } else {
                o00 o00Var = o000O.f28084OooO0O0;
                o000oOoO o000oooo2 = o0OoOo0.f28123OooO0O0;
                if (o000oooo2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                o000o0o0OooOoO0 = new o000O000(o00Var, o000oooo2, oooO00o);
            }
        } else if (o0ooOOo.class.isAssignableFrom(cls)) {
            o000o0o0OooOoO0 = (o000oo0oMessageInfoFor.f28099OooO0Oo & 1) == 1 ? o000.OooOoO0(o000oo0oMessageInfoFor, o000Oo0.f28108OooO0O0, o00000OO.f28075OooO0O0, o000O.f28086OooO0Oo, o0OoOo0.f28122OooO00o, o0000O0O.f28079OooO0O0) : o000.OooOoO0(o000oo0oMessageInfoFor, o000Oo0.f28108OooO0O0, o00000OO.f28075OooO0O0, o000O.f28086OooO0Oo, null, o0000O0O.f28079OooO0O0);
        } else if ((o000oo0oMessageInfoFor.f28099OooO0Oo & 1) == 1) {
            o000O0o o000o0o2 = o000Oo0.f28107OooO00o;
            o00000O0 o00000o02 = o00000OO.f28074OooO00o;
            o00 o00Var2 = o000O.f28084OooO0O0;
            o000oOoO o000oooo3 = o0OoOo0.f28123OooO0O0;
            if (o000oooo3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            o000o0o0OooOoO0 = o000.OooOoO0(o000oo0oMessageInfoFor, o000o0o2, o00000o02, o00Var2, o000oooo3, o0000O0O.f28078OooO00o);
        } else {
            o000o0o0OooOoO0 = o000.OooOoO0(o000oo0oMessageInfoFor, o000Oo0.f28107OooO00o, o00000OO.f28074OooO00o, o000O.f28085OooO0OO, null, o0000O0O.f28078OooO00o);
        }
        o000O0O0 o000o0o03 = (o000O0O0) concurrentHashMap.putIfAbsent(cls, o000o0o0OooOoO0);
        return o000o0o03 != null ? o000o0o03 : o000o0o0OooOoO0;
    }
}
