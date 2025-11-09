package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ga */
/* loaded from: classes2.dex */
public final class C2805ga extends AbstractC2813gi {

    /* renamed from: ﮐ */
    private static int f6424 = 1;

    /* renamed from: ﻐ */
    private static boolean f6425 = true;

    /* renamed from: ﻛ */
    private static boolean f6426 = true;

    /* renamed from: ｋ */
    private static int f6427 = 259;

    /* renamed from: ﾇ */
    private static int f6428;

    /* renamed from: ﾒ */
    private static char[] f6429 = {358, 370, 368, 305, 364, 373, 369, 374, 376, 360, 356, 359, 372, 367, 375, 380, 366, 332, 342, 324, 340, 363};

    /* renamed from: ﾒ */
    private static String m6820(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2922o.f7244) {
            try {
                char[] cArr2 = f6429;
                int i2 = f6427;
                if (f6425) {
                    int length = bArr.length;
                    C2922o.f7245 = length;
                    char[] cArr3 = new char[length];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i3 = C2922o.f7246;
                        int i4 = C2922o.f7245 - 1;
                        int i5 = C2922o.f7246;
                        cArr3[i3] = (char) (cArr2[bArr[i4 - i5] + i] - i2);
                        C2922o.f7246 = i5 + 1;
                    }
                    return new String(cArr3);
                }
                if (f6426) {
                    int length2 = cArr.length;
                    C2922o.f7245 = length2;
                    char[] cArr4 = new char[length2];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i6 = C2922o.f7246;
                        int i7 = C2922o.f7245 - 1;
                        int i8 = C2922o.f7246;
                        cArr4[i6] = (char) (cArr2[cArr[i7 - i8] - i] - i2);
                        C2922o.f7246 = i8 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                C2922o.f7245 = length3;
                char[] cArr5 = new char[length3];
                C2922o.f7246 = 0;
                while (C2922o.f7246 < C2922o.f7245) {
                    int i9 = C2922o.f7246;
                    int i10 = C2922o.f7245 - 1;
                    int i11 = C2922o.f7246;
                    cArr5[i9] = (char) (cArr2[iArr[i10 - i11] - i] - i2);
                    C2922o.f7246 = i11 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        f6424 = (f6428 + 55) % 128;
        String strIntern = m6820(null, null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0090\u008f\u0085\u008e\u008b\u0089\u0095\u008c\u0094\u008a\u0081\u0086\u0089\u0082\u0093\u0087\u0082\u0086\u0092\u0084\u0091\u008c\u0088\u0084\u0091\u008c\u0088\u0090\u008f\u0085\u008e\u008b\u0089\u008d\u008c\u008b\u0084\u008a\u0081\u0086\u0089\u0082\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        f6424 = (f6428 + 83) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6428 = (f6424 + 53) % 128;
        String strIntern = m6820(null, null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, "\u008c\u008a\u0086\u008b\u0096\u0088\u0090\u008f\u0085\u008e\u008b\u0089\u008d\u008c\u008b").intern();
        int i = f6424 + 113;
        f6428 = i % 128;
        if (i % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6428 + 3;
        int i2 = i % 128;
        f6424 = i2;
        if (i % 2 == 0) {
            int i3 = 92 / 0;
        }
        f6428 = (i2 + 7) % 128;
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2673bd c2673bd = new C2673bd(mo6813());
        int i = f6424 + 51;
        f6428 = i % 128;
        if (i % 2 == 0) {
            return c2673bd;
        }
        throw null;
    }
}
