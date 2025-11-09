package com.google.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class o0O00o0 {

    /* renamed from: OooO00o */
    public static final char[] f28300OooO00o;

    static {
        char[] cArr = new char[80];
        f28300OooO00o = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void OooO00o(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f28300OooO00o, 0, i2);
            i -= i2;
        }
    }

    public static void OooO0O0(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                OooO0O0(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                OooO0O0(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        OooO00o(i, sb);
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
            sb.append(o0OOO0.OooO0oo(ByteString.copyFromUtf8((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(o0OOO0.OooO0oo((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            OooO0OO((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            OooO00o(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        OooO0O0(sb, i3, "key", entry.getKey());
        OooO0O0(sb, i3, "value", entry.getValue());
        sb.append("\n");
        OooO00o(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO0OO(com.google.protobuf.GeneratedMessageLite r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0O00o0.OooO0OO(com.google.protobuf.GeneratedMessageLite, java.lang.StringBuilder, int):void");
    }
}
