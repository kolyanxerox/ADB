package OoooOOO;

import OooO0oO.OooOo;
import Oooo00O.o000000O;
import Oooo0OO.oo000o;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.OooO00o;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.internal.measurement.Oo0000;
import com.ironsource.C3034d9;
import com.ironsource.C3037dc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o00OO0OO extends oO0Oo0o0 {

    /* renamed from: OooOoO */
    public final o0O0O0O f14161OooOoO;

    /* renamed from: OooOoO0 */
    public final o00OO0O0 f14162OooOoO0;

    /* renamed from: OooOoOO */
    public static final String[] f14150OooOoOO = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: OooOoo0 */
    public static final String[] f14152OooOoo0 = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: OooOoo */
    public static final String[] f14151OooOoo = {C3037dc.f8261p, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: OooOooO */
    public static final String[] f14153OooOooO = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* renamed from: OooOooo */
    public static final String[] f14154OooOooo = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: Oooo000 */
    public static final String[] f14156Oooo000 = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: Oooo00O */
    public static final String[] f14157Oooo00O = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: Oooo00o */
    public static final String[] f14158Oooo00o = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: Oooo0 */
    public static final String[] f14155Oooo0 = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: Oooo0O0 */
    public static final String[] f14159Oooo0O0 = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: Oooo0OO */
    public static final String[] f14160Oooo0OO = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public o00OO0OO(oOO0000 ooo0000) {
        super(ooo0000);
        this.f14161OooOoO = new o0O0O0O(((o0OO0oO0) this.f14574OooOo0O).f14527Oooo000);
        ((o0OO0oO0) this.f14574OooOo0O).getClass();
        this.f14162OooOoO0 = new o00OO0O0(this, ((o0OO0oO0) this.f14574OooOo0O).f14516OooOo0O);
    }

    public static final String Oooo0oO(List list) {
        return list.isEmpty() ? "" : OooOo.OooOO0O(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void OoooO(ContentValues contentValues, Object obj) {
        o000000O.OooO0o0("value");
        o000000O.OooO0oo(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final long OooOOOO(String str, com.google.android.gms.internal.measurement.o0oO0O0o o0oo0o0o, String str2, Map map, oO00OOOo oo00oooo, Long l) {
        int iDelete;
        OooOO0O();
        OooOO0o();
        o000000O.OooO0oo(o0oo0o0o);
        o000000O.OooO0o0(str);
        OooOO0O();
        OooOO0o();
        boolean zOoooO0 = OoooO0();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (zOoooO0) {
            oOO0000 ooo0000 = this.f14916OooOo0o;
            long jOooO00o = ooo0000.f14800OooOooO.f14705OooOoOO.OooO00o();
            o0oo0oo0.f14527Oooo000.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jOooO00o) > ((Long) o0O000O.f14260Oooo0o.OooO00o(null)).longValue()) {
                ooo0000.f14800OooOooO.f14705OooOoOO.OooO0O0(jElapsedRealtime);
                OooOO0O();
                OooOO0o();
                boolean zOoooO02 = OoooO0();
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                if (zOoooO02 && (iDelete = OoooOoO().delete("upload_queue", Oooo0o(), new String[0])) > 0) {
                    o0OO0oO0.OooOOO0(o0o0o0o0);
                    o0o0o0o0.f14398Oooo0.OooO0OO(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                o000000O.OooO0o0(str);
                OooOO0O();
                OooOO0o();
                try {
                    int iOooOOoo = o0oo0oo0.f14519OooOoO0.OooOOoo(str, o0O000O.f14248OooOoOO);
                    if (iOooOOoo > 0) {
                        OoooOoO().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iOooOOoo)});
                    }
                } catch (SQLiteException e) {
                    o0OO0oO0.OooOOO0(o0o0o0o0);
                    o0o0o0o0.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Error deleting over the limit queued batches. appId", e);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append(C3034d9.i.f8173b);
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrOooO00o = o0oo0o0o.OooO00o();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrOooO00o);
        contentValues.put("upload_uri", str2);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) "\r\n");
            }
        }
        contentValues.put("upload_headers", sb2.toString());
        contentValues.put("upload_type", Integer.valueOf(oo00oooo.f14657OooOo0O));
        oo000o oo000oVar = o0oo0oo0.f14527Oooo000;
        o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
        oo000oVar.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = OoooOoO().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0OO(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0Oo(str, "Error storing MeasurementBatch to upload_queue. appId", e2);
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List OooOOOo(java.lang.String r19, OoooOOO.oO0OO00 r20, int r21) {
        /*
            r18 = this;
            Oooo00O.o000000O.OooO0o0(r19)
            r18.OooOO0O()
            r18.OooOO0o()
            java.lang.String r0 = " AND NOT "
            java.lang.String r1 = "app_id=?"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r18.OoooOoO()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r4 = "upload_queue"
            java.lang.String r5 = "rowId"
            java.lang.String r6 = "app_id"
            java.lang.String r7 = "measurement_batch"
            java.lang.String r8 = "upload_uri"
            java.lang.String r9 = "upload_headers"
            java.lang.String r10 = "upload_type"
            java.lang.String r11 = "retry_count"
            java.lang.String r12 = "creation_timestamp"
            java.lang.String r13 = "associated_row_id"
            java.lang.String r14 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r6 = r20
            java.util.List r6 = r6.zza     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r6 = Oooo0oO(r6)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r7 = r18.Oooo0o()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r6.length()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r8 + 17
            int r9 = r7.length()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r6)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r7)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String[] r7 = new java.lang.String[]{r19}     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r10 = "creation_timestamp ASC"
            if (r21 <= 0) goto L66
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r11 = r0
            goto L67
        L66:
            r11 = r2
        L67:
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
        L72:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            if (r1 == 0) goto Lb9
            r1 = 0
            long r5 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 2
            byte[] r7 = r2.getBlob(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 3
            java.lang.String r8 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 4
            java.lang.String r9 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 5
            int r10 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 6
            int r11 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 7
            long r12 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 8
            long r14 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 9
            long r16 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r3 = r18
            r4 = r19
            OoooOOO.oOO000 r1 = r3.Oooo0o0(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            if (r1 == 0) goto L72
            r0.add(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            goto L72
        Lb5:
            r0 = move-exception
            goto Lbc
        Lb7:
            r0 = move-exception
            goto Lbf
        Lb9:
            r3 = r18
            goto Ld5
        Lbc:
            r3 = r18
            goto Ldc
        Lbf:
            r3 = r18
            java.lang.Object r1 = r3.f14574OooOo0O     // Catch: java.lang.Throwable -> Ldb
            OoooOOO.o0OO0oO0 r1 = (OoooOOO.o0OO0oO0) r1     // Catch: java.lang.Throwable -> Ldb
            OoooOOO.o0O0O0o0 r1 = r1.f14520OooOoOO     // Catch: java.lang.Throwable -> Ldb
            OoooOOO.o0OO0oO0.OooOOO0(r1)     // Catch: java.lang.Throwable -> Ldb
            OoooOOO.o0O0oo0o r1 = r1.f14393OooOoOO     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r5 = r19
            r1.OooO0Oo(r5, r4, r0)     // Catch: java.lang.Throwable -> Ldb
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Ldb
        Ld5:
            if (r2 == 0) goto Lda
            r2.close()
        Lda:
            return r0
        Ldb:
            r0 = move-exception
        Ldc:
            if (r2 == 0) goto Le1
            r2.close()
        Le1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.OooOOOo(java.lang.String, OoooOOO.oO0OO00, int):java.util.List");
    }

    public final void OooOOo(Long l) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        OooOO0O();
        OooOO0o();
        try {
            if (OoooOoO().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14396OooOooO.OooO0O0("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0OO(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    public final boolean OooOOo0(String str) {
        oO00OOOo[] oo00ooooArr = {oO00OOOo.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(oo00ooooArr[0].f14657OooOo0O));
        String strOooo0oO = Oooo0oO(arrayList);
        String strOooo0o = Oooo0o();
        return OoooOO0(OooO00o.OooOOO(new StringBuilder((strOooo0oO.length() + 61) + strOooo0o.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strOooo0oO, " AND NOT ", strOooo0o), new String[]{str}) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String OooOOoo() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.OoooOoO()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L37
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3d
        L22:
            r0 = move-exception
            goto L3d
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            java.lang.Object r3 = r6.f14574OooOo0O     // Catch: java.lang.Throwable -> L1a
            OoooOOO.o0OO0oO0 r3 = (OoooOOO.o0OO0oO0) r3     // Catch: java.lang.Throwable -> L1a
            OoooOOO.o0O0O0o0 r3 = r3.f14520OooOoOO     // Catch: java.lang.Throwable -> L1a
            OoooOOO.o0OO0oO0.OooOOO0(r3)     // Catch: java.lang.Throwable -> L1a
            OoooOOO.o0O0oo0o r3 = r3.f14393OooOoOO     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.OooO0OO(r2, r4)     // Catch: java.lang.Throwable -> L1a
        L37:
            if (r0 == 0) goto L3c
            r0.close()
        L3c:
            return r1
        L3d:
            if (r1 == 0) goto L42
            r1.close()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.OooOOoo():java.lang.String");
    }

    public final Object OooOo(Cursor cursor, int i) {
        int type = cursor.getType(i);
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (type == 0) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type == 4) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0O0("Loaded invalid blob type value, ignoring it");
            return null;
        }
        o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o03);
        o0o0o0o03.f14393OooOoOO.OooO0OO(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
        return null;
    }

    public final void OooOo0() {
        OooOO0O();
        OooOO0o();
        if (OoooO0()) {
            oOO0000 ooo0000 = this.f14916OooOo0o;
            long jOooO00o = ooo0000.f14800OooOooO.f14703OooOoO.OooO00o();
            o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
            o0oo0oo0.f14527Oooo000.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jOooO00o) > ((Long) o0O000O.f14260Oooo0o.OooO00o(null)).longValue()) {
                ooo0000.f14800OooOooO.f14703OooOoO.OooO0O0(jElapsedRealtime);
                OooOO0O();
                OooOO0o();
                if (OoooO0()) {
                    SQLiteDatabase sQLiteDatabaseOoooOoO = OoooOoO();
                    o0oo0oo0.f14527Oooo000.getClass();
                    int iDelete = sQLiteDatabaseOoooOoO.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) o0O000O.f14265OoooO0.OooO00o(null)).longValue())});
                    if (iDelete > 0) {
                        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o0);
                        o0o0o0o0.f14398Oooo0.OooO0OO(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void OooOo00(long j) {
        OooOO0O();
        OooOO0o();
        try {
            if (OoooOoO().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0OO(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void OooOo0O(ArrayList arrayList) throws SQLException {
        OooOO0O();
        OooOO0o();
        o000000O.OooO0oo(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (OoooO0()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strOooOOO0 = OooO00o.OooOOO0(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            long jOoooOO0 = OoooOO0(OooO00o.OooOOO0(new StringBuilder(strOooOOO0.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strOooOOO0, " AND retry_count =  2147483647 LIMIT 1"), null);
            o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
            if (jOoooOO0 > 0) {
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14396OooOooO.OooO0O0("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseOoooOoO = OoooOoO();
                StringBuilder sb = new StringBuilder(strOooOOO0.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strOooOOO0);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseOoooOoO.execSQL(sb.toString());
            } catch (SQLiteException e) {
                o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0o0o02.f14393OooOoOO.OooO0OO(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void OooOo0o(Long l) {
        OooOO0O();
        OooOO0o();
        if (OoooO0()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            long jOoooOO0 = OoooOO0(sb.toString(), null);
            o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
            if (jOoooOO0 > 0) {
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14396OooOooO.OooO0O0("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseOoooOoO = OoooOoO();
                o0oo0oo0.f14527Oooo000.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseOoooOoO.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0o0o02.f14393OooOoOO.OooO0OO(e, "Error incrementing retry count. error");
            }
        }
    }

    public final boolean OooOoO(String str, String str2) {
        return OoooOO0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:50:0x0072, B:52:0x0093, B:55:0x00a6), top: B:65:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:50:0x0072, B:52:0x0093, B:55:0x00a6), top: B:65:0x0072 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooOoO0(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f14574OooOo0O
            OoooOOO.o0OO0oO0 r0 = (OoooOOO.o0OO0oO0) r0
            java.lang.String r1 = "select first_open_count from app2 where app_id=?"
            Oooo00O.o000000O.OooO0o0(r14)
            java.lang.String r2 = "first_open_count"
            Oooo00O.o000000O.OooO0o0(r2)
            r13.OooOO0O()
            r13.OooOO0o()
            android.database.sqlite.SQLiteDatabase r3 = r13.OoooOoO()
            r3.beginTransaction()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = 48
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r6.append(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String[] r6 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = -1
            long r9 = r13.o000oOoO(r1, r6, r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r6 = "app2"
            java.lang.String r11 = "app_id"
            if (r1 != 0) goto L72
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r10 = "previous_install_count"
            r1.put(r10, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            r10 = 5
            long r9 = r3.insertWithOnConflict(r6, r9, r1, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L71
            OoooOOO.o0O0O0o0 r1 = r0.f14520OooOoOO     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            OoooOOO.o0OO0oO0.OooOOO0(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            OoooOOO.o0O0oo0o r1 = r1.f14393OooOoOO     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r6 = "Failed to insert column (got -1). appId"
            OoooOOO.o0O0O0Oo r9 = OoooOOO.o0O0O0o0.OooOOoo(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.OooO0Oo(r9, r6, r2)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            goto Lbd
        L6d:
            r14 = move-exception
            goto Lc1
        L6f:
            r1 = move-exception
            goto Lac
        L71:
            r9 = r4
        L72:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r11 = 1
            long r11 = r11 + r9
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r2, r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r11 = "app_id = ?"
            java.lang.String[] r12 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = r3.update(r6, r1, r11, r12)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            long r11 = (long) r1     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto La6
            OoooOOO.o0O0O0o0 r1 = r0.f14520OooOoOO     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            OoooOOO.o0OO0oO0.OooOOO0(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            OoooOOO.o0O0oo0o r1 = r1.f14393OooOoOO     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r4 = "Failed to update column (got 0). appId"
            OoooOOO.o0O0O0Oo r5 = OoooOOO.o0O0O0o0.OooOOoo(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.OooO0Oo(r5, r4, r2)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            goto Lbd
        La4:
            r1 = move-exception
            goto Lab
        La6:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r7 = r9
            goto Lbd
        Lab:
            r4 = r9
        Lac:
            OoooOOO.o0O0O0o0 r0 = r0.f14520OooOoOO     // Catch: java.lang.Throwable -> L6d
            OoooOOO.o0OO0oO0.OooOOO0(r0)     // Catch: java.lang.Throwable -> L6d
            OoooOOO.o0O0oo0o r0 = r0.f14393OooOoOO     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "Error inserting column. appId"
            OoooOOO.o0O0O0Oo r14 = OoooOOO.o0O0O0o0.OooOOoo(r14)     // Catch: java.lang.Throwable -> L6d
            r0.OooO0o0(r6, r14, r2, r1)     // Catch: java.lang.Throwable -> L6d
            r7 = r4
        Lbd:
            r3.endTransaction()
            return r7
        Lc1:
            r3.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.OooOoO0(java.lang.String):long");
    }

    public final long OooOoOO(String str) {
        o000000O.OooO0o0(str);
        return o000oOoO("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x028e A[Catch: SQLiteException -> 0x02a8, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x02a8, blocks: (B:243:0x0273, B:245:0x028e), top: B:256:0x0273 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0116 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOoo(java.lang.String r25, java.lang.Long r26, java.lang.String r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.OooOoo(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    public final void OooOoo0(String str, Long l, long j, com.google.android.gms.internal.measurement.o0O00OO o0o00oo) {
        OooOO0O();
        OooOO0o();
        o000000O.OooO0oo(o0o00oo);
        o000000O.OooO0o0(str);
        byte[] bArrOooO00o = o0o00oo.OooO00o();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14398Oooo0.OooO0Oo(o0oo0oo0.f14524OooOooo.OooO00o(str), "Saving complex main event, appId, data size", Integer.valueOf(bArrOooO00o.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrOooO00o);
        try {
            if (OoooOoO().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0o0o02.f14393OooOoOO.OooO0OO(o0O0O0o0.OooOOoo(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Error storing complex main event. appId", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0064  */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OoooOOO.oO00000o OooOooO(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f14574OooOo0O
            OoooOOO.o0OO0oO0 r0 = (OoooOOO.o0OO0oO0) r0
            Oooo00O.o000000O.OooO0oo(r5)
            r4.OooOO0O()
            r4.OooOO0o()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.OoooOoO()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            if (r1 != 0) goto L36
            OoooOOO.o0O0O0o0 r1 = r0.f14520OooOoOO     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            OoooOOO.o0OO0oO0.OooOOO0(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            OoooOOO.o0O0oo0o r1 = r1.f14398Oooo0     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            java.lang.String r3 = "No data found"
            r1.OooO0O0(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
        L2e:
            r5.close()
            goto L5c
        L32:
            r0 = move-exception
            goto L45
        L34:
            r1 = move-exception
            goto L4d
        L36:
            r1 = 0
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            r3 = 1
            int r3 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            OoooOOO.oO00000o r2 = OoooOOO.oO00000o.OooO0OO(r3, r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            goto L2e
        L45:
            r2 = r5
            goto L62
        L47:
            r5 = move-exception
            r0 = r5
            goto L62
        L4a:
            r5 = move-exception
            r1 = r5
            r5 = r2
        L4d:
            OoooOOO.o0O0O0o0 r0 = r0.f14520OooOoOO     // Catch: java.lang.Throwable -> L32
            OoooOOO.o0OO0oO0.OooOOO0(r0)     // Catch: java.lang.Throwable -> L32
            OoooOOO.o0O0oo0o r0 = r0.f14393OooOoOO     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "Error querying database."
            r0.OooO0OO(r1, r3)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L5c
            goto L2e
        L5c:
            if (r2 != 0) goto L61
            OoooOOO.oO00000o r5 = OoooOOO.oO00000o.f14610OooO0OO
            return r5
        L61:
            return r2
        L62:
            if (r2 == 0) goto L67
            r2.close()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.OooOooO(java.lang.String):OoooOOO.oO00000o");
    }

    public final void OooOooo(String str, oOo0o0oO ooo0o0oo) {
        OooOO0O();
        OooOO0o();
        o000000O.OooO0o0(str);
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0oo0oo0.f14527Oooo000.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        o0O000 o0o000 = o0O000O.o0ooOOo;
        long jLongValue = jCurrentTimeMillis - ((Long) o0o000.OooO00o(null)).longValue();
        long j = ooo0o0oo.zzb;
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        if (j < jLongValue || j > ((Long) o0o000.OooO00o(null)).longValue() + jCurrentTimeMillis) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0o0("Storing trigger URI outside of the max retention time span. appId, now, timestamp", o0O0O0o0.OooOOoo(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14398Oooo0.OooO0O0("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", ooo0o0oo.zza);
        contentValues.put("source", Integer.valueOf(ooo0o0oo.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (OoooOoO().insert("trigger_uris", null, contentValues) == -1) {
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0OO(o0O0O0o0.OooOOoo(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Error storing trigger URI. appId", e);
        }
    }

    public final oO00000o Oooo(String str) {
        o000000O.OooO0oo(str);
        OooOO0O();
        OooOO0o();
        return oO00000o.OooO0OO(100, Oooo00O("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OoooOOO.o00OOO0O Oooo0(java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.Oooo0(java.lang.String, java.lang.String, java.lang.String):OoooOOO.o00OOO0O");
    }

    public final void Oooo000(String str, oO00000o oo00000o) {
        o000000O.OooO0oo(str);
        o000000O.OooO0oo(oo00000o);
        OooOO0O();
        OooOO0o();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", oo00000o.OooO0oO());
        contentValues.put("consent_source", Integer.valueOf(oo00000o.f14612OooO0O0));
        Oooo00o(contentValues);
    }

    public final String Oooo00O(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = OoooOoO().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0Oo(str, "Database error", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final void Oooo00o(ContentValues contentValues) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        try {
            SQLiteDatabase sQLiteDatabaseOoooOoO = OoooOoO();
            if (contentValues.getAsString("app_id") == null) {
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14394OooOoo.OooO0OO(o0O0O0o0.OooOOoo("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (sQLiteDatabaseOoooOoO.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && sQLiteDatabaseOoooOoO.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0o0o02.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo("consent_settings"), "Failed to insert/update table (got -1). key", o0O0O0o0.OooOOoo("app_id"));
            }
        } catch (SQLiteException e) {
            o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o03);
            o0o0o0o03.f14393OooOoOO.OooO0o0("Error storing into table. key", o0O0O0o0.OooOOoo("consent_settings"), o0O0O0o0.OooOOoo("app_id"), e);
        }
    }

    public final void Oooo0O0(String str, o00OOO0O o00ooo0o) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o000000O.OooO0oo(o00ooo0o);
        OooOO0O();
        OooOO0o();
        ContentValues contentValues = new ContentValues();
        String str2 = o00ooo0o.f14172OooO00o;
        contentValues.put("app_id", str2);
        contentValues.put("name", o00ooo0o.f14173OooO0O0);
        contentValues.put("lifetime_count", Long.valueOf(o00ooo0o.f14174OooO0OO));
        contentValues.put("current_bundle_count", Long.valueOf(o00ooo0o.f14175OooO0Oo));
        contentValues.put("last_fire_timestamp", Long.valueOf(o00ooo0o.f14176OooO0o));
        contentValues.put("last_bundled_timestamp", Long.valueOf(o00ooo0o.f14178OooO0oO));
        contentValues.put("last_bundled_day", o00ooo0o.f14179OooO0oo);
        contentValues.put("last_sampled_complex_event_id", o00ooo0o.f14171OooO);
        contentValues.put("last_sampling_rate", o00ooo0o.f14180OooOO0);
        contentValues.put("current_session_count", Long.valueOf(o00ooo0o.f14177OooO0o0));
        Boolean bool = o00ooo0o.f14181OooOO0O;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (OoooOoO().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0OO(o0O0O0o0.OooOOoo(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str2), "Error storing event aggregates. appId", e);
        }
    }

    public final void Oooo0OO(String str, String str2) {
        o000000O.OooO0o0(str2);
        OooOO0O();
        OooOO0o();
        try {
            OoooOoO().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str2), "Error deleting snapshot. appId", e);
        }
    }

    public final String Oooo0o() {
        ((o0OO0oO0) this.f14574OooOo0O).f14527Oooo000.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) o0O000O.f14267OoooO0O.OooO00o(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
        String strOooOOOO = OooOo.OooOOOO(OooOo.OooOOo(jCurrentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > "), ((Long) o0O000O.f14265OoooO0.OooO00o(null)).longValue(), ")");
        StringBuilder sb = new StringBuilder(str.length() + 5 + strOooOOOO.length() + 1);
        OooO00o.OooOooO(sb, "(", str, " OR ", strOooOOOO);
        sb.append(")");
        return sb.toString();
    }

    public final oOO000 Oooo0o0(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        oOO000 ooo000;
        o0OO0oO0 o0oo0oo0;
        com.google.android.gms.internal.measurement.o0O0O0O o0o0o0o;
        oO00OOOo oo00oooo;
        oO00OOOo oo00oooo2;
        HashMap map;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        o0OO0oO0 o0oo0oo02 = (o0OO0oO0) this.f14574OooOo0O;
        if (zIsEmpty) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo02.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14401Oooo00o.OooO0O0("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            o0o0o0o = (com.google.android.gms.internal.measurement.o0O0O0O) oo0OOoo.OoooOOo(com.google.android.gms.internal.measurement.o0oO0O0o.OooOo0o(), bArr);
            oO00OOOo[] oo00ooooArrValues = oO00OOOo.values();
            int length = oo00ooooArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    oo00oooo = oO00OOOo.UNKNOWN;
                    break;
                }
                oo00oooo = oo00ooooArrValues[i3];
                if (oo00oooo.f14657OooOo0O == i) {
                    break;
                }
                i3++;
            }
            oo00oooo2 = oo00oooo;
            if (oo00oooo2 != oO00OOOo.GOOGLE_SIGNAL && oo00oooo2 != oO00OOOo.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.o0oO0O0o) o0o0o0o.f26683OooOo0o).OooOOOo()).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.o0O0oo0o o0o0oo0o = (com.google.android.gms.internal.measurement.o0O0oo0o) ((com.google.android.gms.internal.measurement.o0O0O0Oo) it.next()).OooO();
                    o0o0oo0o.OooO0O0();
                    ((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.f26683OooOo0o).o0000O0(i2);
                    arrayList.add((com.google.android.gms.internal.measurement.o0O0O0Oo) o0o0oo0o.OooO0o0());
                }
                o0o0o0o.OooO0O0();
                ((com.google.android.gms.internal.measurement.o0oO0O0o) o0o0o0o.f26683OooOo0o).OooOoo0();
                o0o0o0o.OooO0O0();
                ((com.google.android.gms.internal.measurement.o0oO0O0o) o0o0o0o.f26683OooOo0o).OooOoOO(arrayList);
            }
            map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length2 = strArrSplit.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    String str4 = strArrSplit[i4];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split(C3034d9.i.f8173b, 2);
                    if (strArrSplit2.length != 2) {
                        o0O0O0o0 o0o0o0o02 = o0oo0oo02.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o02);
                        o0o0o0o02.f14393OooOoOO.OooO0OO(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i4++;
                }
            }
            ooo000 = null;
            o0oo0oo0 = o0oo0oo02;
        } catch (IOException e) {
            e = e;
            ooo000 = null;
            o0oo0oo0 = o0oo0oo02;
        }
        try {
            return new oOO000(j, (com.google.android.gms.internal.measurement.o0oO0O0o) o0o0o0o.OooO0o0(), str2, map, oo00oooo2, j2, j3, j4, i2);
        } catch (IOException e2) {
            e = e2;
            o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o03);
            o0o0o0o03.f14393OooOoOO.OooO0Oo(str, "Failed to queued MeasurementBatch from upload_queue. appId", e);
            return ooo000;
        }
    }

    public final void Oooo0oo(String str, oO00000o oo00000o) {
        o000000O.OooO0oo(str);
        OooOO0O();
        OooOO0o();
        Oooo000(str, OooOooO(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", oo00000o.OooO0oO());
        Oooo00o(contentValues);
    }

    public final boolean OoooO0() {
        return ((o0OO0oO0) this.f14574OooOo0O).f14516OooOo0O.getDatabasePath("google_app_measurement.db").exists();
    }

    public final o00OOO0O OoooO00(String str, com.google.android.gms.internal.measurement.o0O00OO o0o00oo, String str2) {
        o00OOO0O o00ooo0oOooo0 = Oooo0("events", str, o0o00oo.OooOOoo());
        if (o00ooo0oOooo0 != null) {
            long j = o00ooo0oOooo0.f14177OooO0o0 + 1;
            long j2 = o00ooo0oOooo0.f14175OooO0Oo + 1;
            return new o00OOO0O(o00ooo0oOooo0.f14172OooO00o, o00ooo0oOooo0.f14173OooO0O0, o00ooo0oOooo0.f14174OooO0OO + 1, j2, j, o00ooo0oOooo0.f14176OooO0o, o00ooo0oOooo0.f14178OooO0oO, o00ooo0oOooo0.f14179OooO0oo, o00ooo0oOooo0.f14171OooO, o00ooo0oOooo0.f14180OooOO0, o00ooo0oOooo0.f14181OooOO0O);
        }
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14396OooOooO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Event aggregate wasn't created during raw event logging. appId, event", o0oo0oo0.f14524OooOooo.OooO00o(str2));
        return new o00OOO0O(str, o0o00oo.OooOOoo(), 1L, 1L, 1L, o0o00oo.OooOo0(), 0L, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00f8 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:145:0x0066, B:148:0x006e, B:149:0x0072, B:175:0x00d0, B:177:0x00f8, B:178:0x010a, B:179:0x010e, B:180:0x011e, B:182:0x0124, B:183:0x0134, B:186:0x0147, B:198:0x016e, B:201:0x0176, B:207:0x0195, B:191:0x015d, B:205:0x0187, B:206:0x0190, B:229:0x021f, B:170:0x00c0, B:173:0x00c8), top: B:252:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x010a A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #7 {all -> 0x007a, blocks: (B:145:0x0066, B:148:0x006e, B:149:0x0072, B:175:0x00d0, B:177:0x00f8, B:178:0x010a, B:179:0x010e, B:180:0x011e, B:182:0x0124, B:183:0x0134, B:186:0x0147, B:198:0x016e, B:201:0x0176, B:207:0x0195, B:191:0x015d, B:205:0x0187, B:206:0x0190, B:229:0x021f, B:170:0x00c0, B:173:0x00c8), top: B:252:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OoooO0O(java.lang.String r21, long r22, long r24, OoooOOO.o0oOo0O0 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.OoooO0O(java.lang.String, long, long, OoooOOO.o0oOo0O0):void");
    }

    public final long OoooOO0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = OoooOoO().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0Oo(str, "Database error", e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void OoooOOO() {
        OooOO0o();
        OoooOoO().beginTransaction();
    }

    public final void OoooOOo() {
        OooOO0o();
        OoooOoO().setTransactionSuccessful();
    }

    public final void OoooOo0() {
        OooOO0o();
        OoooOoO().endTransaction();
    }

    public final SQLiteDatabase OoooOoO() {
        OooOO0O();
        try {
            return this.f14162OooOoO0.getWritableDatabase();
        } catch (SQLiteException e) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(e, "Error opening database");
            throw e;
        }
    }

    public final void OoooOoo(String str) {
        o00OOO0O o00ooo0oOooo0;
        Oooo0OO("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = OoooOoO().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (o00ooo0oOooo0 = Oooo0("events", str, string)) != null) {
                            Oooo0O0("events_snapshot", o00ooo0oOooo0);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Error creating snapshot. appId", e);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Ooooo00(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.Ooooo00(java.lang.String):void");
    }

    public final void Ooooo0o(String str, String str2) {
        o000000O.OooO0o0(str);
        o000000O.OooO0o0(str2);
        OooOO0O();
        OooOO0o();
        try {
            OoooOoO().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0o0("Error deleting user property. appId", o0O0O0o0.OooOOoo(str), o0oo0oo0.f14524OooOooo.OooO0OO(str2), e);
        }
    }

    public final boolean OooooO0(oOO00 ooo00) {
        OooOO0O();
        OooOO0o();
        String str = ooo00.f14777OooO00o;
        String str2 = ooo00.f14779OooO0OO;
        oOO00 ooo00OooooOO = OooooOO(str, str2);
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        String str3 = ooo00.f14778OooO0O0;
        if (ooo00OooooOO == null) {
            if (oOO00OO.Oooooo(str2)) {
                if (OoooOO0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(o0oo0oo0.f14519OooOoO0.OooOOoo(str, o0O000O.o000oOoO), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jOoooOO0 = OoooOO0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3});
                o0oo0oo0.getClass();
                if (jOoooOO0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(C3037dc.f8261p, str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(ooo00.f14780OooO0Oo));
        OoooO(contentValues, ooo00.f14781OooO0o0);
        try {
            if (OoooOoO().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0OO(o0O0O0o0.OooOOoo(str), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Error storing user property. appId", e);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OoooOOO.oOO00 OooooOO(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f14574OooOo0O
            r1 = r0
            OoooOOO.o0OO0oO0 r1 = (OoooOOO.o0OO0oO0) r1
            Oooo00O.o000000O.OooO0o0(r12)
            Oooo00O.o000000O.OooO0o0(r13)
            r11.OooOO0O()
            r11.OooOO0o()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.OoooOoO()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r4 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r6 = "app_id=? and name=?"
            java.lang.String[] r7 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            r10 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L37
            goto L95
        L37:
            r0 = 0
            long r8 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r10 = r11.OooOo(r3, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r10 != 0) goto L44
            goto L95
        L44:
            r0 = 2
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            OoooOOO.oOO00 r4 = new OoooOOO.oOO00     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r12 == 0) goto L6d
            OoooOOO.o0O0O0o0 r12 = r1.f14520OooOoOO     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            OoooOOO.o0OO0oO0.OooOOO0(r12)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            OoooOOO.o0O0oo0o r12 = r12.f14393OooOoOO     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r13 = "Got multiple records for user property, expected one. appId"
            OoooOOO.o0O0O0Oo r0 = OoooOOO.o0O0O0o0.OooOOoo(r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r12.OooO0OO(r0, r13)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L67:
            r0 = move-exception
            r12 = r0
            goto L75
        L6a:
            r0 = move-exception
        L6b:
            r12 = r0
            goto L7f
        L6d:
            r3.close()
            return r4
        L71:
            r0 = move-exception
            r5 = r12
            r7 = r13
            goto L6b
        L75:
            r2 = r3
            goto L9b
        L77:
            r0 = move-exception
            r12 = r0
            goto L9b
        L7a:
            r0 = move-exception
            r5 = r12
            r7 = r13
            r12 = r0
            r3 = r2
        L7f:
            OoooOOO.o0O0O0o0 r13 = r1.f14520OooOoOO     // Catch: java.lang.Throwable -> L67
            OoooOOO.o0OO0oO0.OooOOO0(r13)     // Catch: java.lang.Throwable -> L67
            OoooOOO.o0O0oo0o r13 = r13.f14393OooOoOO     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Error querying user property. appId"
            OoooOOO.o0O0O0Oo r4 = OoooOOO.o0O0O0o0.OooOOoo(r5)     // Catch: java.lang.Throwable -> L67
            OoooOOO.o0O00o00 r1 = r1.f14524OooOooo     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.OooO0OO(r7)     // Catch: java.lang.Throwable -> L67
            r13.OooO0o0(r0, r4, r1, r12)     // Catch: java.lang.Throwable -> L67
        L95:
            if (r3 == 0) goto L9a
            r3.close()
        L9a:
            return r2
        L9b:
            if (r2 == 0) goto La0
            r2.close()
        La0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.OooooOO(java.lang.String, java.lang.String):OoooOOO.oOO00");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List OooooOo(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f14574OooOo0O
            r1 = r0
            OoooOOO.o0OO0oO0 r1 = (OoooOOO.o0OO0oO0) r1
            Oooo00O.o000000O.OooO0o0(r13)
            r12.OooOO0O()
            r12.OooOO0o()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1000"
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = r12.OoooOoO()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r9 = "rowid"
            r1.getClass()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            boolean r2 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r2 == 0) goto L9c
        L3f:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2 = 1
            java.lang.String r2 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r2 != 0) goto L4d
            java.lang.String r2 = ""
        L4d:
            r5 = r2
            goto L52
        L4f:
            r0 = move-exception
            r4 = r13
            goto L8a
        L52:
            r2 = 2
            long r7 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2 = 3
            java.lang.Object r9 = r12.OooOo(r11, r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r9 != 0) goto L73
            OoooOOO.o0O0O0o0 r2 = r1.f14520OooOoOO     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            OoooOOO.o0OO0oO0.OooOOO0(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            OoooOOO.o0O0oo0o r2 = r2.f14393OooOoOO     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            java.lang.String r3 = "Read invalid user property value, ignoring it. appId"
            OoooOOO.o0O0O0Oo r4 = OoooOOO.o0O0O0o0.OooOOoo(r13)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2.OooO0OO(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r4 = r13
            goto L7c
        L70:
            r0 = move-exception
            r13 = r0
            goto La2
        L73:
            OoooOOO.oOO00 r3 = new OoooOOO.oOO00     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            r0.add(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
        L7c:
            boolean r13 = r11.moveToNext()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            if (r13 != 0) goto L83
            goto L9c
        L83:
            r13 = r4
            goto L3f
        L85:
            r0 = move-exception
            goto L8a
        L87:
            r0 = move-exception
            r4 = r13
            r13 = r0
        L8a:
            OoooOOO.o0O0O0o0 r13 = r1.f14520OooOoOO     // Catch: java.lang.Throwable -> L70
            OoooOOO.o0OO0oO0.OooOOO0(r13)     // Catch: java.lang.Throwable -> L70
            OoooOOO.o0O0oo0o r13 = r13.f14393OooOoOO     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "Error querying user properties. appId"
            OoooOOO.o0O0O0Oo r2 = OoooOOO.o0O0O0o0.OooOOoo(r4)     // Catch: java.lang.Throwable -> L70
            r13.OooO0Oo(r2, r1, r0)     // Catch: java.lang.Throwable -> L70
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L70
        L9c:
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r0
        La2:
            if (r11 == 0) goto La7
            r11.close()
        La7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.OooooOo(java.lang.String):java.util.List");
    }

    public final boolean Oooooo(o00O0OO0 o00o0oo0) {
        OooOO0O();
        OooOO0o();
        String str = o00o0oo0.zza;
        o000000O.OooO0oo(str);
        oOO00 ooo00OooooOO = OooooOO(str, o00o0oo0.zzc.zzb);
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (ooo00OooooOO == null) {
            long jOoooOO0 = OoooOO0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            o0oo0oo0.getClass();
            if (jOoooOO0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(C3037dc.f8261p, o00o0oo0.zzb);
        contentValues.put("name", o00o0oo0.zzc.zzb);
        Object objOooO0o0 = o00o0oo0.zzc.OooO0o0();
        o000000O.OooO0oo(objOooO0o0);
        OoooO(contentValues, objOooO0o0);
        contentValues.put("active", Boolean.valueOf(o00o0oo0.zze));
        contentValues.put("trigger_event_name", o00o0oo0.zzf);
        contentValues.put("trigger_timeout", Long.valueOf(o00o0oo0.zzh));
        o00OOOOo o00ooooo = o00o0oo0.zzg;
        oOO00OO ooo00oo = o0oo0oo0.f14523OooOooO;
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOO0O(ooo00oo);
        contentValues.put("timed_out_event", oOO00OO.Oooo0oO(o00ooooo));
        contentValues.put("creation_timestamp", Long.valueOf(o00o0oo0.zzd));
        o0OO0oO0.OooOO0O(o0oo0oo0.f14523OooOooO);
        contentValues.put("triggered_event", oOO00OO.Oooo0oO(o00o0oo0.zzi));
        contentValues.put("triggered_timestamp", Long.valueOf(o00o0oo0.zzc.zzc));
        contentValues.put("time_to_live", Long.valueOf(o00o0oo0.zzj));
        contentValues.put("expired_event", oOO00OO.Oooo0oO(o00o0oo0.zzk));
        try {
            if (OoooOoO().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0OO(o0O0O0o0.OooOOoo(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Error storing conditional user property", e);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x00b1, code lost:
    
        OoooOOO.o0OO0oO0.OooOOO0(r8);
        r8.f14393OooOoOO.OooO0OO(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0134  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List Oooooo0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.Oooooo0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:76:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OoooOOO.o00O0OO0 OoooooO(java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.OoooooO(java.lang.String, java.lang.String):OoooOOO.o00O0OO0");
    }

    public final void Ooooooo(String str, String str2) {
        o000000O.OooO0o0(str);
        o000000O.OooO0o0(str2);
        OooOO0O();
        OooOO0o();
        try {
            OoooOoO().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0o0("Error deleting conditional property", o0O0O0o0.OooOOoo(str), o0oo0oo0.f14524OooOooo.OooO0OO(str2), e);
        }
    }

    public final long o000oOoO(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = OoooOoO().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0Oo(str, "Database error", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:256:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OoooOOO.o0O0o000 o00O0O(java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.o00O0O(java.lang.String):OoooOOO.o0O0o000");
    }

    public final void o00Oo0(o0O0o000 o0o0o000, boolean z) {
        OooOO0O();
        OooOO0o();
        String strOooOooO = o0o0o000.OooOooO();
        o000000O.OooO0oo(strOooOooO);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strOooOooO);
        oO00000 oo00000 = oO00000.ANALYTICS_STORAGE;
        oOO0000 ooo0000 = this.f14916OooOo0o;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (ooo0000.OooO0o(strOooOooO).OooO(oo00000)) {
            contentValues.put("app_instance_id", o0o0o000.OooOooo());
        }
        contentValues.put("gmp_app_id", o0o0o000.Oooo00O());
        boolean zOooO = ooo0000.OooO0o(strOooOooO).OooO(oO00000.AD_STORAGE);
        o0OO0oO0 o0oo0oo0 = o0o0o000.f14420OooO00o;
        if (zOooO) {
            o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o00);
            o0oo0o00.OooOO0O();
            contentValues.put("resettable_device_id_hash", o0o0o000.f14425OooO0o0);
        }
        o0OO0o00 o0oo0o002 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o002);
        o0oo0o002.OooOO0O();
        contentValues.put("last_bundle_index", Long.valueOf(o0o0o000.f14426OooO0oO));
        o0OO0o00 o0oo0o003 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o003);
        o0oo0o003.OooOO0O();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(o0o0o000.f14427OooO0oo));
        o0OO0o00 o0oo0o004 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o004);
        o0oo0o004.OooOO0O();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(o0o0o000.f14419OooO));
        contentValues.put("app_version", o0o0o000.Oooo0oO());
        o0OO0o00 o0oo0o005 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o005);
        o0oo0o005.OooOO0O();
        contentValues.put("app_store", o0o0o000.OooOO0o);
        o0OO0o00 o0oo0o006 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o006);
        o0oo0o006.OooOO0O();
        contentValues.put("gmp_version", Long.valueOf(o0o0o000.f14431OooOOO0));
        o0OO0o00 o0oo0o007 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o007);
        o0oo0o007.OooOO0O();
        contentValues.put("dev_cert_hash", Long.valueOf(o0o0o000.f14430OooOOO));
        o0OO0o00 o0oo0o008 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o008);
        o0oo0o008.OooOO0O();
        contentValues.put("measurement_enabled", Boolean.valueOf(o0o0o000.f14432OooOOOO));
        o0OO0o00 o0oo0o009 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o009);
        o0oo0o009.OooOO0O();
        contentValues.put("day", Long.valueOf(o0o0o000.f14453Oooo0O0));
        o0OO0o00 o0oo0o0010 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o0010);
        o0oo0o0010.OooOO0O();
        contentValues.put("daily_public_events_count", Long.valueOf(o0o0o000.f14454Oooo0OO));
        o0OO0oO0.OooOOO0(o0oo0o0010);
        o0oo0o0010.OooOO0O();
        contentValues.put("daily_events_count", Long.valueOf(o0o0o000.f14456Oooo0o0));
        o0OO0oO0.OooOOO0(o0oo0o0010);
        o0oo0o0010.OooOO0O();
        contentValues.put("daily_conversions_count", Long.valueOf(o0o0o000.f14455Oooo0o));
        o0OO0o00 o0oo0o0011 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o0011);
        o0oo0o0011.OooOO0O();
        contentValues.put("config_fetched_time", Long.valueOf(o0o0o000.f14459OoooO0));
        o0OO0o00 o0oo0o0012 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o0012);
        o0oo0o0012.OooOO0O();
        contentValues.put("failed_config_fetch_time", Long.valueOf(o0o0o000.f14461OoooO0O));
        contentValues.put("app_version_int", Long.valueOf(o0o0o000.Oooo()));
        contentValues.put("firebase_instance_id", o0o0o000.Oooo0O0());
        o0OO0oO0.OooOOO0(o0oo0o0010);
        o0oo0o0010.OooOO0O();
        contentValues.put("daily_error_events_count", Long.valueOf(o0o0o000.f14457Oooo0oO));
        o0OO0oO0.OooOOO0(o0oo0o0010);
        o0oo0o0010.OooOO0O();
        contentValues.put("daily_realtime_events_count", Long.valueOf(o0o0o000.f14458Oooo0oo));
        o0OO0oO0.OooOOO0(o0oo0o0010);
        o0oo0o0010.OooOO0O();
        contentValues.put("health_monitor_sample", o0o0o000.f14448Oooo);
        contentValues.put("android_id", (Long) 0L);
        o0OO0o00 o0oo0o0013 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o0013);
        o0oo0o0013.OooOO0O();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(o0o0o000.f14433OooOOOo));
        contentValues.put("dynamite_version", Long.valueOf(o0o0o000.OooO0O0()));
        if (ooo0000.OooO0o(strOooOooO).OooO(oo00000)) {
            o0OO0o00 o0oo0o0014 = o0oo0oo0.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o0014);
            o0oo0o0014.OooOO0O();
            contentValues.put("session_stitching_token", o0o0o000.f14438OooOo00);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(o0o0o000.OooOoO0()));
        o0OO0o00 o0oo0o0015 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o0015);
        o0oo0o0015.OooOO0O();
        contentValues.put("target_os_version", Long.valueOf(o0o0o000.f14439OooOo0O));
        o0OO0o00 o0oo0o0016 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o0016);
        o0oo0o0016.OooOO0O();
        contentValues.put("session_stitching_token_hash", Long.valueOf(o0o0o000.f14440OooOo0o));
        Oo0000.OooO00o();
        o0OO0oO0 o0oo0oo02 = (o0OO0oO0) this.f14574OooOo0O;
        if (o0oo0oo02.f14519OooOoO0.OooOo0(strOooOooO, o0O000O.f14283o0000)) {
            o0OO0o00 o0oo0o0017 = o0oo0oo0.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o0017);
            o0oo0o0017.OooOO0O();
            contentValues.put("ad_services_version", Integer.valueOf(o0o0o000.f14437OooOo));
            o0OO0o00 o0oo0o0018 = o0oo0oo0.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o0018);
            o0oo0o0018.OooOO0O();
            contentValues.put("attribution_eligibility_status", Long.valueOf(o0o0o000.f14445OooOoo0));
        }
        o0OO0o00 o0oo0o0019 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o0019);
        o0oo0o0019.OooOO0O();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(o0o0o000.f14442OooOoO0));
        contentValues.put("npa_metadata_value", o0o0o000.OooOo0o());
        o0OO0o00 o0oo0o0020 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o0020);
        o0oo0o0020.OooOO0O();
        contentValues.put("bundle_delivery_index", Long.valueOf(o0o0o000.f14450Oooo000));
        contentValues.put("sgtm_preview_key", o0o0o000.OooOoo());
        o0OO0oO0.OooOOO0(o0oo0o0010);
        o0oo0o0010.OooOO0O();
        contentValues.put("dma_consent_state", Integer.valueOf(o0o0o000.f14446OooOooO));
        o0OO0oO0.OooOOO0(o0oo0o0010);
        o0oo0o0010.OooOO0O();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(o0o0o000.f14447OooOooo));
        contentValues.put("serialized_npa_metadata", o0o0o000.OooOOoo());
        contentValues.put("client_upload_eligibility", Integer.valueOf(o0o0o000.OooOo00()));
        o0OO0o00 o0oo0o0021 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o0021);
        o0oo0o0021.OooOO0O();
        ArrayList arrayList = o0o0o000.f14436OooOOoo;
        o0O0O0o0 o0o0o0o0 = o0oo0oo02.f14520OooOoOO;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14396OooOooO.OooO0OO(strOooOooO, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (o0oo0oo02.f14519OooOoO0.OooOo0(null, o0O000O.f14291o00000Oo) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        o0OO0o00 o0oo0o0022 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o0022);
        o0oo0o0022.OooOO0O();
        contentValues.put("unmatched_pfo", o0o0o000.f14441OooOoO);
        o0OO0o00 o0oo0o0023 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o0023);
        o0oo0o0023.OooOO0O();
        contentValues.put("unmatched_uwa", o0o0o000.f14443OooOoOO);
        o0OO0o00 o0oo0o0024 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o0024);
        o0oo0o0024.OooOO0O();
        contentValues.put("ad_campaign_info", o0o0o000.f14452Oooo00o);
        try {
            SQLiteDatabase sQLiteDatabaseOoooOoO = OoooOoO();
            if (sQLiteDatabaseOoooOoO.update("apps", contentValues, "app_id = ?", new String[]{strOooOooO}) == 0 && sQLiteDatabaseOoooOoO.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0OO(o0O0O0o0.OooOOoo(strOooOooO), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(strOooOooO), "Error storing app. appId", e);
        }
    }

    public final o00O o00Ooo(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return o00o0O(j, str, 1L, false, false, z, false, z2, z3, z4);
    }

    public final o00O o00o0O(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o000000O.OooO0o0(str);
        OooOO0O();
        OooOO0o();
        String[] strArr = {str};
        o00O o00o = new o00O();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseOoooOoO = OoooOoO();
                cursorQuery = sQLiteDatabaseOoooOoO.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        o00o.f14096OooO0O0 = cursorQuery.getLong(1);
                        o00o.f14095OooO00o = cursorQuery.getLong(2);
                        o00o.f14097OooO0OO = cursorQuery.getLong(3);
                        o00o.f14098OooO0Oo = cursorQuery.getLong(4);
                        o00o.f14100OooO0o0 = cursorQuery.getLong(5);
                        o00o.f14099OooO0o = cursorQuery.getLong(6);
                        o00o.f14101OooO0oO = cursorQuery.getLong(7);
                    }
                    if (z) {
                        o00o.f14096OooO0O0 += j2;
                    }
                    if (z2) {
                        o00o.f14095OooO00o += j2;
                    }
                    if (z3) {
                        o00o.f14097OooO0OO += j2;
                    }
                    if (z4) {
                        o00o.f14098OooO0Oo += j2;
                    }
                    if (z5) {
                        o00o.f14100OooO0o0 += j2;
                    }
                    if (z6) {
                        o00o.f14099OooO0o += j2;
                    }
                    if (z7) {
                        o00o.f14101OooO0oO += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(o00o.f14095OooO00o));
                    contentValues.put("daily_events_count", Long.valueOf(o00o.f14096OooO0O0));
                    contentValues.put("daily_conversions_count", Long.valueOf(o00o.f14097OooO0OO));
                    contentValues.put("daily_error_events_count", Long.valueOf(o00o.f14098OooO0Oo));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(o00o.f14100OooO0o0));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(o00o.f14099OooO0o));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(o00o.f14101OooO0oO));
                    sQLiteDatabaseOoooOoO.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o0);
                    o0o0o0o0.f14396OooOooO.OooO0OO(o0O0O0o0.OooOOoo(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0o0o02.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Error updating daily counts. appId", e);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return o00o;
        } catch (Throwable th) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:109), block:B:55:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Oooo.OooOo00 o00ooo(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f14574OooOo0O
            r1 = r0
            OoooOOO.o0OO0oO0 r1 = (OoooOOO.o0OO0oO0) r1
            Oooo00O.o000000O.OooO0o0(r12)
            r11.OooOO0O()
            r11.OooOO0o()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.OoooOoO()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r4 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r10 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L33
            goto L83
        L33:
            r0 = 0
            byte[] r0 = r3.getBlob(r0)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r4 = 1
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r5 = 2
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r6 == 0) goto L5e
            OoooOOO.o0O0O0o0 r6 = r1.f14520OooOoOO     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            OoooOOO.o0OO0oO0.OooOOO0(r6)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            OoooOOO.o0O0oo0o r6 = r6.f14393OooOoOO     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            OoooOOO.o0O0O0Oo r8 = OoooOOO.o0O0O0o0.OooOOoo(r12)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r6.OooO0OO(r8, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L6c
        L5c:
            r0 = move-exception
            goto L73
        L5e:
            if (r0 != 0) goto L61
            goto L83
        L61:
            Oooo.OooOo00 r6 = new Oooo.OooOo00     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r7 = 10
            r6.<init>(r0, r4, r5, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r3.close()
            return r6
        L6c:
            r2 = r3
            goto L89
        L6e:
            r0 = move-exception
            r12 = r0
            goto L89
        L71:
            r0 = move-exception
            r3 = r2
        L73:
            OoooOOO.o0O0O0o0 r1 = r1.f14520OooOoOO     // Catch: java.lang.Throwable -> L59
            OoooOOO.o0OO0oO0.OooOOO0(r1)     // Catch: java.lang.Throwable -> L59
            OoooOOO.o0O0oo0o r1 = r1.f14393OooOoOO     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "Error querying remote config. appId"
            OoooOOO.o0O0O0Oo r12 = OoooOOO.o0O0O0o0.OooOOoo(r12)     // Catch: java.lang.Throwable -> L59
            r1.OooO0Oo(r12, r4, r0)     // Catch: java.lang.Throwable -> L59
        L83:
            if (r3 == 0) goto L88
            r3.close()
        L88:
            return r2
        L89:
            if (r2 == 0) goto L8e
            r2.close()
        L8e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.o00ooo(java.lang.String):Oooo.OooOo00");
    }

    public final List o0OoOo0(String str, String str2, String str3) {
        o000000O.OooO0o0(str);
        OooOO0O();
        OooOO0o();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(ProxyConfig.MATCH_ALL_SCHEMES));
            sb.append(" and name glob ?");
        }
        return ooOO(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void oo000o(com.google.android.gms.internal.measurement.o0O0O0Oo o0o0o0oo, boolean z) {
        OooOO0O();
        OooOO0o();
        o000000O.OooO0o0(o0o0o0oo.OooOOOo());
        o000000O.OooOO0(o0o0o0oo.o000o0Oo());
        OooOo0();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0oo0oo0.f14527Oooo000.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jO000o0o0 = o0o0o0oo.o000o0o0();
        o0O000 o0o000 = o0O000O.f14265OoooO0;
        long jLongValue = jCurrentTimeMillis - ((Long) o0o000.OooO00o(null)).longValue();
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        if (jO000o0o0 < jLongValue || o0o0o0oo.o000o0o0() > ((Long) o0o000.OooO00o(null)).longValue() + jCurrentTimeMillis) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0o0("Storing bundle outside of the max uploading time span. appId, now, timestamp", o0O0O0o0.OooOOoo(o0o0o0oo.OooOOOo()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(o0o0o0oo.o000o0o0()));
        }
        byte[] bArrOooO00o = o0o0o0oo.OooO00o();
        try {
            oo0OOoo oo0oooo = this.f14916OooOo0o.f14799OooOoo0;
            oOO0000.OoooOO0(oo0oooo);
            byte[] bArrOoooOOO = oo0oooo.OoooOOO(bArrOooO00o);
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14398Oooo0.OooO0OO(Integer.valueOf(bArrOoooOOO.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", o0o0o0oo.OooOOOo());
            contentValues.put("bundle_end_timestamp", Long.valueOf(o0o0o0oo.o000o0o0()));
            contentValues.put("data", bArrOoooOOO);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (o0o0o0oo.o00o0O()) {
                contentValues.put("retry_count", Integer.valueOf(o0o0o0oo.o00ooo()));
            }
            try {
                if (OoooOoO().insert("queue", null, contentValues) == -1) {
                    o0OO0oO0.OooOOO0(o0o0o0o0);
                    o0o0o0o0.f14393OooOoOO.OooO0OO(o0O0O0o0.OooOOoo(o0o0o0oo.OooOOOo()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(o0o0o0oo.OooOOOo()), "Error storing bundle. appId", e);
            }
        } catch (IOException e2) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(o0o0o0oo.OooOOOo()), "Data loss. Failed to serialize bundle. appId", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        r3 = r2.f14520OooOoOO;
        OoooOOO.o0OO0oO0.OooOOO0(r3);
        r3.f14393OooOoOO.OooO0OO(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List ooOO(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00OO0OO.ooOO(java.lang.String, java.lang.String[]):java.util.List");
    }

    @Override // OoooOOO.oO0Oo0o0
    public final void OooOOO() {
    }
}
