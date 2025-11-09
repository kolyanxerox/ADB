package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C2051sk;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public interface OooOOOO {
    static Oooo0 OooO0o(OooOOOO oooOOOO, o00O0O o00o0o, C2051sk c2051sk, ArrayList arrayList) {
        String str = o00o0o.f26532OooOo0O;
        if (oooOOOO.zzj(str)) {
            Oooo0 oooo0Zzk = oooOOOO.zzk(str);
            if (oooo0Zzk instanceof OooOOO0) {
                return ((OooOOO0) oooo0Zzk).OooO00o(c2051sk, arrayList);
            }
            throw new IllegalArgumentException(OooO0oO.OooOo.OooOoo0(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0("Object has no function ", str));
        }
        o00O0.o000OOo.OooOOO0("hasOwnProperty", arrayList, 1);
        return oooOOOO.zzj(((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(0)).zzc()) ? Oooo0.f26435OooOOo0 : Oooo0.f26434OooOOo;
    }

    void OooO0o0(String str, Oooo0 oooo0);

    boolean zzj(String str);

    Oooo0 zzk(String str);
}
