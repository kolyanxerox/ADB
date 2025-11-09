package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ge */
/* loaded from: classes2.dex */
public abstract class AbstractC2809ge extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static int f6442 = 1;

    /* renamed from: ﻛ */
    private static int f6443 = 0;

    /* renamed from: ﾇ */
    private static int f6444 = 77;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ge$a */
    public static class a extends AbstractC2809ge {

        /* renamed from: ﮐ */
        private static int f6445 = 1;

        /* renamed from: ﻐ */
        private static char[] f6446 = {193, 205, 203, 140, 192, 215, 210, 195, 194, 191, 204, 209, 201, 206, 178, 159, 177};

        /* renamed from: ﻛ */
        private static boolean f6447 = true;

        /* renamed from: ｋ */
        private static int f6448 = 94;

        /* renamed from: ﾇ */
        private static boolean f6449 = true;

        /* renamed from: ﾒ */
        private static int f6450;

        /* renamed from: ﻛ */
        private static String m6825(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f6446;
                    int i2 = f6448;
                    if (f6447) {
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
                    if (f6449) {
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

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﻐ */
        public final String mo6812() {
            f6450 = (f6445 + 87) % 128;
            String strIntern = m6825(null, null, 126 - MotionEvent.axisFromString(""), "\u008d\u0089\u0091\u0089\u0090\u008f\u008f\u0084\u008d\u0089\u008c\u0089\u008a\u008b\u0088\u008e\u0082\u0084\u008d\u0089\u008c\u0084\u0088\u0081\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            f6445 = (f6450 + 65) % 128;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ｋ */
        public final Class mo6814() {
            int i = f6445 + 125;
            f6450 = i % 128;
            if (i % 2 == 0) {
                return TTAdSdk.class;
            }
            throw null;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ge$c */
    public static class c extends AbstractC2809ge {

        /* renamed from: ﻐ */
        private static long f6451 = 4192567426532481436L;

        /* renamed from: ｋ */
        private static int f6452 = 0;

        /* renamed from: ﾇ */
        private static int f6453 = 1;

        /* renamed from: ﻛ */
        private static String m6826(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2777f.f6322) {
                try {
                    char[] cArrM6790 = C2777f.m6790(f6451, cArr, i);
                    C2777f.f6321 = 4;
                    while (true) {
                        int i2 = C2777f.f6321;
                        if (i2 < cArrM6790.length) {
                            C2777f.f6320 = i2 - 4;
                            cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f6451));
                            C2777f.f6321 = i2 + 1;
                        } else {
                            str2 = new String(cArrM6790, 4, cArrM6790.length - 4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﻐ */
        public final String mo6812() {
            int i = f6452 + 81;
            f6453 = i % 128;
            return m6826("ᔄ죜ᕧ儯픊\ue65f䷉脳猖좩羃绨\ud980껁\ue629퐞☱О肤䶉貯ﮮ⫈⬭ᕑ兾핖肩珗좄翬纓\ud875글\ue67e퐃⛭֮肎䷩賚ﬀ⬶⭊ᔷ兄햬", i % 2 == 0 ? (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)) * (-1) : (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1).intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ｋ */
        public final Class mo6814() {
            int i = (f6453 + 61) % 128;
            f6452 = i;
            f6453 = (i + 97) % 128;
            return PAGSdk.class;
        }
    }

    /* renamed from: ｋ */
    private static String m6824(int i, int i2, int i3, String str, boolean z) {
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
                    cArr2[i5] = (char) (cArr2[i5] - f6444);
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6443 + InterfaceC3173h3.d.b.f8821d;
        f6442 = i % 128;
        String strIntern = (i % 2 == 0 ? m6824(34 << KeyEvent.keyCodeFromString(""), (ExpandableListView.getPackedPositionForChild(0, 0) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 1L ? 0 : -1)) + 28, 23794 << (ViewConfiguration.getMinimumFlingVelocity() * 11), "\f�￼\ufff9\u0006\ufffb�\ufffa\u0011", true) : m6824(7 - KeyEvent.keyCodeFromString(""), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10, 181 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\f�￼\ufff9\u0006\ufffb�\ufffa\u0011", false)).intern();
        int i2 = f6443 + 67;
        f6442 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 29 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2682bm c2682bm = new C2682bm(mo6813());
        int i = f6443 + InterfaceC3173h3.d.b.f8821d;
        f6442 = i % 128;
        if (i % 2 != 0) {
            return c2682bm;
        }
        throw null;
    }
}
