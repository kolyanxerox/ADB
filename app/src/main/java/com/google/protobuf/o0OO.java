package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class o0OO {

    /* renamed from: OooO00o */
    public static final Unsafe f28345OooO00o;

    /* renamed from: OooO0O0 */
    public static final Class f28346OooO0O0;

    /* renamed from: OooO0OO */
    public static final o0OO0oO0 f28347OooO0OO;

    /* renamed from: OooO0Oo */
    public static final boolean f28348OooO0Oo;

    /* renamed from: OooO0o */
    public static final long f28349OooO0o;

    /* renamed from: OooO0o0 */
    public static final boolean f28350OooO0o0;

    /* renamed from: OooO0oO */
    public static final long f28351OooO0oO;

    /* renamed from: OooO0oo */
    public static final boolean f28352OooO0oo;

    static {
        Unsafe unsafeOooOO0o = OooOO0o();
        f28345OooO00o = unsafeOooOO0o;
        f28346OooO0O0 = OooO0OO.f28159OooO00o;
        boolean zOooO0oo = OooO0oo(Long.TYPE);
        boolean zOooO0oo2 = OooO0oo(Integer.TYPE);
        o0OO0oO0 o0oo0o = null;
        if (unsafeOooOO0o != null) {
            if (!OooO0OO.OooO00o()) {
                o0oo0o = new o0OO0o(unsafeOooOO0o);
            } else if (zOooO0oo) {
                o0oo0o = new o0OO0o00(unsafeOooOO0o, 1);
            } else if (zOooO0oo2) {
                o0oo0o = new o0OO0o00(unsafeOooOO0o, 0);
            }
        }
        f28347OooO0OO = o0oo0o;
        f28348OooO0Oo = o0oo0o == null ? false : o0oo0o.OooOo();
        f28350OooO0o0 = o0oo0o == null ? false : o0oo0o.OooOo0o();
        f28349OooO0o = OooO0Oo(byte[].class);
        OooO0Oo(boolean[].class);
        OooO0o0(boolean[].class);
        OooO0Oo(int[].class);
        OooO0o0(int[].class);
        OooO0Oo(long[].class);
        OooO0o0(long[].class);
        OooO0Oo(float[].class);
        OooO0o0(float[].class);
        OooO0Oo(double[].class);
        OooO0o0(double[].class);
        OooO0Oo(Object[].class);
        OooO0o0(Object[].class);
        java.lang.reflect.Field fieldOooO0o = OooO0o();
        f28351OooO0oO = (fieldOooO0o == null || o0oo0o == null) ? -1L : o0oo0o.OooOOO(fieldOooO0o);
        f28352OooO0oo = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static byte OooO(byte[] bArr, long j) {
        return f28347OooO0OO.OooO0oO(bArr, f28349OooO0o + j);
    }

    public static void OooO00o(Throwable th) {
        Logger.getLogger(o0OO.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static long OooO0O0(ByteBuffer byteBuffer) {
        return f28347OooO0OO.OooOO0o(byteBuffer, f28351OooO0oO);
    }

    public static Object OooO0OO(Class cls) {
        try {
            return f28345OooO00o.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int OooO0Oo(Class cls) {
        if (f28350OooO0o0) {
            return f28347OooO0OO.OooO00o(cls);
        }
        return -1;
    }

    public static java.lang.reflect.Field OooO0o() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (OooO0OO.OooO00o()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static void OooO0o0(Class cls) {
        if (f28350OooO0o0) {
            f28347OooO0OO.OooO0O0(cls);
        }
    }

    public static void OooO0oO(long j, byte[] bArr, long j2, long j3) {
        f28347OooO0OO.OooO0OO(j, bArr, j2, j3);
    }

    public static boolean OooO0oo(Class cls) {
        if (!OooO0OO.OooO00o()) {
            return false;
        }
        try {
            Class cls2 = f28346OooO0O0;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte OooOO0(Object obj, long j) {
        return (byte) ((f28347OooO0OO.OooOO0(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte OooOO0O(Object obj, long j) {
        return (byte) ((f28347OooO0OO.OooOO0(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe OooOO0o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o0OOooO0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void OooOOO(byte[] bArr, long j, byte b) {
        f28347OooO0OO.OooOOo0(bArr, f28349OooO0o + j, b);
    }

    public static void OooOOO0(long j, byte b) {
        f28347OooO0OO.OooOOOo(j, b);
    }

    public static void OooOOOO(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iOooOO0 = f28347OooO0OO.OooOO0(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        OooOOo0(obj, j2, ((255 & b) << i) | (iOooOO0 & (~(255 << i))));
    }

    public static void OooOOOo(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        OooOOo0(obj, j2, ((255 & b) << i) | (f28347OooO0OO.OooOO0(obj, j2) & (~(255 << i))));
    }

    public static void OooOOo(Object obj, long j, long j2) {
        f28347OooO0OO.OooOo0(obj, j, j2);
    }

    public static void OooOOo0(Object obj, long j, int i) {
        f28347OooO0OO.OooOo00(obj, j, i);
    }

    public static void OooOOoo(Object obj, long j, Object obj2) {
        f28347OooO0OO.OooOo0O(obj, j, obj2);
    }
}
