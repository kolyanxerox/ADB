package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Utf8;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o0OO0oO0 implements o00000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f22117OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f22118OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Object f22119OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public Object f22120OooO0Oo;

    public o0OO0oO0(int i) {
        this.f22117OooO00o = i;
        switch (i) {
            case 1:
                this.f22119OooO0OO = new oO00o0(null, 0, 0);
                this.f22120OooO0Oo = new r40(2786);
                break;
            case 2:
                this.f22119OooO0OO = new oO00o0(null, 0, 1);
                this.f22120OooO0Oo = new r40(16384);
                break;
        }
    }

    public boolean OooO00o(o000000 o000000Var) {
        o0OOO00 o0ooo00 = new o0OOO00();
        if (o0ooo00.OooO00o(o000000Var, true) && (o0ooo00.f22121OooO00o & 2) == 2) {
            int iMin = Math.min(o0ooo00.f22126OooO0o0, 8);
            r40 r40Var = new r40(iMin);
            o000000Var.OooO0o(r40Var.f23745OooO00o, 0, iMin, false);
            r40Var.OooOO0(0);
            if (r40Var.OooOOOO() >= 5 && r40Var.OooOo0O() == 127 && r40Var.OooOooO() == 1179402563) {
                this.f22120OooO0Oo = new o0OO0o();
                return true;
            }
            r40Var.OooOO0(0);
            try {
                if (ze0.Oooo0oO(1, r40Var, true)) {
                    this.f22120OooO0Oo = new o0OOOO0o();
                    return true;
                }
            } catch (C2185w6 unused) {
            }
            r40Var.OooOO0(0);
            if (o0OOO0OO.OooO0o0(r40Var, o0OOO0OO.f22128OooOOOO)) {
                this.f22120OooO0Oo = new o0OOO0OO();
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0O0(long j, long j2) {
        switch (this.f22117OooO00o) {
            case 0:
                o0OOOO00 o0oooo00 = (o0OOOO00) this.f22120OooO0Oo;
                if (o0oooo00 != null) {
                    o0OO o0oo = o0oooo00.f22140OooO00o;
                    o0OOO00 o0ooo00 = o0oo.f22024OooO00o;
                    o0ooo00.f22121OooO00o = 0;
                    o0ooo00.f22122OooO0O0 = 0L;
                    o0ooo00.f22123OooO0OO = 0;
                    o0ooo00.f22124OooO0Oo = 0;
                    o0ooo00.f22126OooO0o0 = 0;
                    o0oo.f22025OooO0O0.OooO0oO(0);
                    o0oo.f22026OooO0OO = -1;
                    o0oo.f22028OooO0o0 = false;
                    if (j != 0) {
                        if (o0oooo00.f22147OooO0oo != 0) {
                            long j3 = (o0oooo00.f22139OooO * j2) / 1000000;
                            o0oooo00.f22145OooO0o0 = j3;
                            o0OOO0 o0ooo0 = o0oooo00.f22143OooO0Oo;
                            int i = i80.f19994OooO00o;
                            o0ooo0.OooO0Oo(j3);
                            o0oooo00.f22147OooO0oo = 2;
                            break;
                        }
                    } else {
                        o0oooo00.OooO0O0(!o0oooo00.OooOO0o);
                        break;
                    }
                }
                break;
            case 1:
                this.f22118OooO0O0 = false;
                ((oO00o0) this.f22119OooO0OO).zze();
                break;
            default:
                this.f22118OooO0O0 = false;
                ((oO00o0) this.f22119OooO0OO).zze();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) throws EOFException, InterruptedIOException {
        int iOooO0o0;
        int i;
        int i2;
        int i3;
        switch (this.f22117OooO00o) {
            case 0:
                try {
                    break;
                }
            case 1:
                r40 r40Var = new r40(10);
                int i4 = 0;
                while (true) {
                    o000000 o000000Var = (o000000) o00000oo2;
                    o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 10, false);
                    r40Var.OooOO0(0);
                    if (r40Var.OooOo() != 4801587) {
                        o000000 o000000Var2 = (o000000) o00000oo2;
                        o000000Var2.f21651OooOoOO = 0;
                        o000000Var.OooO0oO(i4, false);
                        int i5 = 0;
                        int i6 = i4;
                        while (true) {
                            o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 6, false);
                            r40Var.OooOO0(0);
                            if (r40Var.OooOoO() != 2935) {
                                o000000Var2.f21651OooOoOO = 0;
                                i6++;
                                if (i6 - i4 >= 8192) {
                                    break;
                                } else {
                                    o000000Var.OooO0oO(i6, false);
                                    i5 = 0;
                                }
                            } else {
                                i5++;
                                if (i5 >= 4) {
                                    break;
                                } else {
                                    byte[] bArr = r40Var.f23745OooO00o;
                                    if (bArr.length < 6) {
                                        iOooO0o0 = -1;
                                    } else if (((bArr[5] & 248) >> 3) > 10) {
                                        int i7 = (((bArr[2] & 7) << 8) | (bArr[3] & ForkServer.ERROR)) + 1;
                                        iOooO0o0 = i7 + i7;
                                    } else {
                                        byte b = bArr[4];
                                        iOooO0o0 = wz0.OooO0o0((b & 192) >> 6, b & Utf8.REPLACEMENT_BYTE);
                                    }
                                    if (iOooO0o0 == -1) {
                                        break;
                                    } else {
                                        o000000Var.OooO0oO(iOooO0o0 - 6, false);
                                    }
                                }
                            }
                        }
                    } else {
                        r40Var.OooOO0O(3);
                        int iOooOo0 = r40Var.OooOo0();
                        i4 += iOooOo0 + 10;
                        o000000Var.OooO0oO(iOooOo0, false);
                    }
                }
            default:
                r40 r40Var2 = new r40(10);
                int i8 = 0;
                while (true) {
                    o000000 o000000Var3 = (o000000) o00000oo2;
                    o000000Var3.OooO0o(r40Var2.f23745OooO00o, 0, 10, false);
                    r40Var2.OooOO0(0);
                    if (r40Var2.OooOo() != 4801587) {
                        o000000 o000000Var4 = (o000000) o00000oo2;
                        o000000Var4.f21651OooOoOO = 0;
                        o000000Var3.OooO0oO(i8, false);
                        int i9 = 0;
                        int i10 = i8;
                        while (true) {
                            o000000Var3.OooO0o(r40Var2.f23745OooO00o, 0, 7, false);
                            r40Var2.OooOO0(0);
                            int iOooOoO = r40Var2.OooOoO();
                            if (iOooOoO != 44096 && iOooOoO != 44097) {
                                o000000Var4.f21651OooOoOO = 0;
                                i10++;
                                if (i10 - i8 >= 8192) {
                                    break;
                                } else {
                                    o000000Var3.OooO0oO(i10, false);
                                    i9 = 0;
                                }
                            } else {
                                i9++;
                                if (i9 >= 4) {
                                    break;
                                } else {
                                    byte[] bArr2 = r40Var2.f23745OooO00o;
                                    if (bArr2.length < 7) {
                                        i3 = -1;
                                    } else {
                                        int i11 = (bArr2[3] & ForkServer.ERROR) | ((bArr2[2] & ForkServer.ERROR) << 8);
                                        if (i11 == 65535) {
                                            i = ((bArr2[4] & ForkServer.ERROR) << 16) | ((bArr2[5] & ForkServer.ERROR) << 8) | (bArr2[6] & ForkServer.ERROR);
                                            i2 = 7;
                                        } else {
                                            i = i11;
                                            i2 = 4;
                                        }
                                        if (iOooOoO == 44097) {
                                            i2 += 2;
                                        }
                                        i3 = i + i2;
                                    }
                                    if (i3 == -1) {
                                        break;
                                    } else {
                                        o000000Var3.OooO0oO(i3 - 7, false);
                                    }
                                }
                            }
                        }
                    } else {
                        r40Var2.OooOO0O(3);
                        int iOooOo02 = r40Var2.OooOo0();
                        i8 += iOooOo02 + 10;
                        o000000Var3.OooO0oO(iOooOo02, false);
                    }
                }
                break;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        switch (this.f22117OooO00o) {
            case 0:
                this.f22119OooO0OO = (v91) o0000ooo;
                break;
            case 1:
                ((oO00o0) this.f22119OooO0OO).OooO0Oo(o0000ooo, new oOo00o00(Integer.MIN_VALUE, 0, 1));
                v91 v91Var = (v91) o0000ooo;
                v91Var.OooO0OO();
                v91Var.OooO(new o0000oo(-9223372036854775807L, 0L));
                break;
            default:
                ((oO00o0) this.f22119OooO0OO).OooO0Oo(o0000ooo, new oOo00o00(Integer.MIN_VALUE, 0, 1));
                v91 v91Var2 = (v91) o0000ooo;
                v91Var2.OooO0OO();
                v91Var2.OooO(new o0000oo(-9223372036854775807L, 0L));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01df  */
    @Override // com.google.android.gms.internal.ads.o00000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0o0(com.google.android.gms.internal.ads.o00000OO r21, com.google.android.gms.internal.ads.o0000O00 r22) throws com.google.android.gms.internal.ads.C2185w6, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0OO0oO0.OooO0o0(com.google.android.gms.internal.ads.o00000OO, com.google.android.gms.internal.ads.o0000O00):int");
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final List zzd() {
        switch (this.f22117OooO00o) {
            case 0:
                pm0 pm0Var = rm0.f23913OooOo0o;
                break;
            case 1:
                pm0 pm0Var2 = rm0.f23913OooOo0o;
                break;
            default:
                pm0 pm0Var3 = rm0.f23913OooOo0o;
                break;
        }
        return gn0.f19388OooOoO;
    }
}
