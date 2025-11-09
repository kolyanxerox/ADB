package OoooOOO;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class ooOOOOoo implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f14920OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f14921OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ oO00000o f14922OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ oO0O0OoO f14923OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f14924OooOoO0;

    public ooOOOOoo(oO0O0OoO oo0o0ooo, oO00000o oo00000o, long j, boolean z, int i) {
        this.f14921OooOo0O = i;
        switch (i) {
            case 1:
                this.f14922OooOo0o = oo00000o;
                this.f14920OooOo = j;
                this.f14924OooOoO0 = z;
                Objects.requireNonNull(oo0o0ooo);
                this.f14923OooOoO = oo0o0ooo;
                break;
            default:
                this.f14922OooOo0o = oo00000o;
                this.f14920OooOo = j;
                this.f14924OooOoO0 = z;
                Objects.requireNonNull(oo0o0ooo);
                this.f14923OooOoO = oo0o0ooo;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14921OooOo0O) {
            case 0:
                oO00000o oo00000o = this.f14922OooOo0o;
                oO0O0OoO oo0o0ooo = this.f14923OooOoO;
                oo0o0ooo.OooOOOO(oo00000o);
                oo0o0ooo.OooOoOO(oo00000o, this.f14920OooOo, this.f14924OooOoO0);
                break;
            default:
                oO00000o oo00000o2 = this.f14922OooOo0o;
                oO0O0OoO oo0o0ooo2 = this.f14923OooOoO;
                oo0o0ooo2.OooOOOO(oo00000o2);
                oo0o0ooo2.OooOoOO(oo00000o2, this.f14920OooOo, this.f14924OooOoO0);
                break;
        }
    }
}
