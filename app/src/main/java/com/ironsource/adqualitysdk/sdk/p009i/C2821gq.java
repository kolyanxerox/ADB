package com.ironsource.adqualitysdk.sdk.p009i;

import com.ironsource.InterfaceC3173h3;
import com.moloco.sdk.publisher.Moloco;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gq */
/* loaded from: classes2.dex */
public final class C2821gq extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static int f6501 = 1;

    /* renamed from: ﻛ */
    private static char[] f6502 = {'g', 201, 201, 205, 205, 190, 157, 176, 203, 198, 205, 206, 202, 199, 203, 210, 175, 172, 199, 203, 176, 174, 201, 201, 205, 205, 206, 173, 173, 206, 201, 's', 232, 231, 231, 227, 227};

    /* renamed from: ﾒ */
    private static int f6503;

    /* renamed from: ﾒ */
    private static String m6840(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f6502, i, cArr, 0, i2);
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        f6503 = (f6501 + InterfaceC3173h3.d.b.f8819b) % 128;
        String strIntern = m6840(true, new int[]{0, 31, 96, 0}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000").intern();
        f6503 = (f6501 + 119) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6503 = (f6501 + 87) % 128;
        String strIntern = m6840(false, new int[]{31, 6, 122, 0}, "\u0001\u0000\u0001\u0001\u0000\u0000").intern();
        f6503 = (f6501 + 35) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6501 + 115;
        f6503 = i % 128;
        if (i % 2 == 0) {
            return Moloco.class;
        }
        int i2 = 49 / 0;
        return Moloco.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2688bs c2688bs = new C2688bs(mo6813());
        f6501 = (f6503 + 117) % 128;
        return c2688bs;
    }
}
