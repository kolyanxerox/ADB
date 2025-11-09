package com.ironsource;

import java.io.UnsupportedEncodingException;
import org.apache.tika.fork.ForkServer;

/* renamed from: com.ironsource.ln */
/* loaded from: classes2.dex */
public final class C3336ln {

    /* renamed from: d */
    private static final byte[] f9406d = {-128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a */
    private b f9407a;

    /* renamed from: b */
    private b f9408b;

    /* renamed from: c */
    private int[] f9409c = new int[16];

    /* renamed from: com.ironsource.ln$b */
    public class b {

        /* renamed from: a */
        private boolean f9410a;

        /* renamed from: b */
        private int[] f9411b;

        /* renamed from: c */
        private long f9412c;

        /* renamed from: d */
        private byte[] f9413d;

        private b() {
            this.f9410a = true;
            this.f9411b = new int[4];
            this.f9413d = new byte[64];
            m9851a();
        }

        /* renamed from: a */
        public static /* synthetic */ long m9850a(b bVar, long j) {
            long j2 = bVar.f9412c + j;
            bVar.f9412c = j2;
            return j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m9859f(b bVar) {
            byte[] bArr = bVar.f9413d;
            byte[] bArr2 = this.f9413d;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int[] iArr = bVar.f9411b;
            int[] iArr2 = this.f9411b;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            this.f9410a = bVar.f9410a;
            this.f9412c = bVar.f9412c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m9851a() {
            int[] iArr = this.f9411b;
            iArr[0] = 1732584193;
            iArr[1] = -271733879;
            iArr[2] = -1732584194;
            iArr[3] = 271733878;
            this.f9412c = 0L;
        }
    }

    public C3336ln() {
        this.f9407a = new b();
        this.f9408b = new b();
        m9849c();
    }

    /* renamed from: a */
    private static int m9830a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 & i2) | (i4 & (~i2))) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* renamed from: b */
    private static int m9838b(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 & (~i4)) | (i2 & i4)) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* renamed from: c */
    private static int m9839c(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 ^ i2) ^ i4) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* renamed from: d */
    private static int m9840d(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + (i3 ^ ((~i4) | i2)) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    public String toString() {
        return m9845b();
    }

    /* renamed from: a */
    public static String m9831a(String str) {
        C3336ln c3336ln = new C3336ln();
        c3336ln.m9846b(str);
        return c3336ln.m9845b();
    }

    /* renamed from: b */
    public String m9845b() {
        return m9832a(m9844a());
    }

    /* renamed from: c */
    public void m9849c() {
        this.f9407a.m9851a();
        this.f9408b.f9410a = false;
    }

    /* renamed from: a */
    private static String m9832a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b2 : bArr) {
            int i = b2 & ForkServer.ERROR;
            if (i < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i));
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public void m9846b(String str) {
        m9847b(str.getBytes());
    }

    /* renamed from: a */
    public void m9841a(byte b2) {
        m9843a(new byte[]{b2}, 1);
    }

    /* renamed from: b */
    public void m9847b(byte[] bArr) {
        m9848b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private void m9833a(b bVar, byte[] bArr, int i, int i2) {
        int i3 = 0;
        this.f9408b.f9410a = false;
        if (i2 + i > bArr.length) {
            i2 = bArr.length - i;
        }
        int i4 = ((int) (bVar.f9412c >>> 3)) & 63;
        b.m9850a(bVar, i2 << 3);
        int i5 = 64 - i4;
        if (i2 >= i5) {
            System.arraycopy(bArr, i, bVar.f9413d, i4, i5);
            m9834a(bVar, m9837a(bVar.f9413d, 64, 0));
            while (i5 + 63 < i2) {
                m9834a(bVar, m9837a(bArr, 64, i5));
                i5 += 64;
            }
            i4 = 0;
            i3 = i5;
        }
        if (i3 < i2) {
            for (int i6 = i3; i6 < i2; i6++) {
                bVar.f9413d[(i4 + i6) - i3] = bArr[i6 + i];
            }
        }
    }

    /* renamed from: b */
    public void m9848b(byte[] bArr, int i, int i2) {
        m9833a(this.f9407a, bArr, i, i2);
    }

    /* renamed from: a */
    private static void m9834a(b bVar, int[] iArr) {
        int i = bVar.f9411b[0];
        int i2 = bVar.f9411b[1];
        int i3 = bVar.f9411b[2];
        int i4 = bVar.f9411b[3];
        int iM9830a = m9830a(i, i2, i3, i4, iArr[0], 7, -680876936);
        int iM9830a2 = m9830a(i4, iM9830a, i2, i3, iArr[1], 12, -389564586);
        int iM9830a3 = m9830a(i3, iM9830a2, iM9830a, i2, iArr[2], 17, 606105819);
        int iM9830a4 = m9830a(i2, iM9830a3, iM9830a2, iM9830a, iArr[3], 22, -1044525330);
        int iM9830a5 = m9830a(iM9830a, iM9830a4, iM9830a3, iM9830a2, iArr[4], 7, -176418897);
        int iM9830a6 = m9830a(iM9830a2, iM9830a5, iM9830a4, iM9830a3, iArr[5], 12, 1200080426);
        int iM9830a7 = m9830a(iM9830a3, iM9830a6, iM9830a5, iM9830a4, iArr[6], 17, -1473231341);
        int iM9830a8 = m9830a(iM9830a4, iM9830a7, iM9830a6, iM9830a5, iArr[7], 22, -45705983);
        int iM9830a9 = m9830a(iM9830a5, iM9830a8, iM9830a7, iM9830a6, iArr[8], 7, 1770035416);
        int iM9830a10 = m9830a(iM9830a6, iM9830a9, iM9830a8, iM9830a7, iArr[9], 12, -1958414417);
        int iM9830a11 = m9830a(iM9830a7, iM9830a10, iM9830a9, iM9830a8, iArr[10], 17, -42063);
        int iM9830a12 = m9830a(iM9830a8, iM9830a11, iM9830a10, iM9830a9, iArr[11], 22, -1990404162);
        int iM9830a13 = m9830a(iM9830a9, iM9830a12, iM9830a11, iM9830a10, iArr[12], 7, 1804603682);
        int iM9830a14 = m9830a(iM9830a10, iM9830a13, iM9830a12, iM9830a11, iArr[13], 12, -40341101);
        int iM9830a15 = m9830a(iM9830a11, iM9830a14, iM9830a13, iM9830a12, iArr[14], 17, -1502002290);
        int iM9830a16 = m9830a(iM9830a12, iM9830a15, iM9830a14, iM9830a13, iArr[15], 22, 1236535329);
        int iM9838b = m9838b(iM9830a13, iM9830a16, iM9830a15, iM9830a14, iArr[1], 5, -165796510);
        int iM9838b2 = m9838b(iM9830a14, iM9838b, iM9830a16, iM9830a15, iArr[6], 9, -1069501632);
        int iM9838b3 = m9838b(iM9830a15, iM9838b2, iM9838b, iM9830a16, iArr[11], 14, 643717713);
        int iM9838b4 = m9838b(iM9830a16, iM9838b3, iM9838b2, iM9838b, iArr[0], 20, -373897302);
        int iM9838b5 = m9838b(iM9838b, iM9838b4, iM9838b3, iM9838b2, iArr[5], 5, -701558691);
        int iM9838b6 = m9838b(iM9838b2, iM9838b5, iM9838b4, iM9838b3, iArr[10], 9, 38016083);
        int iM9838b7 = m9838b(iM9838b3, iM9838b6, iM9838b5, iM9838b4, iArr[15], 14, -660478335);
        int iM9838b8 = m9838b(iM9838b4, iM9838b7, iM9838b6, iM9838b5, iArr[4], 20, -405537848);
        int iM9838b9 = m9838b(iM9838b5, iM9838b8, iM9838b7, iM9838b6, iArr[9], 5, 568446438);
        int iM9838b10 = m9838b(iM9838b6, iM9838b9, iM9838b8, iM9838b7, iArr[14], 9, -1019803690);
        int iM9838b11 = m9838b(iM9838b7, iM9838b10, iM9838b9, iM9838b8, iArr[3], 14, -187363961);
        int iM9838b12 = m9838b(iM9838b8, iM9838b11, iM9838b10, iM9838b9, iArr[8], 20, 1163531501);
        int iM9838b13 = m9838b(iM9838b9, iM9838b12, iM9838b11, iM9838b10, iArr[13], 5, -1444681467);
        int iM9838b14 = m9838b(iM9838b10, iM9838b13, iM9838b12, iM9838b11, iArr[2], 9, -51403784);
        int iM9838b15 = m9838b(iM9838b11, iM9838b14, iM9838b13, iM9838b12, iArr[7], 14, 1735328473);
        int iM9838b16 = m9838b(iM9838b12, iM9838b15, iM9838b14, iM9838b13, iArr[12], 20, -1926607734);
        int iM9839c = m9839c(iM9838b13, iM9838b16, iM9838b15, iM9838b14, iArr[5], 4, -378558);
        int iM9839c2 = m9839c(iM9838b14, iM9839c, iM9838b16, iM9838b15, iArr[8], 11, -2022574463);
        int iM9839c3 = m9839c(iM9838b15, iM9839c2, iM9839c, iM9838b16, iArr[11], 16, 1839030562);
        int iM9839c4 = m9839c(iM9838b16, iM9839c3, iM9839c2, iM9839c, iArr[14], 23, -35309556);
        int iM9839c5 = m9839c(iM9839c, iM9839c4, iM9839c3, iM9839c2, iArr[1], 4, -1530992060);
        int iM9839c6 = m9839c(iM9839c2, iM9839c5, iM9839c4, iM9839c3, iArr[4], 11, 1272893353);
        int iM9839c7 = m9839c(iM9839c3, iM9839c6, iM9839c5, iM9839c4, iArr[7], 16, -155497632);
        int iM9839c8 = m9839c(iM9839c4, iM9839c7, iM9839c6, iM9839c5, iArr[10], 23, -1094730640);
        int iM9839c9 = m9839c(iM9839c5, iM9839c8, iM9839c7, iM9839c6, iArr[13], 4, 681279174);
        int iM9839c10 = m9839c(iM9839c6, iM9839c9, iM9839c8, iM9839c7, iArr[0], 11, -358537222);
        int iM9839c11 = m9839c(iM9839c7, iM9839c10, iM9839c9, iM9839c8, iArr[3], 16, -722521979);
        int iM9839c12 = m9839c(iM9839c8, iM9839c11, iM9839c10, iM9839c9, iArr[6], 23, 76029189);
        int iM9839c13 = m9839c(iM9839c9, iM9839c12, iM9839c11, iM9839c10, iArr[9], 4, -640364487);
        int iM9839c14 = m9839c(iM9839c10, iM9839c13, iM9839c12, iM9839c11, iArr[12], 11, -421815835);
        int iM9839c15 = m9839c(iM9839c11, iM9839c14, iM9839c13, iM9839c12, iArr[15], 16, 530742520);
        int iM9839c16 = m9839c(iM9839c12, iM9839c15, iM9839c14, iM9839c13, iArr[2], 23, -995338651);
        int iM9840d = m9840d(iM9839c13, iM9839c16, iM9839c15, iM9839c14, iArr[0], 6, -198630844);
        int iM9840d2 = m9840d(iM9839c14, iM9840d, iM9839c16, iM9839c15, iArr[7], 10, 1126891415);
        int iM9840d3 = m9840d(iM9839c15, iM9840d2, iM9840d, iM9839c16, iArr[14], 15, -1416354905);
        int iM9840d4 = m9840d(iM9839c16, iM9840d3, iM9840d2, iM9840d, iArr[5], 21, -57434055);
        int iM9840d5 = m9840d(iM9840d, iM9840d4, iM9840d3, iM9840d2, iArr[12], 6, 1700485571);
        int iM9840d6 = m9840d(iM9840d2, iM9840d5, iM9840d4, iM9840d3, iArr[3], 10, -1894986606);
        int iM9840d7 = m9840d(iM9840d3, iM9840d6, iM9840d5, iM9840d4, iArr[10], 15, -1051523);
        int iM9840d8 = m9840d(iM9840d4, iM9840d7, iM9840d6, iM9840d5, iArr[1], 21, -2054922799);
        int iM9840d9 = m9840d(iM9840d5, iM9840d8, iM9840d7, iM9840d6, iArr[8], 6, 1873313359);
        int iM9840d10 = m9840d(iM9840d6, iM9840d9, iM9840d8, iM9840d7, iArr[15], 10, -30611744);
        int iM9840d11 = m9840d(iM9840d7, iM9840d10, iM9840d9, iM9840d8, iArr[6], 15, -1560198380);
        int iM9840d12 = m9840d(iM9840d8, iM9840d11, iM9840d10, iM9840d9, iArr[13], 21, 1309151649);
        int iM9840d13 = m9840d(iM9840d9, iM9840d12, iM9840d11, iM9840d10, iArr[4], 6, -145523070);
        int iM9840d14 = m9840d(iM9840d10, iM9840d13, iM9840d12, iM9840d11, iArr[11], 10, -1120210379);
        int iM9840d15 = m9840d(iM9840d11, iM9840d14, iM9840d13, iM9840d12, iArr[2], 15, 718787259);
        int iM9840d16 = m9840d(iM9840d12, iM9840d15, iM9840d14, iM9840d13, iArr[9], 21, -343485551);
        int[] iArr2 = bVar.f9411b;
        iArr2[0] = iArr2[0] + iM9840d13;
        int[] iArr3 = bVar.f9411b;
        iArr3[1] = iArr3[1] + iM9840d16;
        int[] iArr4 = bVar.f9411b;
        iArr4[2] = iArr4[2] + iM9840d15;
        int[] iArr5 = bVar.f9411b;
        iArr5[3] = iArr5[3] + iM9840d14;
    }

    /* renamed from: a */
    public void m9842a(String str, String str2) throws UnsupportedEncodingException {
        m9847b(str.getBytes(str2));
    }

    /* renamed from: a */
    public void m9843a(byte[] bArr, int i) {
        m9848b(bArr, 0, i);
    }

    /* renamed from: a */
    public byte[] m9844a() {
        if (!this.f9408b.f9410a) {
            this.f9408b.m9859f(this.f9407a);
            long j = this.f9408b.f9412c;
            int i = (int) ((j >>> 3) & 63);
            m9833a(this.f9408b, f9406d, 0, i < 56 ? 56 - i : 120 - i);
            m9833a(this.f9408b, m9835a(j), 0, 8);
            this.f9408b.f9410a = true;
        }
        return m9836a(this.f9408b.f9411b, 16);
    }

    /* renamed from: a */
    private static byte[] m9835a(long j) {
        return new byte[]{(byte) (j & 255), (byte) ((j >>> 8) & 255), (byte) ((j >>> 16) & 255), (byte) ((j >>> 24) & 255), (byte) ((j >>> 32) & 255), (byte) ((j >>> 40) & 255), (byte) ((j >>> 48) & 255), (byte) ((j >>> 56) & 255)};
    }

    /* renamed from: a */
    private static byte[] m9836a(int[] iArr, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 4) {
            int i4 = iArr[i2];
            bArr[i3] = (byte) (i4 & 255);
            bArr[i3 + 1] = (byte) ((i4 >>> 8) & 255);
            bArr[i3 + 2] = (byte) ((i4 >>> 16) & 255);
            bArr[i3 + 3] = (byte) ((i4 >>> 24) & 255);
            i2++;
        }
        return bArr;
    }

    /* renamed from: a */
    private int[] m9837a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4 += 4) {
            this.f9409c[i3] = (bArr[i4 + i2] & ForkServer.ERROR) | ((bArr[(i4 + 1) + i2] & ForkServer.ERROR) << 8) | ((bArr[(i4 + 2) + i2] & ForkServer.ERROR) << 16) | ((bArr[(i4 + 3) + i2] & ForkServer.ERROR) << 24);
            i3++;
        }
        return this.f9409c;
    }
}
