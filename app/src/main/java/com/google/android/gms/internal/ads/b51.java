package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b51 implements Handler.Callback, f91, t51 {

    /* renamed from: o00Ooo, reason: collision with root package name */
    public static final long f17373o00Ooo = i80.OooOo0O(WorkRequest.MIN_BACKOFF_MILLIS);

    /* renamed from: OooOo, reason: collision with root package name */
    public final boolean[] f17374OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final z51[] f17375OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final f81[] f17376OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final ab1 f17377OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final xa1 f17378OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final d51 f17379OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final m60 f17380OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final gb1 f17381OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final s51 f17382OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final Looper f17383OooOooo;

    /* renamed from: Oooo, reason: collision with root package name */
    public final h61 f17384Oooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public final db0 f17385Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final C2045se f17386Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final C1528ee f17387Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public final long f17388Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public final ArrayList f17389Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public final k50 f17390Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public final g80 f17391Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public final j51 f17392Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public final long f17393Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public final o61 f17394Oooo0oo;

    /* renamed from: OoooO, reason: collision with root package name */
    public oOo0o0oO f17395OoooO;

    /* renamed from: OoooO0, reason: collision with root package name */
    public a61 f17396OoooO0;

    /* renamed from: OoooO00, reason: collision with root package name */
    public final m60 f17397OoooO00;

    /* renamed from: OoooO0O, reason: collision with root package name */
    public r51 f17398OoooO0O;

    /* renamed from: OoooOO0, reason: collision with root package name */
    public boolean f17399OoooOO0;

    /* renamed from: OoooOOO, reason: collision with root package name */
    public boolean f17400OoooOOO;

    /* renamed from: OoooOOo, reason: collision with root package name */
    public boolean f17401OoooOOo;

    /* renamed from: OoooOoO, reason: collision with root package name */
    public boolean f17403OoooOoO;

    /* renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f17406Ooooo0o;

    /* renamed from: OooooO0, reason: collision with root package name */
    public int f17407OooooO0;

    /* renamed from: OooooOO, reason: collision with root package name */
    public a51 f17408OooooOO;

    /* renamed from: OooooOo, reason: collision with root package name */
    public long f17409OooooOo;

    /* renamed from: Oooooo, reason: collision with root package name */
    public int f17410Oooooo;

    /* renamed from: Oooooo0, reason: collision with root package name */
    public long f17411Oooooo0;

    /* renamed from: OoooooO, reason: collision with root package name */
    public boolean f17412OoooooO;

    /* renamed from: Ooooooo, reason: collision with root package name */
    public l41 f17413Ooooooo;

    /* renamed from: o00O0O, reason: collision with root package name */
    public final rh0 f17414o00O0O;

    /* renamed from: o00Oo0, reason: collision with root package name */
    public final i41 f17415o00Oo0;

    /* renamed from: ooOO, reason: collision with root package name */
    public n41 f17417ooOO;

    /* renamed from: OoooOoo, reason: collision with root package name */
    public int f17404OoooOoo = 0;

    /* renamed from: Ooooo00, reason: collision with root package name */
    public boolean f17405Ooooo00 = false;
    public boolean o000oOoO = false;

    /* renamed from: o0OoOo0, reason: collision with root package name */
    public long f17416o0OoOo0 = -9223372036854775807L;

    /* renamed from: OoooOo0, reason: collision with root package name */
    public long f17402OoooOo0 = -9223372036854775807L;

    public b51(f81[] f81VarArr, xa1 xa1Var, ab1 ab1Var, d51 d51Var, gb1 gb1Var, h61 h61Var, a61 a61Var, i41 i41Var, long j, Looper looper, k50 k50Var, rh0 rh0Var, o61 o61Var, n41 n41Var) {
        Looper looper2;
        this.f17414o00O0O = rh0Var;
        this.f17378OooOoO0 = xa1Var;
        this.f17377OooOoO = ab1Var;
        this.f17379OooOoOO = d51Var;
        this.f17381OooOoo0 = gb1Var;
        boolean z = false;
        this.f17396OoooO0 = a61Var;
        this.f17415o00Oo0 = i41Var;
        this.f17393Oooo0oO = j;
        this.f17390Oooo0OO = k50Var;
        this.f17394Oooo0oo = o61Var;
        this.f17417ooOO = n41Var;
        this.f17384Oooo = h61Var;
        this.f17388Oooo00o = d51Var.zzb();
        C1970qd c1970qd = AbstractC1787lf.f20867OooO00o;
        r51 r51VarOooO0oO = r51.OooO0oO(ab1Var);
        this.f17398OoooO0O = r51VarOooO0oO;
        this.f17395OoooO = new oOo0o0oO(r51VarOooO0oO);
        int length = f81VarArr.length;
        this.f17376OooOo0o = new f81[2];
        this.f17374OooOo = new boolean[2];
        xa1Var.getClass();
        this.f17375OooOo0O = new z51[2];
        for (int i = 0; i < 2; i++) {
            f81 f81Var = f81VarArr[i];
            f81Var.f18819OooOoO = i;
            f81Var.f18821OooOoOO = o61Var;
            f81Var.f18823OooOoo0 = k50Var;
            this.f17376OooOo0o[i] = f81Var;
            synchronized (f81Var.f18817OooOo0O) {
                f81Var.f18834Oooo0o0 = xa1Var;
            }
            this.f17375OooOo0O[i] = new z51(f81VarArr[i], i);
        }
        this.f17385Oooo0 = new db0(this);
        this.f17389Oooo0O0 = new ArrayList();
        this.f17386Oooo000 = new C2045se();
        this.f17387Oooo00O = new C1528ee();
        xa1Var.f25586OooO00o = this;
        xa1Var.f25587OooO0O0 = gb1Var;
        this.f17412OoooooO = true;
        m60 m60VarOooO00o = k50Var.OooO00o(looper, null);
        this.f17397OoooO00 = m60VarOooO00o;
        this.f17392Oooo0o0 = new j51(h61Var, m60VarOooO00o, new ni0(this, 6), n41Var);
        this.f17391Oooo0o = new g80(this, h61Var, m60VarOooO00o, o61Var);
        s51 s51Var = new s51();
        this.f17382OooOooO = s51Var;
        synchronized (s51Var.f24006OooO00o) {
            try {
                if (s51Var.f24007OooO0O0 == null) {
                    if (s51Var.f24009OooO0Oo == 0 && s51Var.f24008OooO0OO == null) {
                        z = true;
                    }
                    af0.OooooO0(z);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    s51Var.f24008OooO0OO = handlerThread;
                    handlerThread.start();
                    s51Var.f24007OooO0O0 = s51Var.f24008OooO0OO.getLooper();
                }
                s51Var.f24009OooO0Oo++;
                looper2 = s51Var.f24007OooO0O0;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f17383OooOooo = looper2;
        this.f17380OooOoo = k50Var.OooO00o(looper2, this);
    }

    public static Pair Oooo(AbstractC1787lf abstractC1787lf, a51 a51Var, int i, boolean z, C2045se c2045se, C1528ee c1528ee) {
        AbstractC1787lf abstractC1787lf2 = a51Var.f16908OooO00o;
        if (abstractC1787lf.OooOOOO()) {
            return null;
        }
        AbstractC1787lf abstractC1787lf3 = true == abstractC1787lf2.OooOOOO() ? abstractC1787lf : abstractC1787lf2;
        try {
            Pair pairOooOO0o = abstractC1787lf3.OooOO0o(c2045se, c1528ee, a51Var.f16909OooO0O0, a51Var.f16910OooO0OO);
            if (!abstractC1787lf.equals(abstractC1787lf3)) {
                if (abstractC1787lf.OooO00o(pairOooOO0o.first) == -1) {
                    int iOooo0OO = Oooo0OO(c2045se, c1528ee, i, z, pairOooOO0o.first, abstractC1787lf3, abstractC1787lf);
                    if (iOooo0OO != -1) {
                        return abstractC1787lf.OooOO0o(c2045se, c1528ee, iOooo0OO, -9223372036854775807L);
                    }
                    return null;
                }
                if (abstractC1787lf3.OooOOO(pairOooOO0o.first, c1528ee).f18579OooO0o0 && abstractC1787lf3.OooO0o0(c1528ee.f18576OooO0OO, c2045se, 0L).f24079OooOO0O == abstractC1787lf3.OooO00o(pairOooOO0o.first)) {
                    return abstractC1787lf.OooOO0o(c2045se, c1528ee, abstractC1787lf.OooOOO(pairOooOO0o.first, c1528ee).f18576OooO0OO, a51Var.f16910OooO0OO);
                }
            }
            return pairOooOO0o;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.ca1, com.google.android.gms.internal.ads.g91, java.lang.Object] */
    public static final boolean Oooo0O0(h51 h51Var) {
        if (h51Var != null) {
            try {
                ?? r1 = h51Var.f19558OooO00o;
                if (h51Var.f19563OooO0o0) {
                    ba1[] ba1VarArr = h51Var.f19560OooO0OO;
                    for (int i = 0; i < 2; i++) {
                        ba1 ba1Var = ba1VarArr[i];
                        if (ba1Var != null) {
                            ba1Var.zzd();
                        }
                    }
                } else {
                    r1.zzk();
                }
                if ((!h51Var.f19563OooO0o0 ? 0L : r1.zzc()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int Oooo0OO(C2045se c2045se, C1528ee c1528ee, int i, boolean z, Object obj, AbstractC1787lf abstractC1787lf, AbstractC1787lf abstractC1787lf2) {
        C2045se c2045se2 = c2045se;
        AbstractC1787lf abstractC1787lf3 = abstractC1787lf;
        Object obj2 = abstractC1787lf3.OooO0o0(abstractC1787lf3.OooOOO(obj, c1528ee).f18576OooO0OO, c2045se, 0L).f24070OooO00o;
        for (int i2 = 0; i2 < abstractC1787lf2.OooO0OO(); i2++) {
            if (abstractC1787lf2.OooO0o0(i2, c2045se, 0L).f24070OooO00o.equals(obj2)) {
                return i2;
            }
        }
        int iOooO00o = abstractC1787lf3.OooO00o(obj);
        int iOooO0O0 = abstractC1787lf3.OooO0O0();
        int iOooO00o2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= iOooO0O0 || iOooO00o2 != -1) {
                break;
            }
            AbstractC1787lf abstractC1787lf4 = abstractC1787lf3;
            int iOooO = abstractC1787lf4.OooO(iOooO00o, c1528ee, c2045se2, i, z);
            if (iOooO == -1) {
                iOooO00o2 = -1;
                break;
            }
            iOooO00o2 = abstractC1787lf2.OooO00o(abstractC1787lf4.OooO0o(iOooO));
            i3++;
            abstractC1787lf3 = abstractC1787lf4;
            iOooO00o = iOooO;
            c2045se2 = c2045se;
        }
        if (iOooO00o2 == -1) {
            return -1;
        }
        return abstractC1787lf2.OooO0Oo(iOooO00o2, c1528ee, false).f18576OooO0OO;
    }

    public final void OooO(C2260y7 c2260y7, float f, boolean z, boolean z2) throws l41, d81 {
        C2260y7 c2260y72;
        int i;
        if (z) {
            if (z2) {
                this.f17395OoooO.OooO00o(1);
            }
            r51 r51Var = this.f17398OoooO0O;
            r51 r51Var2 = new r51(r51Var.f23756OooO00o, r51Var.f23757OooO0O0, r51Var.f23758OooO0OO, r51Var.f23759OooO0Oo, r51Var.f23761OooO0o0, r51Var.f23760OooO0o, r51Var.f23762OooO0oO, r51Var.f23763OooO0oo, r51Var.f23755OooO, r51Var.f23764OooOO0, r51Var.f23765OooOO0O, r51Var.OooOO0o, r51Var.f23767OooOOO0, r51Var.f23766OooOOO, c2260y7, r51Var.f23769OooOOOo, r51Var.f23771OooOOo0, r51Var.f23770OooOOo, r51Var.f23772OooOOoo);
            c2260y72 = c2260y7;
            this.f17398OoooO0O = r51Var2;
        } else {
            c2260y72 = c2260y7;
        }
        float f2 = c2260y72.f25860OooO00o;
        h51 h51Var = this.f17392Oooo0o0.f20194OooO0oo;
        while (true) {
            i = 0;
            if (h51Var == null) {
                break;
            }
            za1[] za1VarArr = (za1[]) h51Var.f19570OooOOOO.f17020OooOo;
            int length = za1VarArr.length;
            while (i < length) {
                za1 za1Var = za1VarArr[i];
                i++;
            }
            h51Var = h51Var.f19569OooOOO0;
        }
        z51[] z51VarArr = this.f17375OooOo0O;
        while (i < 2) {
            z51 z51Var = z51VarArr[i];
            ((f81) z51Var.f26095OooO0OO).OooO(f, c2260y72.f25860OooO00o);
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.r51 OooO00o(com.google.android.gms.internal.ads.h91 r33, long r34, long r36, long r38, boolean r40, int r41) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b51.OooO00o(com.google.android.gms.internal.ads.h91, long, long, long, boolean, int):com.google.android.gms.internal.ads.r51");
    }

    public final void OooO0O0(int i) {
        z51[] z51VarArr = this.f17375OooOo0O;
        int iOooO00o = z51VarArr[i].OooO00o();
        f81 f81Var = (f81) z51VarArr[i].f26095OooO0OO;
        if (z51.OooOO0o(f81Var)) {
            db0 db0Var = this.f17385Oooo0;
            if (f81Var == ((f81) db0Var.f18227OooOoO)) {
                db0Var.f18229OooOoOO = null;
                db0Var.f18227OooOoO = null;
                db0Var.f18225OooOo0O = true;
            }
            int i2 = f81Var.f18822OooOoo;
            if (i2 == 2) {
                af0.OooooO0(i2 == 2);
                f81Var.f18822OooOoo = 1;
                f81Var.OooO0o();
            }
            af0.OooooO0(f81Var.f18822OooOoo == 1);
            dx0 dx0Var = f81Var.f18816OooOo;
            dx0Var.f18417OooOo = null;
            dx0Var.f18419OooOo0o = null;
            f81Var.f18822OooOoo = 0;
            f81Var.f18824OooOooO = null;
            f81Var.f18825OooOooo = null;
            f81Var.f18827Oooo0 = false;
            f81Var.Oooooo0();
        }
        OooOOO(i, false);
        this.f17407OooooO0 -= iOooO00o;
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void OooO0OO(g91 g91Var) {
        this.f17380OooOoo.OooO00o(8, g91Var).OooO00o();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0Oo(boolean[] r22, long r23) throws com.google.android.gms.internal.ads.l41, com.google.android.gms.internal.ads.d81 {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b51.OooO0Oo(boolean[], long):void");
    }

    public final void OooO0o(boolean z) {
        h51 h51Var = this.f17392Oooo0o0.f20195OooOO0;
        h91 h91Var = h51Var == null ? this.f17398OoooO0O.f23757OooO0O0 : h51Var.f19564OooO0oO.f19954OooO00o;
        boolean zEquals = this.f17398OoooO0O.f23765OooOO0O.equals(h91Var);
        if (!zEquals) {
            this.f17398OoooO0O = this.f17398OoooO0O.OooO00o(h91Var);
        }
        r51 r51Var = this.f17398OoooO0O;
        r51Var.f23769OooOOOo = h51Var == null ? r51Var.f23770OooOOo : h51Var.OooO0O0();
        r51 r51Var2 = this.f17398OoooO0O;
        r51Var2.f23771OooOOo0 = Oooo0o(r51Var2.f23769OooOOOo);
        if ((!zEquals || z) && h51Var != null && h51Var.f19563OooO0o0) {
            OooOoo0(h51Var.f19568OooOOO, h51Var.f19570OooOOOO);
        }
    }

    public final void OooO0o0(IOException iOException, int i) {
        l41 l41Var = new l41(0, i, iOException);
        h51 h51Var = this.f17392Oooo0o0.f20194OooO0oo;
        if (h51Var != null) {
            l41Var = l41Var.OooO00o(h51Var.f19564OooO0oO.f19954OooO00o);
        }
        AbstractC1641hg.OooOOO0("ExoPlayerImplInternal", "Playback error", l41Var);
        OooOoO0(false, false);
        this.f17398OoooO0O = this.f17398OoooO0O.OooO0Oo(l41Var);
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final /* bridge */ /* synthetic */ void OooO0oO(ca1 ca1Var) {
        this.f17380OooOoo.OooO00o(9, (g91) ca1Var).OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e5  */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.google.android.gms.internal.ads.j51] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [int] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [int] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v37, types: [com.google.android.gms.internal.ads.lf] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oo(com.google.android.gms.internal.ads.AbstractC1787lf r30, boolean r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1111
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b51.OooO0oo(com.google.android.gms.internal.ads.lf, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.google.android.gms.internal.ads.g91, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.ads.ca1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.ca1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOO0() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b51.OooOO0():void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.ca1, com.google.android.gms.internal.ads.g91, java.lang.Object] */
    public final void OooOO0O() {
        boolean z;
        j51 j51Var = this.f17392Oooo0o0;
        j51Var.OooOo0();
        h51 h51Var = j51Var.f20196OooOO0O;
        if (h51Var != null) {
            if (!h51Var.f19561OooO0Oo || h51Var.f19563OooO0o0) {
                ?? r1 = h51Var.f19558OooO00o;
                if (r1.zzp()) {
                    return;
                }
                AbstractC1787lf abstractC1787lf = this.f17398OoooO0O.f23756OooO00o;
                if (h51Var.f19563OooO0o0) {
                    r1.zzb();
                }
                if (this.f17379OooOoOO.zzi()) {
                    if (!h51Var.f19561OooO0Oo) {
                        i51 i51Var = h51Var.f19564OooO0oO;
                        h51Var.f19561OooO0Oo = true;
                        r1.OooO0oo(this, i51Var.f19955OooO0O0);
                        return;
                    }
                    e51 e51Var = new e51();
                    e51Var.f18498OooO00o = this.f17409OooooOo - h51Var.f19571OooOOOo;
                    float f = this.f17385Oooo0.zzc().f25860OooO00o;
                    af0.OoooO0(f > 0.0f || f == -3.4028235E38f);
                    e51Var.f18499OooO0O0 = f;
                    long j = this.f17402OoooOo0;
                    if (j >= 0) {
                        z = true;
                    } else if (j == -9223372036854775807L) {
                        j = -9223372036854775807L;
                        z = true;
                    } else {
                        z = false;
                    }
                    af0.OoooO0(z);
                    e51Var.f18500OooO0OO = j;
                    f51 f51Var = new f51(e51Var);
                    af0.OooooO0(h51Var.f19569OooOOO0 == null);
                    r1.OooOO0(f51Var);
                }
            }
        }
    }

    public final void OooOO0o() {
        oOo0o0oO ooo0o0oo = this.f17395OoooO;
        r51 r51Var = this.f17398OoooO0O;
        boolean z = ooo0o0oo.f22923OooO00o | (((r51) ooo0o0oo.f22927OooO0o0) != r51Var);
        ooo0o0oo.f22923OooO00o = z;
        ooo0o0oo.f22927OooO0o0 = r51Var;
        if (z) {
            w41 w41Var = (w41) this.f17414o00O0O.f23865OooOo0O;
            w41Var.getClass();
            w41Var.f25191OooOooo.OooO0O0(new c60(13, w41Var, ooo0o0oo));
            this.f17395OoooO = new oOo0o0oO(this.f17398OoooO0O);
        }
    }

    public final void OooOOO(int i, boolean z) {
        boolean[] zArr = this.f17374OooOo;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.f17397OoooO00.OooO0O0(new com.google.android.gms.common.api.internal.Oooo000(this, i, z));
        }
    }

    public final void OooOOO0(int i) {
        z51 z51Var = this.f17375OooOo0O[i];
        try {
            ba1 ba1Var = ((f81) z51Var.f26095OooO0OO).f18824OooOooO;
            ba1Var.getClass();
            ba1Var.zzd();
        } catch (IOException | RuntimeException e) {
            int i2 = ((f81) z51Var.f26095OooO0OO).f18818OooOo0o;
            throw e;
        }
    }

    public final void OooOOOO() throws l41, d81 {
        int i;
        int i2;
        float f = this.f17385Oooo0.zzc().f25860OooO00o;
        j51 j51Var = this.f17392Oooo0o0;
        h51 h51Var = j51Var.f20194OooO0oo;
        h51 h51Var2 = j51Var.f20186OooO;
        ab1 ab1Var = null;
        h51 h51Var3 = h51Var;
        boolean z = true;
        while (h51Var3 != null && h51Var3.f19563OooO0o0) {
            ab1 ab1VarOooO0o = h51Var3.OooO0o(this.f17398OoooO0O.f23756OooO00o);
            ab1 ab1Var2 = h51Var3 == this.f17392Oooo0o0.f20194OooO0oo ? ab1VarOooO0o : ab1Var;
            ab1 ab1Var3 = h51Var3.f19570OooOOOO;
            boolean z2 = false;
            if (ab1Var3 != null) {
                if (((za1[]) ab1Var3.f17020OooOo).length == ((za1[]) ab1VarOooO0o.f17020OooOo).length) {
                    for (int i3 = 0; i3 < ((za1[]) ab1VarOooO0o.f17020OooOo).length; i3++) {
                        if (ab1VarOooO0o.OooO0OO(ab1Var3, i3)) {
                        }
                    }
                    if (h51Var3 != h51Var2) {
                        z2 = true;
                    }
                    z &= z2;
                    h51Var3 = h51Var3.f19569OooOOO0;
                    ab1Var = ab1Var2;
                }
            }
            if (z) {
                j51 j51Var2 = this.f17392Oooo0o0;
                h51 h51Var4 = j51Var2.f20194OooO0oo;
                boolean zOooOo = j51Var2.OooOo(h51Var4);
                boolean[] zArr = new boolean[2];
                ab1Var2.getClass();
                long jOooO00o = h51Var4.OooO00o(ab1Var2, this.f17398OoooO0O.f23770OooOOo, zOooOo, zArr);
                r51 r51Var = this.f17398OoooO0O;
                boolean z3 = (r51Var.f23761OooO0o0 == 4 || jOooO00o == r51Var.f23770OooOOo) ? false : true;
                r51 r51Var2 = this.f17398OoooO0O;
                i2 = 2;
                i = 4;
                this.f17398OoooO0O = OooO00o(r51Var2.f23757OooO0O0, jOooO00o, r51Var2.f23758OooO0OO, r51Var2.f23759OooO0Oo, z3, 5);
                if (z3) {
                    OooOOo(jOooO00o);
                }
                boolean[] zArr2 = new boolean[2];
                int i4 = 0;
                while (true) {
                    z51[] z51VarArr = this.f17375OooOo0O;
                    if (i4 >= 2) {
                        break;
                    }
                    int iOooO00o = z51VarArr[i4].OooO00o();
                    zArr2[i4] = 1 == iOooO00o;
                    if (iOooO00o != 0) {
                        if (!this.f17375OooOo0O[i4].OooOO0O(h51Var4)) {
                            OooO0O0(i4);
                        } else if (zArr[i4]) {
                            z51 z51Var = this.f17375OooOo0O[i4];
                            long j = this.f17409OooooOo;
                            f81 f81Var = (f81) z51Var.f26095OooO0OO;
                            if (z51.OooOO0o(f81Var)) {
                                f81Var.f18827Oooo0 = false;
                                f81Var.f18829Oooo00O = j;
                                f81Var.f18830Oooo00o = j;
                                f81Var.OoooooO(j, false);
                            }
                        }
                    }
                    i4++;
                }
                OooO0Oo(zArr2, this.f17409OooooOo);
            } else {
                i = 4;
                i2 = 2;
                this.f17392Oooo0o0.OooOo(h51Var3);
                if (h51Var3.f19563OooO0o0) {
                    h51Var3.OooO00o(ab1VarOooO0o, Math.max(h51Var3.f19564OooO0oO.f19955OooO0O0, this.f17409OooooOo - h51Var3.f19571OooOOOo), false, new boolean[2]);
                }
            }
            OooO0o(true);
            if (this.f17398OoooO0O.f23761OooO0o0 != i) {
                OooOO0();
                OooOoo();
                this.f17380OooOoo.OooO0OO(i2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2 A[PHI: r3 r6 r8
  0x00b2: PHI (r3v2 com.google.android.gms.internal.ads.h91) = (r3v1 com.google.android.gms.internal.ads.h91), (r3v14 com.google.android.gms.internal.ads.h91) binds: [B:30:0x0087, B:32:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r6v4 long) = (r6v3 long), (r6v20 long) binds: [B:30:0x0087, B:32:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r8v2 long) = (r8v1 long), (r8v10 long) binds: [B:30:0x0087, B:32:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOOo(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b51.OooOOOo(boolean, boolean, boolean, boolean):void");
    }

    public final void OooOOo(long j) throws l41, d81 {
        h51 h51Var = this.f17392Oooo0o0.f20194OooO0oo;
        long j2 = j + (h51Var == null ? 1000000000000L : h51Var.f19571OooOOOo);
        this.f17409OooooOo = j2;
        ((c61) this.f17385Oooo0.f18224OooOo).OooO0O0(j2);
        for (int i = 0; i < 2; i++) {
            z51 z51Var = this.f17375OooOo0O[i];
            long j3 = this.f17409OooooOo;
            f81 f81Var = (f81) z51Var.f26095OooO0OO;
            if (z51.OooOO0o(f81Var)) {
                f81Var.f18827Oooo0 = false;
                f81Var.f18829Oooo00O = j3;
                f81Var.f18830Oooo00o = j3;
                f81Var.OoooooO(j3, false);
            }
        }
        for (h51 h51Var2 = r0.f20194OooO0oo; h51Var2 != null; h51Var2 = h51Var2.f19569OooOOO0) {
            for (za1 za1Var : (za1[]) h51Var2.f19570OooOOOO.f17020OooOo) {
            }
        }
    }

    public final void OooOOo0() {
        h51 h51Var = this.f17392Oooo0o0.f20194OooO0oo;
        boolean z = false;
        if (h51Var != null && h51Var.f19564OooO0oO.f19960OooO0oO && this.o000oOoO) {
            z = true;
        }
        this.f17400OoooOOO = z;
    }

    public final void OooOOoo(AbstractC1787lf abstractC1787lf, AbstractC1787lf abstractC1787lf2) {
        if (abstractC1787lf.OooOOOO() && abstractC1787lf2.OooOOOO()) {
            return;
        }
        ArrayList arrayList = this.f17389Oooo0O0;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
    }

    public final void OooOo() {
        h51 h51Var = this.f17392Oooo0o0.f20194OooO0oo;
        if (h51Var == null) {
            return;
        }
        ab1 ab1Var = h51Var.f19570OooOOOO;
        for (int i = 0; i < 2; i++) {
            if (ab1Var.OooO0Oo(i)) {
                f81 f81Var = (f81) this.f17375OooOo0O[i].f26095OooO0OO;
                int i2 = f81Var.f18822OooOoo;
                if (i2 == 1) {
                    af0.OooooO0(i2 == 1);
                    f81Var.f18822OooOoo = 2;
                    f81Var.OooO0o0();
                }
            }
        }
    }

    public final void OooOo0(boolean z) throws l41, d81 {
        h91 h91Var = this.f17392Oooo0o0.f20194OooO0oo.f19564OooO0oO.f19954OooO00o;
        long jOooo0oO = Oooo0oO(h91Var, this.f17398OoooO0O.f23770OooOOo, true, false);
        if (jOooo0oO != this.f17398OoooO0O.f23770OooOOo) {
            r51 r51Var = this.f17398OoooO0O;
            this.f17398OoooO0O = OooO00o(h91Var, jOooo0oO, r51Var.f23758OooO0OO, r51Var.f23759OooO0Oo, z, 5);
        }
    }

    public final void OooOo00(long j) {
        this.f17380OooOoo.f21095OooO00o.sendEmptyMessageAtTime(2, j + ((this.f17398OoooO0O.f23761OooO0o0 != 3 || Oooo00o()) ? f17373o00Ooo : 1000L));
    }

    public final void OooOo0O(int i, int i2, boolean z, boolean z2) throws l41, d81 {
        this.f17395OoooO.OooO00o(z2 ? 1 : 0);
        this.f17398OoooO0O = this.f17398OoooO0O.OooO0OO(i2, i, z);
        OooOooo(false, false);
        for (h51 h51Var = this.f17392Oooo0o0.f20194OooO0oo; h51Var != null; h51Var = h51Var.f19569OooOOO0) {
            for (za1 za1Var : (za1[]) h51Var.f19570OooOOOO.f17020OooOo) {
            }
        }
        if (!Oooo00o()) {
            OooOoO();
            OooOoo();
            return;
        }
        int i3 = this.f17398OoooO0O.f23761OooO0o0;
        m60 m60Var = this.f17380OooOoo;
        if (i3 != 3) {
            if (i3 == 2) {
                m60Var.OooO0OO(2);
                return;
            }
            return;
        }
        db0 db0Var = this.f17385Oooo0;
        db0Var.f18226OooOo0o = true;
        c61 c61Var = (c61) db0Var.f18224OooOo;
        if (!c61Var.f17706OooOo0O) {
            c61Var.f17705OooOo = SystemClock.elapsedRealtime();
            c61Var.f17706OooOo0O = true;
        }
        OooOo();
        m60Var.OooO0OO(2);
    }

    public final void OooOo0o(int i) {
        r51 r51Var = this.f17398OoooO0O;
        if (r51Var.f23761OooO0o0 != i) {
            if (i != 2) {
                this.f17416o0OoOo0 = -9223372036854775807L;
            }
            this.f17398OoooO0O = r51Var.OooO0o0(i);
        }
    }

    public final void OooOoO() {
        int i;
        db0 db0Var = this.f17385Oooo0;
        db0Var.f18226OooOo0o = false;
        c61 c61Var = (c61) db0Var.f18224OooOo;
        if (c61Var.f17706OooOo0O) {
            c61Var.OooO0O0(c61Var.zza());
            c61Var.f17706OooOo0O = false;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            f81 f81Var = (f81) this.f17375OooOo0O[i2].f26095OooO0OO;
            if (z51.OooOO0o(f81Var) && (i = f81Var.f18822OooOoo) == 2) {
                af0.OooooO0(i == 2);
                f81Var.f18822OooOoo = 1;
                f81Var.OooO0o();
            }
        }
    }

    public final void OooOoO0(boolean z, boolean z2) {
        OooOOOo(z || !this.f17406Ooooo0o, false, true, false);
        this.f17395OoooO.OooO00o(z2 ? 1 : 0);
        this.f17379OooOoOO.OooO0OO(this.f17394Oooo0oo);
        OooOo0o(1);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.ca1, java.lang.Object] */
    public final void OooOoOO() {
        h51 h51Var = this.f17392Oooo0o0.f20195OooOO0;
        boolean z = this.f17403OoooOoO || (h51Var != null && h51Var.f19558OooO00o.zzp());
        r51 r51Var = this.f17398OoooO0O;
        if (z != r51Var.f23762OooO0oO) {
            this.f17398OoooO0O = new r51(r51Var.f23756OooO00o, r51Var.f23757OooO0O0, r51Var.f23758OooO0OO, r51Var.f23759OooO0Oo, r51Var.f23761OooO0o0, r51Var.f23760OooO0o, z, r51Var.f23763OooO0oo, r51Var.f23755OooO, r51Var.f23764OooOO0, r51Var.f23765OooOO0O, r51Var.OooOO0o, r51Var.f23767OooOOO0, r51Var.f23766OooOOO, r51Var.f23768OooOOOO, r51Var.f23769OooOOOo, r51Var.f23771OooOOo0, r51Var.f23770OooOOo, r51Var.f23772OooOOoo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.google.android.gms.internal.ads.g91, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOoo() throws com.google.android.gms.internal.ads.l41, com.google.android.gms.internal.ads.d81 {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b51.OooOoo():void");
    }

    public final void OooOoo0(ha1 ha1Var, ab1 ab1Var) {
        h51 h51Var = this.f17392Oooo0o0.f20195OooOO0;
        h51Var.getClass();
        long jOooo0o = Oooo0o(h51Var.OooO0O0());
        long j = Oooo0(this.f17398OoooO0O.f23756OooO00o, h51Var.f19564OooO0oO.f19954OooO00o) ? this.f17415o00Oo0.f19951OooO0oo : -9223372036854775807L;
        AbstractC1787lf abstractC1787lf = this.f17398OoooO0O.f23756OooO00o;
        float f = this.f17385Oooo0.zzc().f25860OooO00o;
        boolean z = this.f17398OoooO0O.OooOO0o;
        this.f17379OooOoOO.OooO0o(new c51(this.f17394Oooo0oo, jOooo0o, f, this.f17401OoooOOo, j), (za1[]) ab1Var.f17020OooOo);
    }

    public final void OooOooO(AbstractC1787lf abstractC1787lf, h91 h91Var, AbstractC1787lf abstractC1787lf2, h91 h91Var2, long j, boolean z) throws l41, d81 {
        if (!Oooo0(abstractC1787lf, h91Var)) {
            C2260y7 c2260y7 = h91Var.OooO0O0() ? C2260y7.f25859OooO0Oo : this.f17398OoooO0O.f23768OooOOOO;
            db0 db0Var = this.f17385Oooo0;
            if (db0Var.zzc().equals(c2260y7)) {
                return;
            }
            this.f17380OooOoo.f21095OooO00o.removeMessages(16);
            db0Var.OooO00o(c2260y7);
            OooO(this.f17398OoooO0O.f23768OooOOOO, c2260y7.f25860OooO00o, false, false);
            return;
        }
        Object obj = h91Var.f19657OooO00o;
        C1528ee c1528ee = this.f17387Oooo00O;
        int i = abstractC1787lf.OooOOO(obj, c1528ee).f18576OooO0OO;
        C2045se c2045se = this.f17386Oooo000;
        abstractC1787lf.OooO0o0(i, c2045se, 0L);
        oO000Oo0 oo000oo0 = c2045se.f24077OooO0oo;
        int i2 = i80.f19994OooO00o;
        i41 i41Var = this.f17415o00Oo0;
        i41Var.getClass();
        oo000oo0.getClass();
        long jOooOOoo = i80.OooOOoo(-9223372036854775807L);
        i41Var.f19946OooO0OO = jOooOOoo;
        i41Var.f19948OooO0o = jOooOOoo;
        i41Var.f19950OooO0oO = jOooOOoo;
        i41Var.OooO0OO();
        if (j != -9223372036854775807L) {
            i41Var.f19947OooO0Oo = Oooo0o0(abstractC1787lf, obj, j);
            i41Var.OooO0OO();
            return;
        }
        if (!Objects.equals(!abstractC1787lf2.OooOOOO() ? abstractC1787lf2.OooO0o0(abstractC1787lf2.OooOOO(h91Var2.f19657OooO00o, c1528ee).f18576OooO0OO, c2045se, 0L).f24070OooO00o : null, c2045se.f24070OooO00o) || z) {
            i41Var.f19947OooO0Oo = -9223372036854775807L;
            i41Var.OooO0OO();
        }
    }

    public final void OooOooo(boolean z, boolean z2) {
        this.f17401OoooOOo = z;
        long jElapsedRealtime = -9223372036854775807L;
        if (z && !z2) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f17402OoooOo0 = jElapsedRealtime;
    }

    public final boolean Oooo0(AbstractC1787lf abstractC1787lf, h91 h91Var) {
        if (h91Var.OooO0O0() || abstractC1787lf.OooOOOO()) {
            return false;
        }
        int i = abstractC1787lf.OooOOO(h91Var.f19657OooO00o, this.f17387Oooo00O).f18576OooO0OO;
        C2045se c2045se = this.f17386Oooo000;
        abstractC1787lf.OooO0o0(i, c2045se, 0L);
        return c2045se.OooO0O0() && c2045se.f24076OooO0oO && c2045se.f24073OooO0Oo != -9223372036854775807L;
    }

    public final synchronized void Oooo000(il0 il0Var, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) il0Var.mo13704zza()).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final boolean Oooo00O() {
        h51 h51Var = this.f17392Oooo0o0.f20194OooO0oo;
        long j = h51Var.f19564OooO0oO.f19959OooO0o0;
        if (h51Var.f19563OooO0o0) {
            return j == -9223372036854775807L || this.f17398OoooO0O.f23770OooOOo < j || !Oooo00o();
        }
        return false;
    }

    public final boolean Oooo00o() {
        r51 r51Var = this.f17398OoooO0O;
        return r51Var.OooOO0o && r51Var.f23766OooOOO == 0;
    }

    public final long Oooo0o(long j) {
        h51 h51Var = this.f17392Oooo0o0.f20195OooOO0;
        if (h51Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.f17409OooooOo - h51Var.f19571OooOOOo));
    }

    public final long Oooo0o0(AbstractC1787lf abstractC1787lf, Object obj, long j) {
        int i = abstractC1787lf.OooOOO(obj, this.f17387Oooo00O).f18576OooO0OO;
        C2045se c2045se = this.f17386Oooo000;
        abstractC1787lf.OooO0o0(i, c2045se, 0L);
        if (c2045se.f24073OooO0Oo == -9223372036854775807L || !c2045se.OooO0O0() || !c2045se.f24076OooO0oO) {
            return -9223372036854775807L;
        }
        long j2 = c2045se.f24075OooO0o0;
        return i80.OooOOoo((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - c2045se.f24073OooO0Oo) - j;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.g91, java.lang.Object] */
    public final long Oooo0oO(h91 h91Var, long j, boolean z, boolean z2) throws l41, d81 {
        long jOooO00o;
        long j2;
        h51 h51Var;
        OooOoO();
        OooOooo(false, true);
        if (z2 || this.f17398OoooO0O.f23761OooO0o0 == 3) {
            OooOo0o(2);
        }
        j51 j51Var = this.f17392Oooo0o0;
        h51 h51Var2 = j51Var.f20194OooO0oo;
        h51 h51Var3 = h51Var2;
        while (h51Var3 != null && !h91Var.equals(h51Var3.f19564OooO0oO.f19954OooO00o)) {
            h51Var3 = h51Var3.f19569OooOOO0;
        }
        if (z || h51Var2 != h51Var3 || (h51Var3 != null && j + h51Var3.f19571OooOOOo < 0)) {
            for (int i = 0; i < 2; i++) {
                OooO0O0(i);
            }
            if (h51Var3 != null) {
                while (j51Var.f20194OooO0oo != h51Var3) {
                    j51Var.OooOO0O();
                }
                j51Var.OooOo(h51Var3);
                h51Var3.f19571OooOOOo = 1000000000000L;
                OooO0Oo(new boolean[2], j51Var.f20186OooO.OooO0OO());
            }
        }
        if (h51Var3 != null) {
            j51Var.OooOo(h51Var3);
            if (h51Var3.f19563OooO0o0) {
                h51 h51Var4 = h51Var3;
                j2 = j;
                if (h51Var4.f19562OooO0o) {
                    ?? r1 = h51Var4.f19558OooO00o;
                    jOooO00o = r1.OooO00o(j2);
                    r1.OooO0Oo(jOooO00o - this.f17388Oooo00o);
                }
                OooOOo(jOooO00o);
                OooOO0();
            } else {
                i51 i51Var = h51Var3.f19564OooO0oO;
                if (j == i51Var.f19955OooO0O0) {
                    h51Var = h51Var3;
                    j2 = j;
                } else {
                    h51Var = h51Var3;
                    j2 = j;
                    i51Var = new i51(i51Var.f19954OooO00o, j2, i51Var.f19956OooO0OO, i51Var.f19957OooO0Oo, i51Var.f19959OooO0o0, i51Var.f19958OooO0o, i51Var.f19960OooO0oO, i51Var.f19961OooO0oo);
                }
                h51Var.f19564OooO0oO = i51Var;
            }
            jOooO00o = j2;
            OooOOo(jOooO00o);
            OooOO0();
        } else {
            j51Var.OooOo00();
            OooOOo(j);
            jOooO00o = j;
        }
        OooO0o(false);
        this.f17380OooOoo.OooO0OO(2);
        return jOooO00o;
    }

    public final Pair Oooo0oo(AbstractC1787lf abstractC1787lf) {
        int i;
        long j = 0;
        if (abstractC1787lf.OooOOOO()) {
            return Pair.create(r51.f23754OooOo00, 0L);
        }
        Pair pairOooOO0o = abstractC1787lf.OooOO0o(this.f17386Oooo000, this.f17387Oooo00O, abstractC1787lf.OooO0oO(this.f17405Ooooo00), -9223372036854775807L);
        h91 h91VarOooOOoo = this.f17392Oooo0o0.OooOOoo(abstractC1787lf, pairOooOO0o.first);
        long jLongValue = ((Long) pairOooOO0o.second).longValue();
        if (h91VarOooOOoo.OooO0O0()) {
            Object obj = h91VarOooOOoo.f19657OooO00o;
            C1528ee c1528ee = this.f17387Oooo00O;
            abstractC1787lf.OooOOO(obj, c1528ee);
            OooO00o OooO00o2 = c1528ee.f18578OooO0o.OooO00o(-1);
            int i2 = 0;
            while (true) {
                int[] iArr = OooO00o2.f16778OooO0Oo;
                if (i2 >= iArr.length || (i = iArr[i2]) == 0 || i == 1) {
                    break;
                }
                i2++;
            }
            if (-1 == i2) {
                c1528ee.f18578OooO0o.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(h91VarOooOOoo, Long.valueOf(j));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:420:0x0799
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0725 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, hn0 -> 0x0030, w6 -> 0x0033, m71 -> 0x0036, l41 -> 0x0039, TryCatch #3 {l41 -> 0x0039, blocks: (B:3:0x0008, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:22:0x003e, B:28:0x004b, B:29:0x004c, B:32:0x0066, B:33:0x0079, B:34:0x0089, B:35:0x00a0, B:36:0x00a7, B:37:0x00ae, B:41:0x00b5, B:43:0x00be, B:45:0x00cc, B:46:0x00d4, B:47:0x00df, B:48:0x00f3, B:49:0x010b, B:51:0x0116, B:53:0x0125, B:54:0x012d, B:55:0x013a, B:57:0x0147, B:58:0x015d, B:59:0x016c, B:60:0x0177, B:62:0x0187, B:63:0x0193, B:64:0x01a5, B:66:0x01b0, B:67:0x01b1, B:69:0x01bb, B:72:0x01c6, B:74:0x01ce, B:75:0x01d1, B:76:0x01d2, B:77:0x01dd, B:81:0x01e4, B:83:0x01ec, B:85:0x01f0, B:87:0x01f5, B:89:0x01fd, B:90:0x0200, B:92:0x0205, B:98:0x0211, B:99:0x0212, B:103:0x0219, B:105:0x0227, B:106:0x022a, B:107:0x022f, B:109:0x023f, B:110:0x0242, B:111:0x0247, B:112:0x024c, B:114:0x0256, B:119:0x025f, B:121:0x0263, B:125:0x026a, B:127:0x0271, B:128:0x0279, B:129:0x027e, B:131:0x0282, B:136:0x028b, B:137:0x0290, B:139:0x029a, B:145:0x02a5, B:147:0x02a9, B:148:0x02b8, B:150:0x02cb, B:151:0x02f2, B:152:0x02f7, B:153:0x02f8, B:155:0x02fe, B:157:0x0319, B:162:0x0322, B:170:0x034a, B:171:0x034f, B:177:0x0359, B:186:0x036a, B:187:0x036f, B:188:0x0377, B:193:0x03bf, B:280:0x0514, B:253:0x04cc, B:252:0x04c8, B:292:0x052c, B:293:0x0534, B:201:0x0408, B:203:0x0416, B:204:0x042a, B:206:0x042f, B:210:0x0436, B:212:0x043b, B:214:0x0448, B:296:0x053a, B:298:0x0556, B:301:0x0562, B:303:0x056a, B:307:0x0571, B:309:0x0578, B:310:0x0580, B:312:0x0588, B:314:0x0594, B:316:0x059e, B:320:0x05ba, B:322:0x05c2, B:323:0x05c7, B:317:0x05a9, B:319:0x05ad, B:324:0x05cb, B:326:0x05cf, B:328:0x05e0, B:386:0x06ff, B:388:0x0707, B:390:0x070f, B:393:0x0715, B:394:0x0721, B:396:0x0725, B:398:0x072d, B:401:0x0739, B:403:0x0741, B:405:0x0749, B:407:0x074f, B:409:0x0754, B:410:0x075d, B:411:0x0777, B:413:0x077d, B:415:0x0782, B:417:0x0787, B:419:0x0795, B:458:0x0848, B:459:0x084d, B:463:0x0858, B:465:0x0860, B:466:0x0865, B:468:0x0871, B:469:0x088a, B:471:0x088e, B:473:0x0896, B:487:0x08c4, B:474:0x089b, B:476:0x08a4, B:480:0x08b1, B:486:0x08c1, B:489:0x08ce, B:491:0x08d4, B:495:0x08e1, B:504:0x090b, B:506:0x0911, B:508:0x0915, B:533:0x099b, B:535:0x09a8, B:537:0x09b9, B:538:0x09c2, B:557:0x0a0c, B:560:0x0a13, B:562:0x0a17, B:564:0x0a1f, B:565:0x0a22, B:566:0x0a25, B:568:0x0a2b, B:570:0x0a34, B:572:0x0a3e, B:574:0x0a44, B:581:0x0a63, B:583:0x0a69, B:587:0x0a72, B:596:0x0a8b, B:593:0x0a84, B:595:0x0a88, B:575:0x0a4b, B:578:0x0a59, B:579:0x0a60, B:580:0x0a61, B:511:0x091f, B:513:0x0923, B:515:0x0937, B:517:0x0942, B:519:0x094c, B:523:0x0955, B:525:0x095f, B:531:0x096a, B:539:0x09c6, B:541:0x09cc, B:543:0x09d0, B:547:0x09d9, B:549:0x09e8, B:551:0x09f0, B:553:0x09fc, B:554:0x0a01, B:555:0x0a04, B:556:0x0a09, B:497:0x08e9, B:499:0x08ed, B:500:0x08f8, B:502:0x08fe, B:488:0x08c7, B:422:0x079e, B:424:0x07a2, B:426:0x07aa, B:428:0x07ae, B:430:0x07b8, B:433:0x07be, B:434:0x07c1, B:436:0x07c9, B:438:0x07db, B:440:0x07e4, B:442:0x07ec, B:447:0x07f8, B:449:0x081f, B:450:0x0822, B:452:0x082f, B:454:0x0835, B:455:0x083c, B:457:0x0847, B:331:0x05ed, B:333:0x05f1, B:336:0x05fa, B:339:0x0605, B:341:0x0609, B:343:0x0611, B:344:0x0614, B:346:0x061a, B:348:0x0624, B:350:0x065a, B:352:0x0664, B:354:0x066c, B:355:0x0678, B:357:0x067e, B:361:0x0691, B:363:0x069b, B:365:0x06a7, B:367:0x06bc, B:369:0x06c2, B:370:0x06d0, B:372:0x06d7, B:374:0x06dd, B:377:0x06e2, B:379:0x06e6, B:385:0x06fc, B:382:0x06ef, B:384:0x06f5, B:327:0x05dd, B:597:0x0a90, B:601:0x0a97, B:178:0x035a, B:179:0x035f, B:182:0x0366, B:185:0x0369), top: B:659:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x081f A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, hn0 -> 0x0030, w6 -> 0x0033, m71 -> 0x0036, l41 -> 0x0039, TryCatch #3 {l41 -> 0x0039, blocks: (B:3:0x0008, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:22:0x003e, B:28:0x004b, B:29:0x004c, B:32:0x0066, B:33:0x0079, B:34:0x0089, B:35:0x00a0, B:36:0x00a7, B:37:0x00ae, B:41:0x00b5, B:43:0x00be, B:45:0x00cc, B:46:0x00d4, B:47:0x00df, B:48:0x00f3, B:49:0x010b, B:51:0x0116, B:53:0x0125, B:54:0x012d, B:55:0x013a, B:57:0x0147, B:58:0x015d, B:59:0x016c, B:60:0x0177, B:62:0x0187, B:63:0x0193, B:64:0x01a5, B:66:0x01b0, B:67:0x01b1, B:69:0x01bb, B:72:0x01c6, B:74:0x01ce, B:75:0x01d1, B:76:0x01d2, B:77:0x01dd, B:81:0x01e4, B:83:0x01ec, B:85:0x01f0, B:87:0x01f5, B:89:0x01fd, B:90:0x0200, B:92:0x0205, B:98:0x0211, B:99:0x0212, B:103:0x0219, B:105:0x0227, B:106:0x022a, B:107:0x022f, B:109:0x023f, B:110:0x0242, B:111:0x0247, B:112:0x024c, B:114:0x0256, B:119:0x025f, B:121:0x0263, B:125:0x026a, B:127:0x0271, B:128:0x0279, B:129:0x027e, B:131:0x0282, B:136:0x028b, B:137:0x0290, B:139:0x029a, B:145:0x02a5, B:147:0x02a9, B:148:0x02b8, B:150:0x02cb, B:151:0x02f2, B:152:0x02f7, B:153:0x02f8, B:155:0x02fe, B:157:0x0319, B:162:0x0322, B:170:0x034a, B:171:0x034f, B:177:0x0359, B:186:0x036a, B:187:0x036f, B:188:0x0377, B:193:0x03bf, B:280:0x0514, B:253:0x04cc, B:252:0x04c8, B:292:0x052c, B:293:0x0534, B:201:0x0408, B:203:0x0416, B:204:0x042a, B:206:0x042f, B:210:0x0436, B:212:0x043b, B:214:0x0448, B:296:0x053a, B:298:0x0556, B:301:0x0562, B:303:0x056a, B:307:0x0571, B:309:0x0578, B:310:0x0580, B:312:0x0588, B:314:0x0594, B:316:0x059e, B:320:0x05ba, B:322:0x05c2, B:323:0x05c7, B:317:0x05a9, B:319:0x05ad, B:324:0x05cb, B:326:0x05cf, B:328:0x05e0, B:386:0x06ff, B:388:0x0707, B:390:0x070f, B:393:0x0715, B:394:0x0721, B:396:0x0725, B:398:0x072d, B:401:0x0739, B:403:0x0741, B:405:0x0749, B:407:0x074f, B:409:0x0754, B:410:0x075d, B:411:0x0777, B:413:0x077d, B:415:0x0782, B:417:0x0787, B:419:0x0795, B:458:0x0848, B:459:0x084d, B:463:0x0858, B:465:0x0860, B:466:0x0865, B:468:0x0871, B:469:0x088a, B:471:0x088e, B:473:0x0896, B:487:0x08c4, B:474:0x089b, B:476:0x08a4, B:480:0x08b1, B:486:0x08c1, B:489:0x08ce, B:491:0x08d4, B:495:0x08e1, B:504:0x090b, B:506:0x0911, B:508:0x0915, B:533:0x099b, B:535:0x09a8, B:537:0x09b9, B:538:0x09c2, B:557:0x0a0c, B:560:0x0a13, B:562:0x0a17, B:564:0x0a1f, B:565:0x0a22, B:566:0x0a25, B:568:0x0a2b, B:570:0x0a34, B:572:0x0a3e, B:574:0x0a44, B:581:0x0a63, B:583:0x0a69, B:587:0x0a72, B:596:0x0a8b, B:593:0x0a84, B:595:0x0a88, B:575:0x0a4b, B:578:0x0a59, B:579:0x0a60, B:580:0x0a61, B:511:0x091f, B:513:0x0923, B:515:0x0937, B:517:0x0942, B:519:0x094c, B:523:0x0955, B:525:0x095f, B:531:0x096a, B:539:0x09c6, B:541:0x09cc, B:543:0x09d0, B:547:0x09d9, B:549:0x09e8, B:551:0x09f0, B:553:0x09fc, B:554:0x0a01, B:555:0x0a04, B:556:0x0a09, B:497:0x08e9, B:499:0x08ed, B:500:0x08f8, B:502:0x08fe, B:488:0x08c7, B:422:0x079e, B:424:0x07a2, B:426:0x07aa, B:428:0x07ae, B:430:0x07b8, B:433:0x07be, B:434:0x07c1, B:436:0x07c9, B:438:0x07db, B:440:0x07e4, B:442:0x07ec, B:447:0x07f8, B:449:0x081f, B:450:0x0822, B:452:0x082f, B:454:0x0835, B:455:0x083c, B:457:0x0847, B:331:0x05ed, B:333:0x05f1, B:336:0x05fa, B:339:0x0605, B:341:0x0609, B:343:0x0611, B:344:0x0614, B:346:0x061a, B:348:0x0624, B:350:0x065a, B:352:0x0664, B:354:0x066c, B:355:0x0678, B:357:0x067e, B:361:0x0691, B:363:0x069b, B:365:0x06a7, B:367:0x06bc, B:369:0x06c2, B:370:0x06d0, B:372:0x06d7, B:374:0x06dd, B:377:0x06e2, B:379:0x06e6, B:385:0x06fc, B:382:0x06ef, B:384:0x06f5, B:327:0x05dd, B:597:0x0a90, B:601:0x0a97, B:178:0x035a, B:179:0x035f, B:182:0x0366, B:185:0x0369), top: B:659:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x082f A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, hn0 -> 0x0030, w6 -> 0x0033, m71 -> 0x0036, l41 -> 0x0039, TryCatch #3 {l41 -> 0x0039, blocks: (B:3:0x0008, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:22:0x003e, B:28:0x004b, B:29:0x004c, B:32:0x0066, B:33:0x0079, B:34:0x0089, B:35:0x00a0, B:36:0x00a7, B:37:0x00ae, B:41:0x00b5, B:43:0x00be, B:45:0x00cc, B:46:0x00d4, B:47:0x00df, B:48:0x00f3, B:49:0x010b, B:51:0x0116, B:53:0x0125, B:54:0x012d, B:55:0x013a, B:57:0x0147, B:58:0x015d, B:59:0x016c, B:60:0x0177, B:62:0x0187, B:63:0x0193, B:64:0x01a5, B:66:0x01b0, B:67:0x01b1, B:69:0x01bb, B:72:0x01c6, B:74:0x01ce, B:75:0x01d1, B:76:0x01d2, B:77:0x01dd, B:81:0x01e4, B:83:0x01ec, B:85:0x01f0, B:87:0x01f5, B:89:0x01fd, B:90:0x0200, B:92:0x0205, B:98:0x0211, B:99:0x0212, B:103:0x0219, B:105:0x0227, B:106:0x022a, B:107:0x022f, B:109:0x023f, B:110:0x0242, B:111:0x0247, B:112:0x024c, B:114:0x0256, B:119:0x025f, B:121:0x0263, B:125:0x026a, B:127:0x0271, B:128:0x0279, B:129:0x027e, B:131:0x0282, B:136:0x028b, B:137:0x0290, B:139:0x029a, B:145:0x02a5, B:147:0x02a9, B:148:0x02b8, B:150:0x02cb, B:151:0x02f2, B:152:0x02f7, B:153:0x02f8, B:155:0x02fe, B:157:0x0319, B:162:0x0322, B:170:0x034a, B:171:0x034f, B:177:0x0359, B:186:0x036a, B:187:0x036f, B:188:0x0377, B:193:0x03bf, B:280:0x0514, B:253:0x04cc, B:252:0x04c8, B:292:0x052c, B:293:0x0534, B:201:0x0408, B:203:0x0416, B:204:0x042a, B:206:0x042f, B:210:0x0436, B:212:0x043b, B:214:0x0448, B:296:0x053a, B:298:0x0556, B:301:0x0562, B:303:0x056a, B:307:0x0571, B:309:0x0578, B:310:0x0580, B:312:0x0588, B:314:0x0594, B:316:0x059e, B:320:0x05ba, B:322:0x05c2, B:323:0x05c7, B:317:0x05a9, B:319:0x05ad, B:324:0x05cb, B:326:0x05cf, B:328:0x05e0, B:386:0x06ff, B:388:0x0707, B:390:0x070f, B:393:0x0715, B:394:0x0721, B:396:0x0725, B:398:0x072d, B:401:0x0739, B:403:0x0741, B:405:0x0749, B:407:0x074f, B:409:0x0754, B:410:0x075d, B:411:0x0777, B:413:0x077d, B:415:0x0782, B:417:0x0787, B:419:0x0795, B:458:0x0848, B:459:0x084d, B:463:0x0858, B:465:0x0860, B:466:0x0865, B:468:0x0871, B:469:0x088a, B:471:0x088e, B:473:0x0896, B:487:0x08c4, B:474:0x089b, B:476:0x08a4, B:480:0x08b1, B:486:0x08c1, B:489:0x08ce, B:491:0x08d4, B:495:0x08e1, B:504:0x090b, B:506:0x0911, B:508:0x0915, B:533:0x099b, B:535:0x09a8, B:537:0x09b9, B:538:0x09c2, B:557:0x0a0c, B:560:0x0a13, B:562:0x0a17, B:564:0x0a1f, B:565:0x0a22, B:566:0x0a25, B:568:0x0a2b, B:570:0x0a34, B:572:0x0a3e, B:574:0x0a44, B:581:0x0a63, B:583:0x0a69, B:587:0x0a72, B:596:0x0a8b, B:593:0x0a84, B:595:0x0a88, B:575:0x0a4b, B:578:0x0a59, B:579:0x0a60, B:580:0x0a61, B:511:0x091f, B:513:0x0923, B:515:0x0937, B:517:0x0942, B:519:0x094c, B:523:0x0955, B:525:0x095f, B:531:0x096a, B:539:0x09c6, B:541:0x09cc, B:543:0x09d0, B:547:0x09d9, B:549:0x09e8, B:551:0x09f0, B:553:0x09fc, B:554:0x0a01, B:555:0x0a04, B:556:0x0a09, B:497:0x08e9, B:499:0x08ed, B:500:0x08f8, B:502:0x08fe, B:488:0x08c7, B:422:0x079e, B:424:0x07a2, B:426:0x07aa, B:428:0x07ae, B:430:0x07b8, B:433:0x07be, B:434:0x07c1, B:436:0x07c9, B:438:0x07db, B:440:0x07e4, B:442:0x07ec, B:447:0x07f8, B:449:0x081f, B:450:0x0822, B:452:0x082f, B:454:0x0835, B:455:0x083c, B:457:0x0847, B:331:0x05ed, B:333:0x05f1, B:336:0x05fa, B:339:0x0605, B:341:0x0609, B:343:0x0611, B:344:0x0614, B:346:0x061a, B:348:0x0624, B:350:0x065a, B:352:0x0664, B:354:0x066c, B:355:0x0678, B:357:0x067e, B:361:0x0691, B:363:0x069b, B:365:0x06a7, B:367:0x06bc, B:369:0x06c2, B:370:0x06d0, B:372:0x06d7, B:374:0x06dd, B:377:0x06e2, B:379:0x06e6, B:385:0x06fc, B:382:0x06ef, B:384:0x06f5, B:327:0x05dd, B:597:0x0a90, B:601:0x0a97, B:178:0x035a, B:179:0x035f, B:182:0x0366, B:185:0x0369), top: B:659:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0785 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v109, types: [com.google.android.gms.internal.ads.ca1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v143, types: [com.google.android.gms.internal.ads.ca1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.google.android.gms.internal.ads.g91, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v109, types: [com.google.android.gms.internal.ads.g91, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v161, types: [com.google.android.gms.internal.ads.g91, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [com.google.android.gms.internal.ads.g91, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v97, types: [com.google.android.gms.internal.ads.g91, java.lang.Object] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r35) {
        /*
            Method dump skipped, instructions count: 3054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b51.handleMessage(android.os.Message):boolean");
    }
}
