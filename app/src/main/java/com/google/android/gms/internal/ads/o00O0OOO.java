package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class o00O0OOO implements o00000O {

    /* renamed from: OooO, reason: collision with root package name */
    public OoooOOO.o0O0O0O f21809OooO;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public v91 f21811OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f21812OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f21813OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f21815OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public o0O00000 f21816OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public o000000 f21817OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public o0OO000o f21818OooOO0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final r40 f21810OooO00o = new r40(6);

    /* renamed from: OooO0o, reason: collision with root package name */
    public long f21814OooO0o = -1;

    public final int OooO00o(o000000 o000000Var) {
        r40 r40Var = this.f21810OooO00o;
        r40Var.OooO0oO(2);
        o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 2, false);
        return r40Var.OooOoO();
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0O0(long j, long j2) {
        if (j == 0) {
            this.f21812OooO0OO = 0;
            this.f21818OooOO0 = null;
        } else if (this.f21812OooO0OO == 5) {
            o0OO000o o0oo000o = this.f21818OooOO0;
            o0oo000o.getClass();
            o0oo000o.OooO0O0(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) throws EOFException, InterruptedIOException {
        o000000 o000000Var = (o000000) o00000oo2;
        if (OooO00o(o000000Var) == 65496) {
            int iOooO00o = OooO00o(o000000Var);
            this.f21813OooO0Oo = iOooO00o;
            r40 r40Var = this.f21810OooO00o;
            if (iOooO00o == 65504) {
                r40Var.OooO0oO(2);
                o000000 o000000Var2 = (o000000) o00000oo2;
                o000000Var2.OooO0o(r40Var.f23745OooO00o, 0, 2, false);
                o000000Var2.OooO0oO(r40Var.OooOoO() - 2, false);
                iOooO00o = OooO00o(o000000Var);
                this.f21813OooO0Oo = iOooO00o;
            }
            if (iOooO00o == 65505) {
                o000000 o000000Var3 = (o000000) o00000oo2;
                o000000Var3.OooO0oO(2, false);
                r40Var.OooO0oO(6);
                o000000Var3.OooO0o(r40Var.f23745OooO00o, 0, 6, false);
                if (r40Var.OooOooO() == 1165519206 && r40Var.OooOoO() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void OooO0Oo() {
        v91 v91Var = this.f21811OooO0O0;
        v91Var.getClass();
        v91Var.OooO0OO();
        this.f21811OooO0O0.OooO(new o0000oo(-9223372036854775807L, 0L));
        this.f21812OooO0OO = 6;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        this.f21811OooO0O0 = (v91) o0000ooo;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x028d  */
    @Override // com.google.android.gms.internal.ads.o00000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0o0(com.google.android.gms.internal.ads.o00000OO r34, com.google.android.gms.internal.ads.o0000O00 r35) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o00O0OOO.OooO0o0(com.google.android.gms.internal.ads.o00000OO, com.google.android.gms.internal.ads.o0000O00):int");
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final List zzd() {
        pm0 pm0Var = rm0.f23913OooOo0o;
        return gn0.f19388OooOoO;
    }
}
