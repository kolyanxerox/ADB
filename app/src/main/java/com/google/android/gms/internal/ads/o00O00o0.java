package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class o00O00o0 implements o00000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f21764OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final r40 f21765OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o000O0 f21766OooO0OO;

    public o00O00o0(int i) {
        this.f21764OooO00o = i;
        switch (i) {
            case 1:
                this.f21765OooO0O0 = new r40(4);
                this.f21766OooO0OO = new o000O0(-1, -1, "image/heif");
                break;
            case 2:
                this.f21765OooO0O0 = new r40(4);
                this.f21766OooO0OO = new o000O0(-1, -1, "image/webp");
                break;
            default:
                this.f21765OooO0O0 = new r40(4);
                this.f21766OooO0OO = new o000O0(-1, -1, "image/avif");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0O0(long j, long j2) {
        switch (this.f21764OooO00o) {
            case 0:
                this.f21766OooO0OO.OooO0O0(j, j2);
                break;
            case 1:
                this.f21766OooO0OO.OooO0O0(j, j2);
                break;
            default:
                this.f21766OooO0OO.OooO0O0(j, j2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) throws EOFException, InterruptedIOException {
        switch (this.f21764OooO00o) {
            case 0:
                ((o000000) o00000oo2).OooO0oO(4, false);
                o000000 o000000Var = (o000000) o00000oo2;
                r40 r40Var = this.f21765OooO0O0;
                r40Var.OooO0oO(4);
                o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 4, false);
                if (r40Var.OooOooO() == 1718909296) {
                    r40Var.OooO0oO(4);
                    o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 4, false);
                    if (r40Var.OooOooO() == 1635150182) {
                    }
                }
                break;
            case 1:
                ((o000000) o00000oo2).OooO0oO(4, false);
                o000000 o000000Var2 = (o000000) o00000oo2;
                r40 r40Var2 = this.f21765OooO0O0;
                r40Var2.OooO0oO(4);
                o000000Var2.OooO0o(r40Var2.f23745OooO00o, 0, 4, false);
                if (r40Var2.OooOooO() == 1718909296) {
                    r40Var2.OooO0oO(4);
                    o000000Var2.OooO0o(r40Var2.f23745OooO00o, 0, 4, false);
                    if (r40Var2.OooOooO() == 1751476579) {
                    }
                }
                break;
            default:
                r40 r40Var3 = this.f21765OooO0O0;
                r40Var3.OooO0oO(4);
                o000000 o000000Var3 = (o000000) o00000oo2;
                o000000Var3.OooO0o(r40Var3.f23745OooO00o, 0, 4, false);
                if (r40Var3.OooOooO() == 1380533830) {
                    o000000Var3.OooO0oO(4, false);
                    r40Var3.OooO0oO(4);
                    o000000Var3.OooO0o(r40Var3.f23745OooO00o, 0, 4, false);
                    if (r40Var3.OooOooO() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        switch (this.f21764OooO00o) {
            case 0:
                this.f21766OooO0OO.OooO0o(o0000ooo);
                break;
            case 1:
                this.f21766OooO0OO.OooO0o(o0000ooo);
                break;
            default:
                this.f21766OooO0OO.OooO0o(o0000ooo);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final int OooO0o0(o00000OO o00000oo2, o0000O00 o0000o00) {
        switch (this.f21764OooO00o) {
        }
        return this.f21766OooO0OO.OooO0o0(o00000oo2, o0000o00);
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final List zzd() {
        switch (this.f21764OooO00o) {
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
