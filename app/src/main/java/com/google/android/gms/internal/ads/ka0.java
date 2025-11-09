package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class ka0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f20469OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ma0 f20470OooOo0o;

    public /* synthetic */ ka0(ma0 ma0Var, int i) {
        this.f20469OooOo0O = i;
        this.f20470OooOo0o = ma0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20469OooOo0O) {
            case 0:
                ma0 ma0Var = this.f20470OooOo0o;
                ma0Var.f21156OooO0Oo.execute(new ka0(ma0Var, 1));
                break;
            default:
                ma0 ma0Var2 = this.f20470OooOo0o;
                ma0Var2.f21153OooO00o.set(new la0(ma0Var2.f21158OooO0o0.zzb(), ma0Var2.f21157OooO0o, ma0Var2.f21155OooO0OO));
                break;
        }
    }
}
