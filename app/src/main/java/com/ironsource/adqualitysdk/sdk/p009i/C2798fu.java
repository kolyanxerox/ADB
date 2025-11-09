package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fu */
/* loaded from: classes2.dex */
public final class C2798fu extends AbstractC2794fq {

    /* renamed from: ｋ */
    private static int f6398 = 1;

    /* renamed from: ﾇ */
    private static int f6399 = 0;

    /* renamed from: ﾒ */
    private static int f6400 = 175;

    /* renamed from: ﻐ */
    private AbstractC2794fq f6401;

    /* renamed from: ﻛ */
    private AbstractC2755ee f6402;

    public C2798fu(AbstractC2755ee abstractC2755ee, AbstractC2794fq abstractC2794fq) {
        this.f6402 = abstractC2755ee;
        this.f6401 = abstractC2794fq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            f6399 = (f6398 + 51) % 128;
            return true;
        }
        if (obj != null) {
            f6399 = (f6398 + 27) % 128;
            if (C2798fu.class == obj.getClass()) {
                C2798fu c2798fu = (C2798fu) obj;
                AbstractC2755ee abstractC2755ee = this.f6402;
                if (abstractC2755ee == null ? c2798fu.f6402 != null : !abstractC2755ee.equals(c2798fu.f6402)) {
                    return false;
                }
                AbstractC2794fq abstractC2794fq = this.f6401;
                if (abstractC2794fq != null) {
                    int i = f6399 + 15;
                    f6398 = i % 128;
                    int i2 = i % 2;
                    AbstractC2794fq abstractC2794fq2 = c2798fu.f6401;
                    if (i2 != 0) {
                        return abstractC2794fq.equals(abstractC2794fq2);
                    }
                    abstractC2794fq.equals(abstractC2794fq2);
                    throw null;
                }
                if (c2798fu.f6401 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        AbstractC2755ee abstractC2755ee = this.f6402;
        if (abstractC2755ee != null) {
            f6399 = (f6398 + 61) % 128;
            iHashCode = abstractC2755ee.hashCode();
            f6399 = (f6398 + 119) % 128;
        } else {
            iHashCode = 0;
        }
        int i = iHashCode * 31;
        AbstractC2794fq abstractC2794fq = this.f6401;
        return i + (abstractC2794fq != null ? abstractC2794fq.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m6810((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 262, "\u0012\u0011 \uffd1\uffc9\u000e\u0015", true).intern());
        sb.append(this.f6402);
        sb.append(m6810((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, 2 - TextUtils.indexOf("", "", 0), KeyEvent.getDeadChar(0, 0) + 211, "\u0005￼", true).intern());
        sb.append(this.f6401);
        String string = sb.toString();
        int i = f6398 + 83;
        f6399 = i % 128;
        if (i % 2 == 0) {
            return string;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2794fq
    /* renamed from: ｋ */
    public final C2744du mo6796(C2741dr c2741dr, C2712cp c2712cp) {
        while (this.f6402.m6760(c2741dr, c2712cp).m6721()) {
            f6398 = (f6399 + 85) % 128;
            C2744du c2744duMo6796 = this.f6401.mo6796(c2741dr, c2712cp);
            if (!(!c2744duMo6796.m6718())) {
                break;
            }
            f6398 = (f6399 + InterfaceC3173h3.d.b.f8826i) % 128;
            if (c2744duMo6796.m6720()) {
                return c2744duMo6796;
            }
        }
        return new C2744du(null);
    }

    /* renamed from: ｋ */
    private static String m6810(int i, int i2, int i3, String str, boolean z) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2669b.f5039) {
            try {
                char[] cArr2 = new char[i2];
                C2669b.f5040 = 0;
                while (true) {
                    int i4 = C2669b.f5040;
                    if (i4 >= i2) {
                        break;
                    }
                    C2669b.f5038 = cArr[i4];
                    cArr2[C2669b.f5040] = (char) (C2669b.f5038 + i3);
                    int i5 = C2669b.f5040;
                    cArr2[i5] = (char) (cArr2[i5] - f6400);
                    C2669b.f5040 = i5 + 1;
                }
                if (i > 0) {
                    C2669b.f5041 = i;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    int i6 = C2669b.f5041;
                    System.arraycopy(cArr3, 0, cArr2, i2 - i6, i6);
                    int i7 = C2669b.f5041;
                    System.arraycopy(cArr3, i7, cArr2, 0, i2 - i7);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2669b.f5040 = 0;
                    while (true) {
                        int i8 = C2669b.f5040;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr4[i8] = cArr2[(i2 - i8) - 1];
                        C2669b.f5040 = i8 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
