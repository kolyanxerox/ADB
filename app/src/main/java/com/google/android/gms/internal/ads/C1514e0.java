package com.google.android.gms.internal.ads;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* renamed from: com.google.android.gms.internal.ads.e0 */
/* loaded from: classes2.dex */
public final class C1514e0 extends zz0 {
    private static final C1514e0 zza;
    private static volatile y01 zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzI;
    private long zzJ;
    private long zzK;
    private long zzM;
    private C1588g0 zzP;
    private int zzaA;
    private int zzaB;
    private String zzaC;
    private h01 zzaD;
    private int zzaE;
    private h01 zzaF;
    private C2289z zzaG;
    private String zzaH;
    private long zzaI;
    private long zzaJ;
    private long zzaK;
    private long zzaL;
    private long zzaM;
    private long zzaN;
    private String zzaO;
    private C2178w zzaP;
    private C2215x zzaQ;
    private long zzaR;
    private long zzaS;
    private int zzaT;
    private long zzaU;
    private String zzaV;
    private int zzaW;
    private boolean zzaX;
    private String zzaY;
    private long zzaZ;
    private C1405b0 zzah;
    private h01 zzai;
    private C1478d0 zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private long zzap;
    private long zzaq;
    private long zzar;
    private String zzas;
    private long zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private int zzax;
    private C1809m0 zzay;
    private long zzaz;
    private C1772l0 zzba;
    private long zzbb;
    private String zzbc;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzu;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzf = "";
    private String zzg = "";
    private String zzv = "";
    private String zzF = "";
    private String zzG = "D";
    private String zzH = "";
    private String zzL = "";
    private long zzN = -1;
    private long zzO = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private long zzV = -1;
    private String zzW = "D";
    private String zzX = "D";
    private long zzY = -1;
    private int zzZ = 1000;
    private int zzaa = 1000;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private long zzaf = -1;
    private int zzag = 1000;

    static {
        C1514e0 c1514e0 = new C1514e0();
        zza = c1514e0;
        zz0.OooOO0O(C1514e0.class, c1514e0);
    }

    public C1514e0() {
        b11 b11Var = b11.f17344OooOoO;
        this.zzai = b11Var;
        this.zzak = -1L;
        this.zzal = -1L;
        this.zzam = -1L;
        this.zzan = -1L;
        this.zzao = -1L;
        this.zzap = -1L;
        this.zzaq = -1L;
        this.zzar = -1L;
        this.zzas = "D";
        this.zzat = -1L;
        this.zzaz = -1L;
        this.zzaA = 1000;
        this.zzaB = 1000;
        this.zzaC = "D";
        this.zzaD = b11Var;
        this.zzaE = 1000;
        this.zzaF = b11Var;
        this.zzaH = "";
        this.zzaI = -1L;
        this.zzaJ = -1L;
        this.zzaK = -1L;
        this.zzaL = -1L;
        this.zzaN = -1L;
        this.zzaO = "";
        this.zzaR = -1L;
        this.zzaS = -1L;
        this.zzaV = "";
        this.zzaW = 2;
        this.zzaY = "";
        this.zzbb = -1L;
        this.zzbc = "";
    }

    public static /* synthetic */ void OooOo(C1514e0 c1514e0, long j) {
        c1514e0.zze |= 134217728;
        c1514e0.zzaZ = j;
    }

    public static /* synthetic */ void OooOo0o(C1514e0 c1514e0, String str) {
        str.getClass();
        c1514e0.zze |= 8388608;
        c1514e0.zzaV = str;
    }

    public static /* synthetic */ void OooOoO(C1514e0 c1514e0, long j) {
        c1514e0.zze |= 4096;
        c1514e0.zzaK = j;
    }

    public static /* synthetic */ void OooOoO0(C1514e0 c1514e0, long j) {
        c1514e0.zze |= 8192;
        c1514e0.zzaL = j;
    }

    public static /* synthetic */ void OooOoOO(C1514e0 c1514e0, String str) {
        str.getClass();
        c1514e0.zzd |= 256;
        c1514e0.zzX = str;
    }

    public static /* synthetic */ void OooOoo(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 1048576;
        c1514e0.zzD = j;
    }

    public static /* synthetic */ void OooOoo0(C1514e0 c1514e0, String str) {
        str.getClass();
        c1514e0.zzc |= 4194304;
        c1514e0.zzF = str;
    }

    public static /* synthetic */ void OooOooO(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 1024;
        c1514e0.zzp = j;
    }

    public static /* synthetic */ void OooOooo(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 2048;
        c1514e0.zzu = j;
    }

    public static /* synthetic */ void Oooo(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 32768;
        c1514e0.zzy = j;
    }

    public static /* synthetic */ void Oooo0(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= 8388608;
        c1514e0.zzan = j;
    }

    public static /* synthetic */ void Oooo000(C1514e0 c1514e0, String str) {
        str.getClass();
        c1514e0.zzc |= 1;
        c1514e0.zzf = str;
    }

    public static /* synthetic */ void Oooo00O(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= 4194304;
        c1514e0.zzam = j;
    }

