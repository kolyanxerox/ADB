package com.ironsource.adqualitysdk.sdk.p009i;

import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fr */
/* loaded from: classes2.dex */
public final class C2795fr extends AbstractC2794fq {

    /* renamed from: ﱡ */
    private static int f6378 = 1;

    /* renamed from: ﻏ */
    private static int f6379;

    /* renamed from: ﾇ */
    private static char[] f6380 = {'i', 215, 221, 182, 145, 'w', 225, 20, '$'};

    /* renamed from: ﻐ */
    private AbstractC2755ee f6381;

    /* renamed from: ﻛ */
    private AbstractC2794fq f6382;

    /* renamed from: ｋ */
    private AbstractC2755ee f6383;

    /* renamed from: ﾒ */
    private AbstractC2755ee f6384;

    public C2795fr(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, AbstractC2755ee abstractC2755ee3, AbstractC2794fq abstractC2794fq) {
        this.f6381 = abstractC2755ee;
        this.f6383 = abstractC2755ee2;
        this.f6384 = abstractC2755ee3;
        this.f6382 = abstractC2794fq;
    }

    /* renamed from: ﾇ */
    private static C2744du m6805(AbstractC2755ee abstractC2755ee, C2741dr c2741dr, C2712cp c2712cp) {
        int i = f6378 + 79;
        f6379 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (abstractC2755ee != null) {
            return abstractC2755ee.m6760(c2741dr, c2712cp);
        }
        C2744du c2744du = new C2744du(null);
        f6379 = (f6378 + 73) % 128;
        return c2744du;
    }

    /* renamed from: ﾒ */
    private static String m6806(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (C2831h.f6553) {
            try {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(f6380, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    C2831h.f6552 = 0;
                    char c = 0;
                    while (true) {
                        int i5 = C2831h.f6552;
                        if (i5 >= i2) {
                            break;
                        }
                        if (bArr[i5] == 1) {
                            cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                        } else {
                            cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                        }
                        c = cArr2[i5];
                        C2831h.f6552 = i5 + 1;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i6 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i6, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i6);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2831h.f6552 = 0;
                    while (true) {
                        int i7 = C2831h.f6552;
                        if (i7 >= i2) {
                            break;
                        }
                        cArr4[i7] = cArr[(i2 - i7) - 1];
                        C2831h.f6552 = i7 + 1;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    C2831h.f6552 = 0;
                    while (true) {
                        int i8 = C2831h.f6552;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr[i8] = (char) (cArr[i8] - iArr[2]);
                        C2831h.f6552 = i8 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            f6378 = (f6379 + 3) % 128;
            if (C2795fr.class == obj.getClass()) {
                C2795fr c2795fr = (C2795fr) obj;
                AbstractC2755ee abstractC2755ee = this.f6381;
                if (abstractC2755ee == null ? c2795fr.f6381 != null : !abstractC2755ee.equals(c2795fr.f6381)) {
                    return false;
                }
                AbstractC2755ee abstractC2755ee2 = this.f6383;
                if (abstractC2755ee2 == null ? c2795fr.f6383 != null : !abstractC2755ee2.equals(c2795fr.f6383)) {
                    return false;
                }
                AbstractC2755ee abstractC2755ee3 = this.f6384;
                if (abstractC2755ee3 == null ? c2795fr.f6384 != null : !abstractC2755ee3.equals(c2795fr.f6384)) {
                    return false;
                }
                AbstractC2794fq abstractC2794fq = this.f6382;
                if (abstractC2794fq != null) {
                    f6379 = (f6378 + 67) % 128;
                    return abstractC2794fq.equals(c2795fr.f6382);
                }
                if (c2795fr.f6382 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        AbstractC2755ee abstractC2755ee = this.f6381;
        int iHashCode3 = 0;
        if (abstractC2755ee != null) {
            f6378 = (f6379 + 13) % 128;
            iHashCode = abstractC2755ee.hashCode();
        } else {
            iHashCode = 0;
        }
        int i = iHashCode * 31;
        AbstractC2755ee abstractC2755ee2 = this.f6383;
        if (abstractC2755ee2 != null) {
            iHashCode2 = abstractC2755ee2.hashCode();
        } else {
            f6379 = (f6378 + 17) % 128;
            iHashCode2 = 0;
        }
        int i2 = (i + iHashCode2) * 31;
        AbstractC2755ee abstractC2755ee3 = this.f6384;
        int iHashCode4 = (i2 + (abstractC2755ee3 != null ? abstractC2755ee3.hashCode() : 0)) * 31;
        AbstractC2794fq abstractC2794fq = this.f6382;
        if (abstractC2794fq != null) {
            f6379 = (f6378 + 91) % 128;
            iHashCode3 = abstractC2794fq.hashCode();
        }
        return iHashCode4 + iHashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m6806(false, new int[]{0, 5, 109, 0}, "\u0001\u0001\u0001\u0000\u0000").intern());
        AbstractC2755ee abstractC2755ee = this.f6381;
        if (abstractC2755ee != null) {
            sb.append(abstractC2755ee);
            f6379 = (f6378 + 67) % 128;
        }
        sb.append(m6806(false, new int[]{5, 2, 180, 0}, "\u0001\u0001").intern());
        sb.append(this.f6383);
        sb.append(m6806(false, new int[]{5, 2, 180, 0}, "\u0001\u0001").intern());
        AbstractC2755ee abstractC2755ee2 = this.f6384;
        if (abstractC2755ee2 != null) {
            f6378 = (f6379 + 63) % 128;
            sb.append(abstractC2755ee2);
        }
        sb.append(m6806(false, new int[]{7, 2, 0, 2}, "\u0001\u0001").intern());
        sb.append(this.f6382);
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2794fq
    /* renamed from: ｋ */
    public final C2744du mo6796(C2741dr c2741dr, C2712cp c2712cp) {
        m6805(this.f6381, c2741dr, c2712cp);
        while (this.f6383.m6760(c2741dr, c2712cp).m6721()) {
            C2744du c2744duMo6796 = this.f6382.mo6796(c2741dr, c2712cp);
            if (c2744duMo6796.m6718()) {
                break;
            }
            int i = f6379 + 45;
            f6378 = i % 128;
            if (i % 2 == 0) {
                c2744duMo6796.m6720();
                throw null;
            }
            if (c2744duMo6796.m6720()) {
                return c2744duMo6796;
            }
            m6805(this.f6384, c2741dr, c2712cp);
            f6379 = (f6378 + 95) % 128;
        }
        return new C2744du(null);
    }
}
