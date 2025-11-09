package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class z41 {

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final z41 f26082OooO0oo;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f26083OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f26084OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f26085OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f26086OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f26087OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f26088OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f26089OooO0oO;

    static {
        int i = -1;
        f26082OooO0oo = new z41(1, 2, 3, i, i, null);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ z41(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f26083OooO00o = i;
        this.f26084OooO0O0 = i2;
        this.f26085OooO0OO = i3;
        this.f26086OooO0Oo = bArr;
        this.f26088OooO0o0 = i4;
        this.f26087OooO0o = i5;
    }

    public static int OooO00o(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int OooO0O0(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String OooO0o(int i) {
        return i != -1 ? i != 1 ? i != 2 ? OooO0oO.OooOo.OooO0o(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static boolean OooO0o0(z41 z41Var) {
        if (z41Var == null) {
            return true;
        }
        int i = z41Var.f26083OooO00o;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = z41Var.f26084OooO0O0;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = z41Var.f26085OooO0OO;
        if ((i3 != -1 && i3 != 3) || z41Var.f26086OooO0Oo != null) {
            return false;
        }
        int i4 = z41Var.f26087OooO0o;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = z41Var.f26088OooO0o0;
        return i5 == -1 || i5 == 8;
    }

    public static String OooO0oO(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? OooO0oO.OooOo.OooO0o(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String OooO0oo(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? OooO0oO.OooOo.OooO0o(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final String OooO0OO() {
        String str;
        String str2;
        int i;
        if (OooO0Oo()) {
            String strOooO0oO = OooO0oO(this.f26083OooO00o);
            String strOooO0o = OooO0o(this.f26084OooO0O0);
            String strOooO0oo = OooO0oo(this.f26085OooO0OO);
            Locale locale = Locale.US;
            str = strOooO0oO + "/" + strOooO0o + "/" + strOooO0oo;
        } else {
            str = "NA/NA/NA";
        }
        int i2 = this.f26088OooO0o0;
        if (i2 == -1 || (i = this.f26087OooO0o) == -1) {
            str2 = "NA/NA";
        } else {
            str2 = i2 + "/" + i;
        }
        return OooO0oO.OooOo.OooOoo(str, "/", str2);
    }

    public final boolean OooO0Oo() {
        return (this.f26083OooO00o == -1 || this.f26084OooO0O0 == -1 || this.f26085OooO0OO == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z41.class == obj.getClass()) {
            z41 z41Var = (z41) obj;
            if (this.f26083OooO00o == z41Var.f26083OooO00o && this.f26084OooO0O0 == z41Var.f26084OooO0O0 && this.f26085OooO0OO == z41Var.f26085OooO0OO && Arrays.equals(this.f26086OooO0Oo, z41Var.f26086OooO0Oo) && this.f26088OooO0o0 == z41Var.f26088OooO0o0 && this.f26087OooO0o == z41Var.f26087OooO0o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f26089OooO0oO;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((Arrays.hashCode(this.f26086OooO0Oo) + ((((((this.f26083OooO00o + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f26084OooO0O0) * 31) + this.f26085OooO0OO) * 31)) * 31) + this.f26088OooO0o0) * 31) + this.f26087OooO0o;
        this.f26089OooO0oO = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str;
        String strOooO0oO = OooO0oO(this.f26083OooO00o);
        String strOooO0o = OooO0o(this.f26084OooO0O0);
        String strOooO0oo = OooO0oo(this.f26085OooO0OO);
        String str2 = "NA";
        int i = this.f26088OooO0o0;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        int i2 = this.f26087OooO0o;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        boolean z = this.f26086OooO0Oo != null;
        StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("ColorInfo(", strOooO0oO, ", ", strOooO0o, ", ");
        sbOooOOo0.append(strOooO0oo);
        sbOooOOo0.append(", ");
        sbOooOOo0.append(z);
        sbOooOOo0.append(", ");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOO(sbOooOOo0, str, ", ", str2, ")");
    }
}
