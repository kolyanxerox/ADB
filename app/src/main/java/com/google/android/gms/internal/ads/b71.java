package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class b71 extends AbstractC2056sp {

    /* renamed from: OooO, reason: collision with root package name */
    public int[] f17429OooO;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int[] f17430OooOO0;

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final void OooO00o(ByteBuffer byteBuffer) {
        int[] iArr = this.f17430OooOO0;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferOooO0Oo = OooO0Oo(((iLimit - iPosition) / this.f24133OooO0O0.f20640OooO0Oo) * this.f24134OooO0OO.f20640OooO0Oo);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferOooO0Oo.putShort(byteBuffer.getShort(i + i + iPosition));
            }
            iPosition += this.f24133OooO0O0.f20640OooO0Oo;
        }
        byteBuffer.position(iLimit);
        byteBufferOooO0Oo.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp
    public final C1759ko OooO0OO(C1759ko c1759ko) throws C2277yo {
        int[] iArr = this.f17429OooO;
        if (iArr == null) {
            return C1759ko.f20636OooO0o0;
        }
        if (c1759ko.f20639OooO0OO != 2) {
            throw new C2277yo(c1759ko);
        }
        int length = iArr.length;
        int i = c1759ko.f20638OooO0O0;
        boolean z = i != length;
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            if (i2 >= length2) {
                return z ? new C1759ko(c1759ko.f20637OooO00o, length2, 2) : C1759ko.f20636OooO0o0;
            }
            int i3 = iArr[i2];
            if (i3 >= i) {
                throw new C2277yo(c1759ko);
            }
            z |= i3 != i2;
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp
    public final void OooO0o0() {
        this.f17430OooOO0 = this.f17429OooO;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp
    public final void OooO0oO() {
        this.f17430OooOO0 = null;
        this.f17429OooO = null;
    }
}
