package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class o00O0OO0 extends p11 {

    /* renamed from: OooOo, reason: collision with root package name */
    public long f21806OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public long[] f21807OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public long[] f21808OooOoO0;

    public static String o0000(r40 r40Var) {
        int iOooOoO = r40Var.OooOoO();
        int i = r40Var.f23746OooO0O0;
        r40Var.OooOO0O(iOooOoO);
        return new String(r40Var.f23745OooO00o, i, iOooOoO);
    }

    public static Serializable o00000oo(int i, r40 r40Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(r40Var.OooOoo()));
        }
        if (i == 1) {
            return Boolean.valueOf(r40Var.OooOo0O() == 1);
        }
        if (i == 2) {
            return o0000(r40Var);
        }
        if (i != 3) {
            if (i == 8) {
                return o0000O00(r40Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(r40Var.OooOoo()));
                r40Var.OooOO0O(2);
                return date;
            }
            int iOooOoO0 = r40Var.OooOoO0();
            ArrayList arrayList = new ArrayList(iOooOoO0);
            for (int i2 = 0; i2 < iOooOoO0; i2++) {
                Serializable serializableO00000oo = o00000oo(r40Var.OooOo0O(), r40Var);
                if (serializableO00000oo != null) {
                    arrayList.add(serializableO00000oo);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strO0000 = o0000(r40Var);
            int iOooOo0O = r40Var.OooOo0O();
            if (iOooOo0O == 9) {
                return map;
            }
            Serializable serializableO00000oo2 = o00000oo(iOooOo0O, r40Var);
            if (serializableO00000oo2 != null) {
                map.put(strO0000, serializableO00000oo2);
            }
        }
    }

    public static HashMap o0000O00(r40 r40Var) {
        int iOooOoO0 = r40Var.OooOoO0();
        HashMap map = new HashMap(iOooOoO0);
        for (int i = 0; i < iOooOoO0; i++) {
            String strO0000 = o0000(r40Var);
            Serializable serializableO00000oo = o00000oo(r40Var.OooOo0O(), r40Var);
            if (serializableO00000oo != null) {
                map.put(strO0000, serializableO00000oo);
            }
        }
        return map;
    }
}
