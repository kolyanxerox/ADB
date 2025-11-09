package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class o00O000o extends o00O00O {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f28110OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o00O000o(Unsafe unsafe, int i) {
        super(unsafe);
        this.f28110OooO0O0 = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final boolean OooO0OO(Object obj, long j) {
        switch (this.f28110OooO0O0) {
            case 0:
                if (oOO00O.f28130OooO0oO) {
                    if (oOO00O.OooO0oo(obj, j) == 0) {
                    }
                } else if (oOO00O.OooO(obj, j) == 0) {
                }
                break;
            default:
                if (oOO00O.f28130OooO0oO) {
                    if (oOO00O.OooO0oo(obj, j) == 0) {
                    }
                } else if (oOO00O.OooO(obj, j) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final byte OooO0Oo(Object obj, long j) {
        switch (this.f28110OooO0O0) {
            case 0:
                if (!oOO00O.f28130OooO0oO) {
                    break;
                } else {
                    break;
                }
            default:
                if (!oOO00O.f28130OooO0oO) {
                    break;
                } else {
                    break;
                }
        }
        return oOO00O.OooO(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final float OooO0o(Object obj, long j) {
        switch (this.f28110OooO0O0) {
        }
        return Float.intBitsToFloat(OooO0oO(obj, j));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final double OooO0o0(Object obj, long j) {
        switch (this.f28110OooO0O0) {
        }
        return Double.longBitsToDouble(OooO0oo(obj, j));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final void OooOO0O(Object obj, long j, boolean z) {
        switch (this.f28110OooO0O0) {
            case 0:
                if (!oOO00O.f28130OooO0oO) {
                    oOO00O.OooOOO0(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    oOO00O.OooOO0o(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!oOO00O.f28130OooO0oO) {
                    oOO00O.OooOOO0(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    oOO00O.OooOO0o(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final void OooOO0o(Object obj, long j, byte b) {
        switch (this.f28110OooO0O0) {
            case 0:
                if (!oOO00O.f28130OooO0oO) {
                    oOO00O.OooOOO0(obj, j, b);
                    break;
                } else {
                    oOO00O.OooOO0o(obj, j, b);
                    break;
                }
            default:
                if (!oOO00O.f28130OooO0oO) {
                    oOO00O.OooOOO0(obj, j, b);
                    break;
                } else {
                    oOO00O.OooOO0o(obj, j, b);
                    break;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final void OooOOO(Object obj, long j, float f) {
        switch (this.f28110OooO0O0) {
            case 0:
                OooOOOO(obj, j, Float.floatToIntBits(f));
                break;
            default:
                OooOOOO(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final void OooOOO0(Object obj, long j, double d) {
        switch (this.f28110OooO0O0) {
            case 0:
                OooOOOo(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                OooOOOo(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o00O00O
    public final boolean OooOOoo() {
        switch (this.f28110OooO0O0) {
        }
        return false;
    }
}
