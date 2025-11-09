package o00OOOO;

import java.io.IOException;
import o00OOOoO.o000;
import o00OOOoO.o0000;
import o00OOOoO.o00O000;
import o00OOOoO.o0O0ooO;

/* loaded from: classes3.dex */
public abstract class OooO00o implements o0O0ooO {

    /* renamed from: OooOo, reason: collision with root package name */
    public long f32351OooOo = 0;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o000 f32352OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f32353OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f32354OooOoO0;

    public OooO00o(OooOO0O oooOO0O) {
        this.f32354OooOoO0 = oooOO0O;
        this.f32352OooOo0O = new o000(oooOO0O.f32369OooO0OO.f32577OooOo0O.timeout());
    }

    public final void OooO00o(IOException iOException, boolean z) throws IOException {
        OooOO0O oooOO0O = this.f32354OooOoO0;
        int i = oooOO0O.f32372OooO0o0;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + oooOO0O.f32372OooO0o0);
        }
        o000 o000Var = this.f32352OooOo0O;
        o00O000 o00o000 = o000Var.f32533OooO0o0;
        o000Var.f32533OooO0o0 = o00O000.f32601OooO0Oo;
        o00o000.OooO00o();
        o00o000.OooO0O0();
        oooOO0O.f32372OooO0o0 = 6;
        o00OOO.OooO oooO = oooOO0O.f32368OooO0O0;
        if (oooO != null) {
            oooO.OooO0oo(!z, oooOO0O, iOException);
        }
    }

    @Override // o00OOOoO.o0O0ooO
    public long OooO0oO(long j, o0000 o0000Var) throws IOException {
        try {
            long jOooO0oO = this.f32354OooOoO0.f32369OooO0OO.OooO0oO(j, o0000Var);
            if (jOooO0oO <= 0) {
                return jOooO0oO;
            }
            this.f32351OooOo += jOooO0oO;
            return jOooO0oO;
        } catch (IOException e) {
            OooO00o(e, false);
            throw e;
        }
    }

    @Override // o00OOOoO.o0O0ooO
    public final o00O000 timeout() {
        return this.f32352OooOo0O;
    }
}
