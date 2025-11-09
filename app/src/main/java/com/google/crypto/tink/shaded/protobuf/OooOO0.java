package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class OooOO0 extends OooOO0O {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final int f28014OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final int f28015OooOoOO;

    public OooOO0(byte[] bArr, int i, int i2) {
        super(bArr);
        OooOOO0.OooO0o(i, i + i2, bArr.length);
        this.f28014OooOoO = i;
        this.f28015OooOoOO = i2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOO0O, com.google.crypto.tink.shaded.protobuf.OooOOO0
    public final void OooO(int i, byte[] bArr) {
        System.arraycopy(this.f28016OooOoO0, this.f28014OooOoO, bArr, 0, i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOO0O, com.google.crypto.tink.shaded.protobuf.OooOOO0
    public final byte OooO0o0(int i) {
        int i2 = this.f28015OooOoOO;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f28016OooOoO0[this.f28014OooOoO + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(OooO0oO.OooOo.OooO0o(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOO0O
    public final int OooOO0O() {
        return this.f28014OooOoO;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOO0O
    public final byte OooOO0o(int i) {
        return this.f28016OooOoO0[this.f28014OooOoO + i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOO0O, com.google.crypto.tink.shaded.protobuf.OooOOO0
    public final int size() {
        return this.f28015OooOoOO;
    }
}
