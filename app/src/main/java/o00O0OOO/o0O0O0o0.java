package o00O0ooo;

import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class o0O0O0o0 extends OooO0OO {

    /* renamed from: OooOo */
    public final /* synthetic */ o0O0OO0 f31712OooOo;

    /* renamed from: OooOo0O */
    public o0O0OO0 f31713OooOo0O;

    /* renamed from: OooOo0o */
    public /* synthetic */ Object f31714OooOo0o;

    /* renamed from: OooOoO0 */
    public int f31715OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(o0O0OO0 o0o0oo0, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.f31712OooOo = o0o0oo0;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f31714OooOo0o = obj;
        this.f31715OooOoO0 |= Integer.MIN_VALUE;
        return this.f31712OooOo.emit(null, this);
    }
}
