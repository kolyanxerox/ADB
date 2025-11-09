package OoooOOO;

import Oooo0OO.oo000o;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.mj0;
import com.google.android.gms.internal.measurement.Oo0000;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00OO0O0 extends mj0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f14148OooO00o = 0;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0o0000 f14149OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(o00OO0OO o00oo0oo, Context context) {
        super(context, "google_app_measurement.db");
        Objects.requireNonNull(o00oo0oo);
        this.f14149OooO0O0 = o00oo0oo;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f14148OooO00o) {
            case 0:
                o00OO0OO o00oo0oo = (o00OO0OO) this.f14149OooO0O0;
                ((o0OO0oO0) o00oo0oo.f14574OooOo0O).getClass();
                o0O0O0O o0o0o0o = o00oo0oo.f14161OooOoO;
                if (o0o0o0o.f14387OooOo0O != 0) {
                    ((oo000o) o0o0o0o.f14388OooOo0o).getClass();
                    if (SystemClock.elapsedRealtime() - o0o0o0o.f14387OooOo0O < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((oo000o) o0o0o0o.f14388OooOo0o).getClass();
                    o0o0o0o.f14387OooOo0O = SystemClock.elapsedRealtime();
                    o0OO0oO0 o0oo0oo0 = (o0OO0oO0) o00oo0oo.f14574OooOo0O;
                    o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o0);
                    o0o0o0o0.f14393OooOoOO.OooO0O0("Opening the database failed, dropping and recreating it");
                    if (!o0oo0oo0.f14516OooOo0O.getDatabasePath("google_app_measurement.db").delete()) {
                        o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o02);
                        o0o0o0o02.f14393OooOoOO.OooO0OO("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        o0o0o0o.f14387OooOo0O = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o03);
                        o0o0o0o03.f14393OooOoOO.OooO0OO(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    o0oO0Ooo o0oo0ooo = (o0oO0Ooo) this.f14149OooO0O0;
                    o0OO0oO0 o0oo0oo02 = (o0OO0oO0) o0oo0ooo.f14574OooOo0O;
                    o0O0O0o0 o0o0o0o04 = o0oo0oo02.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o04);
                    o0o0o0o04.f14393OooOoOO.OooO0O0("Opening the local database failed, dropping and recreating it");
                    if (!o0oo0oo02.f14516OooOo0O.getDatabasePath("google_app_measurement_local.db").delete()) {
                        o0O0O0o0 o0o0o0o05 = o0oo0oo02.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o05);
                        o0o0o0o05.f14393OooOoOO.OooO0OO("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        o0O0O0o0 o0o0o0o06 = ((o0OO0oO0) o0oo0ooo.f14574OooOo0O).f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o06);
                        o0o0o0o06.f14393OooOoOO.OooO0OO(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f14148OooO00o) {
            case 0:
                o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) ((o00OO0OO) this.f14149OooO0O0).f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                oO0000O.OooO0o(o0o0o0o0, sQLiteDatabase);
                break;
            default:
                o0O0O0o0 o0o0o0o02 = ((o0OO0oO0) ((o0oO0Ooo) this.f14149OooO0O0).f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0o(o0o0o0o02, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f14148OooO00o;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        switch (this.f14148OooO00o) {
            case 0:
                String[] strArr = o00OO0OO.f14150OooOoOO;
                o0OO0oO0 o0oo0oo0 = (o0OO0oO0) ((o00OO0OO) this.f14149OooO0O0).f14574OooOo0O;
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                oO0000O.OooO0OO(o0o0o0o0, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", strArr);
                o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                String[] strArr2 = o00OO0OO.f14151OooOoo;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", strArr2);
                String[] strArr3 = o00OO0OO.f14153OooOooO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", strArr3);
                String[] strArr4 = o00OO0OO.f14156Oooo000;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", strArr4);
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                String[] strArr5 = o00OO0OO.f14154OooOooo;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", strArr5);
                String[] strArr6 = o00OO0OO.f14157Oooo00O;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", strArr6);
                String[] strArr7 = o00OO0OO.f14158Oooo00o;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", strArr7);
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                String[] strArr8 = o00OO0OO.f14155Oooo0;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", strArr8);
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                String[] strArr9 = o00OO0OO.f14159Oooo0O0;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", strArr9);
                Oo0000.OooO00o();
                String[] strArr10 = o00OO0OO.f14160Oooo0OO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", strArr10);
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", o00OO0OO.f14152OooOoo0);
                o0OO0oO0.OooOOO0(o0o0o0o02);
                oO0000O.OooO0OO(o0o0o0o02, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                String[] strArr11 = o0oO0Ooo.f14583OooOoO;
                o0O0O0o0 o0o0o0o03 = ((o0OO0oO0) ((o0oO0Ooo) this.f14149OooO0O0).f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o03);
                oO0000O.OooO0OO(o0o0o0o03, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", strArr11);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f14148OooO00o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(o0oO0Ooo o0oo0ooo, Context context) {
        super(context, "google_app_measurement_local.db");
        Objects.requireNonNull(o0oo0ooo);
        this.f14149OooO0O0 = o0oo0ooo;
    }

    private final void OooO00o(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void OooO0O0(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void OooO0OO(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void OooO0Oo(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
