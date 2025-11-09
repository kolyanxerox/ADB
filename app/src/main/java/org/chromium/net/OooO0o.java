package org.chromium.net;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class OooO0o extends UploadDataProvider {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f33324OooOo = new Object();

    /* renamed from: OooOo0O, reason: collision with root package name */
    public volatile FileChannel f33325OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0OO f33326OooOo0o;

    public OooO0o(OooO0OO oooO0OO) {
        this.f33326OooOo0o = oooO0OO;
    }

    public final FileChannel OooO00o() {
        if (this.f33325OooOo0O == null) {
            synchronized (this.f33324OooOo) {
                try {
                    if (this.f33325OooOo0O == null) {
                        this.f33325OooOo0O = this.f33326OooOo0o.OooO00o();
                    }
                } finally {
                }
            }
        }
        return this.f33325OooOo0O;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f33325OooOo0O;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return OooO00o().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel fileChannelOooO00o = OooO00o();
        int i = 0;
        while (i == 0) {
            int i2 = fileChannelOooO00o.read(byteBuffer);
            if (i2 == -1) {
                break;
            } else {
                i += i2;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        OooO00o().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
