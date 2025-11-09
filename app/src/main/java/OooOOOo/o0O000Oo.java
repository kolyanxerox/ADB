package OoooOOO;

/* loaded from: classes2.dex */
public abstract class o0O000Oo extends o0O0o {

    /* renamed from: OooOo0o */
    public boolean f14334OooOo0o;

    public o0O000Oo(o0OO0oO0 o0oo0oo0) {
        super(o0oo0oo0);
        ((o0OO0oO0) this.f14574OooOo0O).o000oOoO++;
    }

    public final void OooOO0o() {
        if (!this.f14334OooOo0o) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public abstract boolean OooOOO();

    public final void OooOOO0() {
        if (this.f14334OooOo0o) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (OooOOO()) {
            return;
        }
        ((o0OO0oO0) this.f14574OooOo0O).f14542OoooOOo.incrementAndGet();
        this.f14334OooOo0o = true;
    }
}
