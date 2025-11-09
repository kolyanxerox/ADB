package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class oO0OOo0o extends o0OoO00O {
    private static final oO0OOo0o zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        oO0OOo0o oo0ooo0o = new oO0OOo0o();
        zzb = oo0ooo0o;
        o0OoO00O.OooOO0O(oO0OOo0o.class, oo0ooo0o);
    }

    public static /* synthetic */ void OooOOO(oO0OOo0o oo0ooo0o) {
        oo0ooo0o.zzd |= 2;
        oo0ooo0o.zzf = true;
    }

    public static ooOOOOoo OooOOOO() {
        return (ooOOOOoo) zzb.OooO0o();
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new oO0OOo0o();
        }
        if (i2 == 4) {
            return new ooOOOOoo(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
