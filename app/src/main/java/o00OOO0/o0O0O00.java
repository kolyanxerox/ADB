package o00OOO0;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class o0O0O00 {
    public static oo0o0Oo OooO00o(o00Oo0 o00oo0, String str) {
        String str2;
        Charset charset = o00OOO0O.OooO0OO.f32334OooO;
        if (o00oo0 != null) {
            try {
                str2 = o00oo0.f32247OooO0O0;
            } catch (IllegalArgumentException unused) {
            }
            Charset charsetForName = str2 != null ? Charset.forName(str2) : null;
            if (charsetForName == null) {
                o00oo0 = o00Oo0.OooO0O0(o00oo0 + "; charset=utf-8");
            } else {
                charset = charsetForName;
            }
        }
        return OooO0O0(o00oo0, str.getBytes(charset));
    }

    public static oo0o0Oo OooO0O0(o00Oo0 o00oo0, byte[] bArr) {
        int length = bArr.length;
        long length2 = bArr.length;
        long j = 0;
        long j2 = length;
        byte[] bArr2 = o00OOO0O.OooO0OO.f32335OooO00o;
        if ((j | j2) < 0 || j > length2 || length2 - j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new oo0o0Oo(o00oo0, length, bArr);
    }
}
