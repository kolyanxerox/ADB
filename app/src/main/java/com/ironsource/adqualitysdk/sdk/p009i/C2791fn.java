package com.ironsource.adqualitysdk.sdk.p009i;

import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fn */
/* loaded from: classes2.dex */
public final class C2791fn extends AbstractC2755ee {

    /* renamed from: ﻐ */
    private static int f6358 = 0;

    /* renamed from: ﻛ */
    private static int f6359 = 1;

    /* renamed from: ｋ */
    private static long f6360;

    /* renamed from: ﾇ */
    private static C2791fn f6361;

    static {
        m6800();
        f6361 = new C2791fn();
        f6358 = (f6359 + InterfaceC3173h3.d.b.f8823f) % 128;
    }

    public C2791fn() {
        super(C2736dm.m6623("", -1));
    }

    /* renamed from: ﻐ */
    public static void m6800() {
        f6360 = 2426085221878215170L;
    }

    /* renamed from: ﻛ */
    public static synchronized C2791fn m6801() {
        int i = f6358;
        C2791fn c2791fn = f6361;
        int i2 = i + 43;
        f6359 = i2 % 128;
        if (i2 % 2 != 0) {
            return c2791fn;
        }
        int i3 = 10 / 0;
        return c2791fn;
    }

    /* renamed from: ﾒ */
    private static String m6802(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6360);
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

    public final String toString() {
        f6358 = (f6359 + 37) % 128;
        String strIntern = m6802("㉬\ud83a\ue6f4貉", ExpandableListView.getPackedPositionGroup(0L) + 59981).intern();
        int i = f6359 + 5;
        f6358 = i % 128;
        if (i % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        C2744du c2744du = new C2744du(null);
        f6358 = (f6359 + 41) % 128;
        return c2744du;
    }
}
