package o00O;

import o00O0ooo.o0O000Oo;

/* loaded from: classes3.dex */
public final class OooOO0O extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f31177OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f31178OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f31179OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(OooOOO0 oooOOO0, o00O0O0O.OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f31177OooOo = oooOOO0;
    }

    @Override // o00O0OO0.OooO00o
    public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
        OooOO0O oooOO0O = new OooOO0O(this.f31177OooOo, oooO0OO);
        oooOO0O.f31179OooOo0o = obj;
        return oooOO0O;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((OooOO0O) create((o0O000Oo) obj, (o00O0O0O.OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.f31178OooOo0O;
        if (i == 0) {
            o00O0.o000OOo.OooOO0O(obj);
            o0O000Oo o0o000oo = (o0O000Oo) this.f31179OooOo0o;
            this.f31178OooOo0O = 1;
            if (this.f31177OooOo.OooO0o(o0o000oo, this) == oooOo00) {
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
