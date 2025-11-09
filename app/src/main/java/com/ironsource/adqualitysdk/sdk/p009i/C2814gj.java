package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.inmobi.sdk.InMobiSdk;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gj */
/* loaded from: classes2.dex */
public final class C2814gj extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static int f6470 = 0;

    /* renamed from: ﻛ */
    private static char f6471 = 53208;

    /* renamed from: ｋ */
    private static int f6472 = 0;

    /* renamed from: ﾇ */
    private static int f6473 = 1;

    /* renamed from: ﾒ */
    private static long f6474;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        f6470 = (f6473 + 5) % 128;
        String strIntern = m6832(KeyEvent.normalizeMetaState(0), (char) (MotionEvent.axisFromString("") + 1), "뎉\ue88bۇ\ue837", "ݤ㍗䖓팥퉐扢ꓘ㉇빾۰\uf359轢\udb33㍚⏣欰籿⮐\ue6b5\ufde7璼ꑜﭭꛢ", "\u0000\u0000\u0000\u0000").intern();
        f6473 = (f6470 + 77) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6473 = (f6470 + 29) % 128;
        String strIntern = m6832(TextUtils.getOffsetAfter("", 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 23584), "꽀舥Ἅ剜", "뽃녫㟃ꖯ젖\ue2d3", "\u0000\u0000\u0000\u0000").intern();
        int i = f6470 + 95;
        f6473 = i % 128;
        if (i % 2 == 0) {
            int i2 = 24 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6470;
        f6473 = (i + 63) % 128;
        f6473 = (i + 11) % 128;
        return InMobiSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2687br c2687br = new C2687br(mo6813());
        f6473 = (f6470 + 73) % 128;
        return c2687br;
    }

    /* renamed from: ﻛ */
    private static String m6832(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f6474) ^ f6472) ^ f6471);
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
