package OoooOOO;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.o0000OO0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ooooO000 implements oO0000Oo {

    /* renamed from: OooO00o */
    public final o0000OO0 f14931OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ AppMeasurementDynamiteService f14932OooO0O0;

    public ooooO000(AppMeasurementDynamiteService appMeasurementDynamiteService, o0000OO0 o0000oo02) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f14932OooO0O0 = appMeasurementDynamiteService;
        this.f14931OooO00o = o0000oo02;
    }

    @Override // OoooOOO.oO0000Oo
    public final void OooO00o(long j, Bundle bundle, String str, String str2) {
        try {
            this.f14931OooO00o.o00000oO(j, bundle, str, str2);
        } catch (RemoteException e) {
            o0OO0oO0 o0oo0oo0 = this.f14932OooO0O0.f27227OooOo0O;
            if (o0oo0oo0 != null) {
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14396OooOooO.OooO0OO(e, "Event listener threw exception");
            }
        }
    }
}
