package OooOo;

import OooOOo0.o000oOoO;
import OooOoO0.oo0o0Oo;
import OooOoOO.o000;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.applovin.impl.AbstractActivityC1149p;
import com.applovin.impl.AbstractActivityC1165q;
import com.applovin.impl.AbstractViewOnClickListenerC1152p2;
import com.applovin.impl.C1053i2;
import com.applovin.impl.C1059i8;
import com.applovin.impl.C1130n;
import com.applovin.impl.C1143o2;
import com.applovin.impl.C1170q4;
import com.applovin.impl.privacy.cmp.C1164a;
import com.applovin.impl.sdk.C1220k;
import com.applovin.sdk.AppLovinPostbackListener;
import com.google.android.gms.internal.ads.C2051sk;
import com.google.android.gms.internal.measurement.o0OO00OO;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o000OooO.o00O0O;
import o000OooO.o00Oo0;
import o000OooO.o00Ooo;
import o000OooO.o0OoOo0;
import o000Oooo.o0000;
import o000Oooo.o000000;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO implements OooOOOO, oo0o0Oo, C1170q4.b, AbstractViewOnClickListenerC1152p2.a, ConsentInformation.OnConsentInfoUpdateSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener, Continuation, OnSuccessListener {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f13535OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13536OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f13537OooOo0o;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ Object f13538OooOoO0;

    public /* synthetic */ OooO(OooOo0O.OooO0OO oooO0OO, OooOOo0.OooOo oooOo, OooOOo0.OooOo00 oooOo00) {
        this.f13536OooOo0O = 3;
        this.f13537OooOo0o = oooO0OO;
        this.f13535OooOo = oooOo;
        this.f13538OooOoO0 = oooOo00;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2.a
    /* renamed from: a */
    public void mo2a(C1053i2 c1053i2, C1143o2 c1143o2) {
        switch (this.f13536OooOo0O) {
            case 5:
                ((AbstractActivityC1149p) this.f13537OooOo0o).m2035a((C1220k) this.f13538OooOoO0, (C1130n) this.f13535OooOo, c1053i2, c1143o2);
                break;
            default:
                ((AbstractActivityC1165q) this.f13537OooOo0o).m2122a((List) this.f13538OooOoO0, (C1220k) this.f13535OooOo, c1053i2, c1143o2);
                break;
        }
    }

    @Override // OooOo.OooOOOO, androidx.arch.core.util.Function, OooOOO.OooO0o
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        int i;
        OooOo00.OooO0OO oooO0OO;
        OooOo00.OooO0OO oooO0OO2;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        OooOo00.OooO0OO oooO0OO3 = OooOo00.OooO0OO.CACHE_FULL;
        int i5 = 2;
        Object obj2 = this.f13535OooOo;
        int i6 = 0;
        Object obj3 = this.f13538OooOoO0;
        Object obj4 = this.f13537OooOo0o;
        int i7 = 1;
        switch (this.f13536OooOo0O) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                OooOo oooOo = (OooOo) obj4;
                long jSimpleQueryForLong = oooOo.OooO00o().compileStatement("PRAGMA page_size").simpleQueryForLong() * oooOo.OooO00o().compileStatement("PRAGMA page_count").simpleQueryForLong();
                OooO00o oooO00o = oooOo.f13562OooOoO0;
                long j = oooO00o.f13540OooO00o;
                OooOOo0.OooOo00 oooOo00 = (OooOOo0.OooOo00) obj3;
                String str = oooOo00.f13490OooO00o;
                if (jSimpleQueryForLong >= j) {
                    oooOo.OooO0o0(1L, oooO0OO3, str);
                    return -1L;
                }
                OooOOo0.OooOo oooOo2 = (OooOOo0.OooOo) obj2;
                Long lOooO0O0 = OooOo.OooO0O0(sQLiteDatabase, oooOo2);
                if (lOooO0O0 != null) {
                    jInsert = lOooO0O0.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", oooOo2.f13486OooO00o);
                    contentValues.put("priority", Integer.valueOf(o000.OooO00o(oooOo2.f13488OooO0OO)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = oooOo2.f13487OooO0O0;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                o000oOoO o000oooo2 = oooOo00.f13492OooO0OO;
                byte[] bArr2 = o000oooo2.f13507OooO0O0;
                int length = bArr2.length;
                int i8 = oooO00o.f13544OooO0o0;
                boolean z = length <= i8;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(oooOo00.f13493OooO0Oo));
                contentValues2.put("uptime_ms", Long.valueOf(oooOo00.f13495OooO0o0));
                contentValues2.put("payload_encoding", o000oooo2.f13506OooO00o.f13315OooO00o);
                contentValues2.put("code", oooOo00.f13491OooO0O0);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", oooOo00.f13496OooO0oO);
                contentValues2.put("pseudonymous_id", oooOo00.f13497OooO0oo);
                contentValues2.put("experiment_ids_clear_blob", oooOo00.f13489OooO);
                contentValues2.put("experiment_ids_encrypted_blob", oooOo00.f13498OooOO0);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(bArr2.length / i8);
                    for (int i9 = 1; i9 <= iCeil; i9++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i9 - 1) * i8, Math.min(i9 * i8, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i9));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(oooOo00.f13494OooO0o).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 1:
                Cursor cursor2 = (Cursor) obj;
                OooOo oooOo3 = (OooOo) obj4;
                oooOo3.getClass();
                while (cursor2.moveToNext()) {
                    long j2 = cursor2.getLong(0);
                    int i10 = cursor2.getInt(7) != 0 ? i7 : 0;
                    OooOOo0.OooOOOO oooOOOO = new OooOOo0.OooOOOO();
                    oooOOOO.f13481OooO0o = new HashMap();
                    String string = cursor2.getString(i7);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    oooOOOO.f13477OooO00o = string;
                    oooOOOO.f13480OooO0Oo = Long.valueOf(cursor2.getLong(i5));
                    oooOOOO.f13482OooO0o0 = Long.valueOf(cursor2.getLong(3));
                    if (i10 != 0) {
                        String string2 = cursor2.getString(4);
                        oooOOOO.f13479OooO0OO = new o000oOoO(string2 == null ? OooOo.f13557OooOoOO : new OooOOO.OooO0O0(string2), cursor2.getBlob(5));
                        i = i7;
                    } else {
                        String string3 = cursor2.getString(4);
                        OooOOO.OooO0O0 oooO0O0 = string3 == null ? OooOo.f13557OooOoOO : new OooOOO.OooO0O0(string3);
                        Cursor cursorQuery = oooOo3.OooO00o().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num");
                        try {
                            Cursor cursor3 = cursorQuery;
                            ArrayList arrayList = new ArrayList();
                            int length2 = 0;
                            while (cursor3.moveToNext()) {
                                byte[] blob = cursor3.getBlob(0);
                                arrayList.add(blob);
                                length2 += blob.length;
                                i7 = i7;
                            }
                            i = i7;
                            byte[] bArr3 = new byte[length2];
                            int i11 = 0;
                            int length3 = 0;
                            while (i11 < arrayList.size()) {
                                byte[] bArr4 = (byte[]) arrayList.get(i11);
                                cursor = cursorQuery;
                                try {
                                    int i12 = i11;
                                    System.arraycopy(bArr4, 0, bArr3, length3, bArr4.length);
                                    length3 += bArr4.length;
                                    i11 = i12 + 1;
                                    cursorQuery = cursor;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            oooOOOO.f13479OooO0OO = new o000oOoO(oooO0O0, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        oooOOOO.f13478OooO0O0 = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        oooOOOO.f13483OooO0oO = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        oooOOOO.f13484OooO0oo = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        oooOOOO.f13476OooO = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        oooOOOO.f13485OooOO0 = cursor2.getBlob(11);
                    }
                    ((ArrayList) obj3).add(new OooO0O0(j2, (OooOOo0.OooOo) obj2, oooOOOO.OooO0O0()));
                    i7 = i;
                    i5 = 2;
                }
                return null;
            default:
                Cursor cursor4 = (Cursor) obj;
                OooOo oooOo4 = (OooOo) obj4;
                oooOo4.getClass();
                while (true) {
                    HashMap map = (HashMap) obj3;
                    if (cursor4.moveToNext()) {
                        String string4 = cursor4.getString(i6);
                        int i13 = cursor4.getInt(1);
                        OooOo00.OooO0OO oooO0OO4 = OooOo00.OooO0OO.REASON_UNKNOWN;
                        if (i13 != 0) {
                            if (i13 == 1) {
                                oooO0OO4 = OooOo00.OooO0OO.MESSAGE_TOO_OLD;
                            } else if (i13 == 2) {
                                oooO0OO = oooO0OO3;
                                oooO0OO2 = oooO0OO;
                            } else if (i13 == i4) {
                                oooO0OO4 = OooOo00.OooO0OO.PAYLOAD_TOO_BIG;
                            } else if (i13 == i3) {
                                oooO0OO4 = OooOo00.OooO0OO.MAX_RETRIES_REACHED;
                            } else if (i13 == i2) {
                                oooO0OO4 = OooOo00.OooO0OO.INVALID_PAYLOD;
                            } else if (i13 == 6) {
                                oooO0OO4 = OooOo00.OooO0OO.SERVER_ERROR;
                            } else {
                                o0OO00OO.OooO0oo("SQLiteEventStore", Integer.valueOf(i13), "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                            }
                            oooO0OO2 = oooO0OO3;
                            oooO0OO = oooO0OO4;
                        } else {
                            oooO0OO2 = oooO0OO3;
                            oooO0OO = oooO0OO4;
                        }
                        long j3 = cursor4.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new OooOo00.OooO0o(j3, oooO0OO));
                        oooO0OO3 = oooO0OO2;
                        i2 = 5;
                        i3 = 4;
                        i4 = 3;
                        i6 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            C2051sk c2051sk = (C2051sk) obj2;
                            if (!it.hasNext()) {
                                final long jOooO00o = oooOo4.f13560OooOo0o.OooO00o();
                                c2051sk.f24098OooOo0o = (OooOo00.OooOO0O) oooOo4.OooO0OO(new OooOOOO() { // from class: OooOo.OooOOO
                                    @Override // OooOo.OooOOOO, androidx.arch.core.util.Function, OooOOO.OooO0o
                                    public final Object apply(Object obj5) {
                                        Cursor cursorRawQuery = ((SQLiteDatabase) obj5).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                        long j4 = jOooO00o;
                                        try {
                                            Cursor cursor5 = cursorRawQuery;
                                            cursor5.moveToNext();
                                            return new OooOo00.OooOO0O(cursor5.getLong(0), j4);
                                        } finally {
                                            cursorRawQuery.close();
                                        }
                                    }
                                });
                                c2051sk.f24100OooOoO0 = new OooOo00.OooO0O0(new OooOo00.OooOO0(oooOo4.OooO00o().compileStatement("PRAGMA page_size").simpleQueryForLong() * oooOo4.OooO00o().compileStatement("PRAGMA page_count").simpleQueryForLong(), OooO00o.f13539OooO0o.f13540OooO00o));
                                c2051sk.f24099OooOoO = (String) oooOo4.f13561OooOoO.get();
                                return new OooOo00.OooO00o((OooOo00.OooOO0O) c2051sk.f24098OooOo0o, Collections.unmodifiableList((ArrayList) c2051sk.f24096OooOo), (OooOo00.OooO0O0) c2051sk.f24100OooOoO0, (String) c2051sk.f24099OooOoO);
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i14 = OooOo00.OooO.f13571OooO0OO;
                            new ArrayList();
                            ((ArrayList) c2051sk.f24096OooOo).add(new OooOo00.OooO((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
        }
    }

    @Override // OooOoO0.oo0o0Oo
    public Object execute() {
        OooOo0O.OooO0OO oooO0OO = (OooOo0O.OooO0OO) this.f13537OooOo0o;
        OooOo oooOo = (OooOo) oooO0OO.f13604OooO0Oo;
        oooOo.getClass();
        OooOOo0.OooOo oooOo2 = (OooOOo0.OooOo) this.f13535OooOo;
        OooOOo0.OooOo00 oooOo00 = (OooOOo0.OooOo00) this.f13538OooOoO0;
        String strOooOo0O = o0OO00OO.OooOo0O("SQLiteEventStore");
        if (Log.isLoggable(strOooOo0O, 3)) {
            Log.d(strOooOo0O, "Storing event with priority=" + oooOo2.f13488OooO0OO + ", name=" + oooOo00.f13490OooO00o + " for destination " + oooOo2.f13486OooO00o);
        }
        ((Long) oooOo.OooO0OO(new OooO(oooOo, oooOo00, oooOo2, 0))).longValue();
        oooO0OO.f13601OooO00o.OooO00o(oooOo2, 1, false);
        return null;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        ((C1164a) this.f13537OooOo0o).m2104a((C1164a.a) this.f13538OooOoO0, (FormError) this.f13535OooOo, formError);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    public void onConsentInfoUpdateSuccess() {
        ((C1164a) this.f13537OooOo0o).m2099a((Activity) this.f13538OooOoO0, (C1164a.a) this.f13535OooOo);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Task task = (Task) this.f13538OooOoO0;
        o000O000.OooO0O0 oooO0O0 = (o000O000.OooO0O0) this.f13535OooOo;
        C2051sk c2051sk = (C2051sk) this.f13537OooOo0o;
        try {
            o000000 o000000Var = (o000000) task.getResult();
            if (o000000Var != null) {
                ((Executor) c2051sk.f24100OooOoO0).execute(new o000o000.OooO0o(oooO0O0, ((o000Oo0O.OooOo00) c2051sk.f24096OooOo).OooO0o0(o000000Var), 1));
            }
        } catch (o00Ooo e) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        o000000 o000000Var;
        URL url;
        switch (this.f13536OooOo0O) {
            case 9:
                boolean zIsSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f13537OooOo0o;
                if (zIsSuccessful) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                } else if (((AtomicBoolean) this.f13538OooOoO0).getAndSet(true)) {
                    ((CancellationTokenSource) this.f13535OooOo).cancel();
                }
                return Tasks.forResult(null);
            case 10:
                o00O0O o00o0o = (o00O0O) this.f13537OooOo0o;
                o00o0o.getClass();
                Task task2 = (Task) this.f13538OooOoO0;
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                o000000 o000000Var2 = (o000000) task2.getResult();
                Task task3 = (Task) this.f13535OooOo;
                return (task3.isSuccessful() && (o000000Var = (o000000) task3.getResult()) != null && o000000Var2.f30595OooO0OO.equals(o000000Var.f30595OooO0OO)) ? Tasks.forResult(Boolean.FALSE) : o00o0o.f30548OooO0Oo.OooO0Oo(o000000Var2).continueWith(o00o0o.f30546OooO0O0, new o0OoOo0(o00o0o));
            default:
                o0000 o0000Var = (o0000) this.f13537OooOo0o;
                o0000Var.getClass();
                Task task4 = (Task) this.f13538OooOoO0;
                if (!task4.isSuccessful()) {
                    return Tasks.forException(new o00Oo0("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException()));
                }
                Task task5 = (Task) this.f13535OooOo;
                try {
                    if (!task5.isSuccessful()) {
                        return Tasks.forException(new o00Oo0("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException()));
                    }
                    try {
                        url = new URL(o0000Var.OooO0OO(o0000Var.f30583OooOOO));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    o0000Var.OooO(httpURLConnection, (String) task5.getResult(), ((o000Oo0O.OooOOOO) task4.getResult()).f30365OooO00o);
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e) {
                    return Tasks.forException(new o00Oo0("Failed to open HTTP stream connection", e));
                }
        }
    }

    public /* synthetic */ OooO(Object obj, Object obj2, Object obj3, int i) {
        this.f13536OooOo0O = i;
        this.f13537OooOo0o = obj;
        this.f13538OooOoO0 = obj2;
        this.f13535OooOo = obj3;
    }

    @Override // com.applovin.impl.C1170q4.b
    /* renamed from: a */
    public void mo3a(boolean z, Object obj, Object obj2) {
        ((C1059i8) this.f13537OooOo0o).m1010a((AppLovinPostbackListener) this.f13538OooOoO0, (String) this.f13535OooOo, z, (String) obj, (String) obj2);
    }
}
