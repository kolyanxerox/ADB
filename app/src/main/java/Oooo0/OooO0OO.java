package Oooo0;

import OooOooo.o000O00O;
import Oooo00O.OooOOOO;
import Oooo00O.o0OoOo0;
import OoooO00.OooOOO;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.Oooo0;

/* loaded from: classes2.dex */
public final class OooO0OO extends OooOOOO {

    /* renamed from: OoooOoo */
    public final o0OoOo0 f13719OoooOoo;

    public OooO0OO(Context context, Looper looper, o000OO.o0OoOo0 o0oooo0, o0OoOo0 o0oooo02, Oooo0 oooo0, Oooo0 oooo02) {
        super(context, looper, 270, o0oooo0, oooo0, oooo02);
        this.f13719OoooOoo = o0oooo02;
    }

    @Override // Oooo00O.OooOO0O
    public final IInterface OooO0O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof OooO00o ? (OooO00o) iInterfaceQueryLocalInterface : new OooO00o(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // Oooo00O.OooOO0O
    public final Bundle OooO0OO() {
        o0OoOo0 o0oooo0 = this.f13719OoooOoo;
        o0oooo0.getClass();
        Bundle bundle = new Bundle();
        String str = o0oooo0.f13836OooO0O0;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // Oooo00O.OooOO0O
    public final String OooO0o() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // Oooo00O.OooOO0O
    public final String OooO0o0() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // Oooo00O.OooOO0O
    public final boolean OooO0oO() {
        return true;
    }

    @Override // Oooo00O.OooOO0O
    public final o000O00O[] getApiFeatures() {
        return OooOOO.f13897OooO0O0;
    }

    @Override // Oooo00O.OooOO0O, Oooo000.OooO0OO
    public final int getMinApkVersion() {
        return 203400000;
    }
}
