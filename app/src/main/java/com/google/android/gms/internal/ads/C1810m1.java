package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.google.android.gms.internal.ads.m1 */
/* loaded from: classes2.dex */
public final class C1810m1 extends ConnectivityManager.NetworkCallback {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f21010OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f21011OooO0O0;

    public /* synthetic */ C1810m1(Object obj, int i) {
        this.f21010OooO00o = i;
        this.f21011OooO0O0 = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f21010OooO00o) {
            case 1:
                ((C1978ql) this.f21011OooO0O0).f23640OooOOOO.set(true);
                break;
            case 2:
                rg0.OooO0O0((rg0) this.f21011OooO0O0, true);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f21010OooO00o) {
            case 0:
                synchronized (C1847n1.class) {
                    ((C1847n1) this.f21011OooO0O0).f21381OooOo0o = networkCapabilities;
                }
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f21010OooO00o) {
            case 0:
                synchronized (C1847n1.class) {
                    ((C1847n1) this.f21011OooO0O0).f21381OooOo0o = null;
                }
                return;
            case 1:
                ((C1978ql) this.f21011OooO0O0).f23640OooOOOO.set(false);
                return;
            default:
                rg0.OooO0O0((rg0) this.f21011OooO0O0, false);
                return;
        }
    }
}
