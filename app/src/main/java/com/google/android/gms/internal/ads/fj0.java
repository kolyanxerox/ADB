package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class fj0 implements bf0, InterfaceC1546ew {

    /* renamed from: OooOoOO */
    public static final Object f18953OooOoOO = new Object();

    /* renamed from: OooOo */
    public final Object f18954OooOo;

    /* renamed from: OooOo0O */
    public boolean f18955OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f18956OooOo0o;

    /* renamed from: OooOoO */
    public Object f18957OooOoO;

    /* renamed from: OooOoO0 */
    public Object f18958OooOoO0;

    public /* synthetic */ fj0(OooO0oO.Oooo000 oooo000, boolean z, ArrayList arrayList, C2220x4 c2220x4, EnumC1446c5 enumC1446c5) {
        this.f18956OooOo0o = oooo000;
        this.f18955OooOo0O = z;
        this.f18954OooOo = arrayList;
        this.f18958OooOoO0 = c2220x4;
        this.f18957OooOoO = enumC1446c5;
    }

    public static fj0 OooO00o(zg0 zg0Var, bh0 bh0Var, eh0 eh0Var, eh0 eh0Var2, boolean z) {
        if (eh0Var == eh0.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        zg0 zg0Var2 = zg0.DEFINED_BY_JAVASCRIPT;
        eh0 eh0Var3 = eh0.NATIVE;
        if (zg0Var == zg0Var2 && eh0Var == eh0Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (bh0Var == bh0.DEFINED_BY_JAVASCRIPT && eh0Var == eh0Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new fj0(zg0Var, bh0Var, eh0Var, eh0Var2, z);
    }

    public static String OooO0o0(C1996r2 c1996r2) {
        C2033s2 c2033s2OooOoO = C2070t2.OooOoO();
        String strOooOooo = c1996r2.OooOo().OooOooo();
        c2033s2OooOoO.OooO0Oo();
        C2070t2.Oooo0O0((C2070t2) c2033s2OooOoO.f25822OooOo0o, strOooOooo);
        String strOooOooO = c1996r2.OooOo().OooOooO();
        c2033s2OooOoO.OooO0Oo();
        C2070t2.Oooo000((C2070t2) c2033s2OooOoO.f25822OooOo0o, strOooOooO);
        long jOooOo0o = c1996r2.OooOo().OooOo0o();
        c2033s2OooOoO.OooO0Oo();
        C2070t2.Oooo00O((C2070t2) c2033s2OooOoO.f25822OooOo0o, jOooOo0o);
        long jOooOoO0 = c1996r2.OooOo().OooOoO0();
        c2033s2OooOoO.OooO0Oo();
        C2070t2.Oooo0((C2070t2) c2033s2OooOoO.f25822OooOo0o, jOooOoO0);
        long jOooOo = c1996r2.OooOo().OooOo();
        c2033s2OooOoO.OooO0Oo();
        C2070t2.Oooo00o((C2070t2) c2033s2OooOoO.f25822OooOo0o, jOooOo);
        return Oooo0OO.o00oO0o.OooO0O0(((C2070t2) c2033s2OooOoO.OooO0O0()).OooO0Oo());
    }

    public boolean OooO0O0(C1996r2 c1996r2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f18953OooOoOO) {
            try {
                if (!xh0.Ooooo0o(new File(OooO0Oo(c1996r2.OooOo().OooOooo()), "pcbc"), c1996r2.OooOoO0().OooO0o0())) {
                    OooO0o(4020, jCurrentTimeMillis);
                    return false;
                }
                String strOooO0o0 = OooO0o0(c1996r2);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f18954OooOo).edit();
                editorEdit.putString("LATMTD".concat(String.valueOf((String) this.f18958OooOoO0)), strOooO0o0);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    OooO0o(5015, jCurrentTimeMillis);
                } else {
                    OooO0o(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x00ea A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:86:0x000a, B:88:0x0019, B:90:0x0023, B:91:0x0028, B:95:0x002e, B:97:0x003e, B:100:0x0049, B:103:0x0054, B:112:0x009a, B:114:0x00ba, B:115:0x00bf, B:117:0x00c1, B:119:0x00cf, B:120:0x00d4, B:123:0x00d8, B:128:0x00e2, B:129:0x00e8, B:131:0x00ea, B:133:0x0124, B:134:0x0135, B:136:0x013b, B:137:0x0140, B:139:0x0142, B:141:0x014d, B:142:0x0154, B:144:0x015b, B:145:0x0162, B:147:0x017c, B:149:0x0188, B:150:0x018b, B:151:0x018e, B:152:0x0193, B:104:0x0075, B:106:0x007b, B:109:0x0086, B:110:0x0098), top: B:158:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean OooO0OO(com.google.android.gms.internal.ads.C1996r2 r15, com.google.android.gms.internal.ads.o0O r16) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fj0.OooO0OO(com.google.android.gms.internal.ads.r2, com.google.android.gms.internal.ads.o0O):boolean");
    }

    public File OooO0Oo(String str) {
        return new File(new File(((Context) this.f18956OooOo0o).getDir("pccache", 0), (String) this.f18958OooOoO0), str);
    }

    public void OooO0o(int i, long j) {
        ((vi0) this.f18957OooOoO).zza(i, j);
    }

    public C2070t2 OooO0oO(int i) {
        tz0 tz0VarOooO0O0;
        String str = (String) this.f18958OooOoO0;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f18954OooOo;
        String string = i == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                byte[] bArrOooOOO = Oooo0OO.o00oO0o.OooOOO(string);
                hz0 hz0VarOooOo0 = jz0.OooOo0(bArrOooOOO, 0, bArrOooOOO.length);
                if (this.f18955OooOo0O) {
                    tz0 tz0Var = tz0.f24541OooO00o;
                    a11 a11Var = a11.f16875OooO0OO;
                    tz0VarOooO0O0 = tz0.f24542OooO0O0;
                } else {
                    tz0VarOooO0O0 = tz0.OooO0O0();
                }
                return C2070t2.OooOoo(hz0VarOooOo0, tz0VarOooO0O0);
            } catch (k01 unused) {
            } catch (NullPointerException unused2) {
                OooO0o(2029, jCurrentTimeMillis);
            } catch (RuntimeException unused3) {
                OooO0o(2032, jCurrentTimeMillis);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.bf0
    public Object zza(Object obj) throws SQLException {
        long j;
        long j2;
        int i;
        OooO0oO.Oooo000 oooo000 = (OooO0oO.Oooo000) this.f18956OooOo0o;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((zzj) ((o50) oooo000.f13287OooOo0o).f13856OooO00o).zzN()) {
            return null;
        }
        EnumC1446c5 enumC1446c5 = (EnumC1446c5) this.f18957OooOoO;
        C2220x4 c2220x4 = (C2220x4) this.f18958OooOoO0;
        ArrayList arrayList = (ArrayList) this.f18954OooOo;
        boolean z = this.f18955OooOo0O;
        o50 o50Var = (o50) oooo000.f13287OooOo0o;
        SparseArray sparseArray = o50.f22336OooO0oo;
        C2294z4 c2294z4Oooo0o0 = C1373a5.Oooo0o0();
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5.OooOo0o((C1373a5) c2294z4Oooo0o0.f25822OooOo0o, arrayList);
        EnumC1852n6 enumC1852n6 = Settings.Global.getInt(o50Var.f22337OooO0OO.getContentResolver(), "airplane_mode_on", 0) != 0 ? EnumC1852n6.ENUM_TRUE : EnumC1852n6.ENUM_FALSE;
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5.OooOo((C1373a5) c2294z4Oooo0o0.f25822OooOo0o, enumC1852n6);
        EnumC1852n6 enumC1852n6Zzg = zzv.zzr().zzg(o50Var.f22337OooO0OO, o50Var.f22340OooO0o0);
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5.OooOoO0((C1373a5) c2294z4Oooo0o0.f25822OooOo0o, enumC1852n6Zzg);
        m50 m50Var = o50Var.f22339OooO0o;
        synchronized (m50Var.f21087OooO0oo) {
            j = m50Var.f21082OooO0OO;
        }
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5.OooOooo((C1373a5) c2294z4Oooo0o0.f25822OooOo0o, j);
        m50 m50Var2 = o50Var.f22339OooO0o;
        synchronized (m50Var2) {
            synchronized (m50Var2.f21088OooOO0) {
                j2 = m50Var2.f21085OooO0o0;
            }
        }
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5.OooOooO((C1373a5) c2294z4Oooo0o0.f25822OooOo0o, j2);
        m50 m50Var3 = o50Var.f22339OooO0o;
        synchronized (m50Var3.f21086OooO0oO) {
            i = m50Var3.f21081OooO0O0;
        }
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5.OooOoO((C1373a5) c2294z4Oooo0o0.f25822OooOo0o, i);
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5.OooOoOO((C1373a5) c2294z4Oooo0o0.f25822OooOo0o, enumC1446c5);
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5.OooOoo0((C1373a5) c2294z4Oooo0o0.f25822OooOo0o, c2220x4);
        EnumC1852n6 enumC1852n62 = o50Var.f22341OooO0oO;
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5.OooOoo((C1373a5) c2294z4Oooo0o0.f25822OooOo0o, enumC1852n62);
        EnumC1852n6 enumC1852n63 = z ? EnumC1852n6.ENUM_TRUE : EnumC1852n6.ENUM_FALSE;
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5.Oooo000((C1373a5) c2294z4Oooo0o0.f25822OooOo0o, enumC1852n63);
        long jOooO0O0 = o50Var.f22339OooO0o.OooO0O0();
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5.Oooo00o((C1373a5) c2294z4Oooo0o0.f25822OooOo0o, jOooO0O0);
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5.Oooo00O((C1373a5) c2294z4Oooo0o0.f25822OooOo0o, jCurrentTimeMillis);
        EnumC1852n6 enumC1852n64 = Settings.Global.getInt(o50Var.f22337OooO0OO.getContentResolver(), "wifi_on", 0) != 0 ? EnumC1852n6.ENUM_TRUE : EnumC1852n6.ENUM_FALSE;
        c2294z4Oooo0o0.OooO0Oo();
        C1373a5.Oooo0((C1373a5) c2294z4Oooo0o0.f25822OooOo0o, enumC1852n64);
        byte[] bArrOooO0Oo = ((C1373a5) c2294z4Oooo0o0.OooO0O0()).OooO0Oo();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
        ze0.Oooo0O0(sQLiteDatabase, ((o50) oooo000.f13287OooOo0o).f22339OooO0o.OooO0O0(), bArrOooO0Oo);
        return null;
    }

    public /* synthetic */ fj0(o71 o71Var, y81 y81Var, e91 e91Var, IOException iOException, boolean z) {
        this.f18956OooOo0o = o71Var;
        this.f18954OooOo = y81Var;
        this.f18958OooOoO0 = e91Var;
        this.f18957OooOoO = iOException;
        this.f18955OooOo0O = z;
    }

    public fj0(Context context, int i, vi0 vi0Var, boolean z) {
        this.f18955OooOo0O = false;
        this.f18956OooOo0o = context;
        this.f18958OooOoO0 = Integer.toString(i - 1);
        this.f18954OooOo = context.getSharedPreferences("pcvmspf", 0);
        this.f18957OooOoO = vi0Var;
        this.f18955OooOo0O = z;
    }

    public fj0(zg0 zg0Var, bh0 bh0Var, eh0 eh0Var, eh0 eh0Var2, boolean z) {
        this.f18958OooOoO0 = zg0Var;
        this.f18957OooOoO = bh0Var;
        this.f18956OooOo0o = eh0Var;
        this.f18954OooOo = eh0Var2;
        this.f18955OooOo0O = z;
    }

    public fj0(Context context) {
        this.f18956OooOo0o = context;
        this.f18954OooOo = q61.f23514OooO0OO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1546ew, com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        ((l91) obj).OooO0o0(0, ((o71) this.f18956OooOo0o).f22354OooO00o, (y81) this.f18954OooOo, (e91) this.f18958OooOoO0, (IOException) this.f18957OooOoO, this.f18955OooOo0O);
    }
}
