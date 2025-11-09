package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class oo0OOoo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f27212OooO00o;

    static {
        char[] cArr = new char[80];
        f27212OooO00o = cArr;
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
            sb.append(o0O000Oo.OooO0o0(new o0O00000(((String) obj).getBytes(o0oO0Ooo.f27160OooO00o))));
            sb.append('\"');
            return;
        }
        if (obj instanceof o0O00000) {
            sb.append(": \"");
            sb.append(o0O000Oo.OooO0o0((o0O00000) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof o0OoO00O) {
            sb.append(" {");
            OooO0OO((o0OoO00O) obj, sb, i + 2);
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
            sb.append(f27212OooO00o, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO0OO(com.google.android.gms.internal.play_billing.o0OoO00O r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.oo0OOoo.OooO0OO(com.google.android.gms.internal.play_billing.o0OoO00O, java.lang.StringBuilder, int):void");
    }
}
