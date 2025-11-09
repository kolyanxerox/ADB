package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class gc0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f19320OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ic0 f19321OooOo0o;

    public /* synthetic */ gc0(ic0 ic0Var, int i) {
        this.f19320OooOo0O = i;
        this.f19321OooOo0o = ic0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19320OooOo0O) {
            case 0:
                this.f19321OooOo0o.o000O0O0(5);
                break;
            default:
                ic0 ic0Var = this.f19321OooOo0o;
                ic0Var.f20012OooOo0O.OooO00o().execute(new gc0(ic0Var, 0));
                break;
        }
    }
}
