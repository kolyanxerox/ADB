package o00oOOo;

import io.flutter.embedding.android.KeyboardMap;
import o00O0OOo.OooO0O0;

/* loaded from: classes3.dex */
public abstract class o0Oo0oo {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o00oO0o f32797OooOo0O;

    static {
        Integer num = OooO0O0.f31379OooO00o;
        f32797OooOo0O = (num == null || num.intValue() >= 34) ? new o00O0o0.OooO0O0() : new o0ooOOo();
    }

    public abstract int OooO00o(int i);

    public abstract int OooO0O0();

    public abstract long OooO0OO();

    public long OooO0o0(long j, long j2) {
        long jOooO0OO;
        long j3;
        long jOooO00o;
        int iOooO0O0;
        if (j2 <= j) {
            throw new IllegalArgumentException(("Random range is empty: [" + Long.valueOf(j) + ", " + Long.valueOf(j2) + ").").toString());
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iOooO0O0 = OooO00o(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iOooO0O0 = OooO0O0();
                } else {
                    jOooO00o = (OooO00o(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (OooO0O0() & KeyboardMap.kValueMask);
                }
                jOooO00o = iOooO0O0 & KeyboardMap.kValueMask;
            } else {
                do {
                    jOooO0OO = OooO0OO() >>> 1;
                    j3 = jOooO0OO % j4;
                } while ((j4 - 1) + (jOooO0OO - j3) < 0);
                jOooO00o = j3;
            }
            return j + jOooO00o;
        }
        while (true) {
            long jOooO0OO2 = OooO0OO();
            if (j <= jOooO0OO2 && jOooO0OO2 < j2) {
                return jOooO0OO2;
            }
        }
    }
}
