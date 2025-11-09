package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class u10 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24550OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ v10 f24551OooOo0o;

    public /* synthetic */ u10(v10 v10Var, int i) {
        this.f24550OooOo0O = i;
        this.f24551OooOo0o = v10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24550OooOo0O) {
            case 0:
                this.f24551OooOo0o.OooO00o();
                break;
            case 1:
                v10 v10Var = this.f24551OooOo0o;
                v10Var.getClass();
                v10Var.f24832OooO0OO.execute(new u10(v10Var, 2));
                break;
            default:
                this.f24551OooOo0o.OooO00o();
                break;
        }
    }
}
