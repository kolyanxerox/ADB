package com.google.protobuf;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o000oOoO implements o00O0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f28226OooO00o;

    @Override // com.google.protobuf.o00O0O
    public final byte[] copyFrom(byte[] bArr, int i, int i2) {
        switch (this.f28226OooO00o) {
            case 0:
                return Arrays.copyOfRange(bArr, i, i2 + i);
            default:
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
        }
    }
}
