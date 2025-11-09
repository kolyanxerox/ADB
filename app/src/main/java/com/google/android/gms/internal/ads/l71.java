package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class l71 extends AbstractC2056sp {

    /* renamed from: OooO, reason: collision with root package name */
    public int f20817OooO;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f20818OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public boolean f20819OooOO0O;
    public int OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public int f20820OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public byte[] f20821OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public long f20822OooOOOO;

    @Override // com.google.android.gms.internal.ads.InterfaceC1723jp
    public final void OooO00o(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.OooOO0o);
        this.f20822OooOOOO += iMin / this.f24133OooO0O0.f20640OooO0Oo;
        this.OooOO0o -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.OooOO0o <= 0) {
            int i2 = i - iMin;
            int length = (this.f20820OooOOO + i2) - this.f20821OooOOO0.length;
            ByteBuffer byteBufferOooO0Oo = OooO0Oo(length);
            int iMax = Math.max(0, Math.min(length, this.f20820OooOOO));
            byteBufferOooO0Oo.put(this.f20821OooOOO0, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i2));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferOooO0Oo.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i3 = i2 - iMax2;
            int i4 = this.f20820OooOOO - iMax;
            this.f20820OooOOO = i4;
            byte[] bArr = this.f20821OooOOO0;
            System.arraycopy(bArr, iMax, bArr, 0, i4);
            byteBuffer.get(this.f20821OooOOO0, this.f20820OooOOO, i3);
            this.f20820OooOOO += i3;
            byteBufferOooO0Oo.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp
    public final C1759ko OooO0OO(C1759ko c1759ko) throws C2277yo {
        if (c1759ko.f20639OooO0OO != 2) {
            throw new C2277yo(c1759ko);
        }
        this.f20819OooOO0O = true;
        return (this.f20817OooO == 0 && this.f20818OooOO0 == 0) ? C1759ko.f20636OooO0o0 : c1759ko;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp
    public final void OooO0o() {
        if (this.f20819OooOO0O) {
            if (this.f20820OooOOO > 0) {
                this.f20822OooOOOO += r0 / this.f24133OooO0O0.f20640OooO0Oo;
            }
            this.f20820OooOOO = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp
    public final void OooO0o0() {
        if (this.f20819OooOO0O) {
            this.f20819OooOO0O = false;
            int i = this.f20818OooOO0;
            int i2 = this.f24133OooO0O0.f20640OooO0Oo;
            this.f20821OooOOO0 = new byte[i * i2];
            this.OooOO0o = this.f20817OooO * i2;
        }
        this.f20820OooOOO = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp
    public final void OooO0oO() {
        this.f20821OooOOO0 = i80.f19998OooO0o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp, com.google.android.gms.internal.ads.InterfaceC1723jp
    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.f20820OooOOO) > 0) {
            OooO0Oo(i).put(this.f20821OooOOO0, 0, this.f20820OooOOO).flip();
            this.f20820OooOOO = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2056sp, com.google.android.gms.internal.ads.InterfaceC1723jp
    public final boolean zzh() {
        return super.zzh() && this.f20820OooOOO == 0;
    }
}
