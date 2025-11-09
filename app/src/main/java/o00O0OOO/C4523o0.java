package o00O0ooo;

import o00O.o0OoOo0;
import o00O.o0ooOOo;
import o00O0OO0.OooO0OO;

/* renamed from: o00O0ooo.o0 */
/* loaded from: classes3.dex */
public final class C4523o0 extends OooO0OO {

    /* renamed from: OooOo */
    public final /* synthetic */ o0OoOo0 f31655OooOo;

    /* renamed from: OooOo0O */
    public o0ooOOo f31656OooOo0O;

    /* renamed from: OooOo0o */
    public /* synthetic */ Object f31657OooOo0o;

    /* renamed from: OooOoO0 */
    public int f31658OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4523o0(o0OoOo0 o0oooo0, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.f31655OooOo = o0oooo0;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f31657OooOo0o = obj;
        this.f31658OooOoO0 |= Integer.MIN_VALUE;
        return this.f31655OooOo.collect(null, this);
    }
}
