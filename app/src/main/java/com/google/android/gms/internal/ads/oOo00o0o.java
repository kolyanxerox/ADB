package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class oOo00o0o implements o00000O {

    /* renamed from: OooO, reason: collision with root package name */
    public boolean f22888OooO;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final r40 f22891OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o000OOo0 f22892OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public long f22893OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public v91 f22894OooO0o0;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public boolean f22896OooO0oo;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final oOo00ooO f22889OooO00o = new oOo00ooO(0, null, true);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final r40 f22890OooO0O0 = new r40(2048);

    /* renamed from: OooO0oO, reason: collision with root package name */
    public long f22895OooO0oO = -1;

    public oOo00o0o() {
        r40 r40Var = new r40(10);
        this.f22891OooO0OO = r40Var;
        byte[] bArr = r40Var.f23745OooO00o;
        this.f22892OooO0Oo = new o000OOo0(bArr, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0O0(long j, long j2) {
        this.f22896OooO0oo = false;
        this.f22889OooO00o.zze();
        this.f22893OooO0o = j2;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) throws EOFException, InterruptedIOException {
        r40 r40Var;
        o000000 o000000Var;
        int i = 0;
        while (true) {
            r40Var = this.f22891OooO0OO;
            o000000Var = (o000000) o00000oo2;
            o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 10, false);
            r40Var.OooOO0(0);
            if (r40Var.OooOo() != 4801587) {
                break;
            }
            r40Var.OooOO0O(3);
            int iOooOo0 = r40Var.OooOo0();
            i += iOooOo0 + 10;
            o000000Var.OooO0oO(iOooOo0, false);
        }
        o000000 o000000Var2 = (o000000) o00000oo2;
        o000000Var2.f21651OooOoOO = 0;
        o000000Var.OooO0oO(i, false);
        if (this.f22895OooO0oO == -1) {
            this.f22895OooO0oO = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 2, false);
            r40Var.OooOO0(0);
            if ((r40Var.OooOoO() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 4, false);
                o000OOo0 o000ooo02 = this.f22892OooO0Oo;
                o000ooo02.OooOOoo(14);
                int iOooO0o = o000ooo02.OooO0o(13);
                if (iOooO0o <= 6) {
                    i4++;
                    o000000Var2.f21651OooOoOO = 0;
                    o000000Var.OooO0oO(i4, false);
                } else {
                    o000000Var.OooO0oO(iOooO0o - 6, false);
                    i3 += iOooO0o;
                }
            } else {
                i4++;
                o000000Var2.f21651OooOoOO = 0;
                o000000Var.OooO0oO(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        this.f22894OooO0o0 = (v91) o0000ooo;
        this.f22889OooO00o.OooO0Oo(o0000ooo, new oOo00o00(Integer.MIN_VALUE, 0, 1));
        ((v91) o0000ooo).OooO0OO();
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final int OooO0o0(o00000OO o00000oo2, o0000O00 o0000o00) throws C2185w6, EOFException, InterruptedIOException {
        af0.OooOo0O(this.f22894OooO0o0);
        r40 r40Var = this.f22890OooO0O0;
        int iOooOO0 = ((o000000) o00000oo2).OooOO0(r40Var.f23745OooO00o, 0, 2048);
        if (!this.f22888OooO) {
            this.f22894OooO0o0.OooO(new o0000oo(-9223372036854775807L, 0L));
            this.f22888OooO = true;
        }
        if (iOooOO0 == -1) {
            return -1;
        }
        r40Var.OooOO0(0);
        r40Var.OooO(iOooOO0);
        boolean z = this.f22896OooO0oo;
        oOo00ooO ooo00ooo = this.f22889OooO00o;
        if (!z) {
            ooo00ooo.f22916OooOo00 = this.f22893OooO0o;
            this.f22896OooO0oo = true;
        }
        ooo00ooo.OooO0O0(r40Var);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final List zzd() {
        pm0 pm0Var = rm0.f23913OooOo0o;
        return gn0.f19388OooOoO;
    }
}
