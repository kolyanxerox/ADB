package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class o00000 extends CodedOutputStream {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f28188OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f28189OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f28190OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f28191OooO0Oo;

    public o00000(byte[] bArr, int i, int i2) {
        super();
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i3 = i + i2;
        if ((i | i2 | (bArr.length - i3)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        this.f28188OooO00o = bArr;
        this.f28189OooO0O0 = i;
        this.f28191OooO0Oo = i;
        this.f28190OooO0OO = i3;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void flush() {
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.f28191OooO0Oo - this.f28189OooO0O0;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return this.f28190OooO0OO - this.f28191OooO0Oo;
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b) throws CodedOutputStream.OutOfSpaceException {
        try {
            byte[] bArr = this.f28188OooO00o;
            int i = this.f28191OooO0Oo;
            this.f28191OooO0Oo = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28191OooO0Oo), Integer.valueOf(this.f28190OooO0OO), 1), e);
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
            byte[] bArr = this.f28188OooO00o;
            int i2 = this.f28191OooO0Oo;
            int i3 = i2 + 1;
            this.f28191OooO0Oo = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f28191OooO0Oo = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f28191OooO0Oo = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f28191OooO0Oo = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28191OooO0Oo), Integer.valueOf(this.f28190OooO0OO), 1), e);
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
            byte[] bArr = this.f28188OooO00o;
            int i = this.f28191OooO0Oo;
            int i2 = i + 1;
            this.f28191OooO0Oo = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f28191OooO0Oo = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f28191OooO0Oo = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f28191OooO0Oo = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f28191OooO0Oo = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f28191OooO0Oo = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f28191OooO0Oo = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f28191OooO0Oo = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28191OooO0Oo), Integer.valueOf(this.f28190OooO0OO), 1), e);
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
        int i = this.f28191OooO0Oo;
        try {
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            byte[] bArr = this.f28188OooO00o;
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                writeUInt32NoTag(o0OOO0OO.OooO0o0(str));
                this.f28191OooO0Oo = o0OOO0OO.f28370OooO00o.OooO0o(str, bArr, this.f28191OooO0Oo, spaceLeft());
                return;
            }
            int i2 = i + iComputeUInt32SizeNoTag2;
            this.f28191OooO0Oo = i2;
            int iOooO0o = o0OOO0OO.f28370OooO00o.OooO0o(str, bArr, i2, spaceLeft());
            this.f28191OooO0Oo = i;
            writeUInt32NoTag((iOooO0o - i) - iComputeUInt32SizeNoTag2);
            this.f28191OooO0Oo = iOooO0o;
        } catch (o0OOO00 e) {
            this.f28191OooO0Oo = i;
            inefficientWriteStringNoTag(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream.OutOfSpaceException(e2);
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
            byte[] bArr = this.f28188OooO00o;
            if (i2 == 0) {
                int i3 = this.f28191OooO0Oo;
                this.f28191OooO0Oo = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f28191OooO0Oo;
                    this.f28191OooO0Oo = i4 + 1;
                    bArr[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28191OooO0Oo), Integer.valueOf(this.f28190OooO0OO), 1), e);
                }
            }
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28191OooO0Oo), Integer.valueOf(this.f28190OooO0OO), 1), e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i, long j) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) throws CodedOutputStream.OutOfSpaceException {
        boolean z = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.f28188OooO00o;
        if (z && spaceLeft() >= 10) {
            while ((j & (-128)) != 0) {
                int i = this.f28191OooO0Oo;
                this.f28191OooO0Oo = i + 1;
                o0OO.OooOOO(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i2 = this.f28191OooO0Oo;
            this.f28191OooO0Oo = i2 + 1;
            o0OO.OooOOO(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i3 = this.f28191OooO0Oo;
                this.f28191OooO0Oo = i3 + 1;
                bArr[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28191OooO0Oo), Integer.valueOf(this.f28190OooO0OO), 1), e);
            }
        }
        int i4 = this.f28191OooO0Oo;
        this.f28191OooO0Oo = i4 + 1;
        bArr[i4] = (byte) j;
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
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(o0oo0o0o));
        o0oo0o0o.OooO00o(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, o0oO0O0o o0oo0o0o) throws CodedOutputStream.OutOfSpaceException {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(o0oo0o0o));
        o0oo0o0o.OooO00o(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i, int i2) throws CodedOutputStream.OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.f28188OooO00o, this.f28191OooO0Oo, i2);
            this.f28191OooO0Oo += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28191OooO0Oo), Integer.valueOf(this.f28190OooO0OO), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        int iRemaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.f28188OooO00o, this.f28191OooO0Oo, iRemaining);
            this.f28191OooO0Oo += iRemaining;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28191OooO0Oo), Integer.valueOf(this.f28190OooO0OO), Integer.valueOf(iRemaining)), e);
        }
    }
}
