package o00OOOOo;

import java.io.IOException;
import o00OOOoO.o0000;
import o00OOOoO.o0000OO0;
import o00OOOoO.o0O0ooO;

/* loaded from: classes3.dex */
public final class OooOO0O extends o0000OO0 {

    /* renamed from: OooOo */
    public long f32425OooOo;

    /* renamed from: OooOo0o */
    public boolean f32426OooOo0o;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ OooOOO0 f32427OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(OooOOO0 oooOOO0, o0O0ooO o0o0ooo) {
        super(o0o0ooo);
        this.f32427OooOoO0 = oooOOO0;
        this.f32426OooOo0o = false;
        this.f32425OooOo = 0L;
    }

    @Override // o00OOOoO.o0O0ooO
    public final long OooO0oO(long j, o0000 o0000Var) throws IOException {
        try {
            long jOooO0oO = this.f32560OooOo0O.OooO0oO(j, o0000Var);
            if (jOooO0oO <= 0) {
                return jOooO0oO;
            }
            this.f32425OooOo += jOooO0oO;
            return jOooO0oO;
        } catch (IOException e) {
            if (!this.f32426OooOo0o) {
                this.f32426OooOo0o = true;
                OooOOO0 oooOOO0 = this.f32427OooOoO0;
                oooOOO0.f32434OooO0O0.OooO0oo(false, oooOOO0, e);
            }
            throw e;
        }
    }

    @Override // o00OOOoO.o0000OO0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f32426OooOo0o) {
            return;
        }
        this.f32426OooOo0o = true;
        OooOOO0 oooOOO0 = this.f32427OooOoO0;
        oooOOO0.f32434OooO0O0.OooO0oo(false, oooOOO0, null);
    }
}
