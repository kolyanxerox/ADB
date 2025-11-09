package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzm;

/* loaded from: classes2.dex */
public final class r50 extends y50 {

    /* renamed from: OooO00o */
    public final Activity f23750OooO00o;

    /* renamed from: OooO0O0 */
    public final zzm f23751OooO0O0;

    /* renamed from: OooO0OO */
    public final String f23752OooO0OO;

    /* renamed from: OooO0Oo */
    public final String f23753OooO0Oo;

    public r50(Activity activity, zzm zzmVar, String str, String str2) {
        this.f23750OooO00o = activity;
        this.f23751OooO0O0 = zzmVar;
        this.f23752OooO0OO = str;
        this.f23753OooO0Oo = str2;
    }

    public final boolean equals(Object obj) {
        zzm zzmVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof y50) {
            y50 y50Var = (y50) obj;
            if (this.f23750OooO00o.equals(((r50) y50Var).f23750OooO00o) && ((zzmVar = this.f23751OooO0O0) != null ? zzmVar.equals(((r50) y50Var).f23751OooO0O0) : ((r50) y50Var).f23751OooO0O0 == null) && ((str = this.f23752OooO0OO) != null ? str.equals(((r50) y50Var).f23752OooO0OO) : ((r50) y50Var).f23752OooO0OO == null) && ((str2 = this.f23753OooO0Oo) != null ? str2.equals(((r50) y50Var).f23753OooO0Oo) : ((r50) y50Var).f23753OooO0Oo == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f23750OooO00o.hashCode() ^ 1000003;
        zzm zzmVar = this.f23751OooO0O0;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.f23752OooO0OO;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f23753OooO0Oo;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("OfflineUtilsParams{activity=", this.f23750OooO00o.toString(), ", adOverlay=", String.valueOf(this.f23751OooO0O0), ", gwsQueryId=");
        sbOooOOo0.append(this.f23752OooO0OO);
        sbOooOOo0.append(", uri=");
        return OooO0oO.OooOo.OooOOOo(sbOooOOo0, this.f23753OooO0Oo, "}");
    }
}
