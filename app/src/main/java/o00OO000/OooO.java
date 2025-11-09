package o00OO000;

/* loaded from: classes3.dex */
public final class OooO extends RuntimeException {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final transient o00O0O0O.OooOOO0 f31921OooOo0O;

    public OooO(o00O0O0O.OooOOO0 oooOOO0) {
        this.f31921OooOo0O = oooOOO0;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f31921OooOo0O.toString();
    }
}
