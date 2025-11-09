package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class o00000O extends o00000 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f28196OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final ByteBuffer f28197OooO0o0;

    public o00000O(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.f28197OooO0o0 = byteBuffer;
        this.f28196OooO0o = byteBuffer.position();
    }

    @Override // com.google.protobuf.o00000, com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.f28197OooO0o0.position(getTotalBytesWritten() + this.f28196OooO0o);
    }
}
