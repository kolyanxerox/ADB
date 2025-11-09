package com.ironsource.adqualitysdk.sdk.p009i;

import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bw */
/* loaded from: classes2.dex */
public final class C2692bw extends AbstractC2676bg {

    /* renamed from: ﻛ */
    private static int f5430 = 1;

    /* renamed from: ｋ */
    private static int f5431;

    /* renamed from: ﾒ */
    private static char[] f5432 = {'H', 154, 168, 175, 155, 149, 174, ' ', 'R', 'U', ']', 'p', 'l', 'o', 'k', 'j', 'k', 'e', 'i', 'W', 'R', 'k', 'n', 'o', 'o', 'n', 'v', '1', 'R', 'W', 'i', 'e', 'k', 'j', 'k', 'o', 'l', 'p', ']', 'U', 'R', '7', 'I', 'f', 'l', 'p', 'k', 'i', 'g', 'G', 'L', 'g', 'k', 'P', 'N', 'l', 'e', 'g', 'M', 'O', 'm', 'q', 'v', 'n', 'o', 'o', 'n', 157, 311, 303, 304, 304, 303, 300, 275, 275, 275, 275, 293, 301, 299, 274, 280, 301, 305, 287, '<', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'R', 'R', 'R', 'd', 'l', 'j', 'Q', 'W', 'l', 'p', '^', ';', 'I', 'f', 'l', 'p', 'k', 'i', 'g', 'G', 'L', 'g', 'k', 'P', 'N', 'l', 'e', 'g', 'M', 'O', 'm', '2', 'd', 'h', 'g', 'j', 's', 'p', '[', '^', 'k', 'R', 'X', 'l', 'e', 'W', '2', 'k', '_', 'W', 'e', 'l', 'X', 'R', 'k', '_', 'Z', 'n', 's', 'l', 'i', '4', 'n', 's', 'l', 'i', 'i', 'k', ']', '[', 'q', 'l', 'k', 'l', 'c', 'b', 'd', 'Y', 'W', 'e', 'l', 'X', 'R', 'k', '_', '9', 'k', 'i', 'i', 'l', 's', 'n', 'Z', '_', 'k', 'R', 'X', 'l', 'e', 'W', '`', 'l', 'l'};

    public C2692bw(String str) {
        super(str);
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m5895(MaioAdsListenerInterface maioAdsListenerInterface) {
        f5431 = (f5430 + 81) % 128;
        m5896(maioAdsListenerInterface);
        int i = f5431 + 97;
        f5430 = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2692bw.mo5382(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5431 = (f5430 + 5) % 128;
        String sdkVersion = MaioAds.getSdkVersion();
        int i = f5431 + 35;
        f5430 = i % 128;
        if (i % 2 != 0) {
            return sdkVersion;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private static void m5896(MaioAdsListenerInterface maioAdsListenerInterface) {
        f5431 = (f5430 + 15) % 128;
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        int i = f5430 + 21;
        f5431 = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m5894(true, new int[]{179, 18, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2692bw.m5895((MaioAdsListenerInterface) list.get(0));
                return null;
            }
        });
        f5431 = (f5430 + 59) % 128;
        return map;
    }

    /* renamed from: ﻛ */
    private static String m5894(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f5432, i, cArr, 0, i2);
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
