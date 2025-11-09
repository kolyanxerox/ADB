package o000o0O;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0oOo.o000OO;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;

/* loaded from: classes2.dex */
public final class o0OOO0o extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo0O */
    public int f30938OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ oo0o0Oo f30939OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(oo0o0Oo oo0o0oo, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f30939OooOo0o = oo0o0oo;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new o0OOO0o(this.f30939OooOo0o, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o0OOO0o) create((o000OO) obj, (OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.f30938OooOo0O;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return obj;
        }
        o000OOo.OooOO0O(obj);
        o0OoOoOo data = this.f30939OooOo0o.f30948OooO0O0.getData();
        this.f30938OooOo0O = 1;
        Object objOooOO0o = o0o0000.OooOO0o(data, this);
        return objOooOO0o == oooOo00 ? oooOo00 : objOooOO0o;
    }
}
