package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ct */
/* loaded from: classes2.dex */
public final class C2716ct extends C2722cz {

    /* renamed from: ﻐ */
    private static int f5833 = 0;

    /* renamed from: ﻛ */
    private static int f5834 = 1;

    /* renamed from: ﾒ */
    private static long f5835 = 7942923157040349202L;

    /* renamed from: ﻛ */
    private static String m6391(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f5835);
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

    /* renamed from: ﻐ */
    public final Object m6392(C2712cp c2712cp, List<Object> list) {
        f5834 = (f5833 + 29) % 128;
        m6394(c2712cp, list);
        f5834 = (f5833 + 33) % 128;
        return null;
    }

    /* renamed from: ｋ */
    public final Object m6393(C2712cp c2712cp, List<Object> list) {
        C2712cp c2712cp2;
        List list2 = (List) C2722cz.m6459(list, 0, List.class);
        try {
            C2743dt c2743dt = (C2743dt) C2722cz.m6459(list, 1, C2743dt.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() <= 2) {
                c2712cp2 = c2712cp;
            } else if (C2722cz.m6458(list, 2, C2712cp.class)) {
                int i = f5834 + 125;
                f5833 = i % 128;
                if (i % 2 != 0) {
                    c2712cp2 = (C2712cp) C2722cz.m6459(list, 5, C2712cp.class);
                    if (list.size() > 2) {
                        int i2 = f5834 + 37;
                        f5833 = i2 % 128;
                        int i3 = i2 % 2;
                        arrayList = C2722cz.m6460(list, 3);
                    }
                } else {
                    c2712cp2 = (C2712cp) C2722cz.m6459(list, 2, C2712cp.class);
                    if (list.size() > 3) {
                        int i22 = f5834 + 37;
                        f5833 = i22 % 128;
                        int i32 = i22 % 2;
                        arrayList = C2722cz.m6460(list, 3);
                    }
                }
            } else {
                arrayList = C2722cz.m6460(list, 2);
                c2712cp2 = c2712cp;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i4 = 0; i4 < list2.size(); i4++) {
                f5834 = (f5833 + 93) % 128;
                arrayList.add(0, list2.get(i4));
                if (c2743dt.m6711(c2712cp2.m6288(), c2712cp2, arrayList).m6721()) {
                    arrayList2.add(list2.get(i4));
                }
                arrayList.remove(0);
            }
            return arrayList2;
        } catch (Exception e) {
            C2713cq.m6350(c2712cp.m6290(), m6391("䁗㓻\ua956ᶬ鈌ܵ﯂灚\ue4a4夏칵䋕㜱꯭\u200e镮ৎ︭犑\ue7e1尮탊䔮㧟껶⍘韟ి", 29851 - (Process.myPid() >> 22)).intern(), e);
            return list2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6458(r10, 2, com.ironsource.adqualitysdk.sdk.p009i.C2712cp.class) == false) goto L15;
     */
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6394(com.ironsource.adqualitysdk.sdk.p009i.C2712cp r9, java.util.List<java.lang.Object> r10) {
        /*
            r8 = this;
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r1 = 0
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r10, r1, r0)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.dt> r2 = com.ironsource.adqualitysdk.sdk.p009i.C2743dt.class
            r3 = 1
            java.lang.Object r2 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r10, r3, r2)     // Catch: java.lang.Exception -> L33
            com.ironsource.adqualitysdk.sdk.i.dt r2 = (com.ironsource.adqualitysdk.sdk.p009i.C2743dt) r2     // Catch: java.lang.Exception -> L33
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L33
            r3.<init>()     // Catch: java.lang.Exception -> L33
            int r4 = r10.size()     // Catch: java.lang.Exception -> L33
            r5 = 2
            if (r4 <= r5) goto L3f
            int r4 = com.ironsource.adqualitysdk.sdk.p009i.C2716ct.f5833
            int r4 = r4 + 23
            int r6 = r4 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2716ct.f5834 = r6
            int r4 = r4 % r5
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.cp> r6 = com.ironsource.adqualitysdk.sdk.p009i.C2712cp.class
            r7 = 3
            if (r4 != 0) goto L35
            boolean r4 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6458(r10, r7, r6)     // Catch: java.lang.Exception -> L33
            if (r4 == 0) goto L3b
            goto L41
        L33:
            r10 = move-exception
            goto L82
        L35:
            boolean r4 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6458(r10, r5, r6)     // Catch: java.lang.Exception -> L33
            if (r4 != 0) goto L41
        L3b:
            java.util.List r3 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6460(r10, r5)     // Catch: java.lang.Exception -> L33
        L3f:
            r4 = r9
            goto L51
        L41:
            java.lang.Object r4 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r10, r5, r6)     // Catch: java.lang.Exception -> L33
            com.ironsource.adqualitysdk.sdk.i.cp r4 = (com.ironsource.adqualitysdk.sdk.p009i.C2712cp) r4     // Catch: java.lang.Exception -> L33
            int r5 = r10.size()     // Catch: java.lang.Exception -> L33
            if (r5 <= r7) goto L51
            java.util.List r3 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6460(r10, r7)     // Catch: java.lang.Exception -> L33
        L51:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Exception -> L33
            r10.<init>()     // Catch: java.lang.Exception -> L33
            r5 = r1
        L57:
            int r6 = r0.size()     // Catch: java.lang.Exception -> L33
            if (r5 >= r6) goto L81
            int r6 = com.ironsource.adqualitysdk.sdk.p009i.C2716ct.f5834
            int r6 = r6 + 11
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2716ct.f5833 = r6
            java.lang.Object r6 = r0.get(r5)     // Catch: java.lang.Exception -> L33
            r3.add(r1, r6)     // Catch: java.lang.Exception -> L33
            com.ironsource.adqualitysdk.sdk.i.dr r6 = r4.m6288()     // Catch: java.lang.Exception -> L33
            com.ironsource.adqualitysdk.sdk.i.du r6 = r2.m6711(r6, r4, r3)     // Catch: java.lang.Exception -> L33
            java.lang.Object r6 = r6.m6717()     // Catch: java.lang.Exception -> L33
            r10.add(r6)     // Catch: java.lang.Exception -> L33
            r3.remove(r1)     // Catch: java.lang.Exception -> L33
            int r5 = r5 + 1
            goto L57
        L81:
            return r10
        L82:
            java.lang.String r9 = r9.m6290()
            long r1 = android.widget.ExpandableListView.getPackedPositionForChild(r1, r1)
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 65146(0xfe7a, float:9.1289E-41)
            int r2 = r2 - r1
            java.lang.String r1 = "䁗븛벖묌릌롕뚂딺뎤눯낵꼵궱갍\uaac5ꥆ\ua7d2ꘖꓒꍜꇼꁀ黡鵼鯲騱頃隅镆鎑鈑還輆"
            java.lang.String r1 = m6391(r1, r2)
            java.lang.String r1 = r1.intern()
            com.ironsource.adqualitysdk.sdk.p009i.C2713cq.m6350(r9, r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2716ct.m6394(com.ironsource.adqualitysdk.sdk.i.cp, java.util.List):java.lang.Object");
    }
}
