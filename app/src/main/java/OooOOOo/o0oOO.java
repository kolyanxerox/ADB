package OoooOOO;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0oOO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0O0o f14586OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f14587OooOo0O = 0;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ long f14588OooOo0o;

    public o0oOO(o0oOOo o0oooo, long j) {
        this.f14588OooOo0o = j;
        Objects.requireNonNull(o0oooo);
        this.f14586OooOo = o0oooo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14587OooOo0O) {
            case 0:
                ((o0oOOo) this.f14586OooOo).OooOOo0(this.f14588OooOo0o);
                break;
            default:
                oO00o000 oo00o000 = (oO00o000) this.f14586OooOo;
                o0oOOo o0oooo = ((o0OO0oO0) oo00o000.f14574OooOo0O).f14526Oooo0;
                o0OO0oO0.OooOO0(o0oooo);
                o0oooo.OooOOO(this.f14588OooOo0o);
                oo00o000.f14684OooOoO = null;
                break;
        }
    }

    public o0oOO(oO00o000 oo00o000, long j) {
        this.f14588OooOo0o = j;
        Objects.requireNonNull(oo00o000);
        this.f14586OooOo = oo00o000;
    }
}
