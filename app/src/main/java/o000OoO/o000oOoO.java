package o000Ooo;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class o000oOoO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final String f30475OooO0O0 = o00O0O.OooO0oo(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final AtomicLong f30476OooO0OO = new AtomicLong(0);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30477OooO00o;

    public o000oOoO() {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b = bArrArray[0];
        byte b2 = bArrArray[1];
        byte b3 = bArrArray[2];
        byte b4 = bArrArray[3];
        byte[] bArrOooO00o = OooO00o(time % 1000);
        byte b5 = bArrOooO00o[0];
        byte b6 = bArrOooO00o[1];
        byte[] bArrOooO00o2 = OooO00o(f30476OooO0OO.incrementAndGet());
        byte b7 = bArrOooO00o2[0];
        byte b8 = bArrOooO00o2[1];
        byte[] bArrOooO00o3 = OooO00o(Integer.valueOf(Process.myPid()).shortValue());
        String strOooO0o0 = o00O0O.OooO0o0(new byte[]{b, b2, b3, b4, b5, b6, b7, b8, bArrOooO00o3[0], bArrOooO00o3[1]});
        Locale locale = Locale.US;
        this.f30477OooO00o = String.format(locale, "%s%s%s%s", strOooO0o0.substring(0, 12), strOooO0o0.substring(12, 16), strOooO0o0.subSequence(16, 20), f30475OooO0O0.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] OooO00o(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return this.f30477OooO00o;
    }
}
