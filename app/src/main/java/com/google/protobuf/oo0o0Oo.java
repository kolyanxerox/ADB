package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class oo0o0Oo extends CodedInputStream {

    /* renamed from: OooO, reason: collision with root package name */
    public boolean f28443OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ByteBuffer f28444OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f28445OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f28446OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f28447OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public long f28448OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f28449OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f28450OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f28451OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f28452OooOO0;

    public oo0o0Oo(ByteBuffer byteBuffer, boolean z) {
        super();
        this.f28452OooOO0 = Integer.MAX_VALUE;
        this.f28444OooO00o = byteBuffer;
        long jOooO0O0 = o0OO.OooO0O0(byteBuffer);
        this.f28446OooO0OO = jOooO0O0;
        this.f28447OooO0Oo = byteBuffer.limit() + jOooO0O0;
        long jPosition = jOooO0O0 + byteBuffer.position();
        this.f28449OooO0o0 = jPosition;
        this.f28448OooO0o = jPosition;
        this.f28445OooO0O0 = z;
    }

    public final void OooO00o() {
        long j = this.f28447OooO0Oo + this.f28450OooO0oO;
        this.f28447OooO0Oo = j;
        int i = (int) (j - this.f28448OooO0o);
        int i2 = this.f28452OooOO0;
        if (i <= i2) {
            this.f28450OooO0oO = 0;
            return;
        }
        int i3 = i - i2;
        this.f28450OooO0oO = i3;
        this.f28447OooO0Oo = j - i3;
    }

    public final int OooO0O0() {
        return (int) (this.f28447OooO0Oo - this.f28449OooO0o0);
    }

    public final ByteBuffer OooO0OO(long j, long j2) {
        ByteBuffer byteBuffer = this.f28444OooO00o;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        long j3 = this.f28446OooO0OO;
        try {
            try {
                byteBuffer.position((int) (j - j3));
                byteBuffer.limit((int) (j2 - j3));
                return byteBuffer.slice();
            } catch (IllegalArgumentException e) {
                InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                invalidProtocolBufferExceptionTruncatedMessage.initCause(e);
                throw invalidProtocolBufferExceptionTruncatedMessage;
            }
        } finally {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        if (this.f28451OooO0oo != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z) {
        this.f28443OooO = z;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i = this.f28452OooOO0;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f28451OooO0oo;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return (int) (this.f28449OooO0o0 - this.f28448OooO0o);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return this.f28449OooO0o0 == this.f28447OooO0Oo;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i) {
        this.f28452OooOO0 = i;
        OooO00o();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i;
        int i2 = this.f28452OooOO0;
        if (totalBytesRead > i2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f28452OooOO0 = totalBytesRead;
        OooO00o();
        return i2;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean readBool() {
        return readRawVarint64() != 0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readByteArray() {
        return readRawBytes(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 <= 0 || rawVarint32 > OooO0O0()) {
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (this.f28445OooO0O0 || !this.f28443OooO) {
            byte[] bArr = new byte[rawVarint32];
            long j = rawVarint32;
            o0OO.OooO0oO(this.f28449OooO0o0, bArr, 0L, j);
            this.f28449OooO0o0 += j;
            return ByteBuffer.wrap(bArr);
        }
        long j2 = this.f28449OooO0o0;
        long j3 = rawVarint32;
        ByteBuffer byteBufferOooO0OO = OooO0OO(j2, j2 + j3);
        this.f28449OooO0o0 += j3;
        return byteBufferOooO0OO;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteString readBytes() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 <= 0 || rawVarint32 > OooO0O0()) {
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (this.f28445OooO0O0 && this.f28443OooO) {
            long j = this.f28449OooO0o0;
            long j2 = rawVarint32;
            ByteBuffer byteBufferOooO0OO = OooO0OO(j, j + j2);
            this.f28449OooO0o0 += j2;
            return ByteString.wrap(byteBufferOooO0OO);
        }
        byte[] bArr = new byte[rawVarint32];
        long j3 = rawVarint32;
        o0OO.OooO0oO(this.f28449OooO0o0, bArr, 0L, j3);
        this.f28449OooO0o0 += j3;
        return ByteString.wrap(bArr);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readEnum() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readFixed32() {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readFixed64() {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        checkRecursionLimit();
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i, 4));
        this.recursionDepth--;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readInt32() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readInt64() {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        popLimit(iPushLimit);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte readRawByte() throws InvalidProtocolBufferException {
        long j = this.f28449OooO0o0;
        if (j == this.f28447OooO0Oo) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f28449OooO0o0 = 1 + j;
        return o0OO.f28347OooO0OO.OooO0o(j);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i) throws InvalidProtocolBufferException {
        if (i < 0 || i > OooO0O0()) {
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        byte[] bArr = new byte[i];
        long j = this.f28449OooO0o0;
        long j2 = i;
        OooO0OO(j, j + j2).get(bArr);
        this.f28449OooO0o0 += j2;
        return bArr;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() throws InvalidProtocolBufferException {
        long j = this.f28449OooO0o0;
        if (this.f28447OooO0Oo - j < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f28449OooO0o0 = 4 + j;
        o0OO0oO0 o0oo0oo0 = o0OO.f28347OooO0OO;
        return ((o0oo0oo0.OooO0o(j + 3) & ForkServer.ERROR) << 24) | (o0oo0oo0.OooO0o(j) & ForkServer.ERROR) | ((o0oo0oo0.OooO0o(1 + j) & ForkServer.ERROR) << 8) | ((o0oo0oo0.OooO0o(2 + j) & ForkServer.ERROR) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() throws InvalidProtocolBufferException {
        long j = this.f28449OooO0o0;
        if (this.f28447OooO0Oo - j < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f28449OooO0o0 = 8 + j;
        o0OO0oO0 o0oo0oo0 = o0OO.f28347OooO0OO;
        return ((o0oo0oo0.OooO0o(j + 7) & 255) << 56) | (o0oo0oo0.OooO0o(j) & 255) | ((o0oo0oo0.OooO0o(1 + j) & 255) << 8) | ((o0oo0oo0.OooO0o(2 + j) & 255) << 16) | ((o0oo0oo0.OooO0o(3 + j) & 255) << 24) | ((o0oo0oo0.OooO0o(4 + j) & 255) << 32) | ((o0oo0oo0.OooO0o(5 + j) & 255) << 40) | ((o0oo0oo0.OooO0o(6 + j) & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.OooO0o(r8) < 0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[PHI: r6
  0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.CodedInputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int readRawVarint32() {
        /*
            r12 = this;
            long r0 = r12.f28449OooO0o0
            long r2 = r12.f28447OooO0Oo
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L93
        La:
            r2 = 1
            long r2 = r2 + r0
            com.google.protobuf.o0OO0oO0 r4 = com.google.protobuf.o0OO.f28347OooO0OO
            byte r5 = r4.OooO0o(r0)
            if (r5 < 0) goto L18
            r12.f28449OooO0o0 = r2
            return r5
        L18:
            long r6 = r12.f28447OooO0Oo
            long r6 = r6 - r2
            r8 = 9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L23
            goto L93
        L23:
            r6 = 2
            long r6 = r6 + r0
            byte r2 = r4.OooO0o(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r5
            if (r2 >= 0) goto L33
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La0
        L33:
            r10 = 3
            long r10 = r10 + r0
            byte r3 = r4.OooO0o(r6)
            int r3 = r3 << 14
            r2 = r2 ^ r3
            if (r2 < 0) goto L43
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L41:
            r6 = r10
            goto La0
        L43:
            r5 = 4
            long r6 = r0 + r5
            byte r3 = r4.OooO0o(r10)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L55
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto La0
        L55:
            r10 = 5
            long r10 = r10 + r0
            byte r3 = r4.OooO0o(r6)
            int r5 = r3 << 28
            r2 = r2 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r5
            if (r3 >= 0) goto L9e
            r5 = 6
            long r6 = r0 + r5
            byte r3 = r4.OooO0o(r10)
            if (r3 >= 0) goto L99
            r10 = 7
            long r10 = r10 + r0
            byte r3 = r4.OooO0o(r6)
            if (r3 >= 0) goto L9e
            r5 = 8
            long r6 = r0 + r5
            byte r3 = r4.OooO0o(r10)
            if (r3 >= 0) goto L99
            long r8 = r8 + r0
            byte r3 = r4.OooO0o(r6)
            if (r3 >= 0) goto L9b
            r5 = 10
            long r6 = r0 + r5
            byte r0 = r4.OooO0o(r8)
            if (r0 >= 0) goto L99
        L93:
            long r0 = r12.readRawVarint64SlowPath()
            int r0 = (int) r0
            return r0
        L99:
            r0 = r2
            goto La0
        L9b:
            r0 = r2
            r6 = r8
            goto La0
        L9e:
            r0 = r2
            goto L41
        La0:
            r12.f28449OooO0o0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.oo0o0Oo.readRawVarint32():int");
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawVarint64() {
        long j;
        long j2;
        long j3;
        int i;
        long j4 = this.f28449OooO0o0;
        if (this.f28447OooO0Oo != j4) {
            long j5 = 1 + j4;
            o0OO0oO0 o0oo0oo0 = o0OO.f28347OooO0OO;
            byte bOooO0o = o0oo0oo0.OooO0o(j4);
            if (bOooO0o >= 0) {
                this.f28449OooO0o0 = j5;
                return bOooO0o;
            }
            if (this.f28447OooO0Oo - j5 >= 9) {
                long j6 = 2 + j4;
                int iOooO0o = (o0oo0oo0.OooO0o(j5) << 7) ^ bOooO0o;
                if (iOooO0o >= 0) {
                    long j7 = 3 + j4;
                    int iOooO0o2 = iOooO0o ^ (o0oo0oo0.OooO0o(j6) << 14);
                    if (iOooO0o2 >= 0) {
                        j = iOooO0o2 ^ 16256;
                    } else {
                        j6 = j4 + 4;
                        int iOooO0o3 = iOooO0o2 ^ (o0oo0oo0.OooO0o(j7) << 21);
                        if (iOooO0o3 < 0) {
                            i = (-2080896) ^ iOooO0o3;
                        } else {
                            j7 = 5 + j4;
                            long jOooO0o = iOooO0o3 ^ (o0oo0oo0.OooO0o(j6) << 28);
                            if (jOooO0o < 0) {
                                long j8 = 6 + j4;
                                long jOooO0o2 = jOooO0o ^ (o0oo0oo0.OooO0o(j7) << 35);
                                if (jOooO0o2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = 7 + j4;
                                    jOooO0o = jOooO0o2 ^ (o0oo0oo0.OooO0o(j8) << 42);
                                    if (jOooO0o >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = 8 + j4;
                                        jOooO0o2 = jOooO0o ^ (o0oo0oo0.OooO0o(j7) << 49);
                                        if (jOooO0o2 >= 0) {
                                            long j9 = j4 + 9;
                                            long jOooO0o3 = (jOooO0o2 ^ (o0oo0oo0.OooO0o(j8) << 56)) ^ 71499008037633920L;
                                            if (jOooO0o3 < 0) {
                                                long j10 = j4 + 10;
                                                if (o0oo0oo0.OooO0o(j9) >= 0) {
                                                    j6 = j10;
                                                    j = jOooO0o3;
                                                }
                                            } else {
                                                j = jOooO0o3;
                                                j6 = j9;
                                            }
                                            this.f28449OooO0o0 = j6;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                                j = j2 ^ jOooO0o2;
                                j6 = j8;
                                this.f28449OooO0o0 = j6;
                                return j;
                            }
                            j3 = 266354560;
                            j = j3 ^ jOooO0o;
                        }
                    }
                    j6 = j7;
                    this.f28449OooO0o0 = j6;
                    return j;
                }
                i = iOooO0o ^ (-128);
                j = i;
                this.f28449OooO0o0 = j6;
                return j;
            }
        }
        return readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((readRawByte() & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readSFixed32() {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readSFixed64() {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readSInt32() {
        return CodedInputStream.decodeZigZag32(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readSInt64() {
        return CodedInputStream.decodeZigZag64(readRawVarint64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readString() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 <= 0 || rawVarint32 > OooO0O0()) {
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = new byte[rawVarint32];
        long j = rawVarint32;
        o0OO.OooO0oO(this.f28449OooO0o0, bArr, 0L, j);
        String str = new String(bArr, Internal.UTF_8);
        this.f28449OooO0o0 += j;
        return str;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readStringRequireUtf8() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0 && rawVarint32 <= OooO0O0()) {
            String strOooO0OO = o0OOO0OO.OooO0OO(this.f28444OooO00o, (int) (this.f28449OooO0o0 - this.f28446OooO0OO), rawVarint32);
            this.f28449OooO0o0 += rawVarint32;
            return strOooO0OO;
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readTag() throws InvalidProtocolBufferException {
        if (isAtEnd()) {
            this.f28451OooO0oo = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f28451OooO0oo = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f28451OooO0oo;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readUInt32() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readUInt64() {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
        readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void resetSizeCounter() {
        this.f28448OooO0o = this.f28449OooO0o0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i);
        int i2 = 0;
        if (tagWireType == 0) {
            if (OooO0O0() < 10) {
                while (i2 < 10) {
                    if (readRawByte() < 0) {
                        i2++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i2 < 10) {
                long j = this.f28449OooO0o0;
                this.f28449OooO0o0 = 1 + j;
                if (o0OO.f28347OooO0OO.OooO0o(j) < 0) {
                    i2++;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
            return true;
        }
        if (tagWireType == 1) {
            skipRawBytes(8);
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        skipRawBytes(4);
        return true;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void skipRawBytes(int i) throws InvalidProtocolBufferException {
        if (i >= 0 && i <= OooO0O0()) {
            this.f28449OooO0o0 += i;
        } else {
            if (i >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        checkRecursionLimit();
        this.recursionDepth++;
        MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i, 4));
        this.recursionDepth--;
        return messageLite;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(iPushLimit);
            return messageLite;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            long rawVarint64 = readRawVarint64();
            codedOutputStream.writeUInt32NoTag(i);
            codedOutputStream.writeUInt64NoTag(rawVarint64);
            return true;
        }
        if (tagWireType == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeUInt32NoTag(i);
            codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            ByteString bytes = readBytes();
            codedOutputStream.writeUInt32NoTag(i);
            codedOutputStream.writeBytesNoTag(bytes);
            return true;
        }
        if (tagWireType == 3) {
            codedOutputStream.writeUInt32NoTag(i);
            skipMessage(codedOutputStream);
            int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
            checkLastTagWas(iMakeTag);
            codedOutputStream.writeUInt32NoTag(iMakeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            int rawLittleEndian32 = readRawLittleEndian32();
            codedOutputStream.writeUInt32NoTag(i);
            codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }
}
