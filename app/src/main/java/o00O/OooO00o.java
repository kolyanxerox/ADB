package o00O;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class OooO00o extends CancellationException {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final transient Object f31166OooOo0O;

    public OooO00o(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f31166OooOo0O = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
