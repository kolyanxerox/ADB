package com.ironsource.adqualitysdk.sdk.p009i;

import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hn */
/* loaded from: classes2.dex */
public enum EnumC2845hn {
    f6636(-1),
    f6633(0),
    f6635(1),
    f6634(2),
    f6632(3),
    f6630(4),
    f6631(5),
    f6628(6);


    /* renamed from: ףּ */
    private static int f6622 = 1;

    /* renamed from: ﭖ */
    private static char[] f6623;

    /* renamed from: ﭴ */
    private static int f6624;

    /* renamed from: ﭸ */
    private static boolean f6625;

    /* renamed from: ﮉ */
    private static boolean f6626;

    /* renamed from: ﮌ */
    private static int f6627;

    /* renamed from: ﱡ */
    private final int f6637;

    static {
        m6880();
        f6624 = (f6622 + 89) % 128;
    }

    EnumC2845hn(int i) {
        this.f6637 = i;
    }

    public static EnumC2845hn valueOf(String str) {
        f6624 = (f6622 + 7) % 128;
        EnumC2845hn enumC2845hn = (EnumC2845hn) Enum.valueOf(EnumC2845hn.class, str);
        f6622 = (f6624 + 75) % 128;
        return enumC2845hn;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC2845hn[] valuesCustom() {
        EnumC2845hn[] enumC2845hnArr;
        int i = f6622 + 97;
        f6624 = i % 128;
        if (i % 2 != 0) {
            enumC2845hnArr = (EnumC2845hn[]) values().clone();
            int i2 = 79 / 0;
        } else {
            enumC2845hnArr = (EnumC2845hn[]) values().clone();
        }
        f6622 = (f6624 + 83) % 128;
        return enumC2845hnArr;
    }

    /* renamed from: ﻐ */
    public static void m6880() {
        f6626 = true;
        f6625 = true;
        f6627 = 113;
        f6623 = new char[]{198, 191, 188, 192, 200, 186, 190, 178, 184, 182, 185, 197, 189, 199, 181, 193, 202, 179, 196, 180, 195};
    }

    /* renamed from: ﻛ */
    private static String m6881(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f6623;
                int i2 = f6627;
                if (f6625) {
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
                if (f6626) {
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

    /* renamed from: ﾇ */
    public static EnumC2845hn m6882(int i) {
        int i2 = (f6624 + 53) % 128;
        f6622 = i2;
        switch (i) {
            case -1:
                return f6636;
            case 0:
                EnumC2845hn enumC2845hn = f6633;
                int i3 = i2 + 53;
                f6624 = i3 % 128;
                if (i3 % 2 == 0) {
                    return enumC2845hn;
                }
                throw null;
            case 1:
                return f6635;
            case 2:
                return f6634;
            case 3:
                return f6632;
            case 4:
                return f6630;
            case 5:
                return f6631;
            case 6:
                return f6628;
            default:
                return null;
        }
    }

    /* renamed from: ﾇ */
    public final int m6883() {
        int i = f6624 + 31;
        int i2 = i % 128;
        f6622 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        int i3 = this.f6637;
        int i4 = i2 + 59;
        f6624 = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }
}
