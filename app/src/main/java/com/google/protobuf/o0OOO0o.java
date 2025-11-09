package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o0OOO0o extends CodedInputStream {

    /* renamed from: OooO, reason: collision with root package name */
    public int f28371OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f28372OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f28373OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f28374OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f28375OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f28376OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f28377OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f28378OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public boolean f28379OooO0oo;

    public o0OOO0o(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f28371OooO = Integer.MAX_VALUE;
        this.f28372OooO00o = bArr;
        this.f28374OooO0OO = i2 + i;
        this.f28377OooO0o0 = i;
        this.f28376OooO0o = i;
        this.f28373OooO0O0 = z;
    }

    public final void OooO00o() {
        int i = this.f28374OooO0OO + this.f28375OooO0Oo;
        this.f28374OooO0OO = i;
        int i2 = i - this.f28376OooO0o;
        int i3 = this.f28371OooO;
        if (i2 <= i3) {
            this.f28375OooO0Oo = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f28375OooO0Oo = i4;
        this.f28374OooO0OO = i - i4;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        if (this.f28378OooO0oO != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z) {
        this.f28379OooO0oo = z;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i = this.f28371OooO;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f28378OooO0oO;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return this.f28377OooO0o0 - this.f28376OooO0o;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return this.f28377OooO0o0 == this.f28374OooO0OO;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i) {
        this.f28371OooO = i;
        OooO00o();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i;
        if (totalBytesRead < 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        int i2 = this.f28371OooO;
        if (totalBytesRead > i2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f28371OooO = totalBytesRead;
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
        if (rawVarint32 > 0) {
            int i = this.f28374OooO0OO;
            int i2 = this.f28377OooO0o0;
            if (rawVarint32 <= i - i2) {
                boolean z = this.f28373OooO0O0;
                byte[] bArr = this.f28372OooO00o;
                ByteBuffer byteBufferWrap = (z || !this.f28379OooO0oo) ? ByteBuffer.wrap(Arrays.copyOfRange(bArr, i2, i2 + rawVarint32)) : ByteBuffer.wrap(bArr, i2, rawVarint32).slice();
                this.f28377OooO0o0 += rawVarint32;
                return byteBufferWrap;
            }
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
    public final ByteString readBytes() {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            int i = this.f28374OooO0OO;
            int i2 = this.f28377OooO0o0;
            if (rawVarint32 <= i - i2) {
                boolean z = this.f28373OooO0O0;
                byte[] bArr = this.f28372OooO00o;
                ByteString byteStringWrap = (z && this.f28379OooO0oo) ? ByteString.wrap(bArr, i2, rawVarint32) : ByteString.copyFrom(bArr, i2, rawVarint32);
                this.f28377OooO0o0 += rawVarint32;
                return byteStringWrap;
            }
        }
        return rawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytes(rawVarint32));
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
        int i = this.f28377OooO0o0;
        if (i == this.f28374OooO0OO) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f28377OooO0o0 = i + 1;
        return this.f28372OooO00o[i];
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i) throws InvalidProtocolBufferException {
        if (i > 0) {
            int i2 = this.f28374OooO0OO;
            int i3 = this.f28377OooO0o0;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.f28377OooO0o0 = i4;
                return Arrays.copyOfRange(this.f28372OooO00o, i3, i4);
            }
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
    public final int readRawLittleEndian32() throws InvalidProtocolBufferException {
        int i = this.f28377OooO0o0;
        if (this.f28374OooO0OO - i < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f28377OooO0o0 = i + 4;
        byte[] bArr = this.f28372OooO00o;
        return ((bArr[i + 3] & ForkServer.ERROR) << 24) | (bArr[i] & ForkServer.ERROR) | ((bArr[i + 1] & ForkServer.ERROR) << 8) | ((bArr[i + 2] & ForkServer.ERROR) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() throws InvalidProtocolBufferException {
        int i = this.f28377OooO0o0;
        if (this.f28374OooO0OO - i < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f28377OooO0o0 = i + 8;
        byte[] bArr = this.f28372OooO00o;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i;
        int i2 = this.f28377OooO0o0;
        int i3 = this.f28374OooO0OO;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f28372OooO00o;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f28377OooO0o0 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f28377OooO0o0 = i5;
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
        long j4;
        int i = this.f28377OooO0o0;
        int i2 = this.f28374OooO0OO;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f28372OooO00o;
            byte b = bArr[i];
            if (b >= 0) {
                this.f28377OooO0o0 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f28377OooO0o0 = i4;
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
            int i = this.f28374OooO0OO;
            int i2 = this.f28377OooO0o0;
            if (rawVarint32 <= i - i2) {
                String str = new String(this.f28372OooO00o, i2, rawVarint32, Internal.UTF_8);
                this.f28377OooO0o0 += rawVarint32;
                return str;
            }
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
            int i = this.f28374OooO0OO;
            int i2 = this.f28377OooO0o0;
            if (rawVarint32 <= i - i2) {
                String strOooO0Oo = o0OOO0OO.f28370OooO00o.OooO0Oo(this.f28372OooO00o, i2, rawVarint32);
                this.f28377OooO0o0 += rawVarint32;
                return strOooO0Oo;
            }
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
            this.f28378OooO0oO = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f28378OooO0oO = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f28378OooO0oO;
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
        this.f28376OooO0o = this.f28377OooO0o0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i);
        int i2 = 0;
        if (tagWireType == 0) {
            if (this.f28374OooO0OO - this.f28377OooO0o0 < 10) {
                while (i2 < 10) {
                    if (readRawByte() < 0) {
                        i2++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i2 < 10) {
                int i3 = this.f28377OooO0o0;
                this.f28377OooO0o0 = i3 + 1;
                if (this.f28372OooO00o[i3] < 0) {
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
        if (i >= 0) {
            int i2 = this.f28374OooO0OO;
            int i3 = this.f28377OooO0o0;
            if (i <= i2 - i3) {
                this.f28377OooO0o0 = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
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
