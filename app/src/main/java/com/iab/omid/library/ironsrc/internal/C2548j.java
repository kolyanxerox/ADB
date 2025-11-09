package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.ironsrc.adsession.C2531a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: com.iab.omid.library.ironsrc.internal.j */
/* loaded from: classes2.dex */
public class C2548j {

    /* renamed from: d */
    @SuppressLint({"StaticFieldLeak"})
    private static C2548j f3640d = new C2548j();

    /* renamed from: a */
    private WeakReference<Context> f3641a;

    /* renamed from: b */
    private boolean f3642b = false;

    /* renamed from: c */
    private boolean f3643c = false;

    /* renamed from: com.iab.omid.library.ironsrc.internal.j$a */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C2548j c2548j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c2548j = C2548j.this;
                z = c2548j.f3643c;
                z2 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                c2548j = C2548j.this;
                z = c2548j.f3643c;
                z2 = false;
            }
            c2548j.m4340a(z2, z);
            C2548j.this.f3642b = z2;
        }
    }

    /* renamed from: b */
    public static C2548j m4337b() {
        return f3640d;
    }

    /* renamed from: a */
    public void m4338a() {
        Context context = this.f3641a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m4340a(this.f3642b, zIsDeviceLocked);
        this.f3643c = zIsDeviceLocked;
    }

    /* renamed from: a */
    public void m4339a(Context context) {
        if (context == null) {
            return;
        }
        this.f3641a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    /* renamed from: a */
    public void m4340a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f3643c || this.f3642b)) {
            return;
        }
        Iterator<C2531a> it = C2541c.m4282c().m4285b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m4366b(z2 || z);
        }
    }
}
