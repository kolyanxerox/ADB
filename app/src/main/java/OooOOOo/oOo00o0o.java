package OoooOOO;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oOo00o0o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ oOo000o0 f14869OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f14870OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ oOO0 f14871OooOo0o;

    public /* synthetic */ oOo00o0o(oOo000o0 ooo000o0, oOO0 ooo0, int i) {
        this.f14870OooOo0O = i;
        this.f14871OooOo0o = ooo0;
        this.f14869OooOo = ooo000o0;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f14870OooOo0O) {
            case 0:
                oOo000o0 ooo000o0 = this.f14869OooOo;
                o0O000o0 o0o000o0 = ooo000o0.f14857OooOoO0;
                o0OO0oO0 o0oo0oo0 = (o0OO0oO0) ooo000o0.f14574OooOo0O;
                if (o0o000o0 != null) {
                    try {
                        o0o000o0.OoooOO0(this.f14871OooOo0o);
                    } catch (RemoteException e) {
                        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o0);
                        o0o0o0o0.f14393OooOoOO.OooO0OO(e, "Failed to reset data on the service: remote exception");
                    }
                    ooo000o0.OooOo();
                    break;
                } else {
                    o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o02);
                    o0o0o0o02.f14393OooOoOO.OooO0O0("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                oOo000o0 ooo000o02 = this.f14869OooOo;
                o0O000o0 o0o000o02 = ooo000o02.f14857OooOoO0;
                o0OO0oO0 o0oo0oo02 = (o0OO0oO0) ooo000o02.f14574OooOo0O;
                if (o0o000o02 == null) {
                    o0O0O0o0 o0o0o0o03 = o0oo0oo02.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o03);
                    o0o0o0o03.f14393OooOoOO.OooO0O0("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        oOO0 ooo0 = this.f14871OooOo0o;
                        o00O0OO o00o0oo = o0oo0oo02.f14519OooOoO0;
                        o0O000 o0o000 = o0O000O.f14304o0000Oo0;
                        if (o00o0oo.OooOo0(null, o0o000)) {
                            ooo000o02.OooOoo(o0o000o02, null, ooo0);
                        }
                        o0o000o02.OooOo0O(ooo0);
                        o0oo0oo02.OooOOOO().OooOOOo();
                        o0oo0oo02.f14519OooOoO0.OooOo0(null, o0o000);
                        ooo000o02.OooOoo(o0o000o02, null, ooo0);
                        ooo000o02.OooOo();
                        break;
                    } catch (RemoteException e2) {
                        o0O0O0o0 o0o0o0o04 = o0oo0oo02.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o04);
                        o0o0o0o04.f14393OooOoOO.OooO0OO(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
            case 2:
                oOo000o0 ooo000o03 = this.f14869OooOo;
                o0O000o0 o0o000o03 = ooo000o03.f14857OooOoO0;
                o0OO0oO0 o0oo0oo03 = (o0OO0oO0) ooo000o03.f14574OooOo0O;
                if (o0o000o03 == null) {
                    o0O0O0o0 o0o0o0o05 = o0oo0oo03.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o05);
                    o0o0o0o05.f14396OooOooO.OooO0O0("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        o0o000o03.OooooOO(this.f14871OooOo0o);
                        ooo000o03.OooOo();
                        break;
                    } catch (RemoteException e3) {
                        o0O0O0o0 o0o0o0o06 = o0oo0oo03.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o06);
                        o0o0o0o06.f14393OooOoOO.OooO0OO(e3, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
            case 3:
                oOo000o0 ooo000o04 = this.f14869OooOo;
                o0O000o0 o0o000o04 = ooo000o04.f14857OooOoO0;
                o0OO0oO0 o0oo0oo04 = (o0OO0oO0) ooo000o04.f14574OooOo0O;
                if (o0o000o04 == null) {
                    o0O0O0o0 o0o0o0o07 = o0oo0oo04.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o07);
                    o0o0o0o07.f14393OooOoOO.OooO0O0("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        o0o000o04.Oooo0oO(this.f14871OooOo0o);
                        ooo000o04.OooOo();
                        break;
                    } catch (RemoteException e4) {
                        o0O0O0o0 o0o0o0o08 = o0oo0oo04.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o08);
                        o0o0o0o08.f14393OooOoOO.OooO0OO(e4, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
            default:
                oOo000o0 ooo000o05 = this.f14869OooOo;
                o0O000o0 o0o000o05 = ooo000o05.f14857OooOoO0;
                o0OO0oO0 o0oo0oo05 = (o0OO0oO0) ooo000o05.f14574OooOo0O;
                if (o0o000o05 == null) {
                    o0O0O0o0 o0o0o0o09 = o0oo0oo05.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o09);
                    o0o0o0o09.f14393OooOoOO.OooO0O0("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        o0o000o05.o00Ooo(this.f14871OooOo0o);
                        ooo000o05.OooOo();
                        break;
                    } catch (RemoteException e5) {
                        o0O0O0o0 o0o0o0o010 = o0oo0oo05.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o010);
                        o0o0o0o010.f14393OooOoOO.OooO0OO(e5, "Failed to send consent settings to the service");
                    }
                }
        }
    }

    public oOo00o0o(oOo000o0 ooo000o0, oOO0 ooo0) {
        this.f14870OooOo0O = 4;
        this.f14871OooOo0o = ooo0;
        Objects.requireNonNull(ooo000o0);
        this.f14869OooOo = ooo000o0;
    }
}
