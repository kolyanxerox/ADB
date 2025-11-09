package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Utf8;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class r40 {

    /* renamed from: OooO00o */
    public byte[] f23745OooO00o;

    /* renamed from: OooO0O0 */
    public int f23746OooO0O0;

    /* renamed from: OooO0OO */
    public int f23747OooO0OO;

    /* renamed from: OooO0Oo */
    public static final char[] f23742OooO0Oo = {'\r', '\n'};

    /* renamed from: OooO0o0 */
    public static final char[] f23744OooO0o0 = {'\n'};

    /* renamed from: OooO0o */
    public static final um0 f23743OooO0o = um0.OooOOOo(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    public r40(byte[] bArr, int i) {
        this.f23745OooO00o = bArr;
        this.f23747OooO0OO = i;
    }

    public final void OooO(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f23745OooO00o.length) {
            z = true;
        }
        af0.OoooO0(z);
        this.f23747OooO0OO = i;
    }

    public final String OooO00o(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f23746OooO0O0;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.f23747OooO0OO || this.f23745OooO00o[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f23745OooO00o;
        int i5 = i80.f19994OooO00o;
        String str = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.f23746OooO0O0 += i;
        return str;
    }

    public final String OooO0O0(int i, Charset charset) {
        byte[] bArr = this.f23745OooO00o;
        int i2 = this.f23746OooO0O0;
        String str = new String(bArr, i2, i, charset);
        this.f23746OooO0O0 = i2 + i;
        return str;
    }

    public final Charset OooO0OO() {
        int i = this.f23747OooO0OO;
        int i2 = this.f23746OooO0O0;
        int i3 = i - i2;
        if (i3 >= 3) {
            byte[] bArr = this.f23745OooO00o;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f23746OooO0O0 = i2 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (i3 < 2) {
            return null;
        }
        byte[] bArr2 = this.f23745OooO00o;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.f23746OooO0O0 = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f23746OooO0O0 = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final short OooO0Oo() {
        byte[] bArr = this.f23745OooO00o;
        int i = this.f23746OooO0O0;
        int i2 = i + 1;
        this.f23746OooO0O0 = i2;
        int i3 = bArr[i] & ForkServer.ERROR;
        this.f23746OooO0O0 = i + 2;
        return (short) ((bArr[i2] & ForkServer.ERROR) | (i3 << 8));
    }

    public final void OooO0o(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f23745OooO00o, this.f23746OooO0O0, bArr, i, i2);
        this.f23746OooO0O0 += i2;
    }

    public final void OooO0o0(int i) {
        byte[] bArr = this.f23745OooO00o;
        if (i > bArr.length) {
            this.f23745OooO00o = Arrays.copyOf(bArr, i);
        }
    }

    public final void OooO0oO(int i) {
        byte[] bArr = this.f23745OooO00o;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        OooO0oo(i, bArr);
    }

    public final void OooO0oo(int i, byte[] bArr) {
        this.f23745OooO00o = bArr;
        this.f23747OooO0OO = i;
        this.f23746OooO0O0 = 0;
    }

    public final void OooOO0(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f23747OooO0OO) {
            z = true;
        }
        af0.OoooO0(z);
        this.f23746OooO0O0 = i;
    }

    public final void OooOO0O(int i) {
        OooOO0(this.f23746OooO0O0 + i);
    }

    public final byte[] OooOO0o() {
        return this.f23745OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOOO(java.nio.charset.Charset r10) {
        /*
            r9 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r10.equals(r0)
            java.lang.String r1 = "Out of range: %s"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L14
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L32
        L14:
            int r0 = r9.f23747OooO0OO
            int r4 = r9.f23746OooO0O0
            int r0 = r0 - r4
            if (r0 <= 0) goto L32
            byte[] r10 = r9.f23745OooO00o
            r10 = r10[r4]
            r10 = r10 & 255(0xff, float:3.57E-43)
            long r4 = (long) r10
            int r10 = (int) r4
            char r10 = (char) r10
            long r6 = (long) r10
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L2b
            r0 = r3
            goto L2c
        L2b:
            r0 = r2
        L2c:
            com.google.android.gms.internal.ads.ii0.OooooOo(r4, r1, r0)
            byte r10 = (byte) r10
            r4 = r3
            goto L73
        L32:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r10.equals(r0)
            r4 = 2
            if (r0 != 0) goto L43
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L59
        L43:
            int r0 = r9.f23747OooO0OO
            int r5 = r9.f23746OooO0O0
            int r0 = r0 - r5
            if (r0 < r4) goto L59
            byte[] r10 = r9.f23745OooO00o
            r0 = r10[r5]
            int r5 = r5 + r3
            r10 = r10[r5]
            int r0 = r0 << 8
        L53:
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r10 | r0
            char r10 = (char) r10
            byte r10 = (byte) r10
            goto L73
        L59:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L83
            int r10 = r9.f23747OooO0OO
            int r0 = r9.f23746OooO0O0
            int r10 = r10 - r0
            if (r10 < r4) goto L83
            byte[] r10 = r9.f23745OooO00o
            int r5 = r0 + 1
            r5 = r10[r5]
            r10 = r10[r0]
            int r0 = r5 << 8
            goto L53
        L73:
            long r5 = (long) r10
            int r10 = (int) r5
            char r10 = (char) r10
            long r7 = (long) r10
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L7c
            r2 = r3
        L7c:
            com.google.android.gms.internal.ads.ii0.OooooOo(r5, r1, r2)
            int r10 = r10 << 16
            int r10 = r10 + r4
            return r10
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r40.OooOOO(java.nio.charset.Charset):int");
    }

    public final char OooOOO0(Charset charset, char[] cArr) {
        int iOooOOO = OooOOO(charset);
        if (iOooOOO != 0) {
            int i = iOooOOO >> 16;
            for (char c : cArr) {
                char c2 = (char) i;
                if (c == c2) {
                    this.f23746OooO0O0 += (char) iOooOOO;
                    return c2;
                }
            }
        }
        return (char) 0;
    }

    public final int OooOOOO() {
        return this.f23747OooO0OO - this.f23746OooO0O0;
    }

    public final int OooOOOo() {
        return this.f23746OooO0O0;
    }

    public final int OooOOo() {
        byte[] bArr = this.f23745OooO00o;
        int i = this.f23746OooO0O0;
        int i2 = i + 1;
        this.f23746OooO0O0 = i2;
        int i3 = bArr[i] & ForkServer.ERROR;
        int i4 = i + 2;
        this.f23746OooO0O0 = i4;
        int i5 = bArr[i2] & ForkServer.ERROR;
        int i6 = i + 3;
        this.f23746OooO0O0 = i6;
        int i7 = bArr[i4] & ForkServer.ERROR;
        this.f23746OooO0O0 = i + 4;
        return ((bArr[i6] & ForkServer.ERROR) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final int OooOOo0() {
        byte[] bArr = this.f23745OooO00o;
        int i = this.f23746OooO0O0;
        int i2 = i + 1;
        this.f23746OooO0O0 = i2;
        int i3 = bArr[i] & ForkServer.ERROR;
        int i4 = i + 2;
        this.f23746OooO0O0 = i4;
        int i5 = bArr[i2] & ForkServer.ERROR;
        int i6 = i + 3;
        this.f23746OooO0O0 = i6;
        int i7 = bArr[i4] & ForkServer.ERROR;
        this.f23746OooO0O0 = i + 4;
        return (bArr[i6] & ForkServer.ERROR) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    public final int OooOOoo() {
        int iOooOOo = OooOOo();
        if (iOooOOo >= 0) {
            return iOooOOo;
        }
        throw new IllegalStateException(OooO0oO.OooOo.OooO0o(iOooOOo, "Top bit not zero: "));
    }

    public final int OooOo() {
        byte[] bArr = this.f23745OooO00o;
        int i = this.f23746OooO0O0;
        int i2 = i + 1;
        this.f23746OooO0O0 = i2;
        int i3 = bArr[i] & ForkServer.ERROR;
        int i4 = i + 2;
        this.f23746OooO0O0 = i4;
        int i5 = bArr[i2] & ForkServer.ERROR;
        this.f23746OooO0O0 = i + 3;
        return (bArr[i4] & ForkServer.ERROR) | (i3 << 16) | (i5 << 8);
    }

    public final int OooOo0() {
        return (OooOo0O() << 21) | (OooOo0O() << 14) | (OooOo0O() << 7) | OooOo0O();
    }

    public final int OooOo00() {
        byte[] bArr = this.f23745OooO00o;
        int i = this.f23746OooO0O0;
        int i2 = i + 1;
        this.f23746OooO0O0 = i2;
        int i3 = bArr[i] & ForkServer.ERROR;
        this.f23746OooO0O0 = i + 2;
        return ((bArr[i2] & ForkServer.ERROR) << 8) | i3;
    }

    public final int OooOo0O() {
        byte[] bArr = this.f23745OooO00o;
        int i = this.f23746OooO0O0;
        this.f23746OooO0O0 = i + 1;
        return bArr[i] & ForkServer.ERROR;
    }

    public final int OooOo0o() {
        byte[] bArr = this.f23745OooO00o;
        int i = this.f23746OooO0O0;
        int i2 = i + 1;
        this.f23746OooO0O0 = i2;
        int i3 = bArr[i] & ForkServer.ERROR;
        this.f23746OooO0O0 = i + 2;
        int i4 = bArr[i2] & ForkServer.ERROR;
        this.f23746OooO0O0 = i + 4;
        return i4 | (i3 << 8);
    }

    public final int OooOoO() {
        byte[] bArr = this.f23745OooO00o;
        int i = this.f23746OooO0O0;
        int i2 = i + 1;
        this.f23746OooO0O0 = i2;
        int i3 = bArr[i] & ForkServer.ERROR;
        this.f23746OooO0O0 = i + 2;
        return (bArr[i2] & ForkServer.ERROR) | (i3 << 8);
    }

    public final int OooOoO0() {
        int iOooOOo0 = OooOOo0();
        if (iOooOOo0 >= 0) {
            return iOooOOo0;
        }
        throw new IllegalStateException(OooO0oO.OooOo.OooO0o(iOooOOo0, "Top bit not zero: "));
    }

    public final long OooOoOO() {
        byte[] bArr = this.f23745OooO00o;
        int i = this.f23746OooO0O0;
        int i2 = i + 1;
        this.f23746OooO0O0 = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.f23746OooO0O0 = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.f23746OooO0O0 = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.f23746OooO0O0 = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.f23746OooO0O0 = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.f23746OooO0O0 = i7;
        long j6 = bArr[i6];
        this.f23746OooO0O0 = i + 7;
        long j7 = bArr[i7];
        this.f23746OooO0O0 = i + 8;
        return ((bArr[r3] & 255) << 56) | (255 & j) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((j7 & 255) << 48);
    }

    public final long OooOoo() {
        byte[] bArr = this.f23745OooO00o;
        int i = this.f23746OooO0O0;
        int i2 = i + 1;
        this.f23746OooO0O0 = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.f23746OooO0O0 = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.f23746OooO0O0 = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.f23746OooO0O0 = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.f23746OooO0O0 = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.f23746OooO0O0 = i7;
        long j6 = bArr[i6];
        this.f23746OooO0O0 = i + 7;
        long j7 = bArr[i7];
        this.f23746OooO0O0 = i + 8;
        return (bArr[r3] & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long OooOoo0() {
        byte[] bArr = this.f23745OooO00o;
        int i = this.f23746OooO0O0;
        int i2 = i + 1;
        this.f23746OooO0O0 = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.f23746OooO0O0 = i3;
        long j2 = bArr[i2];
        this.f23746OooO0O0 = i + 3;
        long j3 = bArr[i3];
        this.f23746OooO0O0 = i + 4;
        return ((bArr[r2] & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final long OooOooO() {
        byte[] bArr = this.f23745OooO00o;
        int i = this.f23746OooO0O0;
        int i2 = i + 1;
        this.f23746OooO0O0 = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.f23746OooO0O0 = i3;
        long j2 = bArr[i2];
        this.f23746OooO0O0 = i + 3;
        long j3 = bArr[i3];
        this.f23746OooO0O0 = i + 4;
        return (bArr[r2] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long OooOooo() {
        long jOooOoo = OooOoo();
        if (jOooOoo >= 0) {
            return jOooOoo;
        }
        throw new IllegalStateException(OooO0oO.OooOo.OooO0oo(jOooOoo, "Top bit not zero: "));
    }

    public final long Oooo000() {
        int i;
        int i2;
        long j = this.f23745OooO00o[this.f23746OooO0O0];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r7 - 1;
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException(OooO0oO.OooOo.OooO0oo(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i2 = 1; i2 < i; i2++) {
            if ((this.f23745OooO00o[this.f23746OooO0O0 + i2] & 192) != 128) {
                throw new NumberFormatException(OooO0oO.OooOo.OooO0oo(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r2 & Utf8.REPLACEMENT_BYTE);
        }
        this.f23746OooO0O0 += i;
        return j;
    }

    public final String Oooo00O() {
        int i = this.f23747OooO0OO;
        int i2 = this.f23746OooO0O0;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f23747OooO0OO && this.f23745OooO00o[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f23745OooO00o;
        int i3 = this.f23746OooO0O0;
        int i4 = i80.f19994OooO00o;
        String str = new String(bArr, i3, i2 - i3, StandardCharsets.UTF_8);
        this.f23746OooO0O0 = i2;
        if (i2 < this.f23747OooO0OO) {
            this.f23746OooO0O0 = i2 + 1;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String Oooo00o(java.nio.charset.Charset r8) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r40.Oooo00o(java.nio.charset.Charset):java.lang.String");
    }

    public r40() {
        this.f23745OooO00o = i80.f19998OooO0o;
    }

    public r40(int i) {
        this.f23745OooO00o = new byte[i];
        this.f23747OooO0OO = i;
    }

    public r40(byte[] bArr) {
        this.f23745OooO00o = bArr;
        this.f23747OooO0OO = bArr.length;
    }
}
