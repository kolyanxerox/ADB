package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.location.LocationRequestCompat;
import androidx.work.WorkRequest;
import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class v91 implements g91, o0000Ooo {

    /* renamed from: OoooooO */
    public static final Map f24893OoooooO;

    /* renamed from: Ooooooo */
    public static final o0OoOo0 f24894Ooooooo;

    /* renamed from: OooOo */
    public final o0O f24895OooOo;

    /* renamed from: OooOo0O */
    public final Uri f24896OooOo0O;

    /* renamed from: OooOo0o */
    public final zm0 f24897OooOo0o;

    /* renamed from: OooOoO */
    public final o71 f24898OooOoO;

    /* renamed from: OooOoO0 */
    public final o71 f24899OooOoO0;

    /* renamed from: OooOoOO */
    public final x91 f24900OooOoOO;

    /* renamed from: OooOoo */
    public final long f24901OooOoo;

    /* renamed from: OooOoo0 */
    public final long f24902OooOoo0;

    /* renamed from: OooOooo */
    public final bi0 f24904OooOooo;

    /* renamed from: Oooo */
    public boolean f24905Oooo;

    /* renamed from: Oooo0 */
    public final Handler f24906Oooo0;

    /* renamed from: Oooo0O0 */
    public f91 f24910Oooo0O0;

    /* renamed from: Oooo0OO */
    public oo0O f24911Oooo0OO;

    /* renamed from: Oooo0o */
    public u91[] f24912Oooo0o;

    /* renamed from: Oooo0o0 */
    public aa1[] f24913Oooo0o0;

    /* renamed from: Oooo0oO */
    public boolean f24914Oooo0oO;

    /* renamed from: Oooo0oo */
    public boolean f24915Oooo0oo;

    /* renamed from: OoooO */
    public long f24916OoooO;

    /* renamed from: OoooO0 */
    public C2051sk f24917OoooO0;

    /* renamed from: OoooO00 */
    public boolean f24918OoooO00;

    /* renamed from: OoooO0O */
    public o000O00 f24919OoooO0O;

    /* renamed from: OoooOO0 */
    public boolean f24920OoooOO0;

    /* renamed from: OoooOOO */
    public boolean f24921OoooOOO;

    /* renamed from: OoooOOo */
    public boolean f24922OoooOOo;

    /* renamed from: OoooOo0 */
    public boolean f24923OoooOo0;

    /* renamed from: OoooOoO */
    public int f24924OoooOoO;

    /* renamed from: OoooOoo */
    public boolean f24925OoooOoo;

    /* renamed from: Ooooo00 */
    public long f24926Ooooo00;

    /* renamed from: Ooooo0o */
    public long f24927Ooooo0o;

    /* renamed from: OooooO0 */
    public boolean f24928OooooO0;

    /* renamed from: OooooOO */
    public int f24929OooooOO;

    /* renamed from: OooooOo */
    public boolean f24930OooooOo;

    /* renamed from: Oooooo */
    public final eb1 f24931Oooooo;

    /* renamed from: Oooooo0 */
    public boolean f24932Oooooo0;
    public int o000oOoO;

    /* renamed from: OooOooO */
    public final de0 f24903OooOooO = new de0();

    /* renamed from: Oooo000 */
    public final o0000o0.OooOOO f24907Oooo000 = new o0000o0.OooOOO(2);

    /* renamed from: Oooo00O */
    public final q91 f24908Oooo00O = new q91(this, 1);

    /* renamed from: Oooo00o */
    public final q91 f24909Oooo00o = new q91(this, 2);

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f24893OoooooO = Collections.unmodifiableMap(map);
        jb1 jb1Var = new jb1();
        jb1Var.f20241OooO00o = "icy";
        jb1Var.OooO0OO("application/x-icy");
        f24894Ooooooo = new o0OoOo0(jb1Var);
    }

    public v91(Uri uri, zm0 zm0Var, bi0 bi0Var, o0O o0o, o71 o71Var, o71 o71Var2, x91 x91Var, eb1 eb1Var, int i, long j) {
        this.f24896OooOo0O = uri;
        this.f24897OooOo0o = zm0Var;
        this.f24895OooOo = o0o;
        this.f24898OooOoO = o71Var;
        this.f24899OooOoO0 = o71Var2;
        this.f24900OooOoOO = x91Var;
        this.f24931Oooooo = eb1Var;
        this.f24902OooOoo0 = i;
        this.f24904OooOooo = bi0Var;
        this.f24901OooOoo = j;
        Looper looperMyLooper = Looper.myLooper();
        af0.OooOo0O(looperMyLooper);
        this.f24906Oooo0 = new Handler(looperMyLooper, null);
        this.f24912Oooo0o = new u91[0];
        this.f24913Oooo0o0 = new aa1[0];
        this.f24927Ooooo0o = -9223372036854775807L;
        this.o000oOoO = 1;
    }

    @Override // com.google.android.gms.internal.ads.o0000Ooo
    public final void OooO(o000O00 o000o002) {
        this.f24906Oooo0.post(new c60(17, this, o000o002));
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00bb  */
    @Override // com.google.android.gms.internal.ads.g91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooO00o(long r13) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v91.OooO00o(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0081 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.g91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooO0O0(long r22, com.google.android.gms.internal.ads.a61 r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r3 = r24
            r0.OooOOOo()
            com.google.android.gms.internal.ads.o000O00 r4 = r0.f24919OoooO0O
            boolean r4 = r4.zzh()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            com.google.android.gms.internal.ads.o000O00 r4 = r0.f24919OoooO0O
            com.google.android.gms.internal.ads.o000Oo0 r4 = r4.OooO0Oo(r1)
            com.google.android.gms.internal.ads.o000O00O r7 = r4.f21729OooO00o
            long r8 = r3.f16918OooO00o
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            long r11 = r3.f16919OooO0O0
            if (r10 != 0) goto L2a
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 != 0) goto L29
            return r1
        L29:
            r8 = r5
        L2a:
            long r13 = r7.f21697OooO00o
            int r3 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            long r15 = r1 - r8
            long r7 = r1 ^ r8
            long r9 = r1 ^ r15
            long r17 = r1 + r11
            long r19 = r1 ^ r17
            long r11 = r11 ^ r17
            long r7 = r7 & r9
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 >= 0) goto L41
            r15 = -9223372036854775808
        L41:
            long r7 = r19 & r11
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 >= 0) goto L4c
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L4c:
            int r3 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 > 0) goto L58
            int r3 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r3 > 0) goto L58
            r3 = r5
            goto L59
        L58:
            r3 = r6
        L59:
            com.google.android.gms.internal.ads.o000O00O r4 = r4.f21730OooO0O0
            long r7 = r4.f21697OooO00o
            int r4 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r4 > 0) goto L66
            int r4 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r4 > 0) goto L66
            goto L67
        L66:
            r5 = r6
        L67:
            if (r3 == 0) goto L7c
            if (r5 == 0) goto L7c
            long r3 = r13 - r1
            long r1 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L81
            goto L7e
        L7c:
            if (r3 == 0) goto L7f
        L7e:
            return r13
        L7f:
            if (r5 == 0) goto L82
        L81:
            return r7
        L82:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v91.OooO0O0(long, com.google.android.gms.internal.ads.a61):long");
    }

    @Override // com.google.android.gms.internal.ads.o0000Ooo
    public final void OooO0OO() {
        this.f24914Oooo0oO = true;
        this.f24906Oooo0.post(this.f24908Oooo00O);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0032  */
    @Override // com.google.android.gms.internal.ads.g91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0Oo(long r12) {
        /*
            r11 = this;
            boolean r0 = r11.f24918OoooO00
            if (r0 == 0) goto L5
            goto L5d
        L5:
            r11.OooOOOo()
            boolean r0 = r11.OooOo0()
            if (r0 != 0) goto L5d
            com.google.android.gms.internal.ads.sk r0 = r11.f24917OoooO0
            java.lang.Object r0 = r0.f24100OooOoO0
            boolean[] r0 = (boolean[]) r0
            com.google.android.gms.internal.ads.aa1[] r1 = r11.f24913Oooo0o0
            int r1 = r1.length
            r2 = 0
        L18:
            if (r2 >= r1) goto L5d
            com.google.android.gms.internal.ads.aa1[] r3 = r11.f24913Oooo0o0
            r4 = r3[r2]
            boolean r3 = r0[r2]
            com.google.android.gms.internal.ads.y91 r10 = r4.f16992OooO00o
            monitor-enter(r4)
            int r5 = r4.f17002OooOOO     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L32
            long[] r6 = r4.OooOO0o     // Catch: java.lang.Throwable -> L3e
            r7 = r5
            int r5 = r4.f17005OooOOOo     // Catch: java.lang.Throwable -> L3e
            r8 = r6[r5]     // Catch: java.lang.Throwable -> L3e
            int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r6 >= 0) goto L34
        L32:
            r7 = r12
            goto L51
        L34:
            if (r3 == 0) goto L41
            int r3 = r4.f17007OooOOo0     // Catch: java.lang.Throwable -> L3e
            if (r3 == r7) goto L41
            int r3 = r3 + 1
            r6 = r3
            goto L42
        L3e:
            r0 = move-exception
            r12 = r0
            goto L5b
        L41:
            r6 = r7
        L42:
            r9 = 0
            r7 = r12
            int r12 = r4.OooO0oo(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L3e
            r13 = -1
            if (r12 == r13) goto L51
            long r12 = r4.OooOO0(r12)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r4)
            goto L54
        L51:
            monitor-exit(r4)
            r12 = -1
        L54:
            r10.OooO0O0(r12)
            int r2 = r2 + 1
            r12 = r7
            goto L18
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            throw r12
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v91.OooO0Oo(long):void");
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long OooO0o(za1[] za1VarArr, boolean[] zArr, ba1[] ba1VarArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        za1 za1Var;
        OooOOOo();
        C2051sk c2051sk = this.f24917OoooO0;
        ha1 ha1Var = (ha1) c2051sk.f24098OooOo0o;
        int i = this.f24924OoooOoO;
        int i2 = 0;
        while (true) {
            int length = za1VarArr.length;
            zArr3 = (boolean[]) c2051sk.f24100OooOoO0;
            if (i2 >= length) {
                break;
            }
            ba1 ba1Var = ba1VarArr[i2];
            if (ba1Var != null && (za1VarArr[i2] == null || !zArr[i2])) {
                int i3 = ((t91) ba1Var).f24278OooO00o;
                af0.OooooO0(zArr3[i3]);
                this.f24924OoooOoO--;
                zArr3[i3] = false;
                ba1VarArr[i2] = null;
            }
            i2++;
        }
        boolean z = !this.f24921OoooOOO ? j == 0 || this.f24918OoooO00 : i != 0;
        for (int i4 = 0; i4 < za1VarArr.length; i4++) {
            if (ba1VarArr[i4] == null && (za1Var = za1VarArr[i4]) != null) {
                af0.OooooO0(za1Var.zzd() == 1);
                af0.OooooO0(za1Var.OooO00o(0) == 0);
                int iIndexOf = ha1Var.f19675OooO0O0.indexOf(za1Var.zzg());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                af0.OooooO0(!zArr3[iIndexOf]);
                this.f24924OoooOoO++;
                zArr3[iIndexOf] = true;
                this.f24923OoooOo0 = za1Var.zzf().f22227OooOOoo | this.f24923OoooOo0;
                ba1VarArr[i4] = new t91(this, iIndexOf);
                zArr2[i4] = true;
                if (!z) {
                    aa1 aa1Var = this.f24913Oooo0o0[iIndexOf];
                    z = (aa1Var.f17004OooOOOO + aa1Var.f17007OooOOo0 == 0 || aa1Var.OooO0oO(j, true)) ? false : true;
                }
            }
        }
        if (this.f24924OoooOoO == 0) {
            this.f24928OooooO0 = false;
            this.f24922OoooOOo = false;
            this.f24923OoooOo0 = false;
            de0 de0Var = this.f24903OooOooO;
            if (((hb1) de0Var.f18240OooOo) != null) {
                for (aa1 aa1Var2 : this.f24913Oooo0o0) {
                    aa1Var2.OooOO0o();
                }
                hb1 hb1Var = (hb1) de0Var.f18240OooOo;
                af0.OooOo0O(hb1Var);
                hb1Var.OooO00o(false);
            } else {
                this.f24930OooooOo = false;
                for (aa1 aa1Var3 : this.f24913Oooo0o0) {
                    aa1Var3.OooOOO0(false);
                }
            }
        } else if (z) {
            j = OooO00o(j);
            for (int i5 = 0; i5 < ba1VarArr.length; i5++) {
                if (ba1VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.f24921OoooOOO = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final void OooO0o0(long j) {
    }

    @Override // com.google.android.gms.internal.ads.o0000Ooo
    public final o000O OooO0oO(int i, int i2) {
        return OooOOOO(new u91(i, false));
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void OooO0oo(f91 f91Var, long j) {
        this.f24910Oooo0O0 = f91Var;
        this.f24907Oooo000.OooO0O0();
        OooOo00();
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final boolean OooOO0(f51 f51Var) {
        if (this.f24930OooooOo) {
            return false;
        }
        de0 de0Var = this.f24903OooOooO;
        if (((IOException) de0Var.f18243OooOoO0) != null || this.f24928OooooO0) {
            return false;
        }
        if (this.f24915Oooo0oo && this.f24924OoooOoO == 0) {
            return false;
        }
        boolean zOooO0O0 = this.f24907Oooo000.OooO0O0();
        if (((hb1) de0Var.f18240OooOo) != null) {
            return zOooO0O0;
        }
        OooOo00();
        return true;
    }

    public final void OooOO0O(s91 s91Var, boolean z) {
        Uri uri = s91Var.f24041OooO0O0.f24211OooOo0o;
        y81 y81Var = new y81();
        e91 e91Var = new e91(-1, null, i80.OooOo0O(s91Var.f24039OooO), i80.OooOo0O(this.f24916OoooO));
        o71 o71Var = this.f24899OooOoO0;
        o71Var.OooO00o(new j91(o71Var, y81Var, e91Var, 2));
        if (z) {
            return;
        }
        for (aa1 aa1Var : this.f24913Oooo0o0) {
            aa1Var.OooOOO0(false);
        }
        if (this.f24924OoooOoO > 0) {
            f91 f91Var = this.f24910Oooo0O0;
            f91Var.getClass();
            f91Var.OooO0oO(this);
        }
    }

    public final void OooOO0o(s91 s91Var) {
        o000O00 o000o002;
        if (this.f24916OoooO == -9223372036854775807L && (o000o002 = this.f24919OoooO0O) != null) {
            boolean zZzh = o000o002.zzh();
            long jOooOOO = OooOOO(true);
            long j = jOooOOO == Long.MIN_VALUE ? 0L : jOooOOO + WorkRequest.MIN_BACKOFF_MILLIS;
            this.f24916OoooO = j;
            this.f24900OooOoOO.OooOOoo(zZzh, j, this.f24920OoooOO0);
        }
        Uri uri = s91Var.f24041OooO0O0.f24211OooOo0o;
        y81 y81Var = new y81();
        e91 e91Var = new e91(-1, null, i80.OooOo0O(s91Var.f24039OooO), i80.OooOo0O(this.f24916OoooO));
        o71 o71Var = this.f24899OooOoO0;
        o71Var.OooO00o(new j91(o71Var, y81Var, e91Var, 1));
        this.f24930OooooOo = true;
        f91 f91Var = this.f24910Oooo0O0;
        f91Var.getClass();
        f91Var.OooO0oO(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooOOO(boolean r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.aa1[] r3 = r6.f24913Oooo0o0
            int r4 = r3.length
            if (r0 >= r4) goto L27
            if (r7 != 0) goto L17
            com.google.android.gms.internal.ads.sk r4 = r6.f24917OoooO0
            r4.getClass()
            java.lang.Object r4 = r4.f24100OooOoO0
            boolean[] r4 = (boolean[]) r4
            boolean r4 = r4[r0]
            if (r4 == 0) goto L21
        L17:
            r3 = r3[r0]
            monitor-enter(r3)
            long r4 = r3.f17010OooOo00     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            long r1 = java.lang.Math.max(r1, r4)
        L21:
            int r0 = r0 + 1
            goto L3
        L24:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r7
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v91.OooOOO(boolean):long");
    }

    public final int OooOOO0() {
        int i = 0;
        for (aa1 aa1Var : this.f24913Oooo0o0) {
            i += aa1Var.f17004OooOOOO + aa1Var.f17002OooOOO;
        }
        return i;
    }

    public final o000O OooOOOO(u91 u91Var) {
        int length = this.f24913Oooo0o0.length;
        for (int i = 0; i < length; i++) {
            if (u91Var.equals(this.f24912Oooo0o[i])) {
                return this.f24913Oooo0o0[i];
            }
        }
        if (this.f24914Oooo0oO) {
            AbstractC1641hg.OooOOo0("ProgressiveMediaPeriod", "Extractor added new track (id=" + u91Var.f24611OooO00o + ") after finishing tracks.");
            return new o00000O0();
        }
        aa1 aa1Var = new aa1(this.f24931Oooooo, this.f24895OooOo, this.f24898OooOoO);
        aa1Var.f16997OooO0o0 = this;
        int i2 = length + 1;
        u91[] u91VarArr = (u91[]) Arrays.copyOf(this.f24912Oooo0o, i2);
        u91VarArr[length] = u91Var;
        int i3 = i80.f19994OooO00o;
        this.f24912Oooo0o = u91VarArr;
        aa1[] aa1VarArr = (aa1[]) Arrays.copyOf(this.f24913Oooo0o0, i2);
        aa1VarArr[length] = aa1Var;
        this.f24913Oooo0o0 = aa1VarArr;
        return aa1Var;
    }

    public final void OooOOOo() {
        af0.OooooO0(this.f24915Oooo0oo);
        this.f24917OoooO0.getClass();
        this.f24919OoooO0O.getClass();
    }

    public final void OooOOo(int i) {
        OooOOOo();
        C2051sk c2051sk = this.f24917OoooO0;
        boolean[] zArr = (boolean[]) c2051sk.f24099OooOoO;
        if (zArr[i]) {
            return;
        }
        o0OoOo0 o0oooo0 = ((ha1) c2051sk.f24098OooOo0o).OooO00o(i).f17495OooO0Oo[0];
        e91 e91Var = new e91(AbstractC1813m4.OooO0O0(o0oooo0.f22222OooOOO0), o0oooo0, i80.OooOo0O(this.f24926Ooooo00), -9223372036854775807L);
        o71 o71Var = this.f24899OooOoO0;
        o71Var.OooO00o(new dx0(11, o71Var, e91Var));
        zArr[i] = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOo0() {
        long j;
        o0OoOo0 o0oooo0;
        C2107u2 c2107u2OooO0OO;
        int i;
        o0OoOo0 o0oooo02;
        boolean z = false;
        if (this.f24932Oooooo0 || this.f24915Oooo0oo || !this.f24914Oooo0oO || this.f24919OoooO0O == null) {
            return;
        }
        aa1[] aa1VarArr = this.f24913Oooo0o0;
        int length = aa1VarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                o0000o0.OooOOO oooOOO = this.f24907Oooo000;
                synchronized (oooOOO) {
                    oooOOO.f29577OooOo0o = false;
                }
                int length2 = this.f24913Oooo0o0.length;
                C1421bg[] c1421bgArr = new C1421bg[length2];
                boolean[] zArr = new boolean[length2];
                int i3 = 0;
                while (true) {
                    j = this.f24901OooOoo;
                    if (i3 >= length2) {
                        break;
                    }
                    aa1 aa1Var = this.f24913Oooo0o0[i3];
                    synchronized (aa1Var) {
                        o0oooo0 = aa1Var.f17012OooOo0o ? null : aa1Var.f17009OooOo;
                    }
                    o0oooo0.getClass();
                    String str = o0oooo0.f22222OooOOO0;
                    boolean zEquals = MimeTypes.BASE_TYPE_AUDIO.equals(AbstractC1813m4.OooO0oo(str));
                    boolean z2 = (zEquals || AbstractC1813m4.OooO0oO(str)) ? true : z;
                    zArr[i3] = z2;
                    boolean z3 = z;
                    this.f24905Oooo |= z2;
                    this.f24918OoooO00 = (j != -9223372036854775807L && length2 == 1 && (("image".equals(AbstractC1813m4.OooO0oo(str)) || "application/x-image-uri".equals(str)) ? true : z3 ? 1 : 0) == true) ? true : z3 ? 1 : 0;
                    oo0O oo0o = this.f24911Oooo0OO;
                    if (oo0o != null) {
                        if (zEquals || this.f24912Oooo0o[i3].f24612OooO0O0) {
                            C2107u2 c2107u2 = o0oooo0.f22220OooOO0O;
                            if (c2107u2 == null) {
                                InterfaceC1774l2[] interfaceC1774l2Arr = new InterfaceC1774l2[1];
                                interfaceC1774l2Arr[z3 ? 1 : 0] = oo0o;
                                c2107u2OooO0OO = new C2107u2(-9223372036854775807L, interfaceC1774l2Arr);
                            } else {
                                InterfaceC1774l2[] interfaceC1774l2Arr2 = new InterfaceC1774l2[1];
                                interfaceC1774l2Arr2[z3 ? 1 : 0] = oo0o;
                                c2107u2OooO0OO = c2107u2.OooO0OO(interfaceC1774l2Arr2);
                            }
                            jb1 jb1Var = new jb1(o0oooo0);
                            jb1Var.f20249OooOO0 = c2107u2OooO0OO;
                            o0oooo0 = new o0OoOo0(jb1Var);
                        }
                        if (zEquals && o0oooo0.f22217OooO0oO == -1 && o0oooo0.f22218OooO0oo == -1 && (i = oo0o.zza) != -1) {
                            jb1 jb1Var2 = new jb1(o0oooo0);
                            jb1Var2.f20247OooO0oO = i;
                            o0oooo0 = new o0OoOo0(jb1Var2);
                        }
                    }
                    this.f24895OooOo.getClass();
                    int i4 = o0oooo0.f22226OooOOo0 != null ? 1 : z3 ? 1 : 0;
                    jb1 jb1Var3 = new jb1(o0oooo0);
                    jb1Var3.f20271Oooo00o = i4;
                    o0OoOo0 o0oooo03 = new o0OoOo0(jb1Var3);
                    c1421bgArr[i3] = new C1421bg(Integer.toString(i3), o0oooo03);
                    this.f24923OoooOo0 = o0oooo03.f22227OooOOoo | this.f24923OoooOo0;
                    i3++;
                    z = z3 ? 1 : 0;
                }
                this.f24917OoooO0 = new C2051sk(new ha1(c1421bgArr), zArr);
                if (this.f24918OoooO00 && this.f24916OoooO == -9223372036854775807L) {
                    this.f24916OoooO = j;
                    this.f24919OoooO0O = new r91(this, this.f24919OoooO0O);
                }
                this.f24900OooOoOO.OooOOoo(this.f24919OoooO0O.zzh(), this.f24916OoooO, this.f24920OoooOO0);
                this.f24915Oooo0oo = true;
                f91 f91Var = this.f24910Oooo0O0;
                f91Var.getClass();
                f91Var.OooO0OO(this);
                return;
            }
            aa1 aa1Var2 = aa1VarArr[i2];
            synchronized (aa1Var2) {
                o0oooo02 = aa1Var2.f17012OooOo0o ? null : aa1Var2.f17009OooOo;
            }
            if (o0oooo02 == null) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void OooOOoo(int i) {
        OooOOOo();
        boolean[] zArr = (boolean[]) this.f24917OoooO0.f24096OooOo;
        if (this.f24928OooooO0 && zArr[i] && !this.f24913Oooo0o0[i].OooOOO(false)) {
            this.f24927Ooooo0o = 0L;
            this.f24928OooooO0 = false;
            this.f24922OoooOOo = true;
            this.f24926Ooooo00 = 0L;
            this.f24929OooooOO = 0;
            for (aa1 aa1Var : this.f24913Oooo0o0) {
                aa1Var.OooOOO0(false);
            }
            f91 f91Var = this.f24910Oooo0O0;
            f91Var.getClass();
            f91Var.OooO0oO(this);
        }
    }

    public final boolean OooOo0() {
        return this.f24927Ooooo0o != -9223372036854775807L;
    }

    public final void OooOo00() {
        s91 s91Var = new s91(this, this.f24896OooOo0O, this.f24897OooOo0o, this.f24904OooOooo, this, this.f24907Oooo000);
        if (this.f24915Oooo0oo) {
            af0.OooooO0(OooOo0());
            long j = this.f24916OoooO;
            if (j != -9223372036854775807L && this.f24927Ooooo0o > j) {
                this.f24930OooooOo = true;
                this.f24927Ooooo0o = -9223372036854775807L;
                return;
            }
            o000O00 o000o002 = this.f24919OoooO0O;
            o000o002.getClass();
            o000O00O o000o00o2 = o000o002.OooO0Oo(this.f24927Ooooo0o).f21729OooO00o;
            long j2 = this.f24927Ooooo0o;
            s91Var.f24044OooO0o.f21668OooO00o = o000o00o2.f21698OooO0O0;
            s91Var.f24039OooO = j2;
            s91Var.f24047OooO0oo = true;
            s91Var.OooOO0o = false;
            for (aa1 aa1Var : this.f24913Oooo0o0) {
                aa1Var.f17006OooOOo = this.f24927Ooooo0o;
            }
            this.f24927Ooooo0o = -9223372036854775807L;
        }
        this.f24929OooooOO = OooOOO0();
        de0 de0Var = this.f24903OooOooO;
        de0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        af0.OooOo0O(looperMyLooper);
        de0Var.f18243OooOoO0 = null;
        hb1 hb1Var = new hb1(de0Var, looperMyLooper, s91Var, this, SystemClock.elapsedRealtime());
        af0.OooooO0(((hb1) de0Var.f18240OooOo) == null);
        de0Var.f18240OooOo = hb1Var;
        SystemClock.elapsedRealtime();
        hb1Var.f19688OooOo0o.getClass();
        hb1Var.f19686OooOo = null;
        hb1 hb1Var2 = (hb1) de0Var.f18240OooOo;
        hb1Var2.getClass();
        ((ExecutorC2126ul) de0Var.f18242OooOo0o).execute(hb1Var2);
        Uri uri = s91Var.f24048OooOO0.f20087OooO00o;
        y81 y81Var = new y81();
        e91 e91Var = new e91(-1, null, i80.OooOo0O(s91Var.f24039OooO), i80.OooOo0O(this.f24916OoooO));
        o71 o71Var = this.f24899OooOoO0;
        o71Var.OooO00o(new j91(o71Var, y81Var, e91Var, 0));
    }

    public final boolean OooOo0O() {
        return this.f24922OoooOOo || OooOo0();
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final long zzb() {
        long jOooOOO;
        boolean z;
        long j;
        OooOOOo();
        if (this.f24930OooooOo || this.f24924OoooOoO == 0) {
            return Long.MIN_VALUE;
        }
        if (OooOo0()) {
            return this.f24927Ooooo0o;
        }
        if (this.f24905Oooo) {
            int length = this.f24913Oooo0o0.length;
            jOooOOO = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C2051sk c2051sk = this.f24917OoooO0;
                if (((boolean[]) c2051sk.f24096OooOo)[i] && ((boolean[]) c2051sk.f24100OooOoO0)[i]) {
                    aa1 aa1Var = this.f24913Oooo0o0[i];
                    synchronized (aa1Var) {
                        z = aa1Var.OooOo0;
                    }
                    if (z) {
                        continue;
                    } else {
                        aa1 aa1Var2 = this.f24913Oooo0o0[i];
                        synchronized (aa1Var2) {
                            j = aa1Var2.f17010OooOo00;
                        }
                        jOooOOO = Math.min(jOooOOO, j);
                    }
                }
            }
        } else {
            jOooOOO = Long.MAX_VALUE;
        }
        if (jOooOOO == LocationRequestCompat.PASSIVE_INTERVAL) {
            jOooOOO = OooOOO(false);
        }
        return jOooOOO == Long.MIN_VALUE ? this.f24926Ooooo00 : jOooOOO;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long zzd() {
        if (this.f24923OoooOo0) {
            this.f24923OoooOo0 = false;
        } else {
            if (!this.f24922OoooOOo) {
                return -9223372036854775807L;
            }
            if (!this.f24930OooooOo && OooOOO0() <= this.f24929OooooOO) {
                return -9223372036854775807L;
            }
            this.f24922OoooOOo = false;
        }
        return this.f24926Ooooo00;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final ha1 zzh() {
        OooOOOo();
        return (ha1) this.f24917OoooO0.f24098OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void zzk() throws IOException {
        IOException iOException;
        int i = this.o000oOoO == 7 ? 6 : 3;
        de0 de0Var = this.f24903OooOooO;
        IOException iOException2 = (IOException) de0Var.f18243OooOoO0;
        if (iOException2 != null) {
            throw iOException2;
        }
        hb1 hb1Var = (hb1) de0Var.f18240OooOo;
        if (hb1Var != null && (iOException = hb1Var.f19686OooOo) != null && hb1Var.f19690OooOoO0 > i) {
            throw iOException;
        }
        if (this.f24930OooooOo && !this.f24915Oooo0oo) {
            throw C2185w6.OooO00o(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final boolean zzp() {
        boolean z;
        if (((hb1) this.f24903OooOooO.f18240OooOo) == null) {
            return false;
        }
        o0000o0.OooOOO oooOOO = this.f24907Oooo000;
        synchronized (oooOOO) {
            z = oooOOO.f29577OooOo0o;
        }
        return z;
    }
}
