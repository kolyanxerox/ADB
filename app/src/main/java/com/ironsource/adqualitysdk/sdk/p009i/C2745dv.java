package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.Process;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dv */
/* loaded from: classes2.dex */
public final class C2745dv extends AbstractC2755ee {

    /* renamed from: ﻐ */
    private static int f6178 = 1;

    /* renamed from: ｋ */
    private static int[] f6179 = {1887979786, -1335051371, 661157473, -1453609702, -2060153849, 507214364, 1040902610, -300864089, -1772527112, 1737736699, -1795836688, 1715385225, 2030379516, 612648369, -407088790, -1163277759, 188810067, -620259010};

    /* renamed from: ﾒ */
    private static int f6180;

    /* renamed from: ﻛ */
    private AbstractC2755ee[] f6181;

    public C2745dv(List<AbstractC2755ee> list, C2736dm c2736dm) {
        super(c2736dm);
        AbstractC2755ee[] abstractC2755eeArr = new AbstractC2755ee[list.size()];
        this.f6181 = abstractC2755eeArr;
        list.toArray(abstractC2755eeArr);
    }

    public final boolean equals(Object obj) {
        int i = f6180;
        int i2 = (i + 19) % 128;
        f6178 = i2;
        if (this == obj) {
            f6180 = (i2 + 109) % 128;
            return true;
        }
        if (obj == null) {
            return false;
        }
        f6178 = (i + 65) % 128;
        if (C2745dv.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6181, ((C2745dv) obj).f6181);
    }

    public final int hashCode() {
        f6178 = (f6180 + 77) % 128;
        int iHashCode = Arrays.hashCode(this.f6181);
        f6178 = (f6180 + 5) % 128;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m6723(new int[]{1622603482, 2026269840}, (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern());
        sb.append(AbstractC2755ee.m6758(this.f6181));
        String strOooOO0O = AbstractC2183w4.OooOO0O(sb, m6723(new int[]{-1123341230, -382096324}, -Process.getGidForName("")));
        int i = f6178 + 63;
        f6180 = i % 128;
        if (i % 2 != 0) {
            int i2 = 68 / 0;
        }
        return strOooOO0O;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        ArrayList arrayList = new ArrayList();
        AbstractC2755ee[] abstractC2755eeArr = this.f6181;
        int length = abstractC2755eeArr.length;
        int i = 0;
        while (i < length) {
            int i2 = f6180 + 29;
            f6178 = i2 % 128;
            if (i2 % 2 == 0) {
                arrayList.add(abstractC2755eeArr[i].m6760(c2741dr, c2712cp).m6717());
                i += 81;
            } else {
                arrayList.add(abstractC2755eeArr[i].m6760(c2741dr, c2712cp).m6717());
                i++;
            }
            f6180 = (f6178 + 51) % 128;
        }
        return new C2744du(arrayList);
    }

    /* renamed from: ｋ */
    private static String m6723(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6179.clone();
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
}
