package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class o0OO0oO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Unsafe f28366OooO00o;

    public o0OO0oO0(Unsafe unsafe) {
        this.f28366OooO00o = unsafe;
    }

    public abstract float OooO(Object obj, long j);

    public final int OooO00o(Class cls) {
        return this.f28366OooO00o.arrayBaseOffset(cls);
    }

    public final int OooO0O0(Class cls) {
        return this.f28366OooO00o.arrayIndexScale(cls);
    }

    public abstract void OooO0OO(long j, byte[] bArr, long j2, long j3);

    public abstract void OooO0Oo(byte[] bArr, long j, long j2, long j3);

    public abstract byte OooO0o(long j);

    public abstract boolean OooO0o0(Object obj, long j);

    public abstract byte OooO0oO(Object obj, long j);

    public abstract double OooO0oo(Object obj, long j);

    public final int OooOO0(Object obj, long j) {
        return this.f28366OooO00o.getInt(obj, j);
    }

    public abstract long OooOO0O(long j);

    public final long OooOO0o(Object obj, long j) {
        return this.f28366OooO00o.getLong(obj, j);
    }

    public final long OooOOO(java.lang.reflect.Field field) {
        return this.f28366OooO00o.objectFieldOffset(field);
    }

    public final Object OooOOO0(Object obj, long j) {
        return this.f28366OooO00o.getObject(obj, j);
    }

    public abstract void OooOOOO(Object obj, long j, boolean z);

    public abstract void OooOOOo(long j, byte b);

    public abstract void OooOOo(Object obj, long j, double d);

    public abstract void OooOOo0(Object obj, long j, byte b);

    public abstract void OooOOoo(Object obj, long j, float f);

    public abstract boolean OooOo();

    public final void OooOo0(Object obj, long j, long j2) {
        this.f28366OooO00o.putLong(obj, j, j2);
    }

    public final void OooOo00(Object obj, long j, int i) {
        this.f28366OooO00o.putInt(obj, j, i);
    }

    public final void OooOo0O(Object obj, long j, Object obj2) {
        this.f28366OooO00o.putObject(obj, j, obj2);
    }

    public boolean OooOo0o() {
        Unsafe unsafe = this.f28366OooO00o;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            o0OO.OooO00o(th);
            return false;
        }
    }
}
