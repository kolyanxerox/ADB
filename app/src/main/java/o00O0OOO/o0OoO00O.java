package o00O0ooo;

import kotlin.jvm.internal.o0Oo0oo;
import o000O0O0.OooO0O0;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.Oooo000;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class o0OoO00O extends OooOOOO implements Oooo000 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f31800OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f31801OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0O000Oo f31802OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(o0Oo0oo o0oo0oo, OooO0OO oooO0OO, o0O000Oo o0o000oo) {
        super(1, oooO0OO);
        this.f31802OooOo0o = o0o000oo;
        this.f31800OooOo = o0oo0oo;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(OooO0OO oooO0OO) {
        return new o0OoO00O(this.f31800OooOo, oooO0OO, this.f31802OooOo0o);
    }

    @Override // o00O0Oo.Oooo000
    public final Object invoke(Object obj) {
        return ((o0OoO00O) create((OooO0OO) obj)).invokeSuspend(OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.f31801OooOo0O;
        o0Oo0oo o0oo0oo = this.f31800OooOo;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            OooO0O0 oooO0O0 = o00O.OooO0OO.f31171OooO0O0;
            Object obj2 = o0oo0oo.f28880OooOo0O;
            if (obj2 == oooO0O0) {
                obj2 = null;
            }
            this.f31801OooOo0O = 1;
            if (this.f31802OooOo0o.emit(obj2, this) == oooOo00) {
                return oooOo00;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
        }
        o0oo0oo.f28880OooOo0O = null;
        return OooOo.f33195OooO00o;
    }
}
