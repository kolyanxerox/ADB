package o000oo00;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.util.Log;

/* loaded from: classes2.dex */
public final class OooOOOO implements NsdManager.DiscoveryListener {

    /* renamed from: OooO00o */
    public final Oooo000 f31082OooO00o;

    public OooOOOO(Oooo000 oooo000) {
        this.f31082OooO00o = oooo000;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStarted(String str) {
        Log.d("AdbMdns", "onDiscoveryStarted: " + str);
        this.f31082OooO00o.f31089OooO0O0 = true;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStopped(String str) {
        Log.d("AdbMdns", "onDiscoveryStopped: " + str);
        this.f31082OooO00o.f31089OooO0O0 = false;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        Log.d("AdbMdns", "onServiceFound: " + nsdServiceInfo.getServiceName());
        Oooo000 oooo000 = this.f31082OooO00o;
        oooo000.getClass();
        ((NsdManager) oooo000.f31094OooO0oO).resolveService(nsdServiceInfo, new OooOo(oooo000));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        Log.v("AdbMdns", "onServiceLost: " + nsdServiceInfo.getServiceName());
        Oooo000 oooo000 = this.f31082OooO00o;
        oooo000.getClass();
        if (nsdServiceInfo.getHost() != null && nsdServiceInfo.getServiceName().equals((String) oooo000.f31091OooO0Oo)) {
            ((OooOo00) oooo000.f31095OooO0oo).OooO0O0(nsdServiceInfo.getPort(), nsdServiceInfo.getHost().getHostAddress(), Oooo000.OooO00o(nsdServiceInfo.getHost()));
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStartDiscoveryFailed(String str, int i) {
        Log.d("AdbMdns", "onStartDiscoveryFailed: " + str + ", " + i);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStopDiscoveryFailed(String str, int i) {
        Log.d("AdbMdns", "onStopDiscoveryFailed: " + str + ", " + i);
    }
}
