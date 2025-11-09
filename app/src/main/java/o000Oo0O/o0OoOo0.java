package o000Oo0O;

import com.google.android.gms.tasks.TaskCompletionSource;
import o000Oo0o.o0ooOOo;

/* loaded from: classes2.dex */
public final class o0OoOo0 implements o00Ooo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final oo000o f30388OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final TaskCompletionSource f30389OooO0O0;

    public o0OoOo0(oo000o oo000oVar, TaskCompletionSource taskCompletionSource) {
        this.f30388OooO00o = oo000oVar;
        this.f30389OooO0O0 = taskCompletionSource;
    }

    @Override // o000Oo0O.o00Ooo
    public final boolean OooO00o(o0ooOOo o0ooooo) {
        if (o0ooooo.f30407OooO0O0 != 4 || this.f30388OooO00o.OooO00o(o0ooooo)) {
            return false;
        }
        String str = o0ooooo.f30408OooO0OO;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f30389OooO0O0.setResult(new OooOOOO(str, o0ooooo.f30411OooO0o0, o0ooooo.f30410OooO0o));
        return true;
    }

    @Override // o000Oo0O.o00Ooo
    public final boolean OooO0O0(Exception exc) {
        this.f30389OooO0O0.trySetException(exc);
        return true;
    }
}
