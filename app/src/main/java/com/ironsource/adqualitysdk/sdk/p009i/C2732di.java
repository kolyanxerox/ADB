package com.ironsource.adqualitysdk.sdk.p009i;

import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.di */
/* loaded from: classes2.dex */
public class C2732di extends C2722cz implements InterfaceC2707ck {

    /* renamed from: 爫 */
    private static int f6017 = 1;

    /* renamed from: טּ */
    private static boolean f6018 = true;

    /* renamed from: סּ */
    private static int f6019 = 0;

    /* renamed from: ﭸ */
    private static int f6022 = 129;

    /* renamed from: ﮉ */
    private static boolean f6023 = true;

    /* renamed from: ﭖ */
    private String f6024;

    /* renamed from: ﮌ */
    private String f6025;

    /* renamed from: ﮐ */
    private String f6026;

    /* renamed from: ﱟ */
    private String f6027;

    /* renamed from: ﱡ */
    private String f6028;

    /* renamed from: ﺙ */
    private String f6029;

    /* renamed from: ﻏ */
    private String f6030;

    /* renamed from: ﻐ */
    private String f6031;

    /* renamed from: ﻛ */
    private String f6032;

    /* renamed from: ｋ */
    private String f6033;

    /* renamed from: ﾇ */
    private String f6034;

    /* renamed from: ﾒ */
    private String f6035;

    /* renamed from: ﭴ */
    private static char[] f6021 = {244, 230, 245, 194, 229, 202, 232, 196, 226, 238, 241, 234, 239, 213, 250, 243, 247, 200, 240, 246, 197, 195, 209, 228};

    /* renamed from: ףּ */
    private static int[] f6020 = {397840558, -848912179, -1161627843, -1440092716, 101894395, 1037589517, 946665512, -1717674113, -1294099560, 1802945914, 1337466841, 1785425051, -235973602, -422241588, 512745907, 959406423, -651906807, -29446400};

    /* renamed from: ﭖ */
    private Object m6560() {
        String str;
        int i = f6017;
        int i2 = i + 73;
        f6019 = i2 % 128;
        if (i2 % 2 != 0) {
            str = this.f6024;
            int i3 = 56 / 0;
        } else {
            str = this.f6024;
        }
        f6019 = (i + 63) % 128;
        return str;
    }

