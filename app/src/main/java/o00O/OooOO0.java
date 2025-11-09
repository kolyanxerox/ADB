package o00O;

import o00O0oo.o00oOoo;

/* loaded from: classes3.dex */
public final class OooOO0 extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f31174OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f31175OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f31176OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooOOO0 oooOOO0, o00O0O0O.OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f31174OooOo = oooOOO0;
    }

    @Override // o00O0OO0.OooO00o
    public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
        OooOO0 oooOO0 = new OooOO0(this.f31174OooOo, oooO0OO);
        oooOO0.f31176OooOo0o = obj;
        return oooOO0;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((OooOO0) create((o00oOoo) obj, (o00O0O0O.OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.f31175OooOo0O;
        if (i == 0) {
            o00O0.o000OOo.OooOO0O(obj);
            o00oOoo o00oooo = (o00oOoo) this.f31176OooOo0o;
            this.f31175OooOo0O = 1;
            if (this.f31174OooOo.OooO0Oo(o00oooo, this) == oooOo00) {
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
