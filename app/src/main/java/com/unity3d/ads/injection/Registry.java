package com.unity3d.ads.injection;

import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0.o00oO0o;
import o00O0.o0O0O00;
import o00O0Oo.OooO0O0;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import oo00o.OooO0OO;
import oo00o.OooOO0;

/* loaded from: classes3.dex */
public final class Registry {
    private final o0OO _services = o0o0000.OooO0OO(o00oO0o.f31247OooOo0O);

    public static EntryKey factory$default(Registry registry, String named, OooO0O0 instance, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        OooOo.OooO0o0(named, "named");
        OooOo.OooO0o0(instance, "instance");
        OooOo.OooOO0O();
        throw null;
    }

    public static Object get$default(Registry registry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        OooOo.OooO0o0(named, "named");
        OooOo.OooOO0O();
        throw null;
    }

    public static Object getOrNull$default(Registry registry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        OooOo.OooO0o0(named, "named");
        OooOo.OooOO0O();
        throw null;
    }

    public static EntryKey single$default(Registry registry, String named, OooO0O0 instance, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        OooOo.OooO0o0(named, "named");
        OooOo.OooO0o0(instance, "instance");
        OooOo.OooOO0O();
        throw null;
    }

    public final <T> void add(EntryKey key, OooO0OO instance) {
        oO00000o oo00000o;
        Object value;
        OooOo.OooO0o0(key, "key");
        OooOo.OooO0o0(instance, "instance");
        if (getServices().containsKey(key)) {
            throw new IllegalStateException("Cannot have identical entries.");
        }
        o0OO o0oo = this._services;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value, o0O0O00.OooOo00((Map) value, o0O0O00.OooOOOo(new OooOO0(key, instance)))));
    }

    public final <T> EntryKey factory(String named, OooO0O0 instance) {
        OooOo.OooO0o0(named, "named");
        OooOo.OooO0o0(instance, "instance");
        OooOo.OooOO0O();
        throw null;
    }

    public final <T> T get(String named) {
        OooOo.OooO0o0(named, "named");
        OooOo.OooOO0O();
        throw null;
    }

    public final <T> T getOrNull(String named) {
        OooOo.OooO0o0(named, "named");
        OooOo.OooOO0O();
        throw null;
    }

    public final Map<EntryKey, OooO0OO> getServices() {
        return (Map) ((oO00000o) this._services).getValue();
    }

    public final <T> EntryKey single(String named, OooO0O0 instance) {
        OooOo.OooO0o0(named, "named");
        OooOo.OooO0o0(instance, "instance");
        OooOo.OooOO0O();
        throw null;
    }
}
