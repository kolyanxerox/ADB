package o00O0ooo;

import o00O.o0OoOo0;
import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class o0O0o000 extends OooO0OO {

    /* renamed from: OooOo */
    public final /* synthetic */ o0OoOo0 f31731OooOo;

    /* renamed from: OooOo0O */
    public /* synthetic */ Object f31732OooOo0O;

    /* renamed from: OooOo0o */
    public int f31733OooOo0o;

    /* renamed from: OooOoO0 */
    public Object f31734OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(o0OoOo0 o0oooo0, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.f31731OooOo = o0oooo0;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f31732OooOo0O = obj;
        this.f31733OooOo0o |= Integer.MIN_VALUE;
        return this.f31731OooOo.collect(null, this);
    }
}
