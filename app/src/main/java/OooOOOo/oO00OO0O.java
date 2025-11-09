package OoooOOO;

import Oooo00O.o000000O;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.internal.ads.AbstractC2183w4;

/* loaded from: classes2.dex */
public final class oO00OO0O extends o0O000Oo {

    /* renamed from: OooOo, reason: collision with root package name */
    public JobScheduler f14643OooOo;

    @Override // OoooOOO.o0O000Oo
    public final boolean OooOOO() {
        return true;
    }

    public final void OooOOOO(long j) {
        OooOO0o();
        OooOO0O();
        JobScheduler jobScheduler = this.f14643OooOo;
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(o0oo0oo0.f14516OooOo0O.getPackageName())).hashCode()) != null) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14398Oooo0.OooO0O0("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iOooOOOo = OooOOOo();
        if (iOooOOOo != 2) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14398Oooo0.OooO0OO(AbstractC2183w4.OooOoo0(iOooOOOo), "[sgtm] Not eligible for Scion upload");
            return;
        }
        o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o03);
        o0o0o0o03.f14398Oooo0.OooO0OO(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(o0oo0oo0.f14516OooOo0O.getPackageName())).hashCode(), new ComponentName(o0oo0oo0.f14516OooOo0O, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f14643OooOo;
        o000000O.OooO0oo(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        o0O0O0o0 o0o0o0o04 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o04);
        o0o0o0o04.f14398Oooo0.OooO0OO(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int OooOOOo() {
        OooOO0o();
        OooOO0O();
        if (this.f14643OooOo == null) {
            return 7;
        }
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        Boolean boolOooOo0o = o0oo0oo0.f14519OooOoO0.OooOo0o("google_analytics_sgtm_upload_enabled");
        if (!(boolOooOo0o == null ? false : boolOooOo0o.booleanValue())) {
            return 8;
        }
        if (o0oo0oo0.OooOOo().f14342OooOooo < 119000) {
            return 6;
        }
        if (oOO00OO.OooOooO(o0oo0oo0.f14516OooOo0O)) {
            return !o0oo0oo0.OooOOOo().OooOOo() ? 5 : 2;
        }
        return 3;
    }
}
