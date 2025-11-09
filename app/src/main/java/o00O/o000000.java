package o00O;

import o00O0ooo.o0O000Oo;

/* loaded from: classes3.dex */
public final class o000000 extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo */
    public final /* synthetic */ o0O000Oo f31206OooOo;

    /* renamed from: OooOo0O */
    public int f31207OooOo0O;

    /* renamed from: OooOo0o */
    public /* synthetic */ Object f31208OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(o0O000Oo o0o000oo, o00O0O0O.OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f31206OooOo = o0o000oo;
    }

    @Override // o00O0OO0.OooO00o
    public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
        o000000 o000000Var = new o000000(this.f31206OooOo, oooO0OO);
        o000000Var.f31208OooOo0o = obj;
        return o000000Var;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o000000) create(obj, (o00O0O0O.OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.f31207OooOo0O;
        if (i == 0) {
            o00O0.o000OOo.OooOO0O(obj);
            Object obj2 = this.f31208OooOo0o;
            this.f31207OooOo0O = 1;
            if (this.f31206OooOo.emit(obj2, this) == oooOo00) {
                return oooOo00;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00O0.o000OOo.OooOO0O(obj);
        }
        return oo00o.OooOo.f33195OooO00o;
    }
}
