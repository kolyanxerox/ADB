package OooO0oO;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.oO000o00;
import com.google.android.gms.internal.play_billing.oO00O0o;
import com.google.android.gms.internal.play_billing.oO00O0o0;
import com.google.android.gms.internal.play_billing.oO0O0OoO;

/* loaded from: classes.dex */
public final class OooOOOO extends OoooO0.OooO {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final oO0O0OoO f13281OooOo0o;

    public OooOOOO(oO0O0OoO oo0o0ooo) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 2);
        this.f13281OooOo0o = oo0o0ooo;
    }

    @Override // OoooO0.OooO
    public final boolean o000O0O0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        com.google.android.gms.internal.play_billing.OooOO0.OooO0O0(parcel);
        Integer numValueOf = Integer.valueOf(i2);
        oO0O0OoO oo0o0ooo = this.f13281OooOo0o;
        oo0o0ooo.f27202OooO0Oo = true;
        oO00O0o oo00o0o = oo0o0ooo.f27200OooO0O0;
        if (oo00o0o != null) {
            oO00O0o0 oo00o0o0 = oo00o0o.f27197OooOo0o;
            oo00o0o0.getClass();
            if (oO000o00.f27191OooOoOO.OooOo0O(oo00o0o0, null, numValueOf)) {
                oO000o00.OooO0OO(oo00o0o0);
                oo0o0ooo.f27199OooO00o = null;
                oo0o0ooo.f27200OooO0O0 = null;
                oo0o0ooo.f27201OooO0OO = null;
            }
        }
        return true;
    }
}
