package OoooO0O;

import android.app.Application;

/* loaded from: classes2.dex */
public final class o0ooOOo implements o00oOoo {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f14052OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final OooOOoo.o0000OO0 f14053OooOo0o;

    public /* synthetic */ o0ooOOo(OooOOoo.o0000OO0 o0000oo02, int i) {
        this.f14052OooOo0O = i;
        this.f14053OooOo0o = o0000oo02;
    }

    @Override // OoooO0O.o00O000
    public final Object zza() {
        switch (this.f14052OooOo0O) {
            case 0:
                return new o00oO0o((Application) this.f14053OooOo0o.f13531OooOo0o);
            case 1:
                return new o0OOO0o((Application) this.f14053OooOo0o.f13531OooOo0o);
            default:
                return new o00000O((Application) this.f14053OooOo0o.f13531OooOo0o);
        }
    }
}
