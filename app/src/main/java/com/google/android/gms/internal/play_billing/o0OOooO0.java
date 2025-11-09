package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o0OOooO0 extends o0OO0o00 {
    @Override // com.google.android.gms.internal.play_billing.o0OO0o00
    public final double OooO00o(long j, Object obj) {
        return Double.longBitsToDouble(this.f27152OooO00o.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO0o00
    public final float OooO0O0(long j, Object obj) {
        return Float.intBitsToFloat(this.f27152OooO00o.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO0o00
    public final void OooO0OO(Object obj, long j, boolean z) {
        if (o0OO0o.f27151OooO0oO) {
            o0OO0o.OooO0O0(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            o0OO0o.OooO0OO(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO0o00
    public final void OooO0Oo(Object obj, long j, byte b) {
        if (o0OO0o.f27151OooO0oO) {
            o0OO0o.OooO0O0(obj, j, b);
        } else {
            o0OO0o.OooO0OO(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO0o00
    public final void OooO0o(Object obj, long j, float f) {
        this.f27152OooO00o.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO0o00
    public final void OooO0o0(Object obj, long j, double d) {
        this.f27152OooO00o.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO0o00
    public final boolean OooO0oO(long j, Object obj) {
        return o0OO0o.f27151OooO0oO ? o0OO0o.OooOO0o(j, obj) : o0OO0o.OooOOO0(j, obj);
    }
}
