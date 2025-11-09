package OoooOOO;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.o00000;

/* loaded from: classes2.dex */
public final class ooOOO0Oo extends oO0Oo0o0 {

    /* renamed from: OooOoO */
    public oO0O00oO f14917OooOoO;

    /* renamed from: OooOoO0 */
    public final AlarmManager f14918OooOoO0;

    /* renamed from: OooOoOO */
    public Integer f14919OooOoOO;

    public ooOOO0Oo(oOO0000 ooo0000) {
        super(ooo0000);
        this.f14918OooOoO0 = (AlarmManager) ((o0OO0oO0) this.f14574OooOo0O).f14516OooOo0O.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    @Override // OoooOOO.oO0Oo0o0
    public final void OooOOO() {
        AlarmManager alarmManager = this.f14918OooOoO0;
        if (alarmManager != null) {
            Context context = ((o0OO0oO0) this.f14574OooOo0O).f14516OooOo0O;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), o00000.f26470OooO00o));
        }
        OooOOo0();
    }

    public final void OooOOOO() {
        OooOO0o();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14398Oooo0.OooO0O0("Unscheduling upload");
        AlarmManager alarmManager = this.f14918OooOoO0;
        if (alarmManager != null) {
            Context context = o0oo0oo0.f14516OooOo0O;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), o00000.f26470OooO00o));
        }
        OooOOOo().OooO0OO();
        OooOOo0();
    }

    public final oo0O OooOOOo() {
        if (this.f14917OooOoO == null) {
            this.f14917OooOoO = new oO0O00oO(this, this.f14916OooOo0o.f14805Oooo00O);
        }
        return this.f14917OooOoO;
    }

    public final int OooOOo() {
        if (this.f14919OooOoOO == null) {
            this.f14919OooOoOO = Integer.valueOf("measurement".concat(String.valueOf(((o0OO0oO0) this.f14574OooOo0O).f14516OooOo0O.getPackageName())).hashCode());
        }
        return this.f14919OooOoOO.intValue();
    }

    public final void OooOOo0() {
        JobScheduler jobScheduler = (JobScheduler) ((o0OO0oO0) this.f14574OooOo0O).f14516OooOo0O.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(OooOOo());
        }
    }
}
