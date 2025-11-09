package OoooOOO;

import android.os.Bundle;
import com.ironsource.C3034d9;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class oO00000o {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final oO00000o f14610OooO0OO = new oO00000o(100);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final EnumMap f14611OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f14612OooO0O0;

    public oO00000o(int i) {
        EnumMap enumMap = new EnumMap(oO00000.class);
        this.f14611OooO00o = enumMap;
        oO00000 oo00000 = oO00000.AD_STORAGE;
        ooo0Oo0 ooo0oo0 = ooo0Oo0.UNINITIALIZED;
        enumMap.put((EnumMap) oo00000, (oO00000) ooo0oo0);
        enumMap.put((EnumMap) oO00000.ANALYTICS_STORAGE, (oO00000) ooo0oo0);
        this.f14612OooO0O0 = i;
    }

    public static String OooO00o(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static oO00000o OooO0O0(int i, Bundle bundle) {
        if (bundle == null) {
            return new oO00000o(i);
        }
        EnumMap enumMap = new EnumMap(oO00000.class);
        for (oO00000 oo00000 : EnumC0000o.STORAGE.f14082OooOo0O) {
            enumMap.put((EnumMap) oo00000, (oO00000) OooO0Oo(bundle.getString(oo00000.f14609OooOo0O)));
        }
        return new oO00000o(enumMap, i);
    }

    public static oO00000o OooO0OO(int i, String str) {
        EnumMap enumMap = new EnumMap(oO00000.class);
        EnumC0000o enumC0000o = EnumC0000o.STORAGE;
        int i2 = 0;
        while (true) {
            oO00000[] oo00000Arr = enumC0000o.f14082OooOo0O;
            if (i2 >= oo00000Arr.length) {
                return new oO00000o(enumMap, i);
            }
            String str2 = str == null ? "" : str;
            oO00000 oo00000 = oo00000Arr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) oo00000, (oO00000) OooO0o0(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) oo00000, (oO00000) ooo0Oo0.UNINITIALIZED);
            }
            i2++;
        }
    }

    public static ooo0Oo0 OooO0Oo(String str) {
        ooo0Oo0 ooo0oo0 = ooo0Oo0.UNINITIALIZED;
        return str == null ? ooo0oo0 : str.equals("granted") ? ooo0Oo0.GRANTED : str.equals("denied") ? ooo0Oo0.DENIED : ooo0oo0;
    }

    public static ooo0Oo0 OooO0o0(char c) {
        return c != '+' ? c != '0' ? c != '1' ? ooo0Oo0.UNINITIALIZED : ooo0Oo0.GRANTED : ooo0Oo0.DENIED : ooo0Oo0.POLICY;
    }

    public static char OooO0oo(ooo0Oo0 ooo0oo0) {
        if (ooo0oo0 == null) {
            return '-';
        }
        int iOrdinal = ooo0oo0.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean OooOO0o(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean OooO(oO00000 oo00000) {
        return ((ooo0Oo0) this.f14611OooO00o.get(oo00000)) != ooo0Oo0.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String OooO0o() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            OoooOOO.o r1 = OoooOOO.EnumC0000o.STORAGE
            OoooOOO.oO00000[] r1 = r1.f14082OooOo0O
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L38
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f14611OooO00o
            java.lang.Object r4 = r5.get(r4)
            OoooOOO.ooo0Oo0 r4 = (OoooOOO.ooo0Oo0) r4
            r5 = 45
            if (r4 == 0) goto L32
            int r4 = r4.ordinal()
            if (r4 == 0) goto L32
            r6 = 1
            if (r4 == r6) goto L30
            r6 = 2
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L30
            goto L32
        L2d:
            r5 = 48
            goto L32
        L30:
            r5 = 49
        L32:
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L38:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.oO00000o.OooO0o():java.lang.String");
    }

    public final String OooO0oO() {
        StringBuilder sb = new StringBuilder("G1");
        for (oO00000 oo00000 : EnumC0000o.STORAGE.f14082OooOo0O) {
            sb.append(OooO0oo((ooo0Oo0) this.f14611OooO00o.get(oo00000)));
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OoooOOO.oO00000o OooOO0(OoooOOO.oO00000o r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<OoooOOO.oO00000> r1 = OoooOOO.oO00000.class
            r0.<init>(r1)
            OoooOOO.o r1 = OoooOOO.EnumC0000o.STORAGE
            OoooOOO.oO00000[] r1 = r1.f14082OooOo0O
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f14611OooO00o
            java.lang.Object r5 = r5.get(r4)
            OoooOOO.ooo0Oo0 r5 = (OoooOOO.ooo0Oo0) r5
            java.util.EnumMap r6 = r9.f14611OooO00o
            java.lang.Object r6 = r6.get(r4)
            OoooOOO.ooo0Oo0 r6 = (OoooOOO.ooo0Oo0) r6
            if (r5 != 0) goto L24
            goto L31
        L24:
            if (r6 == 0) goto L40
            OoooOOO.ooo0Oo0 r7 = OoooOOO.ooo0Oo0.UNINITIALIZED
            if (r5 != r7) goto L2b
            goto L31
        L2b:
            if (r6 == r7) goto L40
            OoooOOO.ooo0Oo0 r7 = OoooOOO.ooo0Oo0.POLICY
            if (r5 != r7) goto L33
        L31:
            r5 = r6
            goto L40
        L33:
            if (r6 == r7) goto L40
            OoooOOO.ooo0Oo0 r7 = OoooOOO.ooo0Oo0.DENIED
            if (r5 == r7) goto L3f
            if (r6 != r7) goto L3c
            goto L3f
        L3c:
            OoooOOO.ooo0Oo0 r5 = OoooOOO.ooo0Oo0.GRANTED
            goto L40
        L3f:
            r5 = r7
        L40:
            if (r5 == 0) goto L45
            r0.put(r4, r5)
        L45:
            int r3 = r3 + 1
            goto Ld
        L48:
            OoooOOO.oO00000o r9 = new OoooOOO.oO00000o
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.oO00000o.OooOO0(OoooOOO.oO00000o):OoooOOO.oO00000o");
    }

    public final oO00000o OooOO0O(oO00000o oo00000o) {
        EnumMap enumMap = new EnumMap(oO00000.class);
        for (oO00000 oo00000 : EnumC0000o.STORAGE.f14082OooOo0O) {
            ooo0Oo0 ooo0oo0 = (ooo0Oo0) this.f14611OooO00o.get(oo00000);
            if (ooo0oo0 == ooo0Oo0.UNINITIALIZED) {
                ooo0oo0 = (ooo0Oo0) oo00000o.f14611OooO00o.get(oo00000);
            }
            if (ooo0oo0 != null) {
                enumMap.put((EnumMap) oo00000, (oO00000) ooo0oo0);
            }
        }
        return new oO00000o(enumMap, this.f14612OooO0O0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oO00000o)) {
            return false;
        }
        oO00000o oo00000o = (oO00000o) obj;
        for (oO00000 oo00000 : EnumC0000o.STORAGE.f14082OooOo0O) {
            if (this.f14611OooO00o.get(oo00000) != oo00000o.f14611OooO00o.get(oo00000)) {
                return false;
            }
        }
        return this.f14612OooO0O0 == oo00000o.f14612OooO0O0;
    }

    public final int hashCode() {
        Iterator it = this.f14611OooO00o.values().iterator();
        int iHashCode = this.f14612OooO0O0 * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((ooo0Oo0) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(OooO00o(this.f14612OooO0O0));
        for (oO00000 oo00000 : EnumC0000o.STORAGE.f14082OooOo0O) {
            sb.append(",");
            sb.append(oo00000.f14609OooOo0O);
            sb.append(C3034d9.i.f8173b);
            ooo0Oo0 ooo0oo0 = (ooo0Oo0) this.f14611OooO00o.get(oo00000);
            if (ooo0oo0 == null) {
                ooo0oo0 = ooo0Oo0.UNINITIALIZED;
            }
            sb.append(ooo0oo0);
        }
        return sb.toString();
    }

    public oO00000o(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(oO00000.class);
        this.f14611OooO00o = enumMap2;
        enumMap2.putAll(enumMap);
        this.f14612OooO0O0 = i;
    }
}
