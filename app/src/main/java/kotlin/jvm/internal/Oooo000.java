package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class Oooo000 implements OooOOO, Serializable {
    private final int arity;

    public Oooo000(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.OooOOO
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        o0OO00O.f28878OooO00o.getClass();
        String strOooO00o = oo0o0Oo.OooO00o(this);
        OooOo.OooO0Oo(strOooO00o, "renderLambdaToString(...)");
        return strOooO00o;
    }
}
