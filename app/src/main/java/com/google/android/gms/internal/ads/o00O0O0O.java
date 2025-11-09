package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class o00O0O0O implements o00000O {

    /* renamed from: OooO, reason: collision with root package name */
    public long f21785OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final r40 f21786OooO00o = new r40(4);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final r40 f21787OooO0O0 = new r40(9);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final r40 f21788OooO0OO = new r40(11);

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final r40 f21789OooO0Oo = new r40();

    /* renamed from: OooO0o, reason: collision with root package name */
    public v91 f21790OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o00O0OO0 f21791OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f21792OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public boolean f21793OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f21794OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int f21795OooOO0O;
    public int OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public boolean f21796OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public long f21797OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public o00O0O0 f21798OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public o00O0OO f21799OooOOOo;

    public o00O0O0O() {
        o00O0OO0 o00o0oo0 = new o00O0OO0(new o00000O0());
        o00o0oo0.f21806OooOo = -9223372036854775807L;
        o00o0oo0.f21808OooOoO0 = new long[0];
        o00o0oo0.f21807OooOoO = new long[0];
        this.f21791OooO0o0 = o00o0oo0;
        this.f21792OooO0oO = 1;
    }

    public final r40 OooO00o(o000000 o000000Var) throws EOFException, InterruptedIOException {
        int i = this.OooOO0o;
        r40 r40Var = this.f21789OooO0Oo;
        byte[] bArr = r40Var.f23745OooO00o;
        if (i > bArr.length) {
            int length = bArr.length;
            r40Var.OooO0oo(0, new byte[Math.max(length + length, i)]);
        } else {
            r40Var.OooOO0(0);
        }
        r40Var.OooO(this.OooOO0o);
        o000000Var.OooO0o0(r40Var.f23745OooO00o, 0, this.OooOO0o, false);
        return r40Var;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0O0(long j, long j2) {
        if (j == 0) {
            this.f21792OooO0oO = 1;
            this.f21793OooO0oo = false;
        } else {
            this.f21792OooO0oO = 3;
        }
        this.f21794OooOO0 = 0;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) throws EOFException, InterruptedIOException {
        r40 r40Var = this.f21786OooO00o;
        o000000 o000000Var = (o000000) o00000oo2;
        o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 3, false);
        r40Var.OooOO0(0);
        if (r40Var.OooOo() == 4607062) {
            o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 2, false);
            r40Var.OooOO0(0);
            if ((r40Var.OooOoO() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) == 0) {
                o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 4, false);
                r40Var.OooOO0(0);
                int iOooOOo0 = r40Var.OooOOo0();
                ((o000000) o00000oo2).f21651OooOoOO = 0;
                o000000Var.OooO0oO(iOooOOo0, false);
                o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 4, false);
                r40Var.OooOO0(0);
                if (r40Var.OooOOo0() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        this.f21790OooO0o = (v91) o0000ooo;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x038b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0007 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.o00000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0o0(com.google.android.gms.internal.ads.o00000OO r31, com.google.android.gms.internal.ads.o0000O00 r32) throws com.google.android.gms.internal.ads.C2185w6, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o00O0O0O.OooO0o0(com.google.android.gms.internal.ads.o00000OO, com.google.android.gms.internal.ads.o0000O00):int");
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final List zzd() {
        pm0 pm0Var = rm0.f23913OooOo0o;
        return gn0.f19388OooOoO;
    }
}
