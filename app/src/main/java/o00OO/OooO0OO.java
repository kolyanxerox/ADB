package o00OO;

import com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol;

/* loaded from: classes3.dex */
public final class OooO0OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f31859OooO00o = new char[117];

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f31860OooO0O0 = new byte[WebSocketProtocol.PAYLOAD_SHORT];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
        }
        OooO00o(8, 'b');
        OooO00o(9, 't');
        OooO00o(10, 'n');
        OooO00o(12, 'f');
        OooO00o(13, 'r');
        OooO00o(47, '/');
        OooO00o(34, '\"');
        OooO00o(92, '\\');
        while (true) {
            byte[] bArr = f31860OooO0O0;
            if (i >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i] = 127;
            i++;
        }
    }

    public static void OooO00o(int i, char c) {
        if (c != 'u') {
            f31859OooO00o[c] = (char) i;
        }
    }
}
