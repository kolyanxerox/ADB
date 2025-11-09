package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o0OOo000 extends o0OoO00O {
    private static final o0OOo000 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        o0OOo000 o0ooo000 = new o0OOo000();
        zzb = o0ooo000;
        o0OoO00O.OooOO0O(o0OOo000.class, o0ooo000);
    }

    public static /* synthetic */ void OooOOO(o0OOo000 o0ooo000, String str) {
        o0ooo000.zzd |= 8;
        o0ooo000.zzh = str;
    }

    public static /* synthetic */ void OooOOOO(o0OOo000 o0ooo000, String str) {
        str.getClass();
        o0ooo000.zzd |= 2;
        o0ooo000.zzf = str;
    }

    public static /* synthetic */ void OooOOOo(o0OOo000 o0ooo000, int i) {
        o0ooo000.zzd |= 1;
        o0ooo000.zze = i;
    }

    public static o0OOOO0o OooOOo() {
        return (o0OOOO0o) zzb.OooO0o();
    }

    public static /* synthetic */ void OooOOo0(o0OOo000 o0ooo000, int i) {
        o0ooo000.zzg = i - 1;
        o0ooo000.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", o0oOO.f27165OooO0Oo, "zzh"});
        }
        if (i2 == 3) {
            return new o0OOo000();
        }
        if (i2 == 4) {
            return new o0OOOO0o(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
