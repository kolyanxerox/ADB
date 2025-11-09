package com.ironsource.adqualitysdk.sdk.p009i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hi */
/* loaded from: classes2.dex */
public enum EnumC2840hi {
    f6599(-1),
    f6602(0),
    f6600(1),
    f6598(2),
    f6601(3),
    f6595(4),
    f6597(5),
    f6594(6),
    f6596(7);


    /* renamed from: ﭖ */
    private static int f6590 = 0;

    /* renamed from: ﮉ */
    private static int f6592 = 0;

    /* renamed from: ﮌ */
    private static int f6593 = 1;

    /* renamed from: ﱡ */
    private final int f6603;

    static {
        m6867();
        f6593 = (f6592 + 15) % 128;
    }

    EnumC2840hi(int i) {
        this.f6603 = i;
    }

    public static EnumC2840hi valueOf(String str) {
        int i = f6592 + 121;
        f6593 = i % 128;
        if (i % 2 != 0) {
            return (EnumC2840hi) Enum.valueOf(EnumC2840hi.class, str);
        }
        Enum.valueOf(EnumC2840hi.class, str);
        throw null;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC2840hi[] valuesCustom() throws CloneNotSupportedException {
        int i = f6593 + 41;
        f6592 = i % 128;
        if (i % 2 != 0) {
            values().clone();
            throw null;
        }
        EnumC2840hi[] enumC2840hiArr = (EnumC2840hi[]) values().clone();
        f6592 = (f6593 + 71) % 128;
        return enumC2840hiArr;
    }

    /* renamed from: ﻛ */
    public static void m6867() {
        f6590 = 93;
    }

    /* renamed from: ﾒ */
    private static String m6868(int i, int i2, int i3, String str, boolean z) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2669b.f5039) {
            try {
                char[] cArr2 = new char[i2];
                C2669b.f5040 = 0;
                while (true) {
                    int i4 = C2669b.f5040;
                    if (i4 >= i2) {
                        break;
                    }
                    C2669b.f5038 = cArr[i4];
                    cArr2[C2669b.f5040] = (char) (C2669b.f5038 + i3);
                    int i5 = C2669b.f5040;
                    cArr2[i5] = (char) (cArr2[i5] - f6590);
                    C2669b.f5040 = i5 + 1;
                }
                if (i > 0) {
                    C2669b.f5041 = i;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    int i6 = C2669b.f5041;
                    System.arraycopy(cArr3, 0, cArr2, i2 - i6, i6);
                    int i7 = C2669b.f5041;
                    System.arraycopy(cArr3, i7, cArr2, 0, i2 - i7);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2669b.f5040 = 0;
                    while (true) {
                        int i8 = C2669b.f5040;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr4[i8] = cArr2[(i2 - i8) - 1];
                        C2669b.f5040 = i8 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﻐ */
    public final int m6869() {
        int i = f6592;
        int i2 = this.f6603;
        int i3 = i + 89;
        f6593 = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static EnumC2840hi m6866(int i) {
        int i2 = f6593;
        int i3 = (i2 + 5) % 128;
        f6592 = i3;
        switch (i) {
            case -1:
                return f6599;
            case 0:
                EnumC2840hi enumC2840hi = f6602;
                f6592 = (i2 + 31) % 128;
                return enumC2840hi;
            case 1:
                EnumC2840hi enumC2840hi2 = f6600;
                int i4 = i3 + 87;
                f6593 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 84 / 0;
                }
                return enumC2840hi2;
            case 2:
                EnumC2840hi enumC2840hi3 = f6598;
                int i6 = i3 + 9;
                f6593 = i6 % 128;
                if (i6 % 2 != 0) {
                    return enumC2840hi3;
                }
                throw null;
            case 3:
                return f6601;
            case 4:
                return f6595;
            case 5:
                return f6597;
            case 6:
                return f6594;
            case 7:
                return f6596;
            default:
                return null;
        }
    }
}
