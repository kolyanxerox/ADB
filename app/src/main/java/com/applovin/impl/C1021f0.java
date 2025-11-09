package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;

/* renamed from: com.applovin.impl.f0 */
/* loaded from: classes.dex */
public class C1021f0 {

    /* renamed from: a */
    private final SensorManager f737a = (SensorManager) C1220k.m2824o().getSystemService("sensor");

    /* renamed from: b */
    private Handler f738b;

    public C1021f0() {
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
        handlerThread.start();
        this.f738b = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public Sensor m710a(int i) {
        return this.f737a.getDefaultSensor(i);
    }

    /* renamed from: b */
    public void m712b(SensorEventListener sensorEventListener, Sensor sensor, int i, C1240o c1240o) {
        this.f738b.post(new o000oOoO(this, sensorEventListener, sensor, i, c1240o));
    }

    /* renamed from: a */
    public /* synthetic */ void m709a(SensorEventListener sensorEventListener, Sensor sensor, int i, C1240o c1240o) {
        try {
            this.f737a.registerListener(sensorEventListener, sensor, i, this.f738b);
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                c1240o.m3212a("BackgroundSensorManager", "Unable to register sensor listener", th);
            }
        }
    }

    /* renamed from: b */
    public void m711b(SensorEventListener sensorEventListener) {
        this.f738b.post(new OooO(7, this, sensorEventListener));
    }

    /* renamed from: a */
    public /* synthetic */ void m708a(SensorEventListener sensorEventListener) {
        this.f737a.unregisterListener(sensorEventListener);
    }
}
