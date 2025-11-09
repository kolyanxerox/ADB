package o00O0ooo;

import o000o00o.o00O000o;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oo.o00oOoo;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class o0O00OO extends OooOOOO implements o00O0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ oO00000o f31686OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f31687OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f31688OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OO(oO00000o oo00000o, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f31686OooOo = oo00000o;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        o0O00OO o0o00oo = new o0O00OO(this.f31686OooOo, oooO0OO);
        o0o00oo.f31688OooOo0o = obj;
        return o0o00oo;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o0O00OO) create((o00oOoo) obj, (OooO0OO) obj2)).invokeSuspend(OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.f31687OooOo0O;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return OooOo.f33195OooO00o;
        }
        o000OOo.OooOO0O(obj);
        o00O000o o00o000o = new o00O000o((o00oOoo) this.f31688OooOo0o, 1);
        this.f31687OooOo0O = 1;
        this.f31686OooOo.collect(o00o000o, this);
        return oooOo00;
    }
}
