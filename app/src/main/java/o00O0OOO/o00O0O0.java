package o00O0oOo;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class o00O0O0 extends CancellationException {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final transient o00O f31538OooOo0O;

    public o00O0O0(String str, Throwable th, o00O o00o) {
        super(str);
        this.f31538OooOo0O = o00o;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00O0O0)) {
            return false;
        }
        o00O0O0 o00o0o0 = (o00O0O0) obj;
        return OooOo.OooO00o(o00o0o0.getMessage(), getMessage()) && OooOo.OooO00o(o00o0o0.f31538OooOo0O, this.f31538OooOo0O) && OooOo.OooO00o(o00o0o0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        OooOo.OooO0O0(message);
        int iHashCode = (this.f31538OooOo0O.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f31538OooOo0O;
    }
}
