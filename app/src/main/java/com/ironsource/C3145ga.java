package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.ironsource.ga */
/* loaded from: classes2.dex */
public final class C3145ga {

    /* renamed from: a */
    public static final a f8714a = new a(null);

    /* renamed from: b */
    private static final Object f8715b = new Object();

    /* renamed from: com.ironsource.ga$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: a */
    public final SQLiteDatabase m8929a(SQLiteOpenHelper sqliteOpenHelper) {
        kotlin.jvm.internal.OooOo.OooO0o0(sqliteOpenHelper, "sqliteOpenHelper");
        return m8928a(this, false, sqliteOpenHelper, 1, null);
    }

    /* renamed from: a */
    public static /* synthetic */ SQLiteDatabase m8928a(C3145ga c3145ga, boolean z, SQLiteOpenHelper sQLiteOpenHelper, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c3145ga.m8930a(z, sQLiteOpenHelper);
    }

    /* renamed from: a */
    public final SQLiteDatabase m8930a(boolean z, SQLiteOpenHelper sqliteOpenHelper) {
        SQLiteDatabase writableDatabase;
        kotlin.jvm.internal.OooOo.OooO0o0(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (f8715b) {
            try {
                writableDatabase = z ? sqliteOpenHelper.getWritableDatabase() : sqliteOpenHelper.getReadableDatabase();
            } catch (Throwable th) {
                throw th;
            }
        }
        return writableDatabase;
    }
}
