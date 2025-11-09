package o00O0ooo;

import kotlin.jvm.internal.o0Oo0oo;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oo.o000O0;
import o00O0oo.o000O0Oo;
import o00O0oo.o000OO0O;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class o0O00O0o extends OooOOOO implements o00O0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f31681OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public o0Oo0oo f31682OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f31683OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o0O000Oo f31684OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f31685OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(o0Oo0oo o0oo0oo, OooO0OO oooO0OO, o0O000Oo o0o000oo) {
        super(2, oooO0OO);
        this.f31685OooOoO0 = o0oo0oo;
        this.f31684OooOoO = o0o000oo;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        o0O00O0o o0o00o0o = new o0O00O0o(this.f31685OooOoO0, oooO0OO, this.f31684OooOoO);
        o0o00o0o.f31681OooOo = obj;
        return o0o00o0o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o0O00O0o) create(new o000OO0O(((o000OO0O) obj).f31628OooO00o), (OooO0OO) obj2)).invokeSuspend(OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        o0Oo0oo o0oo0oo;
        o0Oo0oo o0oo0oo2;
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.f31683OooOo0o;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            Object obj2 = ((o000OO0O) this.f31681OooOo).f31628OooO00o;
            boolean z = obj2 instanceof o000O0Oo;
            o0oo0oo = this.f31685OooOoO0;
            if (!z) {
                o0oo0oo.f28880OooOo0O = obj2;
            }
            if (z) {
                o000O0 o000o0 = obj2 instanceof o000O0 ? (o000O0) obj2 : null;
                Throwable th = o000o0 != null ? o000o0.f31609OooO00o : null;
                if (th != null) {
                    throw th;
                }
                Object obj3 = o0oo0oo.f28880OooOo0O;
                if (obj3 != null) {
                    Object obj4 = obj3 != o00O.OooO0OO.f31171OooO0O0 ? obj3 : null;
                    this.f31681OooOo = obj2;
                    this.f31682OooOo0O = o0oo0oo;
                    this.f31683OooOo0o = 1;
                    if (this.f31684OooOoO.emit(obj4, this) == oooOo00) {
                        return oooOo00;
                    }
                    o0oo0oo2 = o0oo0oo;
                }
                o0oo0oo.f28880OooOo0O = o00O.OooO0OO.f31173OooO0Oo;
            }
            return OooOo.f33195OooO00o;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o0oo0oo2 = this.f31682OooOo0O;
        o000OOo.OooOO0O(obj);
        o0oo0oo = o0oo0oo2;
        o0oo0oo.f28880OooOo0O = o00O.OooO0OO.f31173OooO0Oo;
        return OooOo.f33195OooO00o;
    }
}
