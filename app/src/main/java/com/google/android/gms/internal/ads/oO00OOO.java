package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class oO00OOO {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f22484OooO0OO = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final Pattern f22485OooO0Oo = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final r40 f22486OooO00o = new r40();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final StringBuilder f22487OooO0O0 = new StringBuilder();

    public static String OooO00o(r40 r40Var, StringBuilder sb) {
        OooO0O0(r40Var);
        if (r40Var.OooOOOO() == 0) {
            return null;
        }
        String strOooO0OO = OooO0OO(r40Var, sb);
        if (!"".equals(strOooO0OO)) {
            return strOooO0OO;
        }
        char cOooOo0O = (char) r40Var.OooOo0O();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cOooOo0O);
        return sb2.toString();
    }

    public static void OooO0O0(r40 r40Var) {
        while (true) {
            for (boolean z = true; r40Var.OooOOOO() > 0 && z; z = false) {
                int i = r40Var.f23746OooO0O0;
                byte[] bArr = r40Var.f23745OooO00o;
                byte b = bArr[i];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    r40Var.OooOO0O(1);
                } else {
                    int i2 = r40Var.f23747OooO0OO;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (b == 47) {
                            int i4 = i + 2;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i2 = i4 + 2;
                                        i4 = i2;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                r40Var.OooOO0O(i2 - r40Var.f23746OooO0O0);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String OooO0OO(r40 r40Var, StringBuilder sb) {
        boolean z;
        char c;
        sb.setLength(0);
        int i = r40Var.f23746OooO0O0;
        int i2 = r40Var.f23747OooO0OO;
        loop0: while (true) {
            for (false; i < i2 && !z; true) {
                c = (char) r40Var.f23745OooO00o[i];
                z = (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_');
            }
            sb.append(c);
            i++;
        }
        r40Var.OooOO0O(i - r40Var.f23746OooO0O0);
        return sb.toString();
    }
}
