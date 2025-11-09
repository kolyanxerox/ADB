package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetVersion;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ca */
/* loaded from: classes2.dex */
public final class C2697ca extends AbstractC2676bg {

    /* renamed from: ﻐ */
    private static int f5535 = 0;

    /* renamed from: ﻛ */
    private static int f5536 = 1;

    /* renamed from: ｋ */
    private static char[] f5537 = {'T', 172, 171, 167, 172, 149, 145, 144, 143, 172, 144, 141, 's', 223, 218, 216, 219, 219, 203, 212, 224, 218, 224, 221, 206, 218, 215, '2', ']', 'e', 'l', 'f', 'l', 'i', 'Z', 'f', 'c', ']', 'n', 'l', 'n', 'r', '?', 130, 132, 129, 131, 'r', 'x', 143, 135, 136, 136, 135, 132, 'k', 'Q', 172, 172, 148, 155, 172, 166, 168, 161, 'R', 147, 151, 167, 166, 175, 175, 175, 180, 179, 172, 173, 178, 156, 152, 173, 171, 146, 152, 283, 279, 283, 288, 310, 305, 304, 311, 312, 307, 307, 307, 298, 'v', 229, 227, 227, 230, 237, 232, 212, 210, 204, 208, 224, 223, 232, 232, 232, 237, 236, 229, 230, 235, 213, 'u', 217, 217, 226, 226, 245, 243, 240, 242, 235, 'J', 160, 162, 143, 150, 159, 157, 157, 160, 167, 162, 142, 140, 134, 134, 152, 152, 159, 134, 261, 259, 259, 262, 269, 264, 244, 251, 264, 257, 249, 255, 262, 256, 262, 259, 244, 256, 253, 135, 263, 273, 287, 277, 273, 273, 279, 270, 262, 281, 279, 276};

    /* renamed from: ﾒ */
    private static long f5538 = -9112507224635534966L;

    public C2697ca(String str) {
        super(str);
    }

    /* renamed from: ﻐ */
    private static String m6061(Reward reward) {
        f5535 = (f5536 + 87) % 128;
        String str = reward.type;
        f5536 = (f5535 + 123) % 128;
        return str;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m6063(Reward reward) {
        f5536 = (f5535 + 95) % 128;
        String strM6061 = m6061(reward);
        f5535 = (f5536 + 125) % 128;
        return strM6061;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m6064(false, new int[]{167, 13, 171, 5}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2697ca.m6063((Reward) list.get(0));
            }
        });
        f5535 = (f5536 + 125) % 128;
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0286  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2697ca.mo5382(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5536 = (f5535 + 87) % 128;
        try {
            try {
                String str = (String) MyTargetVersion.class.getDeclaredField(m6062("눾뉨愆烉ࢱ嶛⯷楖\uf45f㛻懃", View.MeasureSpec.makeMeasureSpec(0, 0)).intern()).get(null);
                int i = f5535 + 19;
                f5536 = i % 128;
                if (i % 2 != 0) {
                    return str;
                }
                throw null;
            } catch (Exception unused) {
                return C2849hr.m6916().m6919().m6988(MyTargetVersion.class, m6064(false, new int[]{0, 12, 76, 11}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000").intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: ﾒ */
    private static String m6064(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f5537, i, cArr, 0, i2);
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

    /* renamed from: ｋ */
    private static String m6062(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f5538, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f5538));
                        C2777f.f6321 = i2 + 1;
                    } else {
                        str2 = new String(cArrM6790, 4, cArrM6790.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
