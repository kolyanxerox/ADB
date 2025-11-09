package o0000Oo;

import Oooo0oO.o00000O;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public abstract class o00Ooo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o00000O f29470OooO00o = new o00000O(14);

    public static byte[] OooO00o(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f29470OooO00o.get()).nextBytes(bArr);
        return bArr;
    }
}
