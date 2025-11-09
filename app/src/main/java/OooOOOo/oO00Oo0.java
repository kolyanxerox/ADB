package OoooOOO;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class oO00Oo0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f14664OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ oO00o000 f14665OooOo0o;

    public oO00Oo0(oO00o000 oo00o000, int i) {
        this.f14664OooOo0O = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(oo00o000);
                this.f14665OooOo0o = oo00o000;
                break;
            default:
                Objects.requireNonNull(oo00o000);
                this.f14665OooOo0o = oo00o000;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14664OooOo0O) {
            case 0:
                oO00o000 oo00o000 = this.f14665OooOo0o;
                oo00o000.f14684OooOoO = oo00o000.f14690OooOooo;
                break;
            default:
                this.f14665OooOo0o.f14690OooOooo = null;
                break;
        }
    }
}
