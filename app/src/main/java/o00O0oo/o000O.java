package o00O0oo;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import oo00o.OooOO0O;
import oo00o.OooOOO0;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class o000O extends OooOOOO implements o00O0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00O00 f31605OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f31606OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f31607OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f31608OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(o00O00 o00o00, Object obj, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f31605OooOo = o00o00;
        this.f31608OooOoO0 = obj;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        o000O o000o = new o000O(this.f31605OooOo, this.f31608OooOoO0, oooO0OO);
        o000o.f31607OooOo0o = obj;
        return o000o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o000O) create((o00O0oOo.o000OO) obj, (OooO0OO) obj2)).invokeSuspend(OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO0O0;
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.f31606OooOo0O;
        Object o000o0 = OooOo.f33195OooO00o;
        try {
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o00O00 o00o00 = this.f31605OooOo;
                Object obj2 = this.f31608OooOoO0;
                this.f31606OooOo0O = 1;
                if (o00o00.OooOOO0(obj2, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            objOooO0O0 = o000o0;
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        if (objOooO0O0 instanceof OooOO0O) {
            o000o0 = new o000O0(OooOOO0.OooO00o(objOooO0O0));
        }
        return new o000OO0O(o000o0);
    }
}
