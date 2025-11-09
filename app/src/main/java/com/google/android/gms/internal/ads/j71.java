package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes2.dex */
public final class j71 extends AbstractC2056sp {

    /* renamed from: OooO */
    public int f20215OooO;

    /* renamed from: OooOO0 */
    public boolean f20216OooOO0;

    /* renamed from: OooOO0O */
    public int f20217OooOO0O;
    public long OooOO0o;

    /* renamed from: OooOOO */
    public byte[] f20218OooOOO;

    /* renamed from: OooOOO0 */
    public int f20219OooOOO0;

    /* renamed from: OooOOOO */
    public int f20220OooOOOO;

    /* renamed from: OooOOOo */
    public int f20221OooOOOo;

    /* renamed from: OooOOo0 */
    public byte[] f20222OooOOo0;

    public final void OooO(boolean z) {
        int i;
        int length;
        int i2 = this.f20221OooOOOo;
        int length2 = this.f20218OooOOO.length;
        if (i2 != length2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.f20219OooOOO0 == 0) {
            if (z) {
                OooOO0(i2, 3);
                length = i2;
            } else {
                af0.OooooO0(i2 >= (length2 >> 1));
                length = this.f20218OooOOO.length >> 1;
                OooOO0(length, 0);
            }
            i = length;
        } else {
            int i3 = length2 >> 1;
            int i4 = i2 - i3;
            if (z) {
                int iOooO0oo = OooO0oo(i4) + (this.f20218OooOOO.length >> 1);
                OooOO0(iOooO0oo, 2);
                int i5 = i3 + i4;
                i = iOooO0oo;
                length = i5;
            } else {
                int iOooO0oo2 = OooO0oo(i4);
                OooOO0(iOooO0oo2, 1);
                i = iOooO0oo2;
                length = i4;
            }
        }
        boolean z2 = length % this.f20215OooO == 0;
        String strOooO0o = OooO0oO.OooOo.OooO0o(length, "bytesConsumed is not aligned to frame size: %s");
        if (!z2) {
            throw new IllegalStateException(String.valueOf(strOooO0o));
        }
        af0.OooooO0(i2 >= i);
        this.f20221OooOOOo -= length;
        int i6 = this.f20220OooOOOO + length;
        this.f20220OooOOOO = i6;
        this.f20220OooOOOO = i6 % this.f20218OooOOO.length;
        this.f20219OooOOO0 = (i / this.f20215OooO) + this.f20219OooOOO0;
        this.OooOO0o += (length - i) / r2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final void OooO00o(ByteBuffer byteBuffer) {
        int iLimit;
        int i;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f24138OooO0oO.hasRemaining()) {
            if (this.f20217OooOO0O != 0) {
                af0.OooooO0(this.f20220OooOOOO < this.f20218OooOOO.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & ForkServer.ERROR)) > 1024) {
                        int i2 = this.f20215OooO;
                        iLimit = (iPosition2 / i2) * i2;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i3 = this.f20220OooOOOO;
                int i4 = this.f20221OooOOOo;
                int i5 = i3 + i4;
                int length = this.f20218OooOOO.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int iMin = Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f20218OooOOO, i5, iMin);
                int i6 = this.f20221OooOOOo + iMin;
                this.f20221OooOOOo = i6;
                af0.OooooO0(i6 <= this.f20218OooOOO.length);
                boolean z = iLimit < iLimit2 && iPosition3 < i;
                OooO(z);
                if (z) {
                    this.f20217OooOO0O = 0;
                    this.f20219OooOOO0 = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f20218OooOOO.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit4) << 8) | (byteBuffer.get(iLimit4 - 1) & ForkServer.ERROR)) > 1024) {
                        int i7 = this.f20215OooO;
                        iPosition = OooO0oO.OooOo.OooOoOO(iLimit4, i7, i7, i7);
                        break;
                    }
                    iLimit4 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f20217OooOO0O = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    OooO0Oo(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp
    public final C1759ko OooO0OO(C1759ko c1759ko) throws C2277yo {
        if (c1759ko.f20639OooO0OO == 2) {
            return c1759ko.f20637OooO00o == -1 ? C1759ko.f20636OooO0o0 : c1759ko;
        }
        throw new C2277yo(c1759ko);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp
    public final void OooO0o() {
        if (this.f20221OooOOOo > 0) {
            OooO(true);
            this.f20219OooOOO0 = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp
    public final void OooO0o0() {
        if (zzg()) {
            int i = this.f24133OooO0O0.f20638OooO0O0;
            int i2 = i + i;
            this.f20215OooO = i2;
            int i3 = ((((int) ((PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH * r0.f20637OooO00o) / 1000000)) / 2) / i2) * i2;
            int i4 = i3 + i3;
            if (this.f20218OooOOO.length != i4) {
                this.f20218OooOOO = new byte[i4];
                this.f20222OooOOo0 = new byte[i4];
            }
        }
        this.f20217OooOO0O = 0;
        this.OooOO0o = 0L;
        this.f20219OooOOO0 = 0;
        this.f20220OooOOOO = 0;
        this.f20221OooOOOo = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp
    public final void OooO0oO() {
        this.f20216OooOO0 = false;
        byte[] bArr = i80.f19998OooO0o;
        this.f20218OooOOO = bArr;
        this.f20222OooOOo0 = bArr;
    }

    public final int OooO0oo(int i) {
        int length = ((((int) ((2000000 * this.f24133OooO0O0.f20637OooO00o) / 1000000)) - this.f20219OooOOO0) * this.f20215OooO) - (this.f20218OooOOO.length >> 1);
        af0.OooooO0(length >= 0);
        int iMin = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i2 = this.f20215OooO;
        return (iMin / i2) * i2;
    }

    public final void OooOO0(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        af0.OoooO0(this.f20221OooOOOo >= i);
        if (i2 == 2) {
            int i4 = this.f20220OooOOOO;
            int i5 = this.f20221OooOOOo;
            int i6 = i4 + i5;
            byte[] bArr = this.f20218OooOOO;
            int length = bArr.length;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, this.f20222OooOOo0, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, this.f20222OooOOo0, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, this.f20222OooOOo0, 0, i8);
                    System.arraycopy(this.f20218OooOOO, 0, this.f20222OooOOo0, i8, i7);
                }
            }
        } else {
            int i9 = this.f20220OooOOOO;
            int i10 = i9 + i;
            byte[] bArr2 = this.f20218OooOOO;
            int length2 = bArr2.length;
            if (i10 <= length2) {
                System.arraycopy(bArr2, i9, this.f20222OooOOo0, 0, i);
            } else {
                int i11 = length2 - i9;
                System.arraycopy(bArr2, i9, this.f20222OooOOo0, 0, i11);
                System.arraycopy(this.f20218OooOOO, 0, this.f20222OooOOo0, i11, i - i11);
            }
        }
        af0.OoooOOo("sizeToOutput is not aligned to frame size: " + i, i % this.f20215OooO == 0);
        af0.OooooO0(this.f20220OooOOOO < this.f20218OooOOO.length);
        byte[] bArr3 = this.f20222OooOOo0;
        af0.OoooOOo(OooO0oO.OooOo.OooO0o(i, "byteOutput size is not aligned to frame size "), i % this.f20215OooO == 0);
        if (i2 != 3) {
            for (int i12 = 0; i12 < i; i12 += 2) {
                int i13 = i12 + 1;
                int i14 = (bArr3[i13] << 8) | (bArr3[i12] & ForkServer.ERROR);
                if (i2 == 0) {
                    i3 = ((((i12 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i12) / (i - 1)) / 1000);
                    }
                }
                int i15 = (i14 * i3) / 100;
                if (i15 >= 32767) {
                    bArr3[i12] = -1;
                    bArr3[i13] = 127;
                } else if (i15 <= -32768) {
                    bArr3[i12] = 0;
                    bArr3[i13] = -128;
                } else {
                    bArr3[i12] = (byte) (i15 & 255);
                    bArr3[i13] = (byte) (i15 >> 8);
                }
            }
        }
        OooO0Oo(i).put(bArr3, 0, i).flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp, com.google.android.gms.internal.ads.InterfaceC1723jp
    public final boolean zzg() {
        return super.zzg() && this.f20216OooOO0;
    }
}
