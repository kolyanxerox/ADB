package OoooOOO;

import java.lang.Thread;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0OO0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f14479OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0OO0o00 f14480OooO0O0;

    public o0OO0(o0OO0o00 o0oo0o00, String str) {
        Objects.requireNonNull(o0oo0o00);
        this.f14480OooO0O0 = o0oo0o00;
        this.f14479OooO00o = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14480OooO0O0.f14574OooOo0O).f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14393OooOoOO.OooO0OO(th, this.f14479OooO00o);
    }
}
