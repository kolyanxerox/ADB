package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o0O000O extends InputStream {

    /* renamed from: OooOo0O */
    public final ByteBuffer f28288OooOo0O;

    public o0O000O(o0OoOoOo o0oooooo) {
        this.f28288OooOo0O = o0oooooo.f28399OooOo0O.slice();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f28288OooOo0O.remaining();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f28288OooOo0O.mark();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f28288OooOo0O;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & ForkServer.ERROR;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.f28288OooOo0O.reset();
        } catch (InvalidMarkException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f28288OooOo0O;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
