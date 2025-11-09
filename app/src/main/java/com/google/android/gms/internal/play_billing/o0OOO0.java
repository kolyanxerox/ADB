package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.ez0;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class o0OOO0 extends o0OoO00O {
    private static final o0OOO0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private o0OOo000 zzh;

    static {
        o0OOO0 o0ooo0 = new o0OOO0();
        zzb = o0ooo0;
        o0OoO00O.OooOO0O(o0OOO0.class, o0ooo0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.play_billing.o0OO000o] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.play_billing.o0OoO00O, java.lang.Object] */
    public static o0OOO0 OooOOO(byte[] bArr, o0O000 o0o000) throws o0O00oO0 {
        o0OOO0 o0ooo0 = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r2 = (o0OoO00O) o0ooo0.OooO0Oo(4);
            try {
                ?? OooO00o2 = o0O0oo00.f27130OooO0OO.OooO00o(r2.getClass());
                ez0 ez0Var = new ez0();
                o0o000.getClass();
                OooO00o2.OooO0Oo(r2, bArr, 0, length, ez0Var);
                OooO00o2.OooO00o(r2);
                o0ooo0 = r2;
            } catch (o0O00oO0 e) {
                throw e;
            } catch (o0OO00OO e2) {
                throw new o0O00oO0(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof o0O00oO0) {
                    throw ((o0O00oO0) e3.getCause());
                }
                throw new o0O00oO0(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw new o0O00oO0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (o0ooo0 == null || o0OoO00O.OooOOO0(o0ooo0, true)) {
            return o0ooo0;
        }
        throw new o0O00oO0(new o0OO00OO().getMessage());
    }

    public static /* synthetic */ void OooOOOO(o0OOO0 o0ooo0, o0OOo000 o0ooo000) {
        o0ooo0.zzh = o0ooo000;
        o0ooo0.zzd |= 2;
    }

    public static /* synthetic */ void OooOOOo(o0OOO0 o0ooo0, oO0000o0 oo0000o0) {
        o0ooo0.zzf = oo0000o0;
        o0ooo0.zze = 4;
    }

    public static o0OOO00 OooOOo() {
        return (o0OOO00) zzb.OooO0o();
    }

    public static /* synthetic */ void OooOOo0(o0OOO0 o0ooo0, int i) {
        o0ooo0.zzg = i - 1;
        o0ooo0.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.o0OoO00O
    public final Object OooO0Oo(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0OO000(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", o0oOO.f27164OooO0OO, "zzh", oO0000o0.class});
        }
        if (i2 == 3) {
            return new o0OOO0();
        }
        if (i2 == 4) {
            return new o0OOO00(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
