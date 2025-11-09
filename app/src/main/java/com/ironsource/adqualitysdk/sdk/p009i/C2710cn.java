package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.Context;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cn */
/* loaded from: classes2.dex */
public final class C2710cn {

    /* renamed from: ﭖ */
    private static char f5673 = 12561;

    /* renamed from: ﭴ */
    private static int f5674 = 0;

    /* renamed from: ﮉ */
    private static int f5675 = 1;

    /* renamed from: ﮐ */
    private static char f5676 = 30183;

    /* renamed from: ﱟ */
    private static char f5677 = 57924;

    /* renamed from: ﺙ */
    private static char f5678 = 280;

    /* renamed from: ﱡ */
    private C2735dl f5679;

    /* renamed from: ﻏ */
    private List<C2712cp> f5680 = new ArrayList();

    /* renamed from: ﻐ */
    private C2728de f5681;

    /* renamed from: ﻛ */
    private AbstractC2676bg f5682;

    /* renamed from: ｋ */
    private C2733dj f5683;

    /* renamed from: ﾇ */
    private Context f5684;

    /* renamed from: ﾒ */
    private C2668az f5685;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cn$5 */
    public class AnonymousClass5 extends AbstractRunnableC2878it {
        public AnonymousClass5() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            C2710cn.m6216(C2710cn.this).clear();
        }
    }

    public C2710cn(Context context, C2733dj c2733dj, C2668az c2668az, C2728de c2728de, AbstractC2676bg abstractC2676bg) {
        this.f5683 = c2733dj;
        this.f5685 = c2668az;
        this.f5681 = c2728de;
        this.f5682 = abstractC2676bg;
        this.f5684 = context.getApplicationContext();
    }

    /* renamed from: ﭖ */
    private synchronized List<C2712cp> m6209() {
        f5674 = (f5675 + 99) % 128;
        if (this.f5680 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.f5680);
        f5674 = (f5675 + 35) % 128;
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x001a A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #1 {all -> 0x0016, blocks: (B:25:0x0001, B:36:0x001a, B:32:0x0015, B:28:0x000f), top: B:43:0x0001, inners: #0 }] */
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void m6211(com.ironsource.adqualitysdk.sdk.p009i.C2735dl r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2710cn.f5674     // Catch: java.lang.Throwable -> L16
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2710cn.f5675 = r1     // Catch: java.lang.Throwable -> L16
            int r0 = r0 % 2
            if (r0 != 0) goto L18
            r0 = 49
            int r0 = r0 / 0
            if (r3 == 0) goto L22
            goto L1a
        L14:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L16
        L16:
            r3 = move-exception
            goto L24
        L18:
            if (r3 == 0) goto L22
        L1a:
            int r1 = r1 + 93
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2710cn.f5674 = r1     // Catch: java.lang.Throwable -> L16
            r2.f5679 = r3     // Catch: java.lang.Throwable -> L16
        L22:
            monitor-exit(r2)
            return
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2710cn.m6211(com.ironsource.adqualitysdk.sdk.i.dl):void");
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ List m6216(C2710cn c2710cn) {
        int i = f5674 + 23;
        int i2 = i % 128;
        f5675 = i2;
        int i3 = i % 2;
        List<C2712cp> list = c2710cn.f5680;
        if (i3 == 0) {
            throw null;
        }
        f5674 = (i2 + 25) % 128;
        return list;
    }

    /* renamed from: ﭴ */
    public final Context m6217() {
        int i = (f5674 + 49) % 128;
        f5675 = i;
        Context context = this.f5684;
        f5674 = (i + 31) % 128;
        return context;
    }

    /* renamed from: ﭸ */
    public final synchronized C2735dl m6218() {
        C2735dl c2735dl;
        int i = f5674;
        c2735dl = this.f5679;
        int i2 = i + 23;
        f5675 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        return c2735dl;
    }

    /* renamed from: ﮉ */
    public final synchronized boolean m6219() {
        boolean zMo5450;
        f5675 = (f5674 + 9) % 128;
        zMo5450 = this.f5682.mo5450();
        f5674 = (f5675 + 89) % 128;
        return zMo5450;
    }

    /* renamed from: ﮌ */
    public final C2668az m6220() {
        int i = f5674 + 49;
        int i2 = i % 128;
        f5675 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        C2668az c2668az = this.f5685;
        int i3 = i2 + 121;
        f5674 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        return c2668az;
    }

    /* renamed from: ﮐ */
    public final String m6221() {
        int i = f5674 + 43;
        f5675 = i % 128;
        if (i % 2 != 0) {
            return this.f5682.m5461();
        }
        this.f5682.m5461();
        throw null;
    }

    /* renamed from: ﱟ */
    public final String m6222() {
        int i = f5675 + 91;
        f5674 = i % 128;
        if (i % 2 == 0) {
            return this.f5683.m6594();
        }
        this.f5683.m6594();
        throw null;
    }

    /* renamed from: ﱡ */
    public final String m6223() {
        int i = f5674 + 95;
        f5675 = i % 128;
        if (i % 2 != 0) {
            return this.f5683.m6598();
        }
        this.f5683.m6598();
        throw null;
    }

    /* renamed from: ﺙ */
    public final String m6224() {
        int i = f5674 + 79;
        f5675 = i % 128;
        if (i % 2 == 0) {
            this.f5682.mo5467();
            throw null;
        }
        String strMo5467 = this.f5682.mo5467();
        int i2 = f5674 + 7;
        f5675 = i2 % 128;
        if (i2 % 2 != 0) {
            return strMo5467;
        }
        throw null;
    }

    /* renamed from: ﻏ */
    public final String m6225() {
        String strM6221 = m6221();
        if (TextUtils.isEmpty(strM6221)) {
            return null;
        }
        f5675 = (f5674 + 61) % 128;
        if (m6212("Ⴎ胓誶垓䴑씱陘奆", '7' - AndroidCharacter.getMirror('0')).intern().equals(strM6221)) {
            return null;
        }
        int i = f5674 + InterfaceC3173h3.d.b.f8819b;
        f5675 = i % 128;
        if (i % 2 == 0) {
            if (m6212("ᦹ磏\udea9⯛궺눯籓̡", 107 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern().equals(strM6221)) {
                return null;
            }
        } else if (m6212("ᦹ磏\udea9⯛궺눯籓̡", 9 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern().equals(strM6221)) {
            return null;
        }
        return this.f5683.m6597(m6221());
    }

    /* renamed from: ﻛ */
    public final String m6227() {
        String strM6595;
        int i = f5674 + InterfaceC3173h3.d.b.f8819b;
        f5675 = i % 128;
        if (i % 2 == 0) {
            strM6595 = this.f5683.m6595();
            int i2 = 57 / 0;
        } else {
            strM6595 = this.f5683.m6595();
        }
        int i3 = f5675 + 67;
        f5674 = i3 % 128;
        if (i3 % 2 == 0) {
            return strM6595;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public final void m6229() {
        int i = f5675 + 109;
        f5674 = i % 128;
        if (i % 2 != 0) {
            this.f5680.iterator();
            throw null;
        }
        Iterator<C2712cp> it = this.f5680.iterator();
        f5674 = (f5675 + 31) % 128;
        while (it.hasNext()) {
            it.next().m6286();
        }
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.cn.5
            public AnonymousClass5() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2710cn.m6216(C2710cn.this).clear();
            }
        });
    }

    /* renamed from: ﾇ */
    public final void m6230() {
        int i = f5675 + 93;
        f5674 = i % 128;
        if (i % 2 != 0) {
            this.f5683.m6592();
            throw null;
        }
        C2735dl c2735dlM6592 = this.f5683.m6592();
        if (c2735dlM6592 != null) {
            m6214(c2735dlM6592);
            if (this.f5682.mo5451()) {
                C2901jp.m7308(c2735dlM6592);
            }
        }
        this.f5683.m6593().m6655(m6212("⬖╾貮࠲쭚䧷饊ꊡ㝟\uee38⡦혆", 13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), this.f5682);
        Iterator<String> it = this.f5683.m6591().keySet().iterator();
        f5674 = (f5675 + 93) % 128;
        while (it.hasNext()) {
            int i2 = f5675 + 121;
            f5674 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f5683.m6591().get(it.next()).m6646();
                throw null;
            }
            C2739dp c2739dp = this.f5683.m6591().get(it.next());
            if (!c2739dp.m6646()) {
                m6210(new C2712cp(this, this.f5681, this.f5682, m6215(c2739dp), this.f5683.m6593()));
            }
        }
        m6213(this.f5683, this.f5682);
    }

    /* renamed from: ﾒ */
    private C2850hs m6215(C2739dp c2739dp) {
        int i = (f5674 + 95) % 128;
        f5675 = i;
        if (c2739dp != null) {
            return new C2850hs(c2739dp, m6215(this.f5683.m6591().get(c2739dp.m6643())));
        }
        int i2 = i + 83;
        f5674 = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public final void m6228(String str, List<Object> list) {
        int i = f5675 + 97;
        f5674 = i % 128;
        if (i % 2 != 0) {
            m6209().iterator();
            throw null;
        }
        Iterator<C2712cp> it = m6209().iterator();
        f5675 = (f5674 + 3) % 128;
        while (it.hasNext()) {
            int i2 = f5675 + 23;
            f5674 = i2 % 128;
            if (i2 % 2 != 0) {
                it.next().m6295(str, list);
                throw null;
            }
            it.next().m6295(str, list);
            f5675 = (f5674 + 95) % 128;
        }
    }

    /* renamed from: ﻐ */
    public final String m6226() {
        int i = f5674 + 63;
        f5675 = i % 128;
        if (i % 2 == 0) {
            this.f5683.m6596();
            throw null;
        }
        String strM6596 = this.f5683.m6596();
        int i2 = f5675 + InterfaceC3173h3.d.b.f8826i;
        f5674 = i2 % 128;
        if (i2 % 2 == 0) {
            return strM6596;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private void m6210(C2712cp c2712cp) {
        f5674 = (f5675 + 39) % 128;
        this.f5680.add(c2712cp);
        int i = f5674 + 93;
        f5675 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    public final String m6231() {
        f5674 = (f5675 + 11) % 128;
        String strM6599 = this.f5683.m6599();
        f5675 = (f5674 + 123) % 128;
        return strM6599;
    }

    /* renamed from: ｋ */
    private void m6214(C2735dl c2735dl) {
        f5675 = (f5674 + 59) % 128;
        m6211(c2735dl);
        f5674 = (f5675 + 45) % 128;
    }

    /* renamed from: ｋ */
    private synchronized void m6213(C2733dj c2733dj, AbstractC2676bg abstractC2676bg) {
        try {
            int i = f5675 + 89;
            f5674 = i % 128;
            if (i % 2 == 0) {
                if (abstractC2676bg.mo5450()) {
                    Iterator<C2712cp> it = m6209().iterator();
                    while (it.hasNext()) {
                        int i2 = f5675 + 51;
                        f5674 = i2 % 128;
                        if (i2 % 2 != 0) {
                            C2712cp next = it.next();
                            c2733dj.m6593().m6659().m6655(next.m6300().m6930(), next);
                            int i3 = 79 / 0;
                        } else {
                            C2712cp next2 = it.next();
                            c2733dj.m6593().m6659().m6655(next2.m6300().m6930(), next2);
                        }
                        f5675 = (f5674 + 15) % 128;
                    }
                }
            } else {
                abstractC2676bg.mo5450();
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    /* renamed from: ﻛ */
    private static String m6212(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2920m.f7237) {
            try {
                char[] cArr2 = new char[cArr.length];
                C2920m.f7236 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i2 = C2920m.f7236;
                    if (i2 < cArr.length) {
                        cArr3[0] = cArr[i2];
                        cArr3[1] = cArr[i2 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr3[1];
                            char c2 = cArr3[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f5677)) ^ ((c2 >>> 5) + f5673)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f5676) ^ ((c3 + i3) ^ ((c3 << 4) + f5678))));
                            i3 -= 40503;
                        }
                        int i5 = C2920m.f7236;
                        cArr2[i5] = cArr3[0];
                        cArr2[i5 + 1] = cArr3[1];
                        C2920m.f7236 = i5 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
