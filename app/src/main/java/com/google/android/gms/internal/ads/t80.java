package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class t80 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24269OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ u80 f24270OooOo0o;

    public /* synthetic */ t80(u80 u80Var, int i) {
        this.f24269OooOo0O = i;
        this.f24270OooOo0o = u80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24269OooOo0O) {
            case 0:
                u80 u80Var = this.f24270OooOo0o;
                synchronized (u80Var) {
                    u80Var.f24594OooO0O0.clear();
                    u80Var.f24593OooO00o.clear();
                    u80Var.f24598OooO0o0.clear();
                    u80Var.f24596OooO0Oo.clear();
                    u80Var.OooO0oO();
                    u80Var.OooO0oo();
                    u80Var.OooO0o0();
                }
                return;
            default:
                u80 u80Var2 = this.f24270OooOo0o;
                u80Var2.getClass();
                u80Var2.f24597OooO0o.execute(new t80(u80Var2, 0));
                return;
        }
    }
}
