package com.ironsource.adqualitysdk.sdk.p009i;

import android.media.MediaPlayer;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.he */
/* loaded from: classes2.dex */
public final class C2836he extends C2829gy<MediaPlayer.OnCompletionListener> implements MediaPlayer.OnCompletionListener {

    /* renamed from: ﻐ */
    private static int f6576 = 1;

    /* renamed from: ﻛ */
    private static char[] f6577 = {':', 'j', 'i', 'p', 'i', 'd', 'T', '[', 'k', 'i', 'i', 'l', 's', 'n', 'Z', ']', 'n', 'l', 'n', 'l', 'h', 'n', 'n', 'n', 'Y', 'X', '^', '`', 'p', '\"', '[', 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'F', '`', '[', 'W', 'Z', 'n', 's', 'l', 'i', 'i', 'k', 'I', 'G', 'n', 'X', 'Y', 'n', 'n', 'n', 'h', 'l', 'n', 'l', 'n'};

    /* renamed from: ﾒ */
    private static int f6578;

    /* renamed from: ｋ */
    private a f6579;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.he$a */
    public interface a {
        /* renamed from: ﻛ */
        void mo6453(C2836he c2836he, MediaPlayer mediaPlayer);
    }

    public C2836he(MediaPlayer.OnCompletionListener onCompletionListener, a aVar) {
        super(onCompletionListener);
        this.f6579 = aVar;
    }

    /* renamed from: ｋ */
    private static String m6858(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f6577, i, cArr, 0, i2);
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

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        try {
            this.f6579.mo6453(this, mediaPlayer);
            f6576 = (f6578 + 125) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6858(true, new int[]{0, 29, 0, 27}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001").intern(), m6858(false, new int[]{29, 33, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001").intern(), th, false);
        }
        if (mo5387() != null) {
            f6576 = (f6578 + 37) % 128;
            mo5387().onCompletion(mediaPlayer);
            f6576 = (f6578 + 33) % 128;
        }
    }
}
