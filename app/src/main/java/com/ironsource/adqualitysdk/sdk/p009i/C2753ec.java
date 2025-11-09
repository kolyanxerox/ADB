package com.ironsource.adqualitysdk.sdk.p009i;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ec */
/* loaded from: classes2.dex */
public final class C2753ec extends AbstractC2755ee {

    /* renamed from: ﻐ */
    private static int f6227 = 0;

    /* renamed from: ｋ */
    private static int f6228 = 1;

    /* renamed from: ﾒ */
    private static char[] f6229 = {'A', 128, 128, 'Y', 'Y', '|', '|', 132, '~', '{', 'z', 'S', 'U', '~', 129, '~', 'W', '[', '{', 'v', 128, '}', 'R', 'B', 'k', 'o', 16, '&', 'i', 16, '-', '-', '!', 'z'};

    /* renamed from: ﻛ */
    private Map<String, AbstractC2755ee> f6230;

    public C2753ec(Map<String, AbstractC2755ee> map, C2736dm c2736dm) {
        super(c2736dm);
        this.f6230 = new HashMap();
        for (String str : map.keySet()) {
            this.f6230.put(C2746dw.m6725(str), map.get(str));
        }
    }

    /* renamed from: ﾒ */
    private static String m6753(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f6229, i, cArr, 0, i2);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            f6228 = (f6227 + 107) % 128;
            return true;
        }
        if (obj != null && C2753ec.class == obj.getClass()) {
            Map<String, AbstractC2755ee> map = this.f6230;
            Map<String, AbstractC2755ee> map2 = ((C2753ec) obj).f6230;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 == null) {
                int i = (f6227 + 85) % 128;
                f6228 = i;
                f6227 = (i + 7) % 128;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (f6228 + InterfaceC3173h3.d.b.f8819b) % 128;
        f6227 = i;
        Map<String, AbstractC2755ee> map = this.f6230;
        if (map == null) {
            return 0;
        }
        f6228 = (i + 25) % 128;
        return map.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m6753(false, new int[]{25, 1, 100, 0}, "\u0001").intern());
        boolean z = true;
        for (String str : this.f6230.keySet()) {
            if (!z) {
                f6227 = (f6228 + 57) % 128;
                sb.append(m6753(false, new int[]{26, 2, 0, 1}, "\u0000\u0000").intern());
                f6228 = (f6227 + 69) % 128;
            }
            sb.append(m6753(true, new int[]{28, 1, 176, 0}, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).intern());
            sb.append(str);
            sb.append(m6753(true, new int[]{29, 4, 0, 4}, "\u0000\u0000\u0000\u0000").intern());
            sb.append(this.f6230.get(str));
            z = false;
        }
        return AbstractC2183w4.OooOO0O(sb, m6753(true, new int[]{33, 1, 119, 0}, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR));
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : this.f6230.keySet()) {
            f6228 = (f6227 + 11) % 128;
            try {
                jSONObject.put(str, this.f6230.get(str).m6760(c2741dr, c2712cp).m6717());
            } catch (JSONException e) {
                String strM6290 = c2712cp.m6290();
                StringBuilder sb = new StringBuilder();
                sb.append(m6753(false, new int[]{0, 25, 16, 23}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001").intern());
                sb.append(m6759());
                C2713cq.m6350(strM6290, sb.toString(), e);
            }
        }
        C2744du c2744du = new C2744du(jSONObject);
        int i = f6227 + 49;
        f6228 = i % 128;
        if (i % 2 != 0) {
            return c2744du;
        }
        throw null;
    }
}
