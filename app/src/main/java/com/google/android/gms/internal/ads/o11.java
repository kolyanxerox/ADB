package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class o11 extends p11 {
    @Override // com.google.android.gms.internal.ads.p11
    public final void o00000(Object obj, long j, byte b) {
        if (q11.f23487OooO0oo) {
            q11.OooO0OO(obj, j, b);
        } else {
            q11.OooO0Oo(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void o000000O(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void o000000o(Object obj, long j, boolean z) {
        if (q11.f23487OooO0oo) {
            q11.OooO0OO(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            q11.OooO0Oo(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void o00000O(Object obj, long j, float f) {
        ((Unsafe) this.f23178OooOo0O).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void o00000O0(Object obj, long j, double d) {
        ((Unsafe) this.f23178OooOo0O).putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final boolean o00000OO(long j, Object obj) {
        return q11.f23487OooO0oo ? q11.OooOOOO(j, obj) : q11.OooOOOo(j, obj);
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final float o000OOo(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f23178OooOo0O).getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final double o0O0O00(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f23178OooOo0O).getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final byte o0Oo0oo(long j) {
        return Memory.peekByte(j);
    }
}
