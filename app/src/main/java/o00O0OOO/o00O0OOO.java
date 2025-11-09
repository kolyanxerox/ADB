package o00O0oOo;

import o00OO000.OooOOO0;

/* loaded from: classes3.dex */
public final class o00O0OOO extends oo0o0O0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final o00O f31541OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final oo0oOO0 f31542OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final Object f31543OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final o000000O f31544OooOoo0;

    public o00O0OOO(o00O o00o, oo0oOO0 oo0ooo0, o000000O o000000o2, Object obj) {
        this.f31541OooOoO = o00o;
        this.f31542OooOoOO = oo0ooo0;
        this.f31544OooOoo0 = o000000o2;
        this.f31543OooOoo = obj;
    }

    @Override // o00O0oOo.oo0o0O0
    public final boolean OooO() {
        return false;
    }

    @Override // o00O0oOo.oo0o0O0
    public final void OooOO0(Throwable th) {
        o000000O o000000o2 = this.f31544OooOoo0;
        o00O o00o = this.f31541OooOoO;
        o00o.getClass();
        o000000O o000000oOoooO00 = o00O.OoooO00(o000000o2);
        oo0oOO0 oo0ooo0 = this.f31542OooOoOO;
        Object obj = this.f31543OooOoo;
        if (o000000oOoooO00 == null || !o00o.OoooOoO(oo0ooo0, o000000oOoooO00, obj)) {
            oo0ooo0.f31587OooOo0O.OooO0OO(new OooOOO0(2), 2);
            o000000O o000000oOoooO002 = o00O.OoooO00(o000000o2);
            if (o000000oOoooO002 == null || !o00o.OoooOoO(oo0ooo0, o000000oOoooO002, obj)) {
                o00o.OooOOoo(o00o.OooOoo(oo0ooo0, obj));
            }
        }
    }
}
