package OoooOOO;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final /* synthetic */ class oOo000Oo implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f14853OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ oOo000o0 f14854OooOo0o;

    public /* synthetic */ oOo000Oo(oOo000o0 ooo000o0, int i) {
        this.f14853OooOo0O = i;
        this.f14854OooOo0o = ooo000o0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14853OooOo0O) {
            case 0:
                this.f14854OooOo0o.OooOOo0();
                break;
            case 1:
                oOo000o0 ooo000o0 = this.f14854OooOo0o;
                o0O000o0 o0o000o0 = ooo000o0.f14857OooOoO0;
                o0OO0oO0 o0oo0oo0 = (o0OO0oO0) ooo000o0.f14574OooOo0O;
                if (o0o000o0 == null) {
                    o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o0);
                    o0o0o0o0.f14393OooOoOO.OooO0O0("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        o0o000o0.Oooo0o(ooo000o0.OooOoOO(false));
                        ooo000o0.OooOo();
                        break;
                    } catch (RemoteException e) {
                        o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o02);
                        o0o0o0o02.f14393OooOoOO.OooO0OO(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
            default:
                oOo000o0 ooo000o02 = this.f14854OooOo0o;
                o0O000o0 o0o000o02 = ooo000o02.f14857OooOoO0;
                o0OO0oO0 o0oo0oo02 = (o0OO0oO0) ooo000o02.f14574OooOo0O;
                if (o0o000o02 == null) {
                    o0O0O0o0 o0o0o0o03 = o0oo0oo02.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o03);
                    o0o0o0o03.f14393OooOoOO.OooO0O0("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        o0o000o02.OoooO(ooo000o02.OooOoOO(false));
                        ooo000o02.OooOo();
                        break;
                    } catch (RemoteException e2) {
                        o0O0O0o0 o0o0o0o04 = o0oo0oo02.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o04);
                        o0o0o0o04.f14393OooOoOO.OooO0OO(e2, "Failed to send storage consent settings to the service");
                    }
                }
        }
    }
}
