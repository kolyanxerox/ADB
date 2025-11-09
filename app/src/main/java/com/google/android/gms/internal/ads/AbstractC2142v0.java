package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.v0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2142v0 {

    /* renamed from: OooO00o */
    public static boolean f24795OooO00o = false;

    /* renamed from: OooO0O0 */
    public static MessageDigest f24796OooO0O0;

    /* renamed from: OooO0OO */
    public static final Object f24797OooO0OO = new Object();

    /* renamed from: OooO0Oo */
    public static final Object f24798OooO0Oo = new Object();

    /* renamed from: OooO0o0 */
    public static final CountDownLatch f24799OooO0o0 = new CountDownLatch(1);

    public static C1846n0 OooO00o(String str, byte[] bArr) {
        Vector vector;
        int length = bArr.length;
        if (length <= 0) {
            vector = null;
        } else {
            int i = length + 254;
            vector = new Vector();
            for (int i2 = 0; i2 < i / 255; i2++) {
                int i3 = i2 * 255;
                try {
                    int length2 = bArr.length;
                    if (length2 - i3 > 255) {
                        length2 = i3 + 255;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i3, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        if (vector == null || vector.isEmpty()) {
            return null;
        }
        C1846n0 c1846n0OooOo0o = C1920p0.OooOo0o();
        int size = vector.size();
        for (int i4 = 0; i4 < size; i4++) {
            hz0 hz0VarOooOo0 = jz0.OooOo0(OooO0Oo((byte[]) vector.get(i4), str, false), 0, 256);
            c1846n0OooOo0o.OooO0Oo();
            C1920p0.OooOo((C1920p0) c1846n0OooOo0o.f25822OooOo0o, hz0VarOooOo0);
        }
        byte[] bArrOooO0OO = OooO0OO(bArr);
        hz0 hz0Var = jz0.f20406OooOo0o;
        hz0 hz0VarOooOo02 = jz0.OooOo0(bArrOooO0OO, 0, bArrOooO0OO.length);
        c1846n0OooOo0o.OooO0Oo();
        C1920p0.OooOoO0((C1920p0) c1846n0OooOo0o.f25822OooOo0o, hz0VarOooOo02);
        return c1846n0OooOo0o;
    }

    public static void OooO0O0() {
        synchronized (f24798OooO0Oo) {
            try {
                if (!f24795OooO00o) {
                    f24795OooO00o = true;
                    new Thread(new RunnableC2105u0(0)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] OooO0OO(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f24797OooO0OO) {
            try {
                OooO0O0();
                MessageDigest messageDigest2 = null;
                try {
                    if (f24799OooO0o0.await(2L, TimeUnit.SECONDS) && (messageDigest = f24796OooO0O0) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f24796OooO0O0.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    public static byte[] OooO0Oo(byte[] bArr, String str, boolean z) {
        byte[] bArrArray;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            C2104u c2104uOoooOOO = C1514e0.OoooOOO();
            c2104uOoooOOO.OooO0Oo();
            C1514e0.Oooo00o((C1514e0) c2104uOoooOOO.f25822OooOo0o, 4096L);
            bArr = ((C1514e0) c2104uOoooOOO.OooO0O0()).OooO0Oo();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i2).put(b).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i2).put(b).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(OooO0OO(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        InterfaceC2179w0[] interfaceC2179w0Arr = new C1406b1().f17312o00O00oO;
        for (int i3 = 0; i3 < 12; i3++) {
            interfaceC2179w0Arr[i3].OooO00o(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            C1957q0 c1957q0 = new C1957q0(str.getBytes("UTF-8"), 0);
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < 256; i6++) {
                i4 = (i4 + 1) & 255;
                byte[] bArr4 = c1957q0.f23468OooOo0O;
                byte b2 = bArr4[i4];
                i5 = (i5 + b2) & 255;
                bArr4[i4] = bArr4[i5];
                bArr4[i5] = b2;
                bArr3[i6] = (byte) (bArr4[(bArr4[i4] + b2) & 255] ^ bArr3[i6]);
            }
        }
        return bArr3;
    }
}
