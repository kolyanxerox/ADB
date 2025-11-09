package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o0Oo0oo extends CodedInputStream {

    /* renamed from: OooO, reason: collision with root package name */
    public int f28382OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Iterable f28383OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Iterator f28384OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public ByteBuffer f28385OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f28386OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f28387OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f28388OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f28389OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f28390OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f28391OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int f28392OooOO0O;
    public long OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public long f28393OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public long f28394OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public long f28395OooOOOO;

    public o0Oo0oo(Iterable iterable, int i, boolean z) {
        super();
        this.f28390OooO0oo = Integer.MAX_VALUE;
        this.f28387OooO0o = i;
        this.f28383OooO00o = iterable;
        this.f28384OooO0O0 = iterable.iterator();
        this.f28386OooO0Oo = z;
        this.f28391OooOO0 = 0;
        this.f28392OooOO0O = 0;
        if (i != 0) {
            OooO0oO();
            return;
        }
        this.f28385OooO0OO = Internal.EMPTY_BYTE_BUFFER;
        this.OooOO0o = 0L;
        this.f28394OooOOO0 = 0L;
        this.f28395OooOOOO = 0L;
        this.f28393OooOOO = 0L;
    }

    public final long OooO00o() {
        return this.f28395OooOOOO - this.OooOO0o;
    }

    public final void OooO0O0() throws InvalidProtocolBufferException {
        if (!this.f28384OooO0O0.hasNext()) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        OooO0oO();
    }

    public final void OooO0OO(int i, byte[] bArr) throws InvalidProtocolBufferException {
        if (i < 0 || i > OooO0o0()) {
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i != 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (OooO00o() == 0) {
                OooO0O0();
            }
            int iMin = Math.min(i2, (int) OooO00o());
            long j = iMin;
            o0OO.OooO0oO(this.OooOO0o, bArr, i - i2, j);
            i2 -= iMin;
            this.OooOO0o += j;
        }
    }

    public final void OooO0Oo() {
        int i = this.f28387OooO0o + this.f28389OooO0oO;
        this.f28387OooO0o = i;
        int i2 = i - this.f28392OooOO0O;
        int i3 = this.f28390OooO0oo;
        if (i2 <= i3) {
            this.f28389OooO0oO = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f28389OooO0oO = i4;
        this.f28387OooO0o = i - i4;
    }

    public final ByteBuffer OooO0o(int i, int i2) {
        int iPosition = this.f28385OooO0OO.position();
        int iLimit = this.f28385OooO0OO.limit();
        ByteBuffer byteBuffer = this.f28385OooO0OO;
        try {
            try {
                byteBuffer.position(i);
                byteBuffer.limit(i2);
                return this.f28385OooO0OO.slice();
            } catch (IllegalArgumentException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } finally {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
        }
    }

    public final int OooO0o0() {
        return (int) (((this.f28387OooO0o - this.f28391OooOO0) - this.OooOO0o) + this.f28394OooOOO0);
    }

    public final void OooO0oO() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f28384OooO0O0.next();
        this.f28385OooO0OO = byteBuffer;
        this.f28391OooOO0 += (int) (this.OooOO0o - this.f28394OooOOO0);
        long jPosition = byteBuffer.position();
        this.OooOO0o = jPosition;
        this.f28394OooOOO0 = jPosition;
        this.f28395OooOOOO = this.f28385OooO0OO.limit();
        long jOooO0O0 = o0OO.OooO0O0(this.f28385OooO0OO);
        this.f28393OooOOO = jOooO0O0;
        this.OooOO0o += jOooO0O0;
        this.f28394OooOOO0 += jOooO0O0;
        this.f28395OooOOOO += jOooO0O0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        if (this.f28382OooO != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z) {
        this.f28388OooO0o0 = z;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i = this.f28390OooO0oo;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f28382OooO;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return (int) (((this.f28391OooOO0 - this.f28392OooOO0O) + this.OooOO0o) - this.f28394OooOOO0);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return (((long) this.f28391OooOO0) + this.OooOO0o) - this.f28394OooOOO0 == ((long) this.f28387OooO0o);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i) {
        this.f28390OooO0oo = i;
        OooO0Oo();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i;
        int i2 = this.f28390OooO0oo;
        if (totalBytesRead > i2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f28390OooO0oo = totalBytesRead;
        OooO0Oo();
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
        if (rawVarint32 > 0) {
            long j = rawVarint32;
            if (j <= OooO00o()) {
                if (this.f28386OooO0Oo || !this.f28388OooO0o0) {
                    byte[] bArr = new byte[rawVarint32];
                    o0OO.OooO0oO(this.OooOO0o, bArr, 0L, j);
                    this.OooOO0o += j;
                    return ByteBuffer.wrap(bArr);
                }
                long j2 = this.OooOO0o + j;
                this.OooOO0o = j2;
                long j3 = j2 - this.f28393OooOOO;
                return OooO0o((int) (j3 - j), (int) j3);
            }
        }
        if (rawVarint32 > 0 && rawVarint32 <= OooO0o0()) {
            byte[] bArr2 = new byte[rawVarint32];
            OooO0OO(rawVarint32, bArr2);
            return ByteBuffer.wrap(bArr2);
        }
        if (rawVarint32 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteString readBytes() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        boolean z = this.f28386OooO0Oo;
        if (rawVarint32 > 0) {
            long j = rawVarint32;
            long j2 = this.f28395OooOOOO;
            long j3 = this.OooOO0o;
            if (j <= j2 - j3) {
                if (z && this.f28388OooO0o0) {
                    int i = (int) (j3 - this.f28393OooOOO);
                    ByteString byteStringWrap = ByteString.wrap(OooO0o(i, rawVarint32 + i));
                    this.OooOO0o += j;
                    return byteStringWrap;
                }
                byte[] bArr = new byte[rawVarint32];
                o0OO.OooO0oO(j3, bArr, 0L, j);
                this.OooOO0o += j;
                return ByteString.wrap(bArr);
            }
        }
        if (rawVarint32 <= 0 || rawVarint32 > OooO0o0()) {
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (!z || !this.f28388OooO0o0) {
            byte[] bArr2 = new byte[rawVarint32];
            OooO0OO(rawVarint32, bArr2);
            return ByteString.wrap(bArr2);
        }
        ArrayList arrayList = new ArrayList();
        while (rawVarint32 > 0) {
            if (OooO00o() == 0) {
                OooO0O0();
            }
            int iMin = Math.min(rawVarint32, (int) OooO00o());
            int i2 = (int) (this.OooOO0o - this.f28393OooOOO);
            arrayList.add(ByteString.wrap(OooO0o(i2, i2 + iMin)));
            rawVarint32 -= iMin;
            this.OooOO0o += iMin;
        }
        return ByteString.copyFrom(arrayList);
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
        if (OooO00o() == 0) {
            OooO0O0();
        }
        long j = this.OooOO0o;
        this.OooOO0o = 1 + j;
        return o0OO.f28347OooO0OO.OooO0o(j);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            long j = i;
            if (j <= OooO00o()) {
                byte[] bArr = new byte[i];
                o0OO.OooO0oO(this.OooOO0o, bArr, 0L, j);
                this.OooOO0o += j;
                return bArr;
            }
        }
        if (i >= 0 && i <= OooO0o0()) {
            byte[] bArr2 = new byte[i];
            OooO0OO(i, bArr2);
            return bArr2;
        }
        if (i > 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() {
        if (OooO00o() < 4) {
            return (readRawByte() & ForkServer.ERROR) | ((readRawByte() & ForkServer.ERROR) << 8) | ((readRawByte() & ForkServer.ERROR) << 16) | ((readRawByte() & ForkServer.ERROR) << 24);
        }
        long j = this.OooOO0o;
        this.OooOO0o = 4 + j;
        o0OO0oO0 o0oo0oo0 = o0OO.f28347OooO0OO;
        return ((o0oo0oo0.OooO0o(j + 3) & ForkServer.ERROR) << 24) | (o0oo0oo0.OooO0o(j) & ForkServer.ERROR) | ((o0oo0oo0.OooO0o(1 + j) & ForkServer.ERROR) << 8) | ((o0oo0oo0.OooO0o(2 + j) & ForkServer.ERROR) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        if (OooO00o() < 8) {
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
        }
        this.OooOO0o = 8 + this.OooOO0o;
        o0OO0oO0 o0oo0oo0 = o0OO.f28347OooO0OO;
        return (o0oo0oo0.OooO0o(r13) & 255) | ((o0oo0oo0.OooO0o(r13 + 1) & 255) << 8) | ((o0oo0oo0.OooO0o(r13 + 2) & 255) << 16) | ((o0oo0oo0.OooO0o(3 + r13) & 255) << 24) | ((o0oo0oo0.OooO0o(4 + r13) & 255) << 32) | ((o0oo0oo0.OooO0o(5 + r13) & 255) << 40) | ((o0oo0oo0.OooO0o(6 + r13) & 255) << 48) | ((o0oo0oo0.OooO0o(r13 + 7) & 255) << 56);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i;
        long j = this.OooOO0o;
        if (this.f28395OooOOOO != j) {
            long j2 = j + 1;
            o0OO0oO0 o0oo0oo0 = o0OO.f28347OooO0OO;
            byte bOooO0o = o0oo0oo0.OooO0o(j);
            if (bOooO0o >= 0) {
                this.OooOO0o++;
                return bOooO0o;
            }
            if (this.f28395OooOOOO - this.OooOO0o >= 10) {
                long j3 = 2 + j;
                int iOooO0o = (o0oo0oo0.OooO0o(j2) << 7) ^ bOooO0o;
                if (iOooO0o < 0) {
                    i = iOooO0o ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iOooO0o2 = (o0oo0oo0.OooO0o(j3) << 14) ^ iOooO0o;
                    if (iOooO0o2 >= 0) {
                        i = iOooO0o2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iOooO0o3 = iOooO0o2 ^ (o0oo0oo0.OooO0o(j4) << 21);
                        if (iOooO0o3 < 0) {
                            i = (-2080896) ^ iOooO0o3;
                        } else {
                            j4 = 5 + j;
                            byte bOooO0o2 = o0oo0oo0.OooO0o(j5);
                            int i2 = (iOooO0o3 ^ (bOooO0o2 << 28)) ^ 266354560;
                            if (bOooO0o2 < 0) {
                                j5 = 6 + j;
                                if (o0oo0oo0.OooO0o(j4) < 0) {
                                    j4 = 7 + j;
                                    if (o0oo0oo0.OooO0o(j5) < 0) {
                                        j5 = 8 + j;
                                        if (o0oo0oo0.OooO0o(j4) < 0) {
                                            j4 = 9 + j;
                                            if (o0oo0oo0.OooO0o(j5) < 0) {
                                                long j6 = j + 10;
                                                if (o0oo0oo0.OooO0o(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.OooOO0o = j3;
                return i;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawVarint64() {
        long j;
        long j2;
        long j3;
        long j4 = this.OooOO0o;
        if (this.f28395OooOOOO != j4) {
            long j5 = j4 + 1;
            o0OO0oO0 o0oo0oo0 = o0OO.f28347OooO0OO;
            byte bOooO0o = o0oo0oo0.OooO0o(j4);
            if (bOooO0o >= 0) {
                this.OooOO0o++;
                return bOooO0o;
            }
            if (this.f28395OooOOOO - this.OooOO0o >= 10) {
                long j6 = 2 + j4;
                int iOooO0o = (o0oo0oo0.OooO0o(j5) << 7) ^ bOooO0o;
                if (iOooO0o < 0) {
                    j = iOooO0o ^ (-128);
                } else {
                    long j7 = 3 + j4;
                    int iOooO0o2 = (o0oo0oo0.OooO0o(j6) << 14) ^ iOooO0o;
                    if (iOooO0o2 >= 0) {
                        j = iOooO0o2 ^ 16256;
                    } else {
                        long j8 = 4 + j4;
                        int iOooO0o3 = iOooO0o2 ^ (o0oo0oo0.OooO0o(j7) << 21);
                        if (iOooO0o3 < 0) {
                            j = (-2080896) ^ iOooO0o3;
                            j6 = j8;
                        } else {
                            long j9 = 5 + j4;
                            long jOooO0o = (o0oo0oo0.OooO0o(j8) << 28) ^ iOooO0o3;
                            if (jOooO0o >= 0) {
                                j3 = 266354560;
                            } else {
                                j7 = 6 + j4;
                                long jOooO0o2 = jOooO0o ^ (o0oo0oo0.OooO0o(j9) << 35);
                                if (jOooO0o2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j9 = 7 + j4;
                                    jOooO0o = jOooO0o2 ^ (o0oo0oo0.OooO0o(j7) << 42);
                                    if (jOooO0o >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j7 = 8 + j4;
                                        jOooO0o2 = jOooO0o ^ (o0oo0oo0.OooO0o(j9) << 49);
                                        if (jOooO0o2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j4;
                                            long jOooO0o3 = (jOooO0o2 ^ (o0oo0oo0.OooO0o(j7) << 56)) ^ 71499008037633920L;
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
                                        }
                                    }
                                }
                                j = j2 ^ jOooO0o2;
                            }
                            j = j3 ^ jOooO0o;
                            j6 = j9;
                        }
                    }
                    j6 = j7;
                }
                this.OooOO0o = j6;
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
        if (rawVarint32 > 0) {
            long j = rawVarint32;
            long j2 = this.f28395OooOOOO;
            long j3 = this.OooOO0o;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[rawVarint32];
                o0OO.OooO0oO(j3, bArr, 0L, j);
                String str = new String(bArr, Internal.UTF_8);
                this.OooOO0o += j;
                return str;
            }
        }
        if (rawVarint32 > 0 && rawVarint32 <= OooO0o0()) {
            byte[] bArr2 = new byte[rawVarint32];
            OooO0OO(rawVarint32, bArr2);
            return new String(bArr2, Internal.UTF_8);
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readStringRequireUtf8() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            long j = rawVarint32;
            long j2 = this.f28395OooOOOO;
            long j3 = this.OooOO0o;
            if (j <= j2 - j3) {
                String strOooO0OO = o0OOO0OO.OooO0OO(this.f28385OooO0OO, (int) (j3 - this.f28394OooOOO0), rawVarint32);
                this.OooOO0o += j;
                return strOooO0OO;
            }
        }
        if (rawVarint32 >= 0 && rawVarint32 <= OooO0o0()) {
            byte[] bArr = new byte[rawVarint32];
            OooO0OO(rawVarint32, bArr);
            return o0OOO0OO.f28370OooO00o.OooO0Oo(bArr, 0, rawVarint32);
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
            this.f28382OooO = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f28382OooO = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f28382OooO;
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
        this.f28392OooOO0O = (int) ((this.f28391OooOO0 + this.OooOO0o) - this.f28394OooOOO0);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (readRawByte() >= 0) {
                    return true;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
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
        if (i < 0 || i > ((this.f28387OooO0o - this.f28391OooOO0) - this.OooOO0o) + this.f28394OooOOO0) {
            if (i >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        while (i > 0) {
            if (OooO00o() == 0) {
                OooO0O0();
            }
            int iMin = Math.min(i, (int) OooO00o());
            i -= iMin;
            this.OooOO0o += iMin;
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
