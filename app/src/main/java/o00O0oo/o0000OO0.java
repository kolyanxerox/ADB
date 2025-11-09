package o00O0oo;

import o00O0O0o.OooOo00;
import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class o0000OO0 extends OooO0OO {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f31598OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public /* synthetic */ Object f31599OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o000O000 f31600OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(o000O000 o000o0002, OooO0OO oooO0OO) {
        super(oooO0OO);
        this.f31600OooOo0o = o000o0002;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f31599OooOo0O = obj;
        this.f31598OooOo |= Integer.MIN_VALUE;
        Object objOooOooO = o000O000.OooOooO(this.f31600OooOo0o, this);
        return objOooOooO == OooOo00.f31365OooOo0O ? objOooOooO : new o000OO0O(objOooOooO);
    }
}
