package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC2183w4;

/* loaded from: classes2.dex */
public final class o0O0o00O extends ooOOOOoo {
    private static final o0O0o00O zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        o0O0o00O o0o0o00o = new o0O0o00O();
        zzg = o0o0o00o;
        ooOOOOoo.OooOOO0(o0O0o00O.class, o0o0o00o);
    }

    public static o0O0o00O OooOOo() {
        return zzg;
    }

    public static o0O0o000 OooOOo0() {
        return (o0O0o000) zzg.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.ooOOOOoo
    public final Object OooOOOO(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new oOo000o0(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", oo0o0O0.f26905OooOOO, "zze", oo0o0O0.OooOO0o, "zzf", oo0o0O0.f26906OooOOO0});
        }
        if (i2 == 3) {
            return new o0O0o00O();
        }
        if (i2 == 4) {
            return new o0O0o000(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int OooOOOo() {
        int iOooO0OO = AbstractC2183w4.OooO0OO(this.zze);
        if (iOooO0OO == 0) {
            return 1;
        }
        return iOooO0OO;
    }

    public final void OooOOoo(int i) {
        this.zze = AbstractC2183w4.OooO0oO(i);
        this.zzb |= 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[PHI: r3
  0x0017: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOo0() {
        /*
            r4 = this;
            int r0 = r4.zzf
            r1 = 1
            if (r0 == 0) goto L19
            r2 = 2
            if (r0 == r1) goto L1a
            r3 = 3
            if (r0 == r2) goto L17
            r2 = 4
            if (r0 == r3) goto L1a
            r3 = 5
            if (r0 == r2) goto L17
            if (r0 == r3) goto L15
            r2 = 0
            goto L1a
        L15:
            r2 = 6
            goto L1a
        L17:
            r2 = r3
            goto L1a
        L19:
            r2 = r1
        L1a:
            if (r2 != 0) goto L1d
            return r1
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.o0O0o00O.OooOo0():int");
    }

    public final int OooOo00() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void OooOo0O(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void OooOo0o(int i) {
        this.zzf = i - 1;
        this.zzb |= 4;
    }
}
