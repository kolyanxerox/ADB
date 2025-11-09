package o000Oooo;

import o000OooO.OooOo;
import o000OooO.Oooo000;
import o000OooO.o00Ooo;

/* loaded from: classes2.dex */
public final class o0000Ooo implements Oooo000 {

    /* renamed from: OooO00o */
    public final /* synthetic */ o0000 f30630OooO00o;

    public o0000Ooo(o0000 o0000Var) {
        this.f30630OooO00o = o0000Var;
    }

    @Override // o000OooO.Oooo000
    public final void onError(o00Ooo o00ooo2) {
        o0000 o0000Var = this.f30630OooO00o;
        synchronized (o0000Var) {
            o0000Var.f30576OooO0Oo = true;
        }
        this.f30630OooO00o.OooO0oO(o00ooo2);
    }

    @Override // o000OooO.Oooo000
    public final void onUpdate(OooOo oooOo) {
    }
}
