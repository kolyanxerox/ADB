package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a31 extends zz0 {
    private static final a31 zza;
    private static volatile y01 zzb;
    private h01 zzA;
    private h01 zzB;
    private y21 zzC;
    private h01 zzD;
    private d21 zzE;
    private String zzF;
    private y11 zzG;
    private h01 zzH;
    private n21 zzI;
    private int zzJ;
    private h01 zzK;
    private h01 zzL;
    private long zzM;
    private z21 zzN;
    private q21 zzO;
    private String zzP;
    private int zzc;
    private int zzd;
    private int zze;
    private b21 zzi;
    private h01 zzj;
    private h01 zzk;
    private String zzl;
    private t21 zzm;
    private boolean zzn;
    private h01 zzo;
    private String zzp;
    private boolean zzu;
    private boolean zzv;
    private jz0 zzw;
    private x21 zzx;
    private boolean zzy;
    private String zzz;
    private byte zzQ = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        a31 a31Var = new a31();
        zza = a31Var;
        zz0.OooOO0O(a31.class, a31Var);
    }

    public a31() {
        b11 b11Var = b11.f17344OooOoO;
        this.zzj = b11Var;
        this.zzk = b11Var;
        this.zzl = "";
        this.zzo = b11Var;
        this.zzp = "";
        this.zzw = jz0.f20406OooOo0o;
        this.zzz = "";
        this.zzA = b11Var;
        this.zzB = b11Var;
        this.zzD = b11Var;
        this.zzF = "";
        this.zzH = b11Var;
        this.zzK = b11Var;
        this.zzL = b11Var;
        this.zzP = "";
    }

    public static z11 OooOo0o() {
        return (z11) zza.OooO0oO();
    }

    public static void OooOoOO(a31 a31Var, ArrayList arrayList) {
        h01 h01Var = a31Var.zzA;
        if (!((cz0) h01Var).f18106OooOo0O) {
            int size = h01Var.size();
            a31Var.zzA = h01Var.OooO0O0(size + size);
        }
        bz0.OooO0OO(arrayList, a31Var.zzA);
    }

    public static void OooOoo(a31 a31Var, v21 v21Var) {
        h01 h01Var = a31Var.zzj;
        if (!((cz0) h01Var).f18106OooOo0O) {
            int size = h01Var.size();
            a31Var.zzj = h01Var.OooO0O0(size + size);
        }
        a31Var.zzj.add(v21Var);
    }

    public static void OooOoo0(a31 a31Var, ArrayList arrayList) {
        h01 h01Var = a31Var.zzB;
        if (!((cz0) h01Var).f18106OooOo0O) {
            int size = h01Var.size();
            a31Var.zzB = h01Var.OooO0O0(size + size);
        }
        bz0.OooO0OO(arrayList, a31Var.zzB);
    }

    public static /* synthetic */ void OooOooO(a31 a31Var) {
        a31Var.zzc &= -65;
        a31Var.zzl = zza.zzl;
    }

    public static /* synthetic */ void OooOooo(a31 a31Var, String str) {
        a31Var.zzc |= 64;
        a31Var.zzl = str;
    }

    public static /* synthetic */ void Oooo0(a31 a31Var, t21 t21Var) {
        a31Var.zzm = t21Var;
        a31Var.zzc |= 128;
    }

    public static /* synthetic */ void Oooo000(a31 a31Var, x21 x21Var) {
        a31Var.zzx = x21Var;
        a31Var.zzc |= 8192;
    }

    public static /* synthetic */ void Oooo00O(a31 a31Var, b21 b21Var) {
        a31Var.zzi = b21Var;
        a31Var.zzc |= 32;
    }

    public static /* synthetic */ void Oooo00o(a31 a31Var, String str) {
        str.getClass();
        a31Var.zzc |= 8;
        a31Var.zzg = str;
    }

    public static /* synthetic */ void Oooo0O0(a31 a31Var, String str) {
        str.getClass();
        a31Var.zzc |= 4;
        a31Var.zzf = str;
    }

    public static /* synthetic */ void Oooo0OO(a31 a31Var, int i) {
        a31Var.zzd = i - 1;
        a31Var.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        switch (OooOOo.OooOOO.OooO0O0(i)) {
            case 0:
                return Byte.valueOf(this.zzQ);
            case 1:
                this.zzQ = zz0Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new c11(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", v21.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", o21.f22311OooO0o0, "zze", C1771l.f20747OooOoo0, "zzi", "zzl", "zzm", "zzw", "zzk", d31.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", f31.class, "zzE", "zzF", "zzG", "zzH", e21.class, "zzI", "zzJ", o21.f22313OooO0oo, "zzK", p21.class, "zzL", r21.class, "zzM", "zzN", "zzO", "zzP"});
            case 3:
                return new a31();
            case 4:
                return new z11(zza);
            case 5:
                return zza;
            case 6:
                y01 y01Var = zzb;
                if (y01Var != null) {
                    return y01Var;
                }
                synchronized (a31.class) {
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
            default:
                throw null;
        }
    }

    public final String OooOo() {
        return this.zzl;
    }

    public final h01 OooOoO() {
        return this.zzj;
    }

    public final String OooOoO0() {
        return this.zzf;
    }
}
