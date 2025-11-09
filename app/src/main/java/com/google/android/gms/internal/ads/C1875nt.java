package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.nt */
/* loaded from: classes2.dex */
public final class C1875nt {

    /* renamed from: OooO */
    public final C1618gu f21585OooO;

    /* renamed from: OooO00o */
    public final k40 f21586OooO00o;

    /* renamed from: OooO0O0 */
    public final vd0 f21587OooO0O0;

    /* renamed from: OooO0OO */
    public final gf0 f21588OooO0OO;

    /* renamed from: OooO0Oo */
    public final C1872nq f21589OooO0Oo;

    /* renamed from: OooO0o */
    public final C1583fw f21590OooO0o;

    /* renamed from: OooO0o0 */
    public final a80 f21591OooO0o0;

    /* renamed from: OooO0oO */
    public rd0 f21592OooO0oO;

    /* renamed from: OooO0oo */
    public final de0 f21593OooO0oo;

    /* renamed from: OooOO0 */
    public final cq0 f21594OooOO0;

    /* renamed from: OooOO0O */
    public final t40 f21595OooOO0O;
    public final o60 OooOO0o;

    public C1875nt(k40 k40Var, vd0 vd0Var, gf0 gf0Var, C1872nq c1872nq, a80 a80Var, C1583fw c1583fw, rd0 rd0Var, de0 de0Var, C1618gu c1618gu, cq0 cq0Var, t40 t40Var, o60 o60Var) {
        this.f21586OooO00o = k40Var;
        this.f21587OooO0O0 = vd0Var;
        this.f21588OooO0OO = gf0Var;
        this.f21589OooO0Oo = c1872nq;
        this.f21591OooO0o0 = a80Var;
        this.f21590OooO0o = c1583fw;
        this.f21592OooO0oO = rd0Var;
        this.f21593OooO0oo = de0Var;
        this.f21585OooO = c1618gu;
        this.f21594OooOO0 = cq0Var;
        this.f21595OooOO0O = t40Var;
        this.OooOO0o = o60Var;
    }

