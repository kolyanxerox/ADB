package o00OOOoO;

import java.io.IOException;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public abstract class o0000OO0 implements o0O0ooO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o0O0ooO f32560OooOo0O;

    public o0000OO0(o0O0ooO delegate) {
        OooOo.OooO0o0(delegate, "delegate");
        this.f32560OooOo0O = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32560OooOo0O.close();
    }

    @Override // o00OOOoO.o0O0ooO
    public final o00O000 timeout() {
        return this.f32560OooOo0O.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f32560OooOo0O + ')';
    }
}
