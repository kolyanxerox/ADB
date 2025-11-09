package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* loaded from: classes2.dex */
public final class ek0 extends lk0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final IBinder f18618OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f18619OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f18620OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final float f18621OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final String f18622OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f18623OooO0o0;

    public ek0(IBinder iBinder, String str, int i, float f, int i2, String str2) {
        this.f18618OooO00o = iBinder;
        this.f18619OooO0O0 = str;
        this.f18620OooO0OO = i;
        this.f18621OooO0Oo = f;
        this.f18623OooO0o0 = i2;
        this.f18622OooO0o = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lk0) {
            lk0 lk0Var = (lk0) obj;
            if (this.f18618OooO00o.equals(((ek0) lk0Var).f18618OooO00o) && ((str = this.f18619OooO0O0) != null ? str.equals(((ek0) lk0Var).f18619OooO0O0) : ((ek0) lk0Var).f18619OooO0O0 == null)) {
                ek0 ek0Var = (ek0) lk0Var;
                if (this.f18620OooO0OO == ek0Var.f18620OooO0OO && Float.floatToIntBits(this.f18621OooO0Oo) == Float.floatToIntBits(ek0Var.f18621OooO0Oo) && this.f18623OooO0o0 == ek0Var.f18623OooO0o0) {
                    String str2 = ek0Var.f18622OooO0o;
                    String str3 = this.f18622OooO0o;
                    if (str3 != null ? str3.equals(str2) : str2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f18618OooO00o.hashCode() ^ 1000003;
        String str = this.f18619OooO0O0;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f18620OooO0OO) * 1000003) ^ Float.floatToIntBits(this.f18621OooO0Oo);
        String str2 = this.f18622OooO0o;
        return ((((iHashCode2 * 1525764945) ^ this.f18623OooO0o0) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("OverlayDisplayShowRequest{windowToken=", this.f18618OooO00o.toString(), ", appId=");
        sbOooOoO0.append(this.f18619OooO0O0);
        sbOooOoO0.append(", layoutGravity=");
        sbOooOoO0.append(this.f18620OooO0OO);
        sbOooOoO0.append(", layoutVerticalMargin=");
        sbOooOoO0.append(this.f18621OooO0Oo);
        sbOooOoO0.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sbOooOoO0.append(this.f18623OooO0o0);
        sbOooOoO0.append(", deeplinkUrl=null, adFieldEnifd=");
        return OooO0oO.OooOo.OooOOOo(sbOooOoO0, this.f18622OooO0o, ", thirdPartyAuthCallerId=null}");
    }
}
