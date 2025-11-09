package OoooOOO;

import OoooO0O.o00000OO;
import com.google.android.gms.internal.measurement.o0000oo;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0OO0o implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ AppMeasurementDynamiteService f14502OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14503OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ o0000oo f14504OooOo0o;

    public o0OO0o(AppMeasurementDynamiteService appMeasurementDynamiteService, o0000oo o0000ooVar, int i) {
        this.f14503OooOo0O = i;
        switch (i) {
            case 1:
                this.f14504OooOo0o = o0000ooVar;
                Objects.requireNonNull(appMeasurementDynamiteService);
                this.f14502OooOo = appMeasurementDynamiteService;
                break;
            default:
                this.f14504OooOo0o = o0000ooVar;
                this.f14502OooOo = appMeasurementDynamiteService;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14503OooOo0O) {
            case 0:
                oOo000o0 ooo000o0OooOOOo = this.f14502OooOo.f27227OooOo0O.OooOOOo();
                ooo000o0OooOOOo.OooOO0O();
                ooo000o0OooOOOo.OooOO0o();
                ooo000o0OooOOOo.OooOoO0(new o00000OO(ooo000o0OooOOOo, ooo000o0OooOOOo.OooOoOO(false), this.f14504OooOo0o, false, 8));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f14502OooOo;
                oOO00OO ooo00oo = appMeasurementDynamiteService.f27227OooOo0O.f14523OooOooO;
                o0OO0oO0.OooOO0O(ooo00oo);
                o0OO0oO0 o0oo0oo0 = appMeasurementDynamiteService.f27227OooOo0O;
                ooo00oo.o000oOoO(this.f14504OooOo0o, o0oo0oo0.f14536OoooO != null && o0oo0oo0.f14536OoooO.booleanValue());
                break;
        }
    }
}
