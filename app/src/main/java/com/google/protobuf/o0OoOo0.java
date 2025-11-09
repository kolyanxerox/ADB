package com.google.protobuf;

/* loaded from: classes2.dex */
public final class o0OoOo0 extends oo000o {

    /* renamed from: OooOo */
    public final int f28397OooOo;

    /* renamed from: OooOo0o */
    public final int f28398OooOo0o;

    public o0OoOo0(byte[] bArr, int i, int i2) {
        super(bArr);
        ByteString.checkRange(i, i + i2, bArr.length);
        this.f28398OooOo0o = i;
        this.f28397OooOo = i2;
    }

    @Override // com.google.protobuf.oo000o
    public final int OooO0o() {
        return this.f28398OooOo0o;
    }

    @Override // com.google.protobuf.oo000o, com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        ByteString.checkIndex(i, this.f28397OooOo);
        return this.f28428OooOo0O[this.f28398OooOo0o + i];
    }

    @Override // com.google.protobuf.oo000o, com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f28428OooOo0O, this.f28398OooOo0o + i, bArr, i2, i3);
    }

    @Override // com.google.protobuf.oo000o, com.google.protobuf.o00Ooo, com.google.protobuf.ByteString
    public final byte internalByteAt(int i) {
        return this.f28428OooOo0O[this.f28398OooOo0o + i];
    }

    @Override // com.google.protobuf.oo000o, com.google.protobuf.ByteString
    public final int size() {
        return this.f28397OooOo;
    }
}
