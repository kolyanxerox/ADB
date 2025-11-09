package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

/* loaded from: classes2.dex */
public final class z30 extends qj0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public Sensor f26070OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f26071OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public SensorManager f26072OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f26073OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public long f26074OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public p30 f26075OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public boolean f26076OooOoo0;

    public z30(Context context) {
        this.f26071OooOo0O = context;
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void OooO00o(SensorEvent sensorEvent) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0o0)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            float f4 = f3 * f3;
            if (((float) Math.sqrt(f4 + (f2 * f2) + (f * f))) >= ((Float) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0oO)).floatValue()) {
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f26074OooOoO0 + ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0oo)).intValue() <= jCurrentTimeMillis) {
                    if (this.f26074OooOoO0 + ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOoO)).intValue() < jCurrentTimeMillis) {
                        this.f26073OooOoO = 0;
                    }
                    zze.zza("Shake detected.");
                    this.f26074OooOoO0 = jCurrentTimeMillis;
                    int i = this.f26073OooOoO + 1;
                    this.f26073OooOoO = i;
                    p30 p30Var = this.f26075OooOoOO;
                    if (p30Var != null) {
                        if (i == ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOO00)).intValue()) {
                            p30Var.OooO0Oo(new n30(0), o30.f22322OooOo);
                        }
                    }
                }
            }
        }
    }

    public final void OooO0O0() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0o0)).booleanValue()) {
                    if (this.f26072OooOo0o == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f26071OooOo0O.getSystemService("sensor");
                        this.f26072OooOo0o = sensorManager2;
                        if (sensorManager2 == null) {
                            zzo.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f26070OooOo = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f26076OooOoo0 && (sensorManager = this.f26072OooOo0o) != null && (sensor = this.f26070OooOo) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                        this.f26074OooOoO0 = System.currentTimeMillis() - ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0oo)).intValue();
                        this.f26076OooOoo0 = true;
                        zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
