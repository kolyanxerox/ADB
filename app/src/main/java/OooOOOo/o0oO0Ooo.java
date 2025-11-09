package OoooOOO;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* loaded from: classes2.dex */
public final class o0oO0Ooo extends o0O000Oo {

    /* renamed from: OooOoO */
    public static final String[] f14583OooOoO = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* renamed from: OooOo */
    public final o00OO0O0 f14584OooOo;

    /* renamed from: OooOoO0 */
    public boolean f14585OooOoO0;

    public o0oO0Ooo(o0OO0oO0 o0oo0oo0) {
        super(o0oo0oo0);
        this.f14584OooOo = new o00OO0O0(this, ((o0OO0oO0) this.f14574OooOo0O).f14516OooOo0O);
    }

    @Override // OoooOOO.o0O000Oo
    public final boolean OooOOO() {
        return false;
    }

    public final void OooOOOO() {
        int iDelete;
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        OooOO0O();
        try {
            SQLiteDatabase sQLiteDatabaseOooOOo0 = OooOOo0();
            if (sQLiteDatabaseOooOOo0 == null || (iDelete = sQLiteDatabaseOooOOo0.delete("messages", null, null)) <= 0) {
                return;
            }
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14398Oooo0.OooO0OO(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0OO(e, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0074 A[PHI: r5
  0x0074: PHI (r5v3 int) = (r5v1 int), (r5v1 int), (r5v4 int) binds: [B:77:0x006b, B:83:0x0084, B:80:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOOOo() {
        /*
            r11 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r11.OooOO0O()
            boolean r1 = r11.f14585OooOoO0
            r2 = 0
            if (r1 == 0) goto Lc
            goto L9c
        Lc:
            java.lang.Object r1 = r11.f14574OooOo0O
            OoooOOO.o0OO0oO0 r1 = (OoooOOO.o0OO0oO0) r1
            android.content.Context r3 = r1.f14516OooOo0O
            java.lang.String r4 = "google_app_measurement_local.db"
            java.io.File r3 = r3.getDatabasePath(r4)
            boolean r3 = r3.exists()
            if (r3 == 0) goto L9c
            r3 = 5
            r4 = r2
            r5 = r3
        L21:
            if (r4 >= r3) goto L90
            r6 = 1
            r7 = 0
            android.database.sqlite.SQLiteDatabase r7 = r11.OooOOo0()     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31 android.database.sqlite.SQLiteFullException -> L33 android.database.sqlite.SQLiteDatabaseLockedException -> L6c
            if (r7 != 0) goto L35
            r11.f14585OooOoO0 = r6     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31 android.database.sqlite.SQLiteFullException -> L33 android.database.sqlite.SQLiteDatabaseLockedException -> L6c
            goto L9c
        L2f:
            r0 = move-exception
            goto L8a
        L31:
            r8 = move-exception
            goto L52
        L33:
            r8 = move-exception
            goto L78
        L35:
            r7.beginTransaction()     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31 android.database.sqlite.SQLiteFullException -> L33 android.database.sqlite.SQLiteDatabaseLockedException -> L6c
            java.lang.String r8 = "messages"
            java.lang.String r9 = "type == ?"
            r10 = 3
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31 android.database.sqlite.SQLiteFullException -> L33 android.database.sqlite.SQLiteDatabaseLockedException -> L6c
            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31 android.database.sqlite.SQLiteFullException -> L33 android.database.sqlite.SQLiteDatabaseLockedException -> L6c
            r7.delete(r8, r9, r10)     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31 android.database.sqlite.SQLiteFullException -> L33 android.database.sqlite.SQLiteDatabaseLockedException -> L6c
            r7.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31 android.database.sqlite.SQLiteFullException -> L33 android.database.sqlite.SQLiteDatabaseLockedException -> L6c
            r7.endTransaction()     // Catch: java.lang.Throwable -> L2f android.database.sqlite.SQLiteException -> L31 android.database.sqlite.SQLiteFullException -> L33 android.database.sqlite.SQLiteDatabaseLockedException -> L6c
            r7.close()
            return r6
        L52:
            if (r7 == 0) goto L5d
            boolean r9 = r7.inTransaction()     // Catch: java.lang.Throwable -> L2f
            if (r9 == 0) goto L5d
            r7.endTransaction()     // Catch: java.lang.Throwable -> L2f
        L5d:
            OoooOOO.o0O0O0o0 r9 = r1.f14520OooOoOO     // Catch: java.lang.Throwable -> L2f
            OoooOOO.o0OO0oO0.OooOOO0(r9)     // Catch: java.lang.Throwable -> L2f
            OoooOOO.o0O0oo0o r9 = r9.f14393OooOoOO     // Catch: java.lang.Throwable -> L2f
            r9.OooO0OO(r8, r0)     // Catch: java.lang.Throwable -> L2f
            r11.f14585OooOoO0 = r6     // Catch: java.lang.Throwable -> L2f
            if (r7 == 0) goto L87
            goto L74
        L6c:
            long r8 = (long) r5     // Catch: java.lang.Throwable -> L2f
            android.os.SystemClock.sleep(r8)     // Catch: java.lang.Throwable -> L2f
            int r5 = r5 + 20
            if (r7 == 0) goto L87
        L74:
            r7.close()
            goto L87
        L78:
            OoooOOO.o0O0O0o0 r9 = r1.f14520OooOoOO     // Catch: java.lang.Throwable -> L2f
            OoooOOO.o0OO0oO0.OooOOO0(r9)     // Catch: java.lang.Throwable -> L2f
            OoooOOO.o0O0oo0o r9 = r9.f14393OooOoOO     // Catch: java.lang.Throwable -> L2f
            r9.OooO0OO(r8, r0)     // Catch: java.lang.Throwable -> L2f
            r11.f14585OooOoO0 = r6     // Catch: java.lang.Throwable -> L2f
            if (r7 == 0) goto L87
            goto L74
        L87:
            int r4 = r4 + 1
            goto L21
        L8a:
            if (r7 == 0) goto L8f
            r7.close()
        L8f:
            throw r0
        L90:
            OoooOOO.o0O0O0o0 r0 = r1.f14520OooOoOO
            OoooOOO.o0OO0oO0.OooOOO0(r0)
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            OoooOOO.o0O0oo0o r0 = r0.f14396OooOooO
            r0.OooO0O0(r1)
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o0oO0Ooo.OooOOOo():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x00a4 A[Catch: all -> 0x0094, SQLiteDatabaseLockedException -> 0x0097, SQLiteException -> 0x00f2, SQLiteFullException -> 0x00f6, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0094, blocks: (B:155:0x0089, B:157:0x008f, B:164:0x00a4, B:166:0x00ab, B:168:0x00c8, B:170:0x00d3, B:185:0x00fd, B:199:0x0125, B:201:0x012b, B:202:0x012e, B:217:0x015e, B:209:0x0149), top: B:233:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0125 A[Catch: all -> 0x0094, TRY_ENTER, TryCatch #8 {all -> 0x0094, blocks: (B:155:0x0089, B:157:0x008f, B:164:0x00a4, B:166:0x00ab, B:168:0x00c8, B:170:0x00d3, B:185:0x00fd, B:199:0x0125, B:201:0x012b, B:202:0x012e, B:217:0x015e, B:209:0x0149), top: B:233:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0155 A[PHI: r8 r11 r16
  0x0155: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:205:0x0141, B:220:0x0170, B:213:0x0153] A[DONT_GENERATE, DONT_INLINE]
  0x0155: PHI (r11v7 android.database.sqlite.SQLiteDatabase) = 
  (r11v5 android.database.sqlite.SQLiteDatabase)
  (r11v6 android.database.sqlite.SQLiteDatabase)
  (r11v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:205:0x0141, B:220:0x0170, B:213:0x0153] A[DONT_GENERATE, DONT_INLINE]
  0x0155: PHI (r16v7 boolean) = (r16v4 boolean), (r16v5 boolean), (r16v8 boolean) binds: [B:205:0x0141, B:220:0x0170, B:213:0x0153] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0173 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOOo(int r20, byte[] r21) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o0oO0Ooo.OooOOo(int, byte[]):boolean");
    }

    public final SQLiteDatabase OooOOo0() {
        if (this.f14585OooOoO0) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f14584OooOo.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f14585OooOoO0 = true;
        return null;
    }
}
