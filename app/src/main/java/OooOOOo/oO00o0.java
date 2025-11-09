package OoooOOO;

import Oooo00o.o000O000;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oO00o0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f14671OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f14672OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ oOO0 f14673OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o000O000 f14674OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ oOo000o0 f14675OooOoO0;

    public /* synthetic */ oO00o0(oOo000o0 ooo000o0, oOO0 ooo0, boolean z, o000O000 o000o0002, int i) {
        this.f14672OooOo0O = i;
        this.f14673OooOo0o = ooo0;
        this.f14671OooOo = z;
        this.f14674OooOoO = o000o0002;
        this.f14675OooOoO0 = ooo000o0;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f14672OooOo0O) {
            case 0:
                oOo000o0 ooo000o0 = this.f14675OooOoO0;
                o0O000o0 o0o000o0 = ooo000o0.f14857OooOoO0;
                if (o0o000o0 != null) {
                    ooo000o0.OooOoo(o0o000o0, this.f14671OooOo ? null : (oOO000o) this.f14674OooOoO, this.f14673OooOo0o);
                    ooo000o0.OooOo();
                    break;
                } else {
                    o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) ooo000o0.f14574OooOo0O).f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o0);
                    o0o0o0o0.f14393OooOoOO.OooO0O0("Discarding data. Failed to set user property");
                    break;
                }
            case 1:
                oOo000o0 ooo000o02 = this.f14675OooOoO0;
                o0O000o0 o0o000o02 = ooo000o02.f14857OooOoO0;
                if (o0o000o02 != null) {
                    ooo000o02.OooOoo(o0o000o02, this.f14671OooOo ? null : (o00OOOOo) this.f14674OooOoO, this.f14673OooOo0o);
                    ooo000o02.OooOo();
                    break;
                } else {
                    o0O0O0o0 o0o0o0o02 = ((o0OO0oO0) ooo000o02.f14574OooOo0O).f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o02);
                    o0o0o0o02.f14393OooOoOO.OooO0O0("Discarding data. Failed to send event to service");
                    break;
                }
            default:
                oOo000o0 ooo000o03 = this.f14675OooOoO0;
                o0O000o0 o0o000o03 = ooo000o03.f14857OooOoO0;
                if (o0o000o03 != null) {
                    ooo000o03.OooOoo(o0o000o03, this.f14671OooOo ? null : (o00O0OO0) this.f14674OooOoO, this.f14673OooOo0o);
                    ooo000o03.OooOo();
                    break;
                } else {
                    o0O0O0o0 o0o0o0o03 = ((o0OO0oO0) ooo000o03.f14574OooOo0O).f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o03);
                    o0o0o0o03.f14393OooOoOO.OooO0O0("Discarding data. Failed to send conditional user property to service");
                    break;
                }
        }
    }

    public oO00o0(oOo000o0 ooo000o0, oOO0 ooo0, boolean z, o00O0OO0 o00o0oo0) {
        this.f14672OooOo0O = 2;
        this.f14673OooOo0o = ooo0;
        this.f14671OooOo = z;
        this.f14674OooOoO = o00o0oo0;
        Objects.requireNonNull(ooo000o0);
        this.f14675OooOoO0 = ooo000o0;
    }
}
