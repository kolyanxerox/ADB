package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fk */
/* loaded from: classes2.dex */
public final class C2788fk extends AbstractC2794fq {

    /* renamed from: ﻐ */
    private static int f6345 = 1;

    /* renamed from: ﻛ */
    private static int f6346 = 0;

    /* renamed from: ｋ */
    private static char[] f6347 = {'{', '\n', ' ', '}'};

    /* renamed from: ﾇ */
    private static char f6348 = 2;

    /* renamed from: ﾒ */
    private AbstractC2794fq[] f6349;

    public C2788fk(List<AbstractC2794fq> list) {
        AbstractC2794fq[] abstractC2794fqArr = new AbstractC2794fq[list.size()];
        this.f6349 = abstractC2794fqArr;
        list.toArray(abstractC2794fqArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i = f6345 + 71;
            f6346 = i % 128;
            if (i % 2 != 0) {
                obj.getClass();
                throw null;
            }
            if (C2788fk.class == obj.getClass()) {
                AbstractC2794fq[] abstractC2794fqArr = this.f6349;
                AbstractC2794fq[] abstractC2794fqArr2 = ((C2788fk) obj).f6349;
                if (abstractC2794fqArr != null) {
                    return abstractC2794fqArr.equals(abstractC2794fqArr2);
                }
                if (abstractC2794fqArr2 != null) {
                    return false;
                }
                f6346 = (f6345 + 13) % 128;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return r4.f6349.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4.f6349 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.f6349 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        com.ironsource.adqualitysdk.sdk.p009i.C2788fk.f6345 = (r1 + 47) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2788fk.f6345
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2788fk.f6346 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L15
            com.ironsource.adqualitysdk.sdk.i.fq[] r0 = r4.f6349
            r3 = 32
            int r3 = r3 / r2
            if (r0 == 0) goto L26
            goto L19
        L15:
            com.ironsource.adqualitysdk.sdk.i.fq[] r0 = r4.f6349
            if (r0 == 0) goto L26
        L19:
            int r1 = r1 + 47
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2788fk.f6345 = r1
            com.ironsource.adqualitysdk.sdk.i.fq[] r0 = r4.f6349
            int r0 = r0.hashCode()
            return r0
        L26:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2788fk.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m6797((byte) (42 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0001\u0000", 2 - TextUtils.getOffsetBefore("", 0)).intern());
        for (AbstractC2794fq abstractC2794fq : this.f6349) {
            f6346 = (f6345 + 73) % 128;
            sb.append(m6797((byte) (13 - TextUtils.indexOf("", "")), "----", 4 - TextUtils.indexOf("", "", 0)).intern());
            sb.append(abstractC2794fq.toString());
            sb.append(m6797((byte) (75 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), RequestConfiguration.MAX_AD_CONTENT_RATING_T, View.resolveSizeAndState(0, 0, 0) + 1).intern());
        }
        String strOooOO0O = AbstractC2183w4.OooOO0O(sb, m6797((byte) (View.resolveSizeAndState(0, 0, 0) + 38), "£", -TextUtils.indexOf((CharSequence) "", '0')));
        f6346 = (f6345 + 21) % 128;
        return strOooOO0O;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2794fq
    /* renamed from: ｋ */
    public final C2744du mo6796(C2741dr c2741dr, C2712cp c2712cp) {
        C2744du c2744du = new C2744du(null);
        C2741dr c2741dr2 = new C2741dr(c2741dr);
        AbstractC2794fq[] abstractC2794fqArr = this.f6349;
        int length = abstractC2794fqArr.length;
        int i = 0;
        while (i < length) {
            c2744du = abstractC2794fqArr[i].mo6796(c2741dr2, c2712cp);
            if (c2744du.m6720()) {
                break;
            }
            f6345 = (f6346 + 9) % 128;
            if (!(!c2744du.m6718())) {
                break;
            }
            f6345 = (f6346 + 47) % 128;
            if (c2744du.m6714()) {
                break;
            }
            i++;
            f6346 = (f6345 + 89) % 128;
        }
        return c2744du;
    }

    /* renamed from: ｋ */
    private static String m6797(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f6347;
                char c = f6348;
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
}