    public final df0 OooO00o(o00000oO.OooOOO oooOOO) {
        s20 s20VarOooOO0 = this.f21588OooO0OO.OooO00o(ef0.RENDERER, oooOOO).OooO0oO(new C1847n1(this, 13)).OooOO0(this.f21591OooO0o0);
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOo0O)).booleanValue()) {
            long jIntValue = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOo0o)).intValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            s20VarOooOO0 = s20VarOooOO0.OooOOO0(jIntValue);
        }
        return s20VarOooOO0.OooO00o();
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x012b A[Catch: all -> 0x00b5, PHI: r5
  0x012b: PHI (r5v11 java.lang.String) = 
  (r5v0 java.lang.String)
  (r5v0 java.lang.String)
  (r5v0 java.lang.String)
  (r5v0 java.lang.String)
  (r5v14 java.lang.String)
  (r5v0 java.lang.String)
 binds: [B:154:0x0095, B:156:0x009d, B:172:0x00d3, B:186:0x0115, B:184:0x0110, B:166:0x00c0] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:153:0x0075, B:155:0x0097, B:157:0x009f, B:159:0x00b2, B:164:0x00ba, B:167:0x00c1, B:169:0x00c9, B:171:0x00cf, B:175:0x00d8, B:184:0x0110, B:178:0x00ea, B:183:0x00f9, B:186:0x0115, B:163:0x00b8, B:187:0x012b, B:194:0x0146, B:197:0x014e, B:201:0x0172, B:203:0x0188, B:207:0x01ab, B:209:0x01c0, B:212:0x01d4, B:214:0x01da, B:215:0x01e7, B:217:0x01ea, B:220:0x01f3, B:219:0x01f0, B:208:0x01b5, B:204:0x019a, B:200:0x015c, B:191:0x0135, B:192:0x013a), top: B:245:0x0075, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01ab A[Catch: all -> 0x00b5, TryCatch #1 {, blocks: (B:153:0x0075, B:155:0x0097, B:157:0x009f, B:159:0x00b2, B:164:0x00ba, B:167:0x00c1, B:169:0x00c9, B:171:0x00cf, B:175:0x00d8, B:184:0x0110, B:178:0x00ea, B:183:0x00f9, B:186:0x0115, B:163:0x00b8, B:187:0x012b, B:194:0x0146, B:197:0x014e, B:201:0x0172, B:203:0x0188, B:207:0x01ab, B:209:0x01c0, B:212:0x01d4, B:214:0x01da, B:215:0x01e7, B:217:0x01ea, B:220:0x01f3, B:219:0x01f0, B:208:0x01b5, B:204:0x019a, B:200:0x015c, B:191:0x0135, B:192:0x013a), top: B:245:0x0075, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01b5 A[Catch: all -> 0x00b5, TryCatch #1 {, blocks: (B:153:0x0075, B:155:0x0097, B:157:0x009f, B:159:0x00b2, B:164:0x00ba, B:167:0x00c1, B:169:0x00c9, B:171:0x00cf, B:175:0x00d8, B:184:0x0110, B:178:0x00ea, B:183:0x00f9, B:186:0x0115, B:163:0x00b8, B:187:0x012b, B:194:0x0146, B:197:0x014e, B:201:0x0172, B:203:0x0188, B:207:0x01ab, B:209:0x01c0, B:212:0x01d4, B:214:0x01da, B:215:0x01e7, B:217:0x01ea, B:220:0x01f3, B:219:0x01f0, B:208:0x01b5, B:204:0x019a, B:200:0x015c, B:191:0x0135, B:192:0x013a), top: B:245:0x0075, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01f0 A[Catch: all -> 0x00b5, TryCatch #1 {, blocks: (B:153:0x0075, B:155:0x0097, B:157:0x009f, B:159:0x00b2, B:164:0x00ba, B:167:0x00c1, B:169:0x00c9, B:171:0x00cf, B:175:0x00d8, B:184:0x0110, B:178:0x00ea, B:183:0x00f9, B:186:0x0115, B:163:0x00b8, B:187:0x012b, B:194:0x0146, B:197:0x014e, B:201:0x0172, B:203:0x0188, B:207:0x01ab, B:209:0x01c0, B:212:0x01d4, B:214:0x01da, B:215:0x01e7, B:217:0x01ea, B:220:0x01f3, B:219:0x01f0, B:208:0x01b5, B:204:0x019a, B:200:0x015c, B:191:0x0135, B:192:0x013a), top: B:245:0x0075, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.df0 OooO0O0() {
        /*
            Method dump skipped, instructions count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1875nt.OooO0O0():com.google.android.gms.internal.ads.df0");
    }

    public final df0 OooO0OO(o00000oO.OooOOO oooOOO) {
        rd0 rd0Var = this.f21592OooO0oO;
        if (rd0Var != null) {
            return new s20(this.f21588OooO0OO, ef0.SERVER_TRANSACTION, null, gf0.f19331OooO0Oo, Collections.EMPTY_LIST, ii0.OooooOO(rd0Var)).OooO00o();
        }
        C1592g4 c1592g4Zzc = zzv.zzc();
        c1592g4Zzc.getClass();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00Ooo0O)).booleanValue()) {
            synchronized (c1592g4Zzc.f19219OooO0OO) {
                try {
                    c1592g4Zzc.OooO0Oo();
                    ScheduledFuture scheduledFuture = c1592g4Zzc.f19217OooO00o;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    c1592g4Zzc.f19217OooO00o = AbstractC2200wl.f25324OooO0Oo.schedule(c1592g4Zzc.f19218OooO0O0, ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.o00Ooo0o)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        return this.f21588OooO0OO.OooO00o(ef0.SERVER_TRANSACTION, oooOOO).OooOO0(new C2043sc(this.f21595OooOO0O, 4)).OooO00o();
    }
}
