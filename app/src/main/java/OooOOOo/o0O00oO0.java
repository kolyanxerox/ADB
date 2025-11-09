package OoooOOO;

import Oooo00O.OooOO0O;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class o0O00oO0 extends OooOO0O {
    @Override // Oooo00O.OooOO0O
    public final /* synthetic */ IInterface OooO0O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof o0O000o0 ? (o0O000o0) iInterfaceQueryLocalInterface : new o0OoOoOo(iBinder);
    }

    @Override // Oooo00O.OooOO0O
    public final String OooO0o() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // Oooo00O.OooOO0O
    public final String OooO0o0() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // Oooo00O.OooOO0O, Oooo000.OooO0OO
    public final int getMinApkVersion() {
        return 12451000;
    }
}
