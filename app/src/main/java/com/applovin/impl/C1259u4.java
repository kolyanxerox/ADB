package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.u4 */
/* loaded from: classes.dex */
public class C1259u4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final int f2446a;

    /* renamed from: b */
    private final float f2447b;

    /* renamed from: c */
    private final C1021f0 f2448c;

    /* renamed from: d */
    private final Sensor f2449d;

    /* renamed from: e */
    private final Sensor f2450e;

    /* renamed from: f */
    private final C1220k f2451f;

    /* renamed from: g */
    private float[] f2452g;

    /* renamed from: h */
    private float f2453h;

    public C1259u4(C1220k c1220k) {
        this.f2451f = c1220k;
        C1021f0 c1021f0 = new C1021f0();
        this.f2448c = c1021f0;
        this.f2449d = c1021f0.m710a(9);
        this.f2450e = c1021f0.m710a(4);
        this.f2446a = ((Integer) c1220k.m2866a(C1268v4.f2776e4)).intValue();
        this.f2447b = ((Float) c1220k.m2866a(C1268v4.f2768d4)).floatValue();
    }

    /* renamed from: a */
    public float m3398a() {
        if (this.f2452g == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    /* renamed from: b */
    public float m3399b() {
        return this.f2453h;
    }

    /* renamed from: c */
    public void m3400c() {
        if (Boolean.parseBoolean(this.f2451f.m2912o0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f2448c.m711b(this);
        if (((Boolean) this.f2451f.m2914p0().m3607a(C1268v4.f2750b4)).booleanValue()) {
            this.f2448c.m712b(this, this.f2449d, (int) TimeUnit.MILLISECONDS.toMicros(this.f2446a), this.f2451f.m2847O());
        }
        if (((Boolean) this.f2451f.m2914p0().m3607a(C1268v4.f2759c4)).booleanValue()) {
            this.f2448c.m712b(this, this.f2450e, (int) TimeUnit.MILLISECONDS.toMicros(this.f2446a), this.f2451f.m2847O());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f2448c.m711b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            m3400c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f2452g = sensorEvent.values;
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float f = this.f2453h * this.f2447b;
            this.f2453h = f;
            this.f2453h = Math.abs(sensorEvent.values[2]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[0]) + f;
        }
    }
}
