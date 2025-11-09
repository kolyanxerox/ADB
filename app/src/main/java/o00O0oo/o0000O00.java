package o00O0oO;

import OooO0oO.OooOo;
import o00O0.OooO;
import o00O0.OooO0O0;

/* loaded from: classes3.dex */
public abstract class o0000O00 extends o0000 {
    public static String OooOoo(char[] cArr, int i, int i2) {
        OooO0O0 oooO0O0 = OooO.Companion;
        int length = cArr.length;
        oooO0O0.getClass();
        if (i < 0 || i2 > length) {
            StringBuilder sbOooOo0o = OooOo.OooOo0o("startIndex: ", i, ", endIndex: ", i2, ", size: ");
            sbOooOo0o.append(length);
            throw new IndexOutOfBoundsException(sbOooOo0o.toString());
        }
        if (i <= i2) {
            return new String(cArr, i, i2 - i);
        }
        throw new IllegalArgumentException(OooOo.OooO0o0(i, i2, "startIndex: ", " > endIndex: "));
    }

    public static String OooOooO(byte[] bArr) {
        kotlin.jvm.internal.OooOo.OooO0o0(bArr, "<this>");
        return new String(bArr, o0OO00O.f31451OooO00o);
    }

    public static boolean OooOooo(String str, String suffix, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(suffix, "suffix");
        return !z ? str.endsWith(suffix) : Oooo00O(str, str.length() - suffix.length(), true, suffix, 0, suffix.length());
    }

    public static String Oooo0(String str, String str2, String str3) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<this>");
        int iOooo = o000000.Oooo(str, str2, 0, false);
        if (iOooo < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iOooo);
            sb.append(str3);
            i2 = iOooo + length;
            if (iOooo >= str.length()) {
                break;
            }
            iOooo = o000000.Oooo(str, str2, iOooo + i, false);
        } while (iOooo > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "toString(...)");
        return string;
    }

    public static boolean Oooo000(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static boolean Oooo00O(String str, int i, boolean z, String other, int i2, int i3) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(other, "other");
        return !z ? str.regionMatches(i, other, i2, i3) : str.regionMatches(z, i, other, i2, i3);
    }

    public static String Oooo00o(String str, char c, char c2) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<this>");
        String strReplace = str.replace(c, c2);
        kotlin.jvm.internal.OooOo.OooO0Oo(strReplace, "replace(...)");
        return strReplace;
    }

    public static boolean Oooo0O0(String str, int i, String str2, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<this>");
        return !z ? str.startsWith(str2, i) : Oooo00O(str, i, z, str2, 0, str2.length());
    }

    public static boolean Oooo0OO(String str, String prefix, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(prefix, "prefix");
        return !z ? str.startsWith(prefix) : Oooo00O(str, 0, z, prefix, 0, prefix.length());
    }
}
