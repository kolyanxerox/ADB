package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class o000000O extends CodedOutputStream {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f28192OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f28193OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f28194OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f28195OooO0Oo;

    public o000000O(int i) {
        super();
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.f28192OooO00o = bArr;
        this.f28193OooO0O0 = bArr.length;
    }

    public final void OooO00o(byte b) {
        int i = this.f28194OooO0OO;
        this.f28194OooO0OO = i + 1;
        this.f28192OooO00o[i] = b;
        this.f28195OooO0Oo++;
    }

    public final void OooO0O0(int i) {
        int i2 = this.f28194OooO0OO;
        int i3 = i2 + 1;
        this.f28194OooO0OO = i3;
        byte[] bArr = this.f28192OooO00o;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f28194OooO0OO = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f28194OooO0OO = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f28194OooO0OO = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f28195OooO0Oo += 4;
    }

    public final void OooO0OO(long j) {
        int i = this.f28194OooO0OO;
        int i2 = i + 1;
        this.f28194OooO0OO = i2;
        byte[] bArr = this.f28192OooO00o;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f28194OooO0OO = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f28194OooO0OO = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f28194OooO0OO = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f28194OooO0OO = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f28194OooO0OO = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f28194OooO0OO = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f28194OooO0OO = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f28195OooO0Oo += 8;
    }

    public final void OooO0Oo(int i, int i2) {
        OooO0o0(WireFormat.makeTag(i, i2));
    }

    public final void OooO0o(long j) {
        boolean z = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.f28192OooO00o;
        if (!z) {
            while ((j & (-128)) != 0) {
                int i = this.f28194OooO0OO;
                this.f28194OooO0OO = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                this.f28195OooO0Oo++;
                j >>>= 7;
            }
            int i2 = this.f28194OooO0OO;
            this.f28194OooO0OO = i2 + 1;
            bArr[i2] = (byte) j;
            this.f28195OooO0Oo++;
            return;
        }
        long j2 = this.f28194OooO0OO;
        while ((j & (-128)) != 0) {
            int i3 = this.f28194OooO0OO;
            this.f28194OooO0OO = i3 + 1;
            o0OO.OooOOO(bArr, i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        int i4 = this.f28194OooO0OO;
        this.f28194OooO0OO = i4 + 1;
        o0OO.OooOOO(bArr, i4, (byte) j);
        this.f28195OooO0Oo += (int) (this.f28194OooO0OO - j2);
    }

    public final void OooO0o0(int i) {
        boolean z = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.f28192OooO00o;
        if (!z) {
            while ((i & (-128)) != 0) {
                int i2 = this.f28194OooO0OO;
                this.f28194OooO0OO = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                this.f28195OooO0Oo++;
                i >>>= 7;
            }
            int i3 = this.f28194OooO0OO;
            this.f28194OooO0OO = i3 + 1;
            bArr[i3] = (byte) i;
            this.f28195OooO0Oo++;
            return;
        }
        long j = this.f28194OooO0OO;
        while ((i & (-128)) != 0) {
            int i4 = this.f28194OooO0OO;
            this.f28194OooO0OO = i4 + 1;
            o0OO.OooOOO(bArr, i4, (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        int i5 = this.f28194OooO0OO;
        this.f28194OooO0OO = i5 + 1;
        o0OO.OooOOO(bArr, i5, (byte) i);
        this.f28195OooO0Oo += (int) (this.f28194OooO0OO - j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.f28195OooO0Oo;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void writeLazy(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void writeLazy(ByteBuffer byteBuffer) {
        write(byteBuffer);
    }
}
