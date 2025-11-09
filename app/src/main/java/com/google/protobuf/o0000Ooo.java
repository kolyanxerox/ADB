package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class o0000Ooo extends CodedOutputStream {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ByteBuffer f28207OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ByteBuffer f28208OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f28209OooO0OO;

    public o0000Ooo(ByteBuffer byteBuffer) {
        super();
        this.f28207OooO00o = byteBuffer;
        this.f28208OooO0O0 = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.f28209OooO0OO = byteBuffer.position();
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.f28207OooO00o.position(this.f28208OooO0O0.position());
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.f28208OooO0O0.position() - this.f28209OooO0OO;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return this.f28208OooO0O0.remaining();
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b) throws CodedOutputStream.OutOfSpaceException {
        try {
            this.f28208OooO0O0.put(b);
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
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
    public final void writeFixed32NoTag(int i) throws CodedOutputStream.OutOfSpaceException {
        try {
            this.f28208OooO0O0.putInt(i);
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i, long j) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j) throws CodedOutputStream.OutOfSpaceException {
        try {
            this.f28208OooO0O0.putLong(j);
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
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
        ByteBuffer byteBuffer = this.f28208OooO0O0;
        int iPosition = byteBuffer.position();
        try {
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                writeUInt32NoTag(o0OOO0OO.OooO0o0(str));
                try {
                    o0OOO0OO.OooO0Oo(str, byteBuffer);
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream.OutOfSpaceException(e);
                }
            }
            int iPosition2 = byteBuffer.position() + iComputeUInt32SizeNoTag2;
            byteBuffer.position(iPosition2);
            try {
                o0OOO0OO.OooO0Oo(str, byteBuffer);
                int iPosition3 = byteBuffer.position();
                byteBuffer.position(iPosition);
                writeUInt32NoTag(iPosition3 - iPosition2);
                byteBuffer.position(iPosition3);
            } catch (IndexOutOfBoundsException e2) {
                throw new CodedOutputStream.OutOfSpaceException(e2);
            }
        } catch (o0OOO00 e3) {
            byteBuffer.position(iPosition);
            inefficientWriteStringNoTag(str, e3);
        } catch (IllegalArgumentException e4) {
            throw new CodedOutputStream.OutOfSpaceException(e4);
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
        while (true) {
            int i2 = i & (-128);
            ByteBuffer byteBuffer = this.f28208OooO0O0;
            if (i2 == 0) {
                byteBuffer.put((byte) i);
                return;
            }
            try {
                byteBuffer.put((byte) ((i & 127) | 128));
                i >>>= 7;
            } catch (BufferOverflowException e) {
                throw new CodedOutputStream.OutOfSpaceException(e);
            }
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i, long j) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) throws CodedOutputStream.OutOfSpaceException {
        while (true) {
            long j2 = (-128) & j;
            ByteBuffer byteBuffer = this.f28208OooO0O0;
            if (j2 == 0) {
                byteBuffer.put((byte) j);
                return;
            }
            try {
                byteBuffer.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            } catch (BufferOverflowException e) {
                throw new CodedOutputStream.OutOfSpaceException(e);
            }
            throw new CodedOutputStream.OutOfSpaceException(e);
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

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i, int i2) throws CodedOutputStream.OutOfSpaceException {
        try {
            this.f28208OooO0O0.put(bArr, i, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        } catch (BufferOverflowException e2) {
            throw new CodedOutputStream.OutOfSpaceException(e2);
        }
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
    public final void write(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        try {
            this.f28208OooO0O0.put(byteBuffer);
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }
}
