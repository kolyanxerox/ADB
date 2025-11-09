package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.ads.nz0;
import com.google.android.gms.internal.ads.w10;

/* loaded from: classes2.dex */
public final class o00 {
    public static o000OOo0 OooO00o(Object obj) {
        o0ooOOo o0ooooo = (o0ooOOo) obj;
        o000OOo0 o000ooo02 = o0ooooo.unknownFields;
        if (o000ooo02 != o000OOo0.f28101OooO0o) {
            return o000ooo02;
        }
        o000OOo0 o000ooo0OooO0OO = o000OOo0.OooO0OO();
        o0ooooo.unknownFields = o000ooo0OooO0OO;
        return o000ooo0OooO0OO;
    }

    public static boolean OooO0O0(Object obj, w10 w10Var) throws o000OOo {
        int i = w10Var.f25171OooO00o;
        int i2 = i >>> 3;
        int i3 = i & 7;
        nz0 nz0Var = (nz0) w10Var.f25174OooO0Oo;
        if (i3 == 0) {
            w10Var.OooOo0O(0);
            ((o000OOo0) obj).OooO0Oo(i2 << 3, Long.valueOf(nz0Var.OooOOo0()));
            return true;
        }
        if (i3 == 1) {
            w10Var.OooOo0O(1);
            ((o000OOo0) obj).OooO0Oo((i2 << 3) | 1, Long.valueOf(nz0Var.OooOOO()));
            return true;
        }
        if (i3 == 2) {
            ((o000OOo0) obj).OooO0Oo((i2 << 3) | 2, w10Var.OooO0o0());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw o000OOo.OooO0OO();
            }
            w10Var.OooOo0O(5);
            ((o000OOo0) obj).OooO0Oo((i2 << 3) | 5, Integer.valueOf(nz0Var.OooOOO0()));
            return true;
        }
        o000OOo0 o000ooo0OooO0OO = o000OOo0.OooO0OO();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        while (w10Var.OooO00o() != Integer.MAX_VALUE && OooO0O0(o000ooo0OooO0OO, w10Var)) {
        }
        if (i5 != w10Var.f25171OooO00o) {
            throw new o000OOo("Protocol message end-group tag did not match expected tag.");
        }
        o000ooo0OooO0OO.f28106OooO0o0 = false;
        ((o000OOo0) obj).OooO0Oo(i4 | 3, o000ooo0OooO0OO);
        return true;
    }
}
