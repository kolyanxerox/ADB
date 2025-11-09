package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class OooO00o extends FilterInputStream {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f28158OooOo0O;

    public OooO00o(InputStream inputStream, int i) {
        super(inputStream);
        this.f28158OooOo0O = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f28158OooOo0O);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f28158OooOo0O <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.f28158OooOo0O--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int iSkip = (int) super.skip(Math.min(j, this.f28158OooOo0O));
        if (iSkip >= 0) {
            this.f28158OooOo0O -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f28158OooOo0O;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            this.f28158OooOo0O -= i4;
        }
        return i4;
    }
}
