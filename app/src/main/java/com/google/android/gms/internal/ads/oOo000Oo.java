package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class oOo000Oo implements oOo0000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f22861OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f22862OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public long f22863OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f22864OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final Object f22865OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f22866OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public Object f22867OooO0oO;

    public oOo000Oo() {
        this.f22861OooO00o = 1;
        this.f22865OooO0o = new r40(10);
        this.f22863OooO0OO = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO00o(boolean z) {
        int i;
        switch (this.f22861OooO00o) {
            case 0:
                if (this.f22862OooO0O0) {
                    af0.OooooO0(this.f22863OooO0OO != -9223372036854775807L);
                    int i2 = 0;
                    while (true) {
                        o000O[] o000oArr = (o000O[]) this.f22867OooO0oO;
                        if (i2 >= o000oArr.length) {
                            this.f22862OooO0O0 = false;
                            break;
                        } else {
                            o000oArr[i2].OooO00o(this.f22863OooO0OO, 1, this.f22866OooO0o0, 0, null);
                            i2++;
                        }
                    }
                }
                break;
            default:
                af0.OooOo0O((o000O) this.f22867OooO0oO);
                if (this.f22862OooO0O0 && (i = this.f22864OooO0Oo) != 0 && this.f22866OooO0o0 == i) {
                    af0.OooooO0(this.f22863OooO0OO != -9223372036854775807L);
                    ((o000O) this.f22867OooO0oO).OooO00o(this.f22863OooO0OO, 1, this.f22864OooO0Oo, 0, null);
                    this.f22862OooO0O0 = false;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0O0(r40 r40Var) {
        boolean z;
        boolean z2;
        switch (this.f22861OooO00o) {
            case 0:
                if (this.f22862OooO0O0) {
                    int i = 0;
                    if (this.f22864OooO0Oo == 2) {
                        if (r40Var.OooOOOO() == 0) {
                            z2 = false;
                        } else {
                            if (r40Var.OooOo0O() != 32) {
                                this.f22862OooO0O0 = false;
                            }
                            this.f22864OooO0Oo--;
                            z2 = this.f22862OooO0O0;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.f22864OooO0Oo == 1) {
                        if (r40Var.OooOOOO() == 0) {
                            z = false;
                        } else {
                            if (r40Var.OooOo0O() != 0) {
                                this.f22862OooO0O0 = false;
                            }
                            this.f22864OooO0Oo--;
                            z = this.f22862OooO0O0;
                        }
                        if (!z) {
                        }
                    }
                    int i2 = r40Var.f23746OooO0O0;
                    int iOooOOOO = r40Var.OooOOOO();
                    while (true) {
                        o000O[] o000oArr = (o000O[]) this.f22867OooO0oO;
                        if (i >= o000oArr.length) {
                            this.f22866OooO0o0 += iOooOOOO;
                            break;
                        } else {
                            o000O o000o = o000oArr[i];
                            r40Var.OooOO0(i2);
                            o000o.OooO0Oo(iOooOOOO, r40Var);
                            i++;
                        }
                    }
                }
                break;
            default:
                af0.OooOo0O((o000O) this.f22867OooO0oO);
                if (this.f22862OooO0O0) {
                    int iOooOOOO2 = r40Var.OooOOOO();
                    int i3 = this.f22866OooO0o0;
                    if (i3 < 10) {
                        int iMin = Math.min(iOooOOOO2, 10 - i3);
                        byte[] bArr = r40Var.f23745OooO00o;
                        int i4 = r40Var.f23746OooO0O0;
                        r40 r40Var2 = (r40) this.f22865OooO0o;
                        System.arraycopy(bArr, i4, r40Var2.f23745OooO00o, this.f22866OooO0o0, iMin);
                        if (this.f22866OooO0o0 + iMin == 10) {
                            r40Var2.OooOO0(0);
                            if (r40Var2.OooOo0O() != 73 || r40Var2.OooOo0O() != 68 || r40Var2.OooOo0O() != 51) {
                                AbstractC1641hg.OooOOo0("Id3Reader", "Discarding invalid ID3 tag");
                                this.f22862OooO0O0 = false;
                                break;
                            } else {
                                r40Var2.OooOO0O(3);
                                this.f22864OooO0Oo = r40Var2.OooOo0() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iOooOOOO2, this.f22864OooO0Oo - this.f22866OooO0o0);
                    ((o000O) this.f22867OooO0oO).OooO0Oo(iMin2, r40Var);
                    this.f22866OooO0o0 += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0OO(int i, long j) {
        switch (this.f22861OooO00o) {
            case 0:
                if ((i & 4) != 0) {
                    this.f22862OooO0O0 = true;
                    this.f22863OooO0OO = j;
                    this.f22866OooO0o0 = 0;
                    this.f22864OooO0Oo = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f22862OooO0O0 = true;
                    this.f22863OooO0OO = j;
                    this.f22864OooO0Oo = 0;
                    this.f22866OooO0o0 = 0;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0Oo(o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
        switch (this.f22861OooO00o) {
            case 0:
                int i = 0;
                while (true) {
                    o000O[] o000oArr = (o000O[]) this.f22867OooO0oO;
                    if (i >= o000oArr.length) {
                        break;
                    } else {
                        oO0oO000 oo0oo000 = (oO0oO000) ((List) this.f22865OooO0o).get(i);
                        ooo00o00.OooO00o();
                        ooo00o00.OooO0O0();
                        o000O o000oOooO0oO = o0000ooo.OooO0oO(ooo00o00.f22886OooO0Oo, 3);
                        jb1 jb1Var = new jb1();
                        ooo00o00.OooO0O0();
                        jb1Var.f20241OooO00o = ooo00o00.f22887OooO0o0;
                        jb1Var.OooO0OO("application/dvbsubs");
                        jb1Var.f20253OooOOOO = Collections.singletonList(oo0oo000.f22747OooO0O0);
                        jb1Var.f20244OooO0Oo = oo0oo000.f22746OooO00o;
                        o000oOooO0oO.OooO0o0(new o0OoOo0(jb1Var));
                        o000oArr[i] = o000oOooO0oO;
                        i++;
                    }
                }
            default:
                ooo00o00.OooO00o();
                ooo00o00.OooO0O0();
                o000O o000oOooO0oO2 = o0000ooo.OooO0oO(ooo00o00.f22886OooO0Oo, 5);
                this.f22867OooO0oO = o000oOooO0oO2;
                jb1 jb1Var2 = new jb1();
                ooo00o00.OooO0O0();
                jb1Var2.f20241OooO00o = ooo00o00.f22887OooO0o0;
                jb1Var2.OooO0OO("application/id3");
                o000oOooO0oO2.OooO0o0(new o0OoOo0(jb1Var2));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void zze() {
        switch (this.f22861OooO00o) {
            case 0:
                this.f22862OooO0O0 = false;
                this.f22863OooO0OO = -9223372036854775807L;
                break;
            default:
                this.f22862OooO0O0 = false;
                this.f22863OooO0OO = -9223372036854775807L;
                break;
        }
    }

    public oOo000Oo(List list) {
        this.f22861OooO00o = 0;
        this.f22865OooO0o = list;
        this.f22867OooO0oO = new o000O[list.size()];
        this.f22863OooO0OO = -9223372036854775807L;
    }
}
