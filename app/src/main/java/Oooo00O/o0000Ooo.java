package Oooo00O;

import OooOooo.o000Oo0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes2.dex */
public final class o0000Ooo extends o0Oo0oo {

    /* renamed from: OooO0oO */
    public final IBinder f13805OooO0oO;

    /* renamed from: OooO0oo */
    public final /* synthetic */ OooOO0O f13806OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(OooOO0O oooOO0O, int i, IBinder iBinder, Bundle bundle) {
        super(oooOO0O, i, bundle);
        this.f13806OooO0oo = oooOO0O;
        this.f13805OooO0oO = iBinder;
    }

    @Override // Oooo00O.o0Oo0oo
    public final void OooO00o(o000Oo0 o000oo02) {
        OooOO0O oooOO0O = this.f13806OooO0oo;
        OooO0o oooO0o = oooOO0O.f13758OoooO00;
        if (oooO0o != null) {
            oooO0o.OooO(o000oo02);
        }
        oooOO0O.OooO0oo(o000oo02);
    }

    @Override // Oooo00O.o0Oo0oo
    public final boolean OooO0O0() throws RemoteException {
        IBinder iBinder = this.f13805OooO0oO;
        try {
            o000000O.OooO0oo(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            OooOO0O oooOO0O = this.f13806OooO0oo;
            if (!oooOO0O.OooO0o0().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + oooOO0O.OooO0o0() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceOooO0O0 = oooOO0O.OooO0O0(iBinder);
            if (iInterfaceOooO0O0 == null || !(OooOO0O.OooO(oooOO0O, 2, 4, iInterfaceOooO0O0) || OooOO0O.OooO(oooOO0O, 3, 4, iInterfaceOooO0O0))) {
                return false;
            }
            oooOO0O.f13760OoooOO0 = null;
            Bundle connectionHint = oooOO0O.getConnectionHint();
            OooO0OO oooO0OO = oooOO0O.f13745Oooo;
            if (oooO0OO == null) {
                return true;
            }
            oooO0OO.OooOO0(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
