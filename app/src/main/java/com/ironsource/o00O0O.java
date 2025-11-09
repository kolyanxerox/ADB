package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class o00O0O implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28549OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3258jj f28550OooOo0o;

    public /* synthetic */ o00O0O(C3258jj c3258jj, int i) {
        this.f28549OooOo0O = i;
        this.f28550OooOo0o = c3258jj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28549OooOo0O) {
            case 0:
                C3258jj.m9508d(this.f28550OooOo0o);
                break;
            case 1:
                C3258jj.m9503a(this.f28550OooOo0o);
                break;
            case 2:
                C3258jj.m9506b(this.f28550OooOo0o);
                break;
            default:
                C3258jj.m9507c(this.f28550OooOo0o);
                break;
        }
    }
}
