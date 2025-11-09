package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dy */
/* loaded from: classes2.dex */
public final class C2748dy {

    /* renamed from: ﮐ */
    private static int f6188 = 0;

    /* renamed from: ﱡ */
    private static int f6189 = 1;

    /* renamed from: ﻛ */
    private static char[] f6190 = {':'};

    /* renamed from: ｋ */
    private static long f6191 = -370601061070029443L;

    /* renamed from: ﻐ */
    private int f6192;

    /* renamed from: ﾇ */
    private e f6193;

    /* renamed from: ﾒ */
    private String f6194;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.dy$e */
    public enum e {
        f6204,
        f6203,
        f6206,
        f6205,
        f6202,
        f6197,
        f6200,
        f6198;


        /* renamed from: ﭸ */
        private static int f6195 = 1;

        /* renamed from: ﮌ */
        private static int f6196;

        /* renamed from: ﱡ */
        private static char[] f6199;

        static {
            m6743();
            int i = f6195 + 107;
            f6196 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public static e valueOf(String str) {
            f6196 = (f6195 + 53) % 128;
            e eVar = (e) Enum.valueOf(e.class, str);
            f6195 = (f6196 + 97) % 128;
            return eVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            e[] eVarArr;
            int i = f6195 + 49;
            f6196 = i % 128;
            if (i % 2 != 0) {
                eVarArr = (e[]) values().clone();
                int i2 = 37 / 0;
            } else {
                eVarArr = (e[]) values().clone();
            }
            int i3 = f6196 + 45;
            f6195 = i3 % 128;
            if (i3 % 2 != 0) {
                return eVarArr;
            }
            throw null;
        }

        /* renamed from: ﻛ */
        private static String m6742(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                    System.arraycopy(f6199, i, cArr, 0, i2);
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

        /* renamed from: ﾇ */
        public static void m6743() {
            f6199 = new char[]{')', 'P', 'S', 'X', 'O', 'H', 'G', 'B', 130, 128, 133, 141, 138, 131, 131, 131, 135, 140, 277, 276, 276, 275, 270, 271, 269, 141, 282, 276, 274, 273, 276, '#', 'F', 'K', 'M', 'K', 'Q', 'L', '4', 'n', 'o', 'k', 'p', 'y', 129, 252, 248, 253, 258, 260, 253, 'b', 191, 195, 203, 194};
        }
    }

    public C2748dy(e eVar, String str, int i) {
        this.f6193 = eVar;
        this.f6194 = str;
        this.f6192 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6193);
        sb.append(m6728((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)).intern());
        sb.append(this.f6194);
        String string = sb.toString();
        int i = f6189 + 87;
        f6188 = i % 128;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
        return string;
    }

    /* renamed from: ﭸ */
    public final boolean m6729() {
        if (m6739() != e.f6203) {
            f6188 = (f6189 + 17) % 128;
            return false;
        }
        int i = f6189 + 13;
        f6188 = i % 128;
        if (i % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ﮉ */
    public final boolean m6730() {
        f6189 = (f6188 + 63) % 128;
        if (m6739() != e.f6204) {
            f6188 = (f6189 + 9) % 128;
            return false;
        }
        int i = f6188 + 43;
        f6189 = i % 128;
        return i % 2 != 0;
    }

    /* renamed from: ﮐ */
    public final boolean m6731() {
        f6189 = (f6188 + 75) % 128;
        if (m6739() != e.f6202) {
            f6188 = (f6189 + 47) % 128;
            return false;
        }
        int i = f6188 + 15;
        f6189 = i % 128;
        return i % 2 != 0;
    }

    /* renamed from: ﱟ */
    public final boolean m6732() {
        int i = f6189 + 39;
        f6188 = i % 128;
        if (i % 2 != 0) {
            int i2 = 55 / 0;
            if (m6739() == e.f6198) {
                return true;
            }
        } else if (m6739() == e.f6198) {
            return true;
        }
        f6189 = (f6188 + 71) % 128;
        return false;
    }

    /* renamed from: ﱡ */
    public final boolean m6733() {
        if (m6739() == e.f6206) {
            int i = f6189 + 35;
            f6188 = i % 128;
            return i % 2 == 0;
        }
        int i2 = f6189 + 35;
        f6188 = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﺙ */
    public final boolean m6734() {
        f6189 = (f6188 + 53) % 128;
        if (m6739() != e.f6200) {
            return false;
        }
        int i = f6189 + 33;
        f6188 = i % 128;
        return i % 2 == 0;
    }

    /* renamed from: ﻏ */
    public final boolean m6735() {
        if (m6739() != e.f6197) {
            return false;
        }
        int i = (f6189 + 55) % 128;
        f6188 = i;
        int i2 = i + 37;
        f6189 = i2 % 128;
        if (i2 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public final boolean m6737(String str) {
        f6188 = (f6189 + 5) % 128;
        boolean zEquals = this.f6194.equals(str);
        int i = f6189 + 89;
        f6188 = i % 128;
        if (i % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public final int m6738() {
        int i = f6189 + 53;
        f6188 = i % 128;
        if (i % 2 == 0) {
            return this.f6192;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public final e m6739() {
        int i = f6188;
        e eVar = this.f6193;
        int i2 = i + 21;
        f6189 = i2 % 128;
        if (i2 % 2 != 0) {
            return eVar;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public final boolean m6740() {
        int i = f6188 + 123;
        f6189 = i % 128;
        if (i % 2 == 0) {
            m6736();
            throw null;
        }
        if (m6736() || m6731()) {
            return true;
        }
        int i2 = f6188 + 25;
        f6189 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6735() || m6734();
        }
        m6735();
        throw null;
    }

    /* renamed from: ﾒ */
    public final String m6741() {
        int i = f6188;
        int i2 = i + 55;
        f6189 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.f6194;
        int i3 = i + 19;
        f6189 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 8 / 0;
        }
        return str;
    }

    /* renamed from: ｋ */
    private static String m6728(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f6190[i2 + i3] ^ (i3 * f6191)) ^ c);
                        C2642a.f4436 = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: ﻐ */
    public final boolean m6736() {
        f6189 = (f6188 + 63) % 128;
        if (m6739() == e.f6205) {
            return true;
        }
        f6189 = (f6188 + 49) % 128;
        return false;
    }
}
