package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class oO0O0O0o extends oOo0oooO {
    @Override // com.google.android.gms.internal.measurement.oOo0oooO
    public final void OooO00o(Object obj, long j, byte b) {
        if (oO0O0Oo0.f26749OooO0oO) {
            oO0O0Oo0.OooO0O0(obj, j, b);
        } else {
            oO0O0Oo0.OooO0OO(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.oOo0oooO
    public final boolean OooO0O0(long j, Object obj) {
        return oO0O0Oo0.f26749OooO0oO ? oO0O0Oo0.OooOOO0(j, obj) : oO0O0Oo0.OooOOO(j, obj);
    }

    @Override // com.google.android.gms.internal.measurement.oOo0oooO
    public final void OooO0OO(Object obj, long j, boolean z) {
        if (oO0O0Oo0.f26749OooO0oO) {
            oO0O0Oo0.OooO0O0(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            oO0O0Oo0.OooO0OO(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.oOo0oooO
    public final float OooO0Oo(long j, Object obj) {
        return Float.intBitsToFloat(this.f26890OooO00o.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.oOo0oooO
    public final double OooO0o(long j, Object obj) {
        return Double.longBitsToDouble(this.f26890OooO00o.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.oOo0oooO
    public final void OooO0o0(Object obj, long j, float f) {
        this.f26890OooO00o.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.oOo0oooO
    public final void OooO0oO(Object obj, long j, double d) {
        this.f26890OooO00o.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
