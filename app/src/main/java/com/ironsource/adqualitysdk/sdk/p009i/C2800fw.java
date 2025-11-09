package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.PointF;
import android.text.AndroidCharacter;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fw */
/* loaded from: classes2.dex */
public final class C2800fw extends AbstractC2813gi {

    /* renamed from: ﻛ */
    private static int f6406 = 0;

    /* renamed from: ｋ */
    private static int f6407 = 1;

    /* renamed from: ﾒ */
    private static long f6408 = 157260195039371603L;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        f6406 = (f6407 + 89) % 128;
        String strIntern = m6811("愰겯礼ৄ坶拾끎︸ම嬗暘둰쏔ᅁ彷檯렇쟡ᕰ⃛湃밵쮅\u191fⓨ牬臖쿼ᴴ⢐瘂薰퍺ỒⲺ稤覬휃\ue2f4い翈趽\udb0c\ue686㑆䏱酘\udcc2\ueaaa㠄䞜", 52627 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
        f6407 = (f6406 + 119) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6407 = (f6406 + 121) % 128;
        String strIntern = m6811("愲ᇰ肬㍵ꈧ勑얋瑇\ue70f韍۱릨⡤\udb3c䯇", 28919 - AndroidCharacter.getMirror('0')).intern();
        f6406 = (f6407 + 59) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6407 + 41;
        f6406 = i % 128;
        if (i % 2 == 0) {
            return IronSourceAdQuality.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2677bh c2677bh = new C2677bh(mo6813());
        int i = f6406 + 53;
        f6407 = i % 128;
        if (i % 2 == 0) {
            int i2 = 95 / 0;
        }
        return c2677bh;
    }

    /* renamed from: ｋ */
    private static String m6811(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6408);
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
}
