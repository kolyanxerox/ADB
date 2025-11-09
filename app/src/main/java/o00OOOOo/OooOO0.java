package o00OOOOo;

import java.io.IOException;
import java.util.Locale;
import o000O00.o00O0O0O;
import o00OOOoO.o0000O0;

/* loaded from: classes3.dex */
public abstract class OooOO0 {

    /* renamed from: OooO00o */
    public static final o0000O0 f32421OooO00o;

    /* renamed from: OooO0O0 */
    public static final String[] f32422OooO0O0;

    /* renamed from: OooO0OO */
    public static final String[] f32423OooO0OO;

    /* renamed from: OooO0Oo */
    public static final String[] f32424OooO0Oo;

    static {
        o0000O0 o0000o02 = o0000O0.f32553OooOoO0;
        f32421OooO00o = o00O0O0O.OooOOOo("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f32422OooO0O0 = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f32423OooO0OO = new String[64];
        f32424OooO0Oo = new String[256];
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f32424OooO0Oo;
            if (i2 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i2)};
            byte[] bArr = o00OOO0O.OooO0OO.f32335OooO00o;
            strArr[i2] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f32423OooO0OO;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = OooO0oO.OooOo.OooOOOo(new StringBuilder(), strArr2[i3], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = f32423OooO0OO;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i6]);
            sb.append('|');
            strArr3[i7 | 8] = OooO0oO.OooOo.OooOOOo(sb, strArr3[i5], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f32423OooO0OO;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f32424OooO0Oo[i];
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String OooO00o(boolean r5, int r6, int r7, byte r8, byte r9) {
        /*
            r0 = 4
            java.lang.String[] r1 = o00OOOOo.OooOO0.f32422OooO0O0
            int r2 = r1.length
            if (r8 >= r2) goto L9
            r1 = r1[r8]
            goto L1b
        L9:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            byte[] r2 = o00OOO0O.OooO0OO.f32335OooO00o
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r3 = "0x%02x"
            java.lang.String r1 = java.lang.String.format(r2, r3, r1)
        L1b:
            if (r9 != 0) goto L20
            java.lang.String r8 = ""
            goto L69
        L20:
            r2 = 2
            java.lang.String[] r3 = o00OOOOo.OooOO0.f32424OooO0Oo
            if (r8 == r2) goto L67
            r2 = 3
            if (r8 == r2) goto L67
            if (r8 == r0) goto L5e
            r2 = 6
            if (r8 == r2) goto L5e
            r2 = 7
            if (r8 == r2) goto L67
            r2 = 8
            if (r8 == r2) goto L67
            java.lang.String[] r2 = o00OOOOo.OooOO0.f32423OooO0OO
            int r4 = r2.length
            if (r9 >= r4) goto L3c
            r2 = r2[r9]
            goto L3e
        L3c:
            r2 = r3[r9]
        L3e:
            r3 = 5
            if (r8 != r3) goto L4d
            r0 = r0 & r9
            if (r0 == 0) goto L4d
            java.lang.String r8 = "HEADERS"
            java.lang.String r9 = "PUSH_PROMISE"
            java.lang.String r8 = r2.replace(r8, r9)
            goto L69
        L4d:
            if (r8 != 0) goto L5c
            r8 = r9 & 32
            if (r8 == 0) goto L5c
            java.lang.String r8 = "PRIORITY"
            java.lang.String r9 = "COMPRESSED"
            java.lang.String r8 = r2.replace(r8, r9)
            goto L69
        L5c:
            r8 = r2
            goto L69
        L5e:
            r8 = 1
            if (r9 != r8) goto L64
            java.lang.String r8 = "ACK"
            goto L69
        L64:
            r8 = r3[r9]
            goto L69
        L67:
            r8 = r3[r9]
        L69:
            if (r5 == 0) goto L6e
            java.lang.String r5 = "<<"
            goto L70
        L6e:
            java.lang.String r5 = ">>"
        L70:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r7, r1, r8}
            byte[] r6 = o00OOO0O.OooO0OO.f32335OooO00o
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r7 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOOOo.OooOO0.OooO00o(boolean, int, int, byte, byte):java.lang.String");
    }

    public static void OooO0O0(String str, Object... objArr) {
        byte[] bArr = o00OOO0O.OooO0OO.f32335OooO00o;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static void OooO0OO(String str, Object... objArr) throws IOException {
        byte[] bArr = o00OOO0O.OooO0OO.f32335OooO00o;
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
