package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.kb */
/* loaded from: classes2.dex */
public final class C2914kb {

    /* renamed from: ﻐ */
    private static int f7211 = 1;

    /* renamed from: ﻛ */
    private static char[] f7212 = {29, 'V', 'o', 'j', 'e', 'j', 'l', 'T', 29, 'R', 'g', 'b', 'a', 'c', 'd', 'b', 'i', 'c', '{', '7', 'i', 'd', 'B', ' ', '$', 'E', 'b', 129, 281, 304, 302, 302, 263, 265, 302, 300, 300, 258, '7', 'q', 'l', 'f', 'l', 'i', 'j', 'n', 'l', 'n', 'N', '\'', 'D', 5};

    /* renamed from: ﾇ */
    private static WeakReference<C2668az> f7213;

    /* renamed from: ﾒ */
    private static int f7214;

    /* renamed from: ﻐ */
    public static void m7420(String str, String str2, Throwable th, boolean z, boolean z2) {
        int i = f7211 + 87;
        f7214 = i % 128;
        try {
            if (i % 2 != 0) {
                m7429(str, str2, th, z, z2, false);
            } else {
                m7429(str, str2, th, z, z2, false);
            }
            int i2 = f7214 + 81;
            f7211 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 15 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﻛ */
    public static void m7421(String str, String str2, String str3, Throwable th, JSONObject jSONObject, boolean z) {
        int i = f7214 + 109;
        f7211 = i % 128;
        try {
            if (i % 2 == 0) {
                m7419(str, str2, str3, th, jSONObject, false, true, z);
            } else {
                m7419(str, str2, str3, th, jSONObject, true, false, z);
            }
            int i2 = f7214 + 41;
            f7211 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ｋ */
    public static void m7422(String str, String str2, String str3, Throwable th) {
        f7214 = (f7211 + 83) % 128;
        try {
            m7428(str, str2, str3, th, false);
            f7214 = (f7211 + 7) % 128;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾇ */
    public static void m7424(C2668az c2668az) {
        f7213 = new WeakReference<>(c2668az);
        int i = f7211 + 69;
        f7214 = i % 128;
        if (i % 2 != 0) {
            int i2 = 59 / 0;
        }
    }

    /* renamed from: ﾒ */
    public static Throwable m7427(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
            f7211 = (f7214 + 1) % 128;
        }
        f7211 = (f7214 + InterfaceC3173h3.d.b.f8823f) % 128;
        return th;
    }

    /* renamed from: ﻐ */
    private static void m7419(String str, String str2, String str3, Throwable th, JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        String str4;
        int i = f7214 + 79;
        f7211 = i % 128;
        try {
            if (i % 2 == 0) {
                throw null;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(m7423(true, new int[]{18, 1, 189, 1}, "\u0001").intern());
                sb.append(str);
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(m7423(false, new int[]{19, 7, 0, 4}, "\u0001\u0001\u0001\u0001\u0000\u0000\u0001").intern());
                sb2.append(string);
                sb2.append(m7423(false, new int[]{26, 1, 156, 0}, "\u0001").intern());
                C2921n.m7507(str, sb2.toString(), th, z3);
                str4 = string;
            } else {
                str4 = str3;
            }
            C2668az c2668az = f7213.get();
            if (c2668az != null) {
                int i2 = f7214 + 69;
                f7211 = i2 % 128;
                if (i2 % 2 != 0) {
                    c2668az.m5410(str, str2, str4, Log.getStackTraceString(th), jSONObject, z2);
                } else {
                    c2668az.m5410(str, str2, str4, Log.getStackTraceString(th), jSONObject, z2);
                    throw null;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾇ */
    public static void m7426(String str, String str2, Throwable th, boolean z) {
        f7214 = (f7211 + InterfaceC3173h3.d.b.f8826i) % 128;
        try {
            m7420(str, str2, th, z, false);
            int i = f7214 + 23;
            f7211 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾇ */
    private static void m7425(String str, String str2, String str3, String str4) {
        String string;
        f7214 = (f7211 + 69) % 128;
        try {
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(m7423(true, new int[]{18, 1, 189, 1}, "\u0001").intern());
            sb.append(str);
            String string2 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7423(false, new int[]{27, 11, 190, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000").intern());
            sb2.append(string2);
            sb2.append(m7423(false, new int[]{38, 13, 0, 11}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001").intern());
            C2921n.m7503(str, sb2.toString(), false);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            if (str4 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(m7423(true, new int[]{51, 1, 0, 0}, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).intern());
                sb4.append(str4);
                string = sb4.toString();
            } else {
                string = "";
            }
            sb3.append(string);
            C2921n.m7503(str, sb3.toString(), false);
            C2668az c2668az = f7213.get();
            if (c2668az != null) {
                f7214 = (f7211 + 27) % 128;
                c2668az.m5413(str, str2, string2, str4);
            }
            int i = f7211 + 125;
            f7214 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ */
    public static void m7429(String str, String str2, Throwable th, boolean z, boolean z2, boolean z3) {
        try {
            if (!z) {
                C2921n.m7507(str, str2, th, z3);
                f7211 = (f7214 + 43) % 128;
            } else {
                f7211 = (f7214 + 65) % 128;
                C2921n.m7503(str, str2, z3);
                if (th != null) {
                    C2921n.m7507(str, m7423(true, new int[]{0, 8, 0, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001").intern(), th, z3);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m7423(true, new int[]{8, 10, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000").intern());
            sb.append(str);
            m7419(str, str2, sb.toString(), th, null, false, z2, z3);
            f7214 = (f7211 + 109) % 128;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﻐ */
    public static void m7418(String str, String str2, String str3, String str4) {
        int i = f7211 + 87;
        f7214 = i % 128;
        try {
            if (i % 2 == 0) {
                m7425(str, str2, str3, str4);
            } else {
                m7425(str, str2, str3, str4);
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ */
    private static void m7428(String str, String str2, String str3, Throwable th, boolean z) {
        f7214 = (f7211 + 1) % 128;
        try {
            m7419(str, str2, str3, th, null, false, false, false);
            f7211 = (f7214 + 33) % 128;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾇ */
    private static String m7423(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f7212, i, cArr, 0, i2);
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
}
