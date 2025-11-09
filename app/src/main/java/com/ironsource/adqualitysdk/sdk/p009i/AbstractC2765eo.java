package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.internal.ads.AbstractC2183w4;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.eo */
/* loaded from: classes2.dex */
public abstract class AbstractC2765eo extends AbstractC2761ek {

    /* renamed from: ｋ */
    private static long f6283 = -3355755856841908672L;

    public AbstractC2765eo(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    /* renamed from: ｋ */
    private static String m6780(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6283);
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2761ek
    /* renamed from: ﻛ */
    public final boolean mo6774(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m6780("布뼄鱤﵁\udabb㮍ᢾ瘠圇둠镂\uf2b6펎ツ\u0e66", 57637 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
        sb.append(obj);
        sb.append(m6780("幠મ\uf730ꎉ\u0c5c", 21646 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
        sb.append(obj2);
        throw new RuntimeException(sb.toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2761ek
    /* renamed from: ﾇ */
    public final boolean mo6775(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m6780("布뼄鱤﵁\udabb㮍ᢾ瘠圇둠镂\uf2b6펎ツ\u0e66", 57636 - TextUtils.lastIndexOf("", '0')).intern());
        sb.append(str);
        throw new RuntimeException(AbstractC2183w4.OooOO0o(sb, m6780("幠મ\uf730ꎉ\u0c5c", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21646), str2));
    }
}
