package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class o00Ooo implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28554OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3306kw f28555OooOo0o;

    public /* synthetic */ o00Ooo(C3306kw c3306kw, int i) {
        this.f28554OooOo0O = i;
        this.f28555OooOo0o = c3306kw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28554OooOo0O) {
            case 0:
                C3306kw.m9705a(this.f28555OooOo0o);
                break;
            default:
                C3306kw.m9711b(this.f28555OooOo0o);
                break;
        }
    }
}
