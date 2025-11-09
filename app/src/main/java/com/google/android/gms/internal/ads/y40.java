package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class y40 {

    /* renamed from: OooO0OO */
    public static final y40 f25844OooO0OO = new y40(-1, -1);

    /* renamed from: OooO00o */
    public final int f25845OooO00o;

    /* renamed from: OooO0O0 */
    public final int f25846OooO0O0;

    static {
        new y40(0, 0);
    }

    public y40(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        af0.OoooO0(z);
        this.f25845OooO00o = i;
        this.f25846OooO0O0 = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof y40) {
            y40 y40Var = (y40) obj;
            if (this.f25845OooO00o == y40Var.f25845OooO00o && this.f25846OooO0O0 == y40Var.f25846OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f25845OooO00o;
        return ((i >>> 16) | (i << 16)) ^ this.f25846OooO0O0;
    }

    public final String toString() {
        return this.f25845OooO00o + "x" + this.f25846OooO0O0;
    }
}
