package o00O0OO0;

import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o0OO00O;
import kotlin.jvm.internal.oo0o0Oo;

/* loaded from: classes3.dex */
public abstract class OooOOO extends OooOOO0 implements kotlin.jvm.internal.OooOOO {
    private final int arity;

    public OooOOO(int i, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.OooOOO
    public int getArity() {
        return this.arity;
    }

    @Override // o00O0OO0.OooO00o
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        o0OO00O.f28878OooO00o.getClass();
        String strOooO00o = oo0o0Oo.OooO00o(this);
        OooOo.OooO0Oo(strOooO00o, "renderLambdaToString(...)");
        return strOooO00o;
    }
}
