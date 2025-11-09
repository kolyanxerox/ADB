package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28469OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C2987bw f28470OooOo0o;

    public /* synthetic */ OooOO0(C2987bw c2987bw, int i) {
        this.f28469OooOo0O = i;
        this.f28470OooOo0o = c2987bw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28469OooOo0O) {
            case 0:
                C2987bw.m8040b(this.f28470OooOo0o);
                break;
            default:
                C2987bw.m8036a(this.f28470OooOo0o);
                break;
        }
    }
}
