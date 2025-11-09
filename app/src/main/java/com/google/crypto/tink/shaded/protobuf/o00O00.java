package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class o00O00 extends o00O00O {
    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final boolean OooO0OO(Object obj, long j) {
        return this.f28111OooO00o.getBoolean(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final byte OooO0Oo(Object obj, long j) {
        return this.f28111OooO00o.getByte(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final float OooO0o(Object obj, long j) {
        return this.f28111OooO00o.getFloat(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final double OooO0o0(Object obj, long j) {
        return this.f28111OooO00o.getDouble(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final void OooOO0O(Object obj, long j, boolean z) {
        this.f28111OooO00o.putBoolean(obj, j, z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final void OooOO0o(Object obj, long j, byte b) {
        this.f28111OooO00o.putByte(obj, j, b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final void OooOOO(Object obj, long j, float f) {
        this.f28111OooO00o.putFloat(obj, j, f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final void OooOOO0(Object obj, long j, double d) {
        this.f28111OooO00o.putDouble(obj, j, d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final boolean OooOOo() {
        if (!super.OooOOo()) {
            return false;
        }
        try {
            Class<?> cls = this.f28111OooO00o.getClass();
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
            oOO00O.OooO00o(th);
            return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final boolean OooOOoo() {
        Unsafe unsafe = this.f28111OooO00o;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (oOO00O.OooO0o0() != null) {
                    try {
                        Class<?> cls3 = this.f28111OooO00o.getClass();
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
                        oOO00O.OooO00o(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                oOO00O.OooO00o(th2);
            }
        }
        return false;
    }
}
