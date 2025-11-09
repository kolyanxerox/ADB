package com.ironsource.adqualitysdk.sdk.p009i;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.s */
/* loaded from: classes2.dex */
public final class C2926s {

    /* renamed from: ﱡ */
    private static int f7335 = 1;

    /* renamed from: ﺙ */
    private static boolean f7336;

    /* renamed from: ﻏ */
    private static int f7337;

    /* renamed from: ﻐ */
    private static boolean f7338;

    /* renamed from: ﻛ */
    private static final Handler f7339;

    /* renamed from: ｋ */
    private static final Handler f7340;

    /* renamed from: ﾇ */
    private static char[] f7341;

    /* renamed from: ﾒ */
    private static int f7342;

    static {
        m7593();
        f7340 = new Handler(Looper.getMainLooper());
        f7339 = m7597();
        int i = f7335 + 43;
        f7337 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    public static void m7592(AbstractRunnableC2878it abstractRunnableC2878it, long j) {
        int i = f7335 + 119;
        f7337 = i % 128;
        try {
            if (i % 2 == 0) {
                m7595().postDelayed(abstractRunnableC2878it, j);
            } else {
                m7595().postDelayed(abstractRunnableC2878it, j);
                int i2 = 6 / 0;
            }
        } catch (Error unused) {
            C2921n.m7503(m7599(null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m7599(null, 127 - (ViewConfiguration.getTouchSlop() >> 8), null, "\u0082\u0085\u008e\u0096\u0095\u0088\u008f\u0093\u0087\u0085\u0094\u008f\u0093\u0090\u008f\u0082\u008e\u0089\u0085\u0086\u008e\u0082\u008f\u0088\u0092\u0090\u0091\u008f\u0090\u0088\u008f\u0082\u008e\u0086\u0087\u0085\u008d").intern(), false);
        }
    }

    /* renamed from: ﻛ */
    public static void m7593() {
        f7338 = true;
        f7336 = true;
        f7342 = 299;
        f7341 = new char[]{364, 399, 380, 416, 396, 407, 404, 415, 420, 382, 367, 374, 369, 400, 331, 410, 411, 414, 409, 408, 403, 413, 402, 397, 398, 406, 383, 365, 370, 343, 345};
    }

    /* renamed from: ｋ */
    public static Handler m7595() {
        Handler handler;
        int i = f7335;
        int i2 = i + 61;
        f7337 = i2 % 128;
        if (i2 % 2 != 0) {
            handler = f7340;
            int i3 = 71 / 0;
        } else {
            handler = f7340;
        }
        f7337 = (i + 35) % 128;
        return handler;
    }

    /* renamed from: ﾇ */
    public static void m7598(AbstractRunnableC2878it abstractRunnableC2878it) {
        f7337 = (f7335 + 99) % 128;
        try {
            m7595().post(abstractRunnableC2878it);
            int i = f7337 + 17;
            f7335 = i % 128;
            if (i % 2 == 0) {
                int i2 = 56 / 0;
            }
        } catch (Error unused) {
            C2921n.m7503(m7599(null, TextUtils.getOffsetAfter("", 0) + 127, null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m7599(null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, "\u0082\u0085\u008e\u0096\u0095\u0088\u008f\u0093\u0087\u0085\u0094\u008f\u0093\u0090\u008f\u0088\u0092\u0090\u0091\u008f\u0090\u0088\u008f\u0082\u008e\u0086\u0087\u0085\u008d").intern(), false);
        }
    }

    /* renamed from: ﾒ */
    public static void m7600(AbstractRunnableC2878it abstractRunnableC2878it) {
        int i = f7337 + 77;
        f7335 = i % 128;
        try {
            if (i % 2 != 0) {
                m7590().post(abstractRunnableC2878it);
            } else {
                m7590().post(abstractRunnableC2878it);
                int i2 = 93 / 0;
            }
        } catch (Error unused) {
            C2921n.m7503(m7599(null, ExpandableListView.getPackedPositionGroup(0L) + 127, null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m7599(null, 126 - TextUtils.lastIndexOf("", '0', 0), null, "\u0096\u008e\u0086\u0082\u0093\u0085\u0095\u008f\u0082\u0093\u0084\u0090\u0096\u0097\u009a\u0099\u0085\u0098\u008f\u0097\u0093\u0087\u0088\u0088\u008e\u0097\u008f\u0090\u0088\u008f\u0082\u008e\u0086\u0087\u0085\u008d").intern(), false);
        }
    }

    /* renamed from: ﻛ */
    public static void m7594(AbstractRunnableC2878it abstractRunnableC2878it, long j) {
        int i = f7337 + 9;
        f7335 = i % 128;
        try {
            if (i % 2 == 0) {
                m7590().postDelayed(abstractRunnableC2878it, j);
                throw null;
            }
            m7590().postDelayed(abstractRunnableC2878it, j);
            f7335 = (f7337 + 1) % 128;
        } catch (Error unused) {
            C2921n.m7503(m7599(null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m7599(null, (ViewConfiguration.getScrollBarSize() >> 8) + 127, null, "\u0096\u008e\u0086\u0082\u0093\u0085\u0095\u008f\u0082\u0093\u0084\u0090\u0096\u0097\u009a\u0099\u0085\u0098\u008f\u0097\u0093\u0087\u0088\u0088\u008e\u0097\u008f\u0090\u0088\u008f\u0082\u008e\u0086\u0087\u0085\u008d").intern(), false);
        }
    }

    /* renamed from: ｋ */
    public static void m7596(AbstractRunnableC2878it abstractRunnableC2878it) {
        int i = f7335 + 19;
        f7337 = i % 128;
        if (i % 2 != 0) {
            m7601();
            throw null;
        }
        if (m7601()) {
            abstractRunnableC2878it.run();
            return;
        }
        m7598(abstractRunnableC2878it);
        int i2 = f7337 + 45;
        f7335 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    private static Handler m7597() {
        try {
            HandlerThread handlerThread = new HandlerThread(m7599(null, 127 - ExpandableListView.getPackedPositionGroup(0L), null, "\u0082\u0085\u008e\u0096\u0095\u009b\u009d\u009c\u009c\u009b").intern());
            for (int i = 0; i < 3; i++) {
                try {
                    handlerThread.start();
                    Handler handler = new Handler(handlerThread.getLooper());
                    int i2 = f7335 + 11;
                    f7337 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 2 / 0;
                    }
                    return handler;
                } catch (Error unused) {
                    C2921n.m7503(m7599(null, (ViewConfiguration.getTouchSlop() >> 8) + 127, null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m7599(null, TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, "\u009f\u009f\u009f\u0097\u0093\u0087\u0089\u0096\u0088\u008e\u0096\u008f\u009e\u0096\u008e\u0086\u0082\u0093\u0085\u0095\u008f\u0082\u0093\u0084\u0090\u0096\u0097\u009a\u0099\u0085\u0098\u008f\u008e\u0088\u0085\u008e\u0096\u0099\u008f\u0090\u0088\u008f\u0082\u008e\u0086\u0087\u0085\u008d").intern(), true);
                }
            }
            f7335 = (f7337 + 49) % 128;
        } catch (Error unused2) {
            C2921n.m7503(m7599(null, AndroidCharacter.getMirror('0') + 'O', null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m7599(null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, "\u0096\u008e\u0086\u0082\u0093\u0085\u0095\u008f\u0082\u0093\u0084\u0090\u0096\u0097\u009a\u0099\u0085\u0098\u008f\u008e\u0088\u0085\u008e\u0096\u0099\u008f\u0090\u0088\u008f\u0082\u008e\u0086\u0087\u0085\u008d").intern(), true);
        }
        int i4 = f7335 + 53;
        f7337 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public static void m7591(AbstractRunnableC2878it abstractRunnableC2878it) {
        f7337 = (f7335 + 107) % 128;
        if (!m7601()) {
            abstractRunnableC2878it.run();
            return;
        }
        f7337 = (f7335 + 53) % 128;
        m7600(abstractRunnableC2878it);
        f7337 = (f7335 + 15) % 128;
    }

    /* renamed from: ﾒ */
    public static boolean m7601() {
        f7337 = (f7335 + 49) % 128;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return false;
        }
        f7335 = (f7337 + 47) % 128;
        return true;
    }

    /* renamed from: ﾒ */
    private static String m7599(int[] iArr, int i, String str, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f7341;
                int i2 = f7342;
                if (f7336) {
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
                if (f7338) {
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

    /* renamed from: ﻐ */
    public static Handler m7590() {
        int i = f7337 + 31;
        f7335 = i % 128;
        if (i % 2 != 0) {
            return f7339;
        }
        int i2 = 70 / 0;
        return f7339;
    }
}
