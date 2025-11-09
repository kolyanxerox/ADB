package OooOo;

import OooOOo0.oo000o;
import OooOoO.o000oOoO;
import OooOoO0.o0O0O00;
import OooOoO0.o0OO00O;
import OooOoO0.oo0o0Oo;
import OooOoOO.o000;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import o00O00oO.o0000O0;

/* loaded from: classes2.dex */
public final class OooOo implements OooO0o, o0O0O00, OooO0OO {

    /* renamed from: OooOoOO */
    public static final OooOOO.OooO0O0 f13557OooOoOO = new OooOOO.OooO0O0("proto");

    /* renamed from: OooOo */
    public final o000oOoO f13558OooOo;

    /* renamed from: OooOo0O */
    public final Oooo0 f13559OooOo0O;

    /* renamed from: OooOo0o */
    public final o000oOoO f13560OooOo0o;

    /* renamed from: OooOoO */
    public final o0000O0 f13561OooOoO;

    /* renamed from: OooOoO0 */
    public final OooO00o f13562OooOoO0;

    public OooOo(o000oOoO o000oooo2, o000oOoO o000oooo3, OooO00o oooO00o, Oooo0 oooo0, o0000O0 o0000o02) {
        this.f13559OooOo0O = oooo0;
        this.f13560OooOo0o = o000oooo2;
        this.f13558OooOo = o000oooo3;
        this.f13562OooOoO0 = oooO00o;
        this.f13561OooOoO = o0000o02;
    }

    public static Object OooO(Cursor cursor, OooOOOO oooOOOO) {
        try {
            return oooOOOO.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long OooO0O0(SQLiteDatabase sQLiteDatabase, oo000o oo000oVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        OooOOo0.OooOo oooOo = (OooOOo0.OooOo) oo000oVar;
        ArrayList arrayList = new ArrayList(Arrays.asList(oooOo.f13486OooO00o, String.valueOf(o000.OooO00o(oooOo.f13488OooO0OO))));
        byte[] bArr = oooOo.f13487OooO0O0;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = cursorQuery;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String OooO0oo(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((OooO0O0) it.next()).f13545OooO00o);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final SQLiteDatabase OooO00o() {
        Oooo0 oooo0 = this.f13559OooOo0O;
        Objects.requireNonNull(oooo0);
        o000oOoO o000oooo2 = this.f13558OooOo;
        long jOooO00o = o000oooo2.OooO00o();
        while (true) {
            try {
                return oooo0.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (o000oooo2.OooO00o() >= this.f13562OooOoO0.f13542OooO0OO + jOooO00o) {
                    throw new o0OO00O("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object OooO0OO(OooOOOO oooOOOO) {
        SQLiteDatabase sQLiteDatabaseOooO00o = OooO00o();
        sQLiteDatabaseOooO00o.beginTransaction();
        try {
            Object objApply = oooOOOO.apply(sQLiteDatabaseOooO00o);
            sQLiteDatabaseOooO00o.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseOooO00o.endTransaction();
        }
    }

    public final ArrayList OooO0Oo(SQLiteDatabase sQLiteDatabase, OooOOo0.OooOo oooOo, int i) {
        ArrayList arrayList = new ArrayList();
        Long lOooO0O0 = OooO0O0(sQLiteDatabase, oooOo);
        if (lOooO0O0 == null) {
            return arrayList;
        }
        OooO(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lOooO0O0.toString()}, null, null, null, String.valueOf(i)), new OooO(this, arrayList, oooOo, 1));
        return arrayList;
    }

    public final Object OooO0o(oo0o0Oo oo0o0oo) {
        SQLiteDatabase sQLiteDatabaseOooO00o = OooO00o();
        o000oOoO o000oooo2 = this.f13558OooOo;
        long jOooO00o = o000oooo2.OooO00o();
        while (true) {
            try {
                sQLiteDatabaseOooO00o.beginTransaction();
                try {
                    Object objExecute = oo0o0oo.execute();
                    sQLiteDatabaseOooO00o.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseOooO00o.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (o000oooo2.OooO00o() >= this.f13562OooOoO0.f13542OooO0OO + jOooO00o) {
                    throw new o0OO00O("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final void OooO0o0(long j, OooOo00.OooO0OO oooO0OO, String str) {
        OooO0OO(new OooOOO0(str, oooO0OO, j));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13559OooOo0O.close();
    }
}
