package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o0000O0 {
    public static void OooO00o(Object obj, Object obj2) {
        o0000oo o0000ooVar = (o0000oo) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (o0000ooVar.isEmpty()) {
            return;
        }
        Iterator it = o0000ooVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static o0000oo OooO0O0(Object obj, Object obj2) {
        o0000oo o0000ooVarOooO0OO = (o0000oo) obj;
        o0000oo o0000ooVar = (o0000oo) obj2;
        if (!o0000ooVar.isEmpty()) {
            if (!o0000ooVarOooO0OO.f28082OooOo0O) {
                o0000ooVarOooO0OO = o0000ooVarOooO0OO.OooO0OO();
            }
            o0000ooVarOooO0OO.OooO0O0();
            if (!o0000ooVar.isEmpty()) {
                o0000ooVarOooO0OO.putAll(o0000ooVar);
            }
        }
        return o0000ooVarOooO0OO;
    }
}
