package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.bn */
/* loaded from: classes2.dex */
public final class C1428bn implements Closeable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ByteBuffer f17524OooOo0O;

    public C1428bn(ByteBuffer byteBuffer) {
        this.f17524OooOo0O = byteBuffer.duplicate();
    }

    public final int OooO00o(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f17524OooOo0O;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    public final long OooO0O0() {
        return this.f17524OooOo0O.position();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
