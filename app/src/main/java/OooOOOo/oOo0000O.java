package OoooOOO;

import OooOooo.o000Oo0;
import Oooo.OooOOO;
import Oooo00O.OooO0OO;
import Oooo00O.OooO0o;
import Oooo00O.o000000O;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Objects;
import o00000oO.OooOOO0;

/* loaded from: classes2.dex */
public final class oOo0000O implements ServiceConnection, OooO0OO, OooO0o {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ oOo000o0 f14850OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public volatile boolean f14851OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public volatile o0O00oO0 f14852OooOo0o;

    public oOo0000O(oOo000o0 ooo000o0) {
        Objects.requireNonNull(ooo000o0);
        this.f14850OooOo = ooo000o0;
    }

    @Override // Oooo00O.OooO0o
    public final void OooO(o000Oo0 o000oo02) {
        oOo000o0 ooo000o0 = this.f14850OooOo;
        o0OO0o00 o0oo0o00 = ((o0OO0oO0) ooo000o0.f14574OooOo0O).f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOOOo();
        o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) ooo000o0.f14574OooOo0O).f14520OooOoOO;
        if (o0o0o0o0 == null || !o0o0o0o0.f14751OooOo0o) {
            o0o0o0o0 = null;
        }
        if (o0o0o0o0 != null) {
            o0o0o0o0.f14398Oooo0.OooO0OO(o000oo02, "Service connection failed");
        }
        synchronized (this) {
            this.f14851OooOo0O = false;
            this.f14852OooOo0o = null;
        }
        o0OO0o00 o0oo0o002 = ((o0OO0oO0) this.f14850OooOo.f14574OooOo0O).f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o002);
        o0oo0o002.OooOo00(new OooOOO0(this, o000oo02));
    }

    @Override // Oooo00O.OooO0OO
    public final void OooOO0(Bundle bundle) {
        o0OO0o00 o0oo0o00 = ((o0OO0oO0) this.f14850OooOo.f14574OooOo0O).f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOOOo();
        synchronized (this) {
            try {
                o000000O.OooO0oo(this.f14852OooOo0o);
                o0O000o0 o0o000o0 = (o0O000o0) this.f14852OooOo0o.getService();
                o0OO0o00 o0oo0o002 = ((o0OO0oO0) this.f14850OooOo.f14574OooOo0O).f14522OooOoo0;
                o0OO0oO0.OooOOO0(o0oo0o002);
                o0oo0o002.OooOo00(new oO0OO00o(this, o0o000o0, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f14852OooOo0o = null;
                this.f14851OooOo0O = false;
            }
        }
    }

    @Override // Oooo00O.OooO0OO
    public final void OooOOO(int i) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14850OooOo.f14574OooOo0O;
        o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOOOo();
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14401Oooo00o.OooO0O0("Service connection suspended");
        o0OO0o00 o0oo0o002 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o002);
        o0oo0o002.OooOo00(new OooOOO(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o0OO0o00 o0oo0o00 = ((o0OO0oO0) this.f14850OooOo.f14574OooOo0O).f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOOOo();
        synchronized (this) {
            if (iBinder == null) {
                this.f14851OooOo0O = false;
                o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14850OooOo.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14393OooOoOO.OooO0O0("Service connected with null binder");
                return;
            }
            o0O000o0 o0oooooo = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    o0oooooo = iInterfaceQueryLocalInterface instanceof o0O000o0 ? (o0O000o0) iInterfaceQueryLocalInterface : new o0OoOoOo(iBinder);
                    o0O0O0o0 o0o0o0o02 = ((o0OO0oO0) this.f14850OooOo.f14574OooOo0O).f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o02);
                    o0o0o0o02.f14398Oooo0.OooO0O0("Bound to IMeasurementService interface");
                } else {
                    o0O0O0o0 o0o0o0o03 = ((o0OO0oO0) this.f14850OooOo.f14574OooOo0O).f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o03);
                    o0o0o0o03.f14393OooOoOO.OooO0OO(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                o0O0O0o0 o0o0o0o04 = ((o0OO0oO0) this.f14850OooOo.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o04);
                o0o0o0o04.f14393OooOoOO.OooO0O0("Service connect failed to get IMeasurementService");
            }
            if (o0oooooo == null) {
                this.f14851OooOo0O = false;
                try {
                    Oooo0O0.OooO0OO oooO0OOOooO00o = Oooo0O0.OooO0OO.OooO00o();
                    oOo000o0 ooo000o0 = this.f14850OooOo;
                    oooO0OOOooO00o.OooO0O0(((o0OO0oO0) ooo000o0.f14574OooOo0O).f14516OooOo0O, ooo000o0.f14855OooOo);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                o0OO0o00 o0oo0o002 = ((o0OO0oO0) this.f14850OooOo.f14574OooOo0O).f14522OooOoo0;
                o0OO0oO0.OooOOO0(o0oo0o002);
                o0oo0o002.OooOo00(new oO0OO00o(this, o0oooooo, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14850OooOo.f14574OooOo0O;
        o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOOOo();
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14401Oooo00o.OooO0O0("Service disconnected");
        o0OO0o00 o0oo0o002 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o002);
        o0oo0o002.OooOo00(new OooOOO0(this, false, componentName, 15));
    }
}
