package org.chromium.net;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class OooO0O0 extends UploadDataProvider {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ByteBuffer f33323OooOo0O;

    public OooO0O0(ByteBuffer byteBuffer) {
        this.f33323OooOo0O = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f33323OooOo0O.limit();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.f33323OooOo0O;
        if (iRemaining >= byteBuffer2.remaining()) {
            byteBuffer.put(byteBuffer2);
        } else {
            int iLimit = byteBuffer2.limit();
            byteBuffer2.limit(byteBuffer.remaining() + byteBuffer2.position());
            byteBuffer.put(byteBuffer2);
            byteBuffer2.limit(iLimit);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.f33323OooOo0O.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
