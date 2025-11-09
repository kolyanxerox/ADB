package o000o00o;

import o00O0O0O.OooO0OO;

/* loaded from: classes2.dex */
public final class oOO00O extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public /* synthetic */ Object f30889OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f30890OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(o00O0O00 o00o0o00, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f30890OooOo0o = o00o0o00;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        oOO00O ooo00o = new oOO00O(this.f30890OooOo0o, oooO0OO);
        ooo00o.f30889OooOo0O = obj;
        return ooo00o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((oOO00O) create((o000O0o) obj, (OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        o00O0.o000OOo.OooOO0O(obj);
        return o000O0o.OooO00o((o000O0o) this.f30889OooOo0O, null, this.f30890OooOo0o.f30853OooO0Oo.OooO00o(), null, 5);
    }
}
