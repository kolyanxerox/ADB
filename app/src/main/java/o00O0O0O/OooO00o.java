package o00O0O0O;

import kotlin.jvm.internal.OooOo;
import o00O0Oo.o00O0O;

/* loaded from: classes3.dex */
public abstract class OooO00o implements OooOO0 {
    private final OooOO0O key;

    public OooO00o(OooOO0O key) {
        OooOo.OooO0o0(key, "key");
        this.key = key;
    }

    @Override // o00O0O0O.OooOOO0
    public <R> R fold(R r, o00O0O operation) {
        OooOo.OooO0o0(operation, "operation");
        return (R) operation.invoke(r, this);
    }

    @Override // o00O0O0O.OooOOO0
    public <E extends OooOO0> E get(OooOO0O oooOO0O) {
        return (E) OooO00o.OooO00o.OooO(this, oooOO0O);
    }

    @Override // o00O0O0O.OooOO0
    public OooOO0O getKey() {
        return this.key;
    }

    @Override // o00O0O0O.OooOOO0
    public OooOOO0 minusKey(OooOO0O oooOO0O) {
        return OooO00o.OooO00o.OooOOoo(this, oooOO0O);
    }

    @Override // o00O0O0O.OooOOO0
    public OooOOO0 plus(OooOOO0 oooOOO0) {
        return OooO00o.OooO00o.OooOo00(this, oooOOO0);
    }
}