    public static /* synthetic */ void Oooo00o(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 524288;
        c1514e0.zzC = j;
    }

    public static /* synthetic */ void Oooo0O0(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= 64;
        c1514e0.zzV = j;
    }

    public static /* synthetic */ void Oooo0OO(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= 16;
        c1514e0.zzT = j;
    }

    public static /* synthetic */ void Oooo0o(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= 8;
        c1514e0.zzS = j;
    }

    public static /* synthetic */ void Oooo0o0(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= Integer.MIN_VALUE;
        c1514e0.zzO = j;
    }

    public static /* synthetic */ void Oooo0oO(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= 4;
        c1514e0.zzR = j;
    }

    public static /* synthetic */ void Oooo0oo(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= BasicMeasure.EXACTLY;
        c1514e0.zzN = j;
    }

    public static /* synthetic */ void OoooO(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= 16384;
        c1514e0.zzad = j;
    }

    public static /* synthetic */ void OoooO0(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 8192;
        c1514e0.zzw = j;
    }

    public static /* synthetic */ void OoooO00(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= 2;
        c1514e0.zzQ = j;
    }

    public static /* synthetic */ void OoooO0O(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 16384;
        c1514e0.zzx = j;
    }

    public static /* synthetic */ void OoooOO0(C1514e0 c1514e0, long j) {
        c1514e0.zze |= 1024;
        c1514e0.zzaI = j;
    }

    public static C2104u OoooOOO() {
        return (C2104u) zza.OooO0oO();
    }

    public static /* synthetic */ void OoooOOo(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        c1514e0.zzJ = j;
    }

    public static /* synthetic */ void OoooOo0(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 65536;
        c1514e0.zzz = j;
    }

    public static /* synthetic */ void OoooOoO(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 2097152;
        c1514e0.zzE = j;
    }

    public static /* synthetic */ void OoooOoo(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 134217728;
        c1514e0.zzK = j;
    }

    public static /* synthetic */ void Ooooo00(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 33554432;
        c1514e0.zzI = j;
    }

    public static /* synthetic */ void Ooooo0o(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 536870912;
        c1514e0.zzM = j;
    }

    public static /* synthetic */ void OooooO0(C1514e0 c1514e0, C1478d0 c1478d0) {
        c1514e0.zzaj = c1478d0;
        c1514e0.zzd |= 524288;
    }

    public static /* synthetic */ void OooooOO(C1514e0 c1514e0, String str) {
        str.getClass();
        c1514e0.zzc |= 268435456;
        c1514e0.zzL = str;
    }

    public static /* synthetic */ void Ooooooo(C1514e0 c1514e0, int i) {
        c1514e0.zzaa = i - 1;
        c1514e0.zzd |= 2048;
    }

    public static /* synthetic */ void o00000(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 32;
        c1514e0.zzk = j;
    }

    public static /* synthetic */ void o000000(C1514e0 c1514e0, String str) {
        str.getClass();
        c1514e0.zzd |= 128;
        c1514e0.zzW = str;
    }

    public static /* synthetic */ void o000000O(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 4;
        c1514e0.zzh = j;
    }

    public static /* synthetic */ void o000000o(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= 2097152;
        c1514e0.zzal = j;
    }

    public static /* synthetic */ void o00000O(C1514e0 c1514e0, String str) {
        str.getClass();
        c1514e0.zzc |= 16777216;
        c1514e0.zzH = str;
    }

    public static /* synthetic */ void o00000O0(C1514e0 c1514e0, long j) {
        c1514e0.zzc |= 16;
        c1514e0.zzj = j;
    }

    public static /* synthetic */ void o00000OO(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= 32;
        c1514e0.zzU = j;
    }

    public static /* synthetic */ void o00000Oo(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= 4096;
        c1514e0.zzab = j;
    }

    public static /* synthetic */ void o00000o0(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= 8192;
        c1514e0.zzac = j;
    }

    public static /* synthetic */ void o0000Ooo(C1514e0 c1514e0, boolean z) {
        c1514e0.zze |= 33554432;
        c1514e0.zzaX = z;
    }

    public static /* synthetic */ void o000OOo(C1514e0 c1514e0, String str) {
        str.getClass();
        c1514e0.zzc |= 2;
        c1514e0.zzg = str;
    }

    public static /* synthetic */ void o000oOoO(C1514e0 c1514e0, C1405b0 c1405b0) {
        c1514e0.zzah = c1405b0;
        c1514e0.zzd |= 262144;
    }

    public static /* synthetic */ void o00O0O(C1514e0 c1514e0, int i) {
        c1514e0.zzaB = i - 1;
        c1514e0.zze |= 32;
    }

    public static /* synthetic */ void o00Oo0(C1514e0 c1514e0, int i) {
        c1514e0.zzaT = i - 1;
        c1514e0.zze |= 2097152;
    }

    public static /* synthetic */ void o00Ooo(C1514e0 c1514e0, int i) {
        c1514e0.zzaA = i - 1;
        c1514e0.zze |= 16;
    }

