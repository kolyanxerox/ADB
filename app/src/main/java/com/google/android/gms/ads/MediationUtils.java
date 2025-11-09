package com.google.android.gms.ads;

/* loaded from: classes2.dex */
public class MediationUtils {
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.AdSize findClosestSize(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.NonNull com.google.android.gms.ads.AdSize r10, @androidx.annotation.NonNull java.util.List<com.google.android.gms.ads.AdSize> r11) {
        /*
            r0 = 0
            if (r11 == 0) goto Lbe
            if (r10 != 0) goto L7
            goto Lbe
        L7:
            boolean r1 = r10.f15893OooO0o0
            if (r1 != 0) goto L32
            boolean r1 = r10.f15894OooO0oO
            if (r1 != 0) goto L32
            android.content.res.Resources r1 = r9.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r2 = r10.getWidthInPixels(r9)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r2 = java.lang.Math.round(r2)
            int r9 = r10.getHeightInPixels(r9)
            float r9 = (float) r9
            float r9 = r9 / r1
            int r9 = java.lang.Math.round(r9)
            com.google.android.gms.ads.AdSize r10 = new com.google.android.gms.ads.AdSize
            r10.<init>(r2, r9)
        L32:
            java.util.Iterator r9 = r11.iterator()
        L36:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto Lbe
            java.lang.Object r11 = r9.next()
            com.google.android.gms.ads.AdSize r11 = (com.google.android.gms.ads.AdSize) r11
            if (r11 == 0) goto L36
            int r1 = r10.getWidth()
            int r2 = r11.getWidth()
            int r3 = r10.getHeight()
            double r4 = (double) r1
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r4 = r4 * r6
            double r6 = (double) r2
            int r8 = r11.getHeight()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L36
            if (r1 < r2) goto L36
            boolean r1 = r10.f15894OooO0oO
            if (r1 == 0) goto L8c
            int r1 = r10.f15895OooO0oo
            com.google.android.gms.internal.ads.v6 r3 = com.google.android.gms.internal.ads.AbstractC1448c7.o0O0oO0O
            com.google.android.gms.internal.ads.a7 r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.OooO00o(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 > r2) goto L36
            com.google.android.gms.internal.ads.v6 r2 = com.google.android.gms.internal.ads.AbstractC1448c7.o0O0oO0o
            com.google.android.gms.internal.ads.a7 r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.OooO00o(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 > r8) goto L36
            if (r1 < r8) goto L36
            goto La4
        L8c:
            boolean r1 = r10.f15893OooO0o0
            if (r1 == 0) goto L95
            int r1 = r10.f15892OooO0o
            if (r1 < r8) goto L36
            goto La4
        L95:
            double r1 = (double) r3
            r4 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r1 = r1 * r4
            double r4 = (double) r8
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L36
            if (r3 >= r8) goto La4
            goto L36
        La4:
            if (r0 != 0) goto La7
            goto Lbb
        La7:
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            int r2 = r2 * r1
            int r1 = r11.getWidth()
            int r3 = r11.getHeight()
            int r3 = r3 * r1
            if (r2 > r3) goto L36
        Lbb:
            r0 = r11
            goto L36
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.MediationUtils.findClosestSize(android.content.Context, com.google.android.gms.ads.AdSize, java.util.List):com.google.android.gms.ads.AdSize");
    }
}
