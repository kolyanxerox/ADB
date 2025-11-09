package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0OoOo0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28581OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3218id f28582OooOo0o;

    public /* synthetic */ o0OoOo0(C3218id c3218id, int i) {
        this.f28581OooOo0O = i;
        this.f28582OooOo0o = c3218id;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28581OooOo0O) {
            case 0:
                C3218id.m9319f(this.f28582OooOo0o);
                break;
            case 1:
                C3218id.m9315b(this.f28582OooOo0o);
                break;
            case 2:
                C3218id.m9316c(this.f28582OooOo0o);
                break;
            case 3:
                C3218id.m9317d(this.f28582OooOo0o);
                break;
            case 4:
                C3218id.m9312a(this.f28582OooOo0o);
                break;
            default:
                C3218id.m9318e(this.f28582OooOo0o);
                break;
        }
    }
}
