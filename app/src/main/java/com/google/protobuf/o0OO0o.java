package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class o0OO0o extends o0OO0oO0 {
    @Override // com.google.protobuf.o0OO0oO0
    public final float OooO(Object obj, long j) {
        return this.f28366OooO00o.getFloat(obj, j);
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final void OooO0OO(long j, byte[] bArr, long j2, long j3) {
        this.f28366OooO00o.copyMemory((Object) null, j, bArr, o0OO.f28349OooO0o + j2, j3);
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final void OooO0Oo(byte[] bArr, long j, long j2, long j3) {
        this.f28366OooO00o.copyMemory(bArr, o0OO.f28349OooO0o + j, (Object) null, j2, j3);
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final byte OooO0o(long j) {
        return this.f28366OooO00o.getByte(j);
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final boolean OooO0o0(Object obj, long j) {
        return this.f28366OooO00o.getBoolean(obj, j);
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final byte OooO0oO(Object obj, long j) {
        return this.f28366OooO00o.getByte(obj, j);
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final double OooO0oo(Object obj, long j) {
        return this.f28366OooO00o.getDouble(obj, j);
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final long OooOO0O(long j) {
        return this.f28366OooO00o.getLong(j);
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final void OooOOOO(Object obj, long j, boolean z) {
        this.f28366OooO00o.putBoolean(obj, j, z);
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final void OooOOOo(long j, byte b) {
        this.f28366OooO00o.putByte(j, b);
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final void OooOOo(Object obj, long j, double d) {
        this.f28366OooO00o.putDouble(obj, j, d);
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final void OooOOo0(Object obj, long j, byte b) {
        this.f28366OooO00o.putByte(obj, j, b);
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final void OooOOoo(Object obj, long j, float f) {
        this.f28366OooO00o.putFloat(obj, j, f);
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final boolean OooOo() {
        Unsafe unsafe = this.f28366OooO00o;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (o0OO.OooO0o() != null) {
                    try {
                        Class<?> cls3 = this.f28366OooO00o.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        o0OO.OooO00o(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                o0OO.OooO00o(th2);
            }
        }
        return false;
    }

    @Override // com.google.protobuf.o0OO0oO0
    public final boolean OooOo0o() {
        if (!super.OooOo0o()) {
            return false;
        }
        try {
            Class<?> cls = this.f28366OooO00o.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            o0OO.OooO00o(th);
            return false;
        }
    }
}
