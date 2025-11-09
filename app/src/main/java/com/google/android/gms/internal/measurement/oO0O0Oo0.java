package com.google.android.gms.internal.measurement;

import java.security.AccessController;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class oO0O0Oo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Unsafe f26743OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Class f26744OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final oOo0oooO f26745OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final boolean f26746OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final long f26747OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final boolean f26748OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final boolean f26749OooO0oO;

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0168 A[PHI: r0
  0x0168: PHI (r0v41 java.lang.reflect.Field) = (r0v34 java.lang.reflect.Field), (r0v36 java.lang.reflect.Field) binds: [B:44:0x0158, B:50:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.oO0O0Oo0.<clinit>():void");
    }

    public static Object OooO(long j, Object obj) {
        return f26745OooO0OO.f26890OooO00o.getObject(obj, j);
    }

    public static void OooO00o(Class cls) {
        if (f26748OooO0o0) {
            f26745OooO0OO.f26890OooO00o.arrayIndexScale(cls);
        }
    }

    public static void OooO0O0(Object obj, long j, byte b) {
        Unsafe unsafe = f26745OooO0OO.f26890OooO00o;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    public static void OooO0OO(Object obj, long j, byte b) {
        Unsafe unsafe = f26745OooO0OO.f26890OooO00o;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static Object OooO0Oo(Class cls) {
        try {
            return f26743OooO00o.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void OooO0o(Object obj, int i, long j) {
        f26745OooO0OO.f26890OooO00o.putInt(obj, j, i);
    }

    public static int OooO0o0(long j, Object obj) {
        return f26745OooO0OO.f26890OooO00o.getInt(obj, j);
    }

    public static long OooO0oO(long j, Object obj) {
        return f26745OooO0OO.f26890OooO00o.getLong(obj, j);
    }

    public static void OooO0oo(Object obj, long j, long j2) {
        f26745OooO0OO.f26890OooO00o.putLong(obj, j, j2);
    }

    public static void OooOO0(long j, Object obj, Object obj2) {
        f26745OooO0OO.f26890OooO00o.putObject(obj, j, obj2);
    }

    public static Unsafe OooOO0O() {
        try {
            return (Unsafe) AccessController.doPrivileged(new oO0O0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean OooOO0o(Class cls) {
        int i = oO00000o.f26667OooO00o;
        try {
            Class cls2 = f26744OooO0O0;
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

    public static /* synthetic */ boolean OooOOO(long j, Object obj) {
        return ((byte) ((f26745OooO0OO.f26890OooO00o.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean OooOOO0(long j, Object obj) {
        return ((byte) ((f26745OooO0OO.f26890OooO00o.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static int OooOOOO(Class cls) {
        if (f26748OooO0o0) {
            return f26745OooO0OO.f26890OooO00o.arrayBaseOffset(cls);
        }
        return -1;
    }
}
