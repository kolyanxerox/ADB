package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import org.apache.tika.fork.ForkServer;

/* renamed from: com.google.android.gms.internal.ads.r3 */
/* loaded from: classes2.dex */
public final class C1997r3 extends p11 {

    /* renamed from: OooOo, reason: collision with root package name */
    public MessageDigest f23731OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final int f23732OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f23733OooOoO0;

    public C1997r3(int i) {
        super(2);
        int i2 = i >> 3;
        this.f23733OooOoO0 = (i & 7) > 0 ? i2 + 1 : i2;
        this.f23732OooOoO = i;
    }

    public final byte[] o00000oo(String str) {
        synchronized (this.f23178OooOo0O) {
            try {
                MessageDigest messageDigestO0OO00O = o0OO00O();
                this.f23731OooOo = messageDigestO0OO00O;
                if (messageDigestO0OO00O == null) {
                    return new byte[0];
                }
                messageDigestO0OO00O.reset();
                this.f23731OooOo.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.f23731OooOo.digest();
                int length = bArrDigest.length;
                int i = this.f23733OooOoO0;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                if ((this.f23732OooOoO & 7) > 0) {
                    long j = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            j <<= 8;
                        }
                        j += bArr[i2] & ForkServer.ERROR;
                    }
                    long j2 = j >>> (8 - (this.f23732OooOoO & 7));
                    int i3 = this.f23733OooOoO0;
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        bArr[i3] = (byte) (255 & j2);
                        j2 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
