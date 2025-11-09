package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class o00O00O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Unsafe f28111OooO00o;

    public o00O00O(Unsafe unsafe) {
        this.f28111OooO00o = unsafe;
    }

    public final Object OooO(Object obj, long j) {
        return this.f28111OooO00o.getObject(obj, j);
    }

    public final int OooO00o(Class cls) {
        return this.f28111OooO00o.arrayBaseOffset(cls);
    }

    public final int OooO0O0(Class cls) {
        return this.f28111OooO00o.arrayIndexScale(cls);
    }

    public abstract boolean OooO0OO(Object obj, long j);

    public abstract byte OooO0Oo(Object obj, long j);

    public abstract float OooO0o(Object obj, long j);

    public abstract double OooO0o0(Object obj, long j);

    public final int OooO0oO(Object obj, long j) {
        return this.f28111OooO00o.getInt(obj, j);
    }

    public final long OooO0oo(Object obj, long j) {
        return this.f28111OooO00o.getLong(obj, j);
    }

    public final long OooOO0(Field field) {
        return this.f28111OooO00o.objectFieldOffset(field);
    }

    public abstract void OooOO0O(Object obj, long j, boolean z);

    public abstract void OooOO0o(Object obj, long j, byte b);

    public abstract void OooOOO(Object obj, long j, float f);

    public abstract void OooOOO0(Object obj, long j, double d);

    public final void OooOOOO(Object obj, long j, int i) {
        this.f28111OooO00o.putInt(obj, j, i);
    }

    public final void OooOOOo(Object obj, long j, long j2) {
        this.f28111OooO00o.putLong(obj, j, j2);
    }

    public boolean OooOOo() {
        Unsafe unsafe = this.f28111OooO00o;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
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
            oOO00O.OooO00o(th);
            return false;
        }
    }

    public final void OooOOo0(Object obj, long j, Object obj2) {
        this.f28111OooO00o.putObject(obj, j, obj2);
    }

    public abstract boolean OooOOoo();
}
