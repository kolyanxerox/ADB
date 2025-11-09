package o00O0;

/* loaded from: classes3.dex */
public final class OooO0O0 {
    public static void OooO00o(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, i2, "index: ", ", size: "));
        }
    }

    public static void OooO0O0(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO0o0(i, i2, "index: ", ", size: "));
        }
    }

    public static void OooO0OO(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbOooOo0o = OooO0oO.OooOo.OooOo0o("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            sbOooOo0o.append(i3);
            throw new IndexOutOfBoundsException(sbOooOo0o.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o0(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int OooO0Oo(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }
}