    /* renamed from: ﭴ */
    private void m6562(String str) {
        int i = f6017 + 31;
        f6019 = i % 128;
        int i2 = i % 2;
        this.f6025 = str;
        if (i2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﮌ */
    private void m6564(String str) {
        int i = (f6019 + 21) % 128;
        f6017 = i;
        this.f6024 = str;
        f6019 = (i + 63) % 128;
    }

    /* renamed from: ﮐ */
    private void m6566(String str) {
        int i = f6017 + 61;
        f6019 = i % 128;
        int i2 = i % 2;
        this.f6030 = str;
        if (i2 != 0) {
            int i3 = 33 / 0;
        }
    }

    /* renamed from: ﱟ */
    private String m6567() {
        int i = f6019;
        String str = this.f6030;
        f6017 = (i + 89) % 128;
        return str;
    }

    /* renamed from: ﱡ */
    private void m6570(String str) {
        int i = (f6017 + 109) % 128;
        f6019 = i;
        this.f6028 = str;
        int i2 = i + InterfaceC3173h3.d.b.f8819b;
        f6017 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﺙ */
    private void m6572(String str) {
        int i = (f6019 + 71) % 128;
        f6017 = i;
        this.f6026 = str;
        f6019 = (i + 57) % 128;
    }

    /* renamed from: ﻏ */
    private String m6573() {
        int i = (f6019 + 85) % 128;
        f6017 = i;
        String str = this.f6026;
        int i2 = i + 75;
        f6019 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private void m6577(String str) {
        int i = f6017;
        this.f6031 = str;
        int i2 = i + 61;
        f6019 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    private void m6579(String str) {
        int i = f6017 + 9;
        int i2 = i % 128;
        f6019 = i2;
        int i3 = i % 2;
        this.f6033 = str;
        if (i3 != 0) {
            throw null;
        }
        int i4 = i2 + 21;
        f6017 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    private void m6581(String str) {
        int i = f6017;
        this.f6034 = str;
        int i2 = i + 85;
        f6019 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    private void m6584(String str) {
        int i = (f6017 + 41) % 128;
        f6019 = i;
        this.f6032 = str;
        int i2 = i + 1;
        f6017 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    private String m6585() {
        int i = (f6017 + 67) % 128;
        f6019 = i;
        String str = this.f6034;
        f6017 = (i + 55) % 128;
        return str;
    }

    /* renamed from: ﭴ */
    private Object m6561() {
        int i = (f6019 + 49) % 128;
        f6017 = i;
        String str = this.f6025;
        int i2 = i + 37;
        f6019 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﮌ */
    private JSONObject m6563() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(C2869ik.f6808, this.f6032);
            jSONObject.putOpt(C2869ik.f6810, this.f6034);
            jSONObject.putOpt(C2869ik.f6815, this.f6035);
            jSONObject.putOpt(C2869ik.f6813, this.f6033);
            jSONObject.putOpt(C2869ik.f6811, this.f6026);
            jSONObject.putOpt(C2869ik.f6807, this.f6030);
            jSONObject.putOpt(C2869ik.f6809, this.f6027);
            jSONObject.putOpt(C2869ik.f6806, this.f6028);
            jSONObject.putOpt(C2869ik.f6804, this.f6029);
            f6019 = (f6017 + 37) % 128;
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: ﮐ */
    private String m6565() {
        int i = (f6019 + 99) % 128;
        f6017 = i;
        String str = this.f6027;
        f6019 = (i + 73) % 128;
        return str;
    }

    /* renamed from: ﱟ */
    private void m6568(String str) {
        int i = f6019 + 45;
        f6017 = i % 128;
        int i2 = i % 2;
        this.f6027 = str;
        if (i2 == 0) {
            int i3 = 21 / 0;
        }
    }

    /* renamed from: ﱡ */
    private String m6569() {
        int i = f6019 + 15;
        f6017 = i % 128;
        if (i % 2 != 0) {
            return this.f6029;
        }
        throw null;
    }

    /* renamed from: ﺙ */
    private String m6571() {
        int i = f6019;
        int i2 = i + 3;
        f6017 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.f6028;
        f6017 = (i + 85) % 128;
        return str;
    }

    /* renamed from: ﻏ */
    private void m6574(String str) {
        int i = (f6017 + 11) % 128;
        f6019 = i;
        this.f6029 = str;
        int i2 = i + 115;
        f6017 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    private Object m6575() {
        int i = f6017;
        String str = this.f6031;
        f6019 = (i + 115) % 128;
        return str;
    }

    /* renamed from: ﻛ */
    private String m6578() {
        int i = f6019;
        String str = this.f6033;
        int i2 = i + 11;
        f6017 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private String m6580() {
        int i = f6019;
        String str = this.f6035;
        f6017 = (i + 21) % 128;
        return str;
    }

    /* renamed from: ﾇ */
    private String m6582() {
        int i = f6017 + 11;
        f6019 = i % 128;
        if (i % 2 == 0) {
            return this.f6032;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private void m6586(String str) {
        int i = f6017 + 93;
        f6019 = i % 128;
        int i2 = i % 2;
        this.f6035 = str;
        if (i2 != 0) {
            int i3 = 53 / 0;
        }
    }

    /* renamed from: ﻐ */
    private static String m6576(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f6021;
                int i2 = f6022;
                if (f6018) {
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
                if (f6023) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0385  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2707ck
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5466(java.lang.String r33, java.util.List<java.lang.Object> r34, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2704ch r35) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2732di.mo5466(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* renamed from: ﾇ */
    private static String m6583(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6020.clone();
                C2723d.f5951 = 0;
                while (true) {
                    int i2 = C2723d.f5951;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        char c3 = (char) (iArr[i2 + 1] >> 16);
                        cArr[2] = c3;
                        char c4 = (char) iArr[i2 + 1];
                        cArr[3] = c4;
                        C2723d.f5954 = (c << 16) + c2;
                        C2723d.f5952 = (c3 << 16) + c4;
                        C2723d.m6462(iArr2);
                        for (int i4 = 0; i4 < 16; i4++) {
                            int i5 = C2723d.f5954 ^ iArr2[i4];
                            C2723d.f5954 = i5;
                            int iM6461 = C2723d.m6461(i5) ^ C2723d.f5952;
                            int i6 = C2723d.f5954;
                            C2723d.f5954 = iM6461;
                            C2723d.f5952 = i6;
                        }
                        int i7 = C2723d.f5954;
                        int i8 = C2723d.f5952;
                        C2723d.f5954 = i8;
                        C2723d.f5952 = i7;
                        int i9 = i7 ^ iArr2[16];
                        C2723d.f5952 = i9;
                        int i10 = i8 ^ iArr2[17];
                        C2723d.f5954 = i10;
                        cArr[0] = (char) (i10 >>> 16);
                        cArr[1] = (char) i10;
                        cArr[2] = (char) (i9 >>> 16);
                        cArr[3] = (char) i9;
                        C2723d.m6462(iArr2);
                        int i11 = C2723d.f5951;
                        cArr2[i11 << 1] = cArr[0];
                        cArr2[(i11 << 1) + 1] = cArr[1];
                        cArr2[(i11 << 1) + 2] = cArr[2];
                        cArr2[(i11 << 1) + 3] = cArr[3];
                        C2723d.f5951 = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
