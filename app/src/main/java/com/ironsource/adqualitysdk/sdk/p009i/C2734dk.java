package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dk */
/* loaded from: classes2.dex */
public class C2734dk extends C2722cz implements InterfaceC2707ck {

    /* renamed from: ﭖ */
    private static int f6059 = 0;

    /* renamed from: ﮉ */
    private static int f6060 = 1;

    /* renamed from: ﻐ */
    private boolean f6067;

    /* renamed from: ｋ */
    private String f6069;

    /* renamed from: ﾇ */
    private String f6070;

    /* renamed from: ﮐ */
    private static char[] f6062 = {'f', 53865, 42068, 30264, 18435, 6895, 60634, 48801, 36997, 25234, '.', 17597, 38563, 57494, 13005, 3269, 24120, 43036, 64123, 54361, 9810, 29101, 17308, 40388, 61399, 14655, 2843, 's', 53881, 42060, 30233, 18453, 6888, 60609, 48805, 37012, 25241, 13692, 1914, 55605, 43800, 32255, 20427, 8626, 62391, 50614, 39029, 27229, 15401, 28972, 41778, 54535, 1874, 14686, 27555, 40330, 53230, 57823, 5074, 17463, 30257, 43134, 55891, 3252, 16000, 20729, 33532, 46333, 59710, 6934, 19810, 37087, 17109, 13536, 59065, 55480, 35442, 31841, 11806, ')', 62014, 42433, 38909, 30172, 42946, 53751, 942, 15791, 28517, 39286, 51977, 58686, 5929, 16598, 29418, 21727, 34517, 61664, 8872, 7344, 20033, 47207, 59917, 50209, 13877, 25050, 21484, 36277, 65444, 'g', 53881, 42060, 30212, 18460, 6893, 60619, 48801, 37005, 25241, 13686, 1856, 55577, 43784, 's', 53881, 42060, 30237, 18435, 6863, 60637, 48823, 37012, 25235, 13685, 'g', 53881, 42060, 30237, 18435, 6863, 60637, 48823, 37012, 25235, 13685, 'g', 53881, 42060, 30230, 18434, 6883, 60617, 48800, 36995, 25245, 13675, 1856, 55573, 43802, 32237, 20426, 8628, 62354, 50585, 39033, 27221, 't', 53875, 42098, 30247, 18463, 6882};

    /* renamed from: ﱡ */
    private static long f6064 = -4450221366886739428L;

    /* renamed from: ﺙ */
    private static long f6065 = -920228695133017383L;

    /* renamed from: ﱟ */
    private static int f6063 = 0;

    /* renamed from: ﮌ */
    private static char f6061 = 0;

    /* renamed from: ﻛ */
    private String f6068 = "";

    /* renamed from: ﾒ */
    private double f6071 = -1.0d;

    /* renamed from: ﻏ */
    private boolean f6066 = false;

