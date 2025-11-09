package o0000oo0;

import java.util.Set;
import o0000o0.OooOOO;
import o000OOo0.OooO00o;
import o000OOo0.OooO0O0;

/* loaded from: classes2.dex */
public final class o0000Ooo implements OooO0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Set f29666OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f29667OooO0O0;

    public o0000Ooo(Set set, OooO0O0 oooO0O0) {
        this.f29666OooO00o = set;
        this.f29667OooO0O0 = oooO0O0;
    }

    @Override // o000OOo0.OooO0O0
    public final void OooO00o(OooO00o oooO00o) {
        if (this.f29666OooO00o.contains(OooOOO.class)) {
            this.f29667OooO0O0.OooO00o(oooO00o);
            return;
        }
        throw new OooOOO0.OooO00o("Attempting to publish an undeclared event " + oooO00o + ".");
    }
}
