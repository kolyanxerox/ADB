package o00OOO0;

import androidx.webkit.ProxyConfig;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.android.gms.internal.ads.C2229xd;
import java.io.EOFException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00OOOoO.o0000;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class o0OoOo0 {

    /* renamed from: OooOO0 */
    public static final char[] f32291OooOO0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: OooO */
    public final String f32292OooO;

    /* renamed from: OooO00o */
    public final String f32293OooO00o;

    /* renamed from: OooO0O0 */
    public final String f32294OooO0O0;

    /* renamed from: OooO0OO */
    public final String f32295OooO0OO;

    /* renamed from: OooO0Oo */
    public final String f32296OooO0Oo;

    /* renamed from: OooO0o */
    public final List f32297OooO0o;

    /* renamed from: OooO0o0 */
    public final int f32298OooO0o0;

    /* renamed from: OooO0oO */
    public final List f32299OooO0oO;

    /* renamed from: OooO0oo */
    public final String f32300OooO0oo;

    public o0OoOo0(C2229xd c2229xd) {
        this.f32293OooO00o = c2229xd.f25605OooO0O0;
        String str = (String) c2229xd.f25607OooO0Oo;
        this.f32294OooO0O0 = OooO0oO(str, 0, str.length(), false);
        String str2 = (String) c2229xd.f25609OooO0o0;
        this.f32295OooO0OO = OooO0oO(str2, 0, str2.length(), false);
        this.f32296OooO0Oo = (String) c2229xd.f25608OooO0o;
        int i = c2229xd.f25606OooO0OO;
        this.f32298OooO0o0 = i == -1 ? OooO0O0(c2229xd.f25605OooO0O0) : i;
        this.f32297OooO0o = OooO0oo((ArrayList) c2229xd.f25610OooO0oO, false);
        ArrayList arrayList = (ArrayList) c2229xd.f25611OooO0oo;
        this.f32299OooO0oO = arrayList != null ? OooO0oo(arrayList, true) : null;
        String str3 = (String) c2229xd.f25603OooO;
        this.f32300OooO0oo = str3 != null ? OooO0oO(str3, 0, str3.length(), false) : null;
        this.f32292OooO = c2229xd.toString();
    }

    public static boolean OooO(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && o00OOO0O.OooO0OO.OooO0oO(str.charAt(i + 1)) != -1 && o00OOO0O.OooO0OO.OooO0oO(str.charAt(i3)) != -1;
    }

    public static String OooO00o(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) throws EOFException {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z || (z2 && !OooO(iCharCount, i2, str)))) || (iCodePointAt == 43 && z3)))) {
                o0000 o0000Var = new o0000();
                o0000Var.OooOOO(i, iCharCount, str);
                o0000 o0000Var2 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            o0000Var.OooOOOO(z ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z4) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z || (z2 && !OooO(iCharCount, i2, str)))))) {
                            if (o0000Var2 == null) {
                                o0000Var2 = new o0000();
                            }
                            o0000Var2.OooOOOo(iCodePointAt2);
                            while (!o0000Var2.exhausted()) {
                                byte b = o0000Var2.readByte();
                                int i3 = b & ForkServer.ERROR;
                                o0000Var.OooOO0O(37);
                                char[] cArr = f32291OooOO0;
                                o0000Var.OooOO0O(cArr[(i3 >> 4) & 15]);
                                o0000Var.OooOO0O(cArr[b & 15]);
                            }
                        } else {
                            o0000Var.OooOOOo(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return o0000Var.readString(o0000Var.f32535OooOo0o, o00O0oO.o0OO00O.f31451OooO00o);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i2);
    }

    public static int OooO0O0(String str) {
        if (str.equals(ProxyConfig.MATCH_HTTP)) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String OooO0oO(java.lang.String r8, int r9, int r10, boolean r11) {
        /*
            r0 = r9
        L1:
            if (r0 >= r10) goto L64
            char r1 = r8.charAt(r0)
            r2 = 43
            r3 = 37
            if (r1 == r3) goto L15
            if (r1 != r2) goto L12
            if (r11 == 0) goto L12
            goto L15
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            o00OOOoO.o0000 r1 = new o00OOOoO.o0000
            r1.<init>()
            r1.OooOOO(r9, r0, r8)
        L1d:
            if (r0 >= r10) goto L5b
            int r9 = r8.codePointAt(r0)
            if (r9 != r3) goto L48
            int r4 = r0 + 2
            if (r4 >= r10) goto L48
            int r5 = r0 + 1
            char r5 = r8.charAt(r5)
            int r5 = o00OOO0O.OooO0OO.OooO0oO(r5)
            char r6 = r8.charAt(r4)
            int r6 = o00OOO0O.OooO0OO.OooO0oO(r6)
            r7 = -1
            if (r5 == r7) goto L52
            if (r6 == r7) goto L52
            int r0 = r5 << 4
            int r0 = r0 + r6
            r1.OooOO0O(r0)
            r0 = r4
            goto L55
        L48:
            if (r9 != r2) goto L52
            if (r11 == 0) goto L52
            r4 = 32
            r1.OooOO0O(r4)
            goto L55
        L52:
            r1.OooOOOo(r9)
        L55:
            int r9 = java.lang.Character.charCount(r9)
            int r0 = r0 + r9
            goto L1d
        L5b:
            long r8 = r1.f32535OooOo0o
            java.nio.charset.Charset r10 = o00O0oO.o0OO00O.f31451OooO00o
            java.lang.String r8 = r1.readString(r8, r10)
            return r8
        L64:
            java.lang.String r8 = r8.substring(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOO0.o0OoOo0.OooO0oO(java.lang.String, int, int, boolean):java.lang.String");
    }

    public static List OooO0oo(ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            arrayList2.add(str != null ? OooO0oO(str, 0, str.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static ArrayList OooOO0(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    public final String OooO0OO() {
        if (this.f32295OooO0OO.isEmpty()) {
            return "";
        }
        int length = this.f32293OooO00o.length() + 3;
        String str = this.f32292OooO;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    public final ArrayList OooO0Oo() {
        int length = this.f32293OooO00o.length() + 3;
        String str = this.f32292OooO;
        int iIndexOf = str.indexOf(47, length);
        int iOooO = o00OOO0O.OooO0OO.OooO(iIndexOf, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iOooO) {
            int i = iIndexOf + 1;
            int iOooOO0 = o00OOO0O.OooO0OO.OooOO0(str, '/', i, iOooO);
            arrayList.add(str.substring(i, iOooOO0));
            iIndexOf = iOooOO0;
        }
        return arrayList;
    }

    public final String OooO0o() {
        if (this.f32294OooO0O0.isEmpty()) {
            return "";
        }
        int length = this.f32293OooO00o.length() + 3;
        String str = this.f32292OooO;
        return str.substring(length, o00OOO0O.OooO0OO.OooO(length, str.length(), str, ":@"));
    }

    public final String OooO0o0() {
        if (this.f32299OooO0oO == null) {
            return null;
        }
        String str = this.f32292OooO;
        int iIndexOf = str.indexOf(63) + 1;
        return str.substring(iIndexOf, o00OOO0O.OooO0OO.OooOO0(str, '#', iIndexOf, str.length()));
    }

    public final URI OooOO0O() {
        C2229xd c2229xd = new C2229xd();
        String str = this.f32293OooO00o;
        c2229xd.f25605OooO0O0 = str;
        c2229xd.f25607OooO0Oo = OooO0o();
        c2229xd.f25609OooO0o0 = OooO0OO();
        c2229xd.f25608OooO0o = this.f32296OooO0Oo;
        int iOooO0O0 = OooO0O0(str);
        int i = this.f32298OooO0o0;
        if (i == iOooO0O0) {
            i = -1;
        }
        c2229xd.f25606OooO0OO = i;
        ArrayList arrayList = (ArrayList) c2229xd.f25610OooO0oO;
        arrayList.clear();
        arrayList.addAll(OooO0Oo());
        String strOooO0o0 = OooO0o0();
        String strSubstring = null;
        c2229xd.f25611OooO0oo = strOooO0o0 != null ? OooOO0(OooO00o(strOooO0o0, 0, strOooO0o0.length(), HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
        if (this.f32300OooO0oo != null) {
            String str2 = this.f32292OooO;
            strSubstring = str2.substring(str2.indexOf(35) + 1);
        }
        c2229xd.f25603OooO = strSubstring;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = (String) arrayList.get(i2);
            arrayList.set(i2, OooO00o(str3, 0, str3.length(), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, true));
        }
        ArrayList arrayList2 = (ArrayList) c2229xd.f25611OooO0oo;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str4 = (String) ((ArrayList) c2229xd.f25611OooO0oo).get(i3);
                if (str4 != null) {
                    ((ArrayList) c2229xd.f25611OooO0oo).set(i3, OooO00o(str4, 0, str4.length(), HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, true));
                }
            }
        }
        String str5 = (String) c2229xd.f25603OooO;
        if (str5 != null) {
            c2229xd.f25603OooO = OooO00o(str5, 0, str5.length(), HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, false);
        }
        String string = c2229xd.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o0OoOo0) && ((o0OoOo0) obj).f32292OooO.equals(this.f32292OooO);
    }

    public final int hashCode() {
        return this.f32292OooO.hashCode();
    }

    public final String toString() {
        return this.f32292OooO;
    }
}
