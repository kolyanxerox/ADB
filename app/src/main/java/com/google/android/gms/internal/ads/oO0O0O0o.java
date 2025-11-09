package com.google.android.gms.internal.ads;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class oO0O0O0o implements oOo0000O {

    /* renamed from: OooO, reason: collision with root package name */
    public boolean f22632OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final r40 f22633OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o000O0o f22634OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f22635OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f22636OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public String f22637OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public o000O f22638OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f22639OooO0oO = 0;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f22640OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public boolean f22641OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public long f22642OooOO0O;
    public int OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public long f22643OooOOO0;

    public oO0O0O0o(String str, int i) {
        r40 r40Var = new r40(4);
        this.f22633OooO00o = r40Var;
        r40Var.f23745OooO00o[0] = -1;
        this.f22634OooO0O0 = new o000O0o();
        this.f22643OooOOO0 = -9223372036854775807L;
        this.f22635OooO0OO = str;
        this.f22636OooO0Oo = i;
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO00o(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0O0(r40 r40Var) {
        af0.OooOo0O(this.f22638OooO0o0);
        while (r40Var.OooOOOO() > 0) {
            int i = this.f22639OooO0oO;
            r40 r40Var2 = this.f22633OooO00o;
            if (i == 0) {
                byte[] bArr = r40Var.f23745OooO00o;
                int i2 = r40Var.f23746OooO0O0;
                int i3 = r40Var.f23747OooO0OO;
                while (true) {
                    if (i2 >= i3) {
                        r40Var.OooOO0(i3);
                        break;
                    }
                    int i4 = i2 + 1;
                    byte b = bArr[i2];
                    boolean z = (b & ForkServer.ERROR) == 255;
                    boolean z2 = this.f22641OooOO0 && (b & 224) == 224;
                    this.f22641OooOO0 = z;
                    if (z2) {
                        r40Var.OooOO0(i4);
                        this.f22641OooOO0 = false;
                        r40Var2.f23745OooO00o[1] = bArr[i2];
                        this.f22640OooO0oo = 2;
                        this.f22639OooO0oO = 1;
                        break;
                    }
                    i2 = i4;
                }
            } else if (i != 1) {
                int iMin = Math.min(r40Var.OooOOOO(), this.OooOO0o - this.f22640OooO0oo);
                this.f22638OooO0o0.OooO0Oo(iMin, r40Var);
                int i5 = this.f22640OooO0oo + iMin;
                this.f22640OooO0oo = i5;
                if (i5 >= this.OooOO0o) {
                    af0.OooooO0(this.f22643OooOOO0 != -9223372036854775807L);
                    this.f22638OooO0o0.OooO00o(this.f22643OooOOO0, 1, this.OooOO0o, 0, null);
                    this.f22643OooOOO0 += this.f22642OooOO0O;
                    this.f22640OooO0oo = 0;
                    this.f22639OooO0oO = 0;
                }
            } else {
                int iMin2 = Math.min(r40Var.OooOOOO(), 4 - this.f22640OooO0oo);
                r40Var.OooO0o(r40Var2.f23745OooO00o, this.f22640OooO0oo, iMin2);
                int i6 = this.f22640OooO0oo + iMin2;
                this.f22640OooO0oo = i6;
                if (i6 >= 4) {
                    r40Var2.OooOO0(0);
                    int iOooOOo0 = r40Var2.OooOOo0();
                    o000O0o o000o0o2 = this.f22634OooO0O0;
                    if (o000o0o2.OooO00o(iOooOOo0)) {
                        this.OooOO0o = o000o0o2.f21704OooO0O0;
                        if (!this.f22632OooO) {
                            this.f22642OooOO0O = (o000o0o2.f21707OooO0o * 1000000) / o000o0o2.f21705OooO0OO;
                            jb1 jb1Var = new jb1();
                            jb1Var.f20241OooO00o = this.f22637OooO0o;
                            jb1Var.OooO0OO((String) o000o0o2.f21709OooO0oO);
                            jb1Var.f20252OooOOO0 = 4096;
                            jb1Var.f20264OooOoOO = o000o0o2.f21706OooO0Oo;
                            jb1Var.f20266OooOoo0 = o000o0o2.f21705OooO0OO;
                            jb1Var.f20244OooO0Oo = this.f22635OooO0OO;
                            jb1Var.f20245OooO0o = this.f22636OooO0Oo;
                            this.f22638OooO0o0.OooO0o0(new o0OoOo0(jb1Var));
                            this.f22632OooO = true;
                        }
                        r40Var2.OooOO0(0);
                        this.f22638OooO0o0.OooO0Oo(4, r40Var2);
                        this.f22639OooO0oO = 2;
                    } else {
                        this.f22640OooO0oo = 0;
                        this.f22639OooO0oO = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0OO(int i, long j) {
        this.f22643OooOOO0 = j;
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0Oo(o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
        ooo00o00.OooO00o();
        ooo00o00.OooO0O0();
        this.f22637OooO0o = ooo00o00.f22887OooO0o0;
        ooo00o00.OooO0O0();
        this.f22638OooO0o0 = o0000ooo.OooO0oO(ooo00o00.f22886OooO0Oo, 1);
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void zze() {
        this.f22639OooO0oO = 0;
        this.f22640OooO0oo = 0;
        this.f22641OooOO0 = false;
        this.f22643OooOOO0 = -9223372036854775807L;
    }
}
