package Oooo;

import OooOooo.o000O00O;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.appset.zze;

/* loaded from: classes2.dex */
public final class OooOO0O extends Oooo00O.OooOOOO {
    @Override // Oooo00O.OooOO0O
    public final /* synthetic */ IInterface OooO0O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof OooOOO0 ? (OooOOO0) iInterfaceQueryLocalInterface : new OooOOO0(iBinder);
    }

    @Override // Oooo00O.OooOO0O
    public final String OooO0o() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // Oooo00O.OooOO0O
    public final String OooO0o0() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // Oooo00O.OooOO0O
    public final boolean OooO0oO() {
        return true;
    }

    @Override // Oooo00O.OooOO0O
    public final o000O00O[] getApiFeatures() {
        return zze.zzb;
    }

    @Override // Oooo00O.OooOO0O, Oooo000.OooO0OO
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // Oooo00O.OooOO0O
    public final boolean usesClientTelemetry() {
        return true;
    }
}
