package OoooOOO;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class o0OOOO00 implements Callable {

    /* renamed from: OooOo */
    public final /* synthetic */ Bundle f14558OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14559OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ oOO0 f14560OooOo0o;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ o0OOo000 f14561OooOoO0;

    public o0OOOO00(o0OOo000 o0ooo000, oOO0 ooo0, Bundle bundle, int i) {
        this.f14559OooOo0O = i;
        switch (i) {
            case 1:
                this.f14560OooOo0o = ooo0;
                this.f14558OooOo = bundle;
                Objects.requireNonNull(o0ooo000);
                this.f14561OooOoO0 = o0ooo000;
                break;
            default:
                this.f14560OooOo0o = ooo0;
                this.f14558OooOo = bundle;
                Objects.requireNonNull(o0ooo000);
                this.f14561OooOoO0 = o0ooo000;
                break;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f14559OooOo0O) {
            case 0:
                o0OOo000 o0ooo000 = this.f14561OooOoO0;
                o0ooo000.f14568OooOo0O.OooOoo0();
                return o0ooo000.f14568OooOo0O.OooooO0(this.f14560OooOo0o, this.f14558OooOo);
            default:
                o0OOo000 o0ooo0002 = this.f14561OooOoO0;
                o0ooo0002.f14568OooOo0O.OooOoo0();
                return o0ooo0002.f14568OooOo0O.OooooO0(this.f14560OooOo0o, this.f14558OooOo);
        }
    }
}
