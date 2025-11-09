package OooO0oO;

import OooOOO.OooO00o;
import OooOOo0.o0OOO0o;
import OooOOo0.o0ooOOo;
import Oooo0OO.oo000o;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.util.SparseBooleanArray;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.C1373a5;
import com.google.android.gms.internal.ads.C1410b5;
import com.google.android.gms.internal.ads.C1483d5;
import com.google.android.gms.internal.ads.C1703j5;
import com.google.android.gms.internal.ads.C1740k5;
import com.google.android.gms.internal.ads.C1741k6;
import com.google.android.gms.internal.ads.C1778l6;
import com.google.android.gms.internal.ads.C1889o6;
import com.google.android.gms.internal.ads.C1926p6;
import com.google.android.gms.internal.ads.C1998r4;
import com.google.android.gms.internal.ads.EnumC1852n6;
import com.google.android.gms.internal.ads.af0;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.de0;
import com.google.android.gms.internal.ads.k01;
import com.google.android.gms.internal.ads.ka1;
import com.google.android.gms.internal.ads.vp0;
import com.google.android.gms.internal.ads.ze0;
import com.google.android.gms.internal.measurement.o0OOo000;
import com.google.android.gms.internal.play_billing.oO0Ooooo;
import com.google.android.gms.internal.play_billing.oOO00O;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Oooo000 implements vp0, bf0, o000Oo0.OooOo00 {

    /* renamed from: OooOo0O */
    public boolean f13286OooOo0O;

    /* renamed from: OooOo0o */
    public Object f13287OooOo0o;

    public Oooo000(Uri uri, boolean z, boolean z2) {
        this.f13287OooOo0o = uri;
        this.f13286OooOo0O = z;
    }

    public o0OOo000 OooO(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        Object obj = o0OOo000.f26633OooO0oO;
        return new o0OOo000(this, str, lValueOf, 0);
    }

    @Override // o000Oo0.OooOo00
    public void OooO00o(o000Oo0.OooOOOO oooOOOO, int i) {
        boolean z = this.f13286OooOo0O;
        StringBuilder sb = (StringBuilder) this.f13287OooOo0o;
        if (z) {
            this.f13286OooOo0O = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public void OooO0O0() {
        this.f13286OooOo0O = false;
    }

    public void OooO0OO(char c) {
        Oooo0 oooo0 = (Oooo0) this.f13287OooOo0o;
        oooo0.OooO0OO(oooo0.f13285OooOo0o, 1);
        char[] cArr = (char[]) oooo0.f13283OooOo;
        int i = oooo0.f13285OooOo0o;
        oooo0.f13285OooOo0o = i + 1;
        cArr[i] = c;
    }

    public void OooO0o(int i) {
        af0.OooooO0(!this.f13286OooOo0O);
        ((SparseBooleanArray) this.f13287OooOo0o).append(i, true);
    }

    public void OooO0oO(oO0Ooooo oo0ooooo) {
        if (this.f13286OooOo0O) {
            oOO00O.OooO0oo("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((o0OOO0o) this.f13287OooOo0o).OooOOOO(new OooO00o(oo0ooooo, OooOOO.OooO0OO.f13317OooOo0O), new o0ooOOo(0));
        } catch (Throwable unused) {
            oOO00O.OooO0oo("BillingLogger", "logging failed.");
        }
    }

    public ka1 OooO0oo() {
        af0.OooooO0(!this.f13286OooOo0O);
        this.f13286OooOo0O = true;
        return new ka1((SparseBooleanArray) this.f13287OooOo0o);
    }

    public o0OOo000 OooOO0(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Object obj = o0OOo000.f26633OooO0oO;
        return new o0OOo000(this, str, boolValueOf, 1);
    }

    public o0OOo000 OooOO0O(String str, String str2) {
        Object obj = o0OOo000.f26633OooO0oO;
        return new o0OOo000(this, str, str2, 3);
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        zzo.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0066  */
    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo13705zzb(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0oO.Oooo000.mo13705zzb(java.lang.Object):void");
    }

    public /* synthetic */ Oooo000(Object obj) {
        this.f13287OooOo0o = obj;
        this.f13286OooOo0O = true;
    }

    @Override // com.google.android.gms.internal.ads.bf0
    public Object zza(Object obj) {
        long j;
        de0 de0Var = (de0) this.f13287OooOo0o;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f13286OooOo0O) {
            ((Context) de0Var.f18242OooOo0o).deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(C1373a5.Oooo0o(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (k01 e) {
                zzo.zzg("Unable to deserialize proto from offline signals database:");
                zzo.zzg(e.getMessage());
            }
        }
        cursorQuery.close();
        Context context = (Context) de0Var.f18242OooOo0o;
        C1410b5 c1410b5OooOooo = C1483d5.OooOooo();
        String packageName = context.getPackageName();
        c1410b5OooOooo.OooO0Oo();
        C1483d5.OooOo((C1483d5) c1410b5OooOooo.f25822OooOo0o, packageName);
        String str = Build.MODEL;
        c1410b5OooOooo.OooO0Oo();
        C1483d5.OooOoO((C1483d5) c1410b5OooOooo.f25822OooOo0o, str);
        int iOooO0Oo = ze0.OooO0Oo(sQLiteDatabase, 0);
        c1410b5OooOooo.OooO0Oo();
        C1483d5.OooOoOO((C1483d5) c1410b5OooOooo.f25822OooOo0o, iOooO0Oo);
        c1410b5OooOooo.OooO0Oo();
        C1483d5.OooOo0o((C1483d5) c1410b5OooOooo.f25822OooOo0o, arrayList);
        int iOooO0Oo2 = ze0.OooO0Oo(sQLiteDatabase, 1);
        c1410b5OooOooo.OooO0Oo();
        C1483d5.OooOoo((C1483d5) c1410b5OooOooo.f25822OooOo0o, iOooO0Oo2);
        int iOooO0Oo3 = ze0.OooO0Oo(sQLiteDatabase, 3);
        c1410b5OooOooo.OooO0Oo();
        C1483d5.OooOoO0((C1483d5) c1410b5OooOooo.f25822OooOo0o, iOooO0Oo3);
        ((oo000o) zzv.zzC()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1410b5OooOooo.OooO0Oo();
        C1483d5.OooOooO((C1483d5) c1410b5OooOooo.f25822OooOo0o, jCurrentTimeMillis);
        Cursor cursorOoooO = ze0.OoooO(sQLiteDatabase, 2);
        if (cursorOoooO.getCount() > 0) {
            cursorOoooO.moveToNext();
            j = cursorOoooO.getLong(cursorOoooO.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        cursorOoooO.close();
        c1410b5OooOooo.OooO0Oo();
        C1483d5.OooOoo0((C1483d5) c1410b5OooOooo.f25822OooOo0o, j);
        C1483d5 c1483d5 = (C1483d5) c1410b5OooOooo.OooO0O0();
        int size = arrayList.size();
        long jOooo0O0 = 0;
        for (int i = 0; i < size; i++) {
            C1373a5 c1373a5 = (C1373a5) arrayList.get(i);
            if (c1373a5.Oooo0OO() == EnumC1852n6.ENUM_TRUE && c1373a5.Oooo0O0() > jOooo0O0) {
                jOooo0O0 = c1373a5.Oooo0O0();
            }
        }
        if (jOooo0O0 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jOooo0O0));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        C1998r4 c1998r4 = (C1998r4) de0Var.f18240OooOo;
        synchronized (c1998r4) {
            if (c1998r4.f23741OooO0OO) {
                try {
                    C1889o6 c1889o6 = c1998r4.f23740OooO0O0;
                    c1889o6.OooO0Oo();
                    C1926p6.OooOoo0((C1926p6) c1889o6.f25822OooOo0o, c1483d5);
                } catch (NullPointerException e2) {
                    zzv.zzp().OooO0oo("AdMobClearcutLogger.modify", e2);
                }
            }
        }
        VersionInfoParcel versionInfoParcel = (VersionInfoParcel) de0Var.f18243OooOoO0;
        C1703j5 c1703j5OooOoO = C1740k5.OooOoO();
        int i2 = versionInfoParcel.buddyApkVersion;
        c1703j5OooOoO.OooO0Oo();
        C1740k5.OooOo0o((C1740k5) c1703j5OooOoO.f25822OooOo0o, i2);
        int i3 = ((VersionInfoParcel) de0Var.f18243OooOoO0).clientJarVersion;
        c1703j5OooOoO.OooO0Oo();
        C1740k5.OooOoO0((C1740k5) c1703j5OooOoO.f25822OooOo0o, i3);
        int i4 = true != ((VersionInfoParcel) de0Var.f18243OooOoO0).isClientJar ? 2 : 0;
        c1703j5OooOoO.OooO0Oo();
        C1740k5.OooOo((C1740k5) c1703j5OooOoO.f25822OooOo0o, i4);
        C1740k5 c1740k5 = (C1740k5) c1703j5OooOoO.OooO0O0();
        C1998r4 c1998r42 = (C1998r4) de0Var.f18240OooOo;
        synchronized (c1998r42) {
            if (c1998r42.f23741OooO0OO) {
                try {
                    C1889o6 c1889o62 = c1998r42.f23740OooO0O0;
                    C1741k6 c1741k6 = (C1741k6) ((C1926p6) c1889o62.f25822OooOo0o).Oooo000().OooOO0o();
                    c1741k6.OooO0Oo();
                    C1778l6.OooOo((C1778l6) c1741k6.f25822OooOo0o, c1740k5);
                    c1889o62.OooO0Oo();
                    C1926p6.OooOoOO((C1926p6) c1889o62.f25822OooOo0o, (C1778l6) c1741k6.OooO0O0());
                } catch (NullPointerException e3) {
                    zzv.zzp().OooO0oo("AdMobClearcutLogger.modify", e3);
                }
            }
        }
        ((C1998r4) de0Var.f18240OooOo).OooO0O0(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ze0.OoooOOO(sQLiteDatabase, "failed_requests");
        ze0.OoooOOO(sQLiteDatabase, "total_requests");
        ze0.OoooOOO(sQLiteDatabase, "completed_requests");
        return null;
    }

    public /* synthetic */ Oooo000(Object obj, boolean z) {
        this.f13287OooOo0o = obj;
        this.f13286OooOo0O = z;
    }

    public Oooo000() {
        this.f13287OooOo0o = new SparseBooleanArray();
    }

    public void OooO0Oo() {
    }

    public void OooO0o0() {
    }
}
