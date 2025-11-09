package o00O0ooo;

import o00O.OooO0O0;
import o00O.OooO0o;
import o00O0O0O.OooO0OO;
import o00O0oOo.oo0o0Oo;

/* loaded from: classes3.dex */
public final class oO0Oo extends OooO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public long f31842OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public oo0o0Oo f31843OooO0O0;

    @Override // o00O.OooO0o
    public final boolean OooO00o(OooO0O0 oooO0O0) {
        o0OOo000 o0ooo000 = (o0OOo000) oooO0O0;
        if (this.f31842OooO00o >= 0) {
            return false;
        }
        long j = o0ooo000.f31792OooOoo;
        if (j < o0ooo000.f31794OooOooO) {
            o0ooo000.f31794OooOooO = j;
        }
        this.f31842OooO00o = j;
        return true;
    }

    @Override // o00O.OooO0o
    public final OooO0OO[] OooO0O0(OooO0O0 oooO0O0) {
        long j = this.f31842OooO00o;
        this.f31842OooO00o = -1L;
        this.f31843OooO0O0 = null;
        return ((o0OOo000) oooO0O0).OooOOoo(j);
    }
}
