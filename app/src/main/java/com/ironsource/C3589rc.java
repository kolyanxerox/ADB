package com.ironsource;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ironsource.rc */
/* loaded from: classes2.dex */
public final class C3589rc {

    /* renamed from: a */
    public static final C3589rc f11184a = new C3589rc();

    /* renamed from: b */
    public static final String f11185b = "ext_";

    private C3589rc() {
    }

    /* renamed from: a */
    public final Map<String, String> m11711a(Bundle bundle) {
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        if (setKeySet == null) {
            return o00O0.o00oO0o.f31247OooOo0O;
        }
        int iOooOOOO = o00O0.o0O0O00.OooOOOO(o00O0.Oooo000.OooOo0(setKeySet, 10));
        if (iOooOOOO < 16) {
            iOooOOOO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooOOOO);
        for (String str : setKeySet) {
            String strOooOO0 = OooO0oO.OooOo.OooOO0(f11185b, str);
            Object obj = bundle.get(str);
            linkedHashMap.put(strOooOO0, obj instanceof Iterable ? o00O0.OooOo00.OooOooo((Iterable) obj, ", ", null, null, null, 62) : obj == null ? null : obj.toString());
        }
        return linkedHashMap;
    }
}
