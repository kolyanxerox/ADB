package o00O0oO;

import OooO00o.OooO00o;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOOO;
import o00O0.Oooo000;
import o00O0o.o00Oo0;
import o00O0o0O.o00O0O;
import o00O0o0O.o00Ooo;

/* loaded from: classes3.dex */
public abstract class o000000 extends o0000O00 {
    public static final int Oooo(CharSequence charSequence, String string, int i, boolean z) {
        OooOo.OooO0o0(charSequence, "<this>");
        OooOo.OooO0o0(string, "string");
        return (z || !(charSequence instanceof String)) ? OoooO00(charSequence, string, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(string, i);
    }

    public static boolean Oooo0o(String other, CharSequence charSequence) {
        OooOo.OooO0o0(charSequence, "<this>");
        OooOo.OooO0o0(other, "other");
        return OoooO0O(charSequence, other, 0, 2) >= 0;
    }

    public static boolean Oooo0o0(CharSequence charSequence, char c) {
        OooOo.OooO0o0(charSequence, "<this>");
        return OoooO0(charSequence, c, 0, 2) >= 0;
    }

    public static boolean Oooo0oO(String str, char c) {
        return str.length() > 0 && OooO00o.OooO0oO(str.charAt(Oooo0oo(str)), c, false);
    }

    public static final int Oooo0oo(CharSequence charSequence) {
        OooOo.OooO0o0(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int OoooO(CharSequence charSequence, char[] cArr, int i, boolean z) {
        OooOo.OooO0o0(charSequence, "<this>");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iOooo0oo = Oooo0oo(charSequence);
        if (i > iOooo0oo) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (OooO00o.OooO0oO(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iOooo0oo) {
                return -1;
            }
            i++;
        }
    }

    public static int OoooO0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        OooOo.OooO0o0(charSequence, "<this>");
        return !(charSequence instanceof String) ? OoooO(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static final int OoooO00(CharSequence charSequence, String str, int i, int i2, boolean z, boolean z2) {
        o00O0O o00o0o;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iOooo0oo = Oooo0oo(charSequence);
            if (i3 > iOooo0oo) {
                i3 = iOooo0oo;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            o00o0o = new o00O0O(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            o00o0o = new o00Ooo(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = o00o0o.f31436OooOo;
        int i6 = o00o0o.f31438OooOo0o;
        int i7 = o00o0o.f31437OooOo0O;
        if (!z3 || str == null) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (!OoooOOo(str, 0, charSequence, i8, str.length(), z)) {
                    if (i8 != i6) {
                        i8 += i5;
                    }
                }
                return i8;
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!o0000O00.Oooo00O(str, 0, z, (String) charSequence, i9, str.length())) {
                if (i9 != i6) {
                    i9 += i5;
                }
            }
            return i9;
        }
        return -1;
    }

    public static /* synthetic */ int OoooO0O(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return Oooo(charSequence, str, i, false);
    }

    public static boolean OoooOO0(CharSequence charSequence) {
        OooOo.OooO0o0(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!OooO00o.OooOOo0(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int OoooOOO(String string, CharSequence charSequence, int i) {
        int iOooo0oo = (i & 2) != 0 ? Oooo0oo(charSequence) : 0;
        OooOo.OooO0o0(charSequence, "<this>");
        OooOo.OooO0o0(string, "string");
        return !(charSequence instanceof String) ? OoooO00(charSequence, string, iOooo0oo, 0, false, true) : ((String) charSequence).lastIndexOf(string, iOooo0oo);
    }

    public static final boolean OoooOOo(String str, int i, CharSequence other, int i2, int i3, boolean z) {
        OooOo.OooO0o0(str, "<this>");
        OooOo.OooO0o0(other, "other");
        if (i2 >= 0 && i >= 0 && i <= str.length() - i3 && i2 <= other.length() - i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (OooO00o.OooO0oO(str.charAt(i + i4), other.charAt(i2 + i4), z)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String OoooOo0(String str, String prefix) {
        OooOo.OooO0o0(str, "<this>");
        OooOo.OooO0o0(prefix, "prefix");
        if (!OooooO0(str, prefix)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        OooOo.OooO0Oo(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String OoooOoO(String str, String str2) {
        OooOo.OooO0o0(str, "<this>");
        if (!o0000O00.OooOooo(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        OooOo.OooO0Oo(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final List OoooOoo(String str, String str2) {
        int iOooo = Oooo(str, str2, 0, false);
        if (iOooo == -1) {
            return o0OO0O0.OooOO0o(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(str.subSequence(length, iOooo).toString());
            length = str2.length() + iOooo;
            iOooo = Oooo(str, str2, length, false);
        } while (iOooo != -1);
        arrayList.add(str.subSequence(length, str.length()).toString());
        return arrayList;
    }

    public static List Ooooo00(String str, char[] cArr) {
        OooOo.OooO0o0(str, "<this>");
        if (cArr.length == 1) {
            return OoooOoo(str, String.valueOf(cArr[0]));
        }
        o00Oo0 o00oo0 = new o00Oo0(new o00O0Oo0.o00Oo0(str, new o00O.o0OO00O(cArr, 1)));
        ArrayList arrayList = new ArrayList(Oooo000.OooOo0(o00oo0, 10));
        Iterator it = o00oo0.iterator();
        while (true) {
            oo0o0Oo oo0o0oo = (oo0o0Oo) it;
            if (!oo0o0oo.hasNext()) {
                return arrayList;
            }
            o00Ooo range = (o00Ooo) oo0o0oo.next();
            OooOo.OooO0o0(range, "range");
            arrayList.add(str.subSequence(range.f31437OooOo0O, range.f31438OooOo0o + 1).toString());
        }
    }

    public static List Ooooo0o(String str, String[] strArr) {
        OooOo.OooO0o0(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return OoooOoo(str, str2);
            }
        }
        o00Oo0 o00oo0 = new o00Oo0(new o00O0Oo0.o00Oo0(str, new o00O.o0OO00O(OooOOO.Oooo000(strArr), 2)));
        ArrayList arrayList = new ArrayList(Oooo000.OooOo0(o00oo0, 10));
        Iterator it = o00oo0.iterator();
        while (true) {
            oo0o0Oo oo0o0oo = (oo0o0Oo) it;
            if (!oo0o0oo.hasNext()) {
                return arrayList;
            }
            o00Ooo range = (o00Ooo) oo0o0oo.next();
            OooOo.OooO0o0(range, "range");
            arrayList.add(str.subSequence(range.f31437OooOo0O, range.f31438OooOo0o + 1).toString());
        }
    }

    public static boolean OooooO0(String str, String prefix) {
        OooOo.OooO0o0(str, "<this>");
        OooOo.OooO0o0(prefix, "prefix");
        return o0000O00.Oooo0OO(str, prefix, false);
    }

    public static String OooooOO(String str, String delimiter) {
        OooOo.OooO0o0(delimiter, "delimiter");
        int iOoooO0O = OoooO0O(str, delimiter, 0, 6);
        if (iOoooO0O == -1) {
            return str;
        }
        String strSubstring = str.substring(delimiter.length() + iOoooO0O, str.length());
        OooOo.OooO0Oo(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String OooooOo(char c, String str, String str2) {
        int iO000oOoO = o000oOoO(str, c, 0, 6);
        if (iO000oOoO == -1) {
            return str2;
        }
        String strSubstring = str.substring(iO000oOoO + 1, str.length());
        OooOo.OooO0Oo(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Oooooo(int i, String str) {
        OooOo.OooO0o0(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        OooOo.OooO0Oo(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Oooooo0(String missingDelimiterValue, String str) {
        OooOo.OooO0o0(missingDelimiterValue, "<this>");
        OooOo.OooO0o0(missingDelimiterValue, "missingDelimiterValue");
        int iOoooOOO = OoooOOO(str, missingDelimiterValue, 6);
        if (iOoooOOO == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(str.length() + iOoooOOO, missingDelimiterValue.length());
        OooOo.OooO0Oo(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence OoooooO(String str) {
        OooOo.OooO0o0(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zOooOOo0 = OooO00o.OooOOo0(str.charAt(!z ? i : length));
            if (z) {
                if (!zOooOOo0) {
                    break;
                }
                length--;
            } else if (zOooOOo0) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static String Ooooooo(String str, char... cArr) {
        OooOo.OooO0o0(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z ? i : length);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            boolean z2 = i2 >= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static int o000oOoO(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = Oooo0oo(str);
        }
        OooOo.OooO0o0(str, "<this>");
        return str.lastIndexOf(c, i);
    }
}
