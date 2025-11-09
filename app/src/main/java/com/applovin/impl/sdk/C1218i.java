package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.i */
/* loaded from: classes.dex */
public class C1218i extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: h */
    public static int f2078h = -1;

    /* renamed from: i */
    private static final Float f2079i = Float.valueOf(15.0f);

    /* renamed from: a */
    private final AudioManager f2080a;

    /* renamed from: b */
    private final Context f2081b;

    /* renamed from: c */
    private final C1220k f2082c;

    /* renamed from: d */
    private final Set f2083d = new HashSet();

    /* renamed from: e */
    private final Object f2084e = new Object();

    /* renamed from: f */
    private boolean f2085f;

    /* renamed from: g */
    private int f2086g;

    /* renamed from: com.applovin.impl.sdk.i$a */
    public interface a {
        /* renamed from: a */
        void mo2765a(int i);
    }

    public C1218i(C1220k c1220k) {
        this.f2082c = c1220k;
        Context contextM2824o = C1220k.m2824o();
        this.f2081b = contextM2824o;
        this.f2080a = (AudioManager) contextM2824o.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    /* renamed from: a */
    public static boolean m2757a(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: d */
    private void m2759d() {
        this.f2082c.m2847O();
        if (C1240o.m3200a()) {
            this.f2082c.m2847O().m3211a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f2086g = f2078h;
        this.f2081b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* renamed from: e */
    private void m2760e() {
        this.f2082c.m2847O();
        if (C1240o.m3200a()) {
            this.f2082c.m2847O().m3211a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f2081b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    /* renamed from: b */
    public Float m2762b() {
        if (this.f2080a == null) {
            return null;
        }
        try {
            return Float.valueOf(r0.getStreamVolume(3) / m2755a().floatValue());
        } catch (Throwable th) {
            this.f2082c.m2847O();
            if (C1240o.m3200a()) {
                this.f2082c.m2847O().m3212a("AudioSessionManager", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    /* renamed from: c */
    public int m2764c() {
        return this.f2080a.getRingerMode();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            m2758b(this.f2080a.getRingerMode());
        }
    }

    /* renamed from: a */
    private Float m2755a() {
        if (this.f2080a == null) {
            return f2079i;
        }
        try {
            return Float.valueOf(r0.getStreamMaxVolume(3));
        } catch (Throwable th) {
            this.f2082c.m2847O();
            if (C1240o.m3200a()) {
                this.f2082c.m2847O().m3212a("AudioSessionManager", "Unable to collect the maximum device volume", th);
            }
            return f2079i;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f2085f = true;
            this.f2086g = this.f2080a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f2085f = false;
            if (this.f2086g != this.f2080a.getRingerMode()) {
                this.f2086g = f2078h;
                m2758b(this.f2080a.getRingerMode());
            }
        }
    }

    /* renamed from: b */
    public void m2763b(a aVar) {
        synchronized (this.f2084e) {
            try {
                if (this.f2083d.contains(aVar)) {
                    this.f2083d.remove(aVar);
                    if (this.f2083d.isEmpty()) {
                        m2760e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m2761a(a aVar) {
        synchronized (this.f2084e) {
            try {
                if (this.f2083d.contains(aVar)) {
                    return;
                }
                this.f2083d.add(aVar);
                if (this.f2083d.size() == 1) {
                    m2759d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    private void m2758b(int i) {
        if (this.f2085f) {
            return;
        }
        this.f2082c.m2847O();
        if (C1240o.m3200a()) {
            this.f2082c.m2847O().m3211a("AudioSessionManager", "Ringer mode is " + i);
        }
        synchronized (this.f2084e) {
            try {
                Iterator it = this.f2083d.iterator();
                while (it.hasNext()) {
                    AppLovinSdkUtils.runOnUiThread(new androidx.core.content.res.OooO00o((a) it.next(), i, 2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
