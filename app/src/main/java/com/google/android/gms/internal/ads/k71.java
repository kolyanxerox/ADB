package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class k71 extends AbstractC2056sp {

    /* renamed from: OooO, reason: collision with root package name */
    public static final int f20455OooO = Float.floatToIntBits(Float.NaN);

    public static void OooO0oo(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (iFloatToIntBits == f20455OooO) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final void OooO00o(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOooO0Oo;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f24133OooO0O0.f20639OooO0OO;
        if (i2 == 21) {
            byteBufferOooO0Oo = OooO0Oo((i / 3) * 4);
            while (iPosition < iLimit) {
                OooO0oo(((byteBuffer.get(iPosition) & ForkServer.ERROR) << 8) | ((byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 24), byteBufferOooO0Oo);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferOooO0Oo = OooO0Oo(i);
            while (iPosition < iLimit) {
                int i3 = byteBuffer.get(iPosition) & ForkServer.ERROR;
                int i4 = (byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 8;
                OooO0oo(i3 | i4 | ((byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition + 3) & ForkServer.ERROR) << 24), byteBufferOooO0Oo);
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferOooO0Oo = OooO0Oo((i / 3) * 4);
            while (iPosition < iLimit) {
                OooO0oo(((byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 8) | ((byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition) & ForkServer.ERROR) << 24), byteBufferOooO0Oo);
                iPosition += 3;
            }
        } else {
            if (i2 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferOooO0Oo = OooO0Oo(i);
            while (iPosition < iLimit) {
                int i5 = byteBuffer.get(iPosition + 3) & ForkServer.ERROR;
                int i6 = (byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 8;
                OooO0oo(i5 | i6 | ((byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition) & ForkServer.ERROR) << 24), byteBufferOooO0Oo);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferOooO0Oo.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp
    public final C1759ko OooO0OO(C1759ko c1759ko) throws C2277yo {
        int i = i80.f19994OooO00o;
        int i2 = c1759ko.f20639OooO0OO;
        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736) {
            return new C1759ko(c1759ko.f20637OooO00o, c1759ko.f20638OooO0O0, 4);
        }
        if (i2 == 4) {
            return C1759ko.f20636OooO0o0;
        }
        throw new C2277yo(c1759ko);
    }
}
