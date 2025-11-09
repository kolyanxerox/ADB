package OooOo0o;

import OooOOO.OooO0OO;
import OooOOo0.oo000o;
import OooOo.OooO0o;
import OooOoOO.o000;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.o0OO00OO;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: classes2.dex */
public final class OooOOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f13616OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0o f13617OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0 f13618OooO0OO;

    public OooOOO0(Context context, OooO0o oooO0o, OooOO0 oooOO0) {
        this.f13616OooO00o = context;
        this.f13617OooO0O0 = oooO0o;
        this.f13618OooO0OO = oooOO0;
    }

    public final void OooO00o(oo000o oo000oVar, int i, boolean z) {
        Context context = this.f13616OooO00o;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        OooOOo0.OooOo oooOo = (OooOOo0.OooOo) oo000oVar;
        adler32.update(oooOo.f13486OooO00o.getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(o000.OooO00o(oooOo.f13488OooO0OO)).array());
        byte[] bArr = oooOo.f13487OooO0O0;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        o0OO00OO.OooO0oo("JobInfoScheduler", oo000oVar, "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor cursorRawQuery = ((OooOo.OooOo) this.f13617OooO0O0).OooO00o().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oooOo.f13486OooO00o, String.valueOf(o000.OooO00o(oooOo.f13488OooO0OO))});
        try {
            Cursor cursor = cursorRawQuery;
            Long lValueOf = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            OooOOo0.OooOo oooOo2 = (OooOOo0.OooOo) oo000oVar;
            OooOO0 oooOO0 = this.f13618OooO0OO;
            OooO0OO oooO0OO = oooOo2.f13488OooO0OO;
            builder.setMinimumLatency(oooOO0.OooO00o(oooO0OO, jLongValue, i));
            Set set = ((OooOO0O) oooOO0.f13608OooO0O0.get(oooO0OO)).f13611OooO0OO;
            if (set.contains(OooOOO.f13613OooOo0O)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(OooOOO.f13612OooOo)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(OooOOO.f13614OooOo0o)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", oooOo2.f13486OooO00o);
            persistableBundle.putInt("priority", o000.OooO00o(oooO0OO));
            byte[] bArr2 = oooOo2.f13487OooO0O0;
            if (bArr2 != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr2, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {oo000oVar, Integer.valueOf(value), Long.valueOf(oooOO0.OooO00o(oooO0OO, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            String strOooOo0O = o0OO00OO.OooOo0O("JobInfoScheduler");
            if (Log.isLoggable(strOooOo0O, 3)) {
                Log.d(strOooOo0O, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
