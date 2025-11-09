package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class Oooo000 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28487OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3192hm f28488OooOo0o;

    public /* synthetic */ Oooo000(C3192hm c3192hm, int i) {
        this.f28487OooOo0O = i;
        this.f28488OooOo0o = c3192hm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28487OooOo0O) {
            case 0:
                C3192hm.m9179c(this.f28488OooOo0o);
                break;
            case 1:
                C3192hm.m9183e(this.f28488OooOo0o);
                break;
            case 2:
                C3192hm.m9175b(this.f28488OooOo0o);
                break;
            case 3:
                C3192hm.m9184f(this.f28488OooOo0o);
                break;
            default:
                C3192hm.m9182d(this.f28488OooOo0o);
                break;
        }
    }
}
