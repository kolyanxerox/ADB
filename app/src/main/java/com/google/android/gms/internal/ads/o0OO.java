package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes2.dex */
public final class o0OO {

    /* renamed from: OooO00o */
    public final o0OOO00 f22024OooO00o = new o0OOO00();

    /* renamed from: OooO0O0 */
    public final r40 f22025OooO0O0 = new r40(new byte[65025], 0);

    /* renamed from: OooO0OO */
    public int f22026OooO0OO = -1;

    /* renamed from: OooO0Oo */
    public int f22027OooO0Oo;

    /* renamed from: OooO0o0 */
    public boolean f22028OooO0o0;

    public final boolean OooO00o(o000000 o000000Var) throws InterruptedIOException {
        int i;
        boolean z = this.f22028OooO0o0;
        r40 r40Var = this.f22025OooO0O0;
        if (z) {
            this.f22028OooO0o0 = false;
            r40Var.OooO0oO(0);
        }
        while (true) {
            if (this.f22028OooO0o0) {
                return true;
            }
            int i2 = this.f22026OooO0OO;
            o0OOO00 o0ooo00 = this.f22024OooO00o;
            if (i2 < 0) {
                if (!o0ooo00.OooO0O0(o000000Var, -1L) || !o0ooo00.OooO00o(o000000Var, true)) {
                    break;
                }
                int iOooO0O0 = o0ooo00.f22124OooO0Oo;
                if ((o0ooo00.f22121OooO00o & 1) == 1 && r40Var.f23747OooO0OO == 0) {
                    iOooO0O0 += OooO0O0(0);
                    i = this.f22027OooO0Oo;
                } else {
                    i = 0;
                }
                try {
                    o000000Var.OooO(iOooO0O0);
                    this.f22026OooO0OO = i;
                    i2 = i;
                } catch (EOFException unused) {
                }
            }
            int iOooO0O02 = OooO0O0(i2);
            int i3 = this.f22026OooO0OO + this.f22027OooO0Oo;
            if (iOooO0O02 > 0) {
                r40Var.OooO0o0(r40Var.f23747OooO0OO + iOooO0O02);
                o000000Var.OooO0o0(r40Var.f23745OooO00o, r40Var.f23747OooO0OO, iOooO0O02, false);
                r40Var.OooO(r40Var.f23747OooO0OO + iOooO0O02);
                this.f22028OooO0o0 = o0ooo00.f22125OooO0o[i3 + (-1)] != 255;
            }
            if (i3 == o0ooo00.f22123OooO0OO) {
                i3 = -1;
            }
            this.f22026OooO0OO = i3;
        }
        return false;
    }

    public final int OooO0O0(int i) {
        int i2;
        int i3 = 0;
        this.f22027OooO0Oo = 0;
        do {
            int i4 = this.f22027OooO0Oo;
            int i5 = i + i4;
            o0OOO00 o0ooo00 = this.f22024OooO00o;
            if (i5 >= o0ooo00.f22123OooO0OO) {
                break;
            }
            this.f22027OooO0Oo = i4 + 1;
            i2 = o0ooo00.f22125OooO0o[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
