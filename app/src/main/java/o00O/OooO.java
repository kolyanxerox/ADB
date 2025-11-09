package o00O;

import com.google.android.gms.internal.measurement.o0OOO0;
import o00O0oOo.o0000O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oo.o0O0ooO;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0o0000;

/* loaded from: classes3.dex */
public final class OooO extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0O000Oo f31162OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f31163OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f31164OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f31165OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(o0O000Oo o0o000oo, OooOOO0 oooOOO0, o00O0O0O.OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f31162OooOo = o0o000oo;
        this.f31165OooOoO0 = oooOOO0;
    }

    @Override // o00O0OO0.OooO00o
    public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
        OooO oooO = new OooO(this.f31162OooOo, this.f31165OooOoO0, oooO0OO);
        oooO.f31164OooOo0o = obj;
        return oooO;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((OooO) create((o000OO) obj, (o00O0O0O.OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.f31163OooOo0O;
        oo00o.OooOo oooOo = oo00o.OooOo.f33195OooO00o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00O0.o000OOo.OooOO0O(obj);
            return oooOo;
        }
        o00O0.o000OOo.OooOO0O(obj);
        o000OO o000oo2 = (o000OO) this.f31164OooOo0o;
        OooOOO0 oooOOO0 = this.f31165OooOoO0;
        int i2 = oooOOO0.f31182OooOo0o;
        if (i2 == -3) {
            i2 = -2;
        }
        o0000O o0000o2 = o0000O.f31489OooOo;
        o00O0Oo.o00O0O oooOO0 = new OooOO0(oooOOO0, null);
        o0O0ooO o0o0ooo = new o0O0ooO(o0000OO0.OooOo0O(o000oo2, oooOOO0.f31181OooOo0O), o0OOO0.OooO00o(i2, 4, oooOOO0.f31180OooOo));
        o0o0ooo.Ooooo0o(o0000o2, o0o0ooo, oooOO0);
        this.f31163OooOo0O = 1;
        Object objOooOO0O = o0o0000.OooOO0O(this.f31162OooOo, o0o0ooo, true, this);
        if (objOooOO0O != oooOo00) {
            objOooOO0O = oooOo;
        }
        return objOooOO0O == oooOo00 ? oooOo00 : oooOo;
    }
}
