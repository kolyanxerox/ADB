package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class u01 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f24547OooO00o;

    static {
        char[] cArr = new char[80];
        f24547OooO00o = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void OooO00o(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                OooO00o(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                OooO00o(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        OooO0O0(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            hz0 hz0Var = jz0.f20406OooOo0o;
            sb.append(xh0.OooOOOo(new hz0(((String) obj).getBytes(i01.f19888OooO00o))));
            sb.append('\"');
            return;
        }
        if (obj instanceof jz0) {
            sb.append(": \"");
            sb.append(xh0.OooOOOo((jz0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zz0) {
            sb.append(" {");
            OooO0OO((zz0) obj, sb, i + 2);
            sb.append("\n");
            OooO0O0(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        OooO00o(sb, i3, "key", entry.getKey());
        OooO00o(sb, i3, "value", entry.getValue());
        sb.append("\n");
        OooO0O0(i, sb);
        sb.append("}");
    }

    public static void OooO0O0(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f24547OooO00o, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO0OO(com.google.android.gms.internal.ads.zz0 r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u01.OooO0OO(com.google.android.gms.internal.ads.zz0, java.lang.StringBuilder, int):void");
    }
}
