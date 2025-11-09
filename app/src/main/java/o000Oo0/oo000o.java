package o000oo0;

import Oooo0o0.OooO;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import com.ironsource.C3034d9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.parser.external.OooO00o;

/* loaded from: classes2.dex */
public final class oo000o {

    /* renamed from: OooOOO, reason: collision with root package name */
    public static Boolean f31061OooOOO;

    /* renamed from: OooO, reason: collision with root package name */
    public SQLiteDatabase f31062OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f31063OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f31064OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f31065OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f31066OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Context f31068OooO0o0;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public o0OOO0o f31070OooO0oo;
    public Integer OooOO0o;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f31067OooO0o = new ArrayList();

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap f31069OooO0oO = new HashMap();

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f31071OooOO0 = 0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int f31072OooOO0O = 0;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public int f31073OooOOO0 = 0;

    public oo000o(Context context, String str, int i, int i2, boolean z) {
        this.f31068OooO0o0 = context;
        this.f31064OooO0O0 = str;
        this.f31063OooO00o = z;
        this.f31065OooO0OO = i;
        this.f31066OooO0Oo = i2;
    }

    public static boolean OooO00o(Context context) {
        String packageName;
        try {
            packageName = context.getPackageName();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(packageName, 128)).metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false);
    }

    public static HashMap OooO0Oo(Cursor cursor, Integer num) {
        HashMap map = null;
        ArrayList arrayList = null;
        int columnCount = 0;
        while (cursor.moveToNext()) {
            if (map == null) {
                arrayList = new ArrayList();
                map = new HashMap();
                columnCount = cursor.getColumnCount();
                map.put("columns", Arrays.asList(cursor.getColumnNames()));
                map.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(columnCount);
            for (int i = 0; i < columnCount; i++) {
                int type = cursor.getType(i);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i) : cursor.getString(i) : Double.valueOf(cursor.getDouble(i)) : Long.valueOf(cursor.getLong(i)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    public final String OooO() {
        StringBuilder sb = new StringBuilder(C3034d9.i.f8177d);
        Thread threadCurrentThread = Thread.currentThread();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31065OooO0OO);
        sb2.append(",");
        sb2.append(threadCurrentThread.getName());
        sb2.append("(");
        sb2.append(Build.VERSION.SDK_INT >= 36 ? threadCurrentThread.threadId() : threadCurrentThread.getId());
        sb2.append(")");
        sb.append(sb2.toString());
        sb.append("] ");
        return sb.toString();
    }

    public final void OooO0O0() {
        HashMap map = this.f31069OooO0oO;
        if (!map.isEmpty() && this.f31066OooO0Oo >= 1) {
            Log.d("Sqflite", OooO() + map.size() + " cursor(s) are left opened");
        }
        this.f31062OooO.close();
    }

    public final void OooO0OO(o0Oo0oo o0oo0oo) {
        try {
            int i = o0oo0oo.f31051OooO00o;
            if (o0OoOo0.OooO00o(this.f31066OooO0Oo)) {
                Log.d("Sqflite", OooO() + "closing cursor " + i);
            }
            this.f31069OooO0oO.remove(Integer.valueOf(i));
            o0oo0oo.f31053OooO0OO.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o000oo0.o000000O] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [Oooo0o0.OooO] */
    public final boolean OooO0o(OooO oooO) throws Throwable {
        Integer num = (Integer) oooO.OooOO0("cursorPageSize");
        String str = (String) oooO.OooOO0("sql");
        final ?? o000000o2 = new o000000O(str, (List) oooO.OooOO0("arguments"));
        if (this.f31066OooO0Oo >= 1) {
            Log.d("Sqflite", OooO() + o000000o2);
        }
        o0Oo0oo o0oo0oo = null;
        try {
            try {
                o000000o2 = this.f31062OooO.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: o000oo0.o00Oo0
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str2, SQLiteQuery sQLiteQuery) {
                        List list = o000000o2.f31033OooO0O0;
                        if (list != null) {
                            int size = list.size();
                            int i = 0;
                            while (i < size) {
                                Object objOooO00o = o000000O.OooO00o(list.get(i));
                                int i2 = i + 1;
                                if (objOooO00o == null) {
                                    sQLiteQuery.bindNull(i2);
                                } else if (objOooO00o instanceof byte[]) {
                                    sQLiteQuery.bindBlob(i2, (byte[]) objOooO00o);
                                } else if (objOooO00o instanceof Double) {
                                    sQLiteQuery.bindDouble(i2, ((Double) objOooO00o).doubleValue());
                                } else if (objOooO00o instanceof Integer) {
                                    sQLiteQuery.bindLong(i2, ((Integer) objOooO00o).intValue());
                                } else if (objOooO00o instanceof Long) {
                                    sQLiteQuery.bindLong(i2, ((Long) objOooO00o).longValue());
                                } else if (objOooO00o instanceof String) {
                                    sQLiteQuery.bindString(i2, (String) objOooO00o);
                                } else {
                                    if (!(objOooO00o instanceof Boolean)) {
                                        throw new IllegalArgumentException("Could not bind " + objOooO00o + " from index " + i + ": Supported types are null, byte[], double, long, boolean and String");
                                    }
                                    sQLiteQuery.bindLong(i2, ((Boolean) objOooO00o).booleanValue() ? 1L : 0L);
                                }
                                i = i2;
                            }
                        }
                        return new SQLiteCursor(sQLiteCursorDriver, str2, sQLiteQuery);
                    }
                }, str, o0OoOo0.f31054OooO00o, null);
                try {
                    HashMap mapOooO0Oo = OooO0Oo(o000000o2, num);
                    if (num != null && !o000000o2.isLast() && !o000000o2.isAfterLast()) {
                        int i = this.f31073OooOOO0 + 1;
                        this.f31073OooOOO0 = i;
                        mapOooO0Oo.put("cursorId", Integer.valueOf(i));
                        o0Oo0oo o0oo0oo2 = new o0Oo0oo(i, num.intValue(), o000000o2);
                        try {
                            this.f31069OooO0oO.put(Integer.valueOf(i), o0oo0oo2);
                            o0oo0oo = o0oo0oo2;
                        } catch (Exception e) {
                            e = e;
                            o0oo0oo = o0oo0oo2;
                            OooOO0(e, oooO);
                            if (o0oo0oo != null) {
                                OooO0OO(o0oo0oo);
                            }
                            if (o0oo0oo != null || o000000o2 == 0) {
                                return false;
                            }
                            o000000o2.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            o0oo0oo = o0oo0oo2;
                            if (o0oo0oo == null && o000000o2 != 0) {
                                o000000o2.close();
                            }
                            throw th;
                        }
                    }
                    oooO.OooO00o(mapOooO0Oo);
                    if (o0oo0oo == null) {
                        o000000o2.close();
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                o000000o2 = 0;
            } catch (Throwable th2) {
                th = th2;
                o000000o2 = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0o0(Oooo0o0.OooO r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r10.OooO0oo(r11)
            r1 = 0
            if (r0 != 0) goto L9
            goto Lc3
        L9:
            boolean r0 = r11.OooOO0o()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L15
            r11.OooO00o(r2)
            return r3
        L15:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r10.f31062OooO     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lb7
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lb7
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L94
            int r5 = r0.getCount()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            if (r5 <= 0) goto L94
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            if (r5 == 0) goto L94
            int r5 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            int r6 = r10.f31066OooO0Oo
            if (r5 != 0) goto L68
            if (r6 < r3) goto L61
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r5.<init>()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r6 = r10.OooO()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            long r6 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            android.util.Log.d(r4, r5)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            goto L61
        L5c:
            r11 = move-exception
            r2 = r0
            goto Lc4
        L5f:
            r2 = move-exception
            goto Lbb
        L61:
            r11.OooO00o(r2)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r0.close()
            return r3
        L68:
            long r7 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            if (r6 < r3) goto L89
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r2.<init>()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r5 = r10.OooO()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r2.append(r5)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r5 = "inserted "
            r2.append(r5)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r2.append(r7)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            android.util.Log.d(r4, r2)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
        L89:
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r11.OooO00o(r2)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r0.close()
            return r3
        L94:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r5.<init>()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r6 = r10.OooO()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            android.util.Log.e(r4, r5)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r11.OooO00o(r2)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            if (r0 == 0) goto Lb4
            r0.close()
        Lb4:
            return r3
        Lb5:
            r11 = move-exception
            goto Lc4
        Lb7:
            r0 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
        Lbb:
            r10.OooOO0(r2, r11)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto Lc3
            r0.close()
        Lc3:
            return r1
        Lc4:
            if (r2 == 0) goto Lc9
            r2.close()
        Lc9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o000oo0.oo000o.OooO0o0(Oooo0o0.OooO):boolean");
    }

    public final boolean OooO0oO(OooO oooO) throws Throwable {
        if (OooO0oo(oooO)) {
            Cursor cursor = null;
            try {
                if (oooO.OooOO0o()) {
                    oooO.OooO00o(null);
                    return true;
                }
                try {
                    Cursor cursorRawQuery = this.f31062OooO.rawQuery("SELECT changes()", null);
                    if (cursorRawQuery != null) {
                        try {
                            if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                                int i = cursorRawQuery.getInt(0);
                                if (this.f31066OooO0Oo >= 1) {
                                    Log.d("Sqflite", OooO() + "changed " + i);
                                }
                                oooO.OooO00o(Integer.valueOf(i));
                                cursorRawQuery.close();
                                return true;
                            }
                        } catch (Exception e) {
                            e = e;
                            cursor = cursorRawQuery;
                            OooOO0(e, oooO);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    Log.e("Sqflite", OooO() + "fail to read changes for Update/Delete");
                    oooO.OooO00o(null);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    public final boolean OooO0oo(OooO oooO) throws SQLException {
        String str = (String) oooO.OooOO0("sql");
        o000000O o000000o2 = new o000000O(str, (List) oooO.OooOO0("arguments"));
        if (this.f31066OooO0Oo >= 1) {
            Log.d("Sqflite", OooO() + o000000o2);
        }
        Object objOooOO0 = oooO.OooOO0("inTransaction");
        Boolean bool = objOooOO0 instanceof Boolean ? (Boolean) objOooOO0 : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f31062OooO;
            ArrayList arrayList = new ArrayList();
            List list = o000000o2.f31033OooO0O0;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(o000000O.OooO00o(it.next()));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                try {
                    if (Boolean.TRUE.equals(bool)) {
                        this.f31071OooOO0++;
                    } else if (Boolean.FALSE.equals(bool)) {
                        this.f31071OooOO0--;
                    }
                } finally {
                }
            }
            return true;
        } catch (Exception e) {
            OooOO0(e, oooO);
            return false;
        }
    }

    public final void OooOO0(Exception exc, OooO oooO) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            oooO.OooO0o0("open_failed " + this.f31064OooO0O0, null);
            return;
        }
        if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) oooO.OooOO0("sql");
            Collection arrayList = (List) oooO.OooOO0("arguments");
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            HashMap map = new HashMap();
            map.put("sql", str);
            map.put("arguments", arrayList);
            oooO.OooO0o0(message, map);
            return;
        }
        String message2 = exc.getMessage();
        String str2 = (String) oooO.OooOO0("sql");
        Collection arrayList2 = (List) oooO.OooOO0("arguments");
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        HashMap map2 = new HashMap();
        map2.put("sql", str2);
        map2.put("arguments", arrayList2);
        oooO.OooO0o0(message2, map2);
    }

    public final synchronized boolean OooOO0O() {
        return this.f31071OooOO0 > 0;
    }

    public final void OooOO0o() {
        if (f31061OooOOO == null) {
            boolean zOooO00o = OooO00o(this.f31068OooO0o0);
            f31061OooOOO = Boolean.valueOf(zOooO00o);
            if (zOooO00o && o0OoOo0.OooO00o(this.f31066OooO0Oo)) {
                Log.d("Sqflite", OooO() + "[sqflite] WAL enabled");
            }
        }
        this.f31062OooO = SQLiteDatabase.openDatabase(this.f31064OooO0O0, null, f31061OooOOO.booleanValue() ? 805306368 : 268435456);
    }

    public final void OooOOO0(o000oo0O.oo0o0Oo oo0o0oo, Runnable runnable) {
        Integer num = (Integer) oo0o0oo.OooOO0("transactionId");
        Integer num2 = this.OooOO0o;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f31067OooO0o;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new o000oo0O.o000OOo(runnable));
            return;
        }
        runnable.run();
        if (this.OooOO0o != null || arrayList.isEmpty()) {
            return;
        }
        this.f31070OooO0oo.OooO00o(this, new OooO00o(this, 1));
    }
}
