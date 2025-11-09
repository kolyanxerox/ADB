package OoooOOO;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class oOo00ooO extends oo0O {

    /* renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oOo000o0 f14872OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f14873OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00ooO(oOo000o0 ooo000o0, o0OO0oO0 o0oo0oo0, int i) {
        super(o0oo0oo0);
        this.f14873OooO0o0 = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(ooo000o0);
                this.f14872OooO0o = ooo000o0;
                super(o0oo0oo0);
                break;
            default:
                Objects.requireNonNull(ooo000o0);
                this.f14872OooO0o = ooo000o0;
                break;
        }
    }

    @Override // OoooOOO.oo0O
    public final void OooO00o() {
        switch (this.f14873OooO0o0) {
            case 0:
                oOo000o0 ooo000o0 = this.f14872OooO0o;
                ooo000o0.OooOO0O();
                if (ooo000o0.OooOoo0()) {
                    o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) ooo000o0.f14574OooOo0O).f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o0);
                    o0o0o0o0.f14398Oooo0.OooO0O0("Inactivity, disconnecting from the service");
                    ooo000o0.OooOOoo();
                    break;
                }
                break;
            default:
                o0O0O0o0 o0o0o0o02 = ((o0OO0oO0) this.f14872OooO0o.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0o0o02.f14396OooOooO.OooO0O0("Tasks have been queued for a long time");
                break;
        }
    }
}
