package o00OOO0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class o000oOoO {

    /* renamed from: OooO00o */
    public final String[] f32243OooO00o;

    public o000oOoO(o000Ooo.o00oO0o o00oo0o) {
        ArrayList arrayList = (ArrayList) o00oo0o.f30487OooOo0o;
        this.f32243OooO00o = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void OooO00o(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i), str};
                byte[] bArr = o00OOO0O.OooO0OO.f32335OooO00o;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
            }
        }
    }

    public static void OooO0O0(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(OooO0oO.OooOo.OooOO0O("value for name ", str2, " == null"));
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str};
                byte[] bArr = o00OOO0O.OooO0OO.f32335OooO00o;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr));
            }
        }
    }

    public final String OooO0OO(String str) {
        String[] strArr = this.f32243OooO00o;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String OooO0Oo(int i) {
        return this.f32243OooO00o[i * 2];
    }

    public final int OooO0o() {
        return this.f32243OooO00o.length / 2;
    }

    public final o000Ooo.o00oO0o OooO0o0() {
        o000Ooo.o00oO0o o00oo0o = new o000Ooo.o00oO0o(15);
        Collections.addAll((ArrayList) o00oo0o.f30487OooOo0o, this.f32243OooO00o);
        return o00oo0o;
    }

    public final TreeMap OooO0oO() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int iOooO0o = OooO0o();
        for (int i = 0; i < iOooO0o; i++) {
            String lowerCase = OooO0Oo(i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(OooO0oo(i));
        }
        return treeMap;
    }

    public final String OooO0oo(int i) {
        return this.f32243OooO00o[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o000oOoO) && Arrays.equals(((o000oOoO) obj).f32243OooO00o, this.f32243OooO00o);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f32243OooO00o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iOooO0o = OooO0o();
        for (int i = 0; i < iOooO0o; i++) {
            sb.append(OooO0Oo(i));
            sb.append(": ");
            sb.append(OooO0oo(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
