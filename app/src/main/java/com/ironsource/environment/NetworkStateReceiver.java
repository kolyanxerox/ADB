package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.C3551q9;
import com.ironsource.InterfaceC3125fp;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* loaded from: classes2.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private ConnectivityManager f8439a;

    /* renamed from: b */
    private InterfaceC3125fp f8440b;

    /* renamed from: c */
    private boolean f8441c = false;

    /* renamed from: com.ironsource.environment.NetworkStateReceiver$a */
    public class RunnableC3085a implements Runnable {
        public RunnableC3085a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetworkStateReceiver.this.f8440b != null) {
                NetworkStateReceiver.this.f8440b.mo8733a(NetworkStateReceiver.this.f8441c);
            }
        }
    }

    public NetworkStateReceiver(Context context, InterfaceC3125fp interfaceC3125fp) {
        this.f8440b = interfaceC3125fp;
        if (context != null) {
            this.f8439a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        m8529a();
    }

    /* renamed from: b */
    private void m8530b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new RunnableC3085a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !m8529a()) {
            return;
        }
        m8530b();
    }

    /* renamed from: a */
    private boolean m8529a() {
        boolean z = this.f8441c;
        ConnectivityManager connectivityManager = this.f8439a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.f8441c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
            }
        } else {
            this.f8441c = false;
        }
        return z != this.f8441c;
    }
}
