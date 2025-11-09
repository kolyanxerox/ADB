package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.qq.e.comm.managers.GDTAdSdk;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gx */
/* loaded from: classes2.dex */
public final class C2828gx extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static int f6536 = 1;

    /* renamed from: ｋ */
    private static long f6537 = 5719860758020762456L;

    /* renamed from: ﾒ */
    private static int f6538;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        int i = f6536 + 49;
        f6538 = i % 128;
        return m6848("⬻Ǻ纯ꬑ耝ﴨ⮸¦紞ꨎ蜵ﷺ⪩ܟ簃ꤺ蟦ﲤ⥕؊献ꧺ蛨\uf374⠤ԉ珋ꢣ蕧\uf205⼵", i % 2 != 0 ? TextUtils.lastIndexOf("", '8') + 11395 : 10956 - TextUtils.lastIndexOf("", '0')).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6536 = (f6538 + 117) % 128;
        String strIntern = m6848("⬬洮꜐車㍱畩轞", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17938).intern();
        f6538 = (f6536 + 7) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6538 + 41;
        f6536 = i % 128;
        if (i % 2 != 0) {
            return GDTAdSdk.class;
        }
        int i2 = 37 / 0;
        return GDTAdSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2703cg c2703cg = new C2703cg(mo6813());
        int i = f6536 + 89;
        f6538 = i % 128;
        if (i % 2 == 0) {
            return c2703cg;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m6848(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6537);
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
