package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.ImageFormat;
import android.media.MediaPlayer;
import android.text.TextUtils;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hf */
/* loaded from: classes2.dex */
public final class C2837hf extends C2829gy<MediaPlayer.OnPreparedListener> implements MediaPlayer.OnPreparedListener {

    /* renamed from: ﻛ */
    private static long f6580 = 6693895711888939753L;

    /* renamed from: ｋ */
    private static int f6581 = 0;

    /* renamed from: ﾇ */
    private static int f6582 = 1;

    /* renamed from: ﻐ */
    private c f6583;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.hf$c */
    public interface c {
        /* renamed from: ﾒ */
        void mo6448(C2837hf c2837hf, MediaPlayer mediaPlayer);
    }

    public C2837hf(MediaPlayer.OnPreparedListener onPreparedListener, c cVar) {
        super(onPreparedListener);
        this.f6583 = cVar;
    }

    /* renamed from: ﾇ */
    private static String m6859(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2804g.f6422) {
            try {
                C2804g.f6423 = i;
                char[] cArr2 = new char[cArr.length];
                C2804g.f6421 = 0;
                while (true) {
                    int i2 = C2804g.f6421;
                    if (i2 < cArr.length) {
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6580);
                        C2804g.f6421++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        f6582 = (f6581 + 59) % 128;
        try {
            this.f6583.mo6448(this, mediaPlayer);
        } catch (Throwable th) {
            C2914kb.m7426(m6859("骦鸺鏃钬衸质蛦뮰뽤뀨뗇꺟ꉆ꜄\u46994템쨖쿧삋쑎龜\uf2a5\uf673\ueb25\uecf3\ue1a9", ImageFormat.getBitsPerPixel(0) + 1214).intern(), m6859("骬庨ዽ혟詗丶β쟢뭑罏㍃\uf4baꣁ気⁐\ue460\ud9bc鷤儚ᕒ줵芩䛥㨬\ufe53뉷瞷⯩\uef0fꍋ杷", 50227 - TextUtils.getTrimmedLength("")).intern(), th, false);
        }
        if (mo5387() != null) {
            mo5387().onPrepared(mediaPlayer);
            f6582 = (f6581 + 21) % 128;
        }
    }
}
