package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hj */
/* loaded from: classes2.dex */
public final class C2841hj extends C2829gy<MediaPlayer.OnSeekCompleteListener> implements MediaPlayer.OnSeekCompleteListener {

    /* renamed from: ﻛ */
    private static int f6604 = 0;

    /* renamed from: ﾇ */
    private static int f6605 = 18;

    /* renamed from: ﾒ */
    private static int f6606 = 1;

    /* renamed from: ﻐ */
    private a f6607;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.hj$a */
    public interface a {
        /* renamed from: ﾒ */
        void mo6452(C2841hj c2841hj, MediaPlayer mediaPlayer);
    }

    public C2841hj(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, a aVar) {
        super(onSeekCompleteListener);
        this.f6607 = aVar;
    }

    /* renamed from: ｋ */
    private static String m6870(int i, int i2, int i3, String str, boolean z) {
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
                    cArr2[i5] = (char) (cArr2[i5] - f6605);
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

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        f6606 = (f6604 + 123) % 128;
        try {
            this.f6607.mo6452(this, mediaPlayer);
        } catch (Throwable th) {
            C2914kb.m7426(m6870(10 - (ViewConfiguration.getScrollBarSize() >> 8), 30 - TextUtils.lastIndexOf("", '0'), KeyEvent.keyCodeFromString("") + 120, "\n\u0007\t\uffdd\u0005\uffff\uffff￭\b￩\f\t\u000e\ufffb\f\t�\uffff\uffde\f\uffff\b\uffff\u000e\r\u0003￦\uffff\u000e\uffff\u0006", true).intern(), m6870(AndroidCharacter.getMirror('0') - 26, KeyEvent.keyCodeFromString("") + 35, 115 - Color.alpha(0), "\u000e\uffbf\u0011\u0004\r\u0004\u0013\u0012\b￫\u0001\ufff3\f\uffbf\r\b\uffbf\u0011\u000e\u0011\u0011￤\u0004\u0013\u0004\u000b\u000f\f\u000e￢\n\u0004\u0004\ufff2\r", true).intern(), th, false);
        }
        if (mo5387() != null) {
            f6606 = (f6604 + 11) % 128;
            mo5387().onSeekComplete(mediaPlayer);
        }
        int i = f6604 + 107;
        f6606 = i % 128;
        if (i % 2 == 0) {
            int i2 = 51 / 0;
        }
    }
}
