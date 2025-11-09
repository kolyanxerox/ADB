package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.core.location.LocationRequestCompat;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.tasks.Task;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.flutter.embedding.android.KeyboardMap;
import java.io.Serializable;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public abstract class ii0 {

    /* renamed from: OooOo0O */
    public static Boolean f20048OooOo0O;

    public static void OooO(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws k01 {
        if (!OooooO0(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !OooooO0(b3) && !OooooO0(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
                cArr[i] = (char) ((i2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i + 1] = (char) ((i2 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw new k01("Protocol message had invalid UTF-8.");
    }

    public static int OooO00o(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static long OooO0O0(double d) {
        OoooOoo("not a normal value", Oooo00O(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static long OooO0OO(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(OooO0oO.OooOo.OooOOOO(OooO0oO.OooOo.OooOOo(j, "overflow: checkedAdd(", ", "), j2, ")"));
    }

    public static xj0 OooO0o(Task task) {
        xj0 xj0Var = new xj0();
        xj0Var.f25638OooOoo = task;
        task.addOnCompleteListener(qp0.f23673OooOo0O, new pd0(xj0Var, 3));
        return xj0Var;
    }

    public static C1514e0 OooO0o0(Context context, String str, String str2) {
        C1514e0 c1514e0;
        try {
            c1514e0 = (C1514e0) ((LinkedBlockingQueue) new OooOOo0.o0OOO0o(context, str, str2).f13519OooOoO).poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            c1514e0 = null;
        }
        return c1514e0 == null ? OooOOo0.o0OOO0o.OooOo0() : c1514e0;
    }

    public static il0 OooO0oO(il0 il0Var) {
        return ((il0Var instanceof kl0) || (il0Var instanceof jl0)) ? il0Var : il0Var instanceof Serializable ? new jl0(il0Var) : new kl0(il0Var);
    }

    public static Object OooO0oo(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void OooOO0(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }

    public static void OooOO0O(int i, int i2) {
        String strOooo0;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strOooo0 = xh0.Oooo0("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i2, "negative size: "));
                }
                strOooo0 = xh0.Oooo0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strOooo0);
        }
    }

    public static void OooOO0o(bi0 bi0Var) throws GeneralSecurityException {
        tq0 tq0Var;
        ArrayList arrayList = new ArrayList();
        wt0 wt0Var = wt0.f25407OooO0O0;
        Iterator it = ((HashMap) bi0Var.f17509OooOo0o).values().iterator();
        while (it.hasNext()) {
            for (qu0 qu0Var : (List) it.next()) {
                int i = qu0Var.f23706OooO0o0 - 2;
                if (i == 1) {
                    tq0Var = tq0.f24467OooOo;
                } else if (i == 2) {
                    tq0Var = tq0.f24469OooOoO0;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    tq0Var = tq0.f24468OooOoO;
                }
                String strSubstring = qu0Var.f23705OooO0Oo;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new xt0(tq0Var, qu0Var.f23704OooO0OO, strSubstring, qu0Var.f23703OooO0O0.name()));
            }
        }
        qu0 qu0Var2 = (qu0) bi0Var.f17507OooOo;
        Integer numValueOf = qu0Var2 != null ? Integer.valueOf(qu0Var2.f23704OooO0OO) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = ((xt0) arrayList.get(i2)).f25798OooO0O0;
                    i2++;
                    if (i3 == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        Collections.unmodifiableList(arrayList);
    }

    public static void OooOOO0(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void OooOOOO(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static /* synthetic */ void OooOOOo(AtomicReference atomicReference, RuntimeException runtimeException) {
        while (!atomicReference.compareAndSet(null, runtimeException)) {
            if (atomicReference.get() != null && atomicReference.get() != null) {
                return;
            }
        }
    }

    public static boolean OooOOo(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public static boolean OooOOoo(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int OooOo(Object obj) {
        return OooO00o(obj == null ? 0 : obj.hashCode());
    }

    public static byte[] OooOo0(byte[] bArr, byte[] bArr2) {
        long jOooo0OO = Oooo0OO(0, bArr) & 67108863;
        int i = 3;
        long jOooo0OO2 = (Oooo0OO(3, bArr) >> 2) & 67108611;
        long jOooo0OO3 = (Oooo0OO(6, bArr) >> 4) & 67092735;
        long jOooo0OO4 = (Oooo0OO(9, bArr) >> 6) & 66076671;
        long jOooo0OO5 = (Oooo0OO(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        int i2 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 >= length) {
                long j6 = j + (j2 >> 26);
                long j7 = j6 & 67108863;
                long j8 = j3 + (j6 >> 26);
                long j9 = j8 & 67108863;
                long j10 = j4 + (j8 >> 26);
                long j11 = j10 & 67108863;
                long j12 = ((j10 >> 26) * 5) + j5;
                long j13 = j12 >> 26;
                long j14 = j12 & 67108863;
                long j15 = j14 + 5;
                long j16 = (j2 & 67108863) + j13;
                long j17 = j16 + (j15 >> 26);
                long j18 = j7 + (j17 >> 26);
                long j19 = j9 + (j18 >> 26);
                long j20 = (j11 + (j19 >> 26)) - 67108864;
                long j21 = j20 >> 63;
                long j22 = ~j21;
                long j23 = (j16 & j21) | (j17 & 67108863 & j22);
                long j24 = (j7 & j21) | (j18 & 67108863 & j22);
                long j25 = (j9 & j21) | (j19 & 67108863 & j22);
                long j26 = (j11 & j21) | (j20 & j22);
                long jOooo0OO6 = Oooo0OO(16, bArr) + (((j14 & j21) | (j15 & 67108863 & j22) | (j23 << 26)) & KeyboardMap.kValueMask);
                long jOooo0OO7 = Oooo0OO(20, bArr) + (((j23 >> 6) | (j24 << 20)) & KeyboardMap.kValueMask);
                long jOooo0OO8 = Oooo0OO(24, bArr) + (((j24 >> 12) | (j25 << 14)) & KeyboardMap.kValueMask);
                long jOooo0OO9 = Oooo0OO(28, bArr) + (((j25 >> 18) | (j26 << 8)) & KeyboardMap.kValueMask);
                byte[] bArr4 = new byte[16];
                OoooO(bArr4, jOooo0OO6 & KeyboardMap.kValueMask, 0);
                long j27 = jOooo0OO7 + (jOooo0OO6 >> 32);
                OoooO(bArr4, j27 & KeyboardMap.kValueMask, 4);
                long j28 = jOooo0OO8 + (j27 >> 32);
                OoooO(bArr4, j28 & KeyboardMap.kValueMask, 8);
                OoooO(bArr4, (jOooo0OO9 + (j28 >> 32)) & KeyboardMap.kValueMask, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long j29 = jOooo0OO5 * 5;
            long j30 = jOooo0OO4 * 5;
            long j31 = jOooo0OO3 * 5;
            long jOooo0OO10 = j5 + (Oooo0OO(0, bArr3) & 67108863);
            long jOooo0OO11 = j2 + ((Oooo0OO(i, bArr3) >> 2) & 67108863);
            long jOooo0OO12 = j + ((Oooo0OO(6, bArr3) >> 4) & 67108863);
            long jOooo0OO13 = j3 + ((Oooo0OO(9, bArr3) >> 6) & 67108863);
            long j32 = jOooo0OO2;
            long jOooo0OO14 = j4 + (((Oooo0OO(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j33 = jOooo0OO11 * jOooo0OO;
            long j34 = jOooo0OO11 * j32;
            long j35 = jOooo0OO12 * jOooo0OO;
            long j36 = jOooo0OO11 * jOooo0OO3;
            long j37 = jOooo0OO12 * j32;
            long j38 = jOooo0OO13 * jOooo0OO;
            long j39 = jOooo0OO11 * jOooo0OO4;
            long j40 = jOooo0OO12 * jOooo0OO3;
            long j41 = jOooo0OO13 * j32;
            long j42 = jOooo0OO14 * jOooo0OO;
            long j43 = (jOooo0OO2 * 5 * jOooo0OO14) + (jOooo0OO13 * j31) + (jOooo0OO12 * j30) + (jOooo0OO11 * j29) + (jOooo0OO10 * jOooo0OO);
            long j44 = j43 & 67108863;
            long j45 = jOooo0OO13 * j30;
            long j46 = j31 * jOooo0OO14;
            long j47 = j46 + j45 + (jOooo0OO12 * j29) + (jOooo0OO10 * j32) + j33 + (j43 >> 26);
            long j48 = j30 * jOooo0OO14;
            long j49 = j48 + (jOooo0OO13 * j29) + (jOooo0OO10 * jOooo0OO3) + j34 + j35 + (j47 >> 26);
            long j50 = (jOooo0OO14 * j29) + (jOooo0OO10 * jOooo0OO4) + j36 + j37 + j38 + (j49 >> 26);
            long j51 = (jOooo0OO10 * jOooo0OO5) + j39 + j40 + j41 + j42 + (j50 >> 26);
            long j52 = ((j51 >> 26) * 5) + j44;
            j2 = (j47 & 67108863) + (j52 >> 26);
            i2 += 16;
            j = j49 & 67108863;
            j3 = j50 & 67108863;
            j4 = j51 & 67108863;
            j5 = j52 & 67108863;
            jOooo0OO2 = j32;
            i = 3;
        }
    }

    public static /* synthetic */ boolean OooOo00(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ap0 ap0Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(ap0Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(ap0Var) != obj && atomicReferenceFieldUpdater.get(ap0Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static int OooOo0O(long j) {
        int i = (int) j;
        OooooOo(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int OooOo0o(android.content.Context r16, OoooOOO.o0O0oo00 r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ii0.OooOo0o(android.content.Context, OoooOOO.o0O0oo00):int");
    }

    public static long OooOoO(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (ho0.f19834OooO00o[roundingMode.ordinal()]) {
            case 1:
                xh0.Oooo0o(false);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j3 + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x002a, code lost:
    
        if (r5 != (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002c, code lost:
    
        OoooOOo(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int OooOoO0(java.lang.Object r8, java.lang.Object r9, int r10, java.lang.Object r11, int[] r12, java.lang.Object[] r13, java.lang.Object[] r14) {
        /*
            int r0 = OooOo(r8)
            r1 = r0 & r10
            int r2 = Oooo0O0(r1, r11)
            r3 = -1
            if (r2 == 0) goto L3e
            int r4 = ~r10
            r0 = r0 & r4
            r5 = r3
        L10:
            int r2 = r2 + r3
            r6 = r12[r2]
            r7 = r6 & r10
            r6 = r6 & r4
            if (r6 != r0) goto L39
            r6 = r13[r2]
            boolean r6 = OooOOoo(r8, r6)
            if (r6 == 0) goto L39
            if (r14 == 0) goto L2a
            r6 = r14[r2]
            boolean r6 = OooOOoo(r9, r6)
            if (r6 == 0) goto L39
        L2a:
            if (r5 != r3) goto L30
            OoooOOo(r1, r7, r11)
            return r2
        L30:
            r8 = r12[r5]
            r8 = r8 & r4
            r9 = r7 & r10
            r8 = r8 | r9
            r12[r5] = r8
            return r2
        L39:
            if (r7 == 0) goto L3e
            r5 = r2
            r2 = r7
            goto L10
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ii0.OooOoO0(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static ii0 OooOoOO(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new j31(cls.getSimpleName(), 0) : new j31(cls.getSimpleName(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:27:0x0011, B:29:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooOoo(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.gms.internal.ads.k01 {
        /*
            boolean r0 = OooooO0(r3)
            if (r0 != 0) goto L2c
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L2c
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L2c
            r2 = r1
        L16:
            boolean r0 = OooooO0(r4)
            if (r0 != 0) goto L2c
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2c:
            com.google.android.gms.internal.ads.k01 r2 = new com.google.android.gms.internal.ads.k01
            java.lang.String r3 = "Protocol message had invalid UTF-8."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ii0.OooOoo(byte, byte, byte, char[], int):void");
    }

    public static AbstractList OooOoo0(List list, wk0 wk0Var) {
        return list != null ? new an0(list, wk0Var) : new bn0(list, wk0Var);
    }

    public static void OooOooO(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(o00O0O(i, i2, "index"));
        }
    }

    public static void OooOooo(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(OooO0oO.OooOo.OooO0o(i2, "at index "));
            }
        }
    }

    public static final byte[] Oooo(byte[] bArr, int i, byte[] bArr2) {
        if (bArr.length - 16 < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[i2] = (byte) (bArr[i2 + i] ^ bArr2[i2]);
        }
        return bArr3;
    }

    public static int Oooo0(int i, int i2) {
        int[] iArr = {i, i2};
        int i3 = iArr[0];
        for (char c = 1; c < 2; c = 2) {
            int i4 = iArr[1];
            if (i4 > i3) {
                i3 = i4;
            }
        }
        int[] iArr2 = {i3, 1073741823};
        int i5 = iArr2[0];
        for (char c2 = 1; c2 < 2; c2 = 2) {
            int i6 = iArr2[1];
            if (i6 < i5) {
                i5 = i6;
            }
        }
        return i5;
    }

    public static void Oooo000(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static boolean Oooo00O(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static byte[] Oooo00o(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= bArr.length) {
                byte[] bArr2 = new byte[i2];
                int i3 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length);
                    i3 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i].length;
            if (i2 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i2 += length2;
            i++;
        }
    }

    public static int Oooo0O0(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & ForkServer.ERROR : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static long Oooo0OO(int i, byte[] bArr) {
        int i2 = bArr[i] & ForkServer.ERROR;
        int i3 = bArr[i + 1] & ForkServer.ERROR;
        int i4 = bArr[i + 2] & ForkServer.ERROR;
        return (((bArr[i + 3] & ForkServer.ERROR) << 24) | (i3 << 8) | i2 | (i4 << 16)) & KeyboardMap.kValueMask;
    }

    public static void Oooo0o(byte b, byte b2, char[] cArr, int i) throws k01 {
        if (b < -62 || OooooO0(b2)) {
            throw new k01("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
    }

    public static long Oooo0o0(long j, long j2) {
        xh0.OooOo00(j, "a");
        xh0.OooOo00(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
            j3 += j5;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static void Oooo0oO(Class cls, Object obj) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static void Oooo0oo(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void OoooO(byte[] bArr, long j, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }

    public static long OoooO0(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = j ^ j2;
        boolean z = (iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0));
        long j4 = (j3 >>> 63) + LocationRequestCompat.PASSIVE_INTERVAL;
        if (!z) {
            long j5 = j * j2;
            if (j == 0 || j5 / j == j2) {
                return j5;
            }
        }
        return j4;
    }

    public static int OoooO00(byte[] bArr) {
        int length = bArr.length;
        if (length >= 4) {
            return (bArr[3] & ForkServer.ERROR) | (bArr[0] << 24) | ((bArr[1] & ForkServer.ERROR) << 16) | ((bArr[2] & ForkServer.ERROR) << 8);
        }
        throw new IllegalArgumentException(xh0.Oooo0("array too small: %s < %s", Integer.valueOf(length), 4));
    }

    public static Object OoooO0O(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static final void OoooOO0(byte[] bArr, String str, OoooOOO.o0O0oo00 o0o0oo00) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        o0o0oo00.OooOO0(4007, 0L, null, null, sb.toString());
    }

    public static lo0 OoooOOO(o00000oO.OooOOO oooOOO, Class cls, wk0 wk0Var, cq0 cq0Var) {
        lo0 lo0Var = new lo0(oooOOO, cls, wk0Var);
        oooOOO.addListener(lo0Var, xh0.OoooOO0(cq0Var, lo0Var));
        return lo0Var;
    }

    public static void OoooOOo(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static void OoooOo0(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static ko0 OoooOoO(o00000oO.OooOOO oooOOO, Class cls, lp0 lp0Var, Executor executor) {
        ko0 ko0Var = new ko0(oooOOO, cls, lp0Var);
        oooOOO.addListener(ko0Var, xh0.OoooOO0(executor, ko0Var));
        return ko0Var;
    }

    public static void OoooOoo(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static xp0 Ooooo00(Throwable th) {
        th.getClass();
        xp0 xp0Var = new xp0();
        xp0Var.OooO0oO(th);
        return xp0Var;
    }

    public static List Ooooo0o(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new io0(iArr, 0, length);
    }

    public static boolean OooooO0(byte b) {
        return b > -65;
    }

    public static yp0 OooooOO(Object obj) {
        return obj == null ? yp0.f25991OooOo0o : new yp0(obj);
    }

    public static void OooooOo(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(xh0.Oooo0(str, Long.valueOf(j)));
        }
    }

    public static nq0 Oooooo(kp0 kp0Var, cq0 cq0Var) {
        nq0 nq0Var = new nq0();
        nq0Var.f21567OooOoo = new mq0(nq0Var, kp0Var);
        cq0Var.execute(nq0Var);
        return nq0Var;
    }

    public static int[] Oooooo0(um0 um0Var) {
        Object[] array = um0Var.toArray(mm0.f21301OooOo0O);
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static void OoooooO(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? o00O0O(i, i3, "start index") : (i2 < 0 || i2 > i3) ? o00O0O(i2, i3, "end index") : xh0.Oooo0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static ep0 Ooooooo(o00000oO.OooOOO oooOOO, wk0 wk0Var, Executor executor) {
        ep0 ep0Var = new ep0(wk0Var, oooOOO);
        oooOOO.addListener(ep0Var, xh0.OoooOO0(executor, ep0Var));
        return ep0Var;
    }

    public static int o000oOoO(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static String o00O0O(int i, int i2, String str) {
        if (i < 0) {
            return xh0.Oooo0("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return xh0.Oooo0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i2, "negative size: "));
    }

    public static o00000oO.OooOOO o00Oo0(o00000oO.OooOOO oooOOO, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (oooOOO.isDone()) {
            return oooOOO;
        }
        lq0 lq0Var = new lq0();
        lq0Var.f20933OooOoo = oooOOO;
        b30 b30Var = new b30();
        b30Var.f17363OooOo0o = lq0Var;
        lq0Var.f20934OooOooO = scheduledExecutorService.schedule(b30Var, j, timeUnit);
        oooOOO.addListener(b30Var, qp0.f23673OooOo0O);
        return lq0Var;
    }

    public static Object o00Ooo(Future future) {
        if (future.isDone()) {
            return OooO0oo(future);
        }
        throw new IllegalStateException(xh0.Oooo0("Future was expected to be done: %s", future));
    }

    public static Object o00o0O(C2274yl c2274yl) {
        try {
            return OooO0oo(c2274yl);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new rp0((Error) e.getCause());
            }
            throw new OooOOO0.OooO00o(e.getCause());
        }
    }

    public static void o0OoOo0(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static dp0 ooOO(o00000oO.OooOOO oooOOO, lp0 lp0Var, Executor executor) {
        int i = fp0.f18988OooOooo;
        executor.getClass();
        dp0 dp0Var = new dp0(lp0Var, oooOOO);
        oooOOO.addListener(dp0Var, xh0.OoooOO0(executor, dp0Var));
        return dp0Var;
    }

    public abstract void OooOOO(String str);

    public abstract void OooOOo0(byte[] bArr, int i, int i2);
}
