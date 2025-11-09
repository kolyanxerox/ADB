package OoooOOO;

/* loaded from: classes2.dex */
public abstract class oO0Oo extends o0o0000 {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f14751OooOo0o;

    public oO0Oo(o0OO0oO0 o0oo0oo0) {
        super(o0oo0oo0);
        ((o0OO0oO0) this.f14574OooOo0O).o000oOoO++;
    }

    public abstract boolean OooOO0o();

    public final void OooOOO() {
        if (this.f14751OooOo0o) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (OooOO0o()) {
            return;
        }
        ((o0OO0oO0) this.f14574OooOo0O).f14542OoooOOo.incrementAndGet();
        this.f14751OooOo0o = true;
    }

    public final void OooOOO0() {
        if (!this.f14751OooOo0o) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
