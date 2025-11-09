package com.google.android.gms.internal.ads;

import com.ironsource.C3037dc;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class yn0 extends ao0 {
    public yn0(wn0 wn0Var, Character ch) {
        super(wn0Var, ch);
        ii0.OoooOo0(wn0Var.f25340OooO0O0.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.ao0
    public final int OooO00o(byte[] bArr, CharSequence charSequence) throws zn0 {
        CharSequence charSequenceOooO0o0 = OooO0o0(charSequence);
        int length = charSequenceOooO0o0.length();
        wn0 wn0Var = this.f17070OooO00o;
        if (!wn0Var.f25346OooO0oo[length % wn0Var.f25344OooO0o0]) {
            throw new zn0(OooO0oO.OooOo.OooO0o(charSequenceOooO0o0.length(), "Invalid input length "));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceOooO0o0.length()) {
            int i3 = i2 + 1;
            int iOooO00o = (wn0Var.OooO00o(charSequenceOooO0o0.charAt(i + 1)) << 12) | (wn0Var.OooO00o(charSequenceOooO0o0.charAt(i)) << 18);
            bArr[i2] = (byte) (iOooO00o >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceOooO0o0.length()) {
                int i5 = i + 3;
                int iOooO00o2 = iOooO00o | (wn0Var.OooO00o(charSequenceOooO0o0.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iOooO00o2 >>> 8) & 255);
                if (i5 < charSequenceOooO0o0.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iOooO00o2 | wn0Var.OooO00o(charSequenceOooO0o0.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.ao0
    public final ao0 OooO0O0(wn0 wn0Var, Character ch) {
        return new yn0(wn0Var, ch);
    }

    @Override // com.google.android.gms.internal.ads.ao0
    public final void OooO0OO(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        ii0.OoooooO(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & ForkServer.ERROR) << 8) | ((bArr[i2] & ForkServer.ERROR) << 16) | (bArr[i2 + 2] & ForkServer.ERROR);
            wn0 wn0Var = this.f17070OooO00o;
            sb.append(wn0Var.f25340OooO0O0[i4 >>> 18]);
            char[] cArr = wn0Var.f25340OooO0O0;
            sb.append(cArr[(i4 >>> 12) & 63]);
            sb.append(cArr[(i4 >>> 6) & 63]);
            sb.append(cArr[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            OooO0o(sb, bArr, i2, i - i2);
        }
    }

    public yn0(String str, String str2) {
        this(new wn0(str, str2.toCharArray()), Character.valueOf(C3037dc.f8244T));
    }
}
