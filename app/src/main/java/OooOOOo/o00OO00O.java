package OoooOOO;

import Oooo00O.o000000O;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00OO00O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f14145OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f14146OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o00OO0OO f14147OooO0OO;

    public o00OO00O(o00OO0OO o00oo0oo, String str) {
        Objects.requireNonNull(o00oo0oo);
        this.f14147OooO0OO = o00oo0oo;
        o000000O.OooO0o0(str);
        this.f14145OooO00o = str;
        this.f14146OooO0O0 = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public final List OooO00o() {
        ArrayList arrayList;
        o00OO0OO o00oo0oo = this.f14147OooO0OO;
        ArrayList arrayList2 = new ArrayList();
        String strValueOf = String.valueOf(this.f14146OooO0O0);
        String str = this.f14145OooO00o;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = o00oo0oo.OoooOoO().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, strValueOf}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.f14146OooO0O0) {
                            this.f14146OooO0O0 = j;
                        }
                        try {
                            com.google.android.gms.internal.measurement.o0O00O o0o00o = (com.google.android.gms.internal.measurement.o0O00O) oo0OOoo.OoooOOo(com.google.android.gms.internal.measurement.o0O00OO.OooOoO(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            o0o00o.OooO0O0();
                            ((com.google.android.gms.internal.measurement.o0O00OO) o0o00o.f26683OooOo0o).Oooo000(string);
                            long j3 = cursorQuery.getLong(2);
                            o0o00o.OooO0O0();
                            ((com.google.android.gms.internal.measurement.o0O00OO) o0o00o.f26683OooOo0o).Oooo00O(j3);
                            arrayList2.add(new o00OO000(j, j2, z, (com.google.android.gms.internal.measurement.o0O00OO) o0o00o.OooO0o0()));
                        } catch (IOException e) {
                            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) o00oo0oo.f14574OooOo0O).f14520OooOoOO;
                            o0OO0oO0.OooOOO0(o0o0o0o0);
                            o0o0o0o0.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Data loss. Failed to merge raw event. appId", e);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                o0O0O0o0 o0o0o0o02 = ((o0OO0oO0) o00oo0oo.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0o0o02.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Data loss. Error querying raw events batch. appId", e2);
                arrayList = arrayList2;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public o00OO00O(o00OO0OO o00oo0oo, String str, long j) {
        Objects.requireNonNull(o00oo0oo);
        this.f14147OooO0OO = o00oo0oo;
        o000000O.OooO0o0(str);
        this.f14145OooO00o = str;
        this.f14146OooO0O0 = o00oo0oo.o000oOoO("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }
}
