package o00OOOO0;

import o000O00.o00O0O0O;
import o00OOO0.o000000;
import o00OOOoO.o0000O0;
import org.apache.tika.metadata.HttpHeaders;

/* loaded from: classes3.dex */
public abstract class OooO {
    static {
        o0000O0 o0000o02 = o0000O0.f32553OooOoO0;
        o00O0O0O.OooOOOo("\"\\");
        o00O0O0O.OooOOOo("\t ,=");
    }

    public static long OooO00o(o000000 o000000Var) {
        String strOooO0OO = o000000Var.f32213OooOoOO.OooO0OO(HttpHeaders.CONTENT_LENGTH);
        if (strOooO0OO == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strOooO0OO);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean OooO0O0(o000000 o000000Var) {
        if (o000000Var.f32209OooOo0O.f32278OooO0O0.equals("HEAD")) {
            return false;
        }
        int i = o000000Var.f32208OooOo;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && OooO00o(o000000Var) == -1 && !"chunked".equalsIgnoreCase(o000000Var.OooO00o("Transfer-Encoding"))) ? false : true;
    }

    public static int OooO0OO(int i, String str) throws NumberFormatException {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ce, code lost:
    
        r14 = Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d3, code lost:
    
        if (r18 == (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01dc, code lost:
    
        if (r18 > 9223372036854775L) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01de, code lost:
    
        r30 = r18 * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e2, code lost:
    
        r30 = r11 + r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e6, code lost:
    
        if (r30 < r11) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ea, code lost:
    
        if (r30 <= com.applovin.shadow.okhttp3.internal.http.DatesKt.MAX_DATE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ed, code lost:
    
        r14 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f0, code lost:
    
        r14 = 253402300799999L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f3, code lost:
    
        r14 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f5, code lost:
    
        r0 = r37.f32296OooO0Oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f9, code lost:
    
        if (r6 != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01fb, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0201, code lost:
    
        if (r0.equals(r6) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0208, code lost:
    
        if (r0.endsWith(r6) == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x021b, code lost:
    
        if (r0.charAt((r0.length() - r6.length()) - 1) != '.') goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0227, code lost:
    
        if (o00OOO0O.OooO0OO.f32349OooOOo0.matcher(r0).matches() != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0231, code lost:
    
        if (r0.length() == r6.length()) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0233, code lost:
    
        r10 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f33175OooO0oo;
        r10.getClass();
        r11 = java.net.IDN.toUnicode(r6).split("\\.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0248, code lost:
    
        if (r10.f33176OooO00o.get() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0252, code lost:
    
        if (r10.f33176OooO00o.compareAndSet(false, true) == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0254, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0290, code lost:
    
        r28 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0292, code lost:
    
        r10.f33177OooO0O0.await();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0298, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0399, code lost:
    
        r28 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03e6, code lost:
    
        r28 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c3, code lost:
    
        r38 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cc, code lost:
    
        if (r18 != Long.MIN_VALUE) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0369 A[LOOP:10: B:212:0x0366->B:214:0x0369, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0389 A[PHI: r28
  0x0389: PHI (r28v5 java.util.List) = (r28v3 java.util.List), (r28v9 java.util.List) binds: [B:237:0x03e6, B:216:0x0387] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x039b A[PHI: r28
  0x039b: PHI (r28v7 java.util.List) = (r28v6 java.util.List), (r28v9 java.util.List) binds: [B:224:0x0399, B:216:0x0387] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO0Oo(o00OOO0.OooO0O0 r36, o00OOO0.o0OoOo0 r37, o00OOO0.o000oOoO r38) throws java.lang.InterruptedException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOOO0.OooO.OooO0Oo(o00OOO0.OooO0O0, o00OOO0.o0OoOo0, o00OOO0.o000oOoO):void");
    }

    public static int OooO0o0(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }
}
