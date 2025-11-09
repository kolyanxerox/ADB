package o000oo00;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

/* loaded from: classes2.dex */
public final class OooOo implements NsdManager.ResolveListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Oooo000 f31083OooO00o;

    public OooOo(Oooo000 oooo000) {
        this.f31083OooO00o = oooo000;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onServiceResolved(NsdServiceInfo nsdServiceInfo) throws IOException {
        Oooo000 oooo000 = this.f31083OooO00o;
        if (oooo000.f31090OooO0OO) {
            int port = nsdServiceInfo.getPort();
            try {
                ServerSocket serverSocket = new ServerSocket();
                try {
                    serverSocket.bind(new InetSocketAddress("127.0.0.1", port), 1);
                    serverSocket.close();
                } finally {
                }
            } catch (IOException unused) {
                oooo000.f31091OooO0Oo = nsdServiceInfo.getServiceName();
                boolean zOooO00o = Oooo000.OooO00o(nsdServiceInfo.getHost());
                ((OooOo00) oooo000.f31095OooO0oo).OooO0O0(nsdServiceInfo.getPort(), nsdServiceInfo.getHost().getHostAddress(), zOooO00o);
            }
        }
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
    }
}
