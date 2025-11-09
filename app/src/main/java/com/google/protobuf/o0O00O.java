package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class o0O00O {

    /* renamed from: OooO0OO */
    public static final o0O00O f28290OooO0OO = new o0O00O();

    /* renamed from: OooO0O0 */
    public final ConcurrentHashMap f28292OooO0O0 = new ConcurrentHashMap();

    /* renamed from: OooO00o */
    public final o00OOO0 f28291OooO00o = new o00OOO0(0);

    public final o0oO0O0o OooO00o(Class cls) {
        o0oO0O0o o0oo0o0oOooOoO0;
        Class cls2;
        Internal.checkNotNull(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f28292OooO0O0;
        o0oO0O0o o0oo0o0o = (o0oO0O0o) concurrentHashMap.get(cls);
        if (o0oo0o0o != null) {
            return o0oo0o0o;
        }
        o00OOO0 o00ooo0 = this.f28291OooO00o;
        o00ooo0.getClass();
        Class cls3 = o0O0oo0o.f28341OooO00o;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = o0O0oo0o.f28341OooO00o) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        o00Oo00 o00oo00MessageInfoFor = ((o0oOO) o00ooo0.f28275OooO00o).messageInfoFor(cls);
        if (o00oo00MessageInfoFor.isMessageSetWireFormat()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                o0oo0o0oOooOoO0 = new o0O0o(o0O0oo0o.f28343OooO0OO, o000O0Oo.f28214OooO00o, o00oo00MessageInfoFor.getDefaultInstance());
            } else {
                o0OO00o0 o0oo00o0 = o0O0oo0o.f28342OooO0O0;
                o000O00 o000o002 = o000O0Oo.f28215OooO0O0;
                if (o000o002 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                o0oo0o0oOooOoO0 = new o0O0o(o0oo00o0, o000o002, o00oo00MessageInfoFor.getDefaultInstance());
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            o0oo0o0oOooOoO0 = o00OO.f28269OooO00o[o00oo00MessageInfoFor.getSyntax().ordinal()] != 1 ? o0oOOo.OooOoO0(o00oo00MessageInfoFor, o0O000.f28286OooO0O0, o00OO0O0.f28272OooO0O0, o0O0oo0o.f28343OooO0OO, o000O0Oo.f28214OooO00o, o00OOOOo.f28279OooO0O0) : o0oOOo.OooOoO0(o00oo00MessageInfoFor, o0O000.f28286OooO0O0, o00OO0O0.f28272OooO0O0, o0O0oo0o.f28343OooO0OO, null, o00OOOOo.f28279OooO0O0);
        } else if (o00OO.f28269OooO00o[o00oo00MessageInfoFor.getSyntax().ordinal()] != 1) {
            o0O0000O o0o0000o = o0O000.f28285OooO00o;
            o00OO000 o00oo000 = o00OO0O0.f28271OooO00o;
            o0OO00o0 o0oo00o02 = o0O0oo0o.f28342OooO0O0;
            o000O00 o000o003 = o000O0Oo.f28215OooO0O0;
            if (o000o003 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            o0oo0o0oOooOoO0 = o0oOOo.OooOoO0(o00oo00MessageInfoFor, o0o0000o, o00oo000, o0oo00o02, o000o003, o00OOOOo.f28278OooO00o);
        } else {
            o0oo0o0oOooOoO0 = o0oOOo.OooOoO0(o00oo00MessageInfoFor, o0O000.f28285OooO00o, o00OO0O0.f28271OooO00o, o0O0oo0o.f28342OooO0O0, null, o00OOOOo.f28278OooO00o);
        }
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(o0oo0o0oOooOoO0, "schema");
        o0oO0O0o o0oo0o0o2 = (o0oO0O0o) concurrentHashMap.putIfAbsent(cls, o0oo0o0oOooOoO0);
        return o0oo0o0o2 != null ? o0oo0o0o2 : o0oo0o0oOooOoO0;
    }

    public final o0oO0O0o OooO0O0(Object obj) {
        return OooO00o(obj.getClass());
    }
}
