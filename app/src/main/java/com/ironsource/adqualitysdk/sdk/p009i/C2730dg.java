package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dg */
/* loaded from: classes2.dex */
public class C2730dg extends C2722cz implements InterfaceC2707ck {

    /* renamed from: ﭖ */
    private static int f5990 = 0;

    /* renamed from: ﭸ */
    private static int f5991 = 1;

    /* renamed from: ﻐ */
    private String f5999;

    /* renamed from: ﻛ */
    private String f6000;

    /* renamed from: ｋ */
    private EnumC2840hi f6001;

    /* renamed from: ﾒ */
    private String f6003;

    /* renamed from: ﱡ */
    private static char[] f5995 = {'g', 35557, 5492, 40897, 10852, 46326, 16229, 51698, 21620, 57065, 26995, 62437, 32370, 2249, 37732, 'g', 35557, 5492, 40902, 10857, 46318, 16225, 51692, 21589, 57074, 26988, 'a', 35556, 5476, 40915, 10863, 46325, 16242, 51683, 21605, 57045, 26994, 62444, 'g', 35557, 5492, 40897, 10852, 46326, 16229, 51698, 21620, 57065, 26995, 62437, 32370, 2249, 37732, 7635, 43119, 13045, 48498, 18403, 53861, 43865, 8655, 48734, 13548, 33091, 8132, 37963, 25286, 65407, 30168, 49734, 22777, 54597, 41951, 14424, 46793, 847, 's', 35557, 5492, 40915, 10863, 46325, 16242, 51683, 21605, 57045, 26994, 62444, 32339, 2287, 37749, 7666, 43107, 13029, 'g', 35557, 5492, 40897, 10852, 46326, 16229, 51698, 21620, 57065, 26995, 62437, 32370, 2259, 37743, 7669, 43122, 13027, 48485, 18378, 53875, 23791, 59246, 61044, 25839, 64330, 29171, 50287, 23278};

    /* renamed from: ﺙ */
    private static long f5996 = -3052281562068317568L;

    /* renamed from: ﮉ */
    private static boolean f5992 = true;

    /* renamed from: ﮌ */
    private static boolean f5993 = true;

    /* renamed from: ﻏ */
    private static int f5997 = 27;

    /* renamed from: ﮐ */
    private static char[] f5994 = {142, 128, 143, '\\', 127, 145, 141, 132, 'd', 130, 'o', 148, 139, '_', 'p', 135, 'a', 137, '|', 'n', 138, 144, '~', 131, 129};

    /* renamed from: ﾇ */
    private final JSONObject f6002 = new JSONObject();

    /* renamed from: ﱟ */
    private final List<String> f5998 = new ArrayList();

