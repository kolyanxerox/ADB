package com.google.android.gms.internal.ads;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class xn0 extends ao0 {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final char[] f25654OooO0o0;

    public xn0(wn0 wn0Var) {
        super(wn0Var, (Character) null);
        this.f25654OooO0o0 = new char[512];
        char[] cArr = wn0Var.f25340OooO0O0;
        ii0.OoooOo0(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f25654OooO0o0;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // com.google.android.gms.internal.ads.ao0
    public final int OooO00o(byte[] bArr, CharSequence charSequence) throws zn0 {
        if (charSequence.length() % 2 == 1) {
            throw new zn0(OooO0oO.OooOo.OooO0o(charSequence.length(), "Invalid input length "));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            wn0 wn0Var = this.f17070OooO00o;
            bArr[i2] = (byte) ((wn0Var.OooO00o(cCharAt) << 4) | wn0Var.OooO00o(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.ao0
    public final ao0 OooO0O0(wn0 wn0Var, Character ch) {
        return new xn0(wn0Var);
    }

    @Override // com.google.android.gms.internal.ads.ao0
    public final void OooO0OO(StringBuilder sb, byte[] bArr, int i) {
        ii0.OoooooO(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & ForkServer.ERROR;
            char[] cArr = this.f25654OooO0o0;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
