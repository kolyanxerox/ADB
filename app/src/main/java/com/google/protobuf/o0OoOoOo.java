package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class o0OoOoOo extends o00Ooo {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ByteBuffer f28399OooOo0O;

    public o0OoOoOo(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        this.f28399OooOo0O = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    public final ByteBuffer OooO0o(int i, int i2) {
        ByteBuffer byteBuffer = this.f28399OooOo0O;
        if (i < byteBuffer.position() || i2 > byteBuffer.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.position(i - byteBuffer.position());
        byteBufferSlice.limit(i2 - byteBuffer.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.o00Ooo
    public final boolean OooO0o0(o00Ooo o00ooo2, int i, int i2) {
        return substring(0, i2).equals(o00ooo2.substring(i, i2 + i));
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return this.f28399OooOo0O.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(this.f28399OooOo0O.asReadOnlyBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        try {
            return this.f28399OooOo0O.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f28399OooOo0O.slice());
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer byteBufferSlice = this.f28399OooOo0O.slice();
        byteBufferSlice.position(i);
        byteBufferSlice.get(bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        ByteBuffer byteBuffer = this.f28399OooOo0O;
        if (byteBuffer.remaining() != byteString.size()) {
            return false;
        }
        if (byteBuffer.remaining() == 0) {
            return true;
        }
        return obj instanceof o0OoOoOo ? byteBuffer.equals(((o0OoOoOo) obj).f28399OooOo0O) : obj instanceof o0O0O0O ? obj.equals(this) : byteBuffer.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        o0OOO0 o0ooo0 = o0OOO0OO.f28370OooO00o;
        ByteBuffer byteBuffer = this.f28399OooOo0O;
        return o0OOO0OO.f28370OooO00o.OooOO0O(0, byteBuffer, byteBuffer.position(), byteBuffer.remaining()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.f28399OooOo0O, true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new o0O000O(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f28399OooOo0O.get(i4);
        }
        return i;
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        return o0OOO0OO.f28370OooO00o.OooOO0O(i, this.f28399OooOo0O, i2, i3 + i2);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.f28399OooOo0O.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        try {
            return new o0OoOoOo(OooO0o(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iPosition;
        ByteBuffer byteBuffer = this.f28399OooOo0O;
        if (byteBuffer.hasArray()) {
            byteArray = byteBuffer.array();
            iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iPosition = 0;
        }
        return new String(byteArray, iPosition, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:7:0x0025, B:9:0x002b, B:12:0x0044, B:14:0x004d, B:16:0x0055, B:20:0x0061, B:21:0x0065, B:26:0x0083, B:28:0x0086, B:33:0x009d, B:35:0x00a3, B:30:0x008f, B:32:0x0095, B:24:0x007a), top: B:41:0x0025 }] */
    @Override // com.google.protobuf.ByteString
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeToInternal(java.io.OutputStream r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            java.nio.ByteBuffer r0 = r6.f28399OooOo0O
            boolean r1 = r0.hasArray()
            if (r1 == 0) goto L1a
            int r1 = r0.arrayOffset()
            int r2 = r0.position()
            int r2 = r2 + r1
            int r2 = r2 + r8
            byte[] r8 = r0.array()
            r7.write(r8, r2, r9)
            return
        L1a:
            int r9 = r9 + r8
            java.nio.ByteBuffer r8 = r6.OooO0o(r8, r9)
            java.lang.ThreadLocal r9 = com.google.protobuf.OooOo00.f28175OooO00o
            int r9 = r8.position()
            boolean r0 = r8.hasArray()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L44
            byte[] r0 = r8.array()     // Catch: java.lang.Throwable -> L41
            int r1 = r8.arrayOffset()     // Catch: java.lang.Throwable -> L41
            int r2 = r8.position()     // Catch: java.lang.Throwable -> L41
            int r1 = r1 + r2
            int r2 = r8.remaining()     // Catch: java.lang.Throwable -> L41
            r7.write(r0, r1, r2)     // Catch: java.lang.Throwable -> L41
            goto Lb4
        L41:
            r7 = move-exception
            goto Lb8
        L44:
            long r0 = com.google.protobuf.OooOo00.f28177OooO0OO     // Catch: java.lang.Throwable -> L41
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 < 0) goto L65
            java.lang.Class r2 = com.google.protobuf.OooOo00.f28176OooO0O0     // Catch: java.lang.Throwable -> L41
            boolean r2 = r2.isInstance(r7)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L65
            com.google.protobuf.o0OO0oO0 r2 = com.google.protobuf.o0OO.f28347OooO0OO     // Catch: java.lang.Throwable -> L41 java.lang.ClassCastException -> L5e
            java.lang.Object r0 = r2.OooOOO0(r7, r0)     // Catch: java.lang.Throwable -> L41 java.lang.ClassCastException -> L5e
            java.nio.channels.WritableByteChannel r0 = (java.nio.channels.WritableByteChannel) r0     // Catch: java.lang.Throwable -> L41 java.lang.ClassCastException -> L5e
            goto L5f
        L5e:
            r0 = r3
        L5f:
            if (r0 == 0) goto L65
            r0.write(r8)     // Catch: java.lang.Throwable -> L41
            goto Lb4
        L65:
            int r0 = r8.remaining()     // Catch: java.lang.Throwable -> L41
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> L41
            java.lang.ThreadLocal r1 = com.google.protobuf.OooOo00.f28175OooO00o     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L41
            java.lang.ref.SoftReference r2 = (java.lang.ref.SoftReference) r2     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L7a
            goto L81
        L7a:
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L41
            r3 = r2
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L41
        L81:
            if (r3 == 0) goto L8f
            int r2 = r3.length     // Catch: java.lang.Throwable -> L41
            if (r2 >= r0) goto L9d
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L41
            float r4 = (float) r0     // Catch: java.lang.Throwable -> L41
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r5
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L9d
        L8f:
            byte[] r3 = new byte[r0]     // Catch: java.lang.Throwable -> L41
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r0 > r2) goto L9d
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L41
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L41
            r1.set(r0)     // Catch: java.lang.Throwable -> L41
        L9d:
            boolean r0 = r8.hasRemaining()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto Lb4
            int r0 = r8.remaining()     // Catch: java.lang.Throwable -> L41
            int r1 = r3.length     // Catch: java.lang.Throwable -> L41
            int r0 = java.lang.Math.min(r0, r1)     // Catch: java.lang.Throwable -> L41
            r1 = 0
            r8.get(r3, r1, r0)     // Catch: java.lang.Throwable -> L41
            r7.write(r3, r1, r0)     // Catch: java.lang.Throwable -> L41
            goto L9d
        Lb4:
            r8.position(r9)
            return
        Lb8:
            r8.position(r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0OoOoOo.writeToInternal(java.io.OutputStream, int, int):void");
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.f28399OooOo0O.slice());
    }
}