    /* renamed from: ﭖ */
    private JSONObject m6497() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f6000;
            if (str != null) {
                f5990 = (f5991 + 29) % 128;
                if (this.f6001 != null) {
                    jSONObject.putOpt(C2869ik.f6827, str);
                    jSONObject.putOpt(C2869ik.f6828, Integer.valueOf(this.f6001.m6869()));
                    f5990 = (f5991 + 79) % 128;
                }
            }
            jSONObject.putOpt(C2869ik.f6822, this.f5999);
            jSONObject.putOpt(C2869ik.f6825, this.f6003);
            if (this.f5998.size() > 0) {
                jSONObject.putOpt(C2869ik.f6819, new JSONArray((Collection) this.f5998));
            }
            if (this.f6002.length() > 0) {
                jSONObject.putOpt(C2869ik.f6826, this.f6002.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: ﭴ */
    private Object m6498() {
        boolean z = true;
        if (TextUtils.isEmpty(this.f6000)) {
            f5990 = (f5991 + 57) % 128;
            if (!(!TextUtils.isEmpty(this.f5999)) && TextUtils.isEmpty(this.f6003)) {
                int i = f5990 + 31;
                f5991 = i % 128;
                if (i % 2 == 0) {
                    this.f5998.size();
                    throw null;
                }
                if (this.f5998.size() <= 0) {
                    f5990 = (f5991 + 37) % 128;
                    z = false;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: ﮐ */
    private JSONObject m6499() {
        int i = (f5991 + 109) % 128;
        f5990 = i;
        JSONObject jSONObject = this.f6002;
        f5991 = (i + 37) % 128;
        return jSONObject;
    }

    /* renamed from: ﱟ */
    private Object m6500() {
        f5990 = (f5991 + 1) % 128;
        String strOptString = this.f6002.optString(C2869ik.f6825);
        int i = f5991 + 51;
        f5990 = i % 128;
        if (i % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* renamed from: ﱡ */
    private String m6501() {
        f5990 = (f5991 + 17) % 128;
        String strOptString = this.f6002.optString(C2869ik.f6827);
        int i = f5990 + 45;
        f5991 = i % 128;
        if (i % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* renamed from: ﺙ */
    private String m6503() {
        f5991 = (f5990 + 11) % 128;
        String strOptString = this.f6002.optString(C2869ik.f6819);
        int i = f5990 + 33;
        f5991 = i % 128;
        if (i % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* renamed from: ﻏ */
    private String m6505() {
        int i = f5991 + 11;
        f5990 = i % 128;
        if (i % 2 == 0) {
            return this.f6002.optString(C2869ik.f6822);
        }
        this.f6002.optString(C2869ik.f6822);
        throw null;
    }

    /* renamed from: ﻐ */
    private String m6507() {
        int i = (f5991 + 113) % 128;
        f5990 = i;
        String str = this.f6000;
        f5991 = (i + 15) % 128;
        return str;
    }

    /* renamed from: ﻛ */
    private void m6512(String str) {
        int i = f5990;
        this.f6000 = str;
        int i2 = i + 113;
        f5991 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
    }

    /* renamed from: ｋ */
    private String m6513() {
        int i = (f5991 + 71) % 128;
        f5990 = i;
        String str = this.f6003;
        int i2 = i + 7;
        f5991 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 29 / 0;
        }
        return str;
    }

    /* renamed from: ﾇ */
    private EnumC2840hi m6515() {
        int i = f5990;
        EnumC2840hi enumC2840hi = this.f6001;
        int i2 = i + InterfaceC3173h3.d.b.f8821d;
        f5991 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
        return enumC2840hi;
    }

    /* renamed from: ﾒ */
    private void m6519(EnumC2840hi enumC2840hi) {
        int i = f5991 + 85;
        f5990 = i % 128;
        int i2 = i % 2;
        this.f6001 = enumC2840hi;
        if (i2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﱡ */
    private void m6502(String str) throws JSONException {
        f5990 = (f5991 + 57) % 128;
        try {
            this.f6002.put(C2869ik.f6822, str);
            f5990 = (f5991 + 53) % 128;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﺙ */
    private void m6504(String str) throws JSONException {
        f5990 = (f5991 + 17) % 128;
        try {
            this.f6002.put(C2869ik.f6819, str);
            f5990 = (f5991 + 73) % 128;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻏ */
    private void m6506(String str) throws JSONException {
        f5991 = (f5990 + InterfaceC3173h3.d.b.f8821d) % 128;
        try {
            this.f6002.put(C2869ik.f6825, str);
            f5991 = (f5990 + 45) % 128;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻐ */
    private void m6510(List<String> list) {
        Iterator<String> it = list.iterator();
        int i = f5991 + 47;
        while (true) {
            f5990 = i % 128;
            if (!it.hasNext()) {
                return;
            }
            int i2 = f5991 + 77;
            f5990 = i2 % 128;
            if (i2 % 2 != 0) {
                m6514(it.next());
                throw null;
            }
            m6514(it.next());
            i = f5991 + 115;
        }
    }

    /* renamed from: ﻛ */
    private String m6511() {
        int i = f5990 + 33;
        f5991 = i % 128;
        if (i % 2 != 0) {
            return this.f5999;
        }
        int i2 = 79 / 0;
        return this.f5999;
    }

    /* renamed from: ｋ */
    private void m6514(String str) {
        int i = f5991 + 113;
        f5990 = i % 128;
        if (i % 2 != 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (TextUtils.isEmpty(str) || this.f5998.contains(str)) {
            return;
        }
        this.f5998.add(str);
        f5990 = (f5991 + 99) % 128;
    }

    /* renamed from: ﾇ */
    private void m6516(String str) {
        int i = f5991 + 5;
        int i2 = i % 128;
        f5990 = i2;
        int i3 = i % 2;
        this.f5999 = str;
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        f5991 = (i2 + 25) % 128;
    }

    /* renamed from: ﾒ */
    private void m6520(String str) {
        int i = f5991 + 123;
        f5990 = i % 128;
        int i2 = i % 2;
        this.f6003 = str;
        if (i2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    private List<String> m6518() {
        int i = (f5990 + 1) % 128;
        f5991 = i;
        List<String> list = this.f5998;
        int i2 = i + 49;
        f5990 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
        return list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a A[PHI: r4
  0x009a: PHI (r4v27 char) = (r4v23 char), (r4v28 char) binds: [B:27:0x010f, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031e  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2707ck
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5466(java.lang.String r21, java.util.List<java.lang.Object> r22, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2704ch r23) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2730dg.mo5466(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* renamed from: ﾒ */
    private static String m6517(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f5995[i2 + i3] ^ (i3 * f5996)) ^ c);
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
    private void m6509(String str) throws JSONException {
        int i = f5990 + 55;
        f5991 = i % 128;
        try {
            if (i % 2 == 0) {
                this.f6002.put(C2869ik.f6827, str);
                int i2 = 77 / 0;
            } else {
                this.f6002.put(C2869ik.f6827, str);
            }
            int i3 = f5990 + 91;
            f5991 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻐ */
    private static String m6508(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f5994;
                int i2 = f5997;
                if (f5993) {
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
                if (f5992) {
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
}
