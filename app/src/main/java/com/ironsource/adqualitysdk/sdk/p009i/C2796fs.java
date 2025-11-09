package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fs */
/* loaded from: classes2.dex */
public class C2796fs extends AbstractC2794fq {

    /* renamed from: ﱡ */
    private static int f6385 = 1;

    /* renamed from: ﻐ */
    private static int f6386 = 0;

    /* renamed from: ﻛ */
    private static char f6387 = 0;

    /* renamed from: ｋ */
    private static int f6388 = 0;

    /* renamed from: ﾇ */
    private static long f6389 = -6269926821851505975L;

    /* renamed from: ﾒ */
    private AbstractC2755ee f6390;

    public C2796fs(AbstractC2755ee abstractC2755ee) {
        this.f6390 = abstractC2755ee;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            int i = f6386 + 35;
            f6385 = i % 128;
            return i % 2 != 0;
        }
        if (obj != null) {
            f6386 = (f6385 + 113) % 128;
            if (getClass() == obj.getClass()) {
                AbstractC2755ee abstractC2755ee = this.f6390;
                AbstractC2755ee abstractC2755ee2 = ((C2796fs) obj).f6390;
                if (abstractC2755ee != null) {
                    return abstractC2755ee.equals(abstractC2755ee2);
                }
                if (abstractC2755ee2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = f6385 + 63;
        int i2 = i % 128;
        f6386 = i2;
        if (i % 2 != 0) {
            throw null;
        }
        AbstractC2755ee abstractC2755ee = this.f6390;
        if (abstractC2755ee == null) {
            return 0;
        }
        int i3 = i2 + 23;
        f6385 = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = abstractC2755ee.hashCode();
        if (i4 == 0) {
            int i5 = 77 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = f6386 + 61;
        f6385 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (this.f6390 == null) {
            return m6807((ViewConfiguration.getJumpTapTimeout() >> 16) - 868038611, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 64749), "ⵅ䋈\ueecc㋼", "ꛈ", "\udac9柘뻆꣼").intern();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6390);
        String strOooOO0O = AbstractC2183w4.OooOO0O(sb, m6807((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 868038612, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 64750), "ⵅ䋈\ueecc㋼", "ꛈ", "\udac9柘뻆꣼"));
        int i2 = f6386 + 91;
        f6385 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
        return strOooOO0O;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2794fq
    /* renamed from: ｋ */
    public C2744du mo6796(C2741dr c2741dr, C2712cp c2712cp) {
        int i = f6386 + 83;
        f6385 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        AbstractC2755ee abstractC2755ee = this.f6390;
        if (abstractC2755ee == null) {
            return new C2744du(null);
        }
        C2744du c2744duM6760 = abstractC2755ee.m6760(c2741dr, c2712cp);
        f6385 = (f6386 + 25) % 128;
        return c2744duM6760;
    }

    /* renamed from: ﾇ */
    public final AbstractC2755ee m6808() {
        int i = (f6386 + 69) % 128;
        f6385 = i;
        AbstractC2755ee abstractC2755ee = this.f6390;
        f6386 = (i + 57) % 128;
        return abstractC2755ee;
    }

    /* renamed from: ｋ */
    private static String m6807(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f6389) ^ f6388) ^ f6387);
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
