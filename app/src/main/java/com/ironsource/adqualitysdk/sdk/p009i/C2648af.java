package com.ironsource.adqualitysdk.sdk.p009i;

import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.af */
/* loaded from: classes2.dex */
public final class C2648af implements Comparable<C2648af> {

    /* renamed from: ﻐ */
    private static char[] f4519 = {'9', 's', 127, 249, 151, 300, 295, 296, '4', 'f', 'l'};

    /* renamed from: ｋ */
    private static int f4520 = 0;

    /* renamed from: ﾒ */
    private static int f4521 = 1;

    /* renamed from: ﾇ */
    private C2889jd f4522;

    public C2648af(C2889jd c2889jd) {
        this.f4522 = c2889jd;
    }

    /* renamed from: ﮐ */
    private long m4964() throws UnsupportedEncodingException {
        JSONObject jSONObjectM4971;
        String strM4967;
        int i = f4520 + 109;
        f4521 = i % 128;
        if (i % 2 == 0) {
            jSONObjectM4971 = m4971();
            strM4967 = m4967(false, new int[]{0, 2, 0, 0}, "\u0001\u0001");
        } else {
            jSONObjectM4971 = m4971();
            strM4967 = m4967(true, new int[]{0, 2, 0, 0}, "\u0001\u0001");
        }
        long jOptLong = jSONObjectM4971.optLong(strM4967.intern());
        int i2 = f4520 + 125;
        f4521 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
        return jOptLong;
    }

    /* renamed from: ﱟ */
    private long m4965() throws UnsupportedEncodingException {
        JSONObject jSONObjectM4971;
        String strM4967;
        int i = f4520 + 41;
        f4521 = i % 128;
        if (i % 2 == 0) {
            jSONObjectM4971 = m4971();
            strM4967 = m4967(false, new int[]{2, 2, 144, 2}, "\u0000\u0001");
        } else {
            jSONObjectM4971 = m4971();
            strM4967 = m4967(true, new int[]{2, 2, 144, 2}, "\u0000\u0001");
        }
        long jOptInt = jSONObjectM4971.optInt(strM4967.intern());
        f4520 = (f4521 + 71) % 128;
        return jOptInt;
    }

    /* renamed from: ﻏ */
    private String m4966() {
        int i = f4520 + 31;
        f4521 = i % 128;
        if (i % 2 == 0) {
            this.f4522.m7226();
            throw null;
        }
        String strM7226 = this.f4522.m7226();
        f4521 = (f4520 + 13) % 128;
        return strM7226;
    }

    /* renamed from: ﾒ */
    private static List<String> m4970() {
        f4521 = (f4520 + 75) % 128;
        List<String> listAsList = Arrays.asList(C2869ik.f6805);
        f4521 = (f4520 + 97) % 128;
        return listAsList;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C2648af c2648af) throws UnsupportedEncodingException {
        int i = f4521 + 63;
        f4520 = i % 128;
        C2648af c2648af2 = c2648af;
        if (i % 2 == 0) {
            return m4969(c2648af2);
        }
        m4969(c2648af2);
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = (f4521 + 57) % 128;
        f4520 = i;
        if (this == obj) {
            f4521 = (i + 7) % 128;
            return true;
        }
        if (obj == null || C2648af.class != obj.getClass()) {
            return false;
        }
        boolean zEquals = m4966().equals(((C2648af) obj).m4966());
        int i2 = f4521 + 51;
        f4520 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
        return zEquals;
    }

    public final int hashCode() {
        if (m4971() != null) {
            f4520 = (f4521 + 3) % 128;
            return m4971().hashCode();
        }
        f4521 = (f4520 + 87) % 128;
        return 0;
    }

    public final String toString() {
        f4520 = (f4521 + InterfaceC3173h3.d.b.f8826i) % 128;
        String string = m4971().toString();
        int i = f4521 + 35;
        f4520 = i % 128;
        if (i % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public final synchronized JSONObject m4971() {
        JSONObject jSONObjectM7227;
        try {
            int i = f4521 + 97;
            f4520 = i % 128;
            if (i % 2 != 0) {
                jSONObjectM7227 = this.f4522.m7227();
                int i2 = 31 / 0;
            } else {
                jSONObjectM7227 = this.f4522.m7227();
            }
            f4521 = (f4520 + 61) % 128;
        } catch (Throwable th) {
            throw th;
        }
        return jSONObjectM7227;
    }

    /* renamed from: ﻛ */
    public final String m4972() {
        f4520 = (f4521 + 65) % 128;
        String strOptString = m4971().optString(m4967(false, new int[]{4, 4, 190, 0}, "\u0000\u0000\u0001\u0001").intern());
        int i = f4520 + 55;
        f4521 = i % 128;
        if (i % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public final synchronized void m4974(int i) {
        try {
            f4520 = (f4521 + 25) % 128;
            if (this.f4522.m7227() != null) {
                int i2 = f4521 + 73;
                f4520 = i2 % 128;
                if (i2 % 2 != 0) {
                    C2915kc.m7447(this.f4522.m7227(), i, m4970());
                    throw null;
                }
                C2915kc.m7447(this.f4522.m7227(), i, m4970());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﾇ */
    public final String m4976() {
        f4520 = (f4521 + 7) % 128;
        String strOptString = m4971().optString(m4967(false, new int[]{8, 3, 0, 2}, "\u0001\u0001\u0001").intern(), null);
        int i = f4521 + 49;
        f4520 = i % 128;
        if (i % 2 != 0) {
            int i2 = 12 / 0;
        }
        return strOptString;
    }

    /* renamed from: ﻐ */
    private static String m4967(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f4519, i, cArr, 0, i2);
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

    /* renamed from: ﾒ */
    private int m4969(C2648af c2648af) throws UnsupportedEncodingException {
        long jM4964 = m4964();
        long jM49642 = c2648af.m4964();
        if (jM4964 < jM49642) {
            f4520 = (f4521 + 51) % 128;
            return -1;
        }
        if (jM4964 == jM49642) {
            f4520 = (f4521 + 71) % 128;
            return m4968(c2648af);
        }
        f4521 = (f4520 + 31) % 128;
        return 1;
    }

    /* renamed from: ｋ */
    public final C2889jd m4973() {
        int i = (f4521 + 27) % 128;
        f4520 = i;
        C2889jd c2889jd = this.f4522;
        int i2 = i + 15;
        f4521 = i2 % 128;
        if (i2 % 2 != 0) {
            return c2889jd;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public final void m4975(String str) throws JSONException, UnsupportedEncodingException {
        JSONObject jSONObjectM4971;
        String strM4967;
        int i = f4520 + 39;
        f4521 = i % 128;
        try {
            if (i % 2 == 0) {
                jSONObjectM4971 = m4971();
                strM4967 = m4967(true, new int[]{8, 3, 0, 2}, "\u0001\u0001\u0001");
            } else {
                jSONObjectM4971 = m4971();
                strM4967 = m4967(false, new int[]{8, 3, 0, 2}, "\u0001\u0001\u0001");
            }
            jSONObjectM4971.put(strM4967.intern(), str);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ｋ */
    private int m4968(C2648af c2648af) throws UnsupportedEncodingException {
        f4520 = (f4521 + 47) % 128;
        long jM4965 = m4965();
        long jM49652 = c2648af.m4965();
        if (jM4965 < jM49652) {
            f4520 = (f4521 + 45) % 128;
            return -1;
        }
        if (jM4965 != jM49652) {
            return 1;
        }
        f4521 = (f4520 + 3) % 128;
        return 0;
    }
}
