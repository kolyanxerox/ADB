package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class fo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f18987OooO00o = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int OooO00o(double r6) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L12
            boolean r1 = com.google.android.gms.internal.ads.ii0.Oooo00O(r6)
            if (r1 == 0) goto L12
            r1 = r3
            goto L13
        L12:
            r1 = r2
        L13:
            java.lang.String r4 = "x must be positive and finite"
            com.google.android.gms.internal.ads.ii0.OoooOoo(r4, r1)
            int r1 = java.lang.Math.getExponent(r6)
            int r4 = java.lang.Math.getExponent(r6)
            r5 = -1022(0xfffffffffffffc02, float:NaN)
            if (r4 < r5) goto L73
            int[] r4 = com.google.android.gms.internal.ads.eo0.f18638OooO00o
            int r0 = r0.ordinal()
            r0 = r4[r0]
            switch(r0) {
                case 1: goto L6b;
                case 2: goto L6a;
                case 3: goto L61;
                case 4: goto L59;
                case 5: goto L4f;
                case 6: goto L35;
                case 7: goto L35;
                case 8: goto L35;
                default: goto L2f;
            }
        L2f:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L35:
            long r6 = java.lang.Double.doubleToRawLongBits(r6)
            r4 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r6 = r6 & r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r6 = r6 | r4
            double r6 = java.lang.Double.longBitsToDouble(r6)
            double r6 = r6 * r6
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L67
            r2 = r3
            goto L67
        L4f:
            if (r1 < 0) goto L52
            r2 = r3
        L52:
            boolean r6 = OooO0OO(r6)
        L56:
            r6 = r6 ^ r3
            r2 = r2 & r6
            goto L67
        L59:
            if (r1 >= 0) goto L5c
            r2 = r3
        L5c:
            boolean r6 = OooO0OO(r6)
            goto L56
        L61:
            boolean r6 = OooO0OO(r6)
            r2 = r6 ^ 1
        L67:
            if (r2 == 0) goto L6a
            int r1 = r1 + r3
        L6a:
            return r1
        L6b:
            boolean r6 = OooO0OO(r6)
            com.google.android.gms.internal.ads.xh0.Oooo0o(r6)
            return r1
        L73:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r6 = r6 * r0
            int r6 = OooO00o(r6)
            int r6 = r6 + (-52)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fo0.OooO00o(double):int");
    }

    public static boolean OooO0O0(double d) {
        if (ii0.Oooo00O(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(ii0.OooO0O0(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean OooO0OO(double d) {
        if (d > 0.0d && ii0.Oooo00O(d)) {
            long jOooO0O0 = ii0.OooO0O0(d);
            if ((jOooO0O0 & ((-1) + jOooO0O0)) == 0) {
                return true;
            }
        }
        return false;
    }
}
