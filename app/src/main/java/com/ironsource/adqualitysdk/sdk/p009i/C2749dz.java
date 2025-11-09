package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dz */
/* loaded from: classes2.dex */
public final class C2749dz extends AbstractC2755ee {

    /* renamed from: ﺙ */
    private static int f6207 = 1;

    /* renamed from: ﻐ */
    private static char f6208 = 47089;

    /* renamed from: ﻛ */
    private static long f6209;

    /* renamed from: ﾇ */
    private static int f6210;

    /* renamed from: ﾒ */
    private static int f6211;

    /* renamed from: ｋ */
    private String f6212;

    public C2749dz(String str, C2736dm c2736dm) {
        super(c2736dm);
        this.f6212 = C2746dw.m6725(str);
    }

    /* renamed from: ﾇ */
    private static String m6744(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f6209) ^ f6210) ^ f6208);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            f6211 = (f6207 + InterfaceC3173h3.d.b.f8819b) % 128;
            return true;
        }
        if (obj != null && C2749dz.class == obj.getClass()) {
            String str = this.f6212;
            String str2 = ((C2749dz) obj).f6212;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                f6207 = (f6211 + 11) % 128;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (f6207 + 53) % 128;
        f6211 = i;
        String str = this.f6212;
        if (str == null) {
            return 0;
        }
        int i2 = i + 73;
        f6207 = i2 % 128;
        if (i2 % 2 != 0) {
            return str.hashCode();
        }
        str.hashCode();
        throw null;
    }

    public final String toString() {
        int i = f6207;
        String str = this.f6212;
        f6211 = (i + 73) % 128;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        C2744du c2744du = new C2744du(c2712cp.m6294().m5468(C2916kd.m7452(this.f6212, m6744(TextUtils.getOffsetBefore("", 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 16879), "捭ꔮ\uee30\uf341", "摻㽾땘톈䪯휓", "\u0000\u0000\u0000\u0000").intern())));
        f6207 = (f6211 + 109) % 128;
        return c2744du;
    }
}
