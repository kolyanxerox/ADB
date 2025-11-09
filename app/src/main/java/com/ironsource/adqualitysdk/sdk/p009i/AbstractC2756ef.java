package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.ViewConfiguration;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ef */
/* loaded from: classes2.dex */
public abstract class AbstractC2756ef extends AbstractC2755ee {

    /* renamed from: ﻐ */
    private static int f6245 = 1;

    /* renamed from: ﻛ */
    private static int f6246;

    /* renamed from: ｋ */
    private static int[] f6247 = {1978848276, -1772754001, 1135313326, 1227918279, 2061939814, -1246222404, -469958609, -695790088, 812985192, 1537411016, -136664330, -205113409, -115843049, 1692977033, -2046416064, 529317177, 1491226857, -707705953};

    /* renamed from: ﾇ */
    private AbstractC2755ee f6248;

    /* renamed from: ﾒ */
    private AbstractC2755ee f6249;

    public AbstractC2756ef(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(c2736dm);
        this.f6249 = abstractC2755ee;
        this.f6248 = abstractC2755ee2;
    }

    /* renamed from: ﾒ */
    private static String m6762(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6247.clone();
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

    public boolean equals(Object obj) {
        int i;
        if (this != obj) {
            if (obj != null) {
                f6246 = (f6245 + 115) % 128;
                if (getClass() == obj.getClass()) {
                    AbstractC2756ef abstractC2756ef = (AbstractC2756ef) obj;
                    AbstractC2755ee abstractC2755ee = this.f6249;
                    if (abstractC2755ee == null ? abstractC2756ef.f6249 != null : !abstractC2755ee.equals(abstractC2756ef.f6249)) {
                        return false;
                    }
                    AbstractC2755ee abstractC2755ee2 = this.f6248;
                    AbstractC2755ee abstractC2755ee3 = abstractC2756ef.f6248;
                    if (abstractC2755ee2 != null) {
                        return abstractC2755ee2.equals(abstractC2755ee3);
                    }
                    if (abstractC2755ee3 == null) {
                        i = f6245 + 65;
                    }
                }
            }
            return false;
        }
        i = f6245 + 109;
        f6246 = i % 128;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int hashCode() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef.f6245
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef.f6246 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L15
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r4.f6249
            r2 = 80
            int r2 = r2 / r1
            if (r0 == 0) goto L20
            goto L19
        L15:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r4.f6249
            if (r0 == 0) goto L20
        L19:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r4.f6249
            int r0 = r0.hashCode()
            goto L21
        L20:
            r0 = r1
        L21:
            int r0 = r0 * 31
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r4.f6248
            if (r2 == 0) goto L3d
            int r1 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef.f6246
            int r1 = r1 + 105
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef.f6245 = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L38
            int r1 = r2.hashCode()
            goto L45
        L38:
            r2.hashCode()
            r0 = 0
            throw r0
        L3d:
            int r2 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef.f6245
            int r2 = r2 + 43
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef.f6246 = r2
        L45:
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef.hashCode():int");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6249);
        sb.append(m6762(new int[]{-63842335, -2109043621}, 1 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
        sb.append(mo6763());
        sb.append(m6762(new int[]{-63842335, -2109043621}, 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
        sb.append(this.f6248);
        String string = sb.toString();
        f6246 = (f6245 + 1) % 128;
        return string;
    }

    /* renamed from: ﻐ */
    public abstract String mo6763();

    /* renamed from: ﻛ */
    public final AbstractC2755ee m6764() {
        int i = f6246;
        AbstractC2755ee abstractC2755ee = this.f6248;
        int i2 = i + 95;
        f6245 = i2 % 128;
        if (i2 % 2 != 0) {
            return abstractC2755ee;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public final AbstractC2755ee m6765() {
        int i = f6245;
        AbstractC2755ee abstractC2755ee = this.f6249;
        int i2 = i + 93;
        f6246 = i2 % 128;
        if (i2 % 2 == 0) {
            return abstractC2755ee;
        }
        throw null;
    }
}
