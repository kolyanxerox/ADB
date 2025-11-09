package o000OO;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import o0000OoO.o00OOO0O;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public abstract class o00oO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f30183OooO00o = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static int OooO00o() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & 127) << 24) | ((bArr[1] & ForkServer.ERROR) << 16) | ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR);
        }
        return i;
    }

    public static final o00OOO0O OooO0O0(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new OooOOO0.OooO00o("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        return o00OOO0O.OooO00o(bArr);
    }
}
