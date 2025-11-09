package OooOOo0;

import OoooOOO.o0OO0o00;
import OoooOOO.o0OO0oO0;
import OoooOOO.oO0O0OoO;
import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class o00Ooo implements Executor {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13511OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f13512OooOo0o;

    public /* synthetic */ o00Ooo(Object obj, int i) {
        this.f13511OooOo0O = i;
        this.f13512OooOo0o = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f13511OooOo0O) {
            case 0:
                ((ExecutorService) this.f13512OooOo0o).execute(new o00Oo0(runnable, 0));
                break;
            case 1:
                ((Handler) this.f13512OooOo0o).post(runnable);
                break;
            case 2:
                o0OO0o00 o0oo0o00 = ((o0OO0oO0) ((oO0O0OoO) this.f13512OooOo0o).f14574OooOo0O).f14522OooOoo0;
                o0OO0oO0.OooOOO0(o0oo0o00);
                o0oo0o00.OooOo00(runnable);
                break;
            default:
                ((OoooO0.OooOO0O) this.f13512OooOo0o).post(runnable);
                break;
        }
    }

    public o00Ooo(oO0O0OoO oo0o0ooo) {
        this.f13511OooOo0O = 2;
        Objects.requireNonNull(oo0o0ooo);
        this.f13512OooOo0o = oo0o0ooo;
    }
}
