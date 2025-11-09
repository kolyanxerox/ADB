package OooOo;

import OooOoOO.o000;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooOO0O implements OooOOOO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ long f13551OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOo0.OooOo f13552OooOo0o;

    public /* synthetic */ OooOO0O(long j, OooOOo0.OooOo oooOo) {
        this.f13551OooOo0O = j;
        this.f13552OooOo0o = oooOo;
    }

    @Override // OooOo.OooOOOO, androidx.arch.core.util.Function, OooOOO.OooO0o
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f13551OooOo0O));
        OooOOo0.OooOo oooOo = this.f13552OooOo0o;
        OooOOO.OooO0OO oooO0OO = oooOo.f13488OooO0OO;
        String strValueOf = String.valueOf(o000.OooO00o(oooO0OO));
        String str = oooOo.f13486OooO00o;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, strValueOf}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(o000.OooO00o(oooO0OO)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
