package o00oO0o;

/* loaded from: classes2.dex */
public final class o0Oo0oo extends o0OO00O {

    /* renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000OOo f32747OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f32748OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0Oo0oo(o000OOo o000ooo2, int i) {
        super(o000ooo2);
        this.f32748OooO0o0 = i;
        this.f32747OooO0o = o000ooo2;
    }

    @Override // o00oO0o.o0OO00O
    public final float OooO00o() {
        switch (this.f32748OooO0o0) {
            case 0:
                o000OOo o000ooo2 = this.f32747OooO0o;
                return o000ooo2.f32779OooO0oo + o000ooo2.f32771OooO;
            case 1:
                o000OOo o000ooo3 = this.f32747OooO0o;
                return o000ooo3.f32779OooO0oo + o000ooo3.f32780OooOO0;
            default:
                return this.f32747OooO0o.f32779OooO0oo;
        }
    }
}
