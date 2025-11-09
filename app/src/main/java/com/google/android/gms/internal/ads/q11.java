package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class q11 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Unsafe f23480OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Class f23481OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final p11 f23482OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final boolean f23483OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final long f23484OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final boolean f23485OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final long f23486OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final boolean f23487OooO0oo;

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016c A[PHI: r0
  0x016c: PHI (r0v46 java.lang.reflect.Field) = (r0v36 java.lang.reflect.Field), (r0v38 java.lang.reflect.Field) binds: [B:44:0x015c, B:50:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q11.<clinit>():void");
    }

    public static Object OooO(long j, Object obj) {
        return ((Unsafe) f23482OooO0OO.f23178OooOo0O).getObject(obj, j);
    }

    public static int OooO00o(Class cls) {
        if (f23485OooO0o0) {
            return ((Unsafe) f23482OooO0OO.f23178OooOo0O).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void OooO0O0(Class cls) {
        if (f23485OooO0o0) {
            ((Unsafe) f23482OooO0OO.f23178OooOo0O).arrayIndexScale(cls);
        }
    }

    public static void OooO0OO(Object obj, long j, byte b) {
        p11 p11Var = f23482OooO0OO;
        long j2 = (-4) & j;
        int i = ((Unsafe) p11Var.f23178OooOo0O).getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        ((Unsafe) p11Var.f23178OooOo0O).putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    public static void OooO0Oo(Object obj, long j, byte b) {
        p11 p11Var = f23482OooO0OO;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        ((Unsafe) p11Var.f23178OooOo0O).putInt(obj, j2, ((255 & b) << i) | (((Unsafe) p11Var.f23178OooOo0O).getInt(obj, j2) & (~(255 << i))));
    }

    public static long OooO0o(ByteBuffer byteBuffer) {
        return ((Unsafe) f23482OooO0OO.f23178OooOo0O).getLong(byteBuffer, f23486OooO0oO);
    }

    public static int OooO0o0(long j, Object obj) {
        return ((Unsafe) f23482OooO0OO.f23178OooOo0O).getInt(obj, j);
    }

    public static long OooO0oO(long j, Object obj) {
        return ((Unsafe) f23482OooO0OO.f23178OooOo0O).getLong(obj, j);
    }

    public static Object OooO0oo(Class cls) {
        try {
            return f23480OooO00o.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Unsafe OooOO0() {
        try {
            return (Unsafe) AccessController.doPrivileged(new m11());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void OooOO0O(byte[] bArr, long j, byte b) {
        f23482OooO0OO.o00000(bArr, f23484OooO0o + j, b);
    }

    public static void OooOO0o(Object obj, int i, long j) {
        ((Unsafe) f23482OooO0OO.f23178OooOo0O).putInt(obj, j, i);
    }

    public static void OooOOO(long j, Object obj, Object obj2) {
        ((Unsafe) f23482OooO0OO.f23178OooOo0O).putObject(obj, j, obj2);
    }

    public static void OooOOO0(Object obj, long j, long j2) {
        ((Unsafe) f23482OooO0OO.f23178OooOo0O).putLong(obj, j, j2);
    }

    public static /* bridge */ /* synthetic */ boolean OooOOOO(long j, Object obj) {
        return ((byte) ((((Unsafe) f23482OooO0OO.f23178OooOo0O).getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean OooOOOo(long j, Object obj) {
        return ((byte) ((((Unsafe) f23482OooO0OO.f23178OooOo0O).getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean OooOOo0(Class cls) {
        int i = dz0.f18440OooO00o;
        try {
            Class cls2 = f23481OooO0O0;
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
}
