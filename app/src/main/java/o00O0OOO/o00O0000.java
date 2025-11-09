package o00O0oOo;

/* loaded from: classes3.dex */
public final class o00O0000 extends o0O0ooO {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Runnable f31527OooOo;

    public o00O0000(long j, Runnable runnable) {
        super(j);
        this.f31527OooOo = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31527OooOo.run();
    }

    @Override // o00O0oOo.o0O0ooO
    public final String toString() {
        return super.toString() + this.f31527OooOo;
    }
}
