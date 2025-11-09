package o00OOOO;

import OooO0oO.OooOo;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o00OOOoO.o0000;

/* loaded from: classes3.dex */
public final class OooO extends OooO00o {

    /* renamed from: OooOoO, reason: collision with root package name */
    public long f32350OooOoO;

    @Override // o00OOOO.OooO00o, o00OOOoO.o0O0ooO
    public final long OooO0oO(long j, o0000 o0000Var) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(OooOo.OooO0oo(j, "byteCount < 0: "));
        }
        if (this.f32353OooOo0o) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f32350OooOoO;
        if (j2 == 0) {
            return -1L;
        }
        long jOooO0oO = super.OooO0oO(Math.min(j2, j), o0000Var);
        if (jOooO0oO == -1) {
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            OooO00o(protocolException, false);
            throw protocolException;
        }
        long j3 = this.f32350OooOoO - jOooO0oO;
        this.f32350OooOoO = j3;
        if (j3 == 0) {
            OooO00o(null, true);
        }
        return jOooO0oO;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zOooOOo0;
        if (this.f32353OooOo0o) {
            return;
        }
        if (this.f32350OooOoO != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zOooOOo0 = o00OOO0O.OooO0OO.OooOOo0(this, 100);
            } catch (IOException unused) {
                zOooOOo0 = false;
            }
            if (!zOooOOo0) {
                OooO00o(null, false);
            }
        }
        this.f32353OooOo0o = true;
    }
}
