package com.google.android.gms.measurement;

import OoooOOO.o0O0O0o0;
import OoooOOO.o0OO0oO0;
import OoooOOO.o0OOo000;
import OoooOOO.oO0O000o;
import OoooOOO.oOO0000;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import o00000oO.OooOOO0;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements oO0O000o {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public OooOO0 f27226OooOo0O;

    @Override // OoooOOO.oO0O000o
    public final boolean OooO00o(int i) {
        return stopSelfResult(i);
    }

    @Override // OoooOOO.oO0O000o
    public final void OooO0O0(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    @Override // OoooOOO.oO0O000o
    public final void OooO0OO(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final OooOO0 OooO0Oo() {
        if (this.f27226OooOo0O == null) {
            this.f27226OooOo0O = new OooOO0(this, 14);
        }
        return this.f27226OooOo0O;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        OooOO0 oooOO0OooO0Oo = OooO0Oo();
        oooOO0OooO0Oo.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new o0OOo000(oOO0000.OooOoo((Service) oooOO0OooO0Oo.f30538OooOo0o));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final OooOO0 oooOO0OooO0Oo = OooO0Oo();
        if (intent == null) {
            oooOO0OooO0Oo.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) oooOO0OooO0Oo.f30538OooOo0o;
        final o0O0O0o0 o0o0o0o0 = o0OO0oO0.OooOOoo(service, null, null).f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        String action = intent.getAction();
        o0o0o0o0.f14398Oooo0.OooO0Oo(Integer.valueOf(i2), "Local AppMeasurementService called. startId, action", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: OoooOOO.oO0O00
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) oooOO0OooO0Oo.f30538OooOo0o;
                oO0O000o oo0o000o = (oO0O000o) service2;
                int i3 = i2;
                if (oo0o000o.OooO00o(i3)) {
                    o0o0o0o0.f14398Oooo0.OooO0OO(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    o0O0O0o0 o0o0o0o02 = o0OO0oO0.OooOOoo(service2, null, null).f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o02);
                    o0o0o0o02.f14398Oooo0.OooO0O0("Completed wakeful intent.");
                    oo0o000o.OooO0O0(intent);
                }
            }
        };
        oOO0000 ooo0000OooOoo = oOO0000.OooOoo(service);
        ooo0000OooOoo.OooO0O0().OooOo00(new OooOOO0(oooOO0OooO0Oo, ooo0000OooOoo, runnable));
        return 2;
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
