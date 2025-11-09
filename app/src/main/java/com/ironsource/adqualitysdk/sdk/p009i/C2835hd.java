package com.ironsource.adqualitysdk.sdk.p009i;

import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hd */
/* loaded from: classes2.dex */
public final class C2835hd extends C2829gy<MediaPlayer.OnInfoListener> implements MediaPlayer.OnInfoListener {

    /* renamed from: ﻛ */
    private static int[] f6572 = {1260408040, 1699075126, 1632814538, 2069126387, -544002379, -755987528, -1610226379, -1252824617, 1498879879, 1126469655, 1688257541, 739692328, 167538209, -764167520, -634473638, -495941216, -1708373931, 1000449791};

    /* renamed from: ｋ */
    private static int f6573 = 0;

    /* renamed from: ﾇ */
    private static int f6574 = 1;

    /* renamed from: ﾒ */
    private e f6575;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.hd$e */
    public interface e {
        /* renamed from: ﻛ */
        boolean mo6450(C2835hd c2835hd, MediaPlayer mediaPlayer, int i, int i2);
    }

    public C2835hd(MediaPlayer.OnInfoListener onInfoListener, e eVar) {
        super(onInfoListener);
        this.f6575 = eVar;
    }

    /* renamed from: ﻐ */
    private static String m6857(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6572.clone();
                C2723d.f5951 = 0;
                while (true) {
                    int i2 = C2723d.f5951;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        char c3 = (char) (iArr[i2 + 1] >> 16);
                        cArr[2] = c3;
                        char c4 = (char) iArr[i2 + 1];
                        cArr[3] = c4;
                        C2723d.f5954 = (c << 16) + c2;
                        C2723d.f5952 = (c3 << 16) + c4;
                        C2723d.m6462(iArr2);
                        for (int i4 = 0; i4 < 16; i4++) {
                            int i5 = C2723d.f5954 ^ iArr2[i4];
                            C2723d.f5954 = i5;
                            int iM6461 = C2723d.m6461(i5) ^ C2723d.f5952;
                            int i6 = C2723d.f5954;
                            C2723d.f5954 = iM6461;
                            C2723d.f5952 = i6;
                        }
                        int i7 = C2723d.f5954;
                        int i8 = C2723d.f5952;
                        C2723d.f5954 = i8;
                        C2723d.f5952 = i7;
                        int i9 = i7 ^ iArr2[16];
                        C2723d.f5952 = i9;
                        int i10 = i8 ^ iArr2[17];
                        C2723d.f5954 = i10;
                        cArr[0] = (char) (i10 >>> 16);
                        cArr[1] = (char) i10;
                        cArr[2] = (char) (i9 >>> 16);
                        cArr[3] = (char) i9;
                        C2723d.m6462(iArr2);
                        int i11 = C2723d.f5951;
                        cArr2[i11 << 1] = cArr[0];
                        cArr2[(i11 << 1) + 1] = cArr[1];
                        cArr2[(i11 << 1) + 2] = cArr[2];
                        cArr2[(i11 << 1) + 3] = cArr[3];
                        C2723d.f5951 = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            this.f6575.mo6450(this, mediaPlayer, i, i2);
            f6574 = (f6573 + 79) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6857(new int[]{80066108, 207298318, -1549697645, 1463085415, 1600108361, 1088065656, -859895970, -1615364345, 381713224, -1800873089, 1548957156, -1093168547}, 23 - TextUtils.indexOf("", "", 0)).intern(), m6857(new int[]{-681051340, 1754331367, -448412854, -337925248, 1062563970, 1504136524, 1569156958, -594432613, 1990793783, 2125621103, 134399651, 2066719541, -550159074, 727555531}, 28 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), th, false);
        }
        if (mo5387() == null) {
            return false;
        }
        int i3 = f6573 + 63;
        f6574 = i3 % 128;
        if (i3 % 2 != 0) {
            return mo5387().onInfo(mediaPlayer, i, i2);
        }
        boolean zOnInfo = mo5387().onInfo(mediaPlayer, i, i2);
        int i4 = 75 / 0;
        return zOnInfo;
    }
}
