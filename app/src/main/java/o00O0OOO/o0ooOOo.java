package o00O0oOo;

import java.util.concurrent.ScheduledFuture;
import o00O0Oo.Oooo000;

/* loaded from: classes3.dex */
public final class o0ooOOo implements o0OOO0o {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31570OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f31571OooOo0o;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f31570OooOo0O = i;
        this.f31571OooOo0o = obj;
    }

    @Override // o00O0oOo.o0OOO0o
    public final void OooO00o(Throwable th) {
        switch (this.f31570OooOo0O) {
            case 0:
                ((ScheduledFuture) this.f31571OooOo0o).cancel(false);
                break;
            case 1:
                ((Oooo000) this.f31571OooOo0o).invoke(th);
                break;
            default:
                ((o000OO00) this.f31571OooOo0o).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.f31570OooOo0O) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f31571OooOo0o) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Oooo000) this.f31571OooOo0o).getClass().getSimpleName() + '@' + o0000OO0.OooOOOo(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o000OO00) this.f31571OooOo0o) + ']';
        }
    }
}
