package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.ironsource.InterfaceC3771vj;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public final class j11 extends rj0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final byte[] f20147OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final DatagramPacket f20148OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public DatagramSocket f20149OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public Uri f20150OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public MulticastSocket f20151OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public InetAddress f20152OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public boolean f20153Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public int f20154Oooo00O;

    public j11() {
        super(true);
        byte[] bArr = new byte[IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL];
        this.f20147OooOoO = bArr;
        this.f20148OooOoOO = new DatagramPacket(bArr, 0, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL);
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final long OooO0Oo(iq0 iq0Var) throws IOException {
        Uri uri = iq0Var.f20087OooO00o;
        this.f20150OooOoo0 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f20150OooOoo0.getPort();
        OooO0oO(iq0Var);
        try {
            this.f20152OooOooo = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f20152OooOooo, port);
            if (this.f20152OooOooo.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f20151OooOooO = multicastSocket;
                multicastSocket.joinGroup(this.f20152OooOooo);
                this.f20149OooOoo = this.f20151OooOooO;
            } else {
                this.f20149OooOoo = new DatagramSocket(inetSocketAddress);
            }
            this.f20149OooOoo.setSoTimeout(8000);
            this.f20153Oooo000 = true;
            OooO(iq0Var);
            return -1L;
        } catch (IOException e) {
            throw new s01(e, 2001);
        } catch (SecurityException e2) {
            throw new s01(e2, InterfaceC3771vj.a.f12374f);
        }
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final int OooOO0(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f20154Oooo00O;
        DatagramPacket datagramPacket = this.f20148OooOoOO;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f20149OooOoo;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f20154Oooo00O = length;
                OooO00o(length);
            } catch (SocketTimeoutException e) {
                throw new s01(e, InterfaceC3771vj.b.f12380b);
            } catch (IOException e2) {
                throw new s01(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f20154Oooo00O;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f20147OooOoO, length2 - i4, bArr, i, iMin);
        this.f20154Oooo00O -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final Uri zzc() {
        return this.f20150OooOoo0;
    }

    @Override // com.google.android.gms.internal.ads.zm0
    public final void zzd() throws IOException {
        InetAddress inetAddress;
        this.f20150OooOoo0 = null;
        MulticastSocket multicastSocket = this.f20151OooOooO;
        if (multicastSocket != null) {
            try {
                inetAddress = this.f20152OooOooo;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.f20151OooOooO = null;
        }
        DatagramSocket datagramSocket = this.f20149OooOoo;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f20149OooOoo = null;
        }
        this.f20152OooOooo = null;
        this.f20154Oooo00O = 0;
        if (this.f20153Oooo000) {
            this.f20153Oooo000 = false;
            OooO0OO();
        }
    }
}
