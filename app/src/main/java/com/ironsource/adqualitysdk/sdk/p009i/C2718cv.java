package com.ironsource.adqualitysdk.sdk.p009i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cv */
/* loaded from: classes2.dex */
public final class C2718cv extends C2722cz {

    /* renamed from: ﻐ */
    private static int f5836 = 97;

    /* renamed from: ﻛ */
    private static int f5837 = 0;

    /* renamed from: ﾒ */
    private static int f5838 = 1;

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m6402(com.ironsource.adqualitysdk.sdk.p009i.C2712cp r11, java.util.List<java.lang.Object> r12) {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r12, r1, r0)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r11.m6290()
            r0.append(r2)
            float r2 = android.view.ViewConfiguration.getScrollFriction()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            float r5 = android.media.AudioTrack.getMinVolume()
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            r5 = 1
            int r4 = r4 + r5
            long r6 = android.widget.ExpandableListView.getPackedPositionForChild(r1, r1)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            int r6 = 154 - r6
            java.lang.String r7 = "\u0000"
            java.lang.String r2 = m6403(r2, r4, r6, r7, r1)
            java.lang.String r2 = r2.intern()
            r0.append(r2)
            int r2 = r3.hashCode()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r12, r5, r0)
            r5 = r0
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            int r0 = r12.size()
            r8 = 0
            r9 = 2
            if (r0 <= r9) goto Lc0
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            boolean r2 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6458(r12, r9, r0)
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            if (r2 == 0) goto La3
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r12, r9, r0)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            int r2 = r12.size()
            r7 = 3
            if (r2 <= r7) goto La0
            int r2 = com.ironsource.adqualitysdk.sdk.p009i.C2718cv.f5837
            int r2 = r2 + 43
            int r10 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2718cv.f5838 = r10
            int r2 = r2 % r9
            if (r2 != 0) goto L85
            boolean r2 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6458(r12, r7, r6)
            if (r2 == 0) goto La0
            goto L8b
        L85:
            boolean r2 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6458(r12, r7, r6)
            if (r2 == 0) goto La0
        L8b:
            int r2 = com.ironsource.adqualitysdk.sdk.p009i.C2718cv.f5838
            int r2 = r2 + 111
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2718cv.f5837 = r2
            java.lang.Object r12 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r12, r7, r6)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r7 = r12
            r6 = r0
            goto Lb8
        La0:
            r6 = r0
            r7 = r1
            goto Lb8
        La3:
            boolean r0 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6458(r12, r9, r6)
            if (r0 != 0) goto Lac
            r7 = r1
        Laa:
            r6 = r8
            goto Lb8
        Lac:
            java.lang.Object r12 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r12, r9, r6)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r7 = r12
            goto Laa
        Lb8:
            java.lang.String r2 = r11.m6290()
            com.ironsource.adqualitysdk.sdk.p009i.C2914kb.m7421(r2, r3, r4, r5, r6, r7)
            goto Lc9
        Lc0:
            java.lang.String r2 = r11.m6290()
            r6 = 0
            r7 = 0
            com.ironsource.adqualitysdk.sdk.p009i.C2914kb.m7421(r2, r3, r4, r5, r6, r7)
        Lc9:
            int r11 = com.ironsource.adqualitysdk.sdk.p009i.C2718cv.f5838
            int r11 = r11 + 13
            int r12 = r11 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2718cv.f5837 = r12
            int r11 = r11 % r9
            if (r11 == 0) goto Ld7
            r11 = 41
            int r11 = r11 / r1
        Ld7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2718cv.m6402(com.ironsource.adqualitysdk.sdk.i.cp, java.util.List):java.lang.Object");
    }

    /* renamed from: ﾇ */
    private static String m6403(int i, int i2, int i3, String str, boolean z) {
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
                    cArr2[i5] = (char) (cArr2[i5] - f5836);
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
