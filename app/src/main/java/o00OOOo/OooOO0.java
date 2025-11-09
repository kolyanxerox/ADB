package o00OOOO;

import OooO0oO.OooOo;
import java.io.IOException;
import o00OOOoO.o0000;

/* loaded from: classes3.dex */
public final class OooOO0 extends OooO00o {

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f32366OooOoO;

    @Override // o00OOOO.OooO00o, o00OOOoO.o0O0ooO
    public final long OooO0oO(long j, o0000 o0000Var) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(OooOo.OooO0oo(j, "byteCount < 0: "));
        }
        if (this.f32353OooOo0o) {
            throw new IllegalStateException("closed");
        }
        if (this.f32366OooOoO) {
            return -1L;
        }
        long jOooO0oO = super.OooO0oO(j, o0000Var);
        if (jOooO0oO != -1) {
            return jOooO0oO;
        }
        this.f32366OooOoO = true;
        OooO00o(null, true);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f32353OooOo0o) {
            return;
        }
        if (!this.f32366OooOoO) {
            OooO00o(null, false);
        }
        this.f32353OooOo0o = true;
    }
}
