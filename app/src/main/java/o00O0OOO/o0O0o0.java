package o00O0ooo;

import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class o0O0o0 extends OooO0OO {

    /* renamed from: OooOo */
    public final /* synthetic */ o0O0OOO0 f31727OooOo;

    /* renamed from: OooOo0O */
    public /* synthetic */ Object f31728OooOo0O;

    /* renamed from: OooOo0o */
    public int f31729OooOo0o;

    /* renamed from: OooOoO0 */
    public o0O0OO0 f31730OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(o0O0OOO0 o0o0ooo0, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.f31727OooOo = o0o0ooo0;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f31728OooOo0O = obj;
        this.f31729OooOo0o |= Integer.MIN_VALUE;
        return this.f31727OooOo.collect(null, this);
    }
}
