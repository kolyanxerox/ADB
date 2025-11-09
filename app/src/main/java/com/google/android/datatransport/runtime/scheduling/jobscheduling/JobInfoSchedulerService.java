package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import OooO0Oo.OooO0O0;
import OooOOO.OooO0OO;
import OooOOo0.OooOo;
import OooOOo0.o0Oo0oo;
import OooOo0o.OooOOOO;
import OooOo0o.Oooo0;
import OooOoOO.o000;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 21)
/* loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: OooOo0O */
    public static final /* synthetic */ int f15873OooOo0O = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        o0Oo0oo.OooO0O0(getApplicationContext());
        if (string == null) {
            throw new NullPointerException("Null backendName");
        }
        OooO0OO oooO0OOOooO0O0 = o000.OooO0O0(i);
        byte[] bArrDecode = string2 != null ? Base64.decode(string2, 0) : null;
        Oooo0 oooo0 = o0Oo0oo.OooO00o().f13526OooO0Oo;
        OooOo oooOo = new OooOo(string, bArrDecode, oooO0OOOooO0O0);
        OooO0O0 oooO0O0 = new OooO0O0(2, this, jobParameters);
        oooo0.getClass();
        oooo0.f13636OooO0o0.execute(new OooOOOO(oooo0, oooOo, i2, oooO0O0, 0));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
