package o00O0ooo;

import o00O0O0o.OooOo00;
import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class oO000 extends OooO0OO {

    /* renamed from: OooOo */
    public int f31818OooOo;

    /* renamed from: OooOo0O */
    public /* synthetic */ Object f31819OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ oO000O0 f31820OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000(oO000O0 oo000o0, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.f31820OooOo0o = oo000o0;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f31819OooOo0O = obj;
        this.f31818OooOo |= Integer.MIN_VALUE;
        this.f31820OooOo0o.collect(null, this);
        return OooOo00.f31365OooOo0O;
    }
}
