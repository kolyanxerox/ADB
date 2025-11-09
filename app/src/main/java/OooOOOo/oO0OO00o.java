package OoooOOO;

import Oooo00O.o000000O;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class oO0OO00o implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ oOo0000O f14746OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14747OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ o0O000o0 f14748OooOo0o;

    public oO0OO00o(oOo0000O ooo0000o, o0O000o0 o0o000o0, int i) {
        this.f14747OooOo0O = i;
        switch (i) {
            case 1:
                this.f14748OooOo0o = o0o000o0;
                Objects.requireNonNull(ooo0000o);
                this.f14746OooOo = ooo0000o;
                break;
            default:
                this.f14748OooOo0o = o0o000o0;
                this.f14746OooOo = ooo0000o;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14747OooOo0O) {
            case 0:
                oOo0000O ooo0000o = this.f14746OooOo;
                synchronized (ooo0000o) {
                    try {
                        ooo0000o.f14851OooOo0O = false;
                        oOo000o0 ooo000o0 = ooo0000o.f14850OooOo;
                        if (!ooo000o0.OooOoo0()) {
                            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) ooo000o0.f14574OooOo0O).f14520OooOoOO;
                            o0OO0oO0.OooOOO0(o0o0o0o0);
                            o0o0o0o0.f14398Oooo0.OooO0O0("Connected to service");
                            o0O000o0 o0o000o0 = this.f14748OooOo0o;
                            ooo000o0.OooOO0O();
                            ooo000o0.f14857OooOoO0 = o0o000o0;
                            ooo000o0.OooOo();
                            ooo000o0.OooOoO();
                        }
                    } finally {
                    }
                }
                return;
            default:
                oOo0000O ooo0000o2 = this.f14746OooOo;
                synchronized (ooo0000o2) {
                    try {
                        ooo0000o2.f14851OooOo0O = false;
                        oOo000o0 ooo000o02 = ooo0000o2.f14850OooOo;
                        if (!ooo000o02.OooOoo0()) {
                            o0O0O0o0 o0o0o0o02 = ((o0OO0oO0) ooo000o02.f14574OooOo0O).f14520OooOoOO;
                            o0OO0oO0.OooOOO0(o0o0o0o02);
                            o0o0o0o02.f14401Oooo00o.OooO0O0("Connected to remote service");
                            o0O000o0 o0o000o02 = this.f14748OooOo0o;
                            ooo000o02.OooOO0O();
                            o000000O.OooO0oo(o0o000o02);
                            ooo000o02.f14857OooOoO0 = o0o000o02;
                            ooo000o02.OooOo();
                            ooo000o02.OooOoO();
                        }
                    } finally {
                    }
                }
                oOo000o0 ooo000o03 = this.f14746OooOo.f14850OooOo;
                ScheduledExecutorService scheduledExecutorService = ooo000o03.f14860OooOoo0;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    ooo000o03.f14860OooOoo0 = null;
                    return;
                }
                return;
        }
    }
}
