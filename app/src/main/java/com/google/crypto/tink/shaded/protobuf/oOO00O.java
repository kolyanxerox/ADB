package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class oOO00O {

    /* renamed from: OooO00o */
    public static final Unsafe f28124OooO00o;

    /* renamed from: OooO0O0 */
    public static final Class f28125OooO0O0;

    /* renamed from: OooO0OO */
    public static final o00O00O f28126OooO0OO;

    /* renamed from: OooO0Oo */
    public static final boolean f28127OooO0Oo;

    /* renamed from: OooO0o */
    public static final long f28128OooO0o;

    /* renamed from: OooO0o0 */
    public static final boolean f28129OooO0o0;

    /* renamed from: OooO0oO */
    public static final boolean f28130OooO0oO;

    static {
        Unsafe unsafeOooOO0 = OooOO0();
        f28124OooO00o = unsafeOooOO0;
        f28125OooO0O0 = OooO0OO.f28012OooO00o;
        boolean zOooO0o = OooO0o(Long.TYPE);
        boolean zOooO0o2 = OooO0o(Integer.TYPE);
        o00O00O o00o00 = null;
        if (unsafeOooOO0 != null) {
            if (!OooO0OO.OooO00o()) {
                o00o00 = new o00O00(unsafeOooOO0);
            } else if (zOooO0o) {
                o00o00 = new o00O000o(unsafeOooOO0, 1);
            } else if (zOooO0o2) {
                o00o00 = new o00O000o(unsafeOooOO0, 0);
            }
        }
        f28126OooO0OO = o00o00;
        f28127OooO0Oo = o00o00 == null ? false : o00o00.OooOOoo();
        f28129OooO0o0 = o00o00 == null ? false : o00o00.OooOOo();
        f28128OooO0o = OooO0OO(byte[].class);
        OooO0OO(boolean[].class);
        OooO0Oo(boolean[].class);
        OooO0OO(int[].class);
        OooO0Oo(int[].class);
        OooO0OO(long[].class);
        OooO0Oo(long[].class);
        OooO0OO(float[].class);
        OooO0Oo(float[].class);
        OooO0OO(double[].class);
        OooO0Oo(double[].class);
        OooO0OO(Object[].class);
        OooO0Oo(Object[].class);
        Field fieldOooO0o0 = OooO0o0();
        if (fieldOooO0o0 != null && o00o00 != null) {
            o00o00.OooOO0(fieldOooO0o0);
        }
        f28130OooO0oO = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static byte OooO(Object obj, long j) {
        return (byte) ((f28126OooO0OO.OooO0oO(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static void OooO00o(Throwable th) {
        Logger.getLogger(oOO00O.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object OooO0O0(Class cls) {
        try {
            return f28124OooO00o.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int OooO0OO(Class cls) {
        if (f28129OooO0o0) {
            return f28126OooO0OO.OooO00o(cls);
        }
        return -1;
    }

    public static void OooO0Oo(Class cls) {
        if (f28129OooO0o0) {
            f28126OooO0OO.OooO0O0(cls);
        }
    }

    public static boolean OooO0o(Class cls) {
        if (!OooO0OO.OooO00o()) {
            return false;
        }
        try {
            Class cls2 = f28125OooO0O0;
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

    public static Field OooO0o0() {
        Field declaredField;
        Field declaredField2;
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

    public static byte OooO0oO(byte[] bArr, long j) {
        return f28126OooO0OO.OooO0Oo(bArr, f28128OooO0o + j);
    }

    public static byte OooO0oo(Object obj, long j) {
        return (byte) ((f28126OooO0OO.OooO0oO(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static Unsafe OooOO0() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o00O000());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void OooOO0O(byte[] bArr, long j, byte b) {
        f28126OooO0OO.OooOO0o(bArr, f28128OooO0o + j, b);
    }

    public static void OooOO0o(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iOooO0oO = f28126OooO0OO.OooO0oO(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        OooOOO(obj, j2, ((255 & b) << i) | (iOooO0oO & (~(255 << i))));
    }

    public static void OooOOO(Object obj, long j, int i) {
        f28126OooO0OO.OooOOOO(obj, j, i);
    }

    public static void OooOOO0(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        OooOOO(obj, j2, ((255 & b) << i) | (f28126OooO0OO.OooO0oO(obj, j2) & (~(255 << i))));
    }

    public static void OooOOOO(Object obj, long j, long j2) {
        f28126OooO0OO.OooOOOo(obj, j, j2);
    }

    public static void OooOOOo(Object obj, long j, Object obj2) {
        f28126OooO0OO.OooOOo0(obj, j, obj2);
    }
}
