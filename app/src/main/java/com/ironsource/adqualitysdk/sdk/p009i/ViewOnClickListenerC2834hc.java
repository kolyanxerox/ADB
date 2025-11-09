package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hc */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC2834hc extends C2829gy<View.OnClickListener> implements View.OnClickListener {

    /* renamed from: ﱡ */
    private static int f6566 = 1;

    /* renamed from: ﻐ */
    private static char f6567 = 0;

    /* renamed from: ﻛ */
    private static int f6568 = -1214788315;

    /* renamed from: ﾇ */
    private static long f6569;

    /* renamed from: ﾒ */
    private static int f6570;

    /* renamed from: ｋ */
    private d f6571;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.hc$d */
    public interface d {
        /* renamed from: ﻛ */
        void mo6449(ViewOnClickListenerC2834hc viewOnClickListenerC2834hc, View view);
    }

    public ViewOnClickListenerC2834hc(View.OnClickListener onClickListener, d dVar) {
        super(onClickListener);
        this.f6571 = dVar;
    }

    /* renamed from: ﾇ */
    private static String m6856(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f6569) ^ f6568) ^ f6567);
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = f6566 + InterfaceC3173h3.d.b.f8821d;
        f6570 = i % 128;
        try {
            if (i % 2 != 0) {
                this.f6571.mo6449(this, view);
                int i2 = 15 / 0;
            } else {
                this.f6571.mo6449(this, view);
            }
        } catch (Throwable th) {
            C2914kb.m7426(m6856(ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (TextUtils.lastIndexOf("", '0') + 1), "\uda35\uf35d単酘", "菼璯舺訦类Χ솄鐈澳澂厤체緊\ud9a2㷌挩㨁鲱騕\ue589ル\udbd3貽十", "\u0000\u0000\u0000\u0000").intern(), m6856(TextUtils.getCapsMode("", 0, 0), (char) ((-16748787) - Color.rgb(0, 0, 0)), "횫\uf645൧\ud96f", "휣荑蠕⮳㴯旎レ湻苫ꀤବ음\ue468膉ࠫ㠟憜ꧭ竎㢻쥎ᕾ榦쩄懇卽잚㦎", "\u0000\u0000\u0000\u0000").intern(), th, false);
        }
        if (mo5387() != null) {
            f6570 = (f6566 + 71) % 128;
            mo5387().onClick(view);
            f6570 = (f6566 + 3) % 128;
        }
    }
}
