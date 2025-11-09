package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0O0O00 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28559OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3513p6 f28560OooOo0o;

    public /* synthetic */ o0O0O00(C3513p6 c3513p6, int i) {
        this.f28559OooOo0O = i;
        this.f28560OooOo0o = c3513p6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28559OooOo0O) {
            case 0:
                C3513p6.m11294c(this.f28560OooOo0o);
                break;
            case 1:
                C3513p6.m11292a(this.f28560OooOo0o);
                break;
            default:
                C3513p6.m11293b(this.f28560OooOo0o);
                break;
        }
    }
}
