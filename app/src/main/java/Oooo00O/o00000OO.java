package Oooo00O;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class o00000OO implements ServiceConnection {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f13790OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f13791OooOo0o;

    public o00000OO(OooOO0O oooOO0O, int i) {
        this.f13791OooOo0o = oooOO0O;
        this.f13790OooOo0O = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        OooOO0O oooOO0O = this.f13791OooOo0o;
        if (iBinder == null) {
            synchronized (oooOO0O.f13749Oooo00o) {
                i = oooOO0O.f13755Oooo0oo;
            }
            if (i == 3) {
                oooOO0O.o000oOoO = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            o00000O0 o00000o02 = oooOO0O.f13748Oooo00O;
            o00000o02.sendMessage(o00000o02.obtainMessage(i2, oooOO0O.f13762OoooOOo.get(), 16));
            return;
        }
        synchronized (oooOO0O.f13746Oooo0) {
            try {
                OooOO0O oooOO0O2 = this.f13791OooOo0o;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                oooOO0O2.f13750Oooo0O0 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof oo0o0Oo)) ? new oo0o0Oo(iBinder) : (oo0o0Oo) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        OooOO0O oooOO0O3 = this.f13791OooOo0o;
        int i3 = this.f13790OooOo0O;
        oooOO0O3.getClass();
        o0000 o0000Var = new o0000(oooOO0O3, 0, null);
        o00000O0 o00000o03 = oooOO0O3.f13748Oooo00O;
        o00000o03.sendMessage(o00000o03.obtainMessage(7, i3, -1, o0000Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        OooOO0O oooOO0O;
        synchronized (this.f13791OooOo0o.f13746Oooo0) {
            oooOO0O = this.f13791OooOo0o;
            oooOO0O.f13750Oooo0O0 = null;
        }
        int i = this.f13790OooOo0O;
        o00000O0 o00000o02 = oooOO0O.f13748Oooo00O;
        o00000o02.sendMessage(o00000o02.obtainMessage(6, i, 1));
    }
}
