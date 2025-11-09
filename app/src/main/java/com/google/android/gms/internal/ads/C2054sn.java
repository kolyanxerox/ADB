package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.sn */
/* loaded from: classes2.dex */
public final class C2054sn extends SSLSocketFactory {

    /* renamed from: OooO00o */
    public final SSLSocketFactory f24126OooO00o = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: OooO0O0 */
    public final /* synthetic */ C2091tn f24127OooO0O0;

    public C2054sn(C2091tn c2091tn) {
        this.f24127OooO0O0 = c2091tn;
    }

    public final void OooO00o(Socket socket) throws SocketException {
        C2091tn c2091tn = this.f24127OooO0O0;
        int i = c2091tn.f24363Oooo0o;
        if (i > 0) {
            socket.setReceiveBufferSize(i);
        }
        c2091tn.f24365Oooo0oO.add(socket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f24126OooO00o.createSocket(str, i);
        OooO00o(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f24126OooO00o.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f24126OooO00o.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f24126OooO00o.createSocket(str, i, inetAddress, i2);
        OooO00o(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f24126OooO00o.createSocket(inetAddress, i);
        OooO00o(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.f24126OooO00o.createSocket(inetAddress, i, inetAddress2, i2);
        OooO00o(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f24126OooO00o.createSocket(socket, str, i, z);
        OooO00o(socketCreateSocket);
        return socketCreateSocket;
    }
}
