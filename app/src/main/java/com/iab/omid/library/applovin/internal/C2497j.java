package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.applovin.adsession.C2480a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: com.iab.omid.library.applovin.internal.j */
/* loaded from: classes2.dex */
public class C2497j {

    /* renamed from: d */
    @SuppressLint({"StaticFieldLeak"})
    private static C2497j f3505d = new C2497j();

    /* renamed from: a */
    private WeakReference<Context> f3506a;

    /* renamed from: b */
    private boolean f3507b = false;

    /* renamed from: c */
    private boolean f3508c = false;

    /* renamed from: com.iab.omid.library.applovin.internal.j$a */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C2497j c2497j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c2497j = C2497j.this;
                z = c2497j.f3508c;
                z2 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                c2497j = C2497j.this;
                z = c2497j.f3508c;
                z2 = false;
            }
            c2497j.m4087a(z2, z);
            C2497j.this.f3507b = z2;
        }
    }

    /* renamed from: b */
    public static C2497j m4084b() {
        return f3505d;
    }

    /* renamed from: a */
    public void m4085a() {
        Context context = this.f3506a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m4087a(this.f3507b, zIsDeviceLocked);
        this.f3508c = zIsDeviceLocked;
    }

    /* renamed from: a */
    public void m4086a(Context context) {
        if (context == null) {
            return;
        }
        this.f3506a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    /* renamed from: a */
    public void m4087a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f3508c || this.f3507b)) {
            return;
        }
        Iterator<C2480a> it = C2490c.m4029c().m4032b().iterator();
        while (it.hasNext()) {
            it.next().m3987d().m4113b(z2 || z);
        }
    }
}
