package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ft */
/* loaded from: classes2.dex */
public final class C2797ft extends AbstractC2794fq {

    /* renamed from: ﱡ */
    private static int f6391 = 1;

    /* renamed from: ﻏ */
    private static int f6392 = 0;

    /* renamed from: ﻐ */
    private static boolean f6393 = true;

    /* renamed from: ｋ */
    private static int f6394 = 260;

    /* renamed from: ﾇ */
    private static char[] f6395 = {378, 357, 374, 292, 304, 319};

    /* renamed from: ﾒ */
    private static boolean f6396 = true;

    /* renamed from: ﻛ */
    private List<AbstractC2755ee> f6397;

    public C2797ft(List<AbstractC2755ee> list) {
        this.f6397 = list;
    }

    /* renamed from: ﾒ */
    private static String m6809(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f6395;
                int i2 = f6394;
                if (f6393) {
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
                if (f6396) {
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

    public final String toString() {
        f6391 = (f6392 + 87) % 128;
        if (this.f6397 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(m6809(null, null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0084\u0083\u0082\u0081").intern());
            sb.append(TextUtils.join(m6809(null, null, 127 - Color.blue(0), "\u0084\u0085").intern(), this.f6397));
            return AbstractC2183w4.OooOO0O(sb, m6809(null, null, TextUtils.indexOf("", "", 0, 0) + 127, "\u0086"));
        }
        String strIntern = m6809(null, null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0086\u0084\u0083\u0082\u0081").intern();
        int i = f6392 + 9;
        f6391 = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2794fq
    /* renamed from: ｋ */
    public final C2744du mo6796(C2741dr c2741dr, C2712cp c2712cp) {
        Iterator<AbstractC2755ee> it;
        int i = f6391 + InterfaceC3173h3.d.b.f8819b;
        f6392 = i % 128;
        if (i % 2 != 0) {
            it = this.f6397.iterator();
            int i2 = 83 / 0;
        } else {
            it = this.f6397.iterator();
        }
        while (true) {
            C2762el c2762elM6727 = null;
            if (!it.hasNext()) {
                return new C2744du(null);
            }
            AbstractC2755ee next = it.next();
            if (next instanceof C2762el) {
                c2762elM6727 = (C2762el) next;
                f6391 = (f6392 + 91) % 128;
            } else if (next instanceof C2747dx) {
                c2762elM6727 = ((C2747dx) next).m6727();
            }
            if (c2762elM6727 != null) {
                f6391 = (f6392 + 43) % 128;
                c2741dr.m6656(Arrays.asList(c2762elM6727.m6777()));
            }
            next.mo6724(c2741dr, c2712cp);
        }
    }
}
