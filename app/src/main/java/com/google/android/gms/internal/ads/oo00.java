package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class oo00 extends FilterInputStream {

    /* renamed from: OooOo, reason: collision with root package name */
    public long f23012OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f23013OooOo0O = 0;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public long f23014OooOo0o;

    public oo00(BufferedInputStream bufferedInputStream, long j) {
        super(bufferedInputStream);
        this.f23014OooOo0o = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.f23013OooOo0O) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f23014OooOo0o);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f23013OooOo0O) {
            case 1:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.f23012OooOo = this.f23014OooOo0o;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f23013OooOo0O) {
            case 0:
                int i = super.read();
                if (i != -1) {
                    this.f23012OooOo++;
                }
                return i;
            default:
                if (this.f23014OooOo0o == 0) {
                    return -1;
                }
                int i2 = ((FilterInputStream) this).in.read();
                if (i2 != -1) {
                    this.f23014OooOo0o--;
                }
                return i2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f23013OooOo0O) {
            case 1:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.f23012OooOo == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.f23014OooOo0o = this.f23012OooOo;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        switch (this.f23013OooOo0O) {
            case 1:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.f23014OooOo0o));
                this.f23014OooOo0o -= jSkip;
                return jSkip;
            default:
                return super.skip(j);
        }
    }

    public oo00(InputStream inputStream, long j) {
        super(inputStream);
        this.f23012OooOo = -1L;
        inputStream.getClass();
        ii0.OoooOoo("limit must be non-negative", j >= 0);
        this.f23014OooOo0o = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f23013OooOo0O) {
            case 0:
                int i3 = super.read(bArr, i, i2);
                if (i3 != -1) {
                    this.f23012OooOo += i3;
                }
                return i3;
            default:
                long j = this.f23014OooOo0o;
                if (j == 0) {
                    return -1;
                }
                int i4 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
                if (i4 != -1) {
                    this.f23014OooOo0o -= i4;
                }
                return i4;
        }
    }
}
