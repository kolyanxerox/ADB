package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.PointF;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ogury.ad.OguryReward;
import io.presage.Presage;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gw */
/* loaded from: classes2.dex */
public final class C2827gw extends AbstractC2813gi {

    /* renamed from: ﻛ */
    private static int f6529 = 1;

    /* renamed from: ｋ */
    private static int f6530;

    /* renamed from: ﾒ */
    private static char[] f6531 = {'v', 237, 235, 241, 243, 242, 232, 198, 208, 237, 235, 241, 243, 242, 248, 214, 213, 243, '3', 'k', 't', 'u', 's'};

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.gw$c */
    public static class c extends AbstractC2813gi {

        /* renamed from: ﻛ */
        private static int f6532 = 0;

        /* renamed from: ｋ */
        private static int f6533 = 1;

        /* renamed from: ﾇ */
        private static char f6534 = 4;

        /* renamed from: ﾒ */
        private static char[] f6535 = {'c', 'o', 'm', '.', 'g', 'u', 'r', 'y', 'a', 'd', 'O', 'R', 'e', 'w', 'f', 'h'};

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﻐ */
        public final String mo6812() {
            byte mirror;
            int iIndexOf;
            int i = f6533 + 125;
            f6532 = i % 128;
            if (i % 2 != 0) {
                mirror = (byte) ('_' << AndroidCharacter.getMirror('~'));
                iIndexOf = 50 - TextUtils.indexOf("", "", 0);
            } else {
                mirror = (byte) ('=' - AndroidCharacter.getMirror('0'));
                iIndexOf = TextUtils.indexOf("", "", 0) + 24;
            }
            String strIntern = m6847(mirror, "\u0001\u0002\u0003\u0000\u0000\u0005\u0006\u0007\u000b\u0007\t\n\u0002\u000b\u0005\u0006\u0007\u0004\b\u000f\f\t\u0005\n", iIndexOf).intern();
            f6533 = (f6532 + 31) % 128;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﻛ */
        public final String mo6813() {
            f6532 = (f6533 + 57) % 128;
            String strIntern = m6847((byte) (81 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0000\u0005\u0006\u0007Ê", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6).intern();
            f6532 = (f6533 + InterfaceC3173h3.d.b.f8823f) % 128;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ｋ */
        public final Class mo6814() {
            int i = f6532 + 91;
            f6533 = i % 128;
            if (i % 2 != 0) {
                return OguryReward.class;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﾇ */
        public final AbstractC2676bg mo6815() {
            C2694by c2694by = new C2694by(mo6813());
            f6533 = (f6532 + 9) % 128;
            return c2694by;
        }

        /* renamed from: ﻛ */
        private static String m6847(byte b, String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2858i.f6710) {
                try {
                    char[] cArr2 = f6535;
                    char c = f6534;
                    char[] cArr3 = new char[i];
                    if (i % 2 != 0) {
                        i--;
                        cArr3[i] = (char) (cArr[i] - b);
                    }
                    if (i > 1) {
                        C2858i.f6715 = 0;
                        while (true) {
                            int i2 = C2858i.f6715;
                            if (i2 >= i) {
                                break;
                            }
                            C2858i.f6714 = cArr[i2];
                            C2858i.f6712 = cArr[C2858i.f6715 + 1];
                            if (C2858i.f6714 == C2858i.f6712) {
                                cArr3[C2858i.f6715] = (char) (C2858i.f6714 - b);
                                cArr3[C2858i.f6715 + 1] = (char) (C2858i.f6712 - b);
                            } else {
                                C2858i.f6713 = C2858i.f6714 / c;
                                C2858i.f6709 = C2858i.f6714 % c;
                                C2858i.f6711 = C2858i.f6712 / c;
                                C2858i.f6708 = C2858i.f6712 % c;
                                if (C2858i.f6709 == C2858i.f6708) {
                                    C2858i.f6713 = AbstractC2183w4.OooOoOO(C2858i.f6713, c, 1, c);
                                    C2858i.f6711 = AbstractC2183w4.OooOoOO(C2858i.f6711, c, 1, c);
                                    int i3 = (C2858i.f6713 * c) + C2858i.f6709;
                                    int i4 = (C2858i.f6711 * c) + C2858i.f6708;
                                    int i5 = C2858i.f6715;
                                    cArr3[i5] = cArr2[i3];
                                    cArr3[i5 + 1] = cArr2[i4];
                                } else if (C2858i.f6713 == C2858i.f6711) {
                                    C2858i.f6709 = AbstractC2183w4.OooOoOO(C2858i.f6709, c, 1, c);
                                    C2858i.f6708 = AbstractC2183w4.OooOoOO(C2858i.f6708, c, 1, c);
                                    int i6 = (C2858i.f6713 * c) + C2858i.f6709;
                                    int i7 = (C2858i.f6711 * c) + C2858i.f6708;
                                    int i8 = C2858i.f6715;
                                    cArr3[i8] = cArr2[i6];
                                    cArr3[i8 + 1] = cArr2[i7];
                                } else {
                                    int i9 = (C2858i.f6713 * c) + C2858i.f6708;
                                    int i10 = (C2858i.f6711 * c) + C2858i.f6709;
                                    int i11 = C2858i.f6715;
                                    cArr3[i11] = cArr2[i9];
                                    cArr3[i11 + 1] = cArr2[i10];
                                }
                            }
                            C2858i.f6715 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        int i = f6529 + 123;
        f6530 = i % 128;
        String strIntern = (i % 2 != 0 ? m6846(true, new int[]{0, 18, 135, 0}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000") : m6846(true, new int[]{0, 18, 135, 0}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000")).intern();
        f6529 = (f6530 + 3) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6530 + 117;
        f6529 = i % 128;
        return (i % 2 == 0 ? m6846(true, new int[]{18, 5, 0, 2}, "\u0001\u0000\u0000\u0001\u0001") : m6846(true, new int[]{18, 5, 0, 2}, "\u0001\u0000\u0000\u0001\u0001")).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6529 + 15;
        f6530 = i % 128;
        if (i % 2 == 0) {
            return Presage.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2698cb c2698cb = new C2698cb(mo6813());
        f6529 = (f6530 + 19) % 128;
        return c2698cb;
    }

    /* renamed from: ﾇ */
    private static String m6846(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f6531, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    C2831h.f6552 = 0;
                    char c2 = 0;
                    while (true) {
                        int i5 = C2831h.f6552;
                        if (i5 >= i2) {
                            break;
                        }
                        if (bArr[i5] == 1) {
                            cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c2);
                        } else {
                            cArr2[i5] = (char) ((cArr[i5] << 1) - c2);
                        }
                        c2 = cArr2[i5];
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
