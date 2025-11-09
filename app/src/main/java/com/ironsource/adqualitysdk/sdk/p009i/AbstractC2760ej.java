package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ej */
/* loaded from: classes2.dex */
public abstract class AbstractC2760ej extends AbstractC2755ee {

    /* renamed from: ﱟ */
    private static int f6267 = 1;

    /* renamed from: ﻐ */
    private static int f6268;

    /* renamed from: ﻛ */
    private static char[] f6269 = {44050, 35978};

    /* renamed from: ｋ */
    private static long f6270 = 2205675406622319337L;

    /* renamed from: ﾇ */
    private AbstractC2755ee f6271;

    /* renamed from: ﾒ */
    private AbstractC2755ee f6272;

    public AbstractC2760ej(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(c2736dm);
        this.f6271 = abstractC2755ee;
        this.f6272 = abstractC2755ee2;
    }

    /* renamed from: ﻛ */
    private static String m6770(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f6269[i2 + i3] ^ (i3 * f6270)) ^ c);
                        C2642a.f4436 = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r1.equals(r7.f6271) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r7.f6271 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r1 = r6.f6272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.f6268 + 15;
        com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.f6267 = r0 % 128;
        r0 = r0 % 2;
        r7 = r7.f6272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r0 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        return r1.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        r1.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r7.f6272 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.f6267 + 99;
        com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.f6268 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if ((r7 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.f6268
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.f6267 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L7a
            r0 = 1
            if (r6 != r7) goto L11
            return r0
        L11:
            r3 = 0
            if (r7 == 0) goto L79
            int r1 = r1 + 53
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.f6268 = r1
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r4 = r7.getClass()
            if (r1 == r4) goto L25
            goto L79
        L25:
            com.ironsource.adqualitysdk.sdk.i.ej r7 = (com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej) r7
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r6.f6271
            if (r1 == 0) goto L46
            int r4 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.f6267
            int r4 = r4 + 7
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.f6268 = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L40
            com.ironsource.adqualitysdk.sdk.i.ee r4 = r7.f6271
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L4b
            goto L4a
        L40:
            com.ironsource.adqualitysdk.sdk.i.ee r7 = r7.f6271
            r1.equals(r7)
            throw r2
        L46:
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r7.f6271
            if (r1 == 0) goto L4b
        L4a:
            return r3
        L4b:
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r6.f6272
            if (r1 == 0) goto L66
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.f6268
            int r0 = r0 + 15
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.f6267 = r3
            int r0 = r0 % 2
            com.ironsource.adqualitysdk.sdk.i.ee r7 = r7.f6272
            if (r0 == 0) goto L62
            boolean r7 = r1.equals(r7)
            return r7
        L62:
            r1.equals(r7)
            throw r2
        L66:
            com.ironsource.adqualitysdk.sdk.i.ee r7 = r7.f6272
            if (r7 != 0) goto L6b
            return r0
        L6b:
            int r7 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.f6267
            int r7 = r7 + 99
            int r0 = r7 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.f6268 = r0
            int r7 = r7 % 2
            if (r7 != 0) goto L78
            return r3
        L78:
            throw r2
        L79:
            return r3
        L7a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        f6267 = (f6268 + 53) % 128;
        AbstractC2755ee abstractC2755ee = this.f6271;
        int iHashCode = 0;
        int iHashCode2 = (abstractC2755ee != null ? abstractC2755ee.hashCode() : 0) * 31;
        AbstractC2755ee abstractC2755ee2 = this.f6272;
        if (abstractC2755ee2 != null) {
            iHashCode = abstractC2755ee2.hashCode();
        } else {
            f6268 = (f6267 + 67) % 128;
        }
        return iHashCode2 + iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m6772().toString());
        sb.append(m6770(Color.alpha(0) + 1, 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (44105 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern());
        sb.append(m6771().toString());
        String strOooOO0O = AbstractC2183w4.OooOO0O(sb, m6770(1 - TextUtils.indexOf("", "", 0, 0), TextUtils.getCapsMode("", 0, 0) + 1, (char) (Color.red(0) + 36055)));
        int i = f6267 + 3;
        f6268 = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
        return strOooOO0O;
    }

    /* renamed from: ﻐ */
    public final AbstractC2755ee m6771() {
        int i = f6267 + 63;
        f6268 = i % 128;
        if (i % 2 == 0) {
            return this.f6272;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public final AbstractC2755ee m6772() {
        int i = f6268 + 51;
        f6267 = i % 128;
        if (i % 2 != 0) {
            return this.f6271;
        }
        throw null;
    }
}
