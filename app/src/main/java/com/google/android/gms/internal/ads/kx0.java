package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class kx0 extends zz0 {
    private static final kx0 zza;
    private static volatile y01 zzb;
    private String zzc = "";
    private jz0 zzd = jz0.f20406OooOo0o;
    private int zze;

    static {
        kx0 kx0Var = new kx0();
        zza = kx0Var;
        zz0.OooOO0O(kx0.class, kx0Var);
    }

    public static jx0 OooOo0o() {
        return (jx0) zza.OooO0oO();
    }

    public static kx0 OooOoO0() {
        return zza;
    }

    public static /* synthetic */ void OooOoo(kx0 kx0Var, String str) {
        str.getClass();
        kx0Var.zzc = str;
    }

    public static void OooOoo0(kx0 kx0Var, int i) {
        int i2;
        if (i == 6) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        switch (i) {
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = -1;
                break;
            default:
                throw null;
        }
        kx0Var.zze = i2;
    }

    public static /* synthetic */ void OooOooO(kx0 kx0Var, jz0 jz0Var) {
        jz0Var.getClass();
        kx0Var.zzd = jz0Var;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            return new c11(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOooO0O0 == 3) {
            return new kx0();
        }
        if (iOooO0O0 == 4) {
            return new jx0(zza);
        }
        if (iOooO0O0 == 5) {
            return zza;
        }
        if (iOooO0O0 != 6) {
            throw null;
        }
        y01 y01Var = zzb;
        if (y01Var != null) {
            return y01Var;
        }
        synchronized (kx0.class) {
            try {
                yz0Var = zzb;
                if (yz0Var == null) {
                    yz0Var = new yz0();
                    zzb = yz0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yz0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0014 A[PHI: r2
  0x0014: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:23:0x0006, B:27:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOo() {
        /*
            r3 = this;
            int r0 = r3.zze
            r1 = 1
            if (r0 == 0) goto L15
            r2 = 2
            if (r0 == r1) goto L14
            r1 = 3
            if (r0 == r2) goto L15
            r2 = 4
            if (r0 == r1) goto L14
            if (r0 == r2) goto L12
            r1 = 0
            goto L15
        L12:
            r1 = 5
            goto L15
        L14:
            r1 = r2
        L15:
            if (r1 != 0) goto L19
            r0 = 6
            return r0
        L19:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kx0.OooOo():int");
    }

    public final jz0 OooOoO() {
        return this.zzd;
    }

    public final String OooOoOO() {
        return this.zzc;
    }
}
