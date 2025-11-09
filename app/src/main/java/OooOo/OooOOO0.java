package OooOo;

import OooOoO0.oo0o0Oo;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import o000O00.o00O00;
import o000Oooo.o00000O0;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooOOO0 implements OooOOOO, oo0o0Oo, o000Oo00.OooOOO0, Continuation {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f13554OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ long f13555OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f13556OooOo0o;

    public /* synthetic */ OooOOO0(Object obj, long j, Object obj2) {
        this.f13556OooOo0o = obj;
        this.f13555OooOo0O = j;
        this.f13554OooOo = obj2;
    }

    @Override // o000Oo00.OooOOO0
    public void OooO00o(o000Oo00.OooOOO oooOOO) {
        ((o000O000.OooO00o) oooOOO.get()).OooO0Oo((String) this.f13556OooOo0o, this.f13555OooOo0O, (o00O00) this.f13554OooOo);
    }

    @Override // OooOo.OooOOOO, androidx.arch.core.util.Function, OooOOO.OooO0o
    public Object apply(Object obj) throws SQLException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((OooOo00.OooO0OO) this.f13554OooOo).f13588OooOo0O;
        String string = Integer.toString(i);
        String str = (String) this.f13556OooOo0o;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f13555OooOo0O;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // OooOoO0.oo0o0Oo
    public Object execute() {
        OooOo0o.Oooo0 oooo0 = (OooOo0o.Oooo0) this.f13556OooOo0o;
        long jOooO00o = oooo0.f13637OooO0oO.OooO00o() + this.f13555OooOo0O;
        OooOo oooOo = (OooOo) oooo0.f13633OooO0OO;
        OooOOo0.OooOo oooOo2 = (OooOOo0.OooOo) this.f13554OooOo;
        oooOo.getClass();
        oooOo.OooO0OO(new OooOO0O(jOooO00o, oooOo2));
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((o00000O0) this.f13556OooOo0o).OooO0O0(task, this.f13555OooOo0O, (HashMap) this.f13554OooOo);
    }

    public /* synthetic */ OooOOO0(Object obj, Object obj2, long j) {
        this.f13556OooOo0o = obj;
        this.f13554OooOo = obj2;
        this.f13555OooOo0O = j;
    }
}
