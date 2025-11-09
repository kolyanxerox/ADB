package com.ironsource.adqualitysdk.sdk.p009i;

import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jd */
/* loaded from: classes2.dex */
public final class C2889jd {

    /* renamed from: ﻛ */
    private static int f7007 = 0;

    /* renamed from: ｋ */
    private static char[] f7008 = {':', '\\', 'R', 'j', 'j', 'h', 'o', 'q', 'g', 197, 191, 200};

    /* renamed from: ﾇ */
    private static int f7009 = 1;

    /* renamed from: ﻐ */
    private String f7010;

    /* renamed from: ﾒ */
    private JSONObject f7011;

    public C2889jd(JSONObject jSONObject) {
        this(jSONObject, UUID.randomUUID().toString());
    }

    /* renamed from: ﾇ */
    private static String m7224(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f7008, i, cArr, 0, i2);
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

    /* renamed from: ﻐ */
    public final JSONObject m7225() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(m7224(false, new int[]{0, 8, 0, 5}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000").intern(), this.f7011);
        jSONObject.put(m7224(true, new int[]{8, 4, 89, 1}, "\u0000\u0001\u0001\u0000").intern(), this.f7010);
        f7007 = (f7009 + InterfaceC3173h3.d.b.f8823f) % 128;
        return jSONObject;
    }

    /* renamed from: ﻛ */
    public final String m7226() {
        int i = f7007 + 95;
        f7009 = i % 128;
        if (i % 2 != 0) {
            return this.f7010;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public final JSONObject m7227() {
        int i = (f7009 + 61) % 128;
        f7007 = i;
        JSONObject jSONObject = this.f7011;
        f7009 = (i + 57) % 128;
        return jSONObject;
    }

    public C2889jd(JSONObject jSONObject, String str) {
        this.f7011 = jSONObject;
        this.f7010 = str;
    }
}
