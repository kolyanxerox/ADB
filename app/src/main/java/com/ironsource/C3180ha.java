package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.ha */
/* loaded from: classes2.dex */
public class C3180ha extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C3145ga f8850a = new C3145ga();

    public C3180ha(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    public static Cursor m9103a(int i) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseM8929a = f8850a.m8929a(new C3180ha(C3551q9.m11517d().m11518a()));
            try {
                Cursor cursorRawQuery = sQLiteDatabaseM8929a.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
                sQLiteDatabaseM8929a.close();
                return cursorRawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseM8929a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: b */
    public static C3360mc m9106b(int i) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM8929a;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseM8929a = f8850a.m8929a(new C3180ha(C3551q9.m11517d().m11518a()));
        } catch (Throwable th) {
            th = th;
        }
        try {
            Cursor cursorRawQuery = sQLiteDatabaseM8929a.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
            int i2 = cursorRawQuery.getInt(0);
            String string = cursorRawQuery.getString(1);
            String string2 = cursorRawQuery.getString(2);
            String string3 = cursorRawQuery.getString(3);
            cursorRawQuery.close();
            C3360mc c3360mc = new C3360mc(i2, string, string2, string3);
            sQLiteDatabaseM8929a.close();
            return c3360mc;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseM8929a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static Cursor m9108c() throws Throwable {
        SQLiteDatabase sQLiteDatabaseM8929a;
        C3180ha c3180ha = new C3180ha(C3551q9.m11517d().m11518a());
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseM8929a = f8850a.m8929a(c3180ha);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Cursor cursorRawQuery = sQLiteDatabaseM8929a.rawQuery("SELECT * FROM REPORTS;", null);
            sQLiteDatabaseM8929a.close();
            return cursorRawQuery;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseM8929a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: a */
    public static void m9104a() {
        SQLiteDatabase sQLiteDatabaseM8930a = null;
        try {
            sQLiteDatabaseM8930a = f8850a.m8930a(true, new C3180ha(C3551q9.m11517d().m11518a()));
            sQLiteDatabaseM8930a.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
            sQLiteDatabaseM8930a.close();
        } catch (Throwable th) {
            if (sQLiteDatabaseM8930a != null) {
                sQLiteDatabaseM8930a.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static List<C3360mc> m9107b() {
        C3180ha c3180ha = new C3180ha(C3551q9.m11517d().m11518a());
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseM8929a = f8850a.m8929a(c3180ha);
            try {
                Cursor cursorRawQuery = sQLiteDatabaseM8929a.rawQuery("SELECT * FROM REPORTS ;", null);
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        arrayList.add(new C3360mc(cursorRawQuery.getInt(0), cursorRawQuery.getString(1), cursorRawQuery.getString(2), cursorRawQuery.getString(3)));
                    } while (cursorRawQuery.moveToNext());
                }
                cursorRawQuery.close();
                sQLiteDatabaseM8929a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseM8929a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static void m9105a(C3360mc c3360mc) {
        SQLiteDatabase sQLiteDatabaseM8930a;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseM8930a = f8850a.m8930a(true, new C3180ha(C3551q9.m11517d().m11518a()));
        } catch (Throwable th) {
            th = th;
        }
        try {
            sQLiteDatabaseM8930a.beginTransaction();
            ContentValues contentValues = new ContentValues();
            String strM10023e = c3360mc.m10023e();
            String strM10020b = c3360mc.m10020b();
            String strM10022d = c3360mc.m10022d();
            contentValues.put("stack_trace", strM10023e);
            contentValues.put("crash_date", strM10020b);
            contentValues.put("crashType", strM10022d);
            sQLiteDatabaseM8930a.insert("REPORTS", null, contentValues);
            sQLiteDatabaseM8930a.setTransactionSuccessful();
            sQLiteDatabaseM8930a.endTransaction();
            sQLiteDatabaseM8930a.close();
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseM8930a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
                sQLiteDatabase.close();
            }
            throw th;
        }
    }
}
