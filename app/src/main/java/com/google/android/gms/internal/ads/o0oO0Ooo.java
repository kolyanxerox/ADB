package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class o0oO0Ooo implements o00000O {

    /* renamed from: OooO */
    public C2107u2 f22251OooO;

    /* renamed from: OooO0o */
    public o000O f22256OooO0o;

    /* renamed from: OooO0o0 */
    public v91 f22257OooO0o0;

    /* renamed from: OooO0oo */
    public int f22259OooO0oo;

    /* renamed from: OooOO0O */
    public long f22261OooOO0O;
    public long OooOO0o;

    /* renamed from: OooOOO */
    public int f22262OooOOO;

    /* renamed from: OooOOOO */
    public o0O00oO0 f22264OooOOOO;

    /* renamed from: OooOOOo */
    public boolean f22265OooOOOo;

    /* renamed from: OooO00o */
    public final r40 f22252OooO00o = new r40(10);

    /* renamed from: OooO0O0 */
    public final o000O0o f22253OooO0O0 = new o000O0o();

    /* renamed from: OooO0OO */
    public final o0000O f22254OooO0OO = new o0000O();

    /* renamed from: OooOO0 */
    public long f22260OooOO0 = -9223372036854775807L;

    /* renamed from: OooO0Oo */
    public final o000 f22255OooO0Oo = new o000(0);

    /* renamed from: OooO0oO */
    public o000O f22258OooO0oO = new o00000O0();

    /* renamed from: OooOOO0 */
    public long f22263OooOOO0 = -1;

    public final void OooO00o() {
        o0O00oO0 o0o00oo0 = this.f22264OooOOOO;
        if ((o0o00oo0 instanceof o0O00OO) && ((o0O00OO) o0o00oo0).zzh()) {
            long j = this.f22263OooOOO0;
            if (j == -1 || j == this.f22264OooOOOO.zzd()) {
                return;
            }
            o0O00OO o0o00oo = (o0O00OO) this.f22264OooOOOO;
            this.f22264OooOOOO = new o0O00OO(o0o00oo.f21948OooO0oo, o0o00oo.f21940OooO, this.f22263OooOOO0, o0o00oo.f21947OooO0oO);
            v91 v91Var = this.f22257OooO0o0;
            v91Var.getClass();
            v91Var.OooO(this.f22264OooOOOO);
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0O0(long j, long j2) {
        this.f22259OooO0oo = 0;
        this.f22260OooOO0 = -9223372036854775807L;
        this.f22261OooOO0O = 0L;
        this.f22262OooOOO = 0;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) {
        return OooO0oO((o000000) o00000oo2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0Oo(com.google.android.gms.internal.ads.o000000 r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.o0O00oO0 r0 = r8.f22264OooOOOO
            r1 = 1
            if (r0 == 0) goto L1a
            long r2 = r0.zzd()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1a
            long r4 = r9.zze()
            r6 = -4
            long r2 = r2 + r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L28
        L1a:
            com.google.android.gms.internal.ads.r40 r0 = r8.f22252OooO00o     // Catch: java.io.EOFException -> L28
            byte[] r0 = r0.f23745OooO00o     // Catch: java.io.EOFException -> L28
            r2 = 4
            r3 = 0
            boolean r9 = r9.OooO0o(r0, r3, r2, r1)     // Catch: java.io.EOFException -> L28
            if (r9 != 0) goto L27
            goto L28
        L27:
            return r3
        L28:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0oO0Ooo.OooO0Oo(com.google.android.gms.internal.ads.o000000):boolean");
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        v91 v91Var = (v91) o0000ooo;
        this.f22257OooO0o0 = v91Var;
        o000O o000oOooO0oO = v91Var.OooO0oO(0, 1);
        this.f22256OooO0o = o000oOooO0oO;
        this.f22258OooO0oO = o000oOooO0oO;
        this.f22257OooO0o0.OooO0OO();
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0096 A[PHI: r29
  0x0096: PHI (r29v3 com.google.android.gms.internal.ads.r40) = 
  (r29v0 com.google.android.gms.internal.ads.r40)
  (r29v0 com.google.android.gms.internal.ads.r40)
  (r29v0 com.google.android.gms.internal.ads.r40)
  (r29v10 com.google.android.gms.internal.ads.r40)
 binds: [B:364:0x0292, B:371:0x02a6, B:348:0x0246, B:263:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:455:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.o00000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0o0(com.google.android.gms.internal.ads.o00000OO r57, com.google.android.gms.internal.ads.o0000O00 r58) throws java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0oO0Ooo.OooO0o0(com.google.android.gms.internal.ads.o00000OO, com.google.android.gms.internal.ads.o0000O00):int");
    }

    public final boolean OooO0oO(o000000 o000000Var, boolean z) throws EOFException, InterruptedIOException {
        int iZze;
        int i;
        int iOooO0OO;
        o000000Var.f21651OooOoOO = 0;
        if (o000000Var.f21650OooOoO0 == 0) {
            C2107u2 c2107u2OooO00o = this.f22255OooO0Oo.OooO00o(o000000Var, null);
            this.f22251OooO = c2107u2OooO00o;
            if (c2107u2OooO00o != null) {
                this.f22254OooO0OO.OooO00o(c2107u2OooO00o);
            }
            iZze = (int) o000000Var.zze();
            if (!z) {
                o000000Var.OooO(iZze);
            }
            i = 0;
        } else {
            iZze = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (!OooO0Oo(o000000Var)) {
                r40 r40Var = this.f22252OooO00o;
                r40Var.OooOO0(0);
                int iOooOOo0 = r40Var.OooOOo0();
                if ((i == 0 || ((-128000) & iOooOOo0) == (i & (-128000))) && (iOooO0OO = AbstractC1641hg.OooO0OO(iOooOOo0)) != -1) {
                    i2++;
                    if (i2 != 1) {
                        if (i2 == 4) {
                            break;
                        }
                    } else {
                        this.f22253OooO0O0.OooO00o(iOooOOo0);
                        i = iOooOOo0;
                    }
                    o000000Var.OooO0oO(iOooO0OO - 4, false);
                } else {
                    int i4 = i3 + 1;
                    if (i3 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        OooO00o();
                        throw new EOFException();
                    }
                    if (z) {
                        o000000Var.f21651OooOoOO = 0;
                        o000000Var.OooO0oO(iZze + i4, false);
                    } else {
                        o000000Var.OooO(1);
                    }
                    i = 0;
                    i3 = i4;
                    i2 = 0;
                }
            } else if (i2 <= 0) {
                OooO00o();
                throw new EOFException();
            }
        }
        if (z) {
            o000000Var.OooO(iZze + i3);
        } else {
            o000000Var.f21651OooOoOO = 0;
        }
        this.f22259OooO0oo = i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final List zzd() {
        pm0 pm0Var = rm0.f23913OooOo0o;
        return gn0.f19388OooOoO;
    }
}
