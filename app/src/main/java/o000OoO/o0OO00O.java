package o000Ooo;

import o000Oo0.OooO0o;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0OO00O implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f30492OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30493OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o000000 f30494OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f30495OooOoO0;

    public /* synthetic */ o0OO00O(o000000 o000000Var, long j, String str, int i) {
        this.f30493OooOo0O = i;
        this.f30494OooOo0o = o000000Var;
        this.f30492OooOo = j;
        this.f30495OooOoO0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30493OooOo0O) {
            case 0:
                o0OOO0o o0ooo0o = this.f30494OooOo0o.f30440OooO0oo;
                o00000 o00000Var = o0ooo0o.f30508OooOOO;
                if (o00000Var == null || !o00000Var.f30431OooO0o0.get()) {
                    ((OooO0o) o0ooo0o.f30497OooO.f30343OooOo0o).OooO0oO(this.f30492OooOo, this.f30495OooOoO0);
                    break;
                }
                break;
            default:
                o000000 o000000Var = this.f30494OooOo0o;
                o000000Var.f30446OooOOOo.f30100OooO0O0.OooO00o(new o0OO00O(o000000Var, this.f30492OooOo, this.f30495OooOoO0, 0));
                break;
        }
    }
}
