package OoooOOO;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0OO00OO implements Callable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14485OooOo0O = 0;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f14486OooOo0o;

    public /* synthetic */ o0OO00OO(o0OO00o0 o0oo00o0) {
        this.f14486OooOo0o = o0oo00o0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14485OooOo0O) {
            case 0:
                return new com.google.android.gms.internal.measurement.o0OOO0OO(((o0OO00o0) this.f14486OooOo0o).f14495Oooo000);
            default:
                o0OOo000 o0ooo000 = (o0OOo000) this.f14486OooOo0o;
                o0ooo000.f14568OooOo0O.OooOoo0();
                oo0OOoo oo0oooo = o0ooo000.f14568OooOo0O.f14798OooOoo;
                oOO0000.OoooOO0(oo0oooo);
                oo0oooo.OooOO0O();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public o0OO00OO(o0OOo000 o0ooo000, o00OOOOo o00ooooo, String str) {
        Objects.requireNonNull(o0ooo000);
        this.f14486OooOo0o = o0ooo000;
    }
}
