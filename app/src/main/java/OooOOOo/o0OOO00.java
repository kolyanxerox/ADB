package OoooOOO;

import Oooo00O.o000000O;
import Oooo0OO.oo000o;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0OOO00 implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ o0OOo000 f14550OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14551OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ oOO0 f14552OooOo0o;

    public /* synthetic */ o0OOO00(o0OOo000 o0ooo000, oOO0 ooo0, int i, boolean z) {
        this.f14551OooOo0O = i;
        this.f14550OooOo = o0ooo000;
        this.f14552OooOo0o = ooo0;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f14551OooOo0O) {
            case 0:
                o0OOo000 o0ooo000 = this.f14550OooOo;
                o0ooo000.f14568OooOo0O.OooOoo0();
                o0ooo000.f14568OooOo0O.OoooOo0(this.f14552OooOo0o);
                break;
            case 1:
                o0OOo000 o0ooo0002 = this.f14550OooOo;
                o0ooo0002.f14568OooOo0O.OooOoo0();
                oOO0000 ooo0000 = o0ooo0002.f14568OooOo0O;
                ooo0000.OooO0O0().OooOO0O();
                ooo0000.ooOO();
                oOO0 ooo0 = this.f14552OooOo0o;
                o000000O.OooO0oo(ooo0);
                String str = ooo0.zza;
                o000000O.OooO0o0(str);
                int i = 0;
                if (ooo0000.OooooOO().OooOo0(null, o0O000O.f14326o0OO00O)) {
                    ((oo000o) ooo0000.OooO0o0()).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iOooOOoo = ooo0000.OooooOO().OooOOoo(null, o0O000O.f14281OoooooO);
                    ooo0000.OooooOO();
                    long jLongValue = jCurrentTimeMillis - ((Long) o0O000O.f14230OooO0o0.OooO00o(null)).longValue();
                    while (i < iOooOOoo && ooo0000.Oooo0(jLongValue, null)) {
                        i++;
                    }
                } else {
                    ooo0000.OooooOO();
                    long jIntValue = ((Integer) o0O000O.OooOO0o.OooO00o(null)).intValue();
                    while (i < jIntValue && ooo0000.Oooo0(0L, str)) {
                        i++;
                    }
                }
                if (ooo0000.OooooOO().OooOo0(null, o0O000O.f14332oo0o0Oo)) {
                    ooo0000.OooO0O0().OooOO0O();
                    ooo0000.Oooo00o();
                }
                int iOooO0OO = AbstractC2183w4.OooO0OO(ooo0.zzE);
                oO0oO000 oo0oo000 = ooo0000.f14801OooOooo;
                oo0oo000.OooOO0O();
                if (iOooO0OO == 2 && !oO0oO000.OooOOO(str)) {
                    o0OO00o0 o0oo00o0 = oo0oo000.f14916OooOo0o.f14793OooOo0O;
                    oOO0000.OoooOO0(o0oo00o0);
                    com.google.android.gms.internal.measurement.o00OOO0O o00ooo0oOooOo0o = o0oo00o0.OooOo0o(str);
                    if (o00ooo0oOooOo0o != null && o00ooo0oOooOo0o.OooOooO() && !o00ooo0oOooOo0o.OooOooo().OooOOo0().isEmpty()) {
                        ooo0000.OooO00o().f14398Oooo0.OooO0OO(str, "[sgtm] Going background, trigger client side upload. appId");
                        ((oo000o) ooo0000.OooO0o0()).getClass();
                        ooo0000.OooOOo(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 2:
                o0OOo000 o0ooo0003 = this.f14550OooOo;
                o0ooo0003.f14568OooOo0O.OooOoo0();
                oOO0000 ooo00002 = o0ooo0003.f14568OooOo0O;
                ooo00002.OooO0O0().OooOO0O();
                ooo00002.ooOO();
                oOO0 ooo02 = this.f14552OooOo0o;
                o000000O.OooO0o0(ooo02.zza);
                ooo00002.Ooooo0o(ooo02);
                break;
            case 3:
                o0OOo000 o0ooo0004 = this.f14550OooOo;
                o0ooo0004.f14568OooOo0O.OooOoo0();
                oOO0000 ooo00003 = o0ooo0004.f14568OooOo0O;
                if (ooo00003.f14813OoooO != null) {
                    ArrayList arrayList = new ArrayList();
                    ooo00003.f14817OoooOO0 = arrayList;
                    arrayList.addAll(ooo00003.f14813OoooO);
                }
                o00OO0OO o00oo0oo = ooo00003.f14792OooOo;
                oOO0000.OoooOO0(o00oo0oo);
                o0OO0oO0 o0oo0oo0 = (o0OO0oO0) o00oo0oo.f14574OooOo0O;
                oOO0 ooo03 = this.f14552OooOo0o;
                String str2 = ooo03.zza;
                o000000O.OooO0oo(str2);
                o000000O.OooO0o0(str2);
                o00oo0oo.OooOO0O();
                o00oo0oo.OooOO0o();
                try {
                    SQLiteDatabase sQLiteDatabaseOoooOoO = o00oo0oo.OoooOoO();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseOoooOoO.delete("apps", "app_id=?", strArr) + sQLiteDatabaseOoooOoO.delete("events", "app_id=?", strArr) + sQLiteDatabaseOoooOoO.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseOoooOoO.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseOoooOoO.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseOoooOoO.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseOoooOoO.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseOoooOoO.delete("queue", "app_id=?", strArr) + sQLiteDatabaseOoooOoO.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseOoooOoO.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseOoooOoO.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseOoooOoO.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseOoooOoO.delete("upload_queue", "app_id=?", strArr);
                    if (o0oo0oo0.f14519OooOoO0.OooOo0(null, o0O000O.f14307o0000o)) {
                        iDelete += sQLiteDatabaseOoooOoO.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (iDelete > 0) {
                        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o0);
                        o0o0o0o0.f14398Oooo0.OooO0Oo(str2, "Reset analytics data. app, records", Integer.valueOf(iDelete));
                    }
                } catch (SQLiteException e) {
                    o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o02);
                    o0o0o0o02.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str2), "Error resetting analytics data. appId, error", e);
                }
                if (ooo03.zzh) {
                    ooo00003.OoooOo0(ooo03);
                    break;
                }
                break;
            case 4:
                o0OOo000 o0ooo0005 = this.f14550OooOo;
                o0ooo0005.f14568OooOo0O.OooOoo0();
                oOO0000 ooo00004 = o0ooo0005.f14568OooOo0O;
                ooo00004.OooO0O0().OooOO0O();
                ooo00004.ooOO();
                oOO0 ooo04 = this.f14552OooOo0o;
                o000000O.OooO0o0(ooo04.zza);
                ooo00004.o00O0O(ooo04);
                ooo00004.o00Oo0(ooo04);
                break;
            case 5:
                oOO0000 ooo00005 = this.f14550OooOo.f14568OooOo0O;
                ooo00005.OooOoo0();
                ooo00005.o00Oo0(this.f14552OooOo0o);
                break;
            default:
                oOO0000 ooo00006 = this.f14550OooOo.f14568OooOo0O;
                ooo00006.OooOoo0();
                ooo00006.o00O0O(this.f14552OooOo0o);
                break;
        }
    }

    public o0OOO00(o0OOo000 o0ooo000, oOO0 ooo0, int i) {
        this.f14551OooOo0O = i;
        switch (i) {
            case 1:
                this.f14552OooOo0o = ooo0;
                Objects.requireNonNull(o0ooo000);
                this.f14550OooOo = o0ooo000;
                break;
            case 2:
                this.f14552OooOo0o = ooo0;
                Objects.requireNonNull(o0ooo000);
                this.f14550OooOo = o0ooo000;
                break;
            case 3:
                this.f14552OooOo0o = ooo0;
                Objects.requireNonNull(o0ooo000);
                this.f14550OooOo = o0ooo000;
                break;
            case 4:
                this.f14552OooOo0o = ooo0;
                Objects.requireNonNull(o0ooo000);
                this.f14550OooOo = o0ooo000;
                break;
            default:
                this.f14552OooOo0o = ooo0;
                Objects.requireNonNull(o0ooo000);
                this.f14550OooOo = o0ooo000;
                break;
        }
    }
}
