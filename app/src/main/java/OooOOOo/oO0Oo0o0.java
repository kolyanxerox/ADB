package OoooOOO;

/* loaded from: classes2.dex */
public abstract class oO0Oo0o0 extends ooOOO00O {

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f14752OooOo;

    public oO0Oo0o0(oOO0000 ooo0000) {
        super(ooo0000);
        this.f14916OooOo0o.f14809Oooo0o++;
    }

    public final void OooOO0o() {
        if (!this.f14752OooOo) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public abstract void OooOOO();

    public final void OooOOO0() {
        if (this.f14752OooOo) {
            throw new IllegalStateException("Can't initialize twice");
        }
        OooOOO();
        this.f14916OooOo0o.f14811Oooo0oO++;
        this.f14752OooOo = true;
    }
}
