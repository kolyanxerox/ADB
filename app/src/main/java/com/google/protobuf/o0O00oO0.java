package com.google.protobuf;

import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o0O00oO0 extends InputStream {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f28303OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public o0O00o00 f28304OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public o00Ooo f28305OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f28306OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f28307OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f28308OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o0O0O0O f28309OooOoo0;

    public o0O00oO0(o0O0O0O o0o0o0o) {
        this.f28309OooOoo0 = o0o0o0o;
        o0O00o00 o0o00o00 = new o0O00o00(o0o0o0o);
        this.f28304OooOo0O = o0o00o00;
        o00Ooo next = o0o00o00.next();
        this.f28305OooOo0o = next;
        this.f28303OooOo = next.size();
        this.f28307OooOoO0 = 0;
        this.f28306OooOoO = 0;
    }

    public final void OooO00o() {
        if (this.f28305OooOo0o != null) {
            int i = this.f28307OooOoO0;
            int i2 = this.f28303OooOo;
            if (i == i2) {
                this.f28306OooOoO += i2;
                this.f28307OooOoO0 = 0;
                if (!this.f28304OooOo0O.hasNext()) {
                    this.f28305OooOo0o = null;
                    this.f28303OooOo = 0;
                } else {
                    o00Ooo next = this.f28304OooOo0O.next();
                    this.f28305OooOo0o = next;
                    this.f28303OooOo = next.size();
                }
            }
        }
    }

    public final int OooO0O0(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            OooO00o();
            if (this.f28305OooOo0o == null) {
                break;
            }
            int iMin = Math.min(this.f28303OooOo - this.f28307OooOoO0, i3);
            if (bArr != null) {
                this.f28305OooOo0o.copyTo(bArr, this.f28307OooOoO0, i, iMin);
                i += iMin;
            }
            this.f28307OooOoO0 += iMin;
            i3 -= iMin;
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f28309OooOoo0.f28313OooOo0O - (this.f28306OooOoO + this.f28307OooOoO0);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f28308OooOoOO = this.f28306OooOoO + this.f28307OooOoO0;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int iOooO0O0 = OooO0O0(bArr, i, i2);
        if (iOooO0O0 != 0) {
            return iOooO0O0;
        }
        if (i2 <= 0) {
            if (this.f28309OooOoo0.f28313OooOo0O - (this.f28306OooOoO + this.f28307OooOoO0) != 0) {
                return iOooO0O0;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        o0O00o00 o0o00o00 = new o0O00o00(this.f28309OooOoo0);
        this.f28304OooOo0O = o0o00o00;
        o00Ooo next = o0o00o00.next();
        this.f28305OooOo0o = next;
        this.f28303OooOo = next.size();
        this.f28307OooOoO0 = 0;
        this.f28306OooOoO = 0;
        OooO0O0(null, 0, this.f28308OooOoOO);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return OooO0O0(null, 0, (int) j);
    }

    @Override // java.io.InputStream
    public final int read() {
        OooO00o();
        o00Ooo o00ooo2 = this.f28305OooOo0o;
        if (o00ooo2 == null) {
            return -1;
        }
        int i = this.f28307OooOoO0;
        this.f28307OooOoO0 = i + 1;
        return o00ooo2.byteAt(i) & ForkServer.ERROR;
    }
}
