package o00OO;

/* loaded from: classes3.dex */
public abstract class Oooo000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final String[] f31888OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f31889OooO0O0;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + OooO00o(i >> 12) + OooO00o(i >> 8) + OooO00o(i >> 4) + OooO00o(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f31888OooO00o = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f31889OooO0O0 = bArr;
    }

    public static final char OooO00o(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }
}
