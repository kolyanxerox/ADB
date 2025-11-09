package o00O0ooo;

import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class o0O00o00 extends OooO0OO {

    /* renamed from: OooOo */
    public final /* synthetic */ o0O00oO0 f31696OooOo;

    /* renamed from: OooOo0O */
    public /* synthetic */ Object f31697OooOo0O;

    /* renamed from: OooOo0o */
    public int f31698OooOo0o;

    /* renamed from: OooOoO */
    public o0O000Oo f31699OooOoO;

    /* renamed from: OooOoO0 */
    public Object f31700OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o00(o0O00oO0 o0o00oo0, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.f31696OooOo = o0o00oo0;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f31697OooOo0O = obj;
        this.f31698OooOo0o |= Integer.MIN_VALUE;
        return this.f31696OooOo.collect(null, this);
    }
}