    /* renamed from: ﮐ */
    private boolean m6601() {
        int i = f6059 + 77;
        int i2 = i % 128;
        f6060 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        boolean z = this.f6067;
        int i3 = i2 + 21;
        f6059 = i3 % 128;
        if (i3 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﱡ */
    private String m6602() {
        String strIntern;
        f6059 = (f6060 + 33) % 128;
        if (m6601()) {
            f6059 = (f6060 + 65) % 128;
            strIntern = m6611(10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ViewConfiguration.getLongPressTimeout() >> 16, (char) (Process.myPid() >> 22)).intern();
        } else {
            strIntern = m6610((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 13623), "ぽ㢽㜂팵", "ƫ婣\uf501ꈭꉓ礈", "\uaad9驹냠\uf33a").intern();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m6610(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) TextUtils.getOffsetAfter("", 0), "쁡ᣳ嘵ி", "坍ᡧ鸆\uda2e뼶昵㠘䗯Țם", "\uaad9驹냠\uf33a").intern());
        sb.append(this.f6068);
        return AbstractC2183w4.OooOO0o(sb, m6611((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 10, (char) TextUtils.indexOf("", "")), strIntern);
    }

    /* renamed from: ﺙ */
    private String m6603() {
        int i = f6060;
        String str = this.f6070;
        int i2 = i + 77;
        f6059 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private String m6604() {
        int i = (f6060 + 63) % 128;
        f6059 = i;
        String str = this.f6069;
        int i2 = i + 59;
        f6060 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private void m6607(String str) {
        int i = f6060 + 97;
        int i2 = i % 128;
        f6059 = i2;
        int i3 = i % 2;
        this.f6068 = str;
        if (i3 != 0) {
            throw null;
        }
        int i4 = i2 + InterfaceC3173h3.d.b.f8821d;
        f6060 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    private Double m6609() {
        f6060 = (f6059 + 95) % 128;
        Double dValueOf = Double.valueOf(this.f6071);
        f6059 = (f6060 + 121) % 128;
        return dValueOf;
    }

    /* renamed from: ﻛ */
    public final void m6614(Double d) {
        f6059 = (f6060 + 79) % 128;
        this.f6071 = d.doubleValue();
        int i = f6059 + 3;
        f6060 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    public final void m6615(String str) {
        int i = f6060 + InterfaceC3173h3.d.b.f8819b;
        f6059 = i % 128;
        int i2 = i % 2;
        this.f6069 = str;
        if (i2 != 0) {
            int i3 = 65 / 0;
        }
    }

    /* renamed from: ｋ */
    private String m6605() {
        int i = (f6060 + InterfaceC3173h3.d.b.f8819b) % 128;
        f6059 = i;
        String str = this.f6068;
        f6060 = (i + 115) % 128;
        return str;
    }

    /* renamed from: ﾒ */
    private static String m6611(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f6062[i2 + i3] ^ (i3 * f6064)) ^ c);
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
    public final void m6612(String str) {
        int i = f6059 + 3;
        f6060 = i % 128;
        int i2 = i % 2;
        this.f6070 = str;
        if (i2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public final JSONObject m6613() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(C2869ik.f6839, this.f6069);
            double d = this.f6071;
            if (d > -1.0d) {
                int i = f6059 + 53;
                f6060 = i % 128;
                if (i % 2 == 0) {
                    jSONObject2.put(C2869ik.f6786, d);
                    throw null;
                }
                jSONObject2.put(C2869ik.f6786, d);
            }
            jSONObject2.put(C2869ik.f6789, this.f6070);
        } catch (JSONException unused) {
        }
        try {
            if (jSONObject2.length() > 0) {
                if (this.f6066) {
                    int i2 = f6059 + 51;
                    f6060 = i2 % 128;
                    if (i2 % 2 == 0) {
                        jSONObject2.put(C2869ik.f6790, false);
                    } else {
                        jSONObject2.put(C2869ik.f6790, true);
                    }
                }
                jSONObject.put(C2869ik.f6788, jSONObject2);
            }
            f6060 = (f6059 + 53) % 128;
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* renamed from: ﾇ */
    public final void m6616(boolean z) {
        int i = f6059;
        this.f6066 = z;
        f6060 = (i + 27) % 128;
    }

    /* renamed from: ｋ */
    private void m6606(boolean z) {
        int i = f6060;
        this.f6067 = z;
        int i2 = i + 83;
        f6059 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    private boolean m6608() {
        int i = f6059 + 79;
        int i2 = i % 128;
        f6060 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        boolean z = this.f6066;
        int i3 = i2 + 71;
        f6059 = i3 % 128;
        if (i3 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2707ck
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5466(java.lang.String r20, java.util.List<java.lang.Object> r21, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2704ch r22) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2734dk.mo5466(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* renamed from: ﾒ */
    private static String m6610(int i, char c, String str, String str2, String str3) {
        String str4;
        char[] charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = charArray;
        char[] charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = charArray3;
        synchronized (C2885j.f6936) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                C2885j.f6934 = 0;
                while (true) {
                    int i2 = C2885j.f6934;
                    if (i2 < length) {
                        int i3 = (i2 + 2) % 4;
                        int i4 = (i2 + 3) % 4;
                        int i5 = cArr4[i2 % 4] * 32718;
                        char c2 = cArr5[i3];
                        char c3 = (char) ((i5 + c2) % 65535);
                        C2885j.f6935 = c3;
                        cArr5[i4] = (char) (((cArr4[i4] * 32718) + c2) / 65535);
                        cArr4[i4] = c3;
                        int i6 = C2885j.f6934;
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f6065) ^ f6063) ^ f6061);
                        C2885j.f6934 = i6 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str4;
    }
}
