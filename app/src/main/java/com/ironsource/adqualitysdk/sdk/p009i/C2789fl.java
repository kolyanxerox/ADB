package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fl */
/* loaded from: classes2.dex */
public final class C2789fl extends C2783ff<String> {

    /* renamed from: ﻐ */
    private static long f6350 = 4527750729700833870L;

    /* renamed from: ﻛ */
    private static char f6351 = 0;

    /* renamed from: ｋ */
    private static int f6352 = 0;

    /* renamed from: ﾇ */
    private static int f6353 = 0;

    /* renamed from: ﾒ */
    private static int f6354 = 1;

    public C2789fl(String str, C2736dm c2736dm) {
        super(C2746dw.m6725(str), c2736dm);
    }

    /* renamed from: ﾒ */
    private static String m6798(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f6350) ^ f6352) ^ f6351);
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.C2783ff
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m6798(((byte) KeyEvent.getModifierMetaStateMask()) + 2027554257, (char) (14876 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "퀟\uda05᭸ᠺ", "\ue945", "穎덕쵌㻕").intern());
        sb.append(super.toString());
        String strOooOO0O = AbstractC2183w4.OooOO0O(sb, m6798(2027554256 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (14875 - TextUtils.getOffsetBefore("", 0)), "퀟\uda05᭸ᠺ", "\ue945", "穎덕쵌㻕"));
        f6353 = (f6354 + 27) % 128;
        return strOooOO0O;
    }
}
