package com.google.android.gms.measurement;

import OoooOOO.o0O0O0o0;
import OoooOOO.o0O0oo0o;
import OoooOOO.o0OO0oO0;
import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver {

    /* renamed from: OooO00o, reason: collision with root package name */
    public OooOO0 f27225OooO00o;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f27225OooO00o == null) {
            this.f27225OooO00o = new OooOO0(this, 11);
        }
        OooOO0 oooOO0 = this.f27225OooO00o;
        oooOO0.getClass();
        o0O0O0o0 o0o0o0o0 = o0OO0oO0.OooOOoo(context, null, null).f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0O0oo0o o0o0oo0o = o0o0o0o0.f14396OooOooO;
        if (intent == null) {
            o0o0oo0o.OooO0O0("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        o0O0oo0o o0o0oo0o2 = o0o0o0o0.f14398Oooo0;
        o0o0oo0o2.OooO0OO(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                o0o0oo0o.OooO0O0("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            o0o0oo0o2.OooO0O0("Starting wakeful intent.");
            ((AppMeasurementReceiver) oooOO0.f30538OooOo0o).getClass();
            WakefulBroadcastReceiver.startWakefulService(context, className);
        }
    }
}