    public static /* synthetic */ void o00o0O(C1514e0 c1514e0, int i) {
        c1514e0.zzZ = i - 1;
        c1514e0.zzd |= 1024;
    }

    public static C1514e0 o00ooo() {
        return zza;
    }

    public static /* synthetic */ void o0O0O00(C1514e0 c1514e0, String str) {
        str.getClass();
        c1514e0.zze |= 65536;
        c1514e0.zzaO = str;
    }

    public static /* synthetic */ void o0OO00O(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= 134217728;
        c1514e0.zzar = j;
    }

    public static /* synthetic */ void o0OOO0o(C1514e0 c1514e0, long j) {
        c1514e0.zzd |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        c1514e0.zzaq = j;
    }

    public static /* synthetic */ void o0Oo0oo(C1514e0 c1514e0, String str) {
        str.getClass();
        c1514e0.zzd |= 268435456;
        c1514e0.zzas = str;
    }

    public static /* synthetic */ void o0OoOo0(C1514e0 c1514e0) {
        c1514e0.zzaW = 5;
        c1514e0.zze |= 16777216;
    }

    public static void o0ooOOo(C1514e0 c1514e0, C1405b0 c1405b0) {
        h01 h01Var = c1514e0.zzai;
        if (!((cz0) h01Var).f18106OooOo0O) {
            int size = h01Var.size();
            c1514e0.zzai = h01Var.OooO0O0(size + size);
        }
        c1514e0.zzai.add(c1405b0);
    }

    public static void o0ooOoO(C1514e0 c1514e0) {
        c1514e0.zzai = b11.f17344OooOoO;
    }

    public static C1514e0 oo000o(byte[] bArr, tz0 tz0Var) throws k01 {
        zz0 zz0VarOooOo0 = zz0.OooOo0(zza, bArr, bArr.length, tz0Var);
        zz0.OooOo00(zz0VarOooOo0);
        return (C1514e0) zz0VarOooOo0;
    }

    public static /* synthetic */ void oo0o0Oo(C1514e0 c1514e0, long j) {
        c1514e0.zze |= 2048;
        c1514e0.zzaJ = j;
    }

    public static /* synthetic */ void ooOO(C1514e0 c1514e0, int i) {
        c1514e0.zzag = i - 1;
        c1514e0.zzd |= 131072;
    }

    @Override // com.google.android.gms.internal.ads.zz0
    public final Object OooOOoo(int i, zz0 zz0Var) {
        y01 yz0Var;
        int iOooO0O0 = OooOOo.OooOOO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return (byte) 1;
        }
        if (iOooO0O0 == 2) {
            C1771l c1771l = C1771l.f20727OooO0o0;
            C1771l c1771l2 = C1771l.f20730OooOO0;
            return new c11(zza, "\u0001b\u0000\u0003\u0001Įb\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂV\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈW\u0019ဂ[\u001a᠌X\u001bဈ\u0016\u001cဇY\u001dဈ\u0018\u001eဈZ\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈISဂJTဂKUဂLVဂMWဂNXဂOYဈPZဉQ[ဉR\\ဂS]ဂT^᠌U_᠌@Éဉ\\ĭဂ]Įဈ^", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzaU", "zzD", "zzE", "zzaV", "zzaZ", "zzaW", c1771l, "zzF", "zzaX", "zzH", "zzaY", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzai", C1405b0.class, "zzU", "zzV", "zzW", "zzX", "zzZ", c1771l2, "zzaa", c1771l2, "zzah", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", c1771l2, "zzaj", "zzak", "zzal", "zzam", "zzan", "zzaq", "zzar", "zzat", "zzau", C1771l.f20722OooO, "zzav", C1771l.f20731OooOO0O, "zzas", "zzax", C1771l.f20725OooO0Oo, "zzay", "zzaz", "zzao", "zzap", "zzaA", c1771l2, "zzY", "zzG", "zzaB", c1771l2, "zzaC", "zzaD", C2252y.class, "zzaE", c1771l2, "zzaF", C2141v.class, "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", "zzaQ", "zzaR", "zzaS", "zzaT", C1771l.f20729OooO0oo, "zzaw", C1771l.f20726OooO0o, "zzba", "zzbb", "zzbc"});
        }
        if (iOooO0O0 == 3) {
            return new C1514e0();
        }
        if (iOooO0O0 == 4) {
            return new C2104u(zza);
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
        synchronized (C1514e0.class) {
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

    public final boolean OooooOo() {
        return this.zzaX;
    }

    public final boolean Oooooo() {
        return (this.zze & 268435456) != 0;
    }

    public final boolean Oooooo0() {
        return (this.zzc & 4194304) != 0;
    }

    public final int OoooooO() {
        int i;
        switch (this.zzaW) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
            case 9:
                i = 10;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 3;
        }
        return i;
    }

    public final String o00oO0O() {
        return this.zzaV;
    }

    public final C1772l0 o00oO0o() {
        C1772l0 c1772l0 = this.zzba;
        return c1772l0 == null ? C1772l0.OooOo() : c1772l0;
    }

    public final String o0ooOO0() {
        return this.zzF;
    }
}
