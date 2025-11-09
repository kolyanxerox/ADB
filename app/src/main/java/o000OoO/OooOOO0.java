package o000OOO;

/* loaded from: classes2.dex */
public final class OooOOO0 implements o000OO00.OooOO0O {

    /* renamed from: OooO00o */
    public boolean f30251OooO00o = false;

    /* renamed from: OooO0O0 */
    public boolean f30252OooO0O0 = false;

    /* renamed from: OooO0OO */
    public o000OO00.OooO0OO f30253OooO0OO;

    /* renamed from: OooO0Oo */
    public final OooO f30254OooO0Oo;

    public OooOOO0(OooO oooO) {
        this.f30254OooO0Oo = oooO;
    }

    @Override // o000OO00.OooOO0O
    public final o000OO00.OooOO0O OooO00o(String str) {
        if (this.f30251OooO00o) {
            throw new o000OO00.OooO0O0("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f30251OooO00o = true;
        this.f30254OooO0Oo.OooO0oo(this.f30253OooO0OO, str, this.f30252OooO0O0);
        return this;
    }

    @Override // o000OO00.OooOO0O
    public final o000OO00.OooOO0O OooO0oO(boolean z) {
        if (this.f30251OooO00o) {
            throw new o000OO00.OooO0O0("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f30251OooO00o = true;
        this.f30254OooO0Oo.OooO0oO(this.f30253OooO0OO, z ? 1 : 0, this.f30252OooO0O0);
        return this;
    }
}
