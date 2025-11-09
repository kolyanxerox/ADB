package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class gb1 implements e01 {

    /* renamed from: Oooo0o */
    public static gb1 f19307Oooo0o;

    /* renamed from: OooOo0O */
    public final mn0 f19310OooOo0O;

    /* renamed from: OooOoO */
    public long f19312OooOoO;

    /* renamed from: OooOoO0 */
    public int f19313OooOoO0;

    /* renamed from: OooOoOO */
    public long f19314OooOoOO;

    /* renamed from: OooOoo */
    public long f19315OooOoo;

    /* renamed from: OooOoo0 */
    public long f19316OooOoo0;

    /* renamed from: OooOooO */
    public long f19317OooOooO;

    /* renamed from: OooOooo */
    public long f19318OooOooo;

    /* renamed from: Oooo000 */
    public int f19319Oooo000;

    /* renamed from: Oooo00O */
    public static final gn0 f19303Oooo00O = rm0.OooOOoo(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: Oooo00o */
    public static final gn0 f19304Oooo00o = rm0.OooOOoo(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: Oooo0 */
    public static final gn0 f19302Oooo0 = rm0.OooOOoo(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: Oooo0O0 */
    public static final gn0 f19305Oooo0O0 = rm0.OooOOoo(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: Oooo0OO */
    public static final gn0 f19306Oooo0OO = rm0.OooOOoo(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: Oooo0o0 */
    public static final gn0 f19308Oooo0o0 = rm0.OooOOoo(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: OooOo0o */
    public final ni0 f19311OooOo0o = new ni0(11);

    /* renamed from: OooOo */
    public final lb1 f19309OooOo = new lb1();

    public gb1(Context context, HashMap map) {
        this.f19310OooOo0O = mn0.OooO00o(map);
        if (context == null) {
            this.f19319Oooo000 = 0;
            this.f19317OooOooO = OooO0OO(0);
            return;
        }
        b40 b40VarOooO0o0 = b40.OooO0o0(context);
        int iOooO0O0 = b40VarOooO0o0.OooO0O0();
        this.f19319Oooo000 = iOooO0O0;
        this.f19317OooOooO = OooO0OO(iOooO0O0);
        fb1 fb1Var = new fb1(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) b40VarOooO0o0.f17367OooO0OO;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(fb1Var));
        ((Handler) b40VarOooO0o0.f17366OooO0O0).post(new wp0(23, b40VarOooO0o0, fb1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x002f A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:31:0x0003, B:36:0x000f, B:38:0x0013, B:40:0x001d, B:42:0x0027, B:46:0x003b, B:45:0x002f, B:35:0x000b, B:47:0x00db), top: B:52:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized com.google.android.gms.internal.ads.gb1 OooO00o(android.content.Context r10) {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.gb1> r0 = com.google.android.gms.internal.ads.gb1.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.gb1 r1 = com.google.android.gms.internal.ads.gb1.f19307Oooo0o     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto Ldb
            if (r10 != 0) goto Lb
            r1 = 0
            goto Lf
        Lb:
            android.content.Context r1 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L2c
        Lf:
            int r2 = com.google.android.gms.internal.ads.i80.f19994OooO00o     // Catch: java.lang.Throwable -> L2c
            if (r10 == 0) goto L2f
            java.lang.String r2 = "phone"
            java.lang.Object r10 = r10.getSystemService(r2)     // Catch: java.lang.Throwable -> L2c
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.Throwable -> L2c
            if (r10 == 0) goto L2f
            java.lang.String r10 = r10.getNetworkCountryIso()     // Catch: java.lang.Throwable -> L2c
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L2f
            java.lang.String r10 = com.google.android.gms.internal.ads.xh0.Oooo00o(r10)     // Catch: java.lang.Throwable -> L2c
            goto L3b
        L2c:
            r10 = move-exception
            goto Ldf
        L2f:
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r10 = r10.getCountry()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r10 = com.google.android.gms.internal.ads.xh0.Oooo00o(r10)     // Catch: java.lang.Throwable -> L2c
        L3b:
            int[] r10 = OooO0o0(r10)     // Catch: java.lang.Throwable -> L2c
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2c
            r3 = 8
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L2c
            r5 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L2c
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L2c
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.gn0 r6 = com.google.android.gms.internal.ads.gb1.f19303Oooo00O     // Catch: java.lang.Throwable -> L2c
            r7 = r10[r3]     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r6.get(r7)     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> L2c
            r2.put(r5, r7)     // Catch: java.lang.Throwable -> L2c
            r5 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.gn0 r8 = com.google.android.gms.internal.ads.gb1.f19304Oooo00o     // Catch: java.lang.Throwable -> L2c
            r9 = 1
            r9 = r10[r9]     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r8 = r8.get(r9)     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L2c
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L2c
            r7 = 4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.gn0 r9 = com.google.android.gms.internal.ads.gb1.f19302Oooo0     // Catch: java.lang.Throwable -> L2c
            r4 = r10[r4]     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r9.get(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L2c
            r2.put(r8, r4)     // Catch: java.lang.Throwable -> L2c
            r4 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.gn0 r9 = com.google.android.gms.internal.ads.gb1.f19305Oooo0O0     // Catch: java.lang.Throwable -> L2c
            r5 = r10[r5]     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r5 = r9.get(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L2c
            r2.put(r8, r5)     // Catch: java.lang.Throwable -> L2c
            r5 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.gn0 r8 = com.google.android.gms.internal.ads.gb1.f19306Oooo0OO     // Catch: java.lang.Throwable -> L2c
            r7 = r10[r7]     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r8.get(r7)     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> L2c
            r2.put(r5, r7)     // Catch: java.lang.Throwable -> L2c
            r5 = 9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.gn0 r7 = com.google.android.gms.internal.ads.gb1.f19308Oooo0o0     // Catch: java.lang.Throwable -> L2c
            r4 = r10[r4]     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r7.get(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L2c
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L2c
            r4 = 7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2c
            r10 = r10[r3]     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r10 = r6.get(r10)     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Throwable -> L2c
            r2.put(r4, r10)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.gb1 r10 = new com.google.android.gms.internal.ads.gb1     // Catch: java.lang.Throwable -> L2c
            r10.<init>(r1, r2)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.gb1.f19307Oooo0o = r10     // Catch: java.lang.Throwable -> L2c
        Ldb:
            com.google.android.gms.internal.ads.gb1 r10 = com.google.android.gms.internal.ads.gb1.f19307Oooo0o     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)
            return r10
        Ldf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gb1.OooO00o(android.content.Context):com.google.android.gms.internal.ads.gb1");
    }

    public static void OooO0O0(gb1 gb1Var, int i) {
        gb1 gb1Var2;
        Throwable th;
        int i2;
        lb1 lb1Var;
        synchronized (gb1Var) {
            try {
                if (gb1Var.f19319Oooo000 != i) {
                    gb1Var.f19319Oooo000 = i;
                    if (i != 1 && i != 0 && i != 8) {
                        gb1Var.f19317OooOooO = gb1Var.OooO0OO(i);
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (gb1Var.f19313OooOoO0 > 0) {
                            try {
                                i2 = (int) (jElapsedRealtime - gb1Var.f19312OooOoO);
                            } catch (Throwable th2) {
                                th = th2;
                                gb1Var2 = gb1Var;
                                throw th;
                            }
                        } else {
                            i2 = 0;
                        }
                        gb1Var2 = gb1Var;
                        try {
                            gb1Var2.OooO0Oo(i2, gb1Var.f19314OooOoOO, gb1Var.f19317OooOooO);
                            gb1Var2.f19312OooOoO = jElapsedRealtime;
                            gb1Var2.f19314OooOoOO = 0L;
                            gb1Var2.f19315OooOoo = 0L;
                            gb1Var2.f19316OooOoo0 = 0L;
                            lb1Var = gb1Var2.f19309OooOo;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            lb1Var.f20842OooO00o.clear();
                            lb1Var.f20844OooO0OO = -1;
                            lb1Var.f20845OooO0Oo = 0;
                            lb1Var.f20847OooO0o0 = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                }
            } catch (Throwable th5) {
                gb1Var2 = gb1Var;
                th = th5;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1008:0x013b, code lost:
    
        if (r3.equals("YT") != false) goto L1299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1011:0x0145, code lost:
    
        if (r3.equals("YE") != false) goto L1736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1018:0x015d, code lost:
    
        if (r3.equals("WS") != false) goto L1307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1021:0x0167, code lost:
    
        if (r3.equals("WF") != false) goto L1366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1024:0x0171, code lost:
    
        if (r3.equals("VU") != false) goto L1449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1039:0x01a5, code lost:
    
        if (r3.equals("VE") != false) goto L1736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1042:0x01af, code lost:
    
        if (r3.equals("VC") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1045:0x01b9, code lost:
    
        if (r3.equals("VA") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1064:0x01fb, code lost:
    
        if (r3.equals("UA") != false) goto L1724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1075:0x0221, code lost:
    
        if (r3.equals("TV") != false) goto L1366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1082:0x0239, code lost:
    
        if (r3.equals("TR") != false) goto L1798;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1093:0x025f, code lost:
    
        if (r3.equals("TM") != false) goto L1366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1096:0x0269, code lost:
    
        if (r3.equals("TL") != false) goto L1693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1099:0x0273, code lost:
    
        if (r3.equals("TJ") != false) goto L1653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1102:0x027d, code lost:
    
        if (r3.equals("TH") != false) goto L1713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1109:0x0295, code lost:
    
        if (r3.equals("TD") != false) goto L1748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1116:0x02ad, code lost:
    
        if (r3.equals("SZ") != false) goto L1775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1119:0x02b7, code lost:
    
        if (r3.equals("SY") != false) goto L1748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1122:0x02c1, code lost:
    
        if (r3.equals("SX") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1133:0x02e7, code lost:
    
        if (r3.equals("SS") != false) goto L1565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1148:0x031b, code lost:
    
        if (r3.equals("SM") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1151:0x0325, code lost:
    
        if (r3.equals("SL") != false) goto L1760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1158:0x033d, code lost:
    
        if (r3.equals("SJ") != false) goto L1617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1161:0x0347, code lost:
    
        if (r3.equals("SI") != false) goto L1744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1164:0x0351, code lost:
    
        if (r3.equals("SH") != false) goto L1637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1171:0x0369, code lost:
    
        if (r3.equals("SE") != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1174:0x0373, code lost:
    
        if (r3.equals("SD") != false) goto L1748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1177:0x037d, code lost:
    
        if (r3.equals("SC") != false) goto L1637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1180:0x0387, code lost:
    
        if (r3.equals("SB") != false) goto L1181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1182:0x038e, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1212:0x03f7, code lost:
    
        if (r3.equals("PY") != false) goto L1344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1219:0x040f, code lost:
    
        if (r3.equals("PT") != false) goto L1744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1230:0x0435, code lost:
    
        if (r3.equals("PM") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1245:0x0469, code lost:
    
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L1406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1256:0x048f, code lost:
    
        if (r3.equals("PA") != false) goto L1810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1267:0x04b5, code lost:
    
        if (r3.equals("NU") != false) goto L1637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1270:0x04bf, code lost:
    
        if (r3.equals("NR") != false) goto L1693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1285:0x04f3, code lost:
    
        if (r3.equals("NI") != false) goto L1697;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1292:0x050b, code lost:
    
        if (r3.equals("NF") != false) goto L1617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1295:0x0515, code lost:
    
        if (r3.equals("NE") != false) goto L1736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1298:0x051f, code lost:
    
        if (r3.equals("NC") != false) goto L1299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1300:0x0526, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1306:0x053b, code lost:
    
        if (r3.equals("MZ") != false) goto L1307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1308:0x0542, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1330:0x058f, code lost:
    
        if (r3.equals("MT") != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1333:0x0599, code lost:
    
        if (r3.equals("MS") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1336:0x05a3, code lost:
    
        if (r3.equals("MR") != false) goto L1709;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1343:0x05bb, code lost:
    
        if (r3.equals("MP") != false) goto L1344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1345:0x05c2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1355:0x05e5, code lost:
    
        if (r3.equals("MM") != false) goto L1413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1358:0x05ef, code lost:
    
        if (r3.equals("ML") != false) goto L1720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1365:0x0607, code lost:
    
        if (r3.equals("MH") != false) goto L1366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1367:0x060e, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1369:0x0615, code lost:
    
        if (r3.equals("MG") != false) goto L1641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1384:0x0649, code lost:
    
        if (r3.equals("MC") != false) goto L1569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1391:0x0661, code lost:
    
        if (r3.equals("LY") != false) goto L1760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1394:0x066b, code lost:
    
        if (r3.equals("LV") != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1405:0x0691, code lost:
    
        if (r3.equals("LS") != false) goto L1406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1407:0x0698, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1409:0x069f, code lost:
    
        if (r3.equals("LR") != false) goto L1657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1412:0x06a9, code lost:
    
        if (r3.equals("LK") != false) goto L1413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1414:0x06b0, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1416:0x06b7, code lost:
    
        if (r3.equals("LI") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1435:0x06f9, code lost:
    
        if (r3.equals("KY") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1438:0x0703, code lost:
    
        if (r3.equals("KW") != false) goto L1526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1445:0x071b, code lost:
    
        if (r3.equals("KN") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1448:0x0725, code lost:
    
        if (r3.equals("KM") != false) goto L1449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1450:0x072c, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1452:0x0733, code lost:
    
        if (r3.equals("KI") != false) goto L1693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1471:0x0775, code lost:
    
        if (r3.equals("JO") != false) goto L1798;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1478:0x078d, code lost:
    
        if (r3.equals("JE") != false) goto L1573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1485:0x07a5, code lost:
    
        if (r3.equals(com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE) != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1504:0x07e7, code lost:
    
        if (r3.equals("IM") != false) goto L1573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1519:0x081b, code lost:
    
        if (r3.equals("HU") != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1522:0x0825, code lost:
    
        if (r3.equals("HT") != false) goto L1736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1525:0x082f, code lost:
    
        if (r3.equals("HR") != false) goto L1526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1527:0x0836, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1553:0x0891, code lost:
    
        if (r3.equals("GQ") != false) goto L1736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1564:0x08b7, code lost:
    
        if (r3.equals("GM") != false) goto L1565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1566:0x08be, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1568:0x08c5, code lost:
    
        if (r3.equals("GL") != false) goto L1569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1570:0x08cc, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1572:0x08d3, code lost:
    
        if (r3.equals("GI") != false) goto L1573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1574:0x08da, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1616:0x096d, code lost:
    
        if (r3.equals("FK") != false) goto L1617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1618:0x0974, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1636:0x09b3, code lost:
    
        if (r3.equals("ER") != false) goto L1637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1638:0x09ba, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1640:0x09c1, code lost:
    
        if (r3.equals("EG") != false) goto L1641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1642:0x09c8, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1644:0x09cf, code lost:
    
        if (r3.equals("EE") != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1646:0x09d6, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1652:0x09eb, code lost:
    
        if (r3.equals("DZ") != false) goto L1653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1654:0x09f2, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1656:0x09f9, code lost:
    
        if (r3.equals("DO") != false) goto L1657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1658:0x0a00, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1660:0x0a07, code lost:
    
        if (r3.equals("DM") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1667:0x0a1f, code lost:
    
        if (r3.equals("DJ") != false) goto L1760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1682:0x0a53, code lost:
    
        if (r3.equals("CX") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1685:0x0a5d, code lost:
    
        if (r3.equals("CW") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1692:0x0a75, code lost:
    
        if (r3.equals("CU") != false) goto L1693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1694:0x0a7c, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1696:0x0a83, code lost:
    
        if (r3.equals("CR") != false) goto L1697;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1698:0x0a8a, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1708:0x0aad, code lost:
    
        if (r3.equals("CM") != false) goto L1709;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1710:0x0ab4, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1712:0x0abb, code lost:
    
        if (r3.equals("CL") != false) goto L1713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1714:0x0ac2, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1716:0x0ac9, code lost:
    
        if (r3.equals("CK") != false) goto L1786;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1719:0x0ad3, code lost:
    
        if (r3.equals("CD") != false) goto L1720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1721:0x0ada, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1723:0x0ae1, code lost:
    
        if (r3.equals("CA") != false) goto L1724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1725:0x0ae8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1735:0x0b0b, code lost:
    
        if (r3.equals("BI") != false) goto L1736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1737:0x0b12, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1743:0x0b27, code lost:
    
        if (r3.equals("BG") != false) goto L1744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1745:0x0b2e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1747:0x0b35, code lost:
    
        if (r3.equals("BF") != false) goto L1748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1749:0x0b3c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1759:0x0b5f, code lost:
    
        if (r3.equals("AZ") != false) goto L1760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1761:0x0b66, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1767:0x0b7b, code lost:
    
        if (r3.equals("AI") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1770:0x0b84, code lost:
    
        if (r3.equals("AG") != false) goto L1771;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1772:0x0b8b, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1774:0x0b92, code lost:
    
        if (r3.equals("AF") != false) goto L1775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1776:0x0b99, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1782:0x0bae, code lost:
    
        if (r3.equals("AD") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1785:0x0bb7, code lost:
    
        if (r3.equals("BZ") != false) goto L1786;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1787:0x0bbe, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1793:0x0bd3, code lost:
    
        if (r3.equals("BB") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1795:0x0bda, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1797:0x0be1, code lost:
    
        if (r3.equals("BA") != false) goto L1798;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1799:0x0be8, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1801:0x0bef, code lost:
    
        if (r3.equals("AX") != false) goto L1802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1803:0x0bf6, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:1809:0x0c0b, code lost:
    
        if (r3.equals("AM") != false) goto L1810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1811:0x0c12, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:935:0x003f, code lost:
    
        if (r3.equals("CI") != false) goto L1771;
     */
    /* JADX WARN: Code restructure failed: missing block: B:942:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L1641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:961:0x0099, code lost:
    
        if (r3.equals("BQ") != false) goto L1794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:976:0x00cd, code lost:
    
        if (r3.equals("BL") != false) goto L1344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:983:0x00e5, code lost:
    
        if (r3.equals("AT") != false) goto L1645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:994:0x010b, code lost:
    
        if (r3.equals("AQ") != false) goto L1637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:997:0x0115, code lost:
    
        if (r3.equals("ZW") != false) goto L1181;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] OooO0o0(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 6672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gb1.OooO0o0(java.lang.String):int[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0058 A[Catch: all -> 0x0073, TRY_ENTER, TryCatch #1 {all -> 0x0073, blocks: (B:57:0x0012, B:60:0x0017, B:62:0x0032, B:72:0x0061, B:71:0x0058), top: B:86:0x0012 }] */
    @Override // com.google.android.gms.internal.ads.e01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void OooO(com.google.android.gms.internal.ads.iq0 r11, boolean r12) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            r1 = 1
            if (r12 == 0) goto Ld
            r11.getClass()     // Catch: java.lang.Throwable -> L55
            r11 = r1
            goto Le
        La:
            r4 = r10
            goto L7f
        Ld:
            r11 = r0
        Le:
            if (r11 != 0) goto L12
            monitor-exit(r10)
            return
        L12:
            int r11 = r10.f19313OooOoO0     // Catch: java.lang.Throwable -> L73
            if (r11 <= 0) goto L17
            r0 = r1
        L17:
            com.google.android.gms.internal.ads.af0.OooooO0(r0)     // Catch: java.lang.Throwable -> L73
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L73
            long r0 = r10.f19312OooOoO     // Catch: java.lang.Throwable -> L73
            long r0 = r11 - r0
            long r2 = r10.f19316OooOoo0     // Catch: java.lang.Throwable -> L73
            int r5 = (int) r0     // Catch: java.lang.Throwable -> L73
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L73
            long r2 = r2 + r0
            r10.f19316OooOoo0 = r2     // Catch: java.lang.Throwable -> L73
            long r0 = r10.f19315OooOoo     // Catch: java.lang.Throwable -> L73
            long r2 = r10.f19314OooOoOO     // Catch: java.lang.Throwable -> L73
            long r0 = r0 + r2
            r10.f19315OooOoo = r0     // Catch: java.lang.Throwable -> L73
            if (r5 <= 0) goto L76
            float r0 = (float) r2     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.internal.ads.lb1 r1 = r10.f19309OooOo     // Catch: java.lang.Throwable -> L73
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L73
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L73
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L73
            r3 = 1174011904(0x45fa0000, float:8000.0)
            float r0 = r0 * r3
            float r3 = (float) r5     // Catch: java.lang.Throwable -> L73
            float r0 = r0 / r3
            r1.OooO0O0(r0, r2)     // Catch: java.lang.Throwable -> L73
            long r0 = r10.f19316OooOoo0     // Catch: java.lang.Throwable -> L73
            r2 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L58
            long r0 = r10.f19315OooOoo     // Catch: java.lang.Throwable -> L55
            r2 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L61
            goto L58
        L55:
            r0 = move-exception
            r11 = r0
            goto La
        L58:
            com.google.android.gms.internal.ads.lb1 r0 = r10.f19309OooOo     // Catch: java.lang.Throwable -> L73
            float r0 = r0.OooO00o()     // Catch: java.lang.Throwable -> L73
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L73
            r10.f19317OooOooO = r0     // Catch: java.lang.Throwable -> L73
        L61:
            long r6 = r10.f19314OooOoOO     // Catch: java.lang.Throwable -> L73
            long r8 = r10.f19317OooOooO     // Catch: java.lang.Throwable -> L73
            r4 = r10
            r4.OooO0Oo(r5, r6, r8)     // Catch: java.lang.Throwable -> L70
            r4.f19312OooOoO = r11     // Catch: java.lang.Throwable -> L70
            r11 = 0
            r4.f19314OooOoOO = r11     // Catch: java.lang.Throwable -> L70
            goto L77
        L70:
            r0 = move-exception
        L71:
            r11 = r0
            goto L7f
        L73:
            r0 = move-exception
            r4 = r10
            goto L71
        L76:
            r4 = r10
        L77:
            int r11 = r4.f19313OooOoO0     // Catch: java.lang.Throwable -> L70
            int r11 = r11 + (-1)
            r4.f19313OooOoO0 = r11     // Catch: java.lang.Throwable -> L70
            monitor-exit(r10)
            return
        L7f:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L70
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gb1.OooO(com.google.android.gms.internal.ads.iq0, boolean):void");
    }

    public final long OooO0OO(int i) {
        Integer numValueOf = Integer.valueOf(i);
        mn0 mn0Var = this.f19310OooOo0O;
        Long l = (Long) mn0Var.get(numValueOf);
        if (l == null) {
            l = (Long) mn0Var.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void OooO0Oo(int i, long j, final long j2) {
        final int i2;
        final long j3;
        if (i == 0) {
            if (j != 0) {
                j3 = j;
            } else if (j2 == this.f19318OooOooo) {
                return;
            } else {
                j3 = 0;
            }
            i2 = 0;
        } else {
            i2 = i;
            j3 = j;
        }
        this.f19318OooOooo = j2;
        Iterator it = ((CopyOnWriteArrayList) this.f19311OooOo0o.f21493OooOo0o).iterator();
        while (it.hasNext()) {
            final db1 db1Var = (db1) it.next();
            if (!db1Var.f18232OooO0OO) {
                db1Var.f18230OooO00o.post(new Runnable() { // from class: com.google.android.gms.internal.ads.cb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object next;
                        Object obj;
                        h91 h91Var;
                        h61 h61Var = db1Var.f18231OooO0O0;
                        s20 s20Var = h61Var.f19577OooO0Oo;
                        if (((rm0) s20Var.f23977OooOo0o).isEmpty()) {
                            h91Var = null;
                        } else {
                            rm0 rm0Var = (rm0) s20Var.f23977OooOo0o;
                            if (rm0Var == null) {
                                pm0 pm0VarListIterator = rm0Var.listIterator(0);
                                do {
                                    next = pm0VarListIterator.next();
                                } while (pm0VarListIterator.hasNext());
                                obj = next;
                            } else {
                                if (rm0Var.isEmpty()) {
                                    throw new NoSuchElementException();
                                }
                                obj = rm0Var.get(rm0Var.size() - 1);
                            }
                            h91Var = (h91) obj;
                        }
                        d61 d61VarOooOO0 = h61Var.OooOO0(h91Var);
                        h61Var.OooO(d61VarOooOO0, 1006, new OooOOOO.OooO0O0(d61VarOooOO0, i2, j3, j2));
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e01
    public final synchronized void OooO0o(iq0 iq0Var, boolean z, int i) {
        boolean z2;
        if (z) {
            iq0Var.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f19314OooOoOO += i;
        }
    }

    @Override // com.google.android.gms.internal.ads.e01
    public final synchronized void OooOO0o(rj0 rj0Var, iq0 iq0Var, boolean z) {
        boolean z2;
        if (z) {
            try {
                iq0Var.getClass();
                z2 = true;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.f19313OooOoO0 == 0) {
                this.f19312OooOoO = SystemClock.elapsedRealtime();
            }
            this.f19313OooOoO0++;
        }
    }
}
