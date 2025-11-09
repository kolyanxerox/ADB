package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hk */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC2842hk extends C2829gy<View.OnTouchListener> implements View.OnTouchListener {

    /* renamed from: ﻛ */
    private static int f6608 = 0;

    /* renamed from: ﾇ */
    private static int f6609 = 1;

    /* renamed from: ﾒ */
    private static char[] f6610 = {'w', 254, 257, 257, 274, 268, 261, 250, 250, 270, 275, 268, 265, 265, 267, 251, 244, 260, 265, 272, 265, 266, 273, 272, 'I', 'l', 'k', 133, 128, '|', 127, 147, 152, 145, 142, 142, 144, 'n', 'l', 147, 134, 134, 151, 145, 138, '{', 128, 151, 149, 149, 'n', 'i'};

    /* renamed from: ｋ */
    private d f6611;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.hk$d */
    public interface d {
        /* renamed from: ﾒ */
        boolean mo6451(ViewOnTouchListenerC2842hk viewOnTouchListenerC2842hk, View view, MotionEvent motionEvent);
    }

    public ViewOnTouchListenerC2842hk(View.OnTouchListener onTouchListener, d dVar) {
        super(onTouchListener);
        this.f6611 = dVar;
    }

    /* renamed from: ｋ */
    private static String m6871(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f6610, i, cArr, 0, i2);
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

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = f6608 + 29;
        f6609 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6871(false, new int[]{0, 24, 160, 0}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001").intern(), m6871(false, new int[]{24, 28, 37, 21}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern(), th, false);
        }
        if (i % 2 == 0) {
            this.f6611.mo6451(this, view, motionEvent);
            throw null;
        }
        this.f6611.mo6451(this, view, motionEvent);
        if (mo5387() != null) {
            return mo5387().onTouch(view, motionEvent);
        }
        f6608 = (f6609 + 13) % 128;
        return false;
    }
}
