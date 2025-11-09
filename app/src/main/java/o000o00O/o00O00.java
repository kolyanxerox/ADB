package o000o00o;

import o00O0O0O.OooO0OO;
import o00O0ooo.o0oO0O0o;

/* loaded from: classes2.dex */
public final class o00O00 extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f30827OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f30828OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(o00O0O00 o00o0o00, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f30828OooOo0o = o00o0o00;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new o00O00(this.f30828OooOo0o, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o00O00) create((o00O0oOo.o000OO) obj, (OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.f30827OooOo0O;
        if (i == 0) {
            o00O0.o000OOo.OooOO0O(obj);
            o00O0O00 o00o0o00 = this.f30828OooOo0o;
            o0oO0O0o o0oo0o0o = new o0oO0O0o(o00o0o00.f30855OooO0o0.getData(), new o00O000(o00o0o00, (OooO0OO) null));
            o00O000o o00o000o = new o00O000o(o00o0o00, 0);
            this.f30827OooOo0O = 1;
            if (o0oo0o0o.collect(o00o000o, this) == oooOo00) {
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
