package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.fa */
/* loaded from: classes2.dex */
public class C3110fa extends SQLiteOpenHelper implements InterfaceC2971bg {

    /* renamed from: f */
    private static C3110fa f8548f = null;

    /* renamed from: g */
    private static final String f8549g = " TEXT";

    /* renamed from: h */
    private static final String f8550h = " INTEGER";

    /* renamed from: i */
    private static final String f8551i = ",";

    /* renamed from: a */
    private final C3145ga f8552a;

    /* renamed from: b */
    private final int f8553b;

    /* renamed from: c */
    private final int f8554c;

    /* renamed from: d */
    private final String f8555d;

    /* renamed from: e */
    private final String f8556e;

    /* renamed from: com.ironsource.fa$a */
    public static abstract class a implements BaseColumns {

        /* renamed from: a */
        public static final String f8557a = "events";

        /* renamed from: b */
        public static final int f8558b = 4;

        /* renamed from: c */
        public static final String f8559c = "eventid";

        /* renamed from: d */
        public static final String f8560d = "timestamp";

        /* renamed from: e */
        public static final String f8561e = "type";

        /* renamed from: f */
        public static final String f8562f = "data";
    }

    public C3110fa(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f8552a = new C3145ga();
        this.f8553b = 4;
        this.f8554c = CommonGatewayClient.CODE_400;
        this.f8555d = "DROP TABLE IF EXISTS events";
        this.f8556e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    /* renamed from: a */
    private ContentValues m8654a(C3899zb c3899zb, String str) {
        if (c3899zb == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("eventid", Integer.valueOf(c3899zb.m13323c()));
        contentValues.put("timestamp", Long.valueOf(c3899zb.m13324d()));
        contentValues.put("type", str);
        contentValues.put("data", c3899zb.m13318a());
        return contentValues;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[Catch: all -> 0x0018, DONT_GENERATE, PHI: r1
  0x0034: PHI (r1v3 android.database.sqlite.SQLiteDatabase) = (r1v2 android.database.sqlite.SQLiteDatabase), (r1v4 android.database.sqlite.SQLiteDatabase) binds: [B:19:0x0032, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:20:0x0034, B:18:0x002e, B:25:0x003c, B:27:0x0042, B:28:0x0045, B:16:0x001e), top: B:31:0x0001, inners: #1 }] */
    @Override // com.ironsource.InterfaceC2971bg
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void mo7921b(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "type = ?"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L18
            r1 = 1
            android.database.sqlite.SQLiteDatabase r1 = r3.m8655a(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "events"
            r1.delete(r2, r0, r4)     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r1.isOpen()     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L37
            goto L34
        L18:
            r4 = move-exception
            goto L46
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            r4 = move-exception
            r1 = 0
        L1e:
            com.ironsource.q9 r0 = com.ironsource.C3551q9.m11517d()     // Catch: java.lang.Throwable -> L39
            r0.m11519a(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = "IronSource"
            java.lang.String r2 = "Exception while clearing events: "
            android.util.Log.e(r0, r2, r4)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L37
            boolean r4 = r1.isOpen()     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L37
        L34:
            r1.close()     // Catch: java.lang.Throwable -> L18
        L37:
            monitor-exit(r3)
            return
        L39:
            r4 = move-exception
            if (r1 == 0) goto L45
            boolean r0 = r1.isOpen()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L45
            r1.close()     // Catch: java.lang.Throwable -> L18
        L45:
            throw r4     // Catch: java.lang.Throwable -> L18
        L46:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3110fa.mo7921b(java.lang.String):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    /* renamed from: a */
    private synchronized SQLiteDatabase m8655a(boolean z) throws Throwable {
        int i = 0;
        while (true) {
            try {
                if (z) {
                    return this.f8552a.m8930a(true, this);
                }
                return this.f8552a.m8930a(false, this);
            } finally {
            }
        }
    }

    /* renamed from: a */
    public static synchronized C3110fa m8656a(Context context, String str, int i) {
        try {
            if (f8548f == null) {
                f8548f = new C3110fa(context, str, i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8548f;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009d A[Catch: all -> 0x006f, PHI: r3
  0x009d: PHI (r3v2 android.database.sqlite.SQLiteDatabase) = (r3v1 android.database.sqlite.SQLiteDatabase), (r3v3 android.database.sqlite.SQLiteDatabase) binds: [B:41:0x009b, B:30:0x0076] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x006f, blocks: (B:3:0x0001, B:24:0x0065, B:26:0x006b, B:29:0x0072, B:42:0x009d, B:36:0x008c, B:38:0x0092, B:40:0x0097, B:48:0x00a6, B:50:0x00ac, B:52:0x00b1, B:54:0x00b7, B:55:0x00ba, B:34:0x007c), top: B:64:0x0001, inners: #0 }] */
    @Override // com.ironsource.InterfaceC2971bg
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.ArrayList<com.ironsource.C3899zb> mo7919a(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            r0 = 0
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.m8655a(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "type = ?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L5f
            java.lang.String r10 = "timestamp ASC"
            java.lang.String r4 = "events"
            r8 = 0
            r9 = 0
            r5 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5f
            int r12 = r2.getCount()     // Catch: java.lang.Throwable -> L5f
            if (r12 <= 0) goto L65
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L5f
        L26:
            boolean r12 = r2.isAfterLast()     // Catch: java.lang.Throwable -> L5f
            if (r12 != 0) goto L62
            java.lang.String r12 = "eventid"
            int r12 = r2.getColumnIndex(r12)     // Catch: java.lang.Throwable -> L5f
            if (r12 >= 0) goto L35
            goto L26
        L35:
            int r12 = r2.getInt(r12)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "timestamp"
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 >= 0) goto L42
            goto L26
        L42:
            long r4 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "data"
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 >= 0) goto L4f
            goto L26
        L4f:
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L5f
            com.ironsource.zb r6 = new com.ironsource.zb     // Catch: java.lang.Throwable -> L5f
            r6.<init>(r12, r4, r0)     // Catch: java.lang.Throwable -> L5f
            r1.add(r6)     // Catch: java.lang.Throwable -> L5f
            r2.moveToNext()     // Catch: java.lang.Throwable -> L5f
            goto L26
        L5f:
            r0 = move-exception
            r12 = r0
            goto L7c
        L62:
            r2.close()     // Catch: java.lang.Throwable -> L5f
        L65:
            boolean r12 = r2.isClosed()     // Catch: java.lang.Throwable -> L6f
            if (r12 != 0) goto L72
            r2.close()     // Catch: java.lang.Throwable -> L6f
            goto L72
        L6f:
            r0 = move-exception
            r12 = r0
            goto Lbb
        L72:
            boolean r12 = r3.isOpen()     // Catch: java.lang.Throwable -> L6f
            if (r12 == 0) goto La0
            goto L9d
        L79:
            r0 = move-exception
            r12 = r0
            r3 = r2
        L7c:
            com.ironsource.q9 r0 = com.ironsource.C3551q9.m11517d()     // Catch: java.lang.Throwable -> La2
            r0.m11519a(r12)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "IronSource"
            java.lang.String r4 = "Exception while loading events: "
            android.util.Log.e(r0, r4, r12)     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L95
            boolean r12 = r2.isClosed()     // Catch: java.lang.Throwable -> L6f
            if (r12 != 0) goto L95
            r2.close()     // Catch: java.lang.Throwable -> L6f
        L95:
            if (r3 == 0) goto La0
            boolean r12 = r3.isOpen()     // Catch: java.lang.Throwable -> L6f
            if (r12 == 0) goto La0
        L9d:
            r3.close()     // Catch: java.lang.Throwable -> L6f
        La0:
            monitor-exit(r11)
            return r1
        La2:
            r0 = move-exception
            r12 = r0
            if (r2 == 0) goto Laf
            boolean r0 = r2.isClosed()     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto Laf
            r2.close()     // Catch: java.lang.Throwable -> L6f
        Laf:
            if (r3 == 0) goto Lba
            boolean r0 = r3.isOpen()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto Lba
            r3.close()     // Catch: java.lang.Throwable -> L6f
        Lba:
            throw r12     // Catch: java.lang.Throwable -> L6f
        Lbb:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L6f
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3110fa.mo7919a(java.lang.String):java.util.ArrayList");
    }

    @Override // com.ironsource.InterfaceC2971bg
    /* renamed from: a */
    public synchronized void mo7920a(List<C3899zb> list, String str) {
        SQLiteDatabase sQLiteDatabaseM8655a;
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    sQLiteDatabaseM8655a = m8655a(true);
                    try {
                        Iterator<C3899zb> it = list.iterator();
                        while (it.hasNext()) {
                            ContentValues contentValuesM8654a = m8654a(it.next(), str);
                            if (sQLiteDatabaseM8655a != null && contentValuesM8654a != null) {
                                sQLiteDatabaseM8655a.insert("events", null, contentValuesM8654a);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = sQLiteDatabaseM8655a;
                        try {
                            C3551q9.m11517d().m11519a(th);
                            Log.e("IronSource", "Exception while saving events: ", th);
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabaseM8655a = sQLiteDatabase;
                                sQLiteDatabaseM8655a.close();
                            }
                        } catch (Throwable th2) {
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                if (sQLiteDatabaseM8655a != null && sQLiteDatabaseM8655a.isOpen()) {
                    sQLiteDatabaseM8655a.close();
                }
            }
        }
    }
}
