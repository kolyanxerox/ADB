package com.google.android.gms.internal.ads;

import com.google.protobuf.Internal;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class l01 extends InputStream {

    /* renamed from: OooOo, reason: collision with root package name */
    public ByteBuffer f20756OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f20757OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f20758OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f20759OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f20760OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f20761OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public byte[] f20762OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public boolean f20763OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public int f20764OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public long f20765OooOooo;

    public boolean OooO00o() {
        this.f20759OooOoO++;
        Iterator it = this.f20758OooOo0o;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f20756OooOo = byteBuffer;
        this.f20761OooOoOO = byteBuffer.position();
        if (this.f20756OooOo.hasArray()) {
            this.f20763OooOoo0 = true;
            this.f20762OooOoo = this.f20756OooOo.array();
            this.f20764OooOooO = this.f20756OooOo.arrayOffset();
        } else {
            this.f20763OooOoo0 = false;
            this.f20765OooOooo = com.google.protobuf.o0OO.OooO0O0(this.f20756OooOo);
            this.f20762OooOoo = null;
        }
        return true;
    }

    public void OooO0O0(int i) {
        int i2 = this.f20761OooOoOO + i;
        this.f20761OooOoOO = i2;
        if (i2 == this.f20756OooOo.limit()) {
            OooO00o();
        }
    }

    public void OooO0OO(int i) {
        int i2 = this.f20761OooOoOO + i;
        this.f20761OooOoOO = i2;
        if (i2 == this.f20756OooOo.limit()) {
            OooO0Oo();
        }
    }

    public boolean OooO0Oo() {
        this.f20759OooOoO++;
        Iterator it = this.f20758OooOo0o;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f20756OooOo = byteBuffer;
        this.f20761OooOoOO = byteBuffer.position();
        if (this.f20756OooOo.hasArray()) {
            this.f20763OooOoo0 = true;
            this.f20762OooOoo = this.f20756OooOo.array();
            this.f20764OooOooO = this.f20756OooOo.arrayOffset();
        } else {
            this.f20763OooOoo0 = false;
            this.f20765OooOooo = q11.OooO0o(this.f20756OooOo);
            this.f20762OooOoo = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f20757OooOo0O) {
            case 0:
                if (this.f20759OooOoO == this.f20760OooOoO0) {
                    return -1;
                }
                if (this.f20763OooOoo0) {
                    int i = this.f20762OooOoo[this.f20761OooOoOO + this.f20764OooOooO] & ForkServer.ERROR;
                    OooO0OO(1);
                    return i;
                }
                int iO0Oo0oo = q11.f23482OooO0OO.o0Oo0oo(this.f20761OooOoOO + this.f20765OooOooo) & ForkServer.ERROR;
                OooO0OO(1);
                return iO0Oo0oo;
            default:
                if (this.f20759OooOoO == this.f20760OooOoO0) {
                    return -1;
                }
                if (this.f20763OooOoo0) {
                    int i2 = this.f20762OooOoo[this.f20761OooOoOO + this.f20764OooOooO] & ForkServer.ERROR;
                    OooO0O0(1);
                    return i2;
                }
                int iOooO0o = com.google.protobuf.o0OO.f28347OooO0OO.OooO0o(this.f20761OooOoOO + this.f20765OooOooo) & ForkServer.ERROR;
                OooO0O0(1);
                return iOooO0o;
        }
    }

    public l01(Iterable iterable) {
        this.f20757OooOo0O = 1;
        this.f20758OooOo0o = iterable.iterator();
        this.f20760OooOoO0 = 0;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f20760OooOoO0++;
        }
        this.f20759OooOoO = -1;
        if (OooO00o()) {
            return;
        }
        this.f20756OooOo = Internal.EMPTY_BYTE_BUFFER;
        this.f20759OooOoO = 0;
        this.f20761OooOoOO = 0;
        this.f20765OooOooo = 0L;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.f20757OooOo0O) {
            case 0:
                if (this.f20759OooOoO != this.f20760OooOoO0) {
                    int iLimit = this.f20756OooOo.limit();
                    int i3 = this.f20761OooOoOO;
                    int i4 = iLimit - i3;
                    if (i2 > i4) {
                        i2 = i4;
                    }
                    if (this.f20763OooOoo0) {
                        System.arraycopy(this.f20762OooOoo, i3 + this.f20764OooOooO, bArr, i, i2);
                        OooO0OO(i2);
                    } else {
                        int iPosition = this.f20756OooOo.position();
                        this.f20756OooOo.position(this.f20761OooOoOO);
                        this.f20756OooOo.get(bArr, i, i2);
                        this.f20756OooOo.position(iPosition);
                        OooO0OO(i2);
                    }
                    break;
                }
                break;
            default:
                if (this.f20759OooOoO != this.f20760OooOoO0) {
                    int iLimit2 = this.f20756OooOo.limit();
                    int i5 = this.f20761OooOoOO;
                    int i6 = iLimit2 - i5;
                    if (i2 > i6) {
                        i2 = i6;
                    }
                    if (this.f20763OooOoo0) {
                        System.arraycopy(this.f20762OooOoo, i5 + this.f20764OooOooO, bArr, i, i2);
                        OooO0O0(i2);
                    } else {
                        int iPosition2 = this.f20756OooOo.position();
                        this.f20756OooOo.position(this.f20761OooOoOO);
                        this.f20756OooOo.get(bArr, i, i2);
                        this.f20756OooOo.position(iPosition2);
                        OooO0O0(i2);
                    }
                    break;
                }
                break;
        }
        return i2;
    }
}
