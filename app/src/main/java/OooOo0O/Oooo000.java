package OooOo0o;

import OooOo00.OooO0OO;
import OooOoO0.oo0o0Oo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.flutter.plugins.webviewflutter.OooOOOO;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o0000ooO.o0O00oO0;
import o0000ooO.o0O0oo0o;
import o0000ooO.o0oO0O0o;

/* loaded from: classes2.dex */
public final /* synthetic */ class Oooo000 implements oo0o0Oo, o0O0oo0o {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f13639OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13640OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ long f13641OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ Object f13642OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ Object f13643OooOoO0;

    public /* synthetic */ Oooo000(Oooo0 oooo0, Iterable iterable, OooOOo0.OooOo oooOo, long j) {
        this.f13640OooOo0O = 0;
        this.f13639OooOo = oooo0;
        this.f13643OooOoO0 = iterable;
        this.f13642OooOoO = oooOo;
        this.f13641OooOo0o = j;
    }

    @Override // o0000ooO.o0O0oo0o
    public ScheduledFuture OooO00o(final o000Ooo0.OooOO0 oooOO0) {
        switch (this.f13640OooOo0O) {
            case 1:
                o0oO0O0o o0oo0o0o = (o0oO0O0o) this.f13639OooOo;
                return o0oo0o0o.f29727OooOo0o.schedule(new o0O00oO0(o0oo0o0o, (Runnable) this.f13643OooOoO0, oooOO0, 1), this.f13641OooOo0o, (TimeUnit) this.f13642OooOoO);
            default:
                final o0oO0O0o o0oo0o0o2 = (o0oO0O0o) this.f13639OooOo;
                final Callable callable = (Callable) this.f13643OooOoO0;
                return o0oo0o0o2.f29727OooOo0o.schedule(new Callable() { // from class: o0000ooO.o0O0O0O
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        o0oO0O0o o0oo0o0o3 = o0oo0o0o2;
                        return o0oo0o0o3.f29726OooOo0O.submit(new OooOOOO(5, callable, oooOO0));
                    }
                }, this.f13641OooOo0o, (TimeUnit) this.f13642OooOoO);
        }
    }

    @Override // OooOoO0.oo0o0Oo
    public Object execute() {
        Oooo0 oooo0 = (Oooo0) this.f13639OooOo;
        OooOo.OooOo oooOo = (OooOo.OooOo) oooo0.f13633OooO0OO;
        oooOo.getClass();
        Iterable iterable = (Iterable) this.f13643OooOoO0;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + OooOo.OooOo.OooO0oo(iterable);
            SQLiteDatabase sQLiteDatabaseOooO00o = oooOo.OooO00o();
            sQLiteDatabaseOooO00o.beginTransaction();
            try {
                sQLiteDatabaseOooO00o.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseOooO00o.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Cursor cursor = cursorRawQuery;
                    while (cursor.moveToNext()) {
                        oooOo.OooO0o0(cursor.getInt(0), OooO0OO.MAX_RETRIES_REACHED, cursor.getString(1));
                    }
                    cursorRawQuery.close();
                    sQLiteDatabaseOooO00o.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    sQLiteDatabaseOooO00o.setTransactionSuccessful();
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            } finally {
                sQLiteDatabaseOooO00o.endTransaction();
            }
        }
        oooOo.OooO0OO(new OooOo.OooOO0O(oooo0.f13637OooO0oO.OooO00o() + this.f13641OooOo0o, (OooOOo0.OooOo) this.f13642OooOoO));
        return null;
    }

    public /* synthetic */ Oooo000(o0oO0O0o o0oo0o0o, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f13640OooOo0O = i;
        this.f13639OooOo = o0oo0o0o;
        this.f13643OooOoO0 = obj;
        this.f13641OooOo0o = j;
        this.f13642OooOoO = timeUnit;
    }
}
