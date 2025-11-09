package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class oO00000 extends o0OoO00O {
    private static final oO00000 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        oO00000 oo00000 = new oO00000();
        zzb = oo00000;
        o0OoO00O.OooOO0O(oO00000.class, oo00000);
    }

    public static /* synthetic */ void OooOOO(oO00000 oo00000, int i) {
        oo00000.zzd |= 4;
        oo00000.zzg = i;
    }

    public static /* synthetic */ void OooOOOO(oO00000 oo00000, long j) {
        oo00000.zzd |= 8;
        oo00000.zzh = j;
    }

    public static /* synthetic */ void OooOOOo(oO00000 oo00000, String str) {
        str.getClass();
        oo00000.zzd |= 2;
        oo00000.zzf = str;
    }

    public static C2360o OooOOo() {
        return (C2360o) zzb.OooO0o();
    }

    public static /* synthetic */ void OooOOo0(oO00000 oo00000, String str) {
        str.getClass();
        oo00000.zzd |= 1;
        oo00000.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new oO00000();
        }
        if (i2 == 4) {
            return new C2360o(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
