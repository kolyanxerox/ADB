package OooOOo0;

import OooOOO.OooO0O0;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o00oO0o implements OooOOO.OooO {

    /* renamed from: OooO00o */
    public final Set f13513OooO00o;

    /* renamed from: OooO0O0 */
    public final OooOo f13514OooO0O0;

    /* renamed from: OooO0OO */
    public final o0Oo0oo f13515OooO0OO;

    public o00oO0o(Set set, OooOo oooOo, o0Oo0oo o0oo0oo) {
        this.f13513OooO00o = set;
        this.f13514OooO0O0 = oooOo;
        this.f13515OooO0OO = o0oo0oo;
    }

    public final o0OOO0o OooO00o(String str, OooO0O0 oooO0O0, OooOOO.OooO0o oooO0o) {
        Set set = this.f13513OooO00o;
        if (set.contains(oooO0O0)) {
            return new o0OOO0o(this.f13514OooO0O0, str, oooO0O0, oooO0o, this.f13515OooO0OO, 0);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", oooO0O0, set));
    }
}
