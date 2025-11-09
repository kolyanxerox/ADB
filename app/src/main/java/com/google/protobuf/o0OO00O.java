package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o0OO00O extends CodedInputStream {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final InputStream f28355OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f28356OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f28357OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f28358OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f28359OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f28360OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f28361OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f28362OooO0oo;

    public o0OO00O(InputStream inputStream, int i) {
        super();
        this.f28362OooO0oo = Integer.MAX_VALUE;
        Internal.checkNotNull(inputStream, "input");
        this.f28355OooO00o = inputStream;
        this.f28356OooO0O0 = new byte[i];
        this.f28357OooO0OO = 0;
        this.f28360OooO0o0 = 0;
        this.f28361OooO0oO = 0;
    }

    public final byte[] OooO00o(int i, boolean z) throws IOException {
        byte[] bArrOooO0O0 = OooO0O0(i);
        if (bArrOooO0O0 != null) {
            return z ? (byte[]) bArrOooO0O0.clone() : bArrOooO0O0;
        }
        int i2 = this.f28360OooO0o0;
        int i3 = this.f28357OooO0OO;
        int length = i3 - i2;
        this.f28361OooO0oO += i3;
        this.f28360OooO0o0 = 0;
        this.f28357OooO0OO = 0;
        ArrayList arrayListOooO0OO = OooO0OO(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f28356OooO0O0, i2, bArr, 0, length);
        int size = arrayListOooO0OO.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListOooO0OO.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] OooO0O0(int i) throws IOException {
        if (i == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f28361OooO0oO;
        int i3 = this.f28360OooO0o0;
        int i4 = i2 + i3 + i;
        if (i4 - this.sizeLimit > 0) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        int i5 = this.f28362OooO0oo;
        if (i4 > i5) {
            skipRawBytes((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = this.f28357OooO0OO - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f28355OooO00o;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f28356OooO0O0, this.f28360OooO0o0, bArr, 0, i6);
        this.f28361OooO0oO += this.f28357OooO0OO;
        this.f28360OooO0o0 = 0;
        this.f28357OooO0OO = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f28361OooO0oO += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.setThrownFromInputStream();
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList OooO0OO(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f28355OooO00o.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f28361OooO0oO += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void OooO0Oo() {
        int i = this.f28357OooO0OO + this.f28358OooO0Oo;
        this.f28357OooO0OO = i;
        int i2 = this.f28361OooO0oO + i;
        int i3 = this.f28362OooO0oo;
        if (i2 <= i3) {
            this.f28358OooO0Oo = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f28358OooO0Oo = i4;
        this.f28357OooO0OO = i - i4;
    }

    public final boolean OooO0o(int i) throws IOException {
        int i2 = this.f28360OooO0o0;
        int i3 = i2 + i;
        int i4 = this.f28357OooO0OO;
        if (i3 <= i4) {
            throw new IllegalStateException(OooO0oO.OooOo.OooO0oO(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.sizeLimit;
        int i6 = this.f28361OooO0oO;
        if (i <= (i5 - i6) - i2 && i6 + i2 + i <= this.f28362OooO0oo) {
            byte[] bArr = this.f28356OooO0O0;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f28361OooO0oO += i2;
                this.f28357OooO0OO -= i2;
                this.f28360OooO0o0 = 0;
            }
            int i7 = this.f28357OooO0OO;
            int iMin = Math.min(bArr.length - i7, (this.sizeLimit - this.f28361OooO0oO) - i7);
            InputStream inputStream = this.f28355OooO00o;
            try {
                int i8 = inputStream.read(bArr, i7, iMin);
                if (i8 == 0 || i8 < -1 || i8 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
                }
                if (i8 > 0) {
                    this.f28357OooO0OO += i8;
                    OooO0Oo();
                    if (this.f28357OooO0OO >= i) {
                        return true;
                    }
                    return OooO0o(i);
                }
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }
        return false;
    }

    public final void OooO0o0(int i) throws InvalidProtocolBufferException {
        if (OooO0o(i)) {
            return;
        }
        if (i <= (this.sizeLimit - this.f28361OooO0oO) - this.f28360OooO0o0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.sizeLimitExceeded();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        if (this.f28359OooO0o != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z) {
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i = this.f28362OooO0oo;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f28361OooO0oO + this.f28360OooO0o0);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f28359OooO0o;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return this.f28361OooO0oO + this.f28360OooO0o0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return this.f28360OooO0o0 == this.f28357OooO0OO && !OooO0o(1);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i) {
        this.f28362OooO0oo = i;
        OooO0Oo();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f28361OooO0oO + this.f28360OooO0o0 + i;
        int i3 = this.f28362OooO0oo;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f28362OooO0oo = i2;
        OooO0Oo();
        return i3;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean readBool() {
        return readRawVarint64() != 0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readByteArray() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        int i = this.f28357OooO0OO;
        int i2 = this.f28360OooO0o0;
        if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
            if (rawVarint32 >= 0) {
                return OooO00o(rawVarint32, false);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f28356OooO0O0, i2, i2 + rawVarint32);
        this.f28360OooO0o0 += rawVarint32;
        return bArrCopyOfRange;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        int i = this.f28357OooO0OO;
        int i2 = this.f28360OooO0o0;
        if (rawVarint32 <= i - i2 && rawVarint32 > 0) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f28356OooO0O0, i2, i2 + rawVarint32));
            this.f28360OooO0o0 += rawVarint32;
            return byteBufferWrap;
        }
        if (rawVarint32 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
        }
        if (rawVarint32 >= 0) {
            return ByteBuffer.wrap(OooO00o(rawVarint32, true));
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i = this.f28357OooO0OO;
        int i2 = this.f28360OooO0o0;
        int i3 = i - i2;
        byte[] bArr = this.f28356OooO0O0;
        if (rawVarint32 <= i3 && rawVarint32 > 0) {
            ByteString byteStringCopyFrom = ByteString.copyFrom(bArr, i2, rawVarint32);
            this.f28360OooO0o0 += rawVarint32;
            return byteStringCopyFrom;
        }
        if (rawVarint32 == 0) {
            return ByteString.EMPTY;
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        byte[] bArrOooO0O0 = OooO0O0(rawVarint32);
        if (bArrOooO0O0 != null) {
            return ByteString.copyFrom(bArrOooO0O0);
        }
        int i4 = this.f28360OooO0o0;
        int i5 = this.f28357OooO0OO;
        int length = i5 - i4;
        this.f28361OooO0oO += i5;
        this.f28360OooO0o0 = 0;
        this.f28357OooO0OO = 0;
        ArrayList arrayListOooO0OO = OooO0OO(rawVarint32 - length);
        byte[] bArr2 = new byte[rawVarint32];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListOooO0OO.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListOooO0OO.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        return ByteString.wrap(bArr2);
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
        if (this.f28360OooO0o0 == this.f28357OooO0OO) {
            OooO0o0(1);
        }
        int i = this.f28360OooO0o0;
        this.f28360OooO0o0 = i + 1;
        return this.f28356OooO0O0[i];
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i) {
        int i2 = this.f28360OooO0o0;
        if (i > this.f28357OooO0OO - i2 || i <= 0) {
            return OooO00o(i, false);
        }
        int i3 = i + i2;
        this.f28360OooO0o0 = i3;
        return Arrays.copyOfRange(this.f28356OooO0O0, i2, i3);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() throws InvalidProtocolBufferException {
        int i = this.f28360OooO0o0;
        if (this.f28357OooO0OO - i < 4) {
            OooO0o0(4);
            i = this.f28360OooO0o0;
        }
        this.f28360OooO0o0 = i + 4;
        byte[] bArr = this.f28356OooO0O0;
        return ((bArr[i + 3] & ForkServer.ERROR) << 24) | (bArr[i] & ForkServer.ERROR) | ((bArr[i + 1] & ForkServer.ERROR) << 8) | ((bArr[i + 2] & ForkServer.ERROR) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() throws InvalidProtocolBufferException {
        int i = this.f28360OooO0o0;
        if (this.f28357OooO0OO - i < 8) {
            OooO0o0(8);
            i = this.f28360OooO0o0;
        }
        this.f28360OooO0o0 = i + 8;
        byte[] bArr = this.f28356OooO0O0;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i;
        int i2 = this.f28360OooO0o0;
        int i3 = this.f28357OooO0OO;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f28356OooO0O0;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f28360OooO0o0 = i4;
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
                this.f28360OooO0o0 = i5;
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
        int i = this.f28360OooO0o0;
        int i2 = this.f28357OooO0OO;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f28356OooO0O0;
            byte b = bArr[i];
            if (b >= 0) {
                this.f28360OooO0o0 = i3;
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
                this.f28360OooO0o0 = i4;
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
        byte[] bArr = this.f28356OooO0O0;
        if (rawVarint32 > 0) {
            int i = this.f28357OooO0OO;
            int i2 = this.f28360OooO0o0;
            if (rawVarint32 <= i - i2) {
                String str = new String(bArr, i2, rawVarint32, Internal.UTF_8);
                this.f28360OooO0o0 += rawVarint32;
                return str;
            }
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (rawVarint32 > this.f28357OooO0OO) {
            return new String(OooO00o(rawVarint32, false), Internal.UTF_8);
        }
        OooO0o0(rawVarint32);
        String str2 = new String(bArr, this.f28360OooO0o0, rawVarint32, Internal.UTF_8);
        this.f28360OooO0o0 += rawVarint32;
        return str2;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readStringRequireUtf8() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i = this.f28360OooO0o0;
        int i2 = this.f28357OooO0OO;
        int i3 = i2 - i;
        byte[] bArrOooO00o = this.f28356OooO0O0;
        if (rawVarint32 <= i3 && rawVarint32 > 0) {
            this.f28360OooO0o0 = i + rawVarint32;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            i = 0;
            if (rawVarint32 <= i2) {
                OooO0o0(rawVarint32);
                this.f28360OooO0o0 = rawVarint32;
            } else {
                bArrOooO00o = OooO00o(rawVarint32, false);
            }
        }
        return o0OOO0OO.f28370OooO00o.OooO0Oo(bArrOooO00o, i, rawVarint32);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readTag() throws InvalidProtocolBufferException {
        if (isAtEnd()) {
            this.f28359OooO0o = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f28359OooO0o = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f28359OooO0o;
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
        this.f28361OooO0oO = -this.f28360OooO0o0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i);
        int i2 = 0;
        if (tagWireType == 0) {
            if (this.f28357OooO0OO - this.f28360OooO0o0 < 10) {
                while (i2 < 10) {
                    if (readRawByte() < 0) {
                        i2++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i2 < 10) {
                int i3 = this.f28360OooO0o0;
                this.f28360OooO0o0 = i3 + 1;
                if (this.f28356OooO0O0[i3] < 0) {
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
        int i2 = this.f28357OooO0OO;
        int i3 = this.f28360OooO0o0;
        if (i <= i2 - i3 && i >= 0) {
            this.f28360OooO0o0 = i3 + i;
            return;
        }
        InputStream inputStream = this.f28355OooO00o;
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i4 = this.f28361OooO0oO;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.f28362OooO0oo;
        if (i6 > i7) {
            skipRawBytes((i7 - i4) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f28361OooO0oO = i5;
        int i8 = i2 - i3;
        this.f28357OooO0OO = 0;
        this.f28360OooO0o0 = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i8 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.setThrownFromInputStream();
                    throw e;
                }
            } catch (Throwable th) {
                this.f28361OooO0oO += i8;
                OooO0Oo();
                throw th;
            }
        }
        this.f28361OooO0oO += i8;
        OooO0Oo();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f28357OooO0OO;
        int i10 = i9 - this.f28360OooO0o0;
        this.f28360OooO0o0 = i9;
        OooO0o0(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f28357OooO0OO;
            if (i11 <= i12) {
                this.f28360OooO0o0 = i11;
                return;
            } else {
                i10 += i12;
                this.f28360OooO0o0 = i12;
                OooO0o0(1);
            }
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
