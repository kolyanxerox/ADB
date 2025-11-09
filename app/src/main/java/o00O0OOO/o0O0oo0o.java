package o00O0ooo;

import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class o0O0oo0o extends OooO0OO {

    /* renamed from: OooOo */
    public final /* synthetic */ o0oO0O0o f31742OooOo;

    /* renamed from: OooOo0O */
    public /* synthetic */ Object f31743OooOo0O;

    /* renamed from: OooOo0o */
    public int f31744OooOo0o;

    /* renamed from: OooOoO */
    public o0O000Oo f31745OooOoO;

    /* renamed from: OooOoO0 */
    public o0oO0O0o f31746OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(o0oO0O0o o0oo0o0o, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.f31742OooOo = o0oo0o0o;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f31743OooOo0O = obj;
        this.f31744OooOo0o |= Integer.MIN_VALUE;
        return this.f31742OooOo.collect(null, this);
    }
}
