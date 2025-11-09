package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class o00000OO extends o000000O {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final OutputStream f28199OooO0o0;

    public o00000OO(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f28199OooO0o0 = outputStream;
    }

    public final void OooO0oO() throws IOException {
        this.f28199OooO0o0.write(this.f28192OooO00o, 0, this.f28194OooO0OO);
        this.f28194OooO0OO = 0;
    }

    public final void OooO0oo(int i) throws IOException {
        if (this.f28193OooO0O0 - this.f28194OooO0OO < i) {
            OooO0oO();
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() throws IOException {
        if (this.f28194OooO0OO > 0) {
            OooO0oO();
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b) throws IOException {
        if (this.f28194OooO0OO == this.f28193OooO0O0) {
            OooO0oO();
        }
        OooO00o(b);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBool(int i, boolean z) throws IOException {
        OooO0oo(11);
        OooO0Oo(i, 0);
        OooO00o(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i, byte[] bArr) throws IOException {
        writeByteArray(i, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException {
        writeUInt32NoTag(i2);
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
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
    public final void writeFixed32(int i, int i2) throws IOException {
        OooO0oo(14);
        OooO0Oo(i, 5);
        OooO0O0(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int i) throws IOException {
        OooO0oo(4);
        OooO0O0(i);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i, long j) throws IOException {
        OooO0oo(18);
        OooO0Oo(i, 1);
        OooO0OO(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j) throws IOException {
        OooO0oo(8);
        OooO0OO(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32(int i, int i2) throws IOException {
        OooO0oo(20);
        OooO0Oo(i, 0);
        if (i2 >= 0) {
            OooO0o0(i2);
        } else {
            OooO0o(i2);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32NoTag(int i) throws IOException {
        if (i >= 0) {
            writeUInt32NoTag(i);
        } else {
            writeUInt64NoTag(i);
        }
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
    public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
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
        int iOooO0o0;
        try {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i = iComputeUInt32SizeNoTag + length;
            int i2 = this.f28193OooO0O0;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iOooO0o = o0OOO0OO.f28370OooO00o.OooO0o(str, bArr, 0, length);
                writeUInt32NoTag(iOooO0o);
                write(bArr, 0, iOooO0o);
                return;
            }
            if (i > i2 - this.f28194OooO0OO) {
                OooO0oO();
            }
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            int i3 = this.f28194OooO0OO;
            byte[] bArr2 = this.f28192OooO00o;
            try {
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i4 = i3 + iComputeUInt32SizeNoTag2;
                        this.f28194OooO0OO = i4;
                        int iOooO0o2 = o0OOO0OO.f28370OooO00o.OooO0o(str, bArr2, i4, i2 - i4);
                        this.f28194OooO0OO = i3;
                        iOooO0o0 = (iOooO0o2 - i3) - iComputeUInt32SizeNoTag2;
                        OooO0o0(iOooO0o0);
                        this.f28194OooO0OO = iOooO0o2;
                    } else {
                        iOooO0o0 = o0OOO0OO.OooO0o0(str);
                        OooO0o0(iOooO0o0);
                        this.f28194OooO0OO = o0OOO0OO.f28370OooO00o.OooO0o(str, bArr2, this.f28194OooO0OO, iOooO0o0);
                    }
                    this.f28195OooO0Oo += iOooO0o0;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new CodedOutputStream.OutOfSpaceException(e);
                }
            } catch (o0OOO00 e2) {
                this.f28195OooO0Oo -= this.f28194OooO0OO - i3;
                this.f28194OooO0OO = i3;
                throw e2;
            }
        } catch (o0OOO00 e3) {
            inefficientWriteStringNoTag(str, e3);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeTag(int i, int i2) throws IOException {
        writeUInt32NoTag(WireFormat.makeTag(i, i2));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32(int i, int i2) throws IOException {
        OooO0oo(20);
        OooO0Oo(i, 0);
        OooO0o0(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int i) throws IOException {
        OooO0oo(5);
        OooO0o0(i);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i, long j) throws IOException {
        OooO0oo(20);
        OooO0Oo(i, 0);
        OooO0o(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) throws IOException {
        OooO0oo(10);
        OooO0o(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException {
        writeTag(i, 2);
        writeByteArrayNoTag(bArr, i2, i3);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i, MessageLite messageLite, o0oO0O0o o0oo0o0o) throws IOException {
        writeTag(i, 2);
        writeMessageNoTag(messageLite, o0oo0o0o);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, o0oO0O0o o0oo0o0o) throws IOException {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(o0oo0o0o));
        o0oo0o0o.OooO00o(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f28194OooO0OO;
        int i4 = this.f28193OooO0O0;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f28192OooO00o;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f28194OooO0OO += i2;
            this.f28195OooO0Oo += i2;
            return;
        }
        int i6 = i4 - i3;
        System.arraycopy(bArr, i, bArr2, i3, i6);
        int i7 = i + i6;
        int i8 = i2 - i6;
        this.f28194OooO0OO = i4;
        this.f28195OooO0Oo += i6;
        OooO0oO();
        if (i8 <= i4) {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f28194OooO0OO = i8;
        } else {
            this.f28199OooO0o0.write(bArr, i7, i8);
        }
        this.f28195OooO0Oo += i8;
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        int i = this.f28194OooO0OO;
        int i2 = this.f28193OooO0O0;
        int i3 = i2 - i;
        byte[] bArr = this.f28192OooO00o;
        if (i3 >= iRemaining) {
            byteBuffer.get(bArr, i, iRemaining);
            this.f28194OooO0OO += iRemaining;
            this.f28195OooO0Oo += iRemaining;
            return;
        }
        int i4 = i2 - i;
        byteBuffer.get(bArr, i, i4);
        int i5 = iRemaining - i4;
        this.f28194OooO0OO = i2;
        this.f28195OooO0Oo += i4;
        OooO0oO();
        while (i5 > i2) {
            byteBuffer.get(bArr, 0, i2);
            this.f28199OooO0o0.write(bArr, 0, i2);
            i5 -= i2;
            this.f28195OooO0Oo += i2;
        }
        byteBuffer.get(bArr, 0, i5);
        this.f28194OooO0OO = i5;
        this.f28195OooO0Oo += i5;
    }
}
