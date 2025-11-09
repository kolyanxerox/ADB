package o000o0O;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0oOo.o000OO;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes2.dex */
public final class o0ooOOo extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo0O */
    public int f30943OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ oo0o0Oo f30944OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(oo0o0Oo oo0o0oo, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f30944OooOo0o = oo0o0oo;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new o0ooOOo(this.f30944OooOo0o, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o0ooOOo) create((o000OO) obj, (OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.f30943OooOo0O;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            oo0o0Oo oo0o0oo = this.f30944OooOo0o;
            o0OoOoOo data = oo0o0oo.f30948OooO0O0.getData();
            o00oO0o o00oo0o = new o00oO0o(oo0o0oo.f30949OooO0OO);
            this.f30943OooOo0O = 1;
            if (data.collect(o00oo0o, this) == oooOo00) {
                return oooOo00;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
        }
        return oo00o.OooOo.f33195OooO00o;
    }
}
