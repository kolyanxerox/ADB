package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.util.TypedValue;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3037dc;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.es */
/* loaded from: classes2.dex */
public final class C2769es extends AbstractC2761ek {

    /* renamed from: ﻛ */
    private static char f6291 = 1;

    /* renamed from: ｋ */
    private static int f6292 = 0;

    /* renamed from: ﾇ */
    private static char[] f6293 = {C3037dc.f8244T};

    /* renamed from: ﾒ */
    private static int f6294 = 1;

    public C2769es(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef
    /* renamed from: ﻐ */
    public final String mo6763() {
        int i = f6292 + 13;
        f6294 = i % 128;
        String strIntern = (i % 2 == 0 ? m6783((byte) (121 >> TextUtils.getOffsetBefore("", 1)), "\u0080\u0080", 5 % (TypedValue.complexToFraction(1, 2.0f, 0.0f) > 1.0f ? 1 : (TypedValue.complexToFraction(1, 2.0f, 0.0f) == 1.0f ? 0 : -1))) : m6783((byte) (TextUtils.getOffsetBefore("", 0) + 67), "\u0080\u0080", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2)).intern();
        f6294 = (f6292 + 57) % 128;
        return strIntern;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r4 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r4 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        com.ironsource.adqualitysdk.sdk.p009i.C2769es.f6294 = (r1 + 87) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return true;
     */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2761ek
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo6773(int r4) {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2769es.f6294
            int r0 = r0 + 125
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2769es.f6292 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L13
            r0 = 50
            int r0 = r0 / r2
            if (r4 != 0) goto L1d
            goto L15
        L13:
            if (r4 != 0) goto L1d
        L15:
            int r1 = r1 + 87
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2769es.f6294 = r1
            r4 = 1
            return r4
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2769es.mo6773(int):boolean");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2761ek
    /* renamed from: ﾇ */
    public final boolean mo6775(String str, String str2) {
        int i = f6294 + 113;
        f6292 = i % 128;
        if (i % 2 != 0) {
            str.equals(str2);
            throw null;
        }
        boolean zEquals = str.equals(str2);
        f6294 = (f6292 + InterfaceC3173h3.d.b.f8821d) % 128;
        return zEquals;
    }

    /* renamed from: ﾇ */
    private static String m6783(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f6293;
                char c = f6291;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr3[i] = (char) (cArr[i] - b);
                }
                if (i > 1) {
                    C2858i.f6715 = 0;
                    while (true) {
                        int i2 = C2858i.f6715;
                        if (i2 >= i) {
                            break;
                        }
                        C2858i.f6714 = cArr[i2];
                        C2858i.f6712 = cArr[C2858i.f6715 + 1];
                        if (C2858i.f6714 == C2858i.f6712) {
                            cArr3[C2858i.f6715] = (char) (C2858i.f6714 - b);
                            cArr3[C2858i.f6715 + 1] = (char) (C2858i.f6712 - b);
                        } else {
                            C2858i.f6713 = C2858i.f6714 / c;
                            C2858i.f6709 = C2858i.f6714 % c;
                            C2858i.f6711 = C2858i.f6712 / c;
                            C2858i.f6708 = C2858i.f6712 % c;
                            if (C2858i.f6709 == C2858i.f6708) {
                                C2858i.f6713 = AbstractC2183w4.OooOoOO(C2858i.f6713, c, 1, c);
                                C2858i.f6711 = AbstractC2183w4.OooOoOO(C2858i.f6711, c, 1, c);
                                int i3 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i4 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i5 = C2858i.f6715;
                                cArr3[i5] = cArr2[i3];
                                cArr3[i5 + 1] = cArr2[i4];
                            } else if (C2858i.f6713 == C2858i.f6711) {
                                C2858i.f6709 = AbstractC2183w4.OooOoOO(C2858i.f6709, c, 1, c);
                                C2858i.f6708 = AbstractC2183w4.OooOoOO(C2858i.f6708, c, 1, c);
                                int i6 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i7 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i8 = C2858i.f6715;
                                cArr3[i8] = cArr2[i6];
                                cArr3[i8 + 1] = cArr2[i7];
                            } else {
                                int i9 = (C2858i.f6713 * c) + C2858i.f6708;
                                int i10 = (C2858i.f6711 * c) + C2858i.f6709;
                                int i11 = C2858i.f6715;
                                cArr3[i11] = cArr2[i9];
                                cArr3[i11 + 1] = cArr2[i10];
                            }
                        }
                        C2858i.f6715 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2761ek
    /* renamed from: ﻛ */
    public final boolean mo6774(Object obj, Object obj2) {
        int i = f6294;
        f6292 = (i + 39) % 128;
        if (obj == obj2) {
            f6292 = (i + 83) % 128;
            return true;
        }
        f6292 = (i + 1) % 128;
        return false;
    }
}
