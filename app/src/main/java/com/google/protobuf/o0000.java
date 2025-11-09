package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class o0000 extends CodedOutputStream {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ByteBuffer f28181OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ByteBuffer f28182OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f28183OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f28184OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final long f28185OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f28186OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public long f28187OooO0oO;

    public o0000(ByteBuffer byteBuffer) {
        super();
        this.f28181OooO00o = byteBuffer;
        this.f28182OooO0O0 = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long jOooO0O0 = o0OO.OooO0O0(byteBuffer);
        this.f28183OooO0OO = jOooO0O0;
        long jPosition = byteBuffer.position() + jOooO0O0;
        this.f28184OooO0Oo = jPosition;
        long jLimit = jOooO0O0 + byteBuffer.limit();
        this.f28186OooO0o0 = jLimit;
        this.f28185OooO0o = jLimit - 10;
        this.f28187OooO0oO = jPosition;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.f28181OooO00o.position((int) (this.f28187OooO0oO - this.f28183OooO0OO));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return (int) (this.f28187OooO0oO - this.f28184OooO0Oo);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return (int) (this.f28186OooO0o0 - this.f28187OooO0oO);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b) throws CodedOutputStream.OutOfSpaceException {
        long j = this.f28187OooO0oO;
        long j2 = this.f28186OooO0o0;
        if (j >= j2) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f28187OooO0oO), Long.valueOf(j2), 1));
        }
        this.f28187OooO0oO = 1 + j;
        o0OO.OooOOO0(j, b);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBool(int i, boolean z) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i, 0);
        write(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i, byte[] bArr) throws CodedOutputStream.OutOfSpaceException {
        writeByteArray(i, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws CodedOutputStream.OutOfSpaceException {
        writeUInt32NoTag(i2);
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteBuffer(int i, ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytes(int i, ByteString byteString) throws IOException {
        writeTag(i, 2);
        writeBytesNoTag(byteString);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytesNoTag(ByteString byteString) throws IOException {
        writeUInt32NoTag(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32(int i, int i2) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i, 5);
        writeFixed32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int i) {
        this.f28182OooO0O0.putInt((int) (this.f28187OooO0oO - this.f28183OooO0OO), i);
        this.f28187OooO0oO += 4;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i, long j) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j) {
        this.f28182OooO0O0.putLong((int) (this.f28187OooO0oO - this.f28183OooO0OO), j);
        this.f28187OooO0oO += 8;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32(int i, int i2) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32NoTag(int i) throws CodedOutputStream.OutOfSpaceException {
        if (i >= 0) {
            writeUInt32NoTag(i);
        } else {
            writeUInt64NoTag(i);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(byte[] bArr, int i, int i2) throws CodedOutputStream.OutOfSpaceException {
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i, MessageLite messageLite) throws IOException {
        writeTag(i, 2);
        writeMessageNoTag(messageLite);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
        writeUInt32NoTag(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeRawBytes(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        write(byteBufferDuplicate);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeBytes(3, byteString);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeString(int i, String str) throws IOException {
        writeTag(i, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeStringNoTag(String str) throws IOException {
        long j = this.f28183OooO0OO;
        ByteBuffer byteBuffer = this.f28182OooO0O0;
        long j2 = this.f28187OooO0oO;
        try {
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                int iOooO0o0 = o0OOO0OO.OooO0o0(str);
                writeUInt32NoTag(iOooO0o0);
                byteBuffer.position((int) (this.f28187OooO0oO - j));
                o0OOO0OO.OooO0Oo(str, byteBuffer);
                this.f28187OooO0oO += iOooO0o0;
                return;
            }
            int i = ((int) (this.f28187OooO0oO - j)) + iComputeUInt32SizeNoTag2;
            byteBuffer.position(i);
            o0OOO0OO.OooO0Oo(str, byteBuffer);
            int iPosition = byteBuffer.position() - i;
            writeUInt32NoTag(iPosition);
            this.f28187OooO0oO += iPosition;
        } catch (o0OOO00 e) {
            this.f28187OooO0oO = j2;
            byteBuffer.position((int) (j2 - j));
            inefficientWriteStringNoTag(str, e);
        } catch (IllegalArgumentException e2) {
            throw new CodedOutputStream.OutOfSpaceException(e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream.OutOfSpaceException(e3);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeTag(int i, int i2) throws CodedOutputStream.OutOfSpaceException {
        writeUInt32NoTag(WireFormat.makeTag(i, i2));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32(int i, int i2) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int i) throws CodedOutputStream.OutOfSpaceException {
        if (this.f28187OooO0oO <= this.f28185OooO0o) {
            while ((i & (-128)) != 0) {
                long j = this.f28187OooO0oO;
                this.f28187OooO0oO = j + 1;
                o0OO.OooOOO0(j, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            long j2 = this.f28187OooO0oO;
            this.f28187OooO0oO = 1 + j2;
            o0OO.OooOOO0(j2, (byte) i);
            return;
        }
        while (true) {
            long j3 = this.f28187OooO0oO;
            long j4 = this.f28186OooO0o0;
            if (j3 >= j4) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f28187OooO0oO), Long.valueOf(j4), 1));
            }
            if ((i & (-128)) == 0) {
                this.f28187OooO0oO = 1 + j3;
                o0OO.OooOOO0(j3, (byte) i);
                return;
            } else {
                this.f28187OooO0oO = j3 + 1;
                o0OO.OooOOO0(j3, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i, long j) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) throws CodedOutputStream.OutOfSpaceException {
        if (this.f28187OooO0oO <= this.f28185OooO0o) {
            while ((j & (-128)) != 0) {
                long j2 = this.f28187OooO0oO;
                this.f28187OooO0oO = j2 + 1;
                o0OO.OooOOO0(j2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            long j3 = this.f28187OooO0oO;
            this.f28187OooO0oO = 1 + j3;
            o0OO.OooOOO0(j3, (byte) j);
            return;
        }
        while (true) {
            long j4 = this.f28187OooO0oO;
            long j5 = this.f28186OooO0o0;
            if (j4 >= j5) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f28187OooO0oO), Long.valueOf(j5), 1));
            }
            if ((j & (-128)) == 0) {
                this.f28187OooO0oO = 1 + j4;
                o0OO.OooOOO0(j4, (byte) j);
                return;
            } else {
                this.f28187OooO0oO = j4 + 1;
                o0OO.OooOOO0(j4, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i, byte[] bArr, int i2, int i3) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i, 2);
        writeByteArrayNoTag(bArr, i2, i3);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        write(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i, MessageLite messageLite, o0oO0O0o o0oo0o0o) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i, 2);
        writeMessageNoTag(messageLite, o0oo0o0o);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, o0oO0O0o o0oo0o0o) throws CodedOutputStream.OutOfSpaceException {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(o0oo0o0o));
        o0oo0o0o.OooO00o(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i, int i2) throws CodedOutputStream.OutOfSpaceException {
        long j = this.f28186OooO0o0;
        if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
            long j2 = i2;
            long j3 = j - j2;
            long j4 = this.f28187OooO0oO;
            if (j3 >= j4) {
                o0OO.f28347OooO0OO.OooO0Oo(bArr, i, j4, j2);
                this.f28187OooO0oO += j2;
                return;
            }
        }
        if (bArr == null) {
            throw new NullPointerException("value");
        }
        throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f28187OooO0oO), Long.valueOf(j), Integer.valueOf(i2)));
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        ByteBuffer byteBuffer2 = this.f28182OooO0O0;
        try {
            int iRemaining = byteBuffer.remaining();
            byteBuffer2.position((int) (this.f28187OooO0oO - this.f28183OooO0OO));
            byteBuffer2.put(byteBuffer);
            this.f28187OooO0oO += iRemaining;
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }
}
