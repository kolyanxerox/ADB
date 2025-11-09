package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0000O implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Runnable f28524OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28525OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3842xm f28526OooOo0o;

    public /* synthetic */ o0000O(C3842xm c3842xm, Runnable runnable, int i) {
        this.f28525OooOo0O = i;
        this.f28526OooOo0o = c3842xm;
        this.f28524OooOo = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28525OooOo0O) {
            case 0:
                C3842xm.m13078a(this.f28526OooOo0o, this.f28524OooOo);
                break;
            default:
                C3842xm.m13082b(this.f28526OooOo0o, this.f28524OooOo);
                break;
        }
    }
}
