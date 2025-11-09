package o000o0O;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;

/* loaded from: classes2.dex */
public final class o0OO00O extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo0O */
    public final /* synthetic */ o00O0O f30937OooOo0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(o00O0O o00o0o, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f30937OooOo0O = o00o0o;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new o0OO00O(this.f30937OooOo0O, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o0OO00O) create((o00O0O) obj, (OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        o000OOo.OooOO0O(obj);
        return this.f30937OooOo0O;
    }
}
