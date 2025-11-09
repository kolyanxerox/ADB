package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3034d9;

/* loaded from: classes2.dex */
public final class s50 extends mj0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f24004OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C2163vl f24005OooO0O0;

    public s50(Context context, C2163vl c2163vl) {
        super(context, "AdMobOfflineBufferedPings.db", ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO00OO)).intValue());
        this.f24004OooO00o = context;
        this.f24005OooO0O0 = c2163vl;
    }

    public static void OooO0OO(SQLiteDatabase sQLiteDatabase, zzu zzuVar) {
        SQLiteDatabase sQLiteDatabase2;
        String str;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("timestamp");
                int columnIndex2 = cursorQuery.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j = cursorQuery.getLong(columnIndex);
                    String string = cursorQuery.getString(columnIndex2);
                    if (string == null) {
                        str = "";
                    } else {
                        Uri uri = Uri.parse(string);
                        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() - j;
                        String encodedQuery = uri.getEncodedQuery();
                        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                        builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                        str = String.valueOf(builderClearQuery.build()) + C3034d9.i.f8175c + encodedQuery;
                    }
                    strArr[i] = str;
                }
                i++;
            }
            cursorQuery.close();
            sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase2.setTransactionSuccessful();
            sQLiteDatabase2.endTransaction();
            for (int i2 = 0; i2 < count; i2++) {
                zzuVar.zza(strArr[i2]);
            }
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            sQLiteDatabase2.endTransaction();
            throw th3;
        }
    }

    public final void OooO00o(String str) {
        OooO0O0(new or0(str, 4));
    }

    public final void OooO0O0(bf0 bf0Var) {
        CallableC1736k1 callableC1736k1 = new CallableC1736k1(this, 6);
        C2163vl c2163vl = this.f24005OooO0O0;
        o00000oO.OooOOO oooOOOOooO0O0 = c2163vl.OooO0O0(callableC1736k1);
        oooOOOOooO0O0.addListener(new wp0(0, oooOOOOooO0O0, new wj0(bf0Var, 24)), c2163vl);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
