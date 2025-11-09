package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q0 */
/* loaded from: classes2.dex */
public final class C1957q0 implements im0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final byte[] f23468OooOo0O;

    public C1957q0(byte[] bArr, int i) {
        switch (i) {
            case 1:
                this.f23468OooOo0O = bArr;
                break;
            default:
                this.f23468OooOo0O = new byte[256];
                for (int i2 = 0; i2 < 256; i2++) {
                    this.f23468OooOo0O[i2] = (byte) i2;
                }
                int i3 = 0;
                for (int i4 = 0; i4 < 256; i4++) {
                    byte[] bArr2 = this.f23468OooOo0O;
                    byte b = bArr2[i4];
                    i3 = (i3 + b + bArr[i4 % bArr.length]) & 255;
                    bArr2[i4] = bArr2[i3];
                    bArr2[i3] = b;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.im0
    /* renamed from: zza */
    public zm0 mo13706zza() {
        return new mk0(this.f23468OooOo0O);
    }
}
