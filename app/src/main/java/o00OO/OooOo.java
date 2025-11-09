package o00OO;

import OoooO0O.o0000O00;
import o00O0oO.o000000;

/* loaded from: classes3.dex */
public class OooOo {

    /* renamed from: OooO00o */
    public int f31867OooO00o;

    /* renamed from: OooO0O0 */
    public final o0000O00 f31868OooO0O0;

    /* renamed from: OooO0OO */
    public String f31869OooO0OO;

    /* renamed from: OooO0Oo */
    public final StringBuilder f31870OooO0Oo;

    /* renamed from: OooO0o0 */
    public final String f31871OooO0o0;

    public OooOo(String source) {
        kotlin.jvm.internal.OooOo.OooO0o0(source, "source");
        o0000O00 o0000o00 = new o0000O00(5, (byte) 0);
        o0000o00.f13929OooO0OO = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        o0000o00.f13930OooO0Oo = iArr;
        o0000o00.f13928OooO0O0 = -1;
        this.f31868OooO0O0 = o0000o00;
        this.f31870OooO0Oo = new StringBuilder();
        this.f31871OooO0o0 = source;
    }

    public static /* synthetic */ void OooOO0O(OooOo oooOo, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = oooOo.f31867OooO00o;
        }
        oooOo.OooOO0(i, str, (i2 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public final String OooO(int i, int i2) {
        this.f31870OooO0Oo.append((CharSequence) this.f31871OooO0o0, i, i2);
        StringBuilder sb = this.f31870OooO0Oo;
        String string = sb.toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    public final int OooO00o(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.f31870OooO0Oo.append((char) (OooOOO0(charSequence, i + 3) + (OooOOO0(charSequence, i) << 12) + (OooOOO0(charSequence, i + 1) << 8) + (OooOOO0(charSequence, i + 2) << 4)));
            return i2;
        }
        this.f31867OooO00o = i;
        if (i2 < charSequence.length()) {
            return OooO00o(charSequence, this.f31867OooO00o);
        }
        OooOO0O(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    public boolean OooO0O0() {
        int i = this.f31867OooO00o;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f31871OooO0o0;
            if (i >= str.length()) {
                this.f31867OooO00o = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f31867OooO00o = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
    }

    public final void OooO0OO(int i, String str) {
        String str2 = this.f31871OooO0o0;
        if (str2.length() - i < str.length()) {
            OooOO0O(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                OooOO0O(this, "Expected valid boolean literal prefix, but had '" + OooO0oo() + '\'', 0, 6);
                throw null;
            }
        }
        this.f31867OooO00o = str.length() + i;
    }

    public final String OooO0Oo() {
        OooO0o0('\"');
        int i = this.f31867OooO00o;
        String str = this.f31871OooO0o0;
        int iOoooO0 = o000000.OoooO0(str, '\"', i, 4);
        if (iOoooO0 == -1) {
            OooO0oo();
            OooOO0o((byte) 1, false);
            throw null;
        }
        int i2 = i;
        while (i2 < iOoooO0) {
            if (str.charAt(i2) == '\\') {
                int iOooOOO = this.f31867OooO00o;
                char cCharAt = str.charAt(i2);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        this.f31870OooO0Oo.append((CharSequence) str, iOooOOO, i2);
                        int iOooOOO2 = OooOOO(i2 + 1);
                        if (iOooOOO2 == -1) {
                            OooOO0O(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int iOooO00o = iOooOOO2 + 1;
                        char cCharAt2 = str.charAt(iOooOOO2);
                        if (cCharAt2 == 'u') {
                            iOooO00o = OooO00o(str, iOooO00o);
                        } else {
                            char c = cCharAt2 < 'u' ? OooO0OO.f31859OooO00o[cCharAt2] : (char) 0;
                            if (c == 0) {
                                OooOO0O(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            this.f31870OooO0Oo.append(c);
                        }
                        iOooOOO = OooOOO(iOooO00o);
                        if (iOooOOO == -1) {
                            OooOO0O(this, "Unexpected EOF", iOooOOO, 4);
                            throw null;
                        }
                    } else {
                        i2++;
                        if (i2 >= str.length()) {
                            this.f31870OooO0Oo.append((CharSequence) str, iOooOOO, i2);
                            iOooOOO = OooOOO(i2);
                            if (iOooOOO == -1) {
                                OooOO0O(this, "Unexpected EOF", iOooOOO, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i2);
                        }
                    }
                    i2 = iOooOOO;
                    z = true;
                    cCharAt = str.charAt(i2);
                }
                String string = !z ? str.subSequence(iOooOOO, i2).toString() : OooO(iOooOOO, i2);
                this.f31867OooO00o = i2 + 1;
                return string;
            }
            i2++;
        }
        this.f31867OooO00o = iOoooO0 + 1;
        String strSubstring = str.substring(i, iOoooO0);
        kotlin.jvm.internal.OooOo.OooO0Oo(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x010d, code lost:
    
        if (r12 == r1) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x010f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0111, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0112, code lost:
    
        if (r1 == r12) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0114, code lost:
    
        if (r14 == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0118, code lost:
    
        if (r1 == (r12 - 1)) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x011f, code lost:
    
        if (r19 == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0121, code lost:
    
        if (r3 == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0129, code lost:
    
        if (r2.charAt(r12) != '\"') goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x012b, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x012e, code lost:
    
        OooOO0O(r22, "Expected closing quotation mark", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0135, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0136, code lost:
    
        OooOO0O(r22, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x013b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x013c, code lost:
    
        r22.f31867OooO00o = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x013e, code lost:
    
        if (r21 == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0140, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0143, code lost:
    
        if (r5 != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0145, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x014d, code lost:
    
        if (r5 != true) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x014f, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0154, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0159, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x015f, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0167, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0169, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x016b, code lost:
    
        OooOO0O(r22, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0183, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0184, code lost:
    
        OooOO0O(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0189, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x018f, code lost:
    
        throw new OooOOO0.OooO00o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0190, code lost:
    
        if (r14 == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0192, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0197, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x019a, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x019b, code lost:
    
        OooOO0O(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01a1, code lost:
    
        OooOO0O(r22, "Expected numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01a6, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooO0o() {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OO.OooOo.OooO0o():long");
    }

    public void OooO0o0(char c) {
        int i = this.f31867OooO00o;
        if (i == -1) {
            OooOOo0(c);
            throw null;
        }
        while (true) {
            String str = this.f31871OooO0o0;
            if (i >= str.length()) {
                this.f31867OooO00o = -1;
                OooOOo0(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f31867OooO00o = i2;
                if (cCharAt == c) {
                    return;
                }
                OooOOo0(c);
                throw null;
            }
            i = i2;
        }
    }

    public final String OooO0oO() {
        String str = this.f31869OooO0OO;
        if (str == null) {
            return OooO0Oo();
        }
        kotlin.jvm.internal.OooOo.OooO0O0(str);
        this.f31869OooO0OO = null;
        return str;
    }

    public final String OooO0oo() {
        String str = this.f31869OooO0OO;
        if (str != null) {
            kotlin.jvm.internal.OooOo.OooO0O0(str);
            this.f31869OooO0OO = null;
            return str;
        }
        int iOooOOOO = OooOOOO();
        String str2 = this.f31871OooO0o0;
        if (iOooOOOO >= str2.length() || iOooOOOO == -1) {
            OooOO0O(this, "EOF", iOooOOOO, 4);
            throw null;
        }
        byte bOooO0O0 = OooOOO.OooO0O0(str2.charAt(iOooOOOO));
        if (bOooO0O0 == 1) {
            return OooO0oO();
        }
        if (bOooO0O0 != 0) {
            OooOO0O(this, "Expected beginning of the string, but got " + str2.charAt(iOooOOOO), 0, 6);
            throw null;
        }
        boolean z = false;
        while (OooOOO.OooO0O0(str2.charAt(iOooOOOO)) == 0) {
            iOooOOOO++;
            if (iOooOOOO >= str2.length()) {
                this.f31870OooO0Oo.append((CharSequence) str2, this.f31867OooO00o, iOooOOOO);
                int iOooOOO = OooOOO(iOooOOOO);
                if (iOooOOO == -1) {
                    this.f31867OooO00o = iOooOOOO;
                    return OooO(0, 0);
                }
                iOooOOOO = iOooOOO;
                z = true;
            }
        }
        String string = !z ? str2.subSequence(this.f31867OooO00o, iOooOOOO).toString() : OooO(this.f31867OooO00o, iOooOOOO);
        this.f31867OooO00o = iOooOOOO;
        return string;
    }

    public final void OooOO0(int i, String message, String hint) {
        kotlin.jvm.internal.OooOo.OooO0o0(message, "message");
        kotlin.jvm.internal.OooOo.OooO0o0(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbOooOo = OooO0oO.OooOo.OooOo(message, " at path: ");
        sbOooOo.append(this.f31868OooO0O0.OooO0o0());
        sbOooOo.append(strConcat);
        String message2 = sbOooOo.toString();
        String input = this.f31871OooO0o0;
        kotlin.jvm.internal.OooOo.OooO0o0(message2, "message");
        kotlin.jvm.internal.OooOo.OooO0o0(input, "input");
        String message3 = message2 + "\nJSON input: " + ((Object) OooOOO.OooO0o0(input, i));
        kotlin.jvm.internal.OooOo.OooO0o0(message3, "message");
        if (i >= 0) {
            message3 = "Unexpected JSON token at offset " + i + ": " + message3;
        }
        kotlin.jvm.internal.OooOo.OooO0o0(message3, "message");
        throw new OooO0o(message3);
    }

    public final void OooOO0o(byte b, boolean z) {
        String str = b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == 127 ? "invalid token" : "valid token";
        int i = z ? this.f31867OooO00o - 1 : this.f31867OooO00o;
        int i2 = this.f31867OooO00o;
        String str2 = this.f31871OooO0o0;
        OooOO0O(this, OooO0oO.OooOo.OooOO0o("Expected ", str, ", but had '", (i2 == str2.length() || i < 0) ? "EOF" : String.valueOf(str2.charAt(i)), "' instead"), i, 4);
        throw null;
    }

    public final int OooOOO(int i) {
        if (i < this.f31871OooO0o0.length()) {
            return i;
        }
        return -1;
    }

    public final int OooOOO0(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        OooOO0O(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public int OooOOOO() {
        char cCharAt;
        int i = this.f31867OooO00o;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f31871OooO0o0;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.f31867OooO00o = i;
        return i;
    }

    public final boolean OooOOOo() {
        int iOooOOOO = OooOOOO();
        String str = this.f31871OooO0o0;
        if (iOooOOOO >= str.length() || iOooOOOO == -1 || str.charAt(iOooOOOO) != ',') {
            return false;
        }
        this.f31867OooO00o++;
        return true;
    }

    public final void OooOOo0(char c) {
        int i = this.f31867OooO00o;
        if (i > 0 && c == '\"') {
            try {
                this.f31867OooO00o = i - 1;
                String strOooO0oo = OooO0oo();
                this.f31867OooO00o = i;
                if (kotlin.jvm.internal.OooOo.OooO00o(strOooO0oo, "null")) {
                    OooOO0(this.f31867OooO00o - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f31867OooO00o = i;
                throw th;
            }
        }
        OooOO0o(OooOOO.OooO0O0(c), true);
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) this.f31871OooO0o0);
        sb.append("', currentPosition=");
        return OooO0oO.OooOo.OooOOO0(sb, this.f31867OooO00o, ')');
    }
}
