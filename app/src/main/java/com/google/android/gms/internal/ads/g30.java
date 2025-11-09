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
public final class g30 extends qj0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final SensorManager f19200OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Sensor f19201OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public long f19202OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f19204OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public boolean f19205OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public boolean f19206OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public p30 f19207OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public boolean f19208OooOooo;

    /* renamed from: OooOo, reason: collision with root package name */
    public float f19199OooOo = 0.0f;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public Float f19203OooOoO0 = Float.valueOf(0.0f);

    public g30(Context context) {
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        this.f19202OooOoO = System.currentTimeMillis();
        this.f19204OooOoOO = 0;
        this.f19206OooOoo0 = false;
        this.f19205OooOoo = false;
        this.f19207OooOooO = null;
        this.f19208OooOooo = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f19200OooOo0O = sensorManager;
        if (sensorManager != null) {
            this.f19201OooOo0o = sensorManager.getDefaultSensor(4);
        } else {
            this.f19201OooOo0o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void OooO00o(SensorEvent sensorEvent) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOO0)).booleanValue()) {
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f19202OooOoO + ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOO)).intValue() < jCurrentTimeMillis) {
                this.f19204OooOoOO = 0;
                this.f19202OooOoO = jCurrentTimeMillis;
                this.f19206OooOoo0 = false;
                this.f19205OooOoo = false;
                this.f19199OooOo = this.f19203OooOoO0.floatValue();
            }
            float fFloatValue = this.f19203OooOoO0.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.f19203OooOoO0 = Float.valueOf(fFloatValue);
            float f = this.f19199OooOo;
            C2148v6 c2148v6 = AbstractC1448c7.o0OOOO0o;
            if (fFloatValue > ((Float) zzbe.zzc().OooO00o(c2148v6)).floatValue() + f) {
                this.f19199OooOo = this.f19203OooOoO0.floatValue();
                this.f19205OooOoo = true;
            } else if (this.f19203OooOoO0.floatValue() < this.f19199OooOo - ((Float) zzbe.zzc().OooO00o(c2148v6)).floatValue()) {
                this.f19199OooOo = this.f19203OooOoO0.floatValue();
                this.f19206OooOoo0 = true;
            }
            if (this.f19203OooOoO0.isInfinite()) {
                this.f19203OooOoO0 = Float.valueOf(0.0f);
                this.f19199OooOo = 0.0f;
            }
            if (this.f19206OooOoo0 && this.f19205OooOoo) {
                zze.zza("Flick detected.");
                this.f19202OooOoO = jCurrentTimeMillis;
                int i = this.f19204OooOoOO + 1;
                this.f19204OooOoOO = i;
                this.f19206OooOoo0 = false;
                this.f19205OooOoo = false;
                p30 p30Var = this.f19207OooOooO;
                if (p30Var != null) {
                    if (i == ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOO0)).intValue()) {
                        p30Var.OooO0Oo(new n30(1), o30.f22322OooOo);
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
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOO0)).booleanValue()) {
                    if (!this.f19208OooOooo && (sensorManager = this.f19200OooOo0O) != null && (sensor = this.f19201OooOo0o) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f19208OooOooo = true;
                        zze.zza("Listening for flick gestures.");
                    }
                    if (this.f19200OooOo0O == null || this.f19201OooOo0o == null) {
                        zzo.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
