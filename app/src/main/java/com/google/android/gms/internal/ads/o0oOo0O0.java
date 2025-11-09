package com.google.android.gms.internal.ads;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o0oOo0O0 {

    /* renamed from: OooO, reason: collision with root package name */
    public int f22267OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000O f22268OooO00o;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public o0OO0O0 f22271OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f22272OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public o0O0o000 f22273OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f22274OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f22275OooO0oo;
    public boolean OooOO0o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0OO0 f22269OooO0O0 = new o0OO0();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final r40 f22270OooO0OO = new r40();

    /* renamed from: OooOO0, reason: collision with root package name */
    public final r40 f22276OooOO0 = new r40(1);

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final r40 f22277OooOO0O = new r40();

    public o0oOo0O0(o000O o000o, o0OO0O0 o0oo0o0, o0O0o000 o0o0o000) {
        this.f22268OooO00o = o000o;
        this.f22271OooO0Oo = o0oo0o0;
        this.f22273OooO0o0 = o0o0o000;
        this.f22271OooO0Oo = o0oo0o0;
        this.f22273OooO0o0 = o0o0o000;
        o000o.OooO0o0(o0oo0o0.f22095OooO00o.f22086OooO0oO);
        OooO0Oo();
    }

    public final int OooO00o() {
        int i = !this.OooOO0o ? this.f22271OooO0Oo.f22101OooO0oO[this.f22272OooO0o] : this.f22269OooO0O0.f22038OooOO0[this.f22272OooO0o] ? 1 : 0;
        return OooO0OO() != null ? i | BasicMeasure.EXACTLY : i;
    }

    public final int OooO0O0(int i, int i2) {
        r40 r40Var;
        o0OO00o0 o0oo00o0OooO0OO = OooO0OO();
        if (o0oo00o0OooO0OO == null) {
            return 0;
        }
        o0OO0 o0oo0 = this.f22269OooO0O0;
        int length = o0oo00o0OooO0OO.f22093OooO0Oo;
        if (length != 0) {
            r40Var = o0oo0.f22040OooOOO;
        } else {
            int i3 = i80.f19994OooO00o;
            byte[] bArr = o0oo00o0OooO0OO.f22094OooO0o0;
            length = bArr.length;
            r40 r40Var2 = this.f22277OooOO0O;
            r40Var2.OooO0oo(length, bArr);
            r40Var = r40Var2;
        }
        boolean z = o0oo0.f22039OooOO0O && o0oo0.OooOO0o[this.f22272OooO0o];
        boolean z2 = z || i2 != 0;
        int i4 = true != z2 ? 0 : 128;
        r40 r40Var3 = this.f22276OooOO0;
        r40Var3.f23745OooO00o[0] = (byte) (i4 | length);
        r40Var3.OooOO0(0);
        o000O o000o = this.f22268OooO00o;
        o000o.OooO0o(r40Var3, 1, 1);
        o000o.OooO0o(r40Var, length, 1);
        if (!z2) {
            return length + 1;
        }
        r40 r40Var4 = this.f22270OooO0OO;
        if (!z) {
            r40Var4.OooO0oO(8);
            byte[] bArr2 = r40Var4.f23745OooO00o;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            o000o.OooO0o(r40Var4, 8, 1);
            return length + 9;
        }
        int i5 = length + 1;
        r40 r40Var5 = o0oo0.f22040OooOOO;
        int iOooOoO = r40Var5.OooOoO();
        r40Var5.OooOO0O(-2);
        int i6 = (iOooOoO * 6) + 2;
        if (i2 != 0) {
            r40Var4.OooO0oO(i6);
            byte[] bArr3 = r40Var4.f23745OooO00o;
            r40Var5.OooO0o(bArr3, 0, i6);
            int i7 = (((bArr3[2] & ForkServer.ERROR) << 8) | (bArr3[3] & ForkServer.ERROR)) + i2;
            bArr3[2] = (byte) ((i7 >> 8) & 255);
            bArr3[3] = (byte) (i7 & 255);
        } else {
            r40Var4 = r40Var5;
        }
        o000o.OooO0o(r40Var4, i6, 1);
        return i5 + i6;
    }

    public final o0OO00o0 OooO0OO() {
        if (!this.OooOO0o) {
            return null;
        }
        o0OO0 o0oo0 = this.f22269OooO0O0;
        o0O0o000 o0o0o000 = o0oo0.f22030OooO00o;
        int i = i80.f19994OooO00o;
        int i2 = o0o0o000.f21973OooO00o;
        o0OO00o0 o0oo00o0 = o0oo0.f22041OooOOO0;
        if (o0oo00o0 == null) {
            o0oo00o0 = this.f22271OooO0Oo.f22095OooO00o.OooOO0o[i2];
        }
        if (o0oo00o0 == null || !o0oo00o0.f22090OooO00o) {
            return null;
        }
        return o0oo00o0;
    }

    public final void OooO0Oo() {
        o0OO0 o0oo0 = this.f22269OooO0O0;
        o0oo0.f22033OooO0Oo = 0;
        o0oo0.f22043OooOOOo = 0L;
        o0oo0.f22044OooOOo0 = false;
        o0oo0.f22039OooOO0O = false;
        o0oo0.f22042OooOOOO = false;
        o0oo0.f22041OooOOO0 = null;
        this.f22272OooO0o = 0;
        this.f22275OooO0oo = 0;
        this.f22274OooO0oO = 0;
        this.f22267OooO = 0;
        this.OooOO0o = false;
    }

    public final boolean OooO0o0() {
        this.f22272OooO0o++;
        if (!this.OooOO0o) {
            return false;
        }
        int i = this.f22274OooO0oO + 1;
        this.f22274OooO0oO = i;
        int[] iArr = this.f22269OooO0O0.f22036OooO0oO;
        int i2 = this.f22275OooO0oo;
        if (i != iArr[i2]) {
            return true;
        }
        this.f22275OooO0oo = i2 + 1;
        this.f22274OooO0oO = 0;
        return false;
    }
}
