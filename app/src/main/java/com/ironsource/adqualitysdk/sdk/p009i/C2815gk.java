package com.ironsource.adqualitysdk.sdk.p009i;

import com.hyprmx.android.sdk.placement.PlacementType;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gk */
/* loaded from: classes2.dex */
public final class C2815gk extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static char[] f6475 = {'j', 177, 159, 190, 198, 194, 196, 201, 201, 201, 209, 196, 198, 212, 202, 196, 201, 206, 173, 171, 208, 212, 209, 207, 210, 179, 167, 199, 201, 203, 208, 204, 198, 169, 176, 203, 199, 172, 175, 206, 198, 194, 196, 201, 201, 201, '4', 'p', 't', 'q', 'o', 'r'};

    /* renamed from: ｋ */
    private static int f6476 = 0;

    /* renamed from: ﾇ */
    private static int f6477 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        f6476 = (f6477 + 109) % 128;
        String strIntern = m6833(false, new int[]{0, 46, 96, 15}, "\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001").intern();
        int i = f6476 + 69;
        f6477 = i % 128;
        if (i % 2 == 0) {
            int i2 = 54 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6477 + 91;
        f6476 = i % 128;
        String strIntern = (i % 2 != 0 ? m6833(false, new int[]{46, 6, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001") : m6833(false, new int[]{46, 6, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001")).intern();
        f6477 = (f6476 + 49) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6477 + 53;
        f6476 = i % 128;
        if (i % 2 == 0) {
            return PlacementType.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2684bo c2684bo = new C2684bo(mo6813());
        int i = f6477 + 59;
        f6476 = i % 128;
        if (i % 2 == 0) {
            return c2684bo;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private static String m6833(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f6475, i, cArr, 0, i2);
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
