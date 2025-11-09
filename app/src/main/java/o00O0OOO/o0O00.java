package o00O0ooo;

import o00O.oo000o;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class o0O00 extends OooOOOO implements o00O0O {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f31661OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0OoOoOo f31662OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(o0OoOoOo o0oooooo, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f31662OooOo0o = o0oooooo;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new o0O00(this.f31662OooOo0o, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o0O00) create((o000OO) obj, (OooO0OO) obj2)).invokeSuspend(OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.f31661OooOo0O;
        OooOo oooOo = OooOo.f33195OooO00o;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            this.f31661OooOo0O = 1;
            Object objCollect = this.f31662OooOo0o.collect(oo000o.f31232OooOo0O, this);
            if (objCollect != oooOo00) {
                objCollect = oooOo;
            }
            if (objCollect == oooOo00) {
                return oooOo00;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
        }
        return oooOo;
    }
}
