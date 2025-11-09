package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0OOO0o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28574OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3485od f28575OooOo0o;

    public /* synthetic */ o0OOO0o(C3485od c3485od, int i) {
        this.f28574OooOo0O = i;
        this.f28575OooOo0o = c3485od;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28574OooOo0O) {
            case 0:
                C3485od.m11133b(this.f28575OooOo0o);
                break;
            case 1:
                C3485od.m11134c(this.f28575OooOo0o);
                break;
            default:
                C3485od.m11132a(this.f28575OooOo0o);
                break;
        }
    }
}
