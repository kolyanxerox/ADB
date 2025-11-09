package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.util.TypedValue;
import android.view.KeyEvent;
import jp.maio.sdk.android.MaioAds;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.go */
/* loaded from: classes2.dex */
public final class C2819go extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static int f6492 = 0;

    /* renamed from: ｋ */
    private static int f6493 = 54;

    /* renamed from: ﾒ */
    private static int f6494 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        f6494 = (f6492 + 39) % 128;
        String strIntern = m6837(13 - (Process.myTid() >> 22), 27 - KeyEvent.getDeadChar(0, 0), 148 - Color.alpha(0), "\u0006\u0014\u0011\u000b\u0006\uffd0\uffef\u0003\u000b\u0011￣\u0006\u0015\f\u0012\uffd0\u000f\u0003\u000b\u0011\uffd0\u0015\u0006\r\uffd0\u0003\u0010", false).intern();
        int i = f6494 + 11;
        f6492 = i % 128;
        if (i % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6494 + 81;
        f6492 = i % 128;
        String strIntern = (i % 2 != 0 ? m6837(5 / (TypedValue.complexToFraction(1, 1.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(1, 1.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 2, 27548 >> (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0000\u0006\u0004\ufff8", false) : m6837(2 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 4, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 159, "\u0000\u0006\u0004\ufff8", false)).intern();
        f6492 = (f6494 + 21) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        Class<MaioAds> cls;
        int i = f6494;
        int i2 = i + 89;
        f6492 = i2 % 128;
        if (i2 % 2 != 0) {
            cls = MaioAds.class;
            int i3 = 33 / 0;
        } else {
            cls = MaioAds.class;
        }
        int i4 = i + 19;
        f6492 = i4 % 128;
        if (i4 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2692bw c2692bw = new C2692bw(mo6813());
        f6494 = (f6492 + 45) % 128;
        return c2692bw;
    }

    /* renamed from: ﻛ */
    private static String m6837(int i, int i2, int i3, String str, boolean z) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2669b.f5039) {
            try {
                char[] cArr2 = new char[i2];
                C2669b.f5040 = 0;
                while (true) {
                    int i4 = C2669b.f5040;
                    if (i4 >= i2) {
                        break;
                    }
                    C2669b.f5038 = cArr[i4];
                    cArr2[C2669b.f5040] = (char) (C2669b.f5038 + i3);
                    int i5 = C2669b.f5040;
                    cArr2[i5] = (char) (cArr2[i5] - f6493);
                    C2669b.f5040 = i5 + 1;
                }
                if (i > 0) {
                    C2669b.f5041 = i;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    int i6 = C2669b.f5041;
                    System.arraycopy(cArr3, 0, cArr2, i2 - i6, i6);
                    int i7 = C2669b.f5041;
                    System.arraycopy(cArr3, i7, cArr2, 0, i2 - i7);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2669b.f5040 = 0;
                    while (true) {
                        int i8 = C2669b.f5040;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr4[i8] = cArr2[(i2 - i8) - 1];
                        C2669b.f5040 = i8 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
