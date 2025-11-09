package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class o0000oo implements oO0000O {

    /* renamed from: OooO00o */
    public final CodedOutputStream f28210OooO00o;

    public o0000oo(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.f28210OooO00o = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public final void OooO00o(int i, ByteString byteString) {
        this.f28210OooO00o.writeBytes(i, byteString);
    }

    public final void OooO0O0(int i, int i2) throws IOException {
        this.f28210OooO00o.writeFixed32(i, i2);
    }

    public final void OooO0OO(int i, long j) throws IOException {
        this.f28210OooO00o.writeFixed64(i, j);
    }

    public final void OooO0Oo(int i, Object obj, o0oO0O0o o0oo0o0o) throws IOException {
        this.f28210OooO00o.writeGroup(i, (MessageLite) obj, o0oo0o0o);
    }

    public final void OooO0o(int i, long j) throws IOException {
        this.f28210OooO00o.writeInt64(i, j);
    }

    public final void OooO0o0(int i, int i2) throws IOException {
        this.f28210OooO00o.writeInt32(i, i2);
    }

    public final void OooO0oO(int i, Object obj, o0oO0O0o o0oo0o0o) throws IOException {
        this.f28210OooO00o.writeMessage(i, (MessageLite) obj, o0oo0o0o);
    }

    public final void OooO0oo(int i, Object obj) throws IOException {
        boolean z = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f28210OooO00o;
        if (z) {
            codedOutputStream.writeRawMessageSetExtension(i, (ByteString) obj);
        } else {
            codedOutputStream.writeMessageSetExtension(i, (MessageLite) obj);
        }
    }
}
