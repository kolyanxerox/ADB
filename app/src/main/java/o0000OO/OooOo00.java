package o0000Oo;

import java.nio.charset.Charset;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public abstract class OooOo00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f29462OooO00o = Charset.forName("UTF-8");

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (r7 != 4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] OooO00o(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Oo.OooOo00.OooO00o(java.lang.String):byte[]");
    }

    public static byte[] OooO0O0(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = OooOOOO.f29458OooO0o0;
        int i = (length / 3) * 4;
        if (length % 3 > 0) {
            i += 4;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int i5 = i2 + 3;
            if (i5 > length) {
                break;
            }
            int i6 = (bArr[i2 + 2] & ForkServer.ERROR) | ((bArr[i2] & ForkServer.ERROR) << 16) | ((bArr[i2 + 1] & ForkServer.ERROR) << 8);
            bArr3[i4] = bArr2[(i6 >> 18) & 63];
            bArr3[i4 + 1] = bArr2[(i6 >> 12) & 63];
            bArr3[i4 + 2] = bArr2[(i6 >> 6) & 63];
            bArr3[i4 + 3] = bArr2[i6 & 63];
            int i7 = i4 + 4;
            i3--;
            if (i3 == 0) {
                i4 += 5;
                bArr3[i7] = 10;
                i3 = 19;
            } else {
                i4 = i7;
            }
            i2 = i5;
        }
        if (i2 == length - 1) {
            int i8 = (bArr[i2] & ForkServer.ERROR) << 4;
            bArr3[i4] = bArr2[(i8 >> 6) & 63];
            bArr3[i4 + 1] = bArr2[i8 & 63];
            bArr3[i4 + 2] = 61;
            bArr3[i4 + 3] = 61;
            return bArr3;
        }
        if (i2 == length - 2) {
            int i9 = ((bArr[i2 + 1] & ForkServer.ERROR) << 2) | ((bArr[i2] & ForkServer.ERROR) << 10);
            bArr3[i4] = bArr2[(i9 >> 12) & 63];
            bArr3[i4 + 1] = bArr2[(i9 >> 6) & 63];
            bArr3[i4 + 2] = bArr2[i9 & 63];
            bArr3[i4 + 3] = 61;
        }
        return bArr3;
    }
}
