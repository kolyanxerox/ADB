package o000Oo0O;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class o00Oo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final byte f30386OooO00o = Byte.parseByte("01110000", 2);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final byte f30387OooO0O0 = Byte.parseByte("00001111", 2);

    public static String OooO00o() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b = bArrArray[0];
        bArrArray[16] = b;
        bArrArray[0] = (byte) ((b & f30387OooO0O0) | f30386OooO00o);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
