package com.google.android.gms.internal.ads;

import com.ironsource.C3037dc;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public class ao0 {

    /* renamed from: OooO0Oo */
    public static final xn0 f17069OooO0Oo;

    /* renamed from: OooO00o */
    public final wn0 f17070OooO00o;

    /* renamed from: OooO0O0 */
    public final Character f17071OooO0O0;

    /* renamed from: OooO0OO */
    public volatile ao0 f17072OooO0OO;

    static {
        new yn0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new yn0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new ao0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new ao0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f17069OooO0Oo = new xn0(new wn0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public ao0(wn0 wn0Var, Character ch) {
        this.f17070OooO00o = wn0Var;
        boolean z = true;
        if (ch != null) {
            byte[] bArr = wn0Var.f25345OooO0oO;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(xh0.Oooo0("Padding character %s was already in alphabet", ch));
        }
        this.f17071OooO0O0 = ch;
    }

    public int OooO00o(byte[] bArr, CharSequence charSequence) throws zn0 {
        int i;
        CharSequence charSequenceOooO0o0 = OooO0o0(charSequence);
        int length = charSequenceOooO0o0.length();
        wn0 wn0Var = this.f17070OooO00o;
        boolean[] zArr = wn0Var.f25346OooO0oo;
        int i2 = wn0Var.f25344OooO0o0;
        if (!zArr[length % i2]) {
            throw new zn0(OooO0oO.OooOo.OooO0o(charSequenceOooO0o0.length(), "Invalid input length "));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < charSequenceOooO0o0.length(); i4 += i2) {
            long jOooO00o = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = wn0Var.f25342OooO0Oo;
                if (i5 >= i2) {
                    break;
                }
                jOooO00o <<= i;
                if (i4 + i5 < charSequenceOooO0o0.length()) {
                    jOooO00o |= wn0Var.OooO00o(charSequenceOooO0o0.charAt(i6 + i4));
                    i6++;
                }
                i5++;
            }
            int i7 = i6 * i;
            int i8 = wn0Var.f25343OooO0o;
            int i9 = (i8 - 1) * 8;
            while (i9 >= (i8 * 8) - i7) {
                bArr[i3] = (byte) ((jOooO00o >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    public ao0 OooO0O0(wn0 wn0Var, Character ch) {
        return new ao0(wn0Var, ch);
    }

    public void OooO0OO(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        ii0.OoooooO(0, i, bArr.length);
        while (i2 < i) {
            wn0 wn0Var = this.f17070OooO00o;
            OooO0o(sb, bArr, i2, Math.min(wn0Var.f25343OooO0o, i - i2));
            i2 += wn0Var.f25343OooO0o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    public final ao0 OooO0Oo() {
        wn0 wn0Var;
        boolean z;
        ao0 ao0VarOooO0O0 = this.f17072OooO0OO;
        if (ao0VarOooO0O0 == null) {
            wn0 wn0Var2 = this.f17070OooO00o;
            int i = 0;
            while (true) {
                char[] cArr = wn0Var2.f25340OooO0O0;
                if (i >= cArr.length) {
                    wn0Var = wn0Var2;
                    break;
                }
                if (xh0.OoooOoO(cArr[i])) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= cArr.length) {
                            z = false;
                            break;
                        }
                        char c = cArr[i2];
                        if (c >= 'a' && c <= 'z') {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    ii0.o0OoOo0("Cannot call lowerCase() on a mixed-case alphabet", !z);
                    char[] cArr2 = new char[cArr.length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        char c2 = cArr[i3];
                        if (xh0.OoooOoO(c2)) {
                            c2 ^= 32;
                        }
                        cArr2[i3] = (char) c2;
                    }
                    wn0Var = new wn0(wn0Var2.f25339OooO00o.concat(".lowerCase()"), cArr2);
                    if (wn0Var2.f25338OooO && !wn0Var.f25338OooO) {
                        byte[] bArr = wn0Var.f25345OooO0oO;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i4 = 65; i4 <= 90; i4++) {
                            int i5 = i4 | 32;
                            byte b = bArr[i4];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                bArrCopyOf[i4] = b2;
                            } else {
                                char c3 = (char) i4;
                                char c4 = (char) i5;
                                if (b2 != -1) {
                                    throw new IllegalStateException(xh0.Oooo0("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c3), Character.valueOf(c4)));
                                }
                                bArrCopyOf[i5] = b;
                            }
                        }
                        wn0Var = new wn0(wn0Var.f25339OooO00o.concat(".ignoreCase()"), wn0Var.f25340OooO0O0, bArrCopyOf, true);
                    }
                } else {
                    i++;
                }
            }
            ao0VarOooO0O0 = wn0Var == wn0Var2 ? this : OooO0O0(wn0Var, this.f17071OooO0O0);
            this.f17072OooO0OO = ao0VarOooO0O0;
        }
        return ao0VarOooO0O0;
    }

    public final void OooO0o(StringBuilder sb, byte[] bArr, int i, int i2) {
        int i3;
        ii0.OoooooO(i, i + i2, bArr.length);
        wn0 wn0Var = this.f17070OooO00o;
        int i4 = 0;
        ii0.OoooOo0(i2 <= wn0Var.f25343OooO0o);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & ForkServer.ERROR)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        while (true) {
            int i7 = i2 * 8;
            i3 = wn0Var.f25342OooO0Oo;
            if (i4 >= i7) {
                break;
            }
            sb.append(wn0Var.f25340OooO0O0[((int) (j >>> ((i6 - i3) - i4))) & wn0Var.f25341OooO0OO]);
            i4 += i3;
        }
        if (this.f17071OooO0O0 != null) {
            while (i4 < wn0Var.f25343OooO0o * 8) {
                sb.append(C3037dc.f8244T);
                i4 += i3;
            }
        }
    }

    public final CharSequence OooO0o0(CharSequence charSequence) {
        if (this.f17071OooO0O0 == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final String OooO0oO(int i, byte[] bArr) {
        ii0.OoooooO(0, i, bArr.length);
        wn0 wn0Var = this.f17070OooO00o;
        int i2 = wn0Var.f25343OooO0o;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(wn0Var.f25344OooO0o0 * xh0.OooOoo0(i, i2));
        try {
            OooO0OO(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] OooO0oo(String str) {
        try {
            int length = (int) (((this.f17070OooO00o.f25342OooO0Oo * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int iOooO00o = OooO00o(bArr, OooO0o0(str));
            if (iOooO00o == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iOooO00o];
            System.arraycopy(bArr, 0, bArr2, 0, iOooO00o);
            return bArr2;
        } catch (zn0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ao0) {
            ao0 ao0Var = (ao0) obj;
            if (this.f17070OooO00o.equals(ao0Var.f17070OooO00o) && Objects.equals(this.f17071OooO0O0, ao0Var.f17071OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17070OooO00o.hashCode() ^ Objects.hashCode(this.f17071OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        wn0 wn0Var = this.f17070OooO00o;
        sb.append(wn0Var);
        if (8 % wn0Var.f25342OooO0Oo != 0) {
            Character ch = this.f17071OooO0O0;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public ao0(String str, String str2) {
        this(new wn0(str, str2.toCharArray()), Character.valueOf(C3037dc.f8244T));
    }
}
