package com.ironsource.adqualitysdk.sdk.p009i;

import com.fyber.FairBid;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gd */
/* loaded from: classes2.dex */
public final class C2808gd extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static char[] f6439 = {'g', 186, 191, 210, 202, 184, 159, 181, 208, 200, 210, 212, 175, 178, 211, 206, 200, '8', 'r', 'p', 'r', 'z', 'w', 'r'};

    /* renamed from: ﾇ */
    private static int f6440 = 0;

    /* renamed from: ﾒ */
    private static int f6441 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        int i = f6441 + 47;
        f6440 = i % 128;
        String strIntern = (i % 2 != 0 ? m6823(false, new int[]{0, 17, InterfaceC3173h3.d.b.f8819b, 16}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001") : m6823(true, new int[]{0, 17, InterfaceC3173h3.d.b.f8819b, 16}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001")).intern();
        int i2 = f6440 + 29;
        f6441 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6441 + 25;
        f6440 = i % 128;
        return (i % 2 != 0 ? m6823(false, new int[]{17, 7, 13, 1}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001") : m6823(false, new int[]{17, 7, 13, 1}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001")).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6441 + 117;
        int i2 = i % 128;
        f6440 = i2;
        if (i % 2 != 0) {
            throw null;
        }
        int i3 = i2 + 3;
        f6441 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
        return FairBid.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2686bq c2686bq = new C2686bq(mo6813());
        int i = f6441 + 31;
        f6440 = i % 128;
        if (i % 2 == 0) {
            return c2686bq;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private static String m6823(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (C2831h.f6553) {
            try {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(f6439, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    C2831h.f6552 = 0;
                    char c = 0;
                    while (true) {
                        int i5 = C2831h.f6552;
                        if (i5 >= i2) {
                            break;
                        }
                        if (bArr[i5] == 1) {
                            cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                        } else {
                            cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                        }
                        c = cArr2[i5];
                        C2831h.f6552 = i5 + 1;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i6 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i6, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i6);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2831h.f6552 = 0;
                    while (true) {
                        int i7 = C2831h.f6552;
                        if (i7 >= i2) {
                            break;
                        }
                        cArr4[i7] = cArr[(i2 - i7) - 1];
                        C2831h.f6552 = i7 + 1;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    C2831h.f6552 = 0;
                    while (true) {
                        int i8 = C2831h.f6552;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr[i8] = (char) (cArr[i8] - iArr[2]);
                        C2831h.f6552 = i8 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
