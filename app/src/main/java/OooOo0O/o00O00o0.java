package OoooO0O;

import android.app.Application;

/* loaded from: classes2.dex */
public final class o00O00o0 implements o00oOoo {

    /* renamed from: OooOo, reason: collision with root package name */
    public final o0O0ooO f13996OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f13997OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final OooOOoo.o0000OO0 f13998OooOo0o;

    public /* synthetic */ o00O00o0(OooOOoo.o0000OO0 o0000oo02, o0O0ooO o0o0ooo, int i) {
        this.f13997OooOo0O = i;
        this.f13998OooOo0o = o0000oo02;
        this.f13996OooOo = o0o0ooo;
    }

    public oo00o OooO00o() {
        return new oo00o((Application) this.f13998OooOo0o.f13531OooOo0o, (o0OOO0o) this.f13996OooOo.zza());
    }

    @Override // OoooO0O.o00O000
    public final Object zza() {
        switch (this.f13997OooOo0O) {
            case 0:
                return new o00O00OO((Application) this.f13998OooOo0o.f13531OooOo0o, (o00oO0o) this.f13996OooOo.zza());
            default:
                return OooO00o();
        }
    }
}
