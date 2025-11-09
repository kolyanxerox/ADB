package com.google.android.gms.measurement;

import Oooo00O.o000000O;
import OoooO0O.o00000OO;
import OoooOOO.o0O0O0o0;
import OoooOOO.oO0O000o;
import OoooOOO.oOO0000;
import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.internal.measurement.o000O0O0;
import com.google.android.gms.internal.measurement.o00O00OO;
import java.util.Objects;
import o00000oO.OooOOO0;
import o000OOoO.OooO;
import o000Ooo0.OooOO0;

@TargetApi(24)
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements oO0O000o {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public OooOO0 f27224OooOo0O;

    @Override // OoooOOO.oO0O000o
    public final boolean OooO00o(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // OoooOOO.oO0O000o
    public final void OooO0O0(Intent intent) {
    }

    @Override // OoooOOO.oO0O000o
    public final void OooO0OO(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final OooOO0 OooO0Oo() {
        if (this.f27224OooOo0O == null) {
            this.f27224OooOo0O = new OooOO0(this, 14);
        }
        return this.f27224OooOo0O;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) OooO0Oo().f30538OooOo0o).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) OooO0Oo().f30538OooOo0o).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        OooO0Oo();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        OooOO0 oooOO0OooO0Oo = OooO0Oo();
        oooOO0OooO0Oo.getClass();
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        boolean zEquals = Objects.equals(string, "com.google.android.gms.measurement.UPLOAD");
        Service service = (Service) oooOO0OooO0Oo.f30538OooOo0o;
        if (zEquals) {
            o000000O.OooO0oo(string);
            oOO0000 ooo0000OooOoo = oOO0000.OooOoo(service);
            o0O0O0o0 o0o0o0o0OooO00o = ooo0000OooOoo.OooO00o();
            OooO oooO = ooo0000OooOoo.f14805Oooo00O.f14515OooOo;
            o0o0o0o0OooO00o.f14398Oooo0.OooO0OO(string, "Local AppMeasurementJobService called. action");
            ooo0000OooOoo.OooO0O0().OooOo00(new OooOOO0(oooOO0OooO0Oo, ooo0000OooOoo, new o00000OO(oooOO0OooO0Oo, o0o0o0o0OooO00o, jobParameters, 10)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        o000000O.OooO0oo(string);
        o00O00OO o00o00ooOooO0o0 = o00O00OO.OooO0o0(service, null);
        OooOOO0 oooOOO0 = new OooOOO0(18, oooOO0OooO0Oo, jobParameters);
        o00o00ooOooO0o0.getClass();
        o00o00ooOooO0o0.OooO0OO(new o000O0O0(o00o00ooOooO0o0, oooOOO0, 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        OooO0Oo();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
