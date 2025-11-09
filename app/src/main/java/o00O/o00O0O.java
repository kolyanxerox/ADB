package o00O;

import o00O0oOo.o000OO;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0O00OOO;

/* loaded from: classes3.dex */
public final class o00O0O extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo */
    public final /* synthetic */ o0O00OOO f31213OooOo;

    /* renamed from: OooOo0O */
    public int f31214OooOo0O;

    /* renamed from: OooOo0o */
    public /* synthetic */ Object f31215OooOo0o;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ o0O000Oo f31216OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(o0O00OOO o0o00ooo, o0O000Oo o0o000oo, o00O0O0O.OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f31213OooOo = o0o00ooo;
        this.f31216OooOoO0 = o0o000oo;
    }

    @Override // o00O0OO0.OooO00o
    public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
        o00O0O o00o0o = new o00O0O(this.f31213OooOo, this.f31216OooOoO0, oooO0OO);
        o00o0o.f31215OooOo0o = obj;
        return o00o0o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o00O0O) create((o000OO) obj, (o00O0O0O.OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.f31214OooOo0O;
        if (i == 0) {
            o00O0.o000OOo.OooOO0O(obj);
            o000OO o000oo2 = (o000OO) this.f31215OooOo0o;
            this.f31214OooOo0O = 1;
            if (this.f31213OooOo.invoke(o000oo2, this.f31216OooOoO0, this) == oooOo00) {
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
