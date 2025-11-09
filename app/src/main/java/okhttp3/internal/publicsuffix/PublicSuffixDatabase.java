package okhttp3.internal.publicsuffix;

import androidx.webkit.ProxyConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import o00OOO0O.OooO0OO;
import o00OOOoO.o00000O0;
import o00OOOoO.o000O0;
import o00OOOoO.o000O000;
import o00OOOoO.o000O0O0;
import o00OOOoO.o00O000;
import o00Oo0oo.o00oO0o;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: OooO00o */
    public final AtomicBoolean f33176OooO00o = new AtomicBoolean(false);

    /* renamed from: OooO0O0 */
    public final CountDownLatch f33177OooO0O0 = new CountDownLatch(1);

    /* renamed from: OooO0OO */
    public byte[] f33178OooO0OO;

    /* renamed from: OooO0Oo */
    public byte[] f33179OooO0Oo;

    /* renamed from: OooO0o0 */
    public static final byte[] f33173OooO0o0 = {42};

    /* renamed from: OooO0o */
    public static final String[] f33172OooO0o = new String[0];

    /* renamed from: OooO0oO */
    public static final String[] f33174OooO0oO = {ProxyConfig.MATCH_ALL_SCHEMES};

    /* renamed from: OooO0oo */
    public static final PublicSuffixDatabase f33175OooO0oo = new PublicSuffixDatabase();

    public static String OooO00o(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & ForkServer.ERROR;
                }
                i4 = i3 - (bArr[i7 + i12] & ForkServer.ERROR);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, OooO0OO.f32334OooO);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    public final void OooO0O0() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(com.applovin.shadow.okhttp3.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = o000O0.f32570OooO00o;
        o000O0O0 o000o0o0OooO00o = o00oO0o.OooO00o(new o000O000(new o00000O0(1, resourceAsStream, new o00O000())));
        try {
            byte[] bArr = new byte[o000o0o0OooO00o.readInt()];
            o000o0o0OooO00o.readFully(bArr);
            byte[] bArr2 = new byte[o000o0o0OooO00o.readInt()];
            o000o0o0OooO00o.readFully(bArr2);
            synchronized (this) {
                this.f33178OooO0OO = bArr;
                this.f33179OooO0Oo = bArr2;
            }
            this.f33177OooO0O0.countDown();
        } finally {
            OooO0OO.OooO0o0(o000o0o0OooO00o);
        }
    }
}
