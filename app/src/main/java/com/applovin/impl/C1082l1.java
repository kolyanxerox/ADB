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

/* renamed from: com.applovin.impl.l1 */
/* loaded from: classes.dex */
public class C1082l1 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C1220k f1049a;

    /* renamed from: b */
    private final C1021f0 f1050b;

    /* renamed from: c */
    private final Sensor f1051c;

    /* renamed from: d */
    private final a f1052d;

    /* renamed from: e */
    private float f1053e;

    /* renamed from: com.applovin.impl.l1$a */
    public interface a {
        /* renamed from: a */
        void mo547a();

        /* renamed from: b */
        void mo550b();
    }

    public C1082l1(C1220k c1220k, a aVar) {
        this.f1049a = c1220k;
        C1021f0 c1021f0 = new C1021f0();
        this.f1050b = c1021f0;
        this.f1051c = c1021f0.m710a(1);
        this.f1052d = aVar;
    }

    /* renamed from: a */
    public void m1281a() {
        if (Boolean.parseBoolean(this.f1049a.m2912o0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f1050b.m711b(this);
        this.f1050b.m712b(this, this.f1051c, (int) TimeUnit.MILLISECONDS.toMicros(50L), this.f1049a.m2847O());
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* renamed from: b */
    public void m1282b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f1050b.m711b(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f1050b.m711b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            m1281a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float fMax = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f = this.f1053e;
            float f2 = (fMax * 0.5f) + (f * 0.5f);
            this.f1053e = f2;
            if (f < 0.8f && f2 > 0.8f) {
                this.f1052d.mo547a();
            } else {
                if (f <= -0.8f || f2 >= -0.8f) {
                    return;
                }
                this.f1052d.mo550b();
            }
        }
    }
}
